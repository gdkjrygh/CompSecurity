// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.graphics.Point;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.b.c;
import com.google.android.gms.b.d;
import com.google.android.gms.internal.gm;
import com.google.android.gms.internal.he;
import com.google.android.gms.internal.hi;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            h, g, b

public final class j extends com.google.android.gms.internal.bm.a
    implements android.view.View.OnClickListener, android.view.View.OnTouchListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
{

    boolean a;
    private final Object b = new Object();
    private final FrameLayout c;
    private final FrameLayout d;
    private final Map e = new HashMap();
    private b f;
    private h g;

    public j(FrameLayout framelayout, FrameLayout framelayout1)
    {
        a = false;
        c = framelayout;
        d = framelayout1;
        he.a(c, this);
        he.a(c, this);
        c.setOnTouchListener(this);
    }

    static FrameLayout a(j j1)
    {
        return j1.d;
    }

    public final c a(String s)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        s = (WeakReference)e.get(s);
        if (s != null) goto _L2; else goto _L1
_L1:
        s = null;
_L4:
        s = com.google.android.gms.b.d.a(s);
        obj;
        JVM INSTR monitorexit ;
        return s;
_L2:
        s = (View)s.get();
        if (true) goto _L4; else goto _L3
_L3:
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void a(c c1)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        a = true;
        c1 = (h)com.google.android.gms.b.d.a(c1);
        if (!(g instanceof g) || !((g)g).b())
        {
            break MISSING_BLOCK_LABEL_115;
        }
        ((g)g).a(c1);
_L2:
        d.removeAllViews();
        f = c1.a(this);
        if (f != null)
        {
            d.addView(f);
        }
        gm.a.post(new Runnable(c1) {

            final h a;
            final j b;

            public final void run()
            {
                hi hi1 = a.c();
                if (hi1 != null)
                {
                    j.a(b).addView(hi1.a());
                }
            }

            
            {
                b = j.this;
                a = h1;
                super();
            }
        });
        c1.a(c);
        return;
        g = c1;
        if (g instanceof g)
        {
            ((g)g).a(null);
        }
        if (true) goto _L2; else goto _L1
_L1:
        c1;
        obj;
        JVM INSTR monitorexit ;
        throw c1;
    }

    public final void a(String s, c c1)
    {
        View view = (View)com.google.android.gms.b.d.a(c1);
        c1 = ((c) (b));
        c1;
        JVM INSTR monitorenter ;
        if (view != null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        e.remove(s);
_L2:
        c1;
        JVM INSTR monitorexit ;
        return;
        e.put(s, new WeakReference(view));
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        if (true) goto _L2; else goto _L1
_L1:
        s;
        c1;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void onClick(View view)
    {
label0:
        {
            synchronized (b)
            {
                if (g != null)
                {
                    break label0;
                }
            }
            return;
        }
        if (f == null || !f.a().equals(view))
        {
            break MISSING_BLOCK_LABEL_55;
        }
        g.a("1007");
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        view;
        obj;
        JVM INSTR monitorexit ;
        throw view;
        g.a(view, e);
          goto _L1
    }

    public final void onGlobalLayout()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        int i;
        int k;
        if (!a)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        i = c.getMeasuredWidth();
        k = c.getMeasuredHeight();
        if (i == 0 || k == 0)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        d.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i, k));
        a = false;
        if (g != null)
        {
            g.b(c);
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onScrollChanged()
    {
        synchronized (b)
        {
            if (g != null)
            {
                g.b(c);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
label0:
        {
            synchronized (b)
            {
                if (g != null)
                {
                    break label0;
                }
            }
            return false;
        }
        float f1;
        int ai[];
        ai = new int[2];
        c.getLocationOnScreen(ai);
        f1 = motionevent.getRawX();
        float f2 = ai[0];
        float f3 = motionevent.getRawY();
        float f4 = ai[1];
        Point point = new Point((int)(f1 - f2), (int)(f3 - f4));
        motionevent = MotionEvent.obtain(motionevent);
        motionevent.setLocation(point.x, point.y);
        g.a(motionevent);
        motionevent.recycle();
        view;
        JVM INSTR monitorexit ;
        return false;
        motionevent;
        view;
        JVM INSTR monitorexit ;
        throw motionevent;
    }
}
