// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import a.a;
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.presentation.CellRenderer;
import java.util.List;

// Referenced classes of package com.soundcloud.android.stations:
//            StationBucket, StationsAdapter, StationRenderer

class StationsBucketRenderer
    implements CellRenderer
{
    private static class WrapContentGridLayoutManager extends GridLayoutManager
    {

        private int getChildMeasuredHeight(int i, View view)
        {
            measureChild(view, i / getSpanCount());
            return getDecoratedMeasuredHeight(view);
        }

        private int getNumberOfRows(int i)
        {
            return (int)Math.ceil((double)i / (double)getSpanCount());
        }

        private void measureChild(View view, int i)
        {
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        }

        private int measureHeight(android.support.v7.widget.RecyclerView.Recycler recycler, android.support.v7.widget.RecyclerView.State state, int i)
        {
            if (getItemCount() == 0)
            {
                return 0;
            } else
            {
                View view = recycler.getViewForPosition(0);
                i = getChildMeasuredHeight(i, view);
                int j = getNumberOfRows(state.getItemCount());
                recycler.recycleView(view);
                return j * i;
            }
        }

        public void onMeasure(android.support.v7.widget.RecyclerView.Recycler recycler, android.support.v7.widget.RecyclerView.State state, int i, int j)
        {
            i = android.view.View.MeasureSpec.getSize(i);
            setMeasuredDimension(i, measureHeight(recycler, state, i));
        }

        public WrapContentGridLayoutManager(Context context)
        {
            super(context, context.getResources().getInteger(0x7f0a0008));
        }
    }


    private final Navigator navigator;
    private final PlayQueueManager playQueueManager;
    private final StationRenderer stationRenderer;

    public StationsBucketRenderer(StationRenderer stationrenderer, Navigator navigator1, PlayQueueManager playqueuemanager)
    {
        stationRenderer = stationrenderer;
        navigator = navigator1;
        playQueueManager = playqueuemanager;
    }

    private void bindShowAllView(View view, StationBucket stationbucket)
    {
        if (stationbucket.getStationViewModels().size() > stationbucket.getBucketSize())
        {
            view.setVisibility(0);
            view.setOnClickListener(onViewAllClick(stationbucket.getCollectionType()));
            return;
        } else
        {
            view.setVisibility(8);
            return;
        }
    }

    private void bindStationsPreview(View view, StationBucket stationbucket)
    {
        view = (StationsAdapter)findRecyclerView(view).getAdapter();
        List list = stationbucket.getStationViewModels();
        view.clear();
        for (int i = 0; i < list.size() && i < stationbucket.getBucketSize(); i++)
        {
            view.addItem(list.get(i));
        }

        view.notifyDataSetChanged();
    }

    private RecyclerView findRecyclerView(View view)
    {
        return (RecyclerView)a.a(view, 0x7f0f0012);
    }

    private void initRecyclerViewForStationsPreview(RecyclerView recyclerview)
    {
        recyclerview.setHasFixedSize(true);
        recyclerview.setLayoutManager(new WrapContentGridLayoutManager(recyclerview.getContext()));
        recyclerview.setAdapter(new StationsAdapter(stationRenderer));
    }

    private android.view.View.OnClickListener onViewAllClick(final int type)
    {
        return new _cls1();
    }

    public void bindItemView(int i, View view, List list)
    {
        list = (StationBucket)list.get(i);
        ((TextView)a.a(view, 0x7f0f0073)).setText(list.getTitle());
        bindShowAllView(view.findViewById(0x7f0f0210), list);
        bindStationsPreview(view, list);
    }

    public View createItemView(ViewGroup viewgroup)
    {
        viewgroup = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f0300b7, viewgroup, false);
        initRecyclerViewForStationsPreview(findRecyclerView(viewgroup));
        return viewgroup;
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final StationsBucketRenderer this$0;
        final int val$type;

        public void onClick(View view)
        {
            navigator.openViewAllStations(view.getContext(), type);
        }

        _cls1()
        {
            this$0 = StationsBucketRenderer.this;
            type = i;
            super();
        }
    }

}
