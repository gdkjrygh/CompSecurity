// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.android.widget.LoadingAndErrorWrapper;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.ManagerStatusListener;
import com.netflix.mediaclient.servicemgr.SeasonDetails;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.ShowDetails;
import com.netflix.mediaclient.util.ViewUtils;
import com.netflix.mediaclient.util.gfx.AnimationUtils;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.details:
//            VideoDetailsViewGroup, DetailsActivity, SeasonsSpinner, EpisodeListAdapter

public class EpisodeListFrag extends NetflixDialogFrag
    implements com.netflix.mediaclient.android.widget.ErrorWrapper.Callback, com.netflix.mediaclient.ui.mdx.MdxMiniPlayerFrag.MdxMiniPlayerDialog, ManagerStatusListener
{
    private class FetchSeasonsCallback extends LoggingManagerCallback
    {

        private final long requestId;
        final EpisodeListFrag this$0;

        public void onSeasonsFetched(List list, int i)
        {
            super.onSeasonsFetched(list, i);
            if (requestId != EpisodeListFrag.this.requestId)
            {
                Log.v("EpisodeListFrag", "Stale request - ignoring");
                return;
            }
            isLoading = false;
            if (i != 0)
            {
                Log.w("EpisodeListFrag", "Invalid status code");
                showErrorView();
                return;
            }
            if (list == null)
            {
                Log.v("EpisodeListFrag", "No details in response");
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
            this$0 = EpisodeListFrag.this;
            super("EpisodeListFrag");
            requestId = l;
        }
    }

    private class FetchShowDetailsCallback extends LoggingManagerCallback
    {

        private final long requestId;
        final EpisodeListFrag this$0;

        public void onShowDetailsFetched(ShowDetails showdetails, int i)
        {
            super.onShowDetailsFetched(showdetails, i);
            if (requestId != EpisodeListFrag.this.requestId)
            {
                Log.v("EpisodeListFrag", "Ignoring stale callback");
                return;
            }
            if (i != 0)
            {
                Log.w("EpisodeListFrag", "Invalid status code");
                showErrorView();
                return;
            }
            if (showdetails == null)
            {
                Log.v("EpisodeListFrag", "No details in response");
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
            this$0 = EpisodeListFrag.this;
            super("EpisodeListFrag");
            requestId = l;
        }
    }


    private static final String EXTRA_EPISODE_ID = "extra_episode_id";
    private static final String EXTRA_EPISODE_INDEX = "extra_episode_index";
    private static final String EXTRA_SEASON_INDEX = "extra_season_index";
    private static final String EXTRA_SHOW_DETAILS = "extra_show_details";
    private static final String EXTRA_SHOW_ID = "extra_show_id";
    private static final String TAG = "EpisodeListFrag";
    private EpisodeListAdapter adapter;
    private com.netflix.mediaclient.servicemgr.AddToListData.StateListener addToListWrapper;
    private int currEpisodeIndex;
    private int currSeasonIndex;
    private VideoDetailsViewGroup detailsViewGroup;
    private String episodeId;
    private final BroadcastReceiver episodeRefreshReceiver = new BroadcastReceiver() {

        final EpisodeListFrag this$0;

        public void onReceive(Context context, Intent intent)
        {
            if (!isDestroyed())
            {
                context = intent.getAction();
                Log.v("EpisodeListFrag", (new StringBuilder()).append("receiver inovoked, action: ").append(context).toString());
                if ("com.netflix.mediaclient.intent.action.BA_EPISODE_REFRESH".equals(context))
                {
                    int j = intent.getIntExtra("curSeasonNumber", 1) - 1;
                    int i = spinner.getSelectedItemPosition();
                    if (j != i)
                    {
                        Log.v("EpisodeListFrag", (new StringBuilder()).append("Notification is for season ").append(j).append(" but spinner set to season ").append(i).toString());
                        return;
                    } else
                    {
                        int k = intent.getIntExtra("curEpisodeNumber", 1) - 1;
                        int l = k + listView.getHeaderViewsCount();
                        Log.v("EpisodeListFrag", (new StringBuilder()).append("Episode index: ").append(k).append(", setting current episode to: ").append(l).toString());
                        listView.setItemChecked(l, true);
                        context = (SeasonDetails)spinner.getItemAtPosition(i);
                        adapter.updateSeasonDetails(context);
                        return;
                    }
                }
            }
        }

            
            {
                this$0 = EpisodeListFrag.this;
                super();
            }
    };
    private final com.netflix.mediaclient.android.widget.ErrorWrapper.Callback errorCallback = new com.netflix.mediaclient.android.widget.ErrorWrapper.Callback() {

        final EpisodeListFrag this$0;

        public void onRetryRequested()
        {
            Activity activity = getActivity();
            if (activity instanceof com.netflix.mediaclient.android.widget.ErrorWrapper.Callback)
            {
                ((com.netflix.mediaclient.android.widget.ErrorWrapper.Callback)activity).onRetryRequested();
            }
        }

            
            {
                this$0 = EpisodeListFrag.this;
                super();
            }
    };
    private Handler handler;
    private boolean isLoading;
    private LoadingAndErrorWrapper leWrapper;
    private ListView listView;
    private ServiceManager manager;
    private long requestId;
    private ShowDetails showDetails;
    private boolean showDetailsOnLaunch;
    private String showId;
    private SeasonsSpinner spinner;
    private ViewGroup spinnerViewGroup;

    public EpisodeListFrag()
    {
        isLoading = true;
        currSeasonIndex = -1;
        currEpisodeIndex = -1;
    }

    private static NetflixDialogFrag applyCreateArgs(NetflixDialogFrag netflixdialogfrag, String s, String s1, boolean flag)
    {
        Log.v("EpisodeListFrag", (new StringBuilder()).append("Creating frag for show ID: ").append(s).toString());
        Bundle bundle = new Bundle();
        bundle.putString("extra_show_id", s);
        bundle.putString("extra_episode_id", s1);
        bundle.putBoolean("extra_show_details", flag);
        netflixdialogfrag.setArguments(bundle);
        return netflixdialogfrag;
    }

    private void completeInitIfPossible()
    {
        if (getActivity() == null)
        {
            Log.v("EpisodeListFrag", "Can't complete init yet - activity is null");
            return;
        }
        if (manager == null)
        {
            Log.v("EpisodeListFrag", "Can't complete init yet - manager is null");
            return;
        }
        if (detailsViewGroup == null)
        {
            Log.v("EpisodeListFrag", "Can't complete init yet - details view is null");
            return;
        }
        if (showId == null)
        {
            Log.v("EpisodeListFrag", "Can't complete init yet - showId is null");
            return;
        }
        Log.v("EpisodeListFrag", "All clear - completing init process...");
        android.widget.TextView textview = detailsViewGroup.getAddToMyListButton();
        if ((getActivity() instanceof DetailsActivity) && textview != null)
        {
            addToListWrapper = manager.createAddToMyListWrapper((DetailsActivity)getActivity(), textview);
            manager.registerAddToMyListListener(showId, addToListWrapper);
        }
        fetchShowDetails();
    }

    public static NetflixDialogFrag create(String s, String s1, boolean flag)
    {
        EpisodeListFrag episodelistfrag = new EpisodeListFrag();
        episodelistfrag.setStyle(1, 0x7f0d00cb);
        return applyCreateArgs(episodelistfrag, s, s1, flag);
    }

    private ViewGroup createSeasonsSpinnerGroup()
    {
        spinner = new SeasonsSpinner(getActivity());
        spinner.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final EpisodeListFrag this$0;

            public void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                Log.v("EpisodeListFrag", (new StringBuilder()).append("Season spinner selected position: ").append(i).toString());
                adapterview = (SeasonDetails)spinner.getItemAtPosition(i);
                if (adapterview == null)
                {
                    Log.w("EpisodeListFrag", (new StringBuilder()).append("null season details retrieved for position: ").append(i).toString());
                }
                adapter.updateSeasonDetails(adapterview);
                currEpisodeIndex = -1;
                updateEpisodeSelection();
            }

            public void onNothingSelected(AdapterView adapterview)
            {
                Log.v("EpisodeListFrag", "Season spinner - Nothing selected");
            }

            
            {
                this$0 = EpisodeListFrag.this;
                super();
            }
        });
        spinnerViewGroup = new FrameLayout(getActivity());
        spinnerViewGroup.setBackgroundResource(0x7f090056);
        spinnerViewGroup.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
        spinnerViewGroup.addView(spinner, new android.widget.FrameLayout.LayoutParams(-2, -2));
        return spinnerViewGroup;
    }

    private void fetchSeasonDetails()
    {
        if (manager == null)
        {
            Log.w("EpisodeListFrag", "Manager is null - can't get season details");
            return;
        } else
        {
            requestId = System.nanoTime();
            int i = showDetails.getNumOfSeasons() - 1;
            Log.v("EpisodeListFrag", (new StringBuilder()).append("Fetching seasons data from: ").append(0).append(" to ").append(i).append(", id: ").append(requestId).toString());
            manager.fetchSeasons(showDetails.getId(), 0, i, new FetchSeasonsCallback(requestId));
            return;
        }
    }

    private void fetchShowDetails()
    {
        if (manager == null)
        {
            Log.w("EpisodeListFrag", "Manager is null - can't get show details");
            return;
        } else
        {
            showLoadingView();
            isLoading = true;
            requestId = System.nanoTime();
            Log.v("EpisodeListFrag", (new StringBuilder()).append("Fetching data for show ID: ").append(showId).toString());
            manager.fetchShowDetails(showId, episodeId, new FetchShowDetailsCallback(requestId));
            return;
        }
    }

    private void postSetSpinnerSelectionRunnable()
    {
        handler.post(new Runnable() {

            final EpisodeListFrag this$0;

            public void run()
            {
                int j = currSeasonIndex;
                int i = j;
                if (j == -1)
                {
                    i = spinner.getSeasonIndexBySeasonNumber(showDetails.getCurrentSeasonNumber());
                }
                if (i < 0)
                {
                    Log.v("EpisodeListFrag", "No valid season index found");
                    return;
                } else
                {
                    Log.v("EpisodeListFrag", (new StringBuilder()).append("Setting current season to: ").append(i).toString());
                    spinner.setSelection(i);
                    return;
                }
            }

            
            {
                this$0 = EpisodeListFrag.this;
                super();
            }
        });
    }

    private void registerEpisodeRefreshReceiver()
    {
        getActivity().registerReceiver(episodeRefreshReceiver, new IntentFilter("com.netflix.mediaclient.intent.action.BA_EPISODE_REFRESH"));
    }

    private void showErrorView()
    {
        isLoading = false;
        leWrapper.showErrorView(false);
        AnimationUtils.hideView(listView, false);
    }

    private void showLoadingView()
    {
        leWrapper.showLoadingView(false);
        listView.setVisibility(4);
    }

    private void showStandardViews()
    {
        leWrapper.hide(false);
        if (!isListVisible())
        {
            AnimationUtils.showView(listView, true);
        }
        postSetSpinnerSelectionRunnable();
        updateEpisodeSelection();
    }

    private void updateEpisodeSelection()
    {
        if (currEpisodeIndex == -1)
        {
            SeasonDetails seasondetails = (SeasonDetails)spinner.getItemAtPosition(spinner.getSelectedItemPosition());
            if (seasondetails != null)
            {
                currEpisodeIndex = (seasondetails.getCurrentEpisodeNumber() - 1) + listView.getHeaderViewsCount();
            }
        }
        Log.v("EpisodeListFrag", (new StringBuilder()).append("selectedEpIndex: ").append(currEpisodeIndex).toString());
        listView.setItemChecked(currEpisodeIndex, true);
    }

    private void updateSeasonData(List list)
    {
        spinner.updateSeasonData(list);
        showStandardViews();
    }

    private void updateShowDetails(ShowDetails showdetails)
    {
        Log.v("EpisodeListFrag", (new StringBuilder()).append("Updating show details: ").append(showdetails.getTitle()).toString());
        showDetails = showdetails;
        detailsViewGroup.updateDetails(showdetails, new ShowDetailsFrag.ShowDetailsStringProvider(getActivity(), showdetails));
        fetchSeasonDetails();
    }

    ServiceManager getServiceManager()
    {
        return manager;
    }

    public void hideDetailViewHeader()
    {
        detailsViewGroup.setVisibility(8);
    }

    protected boolean isListVisible()
    {
        return listView.getVisibility() == 0;
    }

    public boolean isLoadingData()
    {
        return isLoading || adapter.isLoadingData();
    }

    public void onActivityCreated(Bundle bundle)
    {
        Log.v("EpisodeListFrag", "onActivityCreated");
        super.onActivityCreated(bundle);
        completeInitIfPossible();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        super.onCancel(dialoginterface);
        dialoginterface = getActivity();
        if (dialoginterface instanceof com.netflix.mediaclient.android.fragment.NetflixDialogFrag.DialogCanceledListenerProvider)
        {
            dialoginterface = ((com.netflix.mediaclient.android.fragment.NetflixDialogFrag.DialogCanceledListenerProvider)dialoginterface).getDialogCanceledListener();
            if (dialoginterface != null)
            {
                dialoginterface.onDialogCanceled(this);
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        handler = new Handler();
        showId = getArguments().getString("extra_show_id");
        episodeId = getArguments().getString("extra_episode_id");
        showDetailsOnLaunch = getArguments().getBoolean("extra_show_details");
        if (bundle != null)
        {
            currSeasonIndex = bundle.getInt("extra_season_index");
            currEpisodeIndex = bundle.getInt("extra_episode_index");
            Log.v("EpisodeListFrag", (new StringBuilder()).append("Restored season index as: ").append(currSeasonIndex).append(", episode: ").append(currEpisodeIndex).toString());
        }
        super.onCreate(bundle);
        registerEpisodeRefreshReceiver();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        Log.v("EpisodeListFrag", "onCreateView called");
        layoutinflater = layoutinflater.inflate(0x7f030045, null, false);
        leWrapper = new LoadingAndErrorWrapper(layoutinflater, errorCallback);
        listView = (ListView)layoutinflater.findViewById(0x102000a);
        listView.setChoiceMode(1);
        listView.setDivider(null);
        listView.setFocusable(false);
        listView.setVerticalScrollBarEnabled(false);
        ViewUtils.addActionBarPaddingView(listView);
        detailsViewGroup = new VideoDetailsViewGroup(getActivity());
        detailsViewGroup.removeActionBarDummyView();
        viewgroup = new LinearLayout(getActivity());
        viewgroup.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
        viewgroup.setOrientation(1);
        viewgroup.addView(detailsViewGroup);
        listView.addHeaderView(viewgroup);
        if (showDetailsOnLaunch)
        {
            showDetailViewHeader();
        } else
        {
            hideDetailViewHeader();
        }
        spinnerViewGroup = createSeasonsSpinnerGroup();
        listView.addHeaderView(spinnerViewGroup);
        listView.setVisibility(4);
        adapter = new EpisodeListAdapter((NetflixActivity)getActivity(), this);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(adapter);
        return layoutinflater;
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (manager != null && addToListWrapper != null)
        {
            manager.unregisterAddToMyListListener(showId, addToListWrapper);
        }
        getActivity().unregisterReceiver(episodeRefreshReceiver);
    }

    public void onManagerReady(ServiceManager servicemanager, int i)
    {
        Log.v("EpisodeListFrag", "onManagerReady");
        super.onManagerReady(servicemanager, i);
        manager = servicemanager;
        completeInitIfPossible();
    }

    public void onManagerUnavailable(ServiceManager servicemanager, int i)
    {
        super.onManagerUnavailable(servicemanager, i);
        manager = null;
    }

    public void onResume()
    {
        Log.v("EpisodeListFrag", "onResume");
        super.onResume();
    }

    public void onRetryRequested()
    {
        Log.v("EpisodeListFrag", "Retry requested");
        fetchShowDetails();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        int i = spinner.getSelectedItemPosition();
        int j = listView.getCheckedItemPosition();
        Log.v("EpisodeListFrag", (new StringBuilder()).append("Saving season index as: ").append(i).append(", episode index: ").append(j).toString());
        bundle.putInt("extra_season_index", i);
        bundle.putInt("extra_episode_index", j);
    }

    public void showDetailViewHeader()
    {
        detailsViewGroup.setVisibility(0);
    }





/*
    static boolean access$1102(EpisodeListFrag episodelistfrag, boolean flag)
    {
        episodelistfrag.isLoading = flag;
        return flag;
    }

*/



/*
    static int access$202(EpisodeListFrag episodelistfrag, int i)
    {
        episodelistfrag.currEpisodeIndex = i;
        return i;
    }

*/







}
