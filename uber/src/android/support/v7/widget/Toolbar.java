// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.MarginLayoutParamsCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
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
import bc;
import bm;
import cx;
import cy;
import db;
import dm;
import eh;
import en;
import ev;
import ex;
import ey;
import ez;
import fo;
import il;
import im;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuView, ActionMenuPresenter

public class Toolbar extends ViewGroup
{

    private boolean A;
    private final ArrayList B;
    private final ArrayList C;
    private final int D[];
    private im E;
    private final fo F;
    private ey G;
    private ActionMenuPresenter H;
    private il I;
    private dm J;
    private cy K;
    private boolean L;
    private final Runnable M;
    private final ev N;
    public View a;
    private ActionMenuView b;
    public TextView c;
    public TextView d;
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
    private final en t;
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
        this(context, attributeset, bc.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        t = new en();
        u = 0x800013;
        B = new ArrayList();
        C = new ArrayList();
        D = new int[2];
        F = new _cls1();
        M = new _cls2();
        context = ex.a(getContext(), attributeset, bm.Toolbar, i1);
        l = context.f(bm.Toolbar_titleTextAppearance, 0);
        m = context.f(bm.Toolbar_subtitleTextAppearance, 0);
        u = context.b(bm.Toolbar_android_gravity, u);
        n = 48;
        i1 = context.c(bm.Toolbar_titleMargins, 0);
        s = i1;
        r = i1;
        q = i1;
        p = i1;
        i1 = context.c(bm.Toolbar_titleMarginStart, -1);
        if (i1 >= 0)
        {
            p = i1;
        }
        i1 = context.c(bm.Toolbar_titleMarginEnd, -1);
        if (i1 >= 0)
        {
            q = i1;
        }
        i1 = context.c(bm.Toolbar_titleMarginTop, -1);
        if (i1 >= 0)
        {
            r = i1;
        }
        i1 = context.c(bm.Toolbar_titleMarginBottom, -1);
        if (i1 >= 0)
        {
            s = i1;
        }
        o = context.d(bm.Toolbar_maxButtonHeight, -1);
        i1 = context.c(bm.Toolbar_contentInsetStart, 0x80000000);
        int j1 = context.c(bm.Toolbar_contentInsetEnd, 0x80000000);
        int k1 = context.d(bm.Toolbar_contentInsetLeft, 0);
        int l1 = context.d(bm.Toolbar_contentInsetRight, 0);
        t.b(k1, l1);
        if (i1 != 0x80000000 || j1 != 0x80000000)
        {
            t.a(i1, j1);
        }
        g = context.a(bm.Toolbar_collapseIcon);
        h = context.c(bm.Toolbar_collapseContentDescription);
        attributeset = context.c(bm.Toolbar_title);
        if (!TextUtils.isEmpty(attributeset))
        {
            a(attributeset);
        }
        attributeset = context.c(bm.Toolbar_subtitle);
        if (!TextUtils.isEmpty(attributeset))
        {
            b(attributeset);
        }
        j = getContext();
        a(context.f(bm.Toolbar_popupTheme, 0));
        attributeset = context.a(bm.Toolbar_navigationIcon);
        if (attributeset != null)
        {
            b(attributeset);
        }
        attributeset = context.c(bm.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(attributeset))
        {
            c(attributeset);
        }
        attributeset = context.a(bm.Toolbar_logo);
        if (attributeset != null)
        {
            a(attributeset);
        }
        attributeset = context.c(bm.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(attributeset))
        {
            d(attributeset);
        }
        if (context.g(bm.Toolbar_titleTextColor))
        {
            c(context.f(bm.Toolbar_titleTextColor));
        }
        if (context.g(bm.Toolbar_subtitleTextColor))
        {
            d(context.f(bm.Toolbar_subtitleTextColor));
        }
        context.b();
        N = context.c();
    }

    private void A()
    {
        if (i == null)
        {
            i = new ImageButton(getContext(), null, bc.toolbarNavigationButtonStyle);
            i.setImageDrawable(g);
            i.setContentDescription(h);
            LayoutParams layoutparams = o();
            layoutparams.a = 0x800003 | n & 0x70;
            layoutparams.b = 2;
            i.setLayoutParams(layoutparams);
            i.setOnClickListener(new _cls3());
        }
    }

    private void B()
    {
        removeCallbacks(M);
        post(M);
    }

