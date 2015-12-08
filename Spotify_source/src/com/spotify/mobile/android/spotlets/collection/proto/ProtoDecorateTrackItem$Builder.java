// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.proto:
//            ProtoDecorateTrackItem, ProtoTrackCollectionState, ProtoTrackOfflineState, ProtoTrackPlayState, 
//            ProtoTrackMetadata

public final class on_state extends gxc
{

    public ProtoTrackCollectionState collection_state;
    public ProtoTrackOfflineState offline_state;
    public ProtoTrackPlayState play_state;
    public ProtoTrackMetadata track_metadata;

    public final ProtoDecorateTrackItem build()
    {
        return new ProtoDecorateTrackItem(this, (byte)0);
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

    public final collection_state offline_state(ProtoTrackOfflineState prototrackofflinestate)
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

    public Y()
    {
    }

    public Y(ProtoDecorateTrackItem protodecoratetrackitem)
    {
        super(protodecoratetrackitem);
        if (protodecoratetrackitem == null)
        {
            return;
        } else
        {
            track_metadata = protodecoratetrackitem.track_metadata;
            offline_state = protodecoratetrackitem.offline_state;
            play_state = protodecoratetrackitem.play_state;
            collection_state = protodecoratetrackitem.collection_state;
            return;
        }
    }
}
