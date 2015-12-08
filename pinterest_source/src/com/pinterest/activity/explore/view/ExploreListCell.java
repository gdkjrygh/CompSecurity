// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.explore.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.imageview.WebImageView;

public class ExploreListCell extends FrameLayout
{

    WebImageView _icon;
    TextView _title;
    TextView _titleOnlyTv;
    View _wrapper;
    protected boolean isTitleOnly;

    public ExploreListCell(Context context)
    {
        this(context, null);
    }

    public ExploreListCell(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ExploreListCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        isTitleOnly = false;
        init();
    }

    public static ExploreListCell from(View view, ViewGroup viewgroup)
    {
        if (view instanceof ExploreListCell)
        {
            return (ExploreListCell)view;
        } else
        {
            return new ExploreListCell(ViewHelper.getContext(view, viewgroup));
        }
    }

    protected void init()
    {
        setBackgroundResource(0x7f0200bc);
        LayoutInflater.from(getContext()).inflate(0x7f030153, this, true);
        ButterKnife.a(this);
    }

    public void loadIconImage(String s)
    {
        _icon.loadUrl(s);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (isTitleOnly)
        {
            j = _titleOnlyTv.getMeasuredHeight();
        } else
        {
            j = _wrapper.getMeasuredHeight();
        }
        setMeasuredDimension(i, j);
    }

    public void setImageResource(int i)
    {
        _icon.prepareForReuse();
        _icon.setImageResource(i, false);
    }

    public void setText(int i)
    {
        _title.setText(i);
        _titleOnlyTv.setText(i);
    }

    public void setText(String s)
    {
        _title.setText(s);
        _titleOnlyTv.setText(s);
    }

    public void setTitleOnly(boolean flag)
    {
        isTitleOnly = flag;
        View view = _wrapper;
        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ViewHelper.setVisibility(view, flag1);
        ViewHelper.setVisibility(_titleOnlyTv, flag);
    }
}
