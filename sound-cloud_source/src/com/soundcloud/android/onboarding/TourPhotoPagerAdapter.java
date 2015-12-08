// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.util.AnimUtils;
import com.soundcloud.android.utils.ViewUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.soundcloud.android.onboarding:
//            TourLayout, PhotoLoadHandler

class TourPhotoPagerAdapter extends PagerAdapter
{

    private static final String FOREGROUND_TAG = "foreground";
    private static final String PARALLAX_TAG = "parallax";
    private List photoPages;

    TourPhotoPagerAdapter(Context context)
    {
        photoPages = new ArrayList();
        photoPages.add(new TourLayout(context, 0x7f0300c6, 0x7f020259));
        photoPages.add(new TourLayout(context, 0x7f0300c7, 0x7f02025a));
        photoPages.add(new TourLayout(context, 0x7f0300c8, 0x7f02025b));
        Collections.shuffle(photoPages);
    }

    private static boolean isForegroundView(View view)
    {
        view = ((View) (view.getTag()));
        return "foreground".equals(view) || "parallax".equals(view);
    }

    public void destroyItem(View view, int i, Object obj)
    {
        ((ViewPager)view).removeView((View)obj);
    }

    public int getCount()
    {
        return photoPages.size();
    }

    public void hideViewsOfLayout(int i)
    {
        Iterator iterator = ViewUtils.allChildViewsOf((TourLayout)photoPages.get(i)).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            View view = (View)iterator.next();
            if (isForegroundView(view))
            {
                AnimUtils.showView(view, false);
            }
        } while (true);
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        View view = (View)photoPages.get(i);
        view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        viewgroup.addView(view);
        return view;
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return obj == view;
    }

    public void load(Context context, PhotoLoadHandler photoloadhandler)
    {
        TourLayout.load(context, (TourLayout[])photoPages.toArray(new TourLayout[photoPages.size()]));
        ((TourLayout)photoPages.get(0)).setLoadHandler(photoloadhandler);
    }

    public void onDestroy()
    {
        for (Iterator iterator = photoPages.iterator(); iterator.hasNext(); ((TourLayout)iterator.next()).recycle()) { }
    }

    public void showViewsOfLayout(int i, boolean flag)
    {
        Iterator iterator = ViewUtils.allChildViewsOf((TourLayout)photoPages.get(i)).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            View view = (View)iterator.next();
            if (isForegroundView(view))
            {
                AnimUtils.hideView(view, flag);
            }
        } while (true);
    }
}
