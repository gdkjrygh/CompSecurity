// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.search;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.LoadingAndErrorWrapper;
import com.netflix.mediaclient.android.widget.StaticGridView;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.ManagerStatusListener;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.VideoList;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.ui.common.SimilarItemsGridViewAdapter;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.gfx.AnimationUtils;

public class SearchQueryDetailsActivity extends NetflixActivity
{
    private class OnSimsFetchedCallback extends LoggingManagerCallback
    {

        private final long requestId;
        final SearchQueryDetailsActivity this$0;

        public void onSimilarVideosFetched(VideoList videolist, int i)
        {
            super.onSimilarVideosFetched(videolist, i);
            if (requestId != SearchQueryDetailsActivity.this.requestId || AndroidUtils.isActivityFinishedOrDestroyed(SearchQueryDetailsActivity.this))
            {
                Log.v("SearchQueryDetailsActivity", "Ignoring stale callback");
                return;
            }
            isLoading = false;
            if (i != 0)
            {
                Log.w("SearchQueryDetailsActivity", "Invalid status code");
                showErrorView();
                return;
            }
            if (videolist == null || videolist.size() < 1)
            {
                Log.v("SearchQueryDetailsActivity", "No details in response");
                showErrorView();
                return;
            } else
            {
                adapter.setData(videolist, PlayContext.EMPTY_CONTEXT);
                showContentView();
                return;
            }
        }

        public OnSimsFetchedCallback(long l)
        {
            this$0 = SearchQueryDetailsActivity.this;
            super("SearchQueryDetailsActivity");
            requestId = l;
        }
    }

    public static final class SearchQueryDetailsType extends Enum
    {

        private static final SearchQueryDetailsType $VALUES[];
        public static final SearchQueryDetailsType PERSON;
        public static final SearchQueryDetailsType SEARCH_SUGGESTION;

        public static SearchQueryDetailsType valueOf(String s)
        {
            return (SearchQueryDetailsType)Enum.valueOf(com/netflix/mediaclient/ui/search/SearchQueryDetailsActivity$SearchQueryDetailsType, s);
        }

        public static SearchQueryDetailsType[] values()
        {
            return (SearchQueryDetailsType[])$VALUES.clone();
        }

        static 
        {
            PERSON = new SearchQueryDetailsType("PERSON", 0);
            SEARCH_SUGGESTION = new SearchQueryDetailsType("SEARCH_SUGGESTION", 1);
            $VALUES = (new SearchQueryDetailsType[] {
                PERSON, SEARCH_SUGGESTION
            });
        }

