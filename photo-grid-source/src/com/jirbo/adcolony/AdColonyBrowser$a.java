// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

// Referenced classes of package com.jirbo.adcolony:
//            AdColonyBrowser, ADCImage

class b extends View
{

    Rect a;
    Paint b;
    final AdColonyBrowser c;

    public void a()
    {
        android.widget.outParams outparams = new android.widget.outParams(c.r.getWidth(), c.r.getHeight());
        outparams.topMargin = (c.l.getHeight() - c.d.g) / 2;
        outparams.leftMargin = c.l.getWidth() / 10 + c.d.c() + c.d.f;
        if (AdColonyBrowser.z && c.d.c() != 0)
        {
            c.m.removeView(c.r);
            c.m.addView(c.r, outparams);
            AdColonyBrowser.z = false;
        }
        if (c.r.getLayoutParams() == null)
        {
            return;
        } else
        {
            c.r.getLayoutParams().height = c.d.g;
            c.r.getLayoutParams().width = c.d.f;
            return;
        }
    }

    public boolean a(ADCImage adcimage, int i, int j)
    {
        return i < adcimage.c() + adcimage.f + 16 && i > adcimage.c() - 16 && j < adcimage.d() + adcimage.g + 16 && j > adcimage.d() - 16;
    }

    public void b()
    {
        c.n = false;
        c.o = false;
        c.p = false;
        c.q = false;
        invalidate();
    }

    public void onDraw(Canvas canvas)
    {
        getDrawingRect(a);
        int i = (c.l.getHeight() - c.c.g) / 2;
        if (!AdColonyBrowser.v)
        {
            c.c.a(canvas, c.c.f, i);
        } else
        {
            c.j.a(canvas, c.c.f, i);
        }
        if (!AdColonyBrowser.w)
        {
            c.f.a(canvas, c.c.c() + c.l.getWidth() / 10 + c.c.f, i);
        } else
        {
            c.k.a(canvas, c.c.c() + c.l.getWidth() / 10 + c.c.f, i);
        }
        if (AdColonyBrowser.x)
        {
            c.d.a(canvas, c.f.c() + c.f.f + c.l.getWidth() / 10, i);
        } else
        {
            c.e.a(canvas, c.f.c() + c.f.f + c.l.getWidth() / 10, i);
        }
        c.g.a(canvas, c.l.getWidth() - c.g.f * 2, i);
        if (c.n)
        {
            c.h.c((c.c.c() - c.h.f / 2) + c.c.f / 2, (c.c.d() - c.h.g / 2) + c.c.g / 2);
            c.h.a(canvas);
        }
        if (c.o)
        {
            c.h.c((c.f.c() - c.h.f / 2) + c.f.f / 2, (c.f.d() - c.h.g / 2) + c.f.g / 2);
            c.h.a(canvas);
        }
        if (c.p)
        {
            c.h.c((c.e.c() - c.h.f / 2) + c.e.f / 2, (c.e.d() - c.h.g / 2) + c.e.g / 2);
            c.h.a(canvas);
        }
        if (c.q)
        {
            c.h.c((c.g.c() - c.h.f / 2) + c.g.f / 2, (c.g.d() - c.h.g / 2) + c.g.g / 2);
            c.h.a(canvas);
        }
        a();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i = motionevent.getAction();
        int j = (int)motionevent.getX();
        int k = (int)motionevent.getY();
        if (i == 0)
        {
            if (a(c.c, j, k) && AdColonyBrowser.v)
            {
                c.n = true;
                invalidate();
                return true;
            }
            if (a(c.f, j, k) && AdColonyBrowser.w)
            {
                c.o = true;
                invalidate();
                return true;
            }
            if (a(c.e, j, k))
            {
                c.p = true;
                invalidate();
                return true;
            }
            if (a(c.g, j, k))
            {
                c.q = true;
                invalidate();
                return true;
            }
        }
        if (i == 1)
        {
            if (a(c.c, j, k) && AdColonyBrowser.v)
            {
                c.b.goBack();
                b();
                return true;
            }
            if (a(c.f, j, k) && AdColonyBrowser.w)
            {
                c.b.goForward();
                b();
                return true;
            }
            if (a(c.e, j, k) && AdColonyBrowser.x)
            {
                c.b.stopLoading();
                b();
                return true;
            }
            if (a(c.e, j, k) && !AdColonyBrowser.x)
            {
                c.b.reload();
                b();
                return true;
            }
            if (a(c.g, j, k))
            {
                AdColonyBrowser.C = true;
                c.b.loadData("", "text/html", "utf-8");
                AdColonyBrowser.w = false;
                AdColonyBrowser.v = false;
                AdColonyBrowser.x = false;
                b();
                c.finish();
                return true;
            }
            b();
        }
        return false;
    }

    public arams(AdColonyBrowser adcolonybrowser, Activity activity)
    {
        c = adcolonybrowser;
        super(activity);
        a = new Rect();
        b = new Paint();
    }
}
