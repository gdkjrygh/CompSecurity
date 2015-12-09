// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.search;

import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.LoadingAndErrorWrapper;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.android.widget.SearchActionBar;
import com.netflix.mediaclient.service.logging.client.model.ActionOnUIError;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.ManagerStatusListener;
import com.netflix.mediaclient.servicemgr.SearchResults;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.kids.search.KidsSearchActivity;
import com.netflix.mediaclient.util.DeviceUtils;
import com.netflix.mediaclient.util.LogUtils;

// Referenced classes of package com.netflix.mediaclient.ui.search:
//            SearchResultsFrag

public class SearchActivity extends NetflixActivity
{
    private class FetchSearchResultsHandler extends LoggingManagerCallback
    {

        private final long requestId;
        final SearchActivity this$0;

        public void onSearchResultsFetched(SearchResults searchresults, int i)
        {
            super.onSearchResultsFetched(searchresults, i);
            if (requestId != SearchActivity.this.requestId)
            {
                Log.v("SearchActivity", "Ignoring stale onSearchResultsFetched callback");
                LogUtils.reportSearchActionEnded(requestId, SearchActivity.this, com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.canceled, null);
                return;
            }
            isLoading = false;
            searchBar.hideProgressSpinner();
            com.netflix.mediaclient.util.LogUtils.LogReportErrorArgs logreporterrorargs = new com.netflix.mediaclient.util.LogUtils.LogReportErrorArgs(i, ActionOnUIError.displayedError, "", null);
            if (i != 0)
            {
                Log.w("SearchActivity", "Invalid status code");
                showError();
                LogUtils.reportSearchActionEnded(requestId, SearchActivity.this, logreporterrorargs.getReason(), logreporterrorargs.getError());
                return;
            }
            if (searchresults == null || !searchresults.hasResults())
            {
                Log.v("SearchActivity", "No results from server");
                showEmpty();
                LogUtils.reportSearchActionEnded(requestId, SearchActivity.this, logreporterrorargs.getReason(), logreporterrorargs.getError());
                return;
            } else
            {
                Log.d("SearchActivity", String.format("searchResults size %d trackId %d", new Object[] {
                    Integer.valueOf(searchresults.getNumResults()), Integer.valueOf(searchresults.getTrackId())
                }));
                reportUiViewChanged(com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.searchResults);
                showResults(searchresults);
                LogUtils.reportSearchActionEnded(requestId, SearchActivity.this, logreporterrorargs.getReason(), logreporterrorargs.getError());
                return;
            }
        }

        public FetchSearchResultsHandler(long l)
        {
            this$0 = SearchActivity.this;
            super("SearchActivity");
            requestId = l;
        }
    }


    private static final String EXTRA_SUBMIT_QUERY = "submit";
    private static final int MIN_SEARCH_QUERY_LENGTH = 1;
    private static final String TAG = "SearchActivity";
    private static final String VIDEOS_FRAG_TAG = "videos_frag";
    private final com.netflix.mediaclient.android.widget.ErrorWrapper.Callback errorsCallback = new com.netflix.mediaclient.android.widget.ErrorWrapper.Callback() {

        final SearchActivity this$0;

        public void onRetryRequested()
        {
            handleQueryUpdate(query);
        }

            
            {
                this$0 = SearchActivity.this;
                super();
            }
    };
    private ViewGroup fragGroup;
    private final Runnable handleQueryUpdateRunnable = new Runnable() {

        final SearchActivity this$0;

        public void run()
        {
            Log.v("SearchActivity", (new StringBuilder()).append("handleQueryUpdateRunnable: \"").append(query).append("\", request id: ").append(requestId).toString());
            isLoading = true;
            searchBar.showProgressSpinner();
            LogUtils.reportSearchActionStarted(requestId, SearchActivity.this, null, getUiScreen(), query);
            serviceManager.searchNetflix(query, new FetchSearchResultsHandler(requestId));
        }

            
            {
                this$0 = SearchActivity.this;
                super();
            }
    };
    private boolean isLoading;
    protected LoadingAndErrorWrapper leWrapper;
    private Runnable pendingAction;
    private String query;
    private long requestId;
    private SearchResultsFrag resultsFrag;
    private SearchActionBar searchBar;
    private final android.widget.SearchView.OnQueryTextListener searchQueryTextListener = new android.widget.SearchView.OnQueryTextListener() {

        final SearchActivity this$0;

        public boolean onQueryTextChange(String s)
        {
            handleQueryUpdate(s);
            return true;
        }

        public boolean onQueryTextSubmit(String s)
        {
            Log.v("SearchActivity", (new StringBuilder()).append("onQueryTextSubmit: ").append(s).toString());
            searchBar.clearFocus();
            DeviceUtils.hideSoftKeyboard(SearchActivity.this);
            return true;
        }

            
            {
                this$0 = SearchActivity.this;
                super();
            }
    };
    private ServiceManager serviceManager;

