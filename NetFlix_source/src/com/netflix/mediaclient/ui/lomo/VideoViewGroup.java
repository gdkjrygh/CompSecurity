// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.CustomViewPager;
import com.netflix.mediaclient.servicemgr.Trackable;
import com.netflix.mediaclient.ui.common.PlayContextProvider;
import com.netflix.mediaclient.util.DataUtil;
import java.util.List;

public abstract class VideoViewGroup extends LinearLayout
{
    public static interface IVideoView
        extends PlayContextProvider
    {

        public abstract void hide();

        public abstract void update(Object obj, Trackable trackable, int i, boolean flag);
    }


    protected static final String TAG = "VideoViewGroup";

    public VideoViewGroup(Context context, boolean flag)
    {
        super(context);
        setId(0x7f070036);
        setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
        setOrientation(0);
        if (flag)
        {
            CustomViewPager.applyContentOverlapPadding((NetflixActivity)getContext(), this);
        }
    }

    protected abstract View createChildView(Context context);

    protected int getChildPaddingDimenResId()
    {
        return 0x7f0a0051;
    }

    public void init(int i)
    {
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -1, 1.0F);
        boolean flag = ((NetflixActivity)getContext()).isForKids();
        int k = getResources().getDimensionPixelOffset(getChildPaddingDimenResId());
        int j = 0;
        while (j < i) 
        {
            View view = createChildView(getContext());
            if (shouldApplyPaddingToChildren())
            {
                if (flag)
                {
                    view.setPadding(k, k / 2, k, k / 2);
                } else
                {
                    view.setPadding(k, k, k, k);
                }
            }
            addView(view, layoutparams);
            j++;
        }
    }

    protected abstract boolean shouldApplyPaddingToChildren();

    public void updateDataThenViews(List list, int i, int j, int k, Trackable trackable)
    {
        if (Log.isLoggable("VideoViewGroup", 2))
        {
            Log.v("VideoViewGroup", (new StringBuilder()).append("Setting data, first: ").append(DataUtil.getFirstItemSafely(list)).append(", hash: ").append(hashCode()).append(", num per page: ").append(i).append(", page: ").append(j).append(", listViewPos: ").append(k).toString());
        }
        int i1 = j * i;
        int l = 0;
        while (l < i) 
        {
            Object obj = getChildAt(l);
            if (obj == null)
            {
                Log.w("VideoViewGroup", (new StringBuilder()).append("Expected valid child but child is null, index: ").append(l).toString());
            } else
            {
                updateViewIds(((View) (obj)), k, i1, l);
                if (list != null && l < list.size())
                {
                    obj = (IVideoView)obj;
                    Object obj1 = list.get(l);
                    boolean flag;
                    if (j == 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    ((IVideoView) (obj)).update(obj1, trackable, i1 + l, flag);
                } else
                {
                    ((IVideoView)obj).hide();
                }
            }
            l++;
        }
    }

    protected abstract void updateViewIds(View view, int i, int j, int k);
}
