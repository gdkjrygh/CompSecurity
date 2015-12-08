// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.view.an;
import android.support.v4.view.as;
import android.support.v4.view.ba;
import android.support.v4.view.bq;
import android.support.v4.view.q;
import android.support.v7.b.b;
import android.support.v7.b.k;
import android.support.v7.internal.view.c;
import android.support.v7.internal.view.menu.g;
import android.support.v7.internal.view.menu.h;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.view.menu.v;
import android.support.v7.internal.widget.aa;
import android.support.v7.internal.widget.ak;
import android.support.v7.internal.widget.am;
import android.support.v7.internal.widget.aq;
import android.support.v7.internal.widget.u;
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
//            aw, ax, ba, ActionMenuView, 
//            az, ay, bb, o

public class Toolbar extends ViewGroup
{

    private boolean A;
    private final ArrayList B;
    private final ArrayList C;
    private final int D[];
    private bb E;
    private final o F;
    private android.support.v7.internal.widget.an G;
    private az H;
    private v I;
    private h J;
    private boolean K;
    private final Runnable L;
    private final ak M;
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
    private final aa t;
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
        this(context, attributeset, b.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        t = new aa();
        u = 0x800013;
        B = new ArrayList();
        C = new ArrayList();
        D = new int[2];
        F = new aw(this);
        L = new ax(this);
        context = am.a(getContext(), attributeset, k.Toolbar, i1, 0);
        l = context.g(k.Toolbar_titleTextAppearance, 0);
        m = context.g(k.Toolbar_subtitleTextAppearance, 0);
        u = context.c(k.Toolbar_android_gravity, u);
        n = 48;
        i1 = context.d(k.Toolbar_titleMargins, 0);
        s = i1;
        r = i1;
        q = i1;
        p = i1;
        i1 = context.d(k.Toolbar_titleMarginStart, -1);
        if (i1 >= 0)
        {
            p = i1;
        }
        i1 = context.d(k.Toolbar_titleMarginEnd, -1);
        if (i1 >= 0)
        {
            q = i1;
        }
        i1 = context.d(k.Toolbar_titleMarginTop, -1);
        if (i1 >= 0)
        {
            r = i1;
        }
        i1 = context.d(k.Toolbar_titleMarginBottom, -1);
        if (i1 >= 0)
        {
            s = i1;
        }
        o = context.e(k.Toolbar_maxButtonHeight, -1);
        i1 = context.d(k.Toolbar_contentInsetStart, 0x80000000);
        int j1 = context.d(k.Toolbar_contentInsetEnd, 0x80000000);
        int k1 = context.e(k.Toolbar_contentInsetLeft, 0);
        int l1 = context.e(k.Toolbar_contentInsetRight, 0);
        t.b(k1, l1);
        if (i1 != 0x80000000 || j1 != 0x80000000)
        {
            t.a(i1, j1);
        }
        g = context.a(k.Toolbar_collapseIcon);
        h = context.b(k.Toolbar_collapseContentDescription);
        attributeset = context.b(k.Toolbar_title);
        if (!TextUtils.isEmpty(attributeset))
        {
            setTitle(attributeset);
        }
        attributeset = context.b(k.Toolbar_subtitle);
        if (!TextUtils.isEmpty(attributeset))
        {
            setSubtitle(attributeset);
        }
        j = getContext();
        setPopupTheme(context.g(k.Toolbar_popupTheme, 0));
        attributeset = context.a(k.Toolbar_navigationIcon);
        if (attributeset != null)
        {
            setNavigationIcon(attributeset);
        }
        attributeset = context.b(k.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(attributeset))
        {
            setNavigationContentDescription(attributeset);
        }
        attributeset = context.a(k.Toolbar_logo);
        if (attributeset != null)
        {
            setLogo(attributeset);
        }
        attributeset = context.b(k.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(attributeset))
        {
            setLogoDescription(attributeset);
        }
        if (context.d(k.Toolbar_titleTextColor))
        {
            setTitleTextColor(context.b(k.Toolbar_titleTextColor, -1));
        }
        if (context.d(k.Toolbar_subtitleTextColor))
        {
            setSubtitleTextColor(context.b(k.Toolbar_subtitleTextColor, -1));
        }
        context.b();
        M = context.c();
    }

