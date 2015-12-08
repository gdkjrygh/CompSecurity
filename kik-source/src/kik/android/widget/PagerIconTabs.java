// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.kik.sdkutils.y;
import com.kik.view.adapters.ai;
import kik.android.chat.KikApplication;

// Referenced classes of package kik.android.widget:
//            ct, cu, TabIconImageView

public class PagerIconTabs extends LinearLayout
{
    private final class a
        implements android.support.v4.view.ViewPager.OnPageChangeListener
    {

        final PagerIconTabs a;

        public final void onPageScrollStateChanged(int i1)
        {
            if (i1 == 0)
            {
                PagerIconTabs.b(a, PagerIconTabs.a(a).getCurrentItem());
            }
            if (PagerIconTabs.b(a) != null)
            {
                PagerIconTabs.b(a).onPageScrollStateChanged(i1);
            }
        }

        public final void onPageScrolled(int i1, float f1, int j1)
        {
            PagerIconTabs.c(a, i1);
            PagerIconTabs.a(a, f1);
            if (f1 > 0.5F)
            {
                PagerIconTabs.b(a, i1 + 1);
            } else
            {
                PagerIconTabs.b(a, i1);
            }
            a.invalidate();
            if (PagerIconTabs.b(a) != null)
            {
                PagerIconTabs.b(a).onPageScrolled(i1, f1, j1);
            }
        }

        public final void onPageSelected(int i1)
        {
            if (PagerIconTabs.b(a) != null)
            {
                PagerIconTabs.b(a).onPageSelected(i1);
            }
        }

        private a()
        {
            a = PagerIconTabs.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    private static final int a[] = {
        0x7f010002
    };
    private static final int g = KikApplication.a(1);
    private static final int h = KikApplication.a(4);
    private static final int i = KikApplication.a(12);
    private ViewPager b;
    private android.support.v4.view.ViewPager.OnPageChangeListener c;
    private Paint d;
    private Paint e;
    private int f;
    private final a j;
    private int k;
    private float l;
    private boolean m;
    private boolean n;
    private android.view.View.OnClickListener o;
    private int p;

    public PagerIconTabs(Context context)
    {
        this(context, null);
    }

    public PagerIconTabs(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PagerIconTabs(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset);
        j = new a((byte)0);
        k = 0;
        l = 0.0F;
        m = true;
        n = false;
        o = new ct(this);
        d = new Paint();
        d.setAntiAlias(true);
        d.setStyle(android.graphics.Paint.Style.FILL);
        e = new Paint();
        e.setAntiAlias(true);
        e.setStyle(android.graphics.Paint.Style.FILL);
        if (y.a(11))
        {
            setMotionEventSplittingEnabled(false);
        }
    }

    static float a(PagerIconTabs pagericontabs, float f1)
    {
        pagericontabs.l = f1;
        return f1;
    }

    static ViewPager a(PagerIconTabs pagericontabs)
    {
        return pagericontabs.b;
    }

    static void a(PagerIconTabs pagericontabs, int i1)
    {
        if (pagericontabs.b != null)
        {
            pagericontabs.b.setCurrentItem(i1, true);
        }
    }

    static android.support.v4.view.ViewPager.OnPageChangeListener b(PagerIconTabs pagericontabs)
    {
        return pagericontabs.c;
    }

    private void b()
    {
        int i1 = 0;
        removeAllViews();
        f = b.getAdapter().getCount();
        if (f >= p)
        {
            p = f - 1;
        }
        if (p < 0)
        {
            p = 0;
        }
        ai ai1 = (ai)b.getAdapter();
        for (; i1 < f; i1++)
        {
            View view = ai1.a(i1, this);
            view.setTag(Integer.valueOf(i1));
            view.setOnClickListener(o);
            addView(view);
        }

        getViewTreeObserver().addOnGlobalLayoutListener(new cu(this));
    }

    static void b(PagerIconTabs pagericontabs, int i1)
    {
        View view = pagericontabs.getChildAt(i1);
        ViewGroup viewgroup = (ViewGroup)pagericontabs.getParent();
        if (view == null || viewgroup == null)
        {
            return;
        }
        int j1 = pagericontabs.getChildCount();
        for (i1 = 0; i1 < j1; i1++)
        {
            View view1 = pagericontabs.getChildAt(i1);
            view1.setSelected(false);
            if (view1 instanceof TabIconImageView)
            {
                ((TabIconImageView)view1).a(pagericontabs.n);
            }
        }

        view.setSelected(true);
    }

    static int c(PagerIconTabs pagericontabs, int i1)
    {
        pagericontabs.k = i1;
        return i1;
    }

    public final void a()
    {
        m = false;
    }

    public final void a(android.support.v4.view.ViewPager.OnPageChangeListener onpagechangelistener)
    {
        c = onpagechangelistener;
    }

    public final void a(ViewPager viewpager)
    {
        b = viewpager;
        if (viewpager == null)
        {
            return;
        }
        viewpager = b.getAdapter();
        if (viewpager == null || !(viewpager instanceof ai))
        {
            throw new IllegalArgumentException("Adapter must not be null and must implement ImagePagerAdapter");
        } else
        {
            b.setOnPageChangeListener(j);
            b();
            return;
        }
    }

    public final void a(boolean flag)
    {
        if (n != flag)
        {
            n = flag;
            for (int i1 = 0; i1 < f; i1++)
            {
                View view = getChildAt(i1);
                if (view instanceof TabIconImageView)
                {
                    ((TabIconImageView)view).a(flag);
                }
            }

            refreshDrawableState();
        }
    }

    protected int[] onCreateDrawableState(int i1)
    {
        if (n)
        {
            int ai1[] = super.onCreateDrawableState(i1 + 1);
            mergeDrawableStates(ai1, a);
            return ai1;
        } else
        {
            return super.onCreateDrawableState(i1);
        }
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (!isInEditMode() && f != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int j1 = getHeight();
        View view = getChildAt(k);
        float f4 = view.getLeft();
        float f3 = view.getRight();
        float f2 = f4;
        float f1 = f3;
        if (l > 0.0F)
        {
            f2 = f4;
            f1 = f3;
            if (k < f - 1)
            {
                View view1 = getChildAt(k + 1);
                f2 = view1.getLeft();
                f1 = view1.getRight();
                float f5 = l;
                f2 = f4 * (1.0F - l) + f2 * f5;
                f1 = f1 * l + (1.0F - l) * f3;
            }
        }
        d.setColor(getResources().getColor(0x7f0c0068));
        canvas.drawRect(f2, j1 - h, f1, j1, d);
        if (m)
        {
            d.setColor(getResources().getColor(0x7f0c0032));
            canvas.drawLine(0.0F, j1, getWidth(), j1, d);
            e.setColor(getResources().getColor(0x7f0c0032));
            int i1 = 0;
            while (i1 < f - 1) 
            {
                View view2 = getChildAt(i1);
                canvas.drawRect(view2.getRight(), i, view2.getRight() + g, j1 - i, e);
                i1++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

}
