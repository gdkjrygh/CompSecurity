// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.util.AttributeSet;
import android.view.View;
import com.soundcloud.android.view.SafeViewPager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ParallaxPager extends SafeViewPager
{
    class ParallaxInfo
    {

        public final int page;
        final ParallaxPager this$0;
        public final View view;

        ParallaxInfo(View view1, int i)
        {
            this$0 = ParallaxPager.this;
            super();
            view = view1;
            page = i;
        }
    }


    private final List parallaxViews;

    public ParallaxPager(Context context)
    {
        super(context);
        parallaxViews = new ArrayList();
    }

    public ParallaxPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        parallaxViews = new ArrayList();
    }

    protected void onPageScrolled(int i, float f, int j)
    {
        super.onPageScrolled(i, f, j);
        float f1;
        ParallaxInfo parallaxinfo;
        for (Iterator iterator = parallaxViews.iterator(); iterator.hasNext(); parallaxinfo.view.setTranslationX(f - f1))
        {
            parallaxinfo = (ParallaxInfo)iterator.next();
            f = parallaxinfo.page * getWidth();
            f1 = getWidth() * i + j;
        }

    }

    public void setAdapter(final PagerAdapter adapter)
    {
        super.setAdapter(new _cls1());
    }


    private class _cls1 extends PagerAdapter
    {

        final ParallaxPager this$0;
        final PagerAdapter val$adapter;

        public void destroyItem(ViewGroup viewgroup, int i, Object obj)
        {
            adapter.destroyItem(viewgroup, i, obj);
            viewgroup = new HashSet();
            obj = parallaxViews.iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                ParallaxInfo parallaxinfo = (ParallaxInfo)((Iterator) (obj)).next();
                if (parallaxinfo.page == i)
                {
                    viewgroup.add(parallaxinfo);
                }
            } while (true);
            parallaxViews.removeAll(viewgroup);
        }

        public int getCount()
        {
            return adapter.getCount();
        }

        public Object instantiateItem(ViewGroup viewgroup, int i)
        {
            viewgroup = ((ViewGroup) (adapter.instantiateItem(viewgroup, i)));
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
                        parallaxViews.add(new ParallaxInfo(view, i));
                    }
                } while (true);
            }
            return viewgroup;
        }

        public boolean isViewFromObject(View view, Object obj)
        {
            return adapter.isViewFromObject(view, obj);
        }

        _cls1()
        {
            this$0 = ParallaxPager.this;
            adapter = pageradapter;
            super();
        }
    }

}
