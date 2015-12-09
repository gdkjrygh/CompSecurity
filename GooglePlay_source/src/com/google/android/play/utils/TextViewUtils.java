// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.utils;

import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.widget.TextView;

public final class TextViewUtils
{

    public static void setDrawable(TextView textview, Drawable drawable, boolean flag)
    {
        Drawable adrawable[] = textview.getCompoundDrawables();
        int i;
        boolean flag1;
        if (ViewCompat.getLayoutDirection(textview) == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 == flag)
        {
            i = 0;
        } else
        {
            i = 2;
        }
        adrawable[i] = drawable;
        textview.setCompoundDrawablesWithIntrinsicBounds(adrawable[0], adrawable[1], adrawable[2], adrawable[3]);
    }
}
