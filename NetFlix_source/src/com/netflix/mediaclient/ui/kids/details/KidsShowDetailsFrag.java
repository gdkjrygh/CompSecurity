// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.details;

import android.app.Activity;
import android.app.Fragment;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.LoadingAndErrorWrapper;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.ShowDetails;
import com.netflix.mediaclient.ui.kids.KidsUtils;
import com.netflix.mediaclient.util.gfx.AnimationUtils;
import java.util.List;
import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

// Referenced classes of package com.netflix.mediaclient.ui.kids.details:
//            KidsShowDetailsAdapter, KidsDetailsViewGroup

public class KidsShowDetailsFrag extends NetflixFrag
{
    private class FetchSeasonsCallback extends LoggingManagerCallback
    {

        private final long requestId;
        final KidsShowDetailsFrag this$0;

        public void onSeasonsFetched(List list, int i)
        {
            super.onSeasonsFetched(list, i);
            if (requestId != KidsShowDetailsFrag.this.requestId)
            {
                Log.v("KidsShowDetailsFrag", "Stale request - ignoring");
                return;
            }
            isLoading = false;
            if (i != 0)
            {
                Log.w("KidsShowDetailsFrag", "Invalid status code");
                showErrorView();
                return;
            }
            if (list == null)
            {
                Log.v("KidsShowDetailsFrag", "No details in response");
                showErrorView();
                return;
            } else
            {
                updateSeasonData(list);
                return;
            }
        }

        public FetchSeasonsCallback(long l)
        {
            this$0 = KidsShowDetailsFrag.this;
            super("KidsShowDetailsFrag");
            requestId = l;
        }
    }

    private class FetchShowDetailsCallback extends LoggingManagerCallback
    {

        private final long requestId;
        final KidsShowDetailsFrag this$0;

        public void onShowDetailsFetched(ShowDetails showdetails, int i)
        {
            super.onShowDetailsFetched(showdetails, i);
            if (requestId != KidsShowDetailsFrag.this.requestId)
            {
                Log.v("KidsShowDetailsFrag", "Ignoring stale callback");
                return;
            }
            if (i != 0)
            {
                Log.w("KidsShowDetailsFrag", "Invalid status code");
                showErrorView();
                return;
            }
            if (showdetails == null)
            {
                Log.v("KidsShowDetailsFrag", "No details in response");
                showErrorView();
                return;
            } else
            {
                updateShowDetails(showdetails);
                return;
            }
        }

        public FetchShowDetailsCallback(long l)
        {
            this$0 = KidsShowDetailsFrag.this;
            super("KidsShowDetailsFrag");
            requestId = l;
        }
    }


    private static final String EXTRA_SHOW_ID = "extra_show_id";
    private static final String TAG = "KidsShowDetailsFrag";
    private KidsShowDetailsAdapter adapter;
    private View content;
    private KidsDetailsViewGroup detailsViewGroup;
    private final BroadcastReceiver episodeRefreshReceiver = new BroadcastReceiver() {

        final KidsShowDetailsFrag this$0;

        public void onReceive(Context context, Intent intent)
        {
            if (!isDestroyed())
            {
                context = intent.getAction();
                Log.v("KidsShowDetailsFrag", (new StringBuilder()).append("receiver inovoked, action: ").append(context).toString());
                if ("com.netflix.mediaclient.intent.action.BA_EPISODE_REFRESH".equals(context))
                {
                    return;
                }
            }
        }

            
            {
                this$0 = KidsShowDetailsFrag.this;
                super();
            }
    };
    private boolean isLoading;
    private LoadingAndErrorWrapper leWrapper;
    private StickyListHeadersListView listView;
    private ServiceManager manager;
    private long requestId;
    private ShowDetails showDetails;
    private String showId;

    public KidsShowDetailsFrag()
    {
    }

    private void completeInitIfPossible()
    {
        if (getActivity() == null)
        {
            Log.v("KidsShowDetailsFrag", "Can't complete init yet - activity is null");
            return;
        }
        if (manager == null)
        {
            Log.v("KidsShowDetailsFrag", "Can't complete init yet - manager is null");
            return;
        }
        if (content == null)
        {
            Log.v("KidsShowDetailsFrag", "Can't complete init yet - details view is null");
            return;
        }
        if (showId == null)
        {
            Log.v("KidsShowDetailsFrag", "Can't complete init yet - showId is null");
            return;
        } else
        {
            Log.v("KidsShowDetailsFrag", "All clear - completing init process...");
            fetchShowDetails();
            return;
        }
    }

