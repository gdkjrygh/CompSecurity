// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.internal.view.menu.ActionMenuPresenter;
import android.support.v7.internal.view.menu.ActionMenuView;
import android.support.v7.internal.view.menu.a;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.h;
import android.support.v7.internal.view.menu.l;
import android.support.v7.internal.view.menu.p;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import java.util.List;
import p.c.b;

// Referenced classes of package android.support.v7.internal.widget:
//            a, ActionBarContainer, ProgressBarICS, d, 
//            ScrollingTabContainerView, ActionBarContextView, c

public class ActionBarView extends android.support.v7.internal.widget.a
{
    private static class HomeView extends FrameLayout
    {

        private ImageView a;
        private ImageView b;
        private int c;
        private int d;
        private Drawable e;

        public int a()
        {
            if (a.getVisibility() == 8)
            {
                return c;
            } else
            {
                return 0;
            }
        }

        public void a(int i1)
        {
            d = i1;
            ImageView imageview = a;
            Drawable drawable;
            if (i1 != 0)
            {
                drawable = getResources().getDrawable(i1);
            } else
            {
                drawable = e;
            }
            imageview.setImageDrawable(drawable);
        }

        public void a(Drawable drawable)
        {
            b.setImageDrawable(drawable);
        }

        public void a(boolean flag)
        {
            ImageView imageview = a;
            int i1;
            if (flag)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            imageview.setVisibility(i1);
        }

        public void b(Drawable drawable)
        {
            ImageView imageview = a;
            if (drawable == null)
            {
                drawable = e;
            }
            imageview.setImageDrawable(drawable);
            d = 0;
        }

        public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
        {
            CharSequence charsequence = getContentDescription();
            if (!TextUtils.isEmpty(charsequence))
            {
                accessibilityevent.getText().add(charsequence);
            }
            return true;
        }

        protected void onConfigurationChanged(Configuration configuration)
        {
            super.onConfigurationChanged(configuration);
            if (d != 0)
            {
                a(d);
            }
        }

        protected void onFinishInflate()
        {
            a = (ImageView)findViewById(android.support.v7.appcompat.R.id.up);
            b = (ImageView)findViewById(android.support.v7.appcompat.R.id.home);
            e = a.getDrawable();
        }

        protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
        {
            int i2 = 0;
            int j2 = (l1 - j1) / 2;
            j1 = i2;
            l1 = i1;
            if (a.getVisibility() != 8)
            {
                android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)a.getLayoutParams();
                l1 = a.getMeasuredHeight();
                j1 = a.getMeasuredWidth();
                i2 = j2 - l1 / 2;
                a.layout(0, i2, j1, l1 + i2);
                l1 = layoutparams.leftMargin;
                j1 = layoutparams.rightMargin + (l1 + j1);
                l1 = i1 + j1;
            }
            android.widget.FrameLayout.LayoutParams layoutparams1 = (android.widget.FrameLayout.LayoutParams)b.getLayoutParams();
            i1 = b.getMeasuredHeight();
            i2 = b.getMeasuredWidth();
            k1 = (k1 - l1) / 2;
            j1 += Math.max(layoutparams1.leftMargin, k1 - i2 / 2);
            k1 = Math.max(layoutparams1.topMargin, j2 - i1 / 2);
            b.layout(j1, k1, i2 + j1, i1 + k1);
        }

