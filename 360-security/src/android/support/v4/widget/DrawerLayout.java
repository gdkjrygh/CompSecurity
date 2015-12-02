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
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.view.ab;
import android.support.v4.view.e;
import android.support.v4.view.g;
import android.support.v4.view.m;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

// Referenced classes of package android.support.v4.widget:
//            j

public class DrawerLayout extends ViewGroup
{
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        public int a;
        float b;
        boolean c;
        boolean d;

        public LayoutParams(int i1, int j1)
        {
            super(i1, j1);
            a = 0;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            a = 0;
            context = context.obtainStyledAttributes(attributeset, DrawerLayout.d());
            a = context.getInt(0, 0);
            context.recycle();
        }

        public LayoutParams(LayoutParams layoutparams)
        {
            super(layoutparams);
            a = 0;
            a = layoutparams.a;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            a = 0;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            a = 0;
        }
    }

    protected static class SavedState extends android.view.View.BaseSavedState
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

    class a extends android.support.v4.view.a
    {

        final DrawerLayout b;
        private final Rect c = new Rect();

        private void a(android.support.v4.view.a.a a1, android.support.v4.view.a.a a2)
        {
            Rect rect = c;
            a2.a(rect);
            a1.b(rect);
            a2.c(rect);
            a1.d(rect);
            a1.c(a2.h());
            a1.a(a2.p());
            a1.b(a2.q());
            a1.c(a2.s());
            a1.h(a2.m());
            a1.f(a2.k());
            a1.a(a2.f());
            a1.b(a2.g());
            a1.d(a2.i());
            a1.e(a2.j());
            a1.g(a2.l());
            a1.a(a2.b());
        }

        private void a(android.support.v4.view.a.a a1, ViewGroup viewgroup)
        {
            int j1 = viewgroup.getChildCount();
            for (int i1 = 0; i1 < j1; i1++)
            {
                View view = viewgroup.getChildAt(i1);
                if (DrawerLayout.k(view))
                {
                    a1.b(view);
                }
            }

        }

        public void a(View view, android.support.v4.view.a.a a1)
        {
            android.support.v4.view.a.a a2 = android.support.v4.view.a.a.a(a1);
            super.a(view, a2);
            a1.b(android/support/v4/widget/DrawerLayout.getName());
            a1.a(view);
            android.view.ViewParent viewparent = android.support.v4.view.s.f(view);
            if (viewparent instanceof View)
            {
                a1.c((View)viewparent);
            }
            a(a1, a2);
            a2.t();
            a(a1, (ViewGroup)view);
        }

        public boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
            if (DrawerLayout.k(view))
            {
                return super.a(viewgroup, view, accessibilityevent);
            } else
            {
                return false;
            }
        }

        public boolean b(View view, AccessibilityEvent accessibilityevent)
        {
            if (accessibilityevent.getEventType() == 32)
            {
                view = accessibilityevent.getText();
                accessibilityevent = DrawerLayout.a(b);
                if (accessibilityevent != null)
                {
                    int i1 = b.e(accessibilityevent);
                    accessibilityevent = b.a(i1);
                    if (accessibilityevent != null)
                    {
                        view.add(accessibilityevent);
                    }
                }
                return true;
            } else
            {
                return super.b(view, accessibilityevent);
            }
        }

        public void d(View view, AccessibilityEvent accessibilityevent)
        {
            super.d(view, accessibilityevent);
            accessibilityevent.setClassName(android/support/v4/widget/DrawerLayout.getName());
        }

        a()
        {
            b = DrawerLayout.this;
            super();
        }
    }

    final class b extends android.support.v4.view.a
    {

        final DrawerLayout b;

        public void a(View view, android.support.v4.view.a.a a1)
        {
            super.a(view, a1);
            if (!DrawerLayout.k(view))
            {
                a1.c(null);
            }
        }

        b()
        {
            b = DrawerLayout.this;
            super();
        }
    }

    public static interface c
    {

        public abstract void a(int i1);

        public abstract void a(View view);

        public abstract void a(View view, float f1);

        public abstract void b(View view);
    }

    private class d extends j.a
    {

        final DrawerLayout a;
        private final int b;
        private j c;
        private final Runnable d = new _cls1(this);

        static void a(d d1)
        {
            d1.c();
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
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                c.a(view, i1, view.getTop());
                layoutparams.c = true;
                a.invalidate();
                b();
                a.c();
            }
        }

        public int a(View view)
        {
            return view.getWidth();
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

        public void a(j j1)
        {
            c = j1;
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
            ((LayoutParams)view.getLayoutParams()).c = false;
            b();
        }

        public boolean b(int i1)
        {
            return false;
        }

        public d(int i1)
        {
            a = DrawerLayout.this;
            super();
            b = i1;
        }
    }


    private static final int a[] = {
        0x10100b3
    };
    private final b b;
    private int c;
    private int d;
    private float e;
    private Paint f;
    private final j g;
    private final j h;
    private final d i;
    private final d j;
    private int k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private boolean p;
    private boolean q;
    private c r;
    private float s;
    private float t;
    private Drawable u;
    private Drawable v;
    private CharSequence w;
    private CharSequence x;

    public DrawerLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        b = new b();
        d = 0x99000000;
        f = new Paint();
        m = true;
        float f1 = getResources().getDisplayMetrics().density;
        c = (int)(64F * f1 + 0.5F);
        f1 *= 400F;
        i = new d(3);
        j = new d(5);
        g = android.support.v4.widget.j.a(this, 1.0F, i);
        g.a(1);
        g.a(f1);
        i.a(g);
        h = android.support.v4.widget.j.a(this, 1.0F, j);
        h.a(2);
        h.a(f1);
        j.a(h);
        setFocusableInTouchMode(true);
        android.support.v4.view.s.c(this, 1);
        android.support.v4.view.s.a(this, new a());
        ab.a(this, false);
    }

    static View a(DrawerLayout drawerlayout)
    {
        return drawerlayout.g();
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
        return a;
    }

    private boolean e()
    {
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (((LayoutParams)getChildAt(i1).getLayoutParams()).c)
            {
                return true;
            }
        }

        return false;
    }

    private boolean f()
    {
        return g() != null;
    }

    private View g()
    {
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            if (g(view) && j(view))
            {
                return view;
            }
        }

        return null;
    }

    static boolean k(View view)
    {
        return m(view);
    }

    private static boolean l(View view)
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

    private static boolean m(View view)
    {
        return android.support.v4.view.s.c(view) != 4 && android.support.v4.view.s.c(view) != 2;
    }

    public int a(View view)
    {
        int i1 = e(view);
        if (i1 == 3)
        {
            return n;
        }
        if (i1 == 5)
        {
            return o;
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
            if (((LayoutParams)view.getLayoutParams()).d)
            {
                return view;
            }
        }

        return null;
    }

    public CharSequence a(int i1)
    {
        i1 = android.support.v4.view.e.a(i1, android.support.v4.view.s.e(this));
        if (i1 == 3)
        {
            return w;
        }
        if (i1 == 5)
        {
            return x;
        } else
        {
            return null;
        }
    }

    public void a(int i1, int j1)
    {
        j1 = android.support.v4.view.e.a(j1, android.support.v4.view.s.e(this));
        if (j1 == 3)
        {
            n = i1;
        } else
        if (j1 == 5)
        {
            o = i1;
        }
        if (i1 != 0)
        {
            j j2;
            if (j1 == 3)
            {
                j2 = g;
            } else
            {
                j2 = h;
            }
            j2.e();
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
        LayoutParams layoutparams;
        boolean flag = true;
        int k1 = g.a();
        int l1 = h.a();
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
        layoutparams = (LayoutParams)view.getLayoutParams();
        if (layoutparams.b != 0.0F) goto _L4; else goto _L3
_L3:
        b(view);
_L2:
        if (i1 != k)
        {
            k = i1;
            if (r != null)
            {
                r.a(i1);
            }
        }
        return;
_L4:
        if (layoutparams.b == 1.0F)
        {
            c(view);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    void a(View view, float f1)
    {
        if (r != null)
        {
            r.a(view, f1);
        }
    }

    void a(boolean flag)
    {
        int k1 = getChildCount();
        int i1 = 0;
        boolean flag1 = false;
        while (i1 < k1) 
        {
            View view = getChildAt(i1);
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            int j1 = ((flag1) ? 1 : 0);
            if (g(view))
            {
                if (flag && !layoutparams.c)
                {
                    j1 = ((flag1) ? 1 : 0);
                } else
                {
                    j1 = view.getWidth();
                    if (a(view, 3))
                    {
                        flag1 |= g.a(view, -j1, view.getTop());
                    } else
                    {
                        flag1 |= h.a(view, getWidth(), view.getTop());
                    }
                    layoutparams.c = false;
                    j1 = ((flag1) ? 1 : 0);
                }
            }
            i1++;
            flag1 = j1;
        }
        i.a();
        j.a();
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
        if (i1 > 0 || i1 < 0 && getChildCount() > 0)
        {
            android.support.v4.view.s.c(view, 4);
            android.support.v4.view.s.a(view, b);
        } else
        {
            android.support.v4.view.s.c(view, 1);
        }
        super.addView(view, i1, layoutparams);
    }

    View b(int i1)
    {
        int j1 = android.support.v4.view.e.a(i1, android.support.v4.view.s.e(this));
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
        Object obj = (LayoutParams)view.getLayoutParams();
        if (((LayoutParams) (obj)).d)
        {
            obj.d = false;
            if (r != null)
            {
                r.b(view);
            }
            obj = getChildAt(0);
            if (obj != null)
            {
                android.support.v4.view.s.c(((View) (obj)), 1);
            }
            android.support.v4.view.s.c(view, 4);
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
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (f1 == layoutparams.b)
        {
            return;
        } else
        {
            layoutparams.b = f1;
            a(view, f1);
            return;
        }
    }

    void c()
    {
        int i1 = 0;
        if (!q)
        {
            long l1 = SystemClock.uptimeMillis();
            MotionEvent motionevent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
            for (int j1 = getChildCount(); i1 < j1; i1++)
            {
                getChildAt(i1).dispatchTouchEvent(motionevent);
            }

            motionevent.recycle();
            q = true;
        }
    }

    void c(View view)
    {
        Object obj = (LayoutParams)view.getLayoutParams();
        if (!((LayoutParams) (obj)).d)
        {
            obj.d = true;
            if (r != null)
            {
                r.a(view);
            }
            obj = getChildAt(0);
            if (obj != null)
            {
                android.support.v4.view.s.c(((View) (obj)), 4);
            }
            android.support.v4.view.s.c(view, 1);
            sendAccessibilityEvent(32);
            view.requestFocus();
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
    }

    public void computeScroll()
    {
        int j1 = getChildCount();
        float f1 = 0.0F;
        for (int i1 = 0; i1 < j1; i1++)
        {
            f1 = Math.max(f1, ((LayoutParams)getChildAt(i1).getLayoutParams()).b);
        }

        e = f1;
        if (g.a(true) | h.a(true))
        {
            android.support.v4.view.s.b(this);
        }
    }

    float d(View view)
    {
        return ((LayoutParams)view.getLayoutParams()).b;
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
        if (view1 == view || view1.getVisibility() != 0 || !l(view1) || !g(view1))
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
        if (e > 0.0F && flag1)
        {
            i1 = (int)((float)((d & 0xff000000) >>> 24) * e);
            j2 = d;
            f.setColor(i1 << 24 | j2 & 0xffffff);
            canvas.drawRect(k1, 0.0F, j1, getHeight(), f);
        } else
        {
            if (u != null && a(view, 3))
            {
                i1 = u.getIntrinsicWidth();
                j1 = view.getRight();
                k1 = g.b();
                f1 = Math.max(0.0F, Math.min((float)j1 / (float)k1, 1.0F));
                u.setBounds(j1, view.getTop(), i1 + j1, view.getBottom());
                u.setAlpha((int)(255F * f1));
                u.draw(canvas);
                return flag2;
            }
            if (v != null && a(view, 5))
            {
                i1 = v.getIntrinsicWidth();
                j1 = view.getLeft();
                k1 = getWidth();
                j2 = h.b();
                f1 = Math.max(0.0F, Math.min((float)(k1 - j1) / (float)j2, 1.0F));
                v.setBounds(j1 - i1, view.getTop(), j1, view.getBottom());
                v.setAlpha((int)(255F * f1));
                v.draw(canvas);
                return flag2;
            }
        }
        return flag2;
    }

    int e(View view)
    {
        return android.support.v4.view.e.a(((LayoutParams)view.getLayoutParams()).a, android.support.v4.view.s.e(this));
    }

    boolean f(View view)
    {
        return ((LayoutParams)view.getLayoutParams()).a == 0;
    }

    boolean g(View view)
    {
        return (android.support.v4.view.e.a(((LayoutParams)view.getLayoutParams()).a, android.support.v4.view.s.e(view)) & 7) != 0;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams(-1, -1);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof LayoutParams)
        {
            return new LayoutParams((LayoutParams)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new LayoutParams(layoutparams);
        }
    }

    public void h(View view)
    {
        if (!g(view))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("View ").append(view).append(" is not a sliding drawer").toString());
        }
        if (m)
        {
            view = (LayoutParams)view.getLayoutParams();
            view.b = 1.0F;
            view.d = true;
        } else
        if (a(view, 3))
        {
            g.a(view, 0, view.getTop());
        } else
        {
            h.a(view, getWidth() - view.getWidth(), view.getTop());
        }
        invalidate();
    }

    public void i(View view)
    {
        if (!g(view))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("View ").append(view).append(" is not a sliding drawer").toString());
        }
        if (m)
        {
            view = (LayoutParams)view.getLayoutParams();
            view.b = 0.0F;
            view.d = false;
        } else
        if (a(view, 3))
        {
            g.a(view, -view.getWidth(), view.getTop());
        } else
        {
            h.a(view, getWidth(), view.getTop());
        }
        invalidate();
    }

    public boolean j(View view)
    {
        if (!g(view))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("View ").append(view).append(" is not a drawer").toString());
        }
        return ((LayoutParams)view.getLayoutParams()).b > 0.0F;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        m = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        m = true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        flag1 = false;
        i1 = android.support.v4.view.m.a(motionevent);
        flag2 = g.a(motionevent);
        flag3 = h.a(motionevent);
        i1;
        JVM INSTR tableswitch 0 3: default 60
    //                   0 96
    //                   1 190
    //                   2 159
    //                   3 190;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        boolean flag = false;
