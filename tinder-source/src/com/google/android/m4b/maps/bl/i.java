// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.android.m4b.maps.ay.w;
import com.google.android.m4b.maps.y.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.bl:
//            q, k, m, s, 
//            g, o, e, a, 
//            h, j, l, p

public final class i
{
    public static interface a
        extends android.view.GestureDetector.OnDoubleTapListener, android.view.GestureDetector.OnGestureListener
    {

        public abstract boolean a(com.google.android.m4b.maps.bl.j j1);

        public abstract boolean a(l l1);

        public abstract boolean a(p p1);
    }

    public static interface b
        extends android.view.GestureDetector.OnDoubleTapListener, android.view.GestureDetector.OnGestureListener
    {

        public abstract boolean a(i i1);

        public abstract boolean a(i i1, boolean flag);

        public abstract boolean b(i i1);

        public abstract boolean b(i i1, boolean flag);

        public abstract void c(i i1);

        public abstract void c(i i1, boolean flag);

        public abstract boolean d(i i1);

        public abstract boolean e(i i1);

        public abstract void f(i i1);

        public abstract boolean g(i i1);

        public abstract boolean h(i i1);

        public abstract void i(i i1);
    }


    boolean A;
    boolean B;
    g C;
    private final List D = new ArrayList();
    private final e E;
    private final e F;
    private final LinkedList G = new LinkedList();
    private long H;
    private float I;
    private float J;
    private boolean K;
    Context a;
    MotionEvent b;
    MotionEvent c;
    final List d = new ArrayList();
    final e e;
    final e f;
    float g;
    float h;
    float i;
    float j;
    float k;
    float l;
    float m;
    float n;
    float o;
    float p;
    float q;
    float r;
    float s;
    float t;
    float u;
    long v;
    float w;
    float x;
    float y;
    boolean z;

    public i(Context context, b b1)
    {
        Object obj = ViewConfiguration.get(context);
        a = context;
        w = ((ViewConfiguration) (obj)).getScaledEdgeSlop();
        obj = D;
        Object obj1 = new q(b1);
        f = ((e) (obj1));
        ((List) (obj)).add(obj1);
        if (w.b)
        {
            obj = D;
            obj1 = new k(b1);
            E = ((e) (obj1));
            ((List) (obj)).add(obj1);
        } else
        {
            List list = D;
            o o1 = new o(b1);
            E = o1;
            list.add(o1);
        }
        obj = D;
        obj1 = new m(b1);
        e = ((e) (obj1));
        ((List) (obj)).add(obj1);
        obj = D;
        obj1 = new s(b1);
        F = ((e) (obj1));
        ((List) (obj)).add(obj1);
        C = new g(context, b1, new Handler(Looper.getMainLooper()));
        C.w = true;
        C.k = b1;
    }

    static float a(MotionEvent motionevent, int i1)
    {
        return (motionevent.getRawX() - motionevent.getX()) + motionevent.getX(i1);
    }

    static boolean a(e e1)
    {
        return e1 != null && e1.b;
    }

    static float b(MotionEvent motionevent, int i1)
    {
        return (motionevent.getRawY() - motionevent.getY()) + motionevent.getY(i1);
    }

    final void a()
    {
        e e1;
        for (Iterator iterator = d.iterator(); iterator.hasNext(); e1.c(this))
        {
            e1 = (e)iterator.next();
            com.google.android.m4b.maps.y.j.b(e1.b);
        }

    }

