// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.mediacontent;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.DynamicDrawableSpan;

// Referenced classes of package com.skype.android.mediacontent:
//            EmoticonContent, EmoticonSize

public class EmoticonSpan extends DynamicDrawableSpan
{

    private EmoticonContent a;
    private EmoticonSize b;
    private boolean c;
    private String d;

    public EmoticonSpan(EmoticonContent emoticoncontent, EmoticonSize emoticonsize, int i, boolean flag, String s)
    {
        super(i);
        a = emoticoncontent;
        b = emoticonsize;
        c = flag;
        d = s;
    }

    public EmoticonSpan(EmoticonContent emoticoncontent, EmoticonSize emoticonsize, boolean flag)
    {
        super(0);
        a = emoticoncontent;
        b = emoticonsize;
        c = flag;
    }

    public final EmoticonSize a()
    {
        return b;
    }

    public final EmoticonContent b()
    {
        return a;
    }

    public final String c()
    {
        return d;
    }

    public void draw(Canvas canvas, CharSequence charsequence, int i, int j, float f, int k, int l, 
            int i1, Paint paint)
    {
        charsequence = getDrawable();
        if (charsequence != null)
        {
            canvas.save();
            j = i1 - charsequence.getBounds().bottom;
            i = j;
            if (getVerticalAlignment() == 1)
            {
                i = j - paint.getFontMetricsInt().descent;
            }
            canvas.translate(f, i);
            charsequence.draw(canvas);
            canvas.restore();
        }
    }

    public Drawable getDrawable()
    {
        if (c)
        {
            return a.c(b);
        } else
        {
            return a.b(b);
        }
    }
}
