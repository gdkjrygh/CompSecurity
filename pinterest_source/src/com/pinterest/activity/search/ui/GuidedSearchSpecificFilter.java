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
import butterknife.ButterKnife;
import com.pinterest.api.model.SearchFilter;
import com.pinterest.ui.imageview.GrayWebImageView;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.search.ui:
//            GuidedSearchModeFilter

public class GuidedSearchSpecificFilter extends GuidedSearchModeFilter
{

    ImageView _tokenCaret;

    public GuidedSearchSpecificFilter(Context context)
    {
        this(context, null);
    }

    public GuidedSearchSpecificFilter(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public static GuidedSearchSpecificFilter get(View view, ViewGroup viewgroup)
    {
        if (view == null || !(view instanceof GuidedSearchSpecificFilter))
        {
            return new GuidedSearchSpecificFilter(viewgroup.getContext());
        } else
        {
            return (GuidedSearchSpecificFilter)view;
        }
    }

    protected void init()
    {
        setOrientation(0);
        setBackgroundResource(0x7f0e0072);
        inflate(getContext(), 0x7f030155, this);
        _dominantColor = Color.parseColor("#32CD32");
        ButterKnife.a(this);
    }

    public void updateUI()
    {
        _tokenCaret.setVisibility(0);
        String s;
        if (_filterItem != null)
        {
            s = _filterItem.getDisplayName();
        } else
        {
            s = _filterName;
        }
        _filterName = s;
        if (_filterItem != null)
        {
            s = _filterItem.getDisplayImageUrl();
        } else
        {
            s = _filterImageUrl;
        }
        _filterImageUrl = s;
        updateFilterUI(_dominantColor, _filterName, _filterImageUrl);
        if (StringUtils.isNotEmpty(_filterImageUrl))
        {
            _tokenView.setBackgroundDrawable(null);
        }
    }
}
