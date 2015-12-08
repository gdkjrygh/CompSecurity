// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.base.Colors;
import com.pinterest.base.Constants;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.imageview.SquareImageView;
import org.apache.commons.lang3.StringUtils;

public class GuidedSearchActionFilterGridCell extends LinearLayout
{

    SquareImageView _filterImage;
    TextView _filterTextView;

    public GuidedSearchActionFilterGridCell(Context context)
    {
        this(context, null);
    }

    public GuidedSearchActionFilterGridCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public static GuidedSearchActionFilterGridCell get(View view, ViewGroup viewgroup)
    {
        if (view == null || !(view instanceof GuidedSearchActionFilterGridCell))
        {
            return new GuidedSearchActionFilterGridCell(viewgroup.getContext());
        } else
        {
            return (GuidedSearchActionFilterGridCell)view;
        }
    }

    private void init()
    {
        inflate(getContext(), 0x7f03013a, this);
        ButterKnife.a(this);
    }

    public void loadFilterImage(String s)
    {
        _filterImage.loadUrl(s);
    }

    public void setFilterColor(int i)
    {
        Object obj;
        if (i == Colors.WHITE)
        {
            obj = getResources().getDrawable(0x7f02026d);
        } else
        {
            obj = ViewHelper.getRoundDrawable(Constants.CORNER_RADIUS, i);
        }
        _filterImage.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj)));
    }

    public void setFilterText(String s)
    {
        if (StringUtils.isEmpty(s))
        {
            _filterTextView.setVisibility(8);
            return;
        } else
        {
            _filterTextView.setVisibility(0);
            _filterTextView.setText(s);
            return;
        }
    }
}
