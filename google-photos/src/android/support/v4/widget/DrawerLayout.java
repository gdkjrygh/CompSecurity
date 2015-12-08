// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import ku;
import ky;
import lt;
import mk;
import nc;
import qi;
import qj;
import qk;
import ql;
import qm;
import qn;
import qo;
import qp;
import qr;
import qv;
import rr;

public class DrawerLayout extends ViewGroup
    implements qv
{

    private static qk G;
    private static final int f[] = {
        0x10100b3
    };
    private static final boolean g;
    private static final boolean h;
    private boolean A;
    private Drawable B;
    private Drawable C;
    private Drawable D;
    private Drawable E;
    private final ArrayList F;
    public final rr a;
    public final rr b;
    public int c;
    public boolean d;
    public qn e;
    private final qj i;
    private float j;
    private int k;
    private int l;
    private float m;
    private Paint n;
    private final qr o;
    private final qr p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private float u;
    private float v;
    private Drawable w;
    private Drawable x;
    private Drawable y;
    private Object z;

    public DrawerLayout(Context context)
    {
        this(context, null);
    }

    public DrawerLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        i = new qj(this);
        l = 0x99000000;
        n = new Paint();
        r = true;
        B = null;
        C = null;
        D = null;
        E = null;
        setDescendantFocusability(0x40000);
        float f1 = getResources().getDisplayMetrics().density;
        k = (int)(64F * f1 + 0.5F);
        float f2 = 400F * f1;
        o = new qr(this, 3);
        p = new qr(this, 5);
        a = rr.a(this, 1.0F, o);
        a.l = 1;
        a.j = f2;
        o.b = a;
        b = rr.a(this, 1.0F, p);
        b.l = 2;
        b.j = f2;
        p.b = b;
        setFocusableInTouchMode(true);
        mk.c(this, 1);
        mk.a(this, new qi(this));
        nc.a(this, false);
        if (mk.v(this))
        {
            G.a(this);
            w = G.a(context);
        }
        j = f1 * 10F;
        F = new ArrayList();
    }

    public static View a(DrawerLayout drawerlayout)
    {
        return drawerlayout.d();
    }

    private void a(int i1, int j1)
    {
        j1 = ku.a(j1, mk.h(this));
        if (j1 == 3)
        {
            s = i1;
        } else
        if (j1 == 5)
        {
            t = i1;
        }
        if (i1 != 0)
        {
            rr rr1;
            if (j1 == 3)
            {
                rr1 = a;
            } else
            {
                rr1 = b;
            }
            rr1.a();
        }
        i1;
        JVM INSTR tableswitch 1 2: default 60
    //                   1 98
    //                   2 82;
           goto _L1 _L2 _L3
_L1:
        View view;
        return;
_L3:
        if ((view = b(j1)) != null)
        {
            j(view);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if ((view = b(j1)) != null)
        {
            e(view);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public static int[] a()
    {
        return f;
    }

    public static float b(View view)
    {
        return ((qo)view.getLayoutParams()).b;
    }

    public static boolean b()
    {
        return g;
    }

    private View c()
    {
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            if (((qo)view.getLayoutParams()).d)
            {
                return view;
            }
        }

        return null;
    }

    public static String c(int i1)
    {
        if ((i1 & 3) == 3)
        {
            return "LEFT";
        }
        if ((i1 & 5) == 5)
        {
            return "RIGHT";
        } else
        {
            return Integer.toHexString(i1);
        }
    }

    private View d()
    {
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            if (d(view) && g(view))
            {
                return view;
            }
        }

        return null;
    }

    public static boolean d(View view)
    {
        return (ku.a(((qo)view.getLayoutParams()).a, mk.h(view)) & 7) != 0;
    }

    public static boolean h(View view)
    {
        return mk.e(view) != 4 && mk.e(view) != 2;
    }

    private static boolean i(View view)
    {
        return ((qo)view.getLayoutParams()).a == 0;
    }

    private void j(View view)
    {
        if (!d(view))
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a sliding drawer").toString());
        }
        if (r)
        {
            qo qo1 = (qo)view.getLayoutParams();
            qo1.b = 1.0F;
            qo1.d = true;
            a(view, true);
        } else
        if (a(view, 3))
        {
            a.a(view, 0, view.getTop());
        } else
        {
            b.a(view, getWidth() - view.getWidth(), view.getTop());
        }
        invalidate();
    }

    public final int a(View view)
    {
        int i1 = c(view);
        if (i1 == 3)
        {
            return s;
        }
        if (i1 == 5)
        {
            return t;
        } else
        {
            return 0;
        }
    }

    public final void a(int i1)
    {
        a(i1, 3);
        a(i1, 5);
    }

    public final void a(View view, float f1)
    {
        qo qo1 = (qo)view.getLayoutParams();
        if (f1 != qo1.b)
        {
            qo1.b = f1;
            if (e != null)
            {
                e.a(view, f1);
                return;
            }
        }
    }

    public void a(View view, boolean flag)
    {
        int j1 = getChildCount();
        int i1 = 0;
        while (i1 < j1) 
        {
            View view1 = getChildAt(i1);
            if (!flag && !d(view1) || flag && view1 == view)
            {
                mk.c(view1, 1);
            } else
            {
                mk.c(view1, 4);
            }
            i1++;
        }
    }

    public final void a(Object obj, boolean flag)
    {
        z = obj;
        A = flag;
        if (!flag && getBackground() == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setWillNotDraw(flag);
        requestLayout();
    }

    public final void a(boolean flag)
    {
        int l1 = getChildCount();
        int j1 = 0;
        int i1 = 0;
        while (j1 < l1) 
        {
label0:
            {
                View view = getChildAt(j1);
                qo qo1 = (qo)view.getLayoutParams();
                int k1 = i1;
                if (!d(view))
                {
                    break label0;
                }
                if (flag)
                {
                    k1 = i1;
                    if (!qo1.c)
                    {
                        break label0;
                    }
                }
                k1 = view.getWidth();
                if (a(view, 3))
                {
                    i1 |= a.a(view, -k1, view.getTop());
                } else
                {
                    i1 |= b.a(view, getWidth(), view.getTop());
                }
                qo1.c = false;
                k1 = i1;
            }
            j1++;
            i1 = k1;
        }
        o.a();
        p.a();
        if (i1 != 0)
        {
            invalidate();
        }
    }

    public final boolean a(View view, int i1)
    {
        return (c(view) & i1) == i1;
    }

    public void addFocusables(ArrayList arraylist, int i1, int j1)
    {
        boolean flag1 = false;
        if (getDescendantFocusability() == 0x60000)
        {
            return;
        }
        int j2 = getChildCount();
        int k1 = 0;
        boolean flag = false;
        while (k1 < j2) 
        {
            View view = getChildAt(k1);
            if (d(view))
            {
                if (f(view))
                {
                    flag = true;
                    view.addFocusables(arraylist, i1, j1);
                }
            } else
            {
                F.add(view);
            }
            k1++;
        }
        if (!flag)
        {
            int i2 = F.size();
            for (int l1 = ((flag1) ? 1 : 0); l1 < i2; l1++)
            {
                View view1 = (View)F.get(l1);
                if (view1.getVisibility() == 0)
                {
                    view1.addFocusables(arraylist, i1, j1);
                }
            }

        }
        F.clear();
    }

    public void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.addView(view, i1, layoutparams);
        if (c() != null || d(view))
        {
            mk.c(view, 4);
        } else
        {
            mk.c(view, 1);
        }
        if (!g)
        {
            mk.a(view, i);
        }
    }

    public final View b(int i1)
    {
        int j1 = ku.a(i1, mk.h(this));
        int k1 = getChildCount();
        for (i1 = 0; i1 < k1; i1++)
        {
            View view = getChildAt(i1);
            if ((c(view) & 7) == (j1 & 7))
            {
                return view;
            }
        }

        return null;
    }

    public final int c(View view)
    {
        return ku.a(((qo)view.getLayoutParams()).a, mk.h(this));
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof qo) && super.checkLayoutParams(layoutparams);
    }

    public void computeScroll()
    {
        int j1 = getChildCount();
        float f1 = 0.0F;
        for (int i1 = 0; i1 < j1; i1++)
        {
            f1 = Math.max(f1, ((qo)getChildAt(i1).getLayoutParams()).b);
        }

        m = f1;
        if (a.a(true) | b.a(true))
        {
            mk.d(this);
        }
    }

    public final void d(int i1)
    {
        View view = b(0x800003);
        if (view == null)
        {
            throw new IllegalArgumentException((new StringBuilder("No drawer view found with gravity ")).append(c(0x800003)).toString());
        } else
        {
            j(view);
            return;
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long l1)
    {
        int i1;
        int j2;
        int i3;
        int l3;
        int i5;
        int j5;
        int k5;
        boolean flag1;
        i5 = getHeight();
        flag1 = i(view);
        j2 = 0;
        boolean flag = false;
        i1 = getWidth();
        j5 = canvas.save();
        i3 = i1;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        k5 = getChildCount();
        l3 = 0;
        j2 = ((flag) ? 1 : 0);
_L6:
        View view1;
        if (l3 >= k5)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        view1 = getChildAt(l3);
        if (view1 == view || view1.getVisibility() != 0) goto _L2; else goto _L1
_L1:
        int k4;
        Drawable drawable = view1.getBackground();
        if (drawable != null)
        {
            if (drawable.getOpacity() == -1)
            {
                i3 = 1;
            } else
            {
                i3 = 0;
            }
        } else
        {
            i3 = 0;
        }
        if (i3 == 0 || !d(view1) || view1.getHeight() < i5) goto _L2; else goto _L3
_L3:
        if (!a(view1, 3)) goto _L5; else goto _L4
_L4:
        i3 = view1.getRight();
        if (i3 > j2)
        {
            j2 = i3;
        }
        k4 = j2;
        i3 = i1;
_L7:
        l3++;
        i1 = i3;
        j2 = k4;
          goto _L6
_L5:
        int l4;
        l4 = view1.getLeft();
        i3 = l4;
        k4 = j2;
        if (l4 < i1) goto _L7; else goto _L2
_L2:
        i3 = i1;
        k4 = j2;
          goto _L7
        canvas.clipRect(j2, 0, i1, getHeight());
        i3 = i1;
        boolean flag2 = super.drawChild(canvas, view, l1);
        canvas.restoreToCount(j5);
        if (m > 0.0F && flag1)
        {
            int j1 = (int)((float)((l & 0xff000000) >>> 24) * m);
            int i4 = l;
            n.setColor(j1 << 24 | i4 & 0xffffff);
            canvas.drawRect(j2, 0.0F, i3, getHeight(), n);
        } else
        {
            if (x != null && a(view, 3))
            {
                int k1 = x.getIntrinsicWidth();
                int k2 = view.getRight();
                int j3 = a.k;
                float f1 = Math.max(0.0F, Math.min((float)k2 / (float)j3, 1.0F));
                x.setBounds(k2, view.getTop(), k1 + k2, view.getBottom());
                x.setAlpha((int)(255F * f1));
                x.draw(canvas);
                return flag2;
            }
            if (y != null && a(view, 5))
            {
                int i2 = y.getIntrinsicWidth();
                int l2 = view.getLeft();
                int k3 = getWidth();
                int j4 = b.k;
                float f2 = Math.max(0.0F, Math.min((float)(k3 - l2) / (float)j4, 1.0F));
                y.setBounds(l2 - i2, view.getTop(), l2, view.getBottom());
                y.setAlpha((int)(255F * f2));
                y.draw(canvas);
                return flag2;
            }
        }
        return flag2;
    }

    public final void e(View view)
    {
        if (!d(view))
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a sliding drawer").toString());
        }
        if (r)
        {
            view = (qo)view.getLayoutParams();
            view.b = 0.0F;
            view.d = false;
        } else
        if (a(view, 3))
        {
            a.a(view, -view.getWidth(), view.getTop());
        } else
        {
            b.a(view, getWidth(), view.getTop());
        }
        invalidate();
    }

    public final boolean e(int i1)
    {
        View view = b(0x800003);
        if (view != null)
        {
            return f(view);
        } else
        {
            return false;
        }
    }

    public final boolean f(View view)
    {
        if (!d(view))
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a drawer").toString());
        } else
        {
            return ((qo)view.getLayoutParams()).d;
        }
    }

    public final boolean g(View view)
    {
        if (!d(view))
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a drawer").toString());
        }
        return ((qo)view.getLayoutParams()).b > 0.0F;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new qo(-1, -1);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new qo(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof qo)
        {
            return new qo((qo)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new qo((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new qo(layoutparams);
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        r = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        r = true;
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (A && w != null)
        {
            int i1 = G.a(z);
            if (i1 > 0)
            {
                w.setBounds(0, 0, getWidth(), i1);
                w.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag = false;
        i1 = lt.a(motionevent);
        flag1 = a.a(motionevent);
        flag2 = b.a(motionevent);
        i1;
        JVM INSTR tableswitch 0 3: default 60
    //                   0 131
    //                   1 358
    //                   2 194
    //                   3 358;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        i1 = 0;
_L15:
        if (flag2 | flag1 || i1 != 0) goto _L6; else goto _L5
_L5:
        int j1;
        j1 = getChildCount();
        i1 = 0;
_L23:
        if (i1 >= j1) goto _L8; else goto _L7
_L7:
        if (!((qo)getChildAt(i1).getLayoutParams()).c) goto _L10; else goto _L9
_L9:
        i1 = 1;
_L24:
        if (i1 == 0 && !d) goto _L11; else goto _L6
_L6:
        flag = true;
_L11:
        return flag;
_L2:
        float f1;
        float f3;
        f1 = motionevent.getX();
        f3 = motionevent.getY();
        u = f1;
        v = f3;
        if (m <= 0.0F) goto _L13; else goto _L12
_L12:
        motionevent = a.a((int)f1, (int)f3);
        if (motionevent == null || !i(motionevent)) goto _L13; else goto _L14
_L14:
        i1 = 1;
_L25:
        d = false;
          goto _L15
_L4:
        int k1;
        motionevent = a;
        k1 = ((rr) (motionevent)).d.length;
        j1 = 0;
_L21:
        if (j1 >= k1) goto _L17; else goto _L16
_L16:
        if ((((rr) (motionevent)).h & 1 << j1) != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            float f2 = ((rr) (motionevent)).f[j1] - ((rr) (motionevent)).d[j1];
            float f4 = ((rr) (motionevent)).g[j1] - ((rr) (motionevent)).e[j1];
            if (f2 * f2 + f4 * f4 > (float)(((rr) (motionevent)).b * ((rr) (motionevent)).b))
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
        } else
        {
            i1 = 0;
        }
        if (i1 == 0) goto _L19; else goto _L18
_L18:
        i1 = 1;
_L22:
        if (i1 == 0) goto _L1; else goto _L20
_L20:
        o.a();
        p.a();
        i1 = 0;
          goto _L15
_L19:
        j1++;
          goto _L21
_L17:
        i1 = 0;
          goto _L22
_L3:
        a(true);
        d = false;
          goto _L1
_L10:
        i1++;
          goto _L23
_L8:
        i1 = 0;
          goto _L24
_L13:
        i1 = 0;
          goto _L25
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4)
        {
            boolean flag;
            if (d() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                ky.b(keyevent);
                return true;
            }
        }
        return super.onKeyDown(i1, keyevent);
    }

    public boolean onKeyUp(int i1, KeyEvent keyevent)
    {
        boolean flag = false;
        if (i1 == 4)
        {
            keyevent = d();
            if (keyevent != null && a(keyevent) == 0)
            {
                a(false);
            }
            if (keyevent != null)
            {
                flag = true;
            }
            return flag;
        } else
        {
            return super.onKeyUp(i1, keyevent);
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int k2;
        int l2;
        q = true;
        k2 = k1 - i1;
        l2 = getChildCount();
        k1 = 0;
_L2:
        View view;
        qo qo1;
        if (k1 >= l2)
        {
            break MISSING_BLOCK_LABEL_446;
        }
        view = getChildAt(k1);
        if (view.getVisibility() != 8)
        {
            qo1 = (qo)view.getLayoutParams();
            if (!i(view))
            {
                break; /* Loop/switch isn't completed */
            }
            view.layout(qo1.leftMargin, qo1.topMargin, qo1.leftMargin + view.getMeasuredWidth(), qo1.topMargin + view.getMeasuredHeight());
        }
_L6:
        k1++;
        if (true) goto _L2; else goto _L1
_L1:
        int i2;
        int i3;
        int j3;
        i3 = view.getMeasuredWidth();
        j3 = view.getMeasuredHeight();
        float f1;
        boolean flag1;
        if (a(view, 3))
        {
            i1 = -i3;
            i2 = (int)((float)i3 * qo1.b) + i1;
            f1 = (float)(i3 + i2) / (float)i3;
        } else
        {
            i2 = k2 - (int)((float)i3 * qo1.b);
            f1 = (float)(k2 - i2) / (float)i3;
        }
        if (f1 != qo1.b)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        qo1.a & 0x70;
        JVM INSTR lookupswitch 2: default 212
    //                   16: 356
    //                   80: 316;
           goto _L3 _L4 _L5
_L4:
        break MISSING_BLOCK_LABEL_356;
_L3:
        view.layout(i2, qo1.topMargin, i3 + i2, j3 + qo1.topMargin);
_L7:
        if (flag1)
        {
            a(view, f1);
        }
        int j2;
        int k3;
        if (qo1.b > 0.0F)
        {
            i1 = 0;
        } else
        {
            i1 = 4;
        }
        if (view.getVisibility() != i1)
        {
            view.setVisibility(i1);
        }
          goto _L6
_L5:
        i1 = l1 - j1;
        view.layout(i2, i1 - qo1.bottomMargin - view.getMeasuredHeight(), i3 + i2, i1 - qo1.bottomMargin);
          goto _L7
        k3 = l1 - j1;
        j2 = (k3 - j3) / 2;
        if (j2 < qo1.topMargin)
        {
            i1 = qo1.topMargin;
        } else
        {
            i1 = j2;
            if (j2 + j3 > k3 - qo1.bottomMargin)
            {
                i1 = k3 - qo1.bottomMargin - j3;
            }
        }
        view.layout(i2, i1, i3 + i2, j3 + i1);
          goto _L7
        q = false;
        r = false;
        return;
          goto _L6
    }

    protected void onMeasure(int i1, int j1)
    {
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int l3;
        k2 = 300;
        j2 = 0;
        l3 = android.view.View.MeasureSpec.getMode(i1);
        i3 = android.view.View.MeasureSpec.getMode(j1);
        i2 = android.view.View.MeasureSpec.getSize(i1);
        l2 = android.view.View.MeasureSpec.getSize(j1);
        if (l3 != 0x40000000) goto _L2; else goto _L1
_L1:
        int l1 = i2;
        if (i3 == 0x40000000) goto _L3; else goto _L2
_L2:
        int k1;
        boolean flag;
        if (isInEditMode())
        {
            k1 = i2;
            if (l3 != 0x80000000)
            {
                k1 = i2;
                if (l3 == 0)
                {
                    k1 = 300;
                }
            }
            l1 = k1;
            if (i3 != 0x80000000)
            {
label0:
                {
                    l1 = k1;
                    if (i3 == 0)
                    {
                        l1 = k1;
                        k1 = k2;
                        break label0;
                    }
                }
            }
        } else
        {
            throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
        }
          goto _L3
_L5:
        setMeasuredDimension(l1, k1);
        if (z != null && mk.v(this))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k2 = mk.h(this);
        l2 = getChildCount();
        while (j2 < l2) 
        {
            View view = getChildAt(j2);
            if (view.getVisibility() != 8)
            {
                qo qo1 = (qo)view.getLayoutParams();
                if (flag)
                {
                    int j3 = ku.a(qo1.a, k2);
                    if (mk.v(view))
                    {
                        G.a(view, z, j3);
                    } else
                    {
                        G.a(qo1, z, j3);
                    }
                }
                if (i(view))
                {
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(l1 - qo1.leftMargin - qo1.rightMargin, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(k1 - qo1.topMargin - qo1.bottomMargin, 0x40000000));
                } else
                if (d(view))
                {
                    if (h && mk.s(view) != j)
                    {
                        mk.d(view, j);
                    }
                    int k3 = c(view) & 7;
                    if ((k3 & 0) != 0)
                    {
                        throw new IllegalStateException((new StringBuilder("Child drawer has absolute gravity ")).append(c(k3)).append(" but this DrawerLayout").append(" already has a drawer view along that edge").toString());
                    }
                    view.measure(getChildMeasureSpec(i1, k + qo1.leftMargin + qo1.rightMargin, qo1.width), getChildMeasureSpec(j1, qo1.topMargin + qo1.bottomMargin, qo1.height));
                } else
                {
                    throw new IllegalStateException((new StringBuilder("Child ")).append(view).append(" at index ").append(j2).append(" does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY").toString());
                }
            }
            j2++;
        }
        return;
_L3:
        k1 = l2;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (qp)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((qp) (parcelable)).a != 0)
        {
            View view = b(((qp) (parcelable)).a);
            if (view != null)
            {
                j(view);
            }
        }
        a(((qp) (parcelable)).b, 3);
        a(((qp) (parcelable)).c, 5);
    }

    public void onRtlPropertiesChanged(int i1)
    {
        if (!h)
        {
            mk.h(this);
            x = null;
            mk.h(this);
            y = null;
        }
    }

    protected Parcelable onSaveInstanceState()
    {
        qp qp1 = new qp(super.onSaveInstanceState());
        View view = c();
        if (view != null)
        {
            qp1.a = ((qo)view.getLayoutParams()).a;
        }
        qp1.b = s;
        qp1.c = t;
        return qp1;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        flag = false;
        a.b(motionevent);
        b.b(motionevent);
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 3: default 56
    //                   0 58
    //                   1 85
    //                   2 56
    //                   3 187;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        return true;
_L2:
        float f1 = motionevent.getX();
        float f3 = motionevent.getY();
        u = f1;
        v = f3;
        d = false;
        return true;
_L3:
        float f2;
        float f4;
        f4 = motionevent.getX();
        f2 = motionevent.getY();
        motionevent = a.a((int)f4, (int)f2);
        if (motionevent == null || !i(motionevent)) goto _L6; else goto _L5
_L5:
        int i1;
        f4 -= u;
        f2 -= v;
        i1 = a.b;
        if (f4 * f4 + f2 * f2 >= (float)(i1 * i1)) goto _L6; else goto _L7
_L7:
        motionevent = c();
        if (motionevent == null) goto _L6; else goto _L8
_L8:
        if (a(motionevent) == 2)
        {
            flag = true;
        }
_L10:
        a(flag);
        return true;
_L4:
        a(true);
        d = false;
        return true;
_L6:
        flag = true;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
        super.requestDisallowInterceptTouchEvent(flag);
        if (flag)
        {
            a(true);
        }
    }

    public void requestLayout()
    {
        if (!q)
        {
            super.requestLayout();
        }
    }

    static 
    {
        boolean flag1 = true;
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        h = flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            G = new ql();
        } else
        {
            G = new qm();
        }
    }
}
