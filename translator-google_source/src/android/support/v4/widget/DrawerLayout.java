// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.a.a.a;
import android.support.v4.content.g;
import android.support.v4.view.at;
import android.support.v4.view.bt;
import android.support.v4.view.cp;
import android.support.v4.view.q;
import android.support.v4.view.u;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.widget:
//            ad, u, v, s, 
//            z, cf, r, t, 
//            x, w

public class DrawerLayout extends ViewGroup
    implements ad
{

    static final t h;
    private static final int i[] = {
        0x10100b3
    };
    private static final boolean j;
    private static final boolean k;
    private Drawable A;
    private Drawable B;
    private Drawable C;
    private Object D;
    private boolean E;
    private Drawable F;
    private Drawable G;
    private Drawable H;
    private Drawable I;
    private final ArrayList J;
    final cf a;
    final cf b;
    int c;
    boolean d;
    w e;
    CharSequence f;
    CharSequence g;
    private final s l;
    private float m;
    private int n;
    private int o;
    private float p;
    private Paint q;
    private final z r;
    private final z s;
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    private boolean x;
    private float y;
    private float z;

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
        l = new s(this);
        o = 0x99000000;
        q = new Paint();
        u = true;
        F = null;
        G = null;
        H = null;
        I = null;
        setDescendantFocusability(0x40000);
        float f1 = getResources().getDisplayMetrics().density;
        n = (int)(64F * f1 + 0.5F);
        float f2 = 400F * f1;
        r = new z(this, 3);
        s = new z(this, 5);
        a = android.support.v4.widget.cf.a(this, 1.0F, r);
        a.j = 1;
        a.h = f2;
        r.b = a;
        b = android.support.v4.widget.cf.a(this, 1.0F, s);
        b.j = 2;
        b.h = f2;
        s.b = b;
        setFocusableInTouchMode(true);
        bt.c(this, 1);
        bt.a(this, new r(this));
        cp.a(this);
        if (bt.q(this))
        {
            h.a(this);
            A = h.a(context);
        }
        m = f1 * 10F;
        J = new ArrayList();
    }

    static View a(DrawerLayout drawerlayout)
    {
        return drawerlayout.e();
    }

    static void a(View view, float f1)
    {
        view = (x)view.getLayoutParams();
        if (f1 == ((x) (view)).b)
        {
            return;
        } else
        {
            view.b = f1;
            return;
        }
    }

    private void a(boolean flag)
    {
        int l1 = getChildCount();
        int j1 = 0;
        int i1 = 0;
        while (j1 < l1) 
        {
label0:
            {
                View view = getChildAt(j1);
                x x1 = (x)view.getLayoutParams();
                int k1 = i1;
                if (!d(view))
                {
                    break label0;
                }
                if (flag)
                {
                    k1 = i1;
                    if (!x1.c)
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
                x1.c = false;
                k1 = i1;
            }
            j1++;
            i1 = k1;
        }
        r.a();
        s.a();
        if (i1 != 0)
        {
            invalidate();
        }
    }

    private static boolean a(Drawable drawable, int i1)
    {
        if (drawable == null || !android.support.v4.a.a.a.b(drawable))
        {
            return false;
        } else
        {
            android.support.v4.a.a.a.b(drawable, i1);
            return true;
        }
    }

    static int[] a()
    {
        return i;
    }

    static float b(View view)
    {
        return ((x)view.getLayoutParams()).b;
    }

    static boolean b()
    {
        return j;
    }

    private View c()
    {
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            if (((x)view.getLayoutParams()).d)
            {
                return view;
            }
        }

        return null;
    }

    private void d()
    {
        int i1;
        if (k)
        {
            return;
        }
        i1 = bt.e(this);
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        if (F == null) goto _L4; else goto _L3
_L3:
        Drawable drawable;
        a(F, i1);
        drawable = F;
_L6:
        B = drawable;
        i1 = bt.e(this);
        if (i1 == 0)
        {
            if (G == null)
            {
                break MISSING_BLOCK_LABEL_134;
            }
            a(G, i1);
            drawable = G;
        } else
        {
            if (F == null)
            {
                break MISSING_BLOCK_LABEL_134;
            }
            a(F, i1);
            drawable = F;
        }
_L7:
        C = drawable;
        return;
_L2:
        if (G == null) goto _L4; else goto _L5
_L5:
        a(G, i1);
        drawable = G;
          goto _L6
_L4:
        drawable = H;
          goto _L6
        drawable = I;
          goto _L7
    }

    static boolean d(View view)
    {
        return (android.support.v4.view.q.a(((x)view.getLayoutParams()).a, bt.e(view)) & 7) != 0;
    }

    private View e()
    {
        int j1 = getChildCount();
        boolean flag;
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            if (!d(view))
            {
                continue;
            }
            if (!d(view))
            {
                throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a drawer").toString());
            }
            if (((x)view.getLayoutParams()).b > 0.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return view;
            }
        }

        return null;
    }

    public static boolean g(View view)
    {
        if (!d(view))
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a drawer").toString());
        } else
        {
            return ((x)view.getLayoutParams()).d;
        }
    }

    static boolean h(View view)
    {
        return bt.c(view) != 4 && bt.c(view) != 2;
    }

    private static boolean i(View view)
    {
        return ((x)view.getLayoutParams()).a == 0;
    }

    public final int a(View view)
    {
        int i1 = c(view);
        if (i1 == 3)
        {
            return v;
        }
        if (i1 == 5)
        {
            return w;
        } else
        {
            return 0;
        }
    }

    final View a(int i1)
    {
        int j1 = android.support.v4.view.q.a(i1, bt.e(this));
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

    final void a(View view, boolean flag)
    {
        int j1 = getChildCount();
        int i1 = 0;
        while (i1 < j1) 
        {
            View view1 = getChildAt(i1);
            if (!flag && !d(view1) || flag && view1 == view)
            {
                bt.c(view1, 1);
            } else
            {
                bt.c(view1, 4);
            }
            i1++;
        }
    }

    final boolean a(View view, int i1)
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
                if (g(view))
                {
                    flag = true;
                    view.addFocusables(arraylist, i1, j1);
                }
            } else
            {
                J.add(view);
            }
            k1++;
        }
        if (!flag)
        {
            int i2 = J.size();
            for (int l1 = ((flag1) ? 1 : 0); l1 < i2; l1++)
            {
                View view1 = (View)J.get(l1);
                if (view1.getVisibility() == 0)
                {
                    view1.addFocusables(arraylist, i1, j1);
                }
            }

        }
        J.clear();
    }

    public void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.addView(view, i1, layoutparams);
        if (c() != null || d(view))
        {
            bt.c(view, 4);
        } else
        {
            bt.c(view, 1);
        }
        if (!j)
        {
            bt.a(view, l);
        }
    }

    final int c(View view)
    {
        return android.support.v4.view.q.a(((x)view.getLayoutParams()).a, bt.e(this));
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof x) && super.checkLayoutParams(layoutparams);
    }

    public void computeScroll()
    {
        int j1 = getChildCount();
        float f1 = 0.0F;
        for (int i1 = 0; i1 < j1; i1++)
        {
            f1 = Math.max(f1, ((x)getChildAt(i1).getLayoutParams()).b);
        }

        p = f1;
        if (a.c() | b.c())
        {
            bt.b(this);
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
        if (p > 0.0F && flag1)
        {
            int j1 = (int)((float)((o & 0xff000000) >>> 24) * p);
            int i4 = o;
            q.setColor(j1 << 24 | i4 & 0xffffff);
            canvas.drawRect(j2, 0.0F, i3, getHeight(), q);
        } else
        {
            if (B != null && a(view, 3))
            {
                int k1 = B.getIntrinsicWidth();
                int k2 = view.getRight();
                int j3 = a.i;
                float f1 = Math.max(0.0F, Math.min((float)k2 / (float)j3, 1.0F));
                B.setBounds(k2, view.getTop(), k1 + k2, view.getBottom());
                B.setAlpha((int)(255F * f1));
                B.draw(canvas);
                return flag2;
            }
            if (C != null && a(view, 5))
            {
                int i2 = C.getIntrinsicWidth();
                int l2 = view.getLeft();
                int k3 = getWidth();
                int j4 = b.i;
                float f2 = Math.max(0.0F, Math.min((float)(k3 - l2) / (float)j4, 1.0F));
                C.setBounds(l2 - i2, view.getTop(), l2, view.getBottom());
                C.setAlpha((int)(255F * f2));
                C.draw(canvas);
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
        if (u)
        {
            x x1 = (x)view.getLayoutParams();
            x1.b = 1.0F;
            x1.d = true;
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

    public final void f(View view)
    {
        if (!d(view))
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a sliding drawer").toString());
        }
        if (u)
        {
            view = (x)view.getLayoutParams();
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

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new x();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new x(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof x)
        {
            return new x((x)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new x((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new x(layoutparams);
        }
    }

    public float getDrawerElevation()
    {
        if (k)
        {
            return m;
        } else
        {
            return 0.0F;
        }
    }

    public Drawable getStatusBarBackgroundDrawable()
    {
        return A;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        u = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        u = true;
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (E && A != null)
        {
            int i1 = h.a(D);
            if (i1 > 0)
            {
                A.setBounds(0, 0, getWidth(), i1);
                A.draw(canvas);
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
        i1 = at.a(motionevent);
        flag1 = a.a(motionevent);
        flag2 = b.a(motionevent);
        i1;
        JVM INSTR tableswitch 0 3: default 60
    //                   0 131
    //                   1 363
    //                   2 199
    //                   3 363;
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
        if (!((x)getChildAt(i1).getLayoutParams()).c) goto _L10; else goto _L9
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
        y = f1;
        z = f3;
        if (p <= 0.0F) goto _L13; else goto _L12
_L12:
        motionevent = a.b((int)f1, (int)f3);
        if (motionevent == null || !i(motionevent)) goto _L13; else goto _L14
_L14:
        i1 = 1;
_L25:
        x = false;
        d = false;
          goto _L15
_L4:
        int k1;
        motionevent = a;
        k1 = ((cf) (motionevent)).c.length;
        j1 = 0;
_L21:
        if (j1 >= k1) goto _L17; else goto _L16
_L16:
        if ((((cf) (motionevent)).g & 1 << j1) != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            float f2 = ((cf) (motionevent)).e[j1] - ((cf) (motionevent)).c[j1];
            float f4 = ((cf) (motionevent)).f[j1] - ((cf) (motionevent)).d[j1];
            if (f2 * f2 + f4 * f4 > (float)(((cf) (motionevent)).b * ((cf) (motionevent)).b))
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
        r.a();
        s.a();
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
        x = false;
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
            if (e() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                android.support.v4.view.u.c(keyevent);
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
            keyevent = e();
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
        t = true;
        k2 = k1 - i1;
        l2 = getChildCount();
        k1 = 0;
_L2:
        View view;
        x x1;
        if (k1 >= l2)
        {
            break MISSING_BLOCK_LABEL_445;
        }
        view = getChildAt(k1);
        if (view.getVisibility() != 8)
        {
            x1 = (x)view.getLayoutParams();
            if (!i(view))
            {
                break; /* Loop/switch isn't completed */
            }
            view.layout(x1.leftMargin, x1.topMargin, x1.leftMargin + view.getMeasuredWidth(), x1.topMargin + view.getMeasuredHeight());
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
            i2 = (int)((float)i3 * x1.b) + i1;
            f1 = (float)(i3 + i2) / (float)i3;
        } else
        {
            i2 = k2 - (int)((float)i3 * x1.b);
            f1 = (float)(k2 - i2) / (float)i3;
        }
        if (f1 != x1.b)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        x1.a & 0x70;
        JVM INSTR lookupswitch 2: default 212
    //                   16: 355
    //                   80: 315;
           goto _L3 _L4 _L5
_L4:
        break MISSING_BLOCK_LABEL_355;
_L3:
        view.layout(i2, x1.topMargin, i3 + i2, j3 + x1.topMargin);
_L7:
        if (flag1)
        {
            a(view, f1);
        }
        int j2;
        int k3;
        if (x1.b > 0.0F)
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
        view.layout(i2, i1 - x1.bottomMargin - view.getMeasuredHeight(), i3 + i2, i1 - x1.bottomMargin);
          goto _L7
        k3 = l1 - j1;
        j2 = (k3 - j3) / 2;
        if (j2 < x1.topMargin)
        {
            i1 = x1.topMargin;
        } else
        {
            i1 = j2;
            if (j2 + j3 > k3 - x1.bottomMargin)
            {
                i1 = k3 - x1.bottomMargin - j3;
            }
        }
        view.layout(i2, i1, i3 + i2, j3 + i1);
          goto _L7
        t = false;
        u = false;
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
        if (D != null && bt.q(this))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k2 = bt.e(this);
        l2 = getChildCount();
        while (j2 < l2) 
        {
            Object obj = getChildAt(j2);
            if (((View) (obj)).getVisibility() != 8)
            {
                Object obj1 = (x)((View) (obj)).getLayoutParams();
                if (flag)
                {
                    int j3 = android.support.v4.view.q.a(((x) (obj1)).a, k2);
                    if (bt.q(((View) (obj))))
                    {
                        h.a(((View) (obj)), D, j3);
                    } else
                    {
                        h.a(((android.view.ViewGroup.MarginLayoutParams) (obj1)), D, j3);
                    }
                }
                if (i(((View) (obj))))
                {
                    ((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec(l1 - ((x) (obj1)).leftMargin - ((x) (obj1)).rightMargin, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(k1 - ((x) (obj1)).topMargin - ((x) (obj1)).bottomMargin, 0x40000000));
                } else
                if (d(((View) (obj))))
                {
                    if (k && bt.n(((View) (obj))) != m)
                    {
                        bt.e(((View) (obj)), m);
                    }
                    int k3 = c(((View) (obj))) & 7;
                    if ((k3 & 0) != 0)
                    {
                        obj1 = new StringBuilder("Child drawer has absolute gravity ");
                        if ((k3 & 3) == 3)
                        {
                            obj = "LEFT";
                        } else
                        if ((k3 & 5) == 5)
                        {
                            obj = "RIGHT";
                        } else
                        {
                            obj = Integer.toHexString(k3);
                        }
                        throw new IllegalStateException(((StringBuilder) (obj1)).append(((String) (obj))).append(" but this DrawerLayout already has a drawer view along that edge").toString());
                    }
                    ((View) (obj)).measure(getChildMeasureSpec(i1, n + ((x) (obj1)).leftMargin + ((x) (obj1)).rightMargin, ((x) (obj1)).width), getChildMeasureSpec(j1, ((x) (obj1)).topMargin + ((x) (obj1)).bottomMargin, ((x) (obj1)).height));
                } else
                {
                    throw new IllegalStateException((new StringBuilder("Child ")).append(obj).append(" at index ").append(j2).append(" does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY").toString());
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
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((SavedState) (parcelable)).a != 0)
        {
            View view = a(((SavedState) (parcelable)).a);
            if (view != null)
            {
                e(view);
            }
        }
        setDrawerLockMode(((SavedState) (parcelable)).b, 3);
        setDrawerLockMode(((SavedState) (parcelable)).c, 5);
    }

    public void onRtlPropertiesChanged(int i1)
    {
        d();
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        View view = c();
        if (view != null)
        {
            savedstate.a = ((x)view.getLayoutParams()).a;
        }
        savedstate.b = v;
        savedstate.c = w;
        return savedstate;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        a.b(motionevent);
        b.b(motionevent);
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 3: default 56
    //                   0 58
    //                   1 90
    //                   2 56
    //                   3 203;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        return true;
_L2:
        float f1 = motionevent.getX();
        float f3 = motionevent.getY();
        y = f1;
        z = f3;
        x = false;
        d = false;
        return true;
_L3:
        float f2;
        float f4;
        f4 = motionevent.getX();
        f2 = motionevent.getY();
        motionevent = a.b((int)f4, (int)f2);
        if (motionevent == null || !i(motionevent)) goto _L6; else goto _L5
_L5:
        int i1;
        f4 -= y;
        f2 -= z;
        i1 = a.b;
        if (f4 * f4 + f2 * f2 >= (float)(i1 * i1)) goto _L6; else goto _L7
_L7:
        motionevent = c();
        if (motionevent == null) goto _L6; else goto _L8
_L8:
        boolean flag;
        if (a(motionevent) == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L10:
        a(flag);
        x = false;
        return true;
_L4:
        a(true);
        x = false;
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
        x = flag;
        if (flag)
        {
            a(true);
        }
    }

    public void requestLayout()
    {
        if (!t)
        {
            super.requestLayout();
        }
    }

    public void setChildInsets(Object obj, boolean flag)
    {
        D = obj;
        E = flag;
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

    public void setDrawerElevation(float f1)
    {
        m = f1;
        for (int i1 = 0; i1 < getChildCount(); i1++)
        {
            View view = getChildAt(i1);
            if (d(view))
            {
                bt.e(view, m);
            }
        }

    }

    public void setDrawerListener(w w1)
    {
        e = w1;
    }

    public void setDrawerLockMode(int i1)
    {
        setDrawerLockMode(i1, 3);
        setDrawerLockMode(i1, 5);
    }

    public void setDrawerLockMode(int i1, int j1)
    {
        j1 = android.support.v4.view.q.a(j1, bt.e(this));
        if (j1 == 3)
        {
            v = i1;
        } else
        if (j1 == 5)
        {
            w = i1;
        }
        if (i1 != 0)
        {
            cf cf1;
            if (j1 == 3)
            {
                cf1 = a;
            } else
            {
                cf1 = b;
            }
            cf1.a();
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
        if ((view = a(j1)) != null)
        {
            e(view);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if ((view = a(j1)) != null)
        {
            f(view);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void setDrawerLockMode(int i1, View view)
    {
        if (!d(view))
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a drawer with appropriate layout_gravity").toString());
        } else
        {
            setDrawerLockMode(i1, ((x)view.getLayoutParams()).a);
            return;
        }
    }

    public void setDrawerShadow(int i1, int j1)
    {
        setDrawerShadow(getResources().getDrawable(i1), j1);
    }

    public void setDrawerShadow(Drawable drawable, int i1)
    {
        if (!k) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((i1 & 0x800003) == 0x800003)
        {
            F = drawable;
        } else
        if ((i1 & 0x800005) == 0x800005)
        {
            G = drawable;
        } else
        {
            if ((i1 & 3) != 3)
            {
                continue; /* Loop/switch isn't completed */
            }
            H = drawable;
        }
_L4:
        d();
        invalidate();
        return;
        if ((i1 & 5) != 5) goto _L1; else goto _L3
_L3:
        I = drawable;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void setDrawerTitle(int i1, CharSequence charsequence)
    {
        i1 = android.support.v4.view.q.a(i1, bt.e(this));
        if (i1 == 3)
        {
            f = charsequence;
        } else
        if (i1 == 5)
        {
            g = charsequence;
            return;
        }
    }

    public void setScrimColor(int i1)
    {
        o = i1;
        invalidate();
    }

    public void setStatusBarBackground(int i1)
    {
        Drawable drawable;
        if (i1 != 0)
        {
            drawable = android.support.v4.content.g.a(getContext(), i1);
        } else
        {
            drawable = null;
        }
        A = drawable;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable)
    {
        A = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i1)
    {
        A = new ColorDrawable(i1);
        invalidate();
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
        j = flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        k = flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            h = new android.support.v4.widget.u();
        } else
        {
            h = new v();
        }
    }

    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new y();
        int a;
        int b;
        int c;

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            parcel.writeInt(a);
        }


        public SavedState(Parcel parcel)
        {
            super(parcel);
            a = 0;
            b = 0;
            c = 0;
            a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
            a = 0;
            b = 0;
            c = 0;
        }
    }

}
