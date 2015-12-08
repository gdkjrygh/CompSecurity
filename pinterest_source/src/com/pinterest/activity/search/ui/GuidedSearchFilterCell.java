// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.explore.view.ExploreListCell;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.imageview.WebImageView;

public class GuidedSearchFilterCell extends ExploreListCell
{

    TextView _countView;
    WebImageView _icon;

    public GuidedSearchFilterCell(Context context)
    {
        this(context, null);
    }

    public GuidedSearchFilterCell(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public GuidedSearchFilterCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public static GuidedSearchFilterCell from(View view, ViewGroup viewgroup)
    {
        if (view instanceof GuidedSearchFilterCell)
        {
            return (GuidedSearchFilterCell)view;
        } else
        {
            return new GuidedSearchFilterCell(ViewHelper.getContext(view, viewgroup));
        }
    }

    protected void init()
    {
        setBackgroundResource(0x7f0200bc);
        LayoutInflater.from(getContext()).inflate(0x7f030139, this, true);
        ButterKnife.a(this);
    }

    public void setCount(String s)
    {
        _countView.setText(s);
    }

    public void setIconVisibility(int i)
    {
        _icon.setVisibility(i);
    }
}