        protected void onMeasure(int i1, int j1)
        {
            int k1;
            int l1;
            int i2;
            int j2;
            measureChildWithMargins(a, i1, 0, j1, 0);
            android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)a.getLayoutParams();
            c = layoutparams.leftMargin + a.getMeasuredWidth() + layoutparams.rightMargin;
            int k2;
            int l2;
            if (a.getVisibility() == 8)
            {
                k1 = 0;
            } else
            {
                k1 = c;
            }
            l1 = layoutparams.topMargin;
            i2 = a.getMeasuredHeight();
            j2 = layoutparams.bottomMargin;
            measureChildWithMargins(b, i1, k1, j1, 0);
            layoutparams = (android.widget.FrameLayout.LayoutParams)b.getLayoutParams();
            k1 += layoutparams.leftMargin + b.getMeasuredWidth() + layoutparams.rightMargin;
            k2 = layoutparams.topMargin;
            l2 = b.getMeasuredHeight();
            l1 = Math.max(l1 + i2 + j2, layoutparams.bottomMargin + (k2 + l2));
            l2 = android.view.View.MeasureSpec.getMode(i1);
            k2 = android.view.View.MeasureSpec.getMode(j1);
            j2 = android.view.View.MeasureSpec.getSize(i1);
            i2 = android.view.View.MeasureSpec.getSize(j1);
            i1 = j2;
            l2;
            JVM INSTR lookupswitch 2: default 220
        //                       -2147483648: 275
        //                       1073741824: 223;
               goto _L1 _L2 _L3
_L3:
            break; /* Loop/switch isn't completed */
_L1:
            i1 = k1;
_L4:
            j1 = i2;
            switch (k2)
            {
            default:
                j1 = l1;
                break;

            case -2147483648: 
                break MISSING_BLOCK_LABEL_286;

            case 1073741824: 
                break;
            }
_L5:
            setMeasuredDimension(i1, j1);
            return;
_L2:
            i1 = Math.min(k1, j2);
              goto _L4
            j1 = Math.min(l1, i2);
              goto _L5
        }

        public HomeView(Context context)
        {
            this(context, null);
        }

        public HomeView(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
        }
    }

    static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState a(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public SavedState[] a(int i1)
            {
                return new SavedState[i1];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int i1)
            {
                return a(i1);
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


        private SavedState(Parcel parcel)
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


        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

    private class a
        implements l
    {

        f a;
        h b;
        final ActionBarView c;

        public void a(Context context, f f1)
        {
            if (a != null && b != null)
            {
                a.d(b);
            }
            a = f1;
        }

        public void a(f f1, boolean flag)
        {
        }

        public boolean a(f f1, h h1)
        {
            c.g = h1.getActionView();
            ActionBarView.e(c).a(ActionBarView.d(c).getConstantState().newDrawable(c.getResources()));
            b = h1;
            if (c.g.getParent() != c)
            {
                c.addView(c.g);
            }
            if (ActionBarView.e(c).getParent() != c)
            {
                c.addView(ActionBarView.e(c));
            }
            android.support.v7.internal.widget.ActionBarView.f(c).setVisibility(8);
            if (ActionBarView.g(c) != null)
            {
                ActionBarView.g(c).setVisibility(8);
            }
            if (android.support.v7.internal.widget.ActionBarView.h(c) != null)
            {
                android.support.v7.internal.widget.ActionBarView.h(c).setVisibility(8);
            }
            if (ActionBarView.i(c) != null)
            {
                ActionBarView.i(c).setVisibility(8);
            }
            if (ActionBarView.j(c) != null)
            {
                ActionBarView.j(c).setVisibility(8);
            }
            c.requestLayout();
            h1.e(true);
            if (c.g instanceof p.h.b)
            {
                ((p.h.b)c.g).a();
            }
            return true;
        }

        public boolean a(p p1)
        {
            return false;
        }

        public boolean b(f f1, h h1)
        {
            if (c.g instanceof p.h.b)
            {
                ((p.h.b)c.g).b();
            }
            c.removeView(c.g);
            c.removeView(ActionBarView.e(c));
            c.g = null;
            if ((ActionBarView.k(c) & 2) != 0)
            {
                android.support.v7.internal.widget.ActionBarView.f(c).setVisibility(0);
            }
            if ((ActionBarView.k(c) & 8) != 0)
            {
                if (ActionBarView.g(c) == null)
                {
                    android.support.v7.internal.widget.ActionBarView.l(c);
                } else
                {
                    ActionBarView.g(c).setVisibility(0);
                }
            }
            if (android.support.v7.internal.widget.ActionBarView.h(c) != null && ActionBarView.m(c) == 2)
            {
                android.support.v7.internal.widget.ActionBarView.h(c).setVisibility(0);
            }
            if (ActionBarView.i(c) != null && ActionBarView.m(c) == 1)
            {
                ActionBarView.i(c).setVisibility(0);
            }
            if (ActionBarView.j(c) != null && (ActionBarView.k(c) & 0x10) != 0)
            {
                ActionBarView.j(c).setVisibility(0);
            }
            ActionBarView.e(c).a(null);
            b = null;
            c.requestLayout();
            h1.e(false);
            return true;
        }

        public void c(boolean flag)
        {
            if (b == null) goto _L2; else goto _L1
_L1:
            int i1;
            int j1;
            if (a == null)
            {
                break MISSING_BLOCK_LABEL_74;
            }
            j1 = a.size();
            i1 = 0;
_L5:
            if (i1 >= j1)
            {
                break MISSING_BLOCK_LABEL_74;
            }
            if ((b)a.getItem(i1) != b) goto _L4; else goto _L3
_L3:
            i1 = 1;
_L6:
            if (i1 == 0)
            {
                b(a, b);
            }
_L2:
            return;
_L4:
            i1++;
              goto _L5
            i1 = 0;
              goto _L6
        }

        public boolean g()
        {
            return false;
        }

        private a()
        {
            c = ActionBarView.this;
            super();
        }

    }


    private ProgressBarICS A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private f L;
    private ActionBarContextView M;
    private android.support.v7.internal.view.menu.a N;
    private SpinnerAdapter O;
    private android.support.v7.app.ActionBar.b P;
    private Runnable Q;
    private a R;
    private final c.d S = new c.d() {

        final ActionBarView a;

        public void a(c c1)
        {
        }

        public void a(c c1, View view, int j1, long l1)
        {
            if (android.support.v7.internal.widget.ActionBarView.a(a) != null)
            {
                android.support.v7.internal.widget.ActionBarView.a(a).a(j1, l1);
            }
        }

            
            {
                a = ActionBarView.this;
                super();
            }
    };
    private final android.view.View.OnClickListener T = new android.view.View.OnClickListener() {

        final ActionBarView a;

        public void onClick(View view)
        {
            view = android.support.v7.internal.widget.ActionBarView.b(a).b;
            if (view != null)
            {
                view.collapseActionView();
            }
        }

            
            {
                a = ActionBarView.this;
                super();
            }
    };
    private final android.view.View.OnClickListener U = new android.view.View.OnClickListener() {

        final ActionBarView a;

        public void onClick(View view)
        {
            a.h.onMenuItemSelected(0, ActionBarView.c(a));
        }

            
            {
                a = ActionBarView.this;
                super();
            }
    };
    View g;
    android.view.Window.Callback h;
    private int i;
    private int j;
    private CharSequence k;
    private CharSequence l;
    private Drawable m;
    private Drawable n;
    private Context o;
    private HomeView p;
    private HomeView q;
    private LinearLayout r;
    private TextView s;
    private TextView t;
    private View u;
    private d v;
    private LinearLayout w;
    private ScrollingTabContainerView x;
    private View y;
    private ProgressBarICS z;

    public ActionBarView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        j = -1;
        o = context;
        setBackgroundResource(0);
        attributeset = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ActionBar, android.support.v7.appcompat.R.attr.actionBarStyle, 0);
        Object obj = context.getApplicationInfo();
        PackageManager packagemanager = context.getPackageManager();
        i = attributeset.getInt(2, 0);
        k = attributeset.getText(1);
        l = attributeset.getText(4);
        n = attributeset.getDrawable(8);
        if (n == null && android.os.Build.VERSION.SDK_INT >= 9)
        {
            int i1;
            if (context instanceof Activity)
            {
                try
                {
                    n = packagemanager.getActivityLogo(((Activity)context).getComponentName());
                }
                catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
                {
                    Log.e("ActionBarView", "Activity component name not found!", namenotfoundexception);
                }
            }
            if (n == null)
            {
                n = ((ApplicationInfo) (obj)).loadLogo(packagemanager);
            }
        }
        m = attributeset.getDrawable(7);
        if (m == null)
        {
            if (context instanceof Activity)
            {
                try
                {
                    m = packagemanager.getActivityIcon(((Activity)context).getComponentName());
                }
                catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception1)
                {
                    Log.e("ActionBarView", "Activity component name not found!", namenotfoundexception1);
                }
            }
            if (m == null)
            {
                m = ((ApplicationInfo) (obj)).loadIcon(packagemanager);
            }
        }
        obj = LayoutInflater.from(context);
        i1 = attributeset.getResourceId(14, android.support.v7.appcompat.R.layout.abc_action_bar_home);
        p = (HomeView)((LayoutInflater) (obj)).inflate(i1, this, false);
        q = (HomeView)((LayoutInflater) (obj)).inflate(i1, this, false);
        q.a(true);
        q.setOnClickListener(T);
        q.setContentDescription(getResources().getText(android.support.v7.appcompat.R.string.abc_action_bar_up_description));
        D = attributeset.getResourceId(5, 0);
        E = attributeset.getResourceId(6, 0);
        F = attributeset.getResourceId(15, 0);
        G = attributeset.getResourceId(16, 0);
        B = attributeset.getDimensionPixelOffset(17, 0);
        C = attributeset.getDimensionPixelOffset(18, 0);
        setDisplayOptions(attributeset.getInt(3, 0));
        i1 = attributeset.getResourceId(13, 0);
        if (i1 != 0)
        {
            y = ((LayoutInflater) (obj)).inflate(i1, this, false);
            i = 0;
            setDisplayOptions(j | 0x10);
        }
        f = attributeset.getLayoutDimension(0, 0);
        attributeset.recycle();
        N = new android.support.v7.internal.view.menu.a(context, 0, 0x102002c, 0, 0, k);
        p.setOnClickListener(U);
        p.setClickable(true);
        p.setFocusable(true);
    }

    static android.support.v7.app.ActionBar.b a(ActionBarView actionbarview)
    {
        return actionbarview.P;
    }

    private void a(f f1)
    {
        if (f1 != null)
        {
            f1.a(b);
            f1.a(R);
        } else
        {
            b.a(o, null);
            R.a(o, null);
        }
        b.c(true);
        R.c(true);
    }

    static a b(ActionBarView actionbarview)
    {
        return actionbarview.R;
    }

    static android.support.v7.internal.view.menu.a c(ActionBarView actionbarview)
    {
        return actionbarview.N;
    }

    static Drawable d(ActionBarView actionbarview)
    {
        return actionbarview.m;
    }

    static HomeView e(ActionBarView actionbarview)
    {
        return actionbarview.q;
    }

    static HomeView f(ActionBarView actionbarview)
    {
        return actionbarview.p;
    }

    static LinearLayout g(ActionBarView actionbarview)
    {
        return actionbarview.r;
    }

    static ScrollingTabContainerView h(ActionBarView actionbarview)
    {
        return actionbarview.x;
    }

    static d i(ActionBarView actionbarview)
    {
        return actionbarview.v;
    }

    static View j(ActionBarView actionbarview)
    {
        return actionbarview.y;
    }

    static int k(ActionBarView actionbarview)
    {
        return actionbarview.j;
    }

    static void l(ActionBarView actionbarview)
    {
        actionbarview.m();
    }

    static int m(ActionBarView actionbarview)
    {
        return actionbarview.i;
    }

    private void m()
    {
        boolean flag2 = true;
        if (r == null)
        {
            r = (LinearLayout)LayoutInflater.from(getContext()).inflate(android.support.v7.appcompat.R.layout.abc_action_bar_title_item, this, false);
            s = (TextView)r.findViewById(android.support.v7.appcompat.R.id.action_bar_title);
            t = (TextView)r.findViewById(android.support.v7.appcompat.R.id.action_bar_subtitle);
            u = r.findViewById(android.support.v7.appcompat.R.id.up);
            r.setOnClickListener(U);
            if (D != 0)
            {
                s.setTextAppearance(o, D);
            }
            if (k != null)
            {
                s.setText(k);
            }
            if (E != 0)
            {
                t.setTextAppearance(o, E);
            }
            if (l != null)
            {
                t.setText(l);
                t.setVisibility(0);
            }
            Object obj;
            int i1;
            boolean flag;
            boolean flag1;
            if ((j & 4) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if ((j & 2) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            obj = u;
            if (!flag1)
            {
                if (flag)
                {
                    i1 = 0;
                } else
                {
                    i1 = 4;
                }
            } else
            {
                i1 = 8;
            }
            ((View) (obj)).setVisibility(i1);
            obj = r;
            if (!flag || flag1)
            {
                flag2 = false;
            }
            ((LinearLayout) (obj)).setEnabled(flag2);
        }
        addView(r);
        if (g != null || TextUtils.isEmpty(k) && TextUtils.isEmpty(l))
        {
            r.setVisibility(8);
        }
    }

    private void setTitleImpl(CharSequence charsequence)
    {
        boolean flag = false;
        k = charsequence;
        if (s != null)
        {
            s.setText(charsequence);
            LinearLayout linearlayout;
            int i1;
            if (g == null && (j & 8) != 0 && (!TextUtils.isEmpty(k) || !TextUtils.isEmpty(l)))
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            linearlayout = r;
            if (i1 != 0)
            {
                i1 = ((flag) ? 1 : 0);
            } else
            {
                i1 = 8;
            }
            linearlayout.setVisibility(i1);
        }
        if (N != null)
        {
            N.setTitle(charsequence);
        }
    }

    public void a(p.c.a a1, android.support.v7.internal.view.menu.l.a a2)
    {
        if (a1 == L)
        {
            return;
        }
        if (L != null)
        {
            L.b(b);
            L.b(R);
        }
        Object obj = (f)a1;
        L = ((f) (obj));
        if (a != null)
        {
            a1 = (ViewGroup)a.getParent();
            if (a1 != null)
            {
                a1.removeView(a);
            }
        }
        if (b == null)
        {
            b = new ActionMenuPresenter(o);
            b.a(a2);
            b.b(android.support.v7.appcompat.R.id.action_menu_presenter);
            R = new a();
        }
        a2 = new android.view.ViewGroup.LayoutParams(-2, -1);
        if (!d)
        {
            b.b(getResources().getBoolean(android.support.v7.appcompat.R.bool.abc_action_bar_expanded_action_views_exclusive));
            a(((f) (obj)));
            a1 = (ActionMenuView)b.a(this);
            a1.a(((f) (obj)));
            obj = (ViewGroup)a1.getParent();
            if (obj != null && obj != this)
            {
                ((ViewGroup) (obj)).removeView(a1);
            }
            addView(a1, a2);
        } else
        {
            b.b(false);
            b.a(getContext().getResources().getDisplayMetrics().widthPixels, true);
            b.a(0x7fffffff);
            a2.width = -1;
            a(((f) (obj)));
            a1 = (ActionMenuView)b.a(this);
            if (c != null)
            {
                ViewGroup viewgroup = (ViewGroup)a1.getParent();
                if (viewgroup != null && viewgroup != c)
                {
                    viewgroup.removeView(a1);
                }
                a1.setVisibility(getAnimatedVisibility());
                c.addView(a1, a2);
            } else
            {
                a1.setLayoutParams(a2);
            }
        }
        a = a1;
    }

    public volatile boolean a()
    {
        return super.a();
    }

    public volatile void b()
    {
        super.b();
    }

    public volatile boolean c()
    {
        return super.c();
    }

    public volatile boolean d()
    {
        return super.d();
    }

    public volatile boolean e()
    {
        return super.e();
    }

    public volatile void f()
    {
        super.f();
    }

    public void g()
    {
        z = new ProgressBarICS(o, null, 0, F);
        z.setId(android.support.v7.appcompat.R.id.progress_horizontal);
        z.setMax(10000);
        z.setVisibility(8);
        addView(z);
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new android.support.v7.app.ActionBar.LayoutParams(19);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new android.support.v7.app.ActionBar.LayoutParams(getContext(), attributeset);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        android.view.ViewGroup.LayoutParams layoutparams1 = layoutparams;
        if (layoutparams == null)
        {
            layoutparams1 = generateDefaultLayoutParams();
        }
        return layoutparams1;
    }

    public volatile int getAnimatedVisibility()
    {
        return super.getAnimatedVisibility();
    }

    public volatile int getContentHeight()
    {
        return super.getContentHeight();
    }

    public View getCustomNavigationView()
    {
        return y;
    }

    public int getDisplayOptions()
    {
        return j;
    }

    public SpinnerAdapter getDropdownAdapter()
    {
        return O;
    }

    public int getDropdownSelectedPosition()
    {
        return v.f();
    }

    public int getNavigationMode()
    {
        return i;
    }

    public CharSequence getSubtitle()
    {
        return l;
    }

    public CharSequence getTitle()
    {
        return k;
    }

    public void h()
    {
        A = new ProgressBarICS(o, null, 0, G);
        A.setId(android.support.v7.appcompat.R.id.progress_circular);
        A.setVisibility(8);
        addView(A);
    }

    public boolean i()
    {
        return d;
    }

    public boolean j()
    {
        return R != null && R.b != null;
    }

    public void k()
    {
        h h1;
        if (R == null)
        {
            h1 = null;
        } else
        {
            h1 = R.b;
        }
        if (h1 != null)
        {
            h1.collapseActionView();
        }
    }

    public boolean l()
    {
        return K;
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        s = null;
        t = null;
        u = null;
        if (r != null && r.getParent() == this)
        {
            removeView(r);
        }
        r = null;
        if ((j & 8) != 0)
        {
            m();
        }
        if (x != null && I)
        {
            configuration = x.getLayoutParams();
            if (configuration != null)
            {
                configuration.width = -2;
                configuration.height = -1;
            }
            x.setAllowCollapse(true);
        }
        if (z != null)
        {
            removeView(z);
            g();
        }
        if (A != null)
        {
            removeView(A);
            h();
        }
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks(Q);
        if (b != null)
        {
            b.b();
            b.d();
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        addView(p);
        if (y != null && (j & 0x10) != 0)
        {
            android.view.ViewParent viewparent = y.getParent();
            if (viewparent != this)
            {
                if (viewparent instanceof ViewGroup)
                {
                    ((ViewGroup)viewparent).removeView(y);
                }
                addView(y);
            }
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int i2;
        int k2;
        int l2;
        i2 = getPaddingLeft();
        k2 = getPaddingTop();
        l2 = l1 - j1 - getPaddingTop() - getPaddingBottom();
        if (l2 > 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        Object obj1;
        int j2;
        if (g != null)
        {
            obj = q;
        } else
        {
            obj = p;
        }
        if (((HomeView) (obj)).getVisibility() != 8)
        {
            j1 = ((HomeView) (obj)).a();
            l1 = b(((View) (obj)), i2 + j1, k2, l2) + j1 + i2;
        } else
        {
            l1 = i2;
        }
        i2 = l1;
        if (g != null) goto _L4; else goto _L3
_L3:
        if (r != null && r.getVisibility() != 8 && (j & 8) != 0)
        {
            j2 = 1;
        } else
        {
            j2 = 0;
        }
        j1 = l1;
        if (j2 != 0)
        {
            j1 = l1 + b(r, l1, k2, l2);
        }
        i;
        JVM INSTR tableswitch 0 2: default 184
    //                   0 614
    //                   1 617
    //                   2 669;
           goto _L5 _L6 _L7 _L8
_L5:
        i2 = j1;
_L4:
        j1 = i2;
_L6:
        k1 = k1 - i1 - getPaddingRight();
        i1 = k1;
        if (a != null)
        {
            i1 = k1;
            if (a.getParent() == this)
            {
                c(a, k1, k2, l2);
                i1 = k1 - a.getMeasuredWidth();
            }
        }
        if (A != null && A.getVisibility() != 8)
        {
            c(A, i1, k2, l2);
            i1 -= A.getMeasuredWidth();
        }
        if (g != null)
        {
            obj = g;
        } else
        if ((j & 0x10) != 0 && y != null)
        {
            obj = y;
        } else
        {
            obj = null;
        }
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = ((View) (obj)).getLayoutParams();
        if (obj1 instanceof android.support.v7.app.ActionBar.LayoutParams)
        {
            obj1 = (android.support.v7.app.ActionBar.LayoutParams)obj1;
        } else
        {
            obj1 = null;
        }
        if (obj1 != null)
        {
            k1 = ((android.support.v7.app.ActionBar.LayoutParams) (obj1)).a;
        } else
        {
            k1 = 19;
        }
        k2 = ((View) (obj)).getMeasuredWidth();
        if (obj1 != null)
        {
            l2 = ((android.support.v7.app.ActionBar.LayoutParams) (obj1)).leftMargin;
            j2 = ((android.support.v7.app.ActionBar.LayoutParams) (obj1)).rightMargin;
            i2 = ((android.support.v7.app.ActionBar.LayoutParams) (obj1)).topMargin;
            l1 = ((android.support.v7.app.ActionBar.LayoutParams) (obj1)).bottomMargin;
            j2 = i1 - j2;
            j1 += l2;
        } else
        {
            i2 = 0;
            l1 = 0;
            j2 = i1;
        }
        i1 = k1 & 7;
        if (i1 == 1)
        {
            l2 = (getWidth() - k2) / 2;
            if (l2 < j1)
            {
                i1 = 3;
            } else
            if (l2 + k2 > j2)
            {
                i1 = 5;
            }
        } else
        if (k1 == -1)
        {
            i1 = 3;
        }
        i1;
        JVM INSTR tableswitch 1 5: default 464
    //                   1 786
    //                   2 464
    //                   3 799
    //                   4 464
    //                   5 804;
           goto _L9 _L10 _L9 _L11 _L9 _L12
_L9:
        i1 = 0;
_L20:
        j1 = k1 & 0x70;
        if (k1 == -1)
        {
            j1 = 16;
        }
        k1 = 0;
        j1;
        JVM INSTR lookupswitch 3: default 520
    //                   16: 813
    //                   48: 841
    //                   80: 852;
           goto _L13 _L14 _L15 _L16
_L16:
        break MISSING_BLOCK_LABEL_852;
_L13:
        j1 = k1;
_L21:
        k1 = ((View) (obj)).getMeasuredWidth();
        ((View) (obj)).layout(i1, j1, i1 + k1, ((View) (obj)).getMeasuredHeight() + j1);
        if (z == null) goto _L1; else goto _L17
_L17:
        z.bringToFront();
        i1 = z.getMeasuredHeight() / 2;
        z.layout(B, -i1, B + z.getMeasuredWidth(), i1);
        return;
_L7:
        i2 = j1;
        if (w == null) goto _L4; else goto _L18
_L18:
        l1 = j1;
        if (j2 != 0)
        {
            l1 = j1 + C;
        }
        j1 = l1 + (b(w, l1, k2, l2) + C);
          goto _L6
_L8:
        i2 = j1;
        if (x == null) goto _L4; else goto _L19
_L19:
        l1 = j1;
        if (j2 != 0)
        {
            l1 = j1 + C;
        }
        j1 = l1 + (b(x, l1, k2, l2) + C);
          goto _L6
_L10:
        i1 = (getWidth() - k2) / 2;
          goto _L20
_L11:
        i1 = j1;
          goto _L20
_L12:
        i1 = j2 - k2;
          goto _L20
_L14:
        j1 = getPaddingTop();
        j1 = (getHeight() - getPaddingBottom() - j1 - ((View) (obj)).getMeasuredHeight()) / 2;
          goto _L21
_L15:
        j1 = getPaddingTop() + i2;
          goto _L21
        j1 = getHeight() - getPaddingBottom() - ((View) (obj)).getMeasuredHeight() - l1;
          goto _L21
    }

    protected void onMeasure(int i1, int j1)
    {
        int j4 = getChildCount();
        if (!J) goto _L2; else goto _L1
_L1:
        int i2;
        i2 = 0;
        for (int k1 = 0; k1 < j4;)
        {
            int k2;
label0:
            {
                View view = getChildAt(k1);
                k2 = i2;
                if (view.getVisibility() == 8)
                {
                    break label0;
                }
                if (view == a)
                {
                    k2 = i2;
                    if (a.getChildCount() == 0)
                    {
                        break label0;
                    }
                }
                k2 = i2 + 1;
            }
            k1++;
            i2 = k2;
        }

        if (i2 != 0) goto _L2; else goto _L3
_L3:
        setMeasuredDimension(0, 0);
        K = true;
_L12:
        return;
_L2:
        K = false;
        if (android.view.View.MeasureSpec.getMode(i1) != 0x40000000)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(" can only be used ").append("with android:layout_width=\"MATCH_PARENT\" (or fill_parent)").toString());
        }
        if (android.view.View.MeasureSpec.getMode(j1) != 0x80000000)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(" can only be used ").append("with android:layout_height=\"wrap_content\"").toString());
        }
        int k4 = android.view.View.MeasureSpec.getSize(i1);
        Object obj;
        Object obj1;
        android.view.ViewGroup.LayoutParams layoutparams;
        int l1;
        boolean flag;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int l4;
        if (f > 0)
        {
            l2 = f;
        } else
        {
            l2 = android.view.View.MeasureSpec.getSize(j1);
        }
        l4 = getPaddingTop() + getPaddingBottom();
        i1 = getPaddingLeft();
        j1 = getPaddingRight();
        i4 = l2 - l4;
        j3 = android.view.View.MeasureSpec.makeMeasureSpec(i4, 0x80000000);
        j1 = k4 - i1 - j1;
        i3 = j1 / 2;
        if (g != null)
        {
            obj = q;
        } else
        {
            obj = p;
        }
        if (((HomeView) (obj)).getVisibility() != 8)
        {
            obj1 = ((HomeView) (obj)).getLayoutParams();
            int j2;
            int i5;
            if (((android.view.ViewGroup.LayoutParams) (obj1)).width < 0)
            {
                i1 = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x80000000);
            } else
            {
                i1 = android.view.View.MeasureSpec.makeMeasureSpec(((android.view.ViewGroup.LayoutParams) (obj1)).width, 0x40000000);
            }
            ((HomeView) (obj)).measure(i1, android.view.View.MeasureSpec.makeMeasureSpec(i4, 0x40000000));
            i1 = ((HomeView) (obj)).getMeasuredWidth();
            i1 = ((HomeView) (obj)).a() + i1;
            j1 = Math.max(0, j1 - i1);
            i1 = Math.max(0, j1 - i1);
        } else
        {
            i1 = i3;
        }
        j2 = j1;
        l1 = i3;
        if (a != null)
        {
            j2 = j1;
            l1 = i3;
            if (a.getParent() == this)
            {
                j2 = a(a, j1, j3, 0);
                l1 = Math.max(0, i3 - a.getMeasuredWidth());
            }
        }
        j1 = j2;
        i3 = l1;
        if (A != null)
        {
            j1 = j2;
            i3 = l1;
            if (A.getVisibility() != 8)
            {
                j1 = a(A, j2, j3, 0);
                i3 = Math.max(0, l1 - A.getMeasuredWidth());
            }
        }
        if (r != null && r.getVisibility() != 8 && (j & 8) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (g != null) goto _L5; else goto _L4
_L4:
        i;
        JVM INSTR tableswitch 1 2: default 552
    //                   1 938
    //                   2 1039;
           goto _L5 _L6 _L7
_L5:
        l1 = i1;
        i1 = j1;
        j1 = l1;
          goto _L8
_L6:
        if (w == null) goto _L5; else goto _L9
_L9:
        if (flag)
        {
            l1 = C * 2;
        } else
        {
            l1 = C;
        }
        j1 = Math.max(0, j1 - l1);
        l1 = Math.max(0, i1 - l1);
        w.measure(android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x80000000), android.view.View.MeasureSpec.makeMeasureSpec(i4, 0x40000000));
        j3 = w.getMeasuredWidth();
        i1 = Math.max(0, j1 - j3);
        j1 = Math.max(0, l1 - j3);
          goto _L8
_L7:
        if (x == null) goto _L5; else goto _L10
_L10:
        if (flag)
        {
            l1 = C * 2;
        } else
        {
            l1 = C;
        }
        j1 = Math.max(0, j1 - l1);
        l1 = Math.max(0, i1 - l1);
        x.measure(android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x80000000), android.view.View.MeasureSpec.makeMeasureSpec(i4, 0x40000000));
        j3 = x.getMeasuredWidth();
        i1 = Math.max(0, j1 - j3);
        j1 = Math.max(0, l1 - j3);
