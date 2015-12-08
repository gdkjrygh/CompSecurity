// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.facebook.ads:
//            NativeAdScrollView, NativeAdsManager, NativeAd, NativeAdView

private class b extends PagerAdapter
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

    public ViewProvider(NativeAdScrollView nativeadscrollview)
    {
        a = nativeadscrollview;
        super();
        b = new ArrayList();
    }
}