    public static Fragment create(String s)
    {
        KidsShowDetailsFrag kidsshowdetailsfrag = new KidsShowDetailsFrag();
        Bundle bundle = new Bundle();
        bundle.putString("extra_show_id", s);
        kidsshowdetailsfrag.setArguments(bundle);
        return kidsshowdetailsfrag;
    }

    private void fetchSeasonDetails()
    {
        if (manager == null)
        {
            Log.w("KidsShowDetailsFrag", "Manager is null - can't get season details");
            return;
        } else
        {
            requestId = System.nanoTime();
            int i = showDetails.getNumOfSeasons() - 1;
            Log.v("KidsShowDetailsFrag", (new StringBuilder()).append("Fetching seasons data from: ").append(0).append(" to ").append(i).append(", id: ").append(requestId).toString());
            manager.fetchSeasons(showDetails.getId(), 0, i, new FetchSeasonsCallback(requestId));
            return;
        }
    }

    private void fetchShowDetails()
    {
        if (manager == null)
        {
            Log.w("KidsShowDetailsFrag", "Manager is null - can't get show details");
            return;
        } else
        {
            showLoadingView();
            isLoading = true;
            requestId = System.nanoTime();
            Log.v("KidsShowDetailsFrag", (new StringBuilder()).append("Fetching data for show ID: ").append(showId).toString());
            manager.fetchShowDetails(showId, null, new FetchShowDetailsCallback(requestId));
            return;
        }
    }

    private void showErrorView()
    {
        leWrapper.showErrorView(true);
        AnimationUtils.hideView(listView, true);
    }

    private void showLoadingView()
    {
        leWrapper.showLoadingView(true);
        AnimationUtils.hideView(listView, true);
    }

    private void showStandardViews()
    {
        leWrapper.hide(true);
        AnimationUtils.showView(listView, true);
    }

    private void updateSeasonData(List list)
    {
        adapter = new KidsShowDetailsAdapter(this, showDetails, list);
        listView.setAdapter(adapter);
        listView.setOnScrollListener(adapter);
        showStandardViews();
    }

    private void updateShowDetails(ShowDetails showdetails)
    {
        Log.v("KidsShowDetailsFrag", (new StringBuilder()).append("Updating show details: ").append(showdetails.getTitle()).toString());
        showDetails = showdetails;
        detailsViewGroup.updateDetails(showdetails);
        fetchSeasonDetails();
    }

    public StickyListHeadersListView getListView()
    {
        return listView;
    }

    public boolean isLoadingData()
    {
        return isLoading || adapter != null && adapter.isLoading();
    }

    public void onActivityCreated(Bundle bundle)
    {
        Log.v("KidsShowDetailsFrag", "onActivityCreated");
        super.onActivityCreated(bundle);
        completeInitIfPossible();
    }

    public void onCreate(Bundle bundle)
    {
        showId = getArguments().getString("extra_show_id");
        super.onCreate(bundle);
        getActivity().registerReceiver(episodeRefreshReceiver, new IntentFilter("com.netflix.mediaclient.intent.action.BA_EPISODE_REFRESH"));
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        content = layoutinflater.inflate(0x7f030044, null);
        listView = (StickyListHeadersListView)content.findViewById(0x102000a);
        KidsUtils.configureListViewForKids(getNetflixActivity(), listView);
        detailsViewGroup = new KidsDetailsViewGroup(getActivity());
        listView.addHeaderView(detailsViewGroup, null, false);
        leWrapper = new LoadingAndErrorWrapper(content, new com.netflix.mediaclient.android.widget.ErrorWrapper.Callback() {

            final KidsShowDetailsFrag this$0;

            public void onRetryRequested()
            {
                showLoadingView();
                fetchShowDetails();
            }

            
            {
                this$0 = KidsShowDetailsFrag.this;
                super();
            }
        });
        return content;
    }

    public void onDestroy()
    {
        super.onDestroy();
        getActivity().unregisterReceiver(episodeRefreshReceiver);
    }

    public void onManagerReady(ServiceManager servicemanager, int i)
    {
        Log.v("KidsShowDetailsFrag", "onManagerReady");
        super.onManagerReady(servicemanager, i);
        manager = servicemanager;
        completeInitIfPossible();
    }

    public void onManagerUnavailable(ServiceManager servicemanager, int i)
    {
        super.onManagerUnavailable(servicemanager, i);
        manager = null;
    }








/*
    static boolean access$602(KidsShowDetailsFrag kidsshowdetailsfrag, boolean flag)
    {
        kidsshowdetailsfrag.isLoading = flag;
        return flag;
    }

*/

}
