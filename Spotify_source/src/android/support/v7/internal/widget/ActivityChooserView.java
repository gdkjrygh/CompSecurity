// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import aak;
import android.content.Context;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
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
import android.widget.PopupWindow;
import sr;
import vh;
import vl;
import vm;

public class ActivityChooserView extends ViewGroup
{

    boolean a;
    boolean b;
    private final vl c;
    private final vm d;
    private final LinearLayoutCompat e;
    private final Drawable f;
    private final FrameLayout g;
    private final ImageView h;
    private final FrameLayout i;
    private final ImageView j;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener k;
    private ListPopupWindow l;

    public ActivityChooserView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        new DataSetObserver() {

            private ActivityChooserView a;

            public final void onChanged()
            {
                super.onChanged();
                ActivityChooserView.a(a).notifyDataSetChanged();
            }

            public final void onInvalidated()
            {
                super.onInvalidated();
                ActivityChooserView.a(a).notifyDataSetInvalidated();
            }

            
            {
                a = ActivityChooserView.this;
                super();
            }
        };
        k = new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            private ActivityChooserView a;

            public final void onGlobalLayout()
            {
label0:
                {
                    if (a.c())
                    {
                        if (a.isShown())
                        {
                            break label0;
                        }
                        ActivityChooserView.b(a).dismiss();
                    }
                    return;
                }
                ActivityChooserView.b(a).b();
            }

            
            {
                a = ActivityChooserView.this;
                super();
            }
        };
        Object obj = context.obtainStyledAttributes(attributeset, sr.D, i1, 0);
        ((TypedArray) (obj)).getInt(sr.F, 4);
        attributeset = ((TypedArray) (obj)).getDrawable(sr.E);
        ((TypedArray) (obj)).recycle();
        LayoutInflater.from(getContext()).inflate(0x7f030007, this, true);
        d = new vm(this, (byte)0);
        e = (LinearLayoutCompat)findViewById(0x7f110268);
        f = e.getBackground();
        i = (FrameLayout)findViewById(0x7f11026b);
        i.setOnClickListener(d);
        i.setOnLongClickListener(d);
        j = (ImageView)i.findViewById(0x7f11026a);
        obj = (FrameLayout)findViewById(0x7f110269);
        ((FrameLayout) (obj)).setOnClickListener(d);
        ((FrameLayout) (obj)).setOnTouchListener(new aak(((View) (obj))) {

            private ActivityChooserView a;

            public final ListPopupWindow a()
            {
                return ActivityChooserView.b(a);
            }

            protected final boolean b()
            {
                ActivityChooserView activitychooserview = a;
                if (!activitychooserview.c() && activitychooserview.b)
                {
                    activitychooserview.a = false;
                    ActivityChooserView.a();
                }
                return true;
            }

            protected final boolean c()
            {
                a.b();
                return true;
            }

            
            {
                a = ActivityChooserView.this;
                super(view);
            }
        });
        g = ((FrameLayout) (obj));
        h = (ImageView)((FrameLayout) (obj)).findViewById(0x7f11026a);
        h.setImageDrawable(attributeset);
        c = new vl(this, (byte)0);
        c.registerDataSetObserver(new DataSetObserver() {

            private ActivityChooserView a;

            public final void onChanged()
            {
                super.onChanged();
                ActivityChooserView.c(a);
            }

            
            {
                a = ActivityChooserView.this;
                super();
            }
        });
        context = context.getResources();
        Math.max(context.getDisplayMetrics().widthPixels / 2, context.getDimensionPixelSize(0x7f0c001f));
    }

    public static vl a(ActivityChooserView activitychooserview)
    {
        return activitychooserview.c;
    }

    static void a()
    {
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    public static boolean a(ActivityChooserView activitychooserview, boolean flag)
    {
        activitychooserview.a = flag;
        return flag;
    }

    static ListPopupWindow b(ActivityChooserView activitychooserview)
    {
        return activitychooserview.e();
    }

    static void c(ActivityChooserView activitychooserview)
    {
        int i1;
        int j1;
        if (activitychooserview.c.getCount() > 0)
        {
            activitychooserview.g.setEnabled(true);
        } else
        {
            activitychooserview.g.setEnabled(false);
        }
        i1 = vh.a();
        j1 = vh.d();
        if (i1 == 1 || i1 > 1 && j1 > 0)
        {
            activitychooserview.i.setVisibility(0);
            ResolveInfo resolveinfo = vh.c();
            android.content.pm.PackageManager packagemanager = activitychooserview.getContext().getPackageManager();
            activitychooserview.j.setImageDrawable(resolveinfo.loadIcon(packagemanager));
        } else
        {
            activitychooserview.i.setVisibility(8);
        }
        if (activitychooserview.i.getVisibility() == 0)
        {
            activitychooserview.e.setBackgroundDrawable(activitychooserview.f);
            return;
        } else
        {
            activitychooserview.e.setBackgroundDrawable(null);
            return;
        }
    }

    public static void d()
    {
        a();
    }

    public static boolean d(ActivityChooserView activitychooserview)
    {
        return activitychooserview.a;
    }

    private ListPopupWindow e()
    {
        if (l == null)
        {
            l = new ListPopupWindow(getContext());
            l.a(c);
            l.k = this;
            l.c();
            l.l = d;
            l.a(d);
        }
        return l;
    }

    public static FrameLayout e(ActivityChooserView activitychooserview)
    {
        return activitychooserview.i;
    }

    public static FrameLayout f(ActivityChooserView activitychooserview)
    {
        return activitychooserview.g;
    }

    public final boolean b()
    {
        if (e().c.isShowing())
        {
            e().dismiss();
            ViewTreeObserver viewtreeobserver = getViewTreeObserver();
            if (viewtreeobserver.isAlive())
            {
                viewtreeobserver.removeGlobalOnLayoutListener(k);
            }
        }
        return true;
    }

    public final boolean c()
    {
        return e().c.isShowing();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        b = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        ViewTreeObserver viewtreeobserver = getViewTreeObserver();
        if (viewtreeobserver.isAlive())
        {
            viewtreeobserver.removeGlobalOnLayoutListener(k);
        }
        if (c())
        {
            b();
        }
        b = false;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        e.layout(0, 0, k1 - i1, l1 - j1);
        if (!c())
        {
            b();
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        LinearLayoutCompat linearlayoutcompat = e;
        int k1 = j1;
        if (i.getVisibility() != 0)
        {
            k1 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(j1), 0x40000000);
        }
        measureChild(linearlayoutcompat, i1, k1);
        setMeasuredDimension(linearlayoutcompat.getMeasuredWidth(), linearlayoutcompat.getMeasuredHeight());
    }
}
