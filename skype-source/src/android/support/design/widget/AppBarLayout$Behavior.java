// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.m;
import android.support.v4.view.x;
import android.support.v4.widget.p;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//            u, AppBarLayout, k, CoordinatorLayout, 
//            w, a, p

public static class l extends u
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
        float b;
        boolean c;

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            parcel.writeInt(a);
            parcel.writeFloat(b);
            if (c)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeByte((byte)i1);
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
            if (c != null && AppBarLayout.Behavior.a(a) != null && AppBarLayout.Behavior.a(a).g())
            {
                a.a(b, c, AppBarLayout.Behavior.a(a).c());
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

    static p a(a a1)
    {
        return a1.d;
    }

    private void a(AppBarLayout appbarlayout)
    {
        List list = AppBarLayout.a(appbarlayout);
        int i1 = 0;
        for (int j1 = list.size(); i1 < j1; i1++)
        {
            d d1 = (d)list.get(i1);
            if (d1 != null)
            {
                d1.d(appbarlayout, super.b());
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
        ams ams;
        Interpolator interpolator;
        view = appbarlayout.getChildAt(i1);
        ams = (ams)view.getLayoutParams();
        interpolator = ams.b;
        if (l1 < view.getTop() || l1 > view.getBottom()) goto _L9; else goto _L8
_L8:
        if (interpolator == null) goto _L7; else goto _L10
_L10:
        int i2 = ams.a;
        float f1;
        boolean flag1;
        if ((i2 & 1) != 0)
        {
            i1 = view.getHeight();
            k1 = ams.topMargin;
            k1 = ams.bottomMargin + (i1 + k1) + 0;
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
            e.a(new p.c(coordinatorlayout, appbarlayout) {

                final CoordinatorLayout a;
                final AppBarLayout b;
                final AppBarLayout.Behavior c;

                public final void a(android.support.design.widget.p p1)
                {
                    c.a(a, b, p1.c());
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
        c = new a(coordinatorlayout, appbarlayout);
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
    //                   0 82
    //                   1 254
    //                   2 127
    //                   3 254;
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
    //                   0 147
    //                   1 203
    //                   2 81
    //                   3 203;
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

    public _cls1.b()
    {
        f = -1;
        j = -1;
        l = -1;
    }

    public l(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = -1;
        j = -1;
        l = -1;
    }
}
