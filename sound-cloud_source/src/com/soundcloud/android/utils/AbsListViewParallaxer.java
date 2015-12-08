// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.soundcloud.android.view.ParallaxImageView;
import com.soundcloud.java.collections.Iterables;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.soundcloud.android.utils:
//            ViewUtils

public class AbsListViewParallaxer
    implements android.widget.AbsListView.OnScrollListener
{

    private static final int PARALLAX_STEP_AMOUNT = -10;
    static final String VIEW_FOREGROUND_TAG = "foreground";
    private final android.widget.AbsListView.OnScrollListener onScrollListenerDelegate;
    private final Map parallaxBgImageViewMap = new HashMap();
    private final Map parallaxViewMap = new HashMap();

    public AbsListViewParallaxer(android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        onScrollListenerDelegate = onscrolllistener;
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

    private void scrollChanged(AbsListView abslistview)
    {
        int j = abslistview.getHeight() / 2;
        float f = abslistview.getResources().getDisplayMetrics().density;
        if (j > 0)
        {
            for (int i = 0; i < abslistview.getChildCount(); i++)
            {
                applyParallaxToItemView(j, -10F * f, abslistview.getChildAt(i));
            }

        }
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (onScrollListenerDelegate != null)
        {
            onScrollListenerDelegate.onScroll(abslistview, i, j, k);
        }
        scrollChanged(abslistview);
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (onScrollListenerDelegate != null)
        {
            onScrollListenerDelegate.onScrollStateChanged(abslistview, i);
        }
    }

    private class _cls1
        implements Predicate
    {

        final AbsListViewParallaxer this$0;

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
            this$0 = AbsListViewParallaxer.this;
            super();
        }
    }


    private class _cls2
        implements Predicate
    {

        final AbsListViewParallaxer this$0;

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
            this$0 = AbsListViewParallaxer.this;
            super();
        }
    }


    private class _cls3
        implements Function
    {

        final AbsListViewParallaxer this$0;

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
            this$0 = AbsListViewParallaxer.this;
            super();
        }
    }

}
