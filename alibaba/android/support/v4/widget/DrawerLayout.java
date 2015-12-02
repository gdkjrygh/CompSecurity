// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import ar;
import cm;
import cq;
import cs;
import df;
import ds;
import ee;
import es;
import fk;
import fl;
import fw;
import java.util.List;

public class DrawerLayout extends ViewGroup
    implements fl
{
    public static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState a(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public SavedState[] a(int i1)
            {
                return new SavedState[i1];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int i1)
            {
                return a(i1);
            }

        };
        int a;
        int b;
        int c;

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            parcel.writeInt(a);
        }


        public SavedState(Parcel parcel)
        {
            super(parcel);
            a = 0;
            b = 0;
            c = 0;
            a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
            a = 0;
            b = 0;
            c = 0;
        }
    }

    class a extends cm
    {

        final DrawerLayout a;
        private final Rect b = new Rect();

        private void a(es es1, ViewGroup viewgroup)
        {
            int j1 = viewgroup.getChildCount();
            for (int i1 = 0; i1 < j1; i1++)
            {
                View view = viewgroup.getChildAt(i1);
                if (DrawerLayout.l(view))
                {
                    es1.b(view);
                }
            }

        }

        private void a(es es1, es es2)
        {
            Rect rect = b;
            es2.a(rect);
            es1.b(rect);
            es2.c(rect);
            es1.d(rect);
            es1.c(es2.h());
            es1.a(es2.p());
            es1.b(es2.q());
            es1.c(es2.s());
            es1.h(es2.m());
            es1.f(es2.k());
            es1.a(es2.f());
            es1.b(es2.g());
            es1.d(es2.i());
            es1.e(es2.j());
            es1.g(es2.l());
            es1.a(es2.b());
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
            if (accessibilityevent.getEventType() == 32)
            {
                view = accessibilityevent.getText();
                accessibilityevent = DrawerLayout.a(a);
                if (accessibilityevent != null)
                {
                    int i1 = a.e(accessibilityevent);
                    accessibilityevent = a.a(i1);
                    if (accessibilityevent != null)
                    {
                        view.add(accessibilityevent);
                    }
                }
                return true;
            } else
            {
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityevent);
            }
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
            super.onInitializeAccessibilityEvent(view, accessibilityevent);
            accessibilityevent.setClassName(android/support/v4/widget/DrawerLayout.getName());
        }

        public void onInitializeAccessibilityNodeInfo(View view, es es1)
        {
            if (DrawerLayout.e())
            {
                super.onInitializeAccessibilityNodeInfo(view, es1);
            } else
            {
                es es2 = es.a(es1);
                super.onInitializeAccessibilityNodeInfo(view, es2);
                es1.a(view);
                android.view.ViewParent viewparent = ds.i(view);
                if (viewparent instanceof View)
                {
                    es1.c((View)viewparent);
                }
                a(es1, es2);
                es2.t();
                a(es1, (ViewGroup)view);
            }
            es1.b(android/support/v4/widget/DrawerLayout.getName());
            es1.a(false);
            es1.b(false);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
            if (DrawerLayout.e() || DrawerLayout.l(view))
            {
                return super.onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
            } else
            {
                return false;
            }
        }

        a()
        {
            a = DrawerLayout.this;
            super();
        }
    }

    final class b extends cm
    {

        final DrawerLayout a;

        public void onInitializeAccessibilityNodeInfo(View view, es es1)
        {
            super.onInitializeAccessibilityNodeInfo(view, es1);
            if (!DrawerLayout.l(view))
            {
                es1.c(null);
            }
        }

        b()
        {
            a = DrawerLayout.this;
            super();
        }
    }

    static interface c
    {

        public abstract int a(Object obj);

        public abstract Drawable a(Context context);

        public abstract void a(View view);

        public abstract void a(View view, Object obj, int i1);

        public abstract void a(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, Object obj, int i1);
    }

    static class d
        implements c
    {

        public int a(Object obj)
        {
            return fk.a(obj);
        }

        public Drawable a(Context context)
        {
            return fk.a(context);
        }

        public void a(View view)
        {
            fk.a(view);
        }

        public void a(View view, Object obj, int i1)
        {
            fk.a(view, obj, i1);
        }

        public void a(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, Object obj, int i1)
        {
            fk.a(marginlayoutparams, obj, i1);
        }

        d()
        {
        }
    }

    static class e
        implements c
    {

        public int a(Object obj)
        {
            return 0;
        }

        public Drawable a(Context context)
        {
            return null;
        }

        public void a(View view)
        {
        }

        public void a(View view, Object obj, int i1)
        {
        }

        public void a(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, Object obj, int i1)
        {
        }

        e()
        {
        }
    }

    public static interface f
    {

        public abstract void onDrawerClosed(View view);

        public abstract void onDrawerOpened(View view);

        public abstract void onDrawerSlide(View view, float f1);

        public abstract void onDrawerStateChanged(int i1);
    }

    public static class g extends android.view.ViewGroup.MarginLayoutParams
    {

        public int a;
        float b;
        boolean c;
        boolean d;

        public g(int i1, int j1)
        {
            super(i1, j1);
            a = 0;
        }

        public g(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            a = 0;
            context = context.obtainStyledAttributes(attributeset, DrawerLayout.d());
            a = context.getInt(0, 0);
            context.recycle();
        }

        public g(g g1)
        {
            super(g1);
            a = 0;
            a = g1.a;
        }

        public g(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            a = 0;
        }

        public g(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            a = 0;
        }
    }

    class h extends fw.a
    {

        final DrawerLayout a;
        private final int b;
        private fw c;
        private final Runnable d = new _cls1(this);

        static void a(h h1)
        {
            h1.c();
        }

        private void b()
        {
            byte byte0 = 3;
            if (b == 3)
            {
                byte0 = 5;
            }
            View view = a.b(byte0);
            if (view != null)
            {
                a.i(view);
            }
        }

        private void c()
        {
            int i1 = 0;
            int j1 = c.b();
            View view;
            boolean flag;
            if (b == 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                view = a.b(3);
                if (view != null)
                {
                    i1 = -view.getWidth();
                }
                i1 += j1;
            } else
            {
                view = a.b(5);
                i1 = a.getWidth();
                i1 -= j1;
            }
            if (view != null && (flag && view.getLeft() < i1 || !flag && view.getLeft() > i1) && a.a(view) == 0)
            {
                g g1 = (g)view.getLayoutParams();
                c.a(view, i1, view.getTop());
                g1.c = true;
                a.invalidate();
                b();
                a.c();
            }
        }

        public int a(View view)
        {
            if (a.g(view))
            {
                return view.getWidth();
            } else
            {
                return 0;
            }
        }

        public int a(View view, int i1, int j1)
        {
            if (a.a(view, 3))
            {
                return Math.max(-view.getWidth(), Math.min(i1, 0));
            } else
            {
                j1 = a.getWidth();
                return Math.max(j1 - view.getWidth(), Math.min(i1, j1));
            }
        }

        public void a()
        {
            a.removeCallbacks(d);
        }

        public void a(int i1)
        {
            a.a(b, i1, c.c());
        }

        public void a(int i1, int j1)
        {
            a.postDelayed(d, 160L);
        }

        public void a(View view, float f1, float f2)
        {
            int k1;
            f2 = a.d(view);
            k1 = view.getWidth();
            if (!a.a(view, 3)) goto _L2; else goto _L1
_L1:
            int i1;
            if (f1 > 0.0F || f1 == 0.0F && f2 > 0.5F)
            {
                i1 = 0;
            } else
            {
                i1 = -k1;
            }
_L4:
            c.a(i1, view.getTop());
            a.invalidate();
            return;
_L2:
            int j1 = a.getWidth();
            if (f1 >= 0.0F)
            {
                i1 = j1;
                if (f1 != 0.0F)
                {
                    continue; /* Loop/switch isn't completed */
                }
                i1 = j1;
                if (f2 <= 0.5F)
                {
                    continue; /* Loop/switch isn't completed */
                }
            }
            i1 = j1 - k1;
            if (true) goto _L4; else goto _L3
_L3:
        }

        public void a(View view, int i1, int j1, int k1, int l1)
        {
            j1 = view.getWidth();
            float f1;
            if (a.a(view, 3))
            {
                f1 = (float)(j1 + i1) / (float)j1;
            } else
            {
                f1 = (float)(a.getWidth() - i1) / (float)j1;
            }
            a.b(view, f1);
            if (f1 == 0.0F)
            {
                i1 = 4;
            } else
            {
                i1 = 0;
            }
            view.setVisibility(i1);
            a.invalidate();
        }

        public void a(fw fw1)
        {
            c = fw1;
        }

        public boolean a(View view, int i1)
        {
            return a.g(view) && a.a(view, b) && a.a(view) == 0;
        }

        public int b(View view, int i1, int j1)
        {
            return view.getTop();
        }

        public void b(int i1, int j1)
        {
            View view;
            if ((i1 & 1) == 1)
            {
                view = a.b(3);
            } else
            {
                view = a.b(5);
            }
            if (view != null && a.a(view) == 0)
            {
                c.a(view, j1);
            }
        }

        public void b(View view, int i1)
        {
            ((g)view.getLayoutParams()).c = false;
            b();
        }

        public boolean b(int i1)
        {
            return false;
        }

        public h(int i1)
        {
            a = DrawerLayout.this;
            super();
            b = i1;
        }
    }


    static final c a;
    private static final int b[] = {
        0x10100b3
    };
    private static final boolean c;
    private CharSequence A;
    private Object B;
    private boolean C;
    private final b d;
    private int e;
    private int f;
    private float g;
    private Paint h;
    private final fw i;
    private final fw j;
    private final h k;
    private final h l;
    private int m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private f t;
    private float u;
    private float v;
    private Drawable w;
    private Drawable x;
    private Drawable y;
    private CharSequence z;

    public DrawerLayout(Context context)
    {
        this(context, null);
    }

    public DrawerLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        d = new b();
        f = 0x99000000;
        h = new Paint();
        o = true;
        setDescendantFocusability(0x40000);
        float f1 = getResources().getDisplayMetrics().density;
        e = (int)(64F * f1 + 0.5F);
        f1 *= 400F;
        k = new h(3);
        l = new h(5);
        i = fw.a(this, 1.0F, k);
        i.a(1);
        i.a(f1);
        k.a(i);
        j = fw.a(this, 1.0F, l);
        j.a(2);
        j.a(f1);
        l.a(j);
        setFocusableInTouchMode(true);
        ds.c(this, 1);
        ds.a(this, new a());
        ee.a(this, false);
        if (ds.x(this))
        {
            a.a(this);
            y = a.a(context);
        }
    }

    static View a(DrawerLayout drawerlayout)
    {
        return drawerlayout.h();
    }

    private void a(View view, boolean flag)
    {
        int j1 = getChildCount();
        int i1 = 0;
        while (i1 < j1) 
        {
            View view1 = getChildAt(i1);
            if (!flag && !g(view1) || flag && view1 == view)
            {
                ds.c(view1, 1);
            } else
            {
                ds.c(view1, 4);
            }
            i1++;
        }
    }

    static String c(int i1)
    {
        if ((i1 & 3) == 3)
        {
            return "LEFT";
        }
        if ((i1 & 5) == 5)
        {
            return "RIGHT";
        } else
        {
            return Integer.toHexString(i1);
        }
    }

    static int[] d()
    {
        return b;
    }

    static boolean e()
    {
        return c;
    }

    private boolean f()
    {
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (((g)getChildAt(i1).getLayoutParams()).c)
            {
                return true;
            }
        }

        return false;
    }

    private boolean g()
    {
        return h() != null;
    }

    private View h()
    {
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            if (g(view) && k(view))
            {
                return view;
            }
        }

        return null;
    }

    static boolean l(View view)
    {
        return n(view);
    }

    private static boolean m(View view)
    {
        boolean flag1 = false;
        view = view.getBackground();
        boolean flag = flag1;
        if (view != null)
        {
            flag = flag1;
            if (view.getOpacity() == -1)
            {
                flag = true;
            }
        }
        return flag;
    }

    private static boolean n(View view)
    {
        return ds.e(view) != 4 && ds.e(view) != 2;
    }

    public int a(View view)
    {
        int i1 = e(view);
        if (i1 == 3)
        {
            return p;
        }
        if (i1 == 5)
        {
            return q;
        } else
        {
            return 0;
        }
    }

    View a()
    {
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            if (((g)view.getLayoutParams()).d)
            {
                return view;
            }
        }

        return null;
    }

    public CharSequence a(int i1)
    {
        i1 = cq.a(i1, ds.h(this));
        if (i1 == 3)
        {
            return z;
        }
        if (i1 == 5)
        {
            return A;
        } else
        {
            return null;
        }
    }

    public void a(int i1, int j1)
    {
        j1 = cq.a(j1, ds.h(this));
        if (j1 == 3)
        {
            p = i1;
        } else
        if (j1 == 5)
        {
            q = i1;
        }
        if (i1 != 0)
        {
            fw fw1;
            if (j1 == 3)
            {
                fw1 = i;
            } else
            {
                fw1 = j;
            }
            fw1.e();
        }
        i1;
        JVM INSTR tableswitch 1 2: default 60
    //                   1 98
    //                   2 82;
           goto _L1 _L2 _L3
_L1:
        View view;
        return;
_L3:
        if ((view = b(j1)) != null)
        {
            h(view);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if ((view = b(j1)) != null)
        {
            i(view);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    void a(int i1, int j1, View view)
    {
        g g1;
        boolean flag = true;
        int k1 = i.a();
        int l1 = j.a();
        i1 = ((flag) ? 1 : 0);
        if (k1 != 1)
        {
            if (l1 == 1)
            {
                i1 = ((flag) ? 1 : 0);
            } else
            if (k1 == 2 || l1 == 2)
            {
                i1 = 2;
            } else
            {
                i1 = 0;
            }
        }
        if (view == null || j1 != 0) goto _L2; else goto _L1
_L1:
        g1 = (g)view.getLayoutParams();
        if (g1.b != 0.0F) goto _L4; else goto _L3
_L3:
        b(view);
_L2:
        if (i1 != m)
        {
            m = i1;
            if (t != null)
            {
                t.onDrawerStateChanged(i1);
            }
        }
        return;
_L4:
        if (g1.b == 1.0F)
        {
            c(view);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    void a(View view, float f1)
    {
        if (t != null)
        {
            t.onDrawerSlide(view, f1);
        }
    }

    public void a(Object obj, boolean flag)
    {
        B = obj;
        C = flag;
        if (!flag && getBackground() == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setWillNotDraw(flag);
        requestLayout();
    }

    void a(boolean flag)
    {
        int k1 = getChildCount();
        int i1 = 0;
        boolean flag1 = false;
        while (i1 < k1) 
        {
            View view = getChildAt(i1);
            g g1 = (g)view.getLayoutParams();
            int j1 = ((flag1) ? 1 : 0);
            if (g(view))
            {
                if (flag && !g1.c)
                {
                    j1 = ((flag1) ? 1 : 0);
                } else
                {
                    j1 = view.getWidth();
                    if (a(view, 3))
                    {
                        flag1 |= i.a(view, -j1, view.getTop());
                    } else
                    {
                        flag1 |= j.a(view, getWidth(), view.getTop());
                    }
                    g1.c = false;
                    j1 = ((flag1) ? 1 : 0);
                }
            }
            i1++;
            flag1 = j1;
        }
        k.a();
        l.a();
        if (flag1)
        {
            invalidate();
        }
    }

    boolean a(View view, int i1)
    {
        return (e(view) & i1) == i1;
    }

    public void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.addView(view, i1, layoutparams);
        if (a() != null || g(view))
        {
            ds.c(view, 4);
        } else
        {
            ds.c(view, 1);
        }
        if (!c)
        {
            ds.a(view, d);
        }
    }

    View b(int i1)
    {
        int j1 = cq.a(i1, ds.h(this));
        int k1 = getChildCount();
        for (i1 = 0; i1 < k1; i1++)
        {
            View view = getChildAt(i1);
            if ((e(view) & 7) == (j1 & 7))
            {
                return view;
            }
        }

        return null;
    }

    public void b()
    {
        a(false);
    }

    void b(View view)
    {
        g g1 = (g)view.getLayoutParams();
        if (g1.d)
        {
            g1.d = false;
            if (t != null)
            {
                t.onDrawerClosed(view);
            }
            a(view, false);
            if (hasWindowFocus())
            {
                view = getRootView();
                if (view != null)
                {
                    view.sendAccessibilityEvent(32);
                }
            }
        }
    }

    void b(View view, float f1)
    {
        g g1 = (g)view.getLayoutParams();
        if (f1 == g1.b)
        {
            return;
        } else
        {
            g1.b = f1;
            a(view, f1);
            return;
        }
    }

    void c()
    {
        int i1 = 0;
        if (!s)
        {
            long l1 = SystemClock.uptimeMillis();
            MotionEvent motionevent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
            for (int j1 = getChildCount(); i1 < j1; i1++)
            {
                getChildAt(i1).dispatchTouchEvent(motionevent);
            }

            motionevent.recycle();
            s = true;
        }
    }

    void c(View view)
    {
        g g1 = (g)view.getLayoutParams();
        if (!g1.d)
        {
            g1.d = true;
            if (t != null)
            {
                t.onDrawerOpened(view);
            }
            a(view, true);
            if (hasWindowFocus())
            {
                sendAccessibilityEvent(32);
            }
            view.requestFocus();
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof g) && super.checkLayoutParams(layoutparams);
    }

    public void computeScroll()
    {
        int j1 = getChildCount();
        float f1 = 0.0F;
        for (int i1 = 0; i1 < j1; i1++)
        {
            f1 = Math.max(f1, ((g)getChildAt(i1).getLayoutParams()).b);
        }

        g = f1;
        if (i.a(true) | j.a(true))
        {
            ds.d(this);
        }
    }

    float d(View view)
    {
        return ((g)view.getLayoutParams()).b;
    }

    public void d(int i1)
    {
        View view = b(i1);
        if (view == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("No drawer view found with gravity ").append(c(i1)).toString());
        } else
        {
            h(view);
            return;
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long l1)
    {
        int i1;
        int j1;
        int k1;
        int i2;
        int i3;
        int j3;
        int k3;
        boolean flag1;
        i3 = getHeight();
        flag1 = f(view);
        k1 = 0;
        boolean flag = false;
        i1 = getWidth();
        j3 = canvas.save();
        j1 = i1;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        k3 = getChildCount();
        i2 = 0;
        k1 = ((flag) ? 1 : 0);
_L2:
        if (i2 >= k3)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        View view1 = getChildAt(i2);
        if (view1 == view || view1.getVisibility() != 0 || !m(view1) || !g(view1))
        {
            break; /* Loop/switch isn't completed */
        }
        int k2;
        if (view1.getHeight() < i3)
        {
            k2 = k1;
            j1 = i1;
        } else
        {
label0:
            {
                if (!a(view1, 3))
                {
                    break label0;
                }
                j1 = view1.getRight();
                float f1;
                int j2;
                int l2;
                boolean flag2;
                if (j1 <= k1)
                {
                    j1 = k1;
                }
                k2 = j1;
                j1 = i1;
            }
        }
_L3:
        i2++;
        i1 = j1;
        k1 = k2;
        if (true) goto _L2; else goto _L1
        l2 = view1.getLeft();
        j1 = l2;
        k2 = k1;
        if (l2 < i1) goto _L3; else goto _L1
_L1:
        j1 = i1;
        k2 = k1;
          goto _L3
        canvas.clipRect(k1, 0, i1, getHeight());
        j1 = i1;
        flag2 = super.drawChild(canvas, view, l1);
        canvas.restoreToCount(j3);
        if (g > 0.0F && flag1)
        {
            i1 = (int)((float)((f & 0xff000000) >>> 24) * g);
            j2 = f;
            h.setColor(i1 << 24 | j2 & 0xffffff);
            canvas.drawRect(k1, 0.0F, j1, getHeight(), h);
        } else
        {
            if (w != null && a(view, 3))
            {
                i1 = w.getIntrinsicWidth();
                j1 = view.getRight();
                k1 = i.b();
                f1 = Math.max(0.0F, Math.min((float)j1 / (float)k1, 1.0F));
                w.setBounds(j1, view.getTop(), i1 + j1, view.getBottom());
                w.setAlpha((int)(255F * f1));
                w.draw(canvas);
                return flag2;
            }
            if (x != null && a(view, 5))
            {
                i1 = x.getIntrinsicWidth();
                j1 = view.getLeft();
                k1 = getWidth();
                j2 = j.b();
                f1 = Math.max(0.0F, Math.min((float)(k1 - j1) / (float)j2, 1.0F));
                x.setBounds(j1 - i1, view.getTop(), j1, view.getBottom());
                x.setAlpha((int)(255F * f1));
                x.draw(canvas);
                return flag2;
            }
        }
        return flag2;
    }

    int e(View view)
    {
        return cq.a(((g)view.getLayoutParams()).a, ds.h(this));
    }

    public void e(int i1)
    {
        View view = b(i1);
        if (view == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("No drawer view found with gravity ").append(c(i1)).toString());
        } else
        {
            i(view);
            return;
        }
    }

    public boolean f(int i1)
    {
        View view = b(i1);
        if (view != null)
        {
            return j(view);
        } else
        {
            return false;
        }
    }

    boolean f(View view)
    {
        return ((g)view.getLayoutParams()).a == 0;
    }

    public boolean g(int i1)
    {
        View view = b(i1);
        if (view != null)
        {
            return k(view);
        } else
        {
            return false;
        }
    }

    boolean g(View view)
    {
        return (cq.a(((g)view.getLayoutParams()).a, ds.h(view)) & 7) != 0;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new g(-1, -1);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new g(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof g)
        {
            return new g((g)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new g((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new g(layoutparams);
        }
    }

    public Drawable getStatusBarBackgroundDrawable()
    {
        return y;
    }

    public void h(View view)
    {
        if (!g(view))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("View ").append(view).append(" is not a sliding drawer").toString());
        }
        if (o)
        {
            g g1 = (g)view.getLayoutParams();
            g1.b = 1.0F;
            g1.d = true;
            a(view, true);
        } else
        if (a(view, 3))
        {
            i.a(view, 0, view.getTop());
        } else
        {
            j.a(view, getWidth() - view.getWidth(), view.getTop());
        }
        invalidate();
    }

    public void i(View view)
    {
        if (!g(view))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("View ").append(view).append(" is not a sliding drawer").toString());
        }
        if (o)
        {
            view = (g)view.getLayoutParams();
            view.b = 0.0F;
            view.d = false;
        } else
        if (a(view, 3))
        {
            i.a(view, -view.getWidth(), view.getTop());
        } else
        {
            j.a(view, getWidth(), view.getTop());
        }
        invalidate();
    }

    public boolean j(View view)
    {
        if (!g(view))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("View ").append(view).append(" is not a drawer").toString());
        } else
        {
            return ((g)view.getLayoutParams()).d;
        }
    }

    public boolean k(View view)
    {
        if (!g(view))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("View ").append(view).append(" is not a drawer").toString());
        }
        return ((g)view.getLayoutParams()).b > 0.0F;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        o = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        o = true;
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (C && y != null)
        {
            int i1 = a.a(B);
            if (i1 > 0)
            {
                y.setBounds(0, 0, getWidth(), i1);
                y.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        flag1 = false;
        i1 = df.a(motionevent);
        flag2 = i.a(motionevent);
        flag3 = j.a(motionevent);
        i1;
        JVM INSTR tableswitch 0 3: default 60
    //                   0 96
    //                   1 196
    //                   2 165
    //                   3 196;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        boolean flag = false;
_L8:
        if (flag2 | flag3 || flag || f() || s)
        {
            flag1 = true;
        }
        return flag1;
_L2:
        float f1;
        float f2;
        f1 = motionevent.getX();
        f2 = motionevent.getY();
        u = f1;
        v = f2;
        if (g <= 0.0F) goto _L6; else goto _L5
_L5:
        motionevent = i.d((int)f1, (int)f2);
        if (motionevent == null || !f(motionevent)) goto _L6; else goto _L7
_L7:
        flag = true;
_L10:
        r = false;
        s = false;
          goto _L8
_L4:
        if (!i.d(3)) goto _L1; else goto _L9
_L9:
        k.a();
        l.a();
        flag = false;
          goto _L8
_L3:
        a(true);
        r = false;
        s = false;
          goto _L1
_L6:
        flag = false;
          goto _L10
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4 && g())
        {
            cs.b(keyevent);
            return true;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }

    public boolean onKeyUp(int i1, KeyEvent keyevent)
    {
        if (i1 == 4)
        {
            keyevent = h();
            if (keyevent != null && a(keyevent) == 0)
            {
                b();
            }
            return keyevent != null;
        } else
        {
            return super.onKeyUp(i1, keyevent);
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int k2;
        int l2;
        n = true;
        k2 = k1 - i1;
        l2 = getChildCount();
        k1 = 0;
_L2:
        View view;
        if (k1 >= l2)
        {
            break MISSING_BLOCK_LABEL_450;
        }
        view = getChildAt(k1);
        if (view.getVisibility() != 8)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        k1++;
        if (true) goto _L2; else goto _L1
_L1:
        g g1;
label0:
        {
            g1 = (g)view.getLayoutParams();
            if (!f(view))
            {
                break label0;
            }
            view.layout(g1.leftMargin, g1.topMargin, g1.leftMargin + view.getMeasuredWidth(), g1.topMargin + view.getMeasuredHeight());
        }
          goto _L3
        int i2;
        int i3;
        int j3;
        i3 = view.getMeasuredWidth();
        j3 = view.getMeasuredHeight();
        float f1;
        boolean flag1;
        if (a(view, 3))
        {
            i1 = -i3;
            i2 = (int)((float)i3 * g1.b) + i1;
            f1 = (float)(i3 + i2) / (float)i3;
        } else
        {
            i2 = k2 - (int)((float)i3 * g1.b);
            f1 = (float)(k2 - i2) / (float)i3;
        }
        if (f1 != g1.b)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        g1.a & 0x70;
        JVM INSTR lookupswitch 2: default 216
    //                   16: 360
    //                   80: 320;
           goto _L4 _L5 _L6
_L5:
        break MISSING_BLOCK_LABEL_360;
_L4:
        view.layout(i2, g1.topMargin, i3 + i2, j3 + g1.topMargin);
_L7:
        if (flag1)
        {
            b(view, f1);
        }
        int j2;
        int k3;
        if (g1.b > 0.0F)
        {
            i1 = 0;
        } else
        {
            i1 = 4;
        }
        if (view.getVisibility() != i1)
        {
            view.setVisibility(i1);
        }
          goto _L3
_L6:
        i1 = l1 - j1;
        view.layout(i2, i1 - g1.bottomMargin - view.getMeasuredHeight(), i3 + i2, i1 - g1.bottomMargin);
          goto _L7
        k3 = l1 - j1;
        j2 = (k3 - j3) / 2;
        if (j2 < g1.topMargin)
        {
            i1 = g1.topMargin;
        } else
        {
            i1 = j2;
            if (j2 + j3 > k3 - g1.bottomMargin)
            {
                i1 = k3 - g1.bottomMargin - j3;
            }
        }
        view.layout(i2, i1, i3 + i2, j3 + i1);
          goto _L7
        n = false;
        o = false;
        return;
          goto _L3
    }

    protected void onMeasure(int i1, int j1)
    {
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        i2 = 300;
        l2 = android.view.View.MeasureSpec.getMode(i1);
        k2 = android.view.View.MeasureSpec.getMode(j1);
        l1 = android.view.View.MeasureSpec.getSize(i1);
        j2 = android.view.View.MeasureSpec.getSize(j1);
        if (l2 != 0x40000000) goto _L2; else goto _L1
_L1:
        int k1 = l1;
        if (k2 == 0x40000000) goto _L3; else goto _L2
_L2:
        if (!isInEditMode()) goto _L5; else goto _L4
_L4:
        if (l2 != 0x80000000) goto _L7; else goto _L6
_L6:
        k1 = l1;
_L11:
        if (k2 == 0x80000000)
        {
            l1 = j2;
            i2 = k1;
            break MISSING_BLOCK_LABEL_84;
        }
        l1 = i2;
        i2 = k1;
          goto _L8
_L7:
        k1 = l1;
        if (l2 == 0)
        {
            k1 = 300;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (k2 == 0) goto _L9; else goto _L3
_L3:
        l1 = j2;
        i2 = k1;
          goto _L9
_L5:
        throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
_L9:
        setMeasuredDimension(i2, l1);
        if (B != null && ds.x(this))
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        k2 = ds.h(this);
        l2 = getChildCount();
        j2 = 0;
        while (j2 < l2) 
        {
            View view = getChildAt(j2);
            if (view.getVisibility() != 8)
            {
                g g1 = (g)view.getLayoutParams();
                if (k1 != 0)
                {
                    int i3 = cq.a(g1.a, k2);
                    if (ds.x(view))
                    {
                        a.a(view, B, i3);
                    } else
                    {
                        a.a(g1, B, i3);
                    }
                }
                if (f(view))
                {
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i2 - g1.leftMargin - g1.rightMargin, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(l1 - g1.topMargin - g1.bottomMargin, 0x40000000));
                } else
                if (g(view))
                {
                    int j3 = e(view) & 7;
                    if ((0 & j3) != 0)
                    {
                        throw new IllegalStateException((new StringBuilder()).append("Child drawer has absolute gravity ").append(c(j3)).append(" but this ").append("DrawerLayout").append(" already has a ").append("drawer view along that edge").toString());
                    }
                    view.measure(getChildMeasureSpec(i1, e + g1.leftMargin + g1.rightMargin, g1.width), getChildMeasureSpec(j1, g1.topMargin + g1.bottomMargin, g1.height));
                } else
                {
                    throw new IllegalStateException((new StringBuilder()).append("Child ").append(view).append(" at index ").append(j2).append(" does not have a valid layout_gravity - must be Gravity.LEFT, ").append("Gravity.RIGHT or Gravity.NO_GRAVITY").toString());
                }
            }
            j2++;
        }
        return;
        if (true) goto _L11; else goto _L10
_L10:
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((SavedState) (parcelable)).a != 0)
        {
            View view = b(((SavedState) (parcelable)).a);
            if (view != null)
            {
                h(view);
            }
        }
        a(((SavedState) (parcelable)).b, 3);
        a(((SavedState) (parcelable)).c, 5);
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        View view = a();
        if (view != null)
        {
            savedstate.a = ((g)view.getLayoutParams()).a;
        }
        savedstate.b = p;
        savedstate.c = q;
        return savedstate;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        i.b(motionevent);
        j.b(motionevent);
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 3: default 56
    //                   0 58
    //                   1 90
    //                   2 56
    //                   3 204;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        return true;
_L2:
        float f1 = motionevent.getX();
        float f3 = motionevent.getY();
        u = f1;
        v = f3;
        r = false;
        s = false;
        return true;
_L3:
        float f2;
        float f4;
        f4 = motionevent.getX();
        f2 = motionevent.getY();
        motionevent = i.d((int)f4, (int)f2);
        if (motionevent == null || !f(motionevent)) goto _L6; else goto _L5
_L5:
        int i1;
        f4 -= u;
        f2 -= v;
        i1 = i.d();
        if (f4 * f4 + f2 * f2 >= (float)(i1 * i1)) goto _L6; else goto _L7
_L7:
        motionevent = a();
        if (motionevent == null) goto _L6; else goto _L8
_L8:
        boolean flag;
        if (a(motionevent) == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L10:
        a(flag);
        r = false;
        return true;
_L4:
        a(true);
        r = false;
        s = false;
        return true;
_L6:
        flag = true;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
        super.requestDisallowInterceptTouchEvent(flag);
        r = flag;
        if (flag)
        {
            a(true);
        }
    }

    public void requestLayout()
    {
        if (!n)
        {
            super.requestLayout();
        }
    }

    public void setDrawerListener(f f1)
    {
        t = f1;
    }

    public void setDrawerLockMode(int i1)
    {
        a(i1, 3);
        a(i1, 5);
    }

    public void setScrimColor(int i1)
    {
        f = i1;
        invalidate();
    }

    public void setStatusBarBackground(int i1)
    {
        Drawable drawable;
        if (i1 != 0)
        {
            drawable = ar.a(getContext(), i1);
        } else
        {
            drawable = null;
        }
        y = drawable;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable)
    {
        y = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i1)
    {
        y = new ColorDrawable(i1);
        invalidate();
    }

    static 
    {
        boolean flag = true;
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            flag = false;
        }
        c = flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new d();
        } else
        {
            a = new e();
        }
    }

    // Unreferenced inner class android/support/v4/widget/DrawerLayout$h$1

/* anonymous class */
    class h._cls1
        implements Runnable
    {

        final h a;

        public void run()
        {
            h.a(a);
        }

            
            {
                a = h1;
                super();
            }
    }

}
