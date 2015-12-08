// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.details;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.LoadingAndErrorWrapper;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.MovieDetails;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.kids.KidsUtils;
import com.netflix.mediaclient.util.gfx.AnimationUtils;

// Referenced classes of package com.netflix.mediaclient.ui.kids.details:
//            KidsDetailsViewGroup, KidsMovieDetailsAdapter

public class KidsMovieDetailsFrag extends NetflixFrag
{
    private class FetchMovieDetailsCallback extends LoggingManagerCallback
    {

        private final long requestId;
        final KidsMovieDetailsFrag this$0;

        public void onMovieDetailsFetched(MovieDetails moviedetails, int i)
        {
            super.onMovieDetailsFetched(moviedetails, i);
            if (requestId != KidsMovieDetailsFrag.this.requestId)
            {
                Log.v("KidsMovieDetailsFrag", "Ignoring stale callback");
                return;
            }
            if (i != 0)
            {
                Log.w("KidsMovieDetailsFrag", "Invalid status code");
                showErrorView();
                return;
            }
            if (moviedetails == null)
            {
                Log.v("KidsMovieDetailsFrag", "No details in response");
                showErrorView();
                return;
            } else
            {
                updateMovieDetails(moviedetails);
                return;
            }
        }

        public FetchMovieDetailsCallback(long l)
        {
            this$0 = KidsMovieDetailsFrag.this;
            super("KidsMovieDetailsFrag");
            requestId = l;
        }
    }


    private static final String EXTRA_MOVIE_ID = "extra_movie_id";
    private static final String TAG = "KidsMovieDetailsFrag";
    private KidsMovieDetailsAdapter adapter;
    private View content;
    private KidsDetailsViewGroup detailsViewGroup;
    private boolean isLoading;
    private LoadingAndErrorWrapper leWrapper;
    private ListView listView;
    private ServiceManager manager;
    private String movieId;
    private long requestId;

    public KidsMovieDetailsFrag()
    {
    }

    private void completeInitIfPossible()
    {
        if (getActivity() == null)
        {
            Log.v("KidsMovieDetailsFrag", "Can't complete init yet - activity is null");
            return;
        }
        if (manager == null)
        {
            Log.v("KidsMovieDetailsFrag", "Can't complete init yet - manager is null");
            return;
        }
        if (content == null)
        {
            Log.v("KidsMovieDetailsFrag", "Can't complete init yet - details view is null");
            return;
        }
        if (movieId == null)
        {
            Log.v("KidsMovieDetailsFrag", "Can't complete init yet - movieId is null");
            return;
        } else
        {
            Log.v("KidsMovieDetailsFrag", "All clear - completing init process...");
            fetchMovieDetails();
            return;
        }
    }

    public static Fragment create(String s)
    {
        KidsMovieDetailsFrag kidsmoviedetailsfrag = new KidsMovieDetailsFrag();
        Bundle bundle = new Bundle();
        bundle.putString("extra_movie_id", s);
        kidsmoviedetailsfrag.setArguments(bundle);
        return kidsmoviedetailsfrag;
    }

    private View createSimilarMoviesHeader()
    {
        View view = getActivity().getLayoutInflater().inflate(0x7f03003f, null);
        ((TextView)view.findViewById(0x7f0700e3)).setText(0x7f0c005a);
        return view;
    }

    private void fetchMovieDetails()
    {
        if (manager == null)
        {
            Log.w("KidsMovieDetailsFrag", "Manager is null - can't get movie details");
            return;
        } else
        {
            showLoadingView();
            isLoading = true;
            requestId = System.nanoTime();
            Log.v("KidsMovieDetailsFrag", (new StringBuilder()).append("Fetching data for show ID: ").append(movieId).toString());
            manager.fetchMovieDetails(movieId, new FetchMovieDetailsCallback(requestId));
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

    private void updateMovieDetails(MovieDetails moviedetails)
    {
        Log.v("KidsMovieDetailsFrag", (new StringBuilder()).append("Updating movie details: ").append(moviedetails.getTitle()).toString());
        detailsViewGroup.updateDetails(moviedetails);
        adapter = new KidsMovieDetailsAdapter(this, moviedetails);
        listView.setAdapter(adapter);
        showStandardViews();
    }

    public boolean isLoadingData()
    {
        return isLoading;
    }

    public void onActivityCreated(Bundle bundle)
    {
        Log.v("KidsMovieDetailsFrag", "onActivityCreated");
        super.onActivityCreated(bundle);
        completeInitIfPossible();
    }

    public void onCreate(Bundle bundle)
    {
        movieId = getArguments().getString("extra_movie_id");
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        content = layoutinflater.inflate(0x7f030045, null);
        listView = (ListView)content.findViewById(0x102000a);
        KidsUtils.configureListViewForKids(getNetflixActivity(), listView);
        detailsViewGroup = new KidsDetailsViewGroup(getActivity());
        listView.addHeaderView(detailsViewGroup, null, false);
        listView.addHeaderView(createSimilarMoviesHeader(), null, false);
        leWrapper = new LoadingAndErrorWrapper(content, new com.netflix.mediaclient.android.widget.ErrorWrapper.Callback() {

            final KidsMovieDetailsFrag this$0;

            public void onRetryRequested()
            {
                showLoadingView();
                fetchMovieDetails();
            }

            
            {
                this$0 = KidsMovieDetailsFrag.this;
                super();
            }
        });
        return content;
    }

    public void onManagerReady(ServiceManager servicemanager, int i)
    {
        Log.v("KidsMovieDetailsFrag", "onManagerReady");
        super.onManagerReady(servicemanager, i);
        manager = servicemanager;
        completeInitIfPossible();
    }

    public void onManagerUnavailable(ServiceManager servicemanager, int i)
    {
        super.onManagerUnavailable(servicemanager, i);
        manager = null;
    }





}
