// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.text;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

// Referenced classes of package com.skype.android.text:
//            TypeFaceFactory

public class TypeFacedSpan extends MetricAffectingSpan
{

    private TypeFaceFactory a;

    public TypeFacedSpan(TypeFaceFactory typefacefactory)
    {
        a = typefacefactory;
    }

    private void a(Paint paint)
    {
        Typeface typeface = paint.getTypeface();
        float f;
        int i;
        if (typeface == null)
        {
            i = 0;
        } else
        {
            i = typeface.getStyle();
        }
        f = paint.getTextSize();
        if (a(i))
        {
            typeface = a.getBold(f);
        } else
        {
            typeface = a.getDefault(f);
        }
        if ((i & 2) != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            paint.setTextSkewX(-0.25F);
        }
        if (typeface != null)
        {
            paint.setTypeface(typeface);
        }
    }

    protected boolean a(int i)
    {
        return (i & 1) != 0;
    }

    public void updateDrawState(TextPaint textpaint)
    {
        a(textpaint);
    }

    public void updateMeasureState(TextPaint textpaint)
    {
        a(textpaint);
    }
}
