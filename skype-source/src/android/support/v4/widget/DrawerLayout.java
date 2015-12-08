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
import android.support.v4.graphics.drawable.a;
import android.support.v4.view.ac;
import android.support.v4.view.e;
import android.support.v4.view.f;
import android.support.v4.view.m;
import android.support.v4.view.x;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.widget:
//            h, s, g

public class DrawerLayout extends ViewGroup
    implements android.support.v4.widget.h
{
    protected static class SavedState extends android.view.View.BaseSavedState
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

    final class a extends android.support.v4.view.a
    {

        final DrawerLayout a;
        private final Rect c = new Rect();

        public final void a(View view, android.support.v4.view.accessibility.c c1)
        {
            if (DrawerLayout.g())
            {
                super.a(view, c1);
            } else
            {
                android.support.v4.view.accessibility.c c2 = android.support.v4.view.accessibility.c.a(c1);
                super.a(view, c2);
                c1.a(view);
                Object obj = android.support.v4.view.x.i(view);
                if (obj instanceof View)
                {
                    c1.c((View)obj);
                }
                obj = c;
                c2.a(((Rect) (obj)));
                c1.b(((Rect) (obj)));
                c2.c(((Rect) (obj)));
                c1.d(((Rect) (obj)));
                c1.c(c2.f());
                c1.a(c2.l());
                c1.b(c2.m());
                c1.d(c2.n());
                c1.h(c2.k());
                c1.f(c2.i());
                c1.a(c2.d());
                c1.b(c2.e());
                c1.d(c2.g());
                c1.e(c2.h());
                c1.g(c2.j());
                c1.a(c2.b());
                c2.o();
                view = (ViewGroup)view;
                int j1 = view.getChildCount();
                int i1 = 0;
                while (i1 < j1) 
                {
                    View view1 = view.getChildAt(i1);
                    if (android.support.v4.widget.DrawerLayout.f(view1))
                    {
                        c1.b(view1);
                    }
                    i1++;
                }
            }
            c1.b(android/support/v4/widget/DrawerLayout.getName());
            c1.a(false);
            c1.b(false);
            c1.a(android.support.v4.view.accessibility.c.a.a);
            c1.a(android.support.v4.view.accessibility.c.a.b);
        }

        public final void a(View view, AccessibilityEvent accessibilityevent)
        {
            super.a(view, accessibilityevent);
            accessibilityevent.setClassName(android/support/v4/widget/DrawerLayout.getName());
        }

        public final boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
            if (DrawerLayout.g() || android.support.v4.widget.DrawerLayout.f(view))
            {
                return super.a(viewgroup, view, accessibilityevent);
            } else
            {
                return false;
            }
        }

        public final boolean d(View view, AccessibilityEvent accessibilityevent)
        {
            if (accessibilityevent.getEventType() == 32)
            {
                view = accessibilityevent.getText();
                accessibilityevent = android.support.v4.widget.DrawerLayout.a(a);
                if (accessibilityevent != null)
                {
                    int i1 = a.c(accessibilityevent);
                    accessibilityevent = a.a(i1);
                    if (accessibilityevent != null)
                    {
                        view.add(accessibilityevent);
                    }
                }
                return true;
            } else
            {
                return super.d(view, accessibilityevent);
            }
        }

        a()
        {
            a = DrawerLayout.this;
            super();
        }
    }

    final class b extends android.support.v4.view.a
    {

        final DrawerLayout a;

        public final void a(View view, android.support.v4.view.accessibility.c c1)
        {
            super.a(view, c1);
            if (!android.support.v4.widget.DrawerLayout.f(view))
            {
                c1.c(null);
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

    static final class d
        implements c
    {

        public final int a(Object obj)
        {
            return android.support.v4.widget.g.a(obj);
        }

        public final Drawable a(Context context)
        {
            return android.support.v4.widget.g.a(context);
        }

        public final void a(View view)
        {
            android.support.v4.widget.g.a(view);
        }

        public final void a(View view, Object obj, int i1)
        {
            android.support.v4.widget.g.a(view, obj, i1);
        }

        public final void a(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, Object obj, int i1)
        {
            android.support.v4.widget.g.a(marginlayoutparams, obj, i1);
        }

        d()
        {
        }
    }

    static final class e
        implements c
    {

        public final int a(Object obj)
        {
            return 0;
        }

        public final Drawable a(Context context)
        {
            return null;
        }

        public final void a(View view)
        {
        }

        public final void a(View view, Object obj, int i1)
        {
        }

        public final void a(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, Object obj, int i1)
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

    public static final class g extends android.view.ViewGroup.MarginLayoutParams
    {

        public int a;
        float b;
        boolean c;
        boolean d;

        public g()
        {
            super(-1, -1);
            a = 0;
        }

        public g(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            a = 0;
            context = context.obtainStyledAttributes(attributeset, android.support.v4.widget.DrawerLayout.f());
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

    private final class h extends s.a
    {

        final DrawerLayout a;
        private final int b;
        private s c;
        private final Runnable d = new _cls1(this);

        static void a(h h1)
        {
            int i1 = 0;
            int j1 = h1.c.b();
            View view;
            boolean flag;
            if (h1.b == 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                view = h1.a.b(3);
                if (view != null)
                {
                    i1 = -view.getWidth();
                }
                i1 += j1;
            } else
            {
                view = h1.a.b(5);
                i1 = h1.a.getWidth();
                i1 -= j1;
            }
            if (view != null && (flag && view.getLeft() < i1 || !flag && view.getLeft() > i1) && h1.a.a(view) == 0)
            {
                g g1 = (g)view.getLayoutParams();
                h1.c.a(view, i1, view.getTop());
                g1.c = true;
                h1.a.invalidate();
                h1.c();
                h1.a.e();
            }
        }

        private void c()
        {
            byte byte0 = 3;
            if (b == 3)
            {
                byte0 = 5;
            }
            View view = a.b(byte0);
            if (view != null)
            {
                a.e(view);
            }
        }

        public final int a(View view, int i1)
        {
            if (a.a(view, 3))
            {
                return Math.max(-view.getWidth(), Math.min(i1, 0));
            } else
            {
                int j1 = a.getWidth();
                return Math.max(j1 - view.getWidth(), Math.min(i1, j1));
            }
        }

        public final void a()
        {
            a.removeCallbacks(d);
        }

        public final void a(int i1)
        {
            a.a(i1, c.c());
        }

        public final void a(int i1, int j1)
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

        public final void a(s s1)
        {
            c = s1;
        }

        public final void a(View view, float f1)
        {
            float f2;
            int j1;
            f2 = DrawerLayout.b(view);
            j1 = view.getWidth();
            if (!a.a(view, 3)) goto _L2; else goto _L1
_L1:
            int i1;
            if (f1 > 0.0F || f1 == 0.0F && f2 > 0.5F)
            {
                i1 = 0;
            } else
            {
                i1 = -j1;
            }
_L4:
            c.a(i1, view.getTop());
            a.invalidate();
            return;
_L2:
            i1 = a.getWidth();
            if (f1 < 0.0F || f1 == 0.0F && f2 > 0.5F)
            {
                i1 -= j1;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final boolean a(View view)
        {
            return DrawerLayout.d(view) && a.a(view, b) && a.a(view) == 0;
        }

        public final int b(View view)
        {
            if (DrawerLayout.d(view))
            {
                return view.getWidth();
            } else
            {
                return 0;
            }
        }

        public final void b()
        {
            a.postDelayed(d, 160L);
        }

        public final void b(View view, int i1)
        {
            int j1 = view.getWidth();
            float f1;
            if (a.a(view, 3))
            {
                f1 = (float)(j1 + i1) / (float)j1;
            } else
            {
                f1 = (float)(a.getWidth() - i1) / (float)j1;
            }
            a.a(view, f1);
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

        public final int c(View view)
        {
            return view.getTop();
        }

        public final void d(View view)
        {
            ((g)view.getLayoutParams()).c = false;
            c();
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
    private static final boolean d;
    private Drawable A;
    private CharSequence B;
    private CharSequence C;
    private Object D;
    private boolean E;
    private Drawable F;
    private Drawable G;
    private Drawable H;
    private Drawable I;
    private final ArrayList J;
    private final b e;
    private float f;
    private int g;
    private int h;
    private float i;
    private Paint j;
    private final s k;
    private final s l;
    private final h m;
    private final h n;
    private int o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private f v;
    private float w;
    private float x;
    private Drawable y;
    private Drawable z;

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
        e = new b();
        h = 0x99000000;
        j = new Paint();
        q = true;
        F = null;
        G = null;
        H = null;
        I = null;
        setDescendantFocusability(0x40000);
        float f1 = getResources().getDisplayMetrics().density;
        g = (int)(64F * f1 + 0.5F);
        float f2 = 400F * f1;
        m = new h(3);
        n = new h(5);
        k = android.support.v4.widget.s.a(this, 1.0F, m);
        k.a(1);
        k.a(f2);
        m.a(k);
        l = android.support.v4.widget.s.a(this, 1.0F, n);
        l.a(2);
        l.a(f2);
        n.a(l);
        setFocusableInTouchMode(true);
        android.support.v4.view.x.c(this, 1);
        android.support.v4.view.x.a(this, new a());
        ac.a(this);
        if (android.support.v4.view.x.x(this))
        {
            a.a(this);
            y = a.a(context);
        }
        f = 10F * f1;
        J = new ArrayList();
    }

    static View a(DrawerLayout drawerlayout)
    {
        return drawerlayout.j();
    }

    private void a(View view, boolean flag)
    {
        int j1 = getChildCount();
        int i1 = 0;
        while (i1 < j1) 
        {
            View view1 = getChildAt(i1);
            if (!flag && !d(view1) || flag && view1 == view)
            {
                android.support.v4.view.x.c(view1, 1);
            } else
            {
                android.support.v4.view.x.c(view1, 4);
            }
            i1++;
        }
    }

    private void a(boolean flag)
    {
        int i1 = 0;
        int l1 = getChildCount();
        int j1 = 0;
        while (j1 < l1) 
        {
label0:
            {
                View view = getChildAt(j1);
                g g1 = (g)view.getLayoutParams();
                int k1 = i1;
                if (!d(view))
                {
                    break label0;
                }
                if (flag)
                {
                    k1 = i1;
                    if (!g1.c)
                    {
                        break label0;
                    }
                }
                k1 = view.getWidth();
                if (a(view, 3))
                {
                    i1 |= k.a(view, -k1, view.getTop());
                } else
                {
                    i1 |= l.a(view, getWidth(), view.getTop());
                }
                g1.c = false;
                k1 = i1;
            }
            j1++;
            i1 = k1;
        }
        m.a();
        n.a();
        if (i1 != 0)
        {
            invalidate();
        }
    }

    private static boolean a(Drawable drawable, int i1)
    {
        if (drawable == null || !android.support.v4.graphics.drawable.a.b(drawable))
        {
            return false;
        } else
        {
            android.support.v4.graphics.drawable.a.b(drawable, i1);
            return true;
        }
    }

    static float b(View view)
    {
        return ((g)view.getLayoutParams()).b;
    }

    private static String c(int i1)
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

    static boolean d(View view)
    {
        return (android.support.v4.view.e.a(((g)view.getLayoutParams()).a, android.support.v4.view.x.h(view)) & 7) != 0;
    }

    static boolean f(View view)
    {
        return android.support.v4.view.x.e(view) != 4 && android.support.v4.view.x.e(view) != 2;
    }

    static int[] f()
    {
        return b;
    }

    static boolean g()
    {
        return c;
    }

    private static boolean g(View view)
    {
        return ((g)view.getLayoutParams()).a == 0;
    }

    private View h()
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

    private void h(View view)
    {
        if (!d(view))
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a sliding drawer").toString());
        }
        if (q)
        {
            g g1 = (g)view.getLayoutParams();
            g1.b = 1.0F;
            g1.d = true;
            a(view, true);
        } else
        if (a(view, 3))
        {
            k.a(view, 0, view.getTop());
        } else
        {
            l.a(view, getWidth() - view.getWidth(), view.getTop());
        }
        invalidate();
    }

    private void i()
    {
        int i1;
        if (d)
        {
            return;
        }
        i1 = android.support.v4.view.x.h(this);
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        if (F == null) goto _L4; else goto _L3
_L3:
        Drawable drawable;
        a(F, i1);
        drawable = F;
_L6:
        z = drawable;
        i1 = android.support.v4.view.x.h(this);
        if (i1 == 0)
        {
            if (G == null)
            {
                break MISSING_BLOCK_LABEL_134;
            }
            a(G, i1);
            drawable = G;
        } else
        {
            if (F == null)
            {
                break MISSING_BLOCK_LABEL_134;
            }
            a(F, i1);
            drawable = F;
        }
_L7:
        A = drawable;
        return;
_L2:
        if (G == null) goto _L4; else goto _L5
_L5:
        a(G, i1);
        drawable = G;
          goto _L6
_L4:
        drawable = H;
          goto _L6
        drawable = I;
          goto _L7
    }

    private static boolean i(View view)
    {
        if (!d(view))
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a drawer").toString());
        } else
        {
            return ((g)view.getLayoutParams()).d;
        }
    }

    private View j()
    {
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            if (d(view) && j(view))
            {
                return view;
            }
        }

        return null;
    }

    private static boolean j(View view)
    {
        if (!d(view))
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a drawer").toString());
        }
        return ((g)view.getLayoutParams()).b > 0.0F;
    }

    public final int a(View view)
    {
        int i1 = c(view);
        if (i1 == 3)
        {
            return r;
        }
        if (i1 == 5)
        {
            return s;
        } else
        {
            return 0;
        }
    }

    public final CharSequence a(int i1)
    {
        i1 = android.support.v4.view.e.a(i1, android.support.v4.view.x.h(this));
        if (i1 == 3)
        {
            return B;
        }
        if (i1 == 5)
        {
            return C;
        } else
        {
            return null;
        }
    }

    public final void a()
    {
        View view = b(0x800003);
        if (view == null)
        {
            throw new IllegalArgumentException((new StringBuilder("No drawer view found with gravity ")).append(c(0x800003)).toString());
        } else
        {
            h(view);
            return;
        }
    }

    final void a(int i1, View view)
    {
        g g1;
        int j1 = k.a();
        int k1 = l.a();
        if (j1 == 1 || k1 == 1)
        {
            j1 = 1;
        } else
        if (j1 == 2 || k1 == 2)
        {
            j1 = 2;
        } else
        {
            j1 = 0;
        }
        if (view == null || i1 != 0) goto _L2; else goto _L1
_L1:
        g1 = (g)view.getLayoutParams();
        if (g1.b != 0.0F) goto _L4; else goto _L3
_L3:
        g1 = (g)view.getLayoutParams();
        if (g1.d)
        {
            g1.d = false;
            if (v != null)
            {
                v.onDrawerClosed(view);
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
_L2:
        if (j1 != o)
        {
            o = j1;
            if (v != null)
            {
                v.onDrawerStateChanged(j1);
            }
        }
        return;
_L4:
        if (g1.b == 1.0F)
        {
            g g2 = (g)view.getLayoutParams();
            if (!g2.d)
            {
                g2.d = true;
                if (v != null)
                {
                    v.onDrawerOpened(view);
                }
                a(view, true);
                if (hasWindowFocus())
                {
                    sendAccessibilityEvent(32);
                }
                view.requestFocus();
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    final void a(View view, float f1)
    {
        g g1 = (g)view.getLayoutParams();
        if (f1 != g1.b)
        {
            g1.b = f1;
            if (v != null)
            {
                v.onDrawerSlide(view, f1);
                return;
            }
        }
    }

    final boolean a(View view, int i1)
    {
        return (c(view) & i1) == i1;
    }

    public void addFocusables(ArrayList arraylist, int i1, int j1)
    {
        if (getDescendantFocusability() == 0x60000)
        {
            return;
        }
        int j2 = getChildCount();
        boolean flag = false;
        int k1 = 0;
        while (k1 < j2) 
        {
            View view = getChildAt(k1);
            if (d(view))
            {
                if (i(view))
                {
                    flag = true;
                    view.addFocusables(arraylist, i1, j1);
                }
            } else
            {
                J.add(view);
            }
            k1++;
        }
        if (!flag)
        {
            int i2 = J.size();
            for (int l1 = 0; l1 < i2; l1++)
            {
                View view1 = (View)J.get(l1);
                if (view1.getVisibility() == 0)
                {
                    view1.addFocusables(arraylist, i1, j1);
                }
            }

        }
        J.clear();
    }

    public void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.addView(view, i1, layoutparams);
        if (h() != null || d(view))
        {
            android.support.v4.view.x.c(view, 4);
        } else
        {
            android.support.v4.view.x.c(view, 1);
        }
        if (!c)
        {
            android.support.v4.view.x.a(view, e);
        }
    }

    final View b(int i1)
    {
        int j1 = android.support.v4.view.e.a(i1, android.support.v4.view.x.h(this));
        int k1 = getChildCount();
        for (i1 = 0; i1 < k1; i1++)
        {
            View view = getChildAt(i1);
            if ((c(view) & 7) == (j1 & 7))
            {
                return view;
            }
        }

        return null;
    }

    public final void b()
    {
        View view = b(0x800003);
        if (view == null)
        {
            throw new IllegalArgumentException((new StringBuilder("No drawer view found with gravity ")).append(c(0x800003)).toString());
        } else
        {
            e(view);
            return;
        }
    }

    final int c(View view)
    {
        return android.support.v4.view.e.a(((g)view.getLayoutParams()).a, android.support.v4.view.x.h(this));
    }

    public final boolean c()
    {
        View view = b(0x800003);
        if (view != null)
        {
            return i(view);
        } else
        {
            return false;
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

        i = f1;
        if (k.g() | l.g())
        {
            android.support.v4.view.x.d(this);
        }
    }

    public final boolean d()
    {
        View view = b(0x800003);
        if (view != null)
        {
            return j(view);
        } else
        {
            return false;
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long l1)
    {
        int i5 = getHeight();
        boolean flag1 = g(view);
        int i1 = 0;
        boolean flag = false;
        int i2 = getWidth();
        int j5 = canvas.save();
        int i3 = i2;
        if (flag1)
        {
            int k5 = getChildCount();
            int l3 = 0;
            i1 = ((flag) ? 1 : 0);
            while (l3 < k5) 
            {
                View view1 = getChildAt(l3);
                int k4 = i1;
                int l4 = i2;
                if (view1 != view)
                {
                    k4 = i1;
                    l4 = i2;
                    if (view1.getVisibility() == 0)
                    {
                        Drawable drawable = view1.getBackground();
                        if (drawable != null)
                        {
                            if (drawable.getOpacity() == -1)
                            {
                                i3 = 1;
                            } else
                            {
                                i3 = 0;
                            }
                        } else
                        {
                            i3 = 0;
                        }
                        k4 = i1;
                        l4 = i2;
                        if (i3 != 0)
                        {
                            k4 = i1;
                            l4 = i2;
                            if (d(view1))
                            {
                                k4 = i1;
                                l4 = i2;
                                if (view1.getHeight() >= i5)
                                {
                                    if (a(view1, 3))
                                    {
                                        i3 = view1.getRight();
                                        k4 = i1;
                                        l4 = i2;
                                        if (i3 > i1)
                                        {
                                            k4 = i3;
                                            l4 = i2;
                                        }
                                    } else
                                    {
                                        i3 = view1.getLeft();
                                        k4 = i1;
                                        l4 = i2;
                                        if (i3 < i2)
                                        {
                                            l4 = i3;
                                            k4 = i1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                l3++;
                i1 = k4;
                i2 = l4;
            }
            canvas.clipRect(i1, 0, i2, getHeight());
            i3 = i2;
        }
        boolean flag2 = super.drawChild(canvas, view, l1);
        canvas.restoreToCount(j5);
        if (i > 0.0F && flag1)
        {
            int j2 = (int)((float)((h & 0xff000000) >>> 24) * i);
            int i4 = h;
            j.setColor(j2 << 24 | i4 & 0xffffff);
            canvas.drawRect(i1, 0.0F, i3, getHeight(), j);
        } else
        {
            if (z != null && a(view, 3))
            {
                int j1 = z.getIntrinsicWidth();
                int k2 = view.getRight();
                int j3 = k.b();
                float f1 = Math.max(0.0F, Math.min((float)k2 / (float)j3, 1.0F));
                z.setBounds(k2, view.getTop(), k2 + j1, view.getBottom());
                z.setAlpha((int)(255F * f1));
                z.draw(canvas);
                return flag2;
            }
            if (A != null && a(view, 5))
            {
                int k1 = A.getIntrinsicWidth();
                int l2 = view.getLeft();
                int k3 = getWidth();
                int j4 = l.b();
                float f2 = Math.max(0.0F, Math.min((float)(k3 - l2) / (float)j4, 1.0F));
                A.setBounds(l2 - k1, view.getTop(), l2, view.getBottom());
                A.setAlpha((int)(255F * f2));
                A.draw(canvas);
                return flag2;
            }
        }
        return flag2;
    }

    final void e()
    {
        if (!u)
        {
            long l1 = SystemClock.uptimeMillis();
            MotionEvent motionevent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
            int j1 = getChildCount();
            for (int i1 = 0; i1 < j1; i1++)
            {
                getChildAt(i1).dispatchTouchEvent(motionevent);
            }

            motionevent.recycle();
            u = true;
        }
    }

    public final void e(View view)
    {
        if (!d(view))
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a sliding drawer").toString());
        }
        if (q)
        {
            view = (g)view.getLayoutParams();
            view.b = 0.0F;
            view.d = false;
        } else
        if (a(view, 3))
        {
            k.a(view, -view.getWidth(), view.getTop());
        } else
        {
            l.a(view, getWidth(), view.getTop());
        }
        invalidate();
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new g();
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

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        q = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        q = true;
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (E && y != null)
        {
            int i1 = a.a(D);
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
        int j1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        i1 = android.support.v4.view.m.a(motionevent);
        flag1 = k.a(motionevent);
        flag2 = l.a(motionevent);
        flag = false;
        j1 = 0;
        i1;
        JVM INSTR tableswitch 0 3: default 64
    //                   0 132
    //                   1 247
    //                   2 212
    //                   3 247;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        i1 = j1;
_L15:
        if (flag1 | flag2 || i1 != 0) goto _L6; else goto _L5
_L5:
        j1 = getChildCount();
        i1 = 0;
_L12:
        if (i1 >= j1) goto _L8; else goto _L7
_L7:
        if (!((g)getChildAt(i1).getLayoutParams()).c) goto _L10; else goto _L9
_L9:
        i1 = 1;
_L13:
        if (i1 == 0 && !u) goto _L11; else goto _L6
_L6:
        return true;
_L2:
        float f1 = motionevent.getX();
        float f2 = motionevent.getY();
        w = f1;
        x = f2;
        i1 = ((flag) ? 1 : 0);
        if (i > 0.0F)
        {
            motionevent = k.b((int)f1, (int)f2);
            i1 = ((flag) ? 1 : 0);
            if (motionevent != null)
            {
                i1 = ((flag) ? 1 : 0);
                if (g(motionevent))
                {
                    i1 = 1;
                }
            }
        }
        t = false;
        u = false;
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = j1;
        if (k.h())
        {
            m.a();
            n.a();
            i1 = j1;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        a(true);
        t = false;
        u = false;
        i1 = j1;
        continue; /* Loop/switch isn't completed */
_L10:
        i1++;
          goto _L12
_L8:
        i1 = 0;
          goto _L13
_L11:
        return false;
        if (true) goto _L15; else goto _L14
_L14:
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4)
        {
            boolean flag;
            if (j() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                android.support.v4.view.f.c(keyevent);
                return true;
            }
        }
        return super.onKeyDown(i1, keyevent);
    }

    public boolean onKeyUp(int i1, KeyEvent keyevent)
    {
        boolean flag = false;
        if (i1 == 4)
        {
            keyevent = j();
            if (keyevent != null && a(keyevent) == 0)
            {
                a(false);
            }
            if (keyevent != null)
            {
                flag = true;
            }
            return flag;
        } else
        {
            return super.onKeyUp(i1, keyevent);
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int k2;
        int l2;
        p = true;
        k2 = k1 - i1;
        l2 = getChildCount();
        k1 = 0;
_L2:
        View view;
        g g1;
        if (k1 >= l2)
        {
            break MISSING_BLOCK_LABEL_442;
        }
        view = getChildAt(k1);
        if (view.getVisibility() != 8)
        {
            g1 = (g)view.getLayoutParams();
            if (!g(view))
            {
                break; /* Loop/switch isn't completed */
            }
            view.layout(g1.leftMargin, g1.topMargin, g1.leftMargin + view.getMeasuredWidth(), g1.topMargin + view.getMeasuredHeight());
        }
_L6:
        k1++;
        if (true) goto _L2; else goto _L1
_L1:
        int i2;
        int i3;
        int j3;
        i3 = view.getMeasuredWidth();
        j3 = view.getMeasuredHeight();
        float f1;
        boolean flag1;
        if (a(view, 3))
        {
            i2 = -i3 + (int)((float)i3 * g1.b);
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
        JVM INSTR lookupswitch 2: default 208
    //                   16: 352
    //                   80: 312;
           goto _L3 _L4 _L5
_L4:
        break MISSING_BLOCK_LABEL_352;
_L3:
        view.layout(i2, g1.topMargin, i2 + i3, g1.topMargin + j3);
_L7:
        if (flag1)
        {
            a(view, f1);
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
          goto _L6
_L5:
        i1 = l1 - j1;
        view.layout(i2, i1 - g1.bottomMargin - view.getMeasuredHeight(), i2 + i3, i1 - g1.bottomMargin);
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
        view.layout(i2, i1, i2 + i3, i1 + j3);
          goto _L7
        p = false;
        q = false;
        return;
          goto _L6
    }

    protected void onMeasure(int i1, int j1)
    {
label0:
        {
label1:
            {
                int l1;
                int i2;
label2:
                {
                    int l3 = android.view.View.MeasureSpec.getMode(i1);
                    int j3 = android.view.View.MeasureSpec.getMode(j1);
                    int j2 = android.view.View.MeasureSpec.getSize(i1);
                    int l2 = android.view.View.MeasureSpec.getSize(j1);
                    if (l3 == 0x40000000)
                    {
                        i2 = l2;
                        l1 = j2;
                        if (j3 == 0x40000000)
                        {
                            break label2;
                        }
                    }
                    if (!isInEditMode())
                    {
                        break label1;
                    }
                    int k1 = j2;
                    if (l3 != 0x80000000)
                    {
                        k1 = j2;
                        if (l3 == 0)
                        {
                            k1 = 300;
                        }
                    }
                    i2 = l2;
                    l1 = k1;
                    if (j3 != 0x80000000)
                    {
                        i2 = l2;
                        l1 = k1;
                        if (j3 == 0)
                        {
                            i2 = 300;
                            l1 = k1;
                        }
                    }
                }
                setMeasuredDimension(l1, i2);
                boolean flag;
                int k2;
                int i3;
                int k3;
                if (D != null && android.support.v4.view.x.x(this))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                i3 = android.support.v4.view.x.h(this);
                k3 = getChildCount();
                k2 = 0;
                while (k2 < k3) 
                {
                    View view = getChildAt(k2);
                    if (view.getVisibility() != 8)
                    {
                        g g1 = (g)view.getLayoutParams();
                        if (flag)
                        {
                            int i4 = android.support.v4.view.e.a(g1.a, i3);
                            if (android.support.v4.view.x.x(view))
                            {
                                a.a(view, D, i4);
                            } else
                            {
                                a.a(g1, D, i4);
                            }
                        }
                        if (g(view))
                        {
                            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(l1 - g1.leftMargin - g1.rightMargin, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(i2 - g1.topMargin - g1.bottomMargin, 0x40000000));
                        } else
                        if (d(view))
                        {
                            if (d && android.support.v4.view.x.u(view) != f)
                            {
                                android.support.v4.view.x.f(view, f);
                            }
                            int j4 = c(view) & 7;
                            if ((j4 & 0) != 0)
                            {
                                throw new IllegalStateException((new StringBuilder("Child drawer has absolute gravity ")).append(c(j4)).append(" but this DrawerLayout already has a drawer view along that edge").toString());
                            }
                            view.measure(getChildMeasureSpec(i1, g + g1.leftMargin + g1.rightMargin, g1.width), getChildMeasureSpec(j1, g1.topMargin + g1.bottomMargin, g1.height));
                        } else
                        {
                            throw new IllegalStateException((new StringBuilder("Child ")).append(view).append(" at index ").append(k2).append(" does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY").toString());
                        }
                    }
                    k2++;
                }
                break label0;
            }
            throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
        }
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
        setDrawerLockMode(((SavedState) (parcelable)).b, 3);
        setDrawerLockMode(((SavedState) (parcelable)).c, 5);
    }

    public void onRtlPropertiesChanged(int i1)
    {
        i();
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        View view = h();
        if (view != null)
        {
            savedstate.a = ((g)view.getLayoutParams()).a;
        }
        savedstate.b = r;
        savedstate.c = s;
        return savedstate;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        k.b(motionevent);
        l.b(motionevent);
        switch (motionevent.getAction() & 0xff)
        {
        case 2: // '\002'
        default:
            return true;

        case 0: // '\0'
            float f1 = motionevent.getX();
            float f3 = motionevent.getY();
            w = f1;
            x = f3;
            t = false;
            u = false;
            return true;

        case 1: // '\001'
            float f4 = motionevent.getX();
            float f2 = motionevent.getY();
            boolean flag1 = true;
            motionevent = k.b((int)f4, (int)f2);
            boolean flag = flag1;
            if (motionevent != null)
            {
                flag = flag1;
                if (g(motionevent))
                {
                    f4 -= w;
                    f2 -= x;
                    int i1 = k.d();
                    flag = flag1;
                    if (f4 * f4 + f2 * f2 < (float)(i1 * i1))
                    {
                        motionevent = h();
                        flag = flag1;
                        if (motionevent != null)
                        {
                            if (a(motionevent) == 2)
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                        }
                    }
                }
            }
            a(flag);
            t = false;
            return true;

        case 3: // '\003'
            a(true);
            t = false;
            u = false;
            return true;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
        super.requestDisallowInterceptTouchEvent(flag);
        t = flag;
        if (flag)
        {
            a(true);
        }
    }

    public void requestLayout()
    {
        if (!p)
        {
            super.requestLayout();
        }
    }

    public void setChildInsets(Object obj, boolean flag)
    {
        D = obj;
        E = flag;
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

    public void setDrawerElevation(float f1)
    {
        f = f1;
        for (int i1 = 0; i1 < getChildCount(); i1++)
        {
            View view = getChildAt(i1);
            if (d(view))
            {
                android.support.v4.view.x.f(view, f);
            }
        }

    }

    public void setDrawerListener(f f1)
    {
        v = f1;
    }

    public void setDrawerLockMode(int i1)
    {
        setDrawerLockMode(i1, 3);
        setDrawerLockMode(i1, 5);
    }

    public void setDrawerLockMode(int i1, int j1)
    {
        j1 = android.support.v4.view.e.a(j1, android.support.v4.view.x.h(this));
        if (j1 == 3)
        {
            r = i1;
        } else
        if (j1 == 5)
        {
            s = i1;
        }
        if (i1 != 0)
        {
            s s1;
            if (j1 == 3)
            {
                s1 = k;
            } else
            {
                s1 = l;
            }
            s1.e();
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
            e(view);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void setDrawerLockMode(int i1, View view)
    {
        if (!d(view))
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a drawer with appropriate layout_gravity").toString());
        } else
        {
            setDrawerLockMode(i1, ((g)view.getLayoutParams()).a);
            return;
        }
    }

    public void setDrawerShadow(int i1, int j1)
    {
        setDrawerShadow(getResources().getDrawable(i1), j1);
    }

    public void setDrawerShadow(Drawable drawable, int i1)
    {
        if (!d) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((i1 & 0x800003) == 0x800003)
        {
            F = drawable;
        } else
        if ((i1 & 0x800005) == 0x800005)
        {
            G = drawable;
        } else
        {
            if ((i1 & 3) != 3)
            {
                continue; /* Loop/switch isn't completed */
            }
            H = drawable;
        }
_L4:
        i();
        invalidate();
        return;
        if ((i1 & 5) != 5) goto _L1; else goto _L3
_L3:
        I = drawable;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void setDrawerTitle(int i1, CharSequence charsequence)
    {
        i1 = android.support.v4.view.e.a(i1, android.support.v4.view.x.h(this));
        if (i1 == 3)
        {
            B = charsequence;
        } else
        if (i1 == 5)
        {
            C = charsequence;
            return;
        }
    }

    public void setScrimColor(int i1)
    {
        h = i1;
        invalidate();
    }

    public void setStatusBarBackground(int i1)
    {
        Drawable drawable;
        if (i1 != 0)
        {
            drawable = android.support.v4.content.a.a(getContext(), i1);
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
        boolean flag1 = true;
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        d = flag;
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
    final class h._cls1
        implements Runnable
    {

        final h a;

        public final void run()
        {
            android.support.v4.widget.h.a(a);
        }

            
            {
                a = h1;
                super();
            }
    }

}
