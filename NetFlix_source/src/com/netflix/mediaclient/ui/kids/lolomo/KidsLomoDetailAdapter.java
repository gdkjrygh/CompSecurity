// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.lolomo;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.BasicLoMo;
import com.netflix.mediaclient.servicemgr.LoMoType;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.Video;
import com.netflix.mediaclient.ui.kids.KidsUtils;
import com.netflix.mediaclient.ui.lolomo.LoLoMoFrag;
import com.netflix.mediaclient.ui.lomo.VideoViewGroup;
import com.netflix.mediaclient.util.LogUtils;
import com.netflix.mediaclient.util.ThreadUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.kids.lolomo:
//            KidsLomoWrapper, KidsCwViewGroup, KidsLoMoViewGroup

public class KidsLomoDetailAdapter extends BaseAdapter
    implements com.netflix.mediaclient.ui.lolomo.LoLoMoFrag.ILoLoMoAdapter
{
    private class FetchVideosCallback extends LoggingManagerCallback
    {

        private final int numItems;
        private final long requestId;
        final KidsLomoDetailAdapter this$0;

        private void handleResponse(List list, int i)
        {
            hasMoreData = true;
            if (requestId != KidsLomoDetailAdapter.this.requestId)
            {
                Log.v("KidsLomoDetailAdapter", "Ignoring stale callback");
                return;
            }
            isLoading = false;
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            Log.w("KidsLomoDetailAdapter", "Invalid status code");
            hasMoreData = false;
            notifyDataSetChanged();
            onDataLoaded(i);
            return;
            if (list == null)
            {
                break MISSING_BLOCK_LABEL_92;
            }
            if (list.size() > 0)
            {
                break MISSING_BLOCK_LABEL_125;
            }
            Log.v("KidsLomoDetailAdapter", "No videos in response");
            hasMoreData = false;
            notifyDataSetChanged();
            onDataLoaded(i);
            return;
            if (list.size() < numItems)
            {
                hasMoreData = false;
            }
            if (Log.isLoggable("KidsLomoDetailAdapter", 2))
            {
                Log.v("KidsLomoDetailAdapter", (new StringBuilder()).append("Got ").append(list.size()).append(" items, expected ").append(numItems).append(", hasMoreData: ").append(hasMoreData).toString());
            }
            videoData.addAll(list);
            list = ((StringBuilder) (this)).StringBuilder + list;
            notifyDataSetChanged();
            onDataLoaded(i);
            return;
            list;
            onDataLoaded(i);
            throw list;
        }

        public void onCWVideosFetched(List list, int i)
        {
            super.onCWVideosFetched(list, i);
            handleResponse(list, i);
        }

        public void onVideosFetched(List list, int i)
        {
            super.onVideosFetched(list, i);
            handleResponse(list, i);
        }

        public FetchVideosCallback(long l, int i)
        {
            this$0 = KidsLomoDetailAdapter.this;
            super("KidsLomoDetailAdapter");
            requestId = l;
            numItems = i;
        }
    }


    public static final int NUM_VIDEOS_TO_FETCH_PER_BATCH = 20;
    private static final String TAG = "KidsLomoDetailAdapter";
    protected final NetflixActivity activity;
    private final LoLoMoFrag frag;
    private boolean hasMoreData;
    private boolean isLoading;
    private com.netflix.mediaclient.android.app.LoadingStatus.LoadingStatusCallback loadingStatusCallback;
    private final BasicLoMo lomo;
    private ServiceManager manager;
    private long requestId;
    protected final List videoData = new ArrayList();
    private int videoStartIndex;

    public KidsLomoDetailAdapter(LoLoMoFrag lolomofrag, BasicLoMo basiclomo)
    {
        isLoading = true;
        frag = lolomofrag;
        activity = (NetflixActivity)lolomofrag.getActivity();
        lomo = basiclomo;
    }

    private void fetchMoreData()
    {
        isLoading = true;
        requestId = System.nanoTime();
        int i = (videoStartIndex + 20) - 1;
        if (Log.isLoggable("KidsLomoDetailAdapter", 2))
        {
            Log.v("KidsLomoDetailAdapter", (new StringBuilder()).append("fetching data from: ").append(videoStartIndex).append(" to: ").append(i).append(", id: ").append(lomo.getId()).toString());
        }
        if (manager == null)
        {
            Log.w("KidsLomoDetailAdapter", "Manager is null - can't refresh data");
            return;
        }
        FetchVideosCallback fetchvideoscallback = new FetchVideosCallback(requestId, (i - videoStartIndex) + 1);
        if (lomo.getType() == LoMoType.CONTINUE_WATCHING)
        {
            manager.fetchCWVideos(videoStartIndex, i, fetchvideoscallback);
            return;
        }
        if (lomo.getType() == LoMoType.FLAT_GENRE)
        {
            manager.fetchGenreVideos(new KidsLomoWrapper(lomo), videoStartIndex, i, fetchvideoscallback);
            return;
        } else
        {
            manager.fetchVideos(new KidsLomoWrapper(lomo), videoStartIndex, i, fetchvideoscallback);
            return;
        }
    }

    private void hideLoadingAndErrorViews()
    {
        frag.hideLoadingAndErrorViews();
    }

    private void onDataLoaded(int i)
    {
        if (loadingStatusCallback != null)
        {
            loadingStatusCallback.onDataLoaded(i);
        }
        if (i == 0)
        {
            frag.onDataLoadSuccess();
        }
    }

    private boolean shouldLoadMoreData(int i)
    {
        return i >= (videoStartIndex - 20) / getNumItemsPerPage();
    }

    private void showErrorView()
    {
        frag.showErrorView();
    }

    protected View createDummyView()
    {
        View view = new View(activity);
        view.setVisibility(8);
        return view;
    }

    protected VideoViewGroup createVideoViewGroup()
    {
        Object obj;
        int i;
        int j;
        int k;
        if (lomo.getType() == LoMoType.CONTINUE_WATCHING)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            obj = new KidsCwViewGroup(activity, false);
        } else
        {
            obj = new KidsLoMoViewGroup(activity, false);
        }
        ((VideoViewGroup) (obj)).init(1);
        j = activity.getResources().getDimensionPixelSize(0x7f0a007e);
        k = activity.getResources().getDimensionPixelSize(0x7f0a007f);
        ((VideoViewGroup) (obj)).setPadding(j, 0, j, k);
        if (i != 0)
        {
            i = KidsUtils.computeHorizontalRowHeight(activity, false);
        } else
        {
            i = KidsUtils.computeSkidmarkRowHeight(activity, j, 0, j, k, false);
        }
        ((VideoViewGroup) (obj)).setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, i));
        return ((VideoViewGroup) (obj));
    }

    public int getCount()
    {
        return videoData.size();
    }

    public long getHeaderId(int i)
    {
        return -1L;
    }

    public View getHeaderView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        if (view == null)
        {
            viewgroup = createDummyView();
        }
        return viewgroup;
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public List getItem(int i)
    {
        return Collections.singletonList(videoData.get(i));
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    protected int getNumItemsPerPage()
    {
        return 1;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (activity.destroyed())
        {
            Log.d("KidsLomoDetailAdapter", "activity destroyed - can't getView");
            return createDummyView();
        }
        viewgroup = view;
        if (view == null)
        {
            Log.v("KidsLomoDetailAdapter", (new StringBuilder()).append("Creating Kids video view, type: ").append(lomo.getType()).toString());
            viewgroup = createVideoViewGroup();
        }
        view = getItem(i);
        ((VideoViewGroup)viewgroup).updateDataThenViews(view, getNumItemsPerPage(), 0, i, lomo);
        if (shouldReportPresentationTracking())
        {
            LogUtils.reportPresentationTracking(manager, lomo, (Video)view.get(0), i);
        }
        if (hasMoreData && !isLoading && shouldLoadMoreData(i))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            fetchMoreData();
        }
        return viewgroup;
    }

    protected void initLoadingState()
    {
        ThreadUtils.assertOnMain();
        Log.v("KidsLomoDetailAdapter", "initLoadingState()");
        isLoading = true;
        requestId = 0xffffffff80000000L;
        hasMoreData = true;
        videoStartIndex = 0;
        videoData.clear();
        notifyDataSetChanged();
    }

    public boolean isLoadingData()
    {
        return isLoading;
    }

    public void notifyDataSetChanged()
    {
        super.notifyDataSetChanged();
        ThreadUtils.assertOnMain();
        Log.v("KidsLomoDetailAdapter", (new StringBuilder()).append("notifyDataSetChanged(), count: ").append(getCount()).toString());
        if (getCount() > 0)
        {
            hideLoadingAndErrorViews();
        } else
        if (!isLoading)
        {
            showErrorView();
            return;
        }
    }

    public void onDestroyView()
    {
    }

    public void onManagerReady(ServiceManager servicemanager, int i)
    {
        manager = servicemanager;
        refreshData();
    }

    public void onManagerUnavailable(ServiceManager servicemanager, int i)
    {
        manager = null;
    }

    public void onPause()
    {
    }

    public void onResume()
    {
    }

    public void refreshData()
    {
        Log.v("KidsLomoDetailAdapter", "Refreshing data");
        isLoading = true;
        initLoadingState();
        fetchMoreData();
    }

    public void setLoadingStatusCallback(com.netflix.mediaclient.android.app.LoadingStatus.LoadingStatusCallback loadingstatuscallback)
    {
        if (!isLoadingData() && loadingstatuscallback != null)
        {
            loadingstatuscallback.onDataLoaded(0);
            return;
        } else
        {
            loadingStatusCallback = loadingstatuscallback;
            return;
        }
    }

    protected boolean shouldReportPresentationTracking()
    {
        return true;
    }



/*
    static boolean access$002(KidsLomoDetailAdapter kidslomodetailadapter, boolean flag)
    {
        kidslomodetailadapter.hasMoreData = flag;
        return flag;
    }

*/



/*
    static boolean access$202(KidsLomoDetailAdapter kidslomodetailadapter, boolean flag)
    {
        kidslomodetailadapter.isLoading = flag;
        return flag;
    }

*/


/*
    static int access$312(KidsLomoDetailAdapter kidslomodetailadapter, int i)
    {
        i = kidslomodetailadapter.videoStartIndex + i;
        kidslomodetailadapter.videoStartIndex = i;
        return i;
    }

*/

}
