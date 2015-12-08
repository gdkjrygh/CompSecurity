// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.e;
import android.support.v4.view.j;
import android.support.v4.view.m;
import android.support.v4.view.x;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.h;
import android.support.v7.internal.view.menu.l;
import android.support.v7.internal.widget.g;
import android.support.v7.internal.widget.k;
import android.support.v7.internal.widget.o;
import android.support.v7.internal.widget.p;
import android.support.v7.internal.widget.q;
import android.support.v7.internal.widget.r;
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
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuView, ActionMenuPresenter

public class Toolbar extends ViewGroup
{
    public static class SavedState extends android.view.View.BaseSavedState
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

    private final class a
        implements l
    {

        f a;
        h b;
        final Toolbar c;

        public final void a(Context context, f f1)
        {
            if (a != null && b != null)
            {
                a.b(b);
            }
            a = f1;
        }

        public final void a(Parcelable parcelable)
        {
        }

        public final void a(f f1, boolean flag)
        {
        }

        public final void a(boolean flag)
        {
            if (b == null) goto _L2; else goto _L1
_L1:
            boolean flag1;
            boolean flag2;
            flag2 = false;
            flag1 = flag2;
            if (a == null) goto _L4; else goto _L3
_L3:
            int i1;
            int j1;
            j1 = a.size();
            i1 = 0;
_L9:
            flag1 = flag2;
            if (i1 >= j1) goto _L4; else goto _L5
_L5:
            if (a.getItem(i1) != b) goto _L7; else goto _L6
_L6:
            flag1 = true;
_L4:
            if (!flag1)
            {
                b(b);
            }
_L2:
            return;
_L7:
            i1++;
            if (true) goto _L9; else goto _L8
_L8:
        }

        public final boolean a()
        {
            return false;
        }

        public final boolean a(h h1)
        {
            Toolbar.b(c);
            if (Toolbar.c(c).getParent() != c)
            {
                c.addView(Toolbar.c(c));
            }
            c.a = h1.getActionView();
            b = h1;
            if (c.a.getParent() != c)
            {
                b b1 = Toolbar.n();
                b1.a = 0x800003 | Toolbar.d(c) & 0x70;
                b1.b = 2;
                c.a.setLayoutParams(b1);
                c.addView(c.a);
            }
            c.p();
            c.requestLayout();
            h1.e(true);
            if (c.a instanceof android.support.v7.view.b)
            {
                ((android.support.v7.view.b)c.a).a();
            }
            return true;
        }

        public final boolean a(android.support.v7.internal.view.menu.o o1)
        {
            return false;
        }

        public final int b()
        {
            return 0;
        }

        public final boolean b(h h1)
        {
            if (c.a instanceof android.support.v7.view.b)
            {
                ((android.support.v7.view.b)c.a).b();
            }
            c.removeView(c.a);
            c.removeView(Toolbar.c(c));
            c.a = null;
            c.q();
            b = null;
            c.requestLayout();
            h1.e(false);
            return true;
        }

        public final Parcelable d()
        {
            return null;
        }

        private a()
        {
            c = Toolbar.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    public static final class b extends android.support.v7.app.ActionBar.a
    {

        int b;

        public b()
        {
            b = 0;
            a = 0x800013;
        }

        public b(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            b = 0;
        }

        public b(android.support.v7.app.ActionBar.a a1)
        {
            super(a1);
            b = 0;
        }

        public b(b b1)
        {
            super(b1);
            b = 0;
            b = b1.b;
        }

        public b(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            b = 0;
        }

        public b(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            b = 0;
            leftMargin = marginlayoutparams.leftMargin;
            topMargin = marginlayoutparams.topMargin;
            rightMargin = marginlayoutparams.rightMargin;
            bottomMargin = marginlayoutparams.bottomMargin;
        }
    }

    public static interface c
    {

        public abstract boolean a(MenuItem menuitem);
    }


    private boolean A;
    private final ArrayList B;
    private final ArrayList C;
    private final int D[];
    private c E;
    private final ActionMenuView.e F;
    private q G;
    private ActionMenuPresenter H;
    private a I;
    private android.support.v7.internal.view.menu.l.a J;
    private android.support.v7.internal.view.menu.f.a K;
    private boolean L;
    private final Runnable M;
    private final o N;
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
    private final k t;
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
        this(context, attributeset, android.support.v7.appcompat.a.a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        t = new k();
        u = 0x800013;
        B = new ArrayList();
        C = new ArrayList();
        D = new int[2];
        F = new ActionMenuView.e() {

            final Toolbar a;

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
        M = new Runnable() {

            final Toolbar a;

            public final void run()
            {
                a.d();
            }

            
            {
                a = Toolbar.this;
                super();
            }
        };
        context = android.support.v7.internal.widget.p.a(getContext(), attributeset, android.support.v7.appcompat.a.k.Toolbar, i1);
        l = context.f(android.support.v7.appcompat.a.k.Toolbar_titleTextAppearance, 0);
        m = context.f(android.support.v7.appcompat.a.k.Toolbar_subtitleTextAppearance, 0);
        u = context.b(android.support.v7.appcompat.a.k.Toolbar_android_gravity, u);
        n = 48;
        i1 = context.c(android.support.v7.appcompat.a.k.Toolbar_titleMargins, 0);
        s = i1;
        r = i1;
        q = i1;
        p = i1;
        i1 = context.c(android.support.v7.appcompat.a.k.Toolbar_titleMarginStart, -1);
        if (i1 >= 0)
        {
            p = i1;
        }
        i1 = context.c(android.support.v7.appcompat.a.k.Toolbar_titleMarginEnd, -1);
        if (i1 >= 0)
        {
            q = i1;
        }
        i1 = context.c(android.support.v7.appcompat.a.k.Toolbar_titleMarginTop, -1);
        if (i1 >= 0)
        {
            r = i1;
        }
        i1 = context.c(android.support.v7.appcompat.a.k.Toolbar_titleMarginBottom, -1);
        if (i1 >= 0)
        {
            s = i1;
        }
        o = context.d(android.support.v7.appcompat.a.k.Toolbar_maxButtonHeight, -1);
        i1 = context.c(android.support.v7.appcompat.a.k.Toolbar_contentInsetStart, 0x80000000);
        int j1 = context.c(android.support.v7.appcompat.a.k.Toolbar_contentInsetEnd, 0x80000000);
        int k1 = context.d(android.support.v7.appcompat.a.k.Toolbar_contentInsetLeft, 0);
        int l1 = context.d(android.support.v7.appcompat.a.k.Toolbar_contentInsetRight, 0);
        t.b(k1, l1);
        if (i1 != 0x80000000 || j1 != 0x80000000)
        {
            t.a(i1, j1);
        }
        g = context.a(android.support.v7.appcompat.a.k.Toolbar_collapseIcon);
        h = context.c(android.support.v7.appcompat.a.k.Toolbar_collapseContentDescription);
        attributeset = context.c(android.support.v7.appcompat.a.k.Toolbar_title);
        if (!TextUtils.isEmpty(attributeset))
        {
            setTitle(attributeset);
        }
        attributeset = context.c(android.support.v7.appcompat.a.k.Toolbar_subtitle);
        if (!TextUtils.isEmpty(attributeset))
        {
            setSubtitle(attributeset);
        }
        j = getContext();
        setPopupTheme(context.f(android.support.v7.appcompat.a.k.Toolbar_popupTheme, 0));
        attributeset = context.a(android.support.v7.appcompat.a.k.Toolbar_navigationIcon);
        if (attributeset != null)
        {
            setNavigationIcon(attributeset);
        }
        attributeset = context.c(android.support.v7.appcompat.a.k.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(attributeset))
        {
            setNavigationContentDescription(attributeset);
        }
        attributeset = context.a(android.support.v7.appcompat.a.k.Toolbar_logo);
        if (attributeset != null)
        {
            setLogo(attributeset);
        }
        attributeset = context.c(android.support.v7.appcompat.a.k.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(attributeset))
        {
            setLogoDescription(attributeset);
        }
        if (context.g(android.support.v7.appcompat.a.k.Toolbar_titleTextColor))
        {
            setTitleTextColor(context.f(android.support.v7.appcompat.a.k.Toolbar_titleTextColor));
        }
        if (context.g(android.support.v7.appcompat.a.k.Toolbar_subtitleTextColor))
        {
            setSubtitleTextColor(context.f(android.support.v7.appcompat.a.k.Toolbar_subtitleTextColor));
        }
        context.b();
        N = context.c();
    }

    private int a(int i1)
    {
label0:
        {
            int k1 = android.support.v4.view.x.h(this);
            int j1 = android.support.v4.view.e.a(i1, k1) & 7;
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
        b b1;
        int j1;
        int k1;
        int l1;
        int i2;
        b1 = (b)view.getLayoutParams();
        l1 = view.getMeasuredHeight();
        if (i1 > 0)
        {
            i1 = (l1 - i1) / 2;
        } else
        {
            i1 = 0;
        }
        k1 = b1.a & 0x70;
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
        k1 = getPaddingTop();
        i1 = getPaddingBottom();
        i2 = getHeight();
        j1 = (i2 - k1 - i1 - l1) / 2;
        if (j1 >= b1.topMargin) goto _L7; else goto _L6
_L6:
        i1 = b1.topMargin;
_L9:
        return k1 + i1;
_L4:
        return getPaddingTop() - i1;
_L5:
        return getHeight() - getPaddingBottom() - l1 - b1.bottomMargin - i1;
_L7:
        l1 = i2 - i1 - l1 - j1 - k1;
        i1 = j1;
        if (l1 < b1.bottomMargin)
        {
            i1 = Math.max(0, j1 - (b1.bottomMargin - l1));
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
        b b1 = (b)view.getLayoutParams();
        int k1 = b1.leftMargin - ai[0];
        i1 += Math.max(0, k1);
        ai[0] = Math.max(0, -k1);
        j1 = a(view, j1);
        k1 = view.getMeasuredWidth();
        view.layout(i1, j1, i1 + k1, view.getMeasuredHeight() + j1);
        return b1.rightMargin + k1 + i1;
    }

    private static b a(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof b)
        {
            return new b((b)layoutparams);
        }
        if (layoutparams instanceof android.support.v7.app.ActionBar.a)
        {
            return new b((android.support.v7.app.ActionBar.a)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new b((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new b(layoutparams);
        }
    }

    static c a(Toolbar toolbar)
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
            obj = new b();
        } else
        if (!checkLayoutParams(((android.view.ViewGroup.LayoutParams) (obj))))
        {
            obj = a(((android.view.ViewGroup.LayoutParams) (obj)));
        } else
        {
            obj = (b)obj;
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
        int j1;
        int k1;
        if (android.support.v4.view.x.h(this) != 1)
        {
            flag = false;
        }
        k1 = getChildCount();
        j1 = android.support.v4.view.e.a(i1, android.support.v4.view.x.h(this));
        list.clear();
        if (flag)
        {
            for (i1 = k1 - 1; i1 >= 0; i1--)
            {
                View view = getChildAt(i1);
                b b1 = (b)view.getLayoutParams();
                if (b1.b == 0 && a(view) && a(b1.a) == j1)
                {
                    list.add(view);
                }
            }

        } else
        {
            for (i1 = 0; i1 < k1; i1++)
            {
                View view1 = getChildAt(i1);
                b b2 = (b)view1.getLayoutParams();
                if (b2.b == 0 && a(view1) && a(b2.a) == j1)
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
        return android.support.v4.view.j.a(view) + android.support.v4.view.j.b(view);
    }

    private int b(View view, int i1, int ai[], int j1)
    {
        b b1 = (b)view.getLayoutParams();
        int k1 = b1.rightMargin - ai[1];
        i1 -= Math.max(0, k1);
        ai[1] = Math.max(0, -k1);
        j1 = a(view, j1);
        k1 = view.getMeasuredWidth();
        view.layout(i1 - k1, j1, i1, view.getMeasuredHeight() + j1);
        return i1 - (b1.leftMargin + k1);
    }

    static void b(Toolbar toolbar)
    {
        if (toolbar.i == null)
        {
            toolbar.i = new ImageButton(toolbar.getContext(), null, android.support.v7.appcompat.a.a.toolbarNavigationButtonStyle);
            toolbar.i.setImageDrawable(toolbar.g);
            toolbar.i.setContentDescription(toolbar.h);
            b b1 = new b();
            b1.a = 0x800003 | toolbar.n & 0x70;
            b1.b = 2;
            toolbar.i.setLayoutParams(b1);
            toolbar.i.setOnClickListener(toolbar. new android.view.View.OnClickListener() {

                final Toolbar a;

                public final void onClick(View view)
                {
                    a.h();
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
        return ((android.view.ViewGroup.MarginLayoutParams) (view)).topMargin + ((android.view.ViewGroup.MarginLayoutParams) (view)).bottomMargin;
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

    protected static b n()
    {
        return new b();
    }

    private void r()
    {
        if (f == null)
        {
            f = new ImageView(getContext());
        }
    }

    private void s()
    {
        t();
        if (b.d() == null)
        {
            f f1 = (f)b.c();
            if (I == null)
            {
                I = new a((byte)0);
            }
            b.setExpandedActionViewsExclusive(true);
            f1.a(I, j);
        }
    }

    private void t()
    {
        if (b == null)
        {
            b = new ActionMenuView(getContext());
            b.setPopupTheme(k);
            b.setOnMenuItemClickListener(F);
            b.setMenuCallbacks(J, K);
            b b1 = new b();
            b1.a = 0x800005 | n & 0x70;
            b.setLayoutParams(b1);
            a(b, false);
        }
    }

    private void u()
    {
        if (e == null)
        {
            e = new ImageButton(getContext(), null, android.support.v7.appcompat.a.a.toolbarNavigationButtonStyle);
            b b1 = new b();
            b1.a = 0x800003 | n & 0x70;
            e.setLayoutParams(b1);
        }
    }

    public final boolean a()
    {
        return getVisibility() == 0 && b != null && b.a();
    }

    public final boolean b()
    {
        return b != null && b.g();
    }

    public final boolean c()
    {
        return b != null && b.h();
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return super.checkLayoutParams(layoutparams) && (layoutparams instanceof b);
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
        return new b();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new b(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return a(layoutparams);
    }

    public final void h()
    {
        h h1;
        if (I == null)
        {
            h1 = null;
        } else
        {
            h1 = I.b;
        }
        if (h1 != null)
        {
            h1.collapseActionView();
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
        s();
        return b.c();
    }

    public final g o()
    {
        if (G == null)
        {
            G = new q(this, true);
        }
        return G;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks(M);
    }

    public boolean onHoverEvent(MotionEvent motionevent)
    {
        int i1 = android.support.v4.view.m.a(motionevent);
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
        boolean flag1;
        int i3;
        int j3;
        int i4;
        int j4;
        int k4;
        int l4;
        int i5;
        int k5;
        boolean flag2;
        int j2;
        if (android.support.v4.view.x.h(this) == 1)
        {
            j2 = 1;
        } else
        {
            j2 = 0;
        }
        k4 = getWidth();
        i5 = getHeight();
        i4 = getPaddingLeft();
        l4 = getPaddingRight();
        j3 = getPaddingTop();
        k5 = getPaddingBottom();
        k1 = i4;
        l1 = k4 - l4;
        ai = D;
        ai[1] = 0;
        ai[0] = 0;
        j4 = android.support.v4.view.x.r(this);
        i1 = k1;
        j1 = l1;
        if (a(e))
        {
            if (j2 != 0)
            {
                j1 = b(e, l1, ai, j4);
                i1 = k1;
            } else
            {
                i1 = a(e, i4, ai, j4);
                j1 = l1;
            }
        }
        k1 = i1;
        l1 = j1;
        if (a(i))
        {
            if (j2 != 0)
            {
                l1 = b(i, j1, ai, j4);
                k1 = i1;
            } else
            {
                k1 = a(i, i1, ai, j4);
                l1 = j1;
            }
        }
        j1 = k1;
        i1 = l1;
        if (a(b))
        {
            if (j2 != 0)
            {
                j1 = a(b, k1, ai, j4);
                i1 = l1;
            } else
            {
                i1 = b(b, l1, ai, j4);
                j1 = k1;
            }
        }
        ai[0] = Math.max(0, t.a() - j1);
        ai[1] = Math.max(0, t.b() - (k4 - l4 - i1));
        k1 = Math.max(j1, t.a());
        l1 = Math.min(i1, k4 - l4 - t.b());
        i1 = k1;
        j1 = l1;
        if (a(a))
        {
            if (j2 != 0)
            {
                j1 = b(a, l1, ai, j4);
                i1 = k1;
            } else
            {
                i1 = a(a, k1, ai, j4);
                j1 = l1;
            }
        }
        k1 = i1;
        l1 = j1;
        if (a(f))
        {
            if (j2 != 0)
            {
                l1 = b(f, j1, ai, j4);
                k1 = i1;
            } else
            {
                k1 = a(f, i1, ai, j4);
                l1 = j1;
            }
        }
        flag = a(c);
        flag2 = a(d);
        i1 = 0;
        if (flag)
        {
            b b1 = (b)c.getLayoutParams();
            i1 = b1.topMargin + c.getMeasuredHeight() + b1.bottomMargin + 0;
        }
        i3 = i1;
        if (flag2)
        {
            b b2 = (b)d.getLayoutParams();
            i3 = i1 + (b2.topMargin + d.getMeasuredHeight() + b2.bottomMargin);
        }
        if (flag) goto _L2; else goto _L1
_L1:
        j1 = k1;
        i1 = l1;
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
        obj = (b)((View) (obj)).getLayoutParams();
        obj1 = (b)((View) (obj1)).getLayoutParams();
        if (flag && c.getMeasuredWidth() > 0 || flag2 && d.getMeasuredWidth() > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        u & 0x70;
        JVM INSTR lookupswitch 2: default 576
    //                   48: 1042
    //                   80: 1116;
           goto _L4 _L5 _L6
_L4:
        j1 = (i5 - j3 - k5 - i3) / 2;
        if (j1 < ((b) (obj)).topMargin + r)
        {
            i1 = ((b) (obj)).topMargin + r;
        } else
        {
            i3 = i5 - k5 - i3 - j1 - j3;
            i1 = j1;
            if (i3 < ((b) (obj)).bottomMargin + s)
            {
                i1 = Math.max(0, j1 - ((((b) (obj1)).bottomMargin + s) - i3));
            }
        }
        i1 = j3 + i1;
_L13:
        if (j2 != 0)
        {
            if (flag1)
            {
                j1 = p;
            } else
            {
                j1 = 0;
            }
            j1 -= ai[1];
            l1 -= Math.max(0, j1);
            ai[1] = Math.max(0, -j1);
            i3 = l1;
            j1 = l1;
            j2 = i3;
            j3 = i1;
            if (flag)
            {
                obj = (b)c.getLayoutParams();
                j2 = i3 - c.getMeasuredWidth();
                j3 = i1 + c.getMeasuredHeight();
                c.layout(j2, i1, i3, j3);
                j2 -= q;
                j3 += ((b) (obj)).bottomMargin;
            }
            i3 = j1;
            if (flag2)
            {
                obj = (b)d.getLayoutParams();
                i1 = j3 + ((b) (obj)).topMargin;
                i3 = d.getMeasuredWidth();
                j3 = d.getMeasuredHeight();
                d.layout(j1 - i3, i1, j1, i1 + j3);
                i3 = j1 - q;
                i1 = ((b) (obj)).bottomMargin;
            }
            j1 = k1;
            i1 = l1;
            if (flag1)
            {
                i1 = Math.min(j2, i3);
                j1 = k1;
            }
        } else
        {
            int k2;
            int k3;
            if (flag1)
            {
                j1 = p;
            } else
            {
                j1 = 0;
            }
            k2 = j1 - ai[0];
            j1 = k1 + Math.max(0, k2);
            ai[0] = Math.max(0, -k2);
            i3 = j1;
            k1 = j1;
            k2 = i3;
            k3 = i1;
            if (flag)
            {
                obj = (b)c.getLayoutParams();
                k2 = i3 + c.getMeasuredWidth();
                k3 = i1 + c.getMeasuredHeight();
                c.layout(i3, i1, k2, k3);
                k2 += q;
                k3 += ((b) (obj)).bottomMargin;
            }
            i3 = k1;
            if (flag2)
            {
                obj = (b)d.getLayoutParams();
                i1 = k3 + ((b) (obj)).topMargin;
                i3 = k1 + d.getMeasuredWidth();
                k3 = d.getMeasuredHeight();
                d.layout(k1, i1, i3, i1 + k3);
                i3 += q;
                i1 = ((b) (obj)).bottomMargin;
            }
            i1 = l1;
            if (flag1)
            {
                j1 = Math.max(k2, i3);
                i1 = l1;
            }
        }
_L3:
        int i2;
        a(B, 3);
        l1 = B.size();
        for (k1 = 0; k1 < l1; k1++)
        {
            j1 = a((View)B.get(k1), j1, ai, j4);
        }

        a(B, 5);
        i2 = B.size();
        l1 = 0;
        k1 = i1;
        for (i1 = l1; i1 < i2; i1++)
        {
            k1 = b((View)B.get(i1), k1, ai, j4);
        }

        a(B, 1);
        obj = B;
        int l2 = ai[0];
        i2 = ai[1];
        i1 = 0;
        i3 = ((List) (obj)).size();
        for (l1 = 0; l1 < i3; l1++)
        {
            View view = (View)((List) (obj)).get(l1);
            b b3 = (b)view.getLayoutParams();
            l2 = b3.leftMargin - l2;
            i2 = b3.rightMargin - i2;
            int l3 = Math.max(0, l2);
            int j5 = Math.max(0, i2);
            l2 = Math.max(0, -l2);
            i2 = Math.max(0, -i2);
            i1 += view.getMeasuredWidth() + l3 + j5;
        }

        l1 = (i4 + (k4 - i4 - l4) / 2) - i1 / 2;
        i2 = l1 + i1;
          goto _L7
_L5:
        i1 = getPaddingTop() + ((b) (obj)).topMargin + r;
        continue; /* Loop/switch isn't completed */
_L6:
        i1 = i5 - k5 - ((b) (obj1)).bottomMargin - s - i3;
        continue; /* Loop/switch isn't completed */
_L7:
        if (l1 >= j1) goto _L9; else goto _L8
_L8:
        i1 = j1;
_L11:
        k1 = B.size();
        for (j1 = 0; j1 < k1; j1++)
        {
            i1 = a((View)B.get(j1), i1, ai, j4);
        }

        break; /* Loop/switch isn't completed */
_L9:
        i1 = l1;
        if (i2 > k1)
        {
            i1 = l1 - (i2 - k1);
        }
        if (true) goto _L11; else goto _L10
_L10:
        B.clear();
        return;
        if (true) goto _L13; else goto _L12
_L12:
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1;
        int k2 = 0;
        int j2 = 0;
        int ai[] = D;
        int l1;
        int l2;
        int i3;
        int j3;
        int k3;
        if (android.support.v7.internal.widget.r.a(this))
        {
            j3 = 1;
            i3 = 0;
        } else
        {
            j3 = 0;
            i3 = 1;
        }
        l2 = 0;
        if (a(e))
        {
            a(e, i1, 0, j1, o);
            l2 = e.getMeasuredWidth() + b(e);
            k2 = Math.max(0, e.getMeasuredHeight() + c(e));
            j2 = android.support.v7.internal.widget.r.a(0, android.support.v4.view.x.l(e));
        }
        k1 = j2;
        l1 = k2;
        if (a(i))
        {
            a(i, i1, 0, j1, o);
            l2 = i.getMeasuredWidth() + b(i);
            l1 = Math.max(k2, i.getMeasuredHeight() + c(i));
            k1 = android.support.v7.internal.widget.r.a(j2, android.support.v4.view.x.l(i));
        }
        j2 = t.c();
        k3 = Math.max(j2, l2) + 0;
        ai[j3] = Math.max(0, j2 - l2);
        l2 = 0;
        j2 = k1;
        k2 = l1;
        if (a(b))
        {
            a(b, i1, k3, j1, o);
            l2 = b.getMeasuredWidth() + b(b);
            k2 = Math.max(l1, b.getMeasuredHeight() + c(b));
            j2 = android.support.v7.internal.widget.r.a(k1, android.support.v4.view.x.l(b));
        }
        k1 = t.d();
        j3 = k3 + Math.max(k1, l2);
        ai[i3] = Math.max(0, k1 - l2);
        i3 = j3;
        k1 = j2;
        l1 = k2;
        if (a(a))
        {
            i3 = j3 + a(a, i1, j3, j1, 0, ai);
            l1 = Math.max(k2, a.getMeasuredHeight() + c(a));
            k1 = android.support.v7.internal.widget.r.a(j2, android.support.v4.view.x.l(a));
        }
        j2 = i3;
        k2 = k1;
        l2 = l1;
        if (a(f))
        {
            j2 = i3 + a(f, i1, i3, j1, 0, ai);
            l2 = Math.max(l1, f.getMeasuredHeight() + c(f));
            k2 = android.support.v7.internal.widget.r.a(k1, android.support.v4.view.x.l(f));
        }
        k3 = getChildCount();
        l1 = 0;
        i3 = l2;
        k1 = k2;
        l2 = j2;
        while (l1 < k3) 
        {
            View view1 = getChildAt(l1);
            j3 = l2;
            k2 = k1;
            j2 = i3;
            if (((b)view1.getLayoutParams()).b == 0)
            {
                j3 = l2;
                k2 = k1;
                j2 = i3;
                if (a(view1))
                {
                    j3 = l2 + a(view1, i1, l2, j1, 0, ai);
                    j2 = Math.max(i3, view1.getMeasuredHeight() + c(view1));
                    k2 = android.support.v7.internal.widget.r.a(k1, android.support.v4.view.x.l(view1));
                }
            }
            l1++;
            l2 = j3;
            k1 = k2;
            i3 = j2;
        }
        k2 = 0;
        j2 = 0;
        int l3 = r + s;
        int i4 = p + q;
        l1 = k1;
        if (a(c))
        {
            a(c, i1, l2 + i4, j1, l3, ai);
            k2 = c.getMeasuredWidth() + b(c);
            j2 = c.getMeasuredHeight() + c(c);
            l1 = android.support.v7.internal.widget.r.a(k1, android.support.v4.view.x.l(c));
        }
        j3 = l1;
        k3 = j2;
        k1 = k2;
        if (a(d))
        {
            k1 = Math.max(k2, a(d, i1, l2 + i4, j1, j2 + l3, ai));
            k3 = j2 + (d.getMeasuredHeight() + c(d));
            j3 = android.support.v7.internal.widget.r.a(l1, android.support.v4.view.x.l(d));
        }
        l1 = Math.max(i3, k3);
        i3 = getPaddingLeft();
        k3 = getPaddingRight();
        j2 = getPaddingTop();
        k2 = getPaddingBottom();
        k1 = android.support.v4.view.x.a(Math.max(l2 + k1 + (i3 + k3), getSuggestedMinimumWidth()), i1, 0xff000000 & j3);
        j1 = android.support.v4.view.x.a(Math.max(l1 + (j2 + k2), getSuggestedMinimumHeight()), j1, j3 << 16);
        if (L) goto _L2; else goto _L1
_L1:
        i1 = 0;
_L4:
        if (i1 != 0)
        {
            j1 = 0;
        }
        setMeasuredDimension(k1, j1);
        return;
_L2:
        int i2 = getChildCount();
        i1 = 0;
        do
        {
            if (i1 >= i2)
            {
                break;
            }
            View view = getChildAt(i1);
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
                android.support.v4.view.k.b(parcelable);
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
        boolean flag = true;
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            super.onRtlPropertiesChanged(i1);
        }
        k k1 = t;
        if (i1 != 1)
        {
            flag = false;
        }
        k1.a(flag);
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
        int i1 = android.support.v4.view.m.a(motionevent);
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

    final void p()
    {
        for (int i1 = getChildCount() - 1; i1 >= 0; i1--)
        {
            View view = getChildAt(i1);
            if (((b)view.getLayoutParams()).b != 2 && view != b)
            {
                removeViewAt(i1);
                C.add(view);
            }
        }

    }

    final void q()
    {
        for (int i1 = C.size() - 1; i1 >= 0; i1--)
        {
            addView((View)C.get(i1));
        }

        C.clear();
    }

    public void setCollapsible(boolean flag)
    {
        L = flag;
        requestLayout();
    }

    public void setContentInsetsAbsolute(int i1, int j1)
    {
        t.b(i1, j1);
    }

    public void setContentInsetsRelative(int i1, int j1)
    {
        t.a(i1, j1);
    }

    public void setLogo(int i1)
    {
        setLogo(N.a(i1));
    }

    public void setLogo(Drawable drawable)
    {
        if (drawable == null) goto _L2; else goto _L1
_L1:
        r();
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
            r();
        }
        if (f != null)
        {
            f.setContentDescription(charsequence);
        }
    }

    public void setMenu(f f1, ActionMenuPresenter actionmenupresenter)
    {
        if (f1 != null || b != null)
        {
            t();
            f f2 = b.d();
            if (f2 != f1)
            {
                if (f2 != null)
                {
                    f2.b(H);
                    f2.b(I);
                }
                if (I == null)
                {
                    I = new a((byte)0);
                }
                actionmenupresenter.c(true);
                if (f1 != null)
                {
                    f1.a(actionmenupresenter, j);
                    f1.a(I, j);
                } else
                {
                    actionmenupresenter.a(j, null);
                    I.a(j, null);
                    actionmenupresenter.a(true);
                    I.a(true);
                }
                b.setPopupTheme(k);
                b.setPresenter(actionmenupresenter);
                H = actionmenupresenter;
                return;
            }
        }
    }

    public void setMenuCallbacks(android.support.v7.internal.view.menu.l.a a1, android.support.v7.internal.view.menu.f.a a2)
    {
        J = a1;
        K = a2;
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
            u();
        }
        if (e != null)
        {
            e.setContentDescription(charsequence);
        }
    }

    public void setNavigationIcon(int i1)
    {
        setNavigationIcon(N.a(i1));
    }

    public void setNavigationIcon(Drawable drawable)
    {
        if (drawable == null) goto _L2; else goto _L1
_L1:
        u();
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
        u();
        e.setOnClickListener(onclicklistener);
    }

    public void setOnMenuItemClickListener(c c1)
    {
        E = c1;
    }

    public void setOverflowIcon(Drawable drawable)
    {
        s();
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

    public void setSubtitleTextAppearance(Context context, int i1)
    {
        m = i1;
        if (d != null)
        {
            d.setTextAppearance(context, i1);
        }
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

    public void setTitleTextAppearance(Context context, int i1)
    {
        l = i1;
        if (c != null)
        {
            c.setTextAppearance(context, i1);
        }
    }

    public void setTitleTextColor(int i1)
    {
        x = i1;
        if (c != null)
        {
            c.setTextColor(i1);
        }
    }
}
