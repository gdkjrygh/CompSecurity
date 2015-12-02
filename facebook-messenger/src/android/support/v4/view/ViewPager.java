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
import android.os.SystemClock;
import android.support.v4.d.a;
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
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Referenced classes of package android.support.v4.view:
//            at, au, ax, av, 
//            x, s, ad, ay, 
//            bb, ao, az, n, 
//            aw, y, bc, ba

public class ViewPager extends ViewGroup
{

    private static final int a[] = {
        0x10100b3
    };
    private static final Comparator b = new at();
    private static final Interpolator c = new au();
    private boolean A;
    private int B;
    private int C;
    private int D;
    private float E;
    private float F;
    private float G;
    private int H;
    private VelocityTracker I;
    private int J;
    private int K;
    private int L;
    private int M;
    private boolean N;
    private long O;
    private a P;
    private a Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private int U;
    private boolean V;
    private bb W;
    private bb Z;
    private ba aa;
    private final Runnable ab;
    private int ac;
    private final ArrayList d;
    private final ax e;
    private final Rect f;
    private x g;
    private int h;
    private int i;
    private Parcelable j;
    private ClassLoader k;
    private Scroller l;
    private bc m;
    private int n;
    private Drawable o;
    private int p;
    private int q;
    private float r;
    private float s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private boolean x;
    private int y;
    private boolean z;

    public ViewPager(Context context)
    {
        super(context);
        d = new ArrayList();
        e = new ax();
        f = new Rect();
        i = -1;
        j = null;
        k = null;
        r = -3.402823E+38F;
        s = 3.402823E+38F;
        y = 1;
        H = -1;
        R = true;
        S = false;
        V = true;
        ab = new av(this);
        ac = 0;
        a();
    }

