// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model.metadata.movie;

import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.TextAppearanceSpan;
import com.pinterest.api.model.BoostablePinMetadata;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.metadata.AggregateRating;
import com.pinterest.api.model.metadata.Person;
import com.pinterest.base.Application;
import com.pinterest.kit.application.Resources;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import org.apache.commons.lang3.StringUtils;

public class Movie extends BoostablePinMetadata
{

    private static final String _break = "<br>";
    private static final SimpleDateFormat _dateFormatter;
    private List _actors;
    private String _actorsDisplay;
    private AggregateRating _aggregateRating;
    private final String _bullet;
    private String _contentRating;
    private String _datePublished;
    private String _description;
    private List _directors;
    private String _directorsDisplay;
    private Integer _duration;
    private PinterestJsonArray _genres;
    private String _id;
    private String _metadataDisplay;
    private String _name;
    private Spanned _ratingDisplay;
    private String _type;
    private List _writers;
    private String _writersDisplay;

    public Movie()
    {
        super(null, null);
        _bullet = " &#8226; ";
        _actors = new ArrayList();
        _directors = new ArrayList();
        _writers = new ArrayList();
        _genres = new PinterestJsonArray();
    }

    public Movie(Pin pin, PinterestJsonObject pinterestjsonobject)
    {
        super(pin, pinterestjsonobject);
        _bullet = " &#8226; ";
        _actors = new ArrayList();
        _directors = new ArrayList();
        _writers = new ArrayList();
        _genres = new PinterestJsonArray();
        if (pinterestjsonobject != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((pin = pinterestjsonobject.c("movie")) == null) goto _L1; else goto _L3
_L3:
        try
        {
            _actors = Person.getPersons(pin.e("actors"));
            _aggregateRating = new AggregateRating(pin.c("aggregate_rating"));
            _contentRating = pin.a("content_rating", "");
            _datePublished = pin.a("date_published", "");
            _description = pin.a("description", "");
            _directors = Person.getPersons(pin.e("directors"));
            _writers = Person.getPersons(pin.e("writers"));
            _duration = Integer.valueOf(pin.a("duration", 0));
            _genres = pin.e("genres");
            _id = pin.a("id", "");
            _name = pin.a("name", "");
            _type = pin.a("type", "");
        }
        // Misplaced declaration of an exception variable
        catch (Pin pin) { }
        generateCacheContent();
        return;
    }

    private String makeMetadataDisplay()
    {
        int i = 0;
        StringBuilder stringbuilder = new StringBuilder();
        if (ModelHelper.isValid(getDatePublished()))
        {
            java.util.Date date = ModelHelper.stringToDate(getDatePublished());
            stringbuilder.append(Resources.string(0x7f070379, new Object[] {
                _dateFormatter.format(date)
            }));
        }
        if (ModelHelper.isValid(getContentRating()))
        {
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(" &#8226; ");
            }
            stringbuilder.append(getContentRating());
        }
        if (ModelHelper.isValid(_genres))
        {
            for (int j = _genres.a(); i < j; i++)
            {
                if (i == 0 && stringbuilder.length() > 0)
                {
                    stringbuilder.append("<br/>");
                }
                stringbuilder.append(_genres.a(i));
                stringbuilder.append(" &#8226; ");
            }

        }
        return StringUtils.removeEnd(stringbuilder.toString(), " &#8226; ");
    }

    private Spanned makeRatingDisplay()
    {
        if (ModelHelper.isValid(_aggregateRating) && ModelHelper.isValid(_aggregateRating.getRatingDisplay()))
        {
            String s1 = _aggregateRating.getRatingDisplay();
            Object obj = getWebsiteName();
            String s = ((String) (obj));
            if (!ModelHelper.isValid(obj))
            {
                s = getPin().getDomain();
            }
            obj = new SpannableStringBuilder();
            ((SpannableStringBuilder) (obj)).append(s1);
            ((SpannableStringBuilder) (obj)).setSpan(new TextAppearanceSpan(Application.context(), 0x7f0b01cb), 0, s1.indexOf("/"), 33);
            if (ModelHelper.isValid(s))
            {
                ((SpannableStringBuilder) (obj)).append((new StringBuilder(" ")).append(Resources.string(0x7f070378, new Object[] {
                    s
                })).toString());
                return ((Spanned) (obj));
            } else
            {
                return ((Spanned) (obj));
            }
        } else
        {
            return null;
        }
    }

    public void generateCacheContent()
    {
        _directorsDisplay = Person.makePeopleDataDisplay(_directors, "<br>");
        _actorsDisplay = Person.makePeopleDataDisplay(_actors, "<br>");
        _writersDisplay = Person.makePeopleDataDisplay(_writers, "<br>");
        _metadataDisplay = makeMetadataDisplay();
        _ratingDisplay = makeRatingDisplay();
    }

    public List getActors()
    {
        return _actors;
    }

    public String getActorsDisplay()
    {
        return _actorsDisplay;
    }

    public AggregateRating getAggregateRating()
    {
        return _aggregateRating;
    }

    public String getContentRating()
    {
        return _contentRating;
    }

    public String getDatePublished()
    {
        return _datePublished;
    }

    public String getDescription()
    {
        return _description;
    }

    public List getDirectors()
    {
        return _directors;
    }

    public String getDirectorsDisplay()
    {
        return _directorsDisplay;
    }

    public Integer getDuration()
    {
        return _duration;
    }

    public PinterestJsonArray getGenres()
    {
        return _genres;
    }

    public String getId()
    {
        return _id;
    }

    protected PinterestJsonObject getJsonObject(PinterestJsonObject pinterestjsonobject)
    {
        return pinterestjsonobject.c("movie");
    }

    public Spanned getMetadataDisplay()
    {
        return Html.fromHtml(_metadataDisplay);
    }

    public String getName()
    {
        return _name;
    }

    public Spanned getRatingDisplay()
    {
        return _ratingDisplay;
    }

    public String getType()
    {
        return _type;
    }

    public List getWriters()
    {
        return _writers;
    }

    public String getWritersDisplay()
    {
        return _writersDisplay;
    }

    public boolean hasActors()
    {
        return _actors != null && !_actors.isEmpty();
    }

    public boolean hasDirectors()
    {
        return _directors != null && !_directors.isEmpty();
    }

    public boolean hasGenres()
    {
        return _genres != null && _genres.a() > 0;
    }

    public boolean hasRating()
    {
        return ModelHelper.isValid(getRatingDisplay());
    }

    public boolean hasWriters()
    {
        return _writers != null && !_writers.isEmpty();
    }

    public void setActors(List list)
    {
        _actors = list;
    }

    public void setAggregateRating(AggregateRating aggregaterating)
    {
        _aggregateRating = aggregaterating;
    }

    public void setContentRating(String s)
    {
        _contentRating = s;
    }

    public void setDatePublished(String s)
    {
        _datePublished = s;
    }

    public void setDescription(String s)
    {
        _description = s;
    }

    public void setDirectors(List list)
    {
        _directors = list;
    }

    public void setDuration(Integer integer)
    {
        _duration = integer;
    }

    public void setGenres(PinterestJsonArray pinterestjsonarray)
    {
        _genres = pinterestjsonarray;
    }

    public void setId(String s)
    {
        _id = s;
    }

    public void setName(String s)
    {
        _name = s;
    }

    public void setType(String s)
    {
        _type = s;
    }

    public void setWriters(List list)
    {
        _writers = list;
    }

    static 
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("MMMMM d, yyyy");
        _dateFormatter = simpledateformat;
        simpledateformat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }
}
