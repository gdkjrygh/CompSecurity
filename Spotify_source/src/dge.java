// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class dge extends MetricAffectingSpan
{

    private Typeface a;

    public dge(Typeface typeface)
    {
        a = typeface;
    }

    public static CharSequence a(CharSequence charsequence, Typeface typeface)
    {
        if (charsequence == null)
        {
            return null;
        } else
        {
            SpannableString spannablestring = new SpannableString(charsequence);
            spannablestring.setSpan(new dge(typeface), 0, charsequence.length(), 33);
            return spannablestring;
        }
    }

    private void a(TextPaint textpaint)
    {
        Typeface typeface1 = a;
        Typeface typeface2 = textpaint.getTypeface();
        if (typeface1 == null)
        {
            return;
        }
        Typeface typeface = typeface1;
        if (typeface2 != null)
        {
            int i = typeface2.getStyle();
            typeface = typeface1;
            if (typeface1.getStyle() != i)
            {
                typeface = Typeface.create(typeface1, i);
            }
            a = typeface;
        }
        textpaint.setTypeface(typeface);
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
