// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.am;
import android.support.v4.view.m;
import android.support.v4.view.r;
import android.support.v4.view.x;
import android.support.v4.widget.p;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//            w, u, k, CoordinatorLayout, 
//            a, p

public class AppBarLayout extends LinearLayout
{
    public static class Behavior extends u
    {

        private int a;
        private boolean b;
        private Runnable c;
        private p d;
        private android.support.design.widget.p e;
        private int f;
        private boolean g;
        private float h;
        private boolean i;
        private int j;
        private int k;
        private int l;
        private WeakReference m;

        private int a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i1, int j1, int k1)
        {
            return b(coordinatorlayout, appbarlayout, a() - i1, j1, k1);
        }

        static p a(Behavior behavior)
        {
            return behavior.d;
        }

        private void a(AppBarLayout appbarlayout)
        {
            List list = AppBarLayout.a(appbarlayout);
            int i1 = 0;
            for (int j1 = list.size(); i1 < j1; i1++)
            {
                a a1 = (a)list.get(i1);
                if (a1 != null)
                {
                    a1.a(appbarlayout, super.b());
                }
            }

        }

        private int b(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i1, int j1, int k1)
        {
            int l1;
            boolean flag;
            int j2;
            j2 = a();
            flag = false;
            l1 = ((flag) ? 1 : 0);
            if (j1 == 0) goto _L2; else goto _L1
_L1:
            l1 = ((flag) ? 1 : 0);
            if (j2 < j1) goto _L2; else goto _L3
_L3:
            l1 = ((flag) ? 1 : 0);
            if (j2 > k1) goto _L2; else goto _L4
_L4:
            j1 = android.support.design.widget.k.a(i1, j1, k1);
            l1 = ((flag) ? 1 : 0);
            if (j2 == j1) goto _L2; else goto _L5
_L5:
            if (!appbarlayout.a)
            {
                break MISSING_BLOCK_LABEL_310;
            }
            l1 = Math.abs(j1);
            k1 = appbarlayout.getChildCount();
            i1 = 0;
_L12:
            if (i1 >= k1) goto _L7; else goto _L6
_L6:
            View view;
            LayoutParams layoutparams;
            Interpolator interpolator;
            view = appbarlayout.getChildAt(i1);
            layoutparams = (LayoutParams)view.getLayoutParams();
            interpolator = layoutparams.b;
            if (l1 < view.getTop() || l1 > view.getBottom()) goto _L9; else goto _L8
_L8:
            if (interpolator == null) goto _L7; else goto _L10
_L10:
            int i2 = layoutparams.a;
            float f1;
            boolean flag1;
            if ((i2 & 1) != 0)
            {
                i1 = view.getHeight();
                k1 = layoutparams.topMargin;
                k1 = layoutparams.bottomMargin + (i1 + k1) + 0;
                i1 = k1;
                if ((i2 & 2) != 0)
                {
                    i1 = k1 - x.r(view);
                }
            } else
            {
                i1 = 0;
            }
            if (i1 <= 0) goto _L7; else goto _L11
_L11:
            k1 = view.getTop();
            f1 = i1;
            i1 = Math.round(interpolator.getInterpolation((float)(l1 - k1) / (float)i1) * f1);
            i1 = Integer.signum(j1) * (i1 + view.getTop());
_L13:
            flag1 = super.a(i1);
            l1 = j2 - j1;
            a = j1 - i1;
            if (!flag1 && appbarlayout.a)
            {
                coordinatorlayout.a(appbarlayout);
            }
            a(appbarlayout);
_L2:
            return l1;
_L9:
            i1++;
              goto _L12
_L7:
            i1 = j1;
              goto _L13
            i1 = j1;
              goto _L13
        }

