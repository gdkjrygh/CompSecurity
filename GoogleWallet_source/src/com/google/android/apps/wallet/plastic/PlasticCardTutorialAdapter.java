// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.wallet.ui.listener.OnActionListener;
import com.google.android.apps.wallet.util.view.Views;
import java.util.ArrayList;
import java.util.List;

public class PlasticCardTutorialAdapter extends PagerAdapter
{

    private OnActionListener learnMoreListener;
    private final List pages = new ArrayList(3);

    PlasticCardTutorialAdapter(Activity activity)
    {
        int j = com.google.android.apps.walletnfcrel.R.drawable.img_tutorial_1_color_360x218dp;
        int k = com.google.android.apps.walletnfcrel.R.drawable.img_tutorial_2_color_360x218dp;
        int l = com.google.android.apps.walletnfcrel.R.drawable.img_tutorial_3_color_360x218dp;
        int i1 = com.google.android.apps.walletnfcrel.R.string.tutorial_header1;
        int j1 = com.google.android.apps.walletnfcrel.R.string.tutorial_header2;
        int k1 = com.google.android.apps.walletnfcrel.R.string.tutorial_header3;
        int l1 = com.google.android.apps.walletnfcrel.R.string.tutorial_content1;
        int i2 = com.google.android.apps.walletnfcrel.R.string.tutorial_content2;
        int j2 = com.google.android.apps.walletnfcrel.R.string.tutorial_content3;
        activity = LayoutInflater.from(activity);
        int i = 0;
        while (i < 3) 
        {
            View view = activity.inflate(com.google.android.apps.walletnfcrel.R.layout.tutorial_page, null, false);
            ((ImageView)view.findViewById(com.google.android.apps.walletnfcrel.R.id.TutorialPageImage)).setImageResource((new int[] {
                j, k, l
            })[i]);
            ((TextView)view.findViewById(com.google.android.apps.walletnfcrel.R.id.TutorialPageHeader)).setText((new int[] {
                i1, j1, k1
            })[i]);
            ((TextView)view.findViewById(com.google.android.apps.walletnfcrel.R.id.TutorialPageContent)).setText((new int[] {
                l1, i2, j2
            })[i]);
            TextView textview = (TextView)view.findViewById(com.google.android.apps.walletnfcrel.R.id.TutorialPageLink);
            if (i == 2)
            {
                textview.setVisibility(0);
                Views.setLinkOnClickListener(textview, new android.view.View.OnClickListener() {

                    final PlasticCardTutorialAdapter this$0;

                    public final void onClick(View view1)
                    {
                        if (learnMoreListener != null)
                        {
                            learnMoreListener.onAction(null);
                        }
                    }

            
            {
                this$0 = PlasticCardTutorialAdapter.this;
                super();
            }
                });
            } else
            {
                textview.setVisibility(8);
            }
            pages.add(view);
            i++;
        }
    }

    public final void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup.removeView((View)obj);
    }

    public final int getCount()
    {
        return pages.size();
    }

    public final Object instantiateItem(ViewGroup viewgroup, int i)
    {
        View view = (View)pages.get(i);
        viewgroup.addView(view);
        return view;
    }

    public final boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }

    public final void setOnLearnMore(OnActionListener onactionlistener)
    {
        learnMoreListener = onactionlistener;
    }

}
