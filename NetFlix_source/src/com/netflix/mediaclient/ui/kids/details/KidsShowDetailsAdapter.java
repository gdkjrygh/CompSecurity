// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.details;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.EpisodeDetails;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.SeasonDetails;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.ShowDetails;
import com.netflix.mediaclient.ui.details.DummyEpisodeDetails;
import com.netflix.mediaclient.util.DeviceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import se.emilsjolander.stickylistheaders.StickyListHeadersAdapter;
import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

// Referenced classes of package com.netflix.mediaclient.ui.kids.details:
//            KidsShowDetailsFrag, KidsSeasonSpinner, KidsEpisodeViewGroup

public class KidsShowDetailsAdapter extends BaseAdapter
    implements android.widget.AbsListView.OnScrollListener, StickyListHeadersAdapter
{
    private static class ErrorEpisodeDetails extends DummyEpisodeDetails
    {

        private NetflixActivity activity;

        public String getTitle()
        {
            return activity.getString(0x7f0c0072);
        }

        public ErrorEpisodeDetails(NetflixActivity netflixactivity)
        {
            super(-1);
            activity = netflixactivity;
        }
    }

    private class FetchEpisodesCallback extends LoggingManagerCallback
    {

        private int from;
        private final long requestId;
        final KidsShowDetailsAdapter this$0;
        private int to;

        public void onEpisodesFetched(List list, int i)
        {
            List list1;
label0:
            {
                super.onEpisodesFetched(list, i);
                if (activity.destroyed())
                {
                    return;
                }
                if (requestId != KidsShowDetailsAdapter.this.requestId)
                {
                    Log.v("KidsShowDetailsAdapter", "Ignoring stale request");
                    return;
                }
                isLoading = false;
                if (i == 0 && list != null)
                {
                    list1 = list;
                    if (list.size() != 0)
                    {
                        break label0;
                    }
                }
                Log.w("KidsShowDetailsAdapter", "Error occurred");
                list = new ArrayList();
                i = 0;
                do
                {
                    list1 = list;
                    if (i >= (to - from) + 1)
                    {
                        break;
                    }
                    list.add(errorEpisode);
                    i++;
                } while (true);
            }
            if (Log.isLoggable("KidsShowDetailsAdapter", 2))
            {
                Log.v("KidsShowDetailsAdapter", (new StringBuilder()).append("Received episodes: ").append(list1.size()).append(", from: ").append(from).append(", to: ").append(to).toString());
                EpisodeDetails episodedetails;
                for (list = list1.iterator(); list.hasNext(); Log.v("KidsShowDetailsAdapter", String.format("  S%02d:E%02d - %s", new Object[] {
        Integer.valueOf(episodedetails.getSeasonNumber()), Integer.valueOf(episodedetails.getEpisodeNumber()), episodedetails.getTitle()
    })))
                {
                    episodedetails = (EpisodeDetails)list.next();
                }

            }
            for (i = 0; i < list1.size(); i++)
            {
                episodes.set(from + i, list1.get(i));
            }

            notifyDataSetChanged();
        }

        public FetchEpisodesCallback(long l, int i, int j)
        {
            this$0 = KidsShowDetailsAdapter.this;
            super("KidsShowDetailsAdapter");
            requestId = l;
            from = i;
            to = j;
        }
    }

    private static class LoadingEpisodeDetails extends DummyEpisodeDetails
    {

        private NetflixActivity activity;

        public String getTitle()
        {
            return activity.getString(0x7f0c013a);
        }

        public LoadingEpisodeDetails(NetflixActivity netflixactivity)
        {
            super(-1);
            activity = netflixactivity;
        }
    }


    private static final int NUM_EPISODES_TO_FETCH_PER_BATCH = 60;
    private static final String TAG = "KidsShowDetailsAdapter";
    private static final int TYPE_EPISODE = 2;
    private static final int TYPE_ERROR = 1;
    private static final int TYPE_LOADING = 0;
    private final NetflixActivity activity;
    private int currFocusIndex;
    private int currSeasonNumber;
    private final List episodes;
    private final EpisodeDetails errorEpisode;
    private int firstItemHeight;
    private final KidsShowDetailsFrag frag;
    private boolean isLoading;
    private int itemHeight;
    private final android.widget.AbsListView.LayoutParams itemParams;
    private final StickyListHeadersListView listView;
    private final EpisodeDetails loadingEpisode;
    private int lr;
    private final ServiceManager manager;
    private long requestId;
    private final List seasons;
    private final ShowDetails showDetails;
    private int tb;

    public KidsShowDetailsAdapter(KidsShowDetailsFrag kidsshowdetailsfrag, ShowDetails showdetails, List list)
    {
        frag = kidsshowdetailsfrag;
        activity = (NetflixActivity)kidsshowdetailsfrag.getActivity();
        listView = kidsshowdetailsfrag.getListView();
        manager = activity.getServiceManager();
        showDetails = showdetails;
        seasons = list;
        currSeasonNumber = ((SeasonDetails)list.get(0)).getSeasonNumber();
        errorEpisode = new ErrorEpisodeDetails(activity);
        loadingEpisode = new LoadingEpisodeDetails(activity);
        episodes = new ArrayList(showdetails.getNumOfEpisodes());
        for (int i = 0; i < getCount(); i++)
        {
            episodes.add(loadingEpisode);
        }

        lr = activity.getResources().getDimensionPixelSize(0x7f0a007e);
        tb = activity.getResources().getDimensionPixelSize(0x7f0a007f);
        itemHeight = (int)((float)(DeviceUtils.getScreenWidthInPixels(activity) - lr - lr) * 0.75F) + tb;
        firstItemHeight = itemHeight + tb;
        itemParams = new android.widget.AbsListView.LayoutParams(-1, itemHeight);
    }

    private TextView createStatusTextView()
    {
        Resources resources = activity.getResources();
        TextView textview = new TextView(activity);
        textview.setTextColor(resources.getColor(0x7f090067));
        textview.setTextSize(0, resources.getDimensionPixelSize(0x7f0a0030));
        textview.setGravity(17);
        textview.setLayoutParams(itemParams);
        return textview;
    }

    private void fetchEpisodes(int i)
    {
        if (manager == null)
        {
            Log.w("KidsShowDetailsAdapter", "Manager is null - can't get show details");
            return;
        }
        isLoading = true;
        requestId = System.nanoTime();
        String s = showDetails.getId();
        i = Math.max(i - 30, 0);
        int j = Math.min((i + 60) - 1, getCount());
        if (Log.isLoggable("KidsShowDetailsAdapter", 2))
        {
            Log.v("KidsShowDetailsAdapter", String.format("Fetching episodes, id: %s, from: %d, to: %d", new Object[] {
                s, Integer.valueOf(i), Integer.valueOf(j)
            }));
        }
        manager.fetchEpisodes(s, i, j, new FetchEpisodesCallback(requestId, i, j));
    }

    private void updateSeasonHeaderView(boolean flag)
    {
        if (listView.getHeader() != null)
        {
            Log.v("KidsShowDetailsAdapter", (new StringBuilder()).append("Updating season header view, useSmoothScroll: ").append(flag).toString());
            ((KidsSeasonSpinner)listView.getHeader()).setSeasonNumber(currSeasonNumber);
        }
    }

    private boolean updateSeasonNumber()
    {
        EpisodeDetails episodedetails;
        int i;
        if (currFocusIndex >= 0)
        {
            if ((episodedetails = getItem(currFocusIndex)) != null && episodedetails != loadingEpisode && episodedetails != errorEpisode && currSeasonNumber != (i = episodedetails.getSeasonNumber()))
            {
                currSeasonNumber = i;
                if (Log.isLoggable("KidsShowDetailsAdapter", 2))
                {
                    Log.v("KidsShowDetailsAdapter", (new StringBuilder()).append("Season number has changed to: ").append(currSeasonNumber).toString());
                }
                return true;
            }
        }
        return false;
    }

    public int getCount()
    {
        return showDetails.getNumOfEpisodes();
    }

    public long getHeaderId(int i)
    {
        return 0L;
    }

    public View getHeaderView(int i, View view, ViewGroup viewgroup)
    {
        Log.v("KidsShowDetailsAdapter", (new StringBuilder()).append("Getting header view, convertView: ").append(view).toString());
        viewgroup = view;
        if (view == null)
        {
            viewgroup = new KidsSeasonSpinner(frag, this);
        }
        ((KidsSeasonSpinner)viewgroup).setSeasonNumber(currSeasonNumber);
        return viewgroup;
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

    public int getItemViewType(int i)
    {
        EpisodeDetails episodedetails = getItem(i);
        if (episodedetails == loadingEpisode)
        {
            return 0;
        }
        return episodedetails != errorEpisode ? 2 : 1;
    }

    public List getSeasons()
    {
        return seasons;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        int j = getItemViewType(i);
        if (!isLoading && (j == 0 || j == 1))
        {
            fetchEpisodes(i);
        }
        switch (j)
        {
        default:
            viewgroup = view;
            if (view == null)
            {
                viewgroup = createStatusTextView();
            }
            ((TextView)viewgroup).setText(0x7f0c013a);
            return viewgroup;

        case 2: // '\002'
            viewgroup = view;
            if (view == null)
            {
                viewgroup = new KidsEpisodeViewGroup(activity);
                viewgroup.setLayoutParams(itemParams);
            }
            view = viewgroup.getLayoutParams();
            int k;
            int l;
            if (i == 0)
            {
                k = firstItemHeight;
            } else
            {
                k = itemHeight;
            }
            view.height = k;
            l = lr;
            if (i == 0)
            {
                k = tb;
            } else
            {
                k = 0;
            }
            viewgroup.setPadding(l, k, lr, tb);
            ((KidsEpisodeViewGroup)viewgroup).update(getItem(i));
            return viewgroup;

        case 1: // '\001'
            viewgroup = view;
            break;
        }
        if (view == null)
        {
            viewgroup = createStatusTextView();
        }
        ((TextView)viewgroup).setText(0x7f0c0072);
        return viewgroup;
    }

    public int getViewTypeCount()
    {
        return 3;
    }

    public boolean isLoading()
    {
        return isLoading;
    }

    public void notifyDataSetChanged()
    {
        Log.v("KidsShowDetailsAdapter", "notifyDataSetChanged()");
        super.notifyDataSetChanged();
        updateSeasonNumber();
        updateSeasonHeaderView(false);
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        i = Math.min(i + 1, getCount()) - listView.getHeaderViewsCount();
        if (currFocusIndex != i)
        {
            currFocusIndex = i;
            if (Log.isLoggable("KidsShowDetailsAdapter", 2))
            {
                Log.v("KidsShowDetailsAdapter", (new StringBuilder()).append("New item focused in list view, index: ").append(i).toString());
            }
            if (updateSeasonNumber())
            {
                updateSeasonHeaderView(true);
            }
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
    }

    public void selectSeasonByNumber(int i)
    {
        int k = 0;
        int j = 0;
        do
        {
            SeasonDetails seasondetails;
label0:
            {
                if (j < seasons.size())
                {
                    seasondetails = (SeasonDetails)seasons.get(j);
                    if (seasondetails.getSeasonNumber() != i)
                    {
                        break label0;
                    }
                    Log.v("KidsShowDetailsAdapter", (new StringBuilder()).append("Scrolling to episode, position: ").append(k).toString());
                    currSeasonNumber = i;
                    updateSeasonHeaderView(true);
                    listView.setSelection(listView.getHeaderViewsCount() + k);
                }
                return;
            }
            k += seasondetails.getNumOfEpisodes();
            j++;
        } while (true);
    }




/*
    static boolean access$202(KidsShowDetailsAdapter kidsshowdetailsadapter, boolean flag)
    {
        kidsshowdetailsadapter.isLoading = flag;
        return flag;
    }

*/


}
