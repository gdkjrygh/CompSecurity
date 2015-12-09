// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

// Referenced classes of package com.fitbit.runtrack.ui:
//            ImpactSummary

class a extends TypefaceSpan
{

    final Typeface a;
    final tAdapter._cls1 b;

    private void a(TextPaint textpaint)
    {
        boolean flag;
        if ((a.getStyle() & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        textpaint.setFakeBoldText(flag);
        textpaint.setTypeface(a);
    }

    public void updateDrawState(TextPaint textpaint)
    {
        a(textpaint);
    }

    public void updateMeasureState(TextPaint textpaint)
    {
        a(textpaint);
    }

    ( , String s, Typeface typeface)
    {
        b = ;
        a = typeface;
        super(s);
    }
}
