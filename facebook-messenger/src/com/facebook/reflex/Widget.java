// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.reflex:
//            Countable, s, t, r, 
//            al, ak, x, w, 
//            d, y, am, q

public class Widget extends Countable
{

    private static int p;
    private static int q;
    private float b;
    private float c;
    private float d;
    private float e;
    private int f;
    private int g;
    private d h;
    private boolean i;
    private ak j;
    private x k;
    private w l;
    private q m;
    private am n;
    private r o;

    public Widget()
    {
        i = false;
    }

    public static void b(int i1, int j1)
    {
        if (p != i1 || q != j1)
        {
            p = i1;
            q = j1;
            nativeSetTouchOffset(i1, j1);
        }
    }

    private void c()
    {
        nativeSetPosition(b + d, c + e);
    }

    private void fireGestureEvent(int i1, int j1, long l1, long l2, float f1, 
            float f2, float f3, float f4)
    {
        i1;
        JVM INSTR tableswitch 0 2: default 28
    //                   0 29
    //                   1 178
    //                   2 186;
           goto _L1 _L2 _L3 _L4
_L15:
        return;
_L2:
        s s1 = s.Tap;
_L16:
        j1;
        JVM INSTR tableswitch 0 3: default 64
    //                   0 65
    //                   1 194
    //                   2 202
    //                   3 210;
           goto _L5 _L6 _L7 _L8 _L9
_L5:
        return;
_L6:
        t t1 = t.Started;
_L17:
        if (o == null)
        {
            o = new r();
        }
        o.a(s1, t1, l1, l2, f1, f2, f3 - (float)p, f4 - (float)q);
        al.a[s1.ordinal()];
        JVM INSTR tableswitch 1 3: default 156
    //                   1 157
    //                   2 218
    //                   3 239;
           goto _L10 _L11 _L12 _L13
_L13:
        continue; /* Loop/switch isn't completed */
_L10:
        return;
_L11:
        if (j != null)
        {
            j.b(o);
            return;
        }
_L1:
        if (true) goto _L15; else goto _L14
_L14:
_L3:
        s1 = s.Pan;
          goto _L16
_L4:
        s1 = s.Longpress;
          goto _L16
_L7:
        t1 = t.Changed;
          goto _L17
_L8:
        t1 = t.Ended;
          goto _L17
_L9:
        t1 = t.Cancelled;
          goto _L17
_L12:
        if (k == null) goto _L15; else goto _L18
_L18:
        k.a(o);
        return;
        if (l == null) goto _L15; else goto _L19
_L19:
        l.a(o);
        return;
    }

    static int m()
    {
        return p;
    }

    static int n()
    {
        return q;
    }

    private native void nativeSetPosition(float f1, float f2);

    private static native void nativeSetTouchOffset(int i1, int j1);

    private native void registerForGenericGesture(boolean flag);

    private native void registerForLongpress(boolean flag, int i1);

    private native void registerForPans(boolean flag, int i1);

    private native void registerForTaps(boolean flag);

    private native void resize(int i1, int j1);

    public static native void updateRootWidgetBounds(int i1, int j1, int k1, int l1);

    public void a()
    {
        if (!i())
        {
            i = true;
            if (h != null)
            {
                h.d();
            }
        }
    }

    public void a(int i1, int j1)
    {
        if (i1 != f || j1 != g)
        {
            f = i1;
            g = j1;
            resize(i1, j1);
        }
    }

    public void a(ak ak1)
    {
        j = ak1;
        boolean flag;
        if (ak1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        registerForTaps(flag);
    }

    public void a(d d1)
    {
        if (h != d1)
        {
            d d2 = h;
            if (i() && d1 != null)
            {
                d1.d();
            }
            h = d1;
            nativeSetBackground(d1);
            if (i() && d2 != null)
            {
                d2.g();
                return;
            }
        }
    }

    public void a(q q1)
    {
        b(q1);
        boolean flag;
        if (q1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        registerForGenericGesture(flag);
    }

    public void a(w w1)
    {
        a(w1, ViewConfiguration.getLongPressTimeout());
    }

    public void a(w w1, int i1)
    {
        l = w1;
        boolean flag;
        if (w1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        registerForLongpress(flag, i1);
    }

    public void a(x x1)
    {
        a(x1, y.PanUnconstrained);
    }

    public void a(x x1, y y1)
    {
        k = x1;
        boolean flag;
        if (x1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        registerForPans(flag, y1.ordinal());
    }

    void addPointer(int i1, float f1, float f2)
    {
        if (n == null)
        {
            return;
        } else
        {
            n.a(i1, f1, f2);
            return;
        }
    }

    public void b()
    {
        if (i)
        {
            i = false;
            if (h != null)
            {
                h.g();
            }
        }
    }

    public void b(float f1)
    {
        if (d != f1)
        {
            d = f1;
            c();
        }
    }

    public void b(float f1, float f2)
    {
        if (b != f1 || c != f2)
        {
            b = f1;
            c = f2;
            c();
        }
    }

    public void b(int i1)
    {
    }

    void b(q q1)
    {
        if (q1 != null)
        {
            n = new am(this);
        } else
        {
            n = null;
        }
        m = q1;
    }

    void beginMotionEvent(long l1, long l2, int i1, int j1, int k1, 
            float f1, float f2, int i2, float f3, float f4)
    {
        if (n == null)
        {
            return;
        } else
        {
            n.a(l1, l2, i1, j1, k1, f1, f2);
            n.a(i2, f3, f4);
            return;
        }
    }

    public void c(float f1)
    {
        if (e != f1)
        {
            e = f1;
            c();
        }
    }

    void dispatchMotionEvent()
    {
        if (n == null)
        {
            return;
        }
        MotionEvent motionevent;
        boolean flag;
        if (m != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        motionevent = n.a();
        m.a(motionevent);
        motionevent.recycle();
    }

    public float e()
    {
        return c;
    }

    public int f()
    {
        return f;
    }

    public int g()
    {
        return g;
    }

    public boolean i()
    {
        return i;
    }

    public float j()
    {
        return d;
    }

    public float k()
    {
        return e;
    }

    public ak l()
    {
        return j;
    }

    public native void nativeSetBackground(d d1);
}
