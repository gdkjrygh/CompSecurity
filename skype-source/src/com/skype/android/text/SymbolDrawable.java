// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.text;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.skype.android.widget.SymbolElement;

// Referenced classes of package com.skype.android.text:
//            TypeFaceFactory

public class SymbolDrawable extends Drawable
    implements SymbolElement
{
    public static class Options
    {

        float a;
        float b;

        public Options(float f1)
        {
            a = 1.0F;
            b = 1.0F;
            a = f1;
            b = 1.0F;
        }
    }


    public static final Options a = new Options(1.0F);
    public static final Options b = new Options(1.05F);
    private final Options c;
    private Paint d;
    private char e[];
    private com.skype.android.widget.SymbolElement.SymbolCode f;
    private int g;
    private int h;
    private float i;
    private float j;

    public SymbolDrawable(com.skype.android.widget.SymbolElement.SymbolCode symbolcode, TypeFaceFactory typefacefactory, Options options)
    {
        com.skype.android.widget.SymbolElement.SymbolCode symbolcode1 = symbolcode;
        if (symbolcode == null)
        {
            symbolcode1 = com.skype.android.widget.SymbolElement.SymbolCode.a;
        }
        d = new Paint();
        Paint paint = d;
        if (symbolcode1.a())
        {
            symbolcode = typefacefactory.getIllustrationFont();
        } else
        {
            symbolcode = typefacefactory.getSymbolFont();
        }
        paint.setTypeface(symbolcode);
        d.setAntiAlias(true);
        d.setStyle(android.graphics.Paint.Style.FILL);
        c = options;
        setSymbolCode(symbolcode1);
    }

    public final void a()
    {
        h = (int)d.measureText(e, 0, e.length);
        i = 0.0F;
        android.graphics.Paint.FontMetrics fontmetrics = d.getFontMetrics();
        g = (int)(fontmetrics.descent - fontmetrics.ascent);
        j = g;
        j = j * c.a;
        setBounds(0, 0, h, g);
    }

    public final void a(float f1)
    {
        d.setTextSize(f1);
    }

    public final void a(int k)
    {
        d.setColor(k);
    }

    public final void a(TextView textview)
    {
        float f1 = textview.getTextSize();
        a(c.b * f1);
        a(textview.getCurrentTextColor());
        a();
    }

    public void draw(Canvas canvas)
    {
        int k = canvas.save();
        Rect rect = getBounds();
        canvas.translate(rect.left, rect.top);
        canvas.drawText(e, 0, e.length, i, j, d);
        canvas.restoreToCount(k);
    }

    public int getIntrinsicHeight()
    {
        return g;
    }

    public int getIntrinsicWidth()
    {
        return h;
    }

    public int getOpacity()
    {
        return -3;
    }

    public void setAlpha(int k)
    {
        d.setAlpha(k);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        d.setColorFilter(colorfilter);
    }

    public void setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode symbolcode)
    {
        if (symbolcode == null || symbolcode == com.skype.android.widget.SymbolElement.SymbolCode.a)
        {
            e = new char[0];
            f = com.skype.android.widget.SymbolElement.SymbolCode.a;
        } else
        {
            e = (new char[] {
                (char)symbolcode.b()
            });
            f = symbolcode;
        }
        a();
    }

    public void setSymbolColor(int k)
    {
        a(k);
    }

}
