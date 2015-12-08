// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.lolomo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.BasicLoMo;
import com.netflix.mediaclient.servicemgr.CWVideo;
import com.netflix.mediaclient.servicemgr.LoMo;
import com.netflix.mediaclient.servicemgr.LoMoType;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.Trackable;
import com.netflix.mediaclient.servicemgr.Video;
import com.netflix.mediaclient.servicemgr.VideoType;
import com.netflix.mediaclient.ui.kids.KidsUtils;
import com.netflix.mediaclient.ui.lolomo.LoLoMoFrag;
import com.netflix.mediaclient.ui.lomo.VideoViewGroup;
import com.netflix.mediaclient.util.LogUtils;
import com.netflix.mediaclient.util.MathUtils;
import com.netflix.mediaclient.util.ThreadUtils;
import com.netflix.mediaclient.util.Triple;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.netflix.mediaclient.ui.kids.lolomo:
//            KidsCwViewGroup, KidsCharacterViewGroup, KidsLoMoViewGroup, SkidmarkMoreButton

public class SkidmarkLoLoMoAdapter extends BaseAdapter
    implements com.netflix.mediaclient.ui.lolomo.LoLoMoFrag.ILoLoMoAdapter
{
    private class FetchLoMoCallback extends LoggingManagerCallback
    {

        private final long requestId;
        final SkidmarkLoLoMoAdapter this$0;

        private void handleResult(List list, int i)
        {
            if (requestId != lomoRequestId)
            {
                Log.v("SkidmarkLoLoMoAdapter", "Ignoring stale onLoMosFetched callback");
            } else
            {
                if (i != 0)
                {
                    Log.w("SkidmarkLoLoMoAdapter", "Invalid status code");
                    notifyDataSetChanged();
                    return;
                }
                if (list == null || list.size() <= 0)
                {
                    Log.v("SkidmarkLoLoMoAdapter", "No loMos in response");
                    notifyDataSetChanged();
                    return;
                }
                if (Log.isLoggable("SkidmarkLoLoMoAdapter", 2))
                {
                    Log.v("SkidmarkLoLoMoAdapter", (new StringBuilder()).append("Got ").append(list.size()).append(" items").toString());
                }
                lomoData.clear();
                callbackCount = list.size();
                list = list.iterator();
                while (list.hasNext()) 
                {
                    LoMo lomo = (LoMo)list.next();
                    lomoData.put(lomo, new ArrayList(10));
                    Log.v("SkidmarkLoLoMoAdapter", (new StringBuilder()).append("Fetching videos for lomo: ").append(lomo.getId()).append(", type: ").append(lomo.getType()).toString());
                    if (lomo.getType() == LoMoType.CONTINUE_WATCHING)
                    {
                        manager.fetchCWVideos(0, 2, new FetchVideosCallback(lomo));
                    } else
                    {
                        manager.fetchVideos(lomo, 0, 4, new FetchVideosCallback(lomo));
                    }
                    if (lomo.getType() == LoMoType.CHARACTERS)
                    {
                        int i = ((fetchCWVideos) (this)).fetchCWVideos;
                        manager.fetchVideos(lomo, 5, 10 - 1, new FetchVideosCallback(lomo));
                    }
                }
            }
        }

        public void onLoMosFetched(List list, int i)
        {
            super.onLoMosFetched(list, i);
            handleResult(list, i);
        }

        public FetchLoMoCallback(long l)
        {
            this$0 = SkidmarkLoLoMoAdapter.this;
            super("SkidmarkLoLoMoAdapter");
            requestId = l;
        }
    }

    private static class ListSpacerPlaceholderVideo extends com.netflix.mediaclient.service.webclient.model.branches.Video.Summary
    {

        public ListSpacerPlaceholderVideo()
        {
        }
    }

    private static class MoreButtonPlaceholderVideo extends com.netflix.mediaclient.service.webclient.model.branches.Video.Summary
    {

        public MoreButtonPlaceholderVideo()
        {
        }
    }

    private class RefreshCwCallback extends LoggingManagerCallback
    {

        final SkidmarkLoLoMoAdapter this$0;

        public void onCWVideosFetched(List list, int i)
        {
            onCWVideosFetched(list, i);
            if (i != 0)
            {
                Log.w("SkidmarkLoLoMoAdapter", "Invalid status code for CW refresh");
                return;
            }
            if (list == null)
            {
                Log.d("SkidmarkLoLoMoAdapter", "CW videos list is null");
                return;
            }
            LoMo lomo = getLomoByType(LoMoType.CONTINUE_WATCHING);
            if (lomo == null)
            {
                Log.d("SkidmarkLoLoMoAdapter", "CW lomo is now null - aborting refresh operation");
                return;
            }
            if (Log.isLoggable("SkidmarkLoLoMoAdapter", 2))
            {
                Log.v("SkidmarkLoLoMoAdapter", (new StringBuilder()).append("Got ").append(list.size()).append(" CW videos - adding to existing lomo data").toString());
            }
            List list1 = (List)lomoData.get(lomo);
            list1.clear();
            list1.add(spacerPlaceholder);
            list1.addAll(list);
            if (shouldAddMoreButton(lomo, list1))
            {
                list1.add(moreButtonPlaceholder);
            }
            notifyDataSetChanged();
            onDataLoaded(i);
        }

        public RefreshCwCallback()
        {
            this$0 = SkidmarkLoLoMoAdapter.this;
            super("SkidmarkLoLoMoAdapter");
        }
    }


    private static final int ITEM_TYPE_CHARACTER = 3;
    private static final int ITEM_TYPE_CW = 0;
    private static final int ITEM_TYPE_MORE_BUTTON = 2;
    private static final int ITEM_TYPE_SPACER = 4;
    private static final int ITEM_TYPE_STANDARD = 1;
    private static final String TAG = "SkidmarkLoLoMoAdapter";
    protected final NetflixActivity activity;
    private final BroadcastReceiver browseReceiver = new BroadcastReceiver() {

        final SkidmarkLoLoMoAdapter this$0;

        public void onReceive(Context context, Intent intent)
        {
            if (intent == null)
            {
                Log.w("SkidmarkLoLoMoAdapter", "Received null intent");
            } else
            {
                context = intent.getAction();
                if (Log.isLoggable("SkidmarkLoLoMoAdapter", 2))
                {
                    Log.v("SkidmarkLoLoMoAdapter", (new StringBuilder()).append("browseReceiver inovoked with Action: ").append(context).toString());
                }
                if ("com.netflix.mediaclient.intent.action.BA_CW_REFRESH".equals(context))
                {
                    refreshCwData();
                    return;
                }
            }
        }

            
            {
                this$0 = SkidmarkLoLoMoAdapter.this;
                super();
            }
    };
    private int callbackCount;
    private final View dummyView;
    protected final LoLoMoFrag frag;
    private boolean isLoading;
    private com.netflix.mediaclient.android.app.LoadingStatus.LoadingStatusCallback loadingStatusCallback;
    private final LinkedHashMap lomoData = new LinkedHashMap();
    private long lomoRequestId;
    protected ServiceManager manager;
    private final Video moreButtonPlaceholder = new MoreButtonPlaceholderVideo();
    private long prefetchRequestId;
    private final Video spacerPlaceholder = new ListSpacerPlaceholderVideo();

    public SkidmarkLoLoMoAdapter(LoLoMoFrag lolomofrag)
    {
        isLoading = true;
        frag = lolomofrag;
        activity = (NetflixActivity)lolomofrag.getActivity();
        dummyView = new View(activity);
        registerBrowseNotificationReceiver();
    }

    private LoMo getLomo(int i)
    {
        return (LoMo)getItem(i).first;
    }

    private LoMo getLomoByType(LoMoType lomotype)
    {
        for (Iterator iterator = lomoData.keySet().iterator(); iterator.hasNext();)
        {
            LoMo lomo = (LoMo)iterator.next();
            if (lomo.getType() == lomotype)
            {
                return lomo;
            }
        }

        return null;
    }

    private void handlePrefetchComplete()
    {
        if (manager == null)
        {
            Log.w("SkidmarkLoLoMoAdapter", "Manager is null - can't refresh data");
            return;
        }
        if (Log.isLoggable("SkidmarkLoLoMoAdapter", 2))
        {
            Log.v("SkidmarkLoLoMoAdapter", "handlePrefetchComplete(), fetching lomos from: 0 to: 19");
        }
        lomoRequestId = System.nanoTime();
        manager.fetchLoMos("lolomo", 0, 19, new FetchLoMoCallback(lomoRequestId));
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
    }

    private void refreshCwData()
    {
        if (manager == null)
        {
            Log.d("SkidmarkLoLoMoAdapter", "Service man is null - can't refresh CW data");
            return;
        }
        if (getLomoByType(LoMoType.CONTINUE_WATCHING) == null)
        {
            Log.v("SkidmarkLoLoMoAdapter", "No CW lomo in data - skipping refresh");
            return;
        } else
        {
            Log.v("SkidmarkLoLoMoAdapter", "Refreshing CW data...");
            manager.fetchCWVideos(0, 2, new RefreshCwCallback());
            return;
        }
    }

    private void registerBrowseNotificationReceiver()
    {
        if (Log.isLoggable("SkidmarkLoLoMoAdapter", 2))
        {
            Log.v("SkidmarkLoLoMoAdapter", "Registering browse notification receiver");
        }
        activity.registerReceiver(browseReceiver, new IntentFilter("com.netflix.mediaclient.intent.action.BA_CW_REFRESH"));
    }

    private boolean shouldAddMoreButton(LoMo lomo, List list)
    {
        boolean flag;
        flag = true;
        Log.v("SkidmarkLoLoMoAdapter", (new StringBuilder()).append("Lomo ").append(lomo.getType()).append(" has ").append(lomo.getNumVideos()).append(" videos, current count: ").append(list.size()).toString());
        if (lomo.getType() != LoMoType.CONTINUE_WATCHING) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        return flag;
_L2:
        if (lomo.getType() != LoMoType.CHARACTERS)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (list.size() > 7) goto _L4; else goto _L3
_L3:
        return false;
        if (lomo.getNumVideos() > 5) goto _L4; else goto _L5
_L5:
        return false;
    }

    private void showErrorView()
    {
        frag.showErrorView();
    }

    private void unregisterBrowseNotificationReceiver()
    {
        if (Log.isLoggable("SkidmarkLoLoMoAdapter", 2))
        {
            Log.v("SkidmarkLoLoMoAdapter", "Unregistering browse notification receiver");
        }
        activity.unregisterReceiver(browseReceiver);
    }

    public int getCount()
    {
        int i = 0;
        Iterator iterator = lomoData.entrySet().iterator();
        while (iterator.hasNext()) 
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            List list = (List)entry.getValue();
            int j;
            if (((LoMo)entry.getKey()).getType() == LoMoType.CHARACTERS)
            {
                j = MathUtils.ceiling(list.size(), 2);
            } else
            {
                j = list.size();
            }
            i += j;
        }
        return i;
    }

    public long getHeaderId(int i)
    {
        return (long)getLomo(i).hashCode();
    }

    public View getHeaderView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        if (view == null)
        {
            Log.v("SkidmarkLoLoMoAdapter", "Creating header view");
            viewgroup = activity.getLayoutInflater().inflate(0x7f03003e, null);
        }
        ((TextView)viewgroup).setText(getLomo(i).getTitle());
        return viewgroup;
    }

    public Triple getItem(int i)
    {
        int j = i;
        for (Iterator iterator = lomoData.entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            List list = (List)entry.getValue();
            int k;
            int l;
            if (((LoMo)entry.getKey()).getType() == LoMoType.CHARACTERS)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            if (k != 0)
            {
                l = MathUtils.ceiling(list.size(), 2);
            } else
            {
                l = list.size();
            }
            if (j < l)
            {
                if (k != 0)
                {
                    i = j * 2;
                } else
                {
                    i = j;
                }
                if (k != 0)
                {
                    k = i + 2;
                } else
                {
                    k = i + 1;
                }
                k = Math.min(k, list.size());
                return new Triple(entry.getKey(), list.subList(i, k), Integer.valueOf(j));
            }
            j -= l;
        }

        throw new IllegalStateException((new StringBuilder()).append("Could not find item for position: ").append(i).append(", curr pos: ").append(j).toString());
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        Video video = (Video)((List)getItem(i).second).get(0);
        if (video instanceof MoreButtonPlaceholderVideo)
        {
            return 2;
        }
        if (video instanceof ListSpacerPlaceholderVideo)
        {
            return 4;
        }
        if (video instanceof CWVideo)
        {
            return 0;
        }
        return video.getType() != VideoType.CHARACTERS ? 1 : 3;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        int j;
        int k;
        int l;
        if (activity.destroyed())
        {
            Log.d("SkidmarkLoLoMoAdapter", "activity destroyed - can't getView");
            return dummyView;
        }
        j = activity.getResources().getDimensionPixelSize(0x7f0a007f);
        k = activity.getResources().getDimensionPixelSize(0x7f0a007e);
        l = getItemViewType(i);
        viewgroup = view;
        if (view != null) goto _L2; else goto _L1
_L1:
        l;
        JVM INSTR tableswitch 0 4: default 104
    //                   0 115
    //                   1 270
    //                   2 338
    //                   3 362
    //                   4 420;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_420;
_L3:
        throw new IllegalStateException("Unknown view type");
_L4:
        Log.v("SkidmarkLoLoMoAdapter", "Creating Kids CW view");
        viewgroup = new KidsCwViewGroup(activity, false);
        viewgroup.init(1);
        viewgroup.setPadding(k, 0, k, j);
        viewgroup.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, KidsUtils.computeSkidmarkRowHeight(activity, k, 0, k, j, true)));
