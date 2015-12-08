// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.a.b;
import android.support.v7.a.e;
import android.support.v7.a.l;
import android.support.v7.app.c;
import android.support.v7.internal.view.a;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.v;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.Spinner;

// Referenced classes of package android.support.v7.internal.widget:
//            ag, af

public class ScrollingTabContainerView extends HorizontalScrollView
    implements android.widget.AdapterView.OnItemSelectedListener
{

    private static final Interpolator i = new DecelerateInterpolator();
    Runnable a;
    int b;
    int c;
    private LinearLayoutCompat d;
    private Spinner e;
    private boolean f;
    private int g;
    private int h;

    static TabView a(ScrollingTabContainerView scrollingtabcontainerview, c c1)
    {
        c1 = scrollingtabcontainerview. new TabView(scrollingtabcontainerview.getContext(), c1);
        c1.setBackgroundDrawable(null);
        c1.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, scrollingtabcontainerview.g));
        return c1;
    }

    static LinearLayoutCompat a(ScrollingTabContainerView scrollingtabcontainerview)
    {
        return scrollingtabcontainerview.d;
    }

    private boolean a()
    {
        return e != null && e.getParent() == this;
    }

    private boolean b()
    {
        if (!a())
        {
            return false;
        } else
        {
            removeView(e);
            addView(d, new android.view.ViewGroup.LayoutParams(-2, -1));
            setTabSelected(e.getSelectedItemPosition());
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
        TypedArray typedarray = ((a) (configuration)).a.obtainStyledAttributes(null, l.ActionBar, b.actionBarStyle, 0);
        int k = typedarray.getLayoutDimension(l.ActionBar_height, 0);
        Resources resources = ((a) (configuration)).a.getResources();
        int j = k;
        if (!configuration.a())
        {
            j = Math.min(k, resources.getDimensionPixelSize(e.abc_action_bar_stacked_max_height));
        }
        typedarray.recycle();
        setContentHeight(j);
        c = ((a) (configuration)).a.getResources().getDimensionPixelSize(e.abc_action_bar_stacked_tab_max_width);
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (a != null)
        {
            removeCallbacks(a);
        }
    }

    public void onItemSelected(AdapterView adapterview, View view, int j, long l1)
    {
        ((TabView)view).getTab();
    }

    public void onMeasure(int j, int k)
    {
        k = 1;
        int i1 = android.view.View.MeasureSpec.getMode(j);
        int k1;
        boolean flag;
        if (i1 == 0x40000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setFillViewport(flag);
        k1 = d.getChildCount();
        if (k1 > 1 && (i1 == 0x40000000 || i1 == 0x80000000))
        {
            AppCompatSpinner appcompatspinner;
            int j1;
            if (k1 > 2)
            {
                b = (int)((float)android.view.View.MeasureSpec.getSize(j) * 0.4F);
            } else
            {
                b = android.view.View.MeasureSpec.getSize(j) / 2;
            }
            b = Math.min(b, c);
        } else
        {
            b = -1;
        }
        j1 = android.view.View.MeasureSpec.makeMeasureSpec(g, 0x40000000);
        if (flag || !f)
        {
            k = 0;
        }
        if (k != 0)
        {
            d.measure(0, j1);
            if (d.getMeasuredWidth() > android.view.View.MeasureSpec.getSize(j))
            {
                if (!a())
                {
                    if (e == null)
                    {
                        appcompatspinner = new AppCompatSpinner(getContext(), null, b.actionDropDownStyle);
                        appcompatspinner.setLayoutParams(new v(-2, -1));
                        appcompatspinner.setOnItemSelectedListener(this);
                        e = appcompatspinner;
                    }
                    removeView(d);
                    addView(e, new android.view.ViewGroup.LayoutParams(-2, -1));
                    if (e.getAdapter() == null)
                    {
                        e.setAdapter(new ag(this));
                    }
                    if (a != null)
                    {
                        removeCallbacks(a);
                        a = null;
                    }
                    e.setSelection(h);
                }
            } else
            {
                b();
            }
        } else
        {
            b();
        }
        k = getMeasuredWidth();
        super.onMeasure(j, j1);
        j = getMeasuredWidth();
        if (flag && k != j)
        {
            setTabSelected(h);
        }
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    public void setAllowCollapse(boolean flag)
    {
        f = flag;
    }

    public void setContentHeight(int j)
    {
        g = j;
        requestLayout();
    }

    public void setTabSelected(int j)
    {
        h = j;
        int i1 = d.getChildCount();
        int k = 0;
        while (k < i1) 
        {
            View view = d.getChildAt(k);
            boolean flag;
            if (k == j)
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
            view = d.getChildAt(j);
            if (a != null)
            {
                removeCallbacks(a);
            }
            a = new af(this, view);
            post(a);
            k++;
        }
        if (e != null && j >= 0)
        {
            e.setSelection(j);
        }
    }


    private class TabView extends LinearLayoutCompat
        implements android.view.View.OnLongClickListener
    {

        c a;
        final ScrollingTabContainerView b;
        private final int c[] = {
            0x10100d4
        };
        private TextView d;
        private ImageView e;
        private View f;

        public final void a()
        {
            Object obj = a;
            Object obj1 = ((c) (obj)).c();
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
            android.graphics.drawable.Drawable drawable = ((c) (obj)).a();
            obj1 = ((c) (obj)).b();
            boolean flag;
            if (drawable != null)
            {
                if (e == null)
                {
                    ImageView imageview = new ImageView(getContext());
                    v v2 = new v(-2, -2);
                    v2.h = 16;
                    imageview.setLayoutParams(v2);
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
                    AppCompatTextView appcompattextview = new AppCompatTextView(getContext(), null, b.actionBarTabTextStyle);
                    appcompattextview.setEllipsize(android.text.TextUtils.TruncateAt.END);
                    v v1 = new v(-2, -2);
                    v1.h = 16;
                    appcompattextview.setLayoutParams(v1);
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
                e.setContentDescription(((c) (obj)).d());
            }
            if (!flag && !TextUtils.isEmpty(((c) (obj)).d()))
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

        public c getTab()
        {
            return a;
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
        {
            super.onInitializeAccessibilityEvent(accessibilityevent);
            accessibilityevent.setClassName(android/support/v7/app/c.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
        {
            super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                accessibilitynodeinfo.setClassName(android/support/v7/app/c.getName());
            }
        }

        public boolean onLongClick(View view)
        {
            view = new int[2];
            getLocationOnScreen(view);
            Object obj = getContext();
            int j = getWidth();
            int k = getHeight();
            int i1 = ((Context) (obj)).getResources().getDisplayMetrics().widthPixels;
            obj = Toast.makeText(((Context) (obj)), a.d(), 0);
            ((Toast) (obj)).setGravity(49, (view[0] + j / 2) - i1 / 2, k);
            ((Toast) (obj)).show();
            return true;
        }

        public void onMeasure(int j, int k)
        {
            super.onMeasure(j, k);
            if (b.b > 0 && getMeasuredWidth() > b.b)
            {
                super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(b.b, 0x40000000), k);
            }
        }

        public void setSelected(boolean flag)
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

        public TabView(Context context, c c1)
        {
            b = ScrollingTabContainerView.this;
            super(context, null, b.actionBarTabStyle);
            a = c1;
            scrollingtabcontainerview = android.support.v7.internal.widget.an.a(context, null, c, b.actionBarTabStyle);
            if (an.this.e(0))
            {
                setBackgroundDrawable(an.this.a(0));
            }
            ScrollingTabContainerView.this.a.recycle();
            setGravity(0x800013);
            a();
        }
    }

}