    private int a(int i1)
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

    private int a(View view, int i1)
    {
        android.support.v7.widget.ba ba1;
        int j1;
        int k1;
        int l1;
        int i2;
        ba1 = (android.support.v7.widget.ba)view.getLayoutParams();
        k1 = view.getMeasuredHeight();
        if (i1 > 0)
        {
            i1 = (k1 - i1) / 2;
        } else
        {
            i1 = 0;
        }
        a(ba1.a);
        JVM INSTR lookupswitch 2: default 60
    //                   48: 115
    //                   80: 122;
           goto _L1 _L2 _L3
_L1:
        j1 = getPaddingTop();
        l1 = getPaddingBottom();
        i2 = getHeight();
        i1 = (i2 - j1 - l1 - k1) / 2;
        if (i1 >= ba1.topMargin) goto _L5; else goto _L4
_L4:
        i1 = ba1.topMargin;
_L7:
        return i1 + j1;
_L2:
        return getPaddingTop() - i1;
_L3:
        return getHeight() - getPaddingBottom() - k1 - ba1.bottomMargin - i1;
_L5:
        k1 = i2 - l1 - k1 - i1 - j1;
        if (k1 < ba1.bottomMargin)
        {
            i1 = Math.max(0, i1 - (ba1.bottomMargin - k1));
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
        android.support.v7.widget.ba ba1 = (android.support.v7.widget.ba)view.getLayoutParams();
        int k1 = ba1.leftMargin - ai[0];
        i1 = Math.max(0, k1) + i1;
        ai[0] = Math.max(0, -k1);
        j1 = a(view, j1);
        k1 = view.getMeasuredWidth();
        view.layout(i1, j1, i1 + k1, view.getMeasuredHeight() + j1);
        return ba1.rightMargin + k1 + i1;
    }

    private int a(List list, int ai[])
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
            android.support.v7.widget.ba ba1 = (android.support.v7.widget.ba)ai.getLayoutParams();
            l1 = ba1.leftMargin - l1;
            k1 = ba1.rightMargin - k1;
            j2 = Math.max(0, l1);
            k2 = Math.max(0, k1);
            l1 = Math.max(0, -l1);
            k1 = Math.max(0, -k1);
            l2 = ai.getMeasuredWidth();
            j1++;
        }

