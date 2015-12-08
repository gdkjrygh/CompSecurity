// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObservable;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
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
import ky;
import lt;
import md;
import mg;
import mk;
import mx;
import ni;
import nj;
import nk;
import nl;
import nm;
import nn;
import no;
import np;
import nq;
import nr;
import ns;
import nv;
import qw;

public class ViewPager extends ViewGroup
{

    private static final nv ad = new nv();
    private static final int u[] = {
        0x10100b3
    };
    private static final Comparator w = new ni();
    private static final Interpolator x = new nj();
    private int A;
    private Parcelable B;
    private ClassLoader C;
    private Scroller D;
    private nr E;
    private int F;
    private int G;
    private int H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private int M;
    private int N;
    private int O;
    private float P;
    private float Q;
    private int R;
    private int S;
    private int T;
    private qw U;
    private qw V;
    private boolean W;
    public final ArrayList a;
    private boolean aa;
    private int ab;
    private ArrayList ac;
    private final Runnable ae;
    private int af;
    public md b;
    public int c;
    public int d;
    public float e;
    public float f;
    public boolean g;
    public int h;
    public float i;
    public float j;
    public int k;
    public VelocityTracker l;
    public int m;
    public boolean n;
    public long o;
    public List p;
    public np q;
    public nq r;
    public Method s;
    public int t;
    private int v;
    private final nm y;
    private final Rect z;

    public ViewPager(Context context)
    {
        super(context);
        a = new ArrayList();
        y = new nm();
        z = new Rect();
        A = -1;
        B = null;
        C = null;
        e = -3.402823E+38F;
        f = 3.402823E+38F;
        h = 1;
        k = -1;
        W = true;
        ae = new nk(this);
        af = 0;
        i();
    }

    public ViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new ArrayList();
        y = new nm();
        z = new Rect();
        A = -1;
        B = null;
        C = null;
        e = -3.402823E+38F;
        f = 3.402823E+38F;
        h = 1;
        k = -1;
        W = true;
        ae = new nk(this);
        af = 0;
        i();
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

    public static md a(ViewPager viewpager)
    {
        return viewpager.b;
    }

    private nm a(int i1, int j1)
    {
        nm nm1 = new nm();
        nm1.b = i1;
        nm1.a = b.a(this, i1);
        nm1.d = 1.0F;
        if (j1 < 0 || j1 >= a.size())
        {
            a.add(nm1);
            return nm1;
        } else
        {
            a.add(j1, nm1);
            return nm1;
        }
    }

    private nm a(View view)
    {
        for (int i1 = 0; i1 < a.size(); i1++)
        {
            nm nm1 = (nm)a.get(i1);
            if (b.a(view, nm1.a))
            {
                return nm1;
            }
        }

        return null;
    }

    private void a(int i1, float f1, int j1)
    {
        if (ab <= 0) goto _L2; else goto _L1
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
        nn nn1;
        view = getChildAt(l2);
        nn1 = (nn)view.getLayoutParams();
        if (!nn1.a)
        {
            break MISSING_BLOCK_LABEL_461;
        }
        nn1.b & 7;
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
        if (q != null)
        {
            q.a(i1, f1, j1);
        }
        if (p != null)
        {
            l1 = p.size();
            for (k1 = 0; k1 < l1; k1++)
            {
                np np1 = (np)p.get(k1);
                if (np1 != null)
                {
                    np1.a(i1, f1, j1);
                }
            }

        }
        if (r != null)
        {
            j1 = getScrollX();
            k1 = getChildCount();
            for (i1 = 0; i1 < k1; i1++)
            {
                View view1 = getChildAt(i1);
                if (!((nn)view1.getLayoutParams()).a)
                {
                    f1 = (float)(view1.getLeft() - j1) / (float)a();
                    r.a(view1, f1);
                }
            }

        }
        aa = true;
        return;
        i2 = l1;
        k2 = k1;
          goto _L10
    }

