// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.afollestad.materialdialogs.util;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;

public class b
{

    public b()
    {
    }

    public static void a(Drawable drawable, int i)
    {
        if (drawable instanceof RippleDrawable)
        {
            ((RippleDrawable)drawable).setColor(ColorStateList.valueOf(i));
        }
    }
}
