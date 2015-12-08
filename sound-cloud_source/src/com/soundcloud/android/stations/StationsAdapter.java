// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import android.view.View;
import com.soundcloud.android.api.model.StationRecord;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.presentation.RecyclerItemAdapter;
import com.soundcloud.android.view.adapters.NowPlayingAdapter;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsViewHolder, StationViewModel, StationRenderer

class StationsAdapter extends RecyclerItemAdapter
    implements NowPlayingAdapter
{

    private static final int STATION_TYPE = 0;

    public StationsAdapter(StationRenderer stationrenderer)
    {
        super(stationrenderer);
        setHasStableIds(true);
    }

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

    public long getItemId(int i)
    {
        return ((StationViewModel)getItem(i)).getStation().getUrn().getNumericId();
    }

    public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        onBindViewHolder((StationsViewHolder)viewholder, i);
    }

    public void onBindViewHolder(StationsViewHolder stationsviewholder, int i)
    {
        super.onBindViewHolder(stationsviewholder, i);
    }

    public void updateNowPlaying(Urn urn)
    {
        StationViewModel stationviewmodel;
        for (Iterator iterator = getItems().iterator(); iterator.hasNext(); stationviewmodel.setIsPlaying(stationviewmodel.getStation().getUrn().equals(urn)))
        {
            stationviewmodel = (StationViewModel)iterator.next();
        }

        notifyDataSetChanged();
    }
}
