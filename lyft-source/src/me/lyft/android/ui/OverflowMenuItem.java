// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;

public class OverflowMenuItem extends FrameLayout
{

    ImageView icon;
    TextView label;
    TextView newItemHint;

    public OverflowMenuItem(Context context)
    {
        super(context);
        initialize();
    }

    public OverflowMenuItem(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        initialize();
    }

    private void initialize()
    {
        ButterKnife.a(this, LayoutInflater.from(getContext()).inflate(0x7f03005b, this, true));
        setBackgroundDrawable(getResources().getDrawable(0x7f02021e));
    }

    public OverflowMenuItem isNewItem(boolean flag)
    {
        TextView textview = newItemHint;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        textview.setVisibility(i);
        return this;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
    }

    public OverflowMenuItem setIconId(int i)
    {
        icon.setImageResource(i);
        return this;
    }

    public OverflowMenuItem setTitle(String s)
    {
        label.setText(s);
        return this;
    }
}