    final void a(MotionEvent motionevent)
    {
        int i1;
        boolean flag1;
        flag1 = true;
        i1 = motionevent.getAction();
        if (G.isEmpty())
        {
            H = motionevent.getEventTime();
        }
        G.addLast(new com.google.android.m4b.maps.bl.a(motionevent));
        if (G.size() > 20)
        {
            ((h)G.removeFirst()).e();
        }
        do
        {
label0:
            {
                long l1 = ((h)G.getFirst()).a();
                boolean flag;
                if (((h)G.getLast()).a() - l1 >= 250L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag || G.size() <= 3)
                {
                    break label0;
                }
                ((h)G.removeFirst()).e();
            }
        } while (true);
        i1;
        JVM INSTR lookupswitch 4: default 188
    //                   1: 191
    //                   3: 302
    //                   6: 191
    //                   262: 191;
           goto _L1 _L2 _L3 _L2 _L2
_L1:
        flag1 = false;
_L2:
        if (!B) goto _L5; else goto _L4
_L4:
        motionevent = D.iterator();
_L8:
        if (!motionevent.hasNext()) goto _L5; else goto _L6
_L6:
        e e1 = (e)motionevent.next();
        if (e1.b) goto _L8; else goto _L7
_L7:
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.google.android.m4b.maps.bl.e.a.values().length];
                try
                {
                    a[e.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[e.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[e.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[e1.a(H, G, flag1, d).ordinal()];
        JVM INSTR tableswitch 1 3: default 284
    //                   1 208
    //                   2 287
    //                   3 310;
           goto _L8 _L8 _L5 _L9
_L5:
        if (flag1)
        {
            a();
            B = false;
        }
        return;
_L3:
        B = false;
          goto _L1
_L9:
        if (e1.a(this))
        {
            d.add(e1);
        }
          goto _L8
    }

    final void b()
    {
        b = null;
        c = null;
        z = false;
        B = false;
        d.clear();
        for (Iterator iterator = G.iterator(); iterator.hasNext(); ((h)iterator.next()).e()) { }
        G.clear();
        Iterator iterator1 = D.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            e e1 = (e)iterator1.next();
            if (e1.b)
            {
                e1.c(this);
            }
        } while (true);
    }

    final void b(MotionEvent motionevent)
    {
        c = MotionEvent.obtain(motionevent);
        n = -1F;
        o = -1F;
        r = -1F;
        s = 0.0F;
        A = false;
        K = false;
        MotionEvent motionevent1 = b;
        float f1 = motionevent1.getX(0);
        float f2 = motionevent1.getY(0);
        float f6 = motionevent1.getX(motionevent1.getPointerCount() - 1);
        float f8 = motionevent1.getY(motionevent1.getPointerCount() - 1);
        float f3 = motionevent.getX(0);
        float f4 = motionevent.getY(0);
        float f7 = motionevent.getX(motionevent.getPointerCount() - 1);
        float f5 = motionevent.getY(motionevent.getPointerCount() - 1);
        f6 -= f1;
        f8 -= f2;
        f7 -= f3;
        f5 -= f4;
        j = f6;
        k = f8;
        l = f7;
        m = f5;
        p = f2;
        q = f4;
        g = f3 + f7 * 0.5F;
        h = f5 * 0.5F + f4;
        i = f1 + f6 * 0.5F;
        I = f8 * 0.5F + f2;
        v = motionevent.getEventTime() - motionevent1.getEventTime();
        t = motionevent.getPressure(0) + motionevent.getPressure(motionevent.getPointerCount() - 1);
        f1 = motionevent1.getPressure(0);
        u = motionevent1.getPressure(motionevent1.getPointerCount() - 1) + f1;
    }

    public final float c()
    {
        while (!a(E) || c.getPointerCount() != b.getPointerCount()) 
        {
            return 0.0F;
        }
        if (!K)
        {
            float f1 = com.google.android.m4b.maps.bl.h.a(c.getX(0), c.getY(0), c.getX(c.getPointerCount() - 1), c.getY(c.getPointerCount() - 1));
            J = com.google.android.m4b.maps.bl.e.a(com.google.android.m4b.maps.bl.h.a(b.getX(0), b.getY(0), b.getX(b.getPointerCount() - 1), b.getY(b.getPointerCount() - 1)), f1);
            K = true;
        }
        return J;
    }
}
