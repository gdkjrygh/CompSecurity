// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v4.view.af;
import android.support.v4.view.aj;
import android.support.v7.internal.view.a;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.LinearLayoutCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

// Referenced classes of package android.support.v7.internal.widget:
//            p

public class ScrollingTabContainerView extends HorizontalScrollView
    implements android.widget.AdapterView.OnItemSelectedListener
{
    private final class a extends BaseAdapter
    {

        final ScrollingTabContainerView a;

        public final int getCount()
        {
            return android.support.v7.internal.widget.ScrollingTabContainerView.a(a).getChildCount();
        }

        public final Object getItem(int l)
        {
            return ((b)android.support.v7.internal.widget.ScrollingTabContainerView.a(a).getChildAt(l)).a();
        }

        public final long getItemId(int l)
        {
            return (long)l;
        }

        public final View getView(int l, View view, ViewGroup viewgroup)
        {
            if (view == null)
            {
                return android.support.v7.internal.widget.ScrollingTabContainerView.a(a, (android.support.v7.app.ActionBar.b)getItem(l));
            } else
            {
                ((b)view).a((android.support.v7.app.ActionBar.b)getItem(l));
                return view;
            }
        }

        private a()
        {
            a = ScrollingTabContainerView.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    private final class b extends LinearLayoutCompat
        implements android.view.View.OnLongClickListener
    {

        final ScrollingTabContainerView a;
        private final int b[] = {
            0x10100d4
        };
        private android.support.v7.app.ActionBar.b c;
        private TextView d;
        private ImageView e;
        private View f;

        private void b()
        {
            Object obj = c;
            Object obj1 = ((android.support.v7.app.ActionBar.b) (obj)).c();
            if (obj1 != null)
            {
                obj = ((View) (obj1)).getParent();
                if (obj != this)
                {
                    if (obj != null)
                    {
                        ((ViewGroup)obj).removeView(((View) (obj1)));
                    }
                    addView(((View) (obj1)));
                }
                f = ((View) (obj1));
                if (d != null)
                {
                    d.setVisibility(8);
                }
                if (e != null)
                {
                    e.setVisibility(8);
                    e.setImageDrawable(null);
                }
                return;
            }
            if (f != null)
            {
                removeView(f);
                f = null;
            }
            android.graphics.drawable.Drawable drawable = ((android.support.v7.app.ActionBar.b) (obj)).a();
            obj1 = ((android.support.v7.app.ActionBar.b) (obj)).b();
            boolean flag;
            if (drawable != null)
            {
                if (e == null)
                {
                    ImageView imageview = new ImageView(getContext());
                    android.support.v7.widget.LinearLayoutCompat.a a2 = new android.support.v7.widget.LinearLayoutCompat.a(-2, -2);
                    a2.h = 16;
                    imageview.setLayoutParams(a2);
                    addView(imageview, 0);
                    e = imageview;
                }
                e.setImageDrawable(drawable);
                e.setVisibility(0);
            } else
            if (e != null)
            {
                e.setVisibility(8);
                e.setImageDrawable(null);
            }
            if (!TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                if (d == null)
                {
                    AppCompatTextView appcompattextview = new AppCompatTextView(getContext(), null, android.support.v7.appcompat.a.a.actionBarTabTextStyle);
                    appcompattextview.setEllipsize(android.text.TextUtils.TruncateAt.END);
                    android.support.v7.widget.LinearLayoutCompat.a a1 = new android.support.v7.widget.LinearLayoutCompat.a(-2, -2);
                    a1.h = 16;
                    appcompattextview.setLayoutParams(a1);
                    addView(appcompattextview);
                    d = appcompattextview;
                }
                d.setText(((CharSequence) (obj1)));
                d.setVisibility(0);
            } else
            if (d != null)
            {
                d.setVisibility(8);
                d.setText(null);
            }
            if (e != null)
            {
                e.setContentDescription(((android.support.v7.app.ActionBar.b) (obj)).d());
            }
            if (!flag && !TextUtils.isEmpty(((android.support.v7.app.ActionBar.b) (obj)).d()))
            {
                setOnLongClickListener(this);
                return;
            } else
            {
                setOnLongClickListener(null);
                setLongClickable(false);
                return;
            }
        }

        public final android.support.v7.app.ActionBar.b a()
        {
            return c;
        }

        public final void a(android.support.v7.app.ActionBar.b b1)
        {
            c = b1;
            b();
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
        {
            super.onInitializeAccessibilityEvent(accessibilityevent);
            accessibilityevent.setClassName(android/support/v7/app/ActionBar$b.getName());
        }

        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
        {
            super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                accessibilitynodeinfo.setClassName(android/support/v7/app/ActionBar$b.getName());
            }
        }

        public final boolean onLongClick(View view)
        {
            view = new int[2];
            getLocationOnScreen(view);
            Object obj = getContext();
            int l = getWidth();
            int i1 = getHeight();
            int j1 = ((Context) (obj)).getResources().getDisplayMetrics().widthPixels;
            obj = Toast.makeText(((Context) (obj)), c.d(), 0);
            ((Toast) (obj)).setGravity(49, (view[0] + l / 2) - j1 / 2, i1);
            ((Toast) (obj)).show();
            return true;
        }

        public final void onMeasure(int l, int i1)
        {
            super.onMeasure(l, i1);
            if (a.b > 0 && getMeasuredWidth() > a.b)
            {
                super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(a.b, 0x40000000), i1);
            }
        }

        public final void setSelected(boolean flag)
        {
            boolean flag1;
            if (isSelected() != flag)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            super.setSelected(flag);
            if (flag1 && flag)
            {
                sendAccessibilityEvent(4);
            }
        }

        public b(Context context, android.support.v7.app.ActionBar.b b1)
        {
            a = ScrollingTabContainerView.this;
            super(context, null, android.support.v7.appcompat.a.a.actionBarTabStyle);
            c = b1;
            scrollingtabcontainerview = android.support.v7.internal.widget.p.a(context, null, b, android.support.v7.appcompat.a.a.actionBarTabStyle);
            if (g(0))
            {
                setBackgroundDrawable(p.this.a(0));
            }
            p.this.b();
            setGravity(0x800013);
            b();
        }
    }

    protected final class c
        implements aj
    {

        final ScrollingTabContainerView a;
        private boolean b;
        private int c;

        public final void a(View view)
        {
            a.setVisibility(0);
            b = false;
        }

        public final void b(View view)
        {
            if (b)
            {
                return;
            } else
            {
                a.d = null;
                a.setVisibility(c);
                return;
            }
        }

        public final void c(View view)
        {
            b = true;
        }

        protected c()
        {
            a = ScrollingTabContainerView.this;
            super();
            b = false;
        }
    }


    private static final Interpolator k = new DecelerateInterpolator();
    Runnable a;
    int b;
    int c;
    protected af d;
    protected final c e = new c();
    private LinearLayoutCompat f;
    private Spinner g;
    private boolean h;
    private int i;
    private int j;

    public ScrollingTabContainerView(Context context)
    {
        super(context);
        setHorizontalScrollBarEnabled(false);
        context = android.support.v7.internal.view.a.a(context);
        setContentHeight(context.e());
        c = context.g();
        context = new LinearLayoutCompat(getContext(), null, android.support.v7.appcompat.a.a.actionBarTabBarStyle);
        context.setMeasureWithLargestChildEnabled(true);
        context.setGravity(17);
        context.setLayoutParams(new android.support.v7.widget.LinearLayoutCompat.a(-2, -1));
        f = context;
        addView(f, new android.view.ViewGroup.LayoutParams(-2, -1));
    }

    static b a(ScrollingTabContainerView scrollingtabcontainerview, android.support.v7.app.ActionBar.b b1)
    {
        b1 = scrollingtabcontainerview. new b(scrollingtabcontainerview.getContext(), b1);
        b1.setBackgroundDrawable(null);
        b1.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, scrollingtabcontainerview.i));
        return b1;
    }

    static LinearLayoutCompat a(ScrollingTabContainerView scrollingtabcontainerview)
    {
        return scrollingtabcontainerview.f;
    }

    private boolean a()
    {
        return g != null && g.getParent() == this;
    }

    private boolean b()
    {
        if (!a())
        {
            return false;
        } else
        {
            removeView(g);
            addView(f, new android.view.ViewGroup.LayoutParams(-2, -1));
            setTabSelected(g.getSelectedItemPosition());
            return false;
        }
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (a != null)
        {
            post(a);
        }
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        configuration = android.support.v7.internal.view.a.a(getContext());
        setContentHeight(configuration.e());
        c = configuration.g();
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (a != null)
        {
            removeCallbacks(a);
        }
    }

    public void onItemSelected(AdapterView adapterview, View view, int l, long l1)
    {
    }

    public void onMeasure(int l, int i1)
    {
        i1 = 1;
        int j1 = android.view.View.MeasureSpec.getMode(l);
        int l1;
        boolean flag;
        if (j1 == 0x40000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setFillViewport(flag);
        l1 = f.getChildCount();
        if (l1 > 1 && (j1 == 0x40000000 || j1 == 0x80000000))
        {
            AppCompatSpinner appcompatspinner;
            int k1;
            if (l1 > 2)
            {
                b = (int)((float)android.view.View.MeasureSpec.getSize(l) * 0.4F);
            } else
            {
                b = android.view.View.MeasureSpec.getSize(l) / 2;
            }
            b = Math.min(b, c);
        } else
        {
            b = -1;
        }
        k1 = android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
        if (flag || !h)
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            f.measure(0, k1);
            if (f.getMeasuredWidth() > android.view.View.MeasureSpec.getSize(l))
            {
                if (!a())
                {
                    if (g == null)
                    {
                        appcompatspinner = new AppCompatSpinner(getContext(), null, android.support.v7.appcompat.a.a.actionDropDownStyle);
                        appcompatspinner.setLayoutParams(new android.support.v7.widget.LinearLayoutCompat.a(-2, -1));
                        appcompatspinner.setOnItemSelectedListener(this);
                        g = appcompatspinner;
                    }
                    removeView(f);
                    addView(g, new android.view.ViewGroup.LayoutParams(-2, -1));
                    if (g.getAdapter() == null)
                    {
                        g.setAdapter(new a((byte)0));
                    }
                    if (a != null)
                    {
                        removeCallbacks(a);
                        a = null;
                    }
                    g.setSelection(j);
                }
            } else
            {
                b();
            }
        } else
        {
            b();
        }
        i1 = getMeasuredWidth();
        super.onMeasure(l, k1);
        l = getMeasuredWidth();
        if (flag && i1 != l)
        {
            setTabSelected(j);
        }
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    public void setAllowCollapse(boolean flag)
    {
        h = flag;
    }

    public void setContentHeight(int l)
    {
        i = l;
        requestLayout();
    }

    public void setTabSelected(int l)
    {
        j = l;
        int j1 = f.getChildCount();
        int i1 = 0;
        while (i1 < j1) 
        {
            View view = f.getChildAt(i1);
            boolean flag;
            if (i1 == l)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setSelected(flag);
            if (!flag)
            {
                continue;
            }
            view = f.getChildAt(l);
            if (a != null)
            {
                removeCallbacks(a);
            }
            a = new Runnable(view) {

                final View a;
                final ScrollingTabContainerView b;

                public final void run()
                {
                    int k1 = a.getLeft();
                    int l1 = (b.getWidth() - a.getWidth()) / 2;
                    b.smoothScrollTo(k1 - l1, 0);
                    b.a = null;
                }

            
            {
                b = ScrollingTabContainerView.this;
                a = view;
                super();
            }
            };
            post(a);
            i1++;
        }
        if (g != null && l >= 0)
        {
            g.setSelection(l);
        }
    }

}