        private SearchQueryDetailsType(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String EXTRA_ID = "extra_id";
    private static final String EXTRA_TITLE = "extra_title";
    private static final String EXTRA_TYPE = "extra_type";
    private static final String TAG = "SearchQueryDetailsActivity";
    private SimilarItemsGridViewAdapter adapter;
    private View content;
    private StaticGridView gridView;
    private String id;
    private boolean isLoading;
    private final com.netflix.mediaclient.android.widget.ErrorWrapper.Callback leCallback = new com.netflix.mediaclient.android.widget.ErrorWrapper.Callback() {

        final SearchQueryDetailsActivity this$0;

        public void onRetryRequested()
        {
            reloadData();
        }

            
            {
                this$0 = SearchQueryDetailsActivity.this;
                super();
            }
    };
    private LoadingAndErrorWrapper leWrapper;
    private ServiceManager manager;
    private long requestId;
    private String title;
    private TextView titleView;
    private SearchQueryDetailsType type;

    public SearchQueryDetailsActivity()
    {
        isLoading = true;
    }

    private void fetchData()
    {
        if (manager == null || !manager.isReady())
        {
            Log.w("SearchQueryDetailsActivity", "Manager is null/notReady - can't load data");
            return;
        }
        isLoading = true;
        requestId = System.nanoTime();
        if (type == SearchQueryDetailsType.PERSON)
        {
            Log.v("SearchQueryDetailsActivity", (new StringBuilder()).append("Fetching data for person, Id: ").append(id).toString());
            manager.fetchSimilarVideosForPerson(id, adapter.computeNumSimsToFetch(), new OnSimsFetchedCallback(requestId));
            return;
        }
        if (type == SearchQueryDetailsType.SEARCH_SUGGESTION)
        {
            Log.v("SearchQueryDetailsActivity", (new StringBuilder()).append("Fetching data for suggestion, Id: ").append(id).toString());
            manager.fetchSimilarVideosForQuerySuggestion(id, adapter.computeNumSimsToFetch(), new OnSimsFetchedCallback(requestId));
            return;
        } else
        {
            throw new IllegalStateException("Bad state");
        }
    }

    private String getTitleForType(SearchQueryDetailsType searchquerydetailstype, String s)
    {
        if (searchquerydetailstype == SearchQueryDetailsType.PERSON)
        {
            return getString(0x7f0c01a4, new Object[] {
                s
            });
        }
        if (searchquerydetailstype == SearchQueryDetailsType.SEARCH_SUGGESTION)
        {
            return getString(0x7f0c01a4, new Object[] {
                s
            });
        } else
        {
            throw new IllegalStateException("Bad type");
        }
    }

    private void reloadData()
    {
        showLoadingView();
        fetchData();
    }

    public static void show(Activity activity, SearchQueryDetailsType searchquerydetailstype, String s, String s1)
    {
        activity.startActivity((new Intent(activity, com/netflix/mediaclient/ui/search/SearchQueryDetailsActivity)).putExtra("extra_type", searchquerydetailstype).putExtra("extra_id", s).putExtra("extra_title", s1));
    }

    private void showContentView()
    {
        leWrapper.hide(true);
        AnimationUtils.showView(content, true);
    }

    private void showErrorView()
    {
        leWrapper.showErrorView(true);
        AnimationUtils.hideView(content, true);
    }

    private void showLoadingView()
    {
        leWrapper.showLoadingView(true);
        AnimationUtils.hideView(content, true);
    }

    protected ManagerStatusListener createManagerStatusListener()
    {
        return new ManagerStatusListener() {

            final SearchQueryDetailsActivity this$0;

            public void onManagerReady(ServiceManager servicemanager, int i)
            {
                manager = servicemanager;
                fetchData();
            }

            public void onManagerUnavailable(ServiceManager servicemanager, int i)
            {
                manager = null;
            }

            
            {
                this$0 = SearchQueryDetailsActivity.this;
                super();
            }
        };
    }

    public com.netflix.mediaclient.servicemgr.IClientLogging.ModalView getUiScreen()
    {
        return com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.searchResults;
    }

    public boolean isLoadingData()
    {
        return isLoading;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent();
        type = (SearchQueryDetailsType)bundle.getSerializableExtra("extra_type");
        id = bundle.getStringExtra("extra_id");
        title = bundle.getStringExtra("extra_title");
        setContentView(0x7f030076);
        leWrapper = new LoadingAndErrorWrapper(findViewById(0x7f07018f), leCallback);
        int i = getResources().getDimensionPixelOffset(0x7f0a0050);
        content = findViewById(0x7f070190);
        content.setPadding(i, 0, i, 0);
        content.setVisibility(4);
        findViewById(0x7f07019b).setVisibility(0);
        titleView = (TextView)findViewById(0x7f07019c);
        titleView.setText(getTitleForType(type, title));
        titleView.setVisibility(0);
        gridView = (StaticGridView)findViewById(0x7f07019d);
        gridView.setLayoutAnimation(AnimationUtils.createGridLayoutAnimator(this));
        gridView.setFocusable(false);
        adapter = new SimilarItemsGridViewAdapter(this, gridView, false);
        gridView.setAdapter(adapter);
    }


/*
    static ServiceManager access$002(SearchQueryDetailsActivity searchquerydetailsactivity, ServiceManager servicemanager)
    {
        searchquerydetailsactivity.manager = servicemanager;
        return servicemanager;
    }

*/





/*
    static boolean access$402(SearchQueryDetailsActivity searchquerydetailsactivity, boolean flag)
    {
        searchquerydetailsactivity.isLoading = flag;
        return flag;
    }

*/



}
