// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.view.aj;
import android.support.v4.view.at;
import android.support.v4.view.bt;
import android.support.v4.view.q;
import android.support.v7.a.b;
import android.support.v7.a.l;
import android.support.v7.internal.view.f;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.view.menu.w;
import android.support.v7.internal.widget.ae;
import android.support.v7.internal.widget.al;
import android.support.v7.internal.widget.an;
import android.support.v7.internal.widget.ao;
import android.support.v7.internal.widget.y;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            bc, bd, bg, be, 
//            ActionMenuView, bf, ActionMenuPresenter, bh, 
//            l

public class Toolbar extends ViewGroup
{

    private int A;
    private boolean B;
    private boolean C;
    private final ArrayList D;
    private final int E[];
    private bh F;
    private final android.support.v7.widget.l G;
    private ao H;
    private ActionMenuPresenter I;
    private w J;
    private j K;
    private boolean L;
    private final Runnable M;
    private final al N;
    public ActionMenuView a;
    View b;
    final ArrayList c;
    public bf d;
    private TextView e;
    private TextView f;
    private ImageButton g;
    private ImageView h;
    private Drawable i;
    private CharSequence j;
    private ImageButton k;
    private Context l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private final ae v;
    private int w;
    private CharSequence x;
    private CharSequence y;
    private int z;

    public Toolbar(Context context)
    {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        v = new ae();
        w = 0x800013;
        D = new ArrayList();
        c = new ArrayList();
        E = new int[2];
        G = new bc(this);
        M = new bd(this);
        context = an.a(getContext(), attributeset, l.Toolbar, i1);
        n = context.e(l.Toolbar_titleTextAppearance, 0);
        o = context.e(l.Toolbar_subtitleTextAppearance, 0);
        i1 = l.Toolbar_android_gravity;
        int j1 = w;
        w = ((an) (context)).a.getInteger(i1, j1);
        p = 48;
        i1 = context.b(l.Toolbar_titleMargins, 0);
        u = i1;
        t = i1;
        s = i1;
        r = i1;
        i1 = context.b(l.Toolbar_titleMarginStart, -1);
        if (i1 >= 0)
        {
            r = i1;
        }
        i1 = context.b(l.Toolbar_titleMarginEnd, -1);
        if (i1 >= 0)
        {
            s = i1;
        }
        i1 = context.b(l.Toolbar_titleMarginTop, -1);
        if (i1 >= 0)
        {
            t = i1;
        }
        i1 = context.b(l.Toolbar_titleMarginBottom, -1);
        if (i1 >= 0)
        {
            u = i1;
        }
        q = context.c(l.Toolbar_maxButtonHeight, -1);
        i1 = context.b(l.Toolbar_contentInsetStart, 0x80000000);
        j1 = context.b(l.Toolbar_contentInsetEnd, 0x80000000);
        int k1 = context.c(l.Toolbar_contentInsetLeft, 0);
        int l1 = context.c(l.Toolbar_contentInsetRight, 0);
        v.b(k1, l1);
        if (i1 != 0x80000000 || j1 != 0x80000000)
        {
            v.a(i1, j1);
        }
        i = context.a(l.Toolbar_collapseIcon);
        j = context.c(l.Toolbar_collapseContentDescription);
        attributeset = context.c(l.Toolbar_title);
        if (!TextUtils.isEmpty(attributeset))
        {
            setTitle(attributeset);
        }
        attributeset = context.c(l.Toolbar_subtitle);
        if (!TextUtils.isEmpty(attributeset))
        {
            setSubtitle(attributeset);
        }
        l = getContext();
        setPopupTheme(context.e(l.Toolbar_popupTheme, 0));
        attributeset = context.a(l.Toolbar_navigationIcon);
        if (attributeset != null)
        {
            setNavigationIcon(attributeset);
        }
        attributeset = context.c(l.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(attributeset))
        {
            setNavigationContentDescription(attributeset);
        }
        attributeset = context.a(l.Toolbar_logo);
        if (attributeset != null)
        {
            setLogo(attributeset);
        }
        attributeset = context.c(l.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(attributeset))
        {
            setLogoDescription(attributeset);
        }
        if (context.e(l.Toolbar_titleTextColor))
        {
            setTitleTextColor(context.d(l.Toolbar_titleTextColor));
        }
        if (context.e(l.Toolbar_subtitleTextColor))
        {
            setSubtitleTextColor(context.d(l.Toolbar_subtitleTextColor));
        }
        ((an) (context)).a.recycle();
        N = context.a();
    }

