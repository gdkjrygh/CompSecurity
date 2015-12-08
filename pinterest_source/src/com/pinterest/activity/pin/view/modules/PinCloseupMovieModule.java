// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.content.Context;
import android.graphics.Rect;
import android.text.Html;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.metadata.AggregateRating;
import com.pinterest.api.model.metadata.movie.Movie;
import com.pinterest.base.Constants;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.ui.text.PTextView;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupBaseModule

public class PinCloseupMovieModule extends PinCloseupBaseModule
{

    private boolean _isMovie;
    private int _sidePadding;

    public PinCloseupMovieModule(Context context)
    {
        super(context);
        _sidePadding = (int)Resources.dimension(0x7f0a0184);
    }

    private void addMovieRow(LinearLayout linearlayout, String s, CharSequence charsequence)
    {
        PTextView ptextview = new PTextView(getContext(), null, 0x7f0100dc);
        ptextview.setText(Html.fromHtml((new StringBuilder("<b>")).append(s).append("</b><br/>").append(charsequence).toString()));
        ptextview.setPadding(0, 0, 0, Constants.MARGIN);
        linearlayout.addView(ptextview, -1, -2);
    }

    private void displayMovie()
    {
        Movie movie = (Movie)_pinMetadata;
        Context context = getContext();
        Resources.dimension(0x7f0a0186);
        int j = (int)Resources.dimension(0x7f0a018a);
        if (movie.isFromAggregatedData().booleanValue())
        {
            View view = getDividerView();
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, Constants.HAIRLINE);
            layoutparams.setMargins(0, 0, 0, Constants.MARGIN);
            addView(view, layoutparams);
        }
        Object obj = new LinearLayout(context);
        ((LinearLayout) (obj)).setPadding(_sidePadding, 0, _sidePadding, 0);
        addView(((View) (obj)));
        LinearLayout linearlayout1 = new LinearLayout(getContext());
        linearlayout1.setPadding(0, 0, j, 0);
        ((LinearLayout) (obj)).addView(linearlayout1, new android.widget.LinearLayout.LayoutParams(-1, -2, 0.5F));
        LinearLayout linearlayout = new LinearLayout(getContext());
        ((LinearLayout) (obj)).addView(linearlayout, new android.widget.LinearLayout.LayoutParams(-1, -2, 0.5F));
        Object obj2 = movie.getContentRating();
        Object obj1 = movie.getAggregateRating();
        obj = null;
        if (ModelHelper.isValid(obj1))
        {
            obj = ((AggregateRating) (obj1)).getRatingDisplay();
        }
        int i;
        boolean flag;
        int k;
        if (ModelHelper.isValid(obj2))
        {
            obj1 = obj2;
        } else
        {
            obj1 = obj;
        }
        if (ModelHelper.isValid(obj1))
        {
            PTextView ptextview = new PTextView(context);
            ptextview.setTextAppearance(context, 0x7f0b01ed);
            ptextview.setText(((CharSequence) (obj1)));
            linearlayout1.addView(ptextview);
            i = 1;
        } else
        {
            i = 0;
        }
        flag = i;
        if (ModelHelper.isValid(obj2))
        {
            flag = i;
            if (ModelHelper.isValid(obj))
            {
                obj1 = new PTextView(context);
                ((PTextView) (obj1)).setTextAppearance(context, 0x7f0b01ed);
                ((PTextView) (obj1)).setText(((CharSequence) (obj)));
                linearlayout.addView(((View) (obj1)));
                flag = true;
            }
        }
        obj = new LinearLayout(getContext());
        k = _sidePadding;
        if (flag)
        {
            i = Constants.MARGIN;
        } else
        {
            i = 0;
        }
        ((LinearLayout) (obj)).setPadding(k, i, _sidePadding, 0);
        addView(((View) (obj)));
        obj1 = new LinearLayout(getContext());
        ((LinearLayout) (obj1)).setOrientation(1);
        ((LinearLayout) (obj1)).setPadding(0, 0, j, 0);
        ((LinearLayout) (obj)).addView(((View) (obj1)), new android.widget.LinearLayout.LayoutParams(-1, -2, 0.5F));
        if (movie.hasActors())
        {
            addMovieRow(((LinearLayout) (obj1)), Resources.stringPlural(0x7f090011, Integer.valueOf(movie.getActors().size())), movie.getActorsDisplay());
        }
        obj2 = new LinearLayout(context);
        ((LinearLayout) (obj2)).setOrientation(1);
        ((LinearLayout) (obj)).addView(((View) (obj2)), new android.widget.LinearLayout.LayoutParams(-1, -2, 0.5F));
        if (movie.hasWriters())
        {
            addMovieRow(((LinearLayout) (obj2)), Resources.stringPlural(0x7f090013, Integer.valueOf(movie.getWriters().size())), movie.getWritersDisplay());
        }
        if (movie.hasDirectors())
        {
            addMovieRow(((LinearLayout) (obj2)), Resources.stringPlural(0x7f090012, Integer.valueOf(movie.getDirectors().size())), movie.getDirectorsDisplay());
        }
        if (((LinearLayout) (obj1)).getChildCount() > 0)
        {
            ((LinearLayout) (obj1)).getChildAt(((LinearLayout) (obj1)).getChildCount() - 1).setPadding(0, 0, 0, 0);
        }
        if (((LinearLayout) (obj2)).getChildCount() > 0)
        {
            ((LinearLayout) (obj2)).getChildAt(((LinearLayout) (obj2)).getChildCount() - 1).setPadding(0, 0, 0, 0);
        }
        if (movie.isFromAggregatedData().booleanValue())
        {
            movie.addMoreDetailsView(this, getComponentType(), _apiTag);
        }
    }

    private boolean isMovie()
    {
        if (_pinMetadata != null && (_pinMetadata instanceof Movie))
        {
            if (((Movie)_pinMetadata).isFromAggregatedData().booleanValue())
            {
                return Experiments.M();
            } else
            {
                return true;
            }
        } else
        {
            return false;
        }
    }

    protected HashMap getCardViewAuxData()
    {
        if (isMovie())
        {
            return ((Movie)_pinMetadata).getAuxData();
        } else
        {
            return null;
        }
    }

    protected ComponentType getComponentType()
    {
        return ComponentType.PIN_CLOSEUP_MOVIE;
    }

    protected boolean hasContent()
    {
        return isMovie();
    }

    protected void init()
    {
        _padding.top = (int)Resources.dimension(0x7f0a0186);
    }

    protected void initView()
    {
        setOrientation(1);
        setBackgroundColor(-1);
        setVisibility(8);
    }

    protected boolean shouldUpdateView()
    {
        boolean flag1 = isMovie();
        boolean flag;
        if (_isMovie != flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _isMovie = flag1;
        return flag;
    }

    protected void updateView()
    {
        removeAllViews();
        if (isMovie())
        {
            displayMovie();
            setVisibility(0);
            return;
        } else
        {
            setVisibility(8);
            return;
        }
    }
}
