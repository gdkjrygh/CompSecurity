// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.tooltip;

import android.view.View;

public class ToolTip
{

    public static final int ANIMATIONTYPE_FROMMASTERVIEW = 101;
    public static final int ANIMATIONTYPE_FROMTOP = 102;
    private int animationType;
    private int color;
    private View contentView;
    private boolean shadow;
    private CharSequence text;
    private int textResId;

    public ToolTip()
    {
        text = null;
        textResId = 0;
        color = 0;
        contentView = null;
        animationType = 101;
    }

    public int getAnimationType()
    {
        return animationType;
    }

    public int getColor()
    {
        return color;
    }

    public View getContentView()
    {
        return contentView;
    }

    public boolean getShadow()
    {
        return shadow;
    }

    public CharSequence getText()
    {
        return text;
    }

    public int getTextResId()
    {
        return textResId;
    }

    public ToolTip withAnimationType(int i)
    {
        animationType = i;
        return this;
    }

    public ToolTip withColor(int i)
    {
        color = i;
        return this;
    }

    public ToolTip withContentView(View view)
    {
        contentView = view;
        return this;
    }

    public ToolTip withShadow(boolean flag)
    {
        shadow = flag;
        return this;
    }

    public ToolTip withText(int i)
    {
        textResId = i;
        text = null;
        return this;
    }

    public ToolTip withText(CharSequence charsequence)
    {
        text = charsequence;
        textResId = 0;
        return this;
    }
}
