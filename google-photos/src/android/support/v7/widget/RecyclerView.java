// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import aau;
import abl;
import abn;
import acn;
import aco;
import acp;
import acq;
import aei;
import aej;
import aek;
import ael;
import aem;
import aen;
import aeq;
import aer;
import aet;
import aeu;
import aev;
import aew;
import aex;
import aez;
import afa;
import afb;
import afc;
import afd;
import afe;
import aff;
import afg;
import afh;
import afl;
import afm;
import afn;
import afo;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcelable;
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
import b;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import jk;
import lt;
import ly;
import lz;
import me;
import mg;
import mk;
import nw;
import ot;
import qw;
import rl;

public class RecyclerView extends ViewGroup
    implements ly, me
{

    private static final Interpolator an = new aek();
    private static final boolean y;
    private static final Class z[];
    private final afg A;
    private afh B;
    private boolean C;
    private final Runnable D;
    private final Rect E;
    private final ArrayList F;
    private afb G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private int L;
    private boolean M;
    private final boolean N;
    private final AccessibilityManager O;
    private int P;
    private int Q;
    private VelocityTracker R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    public final afe a;
    private float aa;
    private afc ab;
    private List ac;
    private aet ad;
    private boolean ae;
    private afo af;
    private aeq ag;
    private final int ah[];
    private final lz ai;
    private final int aj[];
    private final int ak[];
    private final int al[];
    private Runnable am;
    public abl b;
    public acn c;
    public aen d;
    public aex e;
    public aff f;
    public final ArrayList g;
    public boolean h;
    public boolean i;
    public boolean j;
    public List k;
    public boolean l;
    public qw m;
    public qw n;
    public qw o;
    public qw p;
    public aer q;
    public int r;
    public final int s;
    public final int t;
    public final afm u;
    public final afl v;
    public boolean w;
    public boolean x;

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
        A = new afg(this);
        a = new afe(this);
        D = new aei(this);
        E = new Rect();
        g = new ArrayList();
        F = new ArrayList();
        l = false;
        P = 0;
        q = new acq();
        r = 0;
        Q = -1;
        aa = 1.401298E-45F;
        u = new afm(this);
        v = new afl();
        w = false;
        x = false;
        ad = new aeu(this);
        ae = false;
        ah = new int[2];
        aj = new int[2];
        ak = new int[2];
        al = new int[2];
        am = new aej(this);
        setScrollContainer(true);
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
        N = flag;
        obj = ViewConfiguration.get(context);
        W = ((ViewConfiguration) (obj)).getScaledTouchSlop();
        s = ((ViewConfiguration) (obj)).getScaledMinimumFlingVelocity();
        t = ((ViewConfiguration) (obj)).getScaledMaximumFlingVelocity();
        if (mk.a(this) == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setWillNotDraw(flag);
        q.h = ad;
        b = new abl(new aem(this));
        c = new acn(new ael(this));
        if (mk.e(this) == 0)
        {
            mk.c(this, 1);
        }
        O = (AccessibilityManager)getContext().getSystemService("accessibility");
        af = new afo(this);
        mk.a(this, af);
        if (attributeset == null) goto _L2; else goto _L1
_L1:
        obj = context.obtainStyledAttributes(attributeset, aau.a, i1, 0);
        obj1 = ((TypedArray) (obj)).getString(aau.c);
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
        class1 = ((ClassLoader) (obj1)).loadClass(((String) (obj))).asSubclass(aex);
        obj1 = class1.getConstructor(z);
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
            a((aex)((Constructor) (obj1)).newInstance(context));
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
        ai = new lz(this);
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

    public static int a(RecyclerView recyclerview, afn afn1)
    {
        if (!afn1.a(524) && afn1.n()) goto _L2; else goto _L1
_L1:
        int i1 = -1;
_L4:
        return i1;
_L2:
        int j1;
        int l1;
        int i2;
        recyclerview = recyclerview.b;
        j1 = afn1.b;
        i2 = ((abl) (recyclerview)).a.size();
        l1 = 0;
_L10:
        i1 = j1;
        if (l1 >= i2) goto _L4; else goto _L3
_L3:
        afn1 = (abn)((abl) (recyclerview)).a.get(l1);
        i1 = j1;
        ((abn) (afn1)).a;
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
        if (((abn) (afn1)).b <= j1)
        {
            i1 = j1 + ((abn) (afn1)).d;
        }
          goto _L11
_L7:
        i1 = j1;
        if (((abn) (afn1)).b <= j1)
        {
            if (((abn) (afn1)).b + ((abn) (afn1)).d > j1)
            {
                return -1;
            }
            i1 = j1 - ((abn) (afn1)).d;
        }
          goto _L11
        if (((abn) (afn1)).b == j1)
        {
            i1 = ((abn) (afn1)).d;
        } else
        {
            int k1 = j1;
            if (((abn) (afn1)).b < j1)
            {
                k1 = j1 - 1;
            }
            i1 = k1;
            if (((abn) (afn1)).d <= k1)
            {
                i1 = k1 + 1;
            }
        }
          goto _L11
    }

    private void a(aew aew1)
    {
        View view = aew1.a.a;
        a(aew1.a);
        int i1 = aew1.b;
        int j1 = aew1.c;
        int k1 = view.getLeft();
        int l1 = view.getTop();
        if (!aew1.a.o() && (i1 != k1 || j1 != l1))
        {
            aew1.a.a(false);
            view.layout(k1, l1, view.getWidth() + k1, view.getHeight() + l1);
            if (q.a(aew1.a, i1, j1, k1, l1))
            {
                u();
            }
        } else
        {
            aew1.a.a(false);
            if (q.a(aew1.a))
            {
                u();
                return;
            }
        }
    }

    private void a(afn afn1)
    {
        View view = afn1.a;
        boolean flag;
        if (view.getParent() == this)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a.b(a(view));
        if (afn1.p())
        {
            c.a(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!flag)
        {
            c.a(view, -1, true);
            return;
        }
        afn1 = c;
        int i1 = ((acn) (afn1)).a.a(view);
        if (i1 < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("view is not a child, cannot hide ")).append(view).toString());
        } else
        {
            ((acn) (afn1)).b.a(i1);
            afn1.a(view);
            return;
        }
    }

    public static void a(RecyclerView recyclerview, int i1)
    {
        recyclerview.detachViewFromParent(i1);
    }

    public static void a(RecyclerView recyclerview, int i1, int j1)
    {
        recyclerview.c(i1, j1);
    }

    public static void a(RecyclerView recyclerview, View view)
    {
        b(view);
        if (recyclerview.k != null)
        {
            for (int i1 = recyclerview.k.size() - 1; i1 >= 0; i1--)
            {
                recyclerview.k.get(i1);
            }

        }
    }

    public static void a(RecyclerView recyclerview, View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        recyclerview.attachViewToParent(view, i1, layoutparams);
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = lt.b(motionevent);
        if (lt.b(motionevent, i1) == Q)
        {
            int j1;
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            Q = lt.b(motionevent, i1);
            j1 = (int)(lt.c(motionevent, i1) + 0.5F);
            U = j1;
            S = j1;
            i1 = (int)(lt.d(motionevent, i1) + 0.5F);
            V = i1;
            T = i1;
        }
    }

    private void a(jk jk1)
    {
        List list = v.e;
        int i1 = list.size() - 1;
        while (i1 >= 0) 
        {
            View view = (View)list.get(i1);
            afn afn1 = b(view);
            aew aew1 = (aew)v.b.remove(afn1);
            if (!v.j)
            {
                v.c.remove(afn1);
            }
            if (jk1.remove(view) != null)
            {
                e.removeAndRecycleView(view, a);
            } else
            if (aew1 != null)
            {
                a(aew1);
            } else
            {
                a(new aew(afn1, view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            }
            i1--;
        }
        list.clear();
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
        m();
        if (d != null)
        {
            a();
            s();
            b.a("RV Scroll");
            l1 = ((flag4) ? 1 : 0);
            if (i1 != 0)
            {
                k1 = e.scrollHorizontallyBy(i1, a, v);
                l1 = i1 - k1;
            }
            i2 = ((flag3) ? 1 : 0);
            j2 = ((flag2) ? 1 : 0);
            if (j1 != 0)
            {
                i2 = e.scrollVerticallyBy(j1, a, v);
                j2 = j1 - i2;
            }
            b.a();
            if (h())
            {
                int l2 = c.a();
                k2 = 0;
                while (k2 < l2) 
                {
                    View view = c.c(k2);
                    Object obj = a(view);
                    if (obj == null || ((afn) (obj)).h == null)
                    {
                        continue;
                    }
                    obj = ((afn) (obj)).h;
                    int i3;
                    int j3;
                    if (obj != null)
                    {
                        obj = ((afn) (obj)).a;
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
            t();
            a(false);
            k2 = k1;
        }
        if (!g.isEmpty())
        {
            invalidate();
        }
        if (dispatchNestedScroll(k2, i2, l1, j2, aj))
        {
            U = U - aj[0];
            V = V - aj[1];
            if (motionevent != null)
            {
                motionevent.offsetLocation(aj[0], aj[1]);
            }
            motionevent = al;
            motionevent[0] = motionevent[0] + aj[0];
            motionevent = al;
            motionevent[1] = motionevent[1] + aj[1];
        } else
        if (mk.a(this) != 2)
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
                    b();
                    flag = flag1;
                    if (m.a(-f2 / (float)getWidth(), 1.0F - f3 / (float)getHeight()))
                    {
                        flag = true;
                    }
                } else
                {
                    flag = flag1;
                    if (f2 > 0.0F)
                    {
                        c();
                        flag = flag1;
                        if (o.a(f2 / (float)getWidth(), f3 / (float)getHeight()))
                        {
                            flag = true;
                        }
                    }
                }
                if (f4 < 0.0F)
                {
                    d();
                    flag1 = flag;
                    if (n.a(-f4 / (float)getHeight(), f1 / (float)getWidth()))
                    {
                        flag1 = true;
                    }
                } else
                {
                    flag1 = flag;
                    if (f4 > 0.0F)
                    {
                        e();
                        flag1 = flag;
                        if (p.a(f4 / (float)getHeight(), 1.0F - f1 / (float)getWidth()))
                        {
                            flag1 = true;
                        }
                    }
                }
                if (flag1 || f2 != 0.0F || f4 != 0.0F)
                {
                    mk.d(this);
                }
            }
            c(i1, j1);
        }
        if (k2 != 0 || i2 != 0)
        {
            a(k2, i2);
        }
        if (!awakenScrollBars())
        {
            invalidate();
        }
        return k2 != 0 || i2 != 0;
    }

    public static boolean a(RecyclerView recyclerview)
    {
        return recyclerview.i;
    }

    public static boolean a(RecyclerView recyclerview, boolean flag)
    {
        recyclerview.ae = false;
        return false;
    }

    private long b(afn afn1)
    {
        if (d.b)
        {
            return afn1.d;
        } else
        {
            return (long)afn1.b;
        }
    }

    public static afn b(View view)
    {
        if (view == null)
        {
            return null;
        } else
        {
            return ((aez)view.getLayoutParams()).c;
        }
    }

    public static void b(RecyclerView recyclerview, int i1)
    {
        recyclerview.c(i1);
    }

    public static void b(RecyclerView recyclerview, int i1, int j1)
    {
        recyclerview.d(i1, j1);
    }

    public static void b(RecyclerView recyclerview, View view)
    {
        recyclerview.f(view);
    }

    private boolean b(int i1, int j1)
    {
        if (e != null) goto _L2; else goto _L1
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
            if (j)
            {
                continue; /* Loop/switch isn't completed */
            }
            flag = e.canScrollHorizontally();
            flag1 = e.canScrollVertically();
            if (flag)
            {
                k1 = i1;
                if (Math.abs(i1) >= s)
                {
                    break label0;
                }
            }
            k1 = 0;
        }
        if (flag1)
        {
            i1 = j1;
            if (Math.abs(j1) >= s)
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
            j1 = Math.max(-t, Math.min(k1, t));
            i1 = Math.max(-t, Math.min(i1, t));
            afm afm1 = u;
            afm1.d.c(2);
            afm1.b = 0;
            afm1.a = 0;
            afm1.c.a(0, 0, j1, i1, 0x80000000, 0x7fffffff, 0x80000000, 0x7fffffff);
            afm1.a();
            return true;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public static boolean b(RecyclerView recyclerview)
    {
        return recyclerview.l;
    }

    public static boolean b(RecyclerView recyclerview, boolean flag)
    {
        recyclerview.M = true;
        return true;
    }

    private void c(int i1)
    {
        if (i1 != r) goto _L2; else goto _L1
_L1:
        return;
_L2:
        r = i1;
        if (i1 != 2)
        {
            o();
        }
        if (e != null)
        {
            e.onScrollStateChanged(i1);
        }
        if (ab != null)
        {
            ab.a(this, i1);
        }
        if (ac != null)
        {
            int j1 = ac.size() - 1;
            while (j1 >= 0) 
            {
                ((afc)ac.get(j1)).a(this, i1);
                j1--;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void c(int i1, int j1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (m != null)
        {
            flag = flag1;
            if (!m.a())
            {
                flag = flag1;
                if (i1 > 0)
                {
                    flag = m.c();
                }
            }
        }
        flag1 = flag;
        if (o != null)
        {
            flag1 = flag;
            if (!o.a())
            {
                flag1 = flag;
                if (i1 < 0)
                {
                    flag1 = flag | o.c();
                }
            }
        }
        flag = flag1;
        if (n != null)
        {
            flag = flag1;
            if (!n.a())
            {
                flag = flag1;
                if (j1 > 0)
                {
                    flag = flag1 | n.c();
                }
            }
        }
        flag1 = flag;
        if (p != null)
        {
            flag1 = flag;
            if (!p.a())
            {
                flag1 = flag;
                if (j1 < 0)
                {
                    flag1 = flag | p.c();
                }
            }
        }
        if (flag1)
        {
            mk.d(this);
        }
    }

    public static void c(RecyclerView recyclerview, int i1)
    {
        if (recyclerview.e != null)
        {
            recyclerview.e.scrollToPosition(i1);
            recyclerview.awakenScrollBars();
        }
    }

    public static void c(RecyclerView recyclerview, int i1, int j1)
    {
        recyclerview.setMeasuredDimension(i1, j1);
    }

    public static boolean c(RecyclerView recyclerview)
    {
        return recyclerview.J;
    }

    public static boolean c(RecyclerView recyclerview, View view)
    {
        boolean flag = true;
        recyclerview.a();
        acn acn1 = recyclerview.c;
        int i1 = acn1.a.a(view);
        if (i1 == -1)
        {
            acn1.b(view);
        } else
        if (acn1.b.b(i1))
        {
            acn1.b.c(i1);
            acn1.b(view);
            acn1.a.a(i1);
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
            return view.d();
        } else
        {
            return -1;
        }
    }

    public static aex d(RecyclerView recyclerview)
    {
        return recyclerview.e;
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
            i1 = mk.p(this);
            // fall through

        case -2147483648: 
        case 1073741824: 
            switch (k1)
            {
            default:
                j1 = mk.q(this);
                // fall through

            case -2147483648: 
            case 1073741824: 
                setMeasuredDimension(i1, j1);
                break;
            }
            break;
        }
    }

    public static void e(RecyclerView recyclerview)
    {
        recyclerview.m();
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
            afn afn1 = b(c.c(k1));
            if (!afn1.b())
            {
                int i2 = afn1.d();
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

    public static aen f(RecyclerView recyclerview)
    {
        return recyclerview.d;
    }

    private void f(View view)
    {
        b(view);
        if (k != null)
        {
            for (int i1 = k.size() - 1; i1 >= 0; i1--)
            {
                ((afa)k.get(i1)).a(view);
            }

        }
    }

    public static void g(RecyclerView recyclerview)
    {
        recyclerview.s();
    }

    public static boolean h(RecyclerView recyclerview)
    {
        return recyclerview.h();
    }

    public static void i(RecyclerView recyclerview)
    {
        recyclerview.t();
    }

    public static ArrayList j(RecyclerView recyclerview)
    {
        return recyclerview.g;
    }

    public static Interpolator k()
    {
        return an;
    }

    public static boolean k(RecyclerView recyclerview)
    {
        return recyclerview.awakenScrollBars();
    }

    public static void l(RecyclerView recyclerview)
    {
        if (!recyclerview.l)
        {
            recyclerview.l = true;
            int k1 = recyclerview.c.b();
            for (int i1 = 0; i1 < k1; i1++)
            {
                afn afn1 = b(recyclerview.c.d(i1));
                if (afn1 != null && !afn1.b())
                {
                    afn1.b(512);
                }
            }

            recyclerview = recyclerview.a;
            k1 = ((afe) (recyclerview)).c.size();
            for (int j1 = 0; j1 < k1; j1++)
            {
                afn afn2 = (afn)((afe) (recyclerview)).c.get(j1);
                if (afn2 != null)
                {
                    afn2.b(512);
                }
            }

        }
    }

    public static boolean l()
    {
        return y;
    }

    private void m()
    {
        D.run();
    }

    public static boolean m(RecyclerView recyclerview)
    {
        return recyclerview.N;
    }

    private void n()
    {
        c(0);
        o();
    }

    public static boolean n(RecyclerView recyclerview)
    {
        return recyclerview.h;
    }

    private void o()
    {
        afm afm1 = u;
        afm1.d.removeCallbacks(afm1);
        afm1.c.f();
        if (e != null)
        {
            e.stopSmoothScroller();
        }
    }

    public static boolean o(RecyclerView recyclerview)
    {
        return recyclerview.H;
    }

    public static Runnable p(RecyclerView recyclerview)
    {
        return recyclerview.D;
    }

    private void p()
    {
        p = null;
        n = null;
        o = null;
        m = null;
    }

    public static afo q(RecyclerView recyclerview)
    {
        return recyclerview.af;
    }

    private void q()
    {
        if (R != null)
        {
            R.clear();
        }
        stopNestedScroll();
        boolean flag1 = false;
        if (m != null)
        {
            flag1 = m.c();
        }
        boolean flag = flag1;
        if (n != null)
        {
            flag = flag1 | n.c();
        }
        flag1 = flag;
        if (o != null)
        {
            flag1 = flag | o.c();
        }
        flag = flag1;
        if (p != null)
        {
            flag = flag1 | p.c();
        }
        if (flag)
        {
            mk.d(this);
        }
    }

    public static aff r(RecyclerView recyclerview)
    {
        return recyclerview.f;
    }

    private void r()
    {
        q();
        c(0);
    }

    private void s()
    {
        P = P + 1;
    }

    public static boolean s(RecyclerView recyclerview)
    {
        return recyclerview.C;
    }

    public static afm t(RecyclerView recyclerview)
    {
        return recyclerview.u;
    }

    private void t()
    {
        P = P - 1;
        if (P <= 0)
        {
            P = 0;
            int i1 = L;
            L = 0;
            if (i1 != 0 && f())
            {
                AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain();
                accessibilityevent.setEventType(2048);
                ot.a(accessibilityevent, i1);
                sendAccessibilityEventUnchecked(accessibilityevent);
            }
        }
    }

    private void u()
    {
        if (!ae && H)
        {
            mk.a(this, am);
            ae = true;
        }
    }

    private void v()
    {
        boolean flag;
        boolean flag1;
        boolean flag2 = true;
        if (l)
        {
            b.a();
            x();
            e.onItemsChanged(this);
        }
        afl afl1;
        if (q != null && e.supportsPredictiveItemAnimations())
        {
            b.b();
        } else
        {
            b.e();
        }
        if (w && !x || w || x && h())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        afl1 = v;
        if (i && q != null && (l || flag || aex.access$1900(e)) && (!l || d.b))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        afl1.k = flag1;
        afl1 = v;
        if (!v.k || !flag || l) goto _L2; else goto _L1
_L1:
        if (q != null && e.supportsPredictiveItemAnimations())
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
        afl1.l = flag1;
        return;
_L2:
        flag1 = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void w()
    {
        boolean flag = false;
        int i2 = c.b();
        for (int i1 = 0; i1 < i2; i1++)
        {
            afn afn1 = b(c.d(i1));
            if (!afn1.b())
            {
                afn1.a();
            }
        }

        afe afe1 = a;
        i2 = afe1.c.size();
        for (int j1 = 0; j1 < i2; j1++)
        {
            ((afn)afe1.c.get(j1)).a();
        }

        i2 = afe1.a.size();
        for (int k1 = 0; k1 < i2; k1++)
        {
            ((afn)afe1.a.get(k1)).a();
        }

        if (afe1.b != null)
        {
            int j2 = afe1.b.size();
            for (int l1 = ((flag) ? 1 : 0); l1 < j2; l1++)
            {
                ((afn)afe1.b.get(l1)).a();
            }

        }
    }

    private void x()
    {
        int k1 = c.b();
        for (int i1 = 0; i1 < k1; i1++)
        {
            afn afn1 = b(c.d(i1));
            if (afn1 != null && !afn1.b())
            {
                afn1.b(6);
            }
        }

        j();
        afe afe1 = a;
        if (afe1.e.d != null && afe1.e.d.b)
        {
            int l1 = afe1.c.size();
            for (int j1 = 0; j1 < l1; j1++)
            {
                afn afn2 = (afn)afe1.c.get(j1);
                if (afn2 != null)
                {
                    afn2.b(6);
                    afn2.a(null);
                }
            }

        } else
        {
            afe1.b();
        }
    }

    public final afn a(int i1, boolean flag)
    {
        int k1 = c.b();
        for (int j1 = 0; j1 < k1; j1++)
        {
            afn afn1 = b(c.d(j1));
            if (afn1 != null && !afn1.o() && (flag ? afn1.b == i1 : afn1.d() == i1))
            {
                return afn1;
            }
        }

        return null;
    }

    public final afn a(View view)
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

    public final View a(float f1, float f2)
    {
        for (int i1 = c.a() - 1; i1 >= 0; i1--)
        {
            View view = c.c(i1);
            float f3 = mk.n(view);
            float f4 = mk.o(view);
            if (f1 >= (float)view.getLeft() + f3 && f1 <= f3 + (float)view.getRight() && f2 >= (float)view.getTop() + f4 && f2 <= (float)view.getBottom() + f4)
            {
                return view;
            }
        }

        return null;
    }

    public final void a()
    {
        if (!I)
        {
            I = true;
            if (!j)
            {
                J = false;
            }
        }
    }

    public final void a(int i1)
    {
        if (j)
        {
            return;
        }
        n();
        if (e == null)
        {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        } else
        {
            e.scrollToPosition(i1);
            awakenScrollBars();
            return;
        }
    }

    public final void a(int i1, int j1)
    {
        int k1 = getScrollX();
        int i2 = getScrollY();
        onScrollChanged(k1, i2, k1, i2);
        if (ab != null)
        {
            ab.a(this, i1, j1);
        }
        if (ac != null)
        {
            for (int l1 = ac.size() - 1; l1 >= 0; l1--)
            {
                ((afc)ac.get(l1)).a(this, i1, j1);
            }

        }
    }

    public final void a(int i1, int j1, boolean flag)
    {
        int l1 = c.b();
        int k1 = 0;
        while (k1 < l1) 
        {
            afn afn1 = b(c.d(k1));
            if (afn1 != null && !afn1.b())
            {
                if (afn1.b >= i1 + j1)
                {
                    afn1.a(-j1, flag);
                    v.i = true;
                } else
                if (afn1.b >= i1)
                {
                    int i2 = -j1;
                    afn1.b(8);
                    afn1.a(i2, flag);
                    afn1.b = i1 - 1;
                    v.i = true;
                }
            }
            k1++;
        }
        afe afe1 = a;
        k1 = afe1.c.size() - 1;
        while (k1 >= 0) 
        {
            afn afn2 = (afn)afe1.c.get(k1);
            if (afn2 != null)
            {
                if (afn2.d() >= i1 + j1)
                {
                    afn2.a(-j1, flag);
                } else
                if (afn2.d() >= i1)
                {
                    afn2.b(8);
                    afe1.c(k1);
                }
            }
            k1--;
        }
        requestLayout();
    }

    public final void a(aen aen1)
    {
        if (j)
        {
            a("Do not setLayoutFrozen in layout or scroll");
            j = false;
            if (J && e != null && d != null)
            {
                requestLayout();
            }
            J = false;
        }
        if (d != null)
        {
            d.b(A);
        }
        if (q != null)
        {
            q.d();
        }
        if (e != null)
        {
            e.removeAndRecycleAllViews(a);
            e.removeAndRecycleScrapInt(a);
        }
        a.a();
        b.a();
        aen aen2 = d;
        d = aen1;
        if (aen1 != null)
        {
            aen1.a(A);
        }
        if (e != null)
        {
            e.onAdapterChanged(aen2, d);
        }
        Object obj = a;
        aen1 = d;
        ((afe) (obj)).a();
        obj = ((afe) (obj)).c();
        if (aen2 != null)
        {
            obj.b = ((afd) (obj)).b - 1;
        }
        if (((afd) (obj)).b == 0)
        {
            ((afd) (obj)).a.clear();
        }
        if (aen1 != null)
        {
            obj.b = ((afd) (obj)).b + 1;
        }
        v.i = true;
        x();
        requestLayout();
    }

    public final void a(aeq aeq1)
    {
        if (aeq1 == ag)
        {
            return;
        }
        ag = aeq1;
        boolean flag;
        if (ag != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setChildrenDrawingOrderEnabled(flag);
    }

    public final void a(aer aer1)
    {
        if (q != null)
        {
            q.d();
            q.h = null;
        }
        q = aer1;
        if (q != null)
        {
            q.h = ad;
        }
    }

    public final void a(aev aev1)
    {
        if (e != null)
        {
            e.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (g.isEmpty())
        {
            setWillNotDraw(false);
        }
        g.add(aev1);
        j();
        requestLayout();
    }

    public final void a(aex aex1)
    {
        if (aex1 == e)
        {
            return;
        }
        if (e != null)
        {
            if (H)
            {
                e.dispatchDetachedFromWindow(this, a);
            }
            e.setRecyclerView(null);
        }
        a.a();
        acn acn1 = c;
        acn1.b.a();
        for (int i1 = acn1.c.size() - 1; i1 >= 0; i1--)
        {
            acn1.a.d((View)acn1.c.get(i1));
            acn1.c.remove(i1);
        }

        acn1.a.b();
        e = aex1;
        if (aex1 != null)
        {
            if (aex1.mRecyclerView != null)
            {
                throw new IllegalArgumentException((new StringBuilder("LayoutManager ")).append(aex1).append(" is already attached to a RecyclerView: ").append(aex1.mRecyclerView).toString());
            }
            e.setRecyclerView(this);
            if (H)
            {
                e.dispatchAttachedToWindow(this);
            }
        }
        requestLayout();
    }

    public final void a(afb afb1)
    {
        F.add(afb1);
    }

    public void a(afc afc1)
    {
        ab = afc1;
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
        if (I)
        {
            if (flag && J && !j && e != null && d != null)
            {
                i();
            }
            I = false;
            if (!j)
            {
                J = false;
            }
        }
    }

    public void addFocusables(ArrayList arraylist, int i1, int j1)
    {
        if (e == null || !e.onAddFocusables(this, arraylist, i1, j1))
        {
            super.addFocusables(arraylist, i1, j1);
        }
    }

    public final afn b(int i1)
    {
        return a(i1, false);
    }

    public final void b()
    {
        if (m != null)
        {
            return;
        }
        m = new qw(getContext());
        if (C)
        {
            m.a(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
            return;
        } else
        {
            m.a(getMeasuredHeight(), getMeasuredWidth());
            return;
        }
    }

    public final void b(afb afb1)
    {
        F.remove(afb1);
        if (G == afb1)
        {
            G = null;
        }
    }

    public void b(afc afc1)
    {
        if (ac == null)
        {
            ac = new ArrayList();
        }
        ac.add(afc1);
    }

    public final int c(View view)
    {
        view = b(view);
        if (view != null)
        {
            return view.e();
        } else
        {
            return -1;
        }
    }

    public final void c()
    {
        if (o != null)
        {
            return;
        }
        o = new qw(getContext());
        if (C)
        {
            o.a(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
            return;
        } else
        {
            o.a(getMeasuredHeight(), getMeasuredWidth());
            return;
        }
    }

    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof aez) && e.checkLayoutParams((aez)layoutparams);
    }

    public int computeHorizontalScrollExtent()
    {
        if (e.canScrollHorizontally())
        {
            return e.computeHorizontalScrollExtent(v);
        } else
        {
            return 0;
        }
    }

    public int computeHorizontalScrollOffset()
    {
        if (e.canScrollHorizontally())
        {
            return e.computeHorizontalScrollOffset(v);
        } else
        {
            return 0;
        }
    }

    public int computeHorizontalScrollRange()
    {
        if (e.canScrollHorizontally())
        {
            return e.computeHorizontalScrollRange(v);
        } else
        {
            return 0;
        }
    }

    public int computeVerticalScrollExtent()
    {
        if (e.canScrollVertically())
        {
            return e.computeVerticalScrollExtent(v);
        } else
        {
            return 0;
        }
    }

    public int computeVerticalScrollOffset()
    {
        if (e.canScrollVertically())
        {
            return e.computeVerticalScrollOffset(v);
        } else
        {
            return 0;
        }
    }

    public int computeVerticalScrollRange()
    {
        if (e.canScrollVertically())
        {
            return e.computeVerticalScrollRange(v);
        } else
        {
            return 0;
        }
    }

    public final void d()
    {
        if (n != null)
        {
            return;
        }
        n = new qw(getContext());
        if (C)
        {
            n.a(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
            return;
        } else
        {
            n.a(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
    }

    public boolean dispatchNestedFling(float f1, float f2, boolean flag)
    {
        lz lz1 = ai;
        if (lz1.c && lz1.b != null)
        {
            return nw.a(lz1.b, lz1.a, f1, f2, flag);
        } else
        {
            return false;
        }
    }

    public boolean dispatchNestedPreFling(float f1, float f2)
    {
        lz lz1 = ai;
        if (lz1.c && lz1.b != null)
        {
            return nw.a(lz1.b, lz1.a, f1, f2);
        } else
        {
            return false;
        }
    }

    public boolean dispatchNestedPreScroll(int i1, int j1, int ai1[], int ai2[])
    {
label0:
        {
label1:
            {
                {
                    boolean flag1 = true;
                    boolean flag2 = false;
                    lz lz1 = ai;
                    if (!lz1.c || lz1.b == null)
                    {
                        break label0;
                    }
                    if (i1 == 0 && j1 == 0)
                    {
                        break label1;
                    }
                    int ai3[];
                    int k1;
                    int l1;
                    boolean flag;
                    if (ai2 != null)
                    {
                        lz1.a.getLocationInWindow(ai2);
                        l1 = ai2[0];
                        k1 = ai2[1];
                    } else
                    {
                        k1 = 0;
                        l1 = 0;
                    }
                    ai3 = ai1;
                    if (ai1 == null)
                    {
                        if (lz1.d == null)
                        {
                            lz1.d = new int[2];
                        }
                        ai3 = lz1.d;
                    }
                    ai3[0] = 0;
                    ai3[1] = 0;
                    nw.a(lz1.b, lz1.a, i1, j1, ai3);
                    if (ai2 != null)
                    {
                        lz1.a.getLocationInWindow(ai2);
                        ai2[0] = ai2[0] - l1;
                        ai2[1] = ai2[1] - k1;
                    }
                    flag = flag1;
                    if (ai3[0] == 0)
                    {
                        flag = flag2;
                        if (ai3[1] != 0)
                        {
                            flag = flag1;
                        }
                    }
                }
                return flag;
            }
            if (ai2 != null)
            {
                ai2[0] = 0;
                ai2[1] = 0;
            }
        }
        flag = false;
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_183;
        }
    }

    public boolean dispatchNestedScroll(int i1, int j1, int k1, int l1, int ai1[])
    {
        lz lz1 = ai;
        if (lz1.c && lz1.b != null)
        {
            if (i1 != 0 || j1 != 0 || k1 != 0 || l1 != 0)
            {
                int i2;
                int j2;
                if (ai1 != null)
                {
                    lz1.a.getLocationInWindow(ai1);
                    j2 = ai1[0];
                    i2 = ai1[1];
                } else
                {
                    i2 = 0;
                    j2 = 0;
                }
                nw.a(lz1.b, lz1.a, i1, j1, k1, l1);
                if (ai1 != null)
                {
                    lz1.a.getLocationInWindow(ai1);
                    ai1[0] = ai1[0] - j2;
                    ai1[1] = ai1[1] - i2;
                }
                return true;
            }
            if (ai1 != null)
            {
                ai1[0] = 0;
                ai1[1] = 0;
            }
        }
        return false;
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
        int k1 = g.size();
        for (int i1 = 0; i1 < k1; i1++)
        {
            ((aev)g.get(i1)).b(canvas, this);
        }

        int j1;
        if (m != null && !m.a())
        {
            int l1 = canvas.save();
            int i2;
            if (C)
            {
                j1 = getPaddingBottom();
            } else
            {
                j1 = 0;
            }
            canvas.rotate(270F);
            canvas.translate(j1 + -getHeight(), 0.0F);
            if (m != null && m.a(canvas))
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
        if (n != null)
        {
            j1 = k1;
            if (!n.a())
            {
                l1 = canvas.save();
                if (C)
                {
                    canvas.translate(getPaddingLeft(), getPaddingTop());
                }
                if (n != null && n.a(canvas))
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
        if (o != null)
        {
            k1 = j1;
            if (!o.a())
            {
                l1 = canvas.save();
                i2 = getWidth();
                if (C)
                {
                    k1 = getPaddingTop();
                } else
                {
                    k1 = 0;
                }
                canvas.rotate(90F);
                canvas.translate(-k1, -i2);
                if (o != null && o.a(canvas))
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
        if (p != null)
        {
            j1 = k1;
            if (!p.a())
            {
                l1 = canvas.save();
                canvas.rotate(180F);
                if (C)
                {
                    canvas.translate(-getWidth() + getPaddingRight(), -getHeight() + getPaddingBottom());
                } else
                {
                    canvas.translate(-getWidth(), -getHeight());
                }
                j1 = ((flag1) ? 1 : 0);
                if (p != null)
                {
                    j1 = ((flag1) ? 1 : 0);
                    if (p.a(canvas))
                    {
                        j1 = 1;
                    }
                }
                j1 = k1 | j1;
                canvas.restoreToCount(l1);
            }
        }
        if (j1 == 0 && q != null && g.size() > 0 && q.b())
        {
            j1 = ((flag) ? 1 : 0);
        }
        if (j1 != 0)
        {
            mk.d(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long l1)
    {
        return super.drawChild(canvas, view, l1);
    }

    public final Rect e(View view)
    {
        aez aez1 = (aez)view.getLayoutParams();
        if (!aez1.e)
        {
            return aez1.d;
        }
        Rect rect = aez1.d;
        rect.set(0, 0, 0, 0);
        int j1 = g.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            E.set(0, 0, 0, 0);
            ((aev)g.get(i1)).a(E, view, this);
            rect.left = rect.left + E.left;
            rect.top = rect.top + E.top;
            rect.right = rect.right + E.right;
            rect.bottom = rect.bottom + E.bottom;
        }

        aez1.e = false;
        return rect;
    }

    public final void e()
    {
        if (p != null)
        {
            return;
        }
        p = new qw(getContext());
        if (C)
        {
            p.a(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
            return;
        } else
        {
            p.a(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
    }

    public final boolean f()
    {
        return O != null && O.isEnabled();
    }

    public View focusSearch(View view, int i1)
    {
        View view2 = e.onInterceptFocusSearch(view, i1);
        if (view2 == null)
        {
            view2 = FocusFinder.getInstance().findNextFocus(this, view, i1);
            View view1 = view2;
            if (view2 == null)
            {
                view1 = view2;
                if (d != null)
                {
                    view1 = view2;
                    if (e != null)
                    {
                        view1 = view2;
                        if (!g())
                        {
                            view1 = view2;
                            if (!j)
                            {
                                a();
                                view1 = e.onFocusSearchFailed(view, i1, a, v);
                                a(false);
                            }
                        }
                    }
                }
            }
            view2 = view1;
            if (view1 == null)
            {
                return super.focusSearch(view, i1);
            }
        }
        return view2;
    }

    public final boolean g()
    {
        return P > 0;
    }

    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        if (e == null)
        {
            throw new IllegalStateException("RecyclerView has no LayoutManager");
        } else
        {
            return e.generateDefaultLayoutParams();
        }
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        if (e == null)
        {
            throw new IllegalStateException("RecyclerView has no LayoutManager");
        } else
        {
            return e.generateLayoutParams(getContext(), attributeset);
        }
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (e == null)
        {
            throw new IllegalStateException("RecyclerView has no LayoutManager");
        } else
        {
            return e.generateLayoutParams(layoutparams);
        }
    }

    public int getBaseline()
    {
        if (e != null)
        {
            return e.getBaseline();
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
            return ag.a(i1, j1);
        }
    }

    public boolean h()
    {
        return q != null && q.e();
    }

    public boolean hasNestedScrollingParent()
    {
        return ai.a();
    }

    public final void i()
    {
        if (d != null) goto _L2; else goto _L1
_L1:
        Log.e("RecyclerView", "No adapter attached; skipping layout");
_L19:
        return;
_L2:
        Object obj;
        int j3;
        if (e == null)
        {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        v.e.clear();
        a();
        s();
        v();
        Object obj2 = v;
        int i1;
        int k1;
        if (v.k && x && h())
        {
            obj = new jk();
        } else
        {
            obj = null;
        }
        obj2.d = ((jk) (obj));
        x = false;
        w = false;
        v.j = v.l;
        v.f = d.a();
        obj = ah;
        j3 = c.a();
        if (j3 != 0) goto _L4; else goto _L3
_L3:
        obj[0] = 0;
        obj[1] = 0;
_L8:
        if (v.k)
        {
            v.b.clear();
            v.c.clear();
            k1 = c.a();
            for (i1 = 0; i1 < k1; i1++)
            {
                obj = b(c.c(i1));
                if (!((afn) (obj)).b() && (!((afn) (obj)).k() || d.b))
                {
                    obj2 = ((afn) (obj)).a;
                    v.b.put(obj, new aew(((afn) (obj)), ((View) (obj2)).getLeft(), ((View) (obj2)).getTop(), ((View) (obj2)).getRight(), ((View) (obj2)).getBottom()));
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
        afn afn1 = b(c.c(k2));
        j2 = j1;
        if (afn1.b())
        {
            break MISSING_BLOCK_LABEL_2057;
        }
        int i3 = afn1.d();
        l1 = j1;
        if (i3 < j1)
        {
            l1 = i3;
        }
        j2 = l1;
        if (i3 <= i2)
        {
            break MISSING_BLOCK_LABEL_2057;
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
        if (!v.l) goto _L10; else goto _L9
_L9:
        Object obj3;
        l1 = c.b();
        for (j1 = 0; j1 < l1; j1++)
        {
            obj = b(c.d(j1));
            if (!((afn) (obj)).b() && ((afn) (obj)).c == -1)
            {
                obj.c = ((afn) (obj)).b;
            }
        }

        if (v.d != null)
        {
            l1 = c.a();
            for (j1 = 0; j1 < l1; j1++)
            {
                obj = b(c.c(j1));
                if (((afn) (obj)).m() && !((afn) (obj)).o() && !((afn) (obj)).b())
                {
                    long l3 = b(((afn) (obj)));
                    v.d.put(Long.valueOf(l3), obj);
                    v.b.remove(obj);
                }
            }

        }
        boolean flag = v.i;
        v.i = false;
        e.onLayoutChildren(a, v);
        v.i = flag;
        obj3 = new jk();
        j1 = 0;
_L17:
        if (j1 >= c.a()) goto _L12; else goto _L11
_L11:
        obj = c.c(j1);
        if (b(((View) (obj))).b()) goto _L14; else goto _L13
_L13:
        l1 = 0;
_L18:
        if (l1 >= v.b.size())
        {
            break MISSING_BLOCK_LABEL_2051;
        }
        if (((afn)v.b.b(l1)).a != obj) goto _L16; else goto _L15
_L15:
        l1 = 1;
_L21:
        if (l1 == 0)
        {
            ((jk) (obj3)).put(obj, new Rect(((View) (obj)).getLeft(), ((View) (obj)).getTop(), ((View) (obj)).getRight(), ((View) (obj)).getBottom()));
        }
_L14:
        j1++;
          goto _L17
_L16:
        l1++;
          goto _L18
_L12:
        w();
        b.c();
_L20:
        v.f = d.a();
        v.h = 0;
        v.j = false;
        e.onLayoutChildren(a, v);
        v.i = false;
        B = null;
        afl afl1 = v;
        boolean flag1;
        if (v.k && q != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        afl1.k = flag1;
        if (v.k)
        {
            Object obj1;
            if (v.d != null)
            {
                obj1 = new jk();
            } else
            {
                obj1 = null;
            }
            l1 = c.a();
            j1 = 0;
            while (j1 < l1) 
            {
                afn afn2 = b(c.c(j1));
                if (!afn2.b())
                {
                    View view = afn2.a;
                    long l4 = b(afn2);
                    if (obj1 != null && v.d.get(Long.valueOf(l4)) != null)
                    {
                        ((jk) (obj1)).put(Long.valueOf(l4), afn2);
                    } else
                    {
                        v.c.put(afn2, new aew(afn2, view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
                    }
                }
                j1++;
            }
            a(((jk) (obj3)));
            for (j1 = v.b.size() - 1; j1 >= 0; j1--)
            {
                afn afn3 = (afn)v.b.b(j1);
                if (!v.c.containsKey(afn3))
                {
                    aew aew1 = (aew)v.b.c(j1);
                    v.b.d(j1);
                    View view1 = aew1.a.a;
                    a.b(aew1.a);
                    a(aew1);
                }
            }

            j1 = v.c.size();
            if (j1 > 0)
            {
                j1--;
                while (j1 >= 0) 
                {
                    afn afn4 = (afn)v.c.b(j1);
                    Object obj5 = (aew)v.c.c(j1);
                    if (v.b.isEmpty() || !v.b.containsKey(afn4))
                    {
                        v.c.d(j1);
                        Rect rect;
                        if (obj3 != null)
                        {
                            rect = (Rect)((jk) (obj3)).get(afn4.a);
                        } else
                        {
                            rect = null;
                        }
                        l1 = ((aew) (obj5)).b;
                        i2 = ((aew) (obj5)).c;
                        obj5 = afn4.a;
                        if (rect != null && (rect.left != l1 || rect.top != i2))
                        {
                            afn4.a(false);
                            if (q.a(afn4, rect.left, rect.top, l1, i2))
                            {
                                u();
                            }
                        } else
                        {
                            afn4.a(false);
                            if (q.b(afn4))
                            {
                                u();
                            }
                        }
                    }
                    j1--;
                }
            }
            l1 = v.c.size();
            for (j1 = 0; j1 < l1; j1++)
            {
                obj3 = (afn)v.c.b(j1);
                aew aew2 = (aew)v.c.c(j1);
                aew aew3 = (aew)v.b.get(obj3);
                if (aew3 == null || aew2 == null || aew3.b == aew2.b && aew3.c == aew2.c)
                {
                    continue;
                }
                ((afn) (obj3)).a(false);
                if (q.a(((afn) (obj3)), aew3.b, aew3.c, aew2.b, aew2.c))
                {
                    u();
                }
            }

            if (v.d != null)
            {
                j1 = v.d.size();
            } else
            {
                j1 = 0;
            }
            j1--;
            while (j1 >= 0) 
            {
                long l5 = ((Long)v.d.b(j1)).longValue();
                obj3 = (afn)v.d.get(Long.valueOf(l5));
                Object obj4 = ((afn) (obj3)).a;
                if (((afn) (obj3)).b() || a.b == null || !a.b.contains(obj3))
                {
                    continue;
                }
                obj4 = (afn)((jk) (obj1)).get(Long.valueOf(l5));
                ((afn) (obj3)).a(false);
                a(((afn) (obj3)));
                obj3.g = ((afn) (obj4));
                a.b(((afn) (obj3)));
                j2 = ((afn) (obj3)).a.getLeft();
                int l2 = ((afn) (obj3)).a.getTop();
                if (obj4 == null || ((afn) (obj4)).b())
                {
                    i2 = l2;
                    l1 = j2;
                } else
                {
                    l1 = ((afn) (obj4)).a.getLeft();
                    i2 = ((afn) (obj4)).a.getTop();
                    ((afn) (obj4)).a(false);
                    obj4.h = ((afn) (obj3));
                }
                if (q.a(((afn) (obj3)), ((afn) (obj4)), j2, l2, l1, i2))
                {
                    u();
                }
                j1--;
            }
        }
        a(false);
        e.removeAndRecycleScrapInt(a);
        v.g = v.f;
        l = false;
        v.k = false;
        v.l = false;
        t();
        aex.access$1902(e, false);
        if (a.b != null)
        {
            a.b.clear();
        }
        v.d = null;
        if (e(ah[0], ah[1]))
        {
            a(0, 0);
            return;
        }
          goto _L19
_L10:
        w();
        b.e();
        if (v.d != null)
        {
            l1 = c.a();
            for (j1 = 0; j1 < l1; j1++)
            {
                obj1 = b(c.c(j1));
                if (((afn) (obj1)).m() && !((afn) (obj1)).o() && !((afn) (obj1)).b())
                {
                    l4 = b(((afn) (obj1)));
                    v.d.put(Long.valueOf(l4), obj1);
                    v.b.remove(obj1);
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

    public boolean isAttachedToWindow()
    {
        return H;
    }

    public boolean isNestedScrollingEnabled()
    {
        return ai.c;
    }

    public final void j()
    {
        boolean flag = false;
        int k1 = c.b();
        for (int i1 = 0; i1 < k1; i1++)
        {
            ((aez)c.d(i1).getLayoutParams()).e = true;
        }

        afe afe1 = a;
        k1 = afe1.c.size();
        for (int j1 = ((flag) ? 1 : 0); j1 < k1; j1++)
        {
            aez aez1 = (aez)((afn)afe1.c.get(j1)).a.getLayoutParams();
            if (aez1 != null)
            {
                aez1.e = true;
            }
        }

    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        P = 0;
        H = true;
        i = false;
        if (e != null)
        {
            e.dispatchAttachedToWindow(this);
        }
        ae = false;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (q != null)
        {
            q.d();
        }
        i = false;
        n();
        H = false;
        if (e != null)
        {
            e.dispatchDetachedFromWindow(this, a);
        }
        removeCallbacks(am);
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int j1 = g.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            ((aev)g.get(i1)).a(canvas, this);
        }

    }

    public boolean onGenericMotionEvent(MotionEvent motionevent)
    {
        float f3;
        f3 = 0.0F;
        break MISSING_BLOCK_LABEL_3;
        if (e != null && !j && (lt.d(motionevent) & 2) != 0 && motionevent.getAction() == 8)
        {
            float f1;
            float f2;
            if (e.canScrollVertically())
            {
                f1 = -lt.e(motionevent, 9);
            } else
            {
                f1 = 0.0F;
            }
            if (e.canScrollHorizontally())
            {
                f2 = lt.e(motionevent, 10);
            } else
            {
                f2 = 0.0F;
            }
            if (f1 != 0.0F || f2 != 0.0F)
            {
label0:
                {
                    if (aa == 1.401298E-45F)
                    {
                        TypedValue typedvalue = new TypedValue();
                        if (!getContext().getTheme().resolveAttribute(0x101004d, typedvalue, true))
                        {
                            break label0;
                        }
                        aa = typedvalue.getDimension(getContext().getResources().getDisplayMetrics());
                    }
                    f3 = aa;
                }
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
        if (!j) goto _L2; else goto _L1
_L1:
        flag = false;
_L15:
        return flag;
_L2:
        int i1;
        int j1;
        int l1;
        j1 = motionevent.getAction();
        if (j1 == 3 || j1 == 0)
        {
            G = null;
        }
        l1 = F.size();
        i1 = 0;
_L5:
        afb afb1;
        if (i1 >= l1)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        afb1 = (afb)F.get(i1);
        if (!afb1.onInterceptTouchEvent(this, motionevent) || j1 == 3) goto _L4; else goto _L3
_L3:
        G = afb1;
        i1 = 1;
_L6:
        if (i1 != 0)
        {
            r();
            return true;
        }
        break MISSING_BLOCK_LABEL_116;
_L4:
        i1++;
          goto _L5
        i1 = 0;
          goto _L6
        boolean flag1;
        boolean flag2;
        if (e == null)
        {
            return false;
        }
        flag1 = e.canScrollHorizontally();
        flag2 = e.canScrollVertically();
        if (R == null)
        {
            R = VelocityTracker.obtain();
        }
        R.addMovement(motionevent);
        j1 = lt.a(motionevent);
        i1 = lt.b(motionevent);
        j1;
        JVM INSTR tableswitch 0 6: default 220
    //                   0 230
    //                   1 651
    //                   2 401
    //                   3 665
    //                   4 220
    //                   5 344
    //                   6 643;
           goto _L7 _L8 _L9 _L10 _L11 _L7 _L12 _L13
_L11:
        break MISSING_BLOCK_LABEL_665;
_L7:
        break; /* Loop/switch isn't completed */
_L8:
        break; /* Loop/switch isn't completed */
_L16:
        if (r != 1)
        {
            return false;
        }
        if (true) goto _L15; else goto _L14
_L14:
        if (K)
        {
            K = false;
        }
        Q = lt.b(motionevent, 0);
        i1 = (int)(motionevent.getX() + 0.5F);
        U = i1;
        S = i1;
        i1 = (int)(motionevent.getY() + 0.5F);
        V = i1;
        T = i1;
        if (r == 2)
        {
            getParent().requestDisallowInterceptTouchEvent(true);
            c(1);
        }
        int k1;
        int i2;
        int j2;
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
          goto _L16
_L12:
        Q = lt.b(motionevent, i1);
        k1 = (int)(lt.c(motionevent, i1) + 0.5F);
        U = k1;
        S = k1;
        i1 = (int)(lt.d(motionevent, i1) + 0.5F);
        V = i1;
        T = i1;
          goto _L16
_L10:
        k1 = lt.a(motionevent, Q);
        if (k1 < 0)
        {
            Log.e("RecyclerView", (new StringBuilder("Error processing scroll; pointer index for id ")).append(Q).append(" not found. Did any MotionEvents get skipped?").toString());
            return false;
        }
        i1 = (int)(lt.c(motionevent, k1) + 0.5F);
        k1 = (int)(lt.d(motionevent, k1) + 0.5F);
        if (r != 1)
        {
            i1 -= S;
            i2 = k1 - T;
            if (flag1 && Math.abs(i1) > W)
            {
                k1 = S;
                j2 = W;
                if (i1 < 0)
                {
                    i1 = -1;
                } else
                {
                    i1 = 1;
                }
                U = i1 * j2 + k1;
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            k1 = i1;
            if (flag2)
            {
                k1 = i1;
                if (Math.abs(i2) > W)
                {
                    k1 = T;
                    j2 = W;
                    if (i2 < 0)
                    {
                        i1 = byte0;
                    } else
                    {
                        i1 = 1;
                    }
                    V = k1 + i1 * j2;
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
                c(1);
            }
        }
          goto _L16
_L13:
        a(motionevent);
          goto _L16
_L9:
        R.clear();
        stopNestedScroll();
          goto _L16
        r();
          goto _L16
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        a();
        b.a("RV OnLayout");
        i();
        b.a();
        a(false);
        i = true;
    }

    protected void onMeasure(int i1, int j1)
    {
        if (M)
        {
            a();
            v();
            if (v.l)
            {
                v.j = true;
            } else
            {
                b.e();
                v.j = false;
            }
            M = false;
            a(false);
        }
        if (d != null)
        {
            v.f = d.a();
        } else
        {
            v.f = 0;
        }
        if (e == null)
        {
            d(i1, j1);
        } else
        {
            e.onMeasure(a, v, i1, j1);
        }
        v.j = false;
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        B = (afh)parcelable;
        super.onRestoreInstanceState(B.getSuperState());
        if (e != null && B.a != null)
        {
            e.onRestoreInstanceState(B.a);
        }
    }

    protected Parcelable onSaveInstanceState()
    {
        afh afh1 = new afh(super.onSaveInstanceState());
        if (B != null)
        {
            afh.a(afh1, B);
            return afh1;
        }
        if (e != null)
        {
            afh1.a = e.onSaveInstanceState();
            return afh1;
        } else
        {
            afh1.a = null;
            return afh1;
        }
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (i1 != k1 || j1 != l1)
        {
            p();
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag = false;
        if (!j && !K) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i1 = motionevent.getAction();
        if (G == null) goto _L4; else goto _L3
_L3:
        if (i1 != 0) goto _L6; else goto _L5
_L5:
        G = null;
_L4:
        int j1;
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        j1 = F.size();
        i1 = 0;
_L10:
        Object obj;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        obj = (afb)F.get(i1);
        if (!((afb) (obj)).onInterceptTouchEvent(this, motionevent)) goto _L8; else goto _L7
_L7:
        G = ((afb) (obj));
        i1 = 1;
_L9:
        if (i1 != 0)
        {
            r();
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        G.onTouchEvent(this, motionevent);
        if (i1 == 3 || i1 == 1)
        {
            G = null;
        }
        i1 = 1;
          goto _L9
_L8:
        i1++;
          goto _L10
        i1 = 0;
          goto _L9
        if (e == null) goto _L1; else goto _L11
_L11:
        int k1;
        boolean flag1;
        boolean flag2;
        flag1 = e.canScrollHorizontally();
        flag2 = e.canScrollVertically();
        if (R == null)
        {
            R = VelocityTracker.obtain();
        }
        obj = MotionEvent.obtain(motionevent);
        k1 = lt.a(motionevent);
        j1 = lt.b(motionevent);
        if (k1 == 0)
        {
            int ai1[] = al;
            al[1] = 0;
            ai1[0] = 0;
        }
        ((MotionEvent) (obj)).offsetLocation(al[0], al[1]);
        i1 = ((flag) ? 1 : 0);
        k1;
        JVM INSTR tableswitch 0 6: default 308
    //                   0 333
    //                   1 962
    //                   2 492
    //                   3 1070
    //                   4 312
    //                   5 425
    //                   6 950;
           goto _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L17:
        break; /* Loop/switch isn't completed */
_L12:
        i1 = ((flag) ? 1 : 0);
_L21:
        if (i1 == 0)
        {
            R.addMovement(((MotionEvent) (obj)));
        }
        ((MotionEvent) (obj)).recycle();
        return true;
_L13:
        Q = lt.b(motionevent, 0);
        i1 = (int)(motionevent.getX() + 0.5F);
        U = i1;
        S = i1;
        i1 = (int)(motionevent.getY() + 0.5F);
        V = i1;
        T = i1;
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
_L18:
        Q = lt.b(motionevent, j1);
        i1 = (int)(lt.c(motionevent, j1) + 0.5F);
        U = i1;
        S = i1;
        i1 = (int)(lt.d(motionevent, j1) + 0.5F);
        V = i1;
        T = i1;
        i1 = ((flag) ? 1 : 0);
        continue; /* Loop/switch isn't completed */
_L15:
        i1 = lt.a(motionevent, Q);
        if (i1 < 0)
        {
            Log.e("RecyclerView", (new StringBuilder("Error processing scroll; pointer index for id ")).append(Q).append(" not found. Did any MotionEvents get skipped?").toString());
            return false;
        }
        l2 = (int)(lt.c(motionevent, i1) + 0.5F);
        i3 = (int)(lt.d(motionevent, i1) + 0.5F);
        i2 = U - l2;
        l1 = V - i3;
        i1 = l1;
        j1 = i2;
        if (dispatchNestedPreScroll(i2, l1, ak, aj))
        {
            j1 = i2 - ak[0];
            i1 = l1 - ak[1];
            ((MotionEvent) (obj)).offsetLocation(aj[0], aj[1]);
            motionevent = al;
            motionevent[0] = motionevent[0] + aj[0];
            motionevent = al;
            motionevent[1] = motionevent[1] + aj[1];
        }
        l1 = i1;
        i2 = j1;
        if (r != 1)
        {
            if (flag1 && Math.abs(j1) > W)
            {
                if (j1 > 0)
                {
                    j1 -= W;
                } else
                {
                    j1 += W;
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
                if (Math.abs(i1) > W)
                {
                    if (i1 > 0)
                    {
                        j2 = i1 - W;
                    } else
                    {
                        j2 = i1 + W;
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
                c(1);
                i2 = j1;
                l1 = j2;
            }
        }
        i1 = ((flag) ? 1 : 0);
        if (r == 1)
        {
            U = l2 - aj[0];
            V = i3 - aj[1];
            if (!flag1)
            {
                i2 = 0;
            }
            if (!flag2)
            {
                l1 = 0;
            }
            i1 = ((flag) ? 1 : 0);
            if (a(i2, l1, ((MotionEvent) (obj))))
            {
                getParent().requestDisallowInterceptTouchEvent(true);
                i1 = ((flag) ? 1 : 0);
            }
        }
        continue; /* Loop/switch isn't completed */
_L19:
        a(motionevent);
        i1 = ((flag) ? 1 : 0);
        continue; /* Loop/switch isn't completed */
_L14:
        R.addMovement(((MotionEvent) (obj)));
        R.computeCurrentVelocity(1000, t);
        if (flag1)
        {
            f1 = -mg.a(R, Q);
        } else
        {
            f1 = 0.0F;
        }
        if (flag2)
        {
            f2 = -mg.b(R, Q);
        } else
        {
            f2 = 0.0F;
        }
        if (f1 == 0.0F && f2 == 0.0F || !b((int)f1, (int)f2))
        {
            c(0);
        }
        q();
        i1 = 1;
        continue; /* Loop/switch isn't completed */
_L16:
        r();
        i1 = ((flag) ? 1 : 0);
        if (true) goto _L21; else goto _L20
_L20:
    }

    public void removeDetachedView(View view, boolean flag)
    {
        afn afn1 = b(view);
        if (afn1 != null)
        {
            if (afn1.p())
            {
                afn1.j();
            } else
            if (!afn1.b())
            {
                throw new IllegalArgumentException((new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.")).append(afn1).toString());
            }
        }
        f(view);
        super.removeDetachedView(view, flag);
    }

    public void requestChildFocus(View view, View view1)
    {
        if (!e.onRequestChildFocus(this, v, view, view1) && view1 != null)
        {
            E.set(0, 0, view1.getWidth(), view1.getHeight());
            Object obj = view1.getLayoutParams();
            if (obj instanceof aez)
            {
                obj = (aez)obj;
                if (!((aez) (obj)).e)
                {
                    obj = ((aez) (obj)).d;
                    Rect rect = E;
                    rect.left = rect.left - ((Rect) (obj)).left;
                    rect = E;
                    rect.right = rect.right + ((Rect) (obj)).right;
                    rect = E;
                    rect.top = rect.top - ((Rect) (obj)).top;
                    rect = E;
                    int i1 = rect.bottom;
                    rect.bottom = ((Rect) (obj)).bottom + i1;
                }
            }
            offsetDescendantRectToMyCoords(view1, E);
            offsetRectIntoDescendantCoords(view, E);
            obj = E;
            boolean flag;
            if (!i)
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
        return e.requestChildRectangleOnScreen(this, view, rect, flag);
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
        int j1 = F.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            ((afb)F.get(i1)).onRequestDisallowInterceptTouchEvent(flag);
        }

        super.requestDisallowInterceptTouchEvent(flag);
    }

    public void requestLayout()
    {
        if (!I && !j)
        {
            super.requestLayout();
            return;
        } else
        {
            J = true;
            return;
        }
    }

    public void scrollBy(int i1, int j1)
    {
        if (e == null)
        {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else
        if (!j)
        {
            boolean flag = e.canScrollHorizontally();
            boolean flag1 = e.canScrollVertically();
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
        if (g())
        {
            if (accessibilityevent != null)
            {
                i1 = ot.b(accessibilityevent);
            } else
            {
                i1 = 0;
            }
            if (i1 == 0)
            {
                i1 = ((flag) ? 1 : 0);
            }
            L = i1 | L;
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
        if (flag != C)
        {
            p();
        }
        C = flag;
        super.setClipToPadding(flag);
        if (i)
        {
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean flag)
    {
        lz lz1 = ai;
        if (lz1.c)
        {
            mk.y(lz1.a);
        }
        lz1.c = flag;
    }

    public boolean startNestedScroll(int i1)
    {
        lz lz1 = ai;
        if (lz1.a())
        {
            return true;
        }
        if (lz1.c)
        {
            ViewParent viewparent = lz1.a.getParent();
            View view = lz1.a;
            for (; viewparent != null; viewparent = viewparent.getParent())
            {
                if (nw.a(viewparent, view, lz1.a, i1))
                {
                    lz1.b = viewparent;
                    nw.b(viewparent, view, lz1.a, i1);
                    return true;
                }
                if (viewparent instanceof View)
                {
                    view = (View)viewparent;
                }
            }

        }
        return false;
    }

    public void stopNestedScroll()
    {
        lz lz1 = ai;
        if (lz1.b != null)
        {
            nw.a(lz1.b, lz1.a);
            lz1.b = null;
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
        y = flag;
        z = (new Class[] {
            android/content/Context, android/util/AttributeSet, Integer.TYPE, Integer.TYPE
        });
    }
}
