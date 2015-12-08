// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.ui;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.search.model.RelatedQueryItem;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.network.image.ImageCache;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.imageview.GrayWebImageView;
import org.apache.commons.lang3.StringUtils;

public class GuidedSearchFilter extends LinearLayout
{

    protected int _dominantColor;
    protected boolean _isFirstFilter;
    protected boolean _isLastFilter;
    View _paddingLeftView;
    View _paddingRightView;
    private RelatedQueryItem _queryItem;
    TextView _tokenText;
    GrayWebImageView _tokenView;

    public GuidedSearchFilter(Context context)
    {
        this(context, null);
    }

    public GuidedSearchFilter(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        _isFirstFilter = false;
        _isLastFilter = false;
        init();
    }

    public static GuidedSearchFilter get(View view, ViewGroup viewgroup)
    {
        if (view == null || !(view instanceof GuidedSearchFilter))
        {
            return new GuidedSearchFilter(viewgroup.getContext());
        } else
        {
            return (GuidedSearchFilter)view;
        }
    }

    protected void init()
    {
        setOrientation(0);
        setBackgroundResource(0x7f0e0072);
        inflate(getContext(), 0x7f030143, this);
        ButterKnife.a(this);
    }

    public void setFirstFilter(boolean flag)
    {
        _isFirstFilter = flag;
    }

    public void setItem(RelatedQueryItem relatedqueryitem)
    {
        _queryItem = relatedqueryitem;
    }

    public void setLastFilter(boolean flag)
    {
        _isLastFilter = flag;
    }

    protected void updateFilterUI(int i, String s, String s1)
    {
        boolean flag = false;
        android.graphics.drawable.ShapeDrawable shapedrawable = ViewHelper.getRoundDrawable((int)Resources.dimension(0x7f0a01bb), i);
        _tokenView.setBackgroundDrawable(shapedrawable);
        if (StringUtils.isNotEmpty(s1))
        {
            ImageCache.loadImage(_tokenView, s1);
        }
        _tokenText.setText(s);
        s = _paddingLeftView;
        if (_isFirstFilter)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        s.setVisibility(i);
        s = _paddingRightView;
        if (_isLastFilter)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        s.setVisibility(i);
    }

    public void updateUI()
    {
        String s;
label0:
        {
            if (_queryItem == null)
            {
                return;
            }
            String s1 = _queryItem.getDominantColor();
            if (!StringUtils.isEmpty(s1))
            {
                s = s1;
                if (s1.compareToIgnoreCase("#eeeeee") <= 0)
                {
                    break label0;
                }
            }
            s = "#55000000";
        }
        _dominantColor = Color.parseColor(s);
        updateFilterUI(_dominantColor, _queryItem.getDisplay(), _queryItem.getImageUri());
    }
}
