// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.Display;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.ArrayList;

// Referenced classes of package com.jirbo.adcolony:
//            h, AdColony, a, ADCImage, 
//            AdColonyV4VCAd

class ad extends h
{

    boolean H;

    public ad(String s, AdColonyV4VCAd adcolonyv4vcad)
    {
        F = s;
        G = adcolonyv4vcad;
        if (!a())
        {
            return;
        } else
        {
            AdColony.activity().addContentView(this, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
            return;
        }
    }

    void c()
    {
        Display display = a.b().getWindowManager().getDefaultDisplay();
        int i = display.getWidth();
        int j = display.getHeight();
        double d;
        double d1;
        double d2;
        if (n)
        {
            d = 12D;
        } else
        {
            d = 16D;
        }
        x = (i - a.f) / 2;
        y = (j - a.g) / 2 - 80;
        z = x + a.f / 2;
        A = y + a.g / 2;
        i = y;
        d1 = a.g;
        d2 = h.g;
        D = (int)(d1 - (d * p + d2)) + i;
        B = z - h.f / 2;
    }

    public void onDraw(Canvas canvas)
    {
        c();
        int j = ((int)(System.currentTimeMillis() - w) * 255) / 1000;
        int i = j;
        if (j > 128)
        {
            i = 128;
        }
        canvas.drawARGB(i, 0, 0, 0);
        a.a(canvas, x, y);
        j = (b() * 3) / 2;
        int k = G.getRemainingViewsUntilReward();
        if (k == G.getViewsPerReward() || k == 0)
        {
            a(F, "video. You earned");
            if (s)
            {
                a("Thanks for watching the sponsored", z, (int)((double)A - (double)j * 2.5D), canvas);
                a((new StringBuilder("video. You earned ")).append(q).append(".").toString(), z, (int)((double)A - (double)j * 1.5D), canvas);
            } else
            {
                a("Thanks for watching the sponsored", z, (int)((double)A - (double)j * 2.7999999999999998D), canvas);
                a((new StringBuilder("video. You earned ")).append(q).toString(), z, (int)((double)A - (double)j * 2.0499999999999998D), canvas);
                a((new StringBuilder()).append(r).append(".").toString(), z, (int)((double)A - (double)j * 1.3D), canvas);
            }
        } else
        {
            a(F, "to earn ");
            String s;
            if (k == 1)
            {
                s = "video";
            } else
            {
                s = "videos";
            }
            if (s)
            {
                a((new StringBuilder("Thank you. Watch ")).append(k).append(" more ").append(s).toString(), z, (int)((double)A - (double)j * 2.5D), canvas);
                a((new StringBuilder("to earn ")).append(q).append(".").toString(), z, (int)((double)A - (double)j * 1.5D), canvas);
            } else
            {
                a((new StringBuilder("Thank you. Watch ")).append(k).append(" more ").append(s).toString(), z, (int)((double)A - (double)j * 2.7999999999999998D), canvas);
                a((new StringBuilder("to earn ")).append(q).toString(), z, (int)((double)A - (double)j * 2.0499999999999998D), canvas);
                a((new StringBuilder()).append(r).append(".").toString(), z, (int)((double)A - (double)j * 1.3D), canvas);
            }
        }
        b.a(canvas, z - b.f / 2, A - b.g / 2);
        if (!H)
        {
            h.a(canvas, B, D);
        } else
        {
            g.a(canvas, B, D);
        }
        c("Ok", B, D, canvas);
        if (i != 128)
        {
            invalidate();
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int j = (int)motionevent.getX();
        int k = (int)motionevent.getY();
        if (motionevent.getAction() == 1)
        {
            if (a(j, k, B, D) && H)
            {
                a.I = null;
                ((ViewGroup)getParent()).removeView(this);
                for (int i = 0; i < a.ad.size(); i++)
                {
                    ((Bitmap)a.ad.get(i)).recycle();
                }

                a.ad.clear();
                a.v = true;
            }
            H = false;
            invalidate();
        }
        if (motionevent.getAction() == 0 && a(j, k, B, D))
        {
            H = true;
            invalidate();
        }
        return true;
    }
}