_L8:
        if (g != null)
        {
            obj = g;
        } else
        if ((j & 0x10) != 0 && y != null)
        {
            obj = y;
        } else
        {
            obj = null;
        }
        l1 = i1;
        if (obj != null)
        {
            layoutparams = generateLayoutParams(((View) (obj)).getLayoutParams());
            if (layoutparams instanceof android.support.v7.app.ActionBar.LayoutParams)
            {
                obj1 = (android.support.v7.app.ActionBar.LayoutParams)layoutparams;
            } else
            {
                obj1 = null;
            }
            j3 = 0;
            k3 = 0;
            if (obj1 != null)
            {
                l1 = ((android.support.v7.app.ActionBar.LayoutParams) (obj1)).leftMargin;
                j3 = ((android.support.v7.app.ActionBar.LayoutParams) (obj1)).rightMargin + l1;
                k3 = ((android.support.v7.app.ActionBar.LayoutParams) (obj1)).topMargin + ((android.support.v7.app.ActionBar.LayoutParams) (obj1)).bottomMargin;
            }
            if (f <= 0)
            {
                l1 = 0x80000000;
            } else
            if (layoutparams.height != -2)
            {
                l1 = 0x40000000;
            } else
            {
                l1 = 0x80000000;
            }
            l3 = i4;
            if (layoutparams.height >= 0)
            {
                l3 = Math.min(layoutparams.height, i4);
            }
            i5 = Math.max(0, l3 - k3);
            if (layoutparams.width != -2)
            {
                k3 = 0x40000000;
            } else
            {
                k3 = 0x80000000;
            }
            if (layoutparams.width >= 0)
            {
                l3 = Math.min(layoutparams.width, i1);
            } else
            {
                l3 = i1;
            }
            i4 = Math.max(0, l3 - j3);
            if (obj1 != null)
            {
                l3 = ((android.support.v7.app.ActionBar.LayoutParams) (obj1)).a;
            } else
            {
                l3 = 19;
            }
            if ((l3 & 7) == 1 && layoutparams.width == -1)
            {
                i3 = Math.min(j1, i3) * 2;
            } else
            {
                i3 = i4;
            }
            ((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec(i3, k3), android.view.View.MeasureSpec.makeMeasureSpec(i5, l1));
            l1 = i1 - (((View) (obj)).getMeasuredWidth() + j3);
        }
        if (g == null && flag)
        {
            a(r, l1, android.view.View.MeasureSpec.makeMeasureSpec(f, 0x40000000), 0);
            Math.max(0, j1 - r.getMeasuredWidth());
        }
        if (f > 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = 0;
        for (j1 = 0; j1 < j4; j1++)
        {
            l1 = getChildAt(j1).getMeasuredHeight() + l4;
            if (l1 > i1)
            {
                i1 = l1;
            }
        }

        setMeasuredDimension(k4, i1);
_L13:
        if (M != null)
        {
            M.setContentHeight(getMeasuredHeight());
        }
        if (z != null && z.getVisibility() != 8)
        {
            z.measure(android.view.View.MeasureSpec.makeMeasureSpec(k4 - B * 2, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0x80000000));
            return;
        }
        if (true) goto _L12; else goto _L11
_L11:
        setMeasuredDimension(k4, l2);
          goto _L13
        if (true) goto _L12; else goto _L14
_L14:
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((SavedState) (parcelable)).a != 0 && R != null && L != null)
        {
            b b1 = (b)L.findItem(((SavedState) (parcelable)).a);
            if (b1 != null)
            {
                b1.expandActionView();
            }
        }
        if (((SavedState) (parcelable)).b)
        {
            b();
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        if (R != null && R.b != null)
        {
            savedstate.a = R.b.getItemId();
        }
        savedstate.b = d();
        return savedstate;
    }

    public void setCallback(android.support.v7.app.ActionBar.b b1)
    {
        P = b1;
    }

    public void setCollapsable(boolean flag)
    {
        J = flag;
    }

    public volatile void setContentHeight(int i1)
    {
        super.setContentHeight(i1);
    }

    public void setContextView(ActionBarContextView actionbarcontextview)
    {
        M = actionbarcontextview;
    }

    public void setCustomNavigationView(View view)
    {
        boolean flag;
        if ((j & 0x10) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (y != null && flag)
        {
            removeView(y);
        }
        y = view;
        if (y != null && flag)
        {
            addView(y);
        }
    }

    public void setDisplayOptions(int i1)
    {
        byte byte0 = 8;
        int k1 = -1;
        boolean flag3 = true;
        if (j != -1)
        {
            k1 = j ^ i1;
        }
        j = i1;
        if ((k1 & 0x1f) != 0)
        {
            int j1;
            boolean flag;
            boolean flag2;
            if ((i1 & 2) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && g == null)
            {
                j1 = 0;
            } else
            {
                j1 = 8;
            }
            p.setVisibility(j1);
            if ((k1 & 4) != 0)
            {
                HomeView homeview;
                if ((i1 & 4) != 0)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                p.a(flag2);
                if (flag2)
                {
                    setHomeButtonEnabled(true);
                }
            }
            if ((k1 & 1) != 0)
            {
                Object obj;
                if (n != null && (i1 & 1) != 0)
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
                homeview = p;
                if (j1 != 0)
                {
                    obj = n;
                } else
                {
                    obj = m;
                }
                homeview.a(((Drawable) (obj)));
            }
            if ((k1 & 8) != 0)
            {
                if ((i1 & 8) != 0)
                {
                    m();
                } else
                {
                    removeView(r);
                }
            }
            if (r != null && (k1 & 6) != 0)
            {
                boolean flag1;
                if ((j & 4) != 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                obj = u;
                j1 = byte0;
                if (!flag)
                {
                    if (flag1)
                    {
                        j1 = 0;
                    } else
                    {
                        j1 = 4;
                    }
                }
                ((View) (obj)).setVisibility(j1);
                obj = r;
                if (!flag && flag1)
                {
                    flag2 = flag3;
                } else
                {
                    flag2 = false;
                }
                ((LinearLayout) (obj)).setEnabled(flag2);
            }
            if ((k1 & 0x10) != 0 && y != null)
            {
                if ((i1 & 0x10) != 0)
                {
                    addView(y);
                } else
                {
                    removeView(y);
                }
            }
            requestLayout();
        } else
        {
            invalidate();
        }
        if (!p.isEnabled())
        {
            p.setContentDescription(null);
            return;
        }
        if ((i1 & 4) != 0)
        {
            p.setContentDescription(o.getResources().getText(android.support.v7.appcompat.R.string.abc_action_bar_up_description));
            return;
        } else
        {
            p.setContentDescription(o.getResources().getText(android.support.v7.appcompat.R.string.abc_action_bar_home_description));
            return;
        }
    }

    public void setDropdownAdapter(SpinnerAdapter spinneradapter)
    {
        O = spinneradapter;
        if (v != null)
        {
            v.a(spinneradapter);
        }
    }

    public void setDropdownSelectedPosition(int i1)
    {
        v.a(i1);
    }

    public void setEmbeddedTabView(ScrollingTabContainerView scrollingtabcontainerview)
    {
        if (x != null)
        {
            removeView(x);
        }
        x = scrollingtabcontainerview;
        boolean flag;
        if (scrollingtabcontainerview != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        I = flag;
        if (I && i == 2)
        {
            addView(x);
            android.view.ViewGroup.LayoutParams layoutparams = x.getLayoutParams();
            layoutparams.width = -2;
            layoutparams.height = -1;
            scrollingtabcontainerview.setAllowCollapse(true);
        }
    }

    public void setHomeAsUpIndicator(int i1)
    {
        p.a(i1);
    }

    public void setHomeAsUpIndicator(Drawable drawable)
    {
        p.b(drawable);
    }

    public void setHomeButtonEnabled(boolean flag)
    {
        p.setEnabled(flag);
        p.setFocusable(flag);
        if (!flag)
        {
            p.setContentDescription(null);
            return;
        }
        if ((j & 4) != 0)
        {
            p.setContentDescription(o.getResources().getText(android.support.v7.appcompat.R.string.abc_action_bar_up_description));
            return;
        } else
        {
            p.setContentDescription(o.getResources().getText(android.support.v7.appcompat.R.string.abc_action_bar_home_description));
            return;
        }
    }

    public void setIcon(int i1)
    {
        setIcon(o.getResources().getDrawable(i1));
    }

    public void setIcon(Drawable drawable)
    {
        m = drawable;
        if (drawable != null && ((j & 1) == 0 || n == null))
        {
            p.a(drawable);
        }
        if (g != null)
        {
            q.a(m.getConstantState().newDrawable(getResources()));
        }
    }

    public void setLogo(int i1)
    {
        setLogo(o.getResources().getDrawable(i1));
    }

    public void setLogo(Drawable drawable)
    {
        n = drawable;
        if (drawable != null && (j & 1) != 0)
        {
            p.a(drawable);
        }
    }

    public void setNavigationMode(int i1)
    {
        int j1 = i;
        if (i1 == j1) goto _L2; else goto _L1
_L1:
        j1;
        JVM INSTR tableswitch 1 2: default 32
    //                   1 66
    //                   2 84;
           goto _L3 _L4 _L5
_L3:
        i1;
        JVM INSTR tableswitch 1 2: default 56
    //                   1 109
    //                   2 232;
           goto _L6 _L7 _L8
_L6:
        i = i1;
        requestLayout();
_L2:
        return;
_L4:
        if (w != null)
        {
            removeView(w);
        }
          goto _L3
_L5:
        if (x != null && I)
        {
            removeView(x);
        }
          goto _L3
_L7:
        if (v == null)
        {
            v = new d(o, null, android.support.v7.appcompat.R.attr.actionDropDownStyle);
            w = (LinearLayout)LayoutInflater.from(o).inflate(android.support.v7.appcompat.R.layout.abc_action_bar_view_list_nav_layout, null);
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -1);
            layoutparams.gravity = 17;
            w.addView(v, layoutparams);
        }
        if (v.d() != O)
        {
            v.a(O);
        }
        v.a(S);
        addView(w);
          goto _L6
_L8:
        if (x != null && I)
        {
            addView(x);
        }
          goto _L6
    }

    public void setSplitActionBar(boolean flag)
    {
        if (d != flag)
        {
            if (a != null)
            {
                Object obj = (ViewGroup)a.getParent();
                if (obj != null)
                {
                    ((ViewGroup) (obj)).removeView(a);
                }
                if (flag)
                {
                    if (c != null)
                    {
                        c.addView(a);
                    }
                    a.getLayoutParams().width = -1;
                } else
                {
                    addView(a);
                    a.getLayoutParams().width = -2;
                }
                a.requestLayout();
            }
            if (c != null)
            {
                obj = c;
                int i1;
                if (flag)
                {
                    i1 = 0;
                } else
                {
                    i1 = 8;
                }
                ((ActionBarContainer) (obj)).setVisibility(i1);
            }
            if (b != null)
            {
                if (!flag)
                {
                    b.b(getResources().getBoolean(android.support.v7.appcompat.R.bool.abc_action_bar_expanded_action_views_exclusive));
                } else
                {
                    b.b(false);
                    b.a(getContext().getResources().getDisplayMetrics().widthPixels, true);
                    b.a(0x7fffffff);
                }
            }
            super.setSplitActionBar(flag);
        }
    }

    public volatile void setSplitView(ActionBarContainer actionbarcontainer)
    {
        super.setSplitView(actionbarcontainer);
    }

    public volatile void setSplitWhenNarrow(boolean flag)
    {
        super.setSplitWhenNarrow(flag);
    }

    public void setSubtitle(CharSequence charsequence)
    {
        boolean flag = false;
        l = charsequence;
        if (t != null)
        {
            t.setText(charsequence);
            TextView textview = t;
            int i1;
            if (charsequence != null)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            textview.setVisibility(i1);
            if (g == null && (j & 8) != 0 && (!TextUtils.isEmpty(k) || !TextUtils.isEmpty(l)))
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            charsequence = r;
            if (i1 != 0)
            {
                i1 = ((flag) ? 1 : 0);
            } else
            {
                i1 = 8;
            }
            charsequence.setVisibility(i1);
        }
    }

    public void setTitle(CharSequence charsequence)
    {
        H = true;
        setTitleImpl(charsequence);
    }

    public volatile void setVisibility(int i1)
    {
        super.setVisibility(i1);
    }

    public void setWindowCallback(android.view.Window.Callback callback)
    {
        h = callback;
    }

    public void setWindowTitle(CharSequence charsequence)
    {
        if (!H)
        {
            setTitleImpl(charsequence);
        }
    }

    public boolean shouldDelayChildPressedState()
    {
        return false;
    }
}
