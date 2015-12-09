// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import aav;
import aaw;
import aay;
import aaz;
import aba;
import abb;
import abc;
import abd;
import abe;
import abf;
import abg;
import abh;
import abi;
import abj;
import abm;
import abn;
import abo;
import abp;
import aca;
import acb;
import acc;
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
import gr;
import hc;
import hd;
import hg;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import jo;
import ju;
import jv;
import kg;
import ki;
import km;
import ld;
import mw;
import pf;
import pz;
import yt;
import zi;
import zj;
import zk;
import zu;
import zv;
import zw;
import zx;

public class RecyclerView extends ViewGroup
    implements ju, kg
{

    private static final Interpolator ai = new Interpolator() {

        public final float getInterpolation(float f1)
        {
            f1--;
            return f1 * (f1 * f1 * f1 * f1) + 1.0F;
        }

    };
    private static final boolean t;
    private static final Class u[];
    private final ArrayList A;
    private final ArrayList B;
    private abe C;
    private boolean D;
    private boolean E;
    private boolean F;
    private int G;
    private boolean H;
    private final boolean I;
    private final AccessibilityManager J;
    private int K;
    private int L;
    private VelocityTracker M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private final int R;
    private final int S;
    private float T;
    private abn U;
    private List V;
    private aaz W;
    public final abh a;
    private boolean aa;
    private abp ab;
    private final int ac[];
    private final jv ad;
    private final int ae[];
    private final int af[];
    private final int ag[];
    private Runnable ah;
    private final acc aj;
    public zi b;
    public zu c;
    public final aca d;
    public aav e;
    public abd f;
    public boolean g;
    public boolean h;
    public boolean i;
    public pf j;
    public pf k;
    public pf l;
    public pf m;
    public aay n;
    public int o;
    public int p;
    public final abm q;
    boolean r;
    boolean s;
    private final abj v;
    private SavedState w;
    private boolean x;
    private final Runnable y;
    private final Rect z;

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
        v = new abj(this, (byte)0);
        a = new abh(this);
        d = new aca();
        y = new Runnable() {

            private RecyclerView a;

            public final void run()
            {
                if (!RecyclerView.a(a) || a.isLayoutRequested())
                {
                    return;
                } else
                {
                    RecyclerView.q();
                    RecyclerView.b(a);
                    return;
                }
            }

            
            {
                a = RecyclerView.this;
                super();
            }
        };
        z = new Rect();
        A = new ArrayList();
        B = new ArrayList();
        i = false;
        K = 0;
        n = new zx();
        o = 0;
        L = -1;
        T = 1.401298E-45F;
        U = new abn(this);
        q = new abm();
        r = false;
        s = false;
        W = new abb(this, (byte)0);
        aa = false;
        ac = new int[2];
        ae = new int[2];
        af = new int[2];
        ag = new int[2];
        ah = new Runnable() {

            private RecyclerView a;

            public final void run()
            {
                if (a.n != null)
                {
                    a.n.a();
                }
                RecyclerView.c(a);
            }

            
            {
                a = RecyclerView.this;
                super();
            }
        };
        aj = new acc() {

            private RecyclerView a;

            public final void a(abo abo1)
            {
                RecyclerView.f(a).a(abo1.a, a.a);
            }

            public final void a(abo abo1, aba aba1, aba aba2)
            {
                a.a.b(abo1);
                RecyclerView.a(a, abo1, aba1, aba2);
            }

            public final void b(abo abo1, aba aba1, aba aba2)
            {
                RecyclerView.b(a, abo1, aba1, aba2);
            }

            public final void c(abo abo1, aba aba1, aba aba2)
            {
                abo1.a(false);
                if (RecyclerView.d(a))
                {
                    if (a.n.a(abo1, abo1, aba1, aba2))
                    {
                        RecyclerView.e(a);
                    }
                } else
                if (a.n.c(abo1, aba1, aba2))
                {
                    RecyclerView.e(a);
                    return;
                }
            }

            
            {
                a = RecyclerView.this;
                super();
            }
        };
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
        I = flag;
        obj = ViewConfiguration.get(context);
        p = ((ViewConfiguration) (obj)).getScaledTouchSlop();
        R = ((ViewConfiguration) (obj)).getScaledMinimumFlingVelocity();
        S = ((ViewConfiguration) (obj)).getScaledMaximumFlingVelocity();
        if (km.a(this) == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setWillNotDraw(flag);
        n.h = W;
        b = new zi(new zj() {

            private RecyclerView a;

            private void c(zk zk1)
            {
                switch (zk1.a)
                {
                case 3: // '\003'
                case 5: // '\005'
                case 6: // '\006'
                case 7: // '\007'
                default:
                    return;

                case 1: // '\001'
                    RecyclerView.f(a).a(a, zk1.b, zk1.d);
                    return;

                case 2: // '\002'
                    RecyclerView.f(a).b(a, zk1.b, zk1.d);
                    return;

                case 4: // '\004'
                    RecyclerView.f(a).c(a, zk1.b, zk1.d);
                    return;

                case 8: // '\b'
                    RecyclerView.f(a).a(a, zk1.b, zk1.d, 1);
                    break;
                }
            }

            public final abo a(int j1)
            {
                RecyclerView recyclerview;
                int k1;
                int l1;
                recyclerview = a;
                l1 = recyclerview.c.b();
                k1 = 0;
_L6:
                if (k1 >= l1) goto _L2; else goto _L1
_L1:
                abo abo1 = RecyclerView.b(recyclerview.c.c(k1));
                if (abo1 == null || abo1.n() || abo1.b != j1) goto _L4; else goto _L3
_L4:
                k1++;
                  goto _L5
_L2:
                abo1 = null;
_L3:
                if (abo1 == null || a.c.d(abo1.a))
                {
                    return null;
                }
                return abo1;
_L5:
                if (true) goto _L6; else goto _L2
            }

            public final void a(int j1, int k1)
            {
                a.a(j1, k1, true);
                a.r = true;
                abm abm1 = a.q;
                abm1.d = abm1.d + k1;
            }

            public final void a(int j1, int k1, Object obj2)
            {
                RecyclerView recyclerview = a;
                int j2 = recyclerview.c.b();
                for (int l1 = 0; l1 < j2; l1++)
                {
                    View view = recyclerview.c.c(l1);
                    abo abo2 = RecyclerView.b(view);
                    if (abo2 != null && !abo2.E_() && abo2.b >= j1 && abo2.b < j1 + k1)
                    {
                        abo2.b(2);
                        abo2.a(obj2);
                        ((LayoutParams)view.getLayoutParams()).e = true;
                    }
                }

                obj2 = recyclerview.a;
                for (int i2 = ((abh) (obj2)).c.size() - 1; i2 >= 0; i2--)
                {
                    abo abo1 = (abo)((abh) (obj2)).c.get(i2);
                    if (abo1 == null)
                    {
                        continue;
                    }
                    int k2 = abo1.c();
                    if (k2 >= j1 && k2 < j1 + k1)
                    {
                        abo1.b(2);
                        ((abh) (obj2)).c(i2);
                    }
                }

                a.s = true;
            }

            public final void a(zk zk1)
            {
                c(zk1);
            }

            public final void b(int j1, int k1)
            {
                a.a(j1, k1, false);
                a.r = true;
            }

            public final void b(zk zk1)
            {
                c(zk1);
            }

            public final void c(int j1, int k1)
            {
                RecyclerView recyclerview = a;
                int j2 = recyclerview.c.b();
                for (int l1 = 0; l1 < j2; l1++)
                {
                    abo abo1 = RecyclerView.b(recyclerview.c.c(l1));
                    if (abo1 != null && !abo1.E_() && abo1.b >= j1)
                    {
                        abo1.a(k1, false);
                        recyclerview.q.e = true;
                    }
                }

                abh abh1 = recyclerview.a;
                j2 = abh1.c.size();
                for (int i2 = 0; i2 < j2; i2++)
                {
                    abo abo2 = (abo)abh1.c.get(i2);
                    if (abo2 != null && abo2.c() >= j1)
                    {
                        abo2.a(k1, true);
                    }
                }

                recyclerview.requestLayout();
                a.r = true;
            }

            public final void d(int j1, int k1)
            {
                int k2 = -1;
                RecyclerView recyclerview = a;
                int l2 = recyclerview.c.b();
                byte byte0;
                int l1;
                int i2;
                int j2;
                if (j1 < k1)
                {
                    byte0 = -1;
                    l1 = k1;
                    i2 = j1;
                } else
                {
                    byte0 = 1;
                    l1 = j1;
                    i2 = k1;
                }
                j2 = 0;
                while (j2 < l2) 
                {
                    abo abo1 = RecyclerView.b(recyclerview.c.c(j2));
                    if (abo1 != null && abo1.b >= i2 && abo1.b <= l1)
                    {
                        if (abo1.b == j1)
                        {
                            abo1.a(k1 - j1, false);
                        } else
                        {
                            abo1.a(byte0, false);
                        }
                        recyclerview.q.e = true;
                    }
                    j2++;
                }
                abh abh1 = recyclerview.a;
                if (j1 < k1)
                {
                    l1 = k1;
                    i2 = j1;
                    byte0 = k2;
                } else
                {
                    byte0 = 1;
                    l1 = j1;
                    i2 = k1;
                }
                k2 = abh1.c.size();
                j2 = 0;
                while (j2 < k2) 
                {
                    abo abo2 = (abo)abh1.c.get(j2);
                    if (abo2 != null && abo2.b >= i2 && abo2.b <= l1)
                    {
                        if (abo2.b == j1)
                        {
                            abo2.a(k1 - j1, false);
                        } else
                        {
                            abo2.a(byte0, false);
                        }
                    }
                    j2++;
                }
                recyclerview.requestLayout();
                a.r = true;
            }

            
            {
                a = RecyclerView.this;
                super();
            }

            private class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
            {

                public abo c;
                public final Rect d;
                public boolean e;
                public boolean f;

                public LayoutParams()
                {
                    super(-2, -2);
                    d = new Rect();
                    e = true;
                    f = false;
                }

                public LayoutParams(Context context, AttributeSet attributeset)
                {
                    super(context, attributeset);
                    d = new Rect();
                    e = true;
                    f = false;
                }

                public LayoutParams(LayoutParams layoutparams)
                {
                    super(layoutparams);
                    d = new Rect();
                    e = true;
                    f = false;
                }

                public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
                {
                    super(layoutparams);
                    d = new Rect();
                    e = true;
                    f = false;
                }

                public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
                {
                    super(marginlayoutparams);
                    d = new Rect();
                    e = true;
                    f = false;
                }
            }

        });
        c = new zu(new zw() {

            private RecyclerView a;

            public final int a()
            {
                return a.getChildCount();
            }

            public final int a(View view)
            {
                return a.indexOfChild(view);
            }

            public final void a(int j1)
            {
                View view = a.getChildAt(j1);
                if (view != null)
                {
                    RecyclerView.b(a, view);
                }
                a.removeViewAt(j1);
            }

            public final void a(View view, int j1)
            {
                a.addView(view, j1);
                RecyclerView.a(a, view);
            }

            public final void a(View view, int j1, android.view.ViewGroup.LayoutParams layoutparams)
            {
                abo abo1 = RecyclerView.b(view);
                if (abo1 != null)
                {
                    if (!abo1.o() && !abo1.E_())
                    {
                        throw new IllegalArgumentException((new StringBuilder("Called attach on a child which is not detached: ")).append(abo1).toString());
                    }
                    abo1.j();
                }
                RecyclerView.a(a, view, j1, layoutparams);
            }

            public final abo b(View view)
            {
                return RecyclerView.b(view);
            }

            public final View b(int j1)
            {
                return a.getChildAt(j1);
            }

            public final void b()
            {
                int k1 = a.getChildCount();
                for (int j1 = 0; j1 < k1; j1++)
                {
                    RecyclerView.b(a, b(j1));
                }

                a.removeAllViews();
            }

            public final void c(int j1)
            {
                Object obj2 = b(j1);
                if (obj2 != null)
                {
                    obj2 = RecyclerView.b(((View) (obj2)));
                    if (obj2 != null)
                    {
                        if (((abo) (obj2)).o() && !((abo) (obj2)).E_())
                        {
                            throw new IllegalArgumentException((new StringBuilder("called detach on an already detached child ")).append(obj2).toString());
                        }
                        ((abo) (obj2)).b(256);
                    }
                }
                RecyclerView.a(a, j1);
            }

            public final void c(View view)
            {
                view = RecyclerView.b(view);
                if (view != null)
                {
                    abo.a(view);
                }
            }

            public final void d(View view)
            {
                view = RecyclerView.b(view);
                if (view != null)
                {
                    abo.b(view);
                }
            }

            
            {
                a = RecyclerView.this;
                super();
            }
        });
        if (km.e(this) == 0)
        {
            km.c(this, 1);
        }
        J = (AccessibilityManager)getContext().getSystemService("accessibility");
        ab = new abp(this);
        km.a(this, ab);
        if (attributeset == null) goto _L2; else goto _L1
_L1:
        obj = context.obtainStyledAttributes(attributeset, yt.a, i1, 0);
        obj1 = ((TypedArray) (obj)).getString(yt.b);
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
        class1 = ((ClassLoader) (obj1)).loadClass(((String) (obj))).asSubclass(abd);
        obj1 = class1.getConstructor(u);
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
            a((abd)((Constructor) (obj1)).newInstance(context));
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
        ad = new jv(this);
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
        K = K - 1;
        if (K <= 0)
        {
            K = 0;
            int i1 = G;
            G = 0;
            if (i1 != 0 && n())
            {
                AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain();
                accessibilityevent.setEventType(2048);
                mw.a(accessibilityevent, i1);
                sendAccessibilityEventUnchecked(accessibilityevent);
            }
        }
    }

    private boolean B()
    {
        return K > 0;
    }

    private void C()
    {
        if (!aa && D)
        {
            km.a(this, ah);
            aa = true;
        }
    }

    private void D()
    {
        boolean flag;
        boolean flag1;
        boolean flag2 = true;
        if (i)
        {
            b.a();
            H();
            f.a(this);
        }
        abm abm1;
        if (n != null && f.d())
        {
            b.b();
        } else
        {
            b.e();
        }
        if (r || s)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        abm1 = q;
        if (h && n != null && (i || flag) && (!i || e.b))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        abm1.g = flag1;
        abm1 = q;
        if (!q.g || !flag || i) goto _L2; else goto _L1
_L1:
        if (n != null && f.d())
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
        abm1.h = flag1;
        return;
_L2:
        flag1 = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void E()
    {
        boolean flag = true;
        if (e != null) goto _L2; else goto _L1
_L1:
        Log.e("RecyclerView", "No adapter attached; skipping layout");
_L13:
        return;
_L2:
        Object obj;
        int i1;
        int l1;
        int j3;
        if (f == null)
        {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        d.a();
        h();
        z();
        D();
        obj = q;
        aba aba1;
        int j1;
        long l3;
        boolean flag1;
        if (q.g && s)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        obj.i = flag1;
        s = false;
        r = false;
        q.f = q.h;
        q.b = e.b();
        obj = ac;
        j3 = c.a();
        if (j3 == 0)
        {
            obj[0] = 0;
            obj[1] = 0;
            break MISSING_BLOCK_LABEL_154;
        }
        i1 = 0x7fffffff;
        l1 = 0x80000000;
        j2 = 0;
_L4:
        int k1;
        int i2;
        if (j2 >= j3)
        {
            break; /* Loop/switch isn't completed */
        }
        abo abo2 = b(c.b(j2));
        i2 = i1;
        if (abo2.E_())
        {
            break MISSING_BLOCK_LABEL_1682;
        }
        int l2 = abo2.c();
        k1 = i1;
        if (l2 < i1)
        {
            k1 = l2;
        }
        i2 = k1;
        if (l2 <= l1)
        {
            break MISSING_BLOCK_LABEL_1682;
        }
        i1 = l2;
_L20:
        j2++;
        l1 = i1;
        i1 = k1;
        if (true) goto _L4; else goto _L3
_L3:
        obj[0] = i1;
        obj[1] = l1;
        abo abo5;
        aba aba3;
        {
            int j2;
            if (q.g)
            {
                j1 = c.a();
                for (i1 = 0; i1 < j1; i1++)
                {
                    obj = b(c.b(i1));
                    if (!((abo) (obj)).E_() && (!((abo) (obj)).k() || e.b))
                    {
                        aay.d(((abo) (obj)));
                        ((abo) (obj)).q();
                        aba1 = (new aba()).a(((abo) (obj)));
                        d.a(((abo) (obj)), aba1);
                        if (q.i && ((abo) (obj)).t() && !((abo) (obj)).n() && !((abo) (obj)).E_() && !((abo) (obj)).k())
                        {
                            l3 = b(((abo) (obj)));
                            d.a(l3, ((abo) (obj)));
                        }
                    }
                }

            }
            abo abo3;
            aca aca3;
            acb acb5;
            long l4;
            boolean flag4;
            if (q.h)
            {
                k1 = c.b();
                for (i1 = 0; i1 < k1; i1++)
                {
                    obj = b(c.c(i1));
                    if (!((abo) (obj)).E_() && ((abo) (obj)).c == -1)
                    {
                        obj.c = ((abo) (obj)).b;
                    }
                }

                boolean flag2 = q.e;
                q.e = false;
                f.c(a, q);
                q.e = flag2;
                i1 = 0;
                while (i1 < c.a()) 
                {
                    abo abo4 = b(c.b(i1));
                    if (abo4.E_())
                    {
                        continue;
                    }
                    obj = (acb)d.a.get(abo4);
                    if (obj != null && (((acb) (obj)).a & 4) != 0)
                    {
                        k1 = 1;
                    } else
                    {
                        k1 = 0;
                    }
                    if (k1 == 0)
                    {
                        aay.d(abo4);
                        boolean flag3 = abo4.a(8192);
                        abo4.q();
                        aba aba2 = (new aba()).a(abo4);
                        if (flag3)
                        {
                            a(abo4, aba2);
                        } else
                        {
                            aca aca2 = d;
                            acb acb2 = (acb)aca2.a.get(abo4);
                            obj = acb2;
                            if (acb2 == null)
                            {
                                obj = acb.a();
                                aca2.a.put(abo4, obj);
                            }
                            obj.a = ((acb) (obj)).a | 2;
                            obj.b = aba2;
                        }
                    }
                    i1++;
                }
                G();
                b.c();
            } else
            {
                G();
            }
            q.b = e.b();
            q.d = 0;
            q.f = false;
            f.c(a, q);
            q.e = false;
            w = null;
            obj = q;
            if (q.g && n != null)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            obj.g = flag4;
            if (!q.g)
            {
                break MISSING_BLOCK_LABEL_1461;
            }
            k1 = c.a();
            i1 = 0;
        }
        if (i1 >= k1)
        {
            break MISSING_BLOCK_LABEL_1213;
        }
        abo5 = b(c.b(i1));
        if (abo5.E_()) goto _L6; else goto _L5
_L5:
        l4 = b(abo5);
        aba3 = (new aba()).a(abo5);
        obj = d.b;
        l1 = hd.a(((hg) (obj)).c, ((hg) (obj)).e, l4);
        if (l1 < 0 || ((hg) (obj)).d[l1] == hg.a)
        {
            obj = null;
        } else
        {
            obj = ((hg) (obj)).d[l1];
        }
        abo3 = (abo)obj;
        if (abo3 == null || abo3.E_())
        {
            break MISSING_BLOCK_LABEL_1153;
        }
        aca3 = d;
        l1 = aca3.a.a(abo3);
        if (l1 < 0) goto _L8; else goto _L7
_L7:
        acb5 = (acb)aca3.a.c(l1);
        if (acb5 == null || (acb5.a & 4) == 0) goto _L8; else goto _L9
_L9:
        acb5.a = acb5.a & -5;
        obj = acb5.b;
        if (acb5.a == 0)
        {
            aca3.a.d(l1);
            acb.a(acb5);
        }
_L10:
        abo3.a(false);
        if (abo3 != abo5)
        {
            abo3.g = abo5;
            a(abo3);
            a.b(abo3);
            abo5.a(false);
            abo5.h = abo3;
        }
        if (n.a(abo3, abo5, ((aba) (obj)), aba3))
        {
            C();
        }
_L6:
        i1++;
        break MISSING_BLOCK_LABEL_857;
_L8:
        obj = null;
          goto _L10
        aca aca4 = d;
        acb acb3 = (acb)aca4.a.get(abo5);
        acb acb1 = acb3;
        if (acb3 == null)
        {
            acb1 = acb.a();
            aca4.a.put(abo5, acb1);
        }
        acb1.c = aba3;
        acb1.a = acb1.a | 8;
          goto _L6
        aca aca1 = d;
        acc acc1 = aj;
        i1 = aca1.a.size() - 1;
        while (i1 >= 0) 
        {
            abo abo6 = (abo)aca1.a.b(i1);
            acb acb4 = (acb)aca1.a.d(i1);
            if ((acb4.a & 3) == 3)
            {
                acc1.a(abo6);
            } else
            if ((acb4.a & 1) != 0)
            {
                acc1.a(abo6, acb4.b, acb4.c);
            } else
            if ((acb4.a & 0xe) == 14)
            {
                acc1.b(abo6, acb4.b, acb4.c);
            } else
            if ((acb4.a & 0xc) == 12)
            {
                acc1.c(abo6, acb4.b, acb4.c);
            } else
            if ((acb4.a & 4) != 0)
            {
                acc1.a(abo6, acb4.b, null);
            } else
            if ((acb4.a & 8) != 0)
            {
                acc1.b(abo6, acb4.b, acb4.c);
            } else
            {
                k1 = acb4.a;
            }
            acb.a(acb4);
            i1--;
        }
        int k2;
        a(false);
        f.b(a);
        q.c = q.b;
        i = false;
        q.g = false;
        q.h = false;
        A();
        if (a.b != null)
        {
            a.b.clear();
        }
        d.a();
        l1 = ac[0];
        i2 = ac[1];
        k2 = c.a();
        if (k2 != 0) goto _L12; else goto _L11
_L11:
        i1 = ((flag) ? 1 : 0);
        if (l1 == 0)
        {
            if (i2 != 0)
            {
                i1 = ((flag) ? 1 : 0);
            } else
            {
                i1 = 0;
            }
        }
_L17:
        if (i1 != 0)
        {
            c(0, 0);
            return;
        }
          goto _L13
_L12:
        k1 = 0;
_L19:
        if (k1 >= k2) goto _L15; else goto _L14
_L14:
        int i3;
        abo abo1 = b(c.b(k1));
        if (abo1.E_())
        {
            continue; /* Loop/switch isn't completed */
        }
        i3 = abo1.c();
        i1 = ((flag) ? 1 : 0);
        if (i3 < l1) goto _L17; else goto _L16
_L16:
        i1 = ((flag) ? 1 : 0);
        if (i3 > i2) goto _L17; else goto _L18
_L18:
        k1++;
          goto _L19
_L15:
        i1 = 0;
          goto _L17
        i1 = l1;
        k1 = i2;
          goto _L20
    }

    private void F()
    {
        boolean flag = false;
        int k1 = c.b();
        for (int i1 = 0; i1 < k1; i1++)
        {
            ((LayoutParams)c.c(i1).getLayoutParams()).e = true;
        }

        abh abh1 = a;
        k1 = abh1.c.size();
        for (int j1 = ((flag) ? 1 : 0); j1 < k1; j1++)
        {
            LayoutParams layoutparams = (LayoutParams)((abo)abh1.c.get(j1)).a.getLayoutParams();
            if (layoutparams != null)
            {
                layoutparams.e = true;
            }
        }

    }

    private void G()
    {
        boolean flag = false;
        int i2 = c.b();
        for (int i1 = 0; i1 < i2; i1++)
        {
            abo abo1 = b(c.c(i1));
            if (!abo1.E_())
            {
                abo1.a();
            }
        }

        abh abh1 = a;
        i2 = abh1.c.size();
        for (int j1 = 0; j1 < i2; j1++)
        {
            ((abo)abh1.c.get(j1)).a();
        }

        i2 = abh1.a.size();
        for (int k1 = 0; k1 < i2; k1++)
        {
            ((abo)abh1.a.get(k1)).a();
        }

        if (abh1.b != null)
        {
            int j2 = abh1.b.size();
            for (int l1 = ((flag) ? 1 : 0); l1 < j2; l1++)
            {
                ((abo)abh1.b.get(l1)).a();
            }

        }
    }

    private void H()
    {
        int k1 = c.b();
        for (int i1 = 0; i1 < k1; i1++)
        {
            abo abo1 = b(c.c(i1));
            if (abo1 != null && !abo1.E_())
            {
                abo1.b(6);
            }
        }

        F();
        abh abh1 = a;
        if (abh1.f.e != null && abh1.f.e.b)
        {
            int l1 = abh1.c.size();
            for (int j1 = 0; j1 < l1; j1++)
            {
                abo abo2 = (abo)abh1.c.get(j1);
                if (abo2 != null)
                {
                    abo2.b(6);
                    abo2.a(null);
                }
            }

        } else
        {
            abh1.b();
        }
    }

    private void I()
    {
        int j1 = c.a();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = c.b(i1);
            Object obj = a(view);
            if (obj == null || ((abo) (obj)).h == null)
            {
                continue;
            }
            obj = ((abo) (obj)).h.a;
            int k1 = view.getLeft();
            int l1 = view.getTop();
            if (k1 != ((View) (obj)).getLeft() || l1 != ((View) (obj)).getTop())
            {
                ((View) (obj)).layout(k1, l1, ((View) (obj)).getWidth() + k1, ((View) (obj)).getHeight() + l1);
            }
        }

    }

    private void a(abo abo1)
    {
        View view = abo1.a;
        boolean flag;
        if (view.getParent() == this)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a.b(a(view));
        if (abo1.o())
        {
            c.a(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!flag)
        {
            c.a(view, -1, true);
            return;
        }
        abo1 = c;
        int i1 = ((zu) (abo1)).a.a(view);
        if (i1 < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("view is not a child, cannot hide ")).append(view).toString());
        } else
        {
            ((zu) (abo1)).b.a(i1);
            abo1.a(view);
            return;
        }
    }

    private void a(abo abo1, aba aba1)
    {
        abo1.a(0, 8192);
        if (q.i && abo1.t() && !abo1.n() && !abo1.E_())
        {
            long l1 = b(abo1);
            d.a(l1, abo1);
        }
        d.a(abo1, aba1);
    }

    static void a(RecyclerView recyclerview, int i1)
    {
        recyclerview.detachViewFromParent(i1);
    }

    public static void a(RecyclerView recyclerview, int i1, int j1)
    {
        recyclerview.d(i1, j1);
    }

    public static void a(RecyclerView recyclerview, abo abo1, aba aba1)
    {
        recyclerview.a(abo1, aba1);
    }

    static void a(RecyclerView recyclerview, abo abo1, aba aba1, aba aba2)
    {
        recyclerview.a(abo1);
        abo1.a(false);
        if (recyclerview.n.a(abo1, aba1, aba2))
        {
            recyclerview.C();
        }
    }

    static void a(RecyclerView recyclerview, View view)
    {
        view = b(view);
        if (recyclerview.e != null && view != null)
        {
            recyclerview.e.b(view);
        }
    }

    static void a(RecyclerView recyclerview, View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        recyclerview.attachViewToParent(view, i1, layoutparams);
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = jo.b(motionevent);
        if (jo.b(motionevent, i1) == L)
        {
            int j1;
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            L = jo.b(motionevent, i1);
            j1 = (int)(jo.c(motionevent, i1) + 0.5F);
            P = j1;
            N = j1;
            i1 = (int)(jo.d(motionevent, i1) + 0.5F);
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
        u();
        if (e != null)
        {
            h();
            z();
            gr.a("RV Scroll");
            l1 = ((flag4) ? 1 : 0);
            if (i1 != 0)
            {
                k1 = f.a(i1, a, q);
                l1 = i1 - k1;
            }
            i2 = ((flag3) ? 1 : 0);
            j2 = ((flag2) ? 1 : 0);
            if (j1 != 0)
            {
                i2 = f.b(j1, a, q);
                j2 = j1 - i2;
            }
            gr.a();
            I();
            A();
            a(false);
            k2 = k1;
        }
        if (!A.isEmpty())
        {
            invalidate();
        }
        if (dispatchNestedScroll(k2, i2, l1, j2, ae))
        {
            P = P - ae[0];
            Q = Q - ae[1];
            if (motionevent != null)
            {
                motionevent.offsetLocation(ae[0], ae[1]);
            }
            motionevent = ag;
            motionevent[0] = motionevent[0] + ae[0];
            motionevent = ag;
            motionevent[1] = motionevent[1] + ae[1];
        } else
        if (km.a(this) != 2)
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
                    j();
                    flag = flag1;
                    if (j.a(-f2 / (float)getWidth(), 1.0F - f3 / (float)getHeight()))
                    {
                        flag = true;
                    }
                } else
                {
                    flag = flag1;
                    if (f2 > 0.0F)
                    {
                        k();
                        flag = flag1;
                        if (l.a(f2 / (float)getWidth(), f3 / (float)getHeight()))
                        {
                            flag = true;
                        }
                    }
                }
                if (f4 < 0.0F)
                {
                    l();
                    flag1 = flag;
                    if (k.a(-f4 / (float)getHeight(), f1 / (float)getWidth()))
                    {
                        flag1 = true;
                    }
                } else
                {
                    flag1 = flag;
                    if (f4 > 0.0F)
                    {
                        m();
                        flag1 = flag;
                        if (m.a(f4 / (float)getHeight(), 1.0F - f1 / (float)getWidth()))
                        {
                            flag1 = true;
                        }
                    }
                }
                if (flag1 || f2 != 0.0F || f4 != 0.0F)
                {
                    km.d(this);
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
        return recyclerview.h;
    }

    public static boolean a(RecyclerView recyclerview, abo abo1)
    {
        return recyclerview.n == null || recyclerview.n.f(abo1);
    }

    public static int b(RecyclerView recyclerview, abo abo1)
    {
        return recyclerview.c(abo1);
    }

    private long b(abo abo1)
    {
        if (e.b)
        {
            return abo1.d;
        } else
        {
            return (long)abo1.b;
        }
    }

    public static abo b(View view)
    {
        if (view == null)
        {
            return null;
        } else
        {
            return ((LayoutParams)view.getLayoutParams()).c;
        }
    }

    public static void b(RecyclerView recyclerview)
    {
        recyclerview.u();
    }

    public static void b(RecyclerView recyclerview, int i1)
    {
        recyclerview.e(i1);
    }

    public static void b(RecyclerView recyclerview, int i1, int j1)
    {
        recyclerview.e(i1, j1);
    }

    static void b(RecyclerView recyclerview, abo abo1, aba aba1, aba aba2)
    {
        abo1.a(false);
        if (recyclerview.n.b(abo1, aba1, aba2))
        {
            recyclerview.C();
        }
    }

    static void b(RecyclerView recyclerview, View view)
    {
        recyclerview.f(view);
    }

    private int c(abo abo1)
    {
        if (!abo1.a(524) && abo1.m()) goto _L2; else goto _L1
_L1:
        int i1 = -1;
_L4:
        return i1;
_L2:
        zi zi1;
        int j1;
        int l1;
        int i2;
        zi1 = b;
        j1 = abo1.b;
        i2 = zi1.a.size();
        l1 = 0;
_L9:
        i1 = j1;
        if (l1 >= i2) goto _L4; else goto _L3
_L3:
        abo1 = (zk)zi1.a.get(l1);
        ((zk) (abo1)).a;
        JVM INSTR lookupswitch 3: default 104
    //                   1: 119
    //                   2: 142
    //                   8: 181;
           goto _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_181;
_L5:
        i1 = j1;
_L10:
        l1++;
        j1 = i1;
          goto _L9
_L6:
        i1 = j1;
        if (((zk) (abo1)).b <= j1)
        {
            i1 = j1 + ((zk) (abo1)).d;
        }
          goto _L10
_L7:
        i1 = j1;
        if (((zk) (abo1)).b <= j1)
        {
            if (((zk) (abo1)).b + ((zk) (abo1)).d > j1)
            {
                return -1;
            }
            i1 = j1 - ((zk) (abo1)).d;
        }
          goto _L10
        if (((zk) (abo1)).b == j1)
        {
            i1 = ((zk) (abo1)).d;
        } else
        {
            int k1 = j1;
            if (((zk) (abo1)).b < j1)
            {
                k1 = j1 - 1;
            }
            i1 = k1;
            if (((zk) (abo1)).d <= k1)
            {
                i1 = k1 + 1;
            }
        }
          goto _L10
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
        if (recyclerview.f != null)
        {
            recyclerview.f.c(i1);
            recyclerview.awakenScrollBars();
        }
    }

    public static void c(RecyclerView recyclerview, int i1, int j1)
    {
        recyclerview.setMeasuredDimension(i1, j1);
    }

    static boolean c(RecyclerView recyclerview)
    {
        recyclerview.aa = false;
        return false;
    }

    public static boolean c(RecyclerView recyclerview, View view)
    {
        boolean flag = true;
        recyclerview.h();
        zu zu1 = recyclerview.c;
        int i1 = zu1.a.a(view);
        if (i1 == -1)
        {
            zu1.b(view);
        } else
        if (zu1.b.c(i1))
        {
            zu1.b.d(i1);
            zu1.b(view);
            zu1.a.a(i1);
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
        if (j != null)
        {
            flag = flag1;
            if (!j.a())
            {
                flag = flag1;
                if (i1 > 0)
                {
                    flag = j.c();
                }
            }
        }
        flag1 = flag;
        if (l != null)
        {
            flag1 = flag;
            if (!l.a())
            {
                flag1 = flag;
                if (i1 < 0)
                {
                    flag1 = flag | l.c();
                }
            }
        }
        flag = flag1;
        if (k != null)
        {
            flag = flag1;
            if (!k.a())
            {
                flag = flag1;
                if (j1 > 0)
                {
                    flag = flag1 | k.c();
                }
            }
        }
        flag1 = flag;
        if (m != null)
        {
            flag1 = flag;
            if (!m.a())
            {
                flag1 = flag;
                if (j1 < 0)
                {
                    flag1 = flag | m.c();
                }
            }
        }
        if (flag1)
        {
            km.d(this);
        }
    }

    static boolean d(RecyclerView recyclerview)
    {
        return recyclerview.i;
    }

    private void e(int i1)
    {
        if (i1 != o) goto _L2; else goto _L1
_L1:
        return;
_L2:
        o = i1;
        if (i1 != 2)
        {
            v();
        }
        if (f != null)
        {
            f.g(i1);
        }
        d(i1);
        if (V != null)
        {
            int j1 = V.size() - 1;
            while (j1 >= 0) 
            {
                ((abf)V.get(j1)).a(this, i1);
                j1--;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
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
            i1 = km.o(this);
            // fall through

        case -2147483648: 
        case 1073741824: 
            switch (k1)
            {
            default:
                j1 = km.p(this);
                // fall through

            case -2147483648: 
            case 1073741824: 
                setMeasuredDimension(i1, j1);
                break;
            }
            break;
        }
    }

    static void e(RecyclerView recyclerview)
    {
        recyclerview.C();
    }

    public static abd f(RecyclerView recyclerview)
    {
        return recyclerview.f;
    }

    private void f(View view)
    {
        view = b(view);
        if (e != null && view != null)
        {
            e.c(view);
        }
    }

    public static aav g(RecyclerView recyclerview)
    {
        return recyclerview.e;
    }

    public static void h(RecyclerView recyclerview)
    {
        recyclerview.z();
    }

    public static void i(RecyclerView recyclerview)
    {
        recyclerview.I();
    }

    public static void j(RecyclerView recyclerview)
    {
        recyclerview.A();
    }

    public static ArrayList k(RecyclerView recyclerview)
    {
        return recyclerview.A;
    }

    public static boolean l(RecyclerView recyclerview)
    {
        return recyclerview.awakenScrollBars();
    }

    public static void m(RecyclerView recyclerview)
    {
        if (!recyclerview.i)
        {
            recyclerview.i = true;
            int k1 = recyclerview.c.b();
            for (int i1 = 0; i1 < k1; i1++)
            {
                abo abo1 = b(recyclerview.c.c(i1));
                if (abo1 != null && !abo1.E_())
                {
                    abo1.b(512);
                }
            }

            recyclerview = recyclerview.a;
            k1 = ((abh) (recyclerview)).c.size();
            for (int j1 = 0; j1 < k1; j1++)
            {
                abo abo2 = (abo)((abh) (recyclerview)).c.get(j1);
                if (abo2 != null)
                {
                    abo2.b(512);
                }
            }

        }
    }

    public static boolean n(RecyclerView recyclerview)
    {
        return recyclerview.I;
    }

    public static boolean o(RecyclerView recyclerview)
    {
        return recyclerview.g;
    }

    public static boolean p(RecyclerView recyclerview)
    {
        return recyclerview.D;
    }

    public static Runnable q(RecyclerView recyclerview)
    {
        return recyclerview.y;
    }

    static boolean q()
    {
        return false;
    }

    public static Interpolator r()
    {
        return ai;
    }

    public static boolean r(RecyclerView recyclerview)
    {
        recyclerview.H = true;
        return true;
    }

    public static abp s(RecyclerView recyclerview)
    {
        return recyclerview.ab;
    }

    public static boolean s()
    {
        return t;
    }

    public static abi t()
    {
        return null;
    }

    static boolean t(RecyclerView recyclerview)
    {
        return recyclerview.x;
    }

    public static abn u(RecyclerView recyclerview)
    {
        return recyclerview.U;
    }

    private void u()
    {
        boolean flag1 = false;
        if (h) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (i)
        {
            gr.a("RV FullInvalidate");
            E();
            gr.a();
            return;
        }
        if (!b.d()) goto _L1; else goto _L3
_L3:
        if (!b.a(4) || b.a(11))
        {
            continue; /* Loop/switch isn't completed */
        }
        gr.a("RV PartialInvalidate");
        h();
        b.b();
        if (F) goto _L5; else goto _L4
_L4:
        int i1;
        int j1;
        j1 = c.a();
        i1 = 0;
_L11:
        boolean flag = flag1;
        if (i1 >= j1) goto _L7; else goto _L6
_L6:
        abo abo1 = b(c.b(i1));
        if (abo1 == null || abo1.E_() || !abo1.t()) goto _L9; else goto _L8
_L8:
        flag = true;
_L7:
        if (flag)
        {
            E();
        } else
        {
            b.c();
        }
_L5:
        a(true);
        gr.a();
        return;
_L9:
        i1++;
        if (true) goto _L11; else goto _L10
_L10:
        if (!b.d()) goto _L1; else goto _L12
_L12:
        gr.a("RV FullInvalidate");
        E();
        gr.a();
        return;
    }

    private void v()
    {
        abn abn1 = U;
        abn1.d.removeCallbacks(abn1);
        abn1.c.h();
        if (f != null)
        {
            f.z();
        }
    }

    private void w()
    {
        m = null;
        k = null;
        l = null;
        j = null;
    }

    private void x()
    {
        if (M != null)
        {
            M.clear();
        }
        stopNestedScroll();
        boolean flag1 = false;
        if (j != null)
        {
            flag1 = j.c();
        }
        boolean flag = flag1;
        if (k != null)
        {
            flag = flag1 | k.c();
        }
        flag1 = flag;
        if (l != null)
        {
            flag1 = flag | l.c();
        }
        flag = flag1;
        if (m != null)
        {
            flag = flag1 | m.c();
        }
        if (flag)
        {
            km.d(this);
        }
    }

    private void y()
    {
        x();
        e(0);
    }

    private void z()
    {
        K = K + 1;
    }

    public final abo a(View view)
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
        g = true;
    }

    public void a(int i1)
    {
        i();
        if (f == null)
        {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        } else
        {
            f.c(i1);
            awakenScrollBars();
            return;
        }
    }

    final void a(int i1, int j1, boolean flag)
    {
        int l1 = c.b();
        int k1 = 0;
        while (k1 < l1) 
        {
            abo abo1 = b(c.c(k1));
            if (abo1 != null && !abo1.E_())
            {
                if (abo1.b >= i1 + j1)
                {
                    abo1.a(-j1, flag);
                    q.e = true;
                } else
                if (abo1.b >= i1)
                {
                    int i2 = -j1;
                    abo1.b(8);
                    abo1.a(i2, flag);
                    abo1.b = i1 - 1;
                    q.e = true;
                }
            }
            k1++;
        }
        abh abh1 = a;
        k1 = abh1.c.size() - 1;
        while (k1 >= 0) 
        {
            abo abo2 = (abo)abh1.c.get(k1);
            if (abo2 != null)
            {
                if (abo2.c() >= i1 + j1)
                {
                    abo2.a(-j1, flag);
                } else
                if (abo2.c() >= i1)
                {
                    abo2.b(8);
                    abh1.c(k1);
                }
            }
            k1--;
        }
        requestLayout();
    }

    public final void a(aav aav1)
    {
        if (e != null)
        {
            aav aav2 = e;
            abj abj1 = v;
            aav2.a.unregisterObserver(abj1);
        }
        if (n != null)
        {
            n.d();
        }
        if (f != null)
        {
            f.c(a);
            f.b(a);
        }
        a.a();
        b.a();
        aav aav3 = e;
        e = aav1;
        if (aav1 != null)
        {
            abj abj2 = v;
            aav1.a.registerObserver(abj2);
        }
        if (f != null)
        {
            f.a(aav3, e);
        }
        Object obj = a;
        aav1 = e;
        ((abh) (obj)).a();
        obj = ((abh) (obj)).c();
        if (aav3 != null)
        {
            ((abg) (obj)).b();
        }
        if (((abg) (obj)).c == 0)
        {
            ((abg) (obj)).a.clear();
        }
        if (aav1 != null)
        {
            ((abg) (obj)).a();
        }
        q.e = true;
        H();
        requestLayout();
    }

    public final void a(aay aay1)
    {
        if (n != null)
        {
            n.d();
            n.h = null;
        }
        n = aay1;
        if (n != null)
        {
            n.h = W;
        }
    }

    public final void a(abc abc1)
    {
        a(abc1, -1);
    }

    public final void a(abc abc1, int i1)
    {
        if (f != null)
        {
            f.a("Cannot add item decoration during a scroll  or layout");
        }
        if (A.isEmpty())
        {
            setWillNotDraw(false);
        }
        if (i1 < 0)
        {
            A.add(abc1);
        } else
        {
            A.add(i1, abc1);
        }
        F();
        requestLayout();
    }

    public void a(abd abd1)
    {
        if (abd1 == f)
        {
            return;
        }
        if (f != null)
        {
            if (D)
            {
                f.a(this, a);
            }
            f.b(null);
        }
        a.a();
        zu zu1 = c;
        zv zv1 = zu1.b;
        do
        {
            zv1.a = 0L;
            if (zv1.b == null)
            {
                break;
            }
            zv1 = zv1.b;
        } while (true);
        for (int i1 = zu1.c.size() - 1; i1 >= 0; i1--)
        {
            zu1.a.d((View)zu1.c.get(i1));
            zu1.c.remove(i1);
        }

        zu1.a.b();
        f = abd1;
        if (abd1 != null)
        {
            if (abd1.k != null)
            {
                throw new IllegalArgumentException((new StringBuilder("LayoutManager ")).append(abd1).append(" is already attached to a RecyclerView: ").append(abd1.k).toString());
            }
            f.b(this);
            if (D)
            {
                f.c(this);
            }
        }
        requestLayout();
    }

    public void a(abf abf1)
    {
        if (V == null)
        {
            V = new ArrayList();
        }
        V.add(abf1);
    }

    public final void a(abg abg1)
    {
        abh abh1 = a;
        if (abh1.e != null)
        {
            abh1.e.b();
        }
        abh1.e = abg1;
        if (abg1 != null)
        {
            abh1.e.a();
        }
    }

    public final void a(String s1)
    {
        if (B())
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
        if (E)
        {
            if (flag && F && f != null && e != null)
            {
                E();
            }
            E = false;
            F = false;
        }
    }

    public boolean a(int i1, int j1)
    {
        if (f != null) goto _L2; else goto _L1
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
            flag = f.f();
            flag1 = f.g();
            if (flag)
            {
                k1 = i1;
                if (Math.abs(i1) >= R)
                {
                    break label0;
                }
            }
            k1 = 0;
        }
        if (flag1)
        {
            i1 = j1;
            if (Math.abs(j1) >= R)
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
            j1 = Math.max(-S, Math.min(k1, S));
            i1 = Math.max(-S, Math.min(i1, S));
            abn abn1 = U;
            abn1.d.e(2);
            abn1.b = 0;
            abn1.a = 0;
            abn1.c.a(j1, i1, 0x80000000, 0x7fffffff);
            abn1.a();
            return true;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public void addFocusables(ArrayList arraylist, int i1, int j1)
    {
        super.addFocusables(arraylist, i1, j1);
    }

    public final void b()
    {
        p = ld.a(ViewConfiguration.get(getContext()));
    }

    public final void b(int i1)
    {
        if (f == null)
        {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        } else
        {
            f.a(this, i1);
            return;
        }
    }

    public void b(int i1, int j1)
    {
    }

    public final void b(abc abc1)
    {
        if (f != null)
        {
            f.a("Cannot remove item decoration during a scroll  or layout");
        }
        A.remove(abc1);
        if (A.isEmpty())
        {
            boolean flag;
            if (km.a(this) == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            setWillNotDraw(flag);
        }
        F();
        requestLayout();
    }

    public void b(abf abf1)
    {
        if (V != null)
        {
            V.remove(abf1);
        }
    }

    public final aav c()
    {
        return e;
    }

    public final abo c(int i1)
    {
        if (!i)
        {
            int k1 = c.b();
            int j1 = 0;
            while (j1 < k1) 
            {
                abo abo1 = b(c.c(j1));
                if (abo1 != null && !abo1.n() && c(abo1) == i1)
                {
                    return abo1;
                }
                j1++;
            }
        }
        return null;
    }

    public final void c(int i1, int j1)
    {
        int k1 = getScrollX();
        int i2 = getScrollY();
        onScrollChanged(k1, i2, k1, i2);
        b(i1, j1);
        if (V != null)
        {
            for (int l1 = V.size() - 1; l1 >= 0; l1--)
            {
                ((abf)V.get(l1)).a(this, i1, j1);
            }

        }
    }

    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && f.a((LayoutParams)layoutparams);
    }

    public int computeHorizontalScrollExtent()
    {
        if (f.f())
        {
            return f.c(q);
        } else
        {
            return 0;
        }
    }

    public int computeHorizontalScrollOffset()
    {
        if (f.f())
        {
            return f.a(q);
        } else
        {
            return 0;
        }
    }

    public int computeHorizontalScrollRange()
    {
        if (f.f())
        {
            return f.e(q);
        } else
        {
            return 0;
        }
    }

    public int computeVerticalScrollExtent()
    {
        if (f.g())
        {
            return f.d(q);
        } else
        {
            return 0;
        }
    }

    public int computeVerticalScrollOffset()
    {
        if (f.g())
        {
            return f.b(q);
        } else
        {
            return 0;
        }
    }

    public int computeVerticalScrollRange()
    {
        if (f.g())
        {
            return f.f(q);
        } else
        {
            return 0;
        }
    }

    public final abd d()
    {
        return f;
    }

    public void d(int i1)
    {
    }

    public boolean dispatchNestedFling(float f1, float f2, boolean flag)
    {
        return ad.a(f1, f2, flag);
    }

    public boolean dispatchNestedPreFling(float f1, float f2)
    {
        return ad.a(f1, f2);
    }

    public boolean dispatchNestedPreScroll(int i1, int j1, int ai1[], int ai2[])
    {
        return ad.a(i1, j1, ai1, ai2);
    }

    public boolean dispatchNestedScroll(int i1, int j1, int k1, int l1, int ai1[])
    {
        return ad.a(i1, j1, k1, l1, ai1);
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
        int k1 = A.size();
        for (int i1 = 0; i1 < k1; i1++)
        {
            A.get(i1);
        }

        int j1;
        if (j != null && !j.a())
        {
            int l1 = canvas.save();
            int i2;
            if (x)
            {
                j1 = getPaddingBottom();
            } else
            {
                j1 = 0;
            }
            canvas.rotate(270F);
            canvas.translate(j1 + -getHeight(), 0.0F);
            if (j != null && j.a(canvas))
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
        if (k != null)
        {
            j1 = k1;
            if (!k.a())
            {
                l1 = canvas.save();
                if (x)
                {
                    canvas.translate(getPaddingLeft(), getPaddingTop());
                }
                if (k != null && k.a(canvas))
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
        if (l != null)
        {
            k1 = j1;
            if (!l.a())
            {
                l1 = canvas.save();
                i2 = getWidth();
                if (x)
                {
                    k1 = getPaddingTop();
                } else
                {
                    k1 = 0;
                }
                canvas.rotate(90F);
                canvas.translate(-k1, -i2);
                if (l != null && l.a(canvas))
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
        if (m != null)
        {
            j1 = k1;
            if (!m.a())
            {
                l1 = canvas.save();
                canvas.rotate(180F);
                if (x)
                {
                    canvas.translate(-getWidth() + getPaddingRight(), -getHeight() + getPaddingBottom());
                } else
                {
                    canvas.translate(-getWidth(), -getHeight());
                }
                j1 = ((flag1) ? 1 : 0);
                if (m != null)
                {
                    j1 = ((flag1) ? 1 : 0);
                    if (m.a(canvas))
                    {
                        j1 = 1;
                    }
                }
                j1 = k1 | j1;
                canvas.restoreToCount(l1);
            }
        }
        if (j1 == 0 && n != null && A.size() > 0 && n.b())
        {
            j1 = ((flag) ? 1 : 0);
        }
        if (j1 != 0)
        {
            km.d(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long l1)
    {
        return super.drawChild(canvas, view, l1);
    }

    public final abg e()
    {
        return a.c();
    }

    public final Rect e(View view)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (!layoutparams.e)
        {
            return layoutparams.d;
        }
        Rect rect = layoutparams.d;
        rect.set(0, 0, 0, 0);
        int j1 = A.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            z.set(0, 0, 0, 0);
            ((abc)A.get(i1)).a(z, view, this, q);
            rect.left = rect.left + z.left;
            rect.top = rect.top + z.top;
            rect.right = rect.right + z.right;
            rect.bottom = rect.bottom + z.bottom;
        }

        layoutparams.e = false;
        return rect;
    }

    public final int f()
    {
        return o;
    }

    public View focusSearch(View view, int i1)
    {
        View view2 = FocusFinder.getInstance().findNextFocus(this, view, i1);
        View view1 = view2;
        if (view2 == null)
        {
            view1 = view2;
            if (e != null)
            {
                view1 = view2;
                if (f != null)
                {
                    view1 = view2;
                    if (!B())
                    {
                        h();
                        view1 = f.c(i1, a, q);
                        a(false);
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

    public void g()
    {
        if (V != null)
        {
            V.clear();
        }
    }

    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        if (f == null)
        {
            throw new IllegalStateException("RecyclerView has no LayoutManager");
        } else
        {
            return f.a();
        }
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        if (f == null)
        {
            throw new IllegalStateException("RecyclerView has no LayoutManager");
        } else
        {
            return f.a(getContext(), attributeset);
        }
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (f == null)
        {
            throw new IllegalStateException("RecyclerView has no LayoutManager");
        } else
        {
            return f.a(layoutparams);
        }
    }

    public int getBaseline()
    {
        if (f != null)
        {
            return -1;
        } else
        {
            return super.getBaseline();
        }
    }

    protected int getChildDrawingOrder(int i1, int j1)
    {
        return super.getChildDrawingOrder(i1, j1);
    }

    public final void h()
    {
        if (!E)
        {
            E = true;
            F = false;
        }
    }

    public boolean hasNestedScrollingParent()
    {
        return ad.a();
    }

    public final void i()
    {
        e(0);
        v();
    }

    public boolean isAttachedToWindow()
    {
        return D;
    }

    public boolean isNestedScrollingEnabled()
    {
        return ad.a;
    }

    public final void j()
    {
        if (j != null)
        {
            return;
        }
        j = new pf(getContext());
        if (x)
        {
            j.a(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
            return;
        } else
        {
            j.a(getMeasuredHeight(), getMeasuredWidth());
            return;
        }
    }

    public final void k()
    {
        if (l != null)
        {
            return;
        }
        l = new pf(getContext());
        if (x)
        {
            l.a(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
            return;
        } else
        {
            l.a(getMeasuredHeight(), getMeasuredWidth());
            return;
        }
    }

    public final void l()
    {
        if (k != null)
        {
            return;
        }
        k = new pf(getContext());
        if (x)
        {
            k.a(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
            return;
        } else
        {
            k.a(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
    }

    public final void m()
    {
        if (m != null)
        {
            return;
        }
        m = new pf(getContext());
        if (x)
        {
            m.a(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
            return;
        } else
        {
            m.a(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
    }

    public final boolean n()
    {
        return J != null && J.isEnabled();
    }

    public final aay o()
    {
        return n;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        K = 0;
        D = true;
        h = false;
        if (f != null)
        {
            f.c(this);
        }
        aa = false;
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (n != null)
        {
            n.d();
        }
        h = false;
        i();
        D = false;
        if (f != null)
        {
            f.a(this, a);
        }
        removeCallbacks(ah);
        acb.b();
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int j1 = A.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            ((abc)A.get(i1)).a(canvas, this);
        }

    }

    public boolean onGenericMotionEvent(MotionEvent motionevent)
    {
        float f3;
        f3 = 0.0F;
        break MISSING_BLOCK_LABEL_3;
        if (f != null && (jo.d(motionevent) & 2) != 0 && motionevent.getAction() == 8)
        {
            float f1;
            float f2;
            if (f.g())
            {
                f1 = -jo.e(motionevent, 9);
            } else
            {
                f1 = 0.0F;
            }
            if (f.f())
            {
                f2 = jo.e(motionevent, 10);
            } else
            {
                f2 = 0.0F;
            }
            if (f1 != 0.0F || f2 != 0.0F)
            {
label0:
                {
                    if (T == 1.401298E-45F)
                    {
                        TypedValue typedvalue = new TypedValue();
                        if (!getContext().getTheme().resolveAttribute(0x101004d, typedvalue, true))
                        {
                            break label0;
                        }
                        T = typedvalue.getDimension(getContext().getResources().getDisplayMetrics());
                    }
                    f3 = T;
                }
                a((int)(f2 * f3), (int)(f1 * f3), motionevent);
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
            C = null;
        }
        l1 = B.size();
        i1 = 0;
_L7:
        if (i1 >= l1) goto _L2; else goto _L1
_L1:
        abe abe1 = (abe)B.get(i1);
        if (!abe1.a() || j1 == 3) goto _L4; else goto _L3
_L3:
        C = abe1;
        i1 = 1;
_L8:
        if (i1 == 0) goto _L6; else goto _L5
_L5:
        y();
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
        if (f == null)
        {
            return false;
        }
        flag = f.f();
        flag1 = f.g();
        if (M == null)
        {
            M = VelocityTracker.obtain();
        }
        M.addMovement(motionevent);
        j1 = jo.a(motionevent);
        i1 = jo.b(motionevent);
        j1;
        JVM INSTR tableswitch 0 6: default 204
    //                   0 214
    //                   1 623
    //                   2 389
    //                   3 637
    //                   4 204
    //                   5 332
    //                   6 615;
           goto _L9 _L10 _L11 _L12 _L13 _L9 _L14 _L15
_L9:
        break; /* Loop/switch isn't completed */
_L13:
        break MISSING_BLOCK_LABEL_637;
_L17:
        if (o != 1)
        {
            return false;
        }
          goto _L16
_L10:
        L = jo.b(motionevent, 0);
        i1 = (int)(motionevent.getX() + 0.5F);
        P = i1;
        N = i1;
        i1 = (int)(motionevent.getY() + 0.5F);
        Q = i1;
        O = i1;
        if (o == 2)
        {
            getParent().requestDisallowInterceptTouchEvent(true);
            e(1);
        }
        motionevent = ag;
        ag[1] = 0;
        motionevent[0] = 0;
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
        L = jo.b(motionevent, i1);
        k1 = (int)(jo.c(motionevent, i1) + 0.5F);
        P = k1;
        N = k1;
        i1 = (int)(jo.d(motionevent, i1) + 0.5F);
        Q = i1;
        O = i1;
          goto _L17
_L12:
        k1 = jo.a(motionevent, L);
        if (k1 < 0)
        {
            Log.e("RecyclerView", (new StringBuilder("Error processing scroll; pointer index for id ")).append(L).append(" not found. Did any MotionEvents get skipped?").toString());
            return false;
        }
        i1 = (int)(jo.c(motionevent, k1) + 0.5F);
        k1 = (int)(jo.d(motionevent, k1) + 0.5F);
        if (o != 1)
        {
            i1 -= N;
            i2 = k1 - O;
            if (flag && Math.abs(i1) > p)
            {
                k1 = N;
                j2 = p;
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
                if (Math.abs(i2) > p)
                {
                    k1 = O;
                    j2 = p;
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
                e(1);
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
        y();
          goto _L17
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        h();
        gr.a("RV OnLayout");
        E();
        gr.a();
        a(false);
        h = true;
    }

    protected void onMeasure(int i1, int j1)
    {
        if (H)
        {
            h();
            D();
            if (q.h)
            {
                q.f = true;
            } else
            {
                b.e();
                q.f = false;
            }
            H = false;
            a(false);
        }
        if (e != null)
        {
            q.b = e.b();
        } else
        {
            q.b = 0;
        }
        if (f == null)
        {
            e(i1, j1);
        } else
        {
            f.a(a, q, i1, j1);
        }
        q.f = false;
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        w = (SavedState)parcelable;
        super.onRestoreInstanceState(w.getSuperState());
        if (f != null && w.a != null)
        {
            f.a(w.a);
        }
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        if (w != null)
        {
            SavedState.a(savedstate, w);
            return savedstate;
        }
        if (f != null)
        {
            savedstate.a = f.e();
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
            w();
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1;
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = false;
        i1 = motionevent.getAction();
        if (C == null) goto _L2; else goto _L1
_L1:
        if (i1 != 0) goto _L4; else goto _L3
_L3:
        C = null;
_L2:
        if (i1 == 0) goto _L6; else goto _L5
_L5:
        int j1;
        j1 = B.size();
        i1 = 0;
_L13:
        if (i1 >= j1) goto _L6; else goto _L7
_L7:
        Object obj = (abe)B.get(i1);
        if (!((abe) (obj)).a()) goto _L9; else goto _L8
_L8:
        C = ((abe) (obj));
        i1 = 1;
_L12:
        if (i1 == 0) goto _L11; else goto _L10
_L10:
        y();
        flag1 = true;
_L15:
        return flag1;
_L4:
        if (i1 == 3 || i1 == 1)
        {
            C = null;
        }
        i1 = 1;
          goto _L12
_L9:
        i1++;
          goto _L13
_L6:
        i1 = 0;
          goto _L12
_L11:
        if (f == null) goto _L15; else goto _L14
_L14:
        int k1;
        boolean flag2;
        flag1 = f.f();
        flag2 = f.g();
        if (M == null)
        {
            M = VelocityTracker.obtain();
        }
        obj = MotionEvent.obtain(motionevent);
        k1 = jo.a(motionevent);
        j1 = jo.b(motionevent);
        if (k1 == 0)
        {
            int ai1[] = ag;
            ag[1] = 0;
            ai1[0] = 0;
        }
        ((MotionEvent) (obj)).offsetLocation(ag[0], ag[1]);
        i1 = ((flag) ? 1 : 0);
        k1;
        JVM INSTR tableswitch 0 6: default 288
    //                   0 313
    //                   1 926
    //                   2 472
    //                   3 1034
    //                   4 292
    //                   5 405
    //                   6 914;
           goto _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23
_L21:
        break; /* Loop/switch isn't completed */
_L16:
        i1 = ((flag) ? 1 : 0);
_L25:
        if (i1 == 0)
        {
            M.addMovement(((MotionEvent) (obj)));
        }
        ((MotionEvent) (obj)).recycle();
        return true;
_L17:
        L = jo.b(motionevent, 0);
        i1 = (int)(motionevent.getX() + 0.5F);
        P = i1;
        N = i1;
        i1 = (int)(motionevent.getY() + 0.5F);
        Q = i1;
        O = i1;
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
_L22:
        L = jo.b(motionevent, j1);
        i1 = (int)(jo.c(motionevent, j1) + 0.5F);
        P = i1;
        N = i1;
        i1 = (int)(jo.d(motionevent, j1) + 0.5F);
        Q = i1;
        O = i1;
        i1 = ((flag) ? 1 : 0);
        continue; /* Loop/switch isn't completed */
_L19:
        i1 = jo.a(motionevent, L);
        if (i1 < 0)
        {
            Log.e("RecyclerView", (new StringBuilder("Error processing scroll; pointer index for id ")).append(L).append(" not found. Did any MotionEvents get skipped?").toString());
            return false;
        }
        l2 = (int)(jo.c(motionevent, i1) + 0.5F);
        i3 = (int)(jo.d(motionevent, i1) + 0.5F);
        i2 = P - l2;
        l1 = Q - i3;
        i1 = l1;
        j1 = i2;
        if (dispatchNestedPreScroll(i2, l1, af, ae))
        {
            j1 = i2 - af[0];
            i1 = l1 - af[1];
            ((MotionEvent) (obj)).offsetLocation(ae[0], ae[1]);
            motionevent = ag;
            motionevent[0] = motionevent[0] + ae[0];
            motionevent = ag;
            motionevent[1] = motionevent[1] + ae[1];
        }
        l1 = i1;
        i2 = j1;
        if (o != 1)
        {
            if (flag1 && Math.abs(j1) > p)
            {
                if (j1 > 0)
                {
                    j1 -= p;
                } else
                {
                    j1 += p;
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
                if (Math.abs(i1) > p)
                {
                    if (i1 > 0)
                    {
                        j2 = i1 - p;
                    } else
                    {
                        j2 = i1 + p;
                    }
                    k2 = 1;
                }
            }
            l1 = j2;
            i2 = j1;
            if (k2 != 0)
            {
                e(1);
                i2 = j1;
                l1 = j2;
            }
        }
        i1 = ((flag) ? 1 : 0);
        if (o == 1)
        {
            P = l2 - ae[0];
            Q = i3 - ae[1];
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
_L23:
        a(motionevent);
        i1 = ((flag) ? 1 : 0);
        continue; /* Loop/switch isn't completed */
_L18:
        M.addMovement(((MotionEvent) (obj)));
        M.computeCurrentVelocity(1000, S);
        if (flag1)
        {
            f1 = -ki.a(M, L);
        } else
        {
            f1 = 0.0F;
        }
        if (flag2)
        {
            f2 = -ki.b(M, L);
        } else
        {
            f2 = 0.0F;
        }
        if (f1 == 0.0F && f2 == 0.0F || !a((int)f1, (int)f2))
        {
            e(0);
        }
        x();
        i1 = 1;
        continue; /* Loop/switch isn't completed */
_L20:
        y();
        i1 = ((flag) ? 1 : 0);
        if (true) goto _L25; else goto _L24
_L24:
          goto _L12
    }

    public final void p()
    {
        if (A.size() == 0)
        {
            return;
        }
        if (f != null)
        {
            f.a("Cannot invalidate item decorations during a scroll or layout");
        }
        F();
        requestLayout();
    }

    public void removeDetachedView(View view, boolean flag)
    {
        abo abo1 = b(view);
        if (abo1 != null)
        {
            if (abo1.o())
            {
                abo1.j();
            } else
            if (!abo1.E_())
            {
                throw new IllegalArgumentException((new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.")).append(abo1).toString());
            }
        }
        f(view);
        super.removeDetachedView(view, flag);
    }

    public void requestChildFocus(View view, View view1)
    {
        int i1;
        if (f.n() || B())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0 && view1 != null)
        {
            z.set(0, 0, view1.getWidth(), view1.getHeight());
            Object obj = view1.getLayoutParams();
            if (obj instanceof LayoutParams)
            {
                obj = (LayoutParams)obj;
                if (!((LayoutParams) (obj)).e)
                {
                    obj = ((LayoutParams) (obj)).d;
                    Rect rect = z;
                    rect.left = rect.left - ((Rect) (obj)).left;
                    rect = z;
                    rect.right = rect.right + ((Rect) (obj)).right;
                    rect = z;
                    rect.top = rect.top - ((Rect) (obj)).top;
                    rect = z;
                    i1 = rect.bottom;
                    rect.bottom = ((Rect) (obj)).bottom + i1;
                }
            }
            offsetDescendantRectToMyCoords(view1, z);
            offsetRectIntoDescendantCoords(view, z);
            obj = z;
            boolean flag;
            if (!h)
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
        abd abd1 = f;
        int k2 = abd1.s();
        int l1 = abd1.t();
        int l2 = abd1.q() - abd1.u();
        int j2 = abd1.r();
        int k3 = abd1.v();
        int i3 = view.getLeft() + rect.left;
        int i2 = view.getTop() + rect.top;
        int j3 = i3 + rect.width();
        int l3 = rect.height();
        int i1 = Math.min(0, i3 - k2);
        int j1 = Math.min(0, i2 - l1);
        int k1 = Math.max(0, j3 - l2);
        j2 = Math.max(0, (i2 + l3) - (j2 - k3));
        if (km.h(abd1.k) == 1)
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
            if (f == null)
            {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else
            {
                if (!f.f())
                {
                    i1 = 0;
                }
                if (!f.g())
                {
                    j1 = 0;
                }
                if (i1 != 0 || j1 != 0)
                {
                    U.a(i1, j1);
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
        int j1 = B.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            B.get(i1);
        }

        super.requestDisallowInterceptTouchEvent(flag);
    }

    public void requestLayout()
    {
        if (!E)
        {
            super.requestLayout();
            return;
        } else
        {
            F = true;
            return;
        }
    }

    public void scrollBy(int i1, int j1)
    {
        if (f == null)
        {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else
        {
            boolean flag = f.f();
            boolean flag1 = f.g();
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
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityevent)
    {
        int i1 = 0;
        boolean flag = false;
        if (B())
        {
            if (accessibilityevent != null)
            {
                i1 = mw.b(accessibilityevent);
            } else
            {
                i1 = 0;
            }
            if (i1 == 0)
            {
                i1 = ((flag) ? 1 : 0);
            }
            G = i1 | G;
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
        if (flag != x)
        {
            w();
        }
        x = flag;
        super.setClipToPadding(flag);
        if (h)
        {
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean flag)
    {
        ad.a(flag);
    }

    public boolean startNestedScroll(int i1)
    {
        return ad.a(i1);
    }

    public void stopNestedScroll()
    {
        ad.b();
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
        t = flag;
        u = (new Class[] {
            android/content/Context, android/util/AttributeSet, Integer.TYPE, Integer.TYPE
        });
    }

    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public final volatile Object[] newArray(int i1)
            {
                return new SavedState[i1];
            }

        };
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
            a = parcel.readParcelable(abd.getClassLoader());
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
