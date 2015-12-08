// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.presentation.CollectionBinding;
import com.soundcloud.android.presentation.RecyclerViewPresenter;
import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.view.EmptyView;
import com.soundcloud.lightcycle.LightCycleBinder;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsNowPlayingController, StationsOperations, StationsAdapter

class ShowAllStationsPresenter extends RecyclerViewPresenter
{

    private static final String COLLECTION_TYPE_KEY = "type";
    private final StationsAdapter adapter;
    private final StationsOperations operations;
    private final PlayQueueManager playQueueManager;
    private final Resources resources;
    private b source;
    final StationsNowPlayingController stationsNowPlayingController;
    private final f toStationViewModels = new _cls1();

    public ShowAllStationsPresenter(SwipeRefreshAttacher swiperefreshattacher, StationsOperations stationsoperations, StationsAdapter stationsadapter, Resources resources1, PlayQueueManager playqueuemanager, StationsNowPlayingController stationsnowplayingcontroller)
    {
        super(swiperefreshattacher, com.soundcloud.android.presentation.RecyclerViewPresenter.Options.defaults());
        operations = stationsoperations;
        adapter = stationsadapter;
        resources = resources1;
        playQueueManager = playqueuemanager;
        stationsNowPlayingController = stationsnowplayingcontroller;
        stationsNowPlayingController.setAdapter(stationsadapter);
        LightCycleBinder.bind(this);
    }

    private f buildToViewModel()
    {
        return new _cls2();
    }

    public static Bundle createBundle(int i)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("type", i);
        return bundle;
    }

    private int getCollectionType(Bundle bundle)
    {
        return bundle.getInt("type");
    }

    private b stationsSource(Bundle bundle)
    {
        f f = buildToViewModel();
        return operations.collection(getCollectionType(bundle)).map(f).take(resources.getInteger(0x7f0a0013)).toList();
    }

    protected com.soundcloud.android.view.EmptyView.Status handleError(Throwable throwable)
    {
        return ErrorUtils.emptyViewStatusFromError(throwable);
    }

    protected CollectionBinding onBuildBinding(Bundle bundle)
    {
        source = stationsSource(bundle);
        return CollectionBinding.from(source).withAdapter(adapter).build();
    }

    public void onCreate(Fragment fragment, Bundle bundle)
    {
        super.onCreate(fragment, bundle);
        getBinding().connect();
    }

    protected CollectionBinding onRefreshBinding()
    {
        return CollectionBinding.from(operations.sync().flatMap(toStationViewModels)).withAdapter(adapter).build();
    }

    public void onViewCreated(Fragment fragment, View view, Bundle bundle)
    {
        super.onViewCreated(fragment, view, bundle);
        bundle = getRecyclerView();
        bundle.setHasFixedSize(true);
        bundle.setLayoutManager(new GridLayoutManager(view.getContext(), resources.getInteger(0x7f0a0008)));
        if (getCollectionType(fragment.getArguments()) == 0)
        {
            fragment = getEmptyView();
            fragment.setMessageText(0x7f0701b3);
            fragment.setSecondaryText(0x7f0701b4);
            fragment.setImage(0x7f020105);
        }
    }



    private class _cls1
        implements f
    {

        final ShowAllStationsPresenter this$0;

        public volatile Object call(Object obj)
        {
            return call((SyncResult)obj);
        }

        public b call(SyncResult syncresult)
        {
            return source;
        }

        _cls1()
        {
            this$0 = ShowAllStationsPresenter.this;
            super();
        }
    }


    private class _cls2
        implements f
    {

        final ShowAllStationsPresenter this$0;

        public StationViewModel call(StationRecord stationrecord)
        {
            return new StationViewModel(stationrecord, playQueueManager.getCollectionUrn().equals(stationrecord.getUrn()));
        }

        public volatile Object call(Object obj)
        {
            return call((StationRecord)obj);
        }

        _cls2()
        {
            this$0 = ShowAllStationsPresenter.this;
            super();
        }
    }

}
