// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.charts;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import com.fitbit.util.fonts.FitbitFont;
import com.fitbit.util.i.i;

public class a
{

    public a()
    {
    }

    public static void a(Context context, Paint paint)
    {
        android.content.res.TypedArray typedarray = i.a(context, i.a(context, 0x7f010016, -1), new int[] {
            0x7f010001, 0x7f010002
        });
        paint.setColor(i.a(typedarray, 0, -1));
        paint.setTextSize(i.a(typedarray, 1, 1.0F));
        paint.setTypeface(FitbitFont.g.a(context, Typeface.DEFAULT));
    }

    public static void b(Context context, Paint paint)
    {
        android.content.res.TypedArray typedarray = i.a(context, i.a(context, 0x7f010016, -1), new int[] {
            0x7f010033, 0x7f010034
        });
        paint.setColor(i.a(typedarray, 0, -1));
        paint.setTextSize(i.a(typedarray, 1, 1.0F));
        paint.setTypeface(FitbitFont.h.a(context, Typeface.DEFAULT));
    }
}
