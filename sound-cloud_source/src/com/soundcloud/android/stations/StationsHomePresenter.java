// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.soundcloud.android.api.model.StationRecord;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.presentation.CollectionBinding;
import com.soundcloud.android.presentation.RecyclerItemAdapter;
import com.soundcloud.android.presentation.RecyclerViewPresenter;
import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.view.adapters.NowPlayingAdapter;
import com.soundcloud.lightcycle.LightCycleBinder;
import java.util.Iterator;
import java.util.List;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsNowPlayingController, StationsOperations, StationBucket, StationsViewHolder, 
//            StationViewModel, StationsBucketRenderer

class StationsHomePresenter extends RecyclerViewPresenter
{
    static class StationsHomeAdapter extends RecyclerItemAdapter
        implements NowPlayingAdapter
    {

        public static final int STATION_BUCKET_TYPE = 0;

        protected volatile android.support.v7.widget.RecyclerView.ViewHolder createViewHolder(View view)
        {
            return createViewHolder(view);
        }

        protected StationsViewHolder createViewHolder(View view)
        {
            return new StationsViewHolder(view);
        }

        public int getBasicItemViewType(int i)
        {
            return 0;
        }

        public void updateNowPlaying(Urn urn)
        {
            for (Iterator iterator = getItems().iterator(); iterator.hasNext();)
            {
                Iterator iterator1 = ((StationBucket)iterator.next()).getStationViewModels().iterator();
                while (iterator1.hasNext()) 
                {
                    StationViewModel stationviewmodel = (StationViewModel)iterator1.next();
                    stationviewmodel.setIsPlaying(stationviewmodel.getStation().getUrn().equals(urn));
                }
            }

            notifyDataSetChanged();
        }

        public StationsHomeAdapter(StationsBucketRenderer stationsbucketrenderer)
        {
            super(stationsbucketrenderer);
        }
    }


    private final StationsHomeAdapter adapter;
    private final f hasStations = new _cls2();
    private final StationsOperations operations;
    private final PlayQueueManager playQueueManager;
    private final Resources resources;
    final StationsNowPlayingController stationsNowPlayingController;
    private final f toBuckets = new _cls1();

    public StationsHomePresenter(SwipeRefreshAttacher swiperefreshattacher, Resources resources1, StationsOperations stationsoperations, StationsHomeAdapter stationshomeadapter, StationsNowPlayingController stationsnowplayingcontroller, PlayQueueManager playqueuemanager)
    {
        super(swiperefreshattacher, com.soundcloud.android.presentation.RecyclerViewPresenter.Options.defaults());
        resources = resources1;
        operations = stationsoperations;
        adapter = stationshomeadapter;
        stationsNowPlayingController = stationsnowplayingcontroller;
        playQueueManager = playqueuemanager;
        stationsNowPlayingController.setAdapter(stationshomeadapter);
        LightCycleBinder.bind(this);
    }

    private b bucket(int i, String s)
    {
        f f = buildToViewModel(playQueueManager.getCollectionUrn());
        return operations.collection(i).map(f).toList().filter(hasStations).map(StationBucket.fromStationViewModels(s, i, maxStationsPerBucket()));
    }

    private b buckets()
    {
        return b.concat(bucket(0, resources.getString(0x7f0701ed)), bucket(1, resources.getString(0x7f070315)), bucket(3, resources.getString(0x7f070316)), bucket(4, resources.getString(0x7f070314)), bucket(5, resources.getString(0x7f070313))).toList();
    }

    private f buildToViewModel(final Urn currentlyPlayingCollection)
    {
        return new _cls3();
    }

    private int maxStationsPerBucket()
    {
        return resources.getInteger(0x7f0a0008) * resources.getInteger(0x7f0a0009);
    }

    protected com.soundcloud.android.view.EmptyView.Status handleError(Throwable throwable)
    {
        return ErrorUtils.emptyViewStatusFromError(throwable);
    }

    protected CollectionBinding onBuildBinding(Bundle bundle)
    {
        return CollectionBinding.from(buckets()).withAdapter(adapter).build();
    }

    public void onCreate(Fragment fragment, Bundle bundle)
    {
        super.onCreate(fragment, bundle);
        getBinding().connect();
    }

    protected void onItemClicked(View view, int i)
    {
    }

    protected CollectionBinding onRefreshBinding()
    {
        return CollectionBinding.from(operations.sync().flatMap(toBuckets)).withAdapter(adapter).build();
    }

    public void onViewCreated(Fragment fragment, View view, Bundle bundle)
    {
        super.onViewCreated(fragment, view, bundle);
        getRecyclerView().setHasFixedSize(true);
    }


    private class _cls1
        implements f
    {

        final StationsHomePresenter this$0;

        public volatile Object call(Object obj)
        {
            return call((SyncResult)obj);
        }

        public b call(SyncResult syncresult)
        {
            return buckets();
        }

        _cls1()
        {
            this$0 = StationsHomePresenter.this;
            super();
        }
    }


    private class _cls2
        implements f
    {

        final StationsHomePresenter this$0;

        public Boolean call(List list)
        {
            boolean flag;
            if (!list.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }

        public volatile Object call(Object obj)
        {
            return call((List)obj);
        }

        _cls2()
        {
            this$0 = StationsHomePresenter.this;
            super();
        }
    }


    private class _cls3
        implements f
    {

        final StationsHomePresenter this$0;
        final Urn val$currentlyPlayingCollection;

        public StationViewModel call(StationRecord stationrecord)
        {
            return new StationViewModel(stationrecord, currentlyPlayingCollection.equals(stationrecord.getUrn()));
        }

        public volatile Object call(Object obj)
        {
            return call((StationRecord)obj);
        }

        _cls3()
        {
            this$0 = StationsHomePresenter.this;
            currentlyPlayingCollection = urn;
            super();
        }
    }

}
