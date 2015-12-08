// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import android.view.View;
import com.soundcloud.android.facebookinvites.FacebookInvitesItem;
import com.soundcloud.android.facebookinvites.FacebookInvitesItemRenderer;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.presentation.CellRendererBinding;
import com.soundcloud.android.presentation.PagingRecyclerItemAdapter;
import com.soundcloud.android.stations.StationOnboardingStreamItem;
import com.soundcloud.android.stations.StationsOnboardingStreamItemRenderer;
import com.soundcloud.android.tracks.TrackItem;
import com.soundcloud.android.view.adapters.NowPlayingAdapter;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.soundcloud.android.stream:
//            StreamCellRendererProvider, StreamItem

public class SoundStreamAdapter extends PagingRecyclerItemAdapter
    implements NowPlayingAdapter
{
    static class SoundStreamViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        public SoundStreamViewHolder(View view)
        {
            super(view);
        }
    }


    private static final int FACEBOOK_INVITES_ITEM_TYPE = 2;
    private static final int PLAYLIST_ITEM_TYPE = 1;
    private static final int STATIONS_ONBOARDING_STREAM_ITEM_TYPE = 3;
    private static final int TRACK_ITEM_TYPE = 0;
    private final FacebookInvitesItemRenderer facebookInvitesItemRenderer;
    private final StationsOnboardingStreamItemRenderer stationsOnboardingStreamItemRenderer;

    public SoundStreamAdapter(StreamCellRendererProvider streamcellrendererprovider, FacebookInvitesItemRenderer facebookinvitesitemrenderer, StationsOnboardingStreamItemRenderer stationsonboardingstreamitemrenderer)
    {
        super(new CellRendererBinding[] {
            new CellRendererBinding(0, streamcellrendererprovider.getTrackItemRenderer()), new CellRendererBinding(1, streamcellrendererprovider.getPlaylistItemRenderer()), new CellRendererBinding(2, facebookinvitesitemrenderer), new CellRendererBinding(3, stationsonboardingstreamitemrenderer)
        });
        facebookInvitesItemRenderer = facebookinvitesitemrenderer;
        stationsOnboardingStreamItemRenderer = stationsonboardingstreamitemrenderer;
    }

    protected volatile android.support.v7.widget.RecyclerView.ViewHolder createViewHolder(View view)
    {
        return createViewHolder(view);
    }

    protected SoundStreamViewHolder createViewHolder(View view)
    {
        return new SoundStreamViewHolder(view);
    }

    public int getBasicItemViewType(int i)
    {
        StreamItem streamitem = (StreamItem)getItem(i);
        Urn urn = streamitem.getEntityUrn();
        if (urn.isTrack())
        {
            return 0;
        }
        if (urn.isPlaylist())
        {
            return 1;
        }
        if (urn.equals(FacebookInvitesItem.URN))
        {
            return 2;
        }
        if (urn.equals(StationOnboardingStreamItem.URN))
        {
            return 3;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unknown item type: ")).append(streamitem).toString());
        }
    }

    void setOnFacebookInvitesClickListener(com.soundcloud.android.facebookinvites.FacebookInvitesItemRenderer.OnFacebookInvitesClickListener onfacebookinvitesclicklistener)
    {
        facebookInvitesItemRenderer.setOnFacebookInvitesClickListener(onfacebookinvitesclicklistener);
    }

    void setOnStationsOnboardingStreamClickListener(com.soundcloud.android.stations.StationsOnboardingStreamItemRenderer.Listener listener)
    {
        stationsOnboardingStreamItemRenderer.setListener(listener);
    }

    public void updateNowPlaying(Urn urn)
    {
        Iterator iterator = getItems().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (StreamItem)iterator.next();
            if (obj instanceof TrackItem)
            {
                obj = (TrackItem)obj;
                ((TrackItem) (obj)).setIsPlaying(((TrackItem) (obj)).getEntityUrn().equals(urn));
            }
        } while (true);
        notifyDataSetChanged();
    }
}
