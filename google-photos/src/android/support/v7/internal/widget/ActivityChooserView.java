// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import adg;
import adq;
import android.content.Context;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupWindow;
import b;
import km;
import uh;
import xa;
import xg;
import xh;
import xi;
import xj;
import xk;
import xl;

public final class ActivityChooserView extends ViewGroup
{

    public final xk a;
    public final ImageView b;
    public km c;
    public final DataSetObserver d;
    public int e;
    private final xl f;
    private final adg g;
    private final Drawable h;
    private final FrameLayout i;
    private final FrameLayout j;
    private final ImageView k;
    private final int l;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener m;
    private adq n;
    private boolean o;
    private int p;
    private boolean q;

    public ActivityChooserView(Context context)
    {
        this(context, null);
    }

    private ActivityChooserView(Context context, AttributeSet attributeset)
    {
        this(context, null, 0);
    }

    private ActivityChooserView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, 0);
        d = new xg(this);
        m = new xh(this);
        p = 4;
        Object obj = context.obtainStyledAttributes(attributeset, uh.D, 0, 0);
        p = ((TypedArray) (obj)).getInt(uh.F, 4);
        attributeset = ((TypedArray) (obj)).getDrawable(uh.E);
        ((TypedArray) (obj)).recycle();
        LayoutInflater.from(getContext()).inflate(b.bv, this, true);
        f = new xl(this);
        g = (adg)findViewById(b.aX);
        h = g.getBackground();
        j = (FrameLayout)findViewById(b.be);
        j.setOnClickListener(f);
        j.setOnLongClickListener(f);
        k = (ImageView)j.findViewById(b.bh);
        obj = (FrameLayout)findViewById(b.bf);
        ((FrameLayout) (obj)).setOnClickListener(f);
        ((FrameLayout) (obj)).setOnTouchListener(new xi(this, ((View) (obj))));
        i = ((FrameLayout) (obj));
        b = (ImageView)((FrameLayout) (obj)).findViewById(b.bh);
        b.setImageDrawable(attributeset);
        a = new xk(this);
        a.registerDataSetObserver(new xj(this));
        context = context.getResources();
        l = Math.max(context.getDisplayMetrics().widthPixels / 2, context.getDimensionPixelSize(b.ac));
    }

    public static xk a(ActivityChooserView activitychooserview)
    {
        return activitychooserview.a;
    }

    private void a(int i1)
    {
        if (a.a == null)
        {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(m);
        adq adq1;
        int j1;
        int k1;
        boolean flag;
        if (j.getVisibility() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k1 = a.a.a();
        if (flag)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (i1 != 0x7fffffff && k1 > j1 + i1)
        {
            a.a(true);
            a.a(i1 - 1);
        } else
        {
            a.a(false);
            a.a(i1);
        }
        adq1 = d();
        if (!adq1.c.isShowing())
        {
            if (o || !flag)
            {
                a.a(true, flag);
            } else
            {
                a.a(false, false);
            }
            adq1.a(Math.min(a.a(), l));
            adq1.b();
            if (c != null)
            {
                c.a(true);
            }
            adq1.d.setContentDescription(getContext().getString(b.bJ));
        }
    }

    public static void a(ActivityChooserView activitychooserview, int i1)
    {
        activitychooserview.a(i1);
    }

    public static boolean a(ActivityChooserView activitychooserview, boolean flag)
    {
        activitychooserview.o = flag;
        return flag;
    }

    public static adq b(ActivityChooserView activitychooserview)
    {
        return activitychooserview.d();
    }

    public static void c(ActivityChooserView activitychooserview)
    {
        int i1;
        int j1;
        if (activitychooserview.a.getCount() > 0)
        {
            activitychooserview.i.setEnabled(true);
        } else
        {
            activitychooserview.i.setEnabled(false);
        }
        i1 = activitychooserview.a.a.a();
        j1 = activitychooserview.a.a.c();
        if (i1 == 1 || i1 > 1 && j1 > 0)
        {
            activitychooserview.j.setVisibility(0);
            Object obj = activitychooserview.a.a.b();
            android.content.pm.PackageManager packagemanager = activitychooserview.getContext().getPackageManager();
            activitychooserview.k.setImageDrawable(((ResolveInfo) (obj)).loadIcon(packagemanager));
            if (activitychooserview.e != 0)
            {
                obj = ((ResolveInfo) (obj)).loadLabel(packagemanager);
                obj = activitychooserview.getContext().getString(activitychooserview.e, new Object[] {
                    obj
                });
                activitychooserview.j.setContentDescription(((CharSequence) (obj)));
            }
        } else
        {
            activitychooserview.j.setVisibility(8);
        }
        if (activitychooserview.j.getVisibility() == 0)
        {
            activitychooserview.g.setBackgroundDrawable(activitychooserview.h);
            return;
        } else
        {
            activitychooserview.g.setBackgroundDrawable(null);
            return;
        }
    }

    public static boolean d(ActivityChooserView activitychooserview)
    {
        return activitychooserview.o;
    }

    public static FrameLayout e(ActivityChooserView activitychooserview)
    {
        return activitychooserview.j;
    }

    public static FrameLayout f(ActivityChooserView activitychooserview)
    {
        return activitychooserview.i;
    }

    public static int g(ActivityChooserView activitychooserview)
    {
        return activitychooserview.p;
    }

    public static android.widget.PopupWindow.OnDismissListener h(ActivityChooserView activitychooserview)
    {
        return null;
    }

    public final boolean a()
    {
        if (d().c.isShowing() || !q)
        {
            return false;
        } else
        {
            o = false;
            a(p);
            return true;
        }
    }

    public final boolean b()
    {
        if (d().c.isShowing())
        {
            d().c();
            ViewTreeObserver viewtreeobserver = getViewTreeObserver();
            if (viewtreeobserver.isAlive())
            {
                viewtreeobserver.removeGlobalOnLayoutListener(m);
            }
        }
        return true;
    }

    public final boolean c()
    {
        return d().c.isShowing();
    }

    public adq d()
    {
        if (n == null)
        {
            n = new adq(getContext());
            n.a(a);
            n.l = this;
            n.a(true);
            n.m = f;
            n.a(f);
        }
        return n;
    }

    protected final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        xa xa1 = a.a;
        if (xa1 != null)
        {
            xa1.registerObserver(d);
        }
        q = true;
    }

    protected final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        Object obj = a.a;
        if (obj != null)
        {
            ((xa) (obj)).unregisterObserver(d);
        }
        obj = getViewTreeObserver();
        if (((ViewTreeObserver) (obj)).isAlive())
        {
            ((ViewTreeObserver) (obj)).removeGlobalOnLayoutListener(m);
        }
        if (c())
        {
            b();
        }
        q = false;
    }

    protected final void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        g.layout(0, 0, k1 - i1, l1 - j1);
        if (!c())
        {
            b();
        }
    }

    protected final void onMeasure(int i1, int j1)
    {
        adg adg1 = g;
        int k1 = j1;
        if (j.getVisibility() != 0)
        {
            k1 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(j1), 0x40000000);
        }
        measureChild(adg1, i1, k1);
        setMeasuredDimension(adg1.getMeasuredWidth(), adg1.getMeasuredHeight());
    }
}