    public SearchActivity()
    {
    }

    public static Intent create(NetflixActivity netflixactivity)
    {
        Object obj;
        if (netflixactivity.isForKids())
        {
            obj = com/netflix/mediaclient/ui/kids/search/KidsSearchActivity;
        } else
        {
            obj = com/netflix/mediaclient/ui/search/SearchActivity;
        }
        return (new Intent(netflixactivity, ((Class) (obj)))).setAction("android.intent.action.VIEW");
    }

    private void handleNewIntent(Intent intent)
    {
        String s = intent.getAction();
        Log.v("SearchActivity", (new StringBuilder()).append("Received intent with action: ").append(s).toString());
        if ("android.intent.action.VIEW".equals(s))
        {
            return;
        }
        if ("android.intent.action.SEARCH".equals(s))
        {
            s = intent.getStringExtra("query");
            boolean flag = intent.getBooleanExtra("submit", false);
            searchBar.setQuery(s, flag);
            handleQueryUpdate(s);
            return;
        } else
        {
            throw new IllegalStateException((new StringBuilder()).append("Unknown action: ").append(s).toString());
        }
    }

    private void handleQueryUpdate(String s)
    {
        query = s.trim();
        requestId = requestId + 1L;
        if (query.length() == 0)
        {
            showInitState();
        } else
        if (query.length() >= 1)
        {
            pendingAction = null;
            if (serviceManager == null)
            {
                pendingAction = handleQueryUpdateRunnable;
                return;
            } else
            {
                handleQueryUpdateRunnable.run();
                return;
            }
        }
    }

    public static void search(Activity activity, String s)
    {
        activity.startActivity((new Intent(activity, com/netflix/mediaclient/ui/search/SearchActivity)).setAction("android.intent.action.SEARCH").putExtra("query", s).putExtra("submit", true));
    }

    private void showEmpty()
    {
        leWrapper.showErrorView(0x7f0c0167, false, false);
        fragGroup.setVisibility(4);
        searchBar.hideProgressSpinner();
    }

    private void showError()
    {
        leWrapper.showErrorView(0x7f0c0166, true, false);
        fragGroup.setVisibility(4);
        searchBar.hideProgressSpinner();
    }

    private void showInitState()
    {
        leWrapper.showErrorView(getInitMessageStringId(), false, false);
        fragGroup.setVisibility(4);
        searchBar.hideProgressSpinner();
    }

    private void showResults(SearchResults searchresults)
    {
        leWrapper.hide(false);
        fragGroup.setVisibility(0);
        resultsFrag.update(searchresults);
    }

    protected NetflixActionBar createActionBar(ActionBar actionbar)
    {
        return new SearchActionBar(this);
    }

    protected ManagerStatusListener createManagerStatusListener()
    {
        return new ManagerStatusListener() {

            final SearchActivity this$0;

            public void onManagerReady(ServiceManager servicemanager, int i)
            {
                serviceManager = servicemanager;
                searchBar.show();
                if (pendingAction != null)
                {
                    pendingAction.run();
                }
            }

            public void onManagerUnavailable(ServiceManager servicemanager, int i)
            {
            }

            
            {
                this$0 = SearchActivity.this;
                super();
            }
        };
    }

    protected int getInitMessageStringId()
    {
        return 0x7f0c0155;
    }

    public com.netflix.mediaclient.servicemgr.IClientLogging.ModalView getUiScreen()
    {
        return com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.search;
    }

    public boolean isLoadingData()
    {
        return isLoading;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        searchBar = (SearchActionBar)getNetflixActionBar();
        searchBar.setOnQueryTextListener(searchQueryTextListener);
        searchBar.hideProgressSpinner();
        searchBar.hide();
        setContentView(0x7f030075);
        leWrapper = new LoadingAndErrorWrapper(findViewById(0x7f07018d), errorsCallback);
        leWrapper.hide(false);
        fragGroup = (ViewGroup)findViewById(0x7f07018e);
        if (bundle == null)
        {
            resultsFrag = SearchResultsFrag.create();
            getFragmentManager().beginTransaction().add(0x7f07018e, resultsFrag, "videos_frag").setTransition(4099).commit();
            showInitState();
        } else
        {
            resultsFrag = (SearchResultsFrag)getFragmentManager().findFragmentByTag("videos_frag");
        }
        if (bundle == null)
        {
            DeviceUtils.showSoftKeyboard(this);
        }
        handleNewIntent(getIntent());
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        setIntent(intent);
        handleNewIntent(intent);
    }



/*
    static ServiceManager access$002(SearchActivity searchactivity, ServiceManager servicemanager)
    {
        searchactivity.serviceManager = servicemanager;
        return servicemanager;
    }

*/








/*
    static boolean access$602(SearchActivity searchactivity, boolean flag)
    {
        searchactivity.isLoading = flag;
        return flag;
    }

*/



}
