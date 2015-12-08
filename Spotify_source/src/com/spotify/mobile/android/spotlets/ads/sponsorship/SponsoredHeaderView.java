// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads.sponsorship;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.android.paste.widget.ViewPagerIndicator;
import com.spotify.mobile.android.spotlets.ads.model.Sponsorship;
import com.spotify.mobile.android.spotlets.ads.model.SponsorshipAdData;
import com.squareup.picasso.Picasso;
import dfh;
import dft;
import dgm;
import dgn;
import dgo;
import dhr;
import dmz;
import efl;
import efm;
import efn;
import gft;
import gwb;
import gwi;
import jz;

public class SponsoredHeaderView extends ViewGroup
    implements dgm
{

    public efm a;
    public Sponsorship b;
    public SponsorshipAdData c;
    private final ViewPager d;
    private final ViewPagerIndicator e;
    private LinearLayout f;
    private ImageView g;
    private dhr h;
    private TextView i;
    private View j;
    private efl k;
    private jz l;
    private GestureDetector m;
    private boolean n;
    private int o;
    private TypedValue p;
    private ImageView q;
    private TextView r;
    private gwi s = new gwi() {

        private SponsoredHeaderView a;

        public final void a(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
        {
            SponsoredHeaderView.a(a).setAlpha(0.0F);
            SponsoredHeaderView.a(a).setImageBitmap(bitmap);
            SponsoredHeaderView.a(a).animate().setDuration(350L).alpha(1.0F);
            SponsoredHeaderView.b(a).displayedDuringSession();
            if (SponsoredHeaderView.c(a) != null)
            {
                SponsoredHeaderView.c(a).a(SponsoredHeaderView.d(a));
            }
        }

        public final void a(Drawable drawable)
        {
            SponsoredHeaderView.a(a).setVisibility(8);
            if (SponsoredHeaderView.c(a) != null)
            {
                SponsoredHeaderView.c(a).a(SponsoredHeaderView.d(a), "Failed to load logo");
            }
        }

        public final void b(Drawable drawable)
        {
        }

            
            {
                a = SponsoredHeaderView.this;
                super();
            }
    };
    private DataSetObserver t = new DataSetObserver() {

        private SponsoredHeaderView a;

        private void a()
        {
            SponsoredHeaderView.e(a).requestLayout();
            SponsoredHeaderView.e(a).invalidate();
            SponsoredHeaderView.f(a).c();
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
                a = SponsoredHeaderView.this;
                super();
            }
    };

    public SponsoredHeaderView(Context context)
    {
        this(context, null);
    }

    public SponsoredHeaderView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f0101f5);
    }

    public SponsoredHeaderView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset);
        k = new efl(this, (byte)0);
        p = new TypedValue();
        dgn.a(com/spotify/mobile/android/spotlets/ads/sponsorship/SponsoredHeaderView, this);
        d = new ViewPager(context) {

            private SponsoredHeaderView e;

            protected final void onAttachedToWindow()
            {
                super.onAttachedToWindow();
                super.onLayout(false, getLeft(), getTop(), getRight(), getBottom());
            }

            public final boolean onTouchEvent(MotionEvent motionevent)
            {
                if (!SponsoredHeaderView.g(e))
                {
                    SponsoredHeaderView.a(e, SponsoredHeaderView.h(e).onTouchEvent(motionevent));
                }
                if (motionevent.getAction() == 1 || motionevent.getAction() == 3)
                {
                    SponsoredHeaderView.a(e, false);
                }
                e.requestDisallowInterceptTouchEvent(SponsoredHeaderView.g(e));
                return super.onTouchEvent(motionevent);
            }

            
            {
                e = SponsoredHeaderView.this;
                super(context);
            }
        };
        f = (LinearLayout)LayoutInflater.from(context).inflate(0x7f030135, d, false);
        o = ((FrameLayout)f.findViewById(0x7f11029c)).getLayoutParams().width;
        g = (ImageView)f.findViewById(0x7f11026a);
        h = new dhr((ViewGroup)f.findViewById(0x7f110473));
        r = (TextView)f.findViewById(0x7f1104ca);
        i = (TextView)f.findViewById(0x7f11026e);
        q = (ImageView)f.findViewById(0x7f1104cb);
        attributeset = context.obtainStyledAttributes(attributeset, dfh.U, i1, 0);
        a(attributeset.getString(0));
        i1 = attributeset.getResourceId(1, 0);
        if (i1 != 0)
        {
            dgo.a(context, i, i1);
        }
        dgo.b(getContext(), r, 0x7f0101dc);
        if (!attributeset.getValue(2, p))
        {
            p = null;
        }
        attributeset.recycle();
        d.a(k);
        i1 = dft.a(8F, context.getResources());
        e = new ViewPagerIndicator(context);
        e.setPadding(i1, 0, i1, i1);
        e.a(d);
        addView(d);
        addView(e);
        m = new GestureDetector(context, new android.view.GestureDetector.SimpleOnGestureListener() {

            public final boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
            {
                return Math.abs(f1) > Math.abs(f2);
            }

        });
    }

    static ImageView a(SponsoredHeaderView sponsoredheaderview)
    {
        return sponsoredheaderview.q;
    }

    static boolean a(SponsoredHeaderView sponsoredheaderview, boolean flag)
    {
        sponsoredheaderview.n = flag;
        return flag;
    }

    static Sponsorship b(SponsoredHeaderView sponsoredheaderview)
    {
        return sponsoredheaderview.b;
    }

    static efm c(SponsoredHeaderView sponsoredheaderview)
    {
        return sponsoredheaderview.a;
    }

    static SponsorshipAdData d(SponsoredHeaderView sponsoredheaderview)
    {
        return sponsoredheaderview.c;
    }

    static ViewPagerIndicator e(SponsoredHeaderView sponsoredheaderview)
    {
        return sponsoredheaderview.e;
    }

    static efl f(SponsoredHeaderView sponsoredheaderview)
    {
        return sponsoredheaderview.k;
    }

    static boolean g(SponsoredHeaderView sponsoredheaderview)
    {
        return sponsoredheaderview.n;
    }

    static GestureDetector h(SponsoredHeaderView sponsoredheaderview)
    {
        return sponsoredheaderview.m;
    }

    static void i(SponsoredHeaderView sponsoredheaderview)
    {
        gwb gwb1 = ((gft)dmz.a(gft)).a().a(sponsoredheaderview.c.getLogoUrl()).a(0x7f0c0167, 0x7f0c00c9).c();
        gwb1.b = true;
        gwb1.a().a(sponsoredheaderview.s);
        sponsoredheaderview.r.setText(String.format(sponsoredheaderview.getResources().getString(0x7f080068), new Object[] {
            sponsoredheaderview.c.getAdvertiserName()
        }));
        if (!TextUtils.isEmpty(sponsoredheaderview.c.getClick()))
        {
            sponsoredheaderview.q.setOnClickListener(new efn(sponsoredheaderview.getContext(), sponsoredheaderview.c));
        }
    }

    static void j(SponsoredHeaderView sponsoredheaderview)
    {
        sponsoredheaderview.q.setVisibility(8);
        sponsoredheaderview.r.setVisibility(8);
    }

    public static jz k(SponsoredHeaderView sponsoredheaderview)
    {
        return sponsoredheaderview.l;
    }

    public static LinearLayout l(SponsoredHeaderView sponsoredheaderview)
    {
        return sponsoredheaderview.f;
    }

    public final View a()
    {
        return this;
    }

    public final void a(View view)
    {
        if (j != view)
        {
            if (j != null)
            {
                f.removeView(j);
            }
            j = view;
            if (view != null)
            {
                android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                layoutparams.topMargin = dft.b(10F, getResources());
                view.setLayoutParams(layoutparams);
                f.addView(view);
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
        i.setText(charsequence);
        TextView textview = i;
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
        if (l != null)
        {
            l.b(t);
        }
        l = jz1;
        if (l != null)
        {
            l.a(t);
        }
        k.c();
    }

    public final ImageView b()
    {
        return g;
    }

    public final void b(View view)
    {
        h.a(view);
    }

    public void onDetachedFromWindow()
    {
        ((gft)dmz.a(gft)).a().a(s);
        super.onDetachedFromWindow();
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        d.layout(0, 0, d.getMeasuredWidth(), d.getMeasuredHeight());
        i1 = (k1 - i1 - e.getMeasuredWidth()) / 2 + 0;
        j1 = d.getMeasuredHeight() + 0;
        e.layout(i1, j1, e.getMeasuredWidth() + i1, e.getMeasuredHeight() + j1);
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1 = android.view.View.MeasureSpec.getSize(i1);
        int l1;
        if (p != null)
        {
            k1 = (int)p.getFraction(k1, k1);
        } else
        {
            k1 /= 2;
        }
        l1 = k1;
        if (o > 0)
        {
            l1 = Math.min(k1, o);
        }
        g.getLayoutParams().width = l1;
        g.getLayoutParams().height = l1;
        e.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        k1 = j1;
        if (android.view.View.MeasureSpec.getMode(j1) != 0)
        {
            k1 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(j1) - e.getMeasuredHeight(), 0x40000000);
        }
        f.measure(i1, k1);
        d.measure(android.view.View.MeasureSpec.makeMeasureSpec(f.getMeasuredWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(f.getMeasuredHeight(), 0x40000000));
        setMeasuredDimension(f.getMeasuredWidth(), f.getMeasuredHeight() + e.getMeasuredHeight());
    }

    // Unreferenced inner class com/spotify/mobile/android/spotlets/ads/sponsorship/SponsoredHeaderView$5

/* anonymous class */
    public final class _cls5
        implements Runnable
    {

        private SponsoredHeaderView a;

        public final void run()
        {
            SponsoredHeaderView.i(a);
        }

            public 
            {
                a = SponsoredHeaderView.this;
                super();
            }
    }


    // Unreferenced inner class com/spotify/mobile/android/spotlets/ads/sponsorship/SponsoredHeaderView$6

/* anonymous class */
    public final class _cls6
        implements Runnable
    {

        private SponsoredHeaderView a;

        public final void run()
        {
            SponsoredHeaderView.j(a);
        }

            public 
            {
                a = SponsoredHeaderView.this;
                super();
            }
    }

}
