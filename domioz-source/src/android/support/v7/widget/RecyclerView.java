// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.c.e;
import android.support.v4.e.a;
import android.support.v4.view.ay;
import android.support.v4.view.bk;
import android.support.v4.view.bl;
import android.support.v4.view.bp;
import android.support.v4.widget.m;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            az, bo, bm, ax, 
//            q, bu, bs, bh, 
//            ay, bf, k, bb, 
//            n, ba, bw, bv, 
//            m, bj, bi, bc, 
//            p, o, bl, bk, 
//            bg, bn

public class RecyclerView extends ViewGroup
    implements bk
{

    private static final Interpolator ad = new az();
    private static final boolean h;
    private final boolean A;
    private final AccessibilityManager B;
    private boolean C;
    private int D;
    private m E;
    private m F;
    private m G;
    private m H;
    private int I;
    private int J;
    private VelocityTracker K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private final int Q;
    private final int R;
    private float S;
    private final bu T;
    private List U;
    private bg V;
    private boolean W;
    final bm a;
    private bw aa;
    private final int ab[];
    private Runnable ac;
    k b;
    n c;
    bf d;
    final bs e;
    boolean f;
    boolean g;
    private final bo i;
    private SavedState j;
    private boolean k;
    private final Runnable l;
    private final Rect m;
    private bc n;
    private bj o;
    private bn p;
    private final ArrayList q;
    private final ArrayList r;
    private android.support.v7.widget.bk s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private int y;
    private boolean z;

    public RecyclerView(Context context)
    {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public RecyclerView(Context context, AttributeSet attributeset, int i1)
    {
        boolean flag1 = false;
        super(context, attributeset, i1);
        i = new bo(this, (byte)0);
        a = new bm(this);
        l = new ax(this);
        m = new Rect();
        q = new ArrayList();
        r = new ArrayList();
        C = false;
        D = 0;
        d = new q();
        I = 0;
        J = -1;
        S = 1.401298E-45F;
        T = new bu(this);
        e = new bs();
        f = false;
        g = false;
        V = new bh(this, (byte)0);
        W = false;
        ab = new int[2];
        ac = new android.support.v7.widget.ay(this);
        setFocusableInTouchMode(true);
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        A = flag;
        context = ViewConfiguration.get(context);
        P = context.getScaledTouchSlop();
        Q = context.getScaledMinimumFlingVelocity();
        R = context.getScaledMaximumFlingVelocity();
        flag = flag1;
        if (bp.a(this) == 2)
        {
            flag = true;
        }
        setWillNotDraw(flag);
        d.a(V);
        b = new k(new bb(this));
        c = new n(new ba(this));
        if (bp.e(this) == 0)
        {
            bp.c(this, 1);
        }
        B = (AccessibilityManager)getContext().getSystemService("accessibility");
        aa = new bw(this);
        bp.a(this, aa);
    }

    static int a(RecyclerView recyclerview, bv bv1)
    {
        if (!bv1.hasAnyOfTheFlags(524) && bv1.isBound()) goto _L2; else goto _L1
_L1:
        int i1 = -1;
_L4:
        return i1;
_L2:
        int j1;
        int l1;
        int i2;
        recyclerview = recyclerview.b;
        j1 = bv1.mPosition;
        i2 = ((k) (recyclerview)).a.size();
        l1 = 0;
_L10:
        i1 = j1;
        if (l1 >= i2) goto _L4; else goto _L3
_L3:
        bv1 = (android.support.v7.widget.m)((k) (recyclerview)).a.get(l1);
        i1 = j1;
        ((android.support.v7.widget.m) (bv1)).a;
        JVM INSTR tableswitch 0 3: default 100
    //                   0 113
    //                   1 133
    //                   2 102
    //                   3 168;
           goto _L5 _L6 _L7 _L8 _L9
_L9:
        break MISSING_BLOCK_LABEL_168;
_L8:
        break; /* Loop/switch isn't completed */
_L5:
        i1 = j1;
_L11:
        l1++;
        j1 = i1;
          goto _L10
_L6:
        i1 = j1;
        if (((android.support.v7.widget.m) (bv1)).b <= j1)
        {
            i1 = j1 + ((android.support.v7.widget.m) (bv1)).c;
        }
          goto _L11
_L7:
        i1 = j1;
        if (((android.support.v7.widget.m) (bv1)).b <= j1)
        {
            if (((android.support.v7.widget.m) (bv1)).b + ((android.support.v7.widget.m) (bv1)).c > j1)
            {
                return -1;
            }
            i1 = j1 - ((android.support.v7.widget.m) (bv1)).c;
        }
          goto _L11
        if (((android.support.v7.widget.m) (bv1)).b == j1)
        {
            i1 = ((android.support.v7.widget.m) (bv1)).c;
        } else
        {
            int k1 = j1;
            if (((android.support.v7.widget.m) (bv1)).b < j1)
            {
                k1 = j1 - 1;
            }
            i1 = k1;
            if (((android.support.v7.widget.m) (bv1)).c <= k1)
            {
                i1 = k1 + 1;
            }
        }
          goto _L11
    }

    private void a(int i1)
    {
        if (i1 != I) goto _L2; else goto _L1
_L1:
        return;
_L2:
        I = i1;
        if (i1 != 2)
        {
            k();
        }
        if (o != null)
        {
            o.e(i1);
        }
        if (U != null)
        {
            i1 = U.size() - 1;
            while (i1 >= 0) 
            {
                U.get(i1);
                i1--;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void a(a a1)
    {
        List list = e.d;
        int i1 = list.size() - 1;
        while (i1 >= 0) 
        {
            View view = (View)list.get(i1);
            bv bv1 = b(view);
            bi bi1 = (bi)e.a.remove(bv1);
            if (!e.a())
            {
                e.b.remove(bv1);
            }
            if (a1.remove(view) != null)
            {
                o.a(view, a);
            } else
            if (bi1 != null)
            {
                a(bi1);
            } else
            {
                a(new bi(bv1, view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            }
            i1--;
        }
        list.clear();
    }

    static void a(RecyclerView recyclerview, int i1)
    {
        recyclerview.detachViewFromParent(i1);
    }

    static void a(RecyclerView recyclerview, int i1, int j1)
    {
        recyclerview.c(i1, j1);
    }

    static void a(RecyclerView recyclerview, View view)
    {
        if (recyclerview.n != null)
        {
            recyclerview.n.onViewAttachedToWindow(b(view));
        }
    }

    static void a(RecyclerView recyclerview, View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        recyclerview.attachViewToParent(view, i1, layoutparams);
    }

    private void a(bi bi1)
    {
        View view = bi1.a.itemView;
        a(bi1.a);
        int i1 = bi1.b;
        int j1 = bi1.c;
        int k1 = view.getLeft();
        int l1 = view.getTop();
        if (i1 != k1 || j1 != l1)
        {
            bi1.a.setIsRecyclable(false);
            view.layout(k1, l1, view.getWidth() + k1, view.getHeight() + l1);
            if (d.a(bi1.a, i1, j1, k1, l1))
            {
                w();
            }
            return;
        } else
        {
            bi1.a.setIsRecyclable(false);
            d.a(bi1.a);
            w();
            return;
        }
    }

    private void a(bv bv1)
    {
        View view = bv1.itemView;
        boolean flag;
        if (view.getParent() == this)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a.b(a(view));
        if (bv1.isTmpDetached())
        {
            c.a(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!flag)
        {
            c.a(view);
            return;
        }
        bv1 = c;
        int i1 = ((n) (bv1)).a.a(view);
        if (i1 < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("view is not a child, cannot hide ")).append(view).toString());
        } else
        {
            ((n) (bv1)).b.a(i1);
            ((n) (bv1)).c.add(view);
            return;
        }
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = ay.b(motionevent);
        if (ay.b(motionevent, i1) == J)
        {
            int j1;
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            J = ay.b(motionevent, i1);
            j1 = (int)(ay.c(motionevent, i1) + 0.5F);
            N = j1;
            L = j1;
            i1 = (int)(ay.d(motionevent, i1) + 0.5F);
            O = i1;
            M = i1;
        }
    }

    private boolean a(int i1, int j1, boolean flag, int k1, int l1)
    {
        int i3 = 0;
        boolean flag4 = false;
        int l2 = 0;
        boolean flag2 = false;
        int j2 = 0;
        int i2 = 0;
        int k2 = 0;
        boolean flag3 = false;
        j();
        if (n != null)
        {
            c();
            s();
            android.support.v4.c.e.a("RV Scroll");
            j2 = ((flag4) ? 1 : 0);
            if (i1 != 0)
            {
                i2 = o.a(i1, a, e);
                j2 = i1 - i2;
            }
            k2 = ((flag3) ? 1 : 0);
            l2 = ((flag2) ? 1 : 0);
            if (j1 != 0)
            {
                k2 = o.b(j1, a, e);
                l2 = j1 - k2;
            }
            android.support.v4.c.e.a();
            if (v())
            {
                int j3 = c.a();
                i3 = 0;
                while (i3 < j3) 
                {
                    View view = c.b(i3);
                    Object obj = a(view);
                    if (obj == null || ((bv) (obj)).mShadowingHolder == null)
                    {
                        continue;
                    }
                    obj = ((bv) (obj)).mShadowingHolder;
                    int k3;
                    int l3;
                    if (obj != null)
                    {
                        obj = ((bv) (obj)).itemView;
                    } else
                    {
                        obj = null;
                    }
                    if (obj == null)
                    {
                        continue;
                    }
                    k3 = view.getLeft();
                    l3 = view.getTop();
                    if (k3 != ((View) (obj)).getLeft() || l3 != ((View) (obj)).getTop())
                    {
                        ((View) (obj)).layout(k3, l3, ((View) (obj)).getWidth() + k3, ((View) (obj)).getHeight() + l3);
                    }
                    i3++;
                }
            }
            t();
            a(false);
            i3 = j2;
            j2 = i2;
        }
        if (!q.isEmpty())
        {
            invalidate();
        }
        if (bp.a(this) != 2)
        {
            if (flag)
            {
                boolean flag1 = false;
                if (i3 < 0)
                {
                    m();
                    if (E.a((float)(-i3) / (float)getWidth(), 1.0F - (float)l1 / (float)getHeight()))
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                } else
                if (i3 > 0)
                {
                    n();
                    if (G.a((float)i3 / (float)getWidth(), (float)l1 / (float)getHeight()))
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                }
                if (l2 < 0)
                {
                    o();
                    if (F.a((float)(-l2) / (float)getHeight(), (float)k1 / (float)getWidth()) || flag1)
                    {
                        l1 = 1;
                    } else
                    {
                        l1 = 0;
                    }
                } else
                {
                    l1 = ((flag1) ? 1 : 0);
                    if (l2 > 0)
                    {
                        p();
                        if (H.a((float)l2 / (float)getHeight(), 1.0F - (float)k1 / (float)getWidth()) || flag1)
                        {
                            l1 = 1;
                        } else
                        {
                            l1 = 0;
                        }
                    }
                }
                if (l1 != 0 || i3 != 0 || l2 != 0)
                {
                    bp.d(this);
                }
            }
            c(i1, j1);
        }
        if (j2 != 0 || k2 != 0)
        {
            f();
        }
        if (!awakenScrollBars())
        {
            invalidate();
        }
        return j2 != 0 || k2 != 0;
    }

    static boolean a(RecyclerView recyclerview)
    {
        return recyclerview.v;
    }

    private long b(bv bv1)
    {
        if (n.hasStableIds())
        {
            return bv1.getItemId();
        } else
        {
            return (long)bv1.mPosition;
        }
    }

    static bv b(View view)
    {
        if (view == null)
        {
            return null;
        } else
        {
            return ((LayoutParams)view.getLayoutParams()).a;
        }
    }

    static void b(RecyclerView recyclerview, int i1)
    {
        recyclerview.a(i1);
    }

    static void b(RecyclerView recyclerview, View view)
    {
        recyclerview.e(view);
    }

    static boolean b(RecyclerView recyclerview)
    {
        return recyclerview.C;
    }

    public static int c(View view)
    {
        view = b(view);
        if (view != null)
        {
            return view.getLayoutPosition();
        } else
        {
            return -1;
        }
    }

    private void c(int i1, int j1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (E != null)
        {
            flag = flag1;
            if (!E.a())
            {
                flag = flag1;
                if (i1 > 0)
                {
                    flag = E.c();
                }
            }
        }
        flag1 = flag;
        if (G != null)
        {
            flag1 = flag;
            if (!G.a())
            {
                flag1 = flag;
                if (i1 < 0)
                {
                    flag1 = flag | G.c();
                }
            }
        }
        flag = flag1;
        if (F != null)
        {
            flag = flag1;
            if (!F.a())
            {
                flag = flag1;
                if (j1 > 0)
                {
                    flag = flag1 | F.c();
                }
            }
        }
        flag1 = flag;
        if (H != null)
        {
            flag1 = flag;
            if (!H.a())
            {
                flag1 = flag;
                if (j1 < 0)
                {
                    flag1 = flag | H.c();
                }
            }
        }
        if (flag1)
        {
            bp.d(this);
        }
    }

    static boolean c(RecyclerView recyclerview)
    {
        return recyclerview.x;
    }

    static boolean c(RecyclerView recyclerview, View view)
    {
        boolean flag = true;
        recyclerview.c();
        n n1 = recyclerview.c;
        int i1 = n1.a.a(view);
        if (i1 == -1)
        {
            n1.c.remove(view);
        } else
        if (n1.b.b(i1))
        {
            n1.b.c(i1);
            n1.c.remove(view);
            n1.a.a(i1);
        } else
        {
            flag = false;
        }
        if (flag)
        {
            view = b(view);
            recyclerview.a.b(view);
            recyclerview.a.a(view);
        }
        recyclerview.a(false);
        return flag;
    }

    private void d(int i1, int j1)
    {
        int l1 = android.view.View.MeasureSpec.getMode(i1);
        int k1 = android.view.View.MeasureSpec.getMode(j1);
        i1 = android.view.View.MeasureSpec.getSize(i1);
        j1 = android.view.View.MeasureSpec.getSize(j1);
        switch (l1)
        {
        default:
            i1 = bp.m(this);
            // fall through

        case -2147483648: 
        case 1073741824: 
            switch (k1)
            {
            default:
                j1 = bp.n(this);
                // fall through

            case -2147483648: 
            case 1073741824: 
                setMeasuredDimension(i1, j1);
                break;
            }
            break;
        }
    }

    static boolean d(RecyclerView recyclerview)
    {
        recyclerview.W = false;
        return false;
    }

    static bj e(RecyclerView recyclerview)
    {
        return recyclerview.o;
    }

    private void e(View view)
    {
        if (n != null)
        {
            n.onViewDetachedFromWindow(b(view));
        }
    }

    private boolean e(int i1, int j1)
    {
        int l1;
        boolean flag1;
        flag1 = false;
        l1 = c.a();
        if (l1 != 0) goto _L2; else goto _L1
_L1:
        boolean flag;
label0:
        {
            if (i1 == 0)
            {
                flag = flag1;
                if (j1 == 0)
                {
                    break label0;
                }
            }
            flag = true;
        }
_L4:
        return flag;
_L2:
        int k1 = 0;
        do
        {
            flag = flag1;
            if (k1 >= l1)
            {
                continue;
            }
            bv bv1 = b(c.b(k1));
            if (!bv1.shouldIgnore())
            {
                int i2 = bv1.getLayoutPosition();
                if (i2 < i1 || i2 > j1)
                {
                    return true;
                }
            }
            k1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void f(RecyclerView recyclerview)
    {
        recyclerview.j();
    }

    static bc g(RecyclerView recyclerview)
    {
        return recyclerview.n;
    }

    static Interpolator h()
    {
        return ad;
    }

    static void h(RecyclerView recyclerview)
    {
        recyclerview.s();
    }

    static boolean i()
    {
        return h;
    }

    static boolean i(RecyclerView recyclerview)
    {
        return recyclerview.v();
    }

    private void j()
    {
        l.run();
    }

    static void j(RecyclerView recyclerview)
    {
        recyclerview.t();
    }

    static ArrayList k(RecyclerView recyclerview)
    {
        return recyclerview.q;
    }

    private void k()
    {
        T.a();
        if (o != null)
        {
            o.r();
        }
    }

    private void l()
    {
        boolean flag1 = false;
        if (E != null)
        {
            flag1 = E.c();
        }
        boolean flag = flag1;
        if (F != null)
        {
            flag = flag1 | F.c();
        }
        flag1 = flag;
        if (G != null)
        {
            flag1 = flag | G.c();
        }
        flag = flag1;
        if (H != null)
        {
            flag = flag1 | H.c();
        }
        if (flag)
        {
            bp.d(this);
        }
    }

    static boolean l(RecyclerView recyclerview)
    {
        return recyclerview.awakenScrollBars();
    }

    private void m()
    {
        if (E != null)
        {
            return;
        }
        E = new m(getContext());
        if (k)
        {
            E.a(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
            return;
        } else
        {
            E.a(getMeasuredHeight(), getMeasuredWidth());
            return;
        }
    }

    static void m(RecyclerView recyclerview)
    {
        if (!recyclerview.C)
        {
            recyclerview.C = true;
            int k1 = recyclerview.c.b();
            for (int i1 = 0; i1 < k1; i1++)
            {
                bv bv1 = b(recyclerview.c.c(i1));
                if (bv1 != null && !bv1.shouldIgnore())
                {
                    bv1.addFlags(512);
                }
            }

            recyclerview = recyclerview.a;
            k1 = ((bm) (recyclerview)).b.size();
            for (int j1 = 0; j1 < k1; j1++)
            {
                bv bv2 = (bv)((bm) (recyclerview)).b.get(j1);
                if (bv2 != null)
                {
                    bv2.addFlags(512);
                }
            }

        }
    }

    private void n()
    {
        if (G != null)
        {
            return;
        }
        G = new m(getContext());
        if (k)
        {
            G.a(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
            return;
        } else
        {
            G.a(getMeasuredHeight(), getMeasuredWidth());
            return;
        }
    }

    static boolean n(RecyclerView recyclerview)
    {
        return recyclerview.A;
    }

    private void o()
    {
        if (F != null)
        {
            return;
        }
        F = new m(getContext());
        if (k)
        {
            F.a(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
            return;
        } else
        {
            F.a(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
    }

    static boolean o(RecyclerView recyclerview)
    {
        return recyclerview.u;
    }

    private void p()
    {
        if (H != null)
        {
            return;
        }
        H = new m(getContext());
        if (k)
        {
            H.a(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
            return;
        } else
        {
            H.a(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
    }

    static boolean p(RecyclerView recyclerview)
    {
        return recyclerview.t;
    }

    static Runnable q(RecyclerView recyclerview)
    {
        return recyclerview.l;
    }

    private void q()
    {
        H = null;
        F = null;
        G = null;
        E = null;
    }

    private void r()
    {
        if (K != null)
        {
            K.clear();
        }
        l();
        a(0);
    }

    static boolean r(RecyclerView recyclerview)
    {
        recyclerview.z = true;
        return true;
    }

    static AccessibilityManager s(RecyclerView recyclerview)
    {
        return recyclerview.B;
    }

    private void s()
    {
        D = D + 1;
    }

    static bw t(RecyclerView recyclerview)
    {
        return recyclerview.aa;
    }

    private void t()
    {
        D = D - 1;
        if (D <= 0)
        {
            D = 0;
            int i1 = y;
            y = 0;
            if (i1 != 0 && B != null && B.isEnabled())
            {
                AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain();
                accessibilityevent.setEventType(2048);
                android.support.v4.view.a.a.a(accessibilityevent, i1);
                sendAccessibilityEventUnchecked(accessibilityevent);
            }
        }
    }

    static bn u(RecyclerView recyclerview)
    {
        return recyclerview.p;
    }

    private boolean u()
    {
        return D > 0;
    }

    static bu v(RecyclerView recyclerview)
    {
        return recyclerview.T;
    }

    private boolean v()
    {
        return d != null && d.h();
    }

    private void w()
    {
        if (!W && t)
        {
            bp.a(this, ac);
            W = true;
        }
    }

    private void x()
    {
        boolean flag;
        boolean flag1;
        boolean flag2 = true;
        if (C)
        {
            b.a();
            z();
            o.q();
        }
        bs bs1;
        if (d != null && o.e())
        {
            b.b();
        } else
        {
            b.e();
        }
        if (f && !g || f || g && v())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bs1 = e;
        if (v && d != null && (C || flag || android.support.v7.widget.bj.a(o)) && (!C || n.hasStableIds()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        bs.c(bs1, flag1);
        bs1 = e;
        if (!bs.b(e) || !flag || C) goto _L2; else goto _L1
_L1:
        if (d != null && o.e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L3
_L3:
        flag1 = flag2;
_L5:
        bs.d(bs1, flag1);
        return;
_L2:
        flag1 = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void y()
    {
        int j1 = c.b();
        for (int i1 = 0; i1 < j1; i1++)
        {
            bv bv1 = b(c.c(i1));
            if (!bv1.shouldIgnore())
            {
                bv1.clearOldPosition();
            }
        }

        a.e();
    }

    private void z()
    {
        boolean flag = false;
        int i2 = c.b();
        for (int i1 = 0; i1 < i2; i1++)
        {
            bv bv1 = b(c.c(i1));
            if (bv1 != null && !bv1.shouldIgnore())
            {
                bv1.addFlags(6);
            }
        }

        i2 = c.b();
        for (int j1 = 0; j1 < i2; j1++)
        {
            ((LayoutParams)c.c(j1).getLayoutParams()).c = true;
        }

        bm bm1 = a;
        i2 = bm1.b.size();
        for (int k1 = 0; k1 < i2; k1++)
        {
            LayoutParams layoutparams = (LayoutParams)((bv)bm1.b.get(k1)).itemView.getLayoutParams();
            if (layoutparams != null)
            {
                layoutparams.c = true;
            }
        }

        bm1 = a;
        if (bm1.c.n != null && bm1.c.n.hasStableIds())
        {
            int j2 = bm1.b.size();
            for (int l1 = ((flag) ? 1 : 0); l1 < j2; l1++)
            {
                bv bv2 = (bv)bm1.b.get(l1);
                if (bv2 != null)
                {
                    bv2.addFlags(6);
                }
            }

        } else
        {
            bm1.c();
        }
    }

    public final bv a(View view)
    {
        ViewParent viewparent = view.getParent();
        if (viewparent != null && viewparent != this)
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a direct child of ").append(this).toString());
        } else
        {
            return b(view);
        }
    }

    public final void a()
    {
        u = false;
    }

    final void a(int i1, int j1)
    {
        if (i1 < 0)
        {
            m();
            E.a(-i1);
        } else
        if (i1 > 0)
        {
            n();
            G.a(i1);
        }
        if (j1 < 0)
        {
            o();
            F.a(-j1);
        } else
        if (j1 > 0)
        {
            p();
            H.a(j1);
        }
        if (i1 != 0 || j1 != 0)
        {
            bp.d(this);
        }
    }

    final void a(int i1, int j1, boolean flag)
    {
        int l1 = c.b();
        int k1 = 0;
        while (k1 < l1) 
        {
            bv bv1 = b(c.c(k1));
            if (bv1 != null && !bv1.shouldIgnore())
            {
                if (bv1.mPosition >= i1 + j1)
                {
                    bv1.offsetPosition(-j1, flag);
                    android.support.v7.widget.bs.a(e, true);
                } else
                if (bv1.mPosition >= i1)
                {
                    bv1.flagRemovedAndOffsetPosition(i1 - 1, -j1, flag);
                    android.support.v7.widget.bs.a(e, true);
                }
            }
            k1++;
        }
        bm bm1 = a;
        k1 = bm1.b.size() - 1;
        while (k1 >= 0) 
        {
            bv bv2 = (bv)bm1.b.get(k1);
            if (bv2 != null)
            {
                if (bv2.getLayoutPosition() >= i1 + j1)
                {
                    bv2.offsetPosition(-j1, flag);
                } else
                if (bv2.getLayoutPosition() >= i1)
                {
                    bv2.addFlags(8);
                    bm1.b(k1);
                }
            }
            k1--;
        }
        requestLayout();
    }

    public final void a(bc bc1)
    {
        if (n != null)
        {
            n.unregisterAdapterDataObserver(i);
            n.onDetachedFromRecyclerView(this);
        }
        if (d != null)
        {
            d.c();
        }
        if (o != null)
        {
            o.c(a);
            o.b(a);
        }
        a.a();
        b.a();
        bc bc2 = n;
        n = bc1;
        bc1.registerAdapterDataObserver(i);
        bc1.onAttachedToRecyclerView(this);
        bc1 = a;
        bc bc3 = n;
        bc1.a();
        bc1.d().a(bc2, bc3);
        android.support.v7.widget.bs.a(e, true);
        z();
        requestLayout();
    }

    public final void a(bj bj1)
    {
        if (bj1 == o)
        {
            return;
        }
        if (o != null)
        {
            if (t)
            {
                o.b(this, a);
            }
            o.a(null);
        }
        a.a();
        n n1 = c;
        o o1 = n1.b;
        do
        {
            o1.a = 0L;
            if (o1.b == null)
            {
                break;
            }
            o1 = o1.b;
        } while (true);
        n1.c.clear();
        n1.a.b();
        o = bj1;
        if (bj1.i != null)
        {
            throw new IllegalArgumentException((new StringBuilder("LayoutManager ")).append(bj1).append(" is already attached to a RecyclerView: ").append(bj1.i).toString());
        }
        o.a(this);
        if (t)
        {
            o.g();
        }
        requestLayout();
    }

    final void a(String s1)
    {
        if (u())
        {
            if (s1 == null)
            {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling");
            } else
            {
                throw new IllegalStateException(s1);
            }
        } else
        {
            return;
        }
    }

    final void a(boolean flag)
    {
        if (w)
        {
            if (flag && x && o != null && n != null)
            {
                d();
            }
            w = false;
            x = false;
        }
    }

    public void addFocusables(ArrayList arraylist, int i1, int j1)
    {
        super.addFocusables(arraylist, i1, j1);
    }

    public final bj b()
    {
        return o;
    }

    final void b(int i1, int j1)
    {
        boolean flag = false;
        int j2 = c.b();
        for (int k1 = 0; k1 < j2; k1++)
        {
            View view = c.c(k1);
            bv bv1 = b(view);
            if (bv1 == null || bv1.shouldIgnore() || bv1.mPosition < i1 || bv1.mPosition >= i1 + j1)
            {
                continue;
            }
            bv1.addFlags(2);
            if (v())
            {
                bv1.addFlags(64);
            }
            ((LayoutParams)view.getLayoutParams()).c = true;
        }

        bm bm1 = a;
        j2 = bm1.b.size();
        for (int l1 = ((flag) ? 1 : 0); l1 < j2; l1++)
        {
            bv bv2 = (bv)bm1.b.get(l1);
            if (bv2 == null)
            {
                continue;
            }
            int i2 = bv2.getLayoutPosition();
            if (i2 >= i1 && i2 < i1 + j1)
            {
                bv2.addFlags(2);
            }
        }

    }

    final void c()
    {
        if (!w)
        {
            w = true;
            x = false;
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && o.a((LayoutParams)layoutparams);
    }

    public int computeHorizontalScrollExtent()
    {
        if (o.c())
        {
            return o.c(e);
        } else
        {
            return 0;
        }
    }

    public int computeHorizontalScrollOffset()
    {
        if (o.c())
        {
            return o.a(e);
        } else
        {
            return 0;
        }
    }

    public int computeHorizontalScrollRange()
    {
        if (o.c())
        {
            return o.e(e);
        } else
        {
            return 0;
        }
    }

    public int computeVerticalScrollExtent()
    {
        if (o.d())
        {
            return o.d(e);
        } else
        {
            return 0;
        }
    }

    public int computeVerticalScrollOffset()
    {
        if (o.d())
        {
            return o.b(e);
        } else
        {
            return 0;
        }
    }

    public int computeVerticalScrollRange()
    {
        if (o.d())
        {
            return o.f(e);
        } else
        {
            return 0;
        }
    }

    final Rect d(View view)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (!layoutparams.c)
        {
            return layoutparams.b;
        }
        Rect rect = layoutparams.b;
        rect.set(0, 0, 0, 0);
        int j1 = q.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            m.set(0, 0, 0, 0);
            q.get(i1);
            Rect rect1 = m;
            ((LayoutParams)view.getLayoutParams()).a.getLayoutPosition();
            rect1.set(0, 0, 0, 0);
            rect.left = rect.left + m.left;
            rect.top = rect.top + m.top;
            rect.right = rect.right + m.right;
            rect.bottom = rect.bottom + m.bottom;
        }

        layoutparams.c = false;
        return rect;
    }

    final void d()
    {
        if (n != null) goto _L2; else goto _L1
_L1:
        Log.e("RecyclerView", "No adapter attached; skipping layout");
_L19:
        return;
_L2:
        Object obj;
        int j3;
        if (o == null)
        {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        e.d.clear();
        c();
        s();
        x();
        Object obj2 = e;
        int i1;
        int k1;
        if (bs.b(e) && g && v())
        {
            obj = new a();
        } else
        {
            obj = null;
        }
        obj2.c = ((a) (obj));
        g = false;
        f = false;
        bs.b(e, android.support.v7.widget.bs.a(e));
        e.e = n.getItemCount();
        obj = ab;
        j3 = c.a();
        if (j3 != 0) goto _L4; else goto _L3
_L3:
        obj[0] = 0;
        obj[1] = 0;
_L8:
        if (bs.b(e))
        {
            e.a.clear();
            e.b.clear();
            k1 = c.a();
            for (i1 = 0; i1 < k1; i1++)
            {
                obj = b(c.b(i1));
                if (!((bv) (obj)).shouldIgnore() && (!((bv) (obj)).isInvalid() || n.hasStableIds()))
                {
                    obj2 = ((bv) (obj)).itemView;
                    e.a.put(obj, new bi(((bv) (obj)), ((View) (obj2)).getLeft(), ((View) (obj2)).getTop(), ((View) (obj2)).getRight(), ((View) (obj2)).getBottom()));
                }
            }

        }
          goto _L5
_L4:
        int j1;
        int i2;
        int k2;
        j1 = 0x7fffffff;
        i2 = 0x80000000;
        k2 = 0;
_L7:
        int l1;
        int j2;
        if (k2 >= j3)
        {
            break; /* Loop/switch isn't completed */
        }
        bv bv1 = b(c.b(k2));
        j2 = j1;
        if (bv1.shouldIgnore())
        {
            break MISSING_BLOCK_LABEL_2026;
        }
        int i3 = bv1.getLayoutPosition();
        l1 = j1;
        if (i3 < j1)
        {
            l1 = i3;
        }
        j2 = l1;
        if (i3 <= i2)
        {
            break MISSING_BLOCK_LABEL_2026;
        }
        j1 = i3;
_L22:
        k2++;
        i2 = j1;
        j1 = l1;
        if (true) goto _L7; else goto _L6
_L6:
        obj[0] = j1;
        obj[1] = i2;
          goto _L8
_L5:
        if (!android.support.v7.widget.bs.a(e)) goto _L10; else goto _L9
_L9:
        Object obj3;
        l1 = c.b();
        for (j1 = 0; j1 < l1; j1++)
        {
            obj = b(c.c(j1));
            if (!((bv) (obj)).shouldIgnore())
            {
                ((bv) (obj)).saveOldPosition();
            }
        }

        if (e.c != null)
        {
            l1 = c.a();
            for (j1 = 0; j1 < l1; j1++)
            {
                obj = b(c.b(j1));
                if (((bv) (obj)).isChanged() && !((bv) (obj)).isRemoved() && !((bv) (obj)).shouldIgnore())
                {
                    long l3 = b(((bv) (obj)));
                    e.c.put(Long.valueOf(l3), obj);
                    e.a.remove(obj);
                }
            }

        }
        boolean flag = bs.c(e);
        android.support.v7.widget.bs.a(e, false);
        o.a(a, e);
        android.support.v7.widget.bs.a(e, flag);
        obj3 = new a();
        j1 = 0;
_L17:
        if (j1 >= c.a()) goto _L12; else goto _L11
_L11:
        obj = c.b(j1);
        if (b(((View) (obj))).shouldIgnore()) goto _L14; else goto _L13
_L13:
        l1 = 0;
_L18:
        if (l1 >= e.a.size())
        {
            break MISSING_BLOCK_LABEL_2020;
        }
        if (((bv)e.a.b(l1)).itemView != obj) goto _L16; else goto _L15
_L15:
        l1 = 1;
_L21:
        if (l1 == 0)
        {
            ((a) (obj3)).put(obj, new Rect(((View) (obj)).getLeft(), ((View) (obj)).getTop(), ((View) (obj)).getRight(), ((View) (obj)).getBottom()));
        }
_L14:
        j1++;
          goto _L17
_L16:
        l1++;
          goto _L18
_L12:
        y();
        b.c();
_L20:
        e.e = n.getItemCount();
        bs.d(e);
        bs.b(e, false);
        o.a(a, e);
        android.support.v7.widget.bs.a(e, false);
        j = null;
        bs bs1 = e;
        boolean flag1;
        if (bs.b(e) && d != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        bs.c(bs1, flag1);
        if (bs.b(e))
        {
            Object obj1;
            if (e.c != null)
            {
                obj1 = new a();
            } else
            {
                obj1 = null;
            }
            l1 = c.a();
            j1 = 0;
            while (j1 < l1) 
            {
                bv bv2 = b(c.b(j1));
                if (!bv2.shouldIgnore())
                {
                    View view = bv2.itemView;
                    long l4 = b(bv2);
                    if (obj1 != null && e.c.get(Long.valueOf(l4)) != null)
                    {
                        ((a) (obj1)).put(Long.valueOf(l4), bv2);
                    } else
                    {
                        e.b.put(bv2, new bi(bv2, view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
                    }
                }
                j1++;
            }
            a(((a) (obj3)));
            for (j1 = e.a.size() - 1; j1 >= 0; j1--)
            {
                bv bv3 = (bv)e.a.b(j1);
                if (!e.b.containsKey(bv3))
                {
                    bi bi1 = (bi)e.a.c(j1);
                    e.a.d(j1);
                    a.b(bi1.a);
                    a(bi1);
                }
            }

            j1 = e.b.size();
            if (j1 > 0)
            {
                j1--;
                while (j1 >= 0) 
                {
                    bv bv5 = (bv)e.b.b(j1);
                    bi bi4 = (bi)e.b.c(j1);
                    if (e.a.isEmpty() || !e.a.containsKey(bv5))
                    {
                        e.b.d(j1);
                        Rect rect;
                        if (obj3 != null)
                        {
                            rect = (Rect)((a) (obj3)).get(bv5.itemView);
                        } else
                        {
                            rect = null;
                        }
                        l1 = bi4.b;
                        i2 = bi4.c;
                        if (rect != null && (rect.left != l1 || rect.top != i2))
                        {
                            bv5.setIsRecyclable(false);
                            if (d.a(bv5, rect.left, rect.top, l1, i2))
                            {
                                w();
                            }
                        } else
                        {
                            bv5.setIsRecyclable(false);
                            d.b(bv5);
                            w();
                        }
                    }
                    j1--;
                }
            }
            l1 = e.b.size();
            for (j1 = 0; j1 < l1; j1++)
            {
                obj3 = (bv)e.b.b(j1);
                bi bi2 = (bi)e.b.c(j1);
                bi bi3 = (bi)e.a.get(obj3);
                if (bi3 == null || bi2 == null || bi3.b == bi2.b && bi3.c == bi2.c)
                {
                    continue;
                }
                ((bv) (obj3)).setIsRecyclable(false);
                if (d.a(((bv) (obj3)), bi3.b, bi3.c, bi2.b, bi2.c))
                {
                    w();
                }
            }

            if (e.c != null)
            {
                j1 = e.c.size();
            } else
            {
                j1 = 0;
            }
            j1--;
            while (j1 >= 0) 
            {
                long l5 = ((Long)e.c.b(j1)).longValue();
                obj3 = (bv)e.c.get(Long.valueOf(l5));
                if (!((bv) (obj3)).shouldIgnore() && android.support.v7.widget.bm.a(a) != null && android.support.v7.widget.bm.a(a).contains(obj3))
                {
                    bv bv4 = (bv)((a) (obj1)).get(Long.valueOf(l5));
                    ((bv) (obj3)).setIsRecyclable(false);
                    a(((bv) (obj3)));
                    obj3.mShadowedHolder = bv4;
                    a.b(((bv) (obj3)));
                    j2 = ((bv) (obj3)).itemView.getLeft();
                    int l2 = ((bv) (obj3)).itemView.getTop();
                    if (bv4 == null || bv4.shouldIgnore())
                    {
                        i2 = l2;
                        l1 = j2;
                    } else
                    {
                        l1 = bv4.itemView.getLeft();
                        i2 = bv4.itemView.getTop();
                        bv4.setIsRecyclable(false);
                        bv4.mShadowingHolder = ((bv) (obj3));
                    }
                    d.a(((bv) (obj3)), bv4, j2, l2, l1, i2);
                    w();
                }
                j1--;
            }
        }
        a(false);
        o.b(a);
        bs.b(e, e.e);
        C = false;
        bs.c(e, false);
        bs.d(e, false);
        t();
        bj.b(o);
        if (android.support.v7.widget.bm.a(a) != null)
        {
            android.support.v7.widget.bm.a(a).clear();
        }
        e.c = null;
        if (e(ab[0], ab[1]))
        {
            f();
            return;
        }
          goto _L19
_L10:
        y();
        b.e();
        if (e.c != null)
        {
            l1 = c.a();
            for (j1 = 0; j1 < l1; j1++)
            {
                obj1 = b(c.b(j1));
                if (((bv) (obj1)).isChanged() && !((bv) (obj1)).isRemoved() && !((bv) (obj1)).shouldIgnore())
                {
                    l4 = b(((bv) (obj1)));
                    e.c.put(Long.valueOf(l4), obj1);
                    e.a.remove(obj1);
                }
            }

        }
        obj3 = null;
          goto _L20
        l1 = 0;
          goto _L21
        j1 = i2;
        l1 = j2;
          goto _L22
    }

    protected void dispatchRestoreInstanceState(SparseArray sparsearray)
    {
        dispatchThawSelfOnly(sparsearray);
    }

    protected void dispatchSaveInstanceState(SparseArray sparsearray)
    {
        dispatchFreezeSelfOnly(sparsearray);
    }

    public void draw(Canvas canvas)
    {
        boolean flag = true;
        boolean flag1 = false;
        super.draw(canvas);
        int k1 = q.size();
        for (int i1 = 0; i1 < k1; i1++)
        {
            q.get(i1);
        }

        int j1;
        if (E != null && !E.a())
        {
            int l1 = canvas.save();
            int i2;
            if (k)
            {
                j1 = getPaddingBottom();
            } else
            {
                j1 = 0;
            }
            canvas.rotate(270F);
            canvas.translate(j1 + -getHeight(), 0.0F);
            if (E != null && E.a(canvas))
            {
                k1 = 1;
            } else
            {
                k1 = 0;
            }
            canvas.restoreToCount(l1);
        } else
        {
            k1 = 0;
        }
        j1 = k1;
        if (F != null)
        {
            j1 = k1;
            if (!F.a())
            {
                l1 = canvas.save();
                if (k)
                {
                    canvas.translate(getPaddingLeft(), getPaddingTop());
                }
                if (F != null && F.a(canvas))
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
                j1 = k1 | j1;
                canvas.restoreToCount(l1);
            }
        }
        k1 = j1;
        if (G != null)
        {
            k1 = j1;
            if (!G.a())
            {
                l1 = canvas.save();
                i2 = getWidth();
                if (k)
                {
                    k1 = getPaddingTop();
                } else
                {
                    k1 = 0;
                }
                canvas.rotate(90F);
                canvas.translate(-k1, -i2);
                if (G != null && G.a(canvas))
                {
                    k1 = 1;
                } else
                {
                    k1 = 0;
                }
                k1 = j1 | k1;
                canvas.restoreToCount(l1);
            }
        }
        j1 = k1;
        if (H != null)
        {
            j1 = k1;
            if (!H.a())
            {
                l1 = canvas.save();
                canvas.rotate(180F);
                if (k)
                {
                    canvas.translate(-getWidth() + getPaddingRight(), -getHeight() + getPaddingBottom());
                } else
                {
                    canvas.translate(-getWidth(), -getHeight());
                }
                j1 = ((flag1) ? 1 : 0);
                if (H != null)
                {
                    j1 = ((flag1) ? 1 : 0);
                    if (H.a(canvas))
                    {
                        j1 = 1;
                    }
                }
                j1 = k1 | j1;
                canvas.restoreToCount(l1);
            }
        }
        if (j1 == 0 && d != null && q.size() > 0 && d.b())
        {
            j1 = ((flag) ? 1 : 0);
        }
        if (j1 != 0)
        {
            bp.d(this);
        }
    }

    final void e()
    {
        int i1;
        int j1;
        j1 = c.a();
        i1 = 0;
_L2:
        bv bv1;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        bv1 = b(c.b(i1));
        if (bv1 != null && !bv1.shouldIgnore())
        {
            if (!bv1.isRemoved() && !bv1.isInvalid())
            {
                break; /* Loop/switch isn't completed */
            }
            requestLayout();
        }
_L4:
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        if (!bv1.needsUpdate()) goto _L4; else goto _L3
_L3:
label0:
        {
            int k1 = n.getItemViewType(bv1.mPosition);
            if (bv1.getItemViewType() != k1)
            {
                break label0;
            }
            if (!bv1.isChanged() || !v())
            {
                n.bindViewHolder(bv1, bv1.mPosition);
            } else
            {
                requestLayout();
            }
        }
          goto _L4
        requestLayout();
    }

    final void f()
    {
        int i1 = getScrollX();
        int k1 = getScrollY();
        onScrollChanged(i1, k1, i1, k1);
        if (U != null)
        {
            for (int j1 = U.size() - 1; j1 >= 0; j1--)
            {
                U.get(j1);
            }

        }
    }

    public View focusSearch(View view, int i1)
    {
        View view2 = FocusFinder.getInstance().findNextFocus(this, view, i1);
        View view1 = view2;
        if (view2 == null)
        {
            view1 = view2;
            if (n != null)
            {
                view1 = view2;
                if (o != null)
                {
                    c();
                    view1 = o.c(i1, a, e);
                    a(false);
                }
            }
        }
        if (view1 != null)
        {
            return view1;
        } else
        {
            return super.focusSearch(view, i1);
        }
    }

    public final boolean g()
    {
        return !v || C || b.d();
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        if (o == null)
        {
            throw new IllegalStateException("RecyclerView has no LayoutManager");
        } else
        {
            return o.a();
        }
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        if (o == null)
        {
            throw new IllegalStateException("RecyclerView has no LayoutManager");
        } else
        {
            return o.a(getContext(), attributeset);
        }
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (o == null)
        {
            throw new IllegalStateException("RecyclerView has no LayoutManager");
        } else
        {
            return o.a(layoutparams);
        }
    }

    public int getBaseline()
    {
        if (o != null)
        {
            return -1;
        } else
        {
            return super.getBaseline();
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        D = 0;
        t = true;
        v = false;
        if (o != null)
        {
            o.g();
        }
        W = false;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (d != null)
        {
            d.c();
        }
        v = false;
        a(0);
        k();
        t = false;
        if (o != null)
        {
            o.b(this, a);
        }
        removeCallbacks(ac);
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int j1 = q.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            q.get(i1);
        }

    }

    public boolean onGenericMotionEvent(MotionEvent motionevent)
    {
        float f3;
        f3 = 0.0F;
        break MISSING_BLOCK_LABEL_3;
        if (o != null && (ay.d(motionevent) & 2) != 0 && motionevent.getAction() == 8)
        {
            float f1;
            float f2;
            if (o.d())
            {
                f1 = ay.e(motionevent, 9);
            } else
            {
                f1 = 0.0F;
            }
            if (o.c())
            {
                f2 = ay.e(motionevent, 10);
            } else
            {
                f2 = 0.0F;
            }
            if (f1 != 0.0F || f2 != 0.0F)
            {
label0:
                {
                    if (S == 1.401298E-45F)
                    {
                        motionevent = new TypedValue();
                        if (!getContext().getTheme().resolveAttribute(0x101004d, motionevent, true))
                        {
                            break label0;
                        }
                        S = motionevent.getDimension(getContext().getResources().getDisplayMetrics());
                    }
                    f3 = S;
                }
                scrollBy((int)(f2 * f3), (int)(f1 * f3));
                return false;
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        int k1;
        byte byte0;
        int k2;
        byte0 = -1;
        k1 = motionevent.getAction();
        if (k1 == 3 || k1 == 0)
        {
            s = null;
        }
        k2 = r.size();
        i1 = 0;
_L7:
        if (i1 >= k2) goto _L2; else goto _L1
_L1:
        android.support.v7.widget.bk bk1 = (android.support.v7.widget.bk)r.get(i1);
        if (!bk1.a() || k1 == 3) goto _L4; else goto _L3
_L3:
        s = bk1;
        i1 = 1;
_L8:
        if (i1 == 0) goto _L6; else goto _L5
_L5:
        r();
_L16:
        return true;
_L4:
        i1++;
          goto _L7
_L2:
        i1 = 0;
          goto _L8
_L6:
        boolean flag;
        boolean flag1;
        flag = o.c();
        flag1 = o.d();
        if (K == null)
        {
            K = VelocityTracker.obtain();
        }
        K.addMovement(motionevent);
        k1 = ay.a(motionevent);
        i1 = ay.b(motionevent);
        k1;
        JVM INSTR tableswitch 0 6: default 192
    //                   0 202
    //                   1 568
    //                   2 334
    //                   3 578
    //                   4 192
    //                   5 277
    //                   6 560;
           goto _L9 _L10 _L11 _L12 _L13 _L9 _L14 _L15
_L9:
        break; /* Loop/switch isn't completed */
_L13:
        break MISSING_BLOCK_LABEL_578;
_L17:
        if (I != 1)
        {
            return false;
        }
          goto _L16
_L10:
        J = ay.b(motionevent, 0);
        i1 = (int)(motionevent.getX() + 0.5F);
        N = i1;
        L = i1;
        i1 = (int)(motionevent.getY() + 0.5F);
        O = i1;
        M = i1;
        if (I == 2)
        {
            getParent().requestDisallowInterceptTouchEvent(true);
            a(1);
        }
          goto _L17
_L14:
        J = ay.b(motionevent, i1);
        int l1 = (int)(ay.c(motionevent, i1) + 0.5F);
        N = l1;
        L = l1;
        i1 = (int)(ay.d(motionevent, i1) + 0.5F);
        O = i1;
        M = i1;
          goto _L17
_L12:
        int i2 = ay.a(motionevent, J);
        if (i2 < 0)
        {
            Log.e("RecyclerView", (new StringBuilder("Error processing scroll; pointer index for id ")).append(J).append(" not found. Did any MotionEvents get skipped?").toString());
            return false;
        }
        int j1 = (int)(ay.c(motionevent, i2) + 0.5F);
        i2 = (int)(ay.d(motionevent, i2) + 0.5F);
        if (I != 1)
        {
            j1 -= L;
            int l2 = i2 - M;
            if (flag && Math.abs(j1) > P)
            {
                int j2 = L;
                int i3 = P;
                if (j1 < 0)
                {
                    j1 = -1;
                } else
                {
                    j1 = 1;
                }
                N = j1 * i3 + j2;
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            j2 = j1;
            if (flag1)
            {
                j2 = j1;
                if (Math.abs(l2) > P)
                {
                    j2 = M;
                    i3 = P;
                    if (l2 < 0)
                    {
                        j1 = byte0;
                    } else
                    {
                        j1 = 1;
                    }
                    O = j2 + j1 * i3;
                    j2 = 1;
                }
            }
            if (j2 != 0)
            {
                a(1);
            }
        }
          goto _L17
_L15:
        a(motionevent);
          goto _L17
_L11:
        K.clear();
          goto _L17
        r();
          goto _L17
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        c();
        android.support.v4.c.e.a("RV OnLayout");
        d();
        android.support.v4.c.e.a();
        a(false);
        v = true;
    }

    protected void onMeasure(int i1, int j1)
    {
        if (z)
        {
            c();
            x();
            if (android.support.v7.widget.bs.a(e))
            {
                bs.b(e, true);
            } else
            {
                b.e();
                bs.b(e, false);
            }
            z = false;
            a(false);
        }
        if (n != null)
        {
            e.e = n.getItemCount();
        } else
        {
            e.e = 0;
        }
        if (o == null)
        {
            d(i1, j1);
        } else
        {
            o.i.d(i1, j1);
        }
        bs.b(e, false);
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        j = (SavedState)parcelable;
        super.onRestoreInstanceState(j.getSuperState());
        if (o != null && j.a != null)
        {
            o.a(j.a);
        }
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        if (j != null)
        {
            android.support.v7.widget.SavedState.a(savedstate, j);
            return savedstate;
        }
        if (o != null)
        {
            savedstate.a = o.b();
            return savedstate;
        } else
        {
            savedstate.a = null;
            return savedstate;
        }
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (i1 != k1 || j1 != l1)
        {
            q();
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1;
        int l2;
        int i3;
        i3 = -1;
        l2 = 0;
        i1 = motionevent.getAction();
        if (s == null) goto _L2; else goto _L1
_L1:
        if (i1 != 0) goto _L4; else goto _L3
_L3:
        s = null;
_L2:
        if (i1 == 0) goto _L6; else goto _L5
_L5:
        int l1;
        l1 = r.size();
        i1 = 0;
_L35:
        if (i1 >= l1) goto _L6; else goto _L7
_L7:
        android.support.v7.widget.bk bk1 = (android.support.v7.widget.bk)r.get(i1);
        if (!bk1.a()) goto _L9; else goto _L8
_L8:
        s = bk1;
        i1 = 1;
_L11:
        if (i1 != 0)
        {
            r();
            return true;
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (i1 == 3 || i1 == 1)
        {
            s = null;
        }
        i1 = 1;
        continue; /* Loop/switch isn't completed */
_L9:
        i1++;
        continue; /* Loop/switch isn't completed */
_L6:
        i1 = 0;
        if (true) goto _L11; else goto _L10
_L10:
        boolean flag;
        boolean flag1;
        flag = o.c();
        flag1 = o.d();
        if (K == null)
        {
            K = VelocityTracker.obtain();
        }
        K.addMovement(motionevent);
        l1 = ay.a(motionevent);
        i1 = ay.b(motionevent);
        l1;
        JVM INSTR tableswitch 0 6: default 232
    //                   0 234
    //                   1 693
    //                   2 353
    //                   3 948
    //                   4 232
    //                   5 291
    //                   6 686;
           goto _L12 _L13 _L14 _L15 _L16 _L12 _L17 _L18
_L12:
        return true;
_L13:
        J = ay.b(motionevent, 0);
        i1 = (int)(motionevent.getX() + 0.5F);
        N = i1;
        L = i1;
        i1 = (int)(motionevent.getY() + 0.5F);
        O = i1;
        M = i1;
        return true;
_L17:
        J = ay.b(motionevent, i1);
        int i2 = (int)(ay.c(motionevent, i1) + 0.5F);
        N = i2;
        L = i2;
        i1 = (int)(ay.d(motionevent, i1) + 0.5F);
        O = i1;
        M = i1;
        return true;
_L15:
        int j1 = ay.a(motionevent, J);
        if (j1 < 0)
        {
            Log.e("RecyclerView", (new StringBuilder("Error processing scroll; pointer index for id ")).append(J).append(" not found. Did any MotionEvents get skipped?").toString());
            return false;
        }
        int j3 = (int)(ay.c(motionevent, j1) + 0.5F);
        int k3 = (int)(ay.d(motionevent, j1) + 0.5F);
        if (I != 1)
        {
            int k1 = j3 - L;
            int l3 = k3 - M;
            float f1;
            float f2;
            int k2;
            if (flag && Math.abs(k1) > P)
            {
                int j2 = L;
                int i4 = P;
                if (k1 < 0)
                {
                    k1 = -1;
                } else
                {
                    k1 = 1;
                }
                N = k1 * i4 + j2;
                k1 = 1;
            } else
            {
                k1 = 0;
            }
            j2 = k1;
            if (flag1)
            {
                j2 = k1;
                if (Math.abs(l3) > P)
                {
                    j2 = M;
                    i4 = P;
                    if (l3 < 0)
                    {
                        k1 = i3;
                    } else
                    {
                        k1 = 1;
                    }
                    O = j2 + k1 * i4;
                    j2 = 1;
                }
            }
            if (j2 != 0)
            {
                a(1);
            }
        }
        if (I == 1)
        {
            k1 = N;
            i3 = O;
            if (flag)
            {
                k1 = -(j3 - k1);
            } else
            {
                k1 = 0;
            }
            j2 = l2;
            if (flag1)
            {
                j2 = -(k3 - i3);
            }
            if (a(k1, j2, true, j3, k3))
            {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        N = j3;
        O = k3;
        return true;
_L18:
        a(motionevent);
        return true;
_L14:
        K.computeCurrentVelocity(1000, R);
        if (flag)
        {
            f1 = -bl.a(K, J);
        } else
        {
            f1 = 0.0F;
        }
        if (flag1)
        {
            f2 = -bl.b(K, J);
        } else
        {
            f2 = 0.0F;
        }
        if (f1 == 0.0F && f2 == 0.0F) goto _L20; else goto _L19
_L19:
        k2 = (int)f1;
        l2 = (int)f2;
        if (o != null) goto _L22; else goto _L21
_L21:
        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
_L33:
        k1 = 0;
_L31:
        if (k1 != 0) goto _L23; else goto _L20
_L20:
        a(0);
_L23:
        K.clear();
        l();
        return true;
_L22:
        flag = o.c();
        flag1 = o.d();
        if (!flag) goto _L25; else goto _L24
_L24:
        k1 = k2;
        if (Math.abs(k2) >= Q) goto _L26; else goto _L25
_L25:
        k1 = 0;
_L26:
        if (!flag1) goto _L28; else goto _L27
_L27:
        k2 = l2;
        if (Math.abs(l2) >= Q) goto _L29; else goto _L28
_L28:
        k2 = 0;
_L29:
        k1 = Math.max(-R, Math.min(k1, R));
        k2 = Math.max(-R, Math.min(k2, R));
        if (k1 == 0 && k2 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        T.a(k1, k2);
        k1 = 1;
        if (true) goto _L31; else goto _L30
_L30:
        if (true) goto _L33; else goto _L32
_L32:
        break; /* Loop/switch isn't completed */
_L16:
        r();
        return true;
        if (true) goto _L35; else goto _L34
_L34:
    }

    protected void removeDetachedView(View view, boolean flag)
    {
        bv bv1 = b(view);
        if (bv1 != null)
        {
            if (bv1.isTmpDetached())
            {
                bv1.clearTmpDetachFlag();
            } else
            if (!bv1.shouldIgnore())
            {
                throw new IllegalArgumentException((new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.")).append(bv1).toString());
            }
        }
        e(view);
        super.removeDetachedView(view, flag);
    }

    public void requestChildFocus(View view, View view1)
    {
        int i1;
        if (o.i() || u())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0 && view1 != null)
        {
            m.set(0, 0, view1.getWidth(), view1.getHeight());
            Object obj = view1.getLayoutParams();
            if (obj instanceof LayoutParams)
            {
                obj = (LayoutParams)obj;
                if (!((LayoutParams) (obj)).c)
                {
                    obj = ((LayoutParams) (obj)).b;
                    Rect rect = m;
                    rect.left = rect.left - ((Rect) (obj)).left;
                    rect = m;
                    rect.right = rect.right + ((Rect) (obj)).right;
                    rect = m;
                    rect.top = rect.top - ((Rect) (obj)).top;
                    rect = m;
                    i1 = rect.bottom;
                    rect.bottom = ((Rect) (obj)).bottom + i1;
                }
            }
            offsetDescendantRectToMyCoords(view1, m);
            offsetRectIntoDescendantCoords(view, m);
            obj = m;
            boolean flag;
            if (!v)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            requestChildRectangleOnScreen(view, ((Rect) (obj)), flag);
        }
        super.requestChildFocus(view, view1);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean flag)
    {
        bj bj1 = o;
        int k2 = bj1.m();
        int l1 = bj1.n();
        int l2 = bj1.k() - bj1.o();
        int j2 = bj1.l();
        int k3 = bj1.p();
        int i3 = view.getLeft() + rect.left;
        int i2 = view.getTop() + rect.top;
        int j3 = i3 + rect.width();
        int l3 = rect.height();
        int i1 = Math.min(0, i3 - k2);
        int j1 = Math.min(0, i2 - l1);
        int k1 = Math.max(0, j3 - l2);
        j2 = Math.max(0, (i2 + l3) - (j2 - k3));
        if (bp.h(bj1.i) == 1)
        {
            if (k1 != 0)
            {
                i1 = k1;
            } else
            {
                i1 = Math.max(i1, j3 - l2);
            }
        } else
        if (i1 == 0)
        {
            i1 = Math.min(i3 - k2, k1);
        }
        if (j1 == 0)
        {
            j1 = Math.min(i2 - l1, j2);
        }
        if (i1 != 0 || j1 != 0)
        {
            if (flag)
            {
                scrollBy(i1, j1);
            } else
            if (o == null)
            {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else
            {
                if (!o.c())
                {
                    i1 = 0;
                }
                if (!o.d())
                {
                    j1 = 0;
                }
                if (i1 != 0 || j1 != 0)
                {
                    T.b(i1, j1);
                }
            }
            return true;
        } else
        {
            return false;
        }
    }

    public void requestLayout()
    {
        if (!w)
        {
            super.requestLayout();
            return;
        } else
        {
            x = true;
            return;
        }
    }

    public void scrollBy(int i1, int j1)
    {
        if (o == null)
        {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else
        {
            boolean flag = o.c();
            boolean flag1 = o.d();
            if (flag || flag1)
            {
                if (!flag)
                {
                    i1 = 0;
                }
                if (!flag1)
                {
                    j1 = 0;
                }
                a(i1, j1, false, 0, 0);
                return;
            }
        }
    }

    public void scrollTo(int i1, int j1)
    {
        throw new UnsupportedOperationException("RecyclerView does not support scrolling to an absolute position.");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityevent)
    {
        int i1 = 0;
        boolean flag = false;
        if (u())
        {
            if (accessibilityevent != null)
            {
                i1 = android.support.v4.view.a.a.b(accessibilityevent);
            } else
            {
                i1 = 0;
            }
            if (i1 == 0)
            {
                i1 = ((flag) ? 1 : 0);
            }
            y = i1 | y;
            i1 = 1;
        }
        if (i1 != 0)
        {
            return;
        } else
        {
            super.sendAccessibilityEventUnchecked(accessibilityevent);
            return;
        }
    }

    public void setClipToPadding(boolean flag)
    {
        if (flag != k)
        {
            q();
        }
        k = flag;
        super.setClipToPadding(flag);
        if (v)
        {
            requestLayout();
        }
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT == 18 || android.os.Build.VERSION.SDK_INT == 19 || android.os.Build.VERSION.SDK_INT == 20)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
    }

    private class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        bv a;
        final Rect b;
        boolean c;
        boolean d;

        public LayoutParams()
        {
            super(-2, -2);
            b = new Rect();
            c = true;
            d = false;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            b = new Rect();
            c = true;
            d = false;
        }

        public LayoutParams(LayoutParams layoutparams)
        {
            super(layoutparams);
            b = new Rect();
            c = true;
            d = false;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            b = new Rect();
            c = true;
            d = false;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            b = new Rect();
            c = true;
            d = false;
        }
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.support.v7.widget.bp();
        Parcelable a;

        static void a(SavedState savedstate, SavedState savedstate1)
        {
            savedstate.a = savedstate1.a;
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            parcel.writeParcelable(a, 0);
        }


        SavedState(Parcel parcel)
        {
            super(parcel);
            a = parcel.readParcelable(android/support/v7/widget/bj.getClassLoader());
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
