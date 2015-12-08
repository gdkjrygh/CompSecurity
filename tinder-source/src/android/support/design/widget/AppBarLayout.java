// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.am;
import android.support.v4.view.s;
import android.support.v4.view.x;
import android.support.v4.widget.r;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//            n, l, d, CoordinatorLayout, 
//            a, g

public class AppBarLayout extends LinearLayout
{
    public static final class Behavior extends l
    {

        r a;
        private int b;
        private boolean c;
        private Runnable d;
        private g e;
        private int f;
        private boolean g;
        private float h;

        private int a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int j, int k)
        {
            return b(coordinatorlayout, appbarlayout, c() - i, j, k);
        }

        private static void a(AppBarLayout appbarlayout)
        {
            appbarlayout = AppBarLayout.a(appbarlayout);
            int j = appbarlayout.size();
            for (int i = 0; i < j; i++)
            {
                WeakReference weakreference = (WeakReference)appbarlayout.get(i);
                if (weakreference != null)
                {
                    weakreference.get();
                }
            }

        }

        private int b(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int j, int k)
        {
            int i1;
            boolean flag;
            boolean flag1;
            int k1;
            flag1 = false;
            flag = false;
            k1 = c();
            i1 = ((flag1) ? 1 : 0);
            if (j == 0) goto _L2; else goto _L1
_L1:
            i1 = ((flag1) ? 1 : 0);
            if (k1 < j) goto _L2; else goto _L3
_L3:
            i1 = ((flag1) ? 1 : 0);
            if (k1 > k) goto _L2; else goto _L4
_L4:
            j = android.support.design.widget.d.a(i, j, k);
            i1 = ((flag1) ? 1 : 0);
            if (k1 == j) goto _L2; else goto _L5
_L5:
            if (!appbarlayout.a)
            {
                break MISSING_BLOCK_LABEL_301;
            }
            i1 = Math.abs(j);
            k = appbarlayout.getChildCount();
            i = 0;
_L12:
            if (i >= k) goto _L7; else goto _L6
_L6:
            View view;
            a a1;
            Interpolator interpolator;
            view = appbarlayout.getChildAt(i);
            a1 = (a)view.getLayoutParams();
            interpolator = a1.b;
            if (i1 < view.getTop() || i1 > view.getBottom()) goto _L9; else goto _L8
_L8:
            if (interpolator == null) goto _L7; else goto _L10
_L10:
            int j1 = a1.a;
            i = ((flag) ? 1 : 0);
            if ((j1 & 1) != 0)
            {
                k = view.getHeight() + 0;
                i = k;
                if ((j1 & 2) != 0)
                {
                    i = k - x.r(view);
                }
            }
            if (i <= 0) goto _L7; else goto _L11
_L11:
            k = view.getTop();
            float f1 = i;
            i = Math.round(interpolator.getInterpolation((float)(i1 - k) / (float)i) * f1);
            k = Integer.signum(j);
            i = (i + view.getTop()) * k;
_L13:
            boolean flag2 = super.a(i);
            i1 = k1 - j;
            b = j - i;
            if (!flag2 && appbarlayout.a)
            {
                coordinatorlayout.dispatchDependentViewsChanged(appbarlayout);
            }
            a(appbarlayout);
_L2:
            return i1;
_L9:
            i++;
              goto _L12
_L7:
            i = j;
              goto _L13
            i = j;
              goto _L13
        }

        private int c()
        {
            return super.a() + b;
        }

        public final volatile int a()
        {
            return super.a();
        }

