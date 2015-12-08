// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.tutorial;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.phunware.nbc.sochi.MainNavigationContentActivity;
import com.phunware.nbc.sochi.customview.LinePageIndicator;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

public class TutorialDialogFragment extends DialogFragment
{

    private PagerAdapter adapter;
    private DisplayMetrics displayMetrics;
    LinePageIndicator indicator;
    private LayoutInflater inflater;
    ViewPager pager;
    Picasso picasso;

    public TutorialDialogFragment()
    {
    }

    private PagerAdapter getAdapter()
    {
        return new PagerAdapter() {

            final int imageIds[] = {
                0x7f02003c, 0x7f02003d, 0x7f02003e
            };
            final TutorialDialogFragment this$0;

            public void destroyItem(ViewGroup viewgroup, int i, Object obj)
            {
                viewgroup.removeView((View)obj);
            }

            public int getCount()
            {
                return 3;
            }

            public Object instantiateItem(ViewGroup viewgroup, int i)
            {
                ImageView imageview = (ImageView)inflater.inflate(0x7f0400a9, viewgroup, false);
                picasso.load(imageIds[i]).fit().skipMemoryCache().into(imageview);
                viewgroup.addView(imageview);
                return imageview;
            }

            public boolean isViewFromObject(View view, Object obj)
            {
                return view == obj;
            }

            
            {
                this$0 = TutorialDialogFragment.this;
                super();
            }
        };
    }

    public static TutorialDialogFragment getInstance()
    {
        return new TutorialDialogFragment();
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        bundle = (MainNavigationContentActivity)getActivity();
        MainNavigationContentActivity.component().inject(this);
    }

    public void onClose()
    {
        dismiss();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setStyle(1, 0x7f0a0131);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        inflater = layoutinflater;
        layoutinflater = layoutinflater.inflate(0x7f0400a8, viewgroup);
        ButterKnife.bind(this, layoutinflater);
        return layoutinflater;
    }

    public void onResume()
    {
        super.onResume();
        if (adapter == null)
        {
            adapter = getAdapter();
        }
        pager.setAdapter(adapter);
        if (indicator != null)
        {
            indicator.setViewPager(pager);
        }
    }

}
