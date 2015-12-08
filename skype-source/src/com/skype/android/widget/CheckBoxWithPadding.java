// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.AppCompatCheckBox;
import android.util.AttributeSet;
import android.util.DisplayMetrics;

public class CheckBoxWithPadding extends AppCompatCheckBox
{

    public CheckBoxWithPadding(Context context)
    {
        super(context);
    }

    public CheckBoxWithPadding(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public CheckBoxWithPadding(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public int getCompoundPaddingLeft()
    {
        int i = super.getCompoundPaddingLeft();
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            float f = getResources().getDisplayMetrics().density;
            float f1 = getResources().getDimensionPixelSize(0x7f0c00c1);
            float f2 = getResources().getDimensionPixelSize(0x7f0c0215);
            i = super.getCompoundPaddingLeft() + (int)(f1 * f + f2);
        }
        return i;
    }
}
