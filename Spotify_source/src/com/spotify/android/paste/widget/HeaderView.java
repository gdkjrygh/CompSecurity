// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import dfh;
import dft;
import dgl;
import dgm;
import dgn;
import dgo;
import dhr;
import jz;

// Referenced classes of package com.spotify.android.paste.widget:
//            ViewPagerIndicator

public class HeaderView extends ViewGroup
    implements dgm
{

    public TextView a;
    private final ViewPager b;
    private final ViewPagerIndicator c;
    private LinearLayout d;
    private FrameLayout e;
    private ImageView f;
    private dhr g;
    private TextView h;
    private View i;
    private dgl j;
    private jz k;
    private GestureDetector l;
    private boolean m;
    private int n;
    private int o;
    private TypedValue p;
    private DataSetObserver q = new DataSetObserver() {

        private HeaderView a;

        private void a()
        {
            HeaderView.a(a).requestLayout();
            HeaderView.a(a).invalidate();
            ((jz) (HeaderView.b(a))).a.notifyChanged();
        }

        public final void onChanged()
        {
            a();
        }

        public final void onInvalidated()
        {
            a();
        }

            
            {
                a = HeaderView.this;
                super();
            }
    };

    public HeaderView(Context context)
    {
        this(context, null);
    }

    public HeaderView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f0101f5);
    }

    public HeaderView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset);
        j = new dgl(this, (byte)0);
        o = 0;
        p = new TypedValue();
        dgn.a(com/spotify/android/paste/widget/HeaderView, this);
        b = new ViewPager(context) {

            private HeaderView e;

            protected final void onAttachedToWindow()
            {
                super.onAttachedToWindow();
                super.onLayout(false, getLeft(), getTop(), getRight(), getBottom());
            }

            public final boolean onTouchEvent(MotionEvent motionevent)
            {
                if (!HeaderView.c(e))
                {
                    HeaderView.a(e, HeaderView.d(e).onTouchEvent(motionevent));
                }
                if (motionevent.getAction() == 1 || motionevent.getAction() == 3)
                {
                    HeaderView.a(e, false);
                }
                e.requestDisallowInterceptTouchEvent(HeaderView.c(e));
                return super.onTouchEvent(motionevent);
            }

            
            {
                e = HeaderView.this;
                super(context);
            }
        };
        d = (LinearLayout)LayoutInflater.from(context).inflate(0x7f030103, b, false);
        e = (FrameLayout)d.findViewById(0x7f11029c);
        n = e.getLayoutParams().width;
        f = (ImageView)d.findViewById(0x7f11026a);
        g = new dhr((ViewGroup)d.findViewById(0x7f110473));
        a = (TextView)d.findViewById(0x7f11026e);
        h = (TextView)d.findViewById(0x7f110474);
        attributeset = context.obtainStyledAttributes(attributeset, dfh.U, i1, 0);
        a(attributeset.getString(dfh.V));
        i1 = attributeset.getResourceId(dfh.X, 0);
        if (i1 != 0)
        {
            dgo.a(context, a, i1);
        }
        if (!attributeset.getValue(dfh.W, p))
        {
            p = null;
        }
        attributeset.recycle();
        b.a(j);
        i1 = dft.a(8F, context.getResources());
        c = new ViewPagerIndicator(context);
        c.setPadding(i1, 0, i1, i1);
        c.a(b);
        addView(b);
        addView(c);
        l = new GestureDetector(context, new android.view.GestureDetector.SimpleOnGestureListener() {

            public final boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
            {
                return Math.abs(f1) > Math.abs(f2);
            }

        });
    }

    static ViewPagerIndicator a(HeaderView headerview)
    {
        return headerview.c;
    }

    static boolean a(HeaderView headerview, boolean flag)
    {
        headerview.m = flag;
        return flag;
    }

    static dgl b(HeaderView headerview)
    {
        return headerview.j;
    }

    static boolean c(HeaderView headerview)
    {
        return headerview.m;
    }

    static GestureDetector d(HeaderView headerview)
    {
        return headerview.l;
    }

    public static jz e(HeaderView headerview)
    {
        return headerview.k;
    }

    public static LinearLayout f(HeaderView headerview)
    {
        return headerview.d;
    }

    public final View a()
    {
        return this;
    }

    public final void a(int i1)
    {
        o = i1;
    }

    public final void a(int i1, int j1)
    {
        e.getLayoutParams().width = i1;
        e.getLayoutParams().height = j1;
        n = i1;
    }

    public final void a(View view)
    {
        if (i != view)
        {
            if (i != null)
            {
                d.removeView(i);
            }
            i = view;
            if (view != null)
            {
                android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                layoutparams.topMargin = dft.b(10F, getResources());
                view.setLayoutParams(layoutparams);
                d.addView(view);
                return;
            }
        }
    }

    public final void a(CharSequence charsequence)
    {
        if (getResources().getConfiguration().orientation == 2)
        {
            charsequence = "";
        }
        a.setText(charsequence);
        TextView textview = a;
        byte byte0;
        if (TextUtils.isEmpty(charsequence))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        textview.setVisibility(byte0);
    }

    public final void a(jz jz1)
    {
        if (k != null)
        {
            k.b(q);
        }
        k = jz1;
        if (k != null)
        {
            k.a(q);
        }
        ((jz) (j)).a.notifyChanged();
        c.requestLayout();
        c.invalidate();
    }

    public final ImageView b()
    {
        return f;
    }

    public final void b(View view)
    {
        g.a(view);
    }

    public final void b(CharSequence charsequence)
    {
        h.setText(charsequence);
        TextView textview = h;
        byte byte0;
        if (TextUtils.isEmpty(charsequence))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        textview.setVisibility(byte0);
    }

    public final View c()
    {
        return e;
    }

    public final TextView d()
    {
        return a;
    }

    public final View e()
    {
        return i;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        b.layout(0, 0, b.getMeasuredWidth(), b.getMeasuredHeight());
        i1 = (k1 - i1 - c.getMeasuredWidth()) / 2 + 0;
        j1 = b.getMeasuredHeight() + 0;
        c.layout(i1, j1, c.getMeasuredWidth() + i1, c.getMeasuredHeight() + j1);
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1 = android.view.View.MeasureSpec.getSize(i1);
        if (o == 0) goto _L2; else goto _L1
_L1:
        k1 = o;
_L4:
        f.getLayoutParams().width = k1;
        f.getLayoutParams().height = k1;
        c.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        k1 = j1;
        if (android.view.View.MeasureSpec.getMode(j1) != 0)
        {
            k1 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(j1) - c.getMeasuredHeight(), 0x40000000);
        }
        d.measure(i1, k1);
        b.measure(android.view.View.MeasureSpec.makeMeasureSpec(d.getMeasuredWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(d.getMeasuredHeight(), 0x40000000));
        setMeasuredDimension(d.getMeasuredWidth(), d.getMeasuredHeight() + c.getMeasuredHeight());
        return;
_L2:
        int l1;
        if (p != null)
        {
            l1 = (int)p.getFraction(k1, k1);
        } else
        {
            l1 = k1 / 2;
        }
        k1 = l1;
        if (n > 0)
        {
            k1 = Math.min(l1, n);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
