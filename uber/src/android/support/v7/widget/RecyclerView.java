// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.os.TraceCompat;
import android.support.v4.util.ArrayMap;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.NestedScrollingChild;
import android.support.v4.view.NestedScrollingChildHelper;
import android.support.v4.view.ScrollingView;
import android.support.v4.view.VelocityTrackerCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.widget.EdgeEffectCompat;
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
import fb;
import fp;
import gc;
import gf;
import hb;
import he;
import hf;
import hg;
import hh;
import hi;
import hj;
import hk;
import hl;
import hm;
import hn;
import ho;
import hp;
import hq;
import ht;
import hv;
import hw;
import hx;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class RecyclerView extends ViewGroup
    implements NestedScrollingChild, ScrollingView
{

    private static final Interpolator an = new _cls3();
    private static final boolean h;
    private static final Class i[];
    private boolean A;
    private int B;
    private boolean C;
    private final boolean D;
    private final AccessibilityManager E;
    private List F;
    private boolean G;
    private int H;
    private EdgeEffectCompat I;
    private EdgeEffectCompat J;
    private EdgeEffectCompat K;
    private EdgeEffectCompat L;
    private int M;
    private int N;
    private VelocityTracker O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private final int U;
    private final int V;
    private float W;
    public final ho a;
    private final hv aa;
    private hm ab;
    private List ac;
    private hg ad;
    private boolean ae;
    private hx af;
    private he ag;
    private final int ah[];
    private final NestedScrollingChildHelper ai;
    private final int aj[];
    private final int ak[];
    private final int al[];
    private Runnable am;
    public fp b;
    public gc c;
    public hf d;
    public final ht e;
    boolean f;
    boolean g;
    private final hq j;
    private SavedState k;
    private boolean l;
    private final Runnable m;
    private final Rect n;
    private hb o;
    private hk p;
    private hp q;
    private final ArrayList r;
    private final ArrayList s;
    private hl t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
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
        super(context, attributeset, i1);
        j = new hq(this, (byte)0);
        a = new ho(this);
        m = new _cls1();
        n = new Rect();
        r = new ArrayList();
        s = new ArrayList();
        G = false;
        H = 0;
        d = new gf();
        M = 0;
        N = -1;
        W = 1.401298E-45F;
        aa = new hv(this);
        e = new ht();
        f = false;
        g = false;
        ad = new hh(this, (byte)0);
        ae = false;
        ah = new int[2];
        aj = new int[2];
        ak = new int[2];
        al = new int[2];
        am = new _cls2();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewconfiguration;
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        D = flag;
        viewconfiguration = ViewConfiguration.get(context);
        T = viewconfiguration.getScaledTouchSlop();
        U = viewconfiguration.getScaledMinimumFlingVelocity();
        V = viewconfiguration.getScaledMaximumFlingVelocity();
        if (ViewCompat.getOverScrollMode(this) == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setWillNotDraw(flag);
        d.a(ad);
        o();
        n();
        if (ViewCompat.getImportantForAccessibility(this) == 0)
        {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        E = (AccessibilityManager)getContext().getSystemService("accessibility");
        a(new hx(this));
        if (attributeset != null)
        {
            TypedArray typedarray = context.obtainStyledAttributes(attributeset, fb.RecyclerView, i1, 0);
            String s1 = typedarray.getString(fb.RecyclerView_layoutManager);
            typedarray.recycle();
            a(context, s1, attributeset, i1);
        }
        ai = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
    }

    private void A()
    {
        z();
        f(0);
    }

    private float B()
    {
label0:
        {
            if (W == 1.401298E-45F)
            {
                TypedValue typedvalue = new TypedValue();
                if (!getContext().getTheme().resolveAttribute(0x101004d, typedvalue, true))
                {
                    break label0;
                }
                W = typedvalue.getDimension(getContext().getResources().getDisplayMetrics());
            }
            return W;
        }
        return 0.0F;
    }

    private void C()
    {
        H = H + 1;
    }

    private void D()
    {
        H = H - 1;
        if (H <= 0)
        {
            H = 0;
            E();
        }
    }

    private void E()
    {
        int i1 = B;
        B = 0;
        if (i1 != 0 && f())
        {
            AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain();
            accessibilityevent.setEventType(2048);
            AccessibilityEventCompat.setContentChangeTypes(accessibilityevent, i1);
            sendAccessibilityEventUnchecked(accessibilityevent);
        }
    }

    private boolean F()
    {
        return d != null && d.h();
    }

    private void G()
    {
        if (!ae && u)
        {
            ViewCompat.postOnAnimation(this, am);
            ae = true;
        }
    }

    private boolean H()
    {
        return d != null && p.c();
    }

    private void I()
    {
        boolean flag2 = true;
        if (G)
        {
            b.a();
            N();
            p.a();
        }
        ht ht1;
        boolean flag;
        boolean flag1;
        if (d != null && p.c())
        {
            b.b();
        } else
        {
            b.f();
        }
        if (f && !g || f || g && F())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ht1 = e;
        if (w && d != null && (G || flag || hk.a(p)) && (!G || o.b()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ht.c(ht1, flag1);
        ht1 = e;
        if (ht.b(e) && flag && !G && H())
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        ht.d(ht1, flag1);
    }

    private void J()
    {
        int j1 = c.c();
        for (int i1 = 0; i1 < j1; i1++)
        {
            ((LayoutParams)c.d(i1).getLayoutParams()).c = true;
        }

        a.h();
    }

    private void K()
    {
        int j1 = c.c();
        for (int i1 = 0; i1 < j1; i1++)
        {
            hw hw1 = b(c.d(i1));
            if (!hw1.c())
            {
                hw1.b();
            }
        }

    }

    private void L()
    {
        int j1 = c.c();
        for (int i1 = 0; i1 < j1; i1++)
        {
            hw hw1 = b(c.d(i1));
            if (!hw1.c())
            {
                hw1.a();
            }
        }

        a.g();
    }

    private void M()
    {
        if (G)
        {
            return;
        }
        G = true;
        int j1 = c.c();
        for (int i1 = 0; i1 < j1; i1++)
        {
            hw hw1 = b(c.d(i1));
            if (hw1 != null && !hw1.c())
            {
                hw1.a(512);
            }
        }

        a.e();
    }

    private void N()
    {
        int j1 = c.c();
        for (int i1 = 0; i1 < j1; i1++)
        {
            hw hw1 = b(c.d(i1));
            if (hw1 != null && !hw1.c())
            {
                hw1.a(6);
            }
        }

        J();
        a.f();
    }

    private static String a(Context context, String s1)
    {
        if (s1.charAt(0) == '.')
        {
            context = (new StringBuilder()).append(context.getPackageName()).append(s1).toString();
        } else
        {
            context = s1;
            if (!s1.contains("."))
            {
                return (new StringBuilder()).append(android/support/v7/widget/RecyclerView.getPackage().getName()).append('.').append(s1).toString();
            }
        }
        return context;
    }

    private void a(float f1, float f2, float f3, float f4)
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        boolean flag2 = false;
        if (f2 < 0.0F)
        {
            u();
            flag = flag2;
            if (I.onPull(-f2 / (float)getWidth(), 1.0F - f3 / (float)getHeight()))
            {
                flag = true;
            }
        } else
        {
            flag = flag2;
            if (f2 > 0.0F)
            {
                v();
                flag = flag2;
                if (K.onPull(f2 / (float)getWidth(), f3 / (float)getHeight()))
                {
                    flag = true;
                }
            }
        }
        if (f4 >= 0.0F) goto _L2; else goto _L1
_L1:
        w();
        if (!J.onPull(-f4 / (float)getHeight(), f1 / (float)getWidth())) goto _L4; else goto _L3
_L3:
        if (flag1 || f2 != 0.0F || f4 != 0.0F)
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        return;
_L2:
        if (f4 > 0.0F)
        {
            x();
            if (L.onPull(f4 / (float)getHeight(), 1.0F - f1 / (float)getWidth()))
            {
                continue; /* Loop/switch isn't completed */
            }
        }
_L4:
        flag1 = flag;
        if (true) goto _L3; else goto _L5
_L5:
    }

    private void a(Context context, String s1, AttributeSet attributeset, int i1)
    {
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s1 = s1.trim();
        if (s1.length() == 0) goto _L2; else goto _L3
_L3:
        String s2 = a(context, s1);
        if (!isInEditMode()) goto _L5; else goto _L4
_L4:
        s1 = getClass().getClassLoader();
_L8:
        Class class1 = s1.loadClass(s2).asSubclass(hk);
        Object aobj[];
        s1 = class1.getConstructor(i);
        aobj = new Object[4];
        aobj[0] = context;
        aobj[1] = attributeset;
        aobj[2] = Integer.valueOf(i1);
        aobj[3] = Integer.valueOf(0);
        context = ((Context) (aobj));
_L6:
        try
        {
            s1.setAccessible(true);
            a((hk)s1.newInstance(context));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Unable to find LayoutManager ").append(s2).toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Could not instantiate the LayoutManager: ").append(s2).toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Could not instantiate the LayoutManager: ").append(s2).toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Cannot access non-public constructor ").append(s2).toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Class is not a LayoutManager ").append(s2).toString(), context);
        }
_L5:
        s1 = context.getClassLoader();
        continue; /* Loop/switch isn't completed */
        context;
        s1 = class1.getConstructor(new Class[0]);
        context = null;
          goto _L6
        s1;
        s1.initCause(context);
        throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Error creating LayoutManager ").append(s2).toString(), s1);
_L2:
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void a(ArrayMap arraymap)
    {
        List list = e.d;
        int i1 = list.size() - 1;
        while (i1 >= 0) 
        {
            View view = (View)list.get(i1);
            hw hw1 = b(view);
            hj hj1 = (hj)e.a.remove(hw1);
            if (!e.a())
            {
                e.b.remove(hw1);
            }
            if (arraymap.remove(view) != null)
            {
                p.a(view, a);
            } else
            if (hj1 != null)
            {
                a(hj1);
            } else
            {
                a(new hj(hw1, view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            }
            i1--;
        }
        list.clear();
    }

    static void a(RecyclerView recyclerview, int i1)
    {
        recyclerview.detachViewFromParent(i1);
    }

    public static void a(RecyclerView recyclerview, int i1, int j1)
    {
        recyclerview.f(i1, j1);
    }

    static void a(RecyclerView recyclerview, View view)
    {
        recyclerview.g(view);
    }

    static void a(RecyclerView recyclerview, View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        recyclerview.attachViewToParent(view, i1, layoutparams);
    }

    private void a(hj hj1)
    {
        View view = hj1.a.a;
        a(hj1.a);
        int i1 = hj1.b;
        int j1 = hj1.c;
        int k1 = view.getLeft();
        int l1 = view.getTop();
        if (!hj1.a.p() && (i1 != k1 || j1 != l1))
        {
            hj1.a.a(false);
            view.layout(k1, l1, view.getWidth() + k1, view.getHeight() + l1);
            if (d.a(hj1.a, i1, j1, k1, l1))
            {
                G();
            }
            return;
        } else
        {
            hj1.a.a(false);
            d.a(hj1.a);
            G();
            return;
        }
    }

    private void a(hw hw1)
    {
        View view = hw1.a;
        boolean flag;
        if (view.getParent() == this)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a.b(a(view));
        if (hw1.r())
        {
            c.a(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!flag)
        {
            c.a(view);
            return;
        } else
        {
            c.e(view);
            return;
        }
    }

    private void a(hw hw1, Rect rect, int i1, int j1)
    {
        View view = hw1.a;
        if (rect != null && (rect.left != i1 || rect.top != j1))
        {
            hw1.a(false);
            if (d.a(hw1, rect.left, rect.top, i1, j1))
            {
                G();
            }
            return;
        } else
        {
            hw1.a(false);
            d.b(hw1);
            G();
            return;
        }
    }

    private void a(hw hw1, hw hw2)
    {
        hw1.a(false);
        a(hw1);
        hw1.g = hw2;
        a.b(hw1);
        int k1 = hw1.a.getLeft();
        int l1 = hw1.a.getTop();
        int i1;
        int j1;
        if (hw2 == null || hw2.c())
        {
            j1 = l1;
            i1 = k1;
        } else
        {
            i1 = hw2.a.getLeft();
            j1 = hw2.a.getTop();
            hw2.a(false);
            hw2.h = hw1;
        }
        d.a(hw1, hw2, k1, l1, i1, j1);
        G();
    }

    private void a(hx hx1)
    {
        af = hx1;
        ViewCompat.setAccessibilityDelegate(this, af);
    }

    private void a(int ai1[])
    {
        int i1;
        int k1;
        int i2;
        int k2;
        k2 = c.b();
        if (k2 == 0)
        {
            ai1[0] = 0;
            ai1[1] = 0;
            return;
        }
        i1 = 0x7fffffff;
        k1 = 0x80000000;
        i2 = 0;
_L2:
        int j1;
        int l1;
        if (i2 >= k2)
        {
            break; /* Loop/switch isn't completed */
        }
        hw hw1 = b(c.b(i2));
        l1 = i1;
        if (hw1.c())
        {
            break MISSING_BLOCK_LABEL_123;
        }
        int j2 = hw1.d();
        j1 = i1;
        if (j2 < i1)
        {
            j1 = j2;
        }
        l1 = j1;
        if (j2 <= k1)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        i1 = j2;
_L3:
        i2++;
        k1 = i1;
        i1 = j1;
        if (true) goto _L2; else goto _L1
_L1:
        ai1[0] = i1;
        ai1[1] = k1;
        return;
        i1 = k1;
        j1 = l1;
          goto _L3
    }

    private boolean a(int i1, int j1, MotionEvent motionevent)
    {
        int l1 = 0;
        boolean flag2 = false;
        int j2 = 0;
        boolean flag = false;
        int k1 = 0;
        boolean flag3 = false;
        int i2 = 0;
        boolean flag1 = false;
        p();
        if (o != null)
        {
            e();
            C();
            TraceCompat.beginSection("RV Scroll");
            k1 = ((flag3) ? 1 : 0);
            l1 = ((flag2) ? 1 : 0);
            if (i1 != 0)
            {
                k1 = p.a(i1, a, e);
                l1 = i1 - k1;
            }
            i2 = ((flag1) ? 1 : 0);
            j2 = ((flag) ? 1 : 0);
            if (j1 != 0)
            {
                i2 = p.b(j1, a, e);
                j2 = j1 - i2;
            }
            TraceCompat.endSection();
            if (F())
            {
                int l2 = c.b();
                int k2 = 0;
                while (k2 < l2) 
                {
                    View view = c.b(k2);
                    Object obj = a(view);
                    if (obj == null || ((hw) (obj)).h == null)
                    {
                        continue;
                    }
                    obj = ((hw) (obj)).h;
                    int i3;
                    int j3;
                    if (obj != null)
                    {
                        obj = ((hw) (obj)).a;
                    } else
                    {
                        obj = null;
                    }
                    if (obj == null)
                    {
                        continue;
                    }
                    i3 = view.getLeft();
                    j3 = view.getTop();
                    if (i3 != ((View) (obj)).getLeft() || j3 != ((View) (obj)).getTop())
                    {
                        ((View) (obj)).layout(i3, j3, ((View) (obj)).getWidth() + i3, ((View) (obj)).getHeight() + j3);
                    }
                    k2++;
                }
            }
            D();
            a(false);
        }
        if (!r.isEmpty())
        {
            invalidate();
        }
        if (dispatchNestedScroll(k1, i2, l1, j2, aj))
        {
            R = R - aj[0];
            S = S - aj[1];
            if (motionevent != null)
            {
                motionevent.offsetLocation(aj[0], aj[1]);
            }
            motionevent = al;
            motionevent[0] = motionevent[0] + aj[0];
            motionevent = al;
            motionevent[1] = motionevent[1] + aj[1];
        } else
        if (ViewCompat.getOverScrollMode(this) != 2)
        {
            if (motionevent != null)
            {
                a(motionevent.getX(), l1, motionevent.getY(), j2);
            }
            f(i1, j1);
        }
        if (k1 != 0 || i2 != 0)
        {
            e(i2);
        }
        if (!awakenScrollBars())
        {
            invalidate();
        }
        return k1 != 0 || i2 != 0;
    }

    static boolean a(RecyclerView recyclerview)
    {
        return recyclerview.w;
    }

    private boolean a(MotionEvent motionevent)
    {
        int j1 = motionevent.getAction();
        if (j1 == 3 || j1 == 0)
        {
            t = null;
        }
        int k1 = s.size();
        for (int i1 = 0; i1 < k1; i1++)
        {
            motionevent = (hl)s.get(i1);
            if (motionevent.a() && j1 != 3)
            {
                t = motionevent;
                return true;
            }
        }

        return false;
    }

    private boolean a(AccessibilityEvent accessibilityevent)
    {
        boolean flag1 = false;
        boolean flag = false;
        if (g())
        {
            int i1;
            if (accessibilityevent != null)
            {
                i1 = AccessibilityEventCompat.getContentChangeTypes(accessibilityevent);
            } else
            {
                i1 = 0;
            }
            if (i1 == 0)
            {
                i1 = ((flag) ? 1 : 0);
            }
            B = i1 | B;
            flag1 = true;
        }
        return flag1;
    }

    private long b(hw hw1)
    {
        if (o.b())
        {
            return hw1.e();
        } else
        {
            return (long)hw1.b;
        }
    }

    public static hw b(View view)
    {
        if (view == null)
        {
            return null;
        } else
        {
            return ((LayoutParams)view.getLayoutParams()).a;
        }
    }

    public static void b(RecyclerView recyclerview, int i1)
    {
        recyclerview.f(i1);
    }

    public static void b(RecyclerView recyclerview, int i1, int j1)
    {
        recyclerview.g(i1, j1);
    }

    static void b(RecyclerView recyclerview, View view)
    {
        recyclerview.f(view);
    }

    private void b(hb hb1)
    {
        if (o != null)
        {
            o.b(j);
            o.b(this);
        }
        if (d != null)
        {
            d.c();
        }
        if (p != null)
        {
            p.c(a);
            p.b(a);
        }
        a.a();
        b.a();
        hb hb2 = o;
        o = hb1;
        if (hb1 != null)
        {
            hb1.a(j);
            hb1.a(this);
        }
        a.a(hb2, o);
        ht.a(e, true);
        N();
    }

    private void b(hi hi1)
    {
        if (p != null)
        {
            p.a("Cannot add item decoration during a scroll  or layout");
        }
        if (r.isEmpty())
        {
            setWillNotDraw(false);
        }
        r.add(hi1);
        J();
        requestLayout();
    }

    static boolean b(RecyclerView recyclerview)
    {
        return recyclerview.G;
    }

    private boolean b(MotionEvent motionevent)
    {
        int i1 = motionevent.getAction();
        if (t == null) goto _L2; else goto _L1
_L1:
        if (i1 != 0) goto _L4; else goto _L3
_L3:
        t = null;
_L2:
        if (i1 == 0) goto _L6; else goto _L5
_L5:
        int j1;
        j1 = s.size();
        i1 = 0;
_L7:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        motionevent = (hl)s.get(i1);
        if (motionevent.a())
        {
            t = motionevent;
            return true;
        }
        i1++;
        continue; /* Loop/switch isn't completed */
_L4:
        if (i1 == 3 || i1 == 1)
        {
            t = null;
        }
        return true;
        if (true) goto _L7; else goto _L6
_L6:
        return false;
    }

    public static int c(View view)
    {
        view = b(view);
        if (view != null)
        {
            return view.d();
        } else
        {
            return -1;
        }
    }

    public static void c(RecyclerView recyclerview, int i1)
    {
        recyclerview.g(i1);
    }

    private void c(MotionEvent motionevent)
    {
        int i1 = MotionEventCompat.getActionIndex(motionevent);
        if (MotionEventCompat.getPointerId(motionevent, i1) == N)
        {
            int j1;
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            N = MotionEventCompat.getPointerId(motionevent, i1);
            j1 = (int)(MotionEventCompat.getX(motionevent, i1) + 0.5F);
            R = j1;
            P = j1;
            i1 = (int)(MotionEventCompat.getY(motionevent, i1) + 0.5F);
            S = i1;
            Q = i1;
        }
    }

    static boolean c(RecyclerView recyclerview)
    {
        return recyclerview.y;
    }

    public static boolean c(RecyclerView recyclerview, View view)
    {
        return recyclerview.e(view);
    }

    static boolean d(RecyclerView recyclerview)
    {
        recyclerview.ae = false;
        return false;
    }

    public static hk e(RecyclerView recyclerview)
    {
        return recyclerview.p;
    }

    private boolean e(int i1, int j1)
    {
        if (p != null) goto _L2; else goto _L1
_L1:
        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
_L4:
        return false;
_L2:
        int k1;
        boolean flag;
        boolean flag1;
label0:
        {
            if (z)
            {
                continue; /* Loop/switch isn't completed */
            }
            flag = p.e();
            flag1 = p.f();
            if (flag)
            {
                k1 = i1;
                if (Math.abs(i1) >= U)
                {
                    break label0;
                }
            }
            k1 = 0;
        }
        if (flag1)
        {
            i1 = j1;
            if (Math.abs(j1) >= U)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        i1 = 0;
        if (k1 == 0 && i1 == 0 || dispatchNestedPreFling(k1, i1)) goto _L4; else goto _L3
_L3:
        if (flag || flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dispatchNestedFling(k1, i1, flag);
        if (flag)
        {
            j1 = Math.max(-V, Math.min(k1, V));
            i1 = Math.max(-V, Math.min(i1, V));
            aa.a(j1, i1);
            return true;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    private boolean e(View view)
    {
        e();
        boolean flag = c.f(view);
        if (flag)
        {
            view = b(view);
            a.b(view);
            a.a(view);
        }
        a(false);
        return flag;
    }

    private void f(int i1)
    {
        if (i1 == M)
        {
            return;
        }
        M = i1;
        if (i1 != 2)
        {
            s();
        }
        h(i1);
    }

    private void f(int i1, int j1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (I != null)
        {
            flag = flag1;
            if (!I.isFinished())
            {
                flag = flag1;
                if (i1 > 0)
                {
                    flag = I.onRelease();
                }
            }
        }
        flag1 = flag;
        if (K != null)
        {
            flag1 = flag;
            if (!K.isFinished())
            {
                flag1 = flag;
                if (i1 < 0)
                {
                    flag1 = flag | K.onRelease();
                }
            }
        }
        flag = flag1;
        if (J != null)
        {
            flag = flag1;
            if (!J.isFinished())
            {
                flag = flag1;
                if (j1 > 0)
                {
                    flag = flag1 | J.onRelease();
                }
            }
        }
        flag1 = flag;
        if (L != null)
        {
            flag1 = flag;
            if (!L.isFinished())
            {
                flag1 = flag;
                if (j1 < 0)
                {
                    flag1 = flag | L.onRelease();
                }
            }
        }
        if (flag1)
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public static void f(RecyclerView recyclerview)
    {
        recyclerview.p();
    }

    private void f(View view)
    {
        b(view);
        if (F != null)
        {
            for (int i1 = F.size() - 1; i1 >= 0; i1--)
            {
                F.get(i1);
            }

        }
    }

    public static hb g(RecyclerView recyclerview)
    {
        return recyclerview.o;
    }

    private void g(int i1)
    {
        if (p == null)
        {
            return;
        } else
        {
            p.c(i1);
            awakenScrollBars();
            return;
        }
    }

    private void g(int i1, int j1)
    {
        int l1 = android.view.View.MeasureSpec.getMode(i1);
        int k1 = android.view.View.MeasureSpec.getMode(j1);
        i1 = android.view.View.MeasureSpec.getSize(i1);
        j1 = android.view.View.MeasureSpec.getSize(j1);
        switch (l1)
        {
        default:
            i1 = ViewCompat.getMinimumWidth(this);
            // fall through

        case -2147483648: 
        case 1073741824: 
            switch (k1)
            {
            default:
                j1 = ViewCompat.getMinimumHeight(this);
                // fall through

            case -2147483648: 
            case 1073741824: 
                setMeasuredDimension(i1, j1);
                break;
            }
            break;
        }
    }

    private void g(View view)
    {
        b(view);
        if (F != null)
        {
            for (int i1 = F.size() - 1; i1 >= 0; i1--)
            {
                F.get(i1);
            }

        }
    }

    private void h(int i1)
    {
        if (p != null)
        {
            p.g(i1);
        }
        if (ab != null)
        {
            ab.a(i1);
        }
        if (ac != null)
        {
            for (int j1 = ac.size() - 1; j1 >= 0; j1--)
            {
                ((hm)ac.get(j1)).a(i1);
            }

        }
    }

    public static void h(RecyclerView recyclerview)
    {
        recyclerview.C();
    }

    private boolean h(int i1, int j1)
    {
        int l1;
        boolean flag1;
        flag1 = false;
        l1 = c.b();
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
            hw hw1 = b(c.b(k1));
            if (!hw1.c())
            {
                int i2 = hw1.d();
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

    public static boolean i(RecyclerView recyclerview)
    {
        return recyclerview.F();
    }

    public static void j(RecyclerView recyclerview)
    {
        recyclerview.D();
    }

    public static ArrayList k(RecyclerView recyclerview)
    {
        return recyclerview.r;
    }

    public static Interpolator l()
    {
        return an;
    }

    public static boolean l(RecyclerView recyclerview)
    {
        return recyclerview.awakenScrollBars();
    }

    public static void m(RecyclerView recyclerview)
    {
        recyclerview.M();
    }

    public static boolean m()
    {
        return h;
    }

    private void n()
    {
        c = new gc(new _cls4());
    }

    public static boolean n(RecyclerView recyclerview)
    {
        return recyclerview.D;
    }

    private void o()
    {
        b = new fp(new _cls5());
    }

    public static boolean o(RecyclerView recyclerview)
    {
        return recyclerview.v;
    }

    private void p()
    {
        m.run();
    }

    public static boolean p(RecyclerView recyclerview)
    {
        return recyclerview.u;
    }

    public static Runnable q(RecyclerView recyclerview)
    {
        return recyclerview.m;
    }

    private void q()
    {
        if (z)
        {
            a("Do not setLayoutFrozen in layout or scroll");
            z = false;
            if (y && p != null && o != null)
            {
                requestLayout();
            }
            y = false;
        }
    }

    private void r()
    {
        f(0);
        s();
    }

    public static boolean r(RecyclerView recyclerview)
    {
        recyclerview.C = true;
        return true;
    }

    public static hx s(RecyclerView recyclerview)
    {
        return recyclerview.af;
    }

    private void s()
    {
        aa.b();
        if (p != null)
        {
            p.y();
        }
    }

    public static hp t(RecyclerView recyclerview)
    {
        return recyclerview.q;
    }

    private void t()
    {
        boolean flag1 = false;
        if (I != null)
        {
            flag1 = I.onRelease();
        }
        boolean flag = flag1;
        if (J != null)
        {
            flag = flag1 | J.onRelease();
        }
        flag1 = flag;
        if (K != null)
        {
            flag1 = flag | K.onRelease();
        }
        flag = flag1;
        if (L != null)
        {
            flag = flag1 | L.onRelease();
        }
        if (flag)
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    private void u()
    {
        if (I != null)
        {
            return;
        }
        I = new EdgeEffectCompat(getContext());
        if (l)
        {
            I.setSize(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
            return;
        } else
        {
            I.setSize(getMeasuredHeight(), getMeasuredWidth());
            return;
        }
    }

    public static boolean u(RecyclerView recyclerview)
    {
        return recyclerview.l;
    }

    public static hv v(RecyclerView recyclerview)
    {
        return recyclerview.aa;
    }

    private void v()
    {
        if (K != null)
        {
            return;
        }
        K = new EdgeEffectCompat(getContext());
        if (l)
        {
            K.setSize(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
            return;
        } else
        {
            K.setSize(getMeasuredHeight(), getMeasuredWidth());
            return;
        }
    }

    private void w()
    {
        if (J != null)
        {
            return;
        }
        J = new EdgeEffectCompat(getContext());
        if (l)
        {
            J.setSize(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
            return;
        } else
        {
            J.setSize(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
    }

    private void x()
    {
        if (L != null)
        {
            return;
        }
        L = new EdgeEffectCompat(getContext());
        if (l)
        {
            L.setSize(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
            return;
        } else
        {
            L.setSize(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
    }

    private void y()
    {
        L = null;
        J = null;
        K = null;
        I = null;
    }

    private void z()
    {
        if (O != null)
        {
            O.clear();
        }
        stopNestedScroll();
        t();
    }

    public final hw a(View view)
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
        v = true;
    }

    public final void a(int i1)
    {
        if (z)
        {
            return;
        }
        if (p == null)
        {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        } else
        {
            p.a(this, i1);
            return;
        }
    }

    public final void a(int i1, int j1)
    {
        boolean flag = false;
        if (p == null)
        {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else
        if (!z)
        {
            if (!p.e())
            {
                i1 = 0;
            }
            if (!p.f())
            {
                j1 = ((flag) ? 1 : 0);
            }
            if (i1 != 0 || j1 != 0)
            {
                aa.b(i1, j1);
                return;
            }
        }
    }

    final void a(int i1, int j1, Object obj)
    {
        int l1 = c.c();
        for (int k1 = 0; k1 < l1; k1++)
        {
            View view = c.d(k1);
            hw hw1 = b(view);
            if (hw1 == null || hw1.c() || hw1.b < i1 || hw1.b >= i1 + j1)
            {
                continue;
            }
            hw1.a(2);
            hw1.a(obj);
            if (F())
            {
                hw1.a(64);
            }
            ((LayoutParams)view.getLayoutParams()).c = true;
        }

        a.c(i1, j1);
    }

    final void a(int i1, int j1, boolean flag)
    {
        int l1 = c.c();
        int k1 = 0;
        while (k1 < l1) 
        {
            hw hw1 = b(c.d(k1));
            if (hw1 != null && !hw1.c())
            {
                if (hw1.b >= i1 + j1)
                {
                    hw1.a(-j1, flag);
                    ht.a(e, true);
                } else
                if (hw1.b >= i1)
                {
                    hw1.a(i1 - 1, -j1, flag);
                    ht.a(e, true);
                }
            }
            k1++;
        }
        a.a(i1, j1, flag);
        requestLayout();
    }

    public final void a(hb hb1)
    {
        q();
        b(hb1);
        requestLayout();
    }

    public final void a(hi hi1)
    {
        b(hi1);
    }

    public final void a(hk hk1)
    {
        if (hk1 == p)
        {
            return;
        }
        if (p != null)
        {
            if (u)
            {
                p.b(this, a);
            }
            p.a(null);
        }
        a.a();
        c.a();
        p = hk1;
        if (hk1 != null)
        {
            if (hk1.r != null)
            {
                throw new IllegalArgumentException((new StringBuilder("LayoutManager ")).append(hk1).append(" is already attached to a RecyclerView: ").append(hk1.r).toString());
            }
            p.a(this);
            if (u)
            {
                p.l();
            }
        }
        requestLayout();
    }

    public final void a(hm hm1)
    {
        if (ac == null)
        {
            ac = new ArrayList();
        }
        ac.add(hm1);
    }

    public final void a(hn hn)
    {
        a.a(hn);
    }

    public final void a(String s1)
    {
        if (g())
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

    public final void a(boolean flag)
    {
        if (x)
        {
            if (flag && y && !z && p != null && o != null)
            {
                i();
            }
            x = false;
            if (!z)
            {
                y = false;
            }
        }
    }

    public void addFocusables(ArrayList arraylist, int i1, int j1)
    {
        super.addFocusables(arraylist, i1, j1);
    }

    public final hb b()
    {
        return o;
    }

    final hw b(int i1)
    {
        int k1 = c.c();
        for (int j1 = 0; j1 < k1; j1++)
        {
            hw hw1 = b(c.d(j1));
            if (hw1 != null && !hw1.p() && hw1.b == i1)
            {
                return hw1;
            }
        }

        return null;
    }

    public final void b(int i1, int j1)
    {
        if (i1 < 0)
        {
            u();
            I.onAbsorb(-i1);
        } else
        if (i1 > 0)
        {
            v();
            K.onAbsorb(i1);
        }
        if (j1 < 0)
        {
            w();
            J.onAbsorb(-j1);
        } else
        if (j1 > 0)
        {
            x();
            L.onAbsorb(j1);
        }
        if (i1 != 0 || j1 != 0)
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public final hk c()
    {
        return p;
    }

    public final void c(int i1)
    {
        int k1 = c.b();
        for (int j1 = 0; j1 < k1; j1++)
        {
            c.b(j1).offsetTopAndBottom(i1);
        }

    }

    final void c(int i1, int j1)
    {
        int j2 = c.c();
        byte byte0;
        int k1;
        int l1;
        int i2;
        if (i1 < j1)
        {
            byte0 = -1;
            k1 = j1;
            l1 = i1;
        } else
        {
            byte0 = 1;
            k1 = i1;
            l1 = j1;
        }
        i2 = 0;
        while (i2 < j2) 
        {
            hw hw1 = b(c.d(i2));
            if (hw1 != null && hw1.b >= l1 && hw1.b <= k1)
            {
                if (hw1.b == i1)
                {
                    hw1.a(j1 - i1, false);
                } else
                {
                    hw1.a(byte0, false);
                }
                ht.a(e, true);
            }
            i2++;
        }
        a.a(i1, j1);
        requestLayout();
    }

    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && p.a((LayoutParams)layoutparams);
    }

    public int computeHorizontalScrollExtent()
    {
        if (p.e())
        {
            return p.c(e);
        } else
        {
            return 0;
        }
    }

    public int computeHorizontalScrollOffset()
    {
        if (p.e())
        {
            return p.a(e);
        } else
        {
            return 0;
        }
    }

    public int computeHorizontalScrollRange()
    {
        if (p.e())
        {
            return p.e(e);
        } else
        {
            return 0;
        }
    }

    public int computeVerticalScrollExtent()
    {
        if (p.f())
        {
            return p.d(e);
        } else
        {
            return 0;
        }
    }

    public int computeVerticalScrollOffset()
    {
        if (p.f())
        {
            return p.b(e);
        } else
        {
            return 0;
        }
    }

    public int computeVerticalScrollRange()
    {
        if (p.f())
        {
            return p.f(e);
        } else
        {
            return 0;
        }
    }

    public final Rect d(View view)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (!layoutparams.c)
        {
            return layoutparams.b;
        }
        Rect rect = layoutparams.b;
        rect.set(0, 0, 0, 0);
        int j1 = r.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            n.set(0, 0, 0, 0);
            ((hi)r.get(i1)).a(n, view);
            rect.left = rect.left + n.left;
            rect.top = rect.top + n.top;
            rect.right = rect.right + n.right;
            rect.bottom = rect.bottom + n.bottom;
        }

        layoutparams.c = false;
        return rect;
    }

    public final void d()
    {
        if (z)
        {
            return;
        }
        r();
        if (p == null)
        {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        } else
        {
            p.c(0);
            awakenScrollBars();
            return;
        }
    }

    public final void d(int i1)
    {
        int k1 = c.b();
        for (int j1 = 0; j1 < k1; j1++)
        {
            c.b(j1).offsetLeftAndRight(i1);
        }

    }

    final void d(int i1, int j1)
    {
        int l1 = c.c();
        for (int k1 = 0; k1 < l1; k1++)
        {
            hw hw1 = b(c.d(k1));
            if (hw1 != null && !hw1.c() && hw1.b >= i1)
            {
                hw1.a(j1, false);
                ht.a(e, true);
            }
        }

        a.b(i1, j1);
        requestLayout();
    }

    public boolean dispatchNestedFling(float f1, float f2, boolean flag)
    {
        return ai.dispatchNestedFling(f1, f2, flag);
    }

    public boolean dispatchNestedPreFling(float f1, float f2)
    {
        return ai.dispatchNestedPreFling(f1, f2);
    }

    public boolean dispatchNestedPreScroll(int i1, int j1, int ai1[], int ai2[])
    {
        return ai.dispatchNestedPreScroll(i1, j1, ai1, ai2);
    }

    public boolean dispatchNestedScroll(int i1, int j1, int k1, int l1, int ai1[])
    {
        return ai.dispatchNestedScroll(i1, j1, k1, l1, ai1);
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
        int k1 = r.size();
        for (int i1 = 0; i1 < k1; i1++)
        {
            r.get(i1);
        }

        int j1;
        if (I != null && !I.isFinished())
        {
            int l1 = canvas.save();
            int i2;
            if (l)
            {
                j1 = getPaddingBottom();
            } else
            {
                j1 = 0;
            }
            canvas.rotate(270F);
            canvas.translate(j1 + -getHeight(), 0.0F);
            if (I != null && I.draw(canvas))
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
        if (J != null)
        {
            j1 = k1;
            if (!J.isFinished())
            {
                l1 = canvas.save();
                if (l)
                {
                    canvas.translate(getPaddingLeft(), getPaddingTop());
                }
                if (J != null && J.draw(canvas))
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
        if (K != null)
        {
            k1 = j1;
            if (!K.isFinished())
            {
                l1 = canvas.save();
                i2 = getWidth();
                if (l)
                {
                    k1 = getPaddingTop();
                } else
                {
                    k1 = 0;
                }
                canvas.rotate(90F);
                canvas.translate(-k1, -i2);
                if (K != null && K.draw(canvas))
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
        if (L != null)
        {
            j1 = k1;
            if (!L.isFinished())
            {
                l1 = canvas.save();
                canvas.rotate(180F);
                if (l)
                {
                    canvas.translate(-getWidth() + getPaddingRight(), -getHeight() + getPaddingBottom());
                } else
                {
                    canvas.translate(-getWidth(), -getHeight());
                }
                j1 = ((flag1) ? 1 : 0);
                if (L != null)
                {
                    j1 = ((flag1) ? 1 : 0);
                    if (L.draw(canvas))
                    {
                        j1 = 1;
                    }
                }
                j1 = k1 | j1;
                canvas.restoreToCount(l1);
            }
        }
        if (j1 == 0 && d != null && r.size() > 0 && d.b())
        {
            j1 = ((flag) ? 1 : 0);
        }
        if (j1 != 0)
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long l1)
    {
        return super.drawChild(canvas, view, l1);
    }

    public final void e()
    {
        if (!x)
        {
            x = true;
            if (!z)
            {
                y = false;
            }
        }
    }

    public final void e(int i1)
    {
        int j1 = getScrollX();
        int l1 = getScrollY();
        onScrollChanged(j1, l1, j1, l1);
        if (ab != null)
        {
            ab.a(this, i1);
        }
        if (ac != null)
        {
            for (int k1 = ac.size() - 1; k1 >= 0; k1--)
            {
                ((hm)ac.get(k1)).a(this, i1);
            }

        }
    }

    public final boolean f()
    {
        return E != null && E.isEnabled();
    }

    public View focusSearch(View view, int i1)
    {
        View view2 = FocusFinder.getInstance().findNextFocus(this, view, i1);
        View view1 = view2;
        if (view2 == null)
        {
            view1 = view2;
            if (o != null)
            {
                view1 = view2;
                if (p != null)
                {
                    view1 = view2;
                    if (!g())
                    {
                        view1 = view2;
                        if (!z)
                        {
                            e();
                            view1 = p.c(i1, a, e);
                            a(false);
                        }
                    }
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
        return H > 0;
    }

    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        if (p == null)
        {
            throw new IllegalStateException("RecyclerView has no LayoutManager");
        } else
        {
            return p.b();
        }
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        if (p == null)
        {
            throw new IllegalStateException("RecyclerView has no LayoutManager");
        } else
        {
            return p.a(getContext(), attributeset);
        }
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (p == null)
        {
            throw new IllegalStateException("RecyclerView has no LayoutManager");
        } else
        {
            return p.a(layoutparams);
        }
    }

    public int getBaseline()
    {
        if (p != null)
        {
            return -1;
        } else
        {
            return super.getBaseline();
        }
    }

    protected int getChildDrawingOrder(int i1, int j1)
    {
        if (ag == null)
        {
            return super.getChildDrawingOrder(i1, j1);
        } else
        {
            return ag.a();
        }
    }

    public final hf h()
    {
        return d;
    }

    public boolean hasNestedScrollingParent()
    {
        return ai.hasNestedScrollingParent();
    }

    final void i()
    {
        if (o != null) goto _L2; else goto _L1
_L1:
        Log.e("RecyclerView", "No adapter attached; skipping layout");
_L13:
        return;
_L2:
        if (p == null)
        {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        e.d.clear();
        e();
        C();
        I();
        ht ht2 = e;
        Object obj;
        if (ht.b(e) && g && F())
        {
            obj = new ArrayMap();
        } else
        {
            obj = null;
        }
        ht2.c = ((ArrayMap) (obj));
        g = false;
        f = false;
        ht.b(e, ht.a(e));
        e.e = o.a();
        a(ah);
        if (ht.b(e))
        {
            e.a.clear();
            e.b.clear();
            int i2 = c.b();
            for (int i1 = 0; i1 < i2; i1++)
            {
                obj = b(c.b(i1));
                if (!((hw) (obj)).c() && (!((hw) (obj)).l() || o.b()))
                {
                    View view1 = ((hw) (obj)).a;
                    e.a.put(obj, new hj(((hw) (obj)), view1.getLeft(), view1.getTop(), view1.getRight(), view1.getBottom()));
                }
            }

        }
        if (!ht.a(e)) goto _L4; else goto _L3
_L3:
        Object obj2;
        int k1;
        K();
        if (e.c != null)
        {
            int j2 = c.b();
            for (int j1 = 0; j1 < j2; j1++)
            {
                hw hw1 = b(c.b(j1));
                if (hw1.n() && !hw1.p() && !hw1.c())
                {
                    long l2 = b(hw1);
                    e.c.put(Long.valueOf(l2), hw1);
                    e.a.remove(hw1);
                }
            }

        }
        boolean flag = ht.c(e);
        ht.a(e, false);
        p.c(a, e);
        ht.a(e, flag);
        obj2 = new ArrayMap();
        k1 = 0;
_L11:
        if (k1 >= c.b()) goto _L6; else goto _L5
_L5:
        View view = c.b(k1);
        if (b(view).c()) goto _L8; else goto _L7
_L7:
        int k2 = 0;
_L12:
        if (k2 >= e.a.size())
        {
            break MISSING_BLOCK_LABEL_1673;
        }
        if (((hw)e.a.keyAt(k2)).a != view) goto _L10; else goto _L9
_L9:
        k2 = 1;
_L15:
        if (k2 == 0)
        {
            ((ArrayMap) (obj2)).put(view, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        }
_L8:
        k1++;
          goto _L11
_L10:
        k2++;
          goto _L12
_L6:
        L();
        b.c();
_L14:
        e.e = o.a();
        ht.d(e);
        ht.b(e, false);
        p.c(a, e);
        ht.a(e, false);
        k = null;
        ht ht1 = e;
        boolean flag1;
        if (ht.b(e) && d != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ht.c(ht1, flag1);
        if (ht.b(e))
        {
            Object obj1;
            int l1;
            if (e.c != null)
            {
                obj1 = new ArrayMap();
            } else
            {
                obj1 = null;
            }
            k2 = c.b();
            l1 = 0;
            while (l1 < k2) 
            {
                hw hw2 = b(c.b(l1));
                if (!hw2.c())
                {
                    View view3 = hw2.a;
                    long l3 = b(hw2);
                    if (obj1 != null && e.c.get(Long.valueOf(l3)) != null)
                    {
                        ((ArrayMap) (obj1)).put(Long.valueOf(l3), hw2);
                    } else
                    {
                        e.b.put(hw2, new hj(hw2, view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom()));
                    }
                }
                l1++;
            }
            a(((ArrayMap) (obj2)));
            for (l1 = e.a.size() - 1; l1 >= 0; l1--)
            {
                hw hw3 = (hw)e.a.keyAt(l1);
                if (!e.b.containsKey(hw3))
                {
                    hj hj1 = (hj)e.a.valueAt(l1);
                    e.a.removeAt(l1);
                    View view4 = hj1.a.a;
                    a.b(hj1.a);
                    a(hj1);
                }
            }

            l1 = e.b.size();
            if (l1 > 0)
            {
                l1--;
                while (l1 >= 0) 
                {
                    hw hw4 = (hw)e.b.keyAt(l1);
                    hj hj4 = (hj)e.b.valueAt(l1);
                    if (e.a.isEmpty() || !e.a.containsKey(hw4))
                    {
                        e.b.removeAt(l1);
                        Rect rect;
                        if (obj2 != null)
                        {
                            rect = (Rect)((ArrayMap) (obj2)).get(hw4.a);
                        } else
                        {
                            rect = null;
                        }
                        a(hw4, rect, hj4.b, hj4.c);
                    }
                    l1--;
                }
            }
            k2 = e.b.size();
            for (l1 = 0; l1 < k2; l1++)
            {
                obj2 = (hw)e.b.keyAt(l1);
                hj hj2 = (hj)e.b.valueAt(l1);
                hj hj3 = (hj)e.a.get(obj2);
                if (hj3 == null || hj2 == null || hj3.b == hj2.b && hj3.c == hj2.c)
                {
                    continue;
                }
                ((hw) (obj2)).a(false);
                if (d.a(((hw) (obj2)), hj3.b, hj3.c, hj2.b, hj2.c))
                {
                    G();
                }
            }

            if (e.c != null)
            {
                l1 = e.c.size();
            } else
            {
                l1 = 0;
            }
            for (l1--; l1 >= 0; l1--)
            {
                long l4 = ((Long)e.c.keyAt(l1)).longValue();
                obj2 = (hw)e.c.get(Long.valueOf(l4));
                View view2 = ((hw) (obj2)).a;
                if (!((hw) (obj2)).c() && ho.a(a) != null && ho.a(a).contains(obj2))
                {
                    a(((hw) (obj2)), (hw)((ArrayMap) (obj1)).get(Long.valueOf(l4)));
                }
            }

        }
        a(false);
        p.b(a);
        ht.b(e, e.e);
        G = false;
        ht.c(e, false);
        ht.d(e, false);
        D();
        hk.b(p);
        if (ho.a(a) != null)
        {
            ho.a(a).clear();
        }
        e.c = null;
        if (h(ah[0], ah[1]))
        {
            e(0);
            return;
        }
          goto _L13
_L4:
        L();
        b.f();
        if (e.c != null)
        {
            k2 = c.b();
            for (l1 = 0; l1 < k2; l1++)
            {
                obj1 = b(c.b(l1));
                if (((hw) (obj1)).n() && !((hw) (obj1)).p() && !((hw) (obj1)).c())
                {
                    l3 = b(((hw) (obj1)));
                    e.c.put(Long.valueOf(l3), obj1);
                    e.a.remove(obj1);
                }
            }

        }
        obj2 = null;
          goto _L14
        k2 = 0;
          goto _L15
    }

    public boolean isAttachedToWindow()
    {
        return u;
    }

    public boolean isNestedScrollingEnabled()
    {
        return ai.isNestedScrollingEnabled();
    }

    final void j()
    {
        int i1;
        int j1;
        j1 = c.b();
        i1 = 0;
_L2:
        hw hw1;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        hw1 = b(c.b(i1));
        if (hw1 != null && !hw1.c())
        {
            if (!hw1.p() && !hw1.l())
            {
                break; /* Loop/switch isn't completed */
            }
            requestLayout();
        }
_L4:
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        if (!hw1.m()) goto _L4; else goto _L3
_L3:
label0:
        {
            int k1 = o.a(hw1.b);
            if (hw1.f() != k1)
            {
                break label0;
            }
            if (!hw1.n() || !F())
            {
                o.b(hw1, hw1.b);
            } else
            {
                requestLayout();
            }
        }
          goto _L4
        requestLayout();
    }

    public final boolean k()
    {
        return !w || G || b.d();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        H = 0;
        u = true;
        w = false;
        if (p != null)
        {
            p.l();
        }
        ae = false;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (d != null)
        {
            d.c();
        }
        w = false;
        r();
        u = false;
        if (p != null)
        {
            p.b(this, a);
        }
        removeCallbacks(am);
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int j1 = r.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            ((hi)r.get(i1)).a(canvas, this);
        }

    }

    public boolean onGenericMotionEvent(MotionEvent motionevent)
    {
        if (p != null && !z && (MotionEventCompat.getSource(motionevent) & 2) != 0 && motionevent.getAction() == 8)
        {
            float f1;
            float f2;
            if (p.f())
            {
                f1 = -MotionEventCompat.getAxisValue(motionevent, 9);
            } else
            {
                f1 = 0.0F;
            }
            if (p.e())
            {
                f2 = MotionEventCompat.getAxisValue(motionevent, 10);
            } else
            {
                f2 = 0.0F;
            }
            if (f1 != 0.0F || f2 != 0.0F)
            {
                float f3 = B();
                a((int)(f2 * f3), (int)(f1 * f3), motionevent);
                return false;
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        byte byte0;
        boolean flag;
        byte0 = -1;
        flag = true;
        if (!z) goto _L2; else goto _L1
_L1:
        flag = false;
_L11:
        return flag;
_L2:
        int i1;
        int j1;
        boolean flag1;
        boolean flag2;
        if (a(motionevent))
        {
            A();
            return true;
        }
        if (p == null)
        {
            return false;
        }
        flag1 = p.e();
        flag2 = p.f();
        if (O == null)
        {
            O = VelocityTracker.obtain();
        }
        O.addMovement(motionevent);
        j1 = MotionEventCompat.getActionMasked(motionevent);
        i1 = MotionEventCompat.getActionIndex(motionevent);
        j1;
        JVM INSTR tableswitch 0 6: default 136
    //                   0 146
    //                   1 547
    //                   2 311
    //                   3 561
    //                   4 136
    //                   5 257
    //                   6 539;
           goto _L3 _L4 _L5 _L6 _L7 _L3 _L8 _L9
_L7:
        break MISSING_BLOCK_LABEL_561;
_L3:
        break; /* Loop/switch isn't completed */
_L4:
        break; /* Loop/switch isn't completed */
_L12:
        if (M != 1)
        {
            return false;
        }
        if (true) goto _L11; else goto _L10
_L10:
        if (A)
        {
            A = false;
        }
        N = MotionEventCompat.getPointerId(motionevent, 0);
        i1 = (int)(motionevent.getX() + 0.5F);
        R = i1;
        P = i1;
        i1 = (int)(motionevent.getY() + 0.5F);
        S = i1;
        Q = i1;
        if (M == 2)
        {
            getParent().requestDisallowInterceptTouchEvent(true);
            f(1);
        }
        int k1;
        int l1;
        int i2;
        if (flag1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        k1 = i1;
        if (flag2)
        {
            k1 = i1 | 2;
        }
        startNestedScroll(k1);
          goto _L12
_L8:
        N = MotionEventCompat.getPointerId(motionevent, i1);
        k1 = (int)(MotionEventCompat.getX(motionevent, i1) + 0.5F);
        R = k1;
        P = k1;
        i1 = (int)(MotionEventCompat.getY(motionevent, i1) + 0.5F);
        S = i1;
        Q = i1;
          goto _L12
_L6:
        k1 = MotionEventCompat.findPointerIndex(motionevent, N);
        if (k1 < 0)
        {
            Log.e("RecyclerView", (new StringBuilder("Error processing scroll; pointer index for id ")).append(N).append(" not found. Did any MotionEvents get skipped?").toString());
            return false;
        }
        i1 = (int)(MotionEventCompat.getX(motionevent, k1) + 0.5F);
        k1 = (int)(MotionEventCompat.getY(motionevent, k1) + 0.5F);
        if (M != 1)
        {
            i1 -= P;
            l1 = k1 - Q;
            if (flag1 && Math.abs(i1) > T)
            {
                k1 = P;
                i2 = T;
                if (i1 < 0)
                {
                    i1 = -1;
                } else
                {
                    i1 = 1;
                }
                R = i1 * i2 + k1;
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            k1 = i1;
            if (flag2)
            {
                k1 = i1;
                if (Math.abs(l1) > T)
                {
                    k1 = Q;
                    i2 = T;
                    if (l1 < 0)
                    {
                        i1 = byte0;
                    } else
                    {
                        i1 = 1;
                    }
                    S = k1 + i1 * i2;
                    k1 = 1;
                }
            }
            if (k1 != 0)
            {
                motionevent = getParent();
                if (motionevent != null)
                {
                    motionevent.requestDisallowInterceptTouchEvent(true);
                }
                f(1);
            }
        }
          goto _L12
_L9:
        c(motionevent);
          goto _L12
_L5:
        O.clear();
        stopNestedScroll();
          goto _L12
        A();
          goto _L12
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        e();
        TraceCompat.beginSection("RV OnLayout");
        i();
        TraceCompat.endSection();
        a(false);
        w = true;
    }

    protected void onMeasure(int i1, int j1)
    {
        if (C)
        {
            e();
            I();
            if (ht.a(e))
            {
                ht.b(e, true);
            } else
            {
                b.f();
                ht.b(e, false);
            }
            C = false;
            a(false);
        }
        if (o != null)
        {
            e.e = o.a();
        } else
        {
            e.e = 0;
        }
        if (p == null)
        {
            g(i1, j1);
        } else
        {
            p.e(i1, j1);
        }
        ht.b(e, false);
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        k = (SavedState)parcelable;
        super.onRestoreInstanceState(k.getSuperState());
        if (p != null && k.a != null)
        {
            p.a(k.a);
        }
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        if (k != null)
        {
            SavedState.a(savedstate, k);
            return savedstate;
        }
        if (p != null)
        {
            savedstate.a = p.d();
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
            y();
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag = false;
        if (!z && !A) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (b(motionevent))
        {
            A();
            return true;
        }
        if (p == null) goto _L1; else goto _L3
_L3:
        MotionEvent motionevent1;
        int i1;
        int j1;
        int k1;
        boolean flag1;
        boolean flag2;
        flag1 = p.e();
        flag2 = p.f();
        if (O == null)
        {
            O = VelocityTracker.obtain();
        }
        motionevent1 = MotionEvent.obtain(motionevent);
        k1 = MotionEventCompat.getActionMasked(motionevent);
        j1 = MotionEventCompat.getActionIndex(motionevent);
        if (k1 == 0)
        {
            int ai1[] = al;
            al[1] = 0;
            ai1[0] = 0;
        }
        motionevent1.offsetLocation(al[0], al[1]);
        i1 = ((flag) ? 1 : 0);
        k1;
        JVM INSTR tableswitch 0 6: default 180
    //                   0 205
    //                   1 834
    //                   2 364
    //                   3 942
    //                   4 184
    //                   5 297
    //                   6 822;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L9:
        break; /* Loop/switch isn't completed */
_L4:
        i1 = ((flag) ? 1 : 0);
_L13:
        if (i1 == 0)
        {
            O.addMovement(motionevent1);
        }
        motionevent1.recycle();
        return true;
_L5:
        N = MotionEventCompat.getPointerId(motionevent, 0);
        i1 = (int)(motionevent.getX() + 0.5F);
        R = i1;
        P = i1;
        i1 = (int)(motionevent.getY() + 0.5F);
        S = i1;
        Q = i1;
        float f1;
        float f2;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        if (flag1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        j1 = i1;
        if (flag2)
        {
            j1 = i1 | 2;
        }
        startNestedScroll(j1);
        i1 = ((flag) ? 1 : 0);
        continue; /* Loop/switch isn't completed */
_L10:
        N = MotionEventCompat.getPointerId(motionevent, j1);
        i1 = (int)(MotionEventCompat.getX(motionevent, j1) + 0.5F);
        R = i1;
        P = i1;
        i1 = (int)(MotionEventCompat.getY(motionevent, j1) + 0.5F);
        S = i1;
        Q = i1;
        i1 = ((flag) ? 1 : 0);
        continue; /* Loop/switch isn't completed */
_L7:
        i1 = MotionEventCompat.findPointerIndex(motionevent, N);
        if (i1 < 0)
        {
            Log.e("RecyclerView", (new StringBuilder("Error processing scroll; pointer index for id ")).append(N).append(" not found. Did any MotionEvents get skipped?").toString());
            return false;
        }
        l2 = (int)(MotionEventCompat.getX(motionevent, i1) + 0.5F);
        i3 = (int)(MotionEventCompat.getY(motionevent, i1) + 0.5F);
        i2 = R - l2;
        l1 = S - i3;
        i1 = l1;
        j1 = i2;
        if (dispatchNestedPreScroll(i2, l1, ak, aj))
        {
            j1 = i2 - ak[0];
            i1 = l1 - ak[1];
            motionevent1.offsetLocation(aj[0], aj[1]);
            motionevent = al;
            motionevent[0] = motionevent[0] + aj[0];
            motionevent = al;
            motionevent[1] = motionevent[1] + aj[1];
        }
        l1 = i1;
        i2 = j1;
        if (M != 1)
        {
            if (flag1 && Math.abs(j1) > T)
            {
                if (j1 > 0)
                {
                    j1 -= T;
                } else
                {
                    j1 += T;
                }
                l1 = 1;
            } else
            {
                l1 = 0;
            }
            j2 = i1;
            k2 = l1;
            if (flag2)
            {
                j2 = i1;
                k2 = l1;
                if (Math.abs(i1) > T)
                {
                    if (i1 > 0)
                    {
                        j2 = i1 - T;
                    } else
                    {
                        j2 = i1 + T;
                    }
                    k2 = 1;
                }
            }
            l1 = j2;
            i2 = j1;
            if (k2 != 0)
            {
                motionevent = getParent();
                if (motionevent != null)
                {
                    motionevent.requestDisallowInterceptTouchEvent(true);
                }
                f(1);
                i2 = j1;
                l1 = j2;
            }
        }
        i1 = ((flag) ? 1 : 0);
        if (M == 1)
        {
            R = l2 - aj[0];
            S = i3 - aj[1];
            if (!flag1)
            {
                i2 = 0;
            }
            if (!flag2)
            {
                l1 = 0;
            }
            i1 = ((flag) ? 1 : 0);
            if (a(i2, l1, motionevent1))
            {
                getParent().requestDisallowInterceptTouchEvent(true);
                i1 = ((flag) ? 1 : 0);
            }
        }
        continue; /* Loop/switch isn't completed */
_L11:
        c(motionevent);
        i1 = ((flag) ? 1 : 0);
        continue; /* Loop/switch isn't completed */
_L6:
        O.addMovement(motionevent1);
        O.computeCurrentVelocity(1000, V);
        if (flag1)
        {
            f1 = -VelocityTrackerCompat.getXVelocity(O, N);
        } else
        {
            f1 = 0.0F;
        }
        if (flag2)
        {
            f2 = -VelocityTrackerCompat.getYVelocity(O, N);
        } else
        {
            f2 = 0.0F;
        }
        if (f1 == 0.0F && f2 == 0.0F || !e((int)f1, (int)f2))
        {
            f(0);
        }
        z();
        i1 = 1;
        continue; /* Loop/switch isn't completed */
_L8:
        A();
        i1 = ((flag) ? 1 : 0);
        if (true) goto _L13; else goto _L12
_L12:
    }

    public void removeDetachedView(View view, boolean flag)
    {
        hw hw1 = b(view);
        if (hw1 != null)
        {
            if (hw1.r())
            {
                hw1.k();
            } else
            if (!hw1.c())
            {
                throw new IllegalArgumentException((new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.")).append(hw1).toString());
            }
        }
        f(view);
        super.removeDetachedView(view, flag);
    }

    public void requestChildFocus(View view, View view1)
    {
        if (!p.b(this) && view1 != null)
        {
            n.set(0, 0, view1.getWidth(), view1.getHeight());
            Object obj = view1.getLayoutParams();
            if (obj instanceof LayoutParams)
            {
                obj = (LayoutParams)obj;
                if (!((LayoutParams) (obj)).c)
                {
                    obj = ((LayoutParams) (obj)).b;
                    Rect rect = n;
                    rect.left = rect.left - ((Rect) (obj)).left;
                    rect = n;
                    rect.right = rect.right + ((Rect) (obj)).right;
                    rect = n;
                    rect.top = rect.top - ((Rect) (obj)).top;
                    rect = n;
                    int i1 = rect.bottom;
                    rect.bottom = ((Rect) (obj)).bottom + i1;
                }
            }
            offsetDescendantRectToMyCoords(view1, n);
            offsetRectIntoDescendantCoords(view, n);
            obj = n;
            boolean flag;
            if (!w)
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
        return p.a(this, view, rect, flag);
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
        int j1 = s.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            s.get(i1);
        }

        super.requestDisallowInterceptTouchEvent(flag);
    }

    public void requestLayout()
    {
        if (!x && !z)
        {
            super.requestLayout();
            return;
        } else
        {
            y = true;
            return;
        }
    }

    public void scrollBy(int i1, int j1)
    {
        if (p == null)
        {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else
        if (!z)
        {
            boolean flag = p.e();
            boolean flag1 = p.f();
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
                a(i1, j1, ((MotionEvent) (null)));
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
        if (a(accessibilityevent))
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
        if (flag != l)
        {
            y();
        }
        l = flag;
        super.setClipToPadding(flag);
        if (w)
        {
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean flag)
    {
        ai.setNestedScrollingEnabled(flag);
    }

    public boolean startNestedScroll(int i1)
    {
        return ai.startNestedScroll(i1);
    }

    public void stopNestedScroll()
    {
        ai.stopNestedScroll();
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
        i = (new Class[] {
            android/content/Context, android/util/AttributeSet, Integer.TYPE, Integer.TYPE
        });
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class LayoutParams {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class SavedState {}


    /* member class not found */
    class _cls3 {}

}
