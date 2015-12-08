// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.view.ao;
import android.support.v4.view.as;
import android.support.v4.view.ay;
import android.support.v4.view.bp;
import android.support.v4.view.v;
import android.support.v7.a.b;
import android.support.v7.a.l;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.view.menu.y;
import android.support.v7.internal.widget.ab;
import android.support.v7.internal.widget.ag;
import android.support.v7.internal.widget.ax;
import android.support.v7.internal.widget.az;
import android.support.v7.internal.widget.ba;
import android.support.v7.internal.widget.be;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            ce, cf, cg, ActionMenuView, 
//            ch, ActionMenuPresenter, j

public class Toolbar extends ViewGroup
{

    private boolean A;
    private final ArrayList B;
    private final int C[];
    private final android.support.v7.widget.j D;
    private ba E;
    private ActionMenuPresenter F;
    private ch G;
    private y H;
    private j I;
    private boolean J;
    private final Runnable K;
    private final ax L;
    View a;
    private ActionMenuView b;
    private TextView c;
    private TextView d;
    private ImageButton e;
    private ImageView f;
    private Drawable g;
    private CharSequence h;
    private ImageButton i;
    private Context j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private final ag t;
    private int u;
    private CharSequence v;
    private CharSequence w;
    private int x;
    private int y;
    private boolean z;

