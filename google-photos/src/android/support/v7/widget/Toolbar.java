// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import aay;
import abk;
import afw;
import afx;
import afy;
import afz;
import aga;
import agb;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
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
import b;
import java.util.ArrayList;
import java.util.List;
import ku;
import lj;
import ln;
import lt;
import mk;
import rw;
import uh;
import vv;
import vy;
import wk;
import xp;
import xw;
import yj;
import yk;
import yo;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuView

public class Toolbar extends ViewGroup
{

    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private boolean G;
    private boolean H;
    private final ArrayList I;
    private final int J[];
    private final abk K;
    private yk L;
    private final Runnable M;
    public ActionMenuView a;
    public TextView b;
    public TextView c;
    public ImageButton d;
    public View e;
    public Context f;
    public int g;
    public int h;
    public int i;
    public final xw j;
    public CharSequence k;
    public CharSequence l;
    public final ArrayList m;
    public abk n;
    public aay o;
    public afz p;
    public wk q;
    public vv r;
    public boolean s;
    private ImageView t;
    private Drawable u;
    private CharSequence v;
    private ImageButton w;
    private int x;
    private int y;
    private int z;

    public Toolbar(Context context)
    {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.U);
    }

    public Toolbar(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        j = new xw();
        D = 0x800013;
        I = new ArrayList();
        m = new ArrayList();
        J = new int[2];
        K = new afw(this);
        M = new afx(this);
        context = yj.a(getContext(), attributeset, uh.bG, i1, 0);
        h = context.f(uh.cd, 0);
        i = context.f(uh.bV, 0);
        i1 = uh.bH;
        int j1 = D;
        D = ((yj) (context)).a.getInteger(i1, j1);
        x = 48;
        i1 = context.c(uh.cc, 0);
        C = i1;
        B = i1;
        A = i1;
        z = i1;
        i1 = context.c(uh.ca, -1);
        if (i1 >= 0)
        {
            z = i1;
        }
        i1 = context.c(uh.bZ, -1);
        if (i1 >= 0)
        {
            A = i1;
        }
        i1 = context.c(uh.cb, -1);
        if (i1 >= 0)
        {
            B = i1;
        }
        i1 = context.c(uh.bY, -1);
        if (i1 >= 0)
        {
            C = i1;
        }
        y = context.d(uh.bQ, -1);
        i1 = context.c(uh.bN, 0x80000000);
        j1 = context.c(uh.bK, 0x80000000);
        int k1 = context.d(uh.bL, 0);
        int l1 = context.d(uh.bM, 0);
        attributeset = j;
        attributeset.h = false;
        if (k1 != 0x80000000)
        {
            attributeset.e = k1;
            attributeset.a = k1;
        }
        if (l1 != 0x80000000)
        {
            attributeset.f = l1;
            attributeset.b = l1;
        }
        if (i1 != 0x80000000 || j1 != 0x80000000)
        {
            j.a(i1, j1);
        }
        u = context.a(uh.bJ);
        v = context.c(uh.bI);
        attributeset = context.c(uh.bX);
        if (!TextUtils.isEmpty(attributeset))
        {
            a(attributeset);
        }
        attributeset = context.c(uh.bU);
        if (!TextUtils.isEmpty(attributeset))
        {
            b(attributeset);
        }
        f = getContext();
        a(context.f(uh.bT, 0));
        attributeset = context.a(uh.bS);
        if (attributeset != null)
        {
            b(attributeset);
        }
        attributeset = context.c(uh.bR);
        if (!TextUtils.isEmpty(attributeset))
        {
            c(attributeset);
        }
        attributeset = context.a(uh.bO);
        if (attributeset != null)
        {
            a(attributeset);
        }
        attributeset = context.c(uh.bP);
        if (!TextUtils.isEmpty(attributeset))
        {
            if (!TextUtils.isEmpty(attributeset))
            {
                j();
            }
            if (t != null)
            {
                t.setContentDescription(attributeset);
            }
        }
        if (context.d(uh.ce))
        {
            i1 = context.b(uh.ce, -1);
            E = i1;
            if (b != null)
            {
                b.setTextColor(i1);
            }
        }
        if (context.d(uh.bW))
        {
            i1 = context.b(uh.bW, -1);
            F = i1;
            if (c != null)
            {
                c.setTextColor(i1);
            }
        }
        ((yj) (context)).a.recycle();
        context.a();
    }

    private int a(View view, int i1)
    {
        aga aga1;
        int j1;
        int k1;
        int l1;
        int i2;
        aga1 = (aga)view.getLayoutParams();
        l1 = view.getMeasuredHeight();
        if (i1 > 0)
        {
            i1 = (l1 - i1) / 2;
        } else
        {
            i1 = 0;
        }
        k1 = aga1.a & 0x70;
        j1 = k1;
        k1;
        JVM INSTR lookupswitch 3: default 76
    //                   16: 85
    //                   48: 85
    //                   80: 85;
           goto _L1 _L2 _L2 _L2
_L1:
        j1 = D & 0x70;
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
        if (i1 >= aga1.topMargin) goto _L7; else goto _L6
_L6:
        i1 = aga1.topMargin;
_L9:
        return i1 + j1;
_L4:
        return getPaddingTop() - i1;
_L5:
        return getHeight() - getPaddingBottom() - l1 - aga1.bottomMargin - i1;
_L7:
        k1 = i2 - k1 - l1 - i1 - j1;
        if (k1 < aga1.bottomMargin)
        {
            i1 = Math.max(0, i1 - (aga1.bottomMargin - k1));
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
        aga aga1 = (aga)view.getLayoutParams();
        int k1 = aga1.leftMargin - ai[0];
        i1 = Math.max(0, k1) + i1;
        ai[0] = Math.max(0, -k1);
        j1 = a(view, j1);
        k1 = view.getMeasuredWidth();
        view.layout(i1, j1, i1 + k1, view.getMeasuredHeight() + j1);
        return aga1.rightMargin + k1 + i1;
    }

    public static abk a(Toolbar toolbar)
    {
        return toolbar.n;
    }

    private static aga a(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof aga)
        {
            return new aga((aga)layoutparams);
        }
        if (layoutparams instanceof rw)
        {
            return new aga((rw)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new aga((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new aga(layoutparams);
        }
    }

    private void a(View view, int i1, int j1, int k1, int l1, int i2)
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        l1 = getChildMeasureSpec(i1, getPaddingLeft() + getPaddingRight() + marginlayoutparams.leftMargin + marginlayoutparams.rightMargin + j1, marginlayoutparams.width);
        j1 = getChildMeasureSpec(k1, getPaddingTop() + getPaddingBottom() + marginlayoutparams.topMargin + marginlayoutparams.bottomMargin, marginlayoutparams.height);
        k1 = android.view.View.MeasureSpec.getMode(j1);
        i1 = j1;
        if (k1 != 0x40000000)
        {
            i1 = j1;
            if (i2 >= 0)
            {
                i1 = i2;
                if (k1 != 0)
                {
                    i1 = Math.min(android.view.View.MeasureSpec.getSize(j1), i2);
                }
                i1 = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
            }
        }
        view.measure(l1, i1);
    }

    private void a(View view, boolean flag)
    {
        Object obj = view.getLayoutParams();
        if (obj == null)
        {
            obj = h();
        } else
        if (!checkLayoutParams(((android.view.ViewGroup.LayoutParams) (obj))))
        {
            obj = a(((android.view.ViewGroup.LayoutParams) (obj)));
        } else
        {
            obj = (aga)obj;
        }
        obj.b = 1;
        if (flag && e != null)
        {
            view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            m.add(view);
            return;
        } else
        {
            addView(view, ((android.view.ViewGroup.LayoutParams) (obj)));
            return;
        }
    }

    private void a(List list, int i1)
    {
        boolean flag = true;
        boolean flag1 = false;
        int j1;
        int k1;
        if (mk.h(this) != 1)
        {
            flag = false;
        }
        k1 = getChildCount();
        j1 = ku.a(i1, mk.h(this));
        list.clear();
        i1 = ((flag1) ? 1 : 0);
        if (flag)
        {
            for (i1 = k1 - 1; i1 >= 0; i1--)
            {
                View view = getChildAt(i1);
                aga aga1 = (aga)view.getLayoutParams();
                if (aga1.b == 0 && a(view) && c(aga1.a) == j1)
                {
                    list.add(view);
                }
            }

        } else
        {
            for (; i1 < k1; i1++)
            {
                View view1 = getChildAt(i1);
                aga aga2 = (aga)view1.getLayoutParams();
                if (aga2.b == 0 && a(view1) && c(aga2.a) == j1)
                {
                    list.add(view1);
                }
            }

        }
    }

    private boolean a(View view)
    {
        return view != null && view.getParent() == this && view.getVisibility() != 8;
    }

    private static int b(View view)
    {
        view = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int i1 = lj.a(view);
        return lj.b(view) + i1;
    }

    private int b(View view, int i1, int ai[], int j1)
    {
        aga aga1 = (aga)view.getLayoutParams();
        int k1 = aga1.rightMargin - ai[1];
        i1 -= Math.max(0, k1);
        ai[1] = Math.max(0, -k1);
        j1 = a(view, j1);
        k1 = view.getMeasuredWidth();
        view.layout(i1 - k1, j1, i1, view.getMeasuredHeight() + j1);
        return i1 - (aga1.leftMargin + k1);
    }

    public static void b(Toolbar toolbar)
    {
        if (toolbar.w == null)
        {
            toolbar.w = new ImageButton(toolbar.getContext(), null, b.T);
            toolbar.w.setImageDrawable(toolbar.u);
            toolbar.w.setContentDescription(toolbar.v);
            aga aga1 = h();
            aga1.a = 0x800003 | toolbar.x & 0x70;
            aga1.b = 2;
            toolbar.w.setLayoutParams(aga1);
            toolbar.w.setOnClickListener(new afy(toolbar));
        }
    }

    private int c(int i1)
    {
label0:
        {
            int k1 = mk.h(this);
            int j1 = ku.a(i1, k1) & 7;
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

    private static int c(View view)
    {
        view = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int i1 = ((android.view.ViewGroup.MarginLayoutParams) (view)).topMargin;
        return ((android.view.ViewGroup.MarginLayoutParams) (view)).bottomMargin + i1;
    }

    public static ImageButton c(Toolbar toolbar)
    {
        return toolbar.w;
    }

    public static int d(Toolbar toolbar)
    {
        return toolbar.x;
    }

    private boolean d(View view)
    {
        return view.getParent() == this || m.contains(view);
    }

    public static aga h()
    {
        return new aga(-2, -2);
    }

    private void j()
    {
        if (t == null)
        {
            t = new ImageView(getContext());
        }
    }

    private int k()
    {
        return j.a;
    }

    private int l()
    {
        return j.b;
    }

    public final void a(int i1)
    {
label0:
        {
            if (g != i1)
            {
                g = i1;
                if (i1 != 0)
                {
                    break label0;
                }
                f = getContext();
            }
            return;
        }
        f = new ContextThemeWrapper(getContext(), i1);
    }

    public final void a(Drawable drawable)
    {
        if (drawable == null) goto _L2; else goto _L1
_L1:
        j();
        if (!d(t))
        {
            a(((View) (t)), true);
        }
_L4:
        if (t != null)
        {
            t.setImageDrawable(drawable);
        }
        return;
_L2:
        if (t != null && d(t))
        {
            removeView(t);
            m.remove(t);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(CharSequence charsequence)
    {
        if (TextUtils.isEmpty(charsequence)) goto _L2; else goto _L1
_L1:
        if (b == null)
        {
            Context context = getContext();
            b = new TextView(context);
            b.setSingleLine();
            b.setEllipsize(android.text.TextUtils.TruncateAt.END);
            if (h != 0)
            {
                b.setTextAppearance(context, h);
            }
            if (E != 0)
            {
                b.setTextColor(E);
            }
        }
        if (!d(b))
        {
            a(((View) (b)), true);
        }
_L4:
        if (b != null)
        {
            b.setText(charsequence);
        }
        k = charsequence;
        return;
_L2:
        if (b != null && d(b))
        {
            removeView(b);
            m.remove(b);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean a()
    {
        if (a != null)
        {
            ActionMenuView actionmenuview = a;
            boolean flag;
            if (actionmenuview.c != null && actionmenuview.c.f())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }

    public final void b(int i1)
    {
        CharSequence charsequence;
        if (i1 != 0)
        {
            charsequence = getContext().getText(i1);
        } else
        {
            charsequence = null;
        }
        c(charsequence);
    }

    public final void b(Drawable drawable)
    {
        if (drawable == null) goto _L2; else goto _L1
_L1:
        g();
        if (!d(d))
        {
            a(d, true);
        }
_L4:
        if (d != null)
        {
            d.setImageDrawable(drawable);
        }
        return;
_L2:
        if (d != null && d(d))
        {
            removeView(d);
            m.remove(d);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void b(CharSequence charsequence)
    {
        if (TextUtils.isEmpty(charsequence)) goto _L2; else goto _L1
_L1:
        if (c == null)
        {
            Context context = getContext();
            c = new TextView(context);
            c.setSingleLine();
            c.setEllipsize(android.text.TextUtils.TruncateAt.END);
            if (i != 0)
            {
                c.setTextAppearance(context, i);
            }
            if (F != 0)
            {
                c.setTextColor(F);
            }
        }
        if (!d(c))
        {
            a(c, true);
        }
_L4:
        if (c != null)
        {
            c.setText(charsequence);
        }
        l = charsequence;
        return;
_L2:
        if (c != null && d(c))
        {
            removeView(c);
            m.remove(c);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean b()
    {
        if (a != null)
        {
            ActionMenuView actionmenuview = a;
            boolean flag;
            if (actionmenuview.c != null && actionmenuview.c.b())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }

    public final void c()
    {
        vy vy1;
        if (p == null)
        {
            vy1 = null;
        } else
        {
            vy1 = p.a;
        }
        if (vy1 != null)
        {
            vy1.collapseActionView();
        }
    }

    public final void c(CharSequence charsequence)
    {
        if (!TextUtils.isEmpty(charsequence))
        {
            g();
        }
        if (d != null)
        {
            d.setContentDescription(charsequence);
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return super.checkLayoutParams(layoutparams) && (layoutparams instanceof aga);
    }

    public final CharSequence d()
    {
        if (d != null)
        {
            return d.getContentDescription();
        } else
        {
            return null;
        }
    }

    public final Drawable e()
    {
        if (d != null)
        {
            return d.getDrawable();
        } else
        {
            return null;
        }
    }

    public void f()
    {
        if (a == null)
        {
            a = new ActionMenuView(getContext());
            a.a(g);
            a.f = K;
            Object obj = a;
            wk wk = q;
            vv vv = r;
            obj.d = wk;
            obj.e = vv;
            obj = h();
            obj.a = 0x800005 | x & 0x70;
            a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            a(a, false);
        }
    }

    public void g()
    {
        if (d == null)
        {
            d = new ImageButton(getContext(), null, b.T);
            aga aga1 = h();
            aga1.a = 0x800003 | x & 0x70;
            d.setLayoutParams(aga1);
        }
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return h();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new aga(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return a(layoutparams);
    }

    public final xp i()
    {
        if (L == null)
        {
            L = new yk(this, true);
        }
        return L;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks(M);
    }

    public boolean onHoverEvent(MotionEvent motionevent)
    {
        int i1 = lt.a(motionevent);
        if (i1 == 9)
        {
            H = false;
        }
        if (!H)
        {
            boolean flag = super.onHoverEvent(motionevent);
            if (i1 == 9 && !flag)
            {
                H = true;
            }
        }
        if (i1 == 10 || i1 == 3)
        {
            H = false;
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
        if (mk.h(this) == 1)
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
        ai = J;
        ai[1] = 0;
        ai[0] = 0;
        j3 = mk.q(this);
        aga aga3;
        int k2;
        if (a(d))
        {
            if (l2 != 0)
            {
                l1 = b(d, l1, ai, j3);
                i1 = i2;
            } else
            {
                i1 = a(d, i2, ai, j3);
            }
        } else
        {
            i1 = i2;
        }
        j1 = l1;
        k1 = i1;
        if (a(w))
        {
            if (l2 != 0)
            {
                j1 = b(w, l1, ai, j3);
                k1 = i1;
            } else
            {
                k1 = a(w, i1, ai, j3);
                j1 = l1;
            }
        }
        i1 = j1;
        l1 = k1;
        if (a(a))
        {
            if (l2 != 0)
            {
                l1 = a(a, k1, ai, j3);
                i1 = j1;
            } else
            {
                i1 = b(a, j1, ai, j3);
                l1 = k1;
            }
        }
        ai[0] = Math.max(0, k() - l1);
        ai[1] = Math.max(0, l() - (k3 - l3 - i1));
        k1 = Math.max(l1, k());
        l1 = Math.min(i1, k3 - l3 - l());
        j1 = l1;
        i1 = k1;
        if (a(e))
        {
            if (l2 != 0)
            {
                j1 = b(e, l1, ai, j3);
                i1 = k1;
            } else
            {
                i1 = a(e, k1, ai, j3);
                j1 = l1;
            }
        }
        if (a(t))
        {
            if (l2 != 0)
            {
                j1 = b(t, j1, ai, j3);
                k1 = i1;
            } else
            {
                k1 = a(t, i1, ai, j3);
            }
        } else
        {
            k1 = i1;
        }
        flag = a(b);
        flag2 = a(c);
        i1 = 0;
        if (flag)
        {
            aga aga1 = (aga)b.getLayoutParams();
            i1 = aga1.topMargin;
            l1 = b.getMeasuredHeight();
            i1 = aga1.bottomMargin + (i1 + l1) + 0;
        }
        if (flag2)
        {
            aga aga2 = (aga)c.getLayoutParams();
            l1 = aga2.topMargin;
            int j2 = c.getMeasuredHeight();
            i3 = aga2.bottomMargin + (l1 + j2) + i1;
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
            obj = b;
        } else
        {
            obj = c;
        }
        if (flag2)
        {
            obj1 = c;
        } else
        {
            obj1 = b;
        }
        obj = (aga)((View) (obj)).getLayoutParams();
        obj1 = (aga)((View) (obj1)).getLayoutParams();
        if (flag && b.getMeasuredWidth() > 0 || flag2 && c.getMeasuredWidth() > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        D & 0x70;
        JVM INSTR lookupswitch 2: default 560
    //                   48: 999
    //                   80: 1073;
           goto _L4 _L5 _L6
_L4:
        i1 = (j4 - i4 - k4 - i3) / 2;
        if (i1 < ((aga) (obj)).topMargin + B)
        {
            i1 = ((aga) (obj)).topMargin + B;
        } else
        {
            l1 = j4 - k4 - i3 - i1 - i4;
            if (l1 < ((aga) (obj)).bottomMargin + C)
            {
                i1 = Math.max(0, i1 - ((((aga) (obj1)).bottomMargin + C) - l1));
            }
        }
        i1 = i4 + i1;
_L8:
        if (l2 != 0)
        {
            if (flag1)
            {
                l1 = z;
            } else
            {
                l1 = 0;
            }
            l1 -= ai[1];
            j1 -= Math.max(0, l1);
            ai[1] = Math.max(0, -l1);
            if (flag)
            {
                obj = (aga)b.getLayoutParams();
                l1 = j1 - b.getMeasuredWidth();
                l2 = b.getMeasuredHeight() + i1;
                b.layout(l1, i1, j1, l2);
                i3 = A;
                i1 = l2 + ((aga) (obj)).bottomMargin;
                l1 -= i3;
            } else
            {
                l1 = j1;
            }
            if (flag2)
            {
                obj = (aga)c.getLayoutParams();
                i1 = ((aga) (obj)).topMargin + i1;
                l2 = c.getMeasuredWidth();
                i3 = c.getMeasuredHeight();
                c.layout(j1 - l2, i1, j1, i3 + i1);
                i1 = A;
                l2 = ((aga) (obj)).bottomMargin;
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
                l1 = z;
            } else
            {
                l1 = 0;
            }
            l1 -= ai[0];
            k1 += Math.max(0, l1);
            ai[0] = Math.max(0, -l1);
            if (flag)
            {
                obj = (aga)b.getLayoutParams();
                l2 = b.getMeasuredWidth() + k1;
                l1 = b.getMeasuredHeight() + i1;
                b.layout(k1, i1, l2, l1);
                i3 = A;
                i1 = ((aga) (obj)).bottomMargin;
                l2 += i3;
                i1 += l1;
            } else
            {
                l2 = k1;
            }
            if (flag2)
            {
                obj = (aga)c.getLayoutParams();
                l1 = i1 + ((aga) (obj)).topMargin;
                i1 = c.getMeasuredWidth() + k1;
                i3 = c.getMeasuredHeight();
                c.layout(k1, l1, i1, i3 + l1);
                l1 = A;
                i3 = ((aga) (obj)).bottomMargin;
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
        a(I, 3);
        k1 = I.size();
        for (j1 = 0; j1 < k1; j1++)
        {
            i1 = a((View)I.get(j1), i1, ai, j3);
        }

        a(I, 5);
        k2 = I.size();
        k1 = 0;
        j1 = l1;
        for (; k1 < k2; k1++)
        {
            j1 = b((View)I.get(k1), j1, ai, j3);
        }

        a(I, 1);
        obj = I;
        l2 = ai[0];
        k2 = ai[1];
        i3 = ((List) (obj)).size();
        l1 = 0;
        for (k1 = 0; l1 < i3; k1 += k4 + i4 + j4)
        {
            obj1 = (View)((List) (obj)).get(l1);
            aga3 = (aga)((View) (obj1)).getLayoutParams();
            l2 = aga3.leftMargin - l2;
            k2 = aga3.rightMargin - k2;
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
        i1 = ((aga) (obj)).topMargin + i1 + B;
        break MISSING_BLOCK_LABEL_604;
_L6:
        i1 = j4 - k4 - ((aga) (obj1)).bottomMargin - C - i3;
          goto _L8
_L7:
        if (l1 >= i1) goto _L10; else goto _L9
_L9:
        l1 = I.size();
        k1 = 0;
        j1 = i1;
        for (i1 = k1; i1 < l1; i1++)
        {
            j1 = a((View)I.get(i1), j1, ai, j3);
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
        I.clear();
        return;
          goto _L8
    }

    protected void onMeasure(int i1, int j1)
    {
        int ai[] = J;
        Object obj;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int k3;
        if (yo.a(this))
        {
            k2 = 0;
            l2 = 1;
        } else
        {
            k2 = 1;
            l2 = 0;
        }
        k1 = 0;
        if (a(d))
        {
            a(d, i1, 0, j1, 0, y);
            k1 = d.getMeasuredWidth() + b(d);
            j2 = Math.max(0, d.getMeasuredHeight() + c(d));
            i2 = yo.a(0, mk.k(d));
        } else
        {
            i2 = 0;
            j2 = 0;
        }
        i3 = k1;
        k1 = i2;
        l1 = j2;
        if (a(w))
        {
            a(w, i1, 0, j1, 0, y);
            i3 = w.getMeasuredWidth() + b(w);
            l1 = Math.max(j2, w.getMeasuredHeight() + c(w));
            k1 = yo.a(i2, mk.k(w));
        }
        obj = j;
        if (((xw) (obj)).g)
        {
            i2 = ((xw) (obj)).b;
        } else
        {
            i2 = ((xw) (obj)).a;
        }
        k3 = Math.max(i2, i3) + 0;
        ai[l2] = Math.max(0, i2 - i3);
        l2 = 0;
        i2 = k1;
        j2 = l1;
        if (a(a))
        {
            a(a, i1, k3, j1, 0, y);
            l2 = a.getMeasuredWidth() + b(a);
            j2 = Math.max(l1, a.getMeasuredHeight() + c(a));
            i2 = yo.a(k1, mk.k(a));
        }
        obj = j;
        if (((xw) (obj)).g)
        {
            k1 = ((xw) (obj)).a;
        } else
        {
            k1 = ((xw) (obj)).b;
        }
        i3 = k3 + Math.max(k1, l2);
        ai[k2] = Math.max(0, k1 - l2);
        l2 = i3;
        k1 = i2;
        l1 = j2;
        if (a(e))
        {
            l2 = i3 + a(e, i1, i3, j1, 0, ai);
            l1 = Math.max(j2, e.getMeasuredHeight() + c(e));
            k1 = yo.a(i2, mk.k(e));
        }
        i2 = l2;
        j2 = k1;
        k2 = l1;
        if (a(t))
        {
            i2 = l2 + a(t, i1, l2, j1, 0, ai);
            k2 = Math.max(l1, t.getMeasuredHeight() + c(t));
            j2 = yo.a(k1, mk.k(t));
        }
        i3 = getChildCount();
        l2 = 0;
        l1 = k2;
        k1 = j2;
        j2 = l2;
        l2 = i2;
        while (j2 < i3) 
        {
            obj = getChildAt(j2);
            View view;
            int j3;
            int l3;
            int i4;
            int j4;
            if (((aga)((View) (obj)).getLayoutParams()).b == 0 && a(((View) (obj))))
            {
                l2 += a(((View) (obj)), i1, l2, j1, 0, ai);
                i2 = Math.max(l1, ((View) (obj)).getMeasuredHeight() + c(((View) (obj))));
                l1 = yo.a(k1, mk.k(((View) (obj))));
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
        i4 = B + C;
        j4 = z + A;
        i2 = k1;
        if (a(b))
        {
            a(b, i1, l2 + j4, j1, i4, ai);
            i2 = b.getMeasuredWidth();
            k2 = b(b) + i2;
            j2 = b.getMeasuredHeight() + c(b);
            i2 = yo.a(k1, mk.k(b));
        }
        l3 = j2;
        j3 = k2;
        k1 = i2;
        if (a(c))
        {
            j3 = Math.max(k2, a(c, i1, l2 + j4, j1, i4 + j2, ai));
            l3 = j2 + (c.getMeasuredHeight() + c(c));
            k1 = yo.a(i2, mk.k(c));
        }
        i2 = Math.max(l1, l3);
        l1 = getPaddingLeft();
        l3 = getPaddingRight();
        j2 = getPaddingTop();
        k2 = getPaddingBottom();
        l1 = mk.a(Math.max(j3 + l2 + (l1 + l3), getSuggestedMinimumWidth()), i1, 0xff000000 & k1);
        j1 = mk.a(Math.max(i2 + (j2 + k2), getSuggestedMinimumHeight()), j1, k1 << 16);
        if (s) goto _L2; else goto _L1
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
            if (a(view) && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0)
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
        agb agb1 = (agb)parcelable;
        super.onRestoreInstanceState(agb1.getSuperState());
        if (a != null)
        {
            parcelable = a.a;
        } else
        {
            parcelable = null;
        }
        if (agb1.a != 0 && p != null && parcelable != null)
        {
            parcelable = parcelable.findItem(agb1.a);
            if (parcelable != null)
            {
                ln.b(parcelable);
            }
        }
        if (agb1.b)
        {
            removeCallbacks(M);
            post(M);
        }
    }

    public void onRtlPropertiesChanged(int i1)
    {
        xw xw1;
label0:
        {
label1:
            {
                boolean flag = true;
                if (android.os.Build.VERSION.SDK_INT >= 17)
                {
                    super.onRtlPropertiesChanged(i1);
                }
                xw1 = j;
                if (i1 != 1)
                {
                    flag = false;
                }
                if (flag != xw1.g)
                {
                    xw1.g = flag;
                    if (!xw1.h)
                    {
                        break label0;
                    }
                    if (!flag)
                    {
                        break label1;
                    }
                    if (xw1.d != 0x80000000)
                    {
                        i1 = xw1.d;
                    } else
                    {
                        i1 = xw1.e;
                    }
                    xw1.a = i1;
                    if (xw1.c != 0x80000000)
                    {
                        i1 = xw1.c;
                    } else
                    {
                        i1 = xw1.f;
                    }
                    xw1.b = i1;
                }
                return;
            }
            if (xw1.c != 0x80000000)
            {
                i1 = xw1.c;
            } else
            {
                i1 = xw1.e;
            }
            xw1.a = i1;
            if (xw1.d != 0x80000000)
            {
                i1 = xw1.d;
            } else
            {
                i1 = xw1.f;
            }
            xw1.b = i1;
            return;
        }
        xw1.a = xw1.e;
        xw1.b = xw1.f;
    }

    protected Parcelable onSaveInstanceState()
    {
        agb agb1 = new agb(super.onSaveInstanceState());
        if (p != null && p.a != null)
        {
            agb1.a = p.a.getItemId();
        }
        agb1.b = a();
        return agb1;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1 = lt.a(motionevent);
        if (i1 == 0)
        {
            G = false;
        }
        if (!G)
        {
            boolean flag = super.onTouchEvent(motionevent);
            if (i1 == 0 && !flag)
            {
                G = true;
            }
        }
        if (i1 == 1 || i1 == 3)
        {
            G = false;
        }
        return true;
    }
}
