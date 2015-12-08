// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AbsListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.eventbus.HandlerRegistration;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.dynamicwidth.ScreenWidthSensitiveListView;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.android.apps.wallet.wobs.caching.WobCategory;
import com.google.android.apps.wallet.wobs.caching.WobHeadListByCategoryEvent;
import com.google.android.apps.wallet.wobs.caching.WobTailListByCategoryEvent;
import com.google.android.apps.wallet.wobs.caching.WobsManager;
import com.google.android.apps.wallet.wobs.list.WoblListAdapter;
import com.google.android.apps.wallet.wobs.provider.WobDeletionEvent;
import com.google.android.apps.wallet.wobs.provider.WobUpdateEvent;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            WobListFragment

public abstract class NewWobListFragment extends WobListFragment
{
    static final class ListLoadStatus extends Enum
    {

        private static final ListLoadStatus $VALUES[];
        public static final ListLoadStatus COMPLETE;
        public static final ListLoadStatus ERROR;
        public static final ListLoadStatus LOADING_TAIL;
        public static final ListLoadStatus PARTIALLY_LOADED;
        public static final ListLoadStatus UNINITIALIZED;

        public static ListLoadStatus valueOf(String s)
        {
            return (ListLoadStatus)Enum.valueOf(com/google/android/apps/wallet/wobs/NewWobListFragment$ListLoadStatus, s);
        }

        public static ListLoadStatus[] values()
        {
            return (ListLoadStatus[])$VALUES.clone();
        }

        static 
        {
            UNINITIALIZED = new ListLoadStatus("UNINITIALIZED", 0);
            PARTIALLY_LOADED = new ListLoadStatus("PARTIALLY_LOADED", 1);
            LOADING_TAIL = new ListLoadStatus("LOADING_TAIL", 2);
            COMPLETE = new ListLoadStatus("COMPLETE", 3);
            ERROR = new ListLoadStatus("ERROR", 4);
            $VALUES = (new ListLoadStatus[] {
                UNINITIALIZED, PARTIALLY_LOADED, LOADING_TAIL, COMPLETE, ERROR
            });
        }

        private ListLoadStatus(String s, int i)
        {
            super(s, i);
        }
    }


    private int itemPosition;
    private HandlerRegistration listHeadEventHandler;
    private ListLoadStatus listLoadStatus;
    private HandlerRegistration listTailEventHandler;
    ProgressBar loadingTailIndicator;
    NetworkAccessChecker networkAccessChecker;
    public FullScreenProgressSpinnerManager spinnerManager;
    private boolean userHasScrolled;
    private WobCategory wobCategory;
    private HandlerRegistration wobDeletionEventHandler;
    public WoblListAdapter wobListAdapter;
    private HandlerRegistration wobUpdateEventHandler;
    public WobsManager wobsManager;

    public NewWobListFragment(String s, String s1)
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wob_list_splash, s, s1);
        itemPosition = 0;
        userHasScrolled = false;
        listLoadStatus = ListLoadStatus.UNINITIALIZED;
    }

    private void onItemsAddedToListAdapter()
    {
        int i = 0;
        int j = listView.getFirstVisiblePosition();
        if (listView.getChildAt(0) != null)
        {
            i = listView.getChildAt(0).getTop();
        }
        listView.setAdapter(wobListAdapter);
        listView.setSelectionFromTop(j, i);
    }

    private void setListLoadStatusAndUpdateLoadingTailIndicator(ListLoadStatus listloadstatus)
    {
        listLoadStatus = listloadstatus;
        if (loadingTailIndicator == null)
        {
            return;
        }
        if (listLoadStatus == ListLoadStatus.PARTIALLY_LOADED || listLoadStatus == ListLoadStatus.LOADING_TAIL)
        {
            loadingTailIndicator.setVisibility(0);
            return;
        } else
        {
            loadingTailIndicator.setVisibility(8);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        wobCategory = WobCategory.labelOrdinalToCategory(Long.valueOf(selectedSubLabelOrdinal));
        if (bundle != null)
        {
            itemPosition = bundle.getInt("newWobListFragment:listPosition");
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = super.onCreateView(layoutinflater, viewgroup, bundle);
        listView.setAdapter(wobListAdapter);
        listView.setOnScrollListener(new android.widget.AbsListView.OnScrollListener() {

            final NewWobListFragment this$0;

            public final void onScroll(AbsListView abslistview, int i, int j, int k)
            {
                if (userHasScrolled && listLoadStatus == ListLoadStatus.PARTIALLY_LOADED && j > 0 && i + j == k)
                {
                    setListLoadStatusAndUpdateLoadingTailIndicator(ListLoadStatus.LOADING_TAIL);
                    wobsManager.fetchNextPage(wobCategory);
                }
            }

            public final void onScrollStateChanged(AbsListView abslistview, int i)
            {
                userHasScrolled = true;
            }

            
            {
                this$0 = NewWobListFragment.this;
                super();
            }
        });
        spinnerManager.show();
        layoutinflater = layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.wob_list_footer, null, false);
        loadingTailIndicator = (ProgressBar)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.progressBar);
        loadingTailIndicator.setVisibility(8);
        listView.addFooterView(layoutinflater);
        wobUpdateEventHandler = eventBus.register(this, com/google/android/apps/wallet/wobs/provider/WobUpdateEvent, new EventHandler() {

            final NewWobListFragment this$0;

            private void handleEvent(WobUpdateEvent wobupdateevent)
            {
                while (wobupdateevent.hasError() || wobupdateevent.getWobInstance().categoryId != null && wobCategory.getId() != wobupdateevent.getWobInstance().categoryId.intValue()) 
                {
                    return;
                }
                wobListAdapter.upsertInstance(wobupdateevent.getWobInstance());
                onItemsAddedToListAdapter();
            }

            public final volatile void handleEvent(Object obj)
            {
                handleEvent((WobUpdateEvent)obj);
            }

            
            {
                this$0 = NewWobListFragment.this;
                super();
            }
        });
        wobDeletionEventHandler = eventBus.register(this, com/google/android/apps/wallet/wobs/provider/WobDeletionEvent, new EventHandler() {

            final NewWobListFragment this$0;

            private void handleEvent(WobDeletionEvent wobdeletionevent)
            {
                while (wobdeletionevent.hasError() || wobdeletionevent.getWobInstance().categoryId != null && wobCategory.getId() != wobdeletionevent.getWobInstance().categoryId.intValue()) 
                {
                    return;
                }
                wobListAdapter.deleteWobById(wobdeletionevent.getWobInstance().id);
            }

            public final volatile void handleEvent(Object obj)
            {
                handleEvent((WobDeletionEvent)obj);
            }

            
            {
                this$0 = NewWobListFragment.this;
                super();
            }
        });
        return viewgroup;
    }

    public final void onDestroyView()
    {
        eventBus.unregister(new HandlerRegistration[] {
            wobUpdateEventHandler
        });
        eventBus.unregister(new HandlerRegistration[] {
            wobDeletionEventHandler
        });
        super.onDestroyView();
    }

    public final boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR tableswitch 24 24: default 24
    //                   24 30;
           goto _L1 _L2
