// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import aG;
import aJ;
import aK;
import aP;
import aY;
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
import bB;
import bc;
import bk;
import bv;
import bw;
import java.util.List;

public class DrawerLayout extends ViewGroup
    implements bw
{
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        public int a;
        float b;
        boolean c;
        boolean d;

        public LayoutParams()
        {
            super(-1, -1);
            a = 0;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            a = 0;
            context = context.obtainStyledAttributes(attributeset, DrawerLayout.a());
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

    public static class SavedState extends android.view.View.BaseSavedState
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

    final class a extends aG
    {

        private final Rect b = new Rect();
        private DrawerLayout c;

        public final void a(View view, bk bk1)
        {
            if (DrawerLayout.b())
            {
                super.a(view, bk1);
            } else
            {
                bk bk2 = bk.a(bk1);
                super.a(view, bk2);
                bk1.a(view);
                Object obj = aY.i(view);
                if (obj instanceof View)
                {
                    bk1.c((View)obj);
                }
                obj = b;
                bk2.a(((Rect) (obj)));
                bk1.b(((Rect) (obj)));
                bk2.c(((Rect) (obj)));
                bk1.d(((Rect) (obj)));
                bk1.c(bk2.d());
                bk1.a(bk2.j());
                bk1.b(bk2.k());
                bk1.c(bk2.l());
                bk1.h(bk2.i());
                bk1.f(bk2.g());
                bk1.a(bk2.b());
                bk1.b(bk2.c());
                bk1.d(bk2.e());
                bk1.e(bk2.f());
                bk1.g(bk2.h());
                bk1.a(bk2.a());
                bk2.m();
                view = (ViewGroup)view;
                int j1 = view.getChildCount();
                int i1 = 0;
                while (i1 < j1) 
                {
                    View view1 = view.getChildAt(i1);
                    if (DrawerLayout.g(view1))
                    {
                        bk1.b(view1);
                    }
                    i1++;
                }
            }
            bk1.b(android/support/v4/widget/DrawerLayout.getName());
            bk1.a(false);
            bk1.b(false);
        }

        public final boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
            if (DrawerLayout.b() || DrawerLayout.g(view))
            {
                return super.a(viewgroup, view, accessibilityevent);
            } else
            {
                return false;
            }
        }

        public final boolean b(View view, AccessibilityEvent accessibilityevent)
        {
            if (accessibilityevent.getEventType() == 32)
            {
                accessibilityevent = accessibilityevent.getText();
                view = DrawerLayout.a(c);
                if (view != null)
                {
                    int i1 = c.c(view);
                    view = c;
                    i1 = aJ.a(i1, aY.h(view));
                    if (i1 == 3)
                    {
                        view = ((DrawerLayout) (view)).e;
                    } else
                    if (i1 == 5)
                    {
                        view = ((DrawerLayout) (view)).f;
                    } else
                    {
                        view = null;
                    }
                    if (view != null)
                    {
                        accessibilityevent.add(view);
                    }
                }
                return true;
            } else
            {
                return super.b(view, accessibilityevent);
            }
        }

        public final void d(View view, AccessibilityEvent accessibilityevent)
        {
            super.d(view, accessibilityevent);
            accessibilityevent.setClassName(android/support/v4/widget/DrawerLayout.getName());
        }

        a()
        {
            c = DrawerLayout.this;
            super();
        }
    }

    final class b extends aG
    {

        public final void a(View view, bk bk1)
        {
            super.a(view, bk1);
            if (!DrawerLayout.g(view))
            {
                bk1.c(null);
            }
        }

        b()
        {
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
            return bv.a(obj);
        }

        public final Drawable a(Context context)
        {
            return bv.a(context);
        }

        public final void a(View view)
        {
            bv.a(view);
        }

        public final void a(View view, Object obj, int i1)
        {
            bv.a(view, obj, i1);
        }

        public final void a(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, Object obj, int i1)
        {
            bv.a(marginlayoutparams, obj, i1);
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
    }

    final class g extends bB.a
    {

        final int a;
        bB b;
        final DrawerLayout c;
        private final Runnable d = new _cls1(this);

        public final void a()
        {
            c.removeCallbacks(d);
        }

        public final void a(int i1)
        {
            DrawerLayout drawerlayout;
            View view;
            LayoutParams layoutparams;
            drawerlayout = c;
            view = b.k;
            int j1 = drawerlayout.a.a;
            int k1 = drawerlayout.b.a;
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
            layoutparams = (LayoutParams)view.getLayoutParams();
            if (layoutparams.b != 0.0F) goto _L4; else goto _L3
_L3:
            layoutparams = (LayoutParams)view.getLayoutParams();
            if (layoutparams.d)
            {
                layoutparams.d = false;
                drawerlayout.a(view, false);
                if (drawerlayout.hasWindowFocus())
                {
                    view = drawerlayout.getRootView();
                    if (view != null)
                    {
                        view.sendAccessibilityEvent(32);
                    }
                }
            }
_L2:
            if (j1 != drawerlayout.c)
            {
                drawerlayout.c = j1;
            }
            return;
_L4:
            if (layoutparams.b == 1.0F)
            {
                LayoutParams layoutparams1 = (LayoutParams)view.getLayoutParams();
                if (!layoutparams1.d)
                {
                    layoutparams1.d = true;
                    drawerlayout.a(view, true);
                    if (drawerlayout.hasWindowFocus())
                    {
                        drawerlayout.sendAccessibilityEvent(32);
                    }
                    view.requestFocus();
                }
            }
            if (true) goto _L2; else goto _L5
_L5:
        }

        public final void a(int i1, int j1)
        {
            View view;
            if ((i1 & 1) == 1)
            {
                view = c.a(3);
            } else
            {
                view = c.a(5);
            }
            if (view != null && c.a(view) == 0)
            {
                b.a(view, j1);
            }
        }

        public final void a(View view, float f1)
        {
            float f2;
            int k1;
            f2 = DrawerLayout.b(view);
            k1 = view.getWidth();
            if (!c.a(view, 3)) goto _L2; else goto _L1
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
            b.a(i1, view.getTop());
            c.invalidate();
            return;
_L2:
            int j1 = c.getWidth();
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

        public final void a(View view, int i1)
        {
            int j1 = view.getWidth();
            float f1;
            if (c.a(view, 3))
            {
                f1 = (float)(j1 + i1) / (float)j1;
            } else
            {
                f1 = (float)(c.getWidth() - i1) / (float)j1;
            }
            DrawerLayout.a(view, f1);
            if (f1 == 0.0F)
            {
                i1 = 4;
            } else
            {
                i1 = 0;
            }
            view.setVisibility(i1);
            c.invalidate();
        }

        public final boolean a(View view)
        {
            return DrawerLayout.d(view) && c.a(view, a) && c.a(view) == 0;
        }

        public final int b(View view, int i1)
        {
            if (c.a(view, 3))
            {
                return Math.max(-view.getWidth(), Math.min(i1, 0));
            } else
            {
                int j1 = c.getWidth();
                return Math.max(j1 - view.getWidth(), Math.min(i1, j1));
            }
        }

        final void b()
        {
            byte byte0 = 3;
            if (a == 3)
            {
                byte0 = 5;
            }
            View view = c.a(byte0);
            if (view != null)
            {
                c.f(view);
            }
        }

        public final void b(View view)
        {
            ((LayoutParams)view.getLayoutParams()).c = false;
            b();
        }

        public final int c(View view)
        {
            if (DrawerLayout.d(view))
            {
                return view.getWidth();
            } else
            {
                return 0;
            }
        }

        public final void c()
        {
            c.postDelayed(d, 160L);
        }

        public final int d(View view)
        {
            return view.getTop();
        }

        public g(int i1)
        {
            c = DrawerLayout.this;
            super();
            a = i1;
        }
    }


    private static c A;
    private static final int g[] = {
        0x10100b3
    };
    private static final boolean h;
    final bB a;
    final bB b;
    int c;
    boolean d;
    CharSequence e;
    CharSequence f;
    private final b i;
    private int j;
    private int k;
    private float l;
    private Paint m;
    private final g n;
    private final g o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private float t;
    private float u;
    private Drawable v;
    private Drawable w;
    private Drawable x;
    private Object y;
    private boolean z;

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
        i = new b();
        k = 0x99000000;
        m = new Paint();
        q = true;
        setDescendantFocusability(0x40000);
        float f1 = getResources().getDisplayMetrics().density;
        j = (int)(64F * f1 + 0.5F);
        f1 *= 400F;
        n = new g(3);
        o = new g(5);
        a = bB.a(this, 1.0F, n);
        a.j = 1;
        a.h = f1;
        n.b = a;
        b = bB.a(this, 1.0F, o);
        b.j = 2;
        b.h = f1;
        o.b = b;
        setFocusableInTouchMode(true);
        aY.c(this, 1);
        aY.a(this, new a());
        bc.a(this);
        if (aY.q(this))
        {
            A.a(this);
            x = A.a(context);
        }
    }

    static View a(DrawerLayout drawerlayout)
    {
        return drawerlayout.d();
    }

    static void a(View view, float f1)
    {
        view = (LayoutParams)view.getLayoutParams();
        if (f1 == ((LayoutParams) (view)).b)
        {
            return;
        } else
        {
            view.b = f1;
            return;
        }
    }

    static int[] a()
    {
        return g;
    }

    static float b(View view)
    {
        return ((LayoutParams)view.getLayoutParams()).b;
    }

    public static String b(int i1)
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

    static boolean b()
    {
        return h;
    }

    private View c()
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

    private View d()
    {
        int j1 = getChildCount();
        boolean flag;
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            if (!d(view))
            {
                continue;
            }
            if (!d(view))
            {
                throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a drawer").toString());
            }
            if (((LayoutParams)view.getLayoutParams()).b > 0.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return view;
            }
        }

        return null;
    }

    static boolean d(View view)
    {
        return (aJ.a(((LayoutParams)view.getLayoutParams()).a, aY.h(view)) & 7) != 0;
    }

    static boolean g(View view)
    {
        return aY.e(view) != 4 && aY.e(view) != 2;
    }

    private static boolean h(View view)
    {
        return ((LayoutParams)view.getLayoutParams()).a == 0;
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

    public final View a(int i1)
    {
        int j1 = aJ.a(i1, aY.h(this));
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

    final void a(View view, boolean flag)
    {
        int j1 = getChildCount();
        int i1 = 0;
        while (i1 < j1) 
        {
            View view1 = getChildAt(i1);
            if (!flag && !d(view1) || flag && view1 == view)
            {
                aY.c(view1, 1);
            } else
            {
                aY.c(view1, 4);
            }
            i1++;
        }
    }

    public final void a(boolean flag)
    {
        int l1 = getChildCount();
        int j1 = 0;
        int i1 = 0;
        while (j1 < l1) 
        {
label0:
            {
                View view = getChildAt(j1);
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                int k1 = i1;
                if (!d(view))
                {
                    break label0;
                }
                if (flag)
                {
                    k1 = i1;
                    if (!layoutparams.c)
                    {
                        break label0;
                    }
                }
                k1 = view.getWidth();
                if (a(view, 3))
                {
                    i1 |= a.a(view, -k1, view.getTop());
                } else
                {
                    i1 |= b.a(view, getWidth(), view.getTop());
                }
                layoutparams.c = false;
                k1 = i1;
            }
            j1++;
            i1 = k1;
        }
        n.a();
        o.a();
        if (i1 != 0)
        {
            invalidate();
        }
    }

    final boolean a(View view, int i1)
    {
        return (c(view) & i1) == i1;
    }

    public void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.addView(view, i1, layoutparams);
        if (c() != null || d(view))
        {
            aY.c(view, 4);
        } else
        {
            aY.c(view, 1);
        }
        if (!h)
        {
            aY.a(view, i);
        }
    }

    final int c(View view)
    {
        return aJ.a(((LayoutParams)view.getLayoutParams()).a, aY.h(this));
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

        l = f1;
        if (a.c() | b.c())
        {
            aY.d(this);
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long l1)
    {
        int i1;
        int j2;
        int i3;
        int l3;
        int i5;
        int j5;
        int k5;
        boolean flag1;
        i5 = getHeight();
        flag1 = h(view);
        j2 = 0;
        boolean flag = false;
        i1 = getWidth();
        j5 = canvas.save();
        i3 = i1;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        k5 = getChildCount();
        l3 = 0;
        j2 = ((flag) ? 1 : 0);
_L6:
        View view1;
        if (l3 >= k5)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        view1 = getChildAt(l3);
        if (view1 == view || view1.getVisibility() != 0) goto _L2; else goto _L1
_L1:
        int k4;
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
        if (i3 == 0 || !d(view1) || view1.getHeight() < i5) goto _L2; else goto _L3
_L3:
        if (!a(view1, 3)) goto _L5; else goto _L4
_L4:
        i3 = view1.getRight();
        if (i3 > j2)
        {
            j2 = i3;
        }
        k4 = j2;
        i3 = i1;
_L7:
        l3++;
        i1 = i3;
        j2 = k4;
          goto _L6
_L5:
        int l4;
        l4 = view1.getLeft();
        i3 = l4;
        k4 = j2;
        if (l4 < i1) goto _L7; else goto _L2
_L2:
        i3 = i1;
        k4 = j2;
          goto _L7
        canvas.clipRect(j2, 0, i1, getHeight());
        i3 = i1;
        boolean flag2 = super.drawChild(canvas, view, l1);
        canvas.restoreToCount(j5);
        if (l > 0.0F && flag1)
        {
            int j1 = (int)((float)((k & 0xff000000) >>> 24) * l);
            int i4 = k;
            m.setColor(j1 << 24 | i4 & 0xffffff);
            canvas.drawRect(j2, 0.0F, i3, getHeight(), m);
        } else
        {
            if (v != null && a(view, 3))
            {
                int k1 = v.getIntrinsicWidth();
                int k2 = view.getRight();
                int j3 = a.i;
                float f1 = Math.max(0.0F, Math.min((float)k2 / (float)j3, 1.0F));
                v.setBounds(k2, view.getTop(), k1 + k2, view.getBottom());
                v.setAlpha((int)(255F * f1));
                v.draw(canvas);
                return flag2;
            }
            if (w != null && a(view, 5))
            {
                int i2 = w.getIntrinsicWidth();
                int l2 = view.getLeft();
                int k3 = getWidth();
                int j4 = b.i;
                float f2 = Math.max(0.0F, Math.min((float)(k3 - l2) / (float)j4, 1.0F));
                w.setBounds(l2 - i2, view.getTop(), l2, view.getBottom());
                w.setAlpha((int)(255F * f2));
                w.draw(canvas);
                return flag2;
            }
        }
        return flag2;
    }

    public final void e(View view)
    {
        if (!d(view))
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a sliding drawer").toString());
        }
        if (q)
        {
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            layoutparams.b = 1.0F;
            layoutparams.d = true;
            a(view, true);
        } else
        if (a(view, 3))
        {
            a.a(view, 0, view.getTop());
        } else
        {
            b.a(view, getWidth() - view.getWidth(), view.getTop());
        }
        invalidate();
    }

    public final void f(View view)
    {
        if (!d(view))
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a sliding drawer").toString());
        }
        if (q)
        {
            view = (LayoutParams)view.getLayoutParams();
            view.b = 0.0F;
            view.d = false;
        } else
        if (a(view, 3))
        {
            a.a(view, -view.getWidth(), view.getTop());
        } else
        {
            b.a(view, getWidth(), view.getTop());
        }
        invalidate();
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams();
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
        if (z && x != null)
        {
            int i1 = A.a(y);
            if (i1 > 0)
            {
                x.setBounds(0, 0, getWidth(), i1);
                x.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag = false;
        i1 = aP.a(motionevent);
        flag1 = a.a(motionevent);
        flag2 = b.a(motionevent);
        i1;
        JVM INSTR tableswitch 0 3: default 60
    //                   0 131
    //                   1 358
    //                   2 194
    //                   3 358;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        i1 = 0;
_L15:
        if (flag2 | flag1 || i1 != 0) goto _L6; else goto _L5
_L5:
        int j1;
        j1 = getChildCount();
        i1 = 0;
_L23:
        if (i1 >= j1) goto _L8; else goto _L7
_L7:
        if (!((LayoutParams)getChildAt(i1).getLayoutParams()).c) goto _L10; else goto _L9
_L9:
        i1 = 1;
_L24:
        if (i1 == 0 && !d) goto _L11; else goto _L6
_L6:
        flag = true;
_L11:
        return flag;
_L2:
        float f1;
        float f3;
        f1 = motionevent.getX();
        f3 = motionevent.getY();
        t = f1;
        u = f3;
        if (l <= 0.0F) goto _L13; else goto _L12
_L12:
        motionevent = a.b((int)f1, (int)f3);
        if (motionevent == null || !h(motionevent)) goto _L13; else goto _L14
_L14:
        i1 = 1;
_L25:
        d = false;
          goto _L15
_L4:
        int k1;
        motionevent = a;
        k1 = ((bB) (motionevent)).c.length;
        j1 = 0;
_L21:
        if (j1 >= k1) goto _L17; else goto _L16
_L16:
        if ((((bB) (motionevent)).g & 1 << j1) != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            float f2 = ((bB) (motionevent)).e[j1] - ((bB) (motionevent)).c[j1];
            float f4 = ((bB) (motionevent)).f[j1] - ((bB) (motionevent)).d[j1];
            if (f2 * f2 + f4 * f4 > (float)(((bB) (motionevent)).b * ((bB) (motionevent)).b))
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
        } else
        {
            i1 = 0;
        }
        if (i1 == 0) goto _L19; else goto _L18
_L18:
        i1 = 1;
_L22:
        if (i1 == 0) goto _L1; else goto _L20
_L20:
        n.a();
        o.a();
        i1 = 0;
          goto _L15
_L19:
        j1++;
          goto _L21
_L17:
        i1 = 0;
          goto _L22
_L3:
        a(true);
        d = false;
          goto _L1
_L10:
        i1++;
          goto _L23
_L8:
        i1 = 0;
          goto _L24
_L13:
        i1 = 0;
          goto _L25
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4)
        {
            boolean flag;
            if (d() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                aK.c(keyevent);
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
            keyevent = d();
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
        LayoutParams layoutparams;
        if (k1 >= l2)
        {
            break MISSING_BLOCK_LABEL_445;
        }
        view = getChildAt(k1);
        if (view.getVisibility() != 8)
        {
            layoutparams = (LayoutParams)view.getLayoutParams();
            if (!h(view))
            {
                break; /* Loop/switch isn't completed */
            }
            view.layout(layoutparams.leftMargin, layoutparams.topMargin, layoutparams.leftMargin + view.getMeasuredWidth(), layoutparams.topMargin + view.getMeasuredHeight());
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
        JVM INSTR lookupswitch 2: default 212
    //                   16: 355
    //                   80: 315;
           goto _L3 _L4 _L5
_L4:
        break MISSING_BLOCK_LABEL_355;
_L3:
        view.layout(i2, layoutparams.topMargin, i3 + i2, j3 + layoutparams.topMargin);
_L7:
        if (flag1)
        {
            a(view, f1);
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
          goto _L6
_L5:
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
        p = false;
        q = false;
        return;
          goto _L6
    }

    protected void onMeasure(int i1, int j1)
    {
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int l3;
        k2 = 300;
        j2 = 0;
        l3 = android.view.View.MeasureSpec.getMode(i1);
        i3 = android.view.View.MeasureSpec.getMode(j1);
        i2 = android.view.View.MeasureSpec.getSize(i1);
        l2 = android.view.View.MeasureSpec.getSize(j1);
        if (l3 != 0x40000000) goto _L2; else goto _L1
_L1:
        int l1 = i2;
        if (i3 == 0x40000000) goto _L3; else goto _L2
_L2:
        int k1;
        boolean flag;
        if (isInEditMode())
        {
            k1 = i2;
            if (l3 != 0x80000000)
            {
                k1 = i2;
                if (l3 == 0)
                {
                    k1 = 300;
                }
            }
            l1 = k1;
            if (i3 != 0x80000000)
            {
label0:
                {
                    l1 = k1;
                    if (i3 == 0)
                    {
                        l1 = k1;
                        k1 = k2;
                        break label0;
                    }
                }
            }
        } else
        {
            throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
        }
          goto _L3
_L5:
        setMeasuredDimension(l1, k1);
        if (y != null && aY.q(this))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k2 = aY.h(this);
        l2 = getChildCount();
        while (j2 < l2) 
        {
            View view = getChildAt(j2);
            if (view.getVisibility() != 8)
            {
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                if (flag)
                {
                    int j3 = aJ.a(layoutparams.a, k2);
                    if (aY.q(view))
                    {
                        A.a(view, y, j3);
                    } else
                    {
                        A.a(layoutparams, y, j3);
                    }
                }
                if (h(view))
                {
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(l1 - layoutparams.leftMargin - layoutparams.rightMargin, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(k1 - layoutparams.topMargin - layoutparams.bottomMargin, 0x40000000));
                } else
                if (d(view))
                {
                    int k3 = c(view) & 7;
                    if ((k3 & 0) != 0)
                    {
                        throw new IllegalStateException((new StringBuilder("Child drawer has absolute gravity ")).append(b(k3)).append(" but this DrawerLayout already has a drawer view along that edge").toString());
                    }
                    view.measure(getChildMeasureSpec(i1, j + layoutparams.leftMargin + layoutparams.rightMargin, layoutparams.width), getChildMeasureSpec(j1, layoutparams.topMargin + layoutparams.bottomMargin, layoutparams.height));
                } else
                {
                    throw new IllegalStateException((new StringBuilder("Child ")).append(view).append(" at index ").append(j2).append(" does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY").toString());
                }
            }
            j2++;
        }
        return;
_L3:
        k1 = l2;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((SavedState) (parcelable)).a != 0)
        {
            View view = a(((SavedState) (parcelable)).a);
            if (view != null)
            {
                e(view);
            }
        }
        setDrawerLockMode(((SavedState) (parcelable)).b, 3);
        setDrawerLockMode(((SavedState) (parcelable)).c, 5);
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        View view = c();
        if (view != null)
        {
            savedstate.a = ((LayoutParams)view.getLayoutParams()).a;
        }
        savedstate.b = r;
        savedstate.c = s;
        return savedstate;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        flag = false;
        a.b(motionevent);
        b.b(motionevent);
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 3: default 56
    //                   0 58
    //                   1 85
    //                   2 56
    //                   3 187;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        return true;
_L2:
        float f1 = motionevent.getX();
        float f3 = motionevent.getY();
        t = f1;
        u = f3;
        d = false;
        return true;
_L3:
        float f2;
        float f4;
        f4 = motionevent.getX();
        f2 = motionevent.getY();
        motionevent = a.b((int)f4, (int)f2);
        if (motionevent == null || !h(motionevent)) goto _L6; else goto _L5
_L5:
        int i1;
        f4 -= t;
        f2 -= u;
        i1 = a.b;
        if (f4 * f4 + f2 * f2 >= (float)(i1 * i1)) goto _L6; else goto _L7
_L7:
        motionevent = c();
        if (motionevent == null) goto _L6; else goto _L8
_L8:
        if (a(motionevent) == 2)
        {
            flag = true;
        }
_L10:
        a(flag);
        return true;
_L4:
        a(true);
        d = false;
        return true;
_L6:
        flag = true;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
        super.requestDisallowInterceptTouchEvent(flag);
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
        y = obj;
        z = flag;
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

    public void setDrawerListener(f f1)
    {
    }

    public void setDrawerLockMode(int i1)
    {
        setDrawerLockMode(i1, 3);
        setDrawerLockMode(i1, 5);
    }

    public void setDrawerLockMode(int i1, int j1)
    {
        j1 = aJ.a(j1, aY.h(this));
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
            bB bb;
            if (j1 == 3)
            {
                bb = a;
            } else
            {
                bb = b;
            }
            bb.a();
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
        if ((view = a(j1)) != null)
        {
            e(view);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if ((view = a(j1)) != null)
        {
            f(view);
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
            setDrawerLockMode(i1, ((LayoutParams)view.getLayoutParams()).a);
            return;
        }
    }

    public void setDrawerShadow(int i1, int j1)
    {
        setDrawerShadow(getResources().getDrawable(i1), j1);
    }

    public void setDrawerShadow(Drawable drawable, int i1)
    {
        i1 = aJ.a(i1, aY.h(this));
        if ((i1 & 3) == 3)
        {
            v = drawable;
            invalidate();
        }
        if ((i1 & 5) == 5)
        {
            w = drawable;
            invalidate();
        }
    }

    public void setDrawerTitle(int i1, CharSequence charsequence)
    {
        i1 = aJ.a(i1, aY.h(this));
        if (i1 == 3)
        {
            e = charsequence;
        } else
        if (i1 == 5)
        {
            f = charsequence;
            return;
        }
    }

    public void setScrimColor(int i1)
    {
        k = i1;
        invalidate();
    }

    public void setStatusBarBackground(int i1)
    {
        Object obj;
        if (i1 != 0)
        {
            obj = getContext();
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                obj = ((Context) (obj)).getDrawable(i1);
            } else
            {
                obj = ((Context) (obj)).getResources().getDrawable(i1);
            }
        } else
        {
            obj = null;
        }
        x = ((Drawable) (obj));
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable)
    {
        x = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i1)
    {
        x = new ColorDrawable(i1);
        invalidate();
    }

    static 
    {
        boolean flag = true;
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            flag = false;
        }
        h = flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            A = new d();
        } else
        {
            A = new e();
        }
    }

    // Unreferenced inner class android/support/v4/widget/DrawerLayout$g$1

/* anonymous class */
    final class g._cls1
        implements Runnable
    {

        private g a;

        public final void run()
        {
            boolean flag = false;
            Object obj1 = a;
            int k1 = ((g) (obj1)).b.i;
            Object obj;
            int i1;
            int j1;
            if (((g) (obj1)).a == 3)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                obj = ((g) (obj1)).c.a(3);
                LayoutParams layoutparams;
                long l1;
                if (obj != null)
                {
                    j1 = -((View) (obj)).getWidth();
                } else
                {
                    j1 = 0;
                }
                j1 += k1;
            } else
            {
                obj = ((g) (obj1)).c.a(5);
                j1 = ((g) (obj1)).c.getWidth();
                j1 -= k1;
            }
            if (obj != null && (i1 != 0 && ((View) (obj)).getLeft() < j1 || i1 == 0 && ((View) (obj)).getLeft() > j1) && ((g) (obj1)).c.a(((View) (obj))) == 0)
            {
                layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
                ((g) (obj1)).b.a(((View) (obj)), j1, ((View) (obj)).getTop());
                layoutparams.c = true;
                ((g) (obj1)).c.invalidate();
                ((g) (obj1)).b();
                obj = ((g) (obj1)).c;
                if (!((DrawerLayout) (obj)).d)
                {
                    l1 = SystemClock.uptimeMillis();
                    obj1 = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
                    j1 = ((DrawerLayout) (obj)).getChildCount();
                    for (i1 = ((flag) ? 1 : 0); i1 < j1; i1++)
                    {
                        ((DrawerLayout) (obj)).getChildAt(i1).dispatchTouchEvent(((MotionEvent) (obj1)));
                    }

                    ((MotionEvent) (obj1)).recycle();
                    obj.d = true;
                }
            }
        }

            
            {
                a = g1;
                super();
            }
    }

}
