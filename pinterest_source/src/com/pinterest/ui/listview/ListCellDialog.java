// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.listview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.ui.text.IconView;

public class ListCellDialog extends FrameLayout
{

    View _dividerVw;
    IconView _iconView;
    TextView _titleTv;

    public ListCellDialog(Context context)
    {
        this(context, null);
    }

    public ListCellDialog(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public static ListCellDialog get(View view, ViewGroup viewgroup)
    {
        if (view == null || !(view instanceof ListCellDialog))
        {
            return new ListCellDialog(viewgroup.getContext());
        } else
        {
            return (ListCellDialog)view;
        }
    }

    private void init()
    {
        setMinimumHeight(getResources().getDimensionPixelSize(0x7f0a0155));
        setBackgroundResource(0x7f020283);
        inflate(getContext(), 0x7f03013d, this);
        ButterKnife.a(this);
    }

    public void setDividerVisibility(int i)
    {
        _dividerVw.setVisibility(i);
    }

    public void setImage(Drawable drawable)
    {
        if (drawable == null)
        {
            return;
        } else
        {
            _iconView.setImageDrawable(drawable);
            return;
        }
    }

    public void setImageBorderStyle(com.pinterest.ui.imageview.GrayWebImageView.BorderStyle borderstyle)
    {
        _iconView.setBorderStyle(borderstyle);
    }

    public void setText(String s)
    {
        _titleTv.setText(s);
    }
}
