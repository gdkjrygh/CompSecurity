// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import android.view.MotionEvent;
import com.google.android.m4b.maps.ao.b;
import com.google.android.m4b.maps.ay.w;
import com.google.android.m4b.maps.bl.h;
import com.google.android.m4b.maps.bl.j;
import com.google.android.m4b.maps.bl.l;
import com.google.android.m4b.maps.bl.p;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            p

public final class aq extends android.view.GestureDetector.SimpleOnGestureListener
    implements com.google.android.m4b.maps.bl.i.a
{
    static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final a e[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/m4b/maps/bx/aq$a, s);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        static 
        {
            a = new a("NONE", 0);
            b = new a("IN_PROGRESS", 1);
            c = new a("ZOOM", 2);
            d = new a("ROTATE", 3);
            e = (new a[] {
                a, b, c, d
            });
        }

        private a(String s, int i1)
        {
            super(s, i1);
        }
    }

    public static interface b
    {

        public abstract void a(float f1, float f2);

        public abstract boolean a(MotionEvent motionevent);

        public abstract void b(float f1, float f2);

        public abstract boolean c(float f1, float f2);

        public abstract void d(float f1, float f2);

        public abstract boolean e(float f1, float f2);

        public abstract void f(float f1, float f2);

        public abstract int getHeight();

        public abstract int getWidth();

        public abstract void q();

        public abstract com.google.android.m4b.maps.bx.p r();
    }

    public static final class c
    {

        public boolean a;
        boolean b;
        boolean c;
        boolean d;
        boolean e;
        boolean f;
        boolean g;

        c()
        {
            a = true;
            b = true;
            c = false;
            d = true;
            e = true;
            f = true;
            g = true;
        }
    }


    private static final float d;
    private static final float e;
    private static final double f = Math.log(2D);
    public c a;
    private final float b = (float)w.b();
    private final float c = (float)w.b();
    private final b g;
    private MotionEvent h;
    private float i;
    private float j;
    private a k;

    public aq(b b1)
    {
        k = a.a;
        g = b1;
        a = new c();
    }

    public final void a(boolean flag)
    {
        a.a = flag;
    }

    public final boolean a(j j1)
    {
        if (a.e)
        {
            j1.a(g.getWidth(), g.getHeight());
            float f1 = j1.c();
            float f2 = j1.a();
            float f3 = j1.b();
            g.r().b(f2, f3, f1 * 57.29578F);
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean a(l l1)
    {
        boolean flag3;
label0:
        {
            flag3 = false;
            if (a.b)
            {
                boolean flag;
                if (l1.a == 3)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    break label0;
                }
                g.r().a(-1F, 330);
                g.getWidth();
                g.getHeight();
            }
            return true;
        }
        float f1 = (float)(Math.log(l1.c()) / f);
        float f2 = l1.a();
        float f3 = l1.b();
        boolean flag1;
        boolean flag2;
        if (l1.a == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = flag3;
        if (flag1)
        {
            flag2 = flag3;
            if (l1.c() > d)
            {
                flag2 = flag3;
                if (l1.c() < e)
                {
                    flag2 = true;
                }
            }
        }
        if (flag2)
        {
            f1 = 0.0F;
        }
        g.r().a(f1, f2, f3);
        return true;
    }

    public final boolean a(p p1)
    {
        if (a.d)
        {
            g.r().a(p1.a());
            return true;
        } else
        {
            return false;
        }
    }

    public final void b(boolean flag)
    {
        a.b = flag;
    }

    public final void c(boolean flag)
    {
        a.d = flag;
    }

    public final void d(boolean flag)
    {
        a.e = flag;
    }

    public final boolean onDoubleTap(MotionEvent motionevent)
    {
        g.q();
        if (g.e(motionevent.getX(), motionevent.getY()))
        {
            return true;
        } else
        {
            k = com.google.android.m4b.maps.bx.a.b;
            h = motionevent;
            i = motionevent.getX();
            j = motionevent.getY();
            return false;
        }
    }

    public final boolean onDoubleTapEvent(MotionEvent motionevent)
    {
        g.q();
        if (h == null || motionevent.getAction() != 1) goto _L2; else goto _L1
_L1:
        if (!a.b || k != com.google.android.m4b.maps.bx.a.b) goto _L4; else goto _L3
_L3:
        float f1 = motionevent.getX();
        float f4 = motionevent.getY();
        g.r().a(1.0F, f1, f4, 330);
        h = null;
        k = a.a;
_L7:
        return true;
_L4:
        h = null;
        k = a.a;
_L2:
        float f2;
        if (h != null && motionevent.getAction() == 2)
        {
            f2 = motionevent.getY() - j;
            float f5 = motionevent.getX();
            float f7 = i;
            if (k != com.google.android.m4b.maps.bx.a.b || Math.abs(f2) >= c || Math.abs(f5 - f7) >= c)
            {
                break; /* Loop/switch isn't completed */
            }
            Math.round(Math.abs(h.getX() - motionevent.getX()));
            if ((float)Math.round(Math.abs(h.getY() - motionevent.getY())) <= b || !a.b)
            {
                continue; /* Loop/switch isn't completed */
            }
            k = a.c;
            break; /* Loop/switch isn't completed */
        }
          goto _L5
        if (true) goto _L7; else goto _L6
_L6:
        if (k != a.c || !a.b) goto _L9; else goto _L8
_L8:
        f2 /= g.getHeight();
        g.r().a(f2 * 6F, 0);
        h.getX();
        h.getY();
_L10:
        i = motionevent.getX();
        j = motionevent.getY();
        return true;
_L9:
        if (k == a.d && a.e)
        {
            float f3 = (float)g.getWidth() * 0.5F;
            float f6 = (float)g.getHeight() * 0.5F;
            float f8 = com.google.android.m4b.maps.bl.h.a(f3, f6, i, j);
            float f9 = com.google.android.m4b.maps.bl.h.a(f3, f6, motionevent.getX(), motionevent.getY());
            g.r().b(f3, f6, (float)((double)((f9 - f8) * 180F) / 3.1415926535897931D));
        }
        if (true) goto _L10; else goto _L5
_L5:
        return false;
    }

    public final boolean onDown(MotionEvent motionevent)
    {
        if (k == a.a)
        {
            g.b(motionevent.getX(), motionevent.getY());
        }
        return true;
    }

    public final boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        if (a.a && !onSingleTapUp(motionevent1))
        {
            g.r().b(f1, f2);
            g.q();
        }
        return true;
    }

    public final void onLongPress(MotionEvent motionevent)
    {
        if (h == null && a.f)
        {
            g.f(motionevent.getX(), motionevent.getY());
        }
    }

    public final boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        while (g.a(motionevent1) || !a.a) 
        {
            return true;
        }
        g.r().a(f1, f2);
        g.a(f1, f2);
        g.q();
        return true;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionevent)
    {
        if (a.g)
        {
            g.q();
            g.d(motionevent.getX(), motionevent.getY());
        }
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionevent)
    {
        return g.c(motionevent.getX(), motionevent.getY());
    }

    static 
    {
        float f1;
        if (com.google.android.m4b.maps.ao.b.d)
        {
            f1 = 0.997F;
        } else
        {
            f1 = 0.999F;
        }
        d = f1;
        e = 1.0F / d;
    }
}
