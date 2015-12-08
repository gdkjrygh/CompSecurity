// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
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
import ip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import jo;
import jz;
import ki;
import km;
import ld;
import lq;
import lr;
import ls;
import lt;
import lu;
import lv;
import lw;
import pf;

public class ViewPager extends ViewGroup
{

    private static final int e[] = {
        0x10100b3
    };
    private static final Comparator g = new Comparator() {

        public final volatile int compare(Object obj, Object obj1)
        {
            obj = (lr)obj;
            obj1 = (lr)obj1;
            return ((lr) (obj)).b - ((lr) (obj1)).b;
        }

    };
    private static final Interpolator h = new Interpolator() {

        public final float getInterpolation(float f1)
        {
            f1--;
            return f1 * (f1 * f1 * f1 * f1) + 1.0F;
        }

    };
    private float A;
    private float B;
    private float C;
    private float D;
    private int E;
    private VelocityTracker F;
    private int G;
    private int H;
    private int I;
    private int J;
    private pf K;
    private pf L;
    private boolean M;
    private boolean N;
    private int O;
    private lu P;
    private final Runnable Q;
    private int R;
    public jz a;
    public int b;
    public List c;
    lt d;
    private int f;
    private final ArrayList i;
    private final lr j;
    private final Rect k;
    private int l;
    private Scroller m;
    private lv n;
    private float o;
    private float p;
    private int q;
    private boolean r;
    private boolean s;
    private boolean t;
    private int u;
    private boolean v;
    private boolean w;
    private int x;
    private int y;
    private int z;

    public ViewPager(Context context)
    {
        super(context);
        i = new ArrayList();
        j = new lr();
        k = new Rect();
        l = -1;
        o = -3.402823E+38F;
        p = 3.402823E+38F;
        u = 1;
        E = -1;
        M = true;
        Q = new Runnable() {

            private ViewPager a;

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
        R = 0;
        f();
    }

    public ViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        i = new ArrayList();
        j = new lr();
        k = new Rect();
        l = -1;
        o = -3.402823E+38F;
        p = 3.402823E+38F;
        u = 1;
        E = -1;
        M = true;
        Q = new _cls3();
        R = 0;
        f();
    }

