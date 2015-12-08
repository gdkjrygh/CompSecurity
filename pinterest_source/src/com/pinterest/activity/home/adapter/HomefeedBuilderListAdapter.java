// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.pinterest.activity.home.view.HomefeedBuilderListCell;
import com.pinterest.api.model.Interest;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.InterestImpression;
import com.pinterest.ui.ViewHelper;
import java.util.ArrayList;

// Referenced classes of package com.pinterest.activity.home.adapter:
//            HomefeedBuilderBaseAdapter

public class HomefeedBuilderListAdapter extends HomefeedBuilderBaseAdapter
{

    public static final int SCROLL_UP_ON_DISMISSAL_ANIMATION_DURATION = Resources.integer(0x7f0d000c).intValue();

    public HomefeedBuilderListAdapter()
    {
    }

    public int getItemSpan(int i)
    {
        return 10;
    }

    public View getView(int i, final View gridCell, ViewGroup viewgroup, boolean flag)
    {
        gridCell = HomefeedBuilderListCell.from(gridCell, ViewHelper.getContext(gridCell, viewgroup));
        viewgroup = (Interest)getItem(i);
        gridCell.setInterest(viewgroup, flag);
        gridCell.setMode(_mode);
        gridCell.setIndexOfInterest(i);
        if (!flag)
        {
            loadMore(i);
            InterestImpression interestimpression = new InterestImpression();
            interestimpression.setKey(viewgroup.getKey());
            interestimpression.setImageSignature(viewgroup.getImageSignature());
            interestimpression.setListPosition((short)i);
            _impressions.add(interestimpression);
        }
        if (viewgroup.getShouldAnimateOnAppear() && !flag)
        {
            viewgroup.setShouldAnimateOnAppear(false);
            gridCell.getViewTreeObserver().addOnGlobalLayoutListener(new _cls1());
        }
        return gridCell;
    }

    protected boolean shouldLoadMore(int i)
    {
        while (_loading || i < getCount() - LOAD_MORE_INDEX) 
        {
            return false;
        }
        return true;
    }


    private class _cls1
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        final HomefeedBuilderListAdapter this$0;
        final HomefeedBuilderListCell val$gridCell;

        public void onGlobalLayout()
        {
            if (gridCell.getViewTreeObserver().isAlive())
            {
                ObjectAnimator objectanimator;
                if (android.os.Build.VERSION.SDK_INT < 16)
                {
                    gridCell.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                } else
                {
                    gridCell.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                objectanimator = ObjectAnimator.ofFloat(gridCell, "translationY", new float[] {
                    (float)gridCell.getHeight(), 0.0F
                });
                objectanimator.setDuration(HomefeedBuilderListAdapter.SCROLL_UP_ON_DISMISSAL_ANIMATION_DURATION);
                objectanimator.setInterpolator(new DecelerateInterpolator());
                objectanimator.start();
            }
        }

        _cls1()
        {
            this$0 = HomefeedBuilderListAdapter.this;
            gridCell = homefeedbuilderlistcell;
            super();
        }
    }

}