        return i1;
    }

    static bb a(Toolbar toolbar)
    {
        return toolbar.E;
    }

    private void a(View view, int i1, int j1, int k1, int l1, int i2)
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int j2 = getChildMeasureSpec(i1, getPaddingLeft() + getPaddingRight() + marginlayoutparams.leftMargin + marginlayoutparams.rightMargin + j1, marginlayoutparams.width);
        j1 = getChildMeasureSpec(k1, getPaddingTop() + getPaddingBottom() + marginlayoutparams.topMargin + marginlayoutparams.bottomMargin + l1, marginlayoutparams.height);
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
        view.measure(j2, i1);
    }

    private void a(View view, boolean flag)
    {
        Object obj = view.getLayoutParams();
        if (obj == null)
        {
            obj = d();
        } else
        if (!checkLayoutParams(((android.view.ViewGroup.LayoutParams) (obj))))
        {
            obj = a(((android.view.ViewGroup.LayoutParams) (obj)));
        } else
        {
            obj = (android.support.v7.widget.ba)obj;
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
        if (bq.e(this) != 1)
        {
            flag = false;
        }
        k1 = getChildCount();
        j1 = android.support.v4.view.q.a(i1, bq.e(this));
        list.clear();
        i1 = ((flag1) ? 1 : 0);
        if (flag)
        {
            for (i1 = k1 - 1; i1 >= 0; i1--)
            {
                View view = getChildAt(i1);
                android.support.v7.widget.ba ba1 = (android.support.v7.widget.ba)view.getLayoutParams();
                if (ba1.b == 0 && a(view) && b(ba1.a) == j1)
                {
                    list.add(view);
                }
            }

        } else
        {
            for (; i1 < k1; i1++)
            {
                View view1 = getChildAt(i1);
                android.support.v7.widget.ba ba2 = (android.support.v7.widget.ba)view1.getLayoutParams();
                if (ba2.b == 0 && a(view1) && b(ba2.a) == j1)
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

    private int b(int i1)
    {
label0:
        {
            int k1 = bq.e(this);
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

    private int b(View view)
    {
        view = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int i1 = an.a(view);
        return an.b(view) + i1;
    }

    private int b(View view, int i1, int ai[], int j1)
    {
        android.support.v7.widget.ba ba1 = (android.support.v7.widget.ba)view.getLayoutParams();
        int k1 = ba1.rightMargin - ai[1];
        i1 -= Math.max(0, k1);
        ai[1] = Math.max(0, -k1);
        j1 = a(view, j1);
        k1 = view.getMeasuredWidth();
        view.layout(i1 - k1, j1, i1, view.getMeasuredHeight() + j1);
        return i1 - (ba1.leftMargin + k1);
    }

    static void b(Toolbar toolbar)
    {
        toolbar.k();
    }

    private int c(View view)
    {
        view = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int i1 = ((android.view.ViewGroup.MarginLayoutParams) (view)).topMargin;
        return ((android.view.ViewGroup.MarginLayoutParams) (view)).bottomMargin + i1;
    }

    static ImageButton c(Toolbar toolbar)
    {
        return toolbar.i;
    }

    static int d(Toolbar toolbar)
    {
        return toolbar.n;
    }

    private boolean d(View view)
    {
        return view.getParent() == this || C.contains(view);
    }

    private void g()
    {
        if (f == null)
        {
            f = new ImageView(getContext());
        }
    }

    private MenuInflater getMenuInflater()
    {
        return new c(getContext());
    }

    private void h()
    {
        i();
        if (b.c() == null)
        {
            g g1 = (g)b.getMenu();
            if (H == null)
            {
                H = new az(this, null);
            }
            b.setExpandedActionViewsExclusive(true);
            g1.a(H, j);
        }
    }

    private void i()
    {
        if (b == null)
        {
            b = new ActionMenuView(getContext());
            b.setPopupTheme(k);
            b.setOnMenuItemClickListener(F);
            b.a(I, J);
            android.support.v7.widget.ba ba1 = d();
            ba1.a = 0x800005 | n & 0x70;
            b.setLayoutParams(ba1);
            a(b, false);
        }
    }

    private void j()
    {
        if (e == null)
        {
            e = new ImageButton(getContext(), null, b.toolbarNavigationButtonStyle);
            android.support.v7.widget.ba ba1 = d();
            ba1.a = 0x800003 | n & 0x70;
            e.setLayoutParams(ba1);
        }
    }

    private void k()
    {
        if (i == null)
        {
            i = new ImageButton(getContext(), null, b.toolbarNavigationButtonStyle);
            i.setImageDrawable(g);
            i.setContentDescription(h);
            android.support.v7.widget.ba ba1 = d();
            ba1.a = 0x800003 | n & 0x70;
            ba1.b = 2;
            i.setLayoutParams(ba1);
            i.setOnClickListener(new ay(this));
        }
    }

    private void l()
    {
        removeCallbacks(L);
        post(L);
    }

    private boolean m()
    {
        if (K) goto _L2; else goto _L1
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

    public android.support.v7.widget.ba a(AttributeSet attributeset)
    {
        return new android.support.v7.widget.ba(getContext(), attributeset);
    }

    protected android.support.v7.widget.ba a(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof android.support.v7.widget.ba)
        {
            return new android.support.v7.widget.ba((android.support.v7.widget.ba)layoutparams);
        }
        if (layoutparams instanceof android.support.v7.a.b)
        {
            return new android.support.v7.widget.ba((android.support.v7.a.b)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new android.support.v7.widget.ba((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new android.support.v7.widget.ba(layoutparams);
        }
    }

    public void a(int i1, int j1)
    {
        t.a(i1, j1);
    }

    public void a(Context context, int i1)
    {
        l = i1;
        if (c != null)
        {
            c.setTextAppearance(context, i1);
        }
    }

    public boolean a()
    {
        return b != null && b.e();
    }

    public void b(Context context, int i1)
    {
        m = i1;
        if (d != null)
        {
            d.setTextAppearance(context, i1);
        }
    }

    public boolean b()
    {
        return b != null && b.d();
    }

    public void c()
    {
        j j1;
        if (H == null)
        {
            j1 = null;
        } else
        {
            j1 = H.b;
        }
        if (j1 != null)
        {
            j1.collapseActionView();
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return super.checkLayoutParams(layoutparams) && (layoutparams instanceof android.support.v7.widget.ba);
    }

    protected android.support.v7.widget.ba d()
    {
        return new android.support.v7.widget.ba(-2, -2);
    }

    void e()
    {
        for (int i1 = getChildCount() - 1; i1 >= 0; i1--)
        {
            View view = getChildAt(i1);
            if (((android.support.v7.widget.ba)view.getLayoutParams()).b != 2 && view != b)
            {
                removeViewAt(i1);
                C.add(view);
            }
        }

    }

    void f()
    {
        for (int i1 = C.size() - 1; i1 >= 0; i1--)
        {
            addView((View)C.get(i1));
        }

        C.clear();
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return d();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return a(attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return a(layoutparams);
    }

    public int getContentInsetEnd()
    {
        return t.d();
    }

    public int getContentInsetLeft()
    {
        return t.a();
    }

    public int getContentInsetRight()
    {
        return t.b();
    }

    public int getContentInsetStart()
    {
        return t.c();
    }

    public Drawable getLogo()
    {
        if (f != null)
        {
            return f.getDrawable();
        } else
        {
            return null;
        }
    }

    public CharSequence getLogoDescription()
    {
        if (f != null)
        {
            return f.getContentDescription();
        } else
        {
            return null;
        }
    }

    public Menu getMenu()
    {
        h();
        return b.getMenu();
    }

    public CharSequence getNavigationContentDescription()
    {
        if (e != null)
        {
            return e.getContentDescription();
        } else
        {
            return null;
        }
    }

    public Drawable getNavigationIcon()
    {
        if (e != null)
        {
            return e.getDrawable();
        } else
        {
            return null;
        }
    }

    public Drawable getOverflowIcon()
    {
        h();
        return b.getOverflowIcon();
    }

    public int getPopupTheme()
    {
        return k;
    }

    public CharSequence getSubtitle()
    {
        return w;
    }

    public CharSequence getTitle()
    {
        return v;
    }

    public u getWrapper()
    {
        if (G == null)
        {
            G = new android.support.v7.internal.widget.an(this, true);
        }
        return G;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks(L);
    }

    public boolean onHoverEvent(MotionEvent motionevent)
    {
        int i1 = ba.a(motionevent);
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
        if (bq.e(this) == 1)
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
        i3 = bq.i(this);
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
        ai[0] = Math.max(0, getContentInsetLeft() - l1);
        ai[1] = Math.max(0, getContentInsetRight() - (j3 - k3 - i1));
        k1 = Math.max(l1, getContentInsetLeft());
        l1 = Math.min(i1, j3 - k3 - getContentInsetRight());
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
            android.support.v7.widget.ba ba1 = (android.support.v7.widget.ba)c.getLayoutParams();
            i1 = ba1.topMargin;
            l1 = c.getMeasuredHeight();
            i1 = 0 + (ba1.bottomMargin + (i1 + l1));
        }
        if (flag2)
        {
            android.support.v7.widget.ba ba2 = (android.support.v7.widget.ba)d.getLayoutParams();
            l1 = ba2.topMargin;
            int j2 = d.getMeasuredHeight();
            l2 = ba2.bottomMargin + (l1 + j2) + i1;
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
        obj = (android.support.v7.widget.ba)((View) (obj)).getLayoutParams();
        obj1 = (android.support.v7.widget.ba)((View) (obj1)).getLayoutParams();
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
        if (i1 < ((android.support.v7.widget.ba) (obj)).topMargin + r)
        {
            i1 = ((android.support.v7.widget.ba) (obj)).topMargin + r;
        } else
        {
            l1 = i4 - j4 - l2 - i1 - l3;
            if (l1 < ((android.support.v7.widget.ba) (obj)).bottomMargin + s)
            {
                i1 = Math.max(0, i1 - ((((android.support.v7.widget.ba) (obj1)).bottomMargin + s) - l1));
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
                obj = (android.support.v7.widget.ba)c.getLayoutParams();
                l1 = j1 - c.getMeasuredWidth();
                k2 = c.getMeasuredHeight() + i1;
                c.layout(l1, i1, j1, k2);
                l2 = q;
                i1 = k2 + ((android.support.v7.widget.ba) (obj)).bottomMargin;
                l1 -= l2;
            } else
            {
                l1 = j1;
            }
            if (flag2)
            {
                obj = (android.support.v7.widget.ba)d.getLayoutParams();
                i1 = ((android.support.v7.widget.ba) (obj)).topMargin + i1;
                k2 = d.getMeasuredWidth();
                l2 = d.getMeasuredHeight() + i1;
                d.layout(j1 - k2, i1, j1, l2);
                i1 = q;
                k2 = ((android.support.v7.widget.ba) (obj)).bottomMargin;
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
                obj = (android.support.v7.widget.ba)c.getLayoutParams();
                k2 = c.getMeasuredWidth() + k1;
                l1 = c.getMeasuredHeight() + i1;
                c.layout(k1, i1, k2, l1);
                l2 = q;
                i1 = ((android.support.v7.widget.ba) (obj)).bottomMargin;
                k2 += l2;
                i1 += l1;
            } else
            {
                k2 = k1;
            }
            if (flag2)
            {
                obj = (android.support.v7.widget.ba)d.getLayoutParams();
                l1 = i1 + ((android.support.v7.widget.ba) (obj)).topMargin;
                i1 = d.getMeasuredWidth() + k1;
                l2 = d.getMeasuredHeight() + l1;
                d.layout(k1, l1, i1, l2);
                l1 = q;
                l2 = ((android.support.v7.widget.ba) (obj)).bottomMargin;
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
        i1 = ((android.support.v7.widget.ba) (obj)).topMargin + i1 + r;
        break MISSING_BLOCK_LABEL_604;
_L6:
        i1 = i4 - j4 - ((android.support.v7.widget.ba) (obj1)).bottomMargin - s - l2;
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
        int j2 = 0;
        int i2 = 0;
        int ai[] = D;
        int k1;
        int l1;
        int k2;
        int l2;
        int i3;
        int j3;
        if (aq.a(this))
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
            a(e, i1, 0, j1, 0, o);
            k1 = e.getMeasuredWidth() + b(e);
            j2 = Math.max(0, e.getMeasuredHeight() + c(e));
            i2 = aq.a(0, bq.g(e));
        }
        i3 = k1;
        k1 = i2;
        l1 = j2;
        if (a(i))
        {
            a(i, i1, 0, j1, 0, o);
            i3 = i.getMeasuredWidth() + b(i);
            l1 = Math.max(j2, i.getMeasuredHeight() + c(i));
            k1 = aq.a(i2, bq.g(i));
        }
        i2 = getContentInsetStart();
        j3 = 0 + Math.max(i2, i3);
        ai[l2] = Math.max(0, i2 - i3);
        l2 = 0;
        i2 = k1;
        j2 = l1;
        if (a(b))
        {
            a(b, i1, j3, j1, 0, o);
            l2 = b.getMeasuredWidth() + b(b);
            j2 = Math.max(l1, b.getMeasuredHeight() + c(b));
            i2 = aq.a(k1, bq.g(b));
        }
        k1 = getContentInsetEnd();
        i3 = j3 + Math.max(k1, l2);
        ai[k2] = Math.max(0, k1 - l2);
        l2 = i3;
        k1 = i2;
        l1 = j2;
        if (a(a))
        {
            l2 = i3 + a(a, i1, i3, j1, 0, ai);
            l1 = Math.max(j2, a.getMeasuredHeight() + c(a));
            k1 = aq.a(i2, bq.g(a));
        }
        i2 = l2;
        j2 = k1;
        k2 = l1;
        if (a(f))
        {
            i2 = l2 + a(f, i1, l2, j1, 0, ai);
            k2 = Math.max(l1, f.getMeasuredHeight() + c(f));
            j2 = aq.a(k1, bq.g(f));
        }
        i3 = getChildCount();
        l2 = 0;
        l1 = k2;
        k1 = j2;
        j2 = l2;
        l2 = i2;
        while (j2 < i3) 
        {
            View view = getChildAt(j2);
            if (((android.support.v7.widget.ba)view.getLayoutParams()).b == 0 && a(view))
            {
                l2 += a(view, i1, l2, j1, 0, ai);
                l1 = Math.max(l1, view.getMeasuredHeight() + c(view));
                k1 = aq.a(k1, bq.g(view));
            }
            j2++;
        }
        k2 = 0;
        j2 = 0;
        int k3 = r + s;
        int l3 = p + q;
        i2 = k1;
        if (a(c))
        {
            a(c, i1, l2 + l3, j1, k3, ai);
            i2 = c.getMeasuredWidth();
            k2 = b(c) + i2;
            j2 = c.getMeasuredHeight() + c(c);
            i2 = aq.a(k1, bq.g(c));
        }
        j3 = j2;
        i3 = k2;
        k1 = i2;
        if (a(d))
        {
            i3 = Math.max(k2, a(d, i1, l2 + l3, j1, k3 + j2, ai));
            j3 = j2 + (d.getMeasuredHeight() + c(d));
            k1 = aq.a(i2, bq.g(d));
        }
        l1 = Math.max(l1, j3);
        k2 = getPaddingLeft();
        j3 = getPaddingRight();
        i2 = getPaddingTop();
        j2 = getPaddingBottom();
        k2 = bq.a(Math.max(i3 + l2 + (k2 + j3), getSuggestedMinimumWidth()), i1, 0xff000000 & k1);
        i1 = bq.a(Math.max(l1 + (i2 + j2), getSuggestedMinimumHeight()), j1, k1 << 16);
        if (m())
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
            parcelable = b.c();
        } else
        {
            parcelable = null;
        }
        if (savedstate.a != 0 && H != null && parcelable != null)
        {
            parcelable = parcelable.findItem(savedstate.a);
            if (parcelable != null)
            {
                as.a(parcelable);
            }
        }
        if (savedstate.b)
        {
            l();
        }
    }

    public void onRtlPropertiesChanged(int i1)
    {
        boolean flag = true;
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            super.onRtlPropertiesChanged(i1);
        }
        aa aa1 = t;
        if (i1 != 1)
        {
            flag = false;
        }
        aa1.a(flag);
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        if (H != null && H.b != null)
        {
            savedstate.a = H.b.getItemId();
        }
        savedstate.b = a();
        return savedstate;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1 = ba.a(motionevent);
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

    public void setCollapsible(boolean flag)
    {
        K = flag;
        requestLayout();
    }

    public void setLogo(int i1)
    {
        setLogo(M.a(i1));
    }

    public void setLogo(Drawable drawable)
    {
        if (drawable == null) goto _L2; else goto _L1
_L1:
        g();
        if (!d(f))
        {
            a(f, true);
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

    public void setLogoDescription(int i1)
    {
        setLogoDescription(getContext().getText(i1));
    }

    public void setLogoDescription(CharSequence charsequence)
    {
        if (!TextUtils.isEmpty(charsequence))
        {
            g();
        }
        if (f != null)
        {
            f.setContentDescription(charsequence);
        }
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
            j();
        }
        if (e != null)
        {
            e.setContentDescription(charsequence);
        }
    }

    public void setNavigationIcon(int i1)
    {
        setNavigationIcon(M.a(i1));
    }

    public void setNavigationIcon(Drawable drawable)
    {
        if (drawable == null) goto _L2; else goto _L1
_L1:
        j();
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

    public void setNavigationOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        j();
        e.setOnClickListener(onclicklistener);
    }

    public void setOnMenuItemClickListener(bb bb)
    {
        E = bb;
    }

    public void setOverflowIcon(Drawable drawable)
    {
        h();
        b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i1)
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

    public void setSubtitle(int i1)
    {
        setSubtitle(getContext().getText(i1));
    }

    public void setSubtitle(CharSequence charsequence)
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

    public void setSubtitleTextColor(int i1)
    {
        y = i1;
        if (d != null)
        {
            d.setTextColor(i1);
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
            a(c, true);
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

    public void setTitleTextColor(int i1)
    {
        x = i1;
        if (c != null)
        {
            c.setTextColor(i1);
        }
    }

    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new bc();
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
