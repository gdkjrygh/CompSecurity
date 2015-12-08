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
import android.support.v7.a.b;
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
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            ai, bb, az, ag, 
//            g, bh, bf, ar, 
//            ah, ap, a, ak, 
//            d, aj, bj, au, 
//            bi, al, at, av, 
//            f, e, ax, c, 
//            ay, as, ao, aw, 
//            aq, ba

public class RecyclerView extends ViewGroup
    implements NestedScrollingChild, ScrollingView
{

    private static final Interpolator al = new ai();
    private static final boolean h;
    private static final Class i[];
    private boolean A;
    private final boolean B;
    private final AccessibilityManager C;
    private List D;
    private boolean E;
    private int F;
    private EdgeEffectCompat G;
    private EdgeEffectCompat H;
    private EdgeEffectCompat I;
    private EdgeEffectCompat J;
    private int K;
    private int L;
    private VelocityTracker M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private final int S;
    private final int T;
    private float U;
    private final bh V;
    private ax W;
    final az a;
    private List aa;
    private aq ab;
    private boolean ac;
    private bj ad;
    private ao ae;
    private final int af[];
    private final NestedScrollingChildHelper ag;
    private final int ah[];
    private final int ai[];
    private final int aj[];
    private Runnable ak;
    a b;
    d c;
    ap d;
    final bf e;
    boolean f;
    boolean g;
    private final bb j;
    private SavedState k;
    private boolean l;
    private final Runnable m;
    private final Rect n;
    private al o;
    private au p;
    private ba q;
    private final ArrayList r;
    private final ArrayList s;
    private aw t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z;

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
        Object obj;
        Object obj1;
        Class class1;
        super(context, attributeset, i1);
        j = new bb(this, (byte)0);
        a = new az(this);
        m = new ag(this);
        n = new Rect();
        r = new ArrayList();
        s = new ArrayList();
        E = false;
        F = 0;
        d = new g();
        K = 0;
        L = -1;
        U = 1.401298E-45F;
        V = new bh(this);
        e = new bf();
        f = false;
        g = false;
        ab = new ar(this, (byte)0);
        ac = false;
        af = new int[2];
        ah = new int[2];
        ai = new int[2];
        aj = new int[2];
        ak = new ah(this);
        setFocusableInTouchMode(true);
        Object aobj[];
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        B = flag;
        obj = ViewConfiguration.get(context);
        R = ((ViewConfiguration) (obj)).getScaledTouchSlop();
        S = ((ViewConfiguration) (obj)).getScaledMinimumFlingVelocity();
        T = ((ViewConfiguration) (obj)).getScaledMaximumFlingVelocity();
        if (ViewCompat.getOverScrollMode(this) == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setWillNotDraw(flag);
        d.a(ab);
        b = new a(new ak(this));
        c = new d(new aj(this));
        if (ViewCompat.getImportantForAccessibility(this) == 0)
        {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        C = (AccessibilityManager)getContext().getSystemService("accessibility");
        ad = new bj(this);
        ViewCompat.setAccessibilityDelegate(this, ad);
        if (attributeset == null) goto _L2; else goto _L1
_L1:
        obj = context.obtainStyledAttributes(attributeset, b.a, i1, 0);
        obj1 = ((TypedArray) (obj)).getString(b.b);
        ((TypedArray) (obj)).recycle();
        if (obj1 == null) goto _L2; else goto _L3
_L3:
        obj = ((String) (obj1)).trim();
        if (((String) (obj)).length() == 0) goto _L2; else goto _L4
_L4:
        if (((String) (obj)).charAt(0) == '.')
        {
            obj = (new StringBuilder()).append(context.getPackageName()).append(((String) (obj))).toString();
        } else
        if (!((String) (obj)).contains("."))
        {
            obj = (new StringBuilder()).append(android/support/v7/widget/RecyclerView.getPackage().getName()).append('.').append(((String) (obj))).toString();
        }
_L9:
        if (!isInEditMode()) goto _L6; else goto _L5
_L5:
        obj1 = getClass().getClassLoader();
_L7:
        class1 = ((ClassLoader) (obj1)).loadClass(((String) (obj))).asSubclass(android/support/v7/widget/au);
        obj1 = class1.getConstructor(i);
        aobj = new Object[4];
        aobj[0] = context;
        aobj[1] = attributeset;
        aobj[2] = Integer.valueOf(i1);
        aobj[3] = Integer.valueOf(0);
        context = ((Context) (aobj));
_L8:
        NoSuchMethodException nosuchmethodexception;
        try
        {
            ((Constructor) (obj1)).setAccessible(true);
            a((au)((Constructor) (obj1)).newInstance(context));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Unable to find LayoutManager ").append(((String) (obj))).toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Could not instantiate the LayoutManager: ").append(((String) (obj))).toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Could not instantiate the LayoutManager: ").append(((String) (obj))).toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Cannot access non-public constructor ").append(((String) (obj))).toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Class is not a LayoutManager ").append(((String) (obj))).toString(), context);
        }
_L2:
        ag = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        return;
_L6:
        obj1 = context.getClassLoader();
          goto _L7
        context;
        obj1 = class1.getConstructor(new Class[0]);
        context = null;
          goto _L8
        nosuchmethodexception;
        nosuchmethodexception.initCause(context);
        throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Error creating LayoutManager ").append(((String) (obj))).toString(), nosuchmethodexception);
          goto _L9
    }

    private void A()
    {
        int j1 = c.b();
        for (int i1 = 0; i1 < j1; i1++)
        {
            bi bi1 = b(c.c(i1));
            if (!bi1.b())
            {
                bi1.a();
            }
        }

        a.e();
    }

    private void B()
    {
        int k1 = c.b();
        for (int i1 = 0; i1 < k1; i1++)
        {
            bi bi1 = b(c.c(i1));
            if (bi1 != null && !bi1.b())
            {
                bi1.a(6);
            }
        }

        z();
        az az1 = a;
        if (az1.c.o != null && az1.c.o.k_())
        {
            int l1 = az1.b.size();
            for (int j1 = 0; j1 < l1; j1++)
            {
                bi bi2 = (bi)az1.b.get(j1);
                if (bi2 != null)
                {
                    bi2.a(6);
                }
            }

        } else
        {
            az1.c();
        }
    }

    private void a(ArrayMap arraymap)
    {
        List list = e.d;
        int i1 = list.size() - 1;
        while (i1 >= 0) 
        {
            View view = (View)list.get(i1);
            bi bi1 = b(view);
            at at1 = (at)e.a.remove(bi1);
            if (!e.a())
            {
                e.b.remove(bi1);
            }
            if (arraymap.remove(view) != null)
            {
                p.a(view, a);
            } else
            if (at1 != null)
            {
                a(at1);
            } else
            {
                a(new at(bi1, view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
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
        recyclerview.d(i1, j1);
    }

    static void a(RecyclerView recyclerview, View view)
    {
        b(view);
        if (recyclerview.D != null)
        {
            for (int i1 = recyclerview.D.size() - 1; i1 >= 0; i1--)
            {
                ((av)recyclerview.D.get(i1)).a(view);
            }

        }
    }

    static void a(RecyclerView recyclerview, View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        recyclerview.attachViewToParent(view, i1, layoutparams);
    }

    private void a(at at1)
    {
        View view = at1.a.a;
        a(at1.a);
        int i1 = at1.b;
        int j1 = at1.c;
        int k1 = view.getLeft();
        int l1 = view.getTop();
        if (i1 != k1 || j1 != l1)
        {
            at1.a.a(false);
            view.layout(k1, l1, view.getWidth() + k1, view.getHeight() + l1);
            if (d.a(at1.a, i1, j1, k1, l1))
            {
                x();
            }
            return;
        } else
        {
            at1.a.a(false);
            d.a(at1.a);
            x();
            return;
        }
    }

    private void a(bi bi1)
    {
        View view = bi1.a;
        boolean flag;
        if (view.getParent() == this)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a.b(a(view));
        if (bi1.p())
        {
            c.a(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!flag)
        {
            c.a(view);
            return;
        }
        bi1 = c;
        int i1 = ((d) (bi1)).a.a(view);
        if (i1 < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("view is not a child, cannot hide ")).append(view).toString());
        } else
        {
            ((d) (bi1)).b.a(i1);
            ((d) (bi1)).c.add(view);
            return;
        }
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = MotionEventCompat.getActionIndex(motionevent);
        if (MotionEventCompat.getPointerId(motionevent, i1) == L)
        {
            int j1;
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            L = MotionEventCompat.getPointerId(motionevent, i1);
            j1 = (int)(MotionEventCompat.getX(motionevent, i1) + 0.5F);
            P = j1;
            N = j1;
            i1 = (int)(MotionEventCompat.getY(motionevent, i1) + 0.5F);
            Q = i1;
            O = i1;
        }
    }

    private boolean a(int i1, int j1, MotionEvent motionevent)
    {
        int l1 = 0;
        boolean flag4 = false;
        int j2 = 0;
        boolean flag2 = false;
        int k2 = 0;
        int k1 = 0;
        int i2 = 0;
        boolean flag3 = false;
        j();
        if (o != null)
        {
            d();
            t();
            TraceCompat.beginSection("RV Scroll");
            l1 = ((flag4) ? 1 : 0);
            if (i1 != 0)
            {
                k1 = p.a(i1, a, e);
                l1 = i1 - k1;
            }
            i2 = ((flag3) ? 1 : 0);
            j2 = ((flag2) ? 1 : 0);
            if (j1 != 0)
            {
                i2 = p.b(j1, a, e);
                j2 = j1 - i2;
            }
            TraceCompat.endSection();
            if (w())
            {
                int l2 = c.a();
                k2 = 0;
                while (k2 < l2) 
                {
                    View view = c.b(k2);
                    Object obj = a(view);
                    if (obj == null || ((bi) (obj)).h == null)
                    {
                        continue;
                    }
                    obj = ((bi) (obj)).h;
                    int i3;
                    int j3;
                    if (obj != null)
                    {
                        obj = ((bi) (obj)).a;
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
            u();
            a(false);
            k2 = k1;
        }
        if (!r.isEmpty())
        {
            invalidate();
        }
        if (dispatchNestedScroll(k2, i2, l1, j2, ah))
        {
            P = P - ah[0];
            Q = Q - ah[1];
            motionevent.offsetLocation(ah[0], ah[1]);
            motionevent = aj;
            motionevent[0] = motionevent[0] + ah[0];
            motionevent = aj;
            motionevent[1] = motionevent[1] + ah[1];
        } else
        if (ViewCompat.getOverScrollMode(this) != 2)
        {
            if (motionevent != null)
            {
                float f1 = motionevent.getX();
                float f2 = l1;
                float f3 = motionevent.getY();
                float f4 = j2;
                boolean flag1 = false;
                boolean flag;
                if (f2 < 0.0F)
                {
                    n();
                    flag = flag1;
                    if (G.onPull(-f2 / (float)getWidth(), 1.0F - f3 / (float)getHeight()))
                    {
                        flag = true;
                    }
                } else
                {
                    flag = flag1;
                    if (f2 > 0.0F)
                    {
                        o();
                        flag = flag1;
                        if (I.onPull(f2 / (float)getWidth(), f3 / (float)getHeight()))
                        {
                            flag = true;
                        }
                    }
                }
                if (f4 < 0.0F)
                {
                    p();
                    flag1 = flag;
                    if (H.onPull(-f4 / (float)getHeight(), f1 / (float)getWidth()))
                    {
                        flag1 = true;
                    }
                } else
                {
                    flag1 = flag;
                    if (f4 > 0.0F)
                    {
                        q();
                        flag1 = flag;
                        if (J.onPull(f4 / (float)getHeight(), 1.0F - f1 / (float)getWidth()))
                        {
                            flag1 = true;
                        }
                    }
                }
                if (flag1 || f2 != 0.0F || f4 != 0.0F)
                {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
            }
            d(i1, j1);
        }
        if (k2 != 0 || i2 != 0)
        {
            c(k2, i2);
        }
        if (!awakenScrollBars())
        {
            invalidate();
        }
        return k2 != 0 || i2 != 0;
    }

    static boolean a(RecyclerView recyclerview)
    {
        return recyclerview.w;
    }

    private long b(bi bi1)
    {
        if (o.k_())
        {
            return bi1.d;
        } else
        {
            return (long)bi1.b;
        }
    }

    static bi b(View view)
    {
        if (view == null)
        {
            return null;
        } else
        {
            return ((LayoutParams)view.getLayoutParams()).a;
        }
    }

    private void b(int i1)
    {
        if (i1 != K) goto _L2; else goto _L1
_L1:
        return;
_L2:
        K = i1;
        if (i1 != 2)
        {
            l();
        }
        if (p != null)
        {
            p.f(i1);
        }
        if (W != null)
        {
            W.a(this, i1);
        }
        if (aa != null)
        {
            int j1 = aa.size() - 1;
            while (j1 >= 0) 
            {
                ((ax)aa.get(j1)).a(this, i1);
                j1--;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    static void b(RecyclerView recyclerview, int i1)
    {
        recyclerview.b(i1);
    }

    static void b(RecyclerView recyclerview, View view)
    {
        recyclerview.f(view);
    }

    static boolean b(RecyclerView recyclerview)
    {
        return recyclerview.E;
    }

    public static int c(View view)
    {
        Object obj;
        view = b(view);
        if (view == null || ((bi) (view)).i == null)
        {
            break MISSING_BLOCK_LABEL_238;
        }
        obj = ((bi) (view)).i;
        if (!view.o() && view.m()) goto _L2; else goto _L1
_L1:
        int i1 = -1;
_L4:
        return i1;
_L2:
        int j1;
        int l1;
        int i2;
        obj = ((RecyclerView) (obj)).b;
        j1 = ((bi) (view)).b;
        i2 = ((a) (obj)).a.size();
        l1 = 0;
_L10:
        i1 = j1;
        if (l1 >= i2) goto _L4; else goto _L3
_L3:
        view = (c)((a) (obj)).a.get(l1);
        i1 = j1;
        ((c) (view)).a;
        JVM INSTR tableswitch 0 3: default 120
    //                   0 133
    //                   1 153
    //                   2 122
    //                   3 186;
           goto _L5 _L6 _L7 _L8 _L9
_L9:
        break MISSING_BLOCK_LABEL_186;
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
        if (((c) (view)).b <= j1)
        {
            i1 = j1 + ((c) (view)).c;
        }
          goto _L11
_L7:
        i1 = j1;
        if (((c) (view)).b <= j1)
        {
            if (((c) (view)).b + ((c) (view)).c > j1)
            {
                break MISSING_BLOCK_LABEL_238;
            }
            i1 = j1 - ((c) (view)).c;
        }
          goto _L11
        if (((c) (view)).b == j1)
        {
            i1 = ((c) (view)).c;
        } else
        {
            int k1 = j1;
            if (((c) (view)).b < j1)
            {
                k1 = j1 - 1;
            }
            i1 = k1;
            if (((c) (view)).c <= k1)
            {
                i1 = k1 + 1;
            }
        }
          goto _L11
        return -1;
    }

    static boolean c(RecyclerView recyclerview)
    {
        return recyclerview.y;
    }

    static boolean c(RecyclerView recyclerview, View view)
    {
        boolean flag = true;
        recyclerview.d();
        d d1 = recyclerview.c;
        int i1 = d1.a.a(view);
        if (i1 == -1)
        {
            d1.c.remove(view);
        } else
        if (d1.b.b(i1))
        {
            d1.b.c(i1);
            d1.c.remove(view);
            d1.a.a(i1);
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

    public static int d(View view)
    {
        view = b(view);
        if (view != null)
        {
            return view.c();
        } else
        {
            return -1;
        }
    }

    private void d(int i1, int j1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (G != null)
        {
            flag = flag1;
            if (!G.isFinished())
            {
                flag = flag1;
                if (i1 > 0)
                {
                    flag = G.onRelease();
                }
            }
        }
        flag1 = flag;
        if (I != null)
        {
            flag1 = flag;
            if (!I.isFinished())
            {
                flag1 = flag;
                if (i1 < 0)
                {
                    flag1 = flag | I.onRelease();
                }
            }
        }
        flag = flag1;
        if (H != null)
        {
            flag = flag1;
            if (!H.isFinished())
            {
                flag = flag1;
                if (j1 > 0)
                {
                    flag = flag1 | H.onRelease();
                }
            }
        }
        flag1 = flag;
        if (J != null)
        {
            flag1 = flag;
            if (!J.isFinished())
            {
                flag1 = flag;
                if (j1 < 0)
                {
                    flag1 = flag | J.onRelease();
                }
            }
        }
        if (flag1)
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    static boolean d(RecyclerView recyclerview)
    {
        recyclerview.ac = false;
        return false;
    }

    static au e(RecyclerView recyclerview)
    {
        return recyclerview.p;
    }

    private void e(int i1, int j1)
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

    static void f(RecyclerView recyclerview)
    {
        recyclerview.j();
    }

    private void f(View view)
    {
        b(view);
        if (D != null)
        {
            for (int i1 = D.size() - 1; i1 >= 0; i1--)
            {
                D.get(i1);
            }

        }
    }

    private boolean f(int i1, int j1)
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
            bi bi1 = b(c.b(k1));
            if (!bi1.b())
            {
                int i2 = bi1.c();
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

    static al g(RecyclerView recyclerview)
    {
        return recyclerview.o;
    }

    static Interpolator h()
    {
        return al;
    }

    static void h(RecyclerView recyclerview)
    {
        recyclerview.t();
    }

    static boolean i()
    {
        return h;
    }

    static boolean i(RecyclerView recyclerview)
    {
        return recyclerview.w();
    }

    private void j()
    {
        m.run();
    }

    static void j(RecyclerView recyclerview)
    {
        recyclerview.u();
    }

    static ArrayList k(RecyclerView recyclerview)
    {
        return recyclerview.r;
    }

    private void k()
    {
        b(0);
        l();
    }

    private void l()
    {
        V.b();
        if (p != null)
        {
            p.z();
        }
    }

    static boolean l(RecyclerView recyclerview)
    {
        return recyclerview.awakenScrollBars();
    }

    private void m()
    {
        boolean flag1 = false;
        if (G != null)
        {
            flag1 = G.onRelease();
        }
        boolean flag = flag1;
        if (H != null)
        {
            flag = flag1 | H.onRelease();
        }
        flag1 = flag;
        if (I != null)
        {
            flag1 = flag | I.onRelease();
        }
        flag = flag1;
        if (J != null)
        {
            flag = flag1 | J.onRelease();
        }
        if (flag)
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    static void m(RecyclerView recyclerview)
    {
        if (!recyclerview.E)
        {
            recyclerview.E = true;
            int k1 = recyclerview.c.b();
            for (int i1 = 0; i1 < k1; i1++)
            {
                bi bi1 = b(recyclerview.c.c(i1));
                if (bi1 != null && !bi1.b())
                {
                    bi1.a(512);
                }
            }

            recyclerview = recyclerview.a;
            k1 = ((az) (recyclerview)).b.size();
            for (int j1 = 0; j1 < k1; j1++)
            {
                bi bi2 = (bi)((az) (recyclerview)).b.get(j1);
                if (bi2 != null)
                {
                    bi2.a(512);
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
        G = new EdgeEffectCompat(getContext());
        if (l)
        {
            G.setSize(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
            return;
        } else
        {
            G.setSize(getMeasuredHeight(), getMeasuredWidth());
            return;
        }
    }

    static boolean n(RecyclerView recyclerview)
    {
        return recyclerview.B;
    }

    private void o()
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

    static boolean o(RecyclerView recyclerview)
    {
        return recyclerview.v;
    }

    private void p()
    {
        if (H != null)
        {
            return;
        }
        H = new EdgeEffectCompat(getContext());
        if (l)
        {
            H.setSize(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
            return;
        } else
        {
            H.setSize(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
    }

    static boolean p(RecyclerView recyclerview)
    {
        return recyclerview.u;
    }

    static Runnable q(RecyclerView recyclerview)
    {
        return recyclerview.m;
    }

    private void q()
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

    private void r()
    {
        J = null;
        H = null;
        I = null;
        G = null;
    }

    static boolean r(RecyclerView recyclerview)
    {
        recyclerview.A = true;
        return true;
    }

    static AccessibilityManager s(RecyclerView recyclerview)
    {
        return recyclerview.C;
    }

    private void s()
    {
        if (M != null)
        {
            M.clear();
        }
        stopNestedScroll();
        m();
        b(0);
    }

    static bj t(RecyclerView recyclerview)
    {
        return recyclerview.ad;
    }

    private void t()
    {
        F = F + 1;
    }

    static ba u(RecyclerView recyclerview)
    {
        return recyclerview.q;
    }

    private void u()
    {
        F = F - 1;
        if (F <= 0)
        {
            F = 0;
            int i1 = z;
            z = 0;
            if (i1 != 0 && C != null && C.isEnabled())
            {
                AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain();
                accessibilityevent.setEventType(2048);
                AccessibilityEventCompat.setContentChangeTypes(accessibilityevent, i1);
                sendAccessibilityEventUnchecked(accessibilityevent);
            }
        }
    }

    private boolean v()
    {
        return F > 0;
    }

    static boolean v(RecyclerView recyclerview)
    {
        return recyclerview.l;
    }

    static bh w(RecyclerView recyclerview)
    {
        return recyclerview.V;
    }

    private boolean w()
    {
        return d != null && d.h();
    }

    private void x()
    {
        if (!ac && u)
        {
            ViewCompat.postOnAnimation(this, ak);
            ac = true;
        }
    }

    private void y()
    {
        boolean flag;
        boolean flag1;
        boolean flag2 = true;
        if (E)
        {
            b.a();
            B();
            p.a();
        }
        bf bf1;
        if (d != null && p.e())
        {
            b.b();
        } else
        {
            b.e();
        }
        if (f && !g || f || g && w())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bf1 = e;
        if (w && d != null && (E || flag || au.a(p)) && (!E || o.k_()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        bf.c(bf1, flag1);
        bf1 = e;
        if (!android.support.v7.widget.bf.b(e) || !flag || E) goto _L2; else goto _L1
_L1:
        if (d != null && p.e())
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
        bf.d(bf1, flag1);
        return;
_L2:
        flag1 = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void z()
    {
        boolean flag = false;
        int k1 = c.b();
        for (int i1 = 0; i1 < k1; i1++)
        {
            ((LayoutParams)c.c(i1).getLayoutParams()).c = true;
        }

        az az1 = a;
        k1 = az1.b.size();
        for (int j1 = ((flag) ? 1 : 0); j1 < k1; j1++)
        {
            LayoutParams layoutparams = (LayoutParams)((bi)az1.b.get(j1)).a.getLayoutParams();
            if (layoutparams != null)
            {
                layoutparams.c = true;
            }
        }

    }

    public final al a()
    {
        return o;
    }

    public final bi a(View view)
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

    final void a(int i1, int j1)
    {
        if (i1 < 0)
        {
            n();
            G.onAbsorb(-i1);
        } else
        if (i1 > 0)
        {
            o();
            I.onAbsorb(i1);
        }
        if (j1 < 0)
        {
            p();
            H.onAbsorb(-j1);
        } else
        if (j1 > 0)
        {
            q();
            J.onAbsorb(j1);
        }
        if (i1 != 0 || j1 != 0)
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    final void a(int i1, int j1, boolean flag)
    {
        int l1 = c.b();
        int k1 = 0;
        while (k1 < l1) 
        {
            bi bi1 = b(c.c(k1));
            if (bi1 != null && !bi1.b())
            {
                if (bi1.b >= i1 + j1)
                {
                    bi1.a(-j1, flag);
                    bf.a(e, true);
                } else
                if (bi1.b >= i1)
                {
                    int i2 = -j1;
                    bi1.a(8);
                    bi1.a(i2, flag);
                    bi1.b = i1 - 1;
                    bf.a(e, true);
                }
            }
            k1++;
        }
        az az1 = a;
        k1 = az1.b.size() - 1;
        while (k1 >= 0) 
        {
            bi bi2 = (bi)az1.b.get(k1);
            if (bi2 != null)
            {
                if (bi2.c() >= i1 + j1)
                {
                    bi2.a(-j1, flag);
                } else
                if (bi2.c() >= i1)
                {
                    bi2.a(8);
                    az1.c(k1);
                }
            }
            k1--;
        }
        requestLayout();
    }

    public final void a(al al1)
    {
        if (o != null)
        {
            o.b(j);
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
        al al2 = o;
        o = al1;
        if (al1 != null)
        {
            al1.a(j);
        }
        al1 = a;
        al al3 = o;
        al1.a();
        al1.d().a(al2, al3);
        bf.a(e, true);
        B();
        requestLayout();
    }

    public final void a(ap ap1)
    {
        if (d != null)
        {
            d.c();
            d.a(null);
        }
        d = ap1;
        if (d != null)
        {
            d.a(ab);
        }
    }

    public final void a(as as1)
    {
        if (p != null)
        {
            p.a("Cannot add item decoration during a scroll  or layout");
        }
        if (r.isEmpty())
        {
            setWillNotDraw(false);
        }
        r.add(as1);
        z();
        requestLayout();
    }

    public final void a(au au1)
    {
        if (au1 == p)
        {
            return;
        }
        if (p != null)
        {
            if (u)
            {
                p.b(this, a);
            }
            p.b(null);
        }
        a.a();
        d d1 = c;
        e e1 = d1.b;
        do
        {
            e1.a = 0L;
            if (e1.b == null)
            {
                break;
            }
            e1 = e1.b;
        } while (true);
        d1.c.clear();
        d1.a.b();
        p = au1;
        if (au1 != null)
        {
            if (au1.r != null)
            {
                throw new IllegalArgumentException((new StringBuilder("LayoutManager ")).append(au1).append(" is already attached to a RecyclerView: ").append(au1.r).toString());
            }
            p.b(this);
            if (u)
            {
                p.o();
            }
        }
        requestLayout();
    }

    public final void a(av av1)
    {
        if (D == null)
        {
            D = new ArrayList();
        }
        D.add(av1);
    }

    public final void a(ax ax1)
    {
        W = ax1;
    }

    final void a(String s1)
    {
        if (v())
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
        if (x)
        {
            if (flag && y && p != null && o != null)
            {
                e();
            }
            x = false;
            y = false;
        }
    }

    public final void a_(int i1)
    {
        k();
        if (p == null)
        {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        } else
        {
            p.b(i1);
            awakenScrollBars();
            return;
        }
    }

    public void addFocusables(ArrayList arraylist, int i1, int j1)
    {
        super.addFocusables(arraylist, i1, j1);
    }

    public final au b()
    {
        return p;
    }

    final void b(int i1, int j1)
    {
        boolean flag = false;
        int j2 = c.b();
        for (int k1 = 0; k1 < j2; k1++)
        {
            View view = c.c(k1);
            bi bi1 = b(view);
            if (bi1 == null || bi1.b() || bi1.b < i1 || bi1.b >= i1 + j1)
            {
                continue;
            }
            bi1.a(2);
            if (w())
            {
                bi1.a(64);
            }
            ((LayoutParams)view.getLayoutParams()).c = true;
        }

        az az1 = a;
        j2 = az1.b.size();
        for (int l1 = ((flag) ? 1 : 0); l1 < j2; l1++)
        {
            bi bi2 = (bi)az1.b.get(l1);
            if (bi2 == null)
            {
                continue;
            }
            int i2 = bi2.c();
            if (i2 >= i1 && i2 < i1 + j1)
            {
                bi2.a(2);
            }
        }

    }

    public final void b(ax ax1)
    {
        if (aa == null)
        {
            aa = new ArrayList();
        }
        aa.add(ax1);
    }

    public final void c()
    {
        if (p == null)
        {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        } else
        {
            p.a(this);
            return;
        }
    }

    final void c(int i1, int j1)
    {
        int k1 = getScrollX();
        int i2 = getScrollY();
        onScrollChanged(k1, i2, k1, i2);
        if (W != null)
        {
            W.a(this, i1, j1);
        }
        if (aa != null)
        {
            for (int l1 = aa.size() - 1; l1 >= 0; l1--)
            {
                ((ax)aa.get(l1)).a(this, i1, j1);
            }

        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && p.a((LayoutParams)layoutparams);
    }

    public int computeHorizontalScrollExtent()
    {
        if (p.g())
        {
            return p.c(e);
        } else
        {
            return 0;
        }
    }

    public int computeHorizontalScrollOffset()
    {
        if (p.g())
        {
            return p.a(e);
        } else
        {
            return 0;
        }
    }

    public int computeHorizontalScrollRange()
    {
        if (p.g())
        {
            return p.e(e);
        } else
        {
            return 0;
        }
    }

    public int computeVerticalScrollExtent()
    {
        if (p.h())
        {
            return p.d(e);
        } else
        {
            return 0;
        }
    }

    public int computeVerticalScrollOffset()
    {
        if (p.h())
        {
            return p.b(e);
        } else
        {
            return 0;
        }
    }

    public int computeVerticalScrollRange()
    {
        if (p.h())
        {
            return p.f(e);
        } else
        {
            return 0;
        }
    }

    final void d()
    {
        if (!x)
        {
            x = true;
            y = false;
        }
    }

    public boolean dispatchNestedFling(float f1, float f2, boolean flag)
    {
        return ag.dispatchNestedFling(f1, f2, flag);
    }

    public boolean dispatchNestedPreFling(float f1, float f2)
    {
        return ag.dispatchNestedPreFling(f1, f2);
    }

    public boolean dispatchNestedPreScroll(int i1, int j1, int ai1[], int ai2[])
    {
        return ag.dispatchNestedPreScroll(i1, j1, ai1, ai2);
    }

    public boolean dispatchNestedScroll(int i1, int j1, int k1, int l1, int ai1[])
    {
        return ag.dispatchNestedScroll(i1, j1, k1, l1, ai1);
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
        if (G != null && !G.isFinished())
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
            if (G != null && G.draw(canvas))
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
        if (H != null)
        {
            j1 = k1;
            if (!H.isFinished())
            {
                l1 = canvas.save();
                if (l)
                {
                    canvas.translate(getPaddingLeft(), getPaddingTop());
                }
                if (H != null && H.draw(canvas))
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
        if (I != null)
        {
            k1 = j1;
            if (!I.isFinished())
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
                if (I != null && I.draw(canvas))
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
        if (J != null)
        {
            j1 = k1;
            if (!J.isFinished())
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
                if (J != null)
                {
                    j1 = ((flag1) ? 1 : 0);
                    if (J.draw(canvas))
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

    final Rect e(View view)
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
            ((as)r.get(i1)).a(n, view);
            rect.left = rect.left + n.left;
            rect.top = rect.top + n.top;
            rect.right = rect.right + n.right;
            rect.bottom = rect.bottom + n.bottom;
        }

        layoutparams.c = false;
        return rect;
    }

    final void e()
    {
        if (o != null) goto _L2; else goto _L1
_L1:
        Log.e("RecyclerView", "No adapter attached; skipping layout");
_L19:
        return;
_L2:
        Object obj;
        int j3;
        if (p == null)
        {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        e.d.clear();
        d();
        t();
        y();
        Object obj2 = e;
        int i1;
        int k1;
        if (android.support.v7.widget.bf.b(e) && g && w())
        {
            obj = new ArrayMap();
        } else
        {
            obj = null;
        }
        obj2.c = ((ArrayMap) (obj));
        g = false;
        f = false;
        android.support.v7.widget.bf.b(e, bf.a(e));
        e.e = o.a();
        obj = af;
        j3 = c.a();
        if (j3 != 0) goto _L4; else goto _L3
_L3:
        obj[0] = 0;
        obj[1] = 0;
_L8:
        if (android.support.v7.widget.bf.b(e))
        {
            e.a.clear();
            e.b.clear();
            k1 = c.a();
            for (i1 = 0; i1 < k1; i1++)
            {
                obj = b(c.b(i1));
                if (!((bi) (obj)).b() && (!((bi) (obj)).j() || o.k_()))
                {
                    obj2 = ((bi) (obj)).a;
                    e.a.put(obj, new at(((bi) (obj)), ((View) (obj2)).getLeft(), ((View) (obj2)).getTop(), ((View) (obj2)).getRight(), ((View) (obj2)).getBottom()));
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
        bi bi1 = b(c.b(k2));
        j2 = j1;
        if (bi1.b())
        {
            break MISSING_BLOCK_LABEL_2040;
        }
        int i3 = bi1.c();
        l1 = j1;
        if (i3 < j1)
        {
            l1 = i3;
        }
        j2 = l1;
        if (i3 <= i2)
        {
            break MISSING_BLOCK_LABEL_2040;
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
        if (!bf.a(e)) goto _L10; else goto _L9
_L9:
        Object obj3;
        l1 = c.b();
        for (j1 = 0; j1 < l1; j1++)
        {
            obj = b(c.c(j1));
            if (!((bi) (obj)).b() && ((bi) (obj)).c == -1)
            {
                obj.c = ((bi) (obj)).b;
            }
        }

        if (e.c != null)
        {
            l1 = c.a();
            for (j1 = 0; j1 < l1; j1++)
            {
                obj = b(c.b(j1));
                if (((bi) (obj)).l() && !((bi) (obj)).n() && !((bi) (obj)).b())
                {
                    long l3 = b(((bi) (obj)));
                    e.c.put(Long.valueOf(l3), obj);
                    e.a.remove(obj);
                }
            }

        }
        boolean flag = bf.c(e);
        bf.a(e, false);
        p.c(a, e);
        bf.a(e, flag);
        obj3 = new ArrayMap();
        j1 = 0;
_L17:
        if (j1 >= c.a()) goto _L12; else goto _L11
_L11:
        obj = c.b(j1);
        if (b(((View) (obj))).b()) goto _L14; else goto _L13
_L13:
        l1 = 0;
_L18:
        if (l1 >= e.a.size())
        {
            break MISSING_BLOCK_LABEL_2034;
        }
        if (((bi)e.a.keyAt(l1)).a != obj) goto _L16; else goto _L15
_L15:
        l1 = 1;
_L21:
        if (l1 == 0)
        {
            ((ArrayMap) (obj3)).put(obj, new Rect(((View) (obj)).getLeft(), ((View) (obj)).getTop(), ((View) (obj)).getRight(), ((View) (obj)).getBottom()));
        }
_L14:
        j1++;
          goto _L17
_L16:
        l1++;
          goto _L18
_L12:
        A();
        b.c();
_L20:
        e.e = o.a();
        bf.d(e);
        android.support.v7.widget.bf.b(e, false);
        p.c(a, e);
        bf.a(e, false);
        k = null;
        bf bf1 = e;
        boolean flag1;
        if (android.support.v7.widget.bf.b(e) && d != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        bf.c(bf1, flag1);
        if (android.support.v7.widget.bf.b(e))
        {
            Object obj1;
            if (e.c != null)
            {
                obj1 = new ArrayMap();
            } else
            {
                obj1 = null;
            }
            l1 = c.a();
            j1 = 0;
            while (j1 < l1) 
            {
                bi bi2 = b(c.b(j1));
                if (!bi2.b())
                {
                    View view = bi2.a;
                    long l4 = b(bi2);
                    if (obj1 != null && e.c.get(Long.valueOf(l4)) != null)
                    {
                        ((ArrayMap) (obj1)).put(Long.valueOf(l4), bi2);
                    } else
                    {
                        e.b.put(bi2, new at(bi2, view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
                    }
                }
                j1++;
            }
            a(((ArrayMap) (obj3)));
            for (j1 = e.a.size() - 1; j1 >= 0; j1--)
            {
                bi bi3 = (bi)e.a.keyAt(j1);
                if (!e.b.containsKey(bi3))
                {
                    at at1 = (at)e.a.valueAt(j1);
                    e.a.removeAt(j1);
                    a.b(at1.a);
                    a(at1);
                }
            }

            j1 = e.b.size();
            if (j1 > 0)
            {
                j1--;
                while (j1 >= 0) 
                {
                    bi bi5 = (bi)e.b.keyAt(j1);
                    at at4 = (at)e.b.valueAt(j1);
                    if (e.a.isEmpty() || !e.a.containsKey(bi5))
                    {
                        e.b.removeAt(j1);
                        Rect rect;
                        if (obj3 != null)
                        {
                            rect = (Rect)((ArrayMap) (obj3)).get(bi5.a);
                        } else
                        {
                            rect = null;
                        }
                        l1 = at4.b;
                        i2 = at4.c;
                        if (rect != null && (rect.left != l1 || rect.top != i2))
                        {
                            bi5.a(false);
                            if (d.a(bi5, rect.left, rect.top, l1, i2))
                            {
                                x();
                            }
                        } else
                        {
                            bi5.a(false);
                            d.b(bi5);
                            x();
                        }
                    }
                    j1--;
                }
            }
            l1 = e.b.size();
            for (j1 = 0; j1 < l1; j1++)
            {
                obj3 = (bi)e.b.keyAt(j1);
                at at2 = (at)e.b.valueAt(j1);
                at at3 = (at)e.a.get(obj3);
                if (at3 == null || at2 == null || at3.b == at2.b && at3.c == at2.c)
                {
                    continue;
                }
                ((bi) (obj3)).a(false);
                if (d.a(((bi) (obj3)), at3.b, at3.c, at2.b, at2.c))
                {
                    x();
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
                long l5 = ((Long)e.c.keyAt(j1)).longValue();
                obj3 = (bi)e.c.get(Long.valueOf(l5));
                if (!((bi) (obj3)).b() && az.a(a) != null && az.a(a).contains(obj3))
                {
                    bi bi4 = (bi)((ArrayMap) (obj1)).get(Long.valueOf(l5));
                    ((bi) (obj3)).a(false);
                    a(((bi) (obj3)));
                    obj3.g = bi4;
                    a.b(((bi) (obj3)));
                    j2 = ((bi) (obj3)).a.getLeft();
                    int l2 = ((bi) (obj3)).a.getTop();
                    if (bi4 == null || bi4.b())
                    {
                        i2 = l2;
                        l1 = j2;
                    } else
                    {
                        l1 = bi4.a.getLeft();
                        i2 = bi4.a.getTop();
                        bi4.a(false);
                        bi4.h = ((bi) (obj3));
                    }
                    d.a(((bi) (obj3)), bi4, j2, l2, l1, i2);
                    x();
                }
                j1--;
            }
        }
        a(false);
        p.b(a);
        android.support.v7.widget.bf.b(e, e.e);
        E = false;
        bf.c(e, false);
        bf.d(e, false);
        u();
        android.support.v7.widget.au.b(p);
        if (az.a(a) != null)
        {
            az.a(a).clear();
        }
        e.c = null;
        if (f(af[0], af[1]))
        {
            c(0, 0);
            return;
        }
          goto _L19
_L10:
        A();
        b.e();
        if (e.c != null)
        {
            l1 = c.a();
            for (j1 = 0; j1 < l1; j1++)
            {
                obj1 = b(c.b(j1));
                if (((bi) (obj1)).l() && !((bi) (obj1)).n() && !((bi) (obj1)).b())
                {
                    l4 = b(((bi) (obj1)));
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

    final void f()
    {
        int i1;
        int j1;
        j1 = c.a();
        i1 = 0;
_L2:
        bi bi1;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        bi1 = b(c.b(i1));
        if (bi1 != null && !bi1.b())
        {
            if (!bi1.n() && !bi1.j())
            {
                break; /* Loop/switch isn't completed */
            }
            requestLayout();
        }
_L4:
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        if (!bi1.k()) goto _L4; else goto _L3
_L3:
label0:
        {
            int k1 = o.a(bi1.b);
            if (bi1.e != k1)
            {
                break label0;
            }
            if (!bi1.l() || !w())
            {
                o.b(bi1, bi1.b);
            } else
            {
                requestLayout();
            }
        }
          goto _L4
        requestLayout();
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
                    d();
                    view1 = p.c(i1, a, e);
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
        return !w || E || b.d();
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
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

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
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
        if (ae == null)
        {
            return super.getChildDrawingOrder(i1, j1);
        } else
        {
            return ae.a();
        }
    }

    public boolean hasNestedScrollingParent()
    {
        return ag.hasNestedScrollingParent();
    }

    public boolean isAttachedToWindow()
    {
        return u;
    }

    public boolean isNestedScrollingEnabled()
    {
        return ag.isNestedScrollingEnabled();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        F = 0;
        u = true;
        w = false;
        if (p != null)
        {
            p.o();
        }
        ac = false;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (d != null)
        {
            d.c();
        }
        w = false;
        k();
        u = false;
        if (p != null)
        {
            p.b(this, a);
        }
        removeCallbacks(ak);
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int j1 = r.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            r.get(i1);
        }

    }

    public boolean onGenericMotionEvent(MotionEvent motionevent)
    {
        float f3;
        f3 = 0.0F;
        break MISSING_BLOCK_LABEL_3;
        if (p != null && (MotionEventCompat.getSource(motionevent) & 2) != 0 && motionevent.getAction() == 8)
        {
            float f1;
            float f2;
            if (p.h())
            {
                f1 = MotionEventCompat.getAxisValue(motionevent, 9);
            } else
            {
                f1 = 0.0F;
            }
            if (p.g())
            {
                f2 = MotionEventCompat.getAxisValue(motionevent, 10);
            } else
            {
                f2 = 0.0F;
            }
            if (f1 != 0.0F || f2 != 0.0F)
            {
label0:
                {
                    if (U == 1.401298E-45F)
                    {
                        motionevent = new TypedValue();
                        if (!getContext().getTheme().resolveAttribute(0x101004d, motionevent, true))
                        {
                            break label0;
                        }
                        U = motionevent.getDimension(getContext().getResources().getDisplayMetrics());
                    }
                    f3 = U;
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
        int j1;
        byte byte0;
        int l1;
        byte0 = -1;
        j1 = motionevent.getAction();
        if (j1 == 3 || j1 == 0)
        {
            t = null;
        }
        l1 = s.size();
        i1 = 0;
_L7:
        if (i1 >= l1) goto _L2; else goto _L1
_L1:
        aw aw1 = (aw)s.get(i1);
        if (!aw1.a() || j1 == 3) goto _L4; else goto _L3
_L3:
        t = aw1;
        i1 = 1;
_L8:
        if (i1 == 0) goto _L6; else goto _L5
_L5:
        s();
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
        flag = p.g();
        flag1 = p.h();
        if (M == null)
        {
            M = VelocityTracker.obtain();
        }
        M.addMovement(motionevent);
        j1 = MotionEventCompat.getActionMasked(motionevent);
        i1 = MotionEventCompat.getActionIndex(motionevent);
        j1;
        JVM INSTR tableswitch 0 6: default 192
    //                   0 202
    //                   1 595
    //                   2 361
    //                   3 609
    //                   4 192
    //                   5 304
    //                   6 587;
           goto _L9 _L10 _L11 _L12 _L13 _L9 _L14 _L15
_L9:
        break; /* Loop/switch isn't completed */
_L13:
        break MISSING_BLOCK_LABEL_609;
_L17:
        if (K != 1)
        {
            return false;
        }
          goto _L16
_L10:
        L = MotionEventCompat.getPointerId(motionevent, 0);
        i1 = (int)(motionevent.getX() + 0.5F);
        P = i1;
        N = i1;
        i1 = (int)(motionevent.getY() + 0.5F);
        Q = i1;
        O = i1;
        if (K == 2)
        {
            getParent().requestDisallowInterceptTouchEvent(true);
            b(1);
        }
        int k1;
        int i2;
        int j2;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        k1 = i1;
        if (flag1)
        {
            k1 = i1 | 2;
        }
        startNestedScroll(k1);
          goto _L17
_L14:
        L = MotionEventCompat.getPointerId(motionevent, i1);
        k1 = (int)(MotionEventCompat.getX(motionevent, i1) + 0.5F);
        P = k1;
        N = k1;
        i1 = (int)(MotionEventCompat.getY(motionevent, i1) + 0.5F);
        Q = i1;
        O = i1;
          goto _L17
_L12:
        k1 = MotionEventCompat.findPointerIndex(motionevent, L);
        if (k1 < 0)
        {
            Log.e("RecyclerView", (new StringBuilder("Error processing scroll; pointer index for id ")).append(L).append(" not found. Did any MotionEvents get skipped?").toString());
            return false;
        }
        i1 = (int)(MotionEventCompat.getX(motionevent, k1) + 0.5F);
        k1 = (int)(MotionEventCompat.getY(motionevent, k1) + 0.5F);
        if (K != 1)
        {
            i1 -= N;
            i2 = k1 - O;
            if (flag && Math.abs(i1) > R)
            {
                k1 = N;
                j2 = R;
                if (i1 < 0)
                {
                    i1 = -1;
                } else
                {
                    i1 = 1;
                }
                P = i1 * j2 + k1;
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            k1 = i1;
            if (flag1)
            {
                k1 = i1;
                if (Math.abs(i2) > R)
                {
                    k1 = O;
                    j2 = R;
                    if (i2 < 0)
                    {
                        i1 = byte0;
                    } else
                    {
                        i1 = 1;
                    }
                    Q = k1 + i1 * j2;
                    k1 = 1;
                }
            }
            if (k1 != 0)
            {
                b(1);
            }
        }
          goto _L17
_L15:
        a(motionevent);
          goto _L17
_L11:
        M.clear();
        stopNestedScroll();
          goto _L17
        s();
          goto _L17
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        d();
        TraceCompat.beginSection("RV OnLayout");
        e();
        TraceCompat.endSection();
        a(false);
        w = true;
    }

    protected void onMeasure(int i1, int j1)
    {
        if (A)
        {
            d();
            y();
            if (bf.a(e))
            {
                android.support.v7.widget.bf.b(e, true);
            } else
            {
                b.e();
                android.support.v7.widget.bf.b(e, false);
            }
            A = false;
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
            e(i1, j1);
        } else
        {
            p.r.e(i1, j1);
        }
        android.support.v7.widget.bf.b(e, false);
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
            savedstate.a = p.f();
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
            r();
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
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
_L30:
        if (i1 >= j1) goto _L6; else goto _L7
_L7:
        Object obj = (aw)s.get(i1);
        if (!((aw) (obj)).a()) goto _L9; else goto _L8
_L8:
        t = ((aw) (obj));
        i1 = 1;
_L11:
        if (i1 != 0)
        {
            s();
            return true;
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (i1 == 3 || i1 == 1)
        {
            t = null;
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
        flag = p.g();
        flag1 = p.h();
        if (M == null)
        {
            M = VelocityTracker.obtain();
        }
        M.addMovement(motionevent);
        obj = MotionEvent.obtain(motionevent);
        j1 = MotionEventCompat.getActionMasked(motionevent);
        i1 = MotionEventCompat.getActionIndex(motionevent);
        if (j1 == 0)
        {
            int ai1[] = aj;
            aj[1] = 0;
            ai1[0] = 0;
        }
        ((MotionEvent) (obj)).offsetLocation(aj[0], aj[1]);
        j1;
        JVM INSTR tableswitch 0 6: default 272
    //                   0 279
    //                   1 868
    //                   2 430
    //                   3 1166
    //                   4 272
    //                   5 367
    //                   6 860;
           goto _L12 _L13 _L14 _L15 _L16 _L12 _L17 _L18
_L12:
        ((MotionEvent) (obj)).recycle();
        return true;
_L13:
        L = MotionEventCompat.getPointerId(motionevent, 0);
        i1 = (int)(motionevent.getX() + 0.5F);
        P = i1;
        N = i1;
        i1 = (int)(motionevent.getY() + 0.5F);
        Q = i1;
        O = i1;
        float f1;
        float f2;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        k1 = i1;
        if (flag1)
        {
            k1 = i1 | 2;
        }
        startNestedScroll(k1);
        continue; /* Loop/switch isn't completed */
_L17:
        L = MotionEventCompat.getPointerId(motionevent, i1);
        k1 = (int)(MotionEventCompat.getX(motionevent, i1) + 0.5F);
        P = k1;
        N = k1;
        i1 = (int)(MotionEventCompat.getY(motionevent, i1) + 0.5F);
        Q = i1;
        O = i1;
        continue; /* Loop/switch isn't completed */
_L15:
        i1 = MotionEventCompat.findPointerIndex(motionevent, L);
        if (i1 < 0)
        {
            Log.e("RecyclerView", (new StringBuilder("Error processing scroll; pointer index for id ")).append(L).append(" not found. Did any MotionEvents get skipped?").toString());
            return false;
        }
        l2 = (int)(MotionEventCompat.getX(motionevent, i1) + 0.5F);
        i3 = (int)(MotionEventCompat.getY(motionevent, i1) + 0.5F);
        i2 = P - l2;
        l1 = Q - i3;
        i1 = l1;
        k1 = i2;
        if (dispatchNestedPreScroll(i2, l1, ai, ah))
        {
            k1 = i2 - ai[0];
            i1 = l1 - ai[1];
            ((MotionEvent) (obj)).offsetLocation(ah[0], ah[1]);
            motionevent = aj;
            motionevent[0] = motionevent[0] + ah[0];
            motionevent = aj;
            motionevent[1] = motionevent[1] + ah[1];
        }
        l1 = i1;
        j2 = k1;
        if (K != 1)
        {
            if (flag && Math.abs(k1) > R)
            {
                if (k1 > 0)
                {
                    k1 -= R;
                } else
                {
                    k1 += R;
                }
                l1 = 1;
            } else
            {
                l1 = 0;
            }
            i2 = i1;
            k2 = l1;
            if (flag1)
            {
                i2 = i1;
                k2 = l1;
                if (Math.abs(i1) > R)
                {
                    if (i1 > 0)
                    {
                        i2 = i1 - R;
                    } else
                    {
                        i2 = i1 + R;
                    }
                    k2 = 1;
                }
            }
            l1 = i2;
            j2 = k1;
            if (k2 != 0)
            {
                b(1);
                j2 = k1;
                l1 = i2;
            }
        }
        if (K == 1)
        {
            P = l2 - ah[0];
            Q = i3 - ah[1];
            if (!flag)
            {
                j2 = 0;
            }
            if (!flag1)
            {
                l1 = 0;
            }
            if (a(j2, l1, ((MotionEvent) (obj))))
            {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        continue; /* Loop/switch isn't completed */
_L18:
        a(motionevent);
        continue; /* Loop/switch isn't completed */
_L14:
        M.computeCurrentVelocity(1000, T);
        if (flag)
        {
            f1 = -VelocityTrackerCompat.getXVelocity(M, L);
        } else
        {
            f1 = 0.0F;
        }
        if (flag1)
        {
            f2 = -VelocityTrackerCompat.getYVelocity(M, L);
        } else
        {
            f2 = 0.0F;
        }
        if (f1 == 0.0F && f2 == 0.0F) goto _L20; else goto _L19
_L19:
        i1 = (int)f1;
        k1 = (int)f2;
        if (p != null) goto _L22; else goto _L21
_L21:
        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
_L25:
        i1 = 0;
_L27:
        if (i1 != 0) goto _L23; else goto _L20
_L20:
        b(0);
_L23:
        M.clear();
        m();
        continue; /* Loop/switch isn't completed */
_L22:
        flag = p.g();
        flag1 = p.h();
        if (!flag || Math.abs(i1) < S)
        {
            i1 = 0;
        }
        if (!flag1 || Math.abs(k1) < S)
        {
            k1 = 0;
        }
        if (i1 == 0 && k1 == 0 || dispatchNestedPreFling(i1, k1)) goto _L25; else goto _L24
_L24:
        if (flag || flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dispatchNestedFling(i1, k1, flag);
        if (!flag) goto _L25; else goto _L26
_L26:
        i1 = Math.max(-T, Math.min(i1, T));
        k1 = Math.max(-T, Math.min(k1, T));
        V.a(i1, k1);
        i1 = 1;
          goto _L27
_L16:
        s();
        if (true) goto _L12; else goto _L28
_L28:
        if (true) goto _L30; else goto _L29
_L29:
    }

    protected void removeDetachedView(View view, boolean flag)
    {
        bi bi1 = b(view);
        if (bi1 != null)
        {
            if (bi1.p())
            {
                bi1.i();
            } else
            if (!bi1.b())
            {
                throw new IllegalArgumentException((new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.")).append(bi1).toString());
            }
        }
        f(view);
        super.removeDetachedView(view, flag);
    }

    public void requestChildFocus(View view, View view1)
    {
        int i1;
        if (p.q() || v())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0 && view1 != null)
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
                    i1 = rect.bottom;
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
        au au1 = p;
        int k2 = au1.u();
        int l1 = au1.v();
        int l2 = au1.s() - au1.w();
        int j2 = au1.t();
        int k3 = au1.x();
        int i3 = view.getLeft() + rect.left;
        int i2 = view.getTop() + rect.top;
        int j3 = i3 + rect.width();
        int l3 = rect.height();
        int i1 = Math.min(0, i3 - k2);
        int j1 = Math.min(0, i2 - l1);
        int k1 = Math.max(0, j3 - l2);
        j2 = Math.max(0, (i2 + l3) - (j2 - k3));
        if (ViewCompat.getLayoutDirection(au1.r) == 1)
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
            if (p == null)
            {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else
            {
                if (!p.g())
                {
                    i1 = 0;
                }
                if (!p.h())
                {
                    j1 = 0;
                }
                if (i1 != 0 || j1 != 0)
                {
                    V.b(i1, j1);
                }
            }
            return true;
        } else
        {
            return false;
        }
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
        if (!x)
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
        {
            boolean flag = p.g();
            boolean flag1 = p.h();
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
        int i1 = 0;
        boolean flag = false;
        if (v())
        {
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
            z = i1 | z;
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
        if (flag != l)
        {
            r();
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
        ag.setNestedScrollingEnabled(flag);
    }

    public boolean startNestedScroll(int i1)
    {
        return ag.startNestedScroll(i1);
    }

    public void stopNestedScroll()
    {
        ag.stopNestedScroll();
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

    private class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        bi a;
        final Rect b;
        boolean c;
        boolean d;

        public LayoutParams(int i1, int j1)
        {
            super(i1, j1);
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

        public static final android.os.Parcelable.Creator CREATOR = new bc();
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
            a = parcel.readParcelable(android/support/v7/widget/au.getClassLoader());
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