    private Rect a(Rect rect, View view)
    {
        if (rect == null)
        {
            rect = new Rect();
        }
        if (view == null)
        {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        for (view = view.getParent(); (view instanceof ViewGroup) && view != this; view = view.getParent())
        {
            view = (ViewGroup)view;
            rect.left = rect.left + view.getLeft();
            rect.right = rect.right + view.getRight();
            rect.top = rect.top + view.getTop();
            rect.bottom = rect.bottom + view.getBottom();
        }

        return rect;
    }

    private lr a(int i1, int j1)
    {
        lr lr1 = new lr();
        lr1.b = i1;
        lr1.a = a.a(this, i1);
        lr1.d = a.c(i1);
        if (j1 < 0 || j1 >= i.size())
        {
            i.add(lr1);
            return lr1;
        } else
        {
            i.add(j1, lr1);
            return lr1;
        }
    }

    private lr a(View view)
    {
        for (int i1 = 0; i1 < i.size(); i1++)
        {
            lr lr1 = (lr)i.get(i1);
            if (a.a(view, lr1.a))
            {
                return lr1;
            }
        }

        return null;
    }

    private void a(int i1, float f1, int j1)
    {
        if (O <= 0) goto _L2; else goto _L1
_L1:
        int k1;
        int l1;
        int l2;
        int i3;
        int j3;
        int k3;
        i3 = getScrollX();
        k1 = getPaddingLeft();
        l1 = getPaddingRight();
        j3 = getWidth();
        k3 = getChildCount();
        l2 = 0;
_L8:
        if (l2 >= k3) goto _L2; else goto _L3
_L3:
        View view;
        LayoutParams layoutparams;
        view = getChildAt(l2);
        layoutparams = (LayoutParams)view.getLayoutParams();
        if (!layoutparams.a)
        {
            break MISSING_BLOCK_LABEL_382;
        }
        layoutparams.b & 7;
        JVM INSTR tableswitch 1 5: default 116
    //                   1 219
    //                   2 116
    //                   3 190
    //                   4 116
    //                   5 251;
           goto _L4 _L5 _L4 _L6 _L4 _L7
_L4:
        int i2;
        i2 = k1;
        int j2 = l1;
        l1 = k1;
        k1 = j2;
_L9:
        int k2;
        int l3 = (i2 + i3) - view.getLeft();
        i2 = k1;
        k2 = l1;
        if (l3 != 0)
        {
            view.offsetLeftAndRight(l3);
            k2 = l1;
            i2 = k1;
        }
_L10:
        l2++;
        k1 = k2;
        l1 = i2;
          goto _L8
_L6:
        i2 = view.getWidth();
        k2 = i2 + k1;
        i2 = k1;
        k1 = l1;
        l1 = k2;
          goto _L9
_L5:
        i2 = Math.max((j3 - view.getMeasuredWidth()) / 2, k1);
        k2 = k1;
        k1 = l1;
        l1 = k2;
          goto _L9
_L7:
        i2 = j3 - l1 - view.getMeasuredWidth();
        int i4 = view.getMeasuredWidth();
        k2 = k1;
        k1 = l1 + i4;
        l1 = k2;
          goto _L9
_L2:
        if (c != null)
        {
            l1 = c.size();
            for (k1 = 0; k1 < l1; k1++)
            {
                lu lu1 = (lu)c.get(k1);
                if (lu1 != null)
                {
                    lu1.a(i1, f1, j1);
                }
            }

        }
        if (P != null)
        {
            P.a(i1, f1, j1);
        }
        N = true;
        return;
        i2 = l1;
        k2 = k1;
          goto _L10
    }

    private void a(int i1, boolean flag, int j1, boolean flag1)
    {
        lr lr1 = e(i1);
        int k1 = 0;
        if (lr1 != null)
        {
            k1 = (int)((float)g() * Math.max(o, Math.min(lr1.e, p)));
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
                    c(0);
                } else
                {
                    b(true);
                    c(2);
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
                        float f4 = a.c(b);
                        j1 = (int)(((float)Math.abs(k1) / (f2 * f4 + 0.0F) + 1.0F) * 100F);
                    }
                    j1 = Math.min(j1, 600);
                    m.startScroll(l1, i2, k1, j2, j1);
                    km.d(this);
                }
            }
        } else
        {
            if (flag1)
            {
                g(i1);
            }
            a(false);
            scrollTo(k1, 0);
            f(k1);
            return;
        }
        if (flag1)
        {
            g(i1);
        }
    }

    private void a(int i1, boolean flag, boolean flag1)
    {
        a(i1, flag, flag1, 0);
    }

    private void a(int i1, boolean flag, boolean flag1, int j1)
    {
        boolean flag2;
        flag2 = false;
        if (a == null || a.b() <= 0)
        {
            b(false);
            return;
        }
        if (!flag1 && b == i1 && i.size() != 0)
        {
            b(false);
            return;
        }
        if (i1 >= 0) goto _L2; else goto _L1
_L1:
        int k1 = 0;
_L4:
        i1 = u;
        if (k1 > b + i1 || k1 < b - i1)
        {
            for (i1 = 0; i1 < i.size(); i1++)
            {
                ((lr)i.get(i1)).c = true;
            }

        }
        break; /* Loop/switch isn't completed */
_L2:
        k1 = i1;
        if (i1 >= a.b())
        {
            k1 = a.b() - 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        flag1 = flag2;
        if (b != k1)
        {
            flag1 = true;
        }
        if (M)
        {
            b = k1;
            if (flag1)
            {
                g(k1);
            }
            requestLayout();
            return;
        } else
        {
            d(k1);
            a(k1, flag, j1, flag1);
            return;
        }
    }

    static void a(ViewPager viewpager)
    {
        viewpager.c(0);
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = jo.b(motionevent);
        if (jo.b(motionevent, i1) == E)
        {
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            A = jo.c(motionevent, i1);
            E = jo.b(motionevent, i1);
            if (F != null)
            {
                F.clear();
            }
        }
    }

    private void a(lr lr1, int i1, lr lr2)
    {
        int j2 = a.b();
        int j1 = g();
        float f4;
        if (j1 > 0)
        {
            f4 = 0.0F / (float)j1;
        } else
        {
            f4 = 0.0F;
        }
        if (lr2 != null)
        {
            j1 = lr2.b;
            if (j1 < lr1.b)
            {
                float f1 = lr2.e;
                float f5 = lr2.d;
                int k1 = 0;
                f1 = f1 + f5 + f4;
                for (j1++; j1 <= lr1.b && k1 < i.size(); j1++)
                {
                    for (lr2 = (lr)i.get(k1); j1 > lr2.b && k1 < i.size() - 1; lr2 = (lr)i.get(k1))
                    {
                        k1++;
                    }

                    while (j1 < lr2.b) 
                    {
                        float f6 = a.c(j1);
                        j1++;
                        f1 = f6 + f4 + f1;
                    }
                    lr2.e = f1;
                    f1 += lr2.d + f4;
                }

            } else
            if (j1 > lr1.b)
            {
                int l1 = i.size();
                float f2 = lr2.e;
                l1--;
                for (j1--; j1 >= lr1.b && l1 >= 0; j1--)
                {
                    for (lr2 = (lr)i.get(l1); j1 < lr2.b && l1 > 0; lr2 = (lr)i.get(l1))
                    {
                        l1--;
                    }

                    while (j1 > lr2.b) 
                    {
                        float f7 = a.c(j1);
                        j1--;
                        f2 -= f7 + f4;
                    }
                    f2 -= lr2.d + f4;
                    lr2.e = f2;
                }

            }
        }
        int k2 = i.size();
        float f8 = lr1.e;
        j1 = lr1.b - 1;
        float f3;
        int i2;
        if (lr1.b == 0)
        {
            f3 = lr1.e;
        } else
        {
            f3 = -3.402823E+38F;
        }
        o = f3;
        if (lr1.b == j2 - 1)
        {
            f3 = (lr1.e + lr1.d) - 1.0F;
        } else
        {
            f3 = 3.402823E+38F;
        }
        p = f3;
        i2 = i1 - 1;
        f3 = f8;
        for (; i2 >= 0; i2--)
        {
            for (lr2 = (lr)i.get(i2); j1 > lr2.b; j1--)
            {
                f3 -= a.c(j1) + f4;
            }

            f3 -= lr2.d + f4;
            lr2.e = f3;
            if (lr2.b == 0)
            {
                o = f3;
            }
            j1--;
        }

        f3 = lr1.e + lr1.d + f4;
        i2 = lr1.b + 1;
        j1 = i1 + 1;
        i1 = i2;
        for (; j1 < k2; j1++)
        {
            for (lr1 = (lr)i.get(j1); i1 < lr1.b; i1++)
            {
                f3 += a.c(i1) + f4;
            }

            if (lr1.b == j2 - 1)
            {
                p = (lr1.d + f3) - 1.0F;
            }
            lr1.e = f3;
            f3 += lr1.d + f4;
            i1++;
        }

    }

    private void a(boolean flag)
    {
label0:
        {
            int i1;
            boolean flag1;
            boolean flag2;
            if (R == 2)
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
                        f(l1);
                    }
                }
            }
            t = false;
            flag2 = false;
            flag1 = i1;
            for (i1 = ((flag2) ? 1 : 0); i1 < i.size(); i1++)
            {
                lr lr1 = (lr)i.get(i1);
                if (lr1.c)
                {
                    lr1.c = false;
                    flag1 = true;
                }
            }

            if (flag1)
            {
                if (!flag)
                {
                    break label0;
                }
                km.a(this, Q);
            }
            return;
        }
        Q.run();
    }

    private boolean a(float f1)
    {
        boolean flag1 = true;
        boolean flag3 = false;
        boolean flag2 = false;
        float f2 = A;
        A = f1;
        float f3 = (float)getScrollX() + (f2 - f1);
        int i1 = g();
        f1 = (float)i1 * o;
        f2 = i1;
        float f4 = p;
        lr lr1 = (lr)i.get(0);
        lr lr2 = (lr)i.get(i.size() - 1);
        boolean flag;
        if (lr1.b != 0)
        {
            f1 = lr1.e * (float)i1;
            flag = false;
        } else
        {
            flag = true;
        }
        if (lr2.b != a.b() - 1)
        {
            f2 = lr2.e * (float)i1;
            flag1 = false;
        } else
        {
            f2 *= f4;
        }
        if (f3 >= f1) goto _L2; else goto _L1
_L1:
        f2 = f1;
        if (flag)
        {
            flag2 = K.a(Math.abs(f1 - f3) / (float)i1);
            f2 = f1;
        }
_L4:
        A = A + (f2 - (float)(int)f2);
        scrollTo((int)f2, getScrollY());
        f((int)f2);
        return flag2;
_L2:
        if (f3 > f2)
        {
            flag2 = flag3;
            if (flag1)
            {
                flag2 = L.a(Math.abs(f3 - f2) / (float)i1);
            }
        } else
        {
            f2 = f3;
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
        if (flag && km.a(view, -i1)) goto _L4; else goto _L6
_L6:
        return false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static jz b(ViewPager viewpager)
    {
        return viewpager.a;
    }

    private lr b(View view)
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

    private void b(boolean flag)
    {
        if (s != flag)
        {
            s = flag;
        }
    }

    public static int c(ViewPager viewpager)
    {
        return viewpager.b;
    }

    private void c(int i1)
    {
        if (R != i1)
        {
            R = i1;
            if (c != null)
            {
                int k1 = c.size();
                for (int j1 = 0; j1 < k1; j1++)
                {
                    lu lu1 = (lu)c.get(j1);
                    if (lu1 != null)
                    {
                        lu1.b(i1);
                    }
                }

            }
            if (P != null)
            {
                P.b(i1);
                return;
            }
        }
    }

    private void d(int i1)
    {
        float f1;
        float f2;
        float f3;
        Object obj;
        android.content.res.Resources.NotFoundException notfoundexception;
        Object obj1;
        Object obj2;
        Object obj3;
        int j1;
        byte byte1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        if (b != i1)
        {
            byte byte0;
            if (b < i1)
            {
                byte0 = 66;
            } else
            {
                byte0 = 17;
            }
            obj1 = e(b);
            b = i1;
            byte1 = byte0;
        } else
        {
            obj1 = null;
            byte1 = 2;
        }
        break MISSING_BLOCK_LABEL_39;
_L13:
        do
        {
            return;
        } while (a == null || t || getWindowToken() == null);
        i1 = u;
        l2 = Math.max(0, b - i1);
        j2 = a.b();
        k2 = Math.min(j2 - 1, i1 + b);
        if (j2 != f)
        {
            try
            {
                obj = getResources().getResourceName(getId());
            }
            // Misplaced declaration of an exception variable
            catch (android.content.res.Resources.NotFoundException notfoundexception)
            {
                notfoundexception = Integer.toHexString(getId());
            }
            throw new IllegalStateException((new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ")).append(f).append(", found: ").append(j2).append(" Pager id: ").append(((String) (obj))).append(" Pager class: ").append(getClass()).append(" Problematic adapter: ").append(a.getClass()).toString());
        }
        i1 = 0;
_L10:
        if (i1 >= i.size())
        {
            break MISSING_BLOCK_LABEL_1249;
        }
        notfoundexception = (lr)i.get(i1);
        if (((lr) (notfoundexception)).b < b) goto _L2; else goto _L1
_L1:
        if (((lr) (notfoundexception)).b != b)
        {
            break MISSING_BLOCK_LABEL_1249;
        }
_L18:
        if (notfoundexception == null && j2 > 0)
        {
            obj2 = a(b, i1);
        } else
        {
            obj2 = notfoundexception;
        }
        if (obj2 == null) goto _L4; else goto _L3
_L3:
        i2 = i1 - 1;
        if (i2 >= 0)
        {
            notfoundexception = (lr)i.get(i2);
        } else
        {
            notfoundexception = null;
        }
        i3 = g();
        if (i3 <= 0)
        {
            f2 = 0.0F;
        } else
        {
            f2 = (2.0F - ((lr) (obj2)).d) + (float)getPaddingLeft() / (float)i3;
        }
        j1 = b;
        f3 = 0.0F;
        l1 = j1 - 1;
        k1 = i1;
        obj3 = notfoundexception;
        if (l1 < 0) goto _L6; else goto _L5
_L5:
        if (f3 < f2 || l1 >= l2) goto _L8; else goto _L7
_L7:
        if (obj3 == null) goto _L6; else goto _L9
_L9:
        notfoundexception = ((android.content.res.Resources.NotFoundException) (obj3));
        i1 = i2;
        f1 = f3;
        j1 = k1;
        if (l1 == ((lr) (obj3)).b)
        {
            notfoundexception = ((android.content.res.Resources.NotFoundException) (obj3));
            i1 = i2;
            f1 = f3;
            j1 = k1;
            if (!((lr) (obj3)).c)
            {
                i.remove(i2);
                a.a(this, l1, ((lr) (obj3)).a);
                i1 = i2 - 1;
                j1 = k1 - 1;
                if (i1 >= 0)
                {
                    notfoundexception = (lr)i.get(i1);
                    f1 = f3;
                } else
                {
                    notfoundexception = null;
                    f1 = f3;
                }
            }
        }
_L11:
        l1--;
        obj3 = notfoundexception;
        i2 = i1;
        f3 = f1;
        k1 = j1;
        break MISSING_BLOCK_LABEL_359;
_L2:
        i1++;
          goto _L10
_L8:
        if (obj3 != null && l1 == ((lr) (obj3)).b)
        {
            f1 = f3 + ((lr) (obj3)).d;
            i1 = i2 - 1;
            if (i1 >= 0)
            {
                notfoundexception = (lr)i.get(i1);
                j1 = k1;
            } else
            {
                notfoundexception = null;
                j1 = k1;
            }
        } else
        {
            f1 = f3 + a(l1, i2 + 1).d;
            j1 = k1 + 1;
            if (i2 >= 0)
            {
                notfoundexception = (lr)i.get(i2);
                i1 = i2;
            } else
            {
                notfoundexception = null;
                i1 = i2;
            }
        }
          goto _L11
_L6:
label0:
        {
            f1 = ((lr) (obj2)).d;
            i1 = k1 + 1;
            if (f1 >= 2.0F)
            {
                break label0;
            }
            if (i1 < i.size())
            {
                notfoundexception = (lr)i.get(i1);
            } else
            {
                notfoundexception = null;
            }
            if (i3 <= 0)
            {
                f2 = 0.0F;
            } else
            {
                f2 = (float)getPaddingRight() / (float)i3 + 2.0F;
            }
            j1 = b;
            j1++;
            do
            {
                if (j1 >= j2)
                {
                    break label0;
                }
                if (f1 >= f2 && j1 > k2)
                {
                    if (notfoundexception == null)
                    {
                        break label0;
                    }
                    if (j1 == ((lr) (notfoundexception)).b && !((lr) (notfoundexception)).c)
                    {
                        i.remove(i1);
                        a.a(this, j1, ((lr) (notfoundexception)).a);
                        if (i1 < i.size())
                        {
                            notfoundexception = (lr)i.get(i1);
                        } else
                        {
                            notfoundexception = null;
                        }
                    }
                } else
                if (notfoundexception != null && j1 == ((lr) (notfoundexception)).b)
                {
                    f3 = ((lr) (notfoundexception)).d;
                    i1++;
                    if (i1 < i.size())
                    {
                        notfoundexception = (lr)i.get(i1);
                    } else
                    {
                        notfoundexception = null;
                    }
                    f1 += f3;
                } else
                {
                    notfoundexception = a(j1, i1);
                    i1++;
                    f3 = ((lr) (notfoundexception)).d;
                    if (i1 < i.size())
                    {
                        notfoundexception = (lr)i.get(i1);
                    } else
                    {
                        notfoundexception = null;
                    }
                    f1 += f3;
                }
                j1++;
            } while (true);
        }
        a(((lr) (obj2)), k1, ((lr) (obj1)));
_L4:
        obj1 = a;
        i1 = b;
        if (obj2 != null)
        {
            notfoundexception = ((android.content.res.Resources.NotFoundException) (((lr) (obj2)).a));
        } else
        {
            notfoundexception = null;
        }
        ((jz) (obj1)).b(this, i1, notfoundexception);
        a.a(this);
        j1 = getChildCount();
        for (i1 = 0; i1 < j1; i1++)
        {
            obj1 = getChildAt(i1);
            notfoundexception = (LayoutParams)((View) (obj1)).getLayoutParams();
            notfoundexception.f = i1;
            if (((LayoutParams) (notfoundexception)).a || ((LayoutParams) (notfoundexception)).c != 0.0F)
            {
                continue;
            }
            obj1 = a(((View) (obj1)));
            if (obj1 != null)
            {
                notfoundexception.c = ((lr) (obj1)).d;
                notfoundexception.e = ((lr) (obj1)).b;
            }
        }

        if (!hasFocus()) goto _L13; else goto _L12
_L12:
        notfoundexception = findFocus();
        if (notfoundexception != null)
        {
            notfoundexception = b(notfoundexception);
        } else
        {
            notfoundexception = null;
        }
        if (notfoundexception != null && ((lr) (notfoundexception)).b == b) goto _L13; else goto _L14
_L14:
        i1 = 0;
_L17:
        if (i1 >= getChildCount()) goto _L13; else goto _L15
_L15:
        notfoundexception = getChildAt(i1);
        obj1 = a(notfoundexception);
        if (obj1 != null && ((lr) (obj1)).b == b && notfoundexception.requestFocus(byte1)) goto _L13; else goto _L16
_L16:
        i1++;
          goto _L17
        notfoundexception = null;
          goto _L18
    }

    private lr e(int i1)
    {
        for (int j1 = 0; j1 < i.size(); j1++)
        {
            lr lr1 = (lr)i.get(j1);
            if (lr1.b == i1)
            {
                return lr1;
            }
        }

        return null;
    }

    static int[] e()
    {
        return e;
    }

    private void f()
    {
        setWillNotDraw(false);
        setDescendantFocusability(0x40000);
        setFocusable(true);
        Context context = getContext();
        m = new Scroller(context, h);
        ViewConfiguration viewconfiguration = ViewConfiguration.get(context);
        float f1 = context.getResources().getDisplayMetrics().density;
        z = ld.a(viewconfiguration);
        G = (int)(400F * f1);
        H = viewconfiguration.getScaledMaximumFlingVelocity();
        K = new pf(context);
        L = new pf(context);
        I = (int)(25F * f1);
        J = (int)(2.0F * f1);
        x = (int)(16F * f1);
        km.a(this, new ls(this));
        if (km.e(this) == 0)
        {
            km.c(this, 1);
        }
    }

    private boolean f(int i1)
    {
        boolean flag = false;
        if (i.size() == 0)
        {
            N = false;
            a(0, 0.0F, 0);
            if (!N)
            {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
        } else
        {
            lr lr1 = j();
            int k1 = g();
            float f1 = 0.0F / (float)k1;
            int j1 = lr1.b;
            f1 = ((float)i1 / (float)k1 - lr1.e) / (lr1.d + f1);
            i1 = (int)((float)k1 * f1);
            N = false;
            a(j1, f1, i1);
            if (!N)
            {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
            flag = true;
        }
        return flag;
    }

    private int g()
    {
        return getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
    }

    private void g(int i1)
    {
        if (c != null)
        {
            int k1 = c.size();
            for (int j1 = 0; j1 < k1; j1++)
            {
                lu lu1 = (lu)c.get(j1);
                if (lu1 != null)
                {
                    lu1.a(i1);
                }
            }

        }
        if (P != null)
        {
            P.a(i1);
        }
    }

    private boolean h()
    {
        E = -1;
        v = false;
        w = false;
        if (F != null)
        {
            F.recycle();
            F = null;
        }
        return K.c() | L.c();
    }

    private boolean h(int i1)
    {
        View view;
        boolean flag;
        flag = false;
        view = findFocus();
        if (view != this) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L13:
        view = FocusFinder.getInstance().findNextFocus(this, ((View) (obj)), i1);
        if (view == null || view == obj) goto _L4; else goto _L3
_L3:
        if (i1 != 17) goto _L6; else goto _L5
_L5:
        int j1;
        j1 = a(k, view).left;
        int k1 = a(k, ((View) (obj))).left;
        StringBuilder stringbuilder;
        if (obj != null && j1 >= k1)
        {
            flag = k();
        } else
        {
            flag = view.requestFocus();
        }
_L15:
        if (flag)
        {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i1));
        }
        return flag;
_L2:
        if (view == null) goto _L8; else goto _L7
_L7:
        obj = view.getParent();
_L12:
        if (!(obj instanceof ViewGroup))
        {
            break MISSING_BLOCK_LABEL_380;
        }
        if (obj != this) goto _L10; else goto _L9
_L9:
        j1 = 1;
_L20:
        if (j1 != 0) goto _L8; else goto _L11
_L10:
        obj = ((ViewParent) (obj)).getParent();
          goto _L12
_L11:
        stringbuilder = new StringBuilder();
        stringbuilder.append(view.getClass().getSimpleName());
        for (obj = view.getParent(); obj instanceof ViewGroup; obj = ((ViewParent) (obj)).getParent())
        {
            stringbuilder.append(" => ").append(obj.getClass().getSimpleName());
        }

        Log.e("ViewPager", (new StringBuilder("arrowScroll tried to find focus based on non-child current focused view ")).append(stringbuilder.toString()).toString());
        obj = null;
          goto _L13
_L6:
        if (i1 != 66) goto _L15; else goto _L14
_L14:
        int l1;
        j1 = a(k, view).left;
        l1 = a(k, ((View) (obj))).left;
        if (obj != null && j1 <= l1) goto _L17; else goto _L16
_L16:
        flag = view.requestFocus();
          goto _L15
_L4:
        if (i1 != 17 && i1 != 1) goto _L19; else goto _L18
_L18:
        flag = k();
          goto _L15
_L19:
        if (i1 != 66 && i1 != 2) goto _L15; else goto _L17
_L17:
        if (a != null && b < a.b() - 1)
        {
            b(b + 1);
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L15
_L8:
        obj = view;
          goto _L13
        j1 = 0;
          goto _L20
    }

    private void i()
    {
        ViewParent viewparent = getParent();
        if (viewparent != null)
        {
            viewparent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private lr j()
    {
        int i1 = g();
        float f1;
        float f2;
        float f3;
        float f4;
        lr lr2;
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
            f2 = 0.0F / (float)i1;
        } else
        {
            f2 = 0.0F;
        }
        f4 = 0.0F;
        f3 = 0.0F;
        j1 = -1;
        i1 = 0;
        flag = true;
        lr2 = null;
        do
        {
            lr lr1;
label0:
            {
                lr lr3;
label1:
                {
                    lr3 = lr2;
                    if (i1 >= i.size())
                    {
                        break label1;
                    }
                    lr1 = (lr)i.get(i1);
                    if (!flag && lr1.b != j1 + 1)
                    {
                        lr1 = j;
                        lr1.e = f4 + f3 + f2;
                        lr1.b = j1 + 1;
                        lr1.d = a.c(lr1.b);
                        i1--;
                    }
                    f3 = lr1.e;
                    f4 = lr1.d;
                    if (!flag)
                    {
                        lr3 = lr2;
                        if (f1 < f3)
                        {
                            break label1;
                        }
                    }
                    if (f1 >= f4 + f3 + f2 && i1 != i.size() - 1)
                    {
                        break label0;
                    }
                    lr3 = lr1;
                }
                return lr3;
            }
            j1 = lr1.b;
            f4 = lr1.d;
            flag = false;
            i1++;
            lr2 = lr1;
        } while (true);
    }

    private boolean k()
    {
        if (b > 0)
        {
            b(b - 1);
            return true;
        } else
        {
            return false;
        }
    }

    public final jz a()
    {
        return a;
    }

    public final void a(int i1)
    {
        t = false;
        boolean flag;
        if (!M)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(i1, flag, false);
    }

    public final void a(jz jz1)
    {
        if (a != null)
        {
            a.b(n);
            for (int i1 = 0; i1 < i.size(); i1++)
            {
                lr lr1 = (lr)i.get(i1);
                a.a(this, lr1.b, lr1.a);
            }

            a.a(this);
            i.clear();
            int k1;
            for (int j1 = 0; j1 < getChildCount(); j1 = k1 + 1)
            {
                k1 = j1;
                if (!((LayoutParams)getChildAt(j1).getLayoutParams()).a)
                {
                    removeViewAt(j1);
                    k1 = j1 - 1;
                }
            }

            b = 0;
            scrollTo(0, 0);
        }
        jz jz2 = a;
        a = jz1;
        f = 0;
        if (a != null)
        {
            if (n == null)
            {
                n = new lv(this, (byte)0);
            }
            a.a(n);
            t = false;
            boolean flag = M;
            M = true;
            f = a.b();
            if (l >= 0)
            {
                a(l, false, true);
                l = -1;
            } else
            if (!flag)
            {
                d();
            } else
            {
                requestLayout();
            }
        }
        if (d != null && jz2 != jz1)
        {
            d.a(jz2, jz1);
        }
    }

    public final void a(lu lu1)
    {
        if (c == null)
        {
            c = new ArrayList();
        }
        c.add(lu1);
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
                    lr lr1 = a(view);
                    if (lr1 != null && lr1.b == b)
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
            lr lr1 = a(view);
            if (lr1 != null && lr1.b == b)
            {
                view.addTouchables(arraylist);
            }
        }

    }

    public void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (!checkLayoutParams(layoutparams))
        {
            layoutparams = generateLayoutParams(layoutparams);
        }
        LayoutParams layoutparams1 = (LayoutParams)layoutparams;
        layoutparams1.a = layoutparams1.a | (view instanceof lq);
        if (r)
        {
            if (layoutparams1 != null && layoutparams1.a)
            {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            } else
            {
                layoutparams1.d = true;
                addViewInLayout(view, i1, layoutparams);
                return;
            }
        } else
        {
            super.addView(view, i1, layoutparams);
            return;
        }
    }

    public final int b()
    {
        return b;
    }

    final lu b(lu lu1)
    {
        lu lu2 = P;
        P = lu1;
        return lu2;
    }

    public final void b(int i1)
    {
        t = false;
        a(i1, true, false);
    }

    public final void c()
    {
        Object obj;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int l2 = a.b();
        f = l2;
        int j2;
        if (i.size() < (u << 1) + 1 && i.size() < l2)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        j1 = b;
        k1 = 0;
        i2 = 0;
        l1 = i1;
        i1 = j1;
        j1 = k1;
        k1 = i2;
        if (k1 >= i.size())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (lr)i.get(k1);
        i2 = a.a(((lr) (obj)).a);
        if (i2 == -1)
        {
            break MISSING_BLOCK_LABEL_361;
        }
        if (i2 == -2)
        {
            i.remove(k1);
            l1 = k1 - 1;
            k1 = j1;
            if (j1 == 0)
            {
                k1 = 1;
            }
            a.a(this, ((lr) (obj)).b, ((lr) (obj)).a);
            int k2;
            if (b == ((lr) (obj)).b)
            {
                j1 = Math.max(0, Math.min(b, l2 - 1));
                i1 = k1;
                k1 = 1;
            } else
            {
                j1 = i1;
                boolean flag = true;
                i1 = k1;
                k1 = ((flag) ? 1 : 0);
            }
        } else
        {
            if (((lr) (obj)).b == i2)
            {
                break MISSING_BLOCK_LABEL_361;
            }
            if (((lr) (obj)).b == b)
            {
                i1 = i2;
            }
            obj.b = i2;
            i2 = i1;
            k2 = 1;
            l1 = k1;
            i1 = j1;
            j1 = i2;
            k1 = k2;
        }
        i2 = k1;
        j2 = j1;
        k1 = l1 + 1;
        j1 = i1;
        i1 = j2;
        l1 = i2;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_70;
_L1:
        if (j1 != 0)
        {
            a.a(this);
        }
        Collections.sort(i, g);
        if (l1 != 0)
        {
            k1 = getChildCount();
            for (j1 = 0; j1 < k1; j1++)
            {
                obj = (LayoutParams)getChildAt(j1).getLayoutParams();
                if (!((LayoutParams) (obj)).a)
                {
                    obj.c = 0.0F;
                }
            }

            a(i1, false, true);
            requestLayout();
        }
        return;
        i2 = i1;
        k2 = l1;
        l1 = k1;
        i1 = j1;
        j1 = i2;
        k1 = k2;
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_196;
        }
    }

    public boolean canScrollHorizontally(int i1)
    {
        if (a != null) goto _L2; else goto _L1
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
        if (k1 <= (int)((float)j1 * o)) goto _L1; else goto _L3
_L3:
        return true;
        if (i1 <= 0 || k1 >= (int)((float)j1 * p)) goto _L1; else goto _L4
_L4:
        return true;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
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
                if (!f(k1))
                {
                    m.abortAnimation();
                    scrollTo(0, l1);
                }
            }
            km.d(this);
            return;
        } else
        {
            a(true);
            return;
        }
    }

    final void d()
    {
        d(b);
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
        flag = h(17);
          goto _L9
_L6:
        flag = h(66);
          goto _L9
_L7:
        if (android.os.Build.VERSION.SDK_INT < 11) goto _L4; else goto _L10
_L10:
        if (!ip.b(keyevent))
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = h(2);
          goto _L9
        if (!ip.a(keyevent)) goto _L4; else goto _L11
_L11:
        flag = h(1);
          goto _L9
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        boolean flag1 = false;
        if (accessibilityevent.getEventType() != 4096) goto _L2; else goto _L1
_L1:
        boolean flag = super.dispatchPopulateAccessibilityEvent(accessibilityevent);
_L4:
        return flag;
_L2:
        int j1 = getChildCount();
        int i1 = 0;
        do
        {
            flag = flag1;
            if (i1 >= j1)
            {
                continue;
            }
            View view = getChildAt(i1);
            if (view.getVisibility() == 0)
            {
                lr lr1 = a(view);
                if (lr1 != null && lr1.b == b && view.dispatchPopulateAccessibilityEvent(accessibilityevent))
                {
                    return true;
                }
            }
            i1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        int j1 = 0;
        int i1 = 0;
        int k1 = km.a(this);
        if (k1 == 0 || k1 == 1 && a != null && a.b() > 1)
        {
            if (!K.a())
            {
                j1 = canvas.save();
                i1 = getHeight() - getPaddingTop() - getPaddingBottom();
                int l1 = getWidth();
                canvas.rotate(270F);
                canvas.translate(-i1 + getPaddingTop(), o * (float)l1);
                K.a(i1, l1);
                i1 = K.a(canvas) | false;
                canvas.restoreToCount(j1);
            }
            j1 = i1;
            if (!L.a())
            {
                int i2 = canvas.save();
                j1 = getWidth();
                int j2 = getHeight();
                int k2 = getPaddingTop();
                int l2 = getPaddingBottom();
                canvas.rotate(90F);
                canvas.translate(-getPaddingTop(), -(p + 1.0F) * (float)j1);
                L.a(j2 - k2 - l2, j1);
                j1 = i1 | L.a(canvas);
                canvas.restoreToCount(i2);
            }
        } else
        {
            K.b();
            L.b();
        }
        if (j1 != 0)
        {
            km.d(this);
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
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
        return generateDefaultLayoutParams();
    }

    protected int getChildDrawingOrder(int i1, int j1)
    {
        throw new NullPointerException();
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        M = true;
    }

    protected void onDetachedFromWindow()
    {
        removeCallbacks(Q);
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1 = motionevent.getAction() & 0xff;
        if (i1 != 3 && i1 != 1) goto _L2; else goto _L1
_L1:
        h();
_L4:
        return false;
_L2:
        if (i1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (v)
        {
            return true;
        }
        if (w) goto _L4; else goto _L3
_L3:
        i1;
        JVM INSTR lookupswitch 3: default 88
    //                   0: 399
    //                   2: 115
    //                   6: 530;
           goto _L5 _L6 _L7 _L8
_L5:
        if (F == null)
        {
            F = VelocityTracker.obtain();
        }
        F.addMovement(motionevent);
        return v;
_L7:
        float f1;
        float f3;
        float f4;
        float f5;
        float f6;
        int j1 = E;
        if (j1 == -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        j1 = jo.a(motionevent, j1);
        f3 = jo.c(motionevent, j1);
        f1 = f3 - A;
        f5 = Math.abs(f1);
        f4 = jo.d(motionevent, j1);
        f6 = Math.abs(f4 - D);
        if (f1 != 0.0F)
        {
            float f7 = A;
            boolean flag;
            if (f7 < (float)y && f1 > 0.0F || f7 > (float)(getWidth() - y) && f1 < 0.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag && a(this, false, (int)f1, (int)f3, (int)f4))
            {
                A = f3;
                B = f4;
                w = true;
                return false;
            }
        }
        if (f5 <= (float)z || 0.5F * f5 <= f6) goto _L10; else goto _L9
_L9:
        v = true;
        i();
        c(1);
        if (f1 > 0.0F)
        {
            f1 = C + (float)z;
        } else
        {
            f1 = C - (float)z;
        }
        A = f1;
        B = f4;
        b(true);
_L11:
        if (v && a(f3))
        {
            km.d(this);
        }
        continue; /* Loop/switch isn't completed */
_L10:
        if (f6 > (float)z)
        {
            w = true;
        }
        if (true) goto _L11; else goto _L6
_L6:
        float f2 = motionevent.getX();
        C = f2;
        A = f2;
        f2 = motionevent.getY();
        D = f2;
        B = f2;
        E = jo.b(motionevent, 0);
        w = false;
        m.computeScrollOffset();
        if (R == 2 && Math.abs(m.getFinalX() - m.getCurrX()) > J)
        {
            m.abortAnimation();
            t = false;
            d();
            v = true;
            i();
            c(1);
        } else
        {
            a(false);
            v = false;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        a(motionevent);
        if (true) goto _L5; else goto _L12
_L12:
    }

    public void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int i2;
        int j2;
        int j3;
        int l4;
        int i5;
        int j5;
        int k5;
        l4 = getChildCount();
        j5 = k1 - i1;
        i5 = l1 - j1;
        j1 = getPaddingLeft();
        i1 = getPaddingTop();
        i2 = getPaddingRight();
        k1 = getPaddingBottom();
        k5 = getScrollX();
        j2 = 0;
        j3 = 0;
_L14:
        if (j3 >= l4) goto _L2; else goto _L1
_L1:
        View view = getChildAt(j3);
        if (view.getVisibility() == 8) goto _L4; else goto _L3
_L3:
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (!layoutparams.a) goto _L4; else goto _L5
_L5:
        int l5;
        l1 = layoutparams.b;
        l5 = layoutparams.b;
        l1 & 7;
        JVM INSTR tableswitch 1 5: default 148
    //                   1 304
    //                   2 148
    //                   3 285
    //                   4 148
    //                   5 326;
           goto _L6 _L7 _L6 _L8 _L6 _L9
_L6:
        int k2;
        l1 = j1;
        k2 = j1;
_L15:
        l5 & 0x70;
        JVM INSTR lookupswitch 3: default 192
    //                   16: 394
    //                   48: 367
    //                   80: 422;
           goto _L10 _L11 _L12 _L13
_L10:
        int k3 = i1;
        j1 = i1;
        i1 = k1;
        k1 = k3;
_L16:
        l1 += k5;
        view.layout(l1, k1, view.getMeasuredWidth() + l1, view.getMeasuredHeight() + k1);
        j2++;
        l1 = i2;
        k1 = k2;
        i2 = i1;
        i1 = j2;
_L17:
        j3++;
        k2 = k1;
        j2 = i1;
        i1 = j1;
        k1 = i2;
        i2 = l1;
        j1 = k2;
          goto _L14
_L8:
        k2 = view.getMeasuredWidth();
        l1 = j1;
        k2 += j1;
          goto _L15
_L7:
        l1 = Math.max((j5 - view.getMeasuredWidth()) / 2, j1);
        k2 = j1;
          goto _L15
_L9:
        k2 = view.getMeasuredWidth();
        l1 = i2 + view.getMeasuredWidth();
        int l3 = j5 - i2 - k2;
        i2 = l1;
        k2 = j1;
        l1 = l3;
          goto _L15
_L12:
        int i4 = view.getMeasuredHeight();
        j1 = k1;
        i4 += i1;
        k1 = i1;
        i1 = j1;
        j1 = i4;
          goto _L16
_L11:
        int j4 = Math.max((i5 - view.getMeasuredHeight()) / 2, i1);
        j1 = i1;
        i1 = k1;
        k1 = j4;
          goto _L16
_L13:
        int k4 = i5 - k1 - view.getMeasuredHeight();
        int i6 = view.getMeasuredHeight();
        j1 = i1;
        i1 = k1 + i6;
        k1 = k4;
          goto _L16
_L2:
        i2 = j5 - j1 - i2;
        for (l1 = 0; l1 < l4; l1++)
        {
            View view1 = getChildAt(l1);
            if (view1.getVisibility() == 8)
            {
                continue;
            }
            LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
            if (layoutparams1.a)
            {
                continue;
            }
            lr lr1 = a(view1);
            if (lr1 == null)
            {
                continue;
            }
            float f1 = i2;
            int l2 = (int)(lr1.e * f1) + j1;
            if (layoutparams1.d)
            {
                layoutparams1.d = false;
                float f2 = i2;
                view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)(layoutparams1.c * f2), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(i5 - i1 - k1, 0x40000000));
            }
            view1.layout(l2, i1, view1.getMeasuredWidth() + l2, view1.getMeasuredHeight() + i1);
        }

        O = j2;
        if (M)
        {
            a(b, false, 0, false);
        }
        M = false;
        return;
_L4:
        l1 = j2;
        j2 = i1;
        int i3 = j1;
        i1 = l1;
        l1 = i2;
        i2 = k1;
        j1 = j2;
        k1 = i3;
          goto _L17
    }

    protected void onMeasure(int i1, int j1)
    {
label0:
        {
            setMeasuredDimension(getDefaultSize(0, i1), getDefaultSize(0, j1));
            i1 = getMeasuredWidth();
            y = Math.min(i1 / 10, x);
            i1 = i1 - getPaddingLeft() - getPaddingRight();
            j1 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
            int j3 = getChildCount();
            int i2 = 0;
            while (i2 < j3) 
            {
label1:
                {
                    {
                        View view = getChildAt(i2);
                        int k1 = i1;
                        int l1 = j1;
                        if (view.getVisibility() == 8)
                        {
                            break label1;
                        }
                        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                        k1 = i1;
                        l1 = j1;
                        if (layoutparams == null)
                        {
                            break label1;
                        }
                        k1 = i1;
                        l1 = j1;
                        if (!layoutparams.a)
                        {
                            break label1;
                        }
                        k1 = layoutparams.b & 7;
                        int j2 = layoutparams.b & 0x70;
                        int k2 = 0x80000000;
                        l1 = 0x80000000;
                        boolean flag;
                        boolean flag1;
                        if (j2 == 48 || j2 == 80)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if (k1 == 3 || k1 == 5)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        if (flag)
                        {
                            k1 = 0x40000000;
                        } else
                        {
                            k1 = k2;
                            if (flag1)
                            {
                                l1 = 0x40000000;
                                k1 = k2;
                            }
                        }
                        if (layoutparams.width != -2)
                        {
                            k2 = 0x40000000;
                            float f1;
                            int l2;
                            int i3;
                            if (layoutparams.width != -1)
                            {
                                k1 = layoutparams.width;
                            } else
                            {
                                k1 = i1;
                            }
                        } else
                        {
                            k2 = k1;
                            k1 = i1;
                        }
                        if (layoutparams.height == -2)
                        {
                            break label0;
                        }
                        l2 = 0x40000000;
                        l1 = l2;
                        if (layoutparams.height == -1)
                        {
                            break label0;
                        }
                        i3 = layoutparams.height;
                        l1 = l2;
                        l2 = i3;
                    }
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(k1, k2), android.view.View.MeasureSpec.makeMeasureSpec(l2, l1));
                    if (flag)
                    {
                        l1 = j1 - view.getMeasuredHeight();
                        k1 = i1;
                    } else
                    {
                        k1 = i1;
                        l1 = j1;
                        if (flag1)
                        {
                            k1 = i1 - view.getMeasuredWidth();
                            l1 = j1;
                        }
                    }
                }
                i2++;
                i1 = k1;
                j1 = l1;
            }
            android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
            q = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000);
            r = true;
            d();
            r = false;
            k1 = getChildCount();
            for (j1 = 0; j1 < k1; j1++)
            {
                view = getChildAt(j1);
                if (view.getVisibility() == 8)
                {
                    continue;
                }
                layoutparams = (LayoutParams)view.getLayoutParams();
                if (layoutparams == null || !layoutparams.a)
                {
                    f1 = i1;
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)(layoutparams.c * f1), 0x40000000), q);
                }
            }

            return;
        }
        l2 = j1;
        break MISSING_BLOCK_LABEL_282;
    }

    protected boolean onRequestFocusInDescendants(int i1, Rect rect)
    {
        byte byte0 = -1;
        int k1 = getChildCount();
        int j1;
        if ((i1 & 2) != 0)
        {
            byte0 = 1;
            j1 = 0;
        } else
        {
            j1 = k1 - 1;
            k1 = -1;
        }
        for (; j1 != k1; j1 += byte0)
        {
            View view = getChildAt(j1);
            if (view.getVisibility() != 0)
            {
                continue;
            }
            lr lr1 = a(view);
            if (lr1 != null && lr1.b == b && view.requestFocus(i1, rect))
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
        if (a != null)
        {
            Object obj = ((SavedState) (parcelable)).b;
            obj = ((SavedState) (parcelable)).c;
            a(((SavedState) (parcelable)).a, false, true);
            return;
        } else
        {
            l = ((SavedState) (parcelable)).a;
            Parcelable parcelable1 = ((SavedState) (parcelable)).b;
            parcelable = ((SavedState) (parcelable)).c;
            return;
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = b;
        if (a != null)
        {
            savedstate.b = a.a();
        }
        return savedstate;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (i1 != k1)
        {
            if (k1 > 0 && !i.isEmpty())
            {
                j1 = getPaddingLeft();
                l1 = getPaddingRight();
                int i2 = getPaddingLeft();
                int j2 = getPaddingRight();
                float f1 = (float)getScrollX() / (float)(k1 - i2 - j2);
                j1 = (int)((float)(i1 - j1 - l1) * f1);
                scrollTo(j1, getScrollY());
                if (!m.isFinished())
                {
                    k1 = m.getDuration();
                    l1 = m.timePassed();
                    lr lr1 = e(b);
                    m.startScroll(j1, 0, (int)(lr1.e * (float)i1), 0, k1 - l1);
                }
            } else
            {
                lr lr2 = e(b);
                float f2;
                if (lr2 != null)
                {
                    f2 = Math.min(lr2.e, p);
                } else
                {
                    f2 = 0.0F;
                }
                i1 = (int)(f2 * (float)(i1 - getPaddingLeft() - getPaddingRight()));
                if (i1 != getScrollX())
                {
                    a(false);
                    scrollTo(i1, getScrollY());
                    return;
                }
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        if (motionevent.getAction() == 0 && motionevent.getEdgeFlags() != 0)
        {
            return false;
        }
        if (a == null || a.b() == 0)
        {
            return false;
        }
        if (F == null)
        {
            F = VelocityTracker.obtain();
        }
        F.addMovement(motionevent);
        flag = flag1;
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 6: default 116
    //                   0 131
    //                   1 398
    //                   2 193
    //                   3 662
    //                   4 120
    //                   5 693
    //                   6 726;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L6:
        break; /* Loop/switch isn't completed */
_L1:
        flag = flag1;
_L10:
        if (flag)
        {
            km.d(this);
        }
        return true;
_L2:
        m.abortAnimation();
        t = false;
        d();
        float f1 = motionevent.getX();
        C = f1;
        A = f1;
        f1 = motionevent.getY();
        D = f1;
        B = f1;
        E = jo.b(motionevent, 0);
        flag = flag1;
        continue; /* Loop/switch isn't completed */
_L4:
        if (!v)
        {
            int i1 = jo.a(motionevent, E);
            if (i1 == -1)
            {
                flag = h();
                continue; /* Loop/switch isn't completed */
            }
            float f2 = jo.c(motionevent, i1);
            float f6 = Math.abs(f2 - A);
            float f4 = jo.d(motionevent, i1);
            float f7 = Math.abs(f4 - B);
            if (f6 > (float)z && f6 > f7)
            {
                v = true;
                i();
                ViewParent viewparent;
                if (f2 - C > 0.0F)
                {
                    f2 = C + (float)z;
                } else
                {
                    f2 = C - (float)z;
                }
                A = f2;
                B = f4;
                c(1);
                b(true);
                viewparent = getParent();
                if (viewparent != null)
                {
                    viewparent.requestDisallowInterceptTouchEvent(true);
                }
            }
        }
        flag = flag1;
        if (v)
        {
            flag = a(jo.c(motionevent, jo.a(motionevent, E))) | false;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        flag = flag1;
        if (v)
        {
            Object obj = F;
            ((VelocityTracker) (obj)).computeCurrentVelocity(1000, H);
            int i2 = (int)ki.a(((VelocityTracker) (obj)), E);
            t = true;
            int l1 = g();
            int j2 = getScrollX();
            obj = j();
            int j1 = ((lr) (obj)).b;
            float f5 = ((float)j2 / (float)l1 - ((lr) (obj)).e) / ((lr) (obj)).d;
            if (Math.abs((int)(jo.c(motionevent, jo.a(motionevent, E)) - C)) > I && Math.abs(i2) > G)
            {
                if (i2 <= 0)
                {
                    j1++;
                }
            } else
            {
                float f3;
                if (j1 >= b)
                {
                    f3 = 0.4F;
                } else
                {
                    f3 = 0.6F;
                }
                j1 = (int)((float)j1 + f5 + f3);
            }
            l1 = j1;
            if (i.size() > 0)
            {
                motionevent = (lr)i.get(0);
                lr lr1 = (lr)i.get(i.size() - 1);
                l1 = Math.max(((lr) (motionevent)).b, Math.min(j1, lr1.b));
            }
            a(l1, true, true, i2);
            flag = h();
        }
        continue; /* Loop/switch isn't completed */
_L5:
        flag = flag1;
        if (v)
        {
            a(b, true, 0, false);
            flag = h();
        }
        continue; /* Loop/switch isn't completed */
_L7:
        int k1 = jo.b(motionevent);
        A = jo.c(motionevent, k1);
        E = jo.b(motionevent, k1);
        flag = flag1;
        continue; /* Loop/switch isn't completed */
_L8:
        a(motionevent);
        A = jo.c(motionevent, jo.a(motionevent, E));
        flag = flag1;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void removeView(View view)
    {
        if (r)
        {
            removeViewInLayout(view);
            return;
        } else
        {
            super.removeView(view);
            return;
        }
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return super.verifyDrawable(drawable) || drawable == null;
    }

    static 
    {
        new lw();
    }

    private class LayoutParams extends android.view.ViewGroup.LayoutParams
    {

        public boolean a;
        public int b;
        float c;
        boolean d;
        public int e;
        int f;

        public LayoutParams()
        {
            super(-1, -1);
            c = 0.0F;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            c = 0.0F;
            context = context.obtainStyledAttributes(attributeset, ViewPager.e());
            b = context.getInteger(0, 48);
            context.recycle();
        }
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR;
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

        static 
        {
            Object obj = new gp() {

                public final Object a(Parcel parcel, ClassLoader classloader)
                {
                    return new SavedState(parcel, classloader);
                }

                public final volatile Object[] a(int i1)
                {
                    return new SavedState[i1];
                }

            };
            if (android.os.Build.VERSION.SDK_INT >= 13)
            {
                obj = new gq(((gp) (obj)));
            } else
            {
                obj = new go(((gp) (obj)));
            }
            CREATOR = ((android.os.Parcelable.Creator) (obj));
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

}
