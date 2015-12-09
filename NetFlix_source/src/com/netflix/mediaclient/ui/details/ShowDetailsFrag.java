// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.ShowDetails;
import com.netflix.mediaclient.servicemgr.VideoDetails;
import com.netflix.mediaclient.util.StringUtils;

// Referenced classes of package com.netflix.mediaclient.ui.details:
//            DetailsFrag

public class ShowDetailsFrag extends DetailsFrag
{
    private class FetchShowDetailsCallback extends LoggingManagerCallback
    {

        private final long requestId;
        final ShowDetailsFrag this$0;

        public void onShowDetailsFetched(ShowDetails showdetails, int i)
        {
            super.onShowDetailsFetched(showdetails, i);
            if (requestId != ShowDetailsFrag.this.requestId || isDestroyed())
            {
                Log.v("ShowDetailsFrag", "Ignoring stale callback");
                return;
            }
            isLoading = false;
            if (i != 0)
            {
                Log.w("ShowDetailsFrag", "Invalid status code");
                showErrorView();
                return;
            }
            if (showdetails == null)
            {
                Log.v("ShowDetailsFrag", "No details in response");
                showErrorView();
                return;
            } else
            {
                showDetailsView(showdetails);
                return;
            }
        }

        public FetchShowDetailsCallback(long l)
        {
            this$0 = ShowDetailsFrag.this;
            super("ShowDetailsFrag");
            requestId = l;
        }
    }

    public static class ShowDetailsStringProvider
        implements VideoDetailsViewGroup.DetailsStringProvider
    {

        private final Context context;
        private final ShowDetails details;

        public CharSequence getBasicInfoString()
        {
            return StringUtils.getBasicInfoString(context, details);
        }

        public CharSequence getCreatorsText()
        {
            return StringUtils.createBoldLabeledText(context, 0x7f0c0138, details.getCreators());
        }

        public CharSequence getStarringText()
        {
            return StringUtils.createBoldLabeledText(context, 0x7f0c0137, details.getActors());
        }

        public ShowDetailsStringProvider(Context context1, ShowDetails showdetails)
        {
            context = context1;
            details = showdetails;
        }
    }


    private static final String EXTRA_EPISODE_ID = "extra_episode_id";
    private static final String EXTRA_VIDEO_ID = "extra_video_id";
    private static final String TAG = "ShowDetailsFrag";
    private String episodeId;
    private boolean isLoading;
    private long requestId;
    private String videoId;

    public ShowDetailsFrag()
    {
        isLoading = true;
    }

    public static ShowDetailsFrag create(String s, String s1)
    {
        ShowDetailsFrag showdetailsfrag = new ShowDetailsFrag();
        Bundle bundle = new Bundle();
        bundle.putString("extra_video_id", s);
        bundle.putString("extra_episode_id", s1);
        showdetailsfrag.setArguments(bundle);
        return showdetailsfrag;
    }

    private void fetchShowData()
    {
        ServiceManager servicemanager = getServiceManager();
        if (servicemanager == null)
        {
            Log.w("ShowDetailsFrag", "Manager is null - can't reload data");
            return;
        } else
        {
            isLoading = true;
            requestId = System.nanoTime();
            Log.v("ShowDetailsFrag", (new StringBuilder()).append("Fetching data for show ID: ").append(videoId).toString());
            servicemanager.fetchShowDetails(videoId, episodeId, new FetchShowDetailsCallback(requestId));
            return;
        }
    }

    protected VideoDetailsViewGroup.DetailsStringProvider getDetailsStringProvider(ShowDetails showdetails)
    {
        return new ShowDetailsStringProvider(getActivity(), showdetails);
    }

    protected volatile VideoDetailsViewGroup.DetailsStringProvider getDetailsStringProvider(VideoDetails videodetails)
    {
        return getDetailsStringProvider((ShowDetails)videodetails);
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
        videoId = getArguments().getString("extra_video_id");
        episodeId = getArguments().getString("extra_episode_id");
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        viewgroup = (LinearLayout)layoutinflater.findViewById(0x7f0701ac);
        if (viewgroup != null)
        {
            viewgroup.setOrientation(1);
            for (int i = 0; i < viewgroup.getChildCount(); i++)
            {
                bundle = viewgroup.getChildAt(i);
                android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)bundle.getLayoutParams();
                layoutparams.weight = 0.0F;
                bundle.setLayoutParams(layoutparams);
            }

        }
        return layoutinflater;
    }

    public void onManagerReady(ServiceManager servicemanager, int i)
    {
        super.onManagerReady(servicemanager, i);
        fetchShowData();
    }

    protected void reloadData()
    {
        fetchShowData();
    }




/*
    static boolean access$202(ShowDetailsFrag showdetailsfrag, boolean flag)
    {
        showdetailsfrag.isLoading = flag;
        return flag;
    }

*/
}
