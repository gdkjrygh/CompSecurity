// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package com.jirbo.adcolony:
//            h, AdColony, ADCImage, AdColonyV4VCAd, 
//            a

class ac extends h
{

    boolean H;
    boolean I;

    public ac(String s, AdColonyV4VCAd adcolonyv4vcad)
    {
        F = s;
        G = adcolonyv4vcad;
        if (a())
        {
            AdColony.activity().addContentView(this, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
            if (n)
            {
                D = D + 20;
                return;
            }
        }
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
        if (G.getViewsPerReward() == 1)
        {
            a(F, "");
            if (!s)
            {
                a("Watch a video to earn", z, (int)((double)A - (double)j * this.i), canvas);
                a(q, z, (int)((double)A - (double)j * this.j), canvas);
                a((new StringBuilder()).append(r).append(".").toString(), z, (int)((double)A - (double)j * this.k), canvas);
            } else
            {
                a("Watch a video to earn", z, (int)((double)A - (double)j * l), canvas);
                a((new StringBuilder()).append(q).append(".").toString(), z, (int)((double)A - (double)j * m), canvas);
            }
        } else
        {
            String s;
            if (k == 1)
            {
                s = "video";
            } else
            {
                s = "videos";
            }
            a(F, (new StringBuilder()).append(k).append(" more ").append(s).append(" to earn )?").toString());
            if (!s)
            {
                a("Watch a sponsored video now (Only", z, (int)((double)A - (double)j * this.i), canvas);
                a((new StringBuilder()).append(k).append(" more ").append(s).append(" to earn ").append(q).toString(), z, (int)((double)A - (double)j * this.j), canvas);
                a((new StringBuilder()).append(r).append(")?").toString(), z, (int)((double)A - (double)j * this.k), canvas);
            } else
            {
                a("Watch a sponsored video now (Only", z, (int)((double)A - (double)j * l), canvas);
                a((new StringBuilder()).append(k).append(" more ").append(s).append(" to earn ").append(q).append(")?").toString(), z, (int)((double)A - (double)j * m), canvas);
            }
        }
        b.a(canvas, z - b.f / 2, A - b.g / 2);
        if (!I)
        {
            c.a(canvas, B, D);
        } else
        {
            d.a(canvas, B, D);
        }
        if (!H)
        {
            e.a(canvas, C, D);
        } else
        {
            f.a(canvas, C, D);
        }
        c("Yes", B, D, canvas);
        c("No", C, D, canvas);
        if (i != 128)
        {
            invalidate();
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int j;
        int k;
        j = (int)motionevent.getX();
        k = (int)motionevent.getY();
        if (motionevent.getAction() != 1) goto _L2; else goto _L1
_L1:
        if (!a(j, k, B, D) || !I) goto _L4; else goto _L3
_L3:
        a.I = null;
        ((ViewGroup)getParent()).removeView(this);
        G.c(true);
_L11:
        H = false;
        I = false;
        invalidate();
_L2:
        if (motionevent.getAction() != 0) goto _L6; else goto _L5
_L5:
        if (!a(j, k, B, D)) goto _L8; else goto _L7
_L7:
        I = true;
        invalidate();
_L6:
        return true;
_L4:
        if (a(j, k, C, D) && H)
        {
            a.I = null;
            ((ViewGroup)getParent()).removeView(this);
            G.c(false);
            a.v = true;
            for (int i = 0; i < a.ad.size(); i++)
            {
                ((Bitmap)a.ad.get(i)).recycle();
            }

            a.ad.clear();
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (!a(j, k, C, D)) goto _L6; else goto _L9
_L9:
        H = true;
        invalidate();
        return true;
        if (true) goto _L11; else goto _L10
_L10:
    }
}
