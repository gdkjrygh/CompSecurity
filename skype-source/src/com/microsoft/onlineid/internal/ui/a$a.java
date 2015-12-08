// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

// Referenced classes of package com.microsoft.onlineid.internal.ui:
//            a

private static final class a extends MetricAffectingSpan
{

    private Typeface a;

    public final void updateDrawState(TextPaint textpaint)
    {
        textpaint.setTypeface(a);
        textpaint.setFlags(textpaint.getFlags() | 0x80);
    }

    public final void updateMeasureState(TextPaint textpaint)
    {
        textpaint.setTypeface(a);
        textpaint.setFlags(textpaint.getFlags() | 0x80);
    }

    public (Typeface typeface)
    {
        a = typeface;
    }
}
