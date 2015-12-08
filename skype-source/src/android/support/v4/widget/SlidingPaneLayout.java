// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.m;
import android.support.v4.view.x;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.widget:
//            s

public class SlidingPaneLayout extends ViewGroup
{
    static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel, (byte)0);
            }

            public final volatile Object[] newArray(int i1)
            {
                return new SavedState[i1];
            }

        };
        boolean a;

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            if (a)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a = flag;
        }

        SavedState(Parcel parcel, byte byte0)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

    final class a extends android.support.v4.view.a
    {

        final SlidingPaneLayout a;
        private final Rect c = new Rect();

        private boolean b(View view)
        {
            return a.b(view);
        }

        public final void a(View view, android.support.v4.view.accessibility.c c1)
        {
            android.support.v4.view.accessibility.c c2 = android.support.v4.view.accessibility.c.a(c1);
            super.a(view, c2);
            Rect rect = c;
            c2.a(rect);
            c1.b(rect);
            c2.c(rect);
            c1.d(rect);
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
            c1.b(c2.c());
            c2.o();
            c1.b(android/support/v4/widget/SlidingPaneLayout.getName());
            c1.a(view);
            view = x.i(view);
            if (view instanceof View)
            {
                c1.c((View)view);
            }
            int j1 = a.getChildCount();
            for (int i1 = 0; i1 < j1; i1++)
            {
                view = a.getChildAt(i1);
                if (!b(view) && view.getVisibility() == 0)
                {
                    x.c(view, 1);
                    c1.b(view);
                }
            }

        }

        public final void a(View view, AccessibilityEvent accessibilityevent)
        {
            super.a(view, accessibilityevent);
            accessibilityevent.setClassName(android/support/v4/widget/SlidingPaneLayout.getName());
        }

        public final boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
            if (!b(view))
            {
                return super.a(viewgroup, view, accessibilityevent);
            } else
            {
                return false;
            }
        }

        a()
        {
            a = SlidingPaneLayout.this;
            super();
        }
    }

    private final class b
        implements Runnable
    {

        final View a;
        final SlidingPaneLayout b;

        public final void run()
        {
            if (a.getParent() == b)
            {
                x.a(a, 0, null);
                SlidingPaneLayout.a(b, a);
            }
            SlidingPaneLayout.g(b).remove(this);
        }

        b(View view)
        {
            b = SlidingPaneLayout.this;
            super();
            a = view;
        }
    }

    private final class c extends s.a
    {

        final SlidingPaneLayout a;

        public final int a(View view, int i1)
        {
            view = (d)SlidingPaneLayout.d(a).getLayoutParams();
            if (SlidingPaneLayout.e(a))
            {
                int j1 = a.getWidth() - (a.getPaddingRight() + ((d) (view)).rightMargin + SlidingPaneLayout.d(a).getWidth());
                int l1 = SlidingPaneLayout.f(a);
                return Math.max(Math.min(i1, j1), j1 - l1);
            } else
            {
                int k1 = a.getPaddingLeft() + ((d) (view)).leftMargin;
                int i2 = SlidingPaneLayout.f(a);
                return Math.min(Math.max(i1, k1), k1 + i2);
            }
        }

        public final void a(int i1)
        {
label0:
            {
                if (SlidingPaneLayout.b(a).a() == 0)
                {
                    if (SlidingPaneLayout.c(a) != 0.0F)
                    {
                        break label0;
                    }
                    a.a(SlidingPaneLayout.d(a));
                    SlidingPaneLayout slidingpanelayout = a;
                    SlidingPaneLayout.d(a);
                    slidingpanelayout.sendAccessibilityEvent(32);
                    SlidingPaneLayout.a(a, false);
                }
                return;
            }
            SlidingPaneLayout slidingpanelayout1 = a;
            SlidingPaneLayout.d(a);
            slidingpanelayout1.sendAccessibilityEvent(32);
            SlidingPaneLayout.a(a, true);
        }

        public final void a(int i1, int j1)
        {
            SlidingPaneLayout.b(a).a(SlidingPaneLayout.d(a), j1);
        }

        public final void a(View view, float f1)
        {
            d d1 = (d)view.getLayoutParams();
            if (!SlidingPaneLayout.e(a)) goto _L2; else goto _L1
_L1:
            int i1;
label0:
            {
                int j1 = a.getPaddingRight() + d1.rightMargin;
                if (f1 >= 0.0F)
                {
                    i1 = j1;
                    if (f1 != 0.0F)
                    {
                        break label0;
                    }
                    i1 = j1;
                    if (SlidingPaneLayout.c(a) <= 0.5F)
                    {
                        break label0;
                    }
                }
                i1 = j1 + SlidingPaneLayout.f(a);
            }
            int k1 = SlidingPaneLayout.d(a).getWidth();
            i1 = a.getWidth() - i1 - k1;
_L4:
            SlidingPaneLayout.b(a).a(i1, view.getTop());
            a.invalidate();
            return;
_L2:
            int l1 = a.getPaddingLeft() + d1.leftMargin;
            if (f1 <= 0.0F)
            {
                i1 = l1;
                if (f1 != 0.0F)
                {
                    continue; /* Loop/switch isn't completed */
                }
                i1 = l1;
                if (SlidingPaneLayout.c(a) <= 0.5F)
                {
                    continue; /* Loop/switch isn't completed */
                }
            }
            i1 = l1 + SlidingPaneLayout.f(a);
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final boolean a(View view)
        {
            if (SlidingPaneLayout.a(a))
            {
                return false;
            } else
            {
                return ((d)view.getLayoutParams()).b;
            }
        }

        public final int b(View view)
        {
            return SlidingPaneLayout.f(a);
        }

        public final void b(View view, int i1)
        {
            SlidingPaneLayout.a(a, i1);
            a.invalidate();
        }

        public final int c(View view)
        {
            return view.getTop();
        }

        public final void d(View view)
        {
            a.a();
        }

        private c()
        {
            a = SlidingPaneLayout.this;
            super();
        }

        c(byte byte0)
        {
            this();
        }
    }

    public static final class d extends android.view.ViewGroup.MarginLayoutParams
    {

        private static final int e[] = {
            0x1010181
        };
        public float a;
        boolean b;
        boolean c;
        Paint d;


        public d()
        {
            super(-1, -1);
            a = 0.0F;
        }

        public d(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            a = 0.0F;
            context = context.obtainStyledAttributes(attributeset, e);
            a = context.getFloat(0, 0.0F);
            context.recycle();
        }

        public d(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            a = 0.0F;
        }

        public d(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            a = 0.0F;
        }
    }

    public static interface e
    {
    }

    static interface f
    {

        public abstract void a(SlidingPaneLayout slidingpanelayout, View view);
    }

    static class g
        implements f
    {

        public void a(SlidingPaneLayout slidingpanelayout, View view)
        {
            x.a(slidingpanelayout, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }

        g()
        {
        }
    }

    static final class h extends g
    {

        private Method a;
        private Field b;

        public final void a(SlidingPaneLayout slidingpanelayout, View view)
        {
            if (a != null && b != null)
            {
                try
                {
                    b.setBoolean(view, true);
                    a.invoke(view, null);
                }
                catch (Exception exception)
                {
                    Log.e("SlidingPaneLayout", "Error refreshing display list state", exception);
                }
                super.a(slidingpanelayout, view);
                return;
            } else
            {
                view.invalidate();
                return;
            }
        }

        h()
        {
            try
            {
                a = android/view/View.getDeclaredMethod("getDisplayList", null);
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                Log.e("SlidingPaneLayout", "Couldn't fetch getDisplayList method; dimming won't work right.", nosuchmethodexception);
            }
            try
            {
                b = android/view/View.getDeclaredField("mRecreateDisplayList");
                b.setAccessible(true);
                return;
            }
            catch (NoSuchFieldException nosuchfieldexception)
            {
                Log.e("SlidingPaneLayout", "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", nosuchfieldexception);
            }
        }
    }

    static final class i extends g
    {

        public final void a(SlidingPaneLayout slidingpanelayout, View view)
        {
            x.a(view, ((d)view.getLayoutParams()).d);
        }

        i()
        {
        }
    }


    static final f a;
    private int b;
    private int c;
    private Drawable d;
    private Drawable e;
    private final int f;
    private boolean g;
    private View h;
    private float i;
    private float j;
    private int k;
    private boolean l;
    private int m;
    private float n;
    private float o;
    private e p;
    private final s q;
    private boolean r;
    private boolean s;
    private final Rect t;
    private final ArrayList u;

    public SlidingPaneLayout(Context context)
    {
        this(context, null);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        b = 0xcccccccc;
        s = true;
        t = new Rect();
        u = new ArrayList();
        float f1 = context.getResources().getDisplayMetrics().density;
        f = (int)(32F * f1 + 0.5F);
        ViewConfiguration.get(context);
        setWillNotDraw(false);
        x.a(this, new a());
        x.c(this, 1);
        q = android.support.v4.widget.s.a(this, 0.5F, new c((byte)0));
        q.a(400F * f1);
    }

    static void a(SlidingPaneLayout slidingpanelayout, int i1)
    {
        if (slidingpanelayout.h == null)
        {
            slidingpanelayout.i = 0.0F;
        } else
        {
            boolean flag = slidingpanelayout.c();
            d d1 = (d)slidingpanelayout.h.getLayoutParams();
            int k1 = slidingpanelayout.h.getWidth();
            int j1 = i1;
            if (flag)
            {
                j1 = slidingpanelayout.getWidth() - i1 - k1;
            }
            if (flag)
            {
                i1 = slidingpanelayout.getPaddingRight();
            } else
            {
                i1 = slidingpanelayout.getPaddingLeft();
            }
            if (flag)
            {
                k1 = d1.rightMargin;
            } else
            {
                k1 = d1.leftMargin;
            }
            slidingpanelayout.i = (float)(j1 - (k1 + i1)) / (float)slidingpanelayout.k;
            if (slidingpanelayout.m != 0)
            {
                slidingpanelayout.b(slidingpanelayout.i);
            }
            if (d1.c)
            {
                slidingpanelayout.a(slidingpanelayout.h, slidingpanelayout.i, slidingpanelayout.b);
                return;
            }
        }
    }

    static void a(SlidingPaneLayout slidingpanelayout, View view)
    {
        slidingpanelayout.c(view);
    }

    private void a(View view, float f1, int i1)
    {
        d d1 = (d)view.getLayoutParams();
        if (f1 > 0.0F && i1 != 0)
        {
            int j1 = (int)((float)((0xff000000 & i1) >>> 24) * f1);
            if (d1.d == null)
            {
                d1.d = new Paint();
            }
            d1.d.setColorFilter(new PorterDuffColorFilter(j1 << 24 | 0xffffff & i1, android.graphics.PorterDuff.Mode.SRC_OVER));
            if (x.g(view) != 2)
            {
                x.a(view, 2, d1.d);
            }
            c(view);
        } else
        if (x.g(view) != 0)
        {
            if (d1.d != null)
            {
                d1.d.setColorFilter(null);
            }
            view = new b(view);
            u.add(view);
            x.a(this, view);
            return;
        }
    }

    private boolean a(float f1)
    {
        if (g)
        {
            boolean flag = c();
            d d1 = (d)h.getLayoutParams();
            int i1;
            if (flag)
            {
                i1 = getPaddingRight();
                int j1 = d1.rightMargin;
                int k1 = h.getWidth();
                i1 = (int)((float)getWidth() - ((float)(i1 + j1) + (float)k * f1 + (float)k1));
            } else
            {
                i1 = (int)((float)(getPaddingLeft() + d1.leftMargin) + (float)k * f1);
            }
            if (q.a(h, i1, h.getTop()))
            {
                a();
                x.d(this);
                return true;
            }
        }
        return false;
    }

    static boolean a(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.l;
    }

    static boolean a(SlidingPaneLayout slidingpanelayout, boolean flag)
    {
        slidingpanelayout.r = flag;
        return flag;
    }

    static s b(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.q;
    }

    private void b(float f1)
    {
        int i1;
        boolean flag = c();
        Object obj = (d)h.getLayoutParams();
        if (!((d) (obj)).c)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        int j1;
        int k1;
        int l1;
        int i2;
        if (flag)
        {
            i1 = ((d) (obj)).rightMargin;
        } else
        {
            i1 = ((d) (obj)).leftMargin;
        }
        if (i1 > 0)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        i1 = 1;
_L1:
        i2 = getChildCount();
        j1 = 0;
        while (j1 < i2) 
        {
            obj = getChildAt(j1);
            if (obj != h)
            {
                k1 = (int)((1.0F - j) * (float)m);
                j = f1;
                l1 = k1 - (int)((1.0F - f1) * (float)m);
                k1 = l1;
                if (flag)
                {
                    k1 = -l1;
                }
                ((View) (obj)).offsetLeftAndRight(k1);
                if (i1 != 0)
                {
                    float f2;
                    if (flag)
                    {
                        f2 = j - 1.0F;
                    } else
                    {
                        f2 = 1.0F - j;
                    }
                    a(((View) (obj)), f2, c);
                }
            }
            j1++;
        }
        break MISSING_BLOCK_LABEL_190;
        i1 = 0;
          goto _L1
    }

    private boolean b()
    {
        boolean flag = false;
        if (s || a(0.0F))
        {
            r = false;
            flag = true;
        }
        return flag;
    }

    static float c(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.i;
    }

    private void c(View view)
    {
        a.a(this, view);
    }

    private boolean c()
    {
        return x.h(this) == 1;
    }

    static View d(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.h;
    }

    static boolean e(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.c();
    }

    static int f(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.k;
    }

    static ArrayList g(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.u;
    }

    final void a()
    {
        int i1 = 0;
        for (int j1 = getChildCount(); i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            if (view.getVisibility() == 4)
            {
                view.setVisibility(0);
            }
        }

    }

    final void a(View view)
    {
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        boolean flag = c();
        View view1;
        int k2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        int k4;
        if (flag)
        {
            i1 = getWidth() - getPaddingRight();
        } else
        {
            i1 = getPaddingLeft();
        }
        if (flag)
        {
            j1 = getPaddingLeft();
        } else
        {
            j1 = getWidth() - getPaddingRight();
        }
        i3 = getPaddingTop();
        j3 = getHeight();
        k3 = getPaddingBottom();
        if (view == null) goto _L2; else goto _L1
_L1:
        if (!x.j(view)) goto _L4; else goto _L3
_L3:
        k1 = 1;
_L6:
        if (k1 != 0)
        {
            l1 = view.getLeft();
            i2 = view.getRight();
            j2 = view.getTop();
            k1 = view.getBottom();
            break MISSING_BLOCK_LABEL_93;
        }
          goto _L2
_L4:
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            Drawable drawable = view.getBackground();
            if (drawable != null)
            {
                if (drawable.getOpacity() == -1)
                {
                    k1 = 1;
                } else
                {
                    k1 = 0;
                }
                continue; /* Loop/switch isn't completed */
            }
        }
        k1 = 0;
        continue; /* Loop/switch isn't completed */
_L2:
        k1 = 0;
        j2 = 0;
        i2 = 0;
        l1 = 0;
        k2 = 0;
        l3 = getChildCount();
        do
        {
            if (k2 >= l3)
            {
                break;
            }
            view1 = getChildAt(k2);
            if (view1 == view)
            {
                break;
            }
            int l2;
            if (flag)
            {
                l2 = j1;
            } else
            {
                l2 = i1;
            }
            i4 = Math.max(l2, view1.getLeft());
            j4 = Math.max(i3, view1.getTop());
            if (flag)
            {
                l2 = i1;
            } else
            {
                l2 = j1;
            }
            l2 = Math.min(l2, view1.getRight());
            k4 = Math.min(j3 - k3, view1.getBottom());
            if (i4 >= l1 && j4 >= j2 && l2 <= i2 && k4 <= k1)
            {
                l2 = 4;
            } else
            {
                l2 = 0;
            }
            view1.setVisibility(l2);
            k2++;
        } while (true);
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    final boolean b(View view)
    {
        if (view != null)
        {
            view = (d)view.getLayoutParams();
            if (g && ((d) (view)).c && i > 0.0F)
            {
                return true;
            }
        }
        return false;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof d) && super.checkLayoutParams(layoutparams);
    }

    public void computeScroll()
    {
label0:
        {
            if (q.g())
            {
                if (g)
                {
                    break label0;
                }
                q.f();
            }
            return;
        }
        x.d(this);
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        Drawable drawable;
        View view;
        if (c())
        {
            drawable = e;
        } else
        {
            drawable = d;
        }
        if (getChildCount() > 1)
        {
            view = getChildAt(1);
        } else
        {
            view = null;
        }
        if (view == null || drawable == null)
        {
            return;
        }
        int k1 = view.getTop();
        int l1 = view.getBottom();
        int i2 = drawable.getIntrinsicWidth();
        int i1;
        int j1;
        if (c())
        {
            i1 = view.getRight();
            j1 = i1 + i2;
        } else
        {
            j1 = view.getLeft();
            i1 = j1 - i2;
        }
        drawable.setBounds(i1, k1, j1, l1);
        drawable.draw(canvas);
    }

    protected boolean drawChild(Canvas canvas, View view, long l1)
    {
        boolean flag;
        d d1 = (d)view.getLayoutParams();
        int i1 = canvas.save(2);
        if (g && !d1.b && h != null)
        {
            canvas.getClipBounds(t);
            android.graphics.Bitmap bitmap;
            if (c())
            {
                t.left = Math.max(t.left, h.getRight());
            } else
            {
                t.right = Math.min(t.right, h.getLeft());
            }
            canvas.clipRect(t);
        }
        if (android.os.Build.VERSION.SDK_INT >= 11) goto _L2; else goto _L1
_L1:
        if (!d1.c || i <= 0.0F) goto _L4; else goto _L3
_L3:
        if (!view.isDrawingCacheEnabled())
        {
            view.setDrawingCacheEnabled(true);
        }
        bitmap = view.getDrawingCache();
        if (bitmap == null) goto _L6; else goto _L5
_L5:
        canvas.drawBitmap(bitmap, view.getLeft(), view.getTop(), d1.d);
        flag = false;
_L7:
        canvas.restoreToCount(i1);
        return flag;
_L6:
        Log.e("SlidingPaneLayout", (new StringBuilder("drawChild: child view ")).append(view).append(" returned null drawing cache").toString());
_L2:
        flag = super.drawChild(canvas, view, l1);
        if (true) goto _L7; else goto _L4
_L4:
        if (view.isDrawingCacheEnabled())
        {
            view.setDrawingCacheEnabled(false);
        }
          goto _L2
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new d();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new d(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new d((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new d(layoutparams);
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        s = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        s = true;
        int i1 = 0;
        for (int j1 = u.size(); i1 < j1; i1++)
        {
            ((b)u.get(i1)).run();
        }

        u.clear();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        boolean flag2;
        boolean flag3;
        flag3 = false;
        i1 = android.support.v4.view.m.a(motionevent);
        if (!g && i1 == 0 && getChildCount() > 1)
        {
            View view = getChildAt(1);
            if (view != null)
            {
                if (!android.support.v4.widget.s.b(view, (int)motionevent.getX(), (int)motionevent.getY()))
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                r = flag2;
            }
        }
        if (g && (!l || i1 == 0)) goto _L2; else goto _L1
_L1:
        q.e();
        flag2 = super.onInterceptTouchEvent(motionevent);
_L8:
        return flag2;
_L2:
        boolean flag;
        boolean flag1;
        if (i1 == 3 || i1 == 1)
        {
            q.e();
            return false;
        }
        flag1 = false;
        flag = flag1;
        i1;
        JVM INSTR tableswitch 0 2: default 168
    //                   0 194
    //                   1 172
    //                   2 258;
           goto _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_258;
_L5:
        break; /* Loop/switch isn't completed */
_L3:
        flag = flag1;
_L9:
        if (q.a(motionevent))
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag3;
        if (!flag) goto _L8; else goto _L7
_L7:
        return true;
_L4:
        l = false;
        float f1 = motionevent.getX();
        float f3 = motionevent.getY();
        n = f1;
        o = f3;
        flag = flag1;
        if (android.support.v4.widget.s.b(h, (int)f1, (int)f3))
        {
            flag = flag1;
            if (b(h))
            {
                flag = true;
            }
        }
          goto _L9
        float f4 = motionevent.getX();
        float f2 = motionevent.getY();
        f4 = Math.abs(f4 - n);
        f2 = Math.abs(f2 - o);
        flag = flag1;
        if (f4 > (float)q.d())
        {
            flag = flag1;
            if (f2 > f4)
            {
                q.e();
                l = true;
                return false;
            }
        }
          goto _L9
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        boolean flag1 = c();
        int k2;
        int l2;
        int i3;
        if (flag1)
        {
            q.a(2);
        } else
        {
            q.a(1);
        }
        k2 = k1 - i1;
        if (flag1)
        {
            i1 = getPaddingRight();
        } else
        {
            i1 = getPaddingLeft();
        }
        if (flag1)
        {
            k1 = getPaddingLeft();
        } else
        {
            k1 = getPaddingRight();
        }
        i3 = getPaddingTop();
        l2 = getChildCount();
        j1 = i1;
        if (s)
        {
            float f1;
            View view;
            int k3;
            if (g && r)
            {
                f1 = 1.0F;
            } else
            {
                f1 = 0.0F;
            }
            i = f1;
        }
        l1 = 0;
        while (l1 < l2) 
        {
            view = getChildAt(l1);
            int j2 = i1;
            int i2 = j1;
            if (view.getVisibility() != 8)
            {
                d d1 = (d)view.getLayoutParams();
                int j3 = view.getMeasuredWidth();
                i2 = 0;
                j2 = 0;
                if (d1.b)
                {
                    i2 = d1.leftMargin;
                    k3 = d1.rightMargin;
                    k3 = Math.min(i1, k2 - k1 - f) - j1 - (i2 + k3);
                    k = k3;
                    if (flag1)
                    {
                        i2 = d1.rightMargin;
                    } else
                    {
                        i2 = d1.leftMargin;
                    }
                    if (j1 + i2 + k3 + j3 / 2 > k2 - k1)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    d1.c = flag;
                    k3 = (int)((float)k3 * i);
                    j1 += k3 + i2;
                    i = (float)k3 / (float)k;
                    i2 = j2;
                } else
                {
                    j1 = i2;
                    if (g)
                    {
                        j1 = i2;
                        if (m != 0)
                        {
                            j1 = (int)((1.0F - i) * (float)m);
                        }
                    }
                    j2 = i1;
                    i2 = j1;
                    j1 = j2;
                }
                if (flag1)
                {
                    j2 = (k2 - j1) + i2;
                    i2 = j2 - j3;
                } else
                {
                    i2 = j1 - i2;
                    j2 = i2 + j3;
                }
                view.layout(i2, i3, j2, i3 + view.getMeasuredHeight());
                j2 = i1 + view.getWidth();
                i2 = j1;
            }
            l1++;
            i1 = j2;
            j1 = i2;
        }
        if (s)
        {
            if (g)
            {
                if (m != 0)
                {
                    b(i);
                }
                if (((d)h.getLayoutParams()).c)
                {
                    a(h, i, b);
                }
            } else
            {
                i1 = 0;
                while (i1 < l2) 
                {
                    a(getChildAt(i1), 0.0F, b);
                    i1++;
                }
            }
            a(h);
        }
        s = false;
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1;
        int l1;
        int k2;
        k2 = android.view.View.MeasureSpec.getMode(i1);
        k1 = android.view.View.MeasureSpec.getSize(i1);
        l1 = android.view.View.MeasureSpec.getMode(j1);
        j1 = android.view.View.MeasureSpec.getSize(j1);
        if (k2 == 0x40000000) goto _L2; else goto _L1
_L1:
        if (!isInEditMode()) goto _L4; else goto _L3
_L3:
        int j2;
        int l2;
        l2 = l1;
        i1 = j1;
        j2 = k1;
        if (k2 != 0x80000000)
        {
            l2 = l1;
            i1 = j1;
            j2 = k1;
            if (k2 == 0)
            {
                j2 = 300;
                i1 = j1;
                l2 = l1;
            }
        }
_L17:
        k1 = 0;
        j1 = -1;
        l2;
        JVM INSTR lookupswitch 2: default 116
    //                   -2147483648: 336
    //                   1073741824: 318;
           goto _L5 _L6 _L7
_L5:
        float f1;
        int j3;
        int k4;
        int l4;
        boolean flag;
        f1 = 0.0F;
        flag = false;
        k4 = j2 - getPaddingLeft() - getPaddingRight();
        k2 = k4;
        l4 = getChildCount();
        if (l4 > 2)
        {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        h = null;
        j3 = 0;
_L12:
        if (j3 >= l4) goto _L9; else goto _L8
_L8:
        View view;
        d d1;
        view = getChildAt(j3);
        d1 = (d)view.getLayoutParams();
        if (view.getVisibility() != 8) goto _L11; else goto _L10
_L10:
        int l3;
        boolean flag1;
        d1.c = false;
        l3 = k2;
        l1 = k1;
        flag1 = flag;
_L15:
        j3++;
        flag = flag1;
        k1 = l1;
        k2 = l3;
          goto _L12
_L4:
        throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
_L2:
        l2 = l1;
        i1 = j1;
        j2 = k1;
        if (l1 == 0)
        {
            if (isInEditMode())
            {
                l2 = l1;
                i1 = j1;
                j2 = k1;
                if (l1 == 0)
                {
                    l2 = 0x80000000;
                    i1 = 300;
                    j2 = k1;
                }
            } else
            {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            }
        }
        continue; /* Loop/switch isn't completed */
_L7:
        j1 = i1 - getPaddingTop() - getPaddingBottom();
        k1 = j1;
          goto _L5
_L6:
        j1 = i1 - getPaddingTop() - getPaddingBottom();
          goto _L5
_L11:
        float f2 = f1;
        if (d1.a <= 0.0F) goto _L14; else goto _L13
_L13:
        f2 = f1 + d1.a;
        flag1 = flag;
        l1 = k1;
        f1 = f2;
        l3 = k2;
        if (d1.width == 0) goto _L15; else goto _L14
_L14:
        i1 = d1.leftMargin + d1.rightMargin;
        if (d1.width == -2)
        {
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(k4 - i1, 0x80000000);
        } else
        if (d1.width == -1)
        {
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(k4 - i1, 0x40000000);
        } else
        {
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(d1.width, 0x40000000);
        }
        if (d1.height == -2)
        {
            l1 = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x80000000);
        } else
        if (d1.height == -1)
        {
            l1 = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000);
        } else
        {
            l1 = android.view.View.MeasureSpec.makeMeasureSpec(d1.height, 0x40000000);
        }
        view.measure(i1, l1);
        l1 = view.getMeasuredWidth();
        l3 = view.getMeasuredHeight();
        i1 = k1;
        if (l2 == 0x80000000)
        {
            i1 = k1;
            if (l3 > k1)
            {
                i1 = Math.min(l3, j1);
            }
        }
        k1 = k2 - l1;
        if (k1 < 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        d1.b = flag1;
        flag |= flag1;
        flag1 = flag;
        l1 = i1;
        f1 = f2;
        l3 = k1;
        if (d1.b)
        {
            h = view;
            flag1 = flag;
            l1 = i1;
            f1 = f2;
            l3 = k1;
        }
          goto _L15
_L9:
        if (flag || f1 > 0.0F)
        {
            int k3 = k4 - f;
            int i2 = 0;
            while (i2 < l4) 
            {
                View view1 = getChildAt(i2);
                if (view1.getVisibility() == 8)
                {
                    continue;
                }
                d d2 = (d)view1.getLayoutParams();
                if (view1.getVisibility() != 8)
                {
                    int i3;
                    if (d2.width == 0 && d2.a > 0.0F)
                    {
                        i1 = 1;
                    } else
                    {
                        i1 = 0;
                    }
                    if (i1 != 0)
                    {
                        i3 = 0;
                    } else
                    {
                        i3 = view1.getMeasuredWidth();
                    }
                    if (flag && view1 != h)
                    {
                        if (d2.width < 0 && (i3 > k3 || d2.a > 0.0F))
                        {
                            if (i1 != 0)
                            {
                                if (d2.height == -2)
                                {
                                    i1 = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x80000000);
                                } else
                                if (d2.height == -1)
                                {
                                    i1 = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000);
                                } else
                                {
                                    i1 = android.view.View.MeasureSpec.makeMeasureSpec(d2.height, 0x40000000);
                                }
                            } else
                            {
                                i1 = android.view.View.MeasureSpec.makeMeasureSpec(view1.getMeasuredHeight(), 0x40000000);
                            }
                            view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(k3, 0x40000000), i1);
                        }
                    } else
                    if (d2.a > 0.0F)
                    {
                        if (d2.width == 0)
                        {
                            if (d2.height == -2)
                            {
                                i1 = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x80000000);
                            } else
                            if (d2.height == -1)
                            {
                                i1 = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000);
                            } else
                            {
                                i1 = android.view.View.MeasureSpec.makeMeasureSpec(d2.height, 0x40000000);
                            }
                        } else
                        {
                            i1 = android.view.View.MeasureSpec.makeMeasureSpec(view1.getMeasuredHeight(), 0x40000000);
                        }
                        if (flag)
                        {
                            int i4 = k4 - (d2.leftMargin + d2.rightMargin);
                            int i5 = android.view.View.MeasureSpec.makeMeasureSpec(i4, 0x40000000);
                            if (i3 != i4)
                            {
                                view1.measure(i5, i1);
                            }
                        } else
                        {
                            int j4 = Math.max(0, k2);
                            view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(i3 + (int)((d2.a * (float)j4) / f1), 0x40000000), i1);
                        }
                    }
                }
                i2++;
            }
        }
        setMeasuredDimension(j2, getPaddingTop() + k1 + getPaddingBottom());
        g = flag;
        if (q.a() != 0 && !flag)
        {
            q.f();
        }
        return;
        if (true) goto _L17; else goto _L16
