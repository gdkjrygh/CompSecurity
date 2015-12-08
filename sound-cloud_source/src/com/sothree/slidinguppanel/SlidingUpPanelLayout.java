// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sothree.slidinguppanel;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.VelocityTrackerCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ScrollerCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.sothree.slidinguppanel:
//            d, a, b, c

public class SlidingUpPanelLayout extends ViewGroup
{
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        private static final int a[] = {
            0x1010181
        };


        public LayoutParams()
        {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            context.obtainStyledAttributes(attributeset, a).recycle();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
        }
    }

    static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new com.sothree.slidinguppanel.c();
        c a;

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            parcel.writeString(a.toString());
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            try
            {
                a = (c)Enum.valueOf(com/sothree/slidinguppanel/SlidingUpPanelLayout$c, parcel.readString());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Parcel parcel)
            {
                a = c.b;
            }
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

    private final class a extends d.a
    {

        final SlidingUpPanelLayout a;

        public final void a()
        {
            if (SlidingUpPanelLayout.d(a).a != 0) goto _L2; else goto _L1
_L1:
            SlidingUpPanelLayout.a(a, SlidingUpPanelLayout.a(a, SlidingUpPanelLayout.c(a).getTop()));
            if (SlidingUpPanelLayout.e(a) != 1.0F) goto _L4; else goto _L3
_L3:
            if (SlidingUpPanelLayout.f(a) != c.a)
            {
                a.a();
                SlidingUpPanelLayout.a(a, c.a);
                SlidingUpPanelLayout slidinguppanellayout = a;
                View view = SlidingUpPanelLayout.c(a);
                if (slidinguppanellayout.f != null)
                {
                    slidinguppanellayout.f.onPanelExpanded(view);
                }
                slidinguppanellayout.sendAccessibilityEvent(32);
            }
_L2:
            return;
_L4:
            if (SlidingUpPanelLayout.e(a) != 0.0F)
            {
                break; /* Loop/switch isn't completed */
            }
            if (SlidingUpPanelLayout.f(a) != c.b)
            {
                SlidingUpPanelLayout.a(a, c.b);
                SlidingUpPanelLayout slidinguppanellayout1 = a;
                View view1 = SlidingUpPanelLayout.c(a);
                if (slidinguppanellayout1.f != null)
                {
                    slidinguppanellayout1.f.onPanelCollapsed(view1);
                }
                slidinguppanellayout1.sendAccessibilityEvent(32);
                return;
            }
            if (true) goto _L2; else goto _L5
_L5:
            if (SlidingUpPanelLayout.e(a) < 0.0F)
            {
                SlidingUpPanelLayout.a(a, c.d);
                SlidingUpPanelLayout.c(a).setVisibility(8);
                SlidingUpPanelLayout slidinguppanellayout2 = a;
                View view2 = SlidingUpPanelLayout.c(a);
                if (slidinguppanellayout2.f != null)
                {
                    slidinguppanellayout2.f.onPanelHidden(view2);
                }
                slidinguppanellayout2.sendAccessibilityEvent(32);
                return;
            }
            if (SlidingUpPanelLayout.f(a) != c.c)
            {
                a.a();
                SlidingUpPanelLayout.a(a, c.c);
                SlidingUpPanelLayout slidinguppanellayout3 = a;
                View view3 = SlidingUpPanelLayout.c(a);
                if (slidinguppanellayout3.f != null)
                {
                    slidinguppanellayout3.f.onPanelAnchored(view3);
                }
                slidinguppanellayout3.sendAccessibilityEvent(32);
                return;
            }
            if (true) goto _L2; else goto _L6
_L6:
        }

        public final void a(int i1)
        {
            SlidingUpPanelLayout.b(a, i1);
            a.invalidate();
        }

        public final void a(View view, float f1)
        {
            d d1;
            int i1;
            int j1;
            float f2 = f1;
            if (SlidingUpPanelLayout.g(a))
            {
                f2 = -f1;
            }
            if (f2 > 0.0F)
            {
                i1 = SlidingUpPanelLayout.b(a, 1.0F);
            } else
            {
label0:
                {
                    if (f2 < 0.0F)
                    {
                        break label0;
                    }
                    if (SlidingUpPanelLayout.a(a) != 1.0F && SlidingUpPanelLayout.e(a) >= (SlidingUpPanelLayout.a(a) + 1.0F) / 2.0F)
                    {
                        i1 = SlidingUpPanelLayout.b(a, 1.0F);
                    } else
                    if (SlidingUpPanelLayout.a(a) == 1.0F && SlidingUpPanelLayout.e(a) >= 0.5F)
                    {
                        i1 = SlidingUpPanelLayout.b(a, 1.0F);
                    } else
                    if (SlidingUpPanelLayout.a(a) != 1.0F && SlidingUpPanelLayout.e(a) >= SlidingUpPanelLayout.a(a))
                    {
                        i1 = SlidingUpPanelLayout.b(a, SlidingUpPanelLayout.a(a));
                    } else
                    {
                        if (SlidingUpPanelLayout.a(a) == 1.0F || SlidingUpPanelLayout.e(a) < SlidingUpPanelLayout.a(a) / 2.0F)
                        {
                            break label0;
                        }
                        i1 = SlidingUpPanelLayout.b(a, SlidingUpPanelLayout.a(a));
                    }
                }
            }
_L1:
            d1 = SlidingUpPanelLayout.d(a);
            j1 = view.getLeft();
            if (!d1.o)
            {
                throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
            } else
            {
                d1.a(j1, i1, (int)VelocityTrackerCompat.getXVelocity(d1.i, d1.c), (int)VelocityTrackerCompat.getYVelocity(d1.i, d1.c));
                a.invalidate();
                return;
            }
            i1 = SlidingUpPanelLayout.b(a, 0.0F);
              goto _L1
        }

        public final boolean a(View view)
        {
            while (SlidingUpPanelLayout.b(a) || view != SlidingUpPanelLayout.c(a)) 
            {
                return false;
            }
            return true;
        }

        public final int b(int i1)
        {
            int j1 = SlidingUpPanelLayout.b(a, 0.0F);
            int k1 = SlidingUpPanelLayout.b(a, 1.0F);
            if (SlidingUpPanelLayout.g(a))
            {
                return Math.min(Math.max(i1, k1), j1);
            } else
            {
                return Math.min(Math.max(i1, j1), k1);
            }
        }

        public final void b()
        {
            a.b();
        }

        public final int c()
        {
            return SlidingUpPanelLayout.h(a);
        }

        private a()
        {
            a = SlidingUpPanelLayout.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    public static interface b
    {

        public abstract void onPanelAnchored(View view);

        public abstract void onPanelCollapsed(View view);

        public abstract void onPanelExpanded(View view);

        public abstract void onPanelHidden(View view);

        public abstract void onPanelSlide(View view, float f1);
    }

    private static final class c extends Enum
    {

        public static final c a;
        public static final c b;
        public static final c c;
        public static final c d;
        public static final c e;
        private static final c f[];

        public static c valueOf(String s1)
        {
            return (c)Enum.valueOf(com/sothree/slidinguppanel/SlidingUpPanelLayout$c, s1);
        }

        public static c[] values()
        {
            return (c[])f.clone();
        }

        static 
        {
            a = new c("EXPANDED", 0);
            b = new c("COLLAPSED", 1);
            c = new c("ANCHORED", 2);
            d = new c("HIDDEN", 3);
            e = new c("DRAGGING", 4);
            f = (new c[] {
                a, b, c, d, e
            });
        }

        private c(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private static final String h = com/sothree/slidinguppanel/SlidingUpPanelLayout.getSimpleName();
    private static c i;
    private static final int j[] = {
        0x10100af
    };
    private float A;
    private final d B;
    private final Rect C;
    public int a;
    public boolean b;
    public View c;
    public c d;
    public boolean e;
    public b f;
    public boolean g;
    private int k;
    private int l;
    private final Paint m;
    private final Drawable n;
    private int o;
    private int p;
    private boolean q;
    private View r;
    private int s;
    private View t;
    private float u;
    private int v;
    private boolean w;
    private boolean x;
    private float y;
    private float z;

    public SlidingUpPanelLayout(Context context)
    {
        this(context, null);
    }

    public SlidingUpPanelLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SlidingUpPanelLayout(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        k = 400;
        l = 0x99000000;
        m = new Paint();
        a = -1;
        o = -1;
        p = -1;
        q = false;
        s = -1;
        d = c.b;
        A = 1.0F;
        g = true;
        C = new Rect();
        if (isInEditMode())
        {
            n = null;
            B = null;
            return;
        }
        if (attributeset != null)
        {
            TypedArray typedarray = context.obtainStyledAttributes(attributeset, j);
            if (typedarray != null)
            {
                i1 = typedarray.getInt(0, 0);
                if (i1 != 48 && i1 != 80)
                {
                    throw new IllegalArgumentException("gravity must be set to either top or bottom");
                }
                float f1;
                boolean flag;
                if (i1 == 80)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                b = flag;
            }
            typedarray.recycle();
            attributeset = context.obtainStyledAttributes(attributeset, com.sothree.slidinguppanel.a.a.b.SlidingUpPanelLayout);
            if (attributeset != null)
            {
                a = attributeset.getDimensionPixelSize(com.sothree.slidinguppanel.a.a.b.SlidingUpPanelLayout_panelHeight, -1);
                o = attributeset.getDimensionPixelSize(com.sothree.slidinguppanel.a.a.b.SlidingUpPanelLayout_shadowHeight, -1);
                p = attributeset.getDimensionPixelSize(com.sothree.slidinguppanel.a.a.b.SlidingUpPanelLayout_paralaxOffset, -1);
                k = attributeset.getInt(com.sothree.slidinguppanel.a.a.b.SlidingUpPanelLayout_flingVelocity, 400);
                l = attributeset.getColor(com.sothree.slidinguppanel.a.a.b.SlidingUpPanelLayout_fadeColor, 0x99000000);
                s = attributeset.getResourceId(com.sothree.slidinguppanel.a.a.b.SlidingUpPanelLayout_dragView, -1);
                q = attributeset.getBoolean(com.sothree.slidinguppanel.a.a.b.SlidingUpPanelLayout_overlay, false);
                A = attributeset.getFloat(com.sothree.slidinguppanel.a.a.b.SlidingUpPanelLayout_anchorPoint, 1.0F);
                d = c.values()[attributeset.getInt(com.sothree.slidinguppanel.a.a.b.SlidingUpPanelLayout_initialState, i.ordinal())];
            }
            attributeset.recycle();
        }
        f1 = context.getResources().getDisplayMetrics().density;
        if (a == -1)
        {
            a = (int)(68F * f1 + 0.5F);
        }
        if (o == -1)
        {
            o = (int)(4F * f1 + 0.5F);
        }
        if (p == -1)
        {
            p = (int)(0.0F * f1);
        }
        if (o > 0)
        {
            if (b)
            {
                n = getResources().getDrawable(com.sothree.slidinguppanel.a.a.a.above_shadow);
            } else
            {
                n = getResources().getDrawable(com.sothree.slidinguppanel.a.a.a.below_shadow);
            }
        } else
        {
            n = null;
        }
        setWillNotDraw(false);
        B = com.sothree.slidinguppanel.d.a(this, new a((byte)0));
        B.j = f1 * (float)k;
        x = true;
    }

    static float a(SlidingUpPanelLayout slidinguppanellayout)
    {
        return slidinguppanellayout.A;
    }

    static float a(SlidingUpPanelLayout slidinguppanellayout, float f1)
    {
        slidinguppanellayout.u = f1;
        return f1;
    }

    static float a(SlidingUpPanelLayout slidinguppanellayout, int i1)
    {
        return slidinguppanellayout.a(i1);
    }

    static c a(SlidingUpPanelLayout slidinguppanellayout, c c1)
    {
        slidinguppanellayout.d = c1;
        return c1;
    }

    private void a(View view)
    {
        if (r != null)
        {
            r.setOnClickListener(null);
        }
        r = view;
        if (r != null)
        {
            r.setClickable(true);
            r.setFocusable(false);
            r.setFocusableInTouchMode(false);
            r.setOnClickListener(new com.sothree.slidinguppanel.a(this));
        }
    }

    static int b(SlidingUpPanelLayout slidinguppanellayout, float f1)
    {
        return slidinguppanellayout.a(f1);
    }

    static void b(SlidingUpPanelLayout slidinguppanellayout, int i1)
    {
        slidinguppanellayout.d = c.e;
        slidinguppanellayout.u = slidinguppanellayout.a(i1);
        if (slidinguppanellayout.p > 0 && slidinguppanellayout.u >= 0.0F)
        {
            int k1 = (int)((float)slidinguppanellayout.p * Math.max(slidinguppanellayout.u, 0.0F));
            int j1 = k1;
            if (slidinguppanellayout.b)
            {
                j1 = -k1;
            }
            slidinguppanellayout.t.setTranslationY(j1);
        }
        View view = slidinguppanellayout.c;
        if (slidinguppanellayout.f != null)
        {
            slidinguppanellayout.f.onPanelSlide(view, slidinguppanellayout.u);
        }
        if (slidinguppanellayout.u <= 0.0F && !slidinguppanellayout.q)
        {
            LayoutParams layoutparams = (LayoutParams)slidinguppanellayout.t.getLayoutParams();
            if (slidinguppanellayout.b)
            {
                i1 -= slidinguppanellayout.getPaddingBottom();
            } else
            {
                i1 = slidinguppanellayout.getHeight() - slidinguppanellayout.getPaddingBottom() - slidinguppanellayout.c.getMeasuredHeight() - i1;
            }
            layoutparams.height = i1;
            slidinguppanellayout.t.requestLayout();
        }
    }

    static boolean b(SlidingUpPanelLayout slidinguppanellayout)
    {
        return slidinguppanellayout.w;
    }

    static View c(SlidingUpPanelLayout slidinguppanellayout)
    {
        return slidinguppanellayout.c;
    }

    static d d(SlidingUpPanelLayout slidinguppanellayout)
    {
        return slidinguppanellayout.B;
    }

    static float e(SlidingUpPanelLayout slidinguppanellayout)
    {
        return slidinguppanellayout.u;
    }

    private boolean e()
    {
        return x && c != null;
    }

    static c f(SlidingUpPanelLayout slidinguppanellayout)
    {
        return slidinguppanellayout.d;
    }

    static boolean g(SlidingUpPanelLayout slidinguppanellayout)
    {
        return slidinguppanellayout.b;
    }

    static int h(SlidingUpPanelLayout slidinguppanellayout)
    {
        return slidinguppanellayout.v;
    }

    public final float a(int i1)
    {
        int j1 = a(0.0F);
        if (b)
        {
            return (float)(j1 - i1) / (float)v;
        } else
        {
            return (float)(i1 - j1) / (float)v;
        }
    }

    public final int a(float f1)
    {
        int i1;
        int j1;
        if (c != null)
        {
            i1 = c.getMeasuredHeight();
        } else
        {
            i1 = 0;
        }
        j1 = (int)((float)v * f1);
        if (b)
        {
            return getMeasuredHeight() - getPaddingBottom() - a - j1;
        } else
        {
            return (getPaddingTop() - i1) + a + j1;
        }
    }

    final void a()
    {
        int i2;
        boolean flag;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        flag = false;
        if (getChildCount() == 0)
        {
            return;
        }
        j3 = getPaddingLeft();
        k2 = getWidth();
        l2 = getPaddingRight();
        i3 = getPaddingTop();
        i2 = getHeight();
        j2 = getPaddingBottom();
        if (c == null) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        int k1;
        int l1;
        Object obj = c.getBackground();
        if (obj != null && ((Drawable) (obj)).getOpacity() == -1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0) goto _L2; else goto _L3
_L3:
        l1 = c.getLeft();
        k1 = c.getRight();
        j1 = c.getTop();
        i1 = c.getBottom();
_L5:
        obj = getChildAt(0);
        j3 = Math.max(j3, ((View) (obj)).getLeft());
        i3 = Math.max(i3, ((View) (obj)).getTop());
        k2 = Math.min(k2 - l2, ((View) (obj)).getRight());
        j2 = Math.min(i2 - j2, ((View) (obj)).getBottom());
        i2 = ((flag) ? 1 : 0);
        if (j3 >= l1)
        {
            i2 = ((flag) ? 1 : 0);
            if (i3 >= j1)
            {
                i2 = ((flag) ? 1 : 0);
                if (k2 <= k1)
                {
                    i2 = ((flag) ? 1 : 0);
                    if (j2 <= i1)
                    {
                        i2 = 4;
                    }
                }
            }
        }
        ((View) (obj)).setVisibility(i2);
        return;
_L2:
        i1 = 0;
        j1 = 0;
        k1 = 0;
        l1 = 0;
        if (true) goto _L5; else goto _L4
_L4:
    }

    final void b()
    {
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            if (view.getVisibility() == 4)
            {
                view.setVisibility(0);
            }
        }

    }

    public final boolean b(float f1)
    {
        if (c != null && d != c.a)
        {
            c.setVisibility(0);
            if (g || c(f1))
            {
                return true;
            }
        }
        return false;
    }

    public final boolean c()
    {
        if (g)
        {
            d = c.b;
        } else
        {
            if (d == c.d || d == c.b)
            {
                return false;
            }
            if (!g && !c(0.0F))
            {
                return false;
            }
        }
        return true;
    }

    public final boolean c(float f1)
    {
        if (e())
        {
            int i1 = a(f1);
            d d1 = B;
            View view = c;
            int j1 = c.getLeft();
            d1.n = view;
            d1.c = -1;
            if (d1.a(j1, i1, 0, 0))
            {
                b();
                ViewCompat.postInvalidateOnAnimation(this);
                return true;
            }
        }
        return false;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
    }

    public void computeScroll()
    {
        if (B == null) goto _L2; else goto _L1
_L1:
        d d1 = B;
        if (d1.n == null) goto _L4; else goto _L3
_L3:
        if (d1.a == 2)
        {
            boolean flag1 = d1.l.computeScrollOffset();
            int i1 = d1.l.getCurrX();
            int k1 = d1.l.getCurrY();
            int l1 = i1 - d1.n.getLeft();
            int i2 = k1 - d1.n.getTop();
            if (l1 != 0)
            {
                d1.n.offsetLeftAndRight(l1);
            }
            if (i2 != 0)
            {
                d1.n.offsetTopAndBottom(i2);
            }
            if (l1 != 0 || i2 != 0)
            {
                d1.m.a(k1);
            }
            boolean flag = flag1;
            if (flag1)
            {
                flag = flag1;
                if (i1 == d1.l.getFinalX())
                {
                    flag = flag1;
                    if (k1 == d1.l.getFinalY())
                    {
                        d1.l.abortAnimation();
                        flag = d1.l.isFinished();
                    }
                }
            }
            if (!flag)
            {
                d1.p.post(d1.q);
            }
        }
        if (d1.a != 2) goto _L4; else goto _L5
_L5:
        int j1 = 1;
_L7:
        if (j1 != 0)
        {
            if (e())
            {
                break; /* Loop/switch isn't completed */
            }
            d d2 = B;
            d2.a();
            if (d2.a == 2)
            {
                d2.l.getCurrX();
                d2.l.getCurrY();
                d2.l.abortAnimation();
                d2.l.getCurrX();
                j1 = d2.l.getCurrY();
                d2.m.a(j1);
            }
            d2.b(0);
        }
_L2:
        return;
_L4:
        j1 = 0;
        if (true) goto _L7; else goto _L6
_L6:
        ViewCompat.postInvalidateOnAnimation(this);
        return;
    }

    public final boolean d()
    {
        return d == c.a;
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        if (e())
        {
            int k1 = c.getRight();
            int i1;
            int j1;
            int l1;
            if (b)
            {
                j1 = c.getTop() - o;
                i1 = c.getTop();
            } else
            {
                j1 = c.getBottom();
                i1 = c.getBottom() + o;
            }
            l1 = c.getLeft();
            if (n != null)
            {
                n.setBounds(l1, j1, k1, i1);
                n.draw(canvas);
                return;
            }
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long l1)
    {
        int i1 = canvas.save(2);
        if (e() && c != view && !q)
        {
            canvas.getClipBounds(C);
            int j1;
            boolean flag;
            if (b)
            {
                C.bottom = Math.min(C.bottom, c.getTop());
            } else
            {
                C.top = Math.max(C.top, c.getBottom());
            }
            canvas.clipRect(C);
        }
        flag = super.drawChild(canvas, view, l1);
        canvas.restoreToCount(i1);
        if (l != 0 && u > 0.0F)
        {
            i1 = (int)((float)((l & 0xff000000) >>> 24) * u);
            j1 = l;
            m.setColor(i1 << 24 | j1 & 0xffffff);
            canvas.drawRect(C, m);
        }
        return flag;
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
        g = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        g = true;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (s != -1)
        {
            a(findViewById(s));
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        boolean flag;
        flag = false;
        i1 = MotionEventCompat.getActionMasked(motionevent);
        if (isEnabled() && x && (!w || i1 == 0)) goto _L2; else goto _L1
_L1:
        B.a();
        flag = super.onInterceptTouchEvent(motionevent);
_L12:
        return flag;
_L2:
        float f1;
        float f5;
        if (i1 == 3 || i1 == 1)
        {
            B.a();
            return false;
        }
        f5 = motionevent.getX();
        f1 = motionevent.getY();
        i1;
        JVM INSTR tableswitch 0 2: default 112
    //                   0 219
    //                   1 112
    //                   2 237;
           goto _L3 _L4 _L3 _L5
_L3:
        int ai[];
        int j1;
        ai = B;
        j1 = MotionEventCompat.getActionMasked(motionevent);
        i1 = MotionEventCompat.getActionIndex(motionevent);
        if (j1 == 0)
        {
            ai.a();
        }
        if (((d) (ai)).i == null)
        {
            ai.i = VelocityTracker.obtain();
        }
        ((d) (ai)).i.addMovement(motionevent);
        j1;
        JVM INSTR tableswitch 0 6: default 208
    //                   0 453
    //                   1 799
    //                   2 615
    //                   3 799
    //                   4 208
    //                   5 536
    //                   6 785;
           goto _L6 _L7 _L8 _L9 _L8 _L6 _L10 _L11
_L6:
        if (((d) (ai)).a == 1)
        {
            return true;
        }
          goto _L12
_L4:
        w = false;
        y = f5;
        z = f1;
          goto _L3
_L5:
        f5 = Math.abs(f5 - y);
        f1 = Math.abs(f1 - z);
        i1 = B.b;
        if (e && f5 > (float)i1 && f1 < (float)i1)
        {
            return super.onInterceptTouchEvent(motionevent);
        }
        if (f1 > (float)i1 && f5 > f1)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = (int)y;
        i1 = (int)z;
        if (r == null) goto _L14; else goto _L13
_L13:
        ai = new int[2];
        r.getLocationOnScreen(ai);
        int ai1[] = new int[2];
        getLocationOnScreen(ai1);
        j1 += ai1[0];
        i1 += ai1[1];
        if (j1 < ai[0] || j1 >= ai[0] + r.getWidth() || i1 < ai[1] || i1 >= ai[1] + r.getHeight()) goto _L14; else goto _L15
_L15:
        i1 = 1;
_L17:
        if (i1 != 0) goto _L3; else goto _L16
_L16:
        B.a();
        w = true;
        return false;
_L14:
        i1 = 0;
          goto _L17
          goto _L3
_L7:
        float f2 = motionevent.getX();
        float f6 = motionevent.getY();
        i1 = MotionEventCompat.getPointerId(motionevent, 0);
        ai.a(f2, f6, i1);
        motionevent = ai.a((int)f2, (int)f6);
        if (motionevent == ((d) (ai)).n && ((d) (ai)).a == 2)
        {
            ai.a(motionevent, i1);
        }
        if ((((d) (ai)).h[i1] & ((d) (ai)).k) == 0);
          goto _L6
_L10:
        int k1 = MotionEventCompat.getPointerId(motionevent, i1);
        float f3 = MotionEventCompat.getX(motionevent, i1);
        float f7 = MotionEventCompat.getY(motionevent, i1);
        ai.a(f3, f7, k1);
        if (((d) (ai)).a != 0 && ((d) (ai)).a == 2)
        {
            motionevent = ai.a((int)f3, (int)f7);
            if (motionevent == ((d) (ai)).n)
            {
                ai.a(motionevent, k1);
            }
        }
          goto _L6
_L9:
        int l1 = MotionEventCompat.getPointerCount(motionevent);
        i1 = 0;
        do
        {
            if (i1 >= l1 || ((d) (ai)).d == null || ((d) (ai)).e == null)
            {
                break;
            }
            int i2 = MotionEventCompat.getPointerId(motionevent, i1);
            float f4 = MotionEventCompat.getX(motionevent, i1);
            float f9 = MotionEventCompat.getY(motionevent, i1);
            float f8 = ((d) (ai)).d[i2];
            f9 -= ((d) (ai)).e[i2];
            ai.b(f4 - f8, f9, i2);
            if (((d) (ai)).a == 1)
            {
                break;
            }
            View view = ai.a((int)((d) (ai)).d[i2], (int)((d) (ai)).e[i2]);
            if (view != null && ai.a(view, f9) && ai.a(view, i2))
            {
                break;
            }
            i1++;
        } while (true);
        ai.a(motionevent);
          goto _L6
_L11:
        ai.a(MotionEventCompat.getPointerId(motionevent, i1));
          goto _L6
_L8:
        ai.a();
          goto _L6
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int i2;
        int j2;
        i2 = getPaddingLeft();
        l1 = getPaddingTop();
        j2 = getChildCount();
        if (!g) goto _L2; else goto _L1
_L1:
        com.sothree.slidinguppanel.b.a[d.ordinal()];
        JVM INSTR tableswitch 1 3: default 64
    //                   1 209
    //                   2 217
    //                   3 228;
           goto _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_228;
_L3:
        u = 0.0F;
_L2:
        j1 = 0;
        while (j1 < j2) 
        {
            View view = getChildAt(j1);
            if (view.getVisibility() != 8 || j1 != 0 && !g)
            {
                int k2 = view.getMeasuredHeight();
                if (view == c)
                {
                    i1 = a(u);
                } else
                {
                    i1 = l1;
                }
                k1 = i1;
                if (!b)
                {
                    k1 = i1;
                    if (view == t)
                    {
                        k1 = i1;
                        if (!q)
                        {
                            k1 = a(u) + c.getMeasuredHeight();
                        }
                    }
                }
                view.layout(i2, k1, view.getMeasuredWidth() + i2, k2 + k1);
            }
            j1++;
        }
        break MISSING_BLOCK_LABEL_269;
_L4:
        u = 1.0F;
          goto _L2
_L5:
        u = A;
          goto _L2
        j1 = a(0.0F);
        if (b)
        {
            i1 = a;
        } else
        {
            i1 = -a;
        }
        u = a(i1 + j1);
          goto _L2
        if (g)
        {
            a();
        }
        g = false;
        return;
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1 = android.view.View.MeasureSpec.getMode(i1);
        int i2 = android.view.View.MeasureSpec.getSize(i1);
        i1 = android.view.View.MeasureSpec.getMode(j1);
        int j2 = android.view.View.MeasureSpec.getSize(j1);
        if (k1 != 0x40000000)
        {
            throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
        }
        if (i1 != 0x40000000)
        {
            throw new IllegalStateException("Height must have an exact value or MATCH_PARENT");
        }
        int k2 = getChildCount();
        if (k2 != 2)
        {
            throw new IllegalStateException("Sliding up panel layout must have exactly 2 children!");
        }
        t = getChildAt(0);
        c = getChildAt(1);
        if (r == null)
        {
            a(c);
        }
        if (c.getVisibility() == 8)
        {
            d = c.d;
        }
        int l1 = j2 - getPaddingTop() - getPaddingBottom();
        k1 = 0;
        do
        {
            while (k1 < k2) 
            {
                View view = getChildAt(k1);
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                if (view.getVisibility() != 8 || k1 != 0)
                {
                    if (view == t && !q && d != c.d)
                    {
                        j1 = l1 - a;
                    } else
                    {
                        j1 = l1;
                    }
                    if (layoutparams.width == -2)
                    {
                        i1 = android.view.View.MeasureSpec.makeMeasureSpec(i2, 0x80000000);
                    } else
                    if (layoutparams.width == -1)
                    {
                        i1 = android.view.View.MeasureSpec.makeMeasureSpec(i2, 0x40000000);
                    } else
                    {
                        i1 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.width, 0x40000000);
                    }
                    if (layoutparams.height == -2)
                    {
                        j1 = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x80000000);
                    } else
                    if (layoutparams.height == -1)
                    {
                        j1 = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000);
                    } else
                    {
                        j1 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000);
                    }
                    view.measure(i1, j1);
                    if (view == c)
                    {
                        v = c.getMeasuredHeight() - a;
                    }
                }
                k1++;
            }
            setMeasuredDimension(i2, j2);
            return;
        } while (true);
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        d = ((SavedState) (parcelable)).a;
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = d;
        return savedstate;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (j1 != l1)
        {
            g = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1;
        int j1;
        boolean flag;
        i1 = 0;
        j1 = 0;
        flag = true;
        if (e()) goto _L2; else goto _L1
_L1:
        flag = super.onTouchEvent(motionevent);
_L10:
        return flag;
_L2:
        d d1;
        int k1;
        int l1;
        d1 = B;
        l1 = MotionEventCompat.getActionMasked(motionevent);
        k1 = MotionEventCompat.getActionIndex(motionevent);
        if (l1 == 0)
        {
            d1.a();
        }
        if (d1.i == null)
        {
            d1.i = VelocityTracker.obtain();
        }
        d1.i.addMovement(motionevent);
        l1;
        JVM INSTR tableswitch 0 6: default 124
    //                   0 126
    //                   1 748
    //                   2 286
    //                   3 769
    //                   4 124
    //                   5 190
    //                   6 608;
           goto _L3 _L4 _L5 _L6 _L7 _L3 _L8 _L9
_L3:
        return true;
_L4:
        float f1 = motionevent.getX();
        float f6 = motionevent.getY();
        i1 = MotionEventCompat.getPointerId(motionevent, 0);
        motionevent = d1.a((int)f1, (int)f6);
        d1.a(f1, f6, i1);
        d1.a(motionevent, i1);
        if ((d1.h[i1] & d1.k) != 0)
        {
            return true;
        }
          goto _L10
_L8:
        i1 = MotionEventCompat.getPointerId(motionevent, k1);
        float f2 = MotionEventCompat.getX(motionevent, k1);
        float f7 = MotionEventCompat.getY(motionevent, k1);
        d1.a(f2, f7, i1);
        if (d1.a == 0)
        {
            d1.a(d1.a((int)f2, (int)f7), i1);
            return true;
        }
        j1 = (int)f2;
        k1 = (int)f7;
        if (com.sothree.slidinguppanel.d.a(d1.n, j1, k1))
        {
            d1.a(d1.n, i1);
            return true;
        }
          goto _L10
_L6:
        if (d1.a == 1)
        {
            i1 = MotionEventCompat.findPointerIndex(motionevent, d1.c);
            float f3 = MotionEventCompat.getX(motionevent, i1);
            float f8 = MotionEventCompat.getY(motionevent, i1);
            k1 = (int)(f3 - d1.f[d1.c]);
            l1 = (int)(f8 - d1.g[d1.c]);
            d1.n.getLeft();
            j1 = d1.n.getTop() + l1;
            i1 = d1.n.getLeft();
            int i2 = d1.n.getTop();
            if (k1 != 0)
            {
                d1.n.offsetLeftAndRight(0 - i1);
            }
            i1 = j1;
            if (l1 != 0)
            {
                i1 = d1.m.b(j1);
                d1.n.offsetTopAndBottom(i1 - i2);
            }
            if (k1 != 0 || l1 != 0)
            {
                d1.m.a(i1);
            }
            d1.a(motionevent);
            return true;
        }
        k1 = MotionEventCompat.getPointerCount(motionevent);
        i1 = j1;
        do
        {
            if (i1 >= k1)
            {
                break;
            }
            j1 = MotionEventCompat.getPointerId(motionevent, i1);
            float f4 = MotionEventCompat.getX(motionevent, i1);
            float f9 = MotionEventCompat.getY(motionevent, i1);
            float f11 = d1.d[j1];
            float f12 = f9 - d1.e[j1];
            d1.b(f4 - f11, f12, j1);
            if (d1.a == 1)
            {
                break;
            }
            View view = d1.a((int)f4, (int)f9);
            if (d1.a(view, f12) && d1.a(view, j1))
            {
                break;
            }
            i1++;
        } while (true);
        d1.a(motionevent);
        return true;
_L9:
        j1 = MotionEventCompat.getPointerId(motionevent, k1);
        if (d1.a != 1 || j1 != d1.c) goto _L12; else goto _L11
_L11:
        k1 = MotionEventCompat.getPointerCount(motionevent);
_L18:
        if (i1 >= k1) goto _L14; else goto _L13
_L13:
        l1 = MotionEventCompat.getPointerId(motionevent, i1);
        if (l1 == d1.c) goto _L16; else goto _L15
_L15:
        float f5;
        float f10;
        f5 = MotionEventCompat.getX(motionevent, i1);
        f10 = MotionEventCompat.getY(motionevent, i1);
        if (d1.a((int)f5, (int)f10) != d1.n || !d1.a(d1.n, l1)) goto _L16; else goto _L17
_L17:
        i1 = d1.c;
_L19:
        if (i1 == -1)
        {
            d1.b();
        }
_L12:
        d1.a(j1);
        return true;
_L16:
        i1++;
          goto _L18
_L5:
        if (d1.a == 1)
        {
            d1.b();
        }
        d1.a();
        return true;
_L7:
        if (d1.a == 1)
        {
            d1.a(0.0F);
        }
        d1.a();
        return true;
_L14:
        i1 = -1;
          goto _L19
    }

    public void setEnabled(boolean flag)
    {
        if (!flag)
        {
            c();
        }
        super.setEnabled(flag);
    }

    static 
    {
        i = c.b;
    }
}