        final int a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i)
        {
            return b(coordinatorlayout, appbarlayout, i, 0x80000000, 0x7fffffff);
        }

        public final Parcelable a(CoordinatorLayout coordinatorlayout, View view)
        {
            boolean flag = false;
            view = (AppBarLayout)view;
            Parcelable parcelable = super.a(coordinatorlayout, view);
            int j = super.a();
            int k = view.getChildCount();
            for (int i = 0; i < k; i++)
            {
                coordinatorlayout = view.getChildAt(i);
                int i1 = coordinatorlayout.getBottom() + j;
                if (coordinatorlayout.getTop() + j <= 0 && i1 >= 0)
                {
                    view = new SavedState(parcelable);
                    view.a = i;
                    if (i1 == x.r(coordinatorlayout))
                    {
                        flag = true;
                    }
                    view.c = flag;
                    view.b = (float)i1 / (float)coordinatorlayout.getHeight();
                    return view;
                }
            }

            return parcelable;
        }

        public final void a(CoordinatorLayout coordinatorlayout, View view, int i, int ai[])
        {
            view = (AppBarLayout)view;
            if (i != 0 && !c)
            {
                int j;
                int k;
                if (i < 0)
                {
                    j = -view.getTotalScrollRange();
                    k = j + view.getDownNestedPreScrollRange();
                } else
                {
                    j = -view.getUpNestedPreScrollRange();
                    k = 0;
                }
                ai[1] = a(coordinatorlayout, ((AppBarLayout) (view)), i, j, k);
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

        public final volatile boolean a(int i)
        {
            return super.a(i);
        }

        public final boolean a(CoordinatorLayout coordinatorlayout, View view, float f1, boolean flag)
        {
            boolean flag1;
            flag1 = false;
            view = (AppBarLayout)view;
            if (flag) goto _L2; else goto _L1
_L1:
            int i = -view.getTotalScrollRange();
            f1 = -f1;
            if (d != null)
            {
                view.removeCallbacks(d);
            }
            if (a == null)
            {
                a = r.a(view.getContext(), null);
            }
            a.a(c(), 0, Math.round(f1), 0, 0, i, 0);
            if (!a.g()) goto _L4; else goto _L3
_L3:
            d = new a(this, coordinatorlayout, view);
            x.a(view, d);
            flag = true;
_L8:
            return flag;
_L4:
            d = null;
            return false;
_L2:
            if (f1 >= 0.0F) goto _L6; else goto _L5
_L5:
            int j;
            j = -view.getTotalScrollRange() + view.getDownNestedPreScrollRange();
            flag = flag1;
            if (c() > j) goto _L8; else goto _L7
_L7:
            flag = flag1;
            if (c() != j)
            {
                if (e == null)
                {
                    e = n.a();
                    e.a(android.support.design.widget.a.c);
                    e.a(new g.c(this, coordinatorlayout, view) {

                        final CoordinatorLayout a;
                        final AppBarLayout b;
                        final Behavior c;

                        public final void a(g g1)
                        {
                            c.a(a, b, g1.a.c());
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
                    e.a.f();
                }
                e.a(c(), j);
                e.a.a();
                return true;
            } else
            {
                break; /* Loop/switch isn't completed */
            }
_L6:
            j = -view.getUpNestedPreScrollRange();
            flag = flag1;
            if (c() < j) goto _L8; else goto _L7
        }

        public final boolean a(CoordinatorLayout coordinatorlayout, View view, int i)
        {
            view = (AppBarLayout)view;
            boolean flag = super.a(coordinatorlayout, view, i);
            if (f >= 0)
            {
                coordinatorlayout = view.getChildAt(f);
                i = -coordinatorlayout.getBottom();
                if (g)
                {
                    i = x.r(coordinatorlayout) + i;
                } else
                {
                    i = Math.round((float)coordinatorlayout.getHeight() * h) + i;
                }
                super.a(i);
                f = -1;
            }
            a(((AppBarLayout) (view)));
            return flag;
        }

        public final boolean a(CoordinatorLayout coordinatorlayout, View view, View view1, int i)
        {
            boolean flag;
            flag = true;
            view = (AppBarLayout)view;
            if ((i & 2) == 0) goto _L2; else goto _L1
_L1:
            if (view.getTotalScrollRange() != 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i == 0 || coordinatorlayout.getHeight() - view1.getHeight() > view.getHeight()) goto _L2; else goto _L3
_L3:
            if (flag && e != null)
            {
                e.a.f();
            }
            return flag;
_L2:
            flag = false;
            if (true) goto _L3; else goto _L4
_L4:
        }

        public final volatile void b()
        {
            c = false;
        }

        public final void b(CoordinatorLayout coordinatorlayout, View view, int i)
        {
            view = (AppBarLayout)view;
            if (i < 0)
            {
                a(coordinatorlayout, view, i, -view.getDownNestedScrollRange(), 0);
                c = true;
                return;
            } else
            {
                c = false;
                return;
            }
        }
    }

    protected static class Behavior.SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new Behavior.SavedState(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return new Behavior.SavedState[i];
            }

        };
        int a;
        float b;
        boolean c;

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeInt(a);
            parcel.writeFloat(b);
            if (c)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeByte((byte)i);
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
            if (c != null && a.a != null && a.a.g())
            {
                a.a(b, c, a.a.c());
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

    public static final class a extends android.widget.LinearLayout.LayoutParams
    {

        int a;
        Interpolator b;

        public a()
        {
            super(-1, -2);
            a = 1;
        }

        public a(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            a = 1;
            attributeset = context.obtainStyledAttributes(attributeset, android.support.design.a.g.AppBarLayout_LayoutParams);
            a = attributeset.getInt(android.support.design.a.g.AppBarLayout_LayoutParams_layout_scrollFlags, 0);
            if (attributeset.hasValue(android.support.design.a.g.AppBarLayout_LayoutParams_layout_scrollInterpolator))
            {
                b = AnimationUtils.loadInterpolator(context, attributeset.getResourceId(android.support.design.a.g.AppBarLayout_LayoutParams_layout_scrollInterpolator, 0));
            }
            attributeset.recycle();
        }

        public a(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            a = 1;
        }

        public a(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            a = 1;
        }

        public a(android.widget.LinearLayout.LayoutParams layoutparams)
        {
            super(layoutparams);
            a = 1;
        }
    }


    boolean a;
    private int b;
    private int c;
    private int d;
    private float e;
    private am f;
    private final List g;

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
        setOrientation(1);
        context = context.obtainStyledAttributes(attributeset, android.support.design.a.g.AppBarLayout, 0, android.support.design.a.f.Widget_Design_AppBarLayout);
        e = context.getDimensionPixelSize(android.support.design.a.g.AppBarLayout_elevation, 0);
        setBackgroundDrawable(context.getDrawable(android.support.design.a.g.AppBarLayout_android_background));
        context.recycle();
        n.a(this);
        g = new ArrayList();
        x.f(this, e);
        x.a(this, new s() {

            final AppBarLayout a;

            public final am onApplyWindowInsets(View view, am am1)
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

    private a a(AttributeSet attributeset)
    {
        return new a(getContext(), attributeset);
    }

    private static a a(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof android.widget.LinearLayout.LayoutParams)
        {
            return new a((android.widget.LinearLayout.LayoutParams)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new a((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new a(layoutparams);
        }
    }

    static List a(AppBarLayout appbarlayout)
    {
        return appbarlayout.g;
    }

    static void a(AppBarLayout appbarlayout, am am1)
    {
        appbarlayout.setWindowInsets(am1);
    }

    private void setWindowInsets(am am1)
    {
        b = -1;
        f = am1;
        int i = 0;
        int j = getChildCount();
        do
        {
            if (i >= j)
            {
                break;
            }
            am1 = x.b(getChildAt(i), am1);
            if (am1.e())
            {
                break;
            }
            i++;
        } while (true);
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof a;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new a();
    }

    protected android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams()
    {
        return new a();
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

    final int getDownNestedPreScrollRange()
    {
        int i;
        int j;
        if (c != -1)
        {
            return c;
        }
        i = 0;
        j = getChildCount() - 1;
_L5:
        if (j < 0) goto _L2; else goto _L1
_L1:
        int k;
        View view = getChildAt(j);
        a a1 = (a)view.getLayoutParams();
        int l;
        if (x.E(view))
        {
            k = view.getHeight();
        } else
        {
            k = view.getMeasuredHeight();
        }
        l = a1.a;
        if ((l & 5) != 5) goto _L4; else goto _L3
_L3:
        if ((l & 8) != 0)
        {
            i = x.r(view) + i;
        } else
        {
            i += k;
        }
_L6:
        j--;
          goto _L5
_L4:
        if (i > 0) goto _L2; else goto _L6
_L2:
        c = i;
        return i;
    }

    final int getDownNestedScrollRange()
    {
        if (d != -1)
        {
            return d;
        }
        int l = getChildCount();
        int i = 0;
        int j = 0;
        do
        {
            if (i >= l)
            {
                break;
            }
            View view = getChildAt(i);
            a a1 = (a)view.getLayoutParams();
            int k;
            int i1;
            if (x.E(view))
            {
                k = view.getHeight();
            } else
            {
                k = view.getMeasuredHeight();
            }
            i1 = a1.a;
            if ((i1 & 1) == 0)
            {
                break;
            }
            j += k;
            if ((i1 & 2) != 0)
            {
                return j - x.r(view);
            }
            i++;
        } while (true);
        d = j;
        return j;
    }

    final int getMinimumHeightForVisibleOverlappingContent()
    {
        int j = 0;
        int i;
        int k;
        if (f != null)
        {
            i = f.b();
        } else
        {
            i = 0;
        }
        k = x.r(this);
        if (k != 0)
        {
            j = k * 2 + i;
        } else
        {
            int l = getChildCount();
            if (l > 0)
            {
                return x.r(getChildAt(l - 1)) * 2 + i;
            }
        }
        return j;
    }

    public float getTargetElevation()
    {
        return e;
    }

    public final int getTotalScrollRange()
    {
        if (b != -1)
        {
            return b;
        }
        int l = getChildCount();
        int j = 0;
        int i = 0;
        do
        {
label0:
            {
                if (j < l)
                {
                    View view = getChildAt(j);
                    a a1 = (a)view.getLayoutParams();
                    int k;
                    int i1;
                    if (x.E(view))
                    {
                        k = view.getHeight();
                    } else
                    {
                        k = view.getMeasuredHeight();
                    }
                    i1 = a1.a;
                    if ((i1 & 1) != 0)
                    {
                        i += k;
                        if ((i1 & 2) == 0)
                        {
                            break label0;
                        }
                        i -= x.r(view);
                    }
                }
                if (f != null)
                {
                    j = f.b();
                } else
                {
                    j = 0;
                }
                i -= j;
                b = i;
                return i;
            }
            j++;
        } while (true);
    }

    final int getUpNestedPreScrollRange()
    {
        return getTotalScrollRange();
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        b = -1;
        c = -1;
        c = -1;
        a = false;
        j = getChildCount();
        i = 0;
        do
        {
label0:
            {
                if (i < j)
                {
                    if (((a)getChildAt(i).getLayoutParams()).b == null)
                    {
                        break label0;
                    }
                    a = true;
                }
                return;
            }
            i++;
        } while (true);
    }

    public void setOrientation(int i)
    {
        if (i != 1)
        {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        } else
        {
            super.setOrientation(i);
            return;
        }
    }

    public void setTargetElevation(float f1)
    {
        e = f1;
    }
}
