// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;

public final class agd extends aev
    implements afa
{

    private aeq A;
    final List a = new ArrayList();
    afn b;
    float c;
    float d;
    float e;
    float f;
    float g;
    float h;
    int i;
    public agj j;
    int k;
    public List l;
    public int m;
    public RecyclerView n;
    final Runnable o = new age(this);
    VelocityTracker p;
    public View q;
    public int r;
    public kp s;
    public final afb t = new agf(this);
    Rect u;
    long v;
    private final float w[] = new float[2];
    private int x;
    private List y;
    private List z;

    public agd(agj agj1)
    {
        b = null;
        i = -1;
        x = 0;
        l = new ArrayList();
        A = null;
        q = null;
        r = -1;
        j = agj1;
    }

    static void a(agd agd1, afn afn1)
    {
        Object obj;
label0:
        {
            if (!agd1.n.isLayoutRequested() && agd1.x == 2)
            {
                agj.h();
                int i2 = (int)(agd1.g + agd1.e);
                int j2 = (int)(agd1.h + agd1.f);
                if ((float)Math.abs(j2 - afn1.a.getTop()) >= (float)afn1.a.getHeight() * 0.5F || (float)Math.abs(i2 - afn1.a.getLeft()) >= (float)afn1.a.getWidth() * 0.5F)
                {
                    int k2;
                    int l2;
                    int i3;
                    int j3;
                    int k3;
                    int l3;
                    int i4;
                    if (agd1.y == null)
                    {
                        agd1.y = new ArrayList();
                        agd1.z = new ArrayList();
                    } else
                    {
                        agd1.y.clear();
                        agd1.z.clear();
                    }
                    agj.f();
                    k2 = Math.round(agd1.g + agd1.e);
                    l2 = Math.round(agd1.h + agd1.f);
                    i3 = k2 + afn1.a.getWidth();
                    j3 = l2 + afn1.a.getHeight();
                    k3 = (k2 + i3) / 2;
                    l3 = (l2 + j3) / 2;
                    obj = agd1.n.e;
                    i4 = ((aex) (obj)).getChildCount();
                    for (int i1 = 0; i1 < i4; i1++)
                    {
                        View view = ((aex) (obj)).getChildAt(i1);
                        if (view == afn1.a || view.getBottom() < l2 || view.getTop() > j3 || view.getRight() < k2 || view.getLeft() > i3)
                        {
                            continue;
                        }
                        afn afn2 = agd1.n.a(view);
                        agj.b();
                        int j1 = Math.abs(k3 - (view.getLeft() + view.getRight()) / 2);
                        int l1 = view.getTop();
                        l1 = Math.abs(l3 - (view.getBottom() + l1) / 2);
                        int j4 = j1 * j1 + l1 * l1;
                        int k4 = agd1.y.size();
                        l1 = 0;
                        for (int k1 = 0; k1 < k4 && j4 > ((Integer)agd1.z.get(k1)).intValue(); k1++)
                        {
                            l1++;
                        }

                        agd1.y.add(l1, afn2);
                        agd1.z.add(l1, Integer.valueOf(j4));
                    }

                    obj = agd1.y;
                    if (((List) (obj)).size() != 0)
                    {
                        obj = agd1.j.a(afn1, ((List) (obj)), i2, j2);
                        if (obj != null)
                        {
                            break label0;
                        }
                        agd1.y.clear();
                        agd1.z.clear();
                    }
                }
            }
            return;
        }
        ((afn) (obj)).e();
        afn1.e();
        agd1.j.c();
    }

    static void a(agd agd1, MotionEvent motionevent, int i1, int j1)
    {
        float f1 = lt.c(motionevent, j1);
        float f2 = lt.d(motionevent, j1);
        agd1.e = f1 - agd1.c;
        agd1.f = f2 - agd1.d;
        if ((i1 & 4) == 0)
        {
            agd1.e = Math.max(0.0F, agd1.e);
        }
        if ((i1 & 8) == 0)
        {
            agd1.e = Math.min(0.0F, agd1.e);
        }
        if ((i1 & 1) == 0)
        {
            agd1.f = Math.max(0.0F, agd1.f);
        }
        if ((i1 & 2) == 0)
        {
            agd1.f = Math.min(0.0F, agd1.f);
        }
    }

    private void a(float af[])
    {
        if ((k & 0xc) != 0)
        {
            af[0] = (g + e) - (float)b.a.getLeft();
        } else
        {
            af[0] = mk.n(b.a);
        }
        if ((k & 3) != 0)
        {
            af[1] = (h + f) - (float)b.a.getTop();
            return;
        } else
        {
            af[1] = mk.o(b.a);
            return;
        }
    }

    static boolean a(agd agd1, int i1, MotionEvent motionevent, int j1)
    {
        Object obj;
        obj = null;
        break MISSING_BLOCK_LABEL_3;
_L4:
        aex aex1;
        do
        {
            return false;
        } while (agd1.b != null || i1 != 2 || agd1.x == 2 || !agd1.j.e() || agd1.n.r == 1);
        aex1 = agd1.n.e;
        if (agd1.i != -1) goto _L2; else goto _L1
_L1:
        afn afn1 = obj;
_L10:
        if (afn1 == null) goto _L4; else goto _L3
_L3:
        i1 = agd1.j.a(agd1.n, afn1) >> 8 & 0xff;
        if (i1 == 0) goto _L4; else goto _L5
_L5:
        float f1;
        float f2;
        float f3;
        float f4;
        f1 = lt.c(motionevent, j1);
        f2 = lt.d(motionevent, j1);
        f1 -= agd1.c;
        f2 -= agd1.d;
        f3 = Math.abs(f1);
        f4 = Math.abs(f2);
        if (f3 < (float)agd1.m && f4 < (float)agd1.m) goto _L4; else goto _L6
_L6:
        if (f3 <= f4)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (f1 < 0.0F && (i1 & 4) == 0 || f1 > 0.0F && (i1 & 8) == 0) goto _L4; else goto _L7
_L7:
        agd1.f = 0.0F;
        agd1.e = 0.0F;
        agd1.i = lt.b(motionevent, 0);
        agd1.a(afn1, 1);
        return true;
_L2:
        i1 = lt.a(motionevent, agd1.i);
        f3 = lt.c(motionevent, i1);
        float f5 = agd1.c;
        f1 = lt.d(motionevent, i1);
        f2 = agd1.d;
        f3 = Math.abs(f3 - f5);
        f1 = Math.abs(f1 - f2);
        if (f3 >= (float)agd1.m) goto _L9; else goto _L8
_L8:
        afn1 = obj;
        if (f1 < (float)agd1.m) goto _L10; else goto _L9
_L9:
        if (f3 <= f1) goto _L12; else goto _L11
_L11:
        afn1 = obj;
        if (aex1.canScrollHorizontally()) goto _L10; else goto _L12
_L12:
        if (f1 <= f3) goto _L14; else goto _L13
_L13:
        afn1 = obj;
        if (aex1.canScrollVertically()) goto _L10; else goto _L14
_L14:
        View view = agd1.a(motionevent);
        afn1 = obj;
        if (view != null)
        {
            afn1 = agd1.n.a(view);
        }
          goto _L10
        if (f2 < 0.0F && (i1 & 1) == 0) goto _L4; else goto _L15
_L15:
        if (f2 <= 0.0F || (i1 & 2) != 0) goto _L7; else goto _L16
_L16:
        return false;
          goto _L10
    }

    private static boolean a(View view, float f1, float f2, float f3, float f4)
    {
        return f1 >= f3 && f1 <= (float)view.getWidth() + f3 && f2 >= f4 && f2 <= (float)view.getHeight() + f4;
    }

    private int b(afn afn1, int i1)
    {
        byte byte1 = 8;
        if ((i1 & 0xc) == 0) goto _L2; else goto _L1
_L1:
        byte byte0;
        if (e > 0.0F)
        {
            byte0 = 8;
        } else
        {
            byte0 = 4;
        }
        if (p == null || i < 0) goto _L4; else goto _L3
_L3:
        float f1 = mg.a(p, i);
        if (f1 <= 0.0F)
        {
            byte1 = 4;
        }
        if ((byte1 & i1) == 0 || byte0 != byte1 || Math.abs(f1) < (float)n.s) goto _L4; else goto _L5
_L5:
        byte0 = byte1;
_L6:
        return byte0;
_L4:
        float f2;
        float f3;
        f2 = n.getWidth();
        f3 = agj.g();
        if ((i1 & byte0) != 0 && Math.abs(e) > f2 * f3) goto _L6; else goto _L2
_L2:
        return 0;
    }

    private int c(afn afn1, int i1)
    {
        byte byte1 = 2;
        if ((i1 & 3) == 0) goto _L2; else goto _L1
_L1:
        byte byte0;
        if (f > 0.0F)
        {
            byte0 = 2;
        } else
        {
            byte0 = 1;
        }
        if (p == null || i < 0) goto _L4; else goto _L3
_L3:
        float f1 = mg.b(p, i);
        if (f1 <= 0.0F)
        {
            byte1 = 1;
        }
        if ((byte1 & i1) == 0 || byte1 != byte0 || Math.abs(f1) < (float)n.s) goto _L4; else goto _L5
_L5:
        byte0 = byte1;
_L6:
        return byte0;
_L4:
        float f2;
        float f3;
        f2 = n.getHeight();
        f3 = agj.g();
        if ((i1 & byte0) != 0 && Math.abs(f) > f2 * f3) goto _L6; else goto _L2
_L2:
        return 0;
    }

    int a(afn afn1, boolean flag)
    {
        for (int i1 = l.size() - 1; i1 >= 0; i1--)
        {
            agn agn1 = (agn)l.get(i1);
            if (agn1.e == afn1)
            {
                agn1.l = agn1.l | flag;
                if (!agn1.m)
                {
                    agn1.g.c();
                }
                l.remove(i1);
                agn1.e.a(true);
                return agn1.h;
            }
        }

        return 0;
    }

    View a(MotionEvent motionevent)
    {
        float f1 = motionevent.getX();
        float f2 = motionevent.getY();
        if (b != null)
        {
            motionevent = b.a;
            if (a(((View) (motionevent)), f1, f2, g + e, h + f))
            {
                return motionevent;
            }
        }
        for (int i1 = l.size() - 1; i1 >= 0; i1--)
        {
            motionevent = (agn)l.get(i1);
            View view = ((agn) (motionevent)).e.a;
            if (a(view, f1, f2, ((agn) (motionevent)).j, ((agn) (motionevent)).k))
            {
                return view;
            }
        }

        return n.a(f1, f2);
    }

    public void a()
    {
        if (p != null)
        {
            p.recycle();
            p = null;
        }
    }

    void a(afn afn1, int i1)
    {
        int j1;
        int k1;
        int l1;
        if (afn1 == b && i1 == x)
        {
            return;
        }
        v = 0x8000000000000000L;
        l1 = x;
        a(afn1, true);
        x = i1;
        if (i1 == 2)
        {
            q = afn1.a;
            if (android.os.Build.VERSION.SDK_INT < 21)
            {
                if (A == null)
                {
                    A = new agi(this);
                }
                n.a(A);
            }
        }
        j1 = 0;
        k1 = 0;
        if (b == null) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = b;
        if (((afn) (obj)).a.getParent() == null)
        {
            break MISSING_BLOCK_LABEL_732;
        }
        if (l1 == 2 || x == 2) goto _L4; else goto _L3
_L3:
        int i2;
        j1 = j.a();
        i2 = agj.b(j1, mk.h(n)) >> 8 & 0xff;
        if (i2 == 0) goto _L4; else goto _L5
_L5:
        int j2 = j1 >> 8 & 0xff;
        if (Math.abs(e) <= Math.abs(f)) goto _L7; else goto _L6
_L6:
        k1 = b(((afn) (obj)), i2);
        if (k1 <= 0) goto _L9; else goto _L8
_L8:
        j1 = k1;
        if ((j2 & k1) == 0)
        {
            j1 = agj.a(k1, mk.h(n));
        }
_L13:
        a();
        j1;
        JVM INSTR lookupswitch 6: default 308
    //                   1: 692
    //                   2: 692
    //                   4: 669
    //                   8: 669
    //                   16: 669
    //                   32: 669;
           goto _L10 _L11 _L11 _L12 _L12 _L12 _L12
_L10:
        float f1;
        float f2;
        f1 = 0.0F;
        f2 = 0.0F;
_L16:
        long l2;
        if (l1 == 2)
        {
            k1 = 8;
        } else
        if (j1 > 0)
        {
            k1 = 2;
        } else
        {
            k1 = 4;
        }
        a(w);
        obj = new agg(this, ((afn) (obj)), k1, l1, w[0], w[1], f1, f2, j1, ((afn) (obj)));
        l2 = agj.a(n, k1);
        ((agn) (obj)).g.a(l2);
        l.add(obj);
        ((agn) (obj)).e.a(false);
        ((agn) (obj)).g.b_();
        j1 = 1;
_L17:
        b = null;
_L2:
        if (afn1 != null)
        {
            k = (j.a(n, afn1) & (1 << i1 * 8 + 8) - 1) >> (x << 3);
            g = afn1.a.getLeft();
            h = afn1.a.getTop();
            b = afn1;
            if (i1 == 2)
            {
                b.a.performHapticFeedback(0);
            }
        }
        afn1 = n.getParent();
        if (afn1 != null)
        {
            boolean flag;
            if (b != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            afn1.requestDisallowInterceptTouchEvent(flag);
        }
        if (j1 == 0)
        {
            n.e.requestSimpleAnimationsInNextLayout();
        }
        j.a(b, x);
        n.invalidate();
        return;
_L9:
        k1 = c(((afn) (obj)), i2);
        j1 = k1;
        if (k1 > 0) goto _L13; else goto _L4
_L4:
        j1 = 0;
          goto _L13
_L7:
        k1 = c(((afn) (obj)), i2);
        j1 = k1;
        if (k1 > 0) goto _L13; else goto _L14
_L14:
        k1 = b(((afn) (obj)), i2);
        if (k1 <= 0) goto _L4; else goto _L15
_L15:
        j1 = k1;
        if ((j2 & k1) == 0)
        {
            j1 = agj.a(k1, mk.h(n));
        }
          goto _L13
_L12:
        f2 = 0.0F;
        f1 = Math.signum(e) * (float)n.getWidth();
          goto _L16
_L11:
        f1 = 0.0F;
        f2 = Math.signum(f) * (float)n.getHeight();
          goto _L16
        b(((afn) (obj)).a);
        j.b(n, ((afn) (obj)));
        j1 = k1;
          goto _L17
    }

    public final void a(Canvas canvas, RecyclerView recyclerview)
    {
        float f2 = 0.0F;
        r = -1;
        float f1;
        if (b != null)
        {
            a(w);
            f1 = w[0];
            f2 = w[1];
        } else
        {
            f1 = 0.0F;
        }
        agj.b(j, canvas, recyclerview, b, l, x, f1, f2);
    }

    public final void a(Rect rect, View view, RecyclerView recyclerview)
    {
        rect.setEmpty();
    }

    public final void a(View view)
    {
        b(view);
        view = n.a(view);
        if (view != null)
        {
            if (b != null && view == b)
            {
                a(((afn) (null)), 0);
                return;
            }
            a(((afn) (view)), false);
            if (a.remove(((afn) (view)).a))
            {
                j.b(n, view);
                return;
            }
        }
    }

    public final void b(Canvas canvas, RecyclerView recyclerview)
    {
        float f2 = 0.0F;
        float f1;
        if (b != null)
        {
            a(w);
            f1 = w[0];
            f2 = w[1];
        } else
        {
            f1 = 0.0F;
        }
        agj.a(j, canvas, recyclerview, b, l, x, f1, f2);
    }

    void b(View view)
    {
        if (view == q)
        {
            q = null;
            if (A != null)
            {
                n.a(null);
            }
        }
    }
}