        private void b(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i1)
        {
            if (e == null)
            {
                e = w.a();
                e.a(android.support.design.widget.a.c);
                e.a(new p.c(this, coordinatorlayout, appbarlayout) {

                    final CoordinatorLayout a;
                    final AppBarLayout b;
                    final Behavior c;

                    public final void a(android.support.design.widget.p p1)
                    {
                        c.a(a, b, p1.c());
                    }

            
            {
                c = behavior;
                a = coordinatorlayout;
                b = appbarlayout;
                super();
            }
                });
            } else
            {
                e.e();
            }
            e.a(a(), i1);
            e.a();
        }

        private boolean c()
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (m != null)
            {
                View view = (View)m.get();
                flag = flag1;
                if (view != null)
                {
                    flag = flag1;
                    if (view.isShown())
                    {
                        flag = flag1;
                        if (!x.b(view, -1))
                        {
                            flag = true;
                        }
                    }
                }
            }
            return flag;
        }

        final int a()
        {
            return super.b() + a;
        }

        final int a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i1)
        {
            return b(coordinatorlayout, appbarlayout, i1, 0x80000000, 0x7fffffff);
        }

        public final Parcelable a(CoordinatorLayout coordinatorlayout, View view)
        {
            boolean flag = false;
            view = (AppBarLayout)view;
            Parcelable parcelable = super.a(coordinatorlayout, view);
            int j1 = super.b();
            int k1 = view.getChildCount();
            for (int i1 = 0; i1 < k1; i1++)
            {
                coordinatorlayout = view.getChildAt(i1);
                int l1 = coordinatorlayout.getBottom() + j1;
                if (coordinatorlayout.getTop() + j1 <= 0 && l1 >= 0)
                {
                    view = new SavedState(parcelable);
                    view.a = i1;
                    if (l1 == x.r(coordinatorlayout))
                    {
                        flag = true;
                    }
                    view.c = flag;
                    view.b = (float)l1 / (float)coordinatorlayout.getHeight();
                    return view;
                }
            }

            return parcelable;
        }

        public void a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view)
        {
            b = false;
            m = new WeakReference(view);
        }

        public void a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int i1, int j1, int ai[])
        {
            if (j1 != 0 && !b)
            {
                int k1;
                if (j1 < 0)
                {
                    i1 = -appbarlayout.a();
                    k1 = i1 + appbarlayout.d();
                } else
                {
                    i1 = -appbarlayout.c();
                    k1 = 0;
                }
                ai[1] = a(coordinatorlayout, appbarlayout, j1, i1, k1);
            }
        }

        public final void a(CoordinatorLayout coordinatorlayout, View view, Parcelable parcelable)
        {
            view = (AppBarLayout)view;
            if (parcelable instanceof SavedState)
            {
                parcelable = (SavedState)parcelable;
                super.a(coordinatorlayout, view, parcelable.getSuperState());
                f = ((SavedState) (parcelable)).a;
                h = ((SavedState) (parcelable)).b;
                g = ((SavedState) (parcelable)).c;
                return;
            } else
            {
                super.a(coordinatorlayout, view, parcelable);
                f = -1;
                return;
            }
        }

        public volatile void a(CoordinatorLayout coordinatorlayout, View view, View view1)
        {
            a(coordinatorlayout, (AppBarLayout)view, view1);
        }

        public volatile void a(CoordinatorLayout coordinatorlayout, View view, View view1, int i1, int j1, int ai[])
        {
            a(coordinatorlayout, (AppBarLayout)view, view1, i1, j1, ai);
        }

        public final volatile boolean a(int i1)
        {
            return super.a(i1);
        }

        public final boolean a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, float f1, boolean flag)
        {
            boolean flag1 = false;
            if (flag) goto _L2; else goto _L1
_L1:
            int i1 = -appbarlayout.a();
            f1 = -f1;
            if (c != null)
            {
                appbarlayout.removeCallbacks(c);
            }
            if (d == null)
            {
                d = p.a(appbarlayout.getContext());
            }
            d.a(a(), 0, Math.round(f1), 0, 0, i1, 0);
            if (!d.g()) goto _L4; else goto _L3
_L3:
            c = new a(this, coordinatorlayout, appbarlayout);
            x.a(appbarlayout, c);
            flag = true;
_L6:
            return flag;
_L4:
            c = null;
            return false;
_L2:
            int j1;
            if (f1 >= 0.0F)
            {
                break; /* Loop/switch isn't completed */
            }
            j1 = -appbarlayout.a() + appbarlayout.d();
            flag = flag1;
            if (a() > j1)
            {
                continue; /* Loop/switch isn't completed */
            }
_L7:
            flag = flag1;
            if (a() != j1)
            {
                b(coordinatorlayout, appbarlayout, j1);
                return true;
            }
            if (true) goto _L6; else goto _L5
_L5:
            int k1 = -appbarlayout.c();
            j1 = k1;
            if (a() < k1)
            {
                return false;
            }
              goto _L7
            if (true) goto _L6; else goto _L8
_L8:
        }

        public final volatile boolean a(CoordinatorLayout coordinatorlayout, View view, float f1, boolean flag)
        {
            return a(coordinatorlayout, (AppBarLayout)view, f1, flag);
        }

        public final boolean a(CoordinatorLayout coordinatorlayout, View view, int i1)
        {
            view = (AppBarLayout)view;
            boolean flag = super.a(coordinatorlayout, view, i1);
            int j1 = view.h();
            if (j1 != 0)
            {
                if ((j1 & 4) != 0)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if ((j1 & 2) != 0)
                {
                    j1 = -view.c();
                    if (i1 != 0)
                    {
                        b(coordinatorlayout, view, j1);
                    } else
                    {
                        a(coordinatorlayout, ((AppBarLayout) (view)), j1);
                    }
                } else
                if ((j1 & 1) != 0)
                {
                    if (i1 != 0)
                    {
                        b(coordinatorlayout, view, 0);
                    } else
                    {
                        a(coordinatorlayout, ((AppBarLayout) (view)), 0);
                    }
                }
                view.i();
            } else
            if (f >= 0)
            {
                coordinatorlayout = view.getChildAt(f);
                i1 = -coordinatorlayout.getBottom();
                if (g)
                {
                    i1 = x.r(coordinatorlayout) + i1;
                } else
                {
                    i1 = Math.round((float)coordinatorlayout.getHeight() * h) + i1;
                }
                super.a(i1);
                f = -1;
            }
            a(((AppBarLayout) (view)));
            return flag;
        }

        public final boolean a(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
        {
            int i1;
            int j1;
            boolean flag1;
            flag1 = false;
            view = (AppBarLayout)view;
            if (l < 0)
            {
                l = ViewConfiguration.get(coordinatorlayout.getContext()).getScaledTouchSlop();
            }
            i1 = (int)motionevent.getX();
            j1 = (int)motionevent.getY();
            android.support.v4.view.m.a(motionevent);
            JVM INSTR tableswitch 0 3: default 76
        //                       0 82
        //                       1 254
        //                       2 127
        //                       3 254;
               goto _L1 _L2 _L3 _L4 _L3
_L1:
            boolean flag = true;
_L6:
            return flag;
_L2:
            flag = flag1;
            if (!coordinatorlayout.a(view, i1, j1)) goto _L6; else goto _L5
_L5:
            flag = flag1;
            if (!c()) goto _L6; else goto _L7
_L7:
            k = j1;
            j = android.support.v4.view.m.b(motionevent, 0);
            continue; /* Loop/switch isn't completed */
_L4:
            i1 = android.support.v4.view.m.a(motionevent, j);
            flag = flag1;
            if (i1 == -1) goto _L6; else goto _L8
_L8:
            int l1 = (int)android.support.v4.view.m.d(motionevent, i1);
            int k1 = k - l1;
            i1 = k1;
            if (!i)
            {
                i1 = k1;
                if (Math.abs(k1) > l)
                {
                    i = true;
                    if (k1 > 0)
                    {
                        i1 = k1 - l;
                    } else
                    {
                        i1 = k1 + l;
                    }
                }
            }
            if (i)
            {
                k = l1;
                a(coordinatorlayout, ((AppBarLayout) (view)), i1, -view.e(), 0);
            }
            continue; /* Loop/switch isn't completed */
_L3:
            i = false;
            j = -1;
            if (true) goto _L1; else goto _L9
_L9:
        }

        public final boolean a(CoordinatorLayout coordinatorlayout, View view, View view1, int i1)
        {
            view = (AppBarLayout)view;
            boolean flag;
            if ((i1 & 2) != 0 && view.b() && coordinatorlayout.getHeight() - view1.getHeight() <= view.getHeight())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && e != null)
            {
                e.e();
            }
            m = null;
            return flag;
        }

        public final volatile int b()
        {
            return super.b();
        }

        public final void b(CoordinatorLayout coordinatorlayout, View view, int i1)
        {
            view = (AppBarLayout)view;
            if (i1 < 0)
            {
                a(coordinatorlayout, view, i1, -view.e(), 0);
                b = true;
                return;
            } else
            {
                b = false;
                return;
            }
        }

        public final boolean b(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
        {
            view = (AppBarLayout)view;
            if (l < 0)
            {
                l = ViewConfiguration.get(coordinatorlayout.getContext()).getScaledTouchSlop();
            }
            if (motionevent.getAction() == 2 && i)
            {
                return true;
            }
            android.support.v4.view.m.a(motionevent);
            JVM INSTR tableswitch 0 3: default 76
        //                       0 147
        //                       1 203
        //                       2 81
        //                       3 203;
               goto _L1 _L2 _L3 _L4 _L3
_L1:
            return i;
_L4:
            int i1 = j;
            if (i1 != -1)
            {
                i1 = android.support.v4.view.m.a(motionevent, i1);
                if (i1 != -1)
                {
                    i1 = (int)android.support.v4.view.m.d(motionevent, i1);
                    if (Math.abs(i1 - k) > l)
                    {
                        i = true;
                        k = i1;
                    }
                }
            }
            continue; /* Loop/switch isn't completed */
_L2:
            i = false;
            int j1 = (int)motionevent.getX();
            int k1 = (int)motionevent.getY();
            if (coordinatorlayout.a(view, j1, k1) && c())
            {
                k = k1;
                j = android.support.v4.view.m.b(motionevent, 0);
            }
            continue; /* Loop/switch isn't completed */
_L3:
            i = false;
            j = -1;
            if (true) goto _L1; else goto _L5
_L5:
        }

        public Behavior()
        {
            f = -1;
            j = -1;
            l = -1;
        }

        public Behavior(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            f = -1;
            j = -1;
            l = -1;
        }
    }

    protected static class Behavior.SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new Behavior.SavedState(parcel);
            }

            public final volatile Object[] newArray(int j)
            {
                return new Behavior.SavedState[j];
            }

        };
        int a;
        float b;
        boolean c;

        public void writeToParcel(Parcel parcel, int j)
        {
            super.writeToParcel(parcel, j);
            parcel.writeInt(a);
            parcel.writeFloat(b);
            if (c)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            parcel.writeByte((byte)j);
        }


        public Behavior.SavedState(Parcel parcel)
        {
            super(parcel);
            a = parcel.readInt();
            b = parcel.readFloat();
            boolean flag;
            if (parcel.readByte() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            c = flag;
        }

        public Behavior.SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

    private final class Behavior.a
        implements Runnable
    {

        final Behavior a;
        private final CoordinatorLayout b;
        private final AppBarLayout c;

        public final void run()
        {
            if (c != null && Behavior.a(a) != null && Behavior.a(a).g())
            {
                a.a(b, c, Behavior.a(a).c());
                x.a(c, this);
            }
        }

        Behavior.a(Behavior behavior, CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
        {
            a = behavior;
            super();
            b = coordinatorlayout;
            c = appbarlayout;
        }
    }

    public static final class LayoutParams extends android.widget.LinearLayout.LayoutParams
    {

        int a;
        Interpolator b;

        public final void a(int j)
        {
            a = j;
        }

        public LayoutParams()
        {
            super(-1, -2);
            a = 1;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            a = 1;
            attributeset = context.obtainStyledAttributes(attributeset, android.support.design.a.i.AppBarLayout_LayoutParams);
            a = attributeset.getInt(android.support.design.a.i.AppBarLayout_LayoutParams_layout_scrollFlags, 0);
            if (attributeset.hasValue(android.support.design.a.i.AppBarLayout_LayoutParams_layout_scrollInterpolator))
            {
                b = AnimationUtils.loadInterpolator(context, attributeset.getResourceId(android.support.design.a.i.AppBarLayout_LayoutParams_layout_scrollInterpolator, 0));
            }
            attributeset.recycle();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            a = 1;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            a = 1;
        }

        public LayoutParams(android.widget.LinearLayout.LayoutParams layoutparams)
        {
            super(layoutparams);
            a = 1;
        }
    }

    public static interface LayoutParams.ScrollFlags
        extends Annotation
    {
    }

    public static class ScrollingViewBehavior extends u
    {

        private int a;

        public final volatile boolean a(int j)
        {
            return super.a(j);
        }

        public final volatile boolean a(CoordinatorLayout coordinatorlayout, View view, int j)
        {
            return super.a(coordinatorlayout, view, j);
        }

        public final boolean a(CoordinatorLayout coordinatorlayout, View view, int j, int k, int l)
        {
            int j1 = view.getLayoutParams().height;
            if (j1 != -1 && j1 != -2) goto _L2; else goto _L1
_L1:
            Object obj;
            int i1;
            int k1;
            obj = coordinatorlayout.b(view);
            if (((List) (obj)).isEmpty())
            {
                return false;
            }
            k1 = ((List) (obj)).size();
            i1 = 0;
_L9:
            if (i1 >= k1) goto _L4; else goto _L3
_L3:
            View view1 = (View)((List) (obj)).get(i1);
            if (!(view1 instanceof AppBarLayout)) goto _L6; else goto _L5
_L5:
            obj = (AppBarLayout)view1;
_L7:
            if (obj != null && x.E(((View) (obj))))
            {
                if (x.x(((View) (obj))))
                {
                    x.a(view, true);
                }
                i1 = android.view.View.MeasureSpec.getSize(l);
                l = i1;
                if (i1 == 0)
                {
                    l = coordinatorlayout.getHeight();
                }
                int l1 = ((AppBarLayout) (obj)).getMeasuredHeight();
                int i2 = ((AppBarLayout) (obj)).a();
                if (j1 == -1)
                {
                    i1 = 0x40000000;
                } else
                {
                    i1 = 0x80000000;
                }
                coordinatorlayout.a(view, j, k, android.view.View.MeasureSpec.makeMeasureSpec(i2 + (l - l1), i1));
                return true;
            }
              goto _L2
_L6:
            i1++;
            continue; /* Loop/switch isn't completed */
_L4:
            obj = null;
              goto _L7
_L2:
            return false;
            if (true) goto _L9; else goto _L8
_L8:
        }

        public final boolean a(View view)
        {
            return view instanceof AppBarLayout;
        }

        public final volatile int b()
        {
            return super.b();
        }

        public final boolean b(CoordinatorLayout coordinatorlayout, View view, View view1)
        {
            CoordinatorLayout.b b1 = ((CoordinatorLayout.d)view1.getLayoutParams()).a;
            if (b1 instanceof Behavior)
            {
                int j = ((Behavior)b1).a();
                int k = view1.getHeight();
                int l = a;
                int i1 = coordinatorlayout.getHeight();
                int j1 = view.getHeight();
                if (a != 0 && (view1 instanceof AppBarLayout))
                {
                    int k1 = ((AppBarLayout)view1).a();
                    super.a(android.support.design.widget.a.a(k - l, i1 - j1, (float)Math.abs(j) / (float)k1));
                } else
                {
                    super.a((view1.getHeight() - a) + j);
                }
            }
            return false;
        }

        public ScrollingViewBehavior()
        {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            context = context.obtainStyledAttributes(attributeset, android.support.design.a.i.ScrollingViewBehavior_Params);
            a = context.getDimensionPixelSize(android.support.design.a.i.ScrollingViewBehavior_Params_behavior_overlapTop, 0);
            context.recycle();
        }
    }

    public static interface a
    {

        public abstract void a(AppBarLayout appbarlayout, int j);
    }


    boolean a;
    private int b;
    private int c;
    private int d;
    private float e;
    private int f;
    private am g;
    private final List h;

    public AppBarLayout(Context context)
    {
        this(context, null);
    }

    public AppBarLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = -1;
        c = -1;
        d = -1;
        f = 0;
        setOrientation(1);
        context = context.obtainStyledAttributes(attributeset, android.support.design.a.i.AppBarLayout, 0, android.support.design.a.h.Widget_Design_AppBarLayout);
        e = context.getDimensionPixelSize(android.support.design.a.i.AppBarLayout_elevation, 0);
        setBackgroundDrawable(context.getDrawable(android.support.design.a.i.AppBarLayout_android_background));
        if (context.hasValue(android.support.design.a.i.AppBarLayout_expanded))
        {
            setExpanded(context.getBoolean(android.support.design.a.i.AppBarLayout_expanded, false));
        }
        context.recycle();
        w.a(this);
        h = new ArrayList();
        x.f(this, e);
        x.a(this, new r() {

            final AppBarLayout a;

            public final am a(View view, am am1)
            {
                AppBarLayout.a(a, am1);
                return am1.f();
            }

            
            {
                a = AppBarLayout.this;
                super();
            }
        });
    }

    private LayoutParams a(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    private static LayoutParams a(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof android.widget.LinearLayout.LayoutParams)
        {
            return new LayoutParams((android.widget.LinearLayout.LayoutParams)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new LayoutParams(layoutparams);
        }
    }

    static List a(AppBarLayout appbarlayout)
    {
        return appbarlayout.h;
    }

    static void a(AppBarLayout appbarlayout, am am1)
    {
        appbarlayout.b = -1;
        appbarlayout.g = am1;
        int j = 0;
        int k = appbarlayout.getChildCount();
        do
        {
            if (j >= k)
            {
                break;
            }
            am1 = x.b(appbarlayout.getChildAt(j), am1);
            if (am1.e())
            {
                break;
            }
            j++;
        } while (true);
    }

    public final int a()
    {
        if (b != -1)
        {
            return b;
        }
        int j = 0;
        int k = 0;
        int j1 = getChildCount();
        do
        {
label0:
            {
                int l = j;
                if (k < j1)
                {
                    View view = getChildAt(k);
                    LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                    int i1;
                    int k1;
                    if (x.E(view))
                    {
                        i1 = view.getHeight();
                    } else
                    {
                        i1 = view.getMeasuredHeight();
                    }
                    k1 = layoutparams.a;
                    l = j;
                    if ((k1 & 1) != 0)
                    {
                        j += layoutparams.topMargin + i1 + layoutparams.bottomMargin;
                        if ((k1 & 2) == 0)
                        {
                            break label0;
                        }
                        l = j - x.r(view);
                    }
                }
                if (g != null)
                {
                    j = g.b();
                } else
                {
                    j = 0;
                }
                j = l - j;
                b = j;
                return j;
            }
            k++;
        } while (true);
    }

    public final void a(a a1)
    {
        if (a1 != null && !h.contains(a1))
        {
            h.add(a1);
        }
    }

    public final void b(a a1)
    {
        if (a1 != null)
        {
            h.remove(a1);
        }
    }

    final boolean b()
    {
        return a() != 0;
    }

    final int c()
    {
        return a();
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof LayoutParams;
    }

    final int d()
    {
        int k;
        int l;
        if (c != -1)
        {
            return c;
        }
        l = 0;
        k = getChildCount() - 1;
_L5:
        if (k < 0) goto _L2; else goto _L1
_L1:
        int j;
        View view = getChildAt(k);
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        int i1;
        if (x.E(view))
        {
            j = view.getHeight();
        } else
        {
            j = view.getMeasuredHeight();
        }
        i1 = layoutparams.a;
        if ((i1 & 5) != 5) goto _L4; else goto _L3
_L3:
        l += layoutparams.topMargin + layoutparams.bottomMargin;
        if ((i1 & 8) != 0)
        {
            j = l + x.r(view);
        } else
        {
            j = l + j;
        }
_L6:
        k--;
        l = j;
          goto _L5
_L4:
        j = l;
        if (l <= 0) goto _L6; else goto _L2
_L2:
        c = l;
        return l;
    }

    final int e()
    {
        if (d != -1)
        {
            return d;
        }
        int k = 0;
        int j = 0;
        int i1 = getChildCount();
        do
        {
            if (j >= i1)
            {
                break;
            }
            View view = getChildAt(j);
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            int l;
            int j1;
            int k1;
            int l1;
            if (x.E(view))
            {
                l = view.getHeight();
            } else
            {
                l = view.getMeasuredHeight();
            }
            k1 = layoutparams.topMargin;
            l1 = layoutparams.bottomMargin;
            j1 = layoutparams.a;
            if ((j1 & 1) == 0)
            {
                break;
            }
            k += l + (k1 + l1);
            if ((j1 & 2) != 0)
            {
                return k - x.r(view);
            }
            j++;
        } while (true);
        d = k;
        return k;
    }

    final int f()
    {
        int k = 0;
        int j;
        int l;
        if (g != null)
        {
            j = g.b();
        } else
        {
            j = 0;
        }
        l = x.r(this);
        if (l != 0)
        {
            k = l * 2 + j;
        } else
        {
            int i1 = getChildCount();
            if (i1 > 0)
            {
                return x.r(getChildAt(i1 - 1)) * 2 + j;
            }
        }
        return k;
    }

    public final float g()
    {
        return e;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams();
    }

    protected android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return a(attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return a(layoutparams);
    }

    public android.widget.LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return a(attributeset);
    }

    protected android.widget.LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return a(layoutparams);
    }

    final int h()
    {
        return f;
    }

    final void i()
    {
        f = 0;
    }

    protected void onLayout(boolean flag, int j, int k, int l, int i1)
    {
        super.onLayout(flag, j, k, l, i1);
        b = -1;
        c = -1;
        c = -1;
        a = false;
        j = 0;
        k = getChildCount();
        do
        {
label0:
            {
                if (j < k)
                {
                    if (((LayoutParams)getChildAt(j).getLayoutParams()).b == null)
                    {
                        break label0;
                    }
                    a = true;
                }
                return;
            }
            j++;
        } while (true);
    }

    public void setExpanded(boolean flag)
    {
        setExpanded(flag, x.E(this));
    }

    public void setExpanded(boolean flag, boolean flag1)
    {
        byte byte0;
        byte byte1;
        if (flag)
        {
            byte0 = 1;
        } else
        {
            byte0 = 2;
        }
        if (flag1)
        {
            byte1 = 4;
        } else
        {
            byte1 = 0;
        }
        f = byte1 | byte0;
        requestLayout();
    }

    public void setOrientation(int j)
    {
        if (j != 1)
        {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        } else
        {
            super.setOrientation(j);
            return;
        }
    }

    public void setTargetElevation(float f1)
    {
        e = f1;
    }
}