_L2:
        view = getItem(i);
        if (viewgroup instanceof KidsCharacterViewGroup)
        {
            ((VideoViewGroup)viewgroup).updateDataThenViews((List)((Triple) (view)).second, 2, 0, i, (Trackable)((Triple) (view)).first);
        } else
        if (viewgroup instanceof VideoViewGroup)
        {
            ((VideoViewGroup)viewgroup).updateDataThenViews((List)((Triple) (view)).second, 1, 0, i, (Trackable)((Triple) (view)).first);
        } else
        if (viewgroup instanceof SkidmarkMoreButton)
        {
            ((SkidmarkMoreButton)viewgroup).update((LoMo)((Triple) (view)).first);
        }
        if (l == 0 || l == 1)
        {
            LogUtils.reportPresentationTracking(manager, (BasicLoMo)((Triple) (view)).first, (Video)((List)((Triple) (view)).second).get(0), ((Integer)((Triple) (view)).third).intValue());
        }
        return viewgroup;
_L5:
        Log.v("SkidmarkLoLoMoAdapter", "Creating Kids video view");
        viewgroup = new KidsLoMoViewGroup(activity, false);
        viewgroup.init(1);
        viewgroup.setPadding(k, 0, k, j);
        viewgroup.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, KidsUtils.computeSkidmarkRowHeight(activity, k, 0, k, j, false)));
          goto _L2
