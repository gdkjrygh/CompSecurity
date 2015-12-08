// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model.metadata.article;

import android.text.Html;
import android.text.Spanned;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.PinMetadata;
import com.pinterest.api.model.metadata.Person;
import com.pinterest.kit.application.Resources;
import com.pinterest.network.json.PinterestJsonObject;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

public class Article extends PinMetadata
{

    private static final SimpleDateFormat _dateFormatter;
    private static final SimpleDateFormat _dateFormatterFromApi = new SimpleDateFormat("EEE, d MMM yyyy h:m:s Z");
    private List _authors;
    private String _authorsDisplay;
    private String _datePublished;
    private String _description;
    private String _formattedDatePublished;
    private String _id;
    private String _metadataDisplay;
    private String _name;
    private String _type;

    public Article()
    {
        super(null, null);
        _authors = new ArrayList();
    }

    public Article(Pin pin, PinterestJsonObject pinterestjsonobject)
    {
        super(pin, pinterestjsonobject);
        _authors = new ArrayList();
        if (pinterestjsonobject != null)
        {
            if ((pin = pinterestjsonobject.c("article")) != null)
            {
                _authors = Person.getPersons(pin.e("authors"));
                _datePublished = pin.a("date_published", "");
                _description = pin.a("description", "");
                _id = pin.a("id", "");
                _name = pin.a("name", "");
                _type = pin.a("type", "");
                generateCacheContent();
                return;
            }
        }
    }

    private String makeMetadataDisplay()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (hasAuthors())
        {
            stringbuilder.append(Resources.string(0x7f070068, new Object[] {
                getAuthorsDisplay()
            }));
        }
        return stringbuilder.toString();
    }

    public void generateCacheContent()
    {
        try
        {
            java.util.Date date = _dateFormatterFromApi.parse(_datePublished);
            _formattedDatePublished = _dateFormatter.format(date);
        }
        catch (Exception exception) { }
        _authorsDisplay = Person.makePeopleDataDisplay(_authors);
        _metadataDisplay = makeMetadataDisplay();
    }

    public List getAuthors()
    {
        return _authors;
    }

    public String getAuthorsDisplay()
    {
        return _authorsDisplay;
    }

    public String getDatePublished()
    {
        return _datePublished;
    }

    public String getDatePublishedFormatted()
    {
        return _formattedDatePublished;
    }

    public String getDescription()
    {
        return _description;
    }

    public String getId()
    {
        return _id;
    }

    public Spanned getMetadataDisplay()
    {
        return Html.fromHtml(_metadataDisplay);
    }

    public String getName()
    {
        return _name;
    }

    public String getType()
    {
        return _type;
    }

    public boolean hasAuthors()
    {
        return _authors != null && !_authors.isEmpty();
    }

    public void setAuthors(List list)
    {
        _authors = list;
    }

    public void setDatePublished(String s)
    {
        _datePublished = s;
    }

    public void setDescription(String s)
    {
        _description = s;
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

    static 
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("MMMM d, yyyy");
        _dateFormatter = simpledateformat;
        simpledateformat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }
}
