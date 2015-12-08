// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.widget.m;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Referenced classes of package android.support.v4.view:
//            ck, cl, cq, bp, 
//            cn, bj, ay, cm, 
//            z, bl, co

public final class ViewPager extends ViewGroup
{

    private static final int a[] = {
        0x10100b3
    };
    private static final cq ac = new cq();
    private static final Comparator c = new ck();
    private static final Interpolator d = new cl();
    private boolean A;
    private int B;
    private int C;
    private int D;
    private float E;
    private float F;
    private float G;
    private float H;
    private int I;
    private VelocityTracker J;
    private int K;
    private int L;
    private int M;
    private int N;
    private boolean O;
    private m P;
    private m Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private int U;
    private List V;
    private co W;
    private int aa;
    private ArrayList ab;
    private final Runnable ad;
    private int ae;
    private int b;
    private final ArrayList e;
    private final cn f;
    private final Rect g;
    private bj h;
    private int i;
    private int j;
    private Parcelable k;
    private ClassLoader l;
    private Scroller m;
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

    private cn a(View view)
    {
        do
        {
            view = view.getParent();
            if (view != this)
            {
                if (view == null || !(view instanceof View))
                {
                    return null;
                }
                view = (View)view;
            } else
            {
                return e();
            }
        } while (true);
    }

