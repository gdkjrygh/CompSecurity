// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.CountDownTimer;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CountdownDial extends RelativeLayout
{

    private long a;
    private long b;
    private long c;
    private CountDownTimer d;
    private Paint e;
    private Paint f;
    private float g;
    private float h;
    private TextView i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private RectF o;

    public CountdownDial(Context context)
    {
        super(context);
        d();
    }

    public CountdownDial(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d();
    }

    public CountdownDial(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        d();
    }

    static CountDownTimer a(CountdownDial countdowndial, CountDownTimer countdowntimer)
    {
        countdowndial.d = countdowntimer;
        return countdowntimer;
    }

    static void a(CountdownDial countdowndial)
    {
        countdowndial.b();
    }

    private void b()
    {
        n = ((float)(b - System.currentTimeMillis()) / (float)c) * 360F;
    }

    static void b(CountdownDial countdowndial)
    {
        countdowndial.c();
    }

    private void c()
    {
        long l1 = b;
        long l2 = System.currentTimeMillis();
        i.setText(DateUtils.formatElapsedTime(Math.round((double)(l1 - l2) / 1000D)));
    }

    private void d()
    {
        setWillNotDraw(false);
        LayoutInflater.from(getContext()).inflate(0x7f040044, this);
        Object obj = AnimationUtils.loadAnimation(getContext(), 0x7f050015);
        findViewById(0x7f100123).startAnimation(((android.view.animation.Animation) (obj)));
        i = (TextView)findViewById(0x7f100124);
        obj = getContext().getResources();
        int i1 = ((Resources) (obj)).getColor(0x7f0b00a7);
        g = ((Resources) (obj)).getDimensionPixelSize(0x7f0900a3);
        e = new Paint();
        e.setAntiAlias(true);
        e.setStyle(android.graphics.Paint.Style.STROKE);
        e.setStrokeWidth(g);
        e.setColor(i1);
        i1 = ((Resources) (obj)).getColor(0x7f0b00a6);
        h = ((Resources) (obj)).getDimensionPixelSize(0x7f0900a2);
        f = new Paint();
        f.setAntiAlias(true);
        f.setStyle(android.graphics.Paint.Style.STROKE);
        f.setColor(i1);
        f.setStrokeWidth(h);
        n = 360F;
    }

    private void e()
    {
        j = Math.min(getWidth() / 2, getHeight() / 2);
        k = j - g / 2.0F;
        l = (float)(getRight() - getLeft()) / 2.0F;
        m = (float)(getBottom() - getTop()) / 2.0F;
        float f1 = g + h / 2.0F;
        o = new RectF(0.0F + f1, 0.0F + f1, j * 2.0F - f1, j * 2.0F - f1);
    }

    public void a()
    {
        d = (new CountDownTimer(c, 1000L) {

            final CountdownDial a;

            public void onFinish()
            {
                CountdownDial.a(a, null);
            }

            public void onTick(long l1)
            {
                CountdownDial.a(a);
                CountdownDial.b(a);
                a.invalidate();
            }

            
            {
                a = CountdownDial.this;
                super(l1, l2);
            }
        }).start();
    }

    public void a(long l1, long l2)
    {
        a = l1;
        b = l2;
        c = b - a;
        b();
        c();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (d != null)
        {
            d.cancel();
        }
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        canvas.drawArc(o, 270F, n, false, f);
        canvas.drawCircle(l, m, k, e);
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        e();
    }
}
