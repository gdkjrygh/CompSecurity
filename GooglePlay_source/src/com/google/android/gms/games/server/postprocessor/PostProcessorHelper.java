// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.postprocessor;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.gms.games.server.converter.ImageUrlBuilder;

public final class PostProcessorHelper
{

    public static void convertImageUrl(Context context, ContentValues contentvalues, String s, int i)
    {
        convertImageUrl(context, contentvalues, s, s, i);
    }

    public static void convertImageUrl(Context context, ContentValues contentvalues, String s, String s1, int i)
    {
        s = contentvalues.getAsString(s);
        if (s != null)
        {
            contentvalues.put(s1, (new ImageUrlBuilder(s)).setSize(context, i).build());
        }
    }

    public static void convertImageUrlMaxWidth(Context context, ContentValues contentvalues, String s)
    {
        String s1 = contentvalues.getAsString(s);
        if (s1 != null)
        {
            contentvalues.put(s, getMaxWidthImageUrl(context, s1));
        }
    }

    public static void convertImageUrlStripDefault(Context context, ContentValues contentvalues, String s, String s1, int i)
    {
        Boolean boolean1 = contentvalues.getAsBoolean(s);
        contentvalues.remove(s);
        if (boolean1 != null && boolean1.booleanValue())
        {
            contentvalues.putNull(s1);
            return;
        } else
        {
            convertImageUrl(context, contentvalues, s1, i);
            return;
        }
    }

    public static String getMaxWidthImageUrl(Context context, String s)
    {
        context = context.getResources().getDisplayMetrics();
        int i = Math.max(((DisplayMetrics) (context)).widthPixels, ((DisplayMetrics) (context)).heightPixels);
        context = new ImageUrlBuilder(s);
        context.mSize = i;
        return context.build();
    }
}
