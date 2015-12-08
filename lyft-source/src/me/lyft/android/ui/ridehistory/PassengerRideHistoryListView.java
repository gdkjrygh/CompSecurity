// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ridehistory;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.IHandleBack;
import com.lyft.scoop.Scoop;
import java.util.List;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.studies.RideHistoryAnalytics;
import me.lyft.android.application.ridehistory.IPassengerRideHistoryService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.MenuButtonToolbar;
import me.lyft.android.controls.recycleview.HorizontalDividerDecoration;
import me.lyft.android.domain.ridehistory.PassengerRideHistory;
import me.lyft.android.domain.ridehistory.PassengerRideHistoryItem;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.SlideMenuController;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.ridehistory:
//            PassengerRideHistoryAdapter

public class PassengerRideHistoryListView extends LinearLayout
    implements IHandleBack
{

    AppFlow appFlow;
    private Binder binder;
    View emptyListContainer;
    private final Action1 goBackAction = new Action1() {

        final PassengerRideHistoryListView this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            passengerHistoryService.clearCachedRideHistory();
        }

            
            {
                this$0 = PassengerRideHistoryListView.this;
                super();
            }
    };
    private LinearLayoutManager layoutManager;
    private boolean loading;
    IPassengerRideHistoryService passengerHistoryService;
    private PassengerRideHistoryAdapter passengerRideHistoryAdapter;
    IProgressController progressController;
    Button retryButton;
    View retryViewContainer;
    RecyclerView rideHistoryRecyclerView;
    SlideMenuController slideMenuController;
    MenuButtonToolbar toolbar;
    IViewErrorHandler viewErrorHandler;

    public PassengerRideHistoryListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        passengerRideHistoryAdapter = null;
        loading = false;
        Scoop.a(this).b(this);
    }

    private void initRecyclerView()
    {
        rideHistoryRecyclerView.setHasFixedSize(true);
        rideHistoryRecyclerView.addItemDecoration(new HorizontalDividerDecoration(getResources().getDrawable(0x7f0201e3)));
        layoutManager = new LinearLayoutManager(getContext());
        rideHistoryRecyclerView.setLayoutManager(layoutManager);
        passengerRideHistoryAdapter = new PassengerRideHistoryAdapter(Scoop.a(this).a(getContext()));
        rideHistoryRecyclerView.setAdapter(passengerRideHistoryAdapter);
        rideHistoryRecyclerView.addOnScrollListener(new android.support.v7.widget.RecyclerView.OnScrollListener() {

            private static final int VISIBLE_THRESHOLD = 2;
            final PassengerRideHistoryListView this$0;

            public void onScrolled(RecyclerView recyclerview, int i, int j)
            {
                i = layoutManager.y();
                j = layoutManager.i();
                if (!loading && passengerRideHistoryAdapter.hasMore() && i <= j + 2)
                {
                    loadMore();
                }
            }

            
            {
                this$0 = PassengerRideHistoryListView.this;
                super();
            }
        });
    }

    private void loadMore()
    {
        if (loading)
        {
            return;
        } else
        {
            loading = true;
            final AsyncActionAnalytics loadMoreRideHistory = RideHistoryAnalytics.trackLoadMoreRideHistory();
            passengerRideHistoryAdapter.setHasError(false);
            binder.bind(passengerHistoryService.getPassengerHistory(passengerRideHistoryAdapter.getData().size()), new AsyncCall() {

                final PassengerRideHistoryListView this$0;
                final AsyncActionAnalytics val$loadMoreRideHistory;

                public void onFail(Throwable throwable)
                {
                    super.onFail(throwable);
                    loadMoreRideHistory.trackResponseFailure(throwable);
                    passengerRideHistoryAdapter.setHasError(true);
                }

                public volatile void onSuccess(Object obj)
                {
                    onSuccess((PassengerRideHistory)obj);
                }

                public void onSuccess(PassengerRideHistory passengerridehistory)
                {
                    super.onSuccess(passengerridehistory);
                    loadMoreRideHistory.trackResponseSuccess();
                    passengerRideHistoryAdapter.setHasMore(passengerridehistory.hasMore());
                    passengerRideHistoryAdapter.addItems(passengerridehistory.getRideHistory());
                }

                public void onUnsubscribe()
                {
                    super.onUnsubscribe();
                    loading = false;
                }

            
            {
                this$0 = PassengerRideHistoryListView.this;
                loadMoreRideHistory = asyncactionanalytics;
                super();
            }
            });
            return;
        }
    }

    private void loadRideHistory()
    {
        if (loading)
        {
            return;
        } else
        {
            loading = true;
            final AsyncActionAnalytics loadRideHistory = RideHistoryAnalytics.trackLoadRideHistory();
            progressController.showProgress();
            emptyListContainer.setVisibility(8);
            retryViewContainer.setVisibility(8);
            binder.bind(passengerHistoryService.getPassengerHistory(0), new AsyncCall() {

                final PassengerRideHistoryListView this$0;
                final AsyncActionAnalytics val$loadRideHistory;

                public void onFail(Throwable throwable)
                {
                    super.onFail(throwable);
                    loadRideHistory.trackResponseFailure(throwable);
                    emptyListContainer.setVisibility(8);
                    rideHistoryRecyclerView.setVisibility(8);
                    retryViewContainer.setVisibility(0);
                    viewErrorHandler.handle(throwable);
                }

                public volatile void onSuccess(Object obj)
                {
                    onSuccess((PassengerRideHistory)obj);
                }

                public void onSuccess(PassengerRideHistory passengerridehistory)
                {
                    super.onSuccess(passengerridehistory);
                    if (passengerridehistory.getRideHistory().size() > 0)
                    {
                        loadRideHistory.trackResponseSuccess();
                        emptyListContainer.setVisibility(8);
                        rideHistoryRecyclerView.setVisibility(0);
                    } else
                    {
                        emptyListContainer.setVisibility(0);
                        loadRideHistory.trackResponseSuccess("no rides");
                    }
                    passengerRideHistoryAdapter.setHasMore(passengerridehistory.hasMore());
                    passengerRideHistoryAdapter.setItems(passengerridehistory.getRideHistory());
                }

                public void onUnsubscribe()
                {
                    super.onUnsubscribe();
                    progressController.hideProgress();
                    loading = false;
                }

            
            {
                this$0 = PassengerRideHistoryListView.this;
                loadRideHistory = asyncactionanalytics;
                super();
            }
            });
            return;
        }
    }

    void loadItemsFromCache()
    {
        PassengerRideHistory passengerridehistory = passengerHistoryService.getCachedRideHistory();
        passengerRideHistoryAdapter.setItems(passengerridehistory.getRideHistory());
        passengerRideHistoryAdapter.setHasMore(passengerridehistory.hasMore());
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        }
        binder = Binder.attach(this);
        binder.bind(passengerRideHistoryAdapter.observeItemClicks(), new Action1() {

            final PassengerRideHistoryListView this$0;

            public volatile void call(Object obj)
            {
                call((PassengerRideHistoryItem)obj);
            }

            public void call(PassengerRideHistoryItem passengerridehistoryitem)
            {
                passengerridehistoryitem = passengerridehistoryitem.getId();
                RideHistoryAnalytics.trackIndividualItemTap(passengerridehistoryitem);
                appFlow.goTo(new RideHistoryScreens.PassengerRideHistoryDetailedScreen(passengerridehistoryitem));
            }

            
            {
                this$0 = PassengerRideHistoryListView.this;
                super();
            }
        });
        binder.bind(passengerRideHistoryAdapter.observeRetryClicks(), new Action1() {

            final PassengerRideHistoryListView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                loadMore();
            }

            
            {
                this$0 = PassengerRideHistoryListView.this;
                super();
            }
        });
        binder.bind(toolbar.observeHomeClick(), goBackAction);
        retryButton.setOnClickListener(new android.view.View.OnClickListener() {

            final PassengerRideHistoryListView this$0;

            public void onClick(View view)
            {
                loadRideHistory();
            }

            
            {
                this$0 = PassengerRideHistoryListView.this;
                super();
            }
        });
        toolbar.setTitle(getResources().getString(0x7f070310));
        loadItemsFromCache();
        if (passengerRideHistoryAdapter.getItemCount() <= 0)
        {
            loadRideHistory();
        } else
        {
            rideHistoryRecyclerView.setVisibility(0);
            emptyListContainer.setVisibility(8);
        }
        slideMenuController.enableMenu();
    }

    public boolean onBack()
    {
        goBackAction.call(Unit.create());
        return appFlow.goBack();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        slideMenuController.disableMenu();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            initRecyclerView();
            return;
        }
    }






/*
    static boolean access$302(PassengerRideHistoryListView passengerridehistorylistview, boolean flag)
    {
        passengerridehistorylistview.loading = flag;
        return flag;
    }

*/

}