_L5:
        if (flag2 | flag3 || flag || e() || q)
        {
            flag1 = true;
        }
        return flag1;
_L2:
        float f1 = motionevent.getX();
        float f2 = motionevent.getY();
        s = f1;
        t = f2;
        if (e > 0.0F && f(g.d((int)f1, (int)f2)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p = false;
        q = false;
        continue; /* Loop/switch isn't completed */
_L4:
        if (!g.d(3))
        {
            continue; /* Loop/switch isn't completed */
        }
        i.a();
        j.a();
        flag = false;
        if (true) goto _L5; else goto _L3
_L3:
        a(true);
        p = false;
        q = false;
        if (true) goto _L1; else goto _L6
_L6:
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4 && f())
        {
            android.support.v4.view.g.b(keyevent);
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
            keyevent = g();
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
        l = true;
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
        LayoutParams layoutparams;
label0:
        {
            layoutparams = (LayoutParams)view.getLayoutParams();
            if (!f(view))
            {
                break label0;
            }
            view.layout(layoutparams.leftMargin, layoutparams.topMargin, layoutparams.leftMargin + view.getMeasuredWidth(), layoutparams.topMargin + view.getMeasuredHeight());
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
            i2 = (int)((float)i3 * layoutparams.b) + i1;
            f1 = (float)(i3 + i2) / (float)i3;
        } else
        {
            i2 = k2 - (int)((float)i3 * layoutparams.b);
            f1 = (float)(k2 - i2) / (float)i3;
        }
        if (f1 != layoutparams.b)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        layoutparams.a & 0x70;
        JVM INSTR lookupswitch 2: default 216
    //                   16: 360
    //                   80: 320;
           goto _L4 _L5 _L6
_L5:
        break MISSING_BLOCK_LABEL_360;
_L4:
        view.layout(i2, layoutparams.topMargin, i3 + i2, j3 + layoutparams.topMargin);
_L7:
        if (flag1)
        {
            b(view, f1);
        }
        int j2;
        int k3;
        if (layoutparams.b > 0.0F)
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
        view.layout(i2, i1 - layoutparams.bottomMargin - view.getMeasuredHeight(), i3 + i2, i1 - layoutparams.bottomMargin);
          goto _L7
        k3 = l1 - j1;
        j2 = (k3 - j3) / 2;
        if (j2 < layoutparams.topMargin)
        {
            i1 = layoutparams.topMargin;
        } else
        {
            i1 = j2;
            if (j2 + j3 > k3 - layoutparams.bottomMargin)
            {
                i1 = k3 - layoutparams.bottomMargin - j3;
            }
        }
        view.layout(i2, i1, i3 + i2, j3 + i1);
          goto _L7
        l = false;
        m = false;
        return;
          goto _L3
    }

    protected void onMeasure(int i1, int j1)
    {
        int l1;
        int i2;
        int j2;
        int k2;
        int i3;
        i2 = 300;
        i3 = android.view.View.MeasureSpec.getMode(i1);
        k2 = android.view.View.MeasureSpec.getMode(j1);
        l1 = android.view.View.MeasureSpec.getSize(i1);
        j2 = android.view.View.MeasureSpec.getSize(j1);
        if (i3 != 0x40000000) goto _L2; else goto _L1
_L1:
        int k1 = l1;
        if (k2 == 0x40000000) goto _L3; else goto _L2
_L2:
        if (!isInEditMode()) goto _L5; else goto _L4
_L4:
        if (i3 != 0x80000000) goto _L7; else goto _L6
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
        if (i3 == 0)
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
        j2 = getChildCount();
        k1 = 0;
        while (k1 < j2) 
        {
            View view = getChildAt(k1);
            if (view.getVisibility() != 8)
            {
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                if (f(view))
                {
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i2 - layoutparams.leftMargin - layoutparams.rightMargin, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(l1 - layoutparams.topMargin - layoutparams.bottomMargin, 0x40000000));
                } else
                if (g(view))
                {
                    int l2 = e(view) & 7;
                    if ((0 & l2) != 0)
                    {
                        throw new IllegalStateException((new StringBuilder()).append("Child drawer has absolute gravity ").append(c(l2)).append(" but this ").append("DrawerLayout").append(" already has a ").append("drawer view along that edge").toString());
                    }
                    view.measure(getChildMeasureSpec(i1, c + layoutparams.leftMargin + layoutparams.rightMargin, layoutparams.width), getChildMeasureSpec(j1, layoutparams.topMargin + layoutparams.bottomMargin, layoutparams.height));
                } else
                {
                    throw new IllegalStateException((new StringBuilder()).append("Child ").append(view).append(" at index ").append(k1).append(" does not have a valid layout_gravity - must be Gravity.LEFT, ").append("Gravity.RIGHT or Gravity.NO_GRAVITY").toString());
                }
            }
            k1++;
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
        SavedState savedstate;
        int i1;
        int j1;
        savedstate = new SavedState(super.onSaveInstanceState());
        j1 = getChildCount();
        i1 = 0;
_L2:
        Object obj;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        obj = getChildAt(i1);
        if (g(((View) (obj))))
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        if (!((LayoutParams) (obj = (LayoutParams)((View) (obj)).getLayoutParams())).d) goto _L4; else goto _L3
_L3:
        savedstate.a = ((LayoutParams) (obj)).a;
        savedstate.b = n;
        savedstate.c = o;
        return savedstate;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        g.b(motionevent);
        h.b(motionevent);
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
        s = f1;
        t = f3;
        p = false;
        q = false;
        return true;
_L3:
        float f2;
        float f4;
        f4 = motionevent.getX();
        f2 = motionevent.getY();
        motionevent = g.d((int)f4, (int)f2);
        if (motionevent == null || !f(motionevent)) goto _L6; else goto _L5
_L5:
        int i1;
        f4 -= s;
        f2 -= t;
        i1 = g.d();
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
        p = false;
        return true;
_L4:
        a(true);
        p = false;
        q = false;
        return true;
_L6:
        flag = true;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
        super.requestDisallowInterceptTouchEvent(flag);
        p = flag;
        if (flag)
        {
            a(true);
        }
    }

    public void requestLayout()
    {
        if (!l)
        {
            super.requestLayout();
        }
    }

    public void setDrawerListener(c c1)
    {
        r = c1;
    }

    public void setDrawerLockMode(int i1)
    {
        a(i1, 3);
        a(i1, 5);
    }

    public void setScrimColor(int i1)
    {
        d = i1;
        invalidate();
    }


    // Unreferenced inner class android/support/v4/widget/DrawerLayout$d$1

/* anonymous class */
    class d._cls1
        implements Runnable
    {

        final d a;

        public void run()
        {
            d.a(a);
        }

            
            {
                a = d1;
                super();
            }
    }

}