_L16:
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((SavedState) (parcelable)).a)
        {
            if (s || a(1.0F))
            {
                r = true;
            }
        } else
        {
            b();
        }
        r = ((SavedState) (parcelable)).a;
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        boolean flag;
        if (g)
        {
            if (!g || i == 1.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = r;
        }
        savedstate.a = flag;
        return savedstate;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (i1 != k1)
        {
            s = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (!g)
        {
            return super.onTouchEvent(motionevent);
        }
        q.b(motionevent);
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 1: default 52
    //                   0 54
    //                   1 77;
           goto _L1 _L2 _L3
_L1:
        return true;
_L2:
        float f1 = motionevent.getX();
        float f3 = motionevent.getY();
        n = f1;
        o = f3;
        continue; /* Loop/switch isn't completed */
_L3:
        if (b(h))
        {
            float f2 = motionevent.getX();
            float f4 = motionevent.getY();
            float f5 = f2 - n;
            float f6 = f4 - o;
            int i1 = q.d();
            if (f5 * f5 + f6 * f6 < (float)(i1 * i1) && android.support.v4.widget.s.b(h, (int)f2, (int)f4))
            {
                b();
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void requestChildFocus(View view, View view1)
    {
        super.requestChildFocus(view, view1);
        if (!isInTouchMode() && !g)
        {
            boolean flag;
            if (view == h)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            r = flag;
        }
    }

    public void setCoveredFadeColor(int i1)
    {
        c = i1;
    }

    public void setPanelSlideListener(e e1)
    {
        p = e1;
    }

    public void setParallaxDistance(int i1)
    {
        m = i1;
        requestLayout();
    }

    public void setShadowDrawable(Drawable drawable)
    {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable)
    {
        d = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable)
    {
        e = drawable;
    }

    public void setShadowResource(int i1)
    {
        setShadowDrawable(getResources().getDrawable(i1));
    }

    public void setShadowResourceLeft(int i1)
    {
        setShadowDrawableLeft(getResources().getDrawable(i1));
    }

    public void setShadowResourceRight(int i1)
    {
        setShadowDrawableRight(getResources().getDrawable(i1));
    }

    public void setSliderFadeColor(int i1)
    {
        b = i1;
    }

    static 
    {
        int i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 >= 17)
        {
            a = new i();
        } else
        if (i1 >= 16)
        {
            a = new h();
        } else
        {
            a = new g();
        }
    }
}
