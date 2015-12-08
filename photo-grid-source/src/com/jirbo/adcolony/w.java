// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;

// Referenced classes of package com.jirbo.adcolony:
//            h, ADCVideo, e, ADCImage, 
//            ae, a, AdColonyBrowser, AdColonyV4VCAd

class w extends h
{

    static boolean H;
    static w I;
    boolean J;
    boolean K;
    ADCVideo L;

    public w(ADCVideo adcvideo, AdColonyV4VCAd adcolonyv4vcad)
    {
        L = adcvideo;
        G = adcolonyv4vcad;
        adcvideo.E.pause();
        I = this;
        if (a());
    }

    void c()
    {
        int i = L.t;
        int j = L.u;
        x = (i - a.f) / 2;
        y = (j - a.g) / 2;
        z = x + a.f / 2;
        A = y + a.g / 2;
        D = y + (int)((double)a.g - ((double)c.g + p * 16D));
        B = x + (int)(p * 16D);
        C = x + (int)((double)a.f - ((double)c.f + p * 16D));
    }

    public void onDraw(Canvas canvas)
    {
        int i = 128;
        if (L.E == null)
        {
            return;
        }
        H = true;
        c();
        int j = ((int)(System.currentTimeMillis() - w) * 255) / 1000;
        if (j <= 128)
        {
            i = j;
        }
        canvas.drawARGB(i, 0, 0, 0);
        a.a(canvas, x, y);
        i = (b() * 3) / 2;
        a("Completion is required to receive", z, (int)((double)A - (double)i * 2.75D), canvas);
        a("your reward.", z, A - i * 2, canvas);
        a("Are you sure you want to skip?", z, (int)((double)A - (double)i * 1.25D), canvas);
        b.a(canvas, z - b.f / 2, A - b.g / 2);
        if (!J)
        {
            c.a(canvas, B, D);
        } else
        {
            d.a(canvas, B, D);
        }
        if (!K)
        {
            e.a(canvas, C, D);
        } else
        {
            f.a(canvas, C, D);
        }
        c("Yes", B, D, canvas);
        c("No", C, D, canvas);
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        while (L.E == null || i != 4) 
        {
            return false;
        }
        return super.onKeyDown(i, keyevent);
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            I = null;
            L.E.start();
            return true;
        } else
        {
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag1 = true;
        boolean flag;
        if (ADCVideo.d)
        {
            I = null;
            flag = L.F.onTouchEvent(motionevent);
        } else
        {
            int i = (int)motionevent.getX();
            int j = (int)motionevent.getY();
            if (motionevent.getAction() == 1)
            {
                if (a(i, j, B, D) && J)
                {
                    I = null;
                    H = false;
                    a.u = false;
                    a.aa = true;
                    a.M.b(G);
                    AdColonyBrowser.A = true;
                    L.finish();
                } else
                if (a(i, j, C, D) && K)
                {
                    I = null;
                    H = false;
                    L.E.start();
                }
                J = false;
                K = false;
                invalidate();
            }
            flag = flag1;
            if (motionevent.getAction() == 0)
            {
                if (a(i, j, B, D))
                {
                    J = true;
                    invalidate();
                    return true;
                }
                flag = flag1;
                if (a(i, j, C, D))
                {
                    K = true;
                    invalidate();
                    return true;
                }
            }
        }
        return flag;
    }
}
