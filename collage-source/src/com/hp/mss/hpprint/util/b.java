// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hp.mss.hpprint.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;

public class b
{

    private static Typeface a;

    public b()
    {
    }

    public static Typeface a(Context context)
    {
        if (a == null)
        {
            String s = context.getResources().getString(com.hp.mss.hpprint.R.string.lib_font);
            if (s.equals(""))
            {
                a = Typeface.DEFAULT;
            } else
            {
                a = Typeface.createFromAsset(context.getAssets(), s);
            }
        }
        return a;
    }
}