    public ViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d = new ArrayList();
        e = new ax();
        f = new Rect();
        i = -1;
        j = null;
        k = null;
        r = -3.402823E+38F;
        s = 3.402823E+38F;
        y = 1;
        H = -1;
        R = true;
        S = false;
        V = true;
        ab = new av(this);
        ac = 0;
        a();
    }

    private int a(int i1, float f1, int j1, int k1)
    {
        if (Math.abs(k1) > L && Math.abs(j1) > J)
        {
            if (j1 <= 0)
            {
                i1++;
            }
        } else
        {
            i1 = (int)((float)i1 + f1 + 0.5F);
        }
        j1 = i1;
        if (d.size() > 0)
        {
            ax ax1 = (ax)d.get(0);
            ax ax2 = (ax)d.get(d.size() - 1);
            j1 = Math.max(ax1.b, Math.min(i1, ax2.b));
        }
        return j1;
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

    static x a(ViewPager viewpager)
    {
        return viewpager.g;
    }

    private void a(int i1, int j1, int k1, int l1)
    {
        if (j1 > 0 && !d.isEmpty())
        {
            float f1 = (float)getScrollX() / (float)(j1 + l1);
            j1 = (int)((float)(i1 + k1) * f1);
            scrollTo(j1, getScrollY());
            if (!l.isFinished())
            {
                k1 = l.getDuration();
                l1 = l.timePassed();
                ax ax1 = b(h);
                l.startScroll(j1, 0, (int)(ax1.e * (float)i1), 0, k1 - l1);
            }
        } else
        {
            ax ax2 = b(h);
            float f2;
            if (ax2 != null)
            {
                f2 = Math.min(ax2.e, s);
            } else
            {
                f2 = 0.0F;
            }
            i1 = (int)(f2 * (float)i1);
            if (i1 != getScrollX())
            {
                a(false);
                scrollTo(i1, getScrollY());
                return;
            }
        }
    }

    static void a(ViewPager viewpager, int i1)
    {
        viewpager.setScrollState(i1);
    }

    private void a(ax ax1, int i1, ax ax2)
    {
        int i3 = g.a();
        int j1 = getWidth();
        float f4;
        if (j1 > 0)
        {
            f4 = (float)n / (float)j1;
        } else
        {
            f4 = 0.0F;
        }
        if (ax2 != null)
        {
            j1 = ax2.b;
            if (j1 < ax1.b)
            {
                float f1 = ax2.e + ax2.d + f4;
                j1++;
                int j2;
                for (int k1 = 0; j1 <= ax1.b && k1 < d.size(); j1 = j2 + 1)
                {
                    ax2 = (ax)d.get(k1);
                    float f5;
                    do
                    {
                        j2 = j1;
                        f5 = f1;
                        if (j1 <= ax2.b)
                        {
                            break;
                        }
                        j2 = j1;
                        f5 = f1;
                        if (k1 >= d.size() - 1)
                        {
                            break;
                        }
                        k1++;
                        ax2 = (ax)d.get(k1);
                    } while (true);
                    for (; j2 < ax2.b; j2++)
                    {
                        f5 += g.a(j2) + f4;
                    }

                    ax2.e = f5;
                    f1 = f5 + (ax2.d + f4);
                }

            } else
            if (j1 > ax1.b)
            {
                int l1 = d.size() - 1;
                float f2 = ax2.e;
                int k2;
                for (j1--; j1 >= ax1.b && l1 >= 0; j1 = k2 - 1)
                {
                    ax2 = (ax)d.get(l1);
                    float f6;
                    do
                    {
                        k2 = j1;
                        f6 = f2;
                        if (j1 >= ax2.b)
                        {
                            break;
                        }
                        k2 = j1;
                        f6 = f2;
                        if (l1 <= 0)
                        {
                            break;
                        }
                        l1--;
                        ax2 = (ax)d.get(l1);
                    } while (true);
                    for (; k2 > ax2.b; k2--)
                    {
                        f6 -= g.a(k2) + f4;
                    }

                    f2 = f6 - (ax2.d + f4);
                    ax2.e = f2;
                }

            }
        }
        int l2 = d.size();
        float f7 = ax1.e;
        j1 = ax1.b - 1;
        float f3;
        int i2;
        if (ax1.b == 0)
        {
            f3 = ax1.e;
        } else
        {
            f3 = -3.402823E+38F;
        }
        r = f3;
        if (ax1.b == i3 - 1)
        {
            f3 = (ax1.e + ax1.d) - 1.0F;
        } else
        {
            f3 = 3.402823E+38F;
        }
        s = f3;
        i2 = i1 - 1;
        f3 = f7;
        for (; i2 >= 0; i2--)
        {
            for (ax2 = (ax)d.get(i2); j1 > ax2.b; j1--)
            {
                f3 -= g.a(j1) + f4;
            }

            f3 -= ax2.d + f4;
            ax2.e = f3;
            if (ax2.b == 0)
            {
                r = f3;
            }
            j1--;
        }

        f3 = ax1.e + ax1.d + f4;
        i2 = ax1.b + 1;
        j1 = i1 + 1;
        i1 = i2;
        for (; j1 < l2; j1++)
        {
            for (ax1 = (ax)d.get(j1); i1 < ax1.b; i1++)
            {
                f3 = g.a(i1) + f4 + f3;
            }

            if (ax1.b == i3 - 1)
            {
                s = (ax1.d + f3) - 1.0F;
            }
            ax1.e = f3;
            f3 += ax1.d + f4;
            i1++;
        }

        S = false;
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = android.support.v4.view.s.a(motionevent);
        if (android.support.v4.view.s.b(motionevent, i1) == H)
        {
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            F = android.support.v4.view.s.c(motionevent, i1);
            H = android.support.v4.view.s.b(motionevent, i1);
            if (I != null)
            {
                I.clear();
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
            if (ac == 2)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                setScrollingCacheEnabled(false);
                l.abortAnimation();
                int j1 = getScrollX();
                int k1 = getScrollY();
                int l1 = l.getCurrX();
                int i2 = l.getCurrY();
                if (j1 != l1 || k1 != i2)
                {
                    scrollTo(l1, i2);
                }
            }
            x = false;
            flag2 = false;
            flag1 = i1;
            for (i1 = ((flag2) ? 1 : 0); i1 < d.size(); i1++)
            {
                ax ax1 = (ax)d.get(i1);
                if (ax1.c)
                {
                    ax1.c = false;
                    flag1 = true;
                }
            }

            if (flag1)
            {
                if (!flag)
                {
                    break label0;
                }
                android.support.v4.view.ad.a(this, ab);
            }
            return;
        }
        ab.run();
    }

    private boolean a(float f1, float f2)
    {
        return f1 < (float)C && f2 > 0.0F || f1 > (float)(getWidth() - C) && f2 < 0.0F;
    }

    static int b(ViewPager viewpager)
    {
        return viewpager.h;
    }

    private boolean c(float f1)
    {
        boolean flag1 = true;
        boolean flag3 = false;
        boolean flag2 = false;
        float f2 = F;
        F = f1;
        float f3 = (float)getScrollX() + (f2 - f1);
        int i1 = getWidth();
        f1 = (float)i1 * r;
        f2 = i1;
        float f4 = s;
        ax ax1 = (ax)d.get(0);
        ax ax2 = (ax)d.get(d.size() - 1);
        boolean flag;
        if (ax1.b != 0)
        {
            f1 = ax1.e * (float)i1;
            flag = false;
        } else
        {
            flag = true;
        }
        if (ax2.b != g.a() - 1)
        {
            f2 = ax2.e * (float)i1;
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
            flag2 = P.a(Math.abs(f1 - f3) / (float)i1);
            f2 = f1;
        }
_L4:
        F = F + (f2 - (float)(int)f2);
        scrollTo((int)f2, getScrollY());
        d((int)f2);
        return flag2;
_L2:
        if (f3 > f2)
        {
            flag2 = flag3;
            if (flag1)
            {
                flag2 = Q.a(Math.abs(f3 - f2) / (float)i1);
            }
        } else
        {
            f2 = f3;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean d(int i1)
    {
        boolean flag = false;
        if (d.size() == 0)
        {
            T = false;
            a(0, 0.0F, 0);
            if (!T)
            {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
        } else
        {
            ax ax1 = k();
            int k1 = getWidth();
            int l1 = n;
            float f1 = (float)n / (float)k1;
            int j1 = ax1.b;
            f1 = ((float)i1 / (float)k1 - ax1.e) / (ax1.d + f1);
            i1 = (int)((float)(l1 + k1) * f1);
            T = false;
            a(j1, f1, i1);
            if (!T)
            {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
            flag = true;
        }
        return flag;
    }

    static int[] i()
    {
        return a;
    }

    private void j()
    {
        int j1;
        for (int i1 = 0; i1 < getChildCount(); i1 = j1 + 1)
        {
            j1 = i1;
            if (!((ay)getChildAt(i1).getLayoutParams()).a)
            {
                removeViewAt(i1);
                j1 = i1 - 1;
            }
        }

    }

    private ax k()
    {
        int i1 = getWidth();
        float f1;
        float f2;
        float f3;
        float f4;
        ax ax2;
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
            f2 = (float)n / (float)i1;
        } else
        {
            f2 = 0.0F;
        }
        f4 = 0.0F;
        f3 = 0.0F;
        j1 = -1;
        i1 = 0;
        flag = true;
        ax2 = null;
        do
        {
            ax ax1;
label0:
            {
                ax ax3;
label1:
                {
                    ax3 = ax2;
                    if (i1 >= d.size())
                    {
                        break label1;
                    }
                    ax1 = (ax)d.get(i1);
                    if (!flag && ax1.b != j1 + 1)
                    {
                        ax1 = e;
                        ax1.e = f4 + f3 + f2;
                        ax1.b = j1 + 1;
                        ax1.d = g.a(ax1.b);
                        i1--;
                    }
                    f3 = ax1.e;
                    f4 = ax1.d;
                    if (!flag)
                    {
                        ax3 = ax2;
                        if (f1 < f3)
                        {
                            break label1;
                        }
                    }
                    if (f1 >= f4 + f3 + f2 && i1 != d.size() - 1)
                    {
                        break label0;
                    }
                    ax3 = ax1;
                }
                return ax3;
            }
            j1 = ax1.b;
            f4 = ax1.d;
            flag = false;
            i1++;
            ax2 = ax1;
        } while (true);
    }

    private void l()
    {
        z = false;
        A = false;
        if (I != null)
        {
            I.recycle();
            I = null;
        }
    }

    private void setScrollState(int i1)
    {
        if (ac != i1)
        {
            ac = i1;
            if (W != null)
            {
                W.b(i1);
                return;
            }
        }
    }

    private void setScrollingCacheEnabled(boolean flag)
    {
        if (w != flag)
        {
            w = flag;
        }
    }

    float a(float f1)
    {
        return (float)Math.sin((float)((double)(f1 - 0.5F) * 0.4712389167638204D));
    }

    ax a(int i1, int j1)
    {
        ax ax1 = new ax();
        ax1.b = i1;
        ax1.a = g.a(this, i1);
        ax1.d = g.a(i1);
        if (j1 < 0 || j1 >= d.size())
        {
            d.add(ax1);
            return ax1;
        } else
        {
            d.add(j1, ax1);
            return ax1;
        }
    }

    ax a(View view)
    {
        for (int i1 = 0; i1 < d.size(); i1++)
        {
            ax ax1 = (ax)d.get(i1);
            if (g.a(view, ax1.a))
            {
                return ax1;
            }
        }

        return null;
    }

    void a()
    {
        setWillNotDraw(false);
        setDescendantFocusability(0x40000);
        setFocusable(true);
        Context context = getContext();
        l = new Scroller(context, c);
        ViewConfiguration viewconfiguration = ViewConfiguration.get(context);
        D = android.support.v4.view.ao.a(viewconfiguration);
        J = viewconfiguration.getScaledMinimumFlingVelocity();
        K = viewconfiguration.getScaledMaximumFlingVelocity();
        P = new a(context);
        Q = new a(context);
        float f1 = context.getResources().getDisplayMetrics().density;
        L = (int)(25F * f1);
        M = (int)(2.0F * f1);
        B = (int)(f1 * 16F);
        android.support.v4.view.ad.a(this, new az(this));
        if (ad.c(this) == 0)
        {
            ad.b(this, 1);
        }
    }

    void a(int i1)
    {
        float f1;
        float f2;
        float f3;
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        if (h != i1)
        {
            obj1 = b(h);
            h = i1;
        } else
        {
            obj1 = null;
        }
        break MISSING_BLOCK_LABEL_23;
_L22:
        do
        {
            return;
        } while (g == null || x || getWindowToken() == null);
        g.a(this);
        i1 = y;
        l2 = Math.max(0, h - i1);
        j2 = g.a();
        k2 = Math.min(j2 - 1, i1 + h);
        i1 = 0;
_L16:
        if (i1 >= d.size())
        {
            break MISSING_BLOCK_LABEL_1043;
        }
        obj = (ax)d.get(i1);
        if (((ax) (obj)).b < h) goto _L2; else goto _L1
_L1:
        if (((ax) (obj)).b != h)
        {
            break MISSING_BLOCK_LABEL_1043;
        }
_L27:
        if (obj == null && j2 > 0)
        {
            obj2 = a(h, i1);
        } else
        {
            obj2 = obj;
        }
        if (obj2 == null) goto _L4; else goto _L3
_L3:
        i2 = i1 - 1;
        if (i2 >= 0)
        {
            obj = (ax)d.get(i2);
        } else
        {
            obj = null;
        }
        f3 = ((ax) (obj2)).d;
        j1 = h;
        f2 = 0.0F;
        l1 = j1 - 1;
        k1 = i1;
        obj3 = obj;
_L17:
        if (l1 < 0) goto _L6; else goto _L5
_L5:
        if (f2 < 2.0F - f3 || l1 >= l2) goto _L8; else goto _L7
_L7:
        if (obj3 != null) goto _L9; else goto _L6
_L6:
        f1 = ((ax) (obj2)).d;
        i1 = k1 + 1;
        if (f1 >= 2.0F) goto _L11; else goto _L10
_L10:
        if (i1 < d.size())
        {
            obj = (ax)d.get(i1);
        } else
        {
            obj = null;
        }
        j1 = h;
        j1++;
_L19:
        if (j1 >= j2) goto _L11; else goto _L12
_L12:
        if (f1 < 2.0F || j1 <= k2) goto _L14; else goto _L13
_L13:
        if (obj != null) goto _L15; else goto _L11
_L11:
        a(((ax) (obj2)), k1, ((ax) (obj1)));
_L4:
        obj1 = g;
        i1 = h;
        if (obj2 != null)
        {
            obj = ((ax) (obj2)).a;
        } else
        {
            obj = null;
        }
        ((x) (obj1)).b(this, i1, obj);
        g.b(this);
        j1 = getChildCount();
        for (i1 = 0; i1 < j1; i1++)
        {
            obj1 = getChildAt(i1);
            obj = (ay)((View) (obj1)).getLayoutParams();
            if (!((ay) (obj)).a && ((ay) (obj)).c == 0.0F)
            {
                obj1 = a(((View) (obj1)));
                if (obj1 != null)
                {
                    obj.c = ((ax) (obj1)).d;
                }
            }
        }

        continue; /* Loop/switch isn't completed */
_L2:
        i1++;
          goto _L16
_L9:
        obj = obj3;
        i1 = i2;
        f1 = f2;
        j1 = k1;
        if (l1 == ((ax) (obj3)).b)
        {
            obj = obj3;
            i1 = i2;
            f1 = f2;
            j1 = k1;
            if (!((ax) (obj3)).c)
            {
                d.remove(i2);
                g.a(this, l1, ((ax) (obj3)).a);
                i1 = i2 - 1;
                j1 = k1 - 1;
                if (i1 >= 0)
                {
                    obj = (ax)d.get(i1);
                    f1 = f2;
                } else
                {
                    obj = null;
                    f1 = f2;
                }
            }
        }
_L18:
        l1--;
        obj3 = obj;
        i2 = i1;
        f2 = f1;
        k1 = j1;
          goto _L17
_L8:
        if (obj3 != null && l1 == ((ax) (obj3)).b)
        {
            f1 = f2 + ((ax) (obj3)).d;
            i1 = i2 - 1;
            if (i1 >= 0)
            {
                obj = (ax)d.get(i1);
                j1 = k1;
            } else
            {
                obj = null;
                j1 = k1;
            }
        } else
        {
            f1 = f2 + a(l1, i2 + 1).d;
            j1 = k1 + 1;
            if (i2 >= 0)
            {
                obj = (ax)d.get(i2);
                i1 = i2;
            } else
            {
                obj = null;
                i1 = i2;
            }
        }
          goto _L18
_L15:
        if (j1 == ((ax) (obj)).b && !((ax) (obj)).c)
        {
            d.remove(i1);
            g.a(this, j1, ((ax) (obj)).a);
            if (i1 < d.size())
            {
                obj = (ax)d.get(i1);
            } else
            {
                obj = null;
            }
        }
_L20:
        j1++;
          goto _L19
_L14:
        if (obj != null && j1 == ((ax) (obj)).b)
        {
            f2 = ((ax) (obj)).d;
            i1++;
            if (i1 < d.size())
            {
                obj = (ax)d.get(i1);
            } else
            {
                obj = null;
            }
            f1 += f2;
        } else
        {
            obj = a(j1, i1);
            i1++;
            f2 = ((ax) (obj)).d;
            if (i1 < d.size())
            {
                obj = (ax)d.get(i1);
            } else
            {
                obj = null;
            }
            f1 += f2;
        }
          goto _L20
        if (!hasFocus()) goto _L22; else goto _L21
_L21:
        obj = findFocus();
        if (obj != null)
        {
            obj = b(((View) (obj)));
        } else
        {
            obj = null;
        }
        if (obj != null && ((ax) (obj)).b == h) goto _L22; else goto _L23
_L23:
        i1 = 0;
_L26:
        if (i1 >= getChildCount()) goto _L22; else goto _L24
_L24:
        obj = getChildAt(i1);
        obj1 = a(((View) (obj)));
        if (obj1 != null && ((ax) (obj1)).b == h && ((View) (obj)).requestFocus(2)) goto _L22; else goto _L25
_L25:
        i1++;
          goto _L26
        obj = null;
          goto _L27
    }

    protected void a(int i1, float f1, int j1)
    {
        int k1;
        int l1;
        int j3;
        int k3;
        int l3;
        int i4;
        if (U <= 0)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        k3 = getScrollX();
        k1 = getPaddingLeft();
        l1 = getPaddingRight();
        l3 = getWidth();
        i4 = getChildCount();
        j3 = 0;
_L2:
        View view;
        ay ay1;
        int i2;
        int j2;
        if (j3 >= i4)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        view = getChildAt(j3);
        ay1 = (ay)view.getLayoutParams();
        if (ay1.a)
        {
            break; /* Loop/switch isn't completed */
        }
        j2 = k1;
        i2 = l1;
_L7:
        j3++;
        k1 = j2;
        l1 = i2;
        if (true) goto _L2; else goto _L1
_L1:
        ay1.b & 7;
        JVM INSTR tableswitch 1 5: default 140
    //                   1 229
    //                   2 140
    //                   3 200
    //                   4 140
    //                   5 261;
           goto _L3 _L4 _L3 _L5 _L3 _L6
_L6:
        break MISSING_BLOCK_LABEL_261;
_L3:
        i2 = k1;
        j2 = l1;
        l1 = k1;
        k1 = j2;
_L8:
        int j4 = (i2 + k3) - view.getLeft();
        i2 = k1;
        j2 = l1;
        if (j4 != 0)
        {
            view.offsetLeftAndRight(j4);
            i2 = k1;
            j2 = l1;
        }
          goto _L7
_L5:
        i2 = view.getWidth();
        int k2 = i2 + k1;
        i2 = k1;
        k1 = l1;
        l1 = k2;
          goto _L8
_L4:
        i2 = Math.max((l3 - view.getMeasuredWidth()) / 2, k1);
        int l2 = k1;
        k1 = l1;
        l1 = l2;
          goto _L8
        i2 = l3 - l1 - view.getMeasuredWidth();
        int k4 = view.getMeasuredWidth();
        int i3 = k1;
        k1 = l1 + k4;
        l1 = i3;
          goto _L8
        if (W != null)
        {
            W.a(i1, f1, j1);
        }
        if (Z != null)
        {
            Z.a(i1, f1, j1);
        }
        T = true;
        return;
          goto _L7
    }

    void a(int i1, int j1, int k1)
    {
        if (getChildCount() == 0)
        {
            setScrollingCacheEnabled(false);
            return;
        }
        int l1 = getScrollX();
        int i2 = getScrollY();
        int j2 = i1 - l1;
        j1 -= i2;
        if (j2 == 0 && j1 == 0)
        {
            a(false);
            c();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        i1 = getWidth();
        int k2 = i1 / 2;
        float f5 = Math.min(1.0F, ((float)Math.abs(j2) * 1.0F) / (float)i1);
        float f1 = k2;
        float f3 = k2;
        f5 = a(f5);
        k1 = Math.abs(k1);
        if (k1 > 0)
        {
            i1 = Math.round(1000F * Math.abs((f3 * f5 + f1) / (float)k1)) * 4;
        } else
        {
            float f2 = i1;
            float f4 = g.a(h);
            i1 = (int)(((float)Math.abs(j2) / (f2 * f4 + (float)n) + 1.0F) * 100F);
        }
        i1 = Math.min(i1, 600);
        l.startScroll(l1, i2, j2, j1, i1);
        ad.b(this);
    }

    public void a(int i1, boolean flag)
    {
        x = false;
        a(i1, flag, false);
    }

    void a(int i1, boolean flag, boolean flag1)
    {
        a(i1, flag, flag1, 0);
    }

    void a(int i1, boolean flag, boolean flag1, int j1)
    {
        if (g != null && g.a() > 0) goto _L2; else goto _L1
_L1:
        setScrollingCacheEnabled(false);
_L8:
        return;
_L2:
        if (!flag1 && h == i1 && d.size() != 0)
        {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i1 >= 0) goto _L4; else goto _L3
_L3:
        int k1 = 0;
_L6:
        i1 = y;
        if (k1 > h + i1 || k1 < h - i1)
        {
            for (i1 = 0; i1 < d.size(); i1++)
            {
                ((ax)d.get(i1)).c = true;
            }

        }
        break; /* Loop/switch isn't completed */
_L4:
        k1 = i1;
        if (i1 >= g.a())
        {
            k1 = g.a() - 1;
        }
        if (true) goto _L6; else goto _L5
_L5:
        ax ax1;
        int l1;
        if (h != k1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        a(k1);
        ax1 = b(k1);
        if (ax1 != null)
        {
            float f1 = getWidth();
            l1 = (int)(Math.max(r, Math.min(ax1.e, s)) * f1);
        } else
        {
            l1 = 0;
        }
        if (flag)
        {
            a(l1, 0, j1);
            if (i1 != 0 && W != null)
            {
                W.a(k1);
            }
            if (i1 != 0 && Z != null)
            {
                Z.a(k1);
                return;
            }
        } else
        {
            if (i1 != 0 && W != null)
            {
                W.a(k1);
            }
            if (i1 != 0 && Z != null)
            {
                Z.a(k1);
            }
            a(false);
            scrollTo(l1, 0);
            return;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public boolean a(KeyEvent keyevent)
    {
        if (keyevent.getAction() != 0) goto _L2; else goto _L1
_L1:
        keyevent.getKeyCode();
        JVM INSTR lookupswitch 3: default 44
    //                   21: 46
    //                   22: 53
    //                   61: 60;
           goto _L2 _L3 _L4 _L5
_L2:
        return false;
_L3:
        return c(17);
_L4:
        return c(66);
_L5:
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            if (android.support.v4.view.n.a(keyevent))
            {
                return c(2);
            }
            if (android.support.v4.view.n.a(keyevent, 1))
            {
                return c(1);
            }
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    protected boolean a(View view, boolean flag, int i1, int j1, int k1)
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
        if (flag && android.support.v4.view.ad.a(view, -i1)) goto _L4; else goto _L6
_L6:
        return false;
        if (true) goto _L8; else goto _L7
_L7:
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
                    ax ax1 = a(view);
                    if (ax1 != null && ax1.b == h)
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
            ax ax1 = a(view);
            if (ax1 != null && ax1.b == h)
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
        ay ay1 = (ay)layoutparams;
        ay1.a = ay1.a | (view instanceof aw);
        if (v)
        {
            if (ay1 != null && ay1.a)
            {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            } else
            {
                ay1.d = true;
                addViewInLayout(view, i1, layoutparams);
                return;
            }
        } else
        {
            super.addView(view, i1, layoutparams);
            return;
        }
    }

    ax b(int i1)
    {
        for (int j1 = 0; j1 < d.size(); j1++)
        {
            ax ax1 = (ax)d.get(j1);
            if (ax1.b == i1)
            {
                return ax1;
            }
        }

        return null;
    }

    ax b(View view)
    {
        do
        {
            android.view.ViewParent viewparent = view.getParent();
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

    void b()
    {
        int i1;
        int j1;
        int k1;
        int l1;
        boolean flag;
        if (d.size() < y * 2 + 1 && d.size() < g.a())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        j1 = h;
        k1 = 0;
        flag = false;
        l1 = i1;
        i1 = j1;
        j1 = k1;
        k1 = ((flag) ? 1 : 0);
        while (k1 < d.size()) 
        {
            Object obj = (ax)d.get(k1);
            int i2 = g.a(((ax) (obj)).a);
            int k2;
            if (i2 == -1)
            {
                i2 = k1;
                int j2 = j1;
                k1 = l1;
                j1 = i1;
                i1 = j2;
                l1 = i2;
            } else
            if (i2 == -2)
            {
                d.remove(k1);
                l1 = k1 - 1;
                k1 = j1;
                if (j1 == 0)
                {
                    g.a(this);
                    k1 = 1;
                }
                g.a(this, ((ax) (obj)).b, ((ax) (obj)).a);
                int l2;
                if (h == ((ax) (obj)).b)
                {
                    j1 = Math.max(0, Math.min(h, g.a() - 1));
                    i1 = k1;
                    k1 = 1;
                } else
                {
                    j1 = i1;
                    boolean flag1 = true;
                    i1 = k1;
                    k1 = ((flag1) ? 1 : 0);
                }
            } else
            if (((ax) (obj)).b != i2)
            {
                if (((ax) (obj)).b == h)
                {
                    i1 = i2;
                }
                obj.b = i2;
                i2 = i1;
                l2 = 1;
                l1 = k1;
                i1 = j1;
                j1 = i2;
                k1 = l2;
            } else
            {
                i2 = i1;
                l2 = l1;
                l1 = k1;
                i1 = j1;
                j1 = i2;
                k1 = l2;
            }
            i2 = k1;
            k2 = j1;
            k1 = l1 + 1;
            j1 = i1;
            i1 = k2;
            l1 = i2;
        }
        if (j1 != 0)
        {
            g.b(this);
        }
        Collections.sort(d, b);
        if (l1 != 0)
        {
            k1 = getChildCount();
            for (j1 = 0; j1 < k1; j1++)
            {
                obj = (ay)getChildAt(j1).getLayoutParams();
                if (!((ay) (obj)).a)
                {
                    obj.c = 0.0F;
                }
            }

            a(i1, false, true);
            requestLayout();
        }
    }

    public void b(float f1)
    {
        if (!N)
        {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        F = F + f1;
        float f3 = (float)getScrollX() - f1;
        int i1 = getWidth();
        f1 = i1;
        float f5 = r;
        float f2 = i1;
        float f4 = s;
        Object obj = (ax)d.get(0);
        ax ax1 = (ax)d.get(d.size() - 1);
        long l1;
        if (((ax) (obj)).b != 0)
        {
            f1 = ((ax) (obj)).e * (float)i1;
        } else
        {
            f1 *= f5;
        }
        if (ax1.b != g.a() - 1)
        {
            f2 = ax1.e * (float)i1;
        } else
        {
            f2 *= f4;
        }
        if (f3 >= f1)
        {
            if (f3 > f2)
            {
                f1 = f2;
            } else
            {
                f1 = f3;
            }
        }
        F = F + (f1 - (float)(int)f1);
        scrollTo((int)f1, getScrollY());
        d((int)f1);
        l1 = SystemClock.uptimeMillis();
        obj = MotionEvent.obtain(O, l1, 2, F, 0.0F, 0);
        I.addMovement(((MotionEvent) (obj)));
        ((MotionEvent) (obj)).recycle();
    }

    void c()
    {
        a(h);
    }

    public boolean c(int i1)
    {
        View view;
        View view1;
        view1 = findFocus();
        view = view1;
        if (view1 == this)
        {
            view = null;
        }
        view1 = FocusFinder.getInstance().findNextFocus(this, view, i1);
        if (view1 == null || view1 == view) goto _L2; else goto _L1
_L1:
        if (i1 != 17) goto _L4; else goto _L3
_L3:
        boolean flag;
        int j1 = a(f, view1).left;
        int l1 = a(f, view).left;
        if (view != null && j1 >= l1)
        {
            flag = g();
        } else
        {
            flag = view1.requestFocus();
        }
_L7:
        if (flag)
        {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i1));
        }
        return flag;
_L4:
        if (i1 == 66)
        {
            int k1 = a(f, view1).left;
            int i2 = a(f, view).left;
            if (view != null && k1 <= i2)
            {
                flag = h();
            } else
            {
                flag = view1.requestFocus();
            }
            continue; /* Loop/switch isn't completed */
        }
          goto _L5
_L2:
        if (i1 == 17 || i1 == 1)
        {
            flag = g();
            continue; /* Loop/switch isn't completed */
        }
        if (i1 == 66 || i1 == 2)
        {
            flag = h();
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag = false;
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof ay) && super.checkLayoutParams(layoutparams);
    }

    public void computeScroll()
    {
        if (!l.isFinished() && l.computeScrollOffset())
        {
            int i1 = getScrollX();
            int j1 = getScrollY();
            int k1 = l.getCurrX();
            int l1 = l.getCurrY();
            if (i1 != k1 || j1 != l1)
            {
                scrollTo(k1, l1);
                if (!d(k1))
                {
                    l.abortAnimation();
                    scrollTo(0, l1);
                }
            }
            ad.b(this);
            return;
        } else
        {
            a(true);
            return;
        }
    }

    public boolean d()
    {
        if (z)
        {
            return false;
        }
        N = true;
        setScrollState(1);
        F = 0.0F;
        E = 0.0F;
        MotionEvent motionevent;
        long l1;
        if (I == null)
        {
            I = VelocityTracker.obtain();
        } else
        {
            I.clear();
        }
        l1 = SystemClock.uptimeMillis();
        motionevent = MotionEvent.obtain(l1, l1, 0, 0.0F, 0.0F, 0);
        I.addMovement(motionevent);
        motionevent.recycle();
        O = l1;
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        return super.dispatchKeyEvent(keyevent) || a(keyevent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        boolean flag1 = false;
        int j1 = getChildCount();
        int i1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i1 < j1)
                {
                    View view = getChildAt(i1);
                    if (view.getVisibility() != 0)
                    {
                        break label0;
                    }
                    ax ax1 = a(view);
                    if (ax1 == null || ax1.b != h || !view.dispatchPopulateAccessibilityEvent(accessibilityevent))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i1++;
        } while (true);
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        int j1 = 0;
        int i1 = 0;
        int k1 = android.support.v4.view.ad.a(this);
        if (k1 == 0 || k1 == 1 && g != null && g.a() > 1)
        {
            if (!P.a())
            {
                j1 = canvas.save();
                i1 = getHeight() - getPaddingTop() - getPaddingBottom();
                int l1 = getWidth();
                canvas.rotate(270F);
                canvas.translate(-i1 + getPaddingTop(), r * (float)l1);
                P.a(i1, l1);
                i1 = false | P.a(canvas);
                canvas.restoreToCount(j1);
            }
            j1 = i1;
            if (!Q.a())
            {
                int i2 = canvas.save();
                j1 = getWidth();
                int j2 = getHeight();
                int k2 = getPaddingTop();
                int l2 = getPaddingBottom();
                canvas.rotate(90F);
                canvas.translate(-getPaddingTop(), -(s + 1.0F) * (float)j1);
                Q.a(j2 - k2 - l2, j1);
                j1 = i1 | Q.a(canvas);
                canvas.restoreToCount(i2);
            }
        } else
        {
            P.b();
            Q.b();
        }
        if (j1 != 0)
        {
            ad.b(this);
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        Drawable drawable = o;
        if (drawable != null && drawable.isStateful())
        {
            drawable.setState(getDrawableState());
        }
    }

    public void e()
    {
        if (!N)
        {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        } else
        {
            Object obj = I;
            ((VelocityTracker) (obj)).computeCurrentVelocity(1000, K);
            int i1 = (int)android.support.v4.view.y.a(((VelocityTracker) (obj)), H);
            x = true;
            int j1 = getWidth();
            int k1 = getScrollX();
            obj = k();
            a(a(((ax) (obj)).b, ((float)k1 / (float)j1 - ((ax) (obj)).e) / ((ax) (obj)).d, i1, (int)(F - E)), true, true, i1);
            l();
            N = false;
            return;
        }
    }

    public boolean f()
    {
        return N;
    }

    boolean g()
    {
        if (h > 0)
        {
            a(h - 1, true);
            return true;
        } else
        {
            return false;
        }
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new ay();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new ay(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return generateDefaultLayoutParams();
    }

    public x getAdapter()
    {
        return g;
    }

    public int getCurrentItem()
    {
        return h;
    }

    public int getOffscreenPageLimit()
    {
        return y;
    }

    public int getPageMargin()
    {
        return n;
    }

    boolean h()
    {
        if (g != null && h < g.a() - 1)
        {
            a(h + 1, true);
            return true;
        } else
        {
            return false;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        R = true;
    }

    protected void onDetachedFromWindow()
    {
        removeCallbacks(ab);
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (n <= 0 || o == null || d.size() <= 0 || g == null) goto _L2; else goto _L1
_L1:
        float f1;
        float f3;
        Object obj;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        k1 = getScrollX();
        l1 = getWidth();
        f3 = (float)n / (float)l1;
        obj = (ax)d.get(0);
        f1 = ((ax) (obj)).e;
        i2 = d.size();
        i1 = ((ax) (obj)).b;
        j2 = ((ax)d.get(i2 - 1)).b;
        j1 = 0;
_L6:
        if (i1 >= j2) goto _L2; else goto _L3
_L3:
        for (; i1 > ((ax) (obj)).b && j1 < i2; obj = (ax)((ArrayList) (obj)).get(j1))
        {
            obj = d;
            j1++;
        }

        float f2;
        if (i1 == ((ax) (obj)).b)
        {
            f2 = (((ax) (obj)).e + ((ax) (obj)).d) * (float)l1;
            f1 = ((ax) (obj)).e + ((ax) (obj)).d + f3;
        } else
        {
            float f4 = g.a(i1);
            f2 = (f1 + f4) * (float)l1;
            f1 += f4 + f3;
        }
        if ((float)n + f2 > (float)k1)
        {
            o.setBounds((int)f2, p, (int)((float)n + f2 + 0.5F), q);
            o.draw(canvas);
        }
        if (f2 <= (float)(k1 + l1)) goto _L4; else goto _L2
_L2:
        return;
_L4:
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1 = motionevent.getAction() & 0xff;
        if (i1 != 3 && i1 != 1) goto _L2; else goto _L1
_L1:
        z = false;
        A = false;
        H = -1;
        if (I != null)
        {
            I.recycle();
            I = null;
        }
_L4:
        return false;
_L2:
        if (i1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (z)
        {
            return true;
        }
        if (A) goto _L4; else goto _L3
_L3:
        i1;
        JVM INSTR lookupswitch 3: default 116
    //                   0: 371
    //                   2: 143
    //                   6: 491;
           goto _L5 _L6 _L7 _L8
_L5:
        if (I == null)
        {
            I = VelocityTracker.obtain();
        }
        I.addMovement(motionevent);
        return z;
_L7:
        float f1;
        float f3;
        float f4;
        float f6;
        int j1 = H;
        if (j1 == -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        j1 = android.support.v4.view.s.a(motionevent, j1);
        f3 = android.support.v4.view.s.c(motionevent, j1);
        f1 = f3 - F;
        f4 = Math.abs(f1);
        float f5 = android.support.v4.view.s.d(motionevent, j1);
        f6 = Math.abs(f5 - G);
        if (f1 != 0.0F && !a(F, f1) && a(this, false, (int)f1, (int)f3, (int)f5))
        {
            F = f3;
            E = f3;
            G = f5;
            A = true;
            return false;
        }
        if (f4 <= (float)D || f4 <= f6) goto _L10; else goto _L9
_L9:
        z = true;
        setScrollState(1);
        if (f1 > 0.0F)
        {
            f1 = E + (float)D;
        } else
        {
            f1 = E - (float)D;
        }
        F = f1;
        setScrollingCacheEnabled(true);
_L11:
        if (z && c(f3))
        {
            ad.b(this);
        }
        continue; /* Loop/switch isn't completed */
_L10:
        if (f6 > (float)D)
        {
            A = true;
        }
        if (true) goto _L11; else goto _L6
_L6:
        float f2 = motionevent.getX();
        E = f2;
        F = f2;
        G = motionevent.getY();
        H = android.support.v4.view.s.b(motionevent, 0);
        A = false;
        l.computeScrollOffset();
        if (ac == 2 && Math.abs(l.getFinalX() - l.getCurrX()) > M)
        {
            l.abortAnimation();
            x = false;
            c();
            z = true;
            setScrollState(1);
        } else
        {
            a(false);
            z = false;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        a(motionevent);
        if (true) goto _L5; else goto _L12
_L12:
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int j2;
        int j3;
        int l4;
        int i5;
        int j5;
        int k5;
        v = true;
        c();
        v = false;
        l4 = getChildCount();
        i5 = k1 - i1;
        j5 = l1 - j1;
        j1 = getPaddingLeft();
        i1 = getPaddingTop();
        l1 = getPaddingRight();
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
        ay ay1 = (ay)view.getLayoutParams();
        if (!ay1.a) goto _L4; else goto _L5
_L5:
        int i2;
        int l5;
        i2 = ay1.b;
        l5 = ay1.b;
        i2 & 7;
        JVM INSTR tableswitch 1 5: default 164
    //                   1 312
    //                   2 164
    //                   3 293
    //                   4 164
    //                   5 334;
           goto _L6 _L7 _L6 _L8 _L6 _L9
_L6:
        int k2;
        i2 = j1;
        k2 = j1;
_L15:
        l5 & 0x70;
        JVM INSTR lookupswitch 3: default 208
    //                   16: 402
    //                   48: 375
    //                   80: 430;
           goto _L10 _L11 _L12 _L13
_L10:
        int k3 = i1;
        j1 = i1;
        i1 = k1;
        k1 = k3;
_L16:
        i2 += k5;
        view.layout(i2, k1, view.getMeasuredWidth() + i2, view.getMeasuredHeight() + k1);
        j2++;
        k1 = k2;
        i2 = i1;
        i1 = j2;
_L17:
        j3++;
        k2 = k1;
        j2 = i1;
        i1 = j1;
        k1 = i2;
        j1 = k2;
          goto _L14
_L8:
        k2 = view.getMeasuredWidth();
        i2 = j1;
        k2 += j1;
          goto _L15
_L7:
        i2 = Math.max((i5 - view.getMeasuredWidth()) / 2, j1);
        k2 = j1;
          goto _L15
_L9:
        k2 = view.getMeasuredWidth();
        i2 = l1 + view.getMeasuredWidth();
        int l3 = i5 - l1 - k2;
        l1 = i2;
        k2 = j1;
        i2 = l3;
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
        int j4 = Math.max((j5 - view.getMeasuredHeight()) / 2, i1);
        j1 = i1;
        i1 = k1;
        k1 = j4;
          goto _L16
_L13:
        int k4 = j5 - k1 - view.getMeasuredHeight();
        int i6 = view.getMeasuredHeight();
        j1 = i1;
        i1 = k1 + i6;
        k1 = k4;
          goto _L16
_L2:
        for (i2 = 0; i2 < l4; i2++)
        {
            View view1 = getChildAt(i2);
            if (view1.getVisibility() == 8)
            {
                continue;
            }
            ay ay2 = (ay)view1.getLayoutParams();
            if (ay2.a)
            {
                continue;
            }
            ax ax1 = a(view1);
            if (ax1 == null)
            {
                continue;
            }
            float f1 = i5;
            int l2 = (int)(ax1.e * f1) + j1;
            if (ay2.d)
            {
                ay2.d = false;
                float f2 = i5 - j1 - l1;
                view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)(ay2.c * f2), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j5 - i1 - k1, 0x40000000));
            }
            view1.layout(l2, i1, view1.getMeasuredWidth() + l2, view1.getMeasuredHeight() + i1);
        }

        p = i1;
        q = j5 - k1;
        U = j2;
        R = false;
        return;
_L4:
        i2 = j2;
        j2 = i1;
        int i3 = j1;
        i1 = i2;
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
            C = Math.min(i1 / 10, B);
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
                        ay ay1 = (ay)view.getLayoutParams();
                        k1 = i1;
                        l1 = j1;
                        if (ay1 == null)
                        {
                            break label1;
                        }
                        k1 = i1;
                        l1 = j1;
                        if (!ay1.a)
                        {
                            break label1;
                        }
                        k1 = ay1.b & 7;
                        int j2 = ay1.b & 0x70;
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
                        if (ay1.width != -2)
                        {
                            k2 = 0x40000000;
                            float f1;
                            int l2;
                            int i3;
                            if (ay1.width != -1)
                            {
                                k1 = ay1.width;
                            } else
                            {
                                k1 = i1;
                            }
                        } else
                        {
                            k2 = k1;
                            k1 = i1;
                        }
                        if (ay1.height == -2)
                        {
                            break label0;
                        }
                        l2 = 0x40000000;
                        l1 = l2;
                        if (ay1.height == -1)
                        {
                            break label0;
                        }
                        i3 = ay1.height;
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
            t = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
            u = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000);
            v = true;
            c();
            v = false;
            k1 = getChildCount();
            for (j1 = 0; j1 < k1; j1++)
            {
                view = getChildAt(j1);
                if (view.getVisibility() == 8)
                {
                    continue;
                }
                ay1 = (ay)view.getLayoutParams();
                if (ay1 == null || !ay1.a)
                {
                    f1 = i1;
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)(ay1.c * f1), 0x40000000), u);
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
            ax ax1 = a(view);
            if (ax1 != null && ax1.b == h && view.requestFocus(i1, rect))
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
        if (g != null)
        {
            g.a(((SavedState) (parcelable)).b, ((SavedState) (parcelable)).c);
            a(((SavedState) (parcelable)).a, false, true);
            return;
        } else
        {
            i = ((SavedState) (parcelable)).a;
            j = ((SavedState) (parcelable)).b;
            k = ((SavedState) (parcelable)).c;
            return;
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = h;
        if (g != null)
        {
            savedstate.b = g.b();
        }
        return savedstate;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (i1 != k1)
        {
            a(i1, k1, n, n);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1;
        int j1;
        j1 = 0;
        if (N)
        {
            return true;
        }
        if (motionevent.getAction() == 0 && motionevent.getEdgeFlags() != 0)
        {
            return false;
        }
        if (g == null || g.a() == 0)
        {
            return false;
        }
        if (I == null)
        {
            I = VelocityTracker.obtain();
        }
        I.addMovement(motionevent);
        i1 = j1;
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 6: default 124
    //                   0 139
    //                   1 360
    //                   2 203
    //                   3 514
    //                   4 128
    //                   5 568
    //                   6 601;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L6:
        break; /* Loop/switch isn't completed */
_L1:
        i1 = j1;
_L10:
        if (i1 != 0)
        {
            ad.b(this);
        }
        return true;
_L2:
        l.abortAnimation();
        x = false;
        c();
        if (V)
        {
            z = true;
            setScrollState(1);
        }
        float f1 = motionevent.getX();
        E = f1;
        F = f1;
        H = android.support.v4.view.s.b(motionevent, 0);
        i1 = j1;
        continue; /* Loop/switch isn't completed */
_L4:
        if (!z)
        {
            i1 = android.support.v4.view.s.a(motionevent, H);
            float f2 = android.support.v4.view.s.c(motionevent, i1);
            float f3 = Math.abs(f2 - F);
            float f4 = Math.abs(android.support.v4.view.s.d(motionevent, i1) - G);
            if (f3 > (float)D && f3 > f4)
            {
                z = true;
                if (f2 - E > 0.0F)
                {
                    f2 = E + (float)D;
                } else
                {
                    f2 = E - (float)D;
                }
                F = f2;
                setScrollState(1);
                setScrollingCacheEnabled(true);
            }
        }
        i1 = j1;
        if (z)
        {
            i1 = false | c(android.support.v4.view.s.c(motionevent, android.support.v4.view.s.a(motionevent, H)));
        }
        continue; /* Loop/switch isn't completed */
_L3:
        i1 = j1;
        if (z)
        {
            Object obj = I;
            ((VelocityTracker) (obj)).computeCurrentVelocity(1000, K);
            i1 = (int)android.support.v4.view.y.a(((VelocityTracker) (obj)), H);
            x = true;
            j1 = getWidth();
            int k1 = getScrollX();
            obj = k();
            a(a(((ax) (obj)).b, ((float)k1 / (float)j1 - ((ax) (obj)).e) / ((ax) (obj)).d, i1, (int)(android.support.v4.view.s.c(motionevent, android.support.v4.view.s.a(motionevent, H)) - E)), true, true, i1);
            H = -1;
            l();
            boolean flag = P.c();
            i1 = Q.c() | flag;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        i1 = j1;
        if (z)
        {
            a(h, true, true);
            H = -1;
            l();
            boolean flag1 = P.c();
            i1 = Q.c() | flag1;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        i1 = android.support.v4.view.s.a(motionevent);
        F = android.support.v4.view.s.c(motionevent, i1);
        H = android.support.v4.view.s.b(motionevent, i1);
        i1 = j1;
        continue; /* Loop/switch isn't completed */
_L8:
        a(motionevent);
        F = android.support.v4.view.s.c(motionevent, android.support.v4.view.s.a(motionevent, H));
        i1 = j1;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void setAdapter(x x1)
    {
        if (g != null)
        {
            g.b(m);
            g.a(this);
            for (int i1 = 0; i1 < d.size(); i1++)
            {
                ax ax1 = (ax)d.get(i1);
                g.a(this, ax1.b, ax1.a);
            }

            g.b(this);
            d.clear();
            j();
            h = 0;
            scrollTo(0, 0);
        }
        x x2 = g;
        g = x1;
        if (g != null)
        {
            if (m == null)
            {
                m = new bc(this, null);
            }
            g.a(m);
            x = false;
            R = true;
            if (i >= 0)
            {
                g.a(j, k);
                a(i, false, true);
                i = -1;
                j = null;
                k = null;
            } else
            {
                c();
            }
        }
        if (aa != null && x2 != x1)
        {
            aa.a(x2, x1);
        }
    }

    public void setCurrentItem(int i1)
    {
        x = false;
        boolean flag;
        if (!R)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(i1, flag, false);
    }

    protected void setIgnoreTouchSlop(boolean flag)
    {
        V = flag;
    }

    public void setOffscreenPageLimit(int i1)
    {
        int j1 = i1;
        if (i1 < 1)
        {
            Log.w("ViewPager", (new StringBuilder()).append("Requested offscreen page limit ").append(i1).append(" too small; defaulting to ").append(1).toString());
            j1 = 1;
        }
        if (j1 != y)
        {
            y = j1;
            c();
        }
    }

    void setOnAdapterChangeListener(ba ba1)
    {
        aa = ba1;
    }

    public void setOnPageChangeListener(bb bb1)
    {
        W = bb1;
    }

    public void setPageMargin(int i1)
    {
        int j1 = n;
        n = i1;
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
        o = drawable;
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

    protected boolean verifyDrawable(Drawable drawable)
    {
        return super.verifyDrawable(drawable) || drawable == o;
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = android.support.v4.b.a.a(new bd());
        int a;
        Parcelable b;
        ClassLoader c;

        public String toString()
        {
            return (new StringBuilder()).append("FragmentPager.SavedState{").append(Integer.toHexString(System.identityHashCode(this))).append(" position=").append(a).append("}").toString();
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

}
