// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.proto:
//            ProtoCollectionTracksItem, ProtoTrackCollectionState, ProtoTrackOfflineState, ProtoTrackPlayState, 
//            ProtoTrackMetadata

public final class on_state extends gxc
{

    public Integer add_time;
    public ProtoTrackCollectionState collection_state;
    public String header_field;
    public Integer headerless_index;
    public ProtoTrackOfflineState offline_state;
    public ProtoTrackPlayState play_state;
    public ProtoTrackMetadata track_metadata;

    public final on_state add_time(Integer integer)
    {
        add_time = integer;
        return this;
    }

    public final ProtoCollectionTracksItem build()
    {
        return new ProtoCollectionTracksItem(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build collection_state(ProtoTrackCollectionState prototrackcollectionstate)
    {
        collection_state = prototrackcollectionstate;
        return this;
    }

    public final collection_state header_field(String s)
    {
        header_field = s;
        return this;
    }

    public final header_field headerless_index(Integer integer)
    {
        headerless_index = integer;
        return this;
    }

    public final headerless_index offline_state(ProtoTrackOfflineState prototrackofflinestate)
    {
        offline_state = prototrackofflinestate;
        return this;
    }

    public final offline_state play_state(ProtoTrackPlayState prototrackplaystate)
    {
        play_state = prototrackplaystate;
        return this;
    }

    public final play_state track_metadata(ProtoTrackMetadata prototrackmetadata)
    {
        track_metadata = prototrackmetadata;
        return this;
    }

    public ()
    {
    }

    public (ProtoCollectionTracksItem protocollectiontracksitem)
    {
        super(protocollectiontracksitem);
        if (protocollectiontracksitem == null)
        {
            return;
        } else
        {
            header_field = protocollectiontracksitem.header_field;
            headerless_index = protocollectiontracksitem.headerless_index;
            add_time = protocollectiontracksitem.add_time;
            track_metadata = protocollectiontracksitem.track_metadata;
            offline_state = protocollectiontracksitem.offline_state;
            play_state = protocollectiontracksitem.play_state;
            collection_state = protocollectiontracksitem.collection_state;
            return;
        }
    }
}