_L6:
        Log.v("SkidmarkLoLoMoAdapter", "Creating more button view");
        viewgroup = new SkidmarkMoreButton(activity);
          goto _L2
_L7:
        Log.v("SkidmarkLoLoMoAdapter", "Creating character view");
        viewgroup = new KidsCharacterViewGroup(activity, false);
        viewgroup.init(2);
        viewgroup.setPadding(k, 0, 0, 0);
        viewgroup.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, KidsUtils.computeSkidmarkCharacterViewSize(activity)));
          goto _L2
        Log.v("SkidmarkLoLoMoAdapter", "Creating spacer view");
        viewgroup = new View(activity);
        viewgroup.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, activity.getResources().getDimensionPixelSize(0x7f0a0080)));
          goto _L2
    }

    public int getViewTypeCount()
    {
        return 5;
    }

    protected void initLoadingState()
    {
        ThreadUtils.assertOnMain();
        Log.v("SkidmarkLoLoMoAdapter", "initLoadingState()");
        isLoading = true;
        lomoData.clear();
        notifyDataSetChanged();
        lomoRequestId = 0xffffffff80000000L;
    }

    public boolean isLoadingData()
    {
        return isLoading;
    }

    public void notifyDataSetChanged()
    {
        super.notifyDataSetChanged();
        ThreadUtils.assertOnMain();
        if (Log.isLoggable("SkidmarkLoLoMoAdapter", 2))
        {
            Log.v("SkidmarkLoLoMoAdapter", (new StringBuilder()).append("notifyDataSetChanged(), count: ").append(getCount()).toString());
        }
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
        Log.v("SkidmarkLoLoMoAdapter", "Destroying adapter");
        unregisterBrowseNotificationReceiver();
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
        if (manager == null)
        {
            Log.w("SkidmarkLoLoMoAdapter", "Service man is null");
            return;
        } else
        {
            Log.v("SkidmarkLoLoMoAdapter", "refreshData()");
            initLoadingState();
            prefetchRequestId = System.nanoTime();
            long l = prefetchRequestId;
            manager.prefetchLoLoMo(0, 19, 0, 4, 0, 2, activity.isForKids(), false, new LoggingManagerCallback(l) {

                final SkidmarkLoLoMoAdapter this$0;
                final long val$requestIdClone;

                public void onLoLoMoPrefetched(int i)
                {
                    super.onLoLoMoPrefetched(i);
                    if (i == 0)
                    {
                        if (requestIdClone != prefetchRequestId)
                        {
                            Log.d("SkidmarkLoLoMoAdapter", "Ignoring stale prefetch request id");
                            return;
                        } else
                        {
                            handlePrefetchComplete();
                            return;
                        }
                    } else
                    {
                        Log.w("SkidmarkLoLoMoAdapter", "Prefetch failed");
                        showErrorView();
                        return;
                    }
                }

            
            {
                this$0 = SkidmarkLoLoMoAdapter.this;
                requestIdClone = l;
                super(final_s);
            }
            });
            return;
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
            loadingStatusCallback = loadingstatuscallback;
            return;
        }
    }




/*
    static boolean access$1002(SkidmarkLoLoMoAdapter skidmarklolomoadapter, boolean flag)
    {
        skidmarklolomoadapter.isLoading = flag;
        return flag;
    }

*/









/*
    static int access$602(SkidmarkLoLoMoAdapter skidmarklolomoadapter, int i)
    {
        skidmarklolomoadapter.callbackCount = i;
        return i;
    }

*/


/*
    static int access$608(SkidmarkLoLoMoAdapter skidmarklolomoadapter)
    {
        int i = skidmarklolomoadapter.callbackCount;
        skidmarklolomoadapter.callbackCount = i + 1;
        return i;
    }

*/


/*
    static int access$610(SkidmarkLoLoMoAdapter skidmarklolomoadapter)
    {
        int i = skidmarklolomoadapter.callbackCount;
        skidmarklolomoadapter.callbackCount = i - 1;
        return i;
    }

*/



}
