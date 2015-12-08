// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.widget.i;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Referenced classes of package android.support.v4.view:
//            s, x, m, ab, 
//            f, w, a

public class ViewPager extends ViewGroup
{
    public static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = android.support.v4.os.a.a(new android.support.v4.os.b() {

            public final Object a(Parcel parcel, ClassLoader classloader)
            {
                return new SavedState(parcel, classloader);
            }

            public final volatile Object[] a(int i1)
            {
                return new SavedState[i1];
            }

        });
        int a;
        Parcelable b;
        ClassLoader c;

        public String toString()
        {
            return (new StringBuilder("FragmentPager.SavedState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" position=").append(a).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            parcel.writeInt(a);
            parcel.writeParcelable(b, i1);
        }


        SavedState(Parcel parcel, ClassLoader classloader)
        {
            super(parcel);
            ClassLoader classloader1 = classloader;
            if (classloader == null)
            {
                classloader1 = getClass().getClassLoader();
            }
            a = parcel.readInt();
            b = parcel.readParcelable(classloader1);
            c = classloader1;
        }

        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

    static interface a
    {
    }

    static final class b
    {

        Object a;
        int b;
        boolean c;
        float d;
        float e;

        b()
        {
        }
    }

    public static final class c extends android.view.ViewGroup.LayoutParams
    {

        public boolean a;
        public int b;
        float c;
        boolean d;
        int e;
        int f;

        public c()
        {
            super(-1, -1);
            c = 0.0F;
        }

        public c(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            c = 0.0F;
            context = context.obtainStyledAttributes(attributeset, ViewPager.e());
            b = context.getInteger(0, 48);
            context.recycle();
        }
    }

    final class d extends android.support.v4.view.a
    {

        final ViewPager a;

        private boolean a()
        {
            return ViewPager.b(a) != null && ViewPager.b(a).getCount() > 1;
        }

        public final void a(View view, android.support.v4.view.accessibility.c c1)
        {
            super.a(view, c1);
            c1.b(android/support/v4/view/ViewPager.getName());
            c1.i(a());
            if (a.canScrollHorizontally(1))
            {
                c1.a(4096);
            }
            if (a.canScrollHorizontally(-1))
            {
                c1.a(8192);
            }
        }

        public final void a(View view, AccessibilityEvent accessibilityevent)
        {
            super.a(view, accessibilityevent);
            accessibilityevent.setClassName(android/support/v4/view/ViewPager.getName());
            view = android.support.v4.view.accessibility.g.a();
            view.a(a());
            if (accessibilityevent.getEventType() == 4096 && ViewPager.b(a) != null)
            {
                view.a(ViewPager.b(a).getCount());
                view.b(ViewPager.c(a));
                view.c(ViewPager.c(a));
            }
        }

        public final boolean a(View view, int i1, Bundle bundle)
        {
            if (super.a(view, i1, bundle))
            {
                return true;
            }
            switch (i1)
            {
            default:
                return false;

            case 4096: 
                if (a.canScrollHorizontally(1))
                {
                    a.setCurrentItem(ViewPager.c(a) + 1);
                    return true;
                } else
                {
                    return false;
                }

            case 8192: 
                break;
            }
            if (a.canScrollHorizontally(-1))
            {
                a.setCurrentItem(ViewPager.c(a) - 1);
                return true;
            } else
            {
                return false;
            }
        }

        d()
        {
            a = ViewPager.this;
            super();
        }
    }

    static interface e
    {

        public abstract void a(s s1, s s2);
    }

    public static interface f
    {

        public abstract void onPageScrollStateChanged(int i1);

        public abstract void onPageScrolled(int i1, float f1, int j1);

        public abstract void onPageSelected(int i1);
    }

    public static interface g
    {
    }

    private final class h extends DataSetObserver
    {

        final ViewPager a;

        public final void onChanged()
        {
            a.c();
        }

        public final void onInvalidated()
        {
            a.c();
        }

        private h()
        {
            a = ViewPager.this;
            super();
        }

        h(byte byte0)
        {
            this();
        }
    }

    static final class i
        implements Comparator
    {

        public final int compare(Object obj, Object obj1)
        {
            obj = (View)obj;
            obj1 = (View)obj1;
            obj = (c)((View) (obj)).getLayoutParams();
            obj1 = (c)((View) (obj1)).getLayoutParams();
            if (((c) (obj)).a != ((c) (obj1)).a)
            {
                return !((c) (obj)).a ? -1 : 1;
            } else
            {
                return ((c) (obj)).e - ((c) (obj1)).e;
            }
        }

        i()
        {
        }
    }


    private static final int a[] = {
        0x10100b3
    };
    private static final i ah = new i();
    private static final Comparator c = new Comparator() {

        public final volatile int compare(Object obj, Object obj1)
        {
            obj = (b)obj;
            obj1 = (b)obj1;
            return ((b) (obj)).b - ((b) (obj1)).b;
        }

    };
    private static final Interpolator d = new Interpolator() {

        public final float getInterpolation(float f1)
        {
            f1--;
            return f1 * f1 * f1 * f1 * f1 + 1.0F;
        }

    };
    private boolean A;
    private boolean B;
    private int C;
    private int D;
    private int E;
    private float F;
    private float G;
    private float H;
    private float I;
    private int J;
    private VelocityTracker K;
    private int L;
    private int M;
    private int N;
    private int O;
    private boolean P;
    private android.support.v4.widget.i Q;
    private android.support.v4.widget.i R;
    private boolean S;
    private boolean T;
    private boolean U;
    private int V;
    private List W;
    private f aa;
    private f ab;
    private e ac;
    private g ad;
    private Method ae;
    private int af;
    private ArrayList ag;
    private final Runnable ai;
    private int aj;
    private int b;
    private final ArrayList e;
    private final b f;
    private final Rect g;
    private s h;
    private int i;
    private int j;
    private Parcelable k;
    private ClassLoader l;
    private Scroller m;
    private h n;
    private int o;
    private Drawable p;
    private int q;
    private int r;
    private float s;
    private float t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z;

    public ViewPager(Context context)
    {
        super(context);
        e = new ArrayList();
        f = new b();
        g = new Rect();
        j = -1;
        k = null;
        l = null;
        s = -3.402823E+38F;
        t = 3.402823E+38F;
        z = 1;
        J = -1;
        S = true;
        T = false;
        ai = new Runnable() {

            final ViewPager a;

            public final void run()
            {
                ViewPager.a(a);
                a.d();
            }

            
            {
                a = ViewPager.this;
                super();
            }
        };
        aj = 0;
        f();
    }

    public ViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = new ArrayList();
        f = new b();
        g = new Rect();
        j = -1;
        k = null;
        l = null;
        s = -3.402823E+38F;
        t = 3.402823E+38F;
        z = 1;
        J = -1;
        S = true;
        T = false;
        ai = new _cls3();
        aj = 0;
        f();
    }

    private Rect a(Rect rect, View view)
    {
        Rect rect1 = rect;
        if (rect == null)
        {
            rect1 = new Rect();
        }
        if (view == null)
        {
            rect1.set(0, 0, 0, 0);
        } else
        {
            rect1.left = view.getLeft();
            rect1.right = view.getRight();
            rect1.top = view.getTop();
            rect1.bottom = view.getBottom();
            rect = view.getParent();
            while ((rect instanceof ViewGroup) && rect != this) 
            {
                rect = (ViewGroup)rect;
                rect1.left = rect1.left + rect.getLeft();
                rect1.right = rect1.right + rect.getRight();
                rect1.top = rect1.top + rect.getTop();
                rect1.bottom = rect1.bottom + rect.getBottom();
                rect = rect.getParent();
            }
        }
        return rect1;
    }

    private b a(int i1, int j1)
    {
        b b1 = new b();
        b1.b = i1;
        b1.a = h.instantiateItem(this, i1);
        b1.d = h.getPageWidth(i1);
        if (j1 < 0 || j1 >= e.size())
        {
            e.add(b1);
            return b1;
        } else
        {
            e.add(j1, b1);
            return b1;
        }
    }

    private b a(View view)
    {
        for (int i1 = 0; i1 < e.size(); i1++)
        {
            b b1 = (b)e.get(i1);
            if (h.isViewFromObject(view, b1.a))
            {
                return b1;
            }
        }

        return null;
    }

    private void a(int i1)
    {
        boolean flag1 = false;
        if (aj != i1)
        {
            aj = i1;
            if (ad != null)
            {
                boolean flag;
                int k1;
                int i2;
                if (i1 != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                i2 = getChildCount();
                k1 = 0;
                while (k1 < i2) 
                {
                    byte byte0;
                    if (flag)
                    {
                        byte0 = 2;
                    } else
                    {
                        byte0 = 0;
                    }
                    android.support.v4.view.x.a(getChildAt(k1), byte0, null);
                    k1++;
                }
            }
            if (aa != null)
            {
                aa.onPageScrollStateChanged(i1);
            }
            if (W != null)
            {
                int l1 = W.size();
                for (int j1 = ((flag1) ? 1 : 0); j1 < l1; j1++)
                {
                    f f1 = (f)W.get(j1);
                    if (f1 != null)
                    {
                        f1.onPageScrollStateChanged(i1);
                    }
                }

            }
            if (ab != null)
            {
                ab.onPageScrollStateChanged(i1);
                return;
            }
        }
    }

    private void a(int i1, int j1, int k1, int l1)
    {
        if (j1 > 0 && !e.isEmpty())
        {
            int i2 = getPaddingLeft();
            int j2 = getPaddingRight();
            int k2 = getPaddingLeft();
            int l2 = getPaddingRight();
            j1 = (int)(((float)getScrollX() / (float)((j1 - k2 - l2) + l1)) * (float)((i1 - i2 - j2) + k1));
            scrollTo(j1, getScrollY());
            if (!m.isFinished())
            {
                k1 = m.getDuration();
                l1 = m.timePassed();
                b b1 = c(i);
                m.startScroll(j1, 0, (int)(b1.e * (float)i1), 0, k1 - l1);
            }
        } else
        {
            b b2 = c(i);
            float f1;
            if (b2 != null)
            {
                f1 = Math.min(b2.e, t);
            } else
            {
                f1 = 0.0F;
            }
            i1 = (int)(f1 * (float)(i1 - getPaddingLeft() - getPaddingRight()));
            if (i1 != getScrollX())
            {
                a(false);
                scrollTo(i1, getScrollY());
                return;
            }
        }
    }

    private void a(int i1, boolean flag, int j1, boolean flag1)
    {
        b b1 = c(i1);
        int k1 = 0;
        if (b1 != null)
        {
            k1 = (int)((float)g() * Math.max(s, Math.min(b1.e, t)));
        }
        if (flag)
        {
            if (getChildCount() == 0)
            {
                b(false);
            } else
            {
                int l1 = getScrollX();
                int i2 = getScrollY();
                k1 -= l1;
                int j2 = 0 - i2;
                if (k1 == 0 && j2 == 0)
                {
                    a(false);
                    d();
                    a(0);
                } else
                {
                    b(true);
                    a(2);
                    int k2 = g();
                    int l2 = k2 / 2;
                    float f5 = Math.min(1.0F, (1.0F * (float)Math.abs(k1)) / (float)k2);
                    float f1 = l2;
                    float f3 = l2;
                    f5 = (float)Math.sin((float)((double)(f5 - 0.5F) * 0.4712389167638204D));
                    j1 = Math.abs(j1);
                    if (j1 > 0)
                    {
                        j1 = Math.round(1000F * Math.abs((f3 * f5 + f1) / (float)j1)) * 4;
                    } else
                    {
                        float f2 = k2;
                        float f4 = h.getPageWidth(i);
                        j1 = (int)(((float)Math.abs(k1) / (f2 * f4 + (float)o) + 1.0F) * 100F);
                    }
                    j1 = Math.min(j1, 600);
                    m.startScroll(l1, i2, k1, j2, j1);
                    android.support.v4.view.x.d(this);
                }
            }
        } else
        {
            if (flag1)
            {
                e(i1);
            }
            a(false);
            scrollTo(k1, 0);
            d(k1);
            return;
        }
        if (flag1)
        {
            e(i1);
        }
    }

    private void a(int i1, boolean flag, boolean flag1)
    {
        a(i1, flag, flag1, 0);
    }

    private void a(int i1, boolean flag, boolean flag1, int j1)
    {
        boolean flag2;
        flag2 = true;
        if (h == null || h.getCount() <= 0)
        {
            b(false);
            return;
        }
        if (!flag1 && i == i1 && e.size() != 0)
        {
            b(false);
            return;
        }
        if (i1 >= 0) goto _L2; else goto _L1
_L1:
        int k1 = 0;
_L4:
        i1 = z;
        if (k1 > i + i1 || k1 < i - i1)
        {
            for (i1 = 0; i1 < e.size(); i1++)
            {
                ((b)e.get(i1)).c = true;
            }

        }
        break; /* Loop/switch isn't completed */
_L2:
        k1 = i1;
        if (i1 >= h.getCount())
        {
            k1 = h.getCount() - 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (i != k1)
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        if (S)
        {
            i = k1;
            if (flag1)
            {
                e(k1);
            }
            requestLayout();
            return;
        } else
        {
            b(k1);
            a(k1, flag, j1, flag1);
            return;
        }
    }

    private void a(b b1, int i1, b b2)
    {
        int j3 = h.getCount();
        int j1 = g();
        float f4;
        if (j1 > 0)
        {
            f4 = (float)o / (float)j1;
        } else
        {
            f4 = 0.0F;
        }
        if (b2 != null)
        {
            j1 = b2.b;
            if (j1 < b1.b)
            {
                int l1 = 0;
                float f1 = b2.e + b2.d + f4;
                int k2;
                for (j1++; j1 <= b1.b && l1 < e.size(); j1 = k2 + 1)
                {
                    b2 = (b)e.get(l1);
                    float f5;
                    do
                    {
                        f5 = f1;
                        k2 = j1;
                        if (j1 <= b2.b)
                        {
                            break;
                        }
                        f5 = f1;
                        k2 = j1;
                        if (l1 >= e.size() - 1)
                        {
                            break;
                        }
                        l1++;
                        b2 = (b)e.get(l1);
                    } while (true);
                    for (; k2 < b2.b; k2++)
                    {
                        f5 += h.getPageWidth(k2) + f4;
                    }

                    b2.e = f5;
                    f1 = f5 + (b2.d + f4);
                }

            } else
            if (j1 > b1.b)
            {
                int i2 = e.size() - 1;
                float f2 = b2.e;
                int l2;
                for (j1--; j1 >= b1.b && i2 >= 0; j1 = l2 - 1)
                {
                    b2 = (b)e.get(i2);
                    float f6;
                    do
                    {
                        f6 = f2;
                        l2 = j1;
                        if (j1 >= b2.b)
                        {
                            break;
                        }
                        f6 = f2;
                        l2 = j1;
                        if (i2 <= 0)
                        {
                            break;
                        }
                        i2--;
                        b2 = (b)e.get(i2);
                    } while (true);
                    for (; l2 > b2.b; l2--)
                    {
                        f6 -= h.getPageWidth(l2) + f4;
                    }

                    f2 = f6 - (b2.d + f4);
                    b2.e = f2;
                }

            }
        }
        int i3 = e.size();
        float f7 = b1.e;
        j1 = b1.b - 1;
        float f3;
        int j2;
        if (b1.b == 0)
        {
            f3 = b1.e;
        } else
        {
            f3 = -3.402823E+38F;
        }
        s = f3;
        if (b1.b == j3 - 1)
        {
            f3 = (b1.e + b1.d) - 1.0F;
        } else
        {
            f3 = 3.402823E+38F;
        }
        t = f3;
        j2 = i1 - 1;
        f3 = f7;
        while (j2 >= 0) 
        {
            for (b2 = (b)e.get(j2); j1 > b2.b; j1--)
            {
                f3 -= h.getPageWidth(j1) + f4;
            }

            f3 -= b2.d + f4;
            b2.e = f3;
            if (b2.b == 0)
            {
                s = f3;
            }
            j2--;
            j1--;
        }
        f3 = b1.e + b1.d + f4;
        j1 = b1.b + 1;
        j2 = i1 + 1;
        i1 = j1;
        for (int k1 = j2; k1 < i3;)
        {
            for (b1 = (b)e.get(k1); i1 < b1.b; i1++)
            {
                f3 += h.getPageWidth(i1) + f4;
            }

            if (b1.b == j3 - 1)
            {
                t = (b1.d + f3) - 1.0F;
            }
            b1.e = f3;
            f3 += b1.d + f4;
            k1++;
            i1++;
        }

        T = false;
    }

    static void a(ViewPager viewpager)
    {
        viewpager.a(0);
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = android.support.v4.view.m.b(motionevent);
        if (android.support.v4.view.m.b(motionevent, i1) == J)
        {
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            F = android.support.v4.view.m.c(motionevent, i1);
            J = android.support.v4.view.m.b(motionevent, i1);
            if (K != null)
            {
                K.clear();
            }
        }
    }

    private void a(boolean flag)
    {
label0:
        {
            int i1;
            boolean flag1;
            boolean flag2;
            if (aj == 2)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                b(false);
                m.abortAnimation();
                int j1 = getScrollX();
                int k1 = getScrollY();
                int l1 = m.getCurrX();
                int i2 = m.getCurrY();
                if (j1 != l1 || k1 != i2)
                {
                    scrollTo(l1, i2);
                    if (l1 != j1)
                    {
                        d(l1);
                    }
                }
            }
            y = false;
            flag2 = false;
            flag1 = i1;
            for (i1 = ((flag2) ? 1 : 0); i1 < e.size(); i1++)
            {
                b b1 = (b)e.get(i1);
                if (b1.c)
                {
                    flag1 = true;
                    b1.c = false;
                }
            }

            if (flag1)
            {
                if (!flag)
                {
                    break label0;
                }
                android.support.v4.view.x.a(this, ai);
            }
            return;
        }
        ai.run();
    }

    private boolean a(float f1)
    {
        float f2;
        float f3;
        boolean flag;
        boolean flag1;
        int i1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        flag4 = false;
        flag3 = false;
        flag2 = false;
        f2 = F;
        F = f1;
        f3 = (float)getScrollX() + (f2 - f1);
        i1 = g();
        f1 = (float)i1 * s;
        f2 = (float)i1 * t;
        flag = true;
        flag1 = true;
        b b1 = (b)e.get(0);
        b b2 = (b)e.get(e.size() - 1);
        if (b1.b != 0)
        {
            flag = false;
            f1 = b1.e * (float)i1;
        }
        if (b2.b != h.getCount() - 1)
        {
            flag1 = false;
            f2 = b2.e * (float)i1;
        }
        if (f3 >= f1) goto _L2; else goto _L1
_L1:
        if (flag)
        {
            flag2 = Q.a(Math.abs(f1 - f3) / (float)i1);
        }
_L4:
        F = F + (f1 - (float)(int)f1);
        scrollTo((int)f1, getScrollY());
        d((int)f1);
        return flag2;
_L2:
        flag2 = flag4;
        f1 = f3;
        if (f3 > f2)
        {
            flag2 = flag3;
            if (flag1)
            {
                flag2 = R.a(Math.abs(f3 - f2) / (float)i1);
            }
            f1 = f2;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean a(View view, boolean flag, int i1, int j1, int k1)
    {
        if (!(view instanceof ViewGroup)) goto _L2; else goto _L1
_L1:
        ViewGroup viewgroup;
        int l1;
        int i2;
        int j2;
        viewgroup = (ViewGroup)view;
        i2 = view.getScrollX();
        j2 = view.getScrollY();
        l1 = viewgroup.getChildCount() - 1;
_L8:
        if (l1 < 0) goto _L2; else goto _L3
_L3:
        View view1 = viewgroup.getChildAt(l1);
        if (j1 + i2 < view1.getLeft() || j1 + i2 >= view1.getRight() || k1 + j2 < view1.getTop() || k1 + j2 >= view1.getBottom() || !a(view1, true, i1, (j1 + i2) - view1.getLeft(), (k1 + j2) - view1.getTop())) goto _L5; else goto _L4
_L4:
        return true;
_L5:
        l1--;
        continue; /* Loop/switch isn't completed */
_L2:
        if (flag && android.support.v4.view.x.a(view, -i1)) goto _L4; else goto _L6
_L6:
        return false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private b b(View view)
    {
        do
        {
            ViewParent viewparent = view.getParent();
            if (viewparent != this)
            {
                if (viewparent == null || !(viewparent instanceof View))
                {
                    return null;
                }
                view = (View)viewparent;
            } else
            {
                return a(view);
            }
        } while (true);
    }

    static s b(ViewPager viewpager)
    {
        return viewpager.h;
    }

    private void b(int i1)
    {
        b b3;
        byte byte1;
        b3 = null;
        byte1 = 2;
        if (i != i1)
        {
            byte byte0;
            if (i < i1)
            {
                byte0 = 66;
            } else
            {
                byte0 = 17;
            }
            b3 = c(i);
            i = i1;
            byte1 = byte0;
        }
        if (h != null) goto _L2; else goto _L1
_L1:
        h();
_L4:
        return;
_L2:
        if (y)
        {
            h();
            return;
        }
        if (getWindowToken() == null) goto _L4; else goto _L3
_L3:
        b b5;
        int i3;
        int j3;
        int k3;
        h.startUpdate(this);
        i1 = z;
        k3 = Math.max(0, i - i1);
        i3 = h.getCount();
        j3 = Math.min(i3 - 1, i + i1);
        if (i3 != b)
        {
            String s1;
            try
            {
                s1 = getResources().getResourceName(getId());
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception)
            {
                notfoundexception = Integer.toHexString(getId());
            }
            throw new IllegalStateException((new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ")).append(b).append(", found: ").append(i3).append(" Pager id: ").append(s1).append(" Pager class: ").append(getClass()).append(" Problematic adapter: ").append(h.getClass()).toString());
        }
        b5 = null;
        i1 = 0;
_L6:
        int i2;
        int l3;
label0:
        {
            b b1 = b5;
            if (i1 < e.size())
            {
                b b6 = (b)e.get(i1);
                if (b6.b < i)
                {
                    break MISSING_BLOCK_LABEL_552;
                }
                b1 = b5;
                if (b6.b == i)
                {
                    b1 = b6;
                }
            }
            b5 = b1;
            if (b1 == null)
            {
                b5 = b1;
                if (i3 > 0)
                {
                    b5 = a(i, i1);
                }
            }
            if (b5 == null)
            {
                break MISSING_BLOCK_LABEL_1077;
            }
            float f5 = 0.0F;
            int l2 = i1 - 1;
            float f3;
            b b7;
            int j2;
            if (l2 >= 0)
            {
                b1 = (b)e.get(l2);
            } else
            {
                b1 = null;
            }
            l3 = g();
            if (l3 <= 0)
            {
                f3 = 0.0F;
            } else
            {
                f3 = (2.0F - b5.d) + (float)getPaddingLeft() / (float)l3;
            }
            j2 = i - 1;
            b7 = b1;
            i2 = i1;
            do
            {
                if (j2 < 0)
                {
                    break label0;
                }
                float f1;
                int j1;
                if (f5 >= f3 && j2 < k3)
                {
                    if (b7 == null)
                    {
                        break label0;
                    }
                    i1 = i2;
                    f1 = f5;
                    b1 = b7;
                    j1 = l2;
                    if (j2 == b7.b)
                    {
                        i1 = i2;
                        f1 = f5;
                        b1 = b7;
                        j1 = l2;
                        if (!b7.c)
                        {
                            e.remove(l2);
                            h.destroyItem(this, j2, b7.a);
                            j1 = l2 - 1;
                            i1 = i2 - 1;
                            if (j1 >= 0)
                            {
                                b1 = (b)e.get(j1);
                                f1 = f5;
                            } else
                            {
                                b1 = null;
                                f1 = f5;
                            }
                        }
                    }
                } else
                if (b7 != null && j2 == b7.b)
                {
                    f1 = f5 + b7.d;
                    j1 = l2 - 1;
                    if (j1 >= 0)
                    {
                        b1 = (b)e.get(j1);
                    } else
                    {
                        b1 = null;
                    }
                    i1 = i2;
                } else
                {
                    f1 = f5 + a(j2, l2 + 1).d;
                    i1 = i2 + 1;
                    if (l2 >= 0)
                    {
                        b1 = (b)e.get(l2);
                    } else
                    {
                        b1 = null;
                    }
                    j1 = l2;
                }
                j2--;
                i2 = i1;
                f5 = f1;
                b7 = b1;
                l2 = j1;
            } while (true);
        }
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
label1:
        {
            float f6 = b5.d;
            int k2 = i2 + 1;
            if (f6 >= 2.0F)
            {
                break label1;
            }
            float f4;
            b b2;
            b b8;
            int k1;
            if (k2 < e.size())
            {
                b2 = (b)e.get(k2);
            } else
            {
                b2 = null;
            }
            if (l3 <= 0)
            {
                f4 = 0.0F;
            } else
            {
                f4 = (float)getPaddingRight() / (float)l3 + 2.0F;
            }
            k1 = i + 1;
            b8 = b2;
            do
            {
                if (k1 >= i3)
                {
                    break label1;
                }
                float f2;
                if (f6 >= f4 && k1 > j3)
                {
                    if (b8 == null)
                    {
                        break label1;
                    }
                    f2 = f6;
                    b2 = b8;
                    i1 = k2;
                    if (k1 == b8.b)
                    {
                        f2 = f6;
                        b2 = b8;
                        i1 = k2;
                        if (!b8.c)
                        {
                            e.remove(k2);
                            h.destroyItem(this, k1, b8.a);
                            if (k2 < e.size())
                            {
                                b2 = (b)e.get(k2);
                                i1 = k2;
                                f2 = f6;
                            } else
                            {
                                b2 = null;
                                f2 = f6;
                                i1 = k2;
                            }
                        }
                    }
                } else
                if (b8 != null && k1 == b8.b)
                {
                    f2 = f6 + b8.d;
                    i1 = k2 + 1;
                    if (i1 < e.size())
                    {
                        b2 = (b)e.get(i1);
                    } else
                    {
                        b2 = null;
                    }
                } else
                {
                    b2 = a(k1, k2);
                    i1 = k2 + 1;
                    f2 = f6 + b2.d;
                    if (i1 < e.size())
                    {
                        b2 = (b)e.get(i1);
                    } else
                    {
                        b2 = null;
                    }
                }
                k1++;
                f6 = f2;
                b8 = b2;
                k2 = i1;
            } while (true);
        }
        a(b5, i2, b3);
        s s2 = h;
        i1 = i;
        Object obj;
        int l1;
        if (b5 != null)
        {
            obj = b5.a;
        } else
        {
            obj = null;
        }
        s2.setPrimaryItem(this, i1, obj);
        h.finishUpdate(this);
        l1 = getChildCount();
        for (i1 = 0; i1 < l1; i1++)
        {
            Object obj2 = getChildAt(i1);
            obj = (c)((View) (obj2)).getLayoutParams();
            obj.f = i1;
            if (((c) (obj)).a || ((c) (obj)).c != 0.0F)
            {
                continue;
            }
            obj2 = a(((View) (obj2)));
            if (obj2 != null)
            {
                obj.c = ((b) (obj2)).d;
                obj.e = ((b) (obj2)).b;
            }
        }

        h();
        if (!hasFocus()) goto _L4; else goto _L7
_L7:
        Object obj1 = findFocus();
        b b4;
        if (obj1 != null)
        {
            obj1 = b(((View) (obj1)));
        } else
        {
            obj1 = null;
        }
        if (obj1 != null && ((b) (obj1)).b == i) goto _L4; else goto _L8
_L8:
        i1 = 0;
_L11:
        if (i1 >= getChildCount()) goto _L4; else goto _L9
_L9:
        obj1 = getChildAt(i1);
        b4 = a(((View) (obj1)));
        if (b4 != null && b4.b == i && ((View) (obj1)).requestFocus(byte1)) goto _L4; else goto _L10
_L10:
        i1++;
          goto _L11
    }

    private void b(boolean flag)
    {
        if (x != flag)
        {
            x = flag;
        }
    }

    static int c(ViewPager viewpager)
    {
        return viewpager.i;
    }

    private b c(int i1)
    {
        for (int j1 = 0; j1 < e.size(); j1++)
        {
            b b1 = (b)e.get(j1);
            if (b1.b == i1)
            {
                return b1;
            }
        }

        return null;
    }

    private boolean d(int i1)
    {
        boolean flag = false;
        if (e.size() == 0)
        {
            U = false;
            a(0, 0.0F, 0);
            if (!U)
            {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
        } else
        {
            b b1 = j();
            int k1 = g();
            int l1 = o;
            float f1 = (float)o / (float)k1;
            int j1 = b1.b;
            f1 = ((float)i1 / (float)k1 - b1.e) / (b1.d + f1);
            i1 = (int)((float)(k1 + l1) * f1);
            U = false;
            a(j1, f1, i1);
            if (!U)
            {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
            flag = true;
        }
        return flag;
    }

    private void e(int i1)
    {
        if (aa != null)
        {
            aa.onPageSelected(i1);
        }
        if (W != null)
        {
            int j1 = 0;
            for (int k1 = W.size(); j1 < k1; j1++)
            {
                f f1 = (f)W.get(j1);
                if (f1 != null)
                {
                    f1.onPageSelected(i1);
                }
            }

        }
        if (ab != null)
        {
            ab.onPageSelected(i1);
        }
    }

    static int[] e()
    {
        return a;
    }

    private void f()
    {
        setWillNotDraw(false);
        setDescendantFocusability(0x40000);
        setFocusable(true);
        Context context = getContext();
        m = new Scroller(context, d);
        ViewConfiguration viewconfiguration = ViewConfiguration.get(context);
        float f1 = context.getResources().getDisplayMetrics().density;
        E = android.support.v4.view.ab.a(viewconfiguration);
        L = (int)(400F * f1);
        M = viewconfiguration.getScaledMaximumFlingVelocity();
        Q = new android.support.v4.widget.i(context);
        R = new android.support.v4.widget.i(context);
        N = (int)(25F * f1);
        O = (int)(2.0F * f1);
        C = (int)(16F * f1);
        android.support.v4.view.x.a(this, new d());
        if (android.support.v4.view.x.e(this) == 0)
        {
            android.support.v4.view.x.c(this, 1);
        }
    }

    private boolean f(int i1)
    {
        View view = findFocus();
        if (view != this) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L8:
        boolean flag1;
        flag1 = false;
        view = FocusFinder.getInstance().findNextFocus(this, ((View) (obj)), i1);
        if (view == null || view == obj) goto _L4; else goto _L3
_L3:
        if (i1 != 17) goto _L6; else goto _L5
_L5:
        int j1 = a(g, view).left;
        int l1 = a(g, ((View) (obj))).left;
        StringBuilder stringbuilder;
        boolean flag;
        if (obj != null && j1 >= l1)
        {
            flag1 = l();
        } else
        {
            flag1 = view.requestFocus();
        }
_L11:
        if (flag1)
        {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i1));
        }
        return flag1;
_L2:
        obj = view;
        if (view == null) goto _L8; else goto _L7
_L7:
        l1 = 0;
        obj = view.getParent();
_L9:
label0:
        {
            flag = l1;
            if (obj instanceof ViewGroup)
            {
                if (obj != this)
                {
                    break label0;
                }
                flag = true;
            }
            obj = view;
            if (!flag)
            {
                stringbuilder = new StringBuilder();
                stringbuilder.append(view.getClass().getSimpleName());
                for (obj = view.getParent(); obj instanceof ViewGroup; obj = ((ViewParent) (obj)).getParent())
                {
                    stringbuilder.append(" => ").append(obj.getClass().getSimpleName());
                }

                break MISSING_BLOCK_LABEL_214;
            }
        }
          goto _L8
        obj = ((ViewParent) (obj)).getParent();
          goto _L9
        Log.e("ViewPager", (new StringBuilder("arrowScroll tried to find focus based on non-child current focused view ")).append(stringbuilder.toString()).toString());
        obj = null;
          goto _L8
_L6:
        if (i1 != 66) goto _L11; else goto _L10
_L10:
        int k1;
        int i2;
        k1 = a(g, view).left;
        i2 = a(g, ((View) (obj))).left;
        if (obj != null && k1 <= i2) goto _L13; else goto _L12
_L12:
        flag1 = view.requestFocus();
          goto _L11
_L4:
        if (i1 != 17 && i1 != 1) goto _L15; else goto _L14
_L14:
        flag1 = l();
          goto _L11
_L15:
        if (i1 != 66 && i1 != 2) goto _L11; else goto _L13
_L13:
        if (h != null && i < h.getCount() - 1)
        {
            setCurrentItem(i + 1, true);
            flag1 = true;
        } else
        {
            flag1 = false;
        }
          goto _L11
    }

    private int g()
    {
        return getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
    }

    private void h()
    {
        if (af != 0)
        {
            int j1;
            if (ag == null)
            {
                ag = new ArrayList();
            } else
            {
                ag.clear();
            }
            j1 = getChildCount();
            for (int i1 = 0; i1 < j1; i1++)
            {
                View view = getChildAt(i1);
                ag.add(view);
            }

            Collections.sort(ag, ah);
        }
    }

    private void i()
    {
        ViewParent viewparent = getParent();
        if (viewparent != null)
        {
            viewparent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private b j()
    {
        float f2 = 0.0F;
        int i1 = g();
        float f1;
        float f3;
        float f4;
        b b2;
        boolean flag;
        int j1;
        if (i1 > 0)
        {
            f1 = (float)getScrollX() / (float)i1;
        } else
        {
            f1 = 0.0F;
        }
        if (i1 > 0)
        {
            f2 = (float)o / (float)i1;
        }
        j1 = -1;
        f3 = 0.0F;
        f4 = 0.0F;
        flag = true;
        b2 = null;
        i1 = 0;
        do
        {
            b b1;
            int k1;
label0:
            {
                b b3;
label1:
                {
                    b3 = b2;
                    if (i1 >= e.size())
                    {
                        break label1;
                    }
                    b3 = (b)e.get(i1);
                    k1 = i1;
                    b1 = b3;
                    if (!flag)
                    {
                        k1 = i1;
                        b1 = b3;
                        if (b3.b != j1 + 1)
                        {
                            b1 = f;
                            b1.e = f3 + f4 + f2;
                            b1.b = j1 + 1;
                            b1.d = h.getPageWidth(b1.b);
                            k1 = i1 - 1;
                        }
                    }
                    f3 = b1.e;
                    f4 = b1.d;
                    if (!flag)
                    {
                        b3 = b2;
                        if (f1 < f3)
                        {
                            break label1;
                        }
                    }
                    if (f1 >= f4 + f3 + f2 && k1 != e.size() - 1)
                    {
                        break label0;
                    }
                    b3 = b1;
                }
                return b3;
            }
            flag = false;
            j1 = b1.b;
            f4 = b1.d;
            i1 = k1 + 1;
            b2 = b1;
        } while (true);
    }

    private void k()
    {
        A = false;
        B = false;
        if (K != null)
        {
            K.recycle();
            K = null;
        }
    }

    private boolean l()
    {
        if (i > 0)
        {
            setCurrentItem(i - 1, true);
            return true;
        } else
        {
            return false;
        }
    }

    public final s a()
    {
        return h;
    }

    protected void a(int i1, float f1, int j1)
    {
        if (V <= 0) goto _L2; else goto _L1
_L1:
        int k1;
        int k2;
        int l2;
        int j3;
        int k3;
        int l3;
        j3 = getScrollX();
        k1 = getPaddingLeft();
        k2 = getPaddingRight();
        k3 = getWidth();
        l3 = getChildCount();
        l2 = 0;
_L12:
        if (l2 >= l3) goto _L2; else goto _L3
_L3:
        View view;
        c c1;
        int i2;
        int i3;
        view = getChildAt(l2);
        c1 = (c)view.getLayoutParams();
        i2 = k1;
        i3 = k2;
        if (!c1.a) goto _L5; else goto _L4
_L4:
        c1.b & 7;
        JVM INSTR tableswitch 1 5: default 124
    //                   1 203
    //                   2 124
    //                   3 186
    //                   4 124
    //                   5 223;
           goto _L6 _L7 _L6 _L8 _L6 _L9
_L6:
        i2 = k1;
_L10:
        int i4 = (i2 + j3) - view.getLeft();
        i2 = k1;
        i3 = k2;
        if (i4 != 0)
        {
            view.offsetLeftAndRight(i4);
            i3 = k2;
            i2 = k1;
        }
_L5:
        l2++;
        k1 = i2;
        k2 = i3;
        continue; /* Loop/switch isn't completed */
_L8:
        i2 = k1;
        k1 += view.getWidth();
        continue; /* Loop/switch isn't completed */
_L7:
        i2 = Math.max((k3 - view.getMeasuredWidth()) / 2, k1);
        continue; /* Loop/switch isn't completed */
_L9:
        i2 = k3 - k2 - view.getMeasuredWidth();
        k2 += view.getMeasuredWidth();
        if (true) goto _L10; else goto _L2
_L2:
        if (aa != null)
        {
            aa.onPageScrolled(i1, f1, j1);
        }
        if (W != null)
        {
            int j2 = W.size();
            for (int l1 = 0; l1 < j2; l1++)
            {
                f f2 = (f)W.get(l1);
                if (f2 != null)
                {
                    f2.onPageScrolled(i1, f1, j1);
                }
            }

        }
        if (ab != null)
        {
            ab.onPageScrolled(i1, f1, j1);
        }
        if (ad != null)
        {
            getScrollX();
            j1 = getChildCount();
            for (i1 = 0; i1 < j1; i1++)
            {
                View view1 = getChildAt(i1);
                if (!((c)view1.getLayoutParams()).a)
                {
                    view1.getLeft();
                    g();
                }
            }

        }
        U = true;
        return;
        if (true) goto _L12; else goto _L11
_L11:
    }

    final void a(e e1)
    {
        ac = e1;
    }

    public final void a(f f1)
    {
        if (W == null)
        {
            W = new ArrayList();
        }
        W.add(f1);
    }

    public void addFocusables(ArrayList arraylist, int i1, int j1)
    {
        int l1 = arraylist.size();
        int i2 = getDescendantFocusability();
        if (i2 != 0x60000)
        {
            for (int k1 = 0; k1 < getChildCount(); k1++)
            {
                View view = getChildAt(k1);
                if (view.getVisibility() == 0)
                {
                    b b1 = a(view);
                    if (b1 != null && b1.b == i)
                    {
                        view.addFocusables(arraylist, i1, j1);
                    }
                }
            }

        }
        while (i2 == 0x40000 && l1 != arraylist.size() || !isFocusable() || (j1 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode() || arraylist == null) 
        {
            return;
        }
        arraylist.add(this);
    }

    public void addTouchables(ArrayList arraylist)
    {
        for (int i1 = 0; i1 < getChildCount(); i1++)
        {
            View view = getChildAt(i1);
            if (view.getVisibility() != 0)
            {
                continue;
            }
            b b1 = a(view);
            if (b1 != null && b1.b == i)
            {
                view.addTouchables(arraylist);
            }
        }

    }

    public void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        android.view.ViewGroup.LayoutParams layoutparams1 = layoutparams;
        if (!checkLayoutParams(layoutparams))
        {
            layoutparams1 = generateLayoutParams(layoutparams);
        }
        layoutparams = (c)layoutparams1;
        layoutparams.a = ((c) (layoutparams)).a | (view instanceof a);
        if (w)
        {
            if (layoutparams != null && ((c) (layoutparams)).a)
            {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            } else
            {
                layoutparams.d = true;
                addViewInLayout(view, i1, layoutparams1);
                return;
            }
        } else
        {
            super.addView(view, i1, layoutparams1);
            return;
        }
    }

    public final int b()
    {
        return i;
    }

    final f b(f f1)
    {
        f f2 = ab;
        ab = f1;
        return f2;
    }

    final void c()
    {
        int l3 = h.getCount();
        b = l3;
        int i1;
        int k1;
        int l1;
        int k2;
        int j3;
        if (e.size() < z * 2 + 1 && e.size() < l3)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        k1 = i;
        l1 = 0;
        k2 = 0;
        j3 = i1;
        while (k2 < e.size()) 
        {
            b b1 = (b)e.get(k2);
            int k3 = h.getItemPosition(b1.a);
            int i3 = k2;
            int l2 = l1;
            i1 = j3;
            int j2 = k1;
            if (k3 != -1)
            {
                if (k3 == -2)
                {
                    e.remove(k2);
                    j3 = k2 - 1;
                    k2 = l1;
                    if (l1 == 0)
                    {
                        h.startUpdate(this);
                        k2 = 1;
                    }
                    h.destroyItem(this, b1.b, b1.a);
                    i1 = 1;
                    i3 = j3;
                    l2 = k2;
                    j2 = k1;
                    if (i == b1.b)
                    {
                        j2 = Math.max(0, Math.min(i, l3 - 1));
                        i1 = 1;
                        l2 = k2;
                        i3 = j3;
                    }
                } else
                {
                    i3 = k2;
                    l2 = l1;
                    i1 = j3;
                    j2 = k1;
                    if (b1.b != k3)
                    {
                        if (b1.b == i)
                        {
                            k1 = k3;
                        }
                        b1.b = k3;
                        i1 = 1;
                        i3 = k2;
                        l2 = l1;
                        j2 = k1;
                    }
                }
            }
            k2 = i3 + 1;
            l1 = l2;
            j3 = i1;
            k1 = j2;
        }
        if (l1 != 0)
        {
            h.finishUpdate(this);
        }
        Collections.sort(e, c);
        if (j3 != 0)
        {
            int i2 = getChildCount();
            for (int j1 = 0; j1 < i2; j1++)
            {
                c c1 = (c)getChildAt(j1).getLayoutParams();
                if (!c1.a)
                {
                    c1.c = 0.0F;
                }
            }

            a(k1, false, true);
            requestLayout();
        }
    }

    public boolean canScrollHorizontally(int i1)
    {
        if (h != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j1;
        int k1;
        j1 = g();
        k1 = getScrollX();
        if (i1 >= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (k1 <= (int)((float)j1 * s)) goto _L1; else goto _L3
_L3:
        return true;
        if (i1 <= 0 || k1 >= (int)((float)j1 * t)) goto _L1; else goto _L4
_L4:
        return true;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof c) && super.checkLayoutParams(layoutparams);
    }

    public void computeScroll()
    {
        if (!m.isFinished() && m.computeScrollOffset())
        {
            int i1 = getScrollX();
            int j1 = getScrollY();
            int k1 = m.getCurrX();
            int l1 = m.getCurrY();
            if (i1 != k1 || j1 != l1)
            {
                scrollTo(k1, l1);
                if (!d(k1))
                {
                    m.abortAnimation();
                    scrollTo(0, l1);
                }
            }
            android.support.v4.view.x.d(this);
            return;
        } else
        {
            a(true);
            return;
        }
    }

    final void d()
    {
        b(i);
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        boolean flag1 = false;
        if (super.dispatchKeyEvent(keyevent)) goto _L2; else goto _L1
_L1:
        if (keyevent.getAction() != 0) goto _L4; else goto _L3
_L3:
        keyevent.getKeyCode();
        JVM INSTR lookupswitch 3: default 56
    //                   21: 66
    //                   22: 76
    //                   61: 86;
           goto _L4 _L5 _L6 _L7
_L4:
        boolean flag = false;
_L9:
        if (!flag) goto _L8; else goto _L2
_L2:
        flag1 = true;
_L8:
        return flag1;
_L5:
        flag = f(17);
          goto _L9
_L6:
        flag = f(66);
          goto _L9
_L7:
        if (android.os.Build.VERSION.SDK_INT < 11) goto _L4; else goto _L10
_L10:
        if (!android.support.v4.view.f.b(keyevent))
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = f(2);
          goto _L9
        if (!android.support.v4.view.f.a(keyevent)) goto _L4; else goto _L11
_L11:
        flag = f(1);
          goto _L9
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        if (accessibilityevent.getEventType() == 4096)
        {
            return super.dispatchPopulateAccessibilityEvent(accessibilityevent);
        }
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            if (view.getVisibility() != 0)
            {
                continue;
            }
            b b1 = a(view);
            if (b1 != null && b1.b == i && view.dispatchPopulateAccessibilityEvent(accessibilityevent))
            {
                return true;
            }
        }

        return false;
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        int j1 = 0;
        int i1 = 0;
        int k1 = android.support.v4.view.x.a(this);
        if (k1 == 0 || k1 == 1 && h != null && h.getCount() > 1)
        {
            if (!Q.a())
            {
                j1 = canvas.save();
                i1 = getHeight() - getPaddingTop() - getPaddingBottom();
                int l1 = getWidth();
                canvas.rotate(270F);
                canvas.translate(-i1 + getPaddingTop(), s * (float)l1);
                Q.a(i1, l1);
                i1 = Q.a(canvas) | false;
                canvas.restoreToCount(j1);
            }
            j1 = i1;
            if (!R.a())
            {
                int i2 = canvas.save();
                j1 = getWidth();
                int j2 = getHeight();
                int k2 = getPaddingTop();
                int l2 = getPaddingBottom();
                canvas.rotate(90F);
                canvas.translate(-getPaddingTop(), -(t + 1.0F) * (float)j1);
                R.a(j2 - k2 - l2, j1);
                j1 = i1 | R.a(canvas);
                canvas.restoreToCount(i2);
            }
        } else
        {
            Q.b();
            R.b();
        }
        if (j1 != 0)
        {
            android.support.v4.view.x.d(this);
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        Drawable drawable = p;
        if (drawable != null && drawable.isStateful())
        {
            drawable.setState(getDrawableState());
        }
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new c();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new c(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return generateDefaultLayoutParams();
    }

    protected int getChildDrawingOrder(int i1, int j1)
    {
        if (af == 2)
        {
            i1 = i1 - 1 - j1;
        } else
        {
            i1 = j1;
        }
        return ((c)((View)ag.get(i1)).getLayoutParams()).f;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        S = true;
    }

    protected void onDetachedFromWindow()
    {
        removeCallbacks(ai);
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (o > 0 && p != null && e.size() > 0 && h != null)
        {
            int k1 = getScrollX();
            int l1 = getWidth();
            float f3 = (float)o / (float)l1;
            int j1 = 0;
            Object obj = (b)e.get(0);
            float f1 = ((b) (obj)).e;
            int i2 = e.size();
            int i1 = ((b) (obj)).b;
            int j2 = ((b)e.get(i2 - 1)).b;
            do
            {
                if (i1 >= j2)
                {
                    break;
                }
                for (; i1 > ((b) (obj)).b && j1 < i2; obj = (b)((ArrayList) (obj)).get(j1))
                {
                    obj = e;
                    j1++;
                }

                float f2;
                if (i1 == ((b) (obj)).b)
                {
                    f2 = (((b) (obj)).e + ((b) (obj)).d) * (float)l1;
                    f1 = ((b) (obj)).e + ((b) (obj)).d + f3;
                } else
                {
                    float f4 = h.getPageWidth(i1);
                    f2 = (f1 + f4) * (float)l1;
                    f1 += f4 + f3;
                }
                if ((float)o + f2 > (float)k1)
                {
                    p.setBounds((int)f2, q, (int)((float)o + f2 + 0.5F), r);
                    p.draw(canvas);
                }
                if (f2 > (float)(k1 + l1))
                {
                    break;
                }
                i1++;
            } while (true);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        i1 = motionevent.getAction() & 0xff;
        if (i1 == 3 || i1 == 1)
        {
            A = false;
            B = false;
            J = -1;
            if (K != null)
            {
                K.recycle();
                K = null;
            }
            return false;
        }
        if (i1 != 0)
        {
            if (A)
            {
                return true;
            }
            if (B)
            {
                return false;
            }
        }
        i1;
        JVM INSTR lookupswitch 3: default 116
    //                   0: 427
    //                   2: 143
    //                   6: 558;
           goto _L1 _L2 _L3 _L4
_L1:
        if (K == null)
        {
            K = VelocityTracker.obtain();
        }
        K.addMovement(motionevent);
        return A;
_L3:
        float f1;
        float f3;
        float f4;
        float f5;
        float f6;
        int j1 = J;
        if (j1 == -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        j1 = android.support.v4.view.m.a(motionevent, j1);
        f3 = android.support.v4.view.m.c(motionevent, j1);
        f1 = f3 - F;
        f5 = Math.abs(f1);
        f4 = android.support.v4.view.m.d(motionevent, j1);
        f6 = Math.abs(f4 - I);
        if (f1 != 0.0F)
        {
            float f7 = F;
            boolean flag;
            if (f7 < (float)D && f1 > 0.0F || f7 > (float)(getWidth() - D) && f1 < 0.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag && a(this, false, (int)f1, (int)f3, (int)f4))
            {
                F = f3;
                G = f4;
                B = true;
                return false;
            }
        }
        if (f5 <= (float)E || 0.5F * f5 <= f6) goto _L6; else goto _L5
_L5:
        A = true;
        i();
        a(1);
        if (f1 > 0.0F)
        {
            f1 = H + (float)E;
        } else
        {
            f1 = H - (float)E;
        }
        F = f1;
        G = f4;
        b(true);
_L7:
        if (A && a(f3))
        {
            android.support.v4.view.x.d(this);
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (f6 > (float)E)
        {
            B = true;
        }
        if (true) goto _L7; else goto _L2
_L2:
        float f2 = motionevent.getX();
        H = f2;
        F = f2;
        f2 = motionevent.getY();
        I = f2;
        G = f2;
        J = android.support.v4.view.m.b(motionevent, 0);
        B = false;
        m.computeScrollOffset();
        if (aj == 2 && Math.abs(m.getFinalX() - m.getCurrX()) > O)
        {
            m.abortAnimation();
            y = false;
            d();
            A = true;
            i();
            a(1);
        } else
        {
            a(false);
            A = false;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        a(motionevent);
        if (true) goto _L1; else goto _L8
_L8:
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int i2;
        int l2;
        int i3;
        int i4;
        int j4;
        int k4;
        int l4;
        i4 = getChildCount();
        k4 = k1 - i1;
        j4 = l1 - j1;
        j1 = getPaddingLeft();
        i1 = getPaddingTop();
        i2 = getPaddingRight();
        l1 = getPaddingBottom();
        l4 = getScrollX();
        l2 = 0;
        i3 = 0;
_L17:
        if (i3 >= i4) goto _L2; else goto _L1
_L1:
        View view;
        int j2;
        int j3;
        int k3;
        int l3;
        view = getChildAt(i3);
        l3 = l2;
        k3 = l1;
        j2 = j1;
        j3 = i2;
        k1 = i1;
        if (view.getVisibility() == 8) goto _L4; else goto _L3
_L3:
        c c1;
        c1 = (c)view.getLayoutParams();
        l3 = l2;
        k3 = l1;
        j2 = j1;
        j3 = i2;
        k1 = i1;
        if (!c1.a) goto _L4; else goto _L5
_L5:
        k1 = c1.b;
        j3 = c1.b;
        k1 & 7;
        JVM INSTR tableswitch 1 5: default 184
    //                   1 319
    //                   2 184
    //                   3 304
    //                   4 184
    //                   5 341;
           goto _L6 _L7 _L6 _L8 _L6 _L9
_L6:
        k1 = j1;
        j2 = j1;
_L14:
        j3 & 0x70;
        JVM INSTR lookupswitch 3: default 228
    //                   16: 383
    //                   48: 370
    //                   80: 401;
           goto _L10 _L11 _L12 _L13
_L10:
        j1 = i1;
_L15:
        k1 += l4;
        view.layout(k1, j1, view.getMeasuredWidth() + k1, view.getMeasuredHeight() + j1);
        l3 = l2 + 1;
        k1 = i1;
        j3 = i2;
        k3 = l1;
_L4:
        i3++;
        l2 = l3;
        l1 = k3;
        j1 = j2;
        i2 = j3;
        i1 = k1;
        continue; /* Loop/switch isn't completed */
_L8:
        k1 = j1;
        j2 = j1 + view.getMeasuredWidth();
          goto _L14
_L7:
        k1 = Math.max((k4 - view.getMeasuredWidth()) / 2, j1);
        j2 = j1;
          goto _L14
_L9:
        k1 = k4 - i2 - view.getMeasuredWidth();
        i2 += view.getMeasuredWidth();
        j2 = j1;
          goto _L14
_L12:
        j1 = i1;
        i1 += view.getMeasuredHeight();
          goto _L15
_L11:
        j1 = Math.max((j4 - view.getMeasuredHeight()) / 2, i1);
          goto _L15
_L13:
        j1 = j4 - l1 - view.getMeasuredHeight();
        l1 += view.getMeasuredHeight();
          goto _L15
_L2:
        i2 = k4 - j1 - i2;
        for (k1 = 0; k1 < i4; k1++)
        {
            View view1 = getChildAt(k1);
            if (view1.getVisibility() == 8)
            {
                continue;
            }
            c c2 = (c)view1.getLayoutParams();
            if (c2.a)
            {
                continue;
            }
            b b1 = a(view1);
            if (b1 == null)
            {
                continue;
            }
            int k2 = j1 + (int)((float)i2 * b1.e);
            if (c2.d)
            {
                c2.d = false;
                view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)((float)i2 * c2.c), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j4 - i1 - l1, 0x40000000));
            }
            view1.layout(k2, i1, view1.getMeasuredWidth() + k2, view1.getMeasuredHeight() + i1);
        }

        q = i1;
        r = j4 - l1;
        V = l2;
        if (S)
        {
            a(i, false, 0, false);
        }
        S = false;
        return;
        if (true) goto _L17; else goto _L16
_L16:
    }

    protected void onMeasure(int i1, int j1)
    {
        setMeasuredDimension(getDefaultSize(0, i1), getDefaultSize(0, j1));
        i1 = getMeasuredWidth();
        D = Math.min(i1 / 10, C);
        i1 = i1 - getPaddingLeft() - getPaddingRight();
        j1 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
        int i4 = getChildCount();
        int j2 = 0;
        do
        {
            if (j2 < i4)
            {
                View view = getChildAt(j2);
                int k1 = j1;
                int i2 = i1;
                if (view.getVisibility() != 8)
                {
                    c c1 = (c)view.getLayoutParams();
                    k1 = j1;
                    i2 = i1;
                    if (c1 != null)
                    {
                        k1 = j1;
                        i2 = i1;
                        if (c1.a)
                        {
                            i2 = c1.b & 7;
                            int k2 = c1.b & 0x70;
                            int l2 = 0x80000000;
                            k1 = 0x80000000;
                            boolean flag;
                            boolean flag1;
                            int i3;
                            int j3;
                            if (k2 == 48 || k2 == 80)
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                            if (i2 == 3 || i2 == 5)
                            {
                                flag1 = true;
                            } else
                            {
                                flag1 = false;
                            }
                            if (flag)
                            {
                                i2 = 0x40000000;
                            } else
                            {
                                i2 = l2;
                                if (flag1)
                                {
                                    k1 = 0x40000000;
                                    i2 = l2;
                                }
                            }
                            j3 = i1;
                            l2 = j1;
                            i3 = j3;
                            if (c1.width != -2)
                            {
                                int k3 = 0x40000000;
                                i2 = k3;
                                i3 = j3;
                                if (c1.width != -1)
                                {
                                    i3 = c1.width;
                                    i2 = k3;
                                }
                            }
                            j3 = l2;
                            if (c1.height != -2)
                            {
                                int l3 = 0x40000000;
                                k1 = l3;
                                j3 = l2;
                                if (c1.height != -1)
                                {
                                    j3 = c1.height;
                                    k1 = l3;
                                }
                            }
                            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i3, i2), android.view.View.MeasureSpec.makeMeasureSpec(j3, k1));
                            if (flag)
                            {
                                k1 = j1 - view.getMeasuredHeight();
                                i2 = i1;
                            } else
                            {
                                k1 = j1;
                                i2 = i1;
                                if (flag1)
                                {
                                    i2 = i1 - view.getMeasuredWidth();
                                    k1 = j1;
                                }
                            }
                        }
                    }
                }
                j2++;
                j1 = k1;
                i1 = i2;
                continue;
            }
            u = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
            v = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000);
            w = true;
            d();
            w = false;
            int l1 = getChildCount();
            for (j1 = 0; j1 < l1; j1++)
            {
                View view1 = getChildAt(j1);
                if (view1.getVisibility() == 8)
                {
                    continue;
                }
                c c2 = (c)view1.getLayoutParams();
                if (c2 == null || !c2.a)
                {
                    view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)((float)i1 * c2.c), 0x40000000), v);
                }
            }

            return;
        } while (true);
    }

    protected boolean onRequestFocusInDescendants(int i1, Rect rect)
    {
        int k1 = getChildCount();
        int j1;
        byte byte0;
        if ((i1 & 2) != 0)
        {
            j1 = 0;
            byte0 = 1;
        } else
        {
            j1 = k1 - 1;
            byte0 = -1;
            k1 = -1;
        }
        for (; j1 != k1; j1 += byte0)
        {
            View view = getChildAt(j1);
            if (view.getVisibility() != 0)
            {
                continue;
            }
            b b1 = a(view);
            if (b1 != null && b1.b == i && view.requestFocus(i1, rect))
            {
                return true;
            }
        }

        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (!(parcelable instanceof SavedState))
        {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (h != null)
        {
            h.restoreState(((SavedState) (parcelable)).b, ((SavedState) (parcelable)).c);
            a(((SavedState) (parcelable)).a, false, true);
            return;
        } else
        {
            j = ((SavedState) (parcelable)).a;
            k = ((SavedState) (parcelable)).b;
            l = ((SavedState) (parcelable)).c;
            return;
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = i;
        if (h != null)
        {
            savedstate.b = h.saveState();
        }
        return savedstate;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (i1 != k1)
        {
            a(i1, k1, o, o);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1;
        int j1;
        int k1;
        if (P)
        {
            return true;
        }
        if (motionevent.getAction() == 0 && motionevent.getEdgeFlags() != 0)
        {
            return false;
        }
        if (h == null || h.getCount() == 0)
        {
            return false;
        }
        if (K == null)
        {
            K = VelocityTracker.obtain();
        }
        K.addMovement(motionevent);
        k1 = motionevent.getAction();
        j1 = 0;
        i1 = j1;
        k1 & 0xff;
        JVM INSTR tableswitch 0 6: default 128
    //                   0 143
    //                   1 395
    //                   2 205
    //                   3 675
    //                   4 132
    //                   5 726
    //                   6 759;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L6:
        break; /* Loop/switch isn't completed */
_L1:
        i1 = j1;
_L10:
        if (i1 != 0)
        {
            android.support.v4.view.x.d(this);
        }
        return true;
_L2:
        m.abortAnimation();
        y = false;
        d();
        float f1 = motionevent.getX();
        H = f1;
        F = f1;
        f1 = motionevent.getY();
        I = f1;
        G = f1;
        J = android.support.v4.view.m.b(motionevent, 0);
        i1 = j1;
        continue; /* Loop/switch isn't completed */
_L4:
        if (!A)
        {
            i1 = android.support.v4.view.m.a(motionevent, J);
            float f2 = android.support.v4.view.m.c(motionevent, i1);
            float f6 = Math.abs(f2 - F);
            float f4 = android.support.v4.view.m.d(motionevent, i1);
            float f7 = Math.abs(f4 - G);
            if (f6 > (float)E && f6 > f7)
            {
                A = true;
                i();
                ViewParent viewparent;
                if (f2 - H > 0.0F)
                {
                    f2 = H + (float)E;
                } else
                {
                    f2 = H - (float)E;
                }
                F = f2;
                G = f4;
                a(1);
                b(true);
                viewparent = getParent();
                if (viewparent != null)
                {
                    viewparent.requestDisallowInterceptTouchEvent(true);
                }
            }
        }
        i1 = j1;
        if (A)
        {
            i1 = a(android.support.v4.view.m.c(motionevent, android.support.v4.view.m.a(motionevent, J))) | false;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        i1 = j1;
        if (A)
        {
            Object obj = K;
            ((VelocityTracker) (obj)).computeCurrentVelocity(1000, M);
            j1 = (int)android.support.v4.view.w.a(((VelocityTracker) (obj)), J);
            y = true;
            int l1 = g();
            int i2 = getScrollX();
            obj = j();
            i1 = ((b) (obj)).b;
            float f5 = ((float)i2 / (float)l1 - ((b) (obj)).e) / ((b) (obj)).d;
            if (Math.abs((int)(android.support.v4.view.m.c(motionevent, android.support.v4.view.m.a(motionevent, J)) - H)) > N && Math.abs(j1) > L)
            {
                if (j1 <= 0)
                {
                    i1++;
                }
            } else
            {
                float f3;
                if (i1 >= i)
                {
                    f3 = 0.4F;
                } else
                {
                    f3 = 0.6F;
                }
                i1 = (int)(f3 + ((float)i1 + f5));
            }
            if (e.size() > 0)
            {
                motionevent = (b)e.get(0);
                b b1 = (b)e.get(e.size() - 1);
                i1 = Math.max(((b) (motionevent)).b, Math.min(i1, b1.b));
            }
            a(i1, true, true, j1);
            J = -1;
            k();
            i1 = Q.c() | R.c();
        }
        continue; /* Loop/switch isn't completed */
_L5:
        i1 = j1;
        if (A)
        {
            a(i, true, 0, false);
            J = -1;
            k();
            i1 = Q.c() | R.c();
        }
        continue; /* Loop/switch isn't completed */
_L7:
        i1 = android.support.v4.view.m.b(motionevent);
        F = android.support.v4.view.m.c(motionevent, i1);
        J = android.support.v4.view.m.b(motionevent, i1);
        i1 = j1;
        continue; /* Loop/switch isn't completed */
_L8:
        a(motionevent);
        F = android.support.v4.view.m.c(motionevent, android.support.v4.view.m.a(motionevent, J));
        i1 = j1;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void removeView(View view)
    {
        if (w)
        {
            removeViewInLayout(view);
            return;
        } else
        {
            super.removeView(view);
            return;
        }
    }

    public void setAdapter(s s1)
    {
        if (h != null)
        {
            h.unregisterDataSetObserver(n);
            h.startUpdate(this);
            for (int i1 = 0; i1 < e.size(); i1++)
            {
                b b1 = (b)e.get(i1);
                h.destroyItem(this, b1.b, b1.a);
            }

            h.finishUpdate(this);
            e.clear();
            int k1;
            for (int j1 = 0; j1 < getChildCount(); j1 = k1 + 1)
            {
                k1 = j1;
                if (!((c)getChildAt(j1).getLayoutParams()).a)
                {
                    removeViewAt(j1);
                    k1 = j1 - 1;
                }
            }

            i = 0;
            scrollTo(0, 0);
        }
        s s2 = h;
        h = s1;
        b = 0;
        if (h != null)
        {
            if (n == null)
            {
                n = new h((byte)0);
            }
            h.registerDataSetObserver(n);
            y = false;
            boolean flag = S;
            S = true;
            b = h.getCount();
            if (j >= 0)
            {
                h.restoreState(k, l);
                a(j, false, true);
                j = -1;
                k = null;
                l = null;
            } else
            if (!flag)
            {
                d();
            } else
            {
                requestLayout();
            }
        }
        if (ac != null && s2 != s1)
        {
            ac.a(s2, s1);
        }
    }

    public void setCurrentItem(int i1)
    {
        y = false;
        boolean flag;
        if (!S)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(i1, flag, false);
    }

    public void setCurrentItem(int i1, boolean flag)
    {
        y = false;
        a(i1, flag, false);
    }

    public void setOffscreenPageLimit(int i1)
    {
        int j1 = i1;
        if (i1 <= 0)
        {
            Log.w("ViewPager", (new StringBuilder("Requested offscreen page limit ")).append(i1).append(" too small; defaulting to 1").toString());
            j1 = 1;
        }
        if (j1 != z)
        {
            z = j1;
            d();
        }
    }

    public void setOnPageChangeListener(f f1)
    {
        aa = f1;
    }

    public void setPageMargin(int i1)
    {
        int j1 = o;
        o = i1;
        int k1 = getWidth();
        a(k1, k1, i1, j1);
        requestLayout();
    }

    public void setPageMarginDrawable(int i1)
    {
        setPageMarginDrawable(getContext().getResources().getDrawable(i1));
    }

    public void setPageMarginDrawable(Drawable drawable)
    {
        p = drawable;
        if (drawable != null)
        {
            refreshDrawableState();
        }
        boolean flag;
        if (drawable == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setWillNotDraw(flag);
        invalidate();
    }

    public void setPageTransformer(boolean flag, g g1)
    {
        int i1 = 1;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            boolean flag1;
            boolean flag2;
            boolean flag3;
            if (g1 != null)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (ad != null)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            if (flag2 != flag3)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            ad = g1;
            if (android.os.Build.VERSION.SDK_INT >= 7)
            {
                if (ae == null)
                {
                    try
                    {
                        ae = android/view/ViewGroup.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[] {
                            Boolean.TYPE
                        });
                    }
                    // Misplaced declaration of an exception variable
                    catch (g g1)
                    {
                        Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", g1);
                    }
                }
                try
                {
                    ae.invoke(this, new Object[] {
                        Boolean.valueOf(flag2)
                    });
                }
                // Misplaced declaration of an exception variable
                catch (g g1)
                {
                    Log.e("ViewPager", "Error changing children drawing order", g1);
                }
            }
            if (flag2)
            {
                if (flag)
                {
                    i1 = 2;
                }
                af = i1;
            } else
            {
                af = 0;
            }
            if (flag1)
            {
                d();
            }
        }
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return super.verifyDrawable(drawable) || drawable == p;
    }

}
