// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.LoadingStatus;
import com.netflix.mediaclient.android.fragment.LoadingView;
import com.netflix.mediaclient.android.widget.LoadingAndErrorWrapper;
import com.netflix.mediaclient.servicemgr.EpisodeDetails;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.SeasonDetails;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.util.ThreadUtils;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.details:
//            EpisodeListFrag, EpisodeRowView

public class EpisodeListAdapter extends BaseAdapter
    implements LoadingStatus, android.widget.AdapterView.OnItemClickListener
{
    private class FetchEpisodesCallback extends LoggingManagerCallback
    {

        private final int numItems;
        private final long requestId;
        final EpisodeListAdapter this$0;

        public void onEpisodesFetched(List list, int i)
        {
            super.onEpisodesFetched(list, i);
            if (activity.destroyed())
            {
                return;
            }
            if (requestId != EpisodeListAdapter.this.requestId)
            {
                Log.v("EpisodeListAdapter", "Ignoring stale request");
                return;
            }
            hasMoreData = true;
            isLoading = false;
            onLoaded(i);
            if (i != 0)
            {
                Log.w("EpisodeListAdapter", "Invalid status code");
                hasMoreData = false;
                onFetchError();
                return;
            }
            if (list == null || list.size() == 0)
            {
                Log.v("EpisodeListAdapter", "No details in response");
                hasMoreData = false;
                notifyDataSetChanged();
                return;
            }
            if (Log.isLoggable("EpisodeListAdapter", 2))
            {
                Log.v("EpisodeListAdapter", (new StringBuilder()).append("Got ").append(list.size()).append(" items, expected ").append(numItems).toString());
            }
            if (list.size() < numItems)
            {
                hasMoreData = false;
            }
            updateEpisodesData(list);
        }

        public FetchEpisodesCallback(long l, int i)
        {
            this$0 = EpisodeListAdapter.this;
            super("EpisodeListAdapter");
            requestId = l;
            numItems = i;
        }
    }


    public static final int FETCH_REQUEST_BATCH_SIZE = 40;
    private static final String TAG = "EpisodeListAdapter";
    private final NetflixActivity activity;
    private SeasonDetails currSeasonDetails;
    private final EpisodeListFrag episodeListFrag;
    private int episodeStartIndex;
    private final List episodes = new ArrayList();
    private boolean hasError;
    private boolean hasMoreData;
    private boolean isLoading;
    private final ViewGroup leViewGroup;
    private final LoadingAndErrorWrapper leWrapper;
    private final View loadingRow;
    protected com.netflix.mediaclient.android.app.LoadingStatus.LoadingStatusCallback mLoadingStatusCallback;
    private int prevCount;
    private long requestId;
    private int selectedEpisodeIndex;

    public EpisodeListAdapter(NetflixActivity netflixactivity, EpisodeListFrag episodelistfrag)
    {
        prevCount = -1;
        ThreadUtils.assertOnMain();
        activity = netflixactivity;
        episodeListFrag = episodelistfrag;
        leViewGroup = new FrameLayout(netflixactivity);
        netflixactivity.getLayoutInflater().inflate(0x7f030046, leViewGroup);
        leWrapper = new LoadingAndErrorWrapper(leViewGroup, new com.netflix.mediaclient.android.widget.ErrorWrapper.Callback() {

            final EpisodeListAdapter this$0;

            public void onRetryRequested()
            {
                initToLoadingState();
            }

            
            {
                this$0 = EpisodeListAdapter.this;
                super();
            }
        });
        leWrapper.hide(false);
        loadingRow = new LoadingView(netflixactivity);
        loadingRow.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
        initToLoadingState();
    }

    private void fetchMoreData()
    {
        ServiceManager servicemanager = episodeListFrag.getServiceManager();
        if (servicemanager == null || !servicemanager.isReady())
        {
            Log.d("EpisodeListAdapter", "Manager is not ready");
            return;
        }
        if (currSeasonDetails == null)
        {
            Log.v("EpisodeListAdapter", "No season details yet");
            return;
        }
        if (Log.isLoggable("EpisodeListAdapter", 2))
        {
            Log.v("EpisodeListAdapter", (new StringBuilder()).append("curr season number of episodes: ").append(currSeasonDetails.getNumOfEpisodes()).toString());
        }
        requestId = System.nanoTime();
        int i = (episodeStartIndex + 40) - 1;
        String s = currSeasonDetails.getId();
        if (Log.isLoggable("EpisodeListAdapter", 2))
        {
            Log.v("EpisodeListAdapter", (new StringBuilder()).append("Fetching data for: ").append(s).append(", start: ").append(episodeStartIndex).append(", end: ").append(i).toString());
        }
        servicemanager.fetchEpisodes(s, episodeStartIndex, i, new FetchEpisodesCallback(requestId, (i - episodeStartIndex) + 1));
    }

    private void initToLoadingState()
    {
        Log.v("EpisodeListAdapter", "initToLoadingState");
        isLoading = true;
        hasMoreData = true;
        hasError = false;
        requestId = -1L;
        episodeStartIndex = 0;
        episodes.clear();
        notifyDataSetChanged();
        fetchMoreData();
    }

    private void onFetchError()
    {
        Log.d("EpisodeListAdapter", "Fetch error");
        hasError = true;
        notifyDataSetChanged();
    }

    private void updateEpisodesData(List list)
    {
        Log.v("EpisodeListAdapter", (new StringBuilder()).append("Adding episodes, count: ").append(list.size()).toString());
        hasError = false;
        episodes.addAll(list);
        episodeStartIndex = episodeStartIndex + list.size();
        notifyDataSetChanged();
    }

    public int getCount()
    {
        int i;
        if (hasError)
        {
            i = 1;
        } else
        {
            int j = episodes.size();
            if (hasMoreData)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            i = j + i;
        }
        if (Log.isLoggable("EpisodeListAdapter", 2) && prevCount != i)
        {
            prevCount = i;
            Log.v("EpisodeListAdapter", (new StringBuilder()).append("getCount() result changed to: ").append(i).toString());
        }
        return i;
    }

    public EpisodeDetails getItem(int i)
    {
        return (EpisodeDetails)episodes.get(i);
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        boolean flag;
label0:
        {
            flag = false;
            if (activity.destroyed())
            {
                return loadingRow;
            }
            if (Log.isLoggable("EpisodeListAdapter", 2))
            {
                Log.v("EpisodeListAdapter", (new StringBuilder()).append("getting View, hasError: ").append(hasError).append(", hasMoreData: ").append(hasMoreData).append(", eps: ").append(episodes.size()).toString());
            }
            if (hasError)
            {
                leWrapper.showErrorView(false);
                return leViewGroup;
            }
            leWrapper.hide(false);
            if (hasMoreData && i == getCount() - 1)
            {
                return loadingRow;
            }
            if (hasMoreData && i == getCount() - 20)
            {
                fetchMoreData();
            }
            if (view != null)
            {
                viewgroup = view;
                if (view instanceof EpisodeRowView)
                {
                    break label0;
                }
            }
            viewgroup = new EpisodeRowView(activity);
        }
        view = (EpisodeDetails)episodes.get(i);
        if (Log.isLoggable("EpisodeListAdapter", 2))
        {
            Log.v("EpisodeListAdapter", (new StringBuilder()).append("updating: ").append(view.getTitle()).append(", pos/curr: ").append(i).append("/").append(selectedEpisodeIndex).toString());
        }
        EpisodeRowView episoderowview = (EpisodeRowView)viewgroup;
        if (i == selectedEpisodeIndex)
        {
            flag = true;
        }
        episoderowview.updateToEpisode(view, flag);
        return viewgroup;
    }

    public boolean isLoadingData()
    {
        return isLoading;
    }

    public void notifyDataSetChanged()
    {
        Log.v("EpisodeListAdapter", "Notifying data set changed...");
        super.notifyDataSetChanged();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (!view.isInTouchMode())
        {
            ((EpisodeRowView)view).handleItemClick();
        }
    }

    protected void onLoaded(int i)
    {
        if (mLoadingStatusCallback != null)
        {
            mLoadingStatusCallback.onDataLoaded(i);
        }
    }

    public void setLoadingStatusCallback(com.netflix.mediaclient.android.app.LoadingStatus.LoadingStatusCallback loadingstatuscallback)
    {
        if (!isLoadingData() && loadingstatuscallback != null)
        {
            loadingstatuscallback.onDataLoaded(0);
            return;
        } else
        {
            mLoadingStatusCallback = loadingstatuscallback;
            return;
        }
    }

    public void updateSeasonDetails(SeasonDetails seasondetails)
    {
        if (Log.isLoggable("EpisodeListAdapter", 2))
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("Updating season details: ");
            String s;
            if (seasondetails == null)
            {
                s = "n/a";
            } else
            {
                s = seasondetails.getTitle();
            }
            Log.v("EpisodeListAdapter", stringbuilder.append(s).toString());
        }
        if (seasondetails == null)
        {
            return;
        } else
        {
            currSeasonDetails = seasondetails;
            selectedEpisodeIndex = currSeasonDetails.getCurrentEpisodeNumber() - 1;
            initToLoadingState();
            return;
        }
    }





/*
    static boolean access$302(EpisodeListAdapter episodelistadapter, boolean flag)
    {
        episodelistadapter.hasMoreData = flag;
        return flag;
    }

*/


/*
    static boolean access$402(EpisodeListAdapter episodelistadapter, boolean flag)
    {
        episodelistadapter.isLoading = flag;
        return flag;
    }

*/


}
