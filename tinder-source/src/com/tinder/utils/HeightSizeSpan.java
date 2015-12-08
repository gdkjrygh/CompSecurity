// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.text.TextPaint;
import android.text.style.RelativeSizeSpan;

public class HeightSizeSpan extends RelativeSizeSpan
{

    private float a;

    public HeightSizeSpan()
    {
        super(0.5F);
        a = 0.65F;
    }

    public void updateDrawState(TextPaint textpaint)
    {
        super.updateDrawState(textpaint);
        textpaint.baselineShift = textpaint.baselineShift + (int)(textpaint.ascent() * a);
    }
}