    private void a(int i1)
    {
        boolean flag = false;
        if (ae != i1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ae = i1;
        if (W != null)
        {
            int j1;
            int l1;
            if (i1 != 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            l1 = getChildCount();
            j1 = 0;
            while (j1 < l1) 
            {
                byte byte0;
                if (i1 != 0)
                {
                    byte0 = 2;
                } else
                {
                    byte0 = 0;
                }
                bp.a(getChildAt(j1), byte0, null);
                j1++;
            }
        }
        if (V != null)
        {
            int k1 = V.size();
            i1 = ((flag) ? 1 : 0);
            while (i1 < k1) 
            {
                V.get(i1);
                i1++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void a(int i1, boolean flag, int j1, boolean flag1)
    {
        cn cn1 = e(i1);
        i1 = 0;
        if (cn1 != null)
        {
            i1 = (int)((float)b() * Math.max(r, Math.min(cn1.d, s)));
        }
        if (flag)
        {
            if (getChildCount() == 0)
            {
                b(false);
            } else
            {
                int k1 = getScrollX();
                int l1 = getScrollY();
                int i2 = i1 - k1;
                int j2 = 0 - l1;
                if (i2 == 0 && j2 == 0)
                {
                    a(false);
                    c();
                    a(0);
                } else
                {
                    b(true);
                    a(2);
                    i1 = b();
                    int k2 = i1 / 2;
                    float f4 = Math.min(1.0F, (1.0F * (float)Math.abs(i2)) / (float)i1);
                    float f1 = k2;
                    float f3 = k2;
                    f4 = (float)Math.sin((float)((double)(f4 - 0.5F) * 0.4712389167638204D));
                    j1 = Math.abs(j1);
                    if (j1 > 0)
                    {
                        i1 = Math.round(1000F * Math.abs((f3 * f4 + f1) / (float)j1)) * 4;
                    } else
                    {
                        float f2 = i1;
                        i1 = (int)(((float)Math.abs(i2) / (f2 * 1.0F + (float)n) + 1.0F) * 100F);
                    }
                    i1 = Math.min(i1, 600);
                    m.startScroll(k1, l1, i2, j2, i1);
                    bp.d(this);
                }
            }
        } else
        {
            if (flag1)
            {
                h();
            }
            a(false);
            scrollTo(i1, 0);
            f();
            return;
        }
        if (flag1)
        {
            h();
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
        if (h == null || h.a() <= 0)
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
        i1 = y;
        if (k1 > i + i1 || k1 < i - i1)
        {
            for (i1 = 0; i1 < e.size(); i1++)
            {
                ((cn)e.get(i1)).b = true;
            }

        }
        break; /* Loop/switch isn't completed */
_L2:
        k1 = i1;
        if (i1 >= h.a())
        {
            k1 = h.a() - 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        flag1 = flag2;
        if (i != k1)
        {
            flag1 = true;
        }
        if (R)
        {
            i = k1;
            if (flag1)
            {
                h();
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

    private void a(cn cn1, int i1, cn cn2)
    {
        int j2 = h.a();
        int j1 = b();
        float f4;
        if (j1 > 0)
        {
            f4 = (float)n / (float)j1;
        } else
        {
            f4 = 0.0F;
        }
        if (cn2 != null)
        {
            j1 = cn2.a;
            if (j1 < cn1.a)
            {
                float f1 = cn2.d + cn2.c + f4;
                int k1 = 0;
                for (j1++; j1 <= cn1.a && k1 < e.size(); j1++)
                {
                    for (cn2 = (cn)e.get(k1); j1 > cn2.a && k1 < e.size() - 1; cn2 = (cn)e.get(k1))
                    {
                        k1++;
                    }

                    while (j1 < cn2.a) 
                    {
                        j1++;
                        f1 = 1.0F + f4 + f1;
                    }
                    cn2.d = f1;
                    f1 += cn2.c + f4;
                }

            } else
            if (j1 > cn1.a)
            {
                int l1 = e.size();
                float f2 = cn2.d;
                l1--;
                for (j1--; j1 >= cn1.a && l1 >= 0; j1--)
                {
                    for (cn2 = (cn)e.get(l1); j1 < cn2.a && l1 > 0; cn2 = (cn)e.get(l1))
                    {
                        l1--;
                    }

                    while (j1 > cn2.a) 
                    {
                        j1--;
                        f2 -= 1.0F + f4;
                    }
                    f2 -= cn2.c + f4;
                    cn2.d = f2;
                }

            }
        }
        int k2 = e.size();
        float f5 = cn1.d;
        j1 = cn1.a - 1;
        float f3;
        int i2;
        if (cn1.a == 0)
        {
            f3 = cn1.d;
        } else
        {
            f3 = -3.402823E+38F;
        }
        r = f3;
        if (cn1.a == j2 - 1)
        {
            f3 = (cn1.d + cn1.c) - 1.0F;
        } else
        {
            f3 = 3.402823E+38F;
        }
        s = f3;
        i2 = i1 - 1;
        f3 = f5;
        for (; i2 >= 0; i2--)
        {
            for (cn2 = (cn)e.get(i2); j1 > cn2.a;)
            {
                j1--;
                f3 -= 1.0F + f4;
            }

            f3 -= cn2.c + f4;
            cn2.d = f3;
            if (cn2.a == 0)
            {
                r = f3;
            }
            j1--;
        }

        f3 = cn1.d + cn1.c + f4;
        i2 = cn1.a + 1;
        j1 = i1 + 1;
        i1 = i2;
        for (; j1 < k2; j1++)
        {
            for (cn1 = (cn)e.get(j1); i1 < cn1.a;)
            {
                i1++;
                f3 += 1.0F + f4;
            }

            if (cn1.a == j2 - 1)
            {
                s = (cn1.c + f3) - 1.0F;
            }
            cn1.d = f3;
            f3 += cn1.c + f4;
            i1++;
        }

        S = false;
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = ay.b(motionevent);
        if (ay.b(motionevent, i1) == I)
        {
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            E = ay.c(motionevent, i1);
            I = ay.b(motionevent, i1);
            if (J != null)
            {
                J.clear();
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
            if (ae == 2)
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
                        f();
                    }
                }
            }
            x = false;
            flag2 = false;
            flag1 = i1;
            for (i1 = ((flag2) ? 1 : 0); i1 < e.size(); i1++)
            {
                cn cn1 = (cn)e.get(i1);
                if (cn1.b)
                {
                    cn1.b = false;
                    flag1 = true;
                }
            }

            if (flag1)
            {
                if (!flag)
                {
                    break label0;
                }
                bp.a(this, ad);
            }
            return;
        }
        ad.run();
    }

    private boolean a(float f1)
    {
        boolean flag1 = true;
        boolean flag3 = false;
        boolean flag2 = false;
        float f2 = E;
        E = f1;
        float f3 = (float)getScrollX() + (f2 - f1);
        int i1 = b();
        f1 = (float)i1 * r;
        f2 = i1;
        float f4 = s;
        cn cn1 = (cn)e.get(0);
        cn cn2 = (cn)e.get(e.size() - 1);
        boolean flag;
        if (cn1.a != 0)
        {
            f1 = cn1.d * (float)i1;
            flag = false;
        } else
        {
            flag = true;
        }
        if (cn2.a != h.a() - 1)
        {
            f2 = cn2.d * (float)i1;
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
        E = E + (f2 - (float)(int)f2);
        scrollTo((int)f2, getScrollY());
        f();
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
        if (flag && bp.a(view, -i1)) goto _L4; else goto _L6
_L6:
        return false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static int[] a()
    {
        return a;
    }

    private int b()
    {
        return getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
    }

    private void b(int i1)
    {
        x = false;
        a(i1, true, false);
    }

    private void b(boolean flag)
    {
        if (w != flag)
        {
            w = flag;
        }
    }

    private static cn c(int i1)
    {
        (new cn()).a = i1;
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    private void c()
    {
        d(i);
    }

    private void d()
    {
        if (aa != 0)
        {
            int j1;
            if (ab == null)
            {
                ab = new ArrayList();
            } else
            {
                ab.clear();
            }
            j1 = getChildCount();
            for (int i1 = 0; i1 < j1; i1++)
            {
                View view = getChildAt(i1);
                ab.add(view);
            }

            Collections.sort(ab, ac);
        }
    }

    private void d(int i1)
    {
        float f1;
        float f5;
        Object obj;
        cn cn1;
        Object obj1;
        Object obj2;
        int j1;
        byte byte1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
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
            cn1 = e(i);
            i = i1;
            byte1 = byte0;
        } else
        {
            cn1 = null;
            byte1 = 2;
        }
        if (h != null) goto _L2; else goto _L1
_L1:
        d();
_L4:
        return;
_L2:
        if (x)
        {
            d();
            return;
        }
        if (getWindowToken() == null) goto _L4; else goto _L3
_L3:
        i1 = y;
        j3 = Math.max(0, i - i1);
        l2 = h.a();
        i3 = Math.min(l2 - 1, i1 + i);
        if (l2 != b)
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
            throw new IllegalStateException((new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ")).append(b).append(", found: ").append(l2).append(" Pager id: ").append(s1).append(" Pager class: ").append(getClass()).append(" Problematic adapter: ").append(h.getClass()).toString());
        }
        i1 = 0;
_L14:
        if (i1 >= e.size())
        {
            break MISSING_BLOCK_LABEL_1175;
        }
        obj = (cn)e.get(i1);
        if (((cn) (obj)).a < i) goto _L6; else goto _L5
_L5:
        if (((cn) (obj)).a != i)
        {
            break MISSING_BLOCK_LABEL_1175;
        }
_L21:
        if (obj == null && l2 > 0)
        {
            obj1 = c(i);
        } else
        {
            obj1 = obj;
        }
        if (obj1 == null) goto _L8; else goto _L7
_L7:
        k2 = i1 - 1;
        float f3;
        if (k2 >= 0)
        {
            obj = (cn)e.get(k2);
        } else
        {
            obj = null;
        }
        k3 = b();
        if (k3 <= 0)
        {
            f3 = 0.0F;
        } else
        {
            f3 = (2.0F - ((cn) (obj1)).c) + (float)getPaddingLeft() / (float)k3;
        }
        j1 = i;
        f5 = 0.0F;
        j2 = j1 - 1;
        i2 = i1;
        obj2 = obj;
        if (j2 < 0) goto _L10; else goto _L9
_L9:
        if (f5 < f3 || j2 >= j3) goto _L12; else goto _L11
_L11:
        if (obj2 == null) goto _L10; else goto _L13
_L13:
        obj = obj2;
        i1 = k2;
        f1 = f5;
        j1 = i2;
        if (j2 == ((cn) (obj2)).a)
        {
            obj = obj2;
            i1 = k2;
            f1 = f5;
            j1 = i2;
            if (!((cn) (obj2)).b)
            {
                e.remove(k2);
                bj.b();
                i1 = k2 - 1;
                j1 = i2 - 1;
                if (i1 >= 0)
                {
                    obj = (cn)e.get(i1);
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
        obj2 = obj;
        k2 = i1;
        f5 = f1;
        i2 = j1;
        break MISSING_BLOCK_LABEL_366;
_L6:
        i1++;
          goto _L14
_L12:
        if (obj2 != null && j2 == ((cn) (obj2)).a)
        {
            f1 = f5 + ((cn) (obj2)).c;
            i1 = k2 - 1;
            if (i1 >= 0)
            {
                obj = (cn)e.get(i1);
                j1 = i2;
            } else
            {
                obj = null;
                j1 = i2;
            }
        } else
        {
            f1 = f5 + c(j2).c;
            j1 = i2 + 1;
            if (k2 >= 0)
            {
                obj = (cn)e.get(k2);
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
            float f2 = ((cn) (obj1)).c;
            i1 = i2 + 1;
            if (f2 >= 2.0F)
            {
                break label0;
            }
            float f4;
            int k1;
            if (i1 < e.size())
            {
                obj = (cn)e.get(i1);
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
            k1 = i;
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
                    if (k1 == ((cn) (obj)).a && !((cn) (obj)).b)
                    {
                        e.remove(i1);
                        bj.b();
                        if (i1 < e.size())
                        {
                            obj = (cn)e.get(i1);
                        } else
                        {
                            obj = null;
                        }
                    }
                } else
                if (obj != null && k1 == ((cn) (obj)).a)
                {
                    float f6 = ((cn) (obj)).c;
                    i1++;
                    if (i1 < e.size())
                    {
                        obj = (cn)e.get(i1);
                    } else
                    {
                        obj = null;
                    }
                    f2 += f6;
                } else
                {
                    obj = c(k1);
                    i1++;
                    float f7 = ((cn) (obj)).c;
                    if (i1 < e.size())
                    {
                        obj = (cn)e.get(i1);
                    } else
                    {
                        obj = null;
                    }
                    f2 += f7;
                }
                k1++;
            } while (true);
        }
        a(((cn) (obj1)), i2, cn1);
_L8:
        int l1 = getChildCount();
        for (i1 = 0; i1 < l1; i1++)
        {
            obj = (LayoutParams)getChildAt(i1).getLayoutParams();
            obj.f = i1;
            if (((LayoutParams) (obj)).a || ((LayoutParams) (obj)).c != 0.0F)
            {
                continue;
            }
            cn1 = e();
            if (cn1 != null)
            {
                obj.c = cn1.c;
                obj.e = cn1.a;
            }
        }

        d();
        if (!hasFocus()) goto _L4; else goto _L16
_L16:
        obj = findFocus();
        if (obj != null)
        {
            obj = a(((View) (obj)));
        } else
        {
            obj = null;
        }
        if (obj != null && ((cn) (obj)).a == i) goto _L4; else goto _L17
_L17:
        i1 = 0;
_L20:
        if (i1 >= getChildCount()) goto _L4; else goto _L18
_L18:
        obj = getChildAt(i1);
        cn1 = e();
        if (cn1 != null && cn1.a == i && ((View) (obj)).requestFocus(byte1)) goto _L4; else goto _L19
_L19:
        i1++;
          goto _L20
        obj = null;
          goto _L21
    }

    private cn e()
    {
        for (int i1 = 0; i1 < e.size(); i1++)
        {
            cn cn1 = (cn)e.get(i1);
            if (h.c())
            {
                return cn1;
            }
        }

        return null;
    }

    private cn e(int i1)
    {
        for (int j1 = 0; j1 < e.size(); j1++)
        {
            cn cn1 = (cn)e.get(j1);
            if (cn1.a == i1)
            {
                return cn1;
            }
        }

        return null;
    }

    private boolean f()
    {
        boolean flag = false;
        if (e.size() == 0)
        {
            T = false;
            g();
            if (!T)
            {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
        } else
        {
            j();
            b();
            T = false;
            g();
            if (!T)
            {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
            flag = true;
        }
        return flag;
    }

    private boolean f(int i1)
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
        j1 = a(g, view).left;
        int k1 = a(g, ((View) (obj))).left;
        StringBuilder stringbuilder;
        if (obj != null && j1 >= k1)
        {
            flag = l();
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
        j1 = a(g, view).left;
        l1 = a(g, ((View) (obj))).left;
        if (obj != null && j1 <= l1) goto _L17; else goto _L16
_L16:
        flag = view.requestFocus();
          goto _L15
_L4:
        if (i1 != 17 && i1 != 1) goto _L19; else goto _L18
_L18:
        flag = l();
          goto _L15
_L19:
        if (i1 != 66 && i1 != 2) goto _L15; else goto _L17
_L17:
        if (h != null && i < h.a() - 1)
        {
            b(i + 1);
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

    private void g()
    {
        if (U <= 0) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        int j2;
        int k2;
        int l2;
        int i3;
        k2 = getScrollX();
        i1 = getPaddingLeft();
        j1 = getPaddingRight();
        l2 = getWidth();
        i3 = getChildCount();
        j2 = 0;
_L8:
        if (j2 >= i3) goto _L2; else goto _L3
_L3:
        View view;
        LayoutParams layoutparams;
        view = getChildAt(j2);
        layoutparams = (LayoutParams)view.getLayoutParams();
        if (!layoutparams.a)
        {
            break MISSING_BLOCK_LABEL_373;
        }
        layoutparams.b & 7;
        JVM INSTR tableswitch 1 5: default 108
    //                   1 199
    //                   2 108
    //                   3 174
    //                   4 108
    //                   5 227;
           goto _L4 _L5 _L4 _L6 _L4 _L7
_L4:
        int k1;
        k1 = i1;
        int l1 = j1;
        j1 = i1;
        i1 = l1;
_L9:
        int i2;
        int j3 = (k1 + k2) - view.getLeft();
        k1 = i1;
        i2 = j1;
        if (j3 != 0)
        {
            view.offsetLeftAndRight(j3);
            i2 = j1;
            k1 = i1;
        }
_L10:
        j2++;
        i1 = i2;
        j1 = k1;
          goto _L8
_L6:
        k1 = view.getWidth();
        i2 = k1 + i1;
        k1 = i1;
        i1 = j1;
        j1 = i2;
          goto _L9
_L5:
        k1 = Math.max((l2 - view.getMeasuredWidth()) / 2, i1);
        i2 = i1;
        i1 = j1;
        j1 = i2;
          goto _L9
_L7:
        k1 = l2 - j1 - view.getMeasuredWidth();
        int k3 = view.getMeasuredWidth();
        i2 = i1;
        i1 = j1 + k3;
        j1 = i2;
          goto _L9
_L2:
        if (V != null)
        {
            j1 = V.size();
            for (i1 = 0; i1 < j1; i1++)
            {
                V.get(i1);
            }

        }
        if (W != null)
        {
            getScrollX();
            j1 = getChildCount();
            for (i1 = 0; i1 < j1; i1++)
            {
                View view1 = getChildAt(i1);
                if (!((LayoutParams)view1.getLayoutParams()).a)
                {
                    view1.getLeft();
                    b();
                }
            }

        }
        T = true;
        return;
        k1 = j1;
        i2 = i1;
          goto _L10
    }

    private void h()
    {
        if (V != null)
        {
            int i1 = 0;
            for (int j1 = V.size(); i1 < j1; i1++)
            {
                V.get(i1);
            }

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

    private cn j()
    {
        int i1 = b();
        float f1;
        float f2;
        float f3;
        float f4;
        cn cn2;
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
        cn2 = null;
        do
        {
            cn cn1;
label0:
            {
                cn cn3;
label1:
                {
                    cn3 = cn2;
                    if (i1 >= e.size())
                    {
                        break label1;
                    }
                    cn1 = (cn)e.get(i1);
                    if (!flag && cn1.a != j1 + 1)
                    {
                        cn1 = f;
                        cn1.d = f4 + f3 + f2;
                        cn1.a = j1 + 1;
                        cn1.c = 1.0F;
                        i1--;
                    }
                    f3 = cn1.d;
                    f4 = cn1.c;
                    if (!flag)
                    {
                        cn3 = cn2;
                        if (f1 < f3)
                        {
                            break label1;
                        }
                    }
                    if (f1 >= f4 + f3 + f2 && i1 != e.size() - 1)
                    {
                        break label0;
                    }
                    cn3 = cn1;
                }
                return cn3;
            }
            j1 = cn1.a;
            f4 = cn1.c;
            flag = false;
            i1++;
            cn2 = cn1;
        } while (true);
    }

    private void k()
    {
        z = false;
        A = false;
        if (J != null)
        {
            J.recycle();
            J = null;
        }
    }

    private boolean l()
    {
        if (i > 0)
        {
            b(i - 1);
            return true;
        } else
        {
            return false;
        }
    }

    public final void addFocusables(ArrayList arraylist, int i1, int j1)
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
                    cn cn1 = e();
                    if (cn1 != null && cn1.a == i)
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

    public final void addTouchables(ArrayList arraylist)
    {
        for (int i1 = 0; i1 < getChildCount(); i1++)
        {
            View view = getChildAt(i1);
            if (view.getVisibility() != 0)
            {
                continue;
            }
            cn cn1 = e();
            if (cn1 != null && cn1.a == i)
            {
                view.addTouchables(arraylist);
            }
        }

    }

    public final void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (!checkLayoutParams(layoutparams))
        {
            layoutparams = generateLayoutParams(layoutparams);
        }
        LayoutParams layoutparams1 = (LayoutParams)layoutparams;
        layoutparams1.a = layoutparams1.a | (view instanceof cm);
        if (v)
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

    public final boolean canScrollHorizontally(int i1)
    {
        if (h != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j1;
        int k1;
        j1 = b();
        k1 = getScrollX();
        if (i1 >= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (k1 <= (int)((float)j1 * r)) goto _L1; else goto _L3
_L3:
        return true;
        if (i1 <= 0 || k1 >= (int)((float)j1 * s)) goto _L1; else goto _L4
_L4:
        return true;
    }

    protected final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
    }

    public final void computeScroll()
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
                if (!f())
                {
                    m.abortAnimation();
                    scrollTo(0, l1);
                }
            }
            bp.d(this);
            return;
        } else
        {
            a(true);
            return;
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyevent)
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
        if (!android.support.v4.view.z.b(keyevent))
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = f(2);
          goto _L9
        if (!android.support.v4.view.z.a(keyevent)) goto _L4; else goto _L11
_L11:
        flag = f(1);
          goto _L9
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
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
                cn cn1 = e();
                if (cn1 != null && cn1.a == i && view.dispatchPopulateAccessibilityEvent(accessibilityevent))
                {
                    return true;
                }
            }
            i1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void draw(Canvas canvas)
    {
        super.draw(canvas);
        int j1 = 0;
        int i1 = 0;
        int k1 = bp.a(this);
        if (k1 == 0 || k1 == 1 && h != null && h.a() > 1)
        {
            if (!P.a())
            {
                j1 = canvas.save();
                i1 = getHeight() - getPaddingTop() - getPaddingBottom();
                int l1 = getWidth();
                canvas.rotate(270F);
                canvas.translate(-i1 + getPaddingTop(), r * (float)l1);
                P.a(i1, l1);
                i1 = P.a(canvas) | false;
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
            bp.d(this);
        }
    }

    protected final void drawableStateChanged()
    {
        super.drawableStateChanged();
        Drawable drawable = o;
        if (drawable != null && drawable.isStateful())
        {
            drawable.setState(getDrawableState());
        }
    }

    protected final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams();
    }

    public final android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return generateDefaultLayoutParams();
    }

    protected final int getChildDrawingOrder(int i1, int j1)
    {
        int k1 = j1;
        if (aa == 2)
        {
            k1 = i1 - 1 - j1;
        }
        return ((LayoutParams)((View)ab.get(k1)).getLayoutParams()).f;
    }

    protected final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        R = true;
    }

    protected final void onDetachedFromWindow()
    {
        removeCallbacks(ad);
        super.onDetachedFromWindow();
    }

    protected final void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (n > 0 && o != null && e.size() > 0 && h != null)
        {
            int k1 = getScrollX();
            int l1 = getWidth();
            float f3 = (float)n / (float)l1;
            Object obj = (cn)e.get(0);
            float f1 = ((cn) (obj)).d;
            int i2 = e.size();
            int i1 = ((cn) (obj)).a;
            int j2 = ((cn)e.get(i2 - 1)).a;
            int j1 = 0;
            do
            {
                if (i1 >= j2)
                {
                    break;
                }
                for (; i1 > ((cn) (obj)).a && j1 < i2; obj = (cn)((ArrayList) (obj)).get(j1))
                {
                    obj = e;
                    j1++;
                }

                float f2;
                if (i1 == ((cn) (obj)).a)
                {
                    f2 = (((cn) (obj)).d + ((cn) (obj)).c) * (float)l1;
                    f1 = ((cn) (obj)).d + ((cn) (obj)).c + f3;
                } else
                {
                    f2 = (1.0F + f1) * (float)l1;
                    f1 += 1.0F + f3;
                }
                if ((float)n + f2 > (float)k1)
                {
                    o.setBounds((int)f2, p, (int)((float)n + f2 + 0.5F), q);
                    o.draw(canvas);
                }
                if (f2 > (float)(k1 + l1))
                {
                    break;
                }
                i1++;
            } while (true);
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1 = motionevent.getAction() & 0xff;
        if (i1 != 3 && i1 != 1) goto _L2; else goto _L1
_L1:
        z = false;
        A = false;
        I = -1;
        if (J != null)
        {
            J.recycle();
            J = null;
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
    //                   0: 426
    //                   2: 143
    //                   6: 557;
           goto _L5 _L6 _L7 _L8
_L5:
        if (J == null)
        {
            J = VelocityTracker.obtain();
        }
        J.addMovement(motionevent);
        return z;
_L7:
        float f1;
        float f3;
        float f4;
        float f5;
        float f6;
        int j1 = I;
        if (j1 == -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        j1 = ay.a(motionevent, j1);
        f3 = ay.c(motionevent, j1);
        f1 = f3 - E;
        f5 = Math.abs(f1);
        f4 = ay.d(motionevent, j1);
        f6 = Math.abs(f4 - H);
        if (f1 != 0.0F)
        {
            float f7 = E;
            boolean flag;
            if (f7 < (float)C && f1 > 0.0F || f7 > (float)(getWidth() - C) && f1 < 0.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag && a(this, false, (int)f1, (int)f3, (int)f4))
            {
                E = f3;
                F = f4;
                A = true;
                return false;
            }
        }
        if (f5 <= (float)D || 0.5F * f5 <= f6) goto _L10; else goto _L9
_L9:
        z = true;
        i();
        a(1);
        if (f1 > 0.0F)
        {
            f1 = G + (float)D;
        } else
        {
            f1 = G - (float)D;
        }
        E = f1;
        F = f4;
        b(true);
_L11:
        if (z && a(f3))
        {
            bp.d(this);
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
        G = f2;
        E = f2;
        f2 = motionevent.getY();
        H = f2;
        F = f2;
        I = ay.b(motionevent, 0);
        A = false;
        m.computeScrollOffset();
        if (ae == 2 && Math.abs(m.getFinalX() - m.getCurrX()) > N)
        {
            m.abortAnimation();
            x = false;
            c();
            z = true;
            i();
            a(1);
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

    protected final void onLayout(boolean flag, int i1, int j1, int k1, int l1)
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
            cn cn1 = e();
            if (cn1 == null)
            {
                continue;
            }
            float f1 = i2;
            int l2 = (int)(cn1.d * f1) + j1;
            if (layoutparams1.d)
            {
                layoutparams1.d = false;
                float f2 = i2;
                view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)(layoutparams1.c * f2), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(i5 - i1 - k1, 0x40000000));
            }
            view1.layout(l2, i1, view1.getMeasuredWidth() + l2, view1.getMeasuredHeight() + i1);
        }

        p = i1;
        q = i5 - k1;
        U = j2;
        if (R)
        {
            a(i, false, 0, false);
        }
        R = false;
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

    protected final void onMeasure(int i1, int j1)
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
                layoutparams = (LayoutParams)view.getLayoutParams();
                if (layoutparams == null || !layoutparams.a)
                {
                    f1 = i1;
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)(layoutparams.c * f1), 0x40000000), u);
                }
            }

            return;
        }
        l2 = j1;
        break MISSING_BLOCK_LABEL_282;
    }

    protected final boolean onRequestFocusInDescendants(int i1, Rect rect)
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
            cn cn1 = e();
            if (cn1 != null && cn1.a == i && view.requestFocus(i1, rect))
            {
                return true;
            }
        }

        return false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable)
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
            Object obj = ((SavedState) (parcelable)).b;
            obj = ((SavedState) (parcelable)).c;
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

    public final Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = i;
        if (h != null)
        {
            savedstate.b = null;
        }
        return savedstate;
    }

    protected final void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (i1 != k1)
        {
            j1 = n;
            l1 = n;
            if (k1 > 0 && !e.isEmpty())
            {
                int i2 = getPaddingLeft();
                int j2 = getPaddingRight();
                int k2 = getPaddingLeft();
                int l2 = getPaddingRight();
                float f1 = (float)getScrollX() / (float)(l1 + (k1 - k2 - l2));
                j1 = (int)((float)(j1 + (i1 - i2 - j2)) * f1);
                scrollTo(j1, getScrollY());
                if (!m.isFinished())
                {
                    k1 = m.getDuration();
                    l1 = m.timePassed();
                    cn cn1 = e(i);
                    m.startScroll(j1, 0, (int)(cn1.d * (float)i1), 0, k1 - l1);
                }
            } else
            {
                cn cn2 = e(i);
                float f2;
                if (cn2 != null)
                {
                    f2 = Math.min(cn2.d, s);
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

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1;
        int j1;
        j1 = 0;
        if (O)
        {
            return true;
        }
        if (motionevent.getAction() == 0 && motionevent.getEdgeFlags() != 0)
        {
            return false;
        }
        if (h == null || h.a() == 0)
        {
            return false;
        }
        if (J == null)
        {
            J = VelocityTracker.obtain();
        }
        J.addMovement(motionevent);
        i1 = j1;
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 6: default 124
    //                   0 139
    //                   1 391
    //                   2 201
    //                   3 675
    //                   4 128
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
            bp.d(this);
        }
        return true;
_L2:
        m.abortAnimation();
        x = false;
        c();
        float f1 = motionevent.getX();
        G = f1;
        E = f1;
        f1 = motionevent.getY();
        H = f1;
        F = f1;
        I = ay.b(motionevent, 0);
        i1 = j1;
        continue; /* Loop/switch isn't completed */
_L4:
        if (!z)
        {
            i1 = android.support.v4.view.ay.a(motionevent, I);
            float f2 = ay.c(motionevent, i1);
            float f6 = Math.abs(f2 - E);
            float f4 = ay.d(motionevent, i1);
            float f7 = Math.abs(f4 - F);
            if (f6 > (float)D && f6 > f7)
            {
                z = true;
                i();
                ViewParent viewparent;
                if (f2 - G > 0.0F)
                {
                    f2 = G + (float)D;
                } else
                {
                    f2 = G - (float)D;
                }
                E = f2;
                F = f4;
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
        if (z)
        {
            i1 = a(ay.c(motionevent, android.support.v4.view.ay.a(motionevent, I))) | false;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        i1 = j1;
        if (z)
        {
            Object obj = J;
            ((VelocityTracker) (obj)).computeCurrentVelocity(1000, L);
            int k1 = (int)android.support.v4.view.bl.a(((VelocityTracker) (obj)), I);
            x = true;
            j1 = b();
            int l1 = getScrollX();
            obj = j();
            i1 = ((cn) (obj)).a;
            float f5 = ((float)l1 / (float)j1 - ((cn) (obj)).d) / ((cn) (obj)).c;
            if (Math.abs((int)(ay.c(motionevent, android.support.v4.view.ay.a(motionevent, I)) - G)) > M && Math.abs(k1) > K)
            {
                if (k1 <= 0)
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
                i1 = (int)((float)i1 + f5 + f3);
            }
            j1 = i1;
            if (e.size() > 0)
            {
                motionevent = (cn)e.get(0);
                cn cn1 = (cn)e.get(e.size() - 1);
                j1 = Math.max(((cn) (motionevent)).a, Math.min(i1, cn1.a));
            }
            a(j1, true, true, k1);
            I = -1;
            k();
            i1 = P.c() | Q.c();
        }
        continue; /* Loop/switch isn't completed */
_L5:
        i1 = j1;
        if (z)
        {
            a(i, true, 0, false);
            I = -1;
            k();
            i1 = P.c() | Q.c();
        }
        continue; /* Loop/switch isn't completed */
_L7:
        i1 = ay.b(motionevent);
        E = ay.c(motionevent, i1);
        I = ay.b(motionevent, i1);
        i1 = j1;
        continue; /* Loop/switch isn't completed */
_L8:
        a(motionevent);
        E = ay.c(motionevent, android.support.v4.view.ay.a(motionevent, I));
        i1 = j1;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final void removeView(View view)
    {
        if (v)
        {
            removeViewInLayout(view);
            return;
        } else
        {
            super.removeView(view);
            return;
        }
    }

    protected final boolean verifyDrawable(Drawable drawable)
    {
        return super.verifyDrawable(drawable) || drawable == o;
    }


    private class LayoutParams extends android.view.ViewGroup.LayoutParams
    {

        public boolean a;
        public int b;
        float c;
        boolean d;
        int e;
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
            context = context.obtainStyledAttributes(attributeset, ViewPager.a());
            b = context.getInteger(0, 48);
            context.recycle();
        }
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = android.support.v4.c.a.a(new cp());
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

}
