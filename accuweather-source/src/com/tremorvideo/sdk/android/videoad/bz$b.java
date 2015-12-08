// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Timer;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            bz, ct, gd, cb, 
//            cc, cd, ce

private class nit> extends View
{

    b a;
    Bitmap b;
    boolean c;
    TextPaint d;
    String e;
    boolean f;
    float g;
    Timer h;
    long i;
    final bz j;

    private void a(Canvas canvas)
    {
        Bitmap bitmap;
        Bitmap bitmap1;
        Bitmap bitmap2;
        if (c)
        {
            bitmap = j.a[3];
        } else
        {
            bitmap = j.a[1];
        }
        if (c)
        {
            bitmap1 = j.a[6];
        } else
        {
            bitmap1 = j.a[0];
        }
        if (c)
        {
            bitmap2 = j.a[7];
        } else
        {
            bitmap2 = j.a[2];
        }
        if (a == b)
        {
            a(canvas, bitmap, new Rect(0, 0, bitmap1.getWidth(), bitmap.getHeight()));
            a(canvas, bitmap, bitmap1.getWidth(), 0);
        } else
        {
            if (a == a)
            {
                a(canvas, bitmap1, 0, 0);
                a(canvas, bitmap, bitmap1.getWidth(), 0);
                return;
            }
            if (a == c)
            {
                a(canvas, bitmap, 0, 0);
                a(canvas, bitmap2, bitmap.getWidth(), 0);
                return;
            }
            if (a == d)
            {
                a(canvas, bitmap1, 0, 0);
                a(canvas, bitmap, bitmap1.getWidth(), 0);
                int k = bitmap1.getWidth();
                a(canvas, bitmap2, bitmap.getWidth() + k, 0);
                return;
            }
        }
    }

    private void a(Canvas canvas, Bitmap bitmap, int k, int l)
    {
        if (!f)
        {
            canvas.drawBitmap(bitmap, k, l, null);
            return;
        } else
        {
            Matrix matrix = new Matrix();
            matrix.postTranslate(0.0F, -bitmap.getHeight());
            matrix.postScale(1.0F, -1F);
            matrix.postTranslate(k, l);
            canvas.drawBitmap(bitmap, matrix, null);
            return;
        }
    }

    private void a(Canvas canvas, Bitmap bitmap, Rect rect)
    {
        if (!f)
        {
            canvas.drawBitmap(bitmap, rect, rect, null);
            return;
        }
        canvas.save(2);
        if (canvas.clipRect(rect))
        {
            Matrix matrix = new Matrix();
            matrix.postTranslate(0.0F, -bitmap.getHeight());
            matrix.postScale(1.0F, -1F);
            matrix.postTranslate(rect.left, rect.top);
            canvas.drawBitmap(bitmap, matrix, null);
        }
        canvas.restore();
    }

    private int b()
    {
        int k = 0;
        Bitmap bitmap = j.a[1];
        Bitmap bitmap1 = j.a[0];
        Bitmap bitmap2 = j.a[0];
        if (a == a)
        {
            k = bitmap1.getWidth() + bitmap.getWidth();
        } else
        {
            if (a == c)
            {
                return bitmap2.getWidth() + bitmap.getWidth();
            }
            if (a == b)
            {
                return bitmap1.getWidth() + bitmap.getWidth();
            }
            if (a == d)
            {
                return bitmap1.getWidth() + bitmap2.getWidth() + bitmap.getWidth();
            }
        }
        return k;
    }

    private int c()
    {
        return j.a[1].getHeight();
    }

    public void a()
    {
        i = GregorianCalendar.getInstance().getTimeInMillis();
        g = 3F;
        h = new Timer();
        h.scheduleAtFixedRate(new ce(this), 10L, 10L);
    }

    public void a(boolean flag)
    {
        f = flag;
    }

    public void b(boolean flag)
    {
        if (c != flag)
        {
            c = flag;
            invalidate();
        }
    }

    protected void onDraw(Canvas canvas)
    {
        int l = b();
        int i1 = c();
        a(canvas);
        float f1 = g;
        float f2 = (int)g;
        float f3 = Math.round(-15F * ct.I());
        f1 = (float)(Math.sin((double)(f1 - f2) * 3.1415926535897931D) * (double)f3);
        if (b == null)
        {
            Rect rect = new Rect();
            d.getTextBounds(e, 0, e.length(), rect);
            f2 = (l - rect.width()) / 2;
            f3 = (i1 - rect.height()) / 2;
            canvas.drawText(e, f2, f3 + 10F + f1, d);
            return;
        }
        Rect rect1;
        int k;
        byte byte0;
        int j1;
        if (f)
        {
            k = 0;
        } else
        {
            k = -5;
        }
        if (f)
        {
            byte0 = 5;
        } else
        {
            byte0 = 0;
        }
        rect1 = new Rect();
        d.getTextBounds(e, 0, e.length(), rect1);
        j1 = Math.round(d.getTextSize() + (float)d.baselineShift);
        f2 = (float)(l - b.getWidth()) / 2.0F;
        f3 = (i1 - (byte0 + j1) - b.getHeight()) / 2;
        canvas.drawBitmap(b, f2, f3 + f1, null);
        f1 = (l - rect1.width()) / 2;
        f2 = i1 - j1 - k;
        canvas.drawText(e, f1, f2, d);
    }

    protected void onMeasure(int k, int l)
    {
        Bitmap bitmap = j.a[1];
        setMeasuredDimension(b(), bitmap.getHeight());
    }

    public (bz bz1, Context context, Bitmap bitmap, String s,  )
    {
        j = bz1;
        super(context);
        a = ;
        b = bitmap;
        e = s;
        g = 0.0F;
        c = false;
        f = false;
        d = new TextPaint();
        d.setTextSize(ct.G());
        d.setColor(bz1.j.a(a));
        d.setTypeface(Typeface.create("helvetica", 1));
        d.setShadowLayer(5F, 0.0F, 0.0F, bz1.j.a(b));
        d.setAntiAlias(true);
        e = (String)TextUtils.ellipsize(e, d, bz1.a[1].getWidth() - 5, android.text.tils.TruncateAt.END);
        setOnTouchListener(new cb(this, bz1));
        setOnFocusChangeListener(new cc(this, bz1));
        setOnKeyListener(new cd(this, bz1));
    }
}
