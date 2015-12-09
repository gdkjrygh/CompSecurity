// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.fonts;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

public class CustomTypefaceSpan extends TypefaceSpan
{

    private final Typeface a;

    public CustomTypefaceSpan(Context context, String s)
    {
        this(Typeface.createFromAsset(context.getAssets(), s));
    }

    public CustomTypefaceSpan(Typeface typeface)
    {
        super("serif");
        a = typeface;
    }

    private static void a(Paint paint, Typeface typeface)
    {
        Typeface typeface1 = paint.getTypeface();
        int i;
        if (typeface1 == null)
        {
            i = 0;
        } else
        {
            i = typeface1.getStyle();
        }
        i &= ~typeface.getStyle();
        if ((i & 1) != 0)
        {
            paint.setFakeBoldText(true);
        }
        if ((i & 2) != 0)
        {
            paint.setTextSkewX(-0.25F);
        }
        paint.setTypeface(typeface);
    }

    public void updateDrawState(TextPaint textpaint)
    {
        a(textpaint, a);
    }

    public void updateMeasureState(TextPaint textpaint)
    {
        a(textpaint, a);
    }
}