    private boolean C()
    {
        if (L) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j1 = getChildCount();
        int i1 = 0;
label0:
        do
        {
label1:
            {
                if (i1 >= j1)
                {
                    break label1;
                }
                View view = getChildAt(i1);
                if (a(view) && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0)
                {
                    break label0;
                }
                i1++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    private int a(View view, int i1)
    {
        LayoutParams layoutparams;
        int j1;
        int k1;
        int l1;
        int i2;
        layoutparams = (LayoutParams)view.getLayoutParams();
        k1 = view.getMeasuredHeight();
        if (i1 > 0)
        {
            i1 = (k1 - i1) / 2;
        } else
        {
            i1 = 0;
        }
        e(layoutparams.a);
        JVM INSTR lookupswitch 2: default 60
    //                   48: 115
    //                   80: 122;
           goto _L1 _L2 _L3
_L1:
        j1 = getPaddingTop();
        l1 = getPaddingBottom();
        i2 = getHeight();
        i1 = (i2 - j1 - l1 - k1) / 2;
        if (i1 >= layoutparams.topMargin) goto _L5; else goto _L4
_L4:
        i1 = layoutparams.topMargin;
_L7:
        return i1 + j1;
_L2:
        return getPaddingTop() - i1;
_L3:
        return getHeight() - getPaddingBottom() - k1 - layoutparams.bottomMargin - i1;
_L5:
        k1 = i2 - l1 - k1 - i1 - j1;
        if (k1 < layoutparams.bottomMargin)
        {
            i1 = Math.max(0, i1 - (layoutparams.bottomMargin - k1));
        }
        if (true) goto _L7; else goto _L6
_L6:
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

    private static int a(List list, int ai[])
    {
        int l1 = ai[0];
        int k1 = ai[1];
        int i2 = list.size();
        int j1 = 0;
        int i1;
        int j2;
        int k2;
        int l2;
        for (i1 = 0; j1 < i2; i1 += l2 + j2 + k2)
        {
            ai = (View)list.get(j1);
            LayoutParams layoutparams = (LayoutParams)ai.getLayoutParams();
            l1 = layoutparams.leftMargin - l1;
            k1 = layoutparams.rightMargin - k1;
            j2 = Math.max(0, l1);
            k2 = Math.max(0, k1);
            l1 = Math.max(0, -l1);
            k1 = Math.max(0, -k1);
            l2 = ai.getMeasuredWidth();
            j1++;
        }

        return i1;
    }

    private LayoutParams a(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
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

    static im a(Toolbar toolbar)
    {
        return toolbar.E;
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

    private void a(View view, boolean flag)
    {
        Object obj = view.getLayoutParams();
        if (obj == null)
        {
            obj = o();
        } else
        if (!checkLayoutParams(((android.view.ViewGroup.LayoutParams) (obj))))
        {
            obj = a(((android.view.ViewGroup.LayoutParams) (obj)));
        } else
        {
            obj = (LayoutParams)obj;
        }
        obj.b = 1;
        if (flag && a != null)
        {
            view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            C.add(view);
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
        if (ViewCompat.getLayoutDirection(this) != 1)
        {
            flag = false;
        }
        k1 = getChildCount();
        j1 = GravityCompat.getAbsoluteGravity(i1, ViewCompat.getLayoutDirection(this));
        list.clear();
        i1 = ((flag1) ? 1 : 0);
        if (flag)
        {
            for (i1 = k1 - 1; i1 >= 0; i1--)
            {
                View view = getChildAt(i1);
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                if (layoutparams.b == 0 && a(view) && f(layoutparams.a) == j1)
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
                if (layoutparams1.b == 0 && a(view1) && f(layoutparams1.a) == j1)
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
        int i1 = MarginLayoutParamsCompat.getMarginStart(view);
        return MarginLayoutParamsCompat.getMarginEnd(view) + i1;
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

    public static void b(Toolbar toolbar)
    {
        toolbar.A();
    }

    private static int c(View view)
    {
        view = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int i1 = ((android.view.ViewGroup.MarginLayoutParams) (view)).topMargin;
        return ((android.view.ViewGroup.MarginLayoutParams) (view)).bottomMargin + i1;
    }

    public static ImageButton c(Toolbar toolbar)
    {
        return toolbar.i;
    }

    private void c(int i1)
    {
        x = i1;
        if (c != null)
        {
            c.setTextColor(i1);
        }
    }

    public static int d(Toolbar toolbar)
    {
        return toolbar.n;
    }

    private void d(int i1)
    {
        y = i1;
        if (d != null)
        {
            d.setTextColor(i1);
        }
    }

    private void d(CharSequence charsequence)
    {
        if (!TextUtils.isEmpty(charsequence))
        {
            s();
        }
        if (f != null)
        {
            f.setContentDescription(charsequence);
        }
    }

    private boolean d(View view)
    {
        return view.getParent() == this || C.contains(view);
    }

    private int e(int i1)
    {
        int j1 = i1 & 0x70;
        i1 = j1;
        switch (j1)
        {
        default:
            i1 = u & 0x70;
            // fall through

        case 16: // '\020'
        case 48: // '0'
        case 80: // 'P'
            return i1;
        }
    }

    private int f(int i1)
    {
label0:
        {
            int k1 = ViewCompat.getLayoutDirection(this);
            int j1 = GravityCompat.getAbsoluteGravity(i1, k1) & 7;
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

    public static LayoutParams o()
    {
        return new LayoutParams();
    }

    private void s()
    {
        if (f == null)
        {
            f = new ImageView(getContext());
        }
    }

    private void t()
    {
        u();
        if (b.d() == null)
        {
            cx cx1 = (cx)b.c();
            if (I == null)
            {
                I = new il(this, (byte)0);
            }
            b.j();
            cx1.a(I, j);
        }
    }

    private void u()
    {
        if (b == null)
        {
            b = new ActionMenuView(getContext());
            b.a(k);
            b.a(F);
            b.a(J, K);
            LayoutParams layoutparams = o();
            layoutparams.a = 0x800005 | n & 0x70;
            b.setLayoutParams(layoutparams);
            a(b, false);
        }
    }

    private int v()
    {
        return t.c();
    }

    private int w()
    {
        return t.d();
    }

    private int x()
    {
        return t.a();
    }

    private int y()
    {
        return t.b();
    }

    private void z()
    {
        if (e == null)
        {
            e = new ImageButton(getContext(), null, bc.toolbarNavigationButtonStyle);
            LayoutParams layoutparams = o();
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
        s();
        if (!d(f))
        {
            a(((View) (f)), true);
        }
_L4:
        if (f != null)
        {
            f.setImageDrawable(drawable);
        }
        return;
_L2:
        if (f != null && d(f))
        {
            removeView(f);
            C.remove(f);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(android.view.View.OnClickListener onclicklistener)
    {
        z();
        e.setOnClickListener(onclicklistener);
    }

    public final void a(cx cx1, ActionMenuPresenter actionmenupresenter)
    {
        if (cx1 != null || b != null)
        {
            u();
            cx cx2 = b.d();
            if (cx2 != cx1)
            {
                if (cx2 != null)
                {
                    cx2.b(H);
                    cx2.b(I);
                }
                if (I == null)
                {
                    I = new il(this, (byte)0);
                }
                actionmenupresenter.e();
                if (cx1 != null)
                {
                    cx1.a(actionmenupresenter, j);
                    cx1.a(I, j);
                } else
                {
                    actionmenupresenter.a(j, null);
                    I.a(j, null);
                    actionmenupresenter.a(true);
                    I.a(true);
                }
                b.a(k);
                b.a(actionmenupresenter);
                H = actionmenupresenter;
                return;
            }
        }
    }

    public final void a(dm dm, cy cy)
    {
        J = dm;
        K = cy;
    }

    public final void a(im im)
    {
        E = im;
    }

    public void a(CharSequence charsequence)
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
        if (!d(c))
        {
            a(((View) (c)), true);
        }
_L4:
        if (c != null)
        {
            c.setText(charsequence);
        }
        v = charsequence;
        return;
_L2:
        if (c != null && d(c))
        {
            removeView(c);
            C.remove(c);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(boolean flag)
    {
        L = flag;
        requestLayout();
    }

    public final boolean a()
    {
        return getVisibility() == 0 && b != null && b.a();
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
        z();
        if (!d(e))
        {
            a(e, true);
        }
_L4:
        if (e != null)
        {
            e.setImageDrawable(drawable);
        }
        return;
_L2:
        if (e != null && d(e))
        {
            removeView(e);
            C.remove(e);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void b(CharSequence charsequence)
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
        if (!d(d))
        {
            a(d, true);
        }
_L4:
        if (d != null)
        {
            d.setText(charsequence);
        }
        w = charsequence;
        return;
_L2:
        if (d != null && d(d))
        {
            removeView(d);
            C.remove(d);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean b()
    {
        return b != null && b.g();
    }

    public final void c(CharSequence charsequence)
    {
        if (!TextUtils.isEmpty(charsequence))
        {
            z();
        }
        if (e != null)
        {
            e.setContentDescription(charsequence);
        }
    }

    public final boolean c()
    {
        return b != null && b.h();
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return super.checkLayoutParams(layoutparams) && (layoutparams instanceof LayoutParams);
    }

    public final boolean d()
    {
        return b != null && b.e();
    }

    public final boolean e()
    {
        return b != null && b.f();
    }

    public final void f()
    {
        if (b != null)
        {
            b.i();
        }
    }

    public final boolean g()
    {
        return I != null && I.b != null;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return o();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return a(attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return a(layoutparams);
    }

    public final void h()
    {
        db db1;
        if (I == null)
        {
            db1 = null;
        } else
        {
            db1 = I.b;
        }
        if (db1 != null)
        {
            db1.collapseActionView();
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

    public final Menu m()
    {
        t();
        return b.c();
    }

    public final void n()
    {
        t.b(0, 0);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks(M);
    }

    public boolean onHoverEvent(MotionEvent motionevent)
    {
        int i1 = MotionEventCompat.getActionMasked(motionevent);
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
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        boolean flag2;
        if (ViewCompat.getLayoutDirection(this) == 1)
        {
            k2 = 1;
        } else
        {
            k2 = 0;
        }
        j3 = getWidth();
        i4 = getHeight();
        i2 = getPaddingLeft();
        k3 = getPaddingRight();
        l3 = getPaddingTop();
        j4 = getPaddingBottom();
        l1 = j3 - k3;
        ai = D;
        ai[1] = 0;
        ai[0] = 0;
        i3 = ViewCompat.getMinimumHeight(this);
        if (a(e))
        {
            if (k2 != 0)
            {
                l1 = b(e, l1, ai, i3);
                i1 = i2;
            } else
            {
                i1 = a(e, i2, ai, i3);
            }
        } else
        {
            i1 = i2;
        }
        j1 = l1;
        k1 = i1;
        if (a(i))
        {
            if (k2 != 0)
            {
                j1 = b(i, l1, ai, i3);
                k1 = i1;
            } else
            {
                k1 = a(i, i1, ai, i3);
                j1 = l1;
            }
        }
        i1 = j1;
        l1 = k1;
        if (a(b))
        {
            if (k2 != 0)
            {
                l1 = a(b, k1, ai, i3);
                i1 = j1;
            } else
            {
                i1 = b(b, j1, ai, i3);
                l1 = k1;
            }
        }
        ai[0] = Math.max(0, x() - l1);
        ai[1] = Math.max(0, y() - (j3 - k3 - i1));
        k1 = Math.max(l1, x());
        l1 = Math.min(i1, j3 - k3 - y());
        j1 = l1;
        i1 = k1;
        if (a(a))
        {
            if (k2 != 0)
            {
                j1 = b(a, l1, ai, i3);
                i1 = k1;
            } else
            {
                i1 = a(a, k1, ai, i3);
                j1 = l1;
            }
        }
        if (a(f))
        {
            if (k2 != 0)
            {
                j1 = b(f, j1, ai, i3);
                k1 = i1;
            } else
            {
                k1 = a(f, i1, ai, i3);
            }
        } else
        {
            k1 = i1;
        }
        flag = a(c);
        flag2 = a(d);
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
            l2 = layoutparams1.bottomMargin + (l1 + j2) + i1;
        } else
        {
            l2 = i1;
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
        JVM INSTR lookupswitch 2: default 560
    //                   48: 999
    //                   80: 1073;
           goto _L4 _L5 _L6
_L4:
        i1 = (i4 - l3 - j4 - l2) / 2;
        if (i1 < ((LayoutParams) (obj)).topMargin + r)
        {
            i1 = ((LayoutParams) (obj)).topMargin + r;
        } else
        {
            l1 = i4 - j4 - l2 - i1 - l3;
            if (l1 < ((LayoutParams) (obj)).bottomMargin + s)
            {
                i1 = Math.max(0, i1 - ((((LayoutParams) (obj1)).bottomMargin + s) - l1));
            }
        }
        i1 = l3 + i1;
_L8:
        if (k2 != 0)
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
                k2 = c.getMeasuredHeight() + i1;
                c.layout(l1, i1, j1, k2);
                l2 = q;
                i1 = k2 + ((LayoutParams) (obj)).bottomMargin;
                l1 -= l2;
            } else
            {
                l1 = j1;
            }
            if (flag2)
            {
                obj = (LayoutParams)d.getLayoutParams();
                i1 = ((LayoutParams) (obj)).topMargin + i1;
                k2 = d.getMeasuredWidth();
                l2 = d.getMeasuredHeight();
                d.layout(j1 - k2, i1, j1, l2 + i1);
                i1 = q;
                k2 = ((LayoutParams) (obj)).bottomMargin;
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
                k2 = c.getMeasuredWidth() + k1;
                l1 = c.getMeasuredHeight() + i1;
                c.layout(k1, i1, k2, l1);
                l2 = q;
                i1 = ((LayoutParams) (obj)).bottomMargin;
                k2 += l2;
                i1 += l1;
            } else
            {
                k2 = k1;
            }
            if (flag2)
            {
                obj = (LayoutParams)d.getLayoutParams();
                l1 = i1 + ((LayoutParams) (obj)).topMargin;
                i1 = d.getMeasuredWidth() + k1;
                l2 = d.getMeasuredHeight();
                d.layout(k1, l1, i1, l2 + l1);
                l1 = q;
                l2 = ((LayoutParams) (obj)).bottomMargin;
                l2 = l1 + i1;
            } else
            {
                l2 = k1;
            }
            l1 = j1;
            i1 = k1;
            if (flag1)
            {
                i1 = Math.max(k2, l2);
                l1 = j1;
            }
        }
_L3:
        a(B, 3);
        k1 = B.size();
        for (j1 = 0; j1 < k1; j1++)
        {
            i1 = a((View)B.get(j1), i1, ai, i3);
        }

        a(B, 5);
        k1 = B.size();
        for (j1 = 0; j1 < k1; j1++)
        {
            l1 = b((View)B.get(j1), l1, ai, i3);
        }

        a(B, 1);
        k1 = a(B, ai);
        j1 = ((j3 - i2 - k3) / 2 + i2) - k1 / 2;
        k1 += j1;
          goto _L7
_L5:
        i1 = getPaddingTop();
        i1 = ((LayoutParams) (obj)).topMargin + i1 + r;
        break MISSING_BLOCK_LABEL_604;
_L6:
        i1 = i4 - j4 - ((LayoutParams) (obj1)).bottomMargin - s - l2;
          goto _L8
_L7:
        if (j1 >= i1) goto _L10; else goto _L9
_L9:
        l1 = B.size();
        k1 = 0;
        j1 = i1;
        for (i1 = k1; i1 < l1; i1++)
        {
            j1 = a((View)B.get(i1), j1, ai, i3);
        }

        break; /* Loop/switch isn't completed */
_L10:
        i1 = j1;
        if (k1 > l1)
        {
            i1 = j1 - (k1 - l1);
        }
        if (true) goto _L9; else goto _L11
_L11:
        B.clear();
        return;
          goto _L8
    }

    protected void onMeasure(int i1, int j1)
    {
        int ai[] = D;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int k3;
        if (ez.a(this))
        {
            k2 = 0;
            l2 = 1;
        } else
        {
            k2 = 1;
            l2 = 0;
        }
        k1 = 0;
        if (a(e))
        {
            a(e, i1, 0, j1, o);
            k1 = e.getMeasuredWidth() + b(e);
            j2 = Math.max(0, e.getMeasuredHeight() + c(e));
            i2 = ez.a(0, ViewCompat.getMeasuredState(e));
        } else
        {
            i2 = 0;
            j2 = 0;
        }
        i3 = k1;
        k1 = i2;
        l1 = j2;
        if (a(i))
        {
            a(i, i1, 0, j1, o);
            i3 = i.getMeasuredWidth() + b(i);
            l1 = Math.max(j2, i.getMeasuredHeight() + c(i));
            k1 = ez.a(i2, ViewCompat.getMeasuredState(i));
        }
        i2 = v();
        k3 = Math.max(i2, i3) + 0;
        ai[l2] = Math.max(0, i2 - i3);
        l2 = 0;
        i2 = k1;
        j2 = l1;
        if (a(b))
        {
            a(b, i1, k3, j1, o);
            l2 = b.getMeasuredWidth() + b(b);
            j2 = Math.max(l1, b.getMeasuredHeight() + c(b));
            i2 = ez.a(k1, ViewCompat.getMeasuredState(b));
        }
        k1 = w();
        i3 = k3 + Math.max(k1, l2);
        ai[k2] = Math.max(0, k1 - l2);
        k2 = i3;
        k1 = i2;
        l1 = j2;
        if (a(a))
        {
            k2 = i3 + a(a, i1, i3, j1, 0, ai);
            l1 = Math.max(j2, a.getMeasuredHeight() + c(a));
            k1 = ez.a(i2, ViewCompat.getMeasuredState(a));
        }
        i2 = k2;
        l2 = k1;
        j2 = l1;
        if (a(f))
        {
            i2 = k2 + a(f, i1, k2, j1, 0, ai);
            j2 = Math.max(l1, f.getMeasuredHeight() + c(f));
            l2 = ez.a(k1, ViewCompat.getMeasuredState(f));
        }
        i3 = getChildCount();
        k2 = 0;
        k1 = l2;
        l1 = j2;
        j2 = k2;
        l2 = i2;
        while (j2 < i3) 
        {
            View view = getChildAt(j2);
            int j3;
            int l3;
            int i4;
            int j4;
            if (((LayoutParams)view.getLayoutParams()).b == 0 && a(view))
            {
                l2 += a(view, i1, l2, j1, 0, ai);
                i2 = Math.max(l1, view.getMeasuredHeight() + c(view));
                l1 = ez.a(k1, ViewCompat.getMeasuredState(view));
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
        if (a(c))
        {
            a(c, i1, l2 + j4, j1, i4, ai);
            i2 = c.getMeasuredWidth();
            k2 = b(c) + i2;
            j2 = c.getMeasuredHeight() + c(c);
            i2 = ez.a(k1, ViewCompat.getMeasuredState(c));
        }
        l3 = j2;
        j3 = k2;
        k1 = i2;
        if (a(d))
        {
            j3 = Math.max(k2, a(d, i1, l2 + j4, j1, i4 + j2, ai));
            l3 = j2 + (d.getMeasuredHeight() + c(d));
            k1 = ez.a(i2, ViewCompat.getMeasuredState(d));
        }
        l1 = Math.max(l1, l3);
        k2 = getPaddingLeft();
        l3 = getPaddingRight();
        i2 = getPaddingTop();
        j2 = getPaddingBottom();
        k2 = ViewCompat.resolveSizeAndState(Math.max(j3 + l2 + (k2 + l3), getSuggestedMinimumWidth()), i1, 0xff000000 & k1);
        i1 = ViewCompat.resolveSizeAndState(Math.max(l1 + (i2 + j2), getSuggestedMinimumHeight()), j1, k1 << 16);
        if (C())
        {
            i1 = 0;
        }
        setMeasuredDimension(k2, i1);
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        SavedState savedstate = (SavedState)parcelable;
        super.onRestoreInstanceState(savedstate.getSuperState());
        if (b != null)
        {
            parcelable = b.d();
        } else
        {
            parcelable = null;
        }
        if (savedstate.a != 0 && I != null && parcelable != null)
        {
            parcelable = parcelable.findItem(savedstate.a);
            if (parcelable != null)
            {
                MenuItemCompat.expandActionView(parcelable);
            }
        }
        if (savedstate.b)
        {
            B();
        }
    }

    public void onRtlPropertiesChanged(int i1)
    {
        boolean flag = true;
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            super.onRtlPropertiesChanged(i1);
        }
        en en1 = t;
        if (i1 != 1)
        {
            flag = false;
        }
        en1.a(flag);
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        if (I != null && I.b != null)
        {
            savedstate.a = I.b.getItemId();
        }
        savedstate.b = b();
        return savedstate;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1 = MotionEventCompat.getActionMasked(motionevent);
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

    public final eh p()
    {
        if (G == null)
        {
            G = new ey(this, true);
        }
        return G;
    }

    public final void q()
    {
        for (int i1 = getChildCount() - 1; i1 >= 0; i1--)
        {
            View view = getChildAt(i1);
            if (((LayoutParams)view.getLayoutParams()).b != 2 && view != b)
            {
                removeViewAt(i1);
                C.add(view);
            }
        }

    }

    public final void r()
    {
        for (int i1 = C.size() - 1; i1 >= 0; i1--)
        {
            addView((View)C.get(i1));
        }

        C.clear();
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class LayoutParams {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class SavedState {}

}
