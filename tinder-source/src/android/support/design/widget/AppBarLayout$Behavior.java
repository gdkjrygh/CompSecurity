// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.x;
import android.support.v4.widget.r;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//            l, AppBarLayout, d, CoordinatorLayout, 
//            n, a, g

public static final class _cls1.b extends l
{
    protected static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return new SavedState[i];
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


        public SavedState(Parcel parcel)
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

        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

    private final class a
        implements Runnable
    {

        final AppBarLayout.Behavior a;
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

        a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
        {
            a = AppBarLayout.Behavior.this;
            super();
            b = coordinatorlayout;
            c = appbarlayout;
        }
    }


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
        c c1;
        Interpolator interpolator;
        view = appbarlayout.getChildAt(i);
        c1 = (t)view.getLayoutParams();
        interpolator = c1.t;
        if (i1 < view.getTop() || i1 > view.getBottom()) goto _L9; else goto _L8
_L8:
        if (interpolator == null) goto _L7; else goto _L10
_L10:
        int j1 = c1.t;
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
        d = new a(coordinatorlayout, view);
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
                e.a(new g.c(coordinatorlayout, view) {

                    final CoordinatorLayout a;
                    final AppBarLayout b;
                    final AppBarLayout.Behavior c;

                    public final void a(g g1)
                    {
                        c.a(a, b, g1.a.c());
                    }

            
            {
                c = AppBarLayout.Behavior.this;
                a = coordinatorlayout;
                b = appbarlayout;
                super();
            }
                });
            } else
            {
                e.a.e();
            }
            e.a(c(), j);
            e.a.e();
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
            e.a.e();
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
