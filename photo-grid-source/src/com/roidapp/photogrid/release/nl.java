// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.roidapp.photogrid.a.m;
import com.roidapp.photogrid.common.a;
import com.roidapp.photogrid.common.az;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.roidapp.photogrid.release:
//            mm, ml, ig, PhotoGridActivity, 
//            rf, nm, rn

public final class nl extends mm
{

    private ig L[];
    private int M;
    private int N;
    private ArrayList O;

    public nl(boolean flag, Activity activity, ig aig[], ml ml1)
    {
        O = new ArrayList();
        F = flag;
        h = activity;
        L = aig;
        l = ml1;
        activity.getWindow().setFormat(-1);
    }

    static ig[] a(nl nl1)
    {
        return nl1.L;
    }

    static int b(nl nl1)
    {
        return nl1.M;
    }

    static int c(nl nl1)
    {
        return nl1.N;
    }

    static ArrayList d(nl nl1)
    {
        return nl1.O;
    }

    static void e(nl nl1)
    {
        nl1.m();
    }

    private void m()
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = O.iterator();
_L2:
        Bitmap bitmap;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_52;
            }
            bitmap = (Bitmap)iterator.next();
        } while (bitmap == null);
        if (bitmap.isRecycled()) goto _L2; else goto _L1
_L1:
        bitmap.recycle();
          goto _L2
        Exception exception;
        exception;
        throw exception;
        O.clear();
        this;
        JVM INSTR monitorexit ;
    }

    public final void a()
    {
        Object obj = new ArrayList();
        l.a(8, 0);
        for (int i = 0; i < L.length; i++)
        {
            lc lc = L[i].y;
            L[i].w = true;
            ((ArrayList) (obj)).add(lc);
            l.a(i * 2 + 10, 0);
        }

        l.a(30, 0);
        obj = h.findViewById(0x7f0d0085);
        if (obj != null)
        {
            com.roidapp.photogrid.common.a.a();
            if (com.roidapp.photogrid.common.a.a(h, "wide_high", true) && com.roidapp.photogrid.a.m.a(h) != 1)
            {
                if (!az.B)
                {
                    ((View) (obj)).setVisibility(0);
                    if (h instanceof PhotoGridActivity)
                    {
                        obj = (PhotoGridActivity)h;
                        if (((PhotoGridActivity) (obj)).F)
                        {
                            obj.F = false;
                            ((PhotoGridActivity) (obj)).C();
                        }
                    }
                } else
                {
                    ((View) (obj)).setVisibility(8);
                }
            } else
            {
                ((View) (obj)).setVisibility(8);
            }
        }
        M = com.roidapp.photogrid.release.rf.a(h);
        N = (int)((float)M * 0.75F);
        (new Thread(new nm(this))).start();
    }

    public final void a(RelativeLayout relativelayout, android.view.View.OnTouchListener ontouchlistener)
    {
        if (relativelayout != null)
        {
            j = (ViewGroup)LayoutInflater.from(h).inflate(0x7f03000f, null);
            ontouchlistener = (LinearLayout)j.findViewById(0x7f0d0063);
            com.roidapp.photogrid.release.rf.a();
            rf.b(ontouchlistener, h, L);
            android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)relativelayout.getLayoutParams();
            layoutparams.setMargins(10, 10, 10, 10);
            relativelayout.setLayoutParams(layoutparams);
            relativelayout.removeAllViews();
            relativelayout.addView(j);
            if (L.length == O.size())
            {
                for (int i = 0; i < L.length; i++)
                {
                    ((rn)ontouchlistener.findViewById(i + 1)).a((Bitmap)O.get(i));
                    l.a(i * 2 + 74, 0);
                }

                ontouchlistener.requestFocus();
                ontouchlistener.invalidate();
            }
        }
    }

    public final int b(boolean flag)
    {
        return 0;
    }

    public final void b()
    {
        if (j != null)
        {
            j.removeAllViews();
        }
        m();
    }

    public final void b(int i, int j)
    {
    }

    public final void b(int i, boolean flag)
    {
    }

    public final void c(int i)
    {
    }

    public final void c(int i, int j)
    {
    }

    public final void f()
    {
    }
}
