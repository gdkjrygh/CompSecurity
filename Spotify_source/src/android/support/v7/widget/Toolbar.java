// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import aby;
import abz;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import il;
import java.util.ArrayList;
import java.util.List;
import je;
import ji;
import jo;
import km;
import sr;
import uh;
import uk;
import uv;
import vp;
import vv;
import wc;
import wd;
import we;
import yx;
import zh;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuView

public class Toolbar extends ViewGroup
{

    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private boolean F;
    private boolean G;
    private final ArrayList H;
    private final int I[];
    private final zh J;
    private wd K;
    private final Runnable L;
    public ActionMenuView a;
    public TextView b;
    public TextView c;
    public ImageButton d;
    public View e;
    public Context f;
    public int g;
    public int h;
    public int i;
    public final vv j;
    public CharSequence k;
    public CharSequence l;
    public final ArrayList m;
    public abz n;
    public yx o;
    public aby p;
    public uv q;
    public uh r;
    private ImageView s;
    private Drawable t;
    private CharSequence u;
    private ImageButton v;
    private int w;
    private int x;
    private int y;
    private int z;

    public Toolbar(Context context)
    {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f01010e);
    }

    public Toolbar(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        j = new vv();
        C = 0x800013;
        H = new ArrayList();
        m = new ArrayList();
        I = new int[2];
        J = new zh() {

            private Toolbar a;

            public final boolean a(MenuItem menuitem)
            {
                if (Toolbar.a(a) != null)
                {
                    return Toolbar.a(a).a(menuitem);
                } else
                {
                    return false;
                }
            }

            
            {
                a = Toolbar.this;
                super();
            }
        };
        L = new Runnable() {

            private Toolbar a;

            public final void run()
            {
                a.b();
            }

            
            {
                a = Toolbar.this;
                super();
            }
        };
        context = wc.a(getContext(), attributeset, sr.ca, i1);
        h = context.e(sr.cx, 0);
        i = context.e(sr.cp, 0);
        i1 = sr.cb;
        i1 = C;
        C = ((wc) (context)).a.getInteger(0, i1);
        w = 48;
        i1 = context.b(sr.cw, 0);
        B = i1;
        A = i1;
        z = i1;
        y = i1;
        i1 = context.b(sr.cu, -1);
        if (i1 >= 0)
        {
            y = i1;
        }
        i1 = context.b(sr.ct, -1);
        if (i1 >= 0)
        {
            z = i1;
        }
        i1 = context.b(sr.cv, -1);
        if (i1 >= 0)
        {
            A = i1;
        }
        i1 = context.b(sr.cs, -1);
        if (i1 >= 0)
        {
            B = i1;
        }
        x = context.c(sr.ck, -1);
        i1 = context.b(sr.ch, 0x80000000);
        int j1 = context.b(sr.ce, 0x80000000);
        int k1 = context.c(sr.cf, 0);
        int l1 = context.c(sr.cg, 0);
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
        t = context.a(sr.cd);
        u = context.c(sr.cc);
        attributeset = context.c(sr.cr);
        if (!TextUtils.isEmpty(attributeset))
        {
            a(attributeset);
        }
        attributeset = context.c(sr.co);
        if (!TextUtils.isEmpty(attributeset))
        {
            b(attributeset);
        }
        f = getContext();
        a(context.e(sr.cn, 0));
        attributeset = context.a(sr.cm);
        if (attributeset != null)
        {
            b(attributeset);
        }
        attributeset = context.c(sr.cl);
        if (!TextUtils.isEmpty(attributeset))
        {
            c(attributeset);
        }
        attributeset = context.a(sr.ci);
        if (attributeset != null)
        {
            a(attributeset);
        }
        attributeset = context.c(sr.cj);
        if (!TextUtils.isEmpty(attributeset))
        {
            if (!TextUtils.isEmpty(attributeset))
            {
                k();
            }
            if (s != null)
            {
                s.setContentDescription(attributeset);
            }
        }
        if (context.e(sr.cy))
        {
            i1 = context.d(sr.cy);
            D = i1;
            if (b != null)
            {
                b.setTextColor(i1);
            }
        }
        if (context.e(sr.cq))
        {
            i1 = context.d(sr.cq);
            E = i1;
            if (c != null)
            {
                c.setTextColor(i1);
            }
        }
        ((wc) (context)).a.recycle();
        context.a();
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
        j1 = C & 0x70;
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

    static abz a(Toolbar toolbar)
    {
        return toolbar.n;
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
        if (km.h(this) != 1)
        {
            flag = false;
        }
        k1 = getChildCount();
        j1 = il.a(i1, km.h(this));
        list.clear();
        i1 = ((flag1) ? 1 : 0);
        if (flag)
        {
            for (i1 = k1 - 1; i1 >= 0; i1--)
            {
                View view = getChildAt(i1);
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                if (layoutparams.b == 0 && a(view) && b(layoutparams.a) == j1)
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
                if (layoutparams1.b == 0 && a(view1) && b(layoutparams1.a) == j1)
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
            int k1 = km.h(this);
            int j1 = il.a(i1, k1) & 7;
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

    private static int b(View view)
    {
        view = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int i1 = je.a(view);
        return je.b(view) + i1;
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
        if (toolbar.v == null)
        {
            toolbar.v = new ImageButton(toolbar.getContext(), null, 0x7f01010f);
            toolbar.v.setImageDrawable(toolbar.t);
            toolbar.v.setContentDescription(toolbar.u);
            LayoutParams layoutparams = new LayoutParams();
            layoutparams.a = 0x800003 | toolbar.w & 0x70;
            layoutparams.b = 2;
            toolbar.v.setLayoutParams(layoutparams);
            toolbar.v.setOnClickListener(toolbar. new android.view.View.OnClickListener() {

                private Toolbar a;

                public final void onClick(View view)
                {
                    a.c();
                }

            
            {
                a = Toolbar.this;
                super();
            }
            });
        }
    }

    private static int c(View view)
    {
        view = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int i1 = ((android.view.ViewGroup.MarginLayoutParams) (view)).topMargin;
        return ((android.view.ViewGroup.MarginLayoutParams) (view)).bottomMargin + i1;
    }

    public static ImageButton c(Toolbar toolbar)
    {
        return toolbar.v;
    }

    public static int d(Toolbar toolbar)
    {
        return toolbar.w;
    }

    private boolean d(View view)
    {
        return view.getParent() == this || m.contains(view);
    }

    public static LayoutParams i()
    {
        return new LayoutParams();
    }

    private void k()
    {
        if (s == null)
        {
            s = new ImageView(getContext());
        }
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
        k();
        if (!d(s))
        {
            a(((View) (s)), true);
        }
_L4:
        if (s != null)
        {
            s.setImageDrawable(drawable);
        }
        return;
_L2:
        if (s != null && d(s))
        {
            removeView(s);
            m.remove(s);
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
            if (D != 0)
            {
                b.setTextColor(D);
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

    public final void b(Drawable drawable)
    {
        if (drawable == null) goto _L2; else goto _L1
_L1:
        h();
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
            if (E != 0)
            {
                c.setTextColor(E);
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
        uk uk1;
        if (p == null)
        {
            uk1 = null;
        } else
        {
            uk1 = p.a;
        }
        if (uk1 != null)
        {
            uk1.collapseActionView();
        }
    }

    public final void c(CharSequence charsequence)
    {
        if (!TextUtils.isEmpty(charsequence))
        {
            h();
        }
        if (d != null)
        {
            d.setContentDescription(charsequence);
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return super.checkLayoutParams(layoutparams) && (layoutparams instanceof LayoutParams);
    }

    public final CharSequence d()
    {
        return k;
    }

    public final CharSequence e()
    {
        if (d != null)
        {
            return d.getContentDescription();
        } else
        {
            return null;
        }
    }

    public final Drawable f()
    {
        if (d != null)
        {
            return d.getDrawable();
        } else
        {
            return null;
        }
    }

    public final void g()
    {
        if (a == null)
        {
            a = new ActionMenuView(getContext());
            a.a(g);
            a.f = J;
            Object obj = a;
            uv uv = q;
            uh uh = r;
            obj.d = uv;
            obj.e = uh;
            obj = new LayoutParams();
            obj.a = 0x800005 | w & 0x70;
            a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            a(a, false);
        }
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
        if (d == null)
        {
            d = new ImageButton(getContext(), null, 0x7f01010f);
            LayoutParams layoutparams = new LayoutParams();
            layoutparams.a = 0x800003 | w & 0x70;
            d.setLayoutParams(layoutparams);
        }
    }

    public final vp j()
    {
        if (K == null)
        {
            K = new wd(this, true);
        }
        return K;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks(L);
    }

    public boolean onHoverEvent(MotionEvent motionevent)
    {
        int i1 = jo.a(motionevent);
        if (i1 == 9)
        {
            G = false;
        }
        if (!G)
        {
            boolean flag = super.onHoverEvent(motionevent);
            if (i1 == 9 && !flag)
            {
                G = true;
            }
        }
        if (i1 == 10 || i1 == 3)
        {
            G = false;
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
        if (km.h(this) == 1)
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
        ai = I;
        ai[1] = 0;
        ai[0] = 0;
        j3 = km.p(this);
        LayoutParams layoutparams2;
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
        if (a(v))
        {
            if (l2 != 0)
            {
                j1 = b(v, l1, ai, j3);
                k1 = i1;
            } else
            {
                k1 = a(v, i1, ai, j3);
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
        ai[0] = Math.max(0, j.a - l1);
        ai[1] = Math.max(0, j.b - (k3 - l3 - i1));
        k1 = Math.max(l1, j.a);
        l1 = Math.min(i1, k3 - l3 - j.b);
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
        if (a(s))
        {
            if (l2 != 0)
            {
                j1 = b(s, j1, ai, j3);
                k1 = i1;
            } else
            {
                k1 = a(s, i1, ai, j3);
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
            LayoutParams layoutparams = (LayoutParams)b.getLayoutParams();
            i1 = layoutparams.topMargin;
            l1 = b.getMeasuredHeight();
            i1 = layoutparams.bottomMargin + (i1 + l1) + 0;
        }
        if (flag2)
        {
            LayoutParams layoutparams1 = (LayoutParams)c.getLayoutParams();
            l1 = layoutparams1.topMargin;
            int j2 = c.getMeasuredHeight();
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
        obj = (LayoutParams)((View) (obj)).getLayoutParams();
        obj1 = (LayoutParams)((View) (obj1)).getLayoutParams();
        if (flag && b.getMeasuredWidth() > 0 || flag2 && c.getMeasuredWidth() > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        C & 0x70;
        JVM INSTR lookupswitch 2: default 572
    //                   48: 1011
    //                   80: 1085;
           goto _L4 _L5 _L6
_L4:
        i1 = (j4 - i4 - k4 - i3) / 2;
        if (i1 < ((LayoutParams) (obj)).topMargin + A)
        {
            i1 = ((LayoutParams) (obj)).topMargin + A;
        } else
        {
            l1 = j4 - k4 - i3 - i1 - i4;
            if (l1 < ((LayoutParams) (obj)).bottomMargin + B)
            {
                i1 = Math.max(0, i1 - ((((LayoutParams) (obj1)).bottomMargin + B) - l1));
            }
        }
        i1 = i4 + i1;
_L8:
        if (l2 != 0)
        {
            if (flag1)
            {
                l1 = y;
            } else
            {
                l1 = 0;
            }
            l1 -= ai[1];
            j1 -= Math.max(0, l1);
            ai[1] = Math.max(0, -l1);
            if (flag)
            {
                obj = (LayoutParams)b.getLayoutParams();
                l1 = j1 - b.getMeasuredWidth();
                l2 = b.getMeasuredHeight() + i1;
                b.layout(l1, i1, j1, l2);
                i3 = z;
                i1 = l2 + ((LayoutParams) (obj)).bottomMargin;
                l1 -= i3;
            } else
            {
                l1 = j1;
            }
            if (flag2)
            {
                obj = (LayoutParams)c.getLayoutParams();
                i1 = ((LayoutParams) (obj)).topMargin + i1;
                l2 = c.getMeasuredWidth();
                i3 = c.getMeasuredHeight();
                c.layout(j1 - l2, i1, j1, i3 + i1);
                i1 = z;
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
                l1 = y;
            } else
            {
                l1 = 0;
            }
            l1 -= ai[0];
            k1 += Math.max(0, l1);
            ai[0] = Math.max(0, -l1);
            if (flag)
            {
                obj = (LayoutParams)b.getLayoutParams();
                l2 = b.getMeasuredWidth() + k1;
                l1 = b.getMeasuredHeight() + i1;
                b.layout(k1, i1, l2, l1);
                i3 = z;
                i1 = ((LayoutParams) (obj)).bottomMargin;
                l2 += i3;
                i1 += l1;
            } else
            {
                l2 = k1;
            }
            if (flag2)
            {
                obj = (LayoutParams)c.getLayoutParams();
                l1 = i1 + ((LayoutParams) (obj)).topMargin;
                i1 = c.getMeasuredWidth() + k1;
                i3 = c.getMeasuredHeight();
                c.layout(k1, l1, i1, i3 + l1);
                l1 = z;
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
        a(H, 3);
        k1 = H.size();
        for (j1 = 0; j1 < k1; j1++)
        {
            i1 = a((View)H.get(j1), i1, ai, j3);
        }

        a(H, 5);
        k2 = H.size();
        k1 = 0;
        j1 = l1;
        for (; k1 < k2; k1++)
        {
            j1 = b((View)H.get(k1), j1, ai, j3);
        }

        a(H, 1);
        obj = H;
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
        i1 = ((LayoutParams) (obj)).topMargin + i1 + A;
        break MISSING_BLOCK_LABEL_616;
_L6:
        i1 = j4 - k4 - ((LayoutParams) (obj1)).bottomMargin - B - i3;
          goto _L8
_L7:
        if (l1 >= i1) goto _L10; else goto _L9
_L9:
        l1 = H.size();
        k1 = 0;
        j1 = i1;
        for (i1 = k1; i1 < l1; i1++)
        {
            j1 = a((View)H.get(i1), j1, ai, j3);
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
        H.clear();
        return;
          goto _L8
    }

    protected void onMeasure(int i1, int j1)
    {
        int ai[] = I;
        Object obj;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int k3;
        if (we.a(this))
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
            a(d, i1, 0, j1, x);
            k1 = d.getMeasuredWidth() + b(d);
            j2 = Math.max(0, d.getMeasuredHeight() + c(d));
            i2 = we.a(0, km.l(d));
        } else
        {
            i2 = 0;
            j2 = 0;
        }
        i3 = k1;
        k1 = i2;
        l1 = j2;
        if (a(v))
        {
            a(v, i1, 0, j1, x);
            i3 = v.getMeasuredWidth() + b(v);
            l1 = Math.max(j2, v.getMeasuredHeight() + c(v));
            k1 = we.a(i2, km.l(v));
        }
        obj = j;
        if (((vv) (obj)).g)
        {
            i2 = ((vv) (obj)).b;
        } else
        {
            i2 = ((vv) (obj)).a;
        }
        k3 = Math.max(i2, i3) + 0;
        ai[l2] = Math.max(0, i2 - i3);
        l2 = 0;
        i2 = k1;
        j2 = l1;
        if (a(a))
        {
            a(a, i1, k3, j1, x);
            l2 = a.getMeasuredWidth() + b(a);
            j2 = Math.max(l1, a.getMeasuredHeight() + c(a));
            i2 = we.a(k1, km.l(a));
        }
        obj = j;
        if (((vv) (obj)).g)
        {
            k1 = ((vv) (obj)).a;
        } else
        {
            k1 = ((vv) (obj)).b;
        }
        i3 = k3 + Math.max(k1, l2);
        ai[k2] = Math.max(0, k1 - l2);
        k2 = i3;
        k1 = i2;
        l1 = j2;
        if (a(e))
        {
            k2 = i3 + a(e, i1, i3, j1, 0, ai);
            l1 = Math.max(j2, e.getMeasuredHeight() + c(e));
            k1 = we.a(i2, km.l(e));
        }
        i2 = k2;
        l2 = k1;
        j2 = l1;
        if (a(s))
        {
            i2 = k2 + a(s, i1, k2, j1, 0, ai);
            j2 = Math.max(l1, s.getMeasuredHeight() + c(s));
            l2 = we.a(k1, km.l(s));
        }
        i3 = getChildCount();
        k2 = 0;
        k1 = l2;
        l1 = j2;
        j2 = k2;
        l2 = i2;
        while (j2 < i3) 
        {
            obj = getChildAt(j2);
            int j3;
            int l3;
            int i4;
            int j4;
            if (((LayoutParams)((View) (obj)).getLayoutParams()).b == 0 && a(((View) (obj))))
            {
                l2 += a(((View) (obj)), i1, l2, j1, 0, ai);
                i2 = Math.max(l1, ((View) (obj)).getMeasuredHeight() + c(((View) (obj))));
                l1 = we.a(k1, km.l(((View) (obj))));
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
        i4 = A + B;
        j4 = y + z;
        i2 = k1;
        if (a(b))
        {
            a(b, i1, l2 + j4, j1, i4, ai);
            i2 = b.getMeasuredWidth();
            k2 = b(b) + i2;
            j2 = b.getMeasuredHeight() + c(b);
            i2 = we.a(k1, km.l(b));
        }
        l3 = j2;
        j3 = k2;
        k1 = i2;
        if (a(c))
        {
            j3 = Math.max(k2, a(c, i1, l2 + j4, j1, i4 + j2, ai));
            l3 = j2 + (c.getMeasuredHeight() + c(c));
            k1 = we.a(i2, km.l(c));
        }
        l1 = Math.max(l1, l3);
        i2 = getPaddingLeft();
        j2 = getPaddingRight();
        k2 = getPaddingTop();
        l3 = getPaddingBottom();
        setMeasuredDimension(km.a(Math.max(j3 + l2 + (i2 + j2), getSuggestedMinimumWidth()), i1, 0xff000000 & k1), km.a(Math.max(l1 + (k2 + l3), getSuggestedMinimumHeight()), j1, k1 << 16));
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
        if (savedstate.a != 0 && p != null && parcelable != null)
        {
            parcelable = parcelable.findItem(savedstate.a);
            if (parcelable != null)
            {
                ji.b(parcelable);
            }
        }
        if (savedstate.b)
        {
            removeCallbacks(L);
            post(L);
        }
    }

    public void onRtlPropertiesChanged(int i1)
    {
        vv vv1;
label0:
        {
label1:
            {
                boolean flag = true;
                if (android.os.Build.VERSION.SDK_INT >= 17)
                {
                    super.onRtlPropertiesChanged(i1);
                }
                vv1 = j;
                if (i1 != 1)
                {
                    flag = false;
                }
                if (flag != vv1.g)
                {
                    vv1.g = flag;
                    if (!vv1.h)
                    {
                        break label0;
                    }
                    if (!flag)
                    {
                        break label1;
                    }
                    if (vv1.d != 0x80000000)
                    {
                        i1 = vv1.d;
                    } else
                    {
                        i1 = vv1.e;
                    }
                    vv1.a = i1;
                    if (vv1.c != 0x80000000)
                    {
                        i1 = vv1.c;
                    } else
                    {
                        i1 = vv1.f;
                    }
                    vv1.b = i1;
                }
                return;
            }
            if (vv1.c != 0x80000000)
            {
                i1 = vv1.c;
            } else
            {
                i1 = vv1.e;
            }
            vv1.a = i1;
            if (vv1.d != 0x80000000)
            {
                i1 = vv1.d;
            } else
            {
                i1 = vv1.f;
            }
            vv1.b = i1;
            return;
        }
        vv1.a = vv1.e;
        vv1.b = vv1.f;
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        if (p != null && p.a != null)
        {
            savedstate.a = p.a.getItemId();
        }
        savedstate.b = a();
        return savedstate;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1 = jo.a(motionevent);
        if (i1 == 0)
        {
            F = false;
        }
        if (!F)
        {
            boolean flag = super.onTouchEvent(motionevent);
            if (i1 == 0 && !flag)
            {
                F = true;
            }
        }
        if (i1 == 1 || i1 == 3)
        {
            F = false;
        }
        return true;
    }

    private class LayoutParams extends android.support.v7.app.ActionBar.LayoutParams
    {

        public int b;

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

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public final volatile Object[] newArray(int i1)
            {
                return new SavedState[i1];
            }

        };
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
