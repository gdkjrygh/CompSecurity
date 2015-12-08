// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.skype.android.inject.LifecycleSupport;
import com.skype.android.util.accessibility.AccessibilityUtil;

// Referenced classes of package com.skype.android:
//            SkypeFragment, SkypeConstants, SkypeFragmentComponent

public class SkypeListFragment extends SkypeFragment
    implements SkypeConstants
{
    public static interface OnFocusCallback
    {
    }


    AccessibilityUtil accessibilityUtil;
    private ProgressBar dataLoadingProgressBar;
    private int layoutId;
    private RecyclerView listWrapper;
    private int maxItemsToLoad;

    public SkypeListFragment()
    {
        maxItemsToLoad = 0x7fffffff;
    }

    protected int getLayoutId()
    {
        return 0x7f030072;
    }

    public RecyclerView getListView()
    {
        return listWrapper;
    }

    protected int getMaxItems()
    {
        return maxItemsToLoad;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        lifecycleSupport.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (layoutId == 0)
        {
            layoutId = getLayoutId();
        }
        return layoutinflater.inflate(layoutId, viewgroup, false);
    }

    public void onDestroy()
    {
        lifecycleSupport.onDestroy();
        super.onDestroy();
    }

    public void onInflate(Context context, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(context, attributeset, bundle);
        context = context.obtainStyledAttributes(attributeset, com.skype.android.app.R.styleable.FragmentAttributes);
        layoutId = context.getResourceId(0, 0);
        maxItemsToLoad = context.getInt(1, 0x7fffffff);
        context.recycle();
    }

    public void onPause()
    {
        lifecycleSupport.onPause();
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        lifecycleSupport.onResume();
    }

    public void onStart()
    {
        super.onStart();
        lifecycleSupport.onStart();
    }

    public void onStop()
    {
        lifecycleSupport.onStop();
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        listWrapper = (RecyclerView)view.findViewById(0x7f10025c);
        if (listWrapper == null)
        {
            throw new RuntimeException("Unable to find list. Your content must have a DynamicListWrapper whose id attribute is 'android.R.id.list'");
        }
        dataLoadingProgressBar = (ProgressBar)getView().findViewById(0x7f1002f7);
        view = getListView();
        bundle = getActivity();
        if (bundle instanceof OnFocusCallback)
        {
            view.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener(bundle, view) {

                final FragmentActivity a;
                final RecyclerView b;
                final SkypeListFragment c;

                public final void onFocusChange(View view1, boolean flag)
                {
                }

            
            {
                c = SkypeListFragment.this;
                a = fragmentactivity;
                b = recyclerview;
                super();
            }
            });
        }
    }

    public void setListShown(boolean flag)
    {
        if (dataLoadingProgressBar != null)
        {
            ProgressBar progressbar = dataLoadingProgressBar;
            byte byte0;
            if (flag)
            {
                byte0 = 8;
            } else
            {
                byte0 = 0;
            }
            progressbar.setVisibility(byte0);
        }
    }

    public void setUserVisibleHint(boolean flag)
    {
        super.setUserVisibleHint(flag);
        if (accessibilityUtil != null && accessibilityUtil.a() && flag && getListView() != null)
        {
            getListView().requestFocus();
        }
    }
}
