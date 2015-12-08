// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

// Referenced classes of package com.tinder.utils:
//            ad

public final class j extends MetricAffectingSpan
{

    private Typeface a;

    public j(Context context, CustomFont.Font font)
    {
        a = ad.a(context, font.f);
    }

    private void a(Paint paint)
    {
        Typeface typeface = paint.getTypeface();
        int i;
        if (typeface != null)
        {
            i = typeface.getStyle();
        } else
        {
            i = 0;
        }
        i &= ~a.getStyle();
        if ((i & 1) != 0)
        {
            paint.setFakeBoldText(true);
        }
        if ((i & 2) != 0)
        {
            paint.setTextSkewX(-0.25F);
        }
        paint.setTypeface(a);
    }

    public final void updateDrawState(TextPaint textpaint)
    {
        a(textpaint);
    }

    public final void updateMeasureState(TextPaint textpaint)
    {
        a(textpaint);
    }
}