_L1:
        return super.onOptionsItemSelected(menuitem);
_L2:
        if (networkAccessChecker.check())
        {
            spinnerManager.show();
            wobListAdapter.clear();
            setListLoadStatusAndUpdateLoadingTailIndicator(ListLoadStatus.UNINITIALIZED);
            analyticsUtil.sendListItemTap("RefreshWallet", new AnalyticsCustomDimension[0]);
            wobsManager.refresh(wobCategory);
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final void onPause()
    {
        eventBus.unregister(new HandlerRegistration[] {
            listHeadEventHandler, listTailEventHandler
        });
        super.onPause();
    }

    public final void onResume()
    {
        super.onResume();
        listHeadEventHandler = eventBus.register(this, com/google/android/apps/wallet/wobs/caching/WobHeadListByCategoryEvent, wobCategory, new EventHandler() {

            final NewWobListFragment this$0;

            private void handleEvent(WobHeadListByCategoryEvent wobheadlistbycategoryevent)
            {
                spinnerManager.hide();
                if (wobheadlistbycategoryevent.hasError())
                {
                    if (listLoadStatus == ListLoadStatus.UNINITIALIZED)
                    {
                        Toasts.show(getActivity(), com.google.android.apps.walletnfcrel.R.string.wobs_rendering_error_details);
                        setListLoadStatusAndUpdateLoadingTailIndicator(ListLoadStatus.ERROR);
                    }
                } else
                {
                    List list = wobheadlistbycategoryevent.getWobs();
                    if (list.isEmpty())
                    {
                        listView.setVisibility(8);
                        if (!wobCategory.hasSplashScreen())
                        {
                            emptyText.setText(wobCategory.getEmptyTextId().intValue());
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
                    if (listLoadStatus == ListLoadStatus.UNINITIALIZED || wobheadlistbycategoryevent.isHeadUpdated())
                    {
                        wobListAdapter.setInstances(list);
                        onItemsAddedToListAdapter();
                        if (listView.getCount() > itemPosition)
                        {
                            listView.setSelection(itemPosition);
                        }
                        if (wobheadlistbycategoryevent.moreToFetch())
                        {
                            setListLoadStatusAndUpdateLoadingTailIndicator(ListLoadStatus.PARTIALLY_LOADED);
                        } else
                        {
                            setListLoadStatusAndUpdateLoadingTailIndicator(ListLoadStatus.COMPLETE);
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

            
            {
                this$0 = NewWobListFragment.this;
                super();
            }
        });
        listTailEventHandler = eventBus.register(this, com/google/android/apps/wallet/wobs/caching/WobTailListByCategoryEvent, wobCategory, new EventHandler() {

            final NewWobListFragment this$0;

            private void handleEvent(WobTailListByCategoryEvent wobtaillistbycategoryevent)
            {
                if (wobtaillistbycategoryevent.hasError())
                {
                    Toasts.show(getActivity(), com.google.android.apps.walletnfcrel.R.string.wobs_rendering_error_details);
                    setListLoadStatusAndUpdateLoadingTailIndicator(ListLoadStatus.ERROR);
                    return;
                }
                wobListAdapter.addInstances(wobtaillistbycategoryevent.getWobs());
                onItemsAddedToListAdapter();
                if (wobtaillistbycategoryevent.moreToFetch())
                {
                    setListLoadStatusAndUpdateLoadingTailIndicator(ListLoadStatus.PARTIALLY_LOADED);
                    return;
                } else
                {
                    setListLoadStatusAndUpdateLoadingTailIndicator(ListLoadStatus.COMPLETE);
                    return;
                }
            }

            public final volatile void handleEvent(Object obj)
            {
                handleEvent((WobTailListByCategoryEvent)obj);
            }

            
            {
                this$0 = NewWobListFragment.this;
                super();
            }
        });
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (listView != null)
        {
            bundle.putInt("newWobListFragment:listPosition", listView.getFirstVisiblePosition());
        }
    }



/*
    static boolean access$002(NewWobListFragment newwoblistfragment, boolean flag)
    {
        newwoblistfragment.userHasScrolled = flag;
        return flag;
    }

*/





}
