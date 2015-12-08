// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ct, gd, cz, da, 
//            db

public class cy extends View
{

    boolean a;
    TextPaint b;
    String c;
    gd d;
    Drawable e;
    Drawable f;
    int g;
    int h;
    float i;

    public cy(Context context, String s, int j, gd gd1, Drawable drawable, Drawable drawable1)
    {
        super(context);
        c = s;
        a = false;
        d = gd1;
        e = drawable;
        f = drawable1;
        h = drawable.getIntrinsicHeight();
        i = ct.G();
        a(d.a(gd.a.a), d.a(gd.a.b));
        g = Math.max(80, Math.round(b.measureText(c)) + 4);
        a();
    }

    public cy(Context context, String s, gd gd1, gd.b b1, gd.b b2)
    {
        super(context);
        c = s;
        a = false;
        d = gd1;
        context = d.a(b1);
        e = new BitmapDrawable(context);
        f = new BitmapDrawable(d.a(b2));
        g = context.getWidth();
        h = context.getHeight();
        i = ct.D();
        a(gd1.a(gd.a.j), Color.argb(0, 0, 0, 0));
        a();
    }

    private void a()
    {
        setBackgroundDrawable(e);
        setOnTouchListener(new cz(this));
        setOnFocusChangeListener(new da(this));
        setOnKeyListener(new db(this));
    }

    private void a(int j, int k)
    {
        b = new TextPaint();
        b.setTextSize(i);
        b.setColor(j);
        b.setTypeface(Typeface.create("helvetica", 1));
        b.setAntiAlias(true);
        if (Color.alpha(k) > 0)
        {
            b.setShadowLayer(5F, 0.0F, 0.0F, d.a(gd.a.b));
        }
    }

    static void a(cy cy1)
    {
        cy1.b();
    }

    private void b()
    {
        if (a)
        {
            setBackgroundDrawable(f);
            return;
        } else
        {
            setBackgroundDrawable(e);
            return;
        }
    }

    public void a(String s)
    {
        c = s;
        invalidate();
    }

    public void a(boolean flag)
    {
        if (a != flag)
        {
            a = flag;
            b();
            invalidate();
        }
    }

    protected void onDraw(Canvas canvas)
    {
        Rect rect = new Rect();
        b.getTextBounds(c, 0, c.length(), rect);
        int j = Math.round((g - rect.width()) / 2);
        int k = Math.round((h - rect.height()) / 2);
        canvas.drawText(c, j, rect.height() + k, b);
    }

    protected void onMeasure(int j, int k)
    {
        setMeasuredDimension(g, h);
    }
}
