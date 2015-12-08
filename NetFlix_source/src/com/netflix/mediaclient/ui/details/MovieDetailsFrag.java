// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.widget.StaticGridView;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.MovieDetails;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.TrackableObject;
import com.netflix.mediaclient.servicemgr.VideoDetails;
import com.netflix.mediaclient.ui.common.SimilarItemsGridViewAdapter;
import com.netflix.mediaclient.util.StringUtils;
import com.netflix.mediaclient.util.gfx.AnimationUtils;

// Referenced classes of package com.netflix.mediaclient.ui.details:
//            DetailsFrag

public class MovieDetailsFrag extends DetailsFrag
{
    private class FetchMovieDetailsCallback extends LoggingManagerCallback
    {

        private final long requestId;
        final MovieDetailsFrag this$0;

        public void onMovieDetailsFetched(MovieDetails moviedetails, int i)
        {
            super.onMovieDetailsFetched(moviedetails, i);
            if (requestId != MovieDetailsFrag.this.requestId || isDestroyed())
            {
                Log.v("MovieDetailsFrag", "Ignoring stale callback");
                return;
            }
            isLoading = false;
            if (i != 0)
            {
                Log.w("MovieDetailsFrag", "Invalid status code");
                showErrorView();
                return;
            }
            if (moviedetails == null)
            {
                Log.v("MovieDetailsFrag", "No details in response");
                showErrorView();
                return;
            } else
            {
                showDetailsView(moviedetails);
                return;
            }
        }

        public FetchMovieDetailsCallback(long l)
        {
            this$0 = MovieDetailsFrag.this;
            super("MovieDetailsFrag");
            requestId = l;
        }
    }


    private static final String EXTRA_VIDEO_ID = "video_id";
    private static final String TAG = "MovieDetailsFrag";
    private SimilarItemsGridViewAdapter adapter;
    private StaticGridView gridView;
    private boolean isLoading;
    private long requestId;
    private TextView similarShowsTitle;
    private String videoId;

    public MovieDetailsFrag()
    {
        isLoading = true;
    }

    public static MovieDetailsFrag create(String s)
    {
        MovieDetailsFrag moviedetailsfrag = new MovieDetailsFrag();
        Bundle bundle = new Bundle();
        bundle.putString("video_id", s);
        moviedetailsfrag.setArguments(bundle);
        return moviedetailsfrag;
    }

    private void fetchMovieData()
    {
        ServiceManager servicemanager = getServiceManager();
        if (servicemanager == null || !servicemanager.isReady())
        {
            Log.w("MovieDetailsFrag", "Manager is null/notReady - can't reload data");
            return;
        } else
        {
            isLoading = true;
            requestId = System.nanoTime();
            Log.v("MovieDetailsFrag", (new StringBuilder()).append("Fetching data for movie ID: ").append(videoId).toString());
            servicemanager.fetchMovieDetails(videoId, new FetchMovieDetailsCallback(requestId));
            return;
        }
    }

    protected VideoDetailsViewGroup.DetailsStringProvider getDetailsStringProvider(final MovieDetails details)
    {
        return new VideoDetailsViewGroup.DetailsStringProvider() {

            final MovieDetailsFrag this$0;
            final MovieDetails val$details;

            public CharSequence getBasicInfoString()
            {
                return StringUtils.getBasicInfoString(getActivity(), details);
            }

            public CharSequence getCreatorsText()
            {
                return StringUtils.createBoldLabeledText(getActivity(), 0x7f0c0138, details.getCreators());
            }

            public CharSequence getStarringText()
            {
                return StringUtils.createBoldLabeledText(getActivity(), 0x7f0c0137, details.getActors());
            }

            
            {
                this$0 = MovieDetailsFrag.this;
                details = moviedetails;
                super();
            }
        };
    }

    protected volatile VideoDetailsViewGroup.DetailsStringProvider getDetailsStringProvider(VideoDetails videodetails)
    {
        return getDetailsStringProvider((MovieDetails)videodetails);
    }

    protected String getVideoId()
    {
        return videoId;
    }

    public boolean isLoadingData()
    {
        return isLoading;
    }

    public void onCreate(Bundle bundle)
    {
        videoId = getArguments().getString("video_id");
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        int i = getResources().getDimensionPixelOffset(0x7f0a0050);
        viewgroup = ((ViewStub)layoutinflater.findViewById(0x7f0701ab)).inflate();
        viewgroup.setPadding(i, 0, i, 0);
        similarShowsTitle = (TextView)viewgroup.findViewById(0x7f07019c);
        gridView = (StaticGridView)viewgroup.findViewById(0x7f07019d);
        gridView.setLayoutAnimation(AnimationUtils.createGridLayoutAnimator(getActivity()));
        gridView.setFocusable(false);
        adapter = new SimilarItemsGridViewAdapter(getActivity(), gridView, true);
        gridView.setAdapter(adapter);
        return layoutinflater;
    }

    public void onManagerReady(ServiceManager servicemanager, int i)
    {
        super.onManagerReady(servicemanager, i);
        fetchMovieData();
    }

    public void onManagerUnavailable(ServiceManager servicemanager, int i)
    {
    }

    public void onResume()
    {
        super.onResume();
        adapter.refreshImagesIfNecessary();
    }

    protected void reloadData()
    {
        fetchMovieData();
    }

    protected void showDetailsView(MovieDetails moviedetails)
    {
        super.showDetailsView(moviedetails);
        similarShowsTitle.setText(getString(0x7f0c0135, new Object[] {
            moviedetails.getTitle()
        }));
        similarShowsTitle.setVisibility(0);
        TrackableObject trackableobject = new TrackableObject(moviedetails.getSimilarsRequestId(), moviedetails.getSimilarsTrackId(), moviedetails.getSimilarsListPos());
        adapter.setData(moviedetails.getSimilars(), trackableobject);
    }

    protected volatile void showDetailsView(VideoDetails videodetails)
    {
        showDetailsView((MovieDetails)videodetails);
    }




/*
    static boolean access$202(MovieDetailsFrag moviedetailsfrag, boolean flag)
    {
        moviedetailsfrag.isLoading = flag;
        return flag;
    }

*/
}
