// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.v4.view.d;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

// Referenced classes of package android.support.v7.internal.widget:
//            ListPopupWindow, b

public class ActivityChooserView extends ViewGroup
{
    private class a extends BaseAdapter
    {

        final ActivityChooserView a;
        private android.support.v7.internal.widget.b b;
        private int c;
        private boolean d;
        private boolean e;
        private boolean f;

        public int a()
        {
            int i1 = 0;
            int k1 = c;
            c = 0x7fffffff;
            int l1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            int i2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            int j2 = getCount();
            View view = null;
            int j1 = 0;
            for (; i1 < j2; i1++)
            {
                view = getView(i1, view, null);
                view.measure(l1, i2);
                j1 = Math.max(j1, view.getMeasuredWidth());
            }

            c = k1;
            return j1;
        }

        public void a(int i1)
        {
            if (c != i1)
            {
                c = i1;
                notifyDataSetChanged();
            }
        }

        public void a(android.support.v7.internal.widget.b b1)
        {
            android.support.v7.internal.widget.b b2 = ActivityChooserView.a(a).e();
            if (b2 != null && a.isShown())
            {
                b2.unregisterObserver(ActivityChooserView.i(a));
            }
            b = b1;
            if (b1 != null && a.isShown())
            {
                b1.registerObserver(ActivityChooserView.i(a));
            }
            notifyDataSetChanged();
        }

        public void a(boolean flag)
        {
            if (f != flag)
            {
                f = flag;
                notifyDataSetChanged();
            }
        }

        public void a(boolean flag, boolean flag1)
        {
            if (d != flag || e != flag1)
            {
                d = flag;
                e = flag1;
                notifyDataSetChanged();
            }
        }

        public ResolveInfo b()
        {
            return b.b();
        }

        public int c()
        {
            return b.a();
        }

        public int d()
        {
            return b.c();
        }

        public android.support.v7.internal.widget.b e()
        {
            return b;
        }

        public boolean f()
        {
            return d;
        }

        public int getCount()
        {
            int j1 = b.a();
            int i1 = j1;
            if (!d)
            {
                i1 = j1;
                if (b.b() != null)
                {
                    i1 = j1 - 1;
                }
            }
            j1 = Math.min(i1, c);
            i1 = j1;
            if (f)
            {
                i1 = j1 + 1;
            }
            return i1;
        }

        public Object getItem(int i1)
        {
            int j1;
            switch (getItemViewType(i1))
            {
            default:
                throw new IllegalArgumentException();

            case 1: // '\001'
                return null;

            case 0: // '\0'
                j1 = i1;
                break;
            }
            if (!d)
            {
                j1 = i1;
                if (b.b() != null)
                {
                    j1 = i1 + 1;
                }
            }
            return b.a(j1);
        }

        public long getItemId(int i1)
        {
            return (long)i1;
        }

        public int getItemViewType(int i1)
        {
            return !f || i1 != getCount() - 1 ? 0 : 1;
        }

        public View getView(int i1, View view, ViewGroup viewgroup)
        {
            getItemViewType(i1);
            JVM INSTR tableswitch 0 1: default 28
        //                       0 107
        //                       1 36;
               goto _L1 _L2 _L3
_L1:
            throw new IllegalArgumentException();
_L3:
            Object obj;
label0:
            {
                if (view != null)
                {
                    obj = view;
                    if (view.getId() == 1)
                    {
                        break label0;
                    }
                }
                obj = LayoutInflater.from(a.getContext()).inflate(android.support.v7.appcompat.R.layout.abc_activity_chooser_view_list_item, viewgroup, false);
                ((View) (obj)).setId(1);
                ((TextView)((View) (obj)).findViewById(android.support.v7.appcompat.R.id.title)).setText(a.getContext().getString(android.support.v7.appcompat.R.string.abc_activity_chooser_view_see_all));
            }
_L8:
            return ((View) (obj));
_L2:
            if (view == null) goto _L5; else goto _L4
_L4:
            View view1 = view;
            if (view.getId() == android.support.v7.appcompat.R.id.list_item) goto _L6; else goto _L5
_L5:
            view1 = LayoutInflater.from(a.getContext()).inflate(android.support.v7.appcompat.R.layout.abc_activity_chooser_view_list_item, viewgroup, false);
_L6:
            view = a.getContext().getPackageManager();
            viewgroup = (ImageView)view1.findViewById(android.support.v7.appcompat.R.id.icon);
            obj = (ResolveInfo)getItem(i1);
            viewgroup.setImageDrawable(((ResolveInfo) (obj)).loadIcon(view));
            ((TextView)view1.findViewById(android.support.v7.appcompat.R.id.title)).setText(((ResolveInfo) (obj)).loadLabel(view));
            obj = view1;
            if (d)
            {
                obj = view1;
                if (i1 == 0)
                {
                    obj = view1;
                    if (e)
                    {
                        return view1;
                    }
                }
            }
            if (true) goto _L8; else goto _L7
_L7:
        }