    private int a(int i1)
    {
label0:
        {
            int k1 = bt.e(this);
            int j1 = android.support.v4.view.q.a(i1, k1) & 7;
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

    private int a(View view, int i1)
    {
        bg bg1;
        int j1;
        int k1;
        int l1;
        int i2;
        bg1 = (bg)view.getLayoutParams();
        l1 = view.getMeasuredHeight();
        if (i1 > 0)
        {
            i1 = (l1 - i1) / 2;
        } else
        {
            i1 = 0;
        }
        k1 = bg1.a & 0x70;
        j1 = k1;
        k1;
        JVM INSTR lookupswitch 3: default 76
    //                   16: 85
    //                   48: 85
    //                   80: 85;
           goto _L1 _L2 _L2 _L2
_L1:
        j1 = w & 0x70;
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
        if (i1 >= bg1.topMargin) goto _L7; else goto _L6
_L6:
        i1 = bg1.topMargin;
_L9:
        return i1 + j1;
_L4:
        return getPaddingTop() - i1;
_L5:
        return getHeight() - getPaddingBottom() - l1 - bg1.bottomMargin - i1;
_L7:
        k1 = i2 - k1 - l1 - i1 - j1;
        if (k1 < bg1.bottomMargin)
        {
            i1 = Math.max(0, i1 - (bg1.bottomMargin - k1));
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
        bg bg1 = (bg)view.getLayoutParams();
        int k1 = bg1.leftMargin - ai[0];
        i1 = Math.max(0, k1) + i1;
        ai[0] = Math.max(0, -k1);
        j1 = a(view, j1);
        k1 = view.getMeasuredWidth();
        view.layout(i1, j1, i1 + k1, view.getMeasuredHeight() + j1);
        return bg1.rightMargin + k1 + i1;
    }

    private static bg a(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof bg)
        {
            return new bg((bg)layoutparams);
        }
        if (layoutparams instanceof android.support.v7.app.b)
        {
            return new bg((android.support.v7.app.b)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new bg((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new bg(layoutparams);
        }
    }

    static bh a(Toolbar toolbar)
    {
        return toolbar.F;
    }

    private void a(View view, int i1, int j1, int k1, int l1)
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int i2 = getChildMeasureSpec(i1, getPaddingLeft() + getPaddingRight() + marginlayoutparams.leftMargin + marginlayoutparams.rightMargin + j1, marginlayoutparams.width);
        j1 = getChildMeasureSpec(k1, getPaddingTop() + getPaddingBottom() + marginlayoutparams.topMargin + marginlayoutparams.bottomMargin, marginlayoutparams.height);
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
            obj = new bg();
        } else
        if (!checkLayoutParams(((android.view.ViewGroup.LayoutParams) (obj))))
        {
            obj = a(((android.view.ViewGroup.LayoutParams) (obj)));
        } else
        {
            obj = (bg)obj;
        }
        obj.b = 1;
        if (flag && b != null)
        {
            view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            c.add(view);
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
        if (bt.e(this) != 1)
        {
            flag = false;
        }
        k1 = getChildCount();
        j1 = android.support.v4.view.q.a(i1, bt.e(this));
        list.clear();
        i1 = ((flag1) ? 1 : 0);
        if (flag)
        {
            for (i1 = k1 - 1; i1 >= 0; i1--)
            {
                View view = getChildAt(i1);
                bg bg1 = (bg)view.getLayoutParams();
                if (bg1.b == 0 && a(view) && a(bg1.a) == j1)
                {
                    list.add(view);
                }
            }

        } else
        {
            for (; i1 < k1; i1++)
            {
                View view1 = getChildAt(i1);
                bg bg2 = (bg)view1.getLayoutParams();
                if (bg2.b == 0 && a(view1) && a(bg2.a) == j1)
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
        int i1 = aj.a(view);
        return aj.b(view) + i1;
    }

    private int b(View view, int i1, int ai[], int j1)
    {
        bg bg1 = (bg)view.getLayoutParams();
        int k1 = bg1.rightMargin - ai[1];
        i1 -= Math.max(0, k1);
        ai[1] = Math.max(0, -k1);
        j1 = a(view, j1);
        k1 = view.getMeasuredWidth();
        view.layout(i1 - k1, j1, i1, view.getMeasuredHeight() + j1);
        return i1 - (bg1.leftMargin + k1);
    }

    static void b(Toolbar toolbar)
    {
        if (toolbar.k == null)
        {
            toolbar.k = new ImageButton(toolbar.getContext(), null, b.toolbarNavigationButtonStyle);
            toolbar.k.setImageDrawable(toolbar.i);
            toolbar.k.setContentDescription(toolbar.j);
            bg bg1 = new bg();
            bg1.a = 0x800003 | toolbar.p & 0x70;
            bg1.b = 2;
            toolbar.k.setLayoutParams(bg1);
            toolbar.k.setOnClickListener(new be(toolbar));
        }
    }

    private static int c(View view)
    {
        view = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int i1 = ((android.view.ViewGroup.MarginLayoutParams) (view)).topMargin;
        return ((android.view.ViewGroup.MarginLayoutParams) (view)).bottomMargin + i1;
    }

    static ImageButton c(Toolbar toolbar)
    {
        return toolbar.k;
    }

    static int d(Toolbar toolbar)
    {
        return toolbar.p;
    }

    protected static bg d()
    {
        return new bg();
    }

    private boolean d(View view)
    {
        return view.getParent() == this || c.contains(view);
    }

    private void e()
    {
        if (h == null)
        {
            h = new ImageView(getContext());
        }
    }

    private void f()
    {
        g();
        if (a.a == null)
        {
            i i1 = (i)a.getMenu();
            if (d == null)
            {
                d = new bf(this);
            }
            a.setExpandedActionViewsExclusive(true);
            i1.a(d, l);
        }
    }

    private void g()
    {
        if (a == null)
        {
            a = new ActionMenuView(getContext());
            a.setPopupTheme(m);
            a.setOnMenuItemClickListener(G);
            a.setMenuCallbacks(J, K);
            bg bg1 = new bg();
            bg1.a = 0x800005 | p & 0x70;
            a.setLayoutParams(bg1);
            a(a, false);
        }
    }

    private MenuInflater getMenuInflater()
    {
        return new f(getContext());
    }

    private void h()
    {
        if (g == null)
        {
            g = new ImageButton(getContext(), null, b.toolbarNavigationButtonStyle);
            bg bg1 = new bg();
            bg1.a = 0x800003 | p & 0x70;
            g.setLayoutParams(bg1);
        }
    }

    public final boolean a()
    {
        if (a != null)
        {
            ActionMenuView actionmenuview = a;
            boolean flag;
            if (actionmenuview.c != null && actionmenuview.c.g())
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

    public final boolean b()
    {
        if (a != null)
        {
            ActionMenuView actionmenuview = a;
            boolean flag;
            if (actionmenuview.c != null && actionmenuview.c.c())
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
        m m1;
        if (d == null)
        {
            m1 = null;
        } else
        {
            m1 = d.b;
        }
        if (m1 != null)
        {
            m1.collapseActionView();
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return super.checkLayoutParams(layoutparams) && (layoutparams instanceof bg);
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new bg();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new bg(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return a(layoutparams);
    }

    public int getContentInsetEnd()
    {
        ae ae1 = v;
        if (ae1.g)
        {
            return ae1.a;
        } else
        {
            return ae1.b;
        }
    }

    public int getContentInsetLeft()
    {
        return v.a;
    }

    public int getContentInsetRight()
    {
        return v.b;
    }

    public int getContentInsetStart()
    {
        ae ae1 = v;
        if (ae1.g)
        {
            return ae1.b;
        } else
        {
            return ae1.a;
        }
    }

    public Drawable getLogo()
    {
        if (h != null)
        {
            return h.getDrawable();
        } else
        {
            return null;
        }
    }

    public CharSequence getLogoDescription()
    {
        if (h != null)
        {
            return h.getContentDescription();
        } else
        {
            return null;
        }
    }

    public Menu getMenu()
    {
        f();
        return a.getMenu();
    }

    public CharSequence getNavigationContentDescription()
    {
        if (g != null)
        {
            return g.getContentDescription();
        } else
        {
            return null;
        }
    }

    public Drawable getNavigationIcon()
    {
        if (g != null)
        {
            return g.getDrawable();
        } else
        {
            return null;
        }
    }

    public Drawable getOverflowIcon()
    {
        f();
        return a.getOverflowIcon();
    }

    public int getPopupTheme()
    {
        return m;
    }

    public CharSequence getSubtitle()
    {
        return y;
    }

    public CharSequence getTitle()
    {
        return x;
    }

    public y getWrapper()
    {
        if (H == null)
        {
            H = new ao(this);
        }
        return H;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks(M);
    }

    public boolean onHoverEvent(MotionEvent motionevent)
    {
        int i1 = at.a(motionevent);
        if (i1 == 9)
        {
            C = false;
        }
        if (!C)
        {
            boolean flag = super.onHoverEvent(motionevent);
            if (i1 == 9 && !flag)
            {
                C = true;
            }
        }
        if (i1 == 10 || i1 == 3)
        {
            C = false;
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
        if (bt.e(this) == 1)
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
        ai = E;
        ai[1] = 0;
        ai[0] = 0;
        j3 = bt.k(this);
        bg bg3;
        int k2;
        if (a(g))
        {
            if (l2 != 0)
            {
                l1 = b(g, l1, ai, j3);
                i1 = i2;
            } else
            {
                i1 = a(g, i2, ai, j3);
            }
        } else
        {
            i1 = i2;
        }
        j1 = l1;
        k1 = i1;
        if (a(k))
        {
            if (l2 != 0)
            {
                j1 = b(k, l1, ai, j3);
                k1 = i1;
            } else
            {
                k1 = a(k, i1, ai, j3);
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
        ai[0] = Math.max(0, getContentInsetLeft() - l1);
        ai[1] = Math.max(0, getContentInsetRight() - (k3 - l3 - i1));
        k1 = Math.max(l1, getContentInsetLeft());
        l1 = Math.min(i1, k3 - l3 - getContentInsetRight());
        j1 = l1;
        i1 = k1;
        if (a(b))
        {
            if (l2 != 0)
            {
                j1 = b(b, l1, ai, j3);
                i1 = k1;
            } else
            {
                i1 = a(b, k1, ai, j3);
                j1 = l1;
            }
        }
        if (a(h))
        {
            if (l2 != 0)
            {
                j1 = b(h, j1, ai, j3);
                k1 = i1;
            } else
            {
                k1 = a(h, i1, ai, j3);
            }
        } else
        {
            k1 = i1;
        }
        flag = a(e);
        flag2 = a(f);
        i1 = 0;
        if (flag)
        {
            bg bg1 = (bg)e.getLayoutParams();
            i1 = bg1.topMargin;
            l1 = e.getMeasuredHeight();
            i1 = bg1.bottomMargin + (i1 + l1) + 0;
        }
        if (flag2)
        {
            bg bg2 = (bg)f.getLayoutParams();
            l1 = bg2.topMargin;
            int j2 = f.getMeasuredHeight();
            i3 = bg2.bottomMargin + (l1 + j2) + i1;
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
            obj = e;
        } else
        {
            obj = f;
        }
        if (flag2)
        {
            obj1 = f;
        } else
        {
            obj1 = e;
        }
        obj = (bg)((View) (obj)).getLayoutParams();
        obj1 = (bg)((View) (obj1)).getLayoutParams();
        if (flag && e.getMeasuredWidth() > 0 || flag2 && f.getMeasuredWidth() > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        w & 0x70;
        JVM INSTR lookupswitch 2: default 560
    //                   48: 999
    //                   80: 1073;
           goto _L4 _L5 _L6
_L4:
        i1 = (j4 - i4 - k4 - i3) / 2;
        if (i1 < ((bg) (obj)).topMargin + t)
        {
            i1 = ((bg) (obj)).topMargin + t;
        } else
        {
            l1 = j4 - k4 - i3 - i1 - i4;
            if (l1 < ((bg) (obj)).bottomMargin + u)
            {
                i1 = Math.max(0, i1 - ((((bg) (obj1)).bottomMargin + u) - l1));
            }
        }
        i1 = i4 + i1;
_L8:
        if (l2 != 0)
        {
            if (flag1)
            {
                l1 = r;
            } else
            {
                l1 = 0;
            }
            l1 -= ai[1];
            j1 -= Math.max(0, l1);
            ai[1] = Math.max(0, -l1);
            if (flag)
            {
                obj = (bg)e.getLayoutParams();
                l1 = j1 - e.getMeasuredWidth();
                l2 = e.getMeasuredHeight() + i1;
                e.layout(l1, i1, j1, l2);
                i3 = s;
                i1 = l2 + ((bg) (obj)).bottomMargin;
                l1 -= i3;
            } else
            {
                l1 = j1;
            }
            if (flag2)
            {
                obj = (bg)f.getLayoutParams();
                i1 = ((bg) (obj)).topMargin + i1;
                l2 = f.getMeasuredWidth();
                i3 = f.getMeasuredHeight();
                f.layout(j1 - l2, i1, j1, i3 + i1);
                i1 = s;
                l2 = ((bg) (obj)).bottomMargin;
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
                l1 = r;
            } else
            {
                l1 = 0;
            }
            l1 -= ai[0];
            k1 += Math.max(0, l1);
            ai[0] = Math.max(0, -l1);
            if (flag)
            {
                obj = (bg)e.getLayoutParams();
                l2 = e.getMeasuredWidth() + k1;
                l1 = e.getMeasuredHeight() + i1;
                e.layout(k1, i1, l2, l1);
                i3 = s;
                i1 = ((bg) (obj)).bottomMargin;
                l2 += i3;
                i1 += l1;
            } else
            {
                l2 = k1;
            }
            if (flag2)
            {
                obj = (bg)f.getLayoutParams();
                l1 = i1 + ((bg) (obj)).topMargin;
                i1 = f.getMeasuredWidth() + k1;
                i3 = f.getMeasuredHeight();
                f.layout(k1, l1, i1, i3 + l1);
                l1 = s;
                i3 = ((bg) (obj)).bottomMargin;
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
        a(D, 3);
        k1 = D.size();
        for (j1 = 0; j1 < k1; j1++)
        {
            i1 = a((View)D.get(j1), i1, ai, j3);
        }

        a(D, 5);
        k2 = D.size();
        k1 = 0;
        j1 = l1;
        for (; k1 < k2; k1++)
        {
            j1 = b((View)D.get(k1), j1, ai, j3);
        }

        a(D, 1);
        obj = D;
        l2 = ai[0];
        k2 = ai[1];
        i3 = ((List) (obj)).size();
        l1 = 0;
        for (k1 = 0; l1 < i3; k1 += k4 + i4 + j4)
        {
            obj1 = (View)((List) (obj)).get(l1);
            bg3 = (bg)((View) (obj1)).getLayoutParams();
            l2 = bg3.leftMargin - l2;
            k2 = bg3.rightMargin - k2;
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
        i1 = ((bg) (obj)).topMargin + i1 + t;
        break MISSING_BLOCK_LABEL_604;
_L6:
        i1 = j4 - k4 - ((bg) (obj1)).bottomMargin - u - i3;
          goto _L8
_L7:
        if (l1 >= i1) goto _L10; else goto _L9
_L9:
        l1 = D.size();
        k1 = 0;
        j1 = i1;
        for (i1 = k1; i1 < l1; i1++)
        {
            j1 = a((View)D.get(i1), j1, ai, j3);
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
        D.clear();
        return;
          goto _L8
    }

    protected void onMeasure(int i1, int j1)
    {
        int ai[] = E;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int k3;
        if (android.support.v7.internal.widget.at.a(this))
        {
            k2 = 0;
            l2 = 1;
        } else
        {
            k2 = 1;
            l2 = 0;
        }
        k1 = 0;
        if (a(g))
        {
            a(g, i1, 0, j1, q);
            k1 = g.getMeasuredWidth() + b(g);
            j2 = Math.max(0, g.getMeasuredHeight() + c(g));
            i2 = android.support.v7.internal.widget.at.a(0, bt.i(g));
        } else
        {
            i2 = 0;
            j2 = 0;
        }
        i3 = k1;
        k1 = i2;
        l1 = j2;
        if (a(k))
        {
            a(k, i1, 0, j1, q);
            i3 = k.getMeasuredWidth() + b(k);
            l1 = Math.max(j2, k.getMeasuredHeight() + c(k));
            k1 = android.support.v7.internal.widget.at.a(i2, bt.i(k));
        }
        i2 = getContentInsetStart();
        k3 = Math.max(i2, i3) + 0;
        ai[l2] = Math.max(0, i2 - i3);
        l2 = 0;
        i2 = k1;
        j2 = l1;
        if (a(a))
        {
            a(a, i1, k3, j1, q);
            l2 = a.getMeasuredWidth() + b(a);
            j2 = Math.max(l1, a.getMeasuredHeight() + c(a));
            i2 = android.support.v7.internal.widget.at.a(k1, bt.i(a));
        }
        k1 = getContentInsetEnd();
        i3 = k3 + Math.max(k1, l2);
        ai[k2] = Math.max(0, k1 - l2);
        k2 = i3;
        k1 = i2;
        l1 = j2;
        if (a(b))
        {
            k2 = i3 + a(b, i1, i3, j1, 0, ai);
            l1 = Math.max(j2, b.getMeasuredHeight() + c(b));
            k1 = android.support.v7.internal.widget.at.a(i2, bt.i(b));
        }
        i2 = k2;
        l2 = k1;
        j2 = l1;
        if (a(h))
        {
            i2 = k2 + a(h, i1, k2, j1, 0, ai);
            j2 = Math.max(l1, h.getMeasuredHeight() + c(h));
            l2 = android.support.v7.internal.widget.at.a(k1, bt.i(h));
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
            if (((bg)view1.getLayoutParams()).b == 0 && a(view1))
            {
                l2 += a(view1, i1, l2, j1, 0, ai);
                i2 = Math.max(l1, view1.getMeasuredHeight() + c(view1));
                l1 = android.support.v7.internal.widget.at.a(k1, bt.i(view1));
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
        i4 = t + u;
        j4 = r + s;
        i2 = k1;
        if (a(e))
        {
            a(e, i1, l2 + j4, j1, i4, ai);
            i2 = e.getMeasuredWidth();
            k2 = b(e) + i2;
            j2 = e.getMeasuredHeight() + c(e);
            i2 = android.support.v7.internal.widget.at.a(k1, bt.i(e));
        }
        l3 = j2;
        j3 = k2;
        k1 = i2;
        if (a(f))
        {
            j3 = Math.max(k2, a(f, i1, l2 + j4, j1, i4 + j2, ai));
            l3 = j2 + (f.getMeasuredHeight() + c(f));
            k1 = android.support.v7.internal.widget.at.a(i2, bt.i(f));
        }
        i2 = Math.max(l1, l3);
        l1 = getPaddingLeft();
        l3 = getPaddingRight();
        j2 = getPaddingTop();
        k2 = getPaddingBottom();
        l1 = bt.a(Math.max(j3 + l2 + (l1 + l3), getSuggestedMinimumWidth()), i1, 0xff000000 & k1);
        j1 = bt.a(Math.max(i2 + (j2 + k2), getSuggestedMinimumHeight()), j1, k1 << 16);
        if (L) goto _L2; else goto _L1
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
        SavedState savedstate = (SavedState)parcelable;
        super.onRestoreInstanceState(savedstate.getSuperState());
        if (a != null)
        {
            parcelable = a.a;
        } else
        {
            parcelable = null;
        }
        if (savedstate.a != 0 && d != null && parcelable != null)
        {
            parcelable = parcelable.findItem(savedstate.a);
            if (parcelable != null)
            {
                android.support.v4.view.an.b(parcelable);
            }
        }
        if (savedstate.b)
        {
            removeCallbacks(M);
            post(M);
        }
    }

    public void onRtlPropertiesChanged(int i1)
    {
        ae ae1;
label0:
        {
label1:
            {
                boolean flag = true;
                if (android.os.Build.VERSION.SDK_INT >= 17)
                {
                    super.onRtlPropertiesChanged(i1);
                }
                ae1 = v;
                if (i1 != 1)
                {
                    flag = false;
                }
                if (flag != ae1.g)
                {
                    ae1.g = flag;
                    if (!ae1.h)
                    {
                        break label0;
                    }
                    if (!flag)
                    {
                        break label1;
                    }
                    if (ae1.d != 0x80000000)
                    {
                        i1 = ae1.d;
                    } else
                    {
                        i1 = ae1.e;
                    }
                    ae1.a = i1;
                    if (ae1.c != 0x80000000)
                    {
                        i1 = ae1.c;
                    } else
                    {
                        i1 = ae1.f;
                    }
                    ae1.b = i1;
                }
                return;
            }
            if (ae1.c != 0x80000000)
            {
                i1 = ae1.c;
            } else
            {
                i1 = ae1.e;
            }
            ae1.a = i1;
            if (ae1.d != 0x80000000)
            {
                i1 = ae1.d;
            } else
            {
                i1 = ae1.f;
            }
            ae1.b = i1;
            return;
        }
        ae1.a = ae1.e;
        ae1.b = ae1.f;
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        if (d != null && d.b != null)
        {
            savedstate.a = d.b.getItemId();
        }
        savedstate.b = a();
        return savedstate;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1 = at.a(motionevent);
        if (i1 == 0)
        {
            B = false;
        }
        if (!B)
        {
            boolean flag = super.onTouchEvent(motionevent);
            if (i1 == 0 && !flag)
            {
                B = true;
            }
        }
        if (i1 == 1 || i1 == 3)
        {
            B = false;
        }
        return true;
    }

    public void setCollapsible(boolean flag)
    {
        L = flag;
        requestLayout();
    }

    public void setContentInsetsAbsolute(int i1, int j1)
    {
        v.b(i1, j1);
    }

    public void setContentInsetsRelative(int i1, int j1)
    {
        v.a(i1, j1);
    }

    public void setLogo(int i1)
    {
        setLogo(N.a(i1, false));
    }

    public void setLogo(Drawable drawable)
    {
        if (drawable == null) goto _L2; else goto _L1
_L1:
        e();
        if (!d(h))
        {
            a(h, true);
        }
_L4:
        if (h != null)
        {
            h.setImageDrawable(drawable);
        }
        return;
_L2:
        if (h != null && d(h))
        {
            removeView(h);
            c.remove(h);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setLogoDescription(int i1)
    {
        setLogoDescription(getContext().getText(i1));
    }

    public void setLogoDescription(CharSequence charsequence)
    {
        if (!TextUtils.isEmpty(charsequence))
        {
            e();
        }
        if (h != null)
        {
            h.setContentDescription(charsequence);
        }
    }

    public void setMenu(i i1, ActionMenuPresenter actionmenupresenter)
    {
        if (i1 != null || a != null)
        {
            g();
            i j1 = a.a;
            if (j1 != i1)
            {
                if (j1 != null)
                {
                    j1.b(I);
                    j1.b(d);
                }
                if (d == null)
                {
                    d = new bf(this);
                }
                actionmenupresenter.n = true;
                if (i1 != null)
                {
                    i1.a(actionmenupresenter, l);
                    i1.a(d, l);
                } else
                {
                    actionmenupresenter.a(l, null);
                    d.a(l, null);
                    actionmenupresenter.b(true);
                    d.b(true);
                }
                a.setPopupTheme(m);
                a.setPresenter(actionmenupresenter);
                I = actionmenupresenter;
                return;
            }
        }
    }

    public void setMenuCallbacks(w w1, j j1)
    {
        J = w1;
        K = j1;
    }

    public void setNavigationContentDescription(int i1)
    {
        CharSequence charsequence;
        if (i1 != 0)
        {
            charsequence = getContext().getText(i1);
        } else
        {
            charsequence = null;
        }
        setNavigationContentDescription(charsequence);
    }

    public void setNavigationContentDescription(CharSequence charsequence)
    {
        if (!TextUtils.isEmpty(charsequence))
        {
            h();
        }
        if (g != null)
        {
            g.setContentDescription(charsequence);
        }
    }

    public void setNavigationIcon(int i1)
    {
        setNavigationIcon(N.a(i1, false));
    }

    public void setNavigationIcon(Drawable drawable)
    {
        if (drawable == null) goto _L2; else goto _L1
_L1:
        h();
        if (!d(g))
        {
            a(g, true);
        }
_L4:
        if (g != null)
        {
            g.setImageDrawable(drawable);
        }
        return;
_L2:
        if (g != null && d(g))
        {
            removeView(g);
            c.remove(g);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setNavigationOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        h();
        g.setOnClickListener(onclicklistener);
    }

    public void setOnMenuItemClickListener(bh bh)
    {
        F = bh;
    }

    public void setOverflowIcon(Drawable drawable)
    {
        f();
        a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i1)
    {
label0:
        {
            if (m != i1)
            {
                m = i1;
                if (i1 != 0)
                {
                    break label0;
                }
                l = getContext();
            }
            return;
        }
        l = new ContextThemeWrapper(getContext(), i1);
    }

    public void setSubtitle(int i1)
    {
        setSubtitle(getContext().getText(i1));
    }

    public void setSubtitle(CharSequence charsequence)
    {
        if (TextUtils.isEmpty(charsequence)) goto _L2; else goto _L1
_L1:
        if (f == null)
        {
            Context context = getContext();
            f = new TextView(context);
            f.setSingleLine();
            f.setEllipsize(android.text.TextUtils.TruncateAt.END);
            if (o != 0)
            {
                f.setTextAppearance(context, o);
            }
            if (A != 0)
            {
                f.setTextColor(A);
            }
        }
        if (!d(f))
        {
            a(f, true);
        }
_L4:
        if (f != null)
        {
            f.setText(charsequence);
        }
        y = charsequence;
        return;
_L2:
        if (f != null && d(f))
        {
            removeView(f);
            c.remove(f);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setSubtitleTextAppearance(Context context, int i1)
    {
        o = i1;
        if (f != null)
        {
            f.setTextAppearance(context, i1);
        }
    }

    public void setSubtitleTextColor(int i1)
    {
        A = i1;
        if (f != null)
        {
            f.setTextColor(i1);
        }
    }

    public void setTitle(int i1)
    {
        setTitle(getContext().getText(i1));
    }

    public void setTitle(CharSequence charsequence)
    {
        if (TextUtils.isEmpty(charsequence)) goto _L2; else goto _L1
_L1:
        if (e == null)
        {
            Context context = getContext();
            e = new TextView(context);
            e.setSingleLine();
            e.setEllipsize(android.text.TextUtils.TruncateAt.END);
            if (n != 0)
            {
                e.setTextAppearance(context, n);
            }
            if (z != 0)
            {
                e.setTextColor(z);
            }
        }
        if (!d(e))
        {
            a(e, true);
        }
_L4:
        if (e != null)
        {
            e.setText(charsequence);
        }
        x = charsequence;
        return;
_L2:
        if (e != null && d(e))
        {
            removeView(e);
            c.remove(e);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setTitleTextAppearance(Context context, int i1)
    {
        n = i1;
        if (e != null)
        {
            e.setTextAppearance(context, i1);
        }
    }

    public void setTitleTextColor(int i1)
    {
        z = i1;
        if (e != null)
        {
            e.setTextColor(i1);
        }
    }

    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new bi();
        int a;
        boolean b;

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