    private void a(int i1, boolean flag, int j1, boolean flag1)
    {
        nm nm1 = e(i1);
        int k1 = 0;
        if (nm1 != null)
        {
            k1 = (int)((float)a() * Math.max(e, Math.min(nm1.e, f)));
        }
        if (flag)
        {
            if (getChildCount() == 0)
            {
                c(false);
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
                    c(true);
                    c(2);
                    int k2 = a();
                    int l2 = k2 / 2;
                    float f4 = Math.min(1.0F, (1.0F * (float)Math.abs(k1)) / (float)k2);
                    float f1 = l2;
                    float f3 = l2;
                    f4 = (float)Math.sin((float)((double)(f4 - 0.5F) * 0.4712389167638204D));
                    j1 = Math.abs(j1);
                    if (j1 > 0)
                    {
                        j1 = Math.round(1000F * Math.abs((f3 * f4 + f1) / (float)j1)) * 4;
                    } else
                    {
                        float f2 = k2;
                        j1 = (int)(((float)Math.abs(k1) / (f2 + (float)d) + 1.0F) * 100F);
                    }
                    j1 = Math.min(j1, 600);
                    D.startScroll(l1, i2, k1, j2, j1);
                    mk.d(this);
                }
            }
        } else
        {
            if (flag1)
            {
                f(i1);
            }
            a(false);
            scrollTo(k1, 0);
            b(k1);
            return;
        }
        if (flag1)
        {
            f(i1);
        }
    }

    private void a(int i1, boolean flag, boolean flag1)
    {
        a(i1, flag, flag1, 0);
    }

    public static void a(ViewPager viewpager, int i1)
    {
        viewpager.c(0);
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = lt.b(motionevent);
        if (lt.b(motionevent, i1) == k)
        {
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            i = lt.c(motionevent, i1);
            k = lt.b(motionevent, i1);
            if (l != null)
            {
                l.clear();
            }
        }
    }

    private void a(nm nm1, int i1, nm nm2)
    {
        int j2 = b.b();
        int j1 = a();
        float f4;
        if (j1 > 0)
        {
            f4 = (float)d / (float)j1;
        } else
        {
            f4 = 0.0F;
        }
        if (nm2 != null)
        {
            j1 = nm2.b;
            if (j1 < nm1.b)
            {
                float f1 = nm2.e;
                float f5 = nm2.d;
                int k1 = 0;
                f1 = f1 + f5 + f4;
                for (j1++; j1 <= nm1.b && k1 < a.size(); j1++)
                {
                    for (nm2 = (nm)a.get(k1); j1 > nm2.b && k1 < a.size() - 1; nm2 = (nm)a.get(k1))
                    {
                        k1++;
                    }

                    while (j1 < nm2.b) 
                    {
                        j1++;
                        f1 = f4 + 1.0F + f1;
                    }
                    nm2.e = f1;
                    f1 += nm2.d + f4;
                }

            } else
            if (j1 > nm1.b)
            {
                int l1 = a.size();
                float f2 = nm2.e;
                l1--;
                for (j1--; j1 >= nm1.b && l1 >= 0; j1--)
                {
                    for (nm2 = (nm)a.get(l1); j1 < nm2.b && l1 > 0; nm2 = (nm)a.get(l1))
                    {
                        l1--;
                    }

                    while (j1 > nm2.b) 
                    {
                        j1--;
                        f2 -= f4 + 1.0F;
                    }
                    f2 -= nm2.d + f4;
                    nm2.e = f2;
                }

            }
        }
        int k2 = a.size();
        float f6 = nm1.e;
        j1 = nm1.b - 1;
        float f3;
        int i2;
        if (nm1.b == 0)
        {
            f3 = nm1.e;
        } else
        {
            f3 = -3.402823E+38F;
        }
        e = f3;
        if (nm1.b == j2 - 1)
        {
            f3 = (nm1.e + nm1.d) - 1.0F;
        } else
        {
            f3 = 3.402823E+38F;
        }
        f = f3;
        i2 = i1 - 1;
        f3 = f6;
        for (; i2 >= 0; i2--)
        {
            for (nm2 = (nm)a.get(i2); j1 > nm2.b;)
            {
                j1--;
                f3 -= f4 + 1.0F;
            }

            f3 -= nm2.d + f4;
            nm2.e = f3;
            if (nm2.b == 0)
            {
                e = f3;
            }
            j1--;
        }

        f3 = nm1.e + nm1.d + f4;
        i2 = nm1.b + 1;
        j1 = i1 + 1;
        i1 = i2;
        for (; j1 < k2; j1++)
        {
            for (nm1 = (nm)a.get(j1); i1 < nm1.b;)
            {
                i1++;
                f3 += f4 + 1.0F;
            }

            if (nm1.b == j2 - 1)
            {
                f = (nm1.d + f3) - 1.0F;
            }
            nm1.e = f3;
            f3 += nm1.d + f4;
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
            if (af == 2)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                c(false);
                D.abortAnimation();
                int j1 = getScrollX();
                int k1 = getScrollY();
                int l1 = D.getCurrX();
                int i2 = D.getCurrY();
                if (j1 != l1 || k1 != i2)
                {
                    scrollTo(l1, i2);
                    if (l1 != j1)
                    {
                        b(l1);
                    }
                }
            }
            g = false;
            flag2 = false;
            flag1 = i1;
            for (i1 = ((flag2) ? 1 : 0); i1 < a.size(); i1++)
            {
                nm nm1 = (nm)a.get(i1);
                if (nm1.c)
                {
                    nm1.c = false;
                    flag1 = true;
                }
            }

            if (flag1)
            {
                if (!flag)
                {
                    break label0;
                }
                mk.a(this, ae);
            }
            return;
        }
        ae.run();
    }

    private boolean a(float f1)
    {
        boolean flag1 = true;
        boolean flag3 = false;
        boolean flag2 = false;
        float f2 = i;
        i = f1;
        float f3 = (float)getScrollX() + (f2 - f1);
        int i1 = a();
        f1 = (float)i1 * e;
        f2 = i1;
        float f4 = f;
        nm nm1 = (nm)a.get(0);
        nm nm2 = (nm)a.get(a.size() - 1);
        boolean flag;
        if (nm1.b != 0)
        {
            f1 = nm1.e * (float)i1;
            flag = false;
        } else
        {
            flag = true;
        }
        if (nm2.b != b.b() - 1)
        {
            f2 = nm2.e * (float)i1;
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
            flag2 = U.a(Math.abs(f1 - f3) / (float)i1);
            f2 = f1;
        }
_L4:
        i = i + (f2 - (float)(int)f2);
        scrollTo((int)f2, getScrollY());
        b((int)f2);
        return flag2;
_L2:
        if (f3 > f2)
        {
            flag2 = flag3;
            if (flag1)
            {
                flag2 = V.a(Math.abs(f3 - f2) / (float)i1);
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
        if (flag && mk.a(view, -i1)) goto _L4; else goto _L6
_L6:
        return false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static int b(ViewPager viewpager)
    {
        return viewpager.c;
    }

    private nm b(View view)
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
        ViewParent viewparent = getParent();
        if (viewparent != null)
        {
            viewparent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private void c(int i1)
    {
        boolean flag1 = false;
        if (af != i1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        af = i1;
        if (r != null)
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
                mk.a(getChildAt(k1), byte0, null);
                k1++;
            }
        }
        if (q != null)
        {
            q.b(i1);
        }
        if (p != null)
        {
            int l1 = p.size();
            int j1 = ((flag1) ? 1 : 0);
            while (j1 < l1) 
            {
                np np1 = (np)p.get(j1);
                if (np1 != null)
                {
                    np1.b(i1);
                }
                j1++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void c(boolean flag)
    {
        if (J != flag)
        {
            J = flag;
        }
    }

    private void d(int i1)
    {
        float f1;
        float f5;
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        int j1;
        byte byte1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        if (c != i1)
        {
            byte byte0;
            if (c < i1)
            {
                byte0 = 66;
            } else
            {
                byte0 = 17;
            }
            obj1 = e(c);
            c = i1;
            byte1 = byte0;
        } else
        {
            obj1 = null;
            byte1 = 2;
        }
        if (b != null) goto _L2; else goto _L1
_L1:
        j();
_L4:
        return;
_L2:
        if (g)
        {
            j();
            return;
        }
        if (getWindowToken() == null) goto _L4; else goto _L3
_L3:
        i1 = h;
        j3 = Math.max(0, c - i1);
        l2 = b.b();
        i3 = Math.min(l2 - 1, i1 + c);
        if (l2 != v)
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
            throw new IllegalStateException((new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ")).append(v).append(", found: ").append(l2).append(" Pager id: ").append(s1).append(" Pager class: ").append(getClass()).append(" Problematic adapter: ").append(b.getClass()).toString());
        }
        i1 = 0;
_L14:
        if (i1 >= a.size())
        {
            break MISSING_BLOCK_LABEL_1262;
        }
        obj = (nm)a.get(i1);
        if (((nm) (obj)).b < c) goto _L6; else goto _L5
_L5:
        if (((nm) (obj)).b != c)
        {
            break MISSING_BLOCK_LABEL_1262;
        }
_L21:
        if (obj == null && l2 > 0)
        {
            obj2 = a(c, i1);
        } else
        {
            obj2 = obj;
        }
        if (obj2 == null) goto _L8; else goto _L7
_L7:
        k2 = i1 - 1;
        float f3;
        if (k2 >= 0)
        {
            obj = (nm)a.get(k2);
        } else
        {
            obj = null;
        }
        k3 = a();
        if (k3 <= 0)
        {
            f3 = 0.0F;
        } else
        {
            f3 = (2.0F - ((nm) (obj2)).d) + (float)getPaddingLeft() / (float)k3;
        }
        j1 = c;
        f5 = 0.0F;
        j2 = j1 - 1;
        i2 = i1;
        obj3 = obj;
        if (j2 < 0) goto _L10; else goto _L9
_L9:
        if (f5 < f3 || j2 >= j3) goto _L12; else goto _L11
_L11:
        if (obj3 == null) goto _L10; else goto _L13
_L13:
        obj = obj3;
        i1 = k2;
        f1 = f5;
        j1 = i2;
        if (j2 == ((nm) (obj3)).b)
        {
            obj = obj3;
            i1 = k2;
            f1 = f5;
            j1 = i2;
            if (!((nm) (obj3)).c)
            {
                a.remove(k2);
                b.a(this, j2, ((nm) (obj3)).a);
                i1 = k2 - 1;
                j1 = i2 - 1;
                if (i1 >= 0)
                {
                    obj = (nm)a.get(i1);
                    f1 = f5;
                } else
                {
                    obj = null;
                    f1 = f5;
                }
            }
        }
_L15:
        j2--;
        obj3 = obj;
        k2 = i1;
        f5 = f1;
        i2 = j1;
        break MISSING_BLOCK_LABEL_368;
_L6:
        i1++;
          goto _L14
_L12:
        if (obj3 != null && j2 == ((nm) (obj3)).b)
        {
            f1 = f5 + ((nm) (obj3)).d;
            i1 = k2 - 1;
            if (i1 >= 0)
            {
                obj = (nm)a.get(i1);
                j1 = i2;
            } else
            {
                obj = null;
                j1 = i2;
            }
        } else
        {
            f1 = f5 + a(j2, k2 + 1).d;
            j1 = i2 + 1;
            if (k2 >= 0)
            {
                obj = (nm)a.get(k2);
                i1 = k2;
            } else
            {
                obj = null;
                i1 = k2;
            }
        }
          goto _L15
_L10:
label0:
        {
            float f2 = ((nm) (obj2)).d;
            i1 = i2 + 1;
            if (f2 >= 2.0F)
            {
                break label0;
            }
            float f4;
            int k1;
            if (i1 < a.size())
            {
                obj = (nm)a.get(i1);
            } else
            {
                obj = null;
            }
            if (k3 <= 0)
            {
                f4 = 0.0F;
            } else
            {
                f4 = (float)getPaddingRight() / (float)k3 + 2.0F;
            }
            k1 = c;
            k1++;
            do
            {
                if (k1 >= l2)
                {
                    break label0;
                }
                if (f2 >= f4 && k1 > i3)
                {
                    if (obj == null)
                    {
                        break label0;
                    }
                    if (k1 == ((nm) (obj)).b && !((nm) (obj)).c)
                    {
                        a.remove(i1);
                        b.a(this, k1, ((nm) (obj)).a);
                        if (i1 < a.size())
                        {
                            obj = (nm)a.get(i1);
                        } else
                        {
                            obj = null;
                        }
                    }
                } else
                if (obj != null && k1 == ((nm) (obj)).b)
                {
                    float f6 = ((nm) (obj)).d;
                    i1++;
                    if (i1 < a.size())
                    {
                        obj = (nm)a.get(i1);
                    } else
                    {
                        obj = null;
                    }
                    f2 += f6;
                } else
                {
                    obj = a(k1, i1);
                    i1++;
                    float f7 = ((nm) (obj)).d;
                    if (i1 < a.size())
                    {
                        obj = (nm)a.get(i1);
                    } else
                    {
                        obj = null;
                    }
                    f2 += f7;
                }
                k1++;
            } while (true);
        }
        a(((nm) (obj2)), i2, ((nm) (obj1)));
_L8:
        obj1 = b;
        i1 = c;
        int l1;
        if (obj2 != null)
        {
            obj = ((nm) (obj2)).a;
        } else
        {
            obj = null;
        }
        ((md) (obj1)).b(this, i1, obj);
        b.a(this);
        l1 = getChildCount();
        for (i1 = 0; i1 < l1; i1++)
        {
            obj1 = getChildAt(i1);
            obj = (nn)((View) (obj1)).getLayoutParams();
            obj.f = i1;
            if (((nn) (obj)).a || ((nn) (obj)).c != 0.0F)
            {
                continue;
            }
            obj1 = a(((View) (obj1)));
            if (obj1 != null)
            {
                obj.c = ((nm) (obj1)).d;
                obj.e = ((nm) (obj1)).b;
            }
        }

        j();
        if (!hasFocus()) goto _L4; else goto _L16
_L16:
        obj = findFocus();
        if (obj != null)
        {
            obj = b(((View) (obj)));
        } else
        {
            obj = null;
        }
        if (obj != null && ((nm) (obj)).b == c) goto _L4; else goto _L17
_L17:
        i1 = 0;
_L20:
        if (i1 >= getChildCount()) goto _L4; else goto _L18
_L18:
        obj = getChildAt(i1);
        obj1 = a(((View) (obj)));
        if (obj1 != null && ((nm) (obj1)).b == c && ((View) (obj)).requestFocus(byte1)) goto _L4; else goto _L19
_L19:
        i1++;
          goto _L20
        obj = null;
          goto _L21
    }

    private nm e(int i1)
    {
        for (int j1 = 0; j1 < a.size(); j1++)
        {
            nm nm1 = (nm)a.get(j1);
            if (nm1.b == i1)
            {
                return nm1;
            }
        }

        return null;
    }

    private void f(int i1)
    {
        if (q != null)
        {
            q.c_(i1);
        }
        if (p != null)
        {
            int k1 = p.size();
            for (int j1 = 0; j1 < k1; j1++)
            {
                np np1 = (np)p.get(j1);
                if (np1 != null)
                {
                    np1.c_(i1);
                }
            }

        }
    }

    private boolean g(int i1)
    {
        View view = findFocus();
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
        boolean flag;
        j1 = a(z, view).left;
        int k1 = a(z, ((View) (obj))).left;
        StringBuilder stringbuilder;
        if (obj != null && j1 >= k1)
        {
            flag = k();
        } else
        {
            flag = view.requestFocus();
        }
_L16:
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
            break MISSING_BLOCK_LABEL_356;
        }
        if (obj != this) goto _L10; else goto _L9
_L9:
        j1 = 1;
_L18:
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
        j1 = a(z, view).left;
        int l1 = a(z, ((View) (obj))).left;
        if (obj != null && j1 <= l1)
        {
            flag = l();
        } else
        {
            flag = view.requestFocus();
        }
          goto _L16
_L4:
label0:
        {
            if (i1 != 17 && i1 != 1)
            {
                break label0;
            }
            flag = k();
        }
          goto _L16
        if (i1 != 66 && i1 != 2) goto _L15; else goto _L17
_L17:
        flag = l();
          goto _L16
_L15:
        flag = false;
          goto _L16
_L8:
        obj = view;
          goto _L13
        j1 = 0;
          goto _L18
    }

    public static int[] h()
    {
        return u;
    }

    private void i()
    {
        setWillNotDraw(false);
        setDescendantFocusability(0x40000);
        setFocusable(true);
        Context context = getContext();
        D = new Scroller(context, x);
        ViewConfiguration viewconfiguration = ViewConfiguration.get(context);
        float f1 = context.getResources().getDisplayMetrics().density;
        O = mx.a(viewconfiguration);
        R = (int)(400F * f1);
        m = viewconfiguration.getScaledMaximumFlingVelocity();
        U = new qw(context);
        V = new qw(context);
        S = (int)(25F * f1);
        T = (int)(2.0F * f1);
        M = (int)(16F * f1);
        mk.a(this, new no(this));
        if (mk.e(this) == 0)
        {
            mk.c(this, 1);
        }
    }

    private void j()
    {
        if (t != 0)
        {
            int j1;
            if (ac == null)
            {
                ac = new ArrayList();
            } else
            {
                ac.clear();
            }
            j1 = getChildCount();
            for (int i1 = 0; i1 < j1; i1++)
            {
                View view = getChildAt(i1);
                ac.add(view);
            }

            Collections.sort(ac, ad);
        }
    }

    private boolean k()
    {
        if (c > 0)
        {
            a(c - 1, true);
            return true;
        } else
        {
            return false;
        }
    }

    private boolean l()
    {
        if (b != null && c < b.b() - 1)
        {
            a(c + 1, true);
            return true;
        } else
        {
            return false;
        }
    }

    public int a()
    {
        return getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
    }

    public int a(int i1, float f1, int j1, int k1)
    {
        if (Math.abs(k1) > S && Math.abs(j1) > R)
        {
            if (j1 <= 0)
            {
                i1++;
            }
        } else
        {
            float f2;
            if (i1 >= c)
            {
                f2 = 0.4F;
            } else
            {
                f2 = 0.6F;
            }
            i1 = (int)(f2 + ((float)i1 + f1));
        }
        j1 = i1;
        if (a.size() > 0)
        {
            nm nm1 = (nm)a.get(0);
            nm nm2 = (nm)a.get(a.size() - 1);
            j1 = Math.max(nm1.b, Math.min(i1, nm2.b));
        }
        return j1;
    }

    public void a(int i1)
    {
        g = false;
        boolean flag;
        if (!W)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(i1, flag, false);
    }

    public void a(int i1, int j1, int k1, int l1)
    {
        if (j1 > 0 && !a.isEmpty())
        {
            int i2 = getPaddingLeft();
            int j2 = getPaddingRight();
            int k2 = getPaddingLeft();
            int l2 = getPaddingRight();
            float f1 = (float)getScrollX() / (float)((j1 - k2 - l2) + l1);
            j1 = (int)((float)((i1 - i2 - j2) + k1) * f1);
            scrollTo(j1, getScrollY());
            if (!D.isFinished())
            {
                k1 = D.getDuration();
                l1 = D.timePassed();
                nm nm1 = e(c);
                D.startScroll(j1, 0, (int)(nm1.e * (float)i1), 0, k1 - l1);
            }
        } else
        {
            nm nm2 = e(c);
            float f2;
            if (nm2 != null)
            {
                f2 = Math.min(nm2.e, f);
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

    public void a(int i1, boolean flag)
    {
        g = false;
        a(i1, flag, false);
    }

    public final void a(int i1, boolean flag, boolean flag1, int j1)
    {
        boolean flag2;
        flag2 = false;
        if (b == null || b.b() <= 0)
        {
            c(false);
            return;
        }
        if (!flag1 && c == i1 && a.size() != 0)
        {
            c(false);
            return;
        }
        if (i1 >= 0) goto _L2; else goto _L1
_L1:
        int k1 = 0;
_L4:
        i1 = h;
        if (k1 > c + i1 || k1 < c - i1)
        {
            for (i1 = 0; i1 < a.size(); i1++)
            {
                ((nm)a.get(i1)).c = true;
            }

        }
        break; /* Loop/switch isn't completed */
_L2:
        k1 = i1;
        if (i1 >= b.b())
        {
            k1 = b.b() - 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        flag1 = flag2;
        if (c != k1)
        {
            flag1 = true;
        }
        if (W)
        {
            c = k1;
            if (flag1)
            {
                f(k1);
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

    public final void a(md md1)
    {
        boolean flag;
label0:
        {
            if (b != null)
            {
                md md2 = b;
                nr nr2 = E;
                md2.a.unregisterObserver(nr2);
                for (int i1 = 0; i1 < a.size(); i1++)
                {
                    nm nm1 = (nm)a.get(i1);
                    b.a(this, nm1.b, nm1.a);
                }

                b.a(this);
                a.clear();
                int k1;
                for (int j1 = 0; j1 < getChildCount(); j1 = k1 + 1)
                {
                    k1 = j1;
                    if (!((nn)getChildAt(j1).getLayoutParams()).a)
                    {
                        removeViewAt(j1);
                        k1 = j1 - 1;
                    }
                }

                c = 0;
                scrollTo(0, 0);
            }
            b = md1;
            v = 0;
            if (b != null)
            {
                if (E == null)
                {
                    E = new nr(this);
                }
                md1 = b;
                nr nr1 = E;
                md1.a.registerObserver(nr1);
                g = false;
                flag = W;
                W = true;
                v = b.b();
                if (A < 0)
                {
                    break label0;
                }
                b.a(B, C);
                a(A, false, true);
                A = -1;
                B = null;
                C = null;
            }
            return;
        }
        if (!flag)
        {
            d();
            return;
        } else
        {
            requestLayout();
            return;
        }
    }

    public final void a(np np1)
    {
        if (p == null)
        {
            p = new ArrayList();
        }
        p.add(np1);
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
                    nm nm1 = a(view);
                    if (nm1 != null && nm1.b == c)
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
            nm nm1 = a(view);
            if (nm1 != null && nm1.b == c)
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
        nn nn1 = (nn)layoutparams;
        nn1.a = nn1.a | (view instanceof nl);
        if (I)
        {
            if (nn1 != null && nn1.a)
            {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            } else
            {
                nn1.d = true;
                addViewInLayout(view, i1, layoutparams);
                return;
            }
        } else
        {
            super.addView(view, i1, layoutparams);
            return;
        }
    }

    public final void b()
    {
        if (p != null)
        {
            p.clear();
        }
    }

    public boolean b(int i1)
    {
        boolean flag = false;
        if (a.size() == 0)
        {
            aa = false;
            a(0, 0.0F, 0);
            if (!aa)
            {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
        } else
        {
            nm nm1 = e();
            int k1 = a();
            int l1 = d;
            float f1 = (float)d / (float)k1;
            int j1 = nm1.b;
            f1 = ((float)i1 / (float)k1 - nm1.e) / (nm1.d + f1);
            i1 = (int)((float)(l1 + k1) * f1);
            aa = false;
            a(j1, f1, i1);
            if (!aa)
            {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
            flag = true;
        }
        return flag;
    }

    public final void c()
    {
        Object obj;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int l2 = b.b();
        v = l2;
        int j2;
        if (a.size() < (h << 1) + 1 && a.size() < l2)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        j1 = c;
        k1 = 0;
        i2 = 0;
        l1 = i1;
        i1 = j1;
        j1 = k1;
        k1 = i2;
        if (k1 >= a.size())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (nm)a.get(k1);
        i2 = b.a(((nm) (obj)).a);
        if (i2 == -1)
        {
            break MISSING_BLOCK_LABEL_361;
        }
        if (i2 == -2)
        {
            a.remove(k1);
            l1 = k1 - 1;
            k1 = j1;
            if (j1 == 0)
            {
                k1 = 1;
            }
            b.a(this, ((nm) (obj)).b, ((nm) (obj)).a);
            int k2;
            if (c == ((nm) (obj)).b)
            {
                j1 = Math.max(0, Math.min(c, l2 - 1));
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
            if (((nm) (obj)).b == i2)
            {
                break MISSING_BLOCK_LABEL_361;
            }
            if (((nm) (obj)).b == c)
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
            b.a(this);
        }
        Collections.sort(a, w);
        if (l1 != 0)
        {
            k1 = getChildCount();
            for (j1 = 0; j1 < k1; j1++)
            {
                obj = (nn)getChildAt(j1).getLayoutParams();
                if (!((nn) (obj)).a)
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
        if (b != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j1;
        int k1;
        j1 = a();
        k1 = getScrollX();
        if (i1 >= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (k1 <= (int)((float)j1 * e)) goto _L1; else goto _L3
_L3:
        return true;
        if (i1 <= 0 || k1 >= (int)((float)j1 * f)) goto _L1; else goto _L4
_L4:
        return true;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof nn) && super.checkLayoutParams(layoutparams);
    }

    public void computeScroll()
    {
        if (!D.isFinished() && D.computeScrollOffset())
        {
            int i1 = getScrollX();
            int j1 = getScrollY();
            int k1 = D.getCurrX();
            int l1 = D.getCurrY();
            if (i1 != k1 || j1 != l1)
            {
                scrollTo(k1, l1);
                if (!b(k1))
                {
                    D.abortAnimation();
                    scrollTo(0, l1);
                }
            }
            mk.d(this);
            return;
        } else
        {
            a(true);
            return;
        }
    }

    public final void d()
    {
        d(c);
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
        flag = g(17);
          goto _L9
_L6:
        flag = g(66);
          goto _L9
_L7:
        if (android.os.Build.VERSION.SDK_INT < 11) goto _L4; else goto _L10
_L10:
        if (!ky.a(keyevent))
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = g(2);
          goto _L9
        if (!ky.a(keyevent, 1)) goto _L4; else goto _L11
_L11:
        flag = g(1);
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
                nm nm1 = a(view);
                if (nm1 != null && nm1.b == c && view.dispatchPopulateAccessibilityEvent(accessibilityevent))
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
        int k1 = mk.a(this);
        if (k1 == 0 || k1 == 1 && b != null && b.b() > 1)
        {
            if (!U.a())
            {
                j1 = canvas.save();
                i1 = getHeight() - getPaddingTop() - getPaddingBottom();
                int l1 = getWidth();
                canvas.rotate(270F);
                canvas.translate(-i1 + getPaddingTop(), e * (float)l1);
                U.a(i1, l1);
                i1 = U.a(canvas) | false;
                canvas.restoreToCount(j1);
            }
            j1 = i1;
            if (!V.a())
            {
                int i2 = canvas.save();
                j1 = getWidth();
                int j2 = getHeight();
                int k2 = getPaddingTop();
                int l2 = getPaddingBottom();
                canvas.rotate(90F);
                canvas.translate(-getPaddingTop(), -(f + 1.0F) * (float)j1);
                V.a(j2 - k2 - l2, j1);
                j1 = i1 | V.a(canvas);
                canvas.restoreToCount(i2);
            }
        } else
        {
            U.b();
            V.b();
        }
        if (j1 != 0)
        {
            mk.d(this);
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
    }

    public nm e()
    {
        int i1 = a();
        float f1;
        float f2;
        float f3;
        float f4;
        nm nm2;
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
            f2 = (float)d / (float)i1;
        } else
        {
            f2 = 0.0F;
        }
        f4 = 0.0F;
        f3 = 0.0F;
        j1 = -1;
        i1 = 0;
        flag = true;
        nm2 = null;
        do
        {
            nm nm1;
label0:
            {
                nm nm3;
label1:
                {
                    nm3 = nm2;
                    if (i1 >= a.size())
                    {
                        break label1;
                    }
                    nm1 = (nm)a.get(i1);
                    if (!flag && nm1.b != j1 + 1)
                    {
                        nm1 = y;
                        nm1.e = f4 + f3 + f2;
                        nm1.b = j1 + 1;
                        nm1.d = 1.0F;
                        i1--;
                    }
                    f3 = nm1.e;
                    f4 = nm1.d;
                    if (!flag)
                    {
                        nm3 = nm2;
                        if (f1 < f3)
                        {
                            break label1;
                        }
                    }
                    if (f1 >= f4 + f3 + f2 && i1 != a.size() - 1)
                    {
                        break label0;
                    }
                    nm3 = nm1;
                }
                return nm3;
            }
            j1 = nm1.b;
            f4 = nm1.d;
            flag = false;
            i1++;
            nm2 = nm1;
        } while (true);
    }

    public final boolean f()
    {
        if (K)
        {
            return false;
        }
        n = true;
        c(1);
        i = 0.0F;
        j = 0.0F;
        MotionEvent motionevent;
        long l1;
        if (l == null)
        {
            l = VelocityTracker.obtain();
        } else
        {
            l.clear();
        }
        l1 = SystemClock.uptimeMillis();
        motionevent = MotionEvent.obtain(l1, l1, 0, 0.0F, 0.0F, 0);
        l.addMovement(motionevent);
        motionevent.recycle();
        o = l1;
        return true;
    }

    public void g()
    {
        K = false;
        L = false;
        if (l != null)
        {
            l.recycle();
            l = null;
        }
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new nn();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new nn(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return generateDefaultLayoutParams();
    }

    protected int getChildDrawingOrder(int i1, int j1)
    {
        int k1 = j1;
        if (t == 2)
        {
            k1 = i1 - 1 - j1;
        }
        return ((nn)((View)ac.get(k1)).getLayoutParams()).f;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        W = true;
    }

    protected void onDetachedFromWindow()
    {
        removeCallbacks(ae);
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
        K = false;
        L = false;
        k = -1;
        if (l != null)
        {
            l.recycle();
            l = null;
        }
_L4:
        return false;
_L2:
        if (i1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (K)
        {
            return true;
        }
        if (L) goto _L4; else goto _L3
_L3:
        i1;
        JVM INSTR lookupswitch 3: default 116
    //                   0: 428
    //                   2: 143
    //                   6: 560;
           goto _L5 _L6 _L7 _L8
_L5:
        if (l == null)
        {
            l = VelocityTracker.obtain();
        }
        l.addMovement(motionevent);
        return K;
_L7:
        float f1;
        float f3;
        float f4;
        float f5;
        float f6;
        int j1 = k;
        if (j1 == -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        j1 = lt.a(motionevent, j1);
        f3 = lt.c(motionevent, j1);
        f1 = f3 - i;
        f5 = Math.abs(f1);
        f4 = lt.d(motionevent, j1);
        f6 = Math.abs(f4 - Q);
        if (f1 != 0.0F)
        {
            float f7 = i;
            boolean flag;
            if (f7 < (float)N && f1 > 0.0F || f7 > (float)(getWidth() - N) && f1 < 0.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag && a(this, false, (int)f1, (int)f3, (int)f4))
            {
                i = f3;
                P = f4;
                L = true;
                return false;
            }
        }
        if (f5 <= (float)O || 0.5F * f5 <= f6) goto _L10; else goto _L9
_L9:
        K = true;
        b(true);
        c(1);
        if (f1 > 0.0F)
        {
            f1 = j + (float)O;
        } else
        {
            f1 = j - (float)O;
        }
        i = f1;
        P = f4;
        c(true);
_L11:
        if (K && a(f3))
        {
            mk.d(this);
        }
        continue; /* Loop/switch isn't completed */
_L10:
        if (f6 > (float)O)
        {
            L = true;
        }
        if (true) goto _L11; else goto _L6
_L6:
        float f2 = motionevent.getX();
        j = f2;
        i = f2;
        f2 = motionevent.getY();
        Q = f2;
        P = f2;
        k = lt.b(motionevent, 0);
        L = false;
        D.computeScrollOffset();
        if (af == 2 && Math.abs(D.getFinalX() - D.getCurrX()) > T)
        {
            D.abortAnimation();
            g = false;
            d();
            K = true;
            b(true);
            c(1);
        } else
        {
            a(false);
            K = false;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        a(motionevent);
        if (true) goto _L5; else goto _L12
_L12:
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
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
        nn nn1 = (nn)view.getLayoutParams();
        if (!nn1.a) goto _L4; else goto _L5
_L5:
        int l5;
        l1 = nn1.b;
        l5 = nn1.b;
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
            nn nn2 = (nn)view1.getLayoutParams();
            if (nn2.a)
            {
                continue;
            }
            nm nm1 = a(view1);
            if (nm1 == null)
            {
                continue;
            }
            float f1 = i2;
            int l2 = (int)(nm1.e * f1) + j1;
            if (nn2.d)
            {
                nn2.d = false;
                float f2 = i2;
                view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)(nn2.c * f2), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(i5 - i1 - k1, 0x40000000));
            }
            view1.layout(l2, i1, view1.getMeasuredWidth() + l2, view1.getMeasuredHeight() + i1);
        }

        F = i1;
        G = i5 - k1;
        ab = j2;
        if (W)
        {
            a(c, false, 0, false);
        }
        W = false;
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
            N = Math.min(i1 / 10, M);
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
                        nn nn1 = (nn)view.getLayoutParams();
                        k1 = i1;
                        l1 = j1;
                        if (nn1 == null)
                        {
                            break label1;
                        }
                        k1 = i1;
                        l1 = j1;
                        if (!nn1.a)
                        {
                            break label1;
                        }
                        k1 = nn1.b & 7;
                        int j2 = nn1.b & 0x70;
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
                        if (nn1.width != -2)
                        {
                            k2 = 0x40000000;
                            float f1;
                            int l2;
                            int i3;
                            if (nn1.width != -1)
                            {
                                k1 = nn1.width;
                            } else
                            {
                                k1 = i1;
                            }
                        } else
                        {
                            k2 = k1;
                            k1 = i1;
                        }
                        if (nn1.height == -2)
                        {
                            break label0;
                        }
                        l2 = 0x40000000;
                        l1 = l2;
                        if (nn1.height == -1)
                        {
                            break label0;
                        }
                        i3 = nn1.height;
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
            H = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000);
            I = true;
            d();
            I = false;
            k1 = getChildCount();
            for (j1 = 0; j1 < k1; j1++)
            {
                view = getChildAt(j1);
                if (view.getVisibility() == 8)
                {
                    continue;
                }
                nn1 = (nn)view.getLayoutParams();
                if (nn1 == null || !nn1.a)
                {
                    f1 = i1;
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)(nn1.c * f1), 0x40000000), H);
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
            nm nm1 = a(view);
            if (nm1 != null && nm1.b == c && view.requestFocus(i1, rect))
            {
                return true;
            }
        }

        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (!(parcelable instanceof ns))
        {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (ns)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (b != null)
        {
            b.a(((ns) (parcelable)).b, ((ns) (parcelable)).c);
            a(((ns) (parcelable)).a, false, true);
            return;
        } else
        {
            A = ((ns) (parcelable)).a;
            B = ((ns) (parcelable)).b;
            C = ((ns) (parcelable)).c;
            return;
        }
    }

    public Parcelable onSaveInstanceState()
    {
        ns ns1 = new ns(super.onSaveInstanceState());
        ns1.a = c;
        if (b != null)
        {
            ns1.b = b.af_();
        }
        return ns1;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (i1 != k1)
        {
            a(i1, k1, d, d);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1;
        int j1;
        j1 = 0;
        if (n)
        {
            return true;
        }
        if (motionevent.getAction() == 0 && motionevent.getEdgeFlags() != 0)
        {
            return false;
        }
        if (b == null || b.b() == 0)
        {
            return false;
        }
        if (l == null)
        {
            l = VelocityTracker.obtain();
        }
        l.addMovement(motionevent);
        i1 = j1;
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 6: default 124
    //                   0 139
    //                   1 392
    //                   2 201
    //                   3 546
    //                   4 128
    //                   5 601
    //                   6 634;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L6:
        break; /* Loop/switch isn't completed */
_L1:
        i1 = j1;
_L10:
        if (i1 != 0)
        {
            mk.d(this);
        }
        return true;
_L2:
        D.abortAnimation();
        g = false;
        d();
        float f1 = motionevent.getX();
        j = f1;
        i = f1;
        f1 = motionevent.getY();
        Q = f1;
        P = f1;
        k = lt.b(motionevent, 0);
        i1 = j1;
        continue; /* Loop/switch isn't completed */
_L4:
        if (!K)
        {
            i1 = lt.a(motionevent, k);
            float f2 = lt.c(motionevent, i1);
            float f4 = Math.abs(f2 - i);
            float f3 = lt.d(motionevent, i1);
            float f5 = Math.abs(f3 - P);
            if (f4 > (float)O && f4 > f5)
            {
                K = true;
                b(true);
                ViewParent viewparent;
                if (f2 - j > 0.0F)
                {
                    f2 = j + (float)O;
                } else
                {
                    f2 = j - (float)O;
                }
                i = f2;
                P = f3;
                c(1);
                c(true);
                viewparent = getParent();
                if (viewparent != null)
                {
                    viewparent.requestDisallowInterceptTouchEvent(true);
                }
            }
        }
        i1 = j1;
        if (K)
        {
            i1 = a(lt.c(motionevent, lt.a(motionevent, k))) | false;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        i1 = j1;
        if (K)
        {
            Object obj = l;
            ((VelocityTracker) (obj)).computeCurrentVelocity(1000, m);
            i1 = (int)mg.a(((VelocityTracker) (obj)), k);
            g = true;
            j1 = a();
            int k1 = getScrollX();
            obj = e();
            a(a(((nm) (obj)).b, ((float)k1 / (float)j1 - ((nm) (obj)).e) / ((nm) (obj)).d, i1, (int)(lt.c(motionevent, lt.a(motionevent, k)) - j)), true, true, i1);
            k = -1;
            g();
            boolean flag = U.c();
            i1 = V.c() | flag;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        i1 = j1;
        if (K)
        {
            a(c, true, 0, false);
            k = -1;
            g();
            boolean flag1 = U.c();
            i1 = V.c() | flag1;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        i1 = lt.b(motionevent);
        i = lt.c(motionevent, i1);
        k = lt.b(motionevent, i1);
        i1 = j1;
        continue; /* Loop/switch isn't completed */
_L8:
        a(motionevent);
        i = lt.c(motionevent, lt.a(motionevent, k));
        i1 = j1;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void removeView(View view)
    {
        if (I)
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

}
