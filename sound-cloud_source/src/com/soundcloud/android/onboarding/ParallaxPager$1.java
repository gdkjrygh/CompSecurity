// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.utils.ViewUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.soundcloud.android.onboarding:
//            ParallaxPager

class val.adapter extends PagerAdapter
{

    final ParallaxPager this$0;
    final PagerAdapter val$adapter;

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        val$adapter.destroyItem(viewgroup, i, obj);
        viewgroup = new HashSet();
        obj = ParallaxPager.access$000(ParallaxPager.this).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            rallaxInfo rallaxinfo = (rallaxInfo)((Iterator) (obj)).next();
            if (rallaxinfo.page == i)
            {
                viewgroup.add(rallaxinfo);
            }
        } while (true);
        ParallaxPager.access$000(ParallaxPager.this).removeAll(viewgroup);
    }

    public int getCount()
    {
        return val$adapter.getCount();
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        viewgroup = ((ViewGroup) (val$adapter.instantiateItem(viewgroup, i)));
        if (viewgroup instanceof ViewGroup)
        {
            Iterator iterator = ViewUtils.allChildViewsOf((ViewGroup)viewgroup).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                View view = (View)iterator.next();
                if ("parallax".equals(view.getTag()))
                {
                    ParallaxPager.access$000(ParallaxPager.this).add(new rallaxInfo(ParallaxPager.this, view, i));
                }
            } while (true);
        }
        return viewgroup;
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return val$adapter.isViewFromObject(view, obj);
    }

    rallaxInfo()
    {
        this$0 = final_parallaxpager;
        val$adapter = PagerAdapter.this;
        super();
    }
}
