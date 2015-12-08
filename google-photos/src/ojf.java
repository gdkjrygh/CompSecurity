// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextPaint;
import android.text.style.SuperscriptSpan;

public final class ojf extends SuperscriptSpan
{

    public ojf()
    {
    }

    public final void updateDrawState(TextPaint textpaint)
    {
        textpaint.baselineShift = textpaint.baselineShift + (int)(textpaint.ascent() / 4F);
    }

    public final void updateMeasureState(TextPaint textpaint)
    {
        textpaint.baselineShift = textpaint.baselineShift + (int)(textpaint.ascent() / 4F);
    }
}
