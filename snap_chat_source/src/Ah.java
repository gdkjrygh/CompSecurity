// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import java.util.Locale;

public final class Ah
    implements Ae
{

    private String a;
    private Typeface b;
    private Rf c;

    public Ah(String s, Typeface typeface, Rf rf)
    {
        a = s;
        b = typeface;
        c = rf;
    }

    public final void a(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            return;
        }
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint(1);
        Re re = c.c();
        Object obj = c.d();
        android.graphics.Paint.Align align;
        int i;
        int j;
        int k;
        int l;
        if (((Rd) (obj)).f())
        {
            align = android.graphics.Paint.Align.LEFT;
        } else
        {
            align = (android.graphics.Paint.Align)dq.a(android/graphics/Paint$Align, ((Rd) (obj)).e().toUpperCase(Locale.ENGLISH)).a(android.graphics.Paint.Align.LEFT);
        }
        paint.setColor(Color.parseColor(((Rd) (obj)).b()));
        paint.setTextAlign(align);
        paint.setTextSize(((Rd) (obj)).a().intValue());
        paint.setTypeface(b);
        obj = new Rect();
        paint.getTextBounds(a, 0, a.length(), ((Rect) (obj)));
        i = (int)(IJ.a(re.a()) * (float)bitmap.getWidth());
        j = (int)(IJ.a(re.b()) * (float)bitmap.getHeight());
        l = (int)(IJ.a(re.c()) * (float)bitmap.getWidth());
        k = (int)(IJ.a(re.d()) * (float)bitmap.getHeight());
        i += l / 2;
        j += k / 2;
        canvas.save();
        canvas.rotate(re.e().floatValue(), i, j);
        if (align != android.graphics.Paint.Align.CENTER)
        {
            if (align == android.graphics.Paint.Align.LEFT)
            {
                i -= ((Rect) (obj)).width() / 2;
            } else
            {
                i = ((Rect) (obj)).width() / 2 + i;
            }
        }
        canvas.drawText(a, i, ((Rect) (obj)).height() / 2 + j, paint);
        canvas.restore();
    }
}
