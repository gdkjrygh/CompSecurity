// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.SparseArray;

public final class z
{

    private static SparseArray a;

    public static Typeface a(Context context, int i)
    {
        String s = (String)a.get(i);
        if (!TextUtils.isEmpty(s))
        {
            return a(context, s);
        } else
        {
            return null;
        }
    }

    private static Typeface a(Context context, String s)
    {
        return Typeface.createFromAsset(context.getResources().getAssets(), String.format("fonts/%s", new Object[] {
            s
        }));
    }

    static 
    {
        a = new SparseArray(19);
        a.put(1, "Georgia.ttf");
        a.put(2, "Georgia_Bold_Italic.ttf");
        a.put(3, "Georgia_Bold.ttf");
        a.put(4, "Georgia_Italic.ttf");
        a.put(5, "Gotham_Book.ttf");
        a.put(6, "Gotham_Book.otf");
        a.put(7, "Gotham_Bold.ttf");
        a.put(8, "Gotham_Bold.otf");
        a.put(9, "Gotham_Book_Italic.otf");
        a.put(10, "Gotham_Light.otf");
        a.put(11, "Gotham_Light.ttf");
        a.put(12, "Gotham_Medium.ttf");
        a.put(13, "Gotham_Medium.otf");
        a.put(14, "Gotham_Ultra.otf");
        a.put(15, "Lora_Bold.ttf");
        a.put(16, "Lora_Bold_Italic.ttf");
        a.put(17, "Lora_Italic.ttf");
        a.put(18, "Lora_Regular.ttf");
        a.put(19, "Helvetica.otf");
    }
}
