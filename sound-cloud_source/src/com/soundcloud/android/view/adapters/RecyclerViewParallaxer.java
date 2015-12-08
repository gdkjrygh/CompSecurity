// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view.adapters;

import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.utils.ViewUtils;
import com.soundcloud.android.view.ParallaxImageView;
import com.soundcloud.java.collections.Iterables;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RecyclerViewParallaxer extends android.support.v7.widget.RecyclerView.OnScrollListener
{

    private static final int PARALLAX_STEP_AMOUNT = -10;
    static final String VIEW_FOREGROUND_TAG = "foreground";
    private final Map parallaxBgImageViewMap = new HashMap();
    private final Map parallaxViewMap = new HashMap();

    public RecyclerViewParallaxer()
    {
    }

    private void applyParallaxToItemView(int i, float f, View view)
    {
        if (view instanceof ViewGroup)
        {
            populateItemToParallaxViewsMaps((ViewGroup)view);
            View view1;
            for (Iterator iterator = ((Iterable)parallaxViewMap.get(view)).iterator(); iterator.hasNext(); view1.setTranslationY((int)(getParallaxRatio(i, view, view1) * (double)f)))
            {
                view1 = (View)iterator.next();
            }

            ParallaxImageView parallaximageview;
            for (Iterator iterator1 = ((Iterable)parallaxBgImageViewMap.get(view)).iterator(); iterator1.hasNext(); parallaximageview.setParallaxOffset(getParallaxRatio(i, view, parallaximageview)))
            {
                parallaximageview = (ParallaxImageView)iterator1.next();
            }

        }
    }

    private double getParallaxRatio(int i, View view, View view1)
    {
        return (double)((view.getTop() + (view1.getTop() + view1.getBottom()) / 2) - i) / (double)i;
    }

    private void populateItemToParallaxViewsMaps(ViewGroup viewgroup)
    {
        if (!parallaxViewMap.containsKey(viewgroup))
        {
            parallaxViewMap.put(viewgroup, Iterables.filter(ViewUtils.allChildViewsOf(viewgroup), new _cls1()));
        }
        if (!parallaxBgImageViewMap.containsKey(viewgroup))
        {
            parallaxBgImageViewMap.put(viewgroup, Iterables.transform(Iterables.filter(ViewUtils.allChildViewsOf(viewgroup), new _cls2()), new _cls3()));
        }
    }

    public void onScrolled(RecyclerView recyclerview, int i, int j)
    {
        j = recyclerview.getHeight() / 2;
        float f = recyclerview.getResources().getDisplayMetrics().density;
        if (j > 0)
        {
            for (i = 0; i < recyclerview.getChildCount(); i++)
            {
                applyParallaxToItemView(j, -10F * f, recyclerview.getChildAt(i));
            }

        }
    }

    private class _cls1
        implements Predicate
    {

        final RecyclerViewParallaxer this$0;

        public boolean apply(View view)
        {
            return "foreground".equals(view.getTag());
        }

        public volatile boolean apply(Object obj)
        {
            return apply((View)obj);
        }

        _cls1()
        {
            this$0 = RecyclerViewParallaxer.this;
            super();
        }
    }


    private class _cls2
        implements Predicate
    {

        final RecyclerViewParallaxer this$0;

        public boolean apply(View view)
        {
            return view instanceof ParallaxImageView;
        }

        public volatile boolean apply(Object obj)
        {
            return apply((View)obj);
        }

        _cls2()
        {
            this$0 = RecyclerViewParallaxer.this;
            super();
        }
    }


    private class _cls3
        implements Function
    {

        final RecyclerViewParallaxer this$0;

        public ParallaxImageView apply(View view)
        {
            return (ParallaxImageView)view;
        }

        public volatile Object apply(Object obj)
        {
            return apply((View)obj);
        }

        _cls3()
        {
            this$0 = RecyclerViewParallaxer.this;
            super();
        }
    }

}
