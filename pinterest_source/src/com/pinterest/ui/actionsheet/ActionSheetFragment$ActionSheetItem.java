// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.actionsheet;

import com.pinterest.kit.application.Resources;

public class onClickListener
{

    public static final int COLOR_DEFAULT = Resources.color(0x7f0e00a9);
    public int color;
    public boolean grayOut;
    public int leftDrawable;
    public android.view.ActionSheetItem.color onClickListener;
    public String text;

    public void setGrayOut(boolean flag)
    {
        grayOut = flag;
    }

    public grayOut setLeftDrawable(int i)
    {
        leftDrawable = i;
        return this;
    }

    public leftDrawable setTextColor(int i)
    {
        color = i;
        return this;
    }


    public (int i, android.view.ActionSheetItem actionsheetitem)
    {
        this(Resources.string(i), actionsheetitem);
    }

    public <init>(String s, android.view.ActionSheetItem actionsheetitem)
    {
        color = COLOR_DEFAULT;
        text = s;
        onClickListener = actionsheetitem;
    }
}
