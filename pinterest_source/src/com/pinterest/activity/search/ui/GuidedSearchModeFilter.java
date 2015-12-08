// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.ui;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.pinterest.api.model.SearchFilter;

// Referenced classes of package com.pinterest.activity.search.ui:
//            GuidedSearchFilter

public class GuidedSearchModeFilter extends GuidedSearchFilter
{

    LinearLayout _divider;
    protected String _filterImageUrl;
    protected SearchFilter _filterItem;
    protected String _filterName;
    protected String _filterType;
    ImageView _tokenIcon;

    public GuidedSearchModeFilter(Context context)
    {
        this(context, null);
    }

    public GuidedSearchModeFilter(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public static GuidedSearchModeFilter get(View view, ViewGroup viewgroup)
    {
        if (view == null || !(view instanceof GuidedSearchModeFilter))
        {
            return new GuidedSearchModeFilter(viewgroup.getContext());
        } else
        {
            return (GuidedSearchModeFilter)view;
        }
    }

    protected void init()
    {
        setOrientation(0);
        setBackgroundResource(0x7f0e0072);
        inflate(getContext(), 0x7f030155, this);
        _dominantColor = Color.parseColor("#bd081c");
        ButterKnife.a(this);
    }

    public void setFilterImageUrl(String s)
    {
        _filterImageUrl = s;
    }

    public void setFilterName(String s)
    {
        _filterName = s;
    }

    public void setFilterType(String s)
    {
        _filterType = s;
    }

    public void setItem(SearchFilter searchfilter)
    {
        _filterItem = searchfilter;
    }

    public void setShowDivider(boolean flag)
    {
        if (flag)
        {
            _divider.setVisibility(0);
            return;
        } else
        {
            _divider.setVisibility(8);
            return;
        }
    }

    public void updateUI()
    {
        String s;
        int i;
        if (_filterItem != null)
        {
            if (com.pinterest.api.model.SearchFilter.MODES.MAKE.getValue().equalsIgnoreCase(_filterItem.getTypeValue()))
            {
                _tokenIcon.setImageResource(0x7f0201a7);
            } else
            if (com.pinterest.api.model.SearchFilter.MODES.SHOP.getValue().equalsIgnoreCase(_filterItem.getTypeValue()))
            {
                _tokenIcon.setImageResource(0x7f0201a8);
            }
        }
        i = _dominantColor;
        if (_filterItem == null)
        {
            s = _filterName;
        } else
        {
            s = _filterItem.getDisplayName();
        }
        updateFilterUI(i, s, null);
    }
}
