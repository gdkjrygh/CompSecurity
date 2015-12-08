// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.v4.view.n;
import android.support.v7.a.e;
import android.support.v7.a.g;
import android.support.v7.a.i;
import android.support.v7.a.j;
import android.support.v7.a.l;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.ListPopupWindow;
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

// Referenced classes of package android.support.v7.internal.widget:
//            p, q, u, r, 
//            t, s, j

public class ActivityChooserView extends ViewGroup
{

    n a;
    private final t b;
    private final u c;
    private final LinearLayoutCompat d;
    private final Drawable e;
    private final FrameLayout f;
    private final ImageView g;
    private final FrameLayout h;
    private final ImageView i;
    private final int j;
    private final DataSetObserver k;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener l;
    private ListPopupWindow m;
    private android.widget.PopupWindow.OnDismissListener n;
    private boolean o;
    private int p;
    private boolean q;
    private int r;

    public ActivityChooserView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, (byte)0);
    }

    private ActivityChooserView(Context context, AttributeSet attributeset, byte byte0)
    {
        super(context, attributeset, 0);
        k = new p(this);
        l = new q(this);
        p = 4;
        Object obj = context.obtainStyledAttributes(attributeset, l.ActivityChooserView, 0, 0);
        p = ((TypedArray) (obj)).getInt(l.ActivityChooserView_initialActivityCount, 4);
        attributeset = ((TypedArray) (obj)).getDrawable(l.ActivityChooserView_expandActivityOverflowButtonDrawable);
        ((TypedArray) (obj)).recycle();
        LayoutInflater.from(getContext()).inflate(i.abc_activity_chooser_view, this, true);
        c = new u(this);
        d = (LinearLayoutCompat)findViewById(g.activity_chooser_view_content);
        e = d.getBackground();
        h = (FrameLayout)findViewById(g.default_activity_button);
        h.setOnClickListener(c);
        h.setOnLongClickListener(c);
        i = (ImageView)h.findViewById(g.image);
        obj = (FrameLayout)findViewById(g.expand_activities_button);
        ((FrameLayout) (obj)).setOnClickListener(c);
        ((FrameLayout) (obj)).setOnTouchListener(new r(this, ((View) (obj))));
        f = ((FrameLayout) (obj));
        g = (ImageView)((FrameLayout) (obj)).findViewById(g.image);
        g.setImageDrawable(attributeset);
        b = new t(this);
        b.registerDataSetObserver(new s(this));
        context = context.getResources();
        j = Math.max(context.getDisplayMetrics().widthPixels / 2, context.getDimensionPixelSize(e.abc_config_prefDialogWidth));
    }

    static t a(ActivityChooserView activitychooserview)
    {
        return activitychooserview.b;
    }

    private void a(int i1)
    {
        if (b.a == null)
        {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(l);
        ListPopupWindow listpopupwindow;
        int j1;
        int k1;
        boolean flag;
        if (h.getVisibility() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k1 = b.a.a();
        if (flag)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (i1 != 0x7fffffff && k1 > j1 + i1)
        {
            b.a(true);
            b.a(i1 - 1);
        } else
        {
            b.a(false);
            b.a(i1);
        }
        listpopupwindow = getListPopupWindow();
        if (!listpopupwindow.c.isShowing())
        {
            if (o || !flag)
            {
                b.a(true, flag);
            } else
            {
                b.a(false, false);
            }
            listpopupwindow.a(Math.min(b.a(), j));
            listpopupwindow.b();
            if (a != null)
            {
                a.a(true);
            }
            listpopupwindow.d.setContentDescription(getContext().getString(j.abc_activitychooserview_choose_application));
        }
    }

    static void a(ActivityChooserView activitychooserview, int i1)
    {
        activitychooserview.a(i1);
    }

    static boolean a(ActivityChooserView activitychooserview, boolean flag)
    {
        activitychooserview.o = flag;
        return flag;
    }

    static ListPopupWindow b(ActivityChooserView activitychooserview)
    {
        return activitychooserview.getListPopupWindow();
    }

    static void c(ActivityChooserView activitychooserview)
    {
        int i1;
        int j1;
        if (activitychooserview.b.getCount() > 0)
        {
            activitychooserview.f.setEnabled(true);
        } else
        {
            activitychooserview.f.setEnabled(false);
        }
        i1 = activitychooserview.b.a.a();
        j1 = activitychooserview.b.a.c();
        if (i1 == 1 || i1 > 1 && j1 > 0)
        {
            activitychooserview.h.setVisibility(0);
            Object obj = activitychooserview.b.a.b();
            android.content.pm.PackageManager packagemanager = activitychooserview.getContext().getPackageManager();
            activitychooserview.i.setImageDrawable(((ResolveInfo) (obj)).loadIcon(packagemanager));
            if (activitychooserview.r != 0)
            {
                obj = ((ResolveInfo) (obj)).loadLabel(packagemanager);
                obj = activitychooserview.getContext().getString(activitychooserview.r, new Object[] {
                    obj
                });
                activitychooserview.h.setContentDescription(((CharSequence) (obj)));
            }
        } else
        {
            activitychooserview.h.setVisibility(8);
        }
        if (activitychooserview.h.getVisibility() == 0)
        {
            activitychooserview.d.setBackgroundDrawable(activitychooserview.e);
            return;
        } else
        {
            activitychooserview.d.setBackgroundDrawable(null);
            return;
        }
    }

    static boolean d(ActivityChooserView activitychooserview)
    {
        return activitychooserview.o;
    }

    static FrameLayout e(ActivityChooserView activitychooserview)
    {
        return activitychooserview.h;
    }

    static FrameLayout f(ActivityChooserView activitychooserview)
    {
        return activitychooserview.f;
    }

    static int g(ActivityChooserView activitychooserview)
    {
        return activitychooserview.p;
    }

    private ListPopupWindow getListPopupWindow()
    {
        if (m == null)
        {
            m = new ListPopupWindow(getContext());
            m.a(b);
            m.l = this;
            m.c();
            m.m = c;
            m.a(c);
        }
        return m;
    }

    static android.widget.PopupWindow.OnDismissListener h(ActivityChooserView activitychooserview)
    {
        return activitychooserview.n;
    }

    public final boolean a()
    {
        if (getListPopupWindow().c.isShowing() || !q)
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
        if (getListPopupWindow().c.isShowing())
        {
            getListPopupWindow().d();
            ViewTreeObserver viewtreeobserver = getViewTreeObserver();
            if (viewtreeobserver.isAlive())
            {
                viewtreeobserver.removeGlobalOnLayoutListener(l);
            }
        }
        return true;
    }

    public final boolean c()
    {
        return getListPopupWindow().c.isShowing();
    }

    public android.support.v7.internal.widget.j getDataModel()
    {
        return b.a;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        android.support.v7.internal.widget.j j1 = b.a;
        if (j1 != null)
        {
            j1.registerObserver(k);
        }
        q = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        Object obj = b.a;
        if (obj != null)
        {
            ((android.support.v7.internal.widget.j) (obj)).unregisterObserver(k);
        }
        obj = getViewTreeObserver();
        if (((ViewTreeObserver) (obj)).isAlive())
        {
            ((ViewTreeObserver) (obj)).removeGlobalOnLayoutListener(l);
        }
        if (c())
        {
            b();
        }
        q = false;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        d.layout(0, 0, k1 - i1, l1 - j1);
        if (!c())
        {
            b();
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        LinearLayoutCompat linearlayoutcompat = d;
        int k1 = j1;
        if (h.getVisibility() != 0)
        {
            k1 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(j1), 0x40000000);
        }
        measureChild(linearlayoutcompat, i1, k1);
        setMeasuredDimension(linearlayoutcompat.getMeasuredWidth(), linearlayoutcompat.getMeasuredHeight());
    }

    public void setActivityChooserModel(android.support.v7.internal.widget.j j1)
    {
        t t1 = b;
        android.support.v7.internal.widget.j j2 = t1.c.b.a;
        if (j2 != null && t1.c.isShown())
        {
            j2.unregisterObserver(t1.c.k);
        }
        t1.a = j1;
        if (j1 != null && t1.c.isShown())
        {
            j1.registerObserver(t1.c.k);
        }
        t1.notifyDataSetChanged();
        if (getListPopupWindow().c.isShowing())
        {
            b();
            a();
        }
    }

    public void setDefaultActionButtonContentDescription(int i1)
    {
        r = i1;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i1)
    {
        String s1 = getContext().getString(i1);
        g.setContentDescription(s1);
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable)
    {
        g.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i1)
    {
        p = i1;
    }

    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener ondismisslistener)
    {
        n = ondismisslistener;
    }

    public void setProvider(n n1)
    {
        a = n1;
    }
}