    public Toolbar(Context context)
    {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.H);
    }

    public Toolbar(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        t = new ag();
        u = 0x800013;
        B = new ArrayList();
        C = new int[2];
        D = new ce(this);
        K = new cf(this);
        context = az.a(getContext(), attributeset, l.bp, i1);
        l = context.f(l.bJ, 0);
        m = context.f(l.bC, 0);
        u = context.b(l.bq, u);
        n = 48;
        i1 = context.c(l.bI, 0);
        s = i1;
        r = i1;
        q = i1;
        p = i1;
        i1 = context.c(l.bG, -1);
        if (i1 >= 0)
        {
            p = i1;
        }
        i1 = context.c(l.bF, -1);
        if (i1 >= 0)
        {
            q = i1;
        }
        i1 = context.c(l.bH, -1);
        if (i1 >= 0)
        {
            r = i1;
        }
        i1 = context.c(l.bE, -1);
        if (i1 >= 0)
        {
            s = i1;
        }
        o = context.d(l.bx, -1);
        i1 = context.c(l.bw, 0x80000000);
        int j1 = context.c(l.bt, 0x80000000);
        int k1 = context.d(l.bu, 0);
        int l1 = context.d(l.bv, 0);
        t.b(k1, l1);
        if (i1 != 0x80000000 || j1 != 0x80000000)
        {
            t.a(i1, j1);
        }
        g = context.a(l.bs);
        h = context.c(l.br);
        attributeset = context.c(l.bD);
        if (!TextUtils.isEmpty(attributeset))
        {
            a(attributeset);
        }
        attributeset = context.c(l.bB);
        if (!TextUtils.isEmpty(attributeset))
        {
            b(attributeset);
        }
        j = getContext();
        a(context.f(l.bA, 0));
        attributeset = context.a(l.bz);
        if (attributeset != null)
        {
            b(attributeset);
        }
        attributeset = context.c(l.by);
        if (!TextUtils.isEmpty(attributeset))
        {
            c(attributeset);
        }
        context.b();
        L = context.c();
    }

    private int a(View view, int i1)
    {
        LayoutParams layoutparams;
        int j1;
        int k1;
        int l1;
        int i2;
        layoutparams = (LayoutParams)view.getLayoutParams();
        l1 = view.getMeasuredHeight();
        if (i1 > 0)
        {
            i1 = (l1 - i1) / 2;
        } else
        {
            i1 = 0;
        }
        k1 = layoutparams.a & 0x70;
        j1 = k1;
        k1;
        JVM INSTR lookupswitch 3: default 76
    //                   16: 85
    //                   48: 85
    //                   80: 85;
           goto _L1 _L2 _L2 _L2
_L1:
        j1 = u & 0x70;
_L2:
        j1;
        JVM INSTR lookupswitch 2: default 112
    //                   48: 167
    //                   80: 174;
           goto _L3 _L4 _L5
_L3:
        j1 = getPaddingTop();
        k1 = getPaddingBottom();
        i2 = getHeight();
        i1 = (i2 - j1 - k1 - l1) / 2;
        if (i1 >= layoutparams.topMargin) goto _L7; else goto _L6
_L6:
        i1 = layoutparams.topMargin;
_L9:
        return i1 + j1;
_L4:
        return getPaddingTop() - i1;
_L5:
        return getHeight() - getPaddingBottom() - l1 - layoutparams.bottomMargin - i1;
_L7:
        k1 = i2 - k1 - l1 - i1 - j1;
        if (k1 < layoutparams.bottomMargin)
        {
            i1 = Math.max(0, i1 - (layoutparams.bottomMargin - k1));
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    private int a(View view, int i1, int j1, int k1, int l1, int ai[])
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int i2 = marginlayoutparams.leftMargin - ai[0];
        int j2 = marginlayoutparams.rightMargin - ai[1];
        int k2 = Math.max(0, i2) + Math.max(0, j2);
        ai[0] = Math.max(0, -i2);
        ai[1] = Math.max(0, -j2);
        view.measure(getChildMeasureSpec(i1, getPaddingLeft() + getPaddingRight() + k2 + j1, marginlayoutparams.width), getChildMeasureSpec(k1, getPaddingTop() + getPaddingBottom() + marginlayoutparams.topMargin + marginlayoutparams.bottomMargin + l1, marginlayoutparams.height));
        return view.getMeasuredWidth() + k2;
    }

    private int a(View view, int i1, int ai[], int j1)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        int k1 = layoutparams.leftMargin - ai[0];
        i1 = Math.max(0, k1) + i1;
        ai[0] = Math.max(0, -k1);
        j1 = a(view, j1);
        k1 = view.getMeasuredWidth();
        view.layout(i1, j1, i1 + k1, view.getMeasuredHeight() + j1);
        return layoutparams.rightMargin + k1 + i1;
    }

    private static LayoutParams a(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof LayoutParams)
        {
            return new LayoutParams((LayoutParams)layoutparams);
        }
        if (layoutparams instanceof android.support.v7.app.ActionBar.LayoutParams)
        {
            return new LayoutParams((android.support.v7.app.ActionBar.LayoutParams)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new LayoutParams(layoutparams);
        }
    }

    static void a(Toolbar toolbar)
    {
        if (toolbar.i == null)
        {
            toolbar.i = new ImageButton(toolbar.getContext(), null, b.G);
            toolbar.i.setImageDrawable(toolbar.g);
            toolbar.i.setContentDescription(toolbar.h);
            LayoutParams layoutparams = new LayoutParams();
            layoutparams.a = 0x800003 | toolbar.n & 0x70;
            layoutparams.b = 2;
            toolbar.i.setLayoutParams(layoutparams);
            toolbar.i.setOnClickListener(new cg(toolbar));
        }
    }

    static void a(Toolbar toolbar, boolean flag)
    {
        int j1 = toolbar.getChildCount();
        int i1 = 0;
        while (i1 < j1) 
        {
            View view = toolbar.getChildAt(i1);
            if (((LayoutParams)view.getLayoutParams()).b != 2 && view != toolbar.b)
            {
                byte byte0;
                if (flag)
                {
                    byte0 = 8;
                } else
                {
                    byte0 = 0;
                }
                view.setVisibility(byte0);
            }
            i1++;
        }
    }

    private void a(View view)
    {
        Object obj = view.getLayoutParams();
        if (obj == null)
        {
            obj = new LayoutParams();
        } else
        if (!checkLayoutParams(((android.view.ViewGroup.LayoutParams) (obj))))
        {
            obj = a(((android.view.ViewGroup.LayoutParams) (obj)));
        } else
        {
            obj = (LayoutParams)obj;
        }
        obj.b = 1;
        addView(view, ((android.view.ViewGroup.LayoutParams) (obj)));
    }

    private void a(View view, int i1, int j1, int k1, int l1)
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int i2 = getChildMeasureSpec(i1, getPaddingLeft() + getPaddingRight() + marginlayoutparams.leftMargin + marginlayoutparams.rightMargin + j1, marginlayoutparams.width);
        j1 = getChildMeasureSpec(k1, getPaddingTop() + getPaddingBottom() + marginlayoutparams.topMargin + marginlayoutparams.bottomMargin + 0, marginlayoutparams.height);
        k1 = android.view.View.MeasureSpec.getMode(j1);
        i1 = j1;
        if (k1 != 0x40000000)
        {
            i1 = j1;
            if (l1 >= 0)
            {
                i1 = l1;
                if (k1 != 0)
                {
                    i1 = Math.min(android.view.View.MeasureSpec.getSize(j1), l1);
                }
                i1 = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
            }
        }
        view.measure(i2, i1);
    }

    private void a(List list, int i1)
    {
        boolean flag = true;
        boolean flag1 = false;
        int j1;
        int k1;
        if (bp.h(this) != 1)
        {
            flag = false;
        }
        k1 = getChildCount();
        j1 = android.support.v4.view.v.a(i1, bp.h(this));
        list.clear();
        i1 = ((flag1) ? 1 : 0);
        if (flag)
        {
            for (i1 = k1 - 1; i1 >= 0; i1--)
            {
                View view = getChildAt(i1);
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                if (layoutparams.b == 0 && b(view) && b(layoutparams.a) == j1)
                {
                    list.add(view);
                }
            }

        } else
        {
            for (; i1 < k1; i1++)
            {
                View view1 = getChildAt(i1);
                LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
                if (layoutparams1.b == 0 && b(view1) && b(layoutparams1.a) == j1)
                {
                    list.add(view1);
                }
            }

        }
    }

    private int b(int i1)
    {
label0:
        {
            int k1 = bp.h(this);
            int j1 = android.support.v4.view.v.a(i1, k1) & 7;
            i1 = j1;
            switch (j1)
            {
            case 2: // '\002'
            case 4: // '\004'
            default:
                if (k1 != 1)
                {
                    break label0;
                }
                i1 = 5;
                break;

            case 1: // '\001'
            case 3: // '\003'
            case 5: // '\005'
                break;
            }
            return i1;
        }
        return 3;
    }

    private int b(View view, int i1, int ai[], int j1)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        int k1 = layoutparams.rightMargin - ai[1];
        i1 -= Math.max(0, k1);
        ai[1] = Math.max(0, -k1);
        j1 = a(view, j1);
        k1 = view.getMeasuredWidth();
        view.layout(i1 - k1, j1, i1, view.getMeasuredHeight() + j1);
        return i1 - (layoutparams.leftMargin + k1);
    }

    static ImageButton b(Toolbar toolbar)
    {
        return toolbar.i;
    }

    private boolean b(View view)
    {
        return view != null && view.getParent() == this && view.getVisibility() != 8;
    }

    static int c(Toolbar toolbar)
    {
        return toolbar.n;
    }

    private static int c(View view)
    {
        view = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int i1 = ao.a(view);
        return ao.b(view) + i1;
    }

    private static int d(View view)
    {
        view = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int i1 = ((android.view.ViewGroup.MarginLayoutParams) (view)).topMargin;
        return ((android.view.ViewGroup.MarginLayoutParams) (view)).bottomMargin + i1;
    }

    private void e(View view)
    {
        if (((LayoutParams)view.getLayoutParams()).b != 2 && view != b)
        {
            byte byte0;
            if (a != null)
            {
                byte0 = 8;
            } else
            {
                byte0 = 0;
            }
            view.setVisibility(byte0);
        }
    }

    protected static LayoutParams m()
    {
        return new LayoutParams();
    }

    private void o()
    {
        if (e == null)
        {
            e = new ImageButton(getContext(), null, b.G);
            LayoutParams layoutparams = new LayoutParams();
            layoutparams.a = 0x800003 | n & 0x70;
            e.setLayoutParams(layoutparams);
        }
    }

    public final void a(int i1)
    {
label0:
        {
            if (k != i1)
            {
                k = i1;
                if (i1 != 0)
                {
                    break label0;
                }
                j = getContext();
            }
            return;
        }
        j = new ContextThemeWrapper(getContext(), i1);
    }

    public final void a(int i1, int j1)
    {
        t.a(i1, j1);
    }

    public final void a(Context context, int i1)
    {
        l = i1;
        if (c != null)
        {
            c.setTextAppearance(context, i1);
        }
    }

    public final void a(Drawable drawable)
    {
        if (drawable == null) goto _L2; else goto _L1
_L1:
        if (f == null)
        {
            f = new ImageView(getContext());
        }
        if (f.getParent() == null)
        {
            a(((View) (f)));
            e(f);
        }
_L4:
        if (f != null)
        {
            f.setImageDrawable(drawable);
        }
        return;
_L2:
        if (f != null && f.getParent() != null)
        {
            removeView(f);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(i i1, ActionMenuPresenter actionmenupresenter)
    {
        if (i1 != null || b != null)
        {
            if (b == null)
            {
                b = new ActionMenuView(getContext());
                b.a(k);
                b.a(D);
                b.a(H, I);
                LayoutParams layoutparams = new LayoutParams();
                layoutparams.a = 0x800005 | n & 0x70;
                b.setLayoutParams(layoutparams);
                a(((View) (b)));
            }
            i j1 = b.c();
            if (j1 != i1)
            {
                if (j1 != null)
                {
                    j1.b(F);
                    j1.b(G);
                }
                if (G == null)
                {
                    G = new ch(this, (byte)0);
                }
                actionmenupresenter.f();
                if (i1 != null)
                {
                    i1.a(actionmenupresenter, j);
                    i1.a(G, j);
                } else
                {
                    actionmenupresenter.a(j, null);
                    G.a(j, null);
                    actionmenupresenter.b(true);
                    G.b(true);
                }
                b.a(k);
                b.a(actionmenupresenter);
                F = actionmenupresenter;
                return;
            }
        }
    }

    public final void a(android.view.View.OnClickListener onclicklistener)
    {
        o();
        e.setOnClickListener(onclicklistener);
    }

    public final void a(CharSequence charsequence)
    {
        if (TextUtils.isEmpty(charsequence)) goto _L2; else goto _L1
_L1:
        if (c == null)
        {
            Context context = getContext();
            c = new TextView(context);
            c.setSingleLine();
            c.setEllipsize(android.text.TextUtils.TruncateAt.END);
            if (l != 0)
            {
                c.setTextAppearance(context, l);
            }
            if (x != 0)
            {
                c.setTextColor(x);
            }
        }
        if (c.getParent() == null)
        {
            a(((View) (c)));
            e(c);
        }
_L4:
        if (c != null)
        {
            c.setText(charsequence);
        }
        v = charsequence;
        return;
_L2:
        if (c != null && c.getParent() != null)
        {
            removeView(c);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(boolean flag)
    {
        J = flag;
        requestLayout();
    }

    public final boolean a()
    {
        return getVisibility() == 0 && b != null && b.a();
    }

    public final void b(Context context, int i1)
    {
        m = i1;
        if (d != null)
        {
            d.setTextAppearance(context, i1);
        }
    }

    public final void b(Drawable drawable)
    {
        if (drawable == null) goto _L2; else goto _L1
_L1:
        o();
        if (e.getParent() == null)
        {
            a(e);
            e(e);
        }
_L4:
        if (e != null)
        {
            e.setImageDrawable(drawable);
        }
        return;
_L2:
        if (e != null && e.getParent() != null)
        {
            removeView(e);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void b(CharSequence charsequence)
    {
        if (TextUtils.isEmpty(charsequence)) goto _L2; else goto _L1
_L1:
        if (d == null)
        {
            Context context = getContext();
            d = new TextView(context);
            d.setSingleLine();
            d.setEllipsize(android.text.TextUtils.TruncateAt.END);
            if (m != 0)
            {
                d.setTextAppearance(context, m);
            }
            if (y != 0)
            {
                d.setTextColor(y);
            }
        }
        if (d.getParent() == null)
        {
            a(d);
            e(d);
        }
_L4:
        if (d != null)
        {
            d.setText(charsequence);
        }
        w = charsequence;
        return;
_L2:
        if (d != null && d.getParent() != null)
        {
            removeView(d);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean b()
    {
        return b != null && b.f();
    }

    public final void c(CharSequence charsequence)
    {
        if (!TextUtils.isEmpty(charsequence))
        {
            o();
        }
        if (e != null)
        {
            e.setContentDescription(charsequence);
        }
    }

    public final boolean c()
    {
        return b != null && b.g();
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return super.checkLayoutParams(layoutparams) && (layoutparams instanceof LayoutParams);
    }

    public final boolean d()
    {
        return b != null && b.d();
    }

    public final boolean e()
    {
        return b != null && b.e();
    }

    public final void f()
    {
        if (b != null)
        {
            b.h();
        }
    }

    public final boolean g()
    {
        return G != null && G.b != null;
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
        return a(layoutparams);
    }

    public final void h()
    {
        m m1;
        if (G == null)
        {
            m1 = null;
        } else
        {
            m1 = G.b;
        }
        if (m1 != null)
        {
            m1.collapseActionView();
        }
    }

    public final CharSequence i()
    {
        return v;
    }

    public final CharSequence j()
    {
        return w;
    }

    public final CharSequence k()
    {
        if (e != null)
        {
            return e.getContentDescription();
        } else
        {
            return null;
        }
    }

    public final Drawable l()
    {
        if (e != null)
        {
            return e.getDrawable();
        } else
        {
            return null;
        }
    }

    public final ab n()
    {
        if (E == null)
        {
            E = new ba(this);
        }
        return E;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks(K);
    }

    public boolean onHoverEvent(MotionEvent motionevent)
    {
        int i1 = ay.a(motionevent);
        if (i1 == 9)
        {
            A = false;
        }
        if (!A)
        {
            boolean flag = super.onHoverEvent(motionevent);
            if (i1 == 9 && !flag)
            {
                A = true;
            }
        }
        if (i1 == 10 || i1 == 3)
        {
            A = false;
        }
        return true;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        Object obj;
        Object obj1;
        int ai[];
        int i2;
        boolean flag1;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        int k4;
        boolean flag2;
        if (bp.h(this) == 1)
        {
            l2 = 1;
        } else
        {
            l2 = 0;
        }
        k3 = getWidth();
        j4 = getHeight();
        i2 = getPaddingLeft();
        l3 = getPaddingRight();
        i4 = getPaddingTop();
        k4 = getPaddingBottom();
        l1 = k3 - l3;
        ai = C;
        ai[1] = 0;
        ai[0] = 0;
        j3 = bp.n(this);
        LayoutParams layoutparams2;
        int k2;
        if (b(e))
        {
            if (l2 != 0)
            {
                l1 = b(e, l1, ai, j3);
                i1 = i2;
            } else
            {
                i1 = a(e, i2, ai, j3);
            }
        } else
        {
            i1 = i2;
        }
        j1 = l1;
        k1 = i1;
        if (b(i))
        {
            if (l2 != 0)
            {
                j1 = b(i, l1, ai, j3);
                k1 = i1;
            } else
            {
                k1 = a(i, i1, ai, j3);
                j1 = l1;
            }
        }
        i1 = j1;
        l1 = k1;
        if (b(b))
        {
            if (l2 != 0)
            {
                l1 = a(b, k1, ai, j3);
                i1 = j1;
            } else
            {
                i1 = b(b, j1, ai, j3);
                l1 = k1;
            }
        }
        ai[0] = Math.max(0, t.a() - l1);
        ai[1] = Math.max(0, t.b() - (k3 - l3 - i1));
        k1 = Math.max(l1, t.a());
        l1 = Math.min(i1, k3 - l3 - t.b());
        j1 = l1;
        i1 = k1;
        if (b(a))
        {
            if (l2 != 0)
            {
                j1 = b(a, l1, ai, j3);
                i1 = k1;
            } else
            {
                i1 = a(a, k1, ai, j3);
                j1 = l1;
            }
        }
        if (b(f))
        {
            if (l2 != 0)
            {
                j1 = b(f, j1, ai, j3);
                k1 = i1;
            } else
            {
                k1 = a(f, i1, ai, j3);
            }
        } else
        {
            k1 = i1;
        }
        flag = b(c);
        flag2 = b(d);
        i1 = 0;
        if (flag)
        {
            LayoutParams layoutparams = (LayoutParams)c.getLayoutParams();
            i1 = layoutparams.topMargin;
            l1 = c.getMeasuredHeight();
            i1 = layoutparams.bottomMargin + (i1 + l1) + 0;
        }
        if (flag2)
        {
            LayoutParams layoutparams1 = (LayoutParams)d.getLayoutParams();
            l1 = layoutparams1.topMargin;
            int j2 = d.getMeasuredHeight();
            i3 = layoutparams1.bottomMargin + (l1 + j2) + i1;
        } else
        {
            i3 = i1;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        l1 = j1;
        i1 = k1;
        if (!flag2) goto _L3; else goto _L2
_L2:
        if (flag)
        {
            obj = c;
        } else
        {
            obj = d;
        }
        if (flag2)
        {
            obj1 = d;
        } else
        {
            obj1 = c;
        }
        obj = (LayoutParams)((View) (obj)).getLayoutParams();
        obj1 = (LayoutParams)((View) (obj1)).getLayoutParams();
        if (flag && c.getMeasuredWidth() > 0 || flag2 && d.getMeasuredWidth() > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        u & 0x70;
        JVM INSTR lookupswitch 2: default 572
    //                   48: 1011
    //                   80: 1085;
           goto _L4 _L5 _L6
_L4:
        i1 = (j4 - i4 - k4 - i3) / 2;
        if (i1 < ((LayoutParams) (obj)).topMargin + r)
        {
            i1 = ((LayoutParams) (obj)).topMargin + r;
        } else
        {
            l1 = j4 - k4 - i3 - i1 - i4;
            if (l1 < ((LayoutParams) (obj)).bottomMargin + s)
            {
                i1 = Math.max(0, i1 - ((((LayoutParams) (obj1)).bottomMargin + s) - l1));
            }
        }
        i1 = i4 + i1;
_L8:
        if (l2 != 0)
        {
            if (flag1)
            {
                l1 = p;
            } else
            {
                l1 = 0;
            }
            l1 -= ai[1];
            j1 -= Math.max(0, l1);
            ai[1] = Math.max(0, -l1);
            if (flag)
            {
                obj = (LayoutParams)c.getLayoutParams();
                l1 = j1 - c.getMeasuredWidth();
                l2 = c.getMeasuredHeight() + i1;
                c.layout(l1, i1, j1, l2);
                i3 = q;
                i1 = l2 + ((LayoutParams) (obj)).bottomMargin;
                l1 -= i3;
            } else
            {
                l1 = j1;
            }
            if (flag2)
            {
                obj = (LayoutParams)d.getLayoutParams();
                i1 = ((LayoutParams) (obj)).topMargin + i1;
                l2 = d.getMeasuredWidth();
                i3 = d.getMeasuredHeight();
                d.layout(j1 - l2, i1, j1, i3 + i1);
                i1 = q;
                l2 = ((LayoutParams) (obj)).bottomMargin;
                i1 = j1 - i1;
            } else
            {
                i1 = j1;
            }
            if (flag1)
            {
                i1 = Math.min(l1, i1);
            } else
            {
                i1 = j1;
            }
            l1 = i1;
            i1 = k1;
        } else
        {
            if (flag1)
            {
                l1 = p;
            } else
            {
                l1 = 0;
            }
            l1 -= ai[0];
            k1 += Math.max(0, l1);
            ai[0] = Math.max(0, -l1);
            if (flag)
            {
                obj = (LayoutParams)c.getLayoutParams();
                l2 = c.getMeasuredWidth() + k1;
                l1 = c.getMeasuredHeight() + i1;
                c.layout(k1, i1, l2, l1);
                i3 = q;
                i1 = ((LayoutParams) (obj)).bottomMargin;
                l2 += i3;
                i1 += l1;
            } else
            {
                l2 = k1;
            }
            if (flag2)
            {
                obj = (LayoutParams)d.getLayoutParams();
                l1 = i1 + ((LayoutParams) (obj)).topMargin;
                i1 = d.getMeasuredWidth() + k1;
                i3 = d.getMeasuredHeight();
                d.layout(k1, l1, i1, i3 + l1);
                l1 = q;
                i3 = ((LayoutParams) (obj)).bottomMargin;
                i3 = l1 + i1;
            } else
            {
                i3 = k1;
            }
            l1 = j1;
            i1 = k1;
            if (flag1)
            {
                i1 = Math.max(l2, i3);
                l1 = j1;
            }
        }
_L3:
        a(B, 3);
        k1 = B.size();
        for (j1 = 0; j1 < k1; j1++)
        {
            i1 = a((View)B.get(j1), i1, ai, j3);
        }

        a(B, 5);
        k2 = B.size();
        k1 = 0;
        j1 = l1;
        for (; k1 < k2; k1++)
        {
            j1 = b((View)B.get(k1), j1, ai, j3);
        }

        a(B, 1);
        obj = B;
        l2 = ai[0];
        k2 = ai[1];
        i3 = ((List) (obj)).size();
        l1 = 0;
        for (k1 = 0; l1 < i3; k1 += k4 + i4 + j4)
        {
            obj1 = (View)((List) (obj)).get(l1);
            layoutparams2 = (LayoutParams)((View) (obj1)).getLayoutParams();
            l2 = layoutparams2.leftMargin - l2;
            k2 = layoutparams2.rightMargin - k2;
            i4 = Math.max(0, l2);
            j4 = Math.max(0, k2);
            l2 = Math.max(0, -l2);
            k2 = Math.max(0, -k2);
            k4 = ((View) (obj1)).getMeasuredWidth();
            l1++;
        }

        l1 = ((k3 - i2 - l3) / 2 + i2) - k1 / 2;
        k1 = l1 + k1;
          goto _L7
_L5:
        i1 = getPaddingTop();
        i1 = ((LayoutParams) (obj)).topMargin + i1 + r;
        break MISSING_BLOCK_LABEL_616;
_L6:
        i1 = j4 - k4 - ((LayoutParams) (obj1)).bottomMargin - s - i3;
          goto _L8
_L7:
        if (l1 >= i1) goto _L10; else goto _L9
_L9:
        l1 = B.size();
        k1 = 0;
        j1 = i1;
        for (i1 = k1; i1 < l1; i1++)
        {
            j1 = a((View)B.get(i1), j1, ai, j3);
        }

        break; /* Loop/switch isn't completed */
_L10:
        i1 = l1;
        if (k1 > j1)
        {
            i1 = l1 - (k1 - j1);
        }
        if (true) goto _L9; else goto _L11
_L11:
        B.clear();
        return;
          goto _L8
    }

    protected void onMeasure(int i1, int j1)
    {
        int ai[] = C;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int k3;
        if (be.a(this))
        {
            k2 = 0;
            l2 = 1;
        } else
        {
            k2 = 1;
            l2 = 0;
        }
        k1 = 0;
        if (b(e))
        {
            a(e, i1, 0, j1, o);
            k1 = e.getMeasuredWidth() + c(e);
            j2 = Math.max(0, e.getMeasuredHeight() + d(e));
            i2 = be.a(0, bp.j(e));
        } else
        {
            i2 = 0;
            j2 = 0;
        }
        i3 = k1;
        k1 = i2;
        l1 = j2;
        if (b(i))
        {
            a(i, i1, 0, j1, o);
            i3 = i.getMeasuredWidth() + c(i);
            l1 = Math.max(j2, i.getMeasuredHeight() + d(i));
            k1 = be.a(i2, bp.j(i));
        }
        i2 = t.c();
        k3 = Math.max(i2, i3) + 0;
        ai[l2] = Math.max(0, i2 - i3);
        l2 = 0;
        i2 = k1;
        j2 = l1;
        if (b(b))
        {
            a(b, i1, k3, j1, o);
            l2 = b.getMeasuredWidth() + c(b);
            j2 = Math.max(l1, b.getMeasuredHeight() + d(b));
            i2 = be.a(k1, bp.j(b));
        }
        k1 = t.d();
        i3 = k3 + Math.max(k1, l2);
        ai[k2] = Math.max(0, k1 - l2);
        k2 = i3;
        k1 = i2;
        l1 = j2;
        if (b(a))
        {
            k2 = i3 + a(a, i1, i3, j1, 0, ai);
            l1 = Math.max(j2, a.getMeasuredHeight() + d(a));
            k1 = be.a(i2, bp.j(a));
        }
        i2 = k2;
        l2 = k1;
        j2 = l1;
        if (b(f))
        {
            i2 = k2 + a(f, i1, k2, j1, 0, ai);
            j2 = Math.max(l1, f.getMeasuredHeight() + d(f));
            l2 = be.a(k1, bp.j(f));
        }
        i3 = getChildCount();
        k2 = 0;
        k1 = l2;
        l1 = j2;
        j2 = k2;
        l2 = i2;
        while (j2 < i3) 
        {
            View view1 = getChildAt(j2);
            View view;
            int j3;
            int l3;
            int i4;
            int j4;
            if (((LayoutParams)view1.getLayoutParams()).b == 0 && b(view1))
            {
                l2 += a(view1, i1, l2, j1, 0, ai);
                i2 = Math.max(l1, view1.getMeasuredHeight() + d(view1));
                l1 = be.a(k1, bp.j(view1));
                k1 = i2;
            } else
            {
                i2 = l1;
                l1 = k1;
                k1 = i2;
            }
            j2++;
            i2 = k1;
            k1 = l1;
            l1 = i2;
        }
        k2 = 0;
        j2 = 0;
        i4 = r + s;
        j4 = p + q;
        i2 = k1;
        if (b(c))
        {
            a(c, i1, l2 + j4, j1, i4, ai);
            i2 = c.getMeasuredWidth();
            k2 = c(c) + i2;
            j2 = c.getMeasuredHeight() + d(c);
            i2 = be.a(k1, bp.j(c));
        }
        l3 = j2;
        j3 = k2;
        k1 = i2;
        if (b(d))
        {
            j3 = Math.max(k2, a(d, i1, l2 + j4, j1, i4 + j2, ai));
            l3 = j2 + (d.getMeasuredHeight() + d(d));
            k1 = be.a(i2, bp.j(d));
        }
        i2 = Math.max(l1, l3);
        l1 = getPaddingLeft();
        l3 = getPaddingRight();
        j2 = getPaddingTop();
        k2 = getPaddingBottom();
        l1 = bp.a(Math.max(j3 + l2 + (l1 + l3), getSuggestedMinimumWidth()), i1, 0xff000000 & k1);
        j1 = bp.a(Math.max(i2 + (j2 + k2), getSuggestedMinimumHeight()), j1, k1 << 16);
        if (J) goto _L2; else goto _L1
_L1:
        i1 = 0;
_L4:
        if (i1 != 0)
        {
            j1 = 0;
        }
        setMeasuredDimension(l1, j1);
        return;
_L2:
        k1 = getChildCount();
        i1 = 0;
        do
        {
            if (i1 >= k1)
            {
                break;
            }
            view = getChildAt(i1);
            if (b(view) && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0)
            {
                i1 = 0;
                continue; /* Loop/switch isn't completed */
            }
            i1++;
        } while (true);
        i1 = 1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        SavedState savedstate = (SavedState)parcelable;
        super.onRestoreInstanceState(savedstate.getSuperState());
        if (b != null)
        {
            parcelable = b.c();
        } else
        {
            parcelable = null;
        }
        if (savedstate.a != 0 && G != null && parcelable != null)
        {
            parcelable = parcelable.findItem(savedstate.a);
            if (parcelable != null)
            {
                as.b(parcelable);
            }
        }
        if (savedstate.b)
        {
            removeCallbacks(K);
            post(K);
        }
    }

    public void onRtlPropertiesChanged(int i1)
    {
        boolean flag = true;
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            super.onRtlPropertiesChanged(i1);
        }
        ag ag1 = t;
        if (i1 != 1)
        {
            flag = false;
        }
        ag1.a(flag);
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        if (G != null && G.b != null)
        {
            savedstate.a = G.b.getItemId();
        }
        savedstate.b = b();
        return savedstate;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1 = ay.a(motionevent);
        if (i1 == 0)
        {
            z = false;
        }
        if (!z)
        {
            boolean flag = super.onTouchEvent(motionevent);
            if (i1 == 0 && !flag)
            {
                z = true;
            }
        }
        if (i1 == 1 || i1 == 3)
        {
            z = false;
        }
        return true;
    }

    private class LayoutParams extends android.support.v7.app.ActionBar.LayoutParams
    {

        int b;

        public LayoutParams()
        {
            b = 0;
            a = 0x800013;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            b = 0;
        }

        public LayoutParams(android.support.v7.app.ActionBar.LayoutParams layoutparams)
        {
            super(layoutparams);
            b = 0;
        }

        public LayoutParams(LayoutParams layoutparams)
        {
            super(layoutparams);
            b = 0;
            b = layoutparams.b;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            b = 0;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            b = 0;
            leftMargin = marginlayoutparams.leftMargin;
            topMargin = marginlayoutparams.topMargin;
            rightMargin = marginlayoutparams.rightMargin;
            bottomMargin = marginlayoutparams.bottomMargin;
        }
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new ci();
        public int a;
        public boolean b;

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            parcel.writeInt(a);
            if (b)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
        }


        public SavedState(Parcel parcel)
        {
            super(parcel);
            a = parcel.readInt();
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b = flag;
        }

        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