        public int getViewTypeCount()
        {
            return 3;
        }

        private a()
        {
            a = ActivityChooserView.this;
            super();
            c = 4;
        }

    }

    private class b
        implements android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.widget.AdapterView.OnItemClickListener, android.widget.PopupWindow.OnDismissListener
    {

        final ActivityChooserView a;

        private void a()
        {
            if (ActivityChooserView.h(a) != null)
            {
                ActivityChooserView.h(a).onDismiss();
            }
        }

        public void onClick(View view)
        {
            if (view == ActivityChooserView.e(a))
            {
                a.b();
                view = ActivityChooserView.a(a).b();
                int i1 = ActivityChooserView.a(a).e().a(view);
                view = ActivityChooserView.a(a).e().b(i1);
                if (view != null)
                {
                    view.addFlags(0x80000);
                    a.getContext().startActivity(view);
                }
                return;
            }
            if (view == ActivityChooserView.f(a))
            {
                ActivityChooserView.a(a, false);
                ActivityChooserView.a(a, ActivityChooserView.g(a));
                return;
            } else
            {
                throw new IllegalArgumentException();
            }
        }

        public void onDismiss()
        {
            a();
            if (a.a != null)
            {
                a.a.a(false);
            }
        }

        public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
        {
            ((a)adapterview.getAdapter()).getItemViewType(i1);
            JVM INSTR tableswitch 0 1: default 32
        //                       0 50
        //                       1 40;
               goto _L1 _L2 _L3
_L1:
            throw new IllegalArgumentException();
_L3:
            ActivityChooserView.a(a, 0x7fffffff);
_L5:
            return;
_L2:
            a.b();
            if (!android.support.v7.internal.widget.ActivityChooserView.d(a))
            {
                break; /* Loop/switch isn't completed */
            }
            if (i1 > 0)
            {
                ActivityChooserView.a(a).e().c(i1);
                return;
            }
            if (true) goto _L5; else goto _L4
_L4:
            if (!ActivityChooserView.a(a).f())
            {
                i1++;
            }
            adapterview = ActivityChooserView.a(a).e().b(i1);
            if (adapterview != null)
            {
                adapterview.addFlags(0x80000);
                a.getContext().startActivity(adapterview);
                return;
            }
            if (true) goto _L5; else goto _L6
_L6:
        }

        public boolean onLongClick(View view)
        {
            if (view == ActivityChooserView.e(a))
            {
                if (ActivityChooserView.a(a).getCount() > 0)
                {
                    ActivityChooserView.a(a, true);
                    ActivityChooserView.a(a, ActivityChooserView.g(a));
                }
                return true;
            } else
            {
                throw new IllegalArgumentException();
            }
        }

        private b()
        {
            a = ActivityChooserView.this;
            super();
        }

    }


    d a;
    private final a b;
    private final b c;
    private final LinearLayout d;
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

    public ActivityChooserView(Context context)
    {
        this(context, null);
    }

    public ActivityChooserView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        k = new DataSetObserver() {

            final ActivityChooserView a;

            public void onChanged()
            {
                super.onChanged();
                ActivityChooserView.a(a).notifyDataSetChanged();
            }

            public void onInvalidated()
            {
                super.onInvalidated();
                ActivityChooserView.a(a).notifyDataSetInvalidated();
            }

            
            {
                a = ActivityChooserView.this;
                super();
            }
        };
        l = new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final ActivityChooserView a;

