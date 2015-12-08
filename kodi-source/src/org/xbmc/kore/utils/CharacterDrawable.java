// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.utils;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;

// Referenced classes of package org.xbmc.kore.utils:
//            Utils

public class CharacterDrawable extends ColorDrawable
{

    private static final Typeface typeface;
    private final char character;
    private final Paint textPaint = new Paint();

    public CharacterDrawable(char c, int i)
    {
        super(i);
        character = c;
        textPaint.setColor(-1);
        textPaint.setAntiAlias(true);
        textPaint.setFakeBoldText(false);
        textPaint.setStyle(android.graphics.Paint.Style.FILL);
        textPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        textPaint.setTypeface(typeface);
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        int i = canvas.getWidth();
        int j = canvas.getHeight();
        textPaint.setTextSize(j / 2);
        canvas.drawText(String.valueOf(character), i / 2, (float)(j / 2) - (textPaint.descent() + textPaint.ascent()) / 2.0F, textPaint);
    }

    public int getOpacity()
    {
        return -3;
    }

    public void setAlpha(int i)
    {
        textPaint.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        textPaint.setColorFilter(colorfilter);
    }

    static 
    {
        if (Utils.isJellybeanMR1OrLater())
        {
            typeface = Typeface.create("sans-serif-thin", 0);
        } else
        if (Utils.isJellybeanOrLater())
        {
            typeface = Typeface.create("sans-serif-light", 0);
        } else
        {
            typeface = Typeface.create("sans-serif", 0);
        }
    }
}
