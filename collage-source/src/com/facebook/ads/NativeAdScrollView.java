// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.facebook.ads:
//            NativeAdsManager, NativeAdViewAttributes, NativeAd, NativeAdView

public class NativeAdScrollView extends LinearLayout
{
    public static interface AdViewProvider
    {

        public abstract View createView(NativeAd nativead, int i);

        public abstract void destroyView(NativeAd nativead, View view);
    }

    private class a extends PagerAdapter
    {

        final NativeAdScrollView a;
        private List b;

        public void a()
        {
            b.clear();
            int j = Math.min(NativeAdScrollView.a(a), NativeAdScrollView.b(a).getUniqueNativeAdCount());
            for (int i = 0; i < j; i++)
            {
                NativeAd nativead = NativeAdScrollView.b(a).nextNativeAd();
                nativead.a(true);
                b.add(nativead);
            }

            notifyDataSetChanged();
        }

        public void destroyItem(ViewGroup viewgroup, int i, Object obj)
        {
            if (i < b.size())
            {
                if (NativeAdScrollView.c(a) != null)
                {
                    ((NativeAd)b.get(i)).unregisterView();
                } else
                {
                    NativeAdScrollView.f(a).destroyView((NativeAd)b.get(i), (View)obj);
                }
            }
            viewgroup.removeView((View)obj);
        }

        public int getCount()
        {
            return b.size();
        }

        public int getItemPosition(Object obj)
        {
            int i = b.indexOf(obj);
            if (i >= 0)
            {
                return i;
            } else
            {
                return -2;
            }
        }

        public Object instantiateItem(ViewGroup viewgroup, int i)
        {
            View view;
            if (NativeAdScrollView.c(a) != null)
            {
                view = NativeAdView.render(NativeAdScrollView.d(a), (NativeAd)b.get(i), NativeAdScrollView.c(a), NativeAdScrollView.e(a));
            } else
            {
                view = NativeAdScrollView.f(a).createView((NativeAd)b.get(i), i);
            }
            viewgroup.addView(view);
            return view;
        }

        public boolean isViewFromObject(View view, Object obj)
        {
            return view == obj;
        }

        public a()
        {
            a = NativeAdScrollView.this;
            super();
            b = new ArrayList();
        }
    }

    private class b extends ViewPager
    {

        final NativeAdScrollView a;

        protected void onMeasure(int i, int j)
        {
            j = 0;
            int k;
            int l;
            for (k = 0; j < getChildCount(); k = l)
            {
                View view = getChildAt(j);
                view.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                int i1 = view.getMeasuredHeight();
                l = k;
                if (i1 > k)
                {
                    l = i1;
                }
                j++;
            }

            super.onMeasure(i, android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000));
        }

        public b(Context context)
        {
            a = NativeAdScrollView.this;
            super(context);
        }
    }


    public static final int DEFAULT_INSET = 20;
    public static final int DEFAULT_MAX_ADS = 5;
    private final Context a;
    private final NativeAdsManager b;
    private final AdViewProvider c;
    private final NativeAdView.Type d;
    private final int e;
    private final a f;
    private final b g;
    private final NativeAdViewAttributes h;

    public NativeAdScrollView(Context context, NativeAdsManager nativeadsmanager, AdViewProvider adviewprovider)
    {
        this(context, nativeadsmanager, adviewprovider, null, null, 5);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeadsmanager, AdViewProvider adviewprovider, int i)
    {
        this(context, nativeadsmanager, adviewprovider, null, null, i);
    }

    private NativeAdScrollView(Context context, NativeAdsManager nativeadsmanager, AdViewProvider adviewprovider, NativeAdView.Type type, NativeAdViewAttributes nativeadviewattributes, int i)
    {
        super(context);
        if (!nativeadsmanager.isLoaded())
        {
            throw new IllegalStateException("NativeAdsManager not loaded");
        }
        if (type == null && adviewprovider == null)
        {
            throw new IllegalArgumentException("Must provide one of AdLayoutProperties or a CustomAdView");
        } else
        {
            a = context;
            b = nativeadsmanager;
            h = nativeadviewattributes;
            c = adviewprovider;
            d = type;
            e = i;
            f = new a();
            g = new b(context);
            g.setAdapter(f);
            setInset(20);
            f.a();
            addView(g);
            return;
        }
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeadsmanager, NativeAdView.Type type)
    {
        this(context, nativeadsmanager, null, type, new NativeAdViewAttributes(), 5);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeadsmanager, NativeAdView.Type type, NativeAdViewAttributes nativeadviewattributes)
    {
        this(context, nativeadsmanager, null, type, nativeadviewattributes, 5);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeadsmanager, NativeAdView.Type type, NativeAdViewAttributes nativeadviewattributes, int i)
    {
        this(context, nativeadsmanager, null, type, nativeadviewattributes, i);
    }

    static int a(NativeAdScrollView nativeadscrollview)
    {
        return nativeadscrollview.e;
    }

    static NativeAdsManager b(NativeAdScrollView nativeadscrollview)
    {
        return nativeadscrollview.b;
    }

    static NativeAdView.Type c(NativeAdScrollView nativeadscrollview)
    {
        return nativeadscrollview.d;
    }

    static Context d(NativeAdScrollView nativeadscrollview)
    {
        return nativeadscrollview.a;
    }

    static NativeAdViewAttributes e(NativeAdScrollView nativeadscrollview)
    {
        return nativeadscrollview.h;
    }

    static AdViewProvider f(NativeAdScrollView nativeadscrollview)
    {
        return nativeadscrollview.c;
    }

    public void setInset(int i)
    {
        if (i > 0)
        {
            DisplayMetrics displaymetrics = a.getResources().getDisplayMetrics();
            int j = Math.round((float)i * displaymetrics.density);
            g.setPadding(j, 0, j, 0);
            b b1 = g;
            float f1 = i / 2;
            b1.setPageMargin(Math.round(displaymetrics.density * f1));
            g.setClipToPadding(false);
        }
    }
}