            public void onGlobalLayout()
            {
                if (a.c())
                {
                    if (!a.isShown())
                    {
                        ActivityChooserView.b(a).d();
                    } else
                    {
                        ActivityChooserView.b(a).c();
                        if (a.a != null)
                        {
                            a.a.a(true);
                            return;
                        }
                    }
                }
            }

            
            {
                a = ActivityChooserView.this;
                super();
            }
        };
        p = 4;
        attributeset = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ActivityChooserView, i1, 0);
        p = attributeset.getInt(0, 4);
        Drawable drawable = attributeset.getDrawable(1);
        attributeset.recycle();
        LayoutInflater.from(getContext()).inflate(android.support.v7.appcompat.R.layout.abc_activity_chooser_view, this, true);
        c = new b();
        d = (LinearLayout)findViewById(android.support.v7.appcompat.R.id.activity_chooser_view_content);
        e = d.getBackground();
        h = (FrameLayout)findViewById(android.support.v7.appcompat.R.id.default_activity_button);
        h.setOnClickListener(c);
        h.setOnLongClickListener(c);
        i = (ImageView)h.findViewById(android.support.v7.appcompat.R.id.image);
        f = (FrameLayout)findViewById(android.support.v7.appcompat.R.id.expand_activities_button);
        f.setOnClickListener(c);
        g = (ImageView)f.findViewById(android.support.v7.appcompat.R.id.image);
        g.setImageDrawable(drawable);
        b = new a();
        b.registerDataSetObserver(new DataSetObserver() {

            final ActivityChooserView a;

            public void onChanged()
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
        j = Math.max(context.getDisplayMetrics().widthPixels / 2, context.getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_config_prefDialogWidth));
    }

    static a a(ActivityChooserView activitychooserview)
    {
        return activitychooserview.b;
    }

    private void a(int i1)
    {
        if (b.e() == null)
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
        k1 = b.c();
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
        if (!listpopupwindow.f())
        {
            if (o || !flag)
            {
                b.a(true, flag);
            } else
            {
                b.a(false, false);
            }
            listpopupwindow.e(Math.min(b.a(), j));
            listpopupwindow.c();
            if (a != null)
            {
                a.a(true);
            }
            listpopupwindow.h().setContentDescription(getContext().getString(android.support.v7.appcompat.R.string.abc_activitychooserview_choose_application));
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
        activitychooserview.d();
    }

    private void d()
    {
        int i1;
        int j1;
        if (b.getCount() > 0)
        {
            f.setEnabled(true);
        } else
        {
            f.setEnabled(false);
        }
        i1 = b.c();
        j1 = b.d();
        if (i1 == 1 || i1 > 1 && j1 > 0)
        {
            h.setVisibility(0);
            Object obj = b.b();
            android.content.pm.PackageManager packagemanager = getContext().getPackageManager();
            i.setImageDrawable(((ResolveInfo) (obj)).loadIcon(packagemanager));
            if (r != 0)
            {
                obj = ((ResolveInfo) (obj)).loadLabel(packagemanager);
                obj = getContext().getString(r, new Object[] {
                    obj
                });
                h.setContentDescription(((CharSequence) (obj)));
            }
        } else
        {
            h.setVisibility(8);
        }
        if (h.getVisibility() == 0)
        {
            d.setBackgroundDrawable(e);
            return;
        } else
        {
            d.setBackgroundDrawable(null);
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
            m.a(this);
            m.a(true);
            m.a(c);
            m.a(c);
        }
        return m;
    }

    static android.widget.PopupWindow.OnDismissListener h(ActivityChooserView activitychooserview)
    {
        return activitychooserview.n;
    }

    static DataSetObserver i(ActivityChooserView activitychooserview)
    {
        return activitychooserview.k;
    }

    public boolean a()
    {
        if (c() || !q)
        {
            return false;
        } else
        {
            o = false;
            a(p);
            return true;
        }
    }

    public boolean b()
    {
        if (c())
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

    public boolean c()
    {
        return getListPopupWindow().f();
    }

    public android.support.v7.internal.widget.b getDataModel()
    {
        return b.e();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        android.support.v7.internal.widget.b b1 = b.e();
        if (b1 != null)
        {
            b1.registerObserver(k);
        }
        q = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        Object obj = b.e();
        if (obj != null)
        {
            ((android.support.v7.internal.widget.b) (obj)).unregisterObserver(k);
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
        LinearLayout linearlayout = d;
        int k1 = j1;
        if (h.getVisibility() != 0)
        {
            k1 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(j1), 0x40000000);
        }
        measureChild(linearlayout, i1, k1);
        setMeasuredDimension(linearlayout.getMeasuredWidth(), linearlayout.getMeasuredHeight());
    }

    public void setActivityChooserModel(android.support.v7.internal.widget.b b1)
    {
        b.a(b1);
        if (c())
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
        String s = getContext().getString(i1);
        g.setContentDescription(s);
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

    public void setProvider(d d1)
    {
        a = d1;
    }
}
