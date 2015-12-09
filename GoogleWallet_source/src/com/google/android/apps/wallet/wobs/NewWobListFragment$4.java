// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.widgets.dynamicwidth.ScreenWidthSensitiveListView;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.android.apps.wallet.wobs.caching.WobCategory;
import com.google.android.apps.wallet.wobs.caching.WobHeadListByCategoryEvent;
import com.google.android.apps.wallet.wobs.list.WoblListAdapter;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            NewWobListFragment

final class this._cls0
    implements EventHandler
{

    final NewWobListFragment this$0;

    private void handleEvent(WobHeadListByCategoryEvent wobheadlistbycategoryevent)
    {
        spinnerManager.hide();
        if (wobheadlistbycategoryevent.hasError())
        {
            if (NewWobListFragment.access$100(NewWobListFragment.this) == stLoadStatus.UNINITIALIZED)
            {
                Toasts.show(getActivity(), com.google.android.apps.walletnfcrel.ng_error_details);
                NewWobListFragment.access$200(NewWobListFragment.this, stLoadStatus.ERROR);
            }
        } else
        {
            List list = wobheadlistbycategoryevent.getWobs();
            if (list.isEmpty())
            {
                listView.setVisibility(8);
                if (!NewWobListFragment.access$300(NewWobListFragment.this).hasSplashScreen())
                {
                    emptyText.setText(NewWobListFragment.access$300(NewWobListFragment.this).getEmptyTextId().intValue());
                    emptyText.setVisibility(0);
                    splashStub.setVisibility(8);
                } else
                {
                    splashStub.setVisibility(0);
                    emptyText.setVisibility(8);
                }
            } else
            {
                listView.setVisibility(0);
                splashStub.setVisibility(8);
                emptyText.setVisibility(8);
            }
            if (NewWobListFragment.access$100(NewWobListFragment.this) == stLoadStatus.UNINITIALIZED || wobheadlistbycategoryevent.isHeadUpdated())
            {
                wobListAdapter.setInstances(list);
                NewWobListFragment.access$400(NewWobListFragment.this);
                if (listView.getCount() > NewWobListFragment.access$500(NewWobListFragment.this))
                {
                    listView.setSelection(NewWobListFragment.access$500(NewWobListFragment.this));
                }
                if (wobheadlistbycategoryevent.moreToFetch())
                {
                    NewWobListFragment.access$200(NewWobListFragment.this, stLoadStatus.PARTIALLY_LOADED);
                } else
                {
                    NewWobListFragment.access$200(NewWobListFragment.this, stLoadStatus.COMPLETE);
                }
                if (gaTimingListLoaded != null || csiTimingListLoaded != null)
                {
                    analyticsUtil.endTiming(gaTimingListLoaded, csiTimingListLoaded);
                    return;
                }
            }
        }
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((WobHeadListByCategoryEvent)obj);
    }

    CategoryEvent()
    {
        this$0 = NewWobListFragment.this;
        super();
    }
}
