// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.proto;

import com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackCollectionState;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackOfflineState;
import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.proto:
//            ProtoPlaylistRowsItem, ProtoUser

public final class row_id extends gxc
{

    public Integer add_time;
    public ProtoUser added_by;
    public String header_field;
    public String row_id;
    public ProtoTrackCollectionState track_collection_state;
    public ProtoTrackMetadata track_metadata;
    public ProtoTrackOfflineState track_offline_state;

    public final row_id add_time(Integer integer)
    {
        add_time = integer;
        return this;
    }

    public final add_time added_by(ProtoUser protouser)
    {
        added_by = protouser;
        return this;
    }

    public final ProtoPlaylistRowsItem build()
    {
        return new ProtoPlaylistRowsItem(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build header_field(String s)
    {
        header_field = s;
        return this;
    }

    public final header_field row_id(String s)
    {
        row_id = s;
        return this;
    }

    public final row_id track_collection_state(ProtoTrackCollectionState prototrackcollectionstate)
    {
        track_collection_state = prototrackcollectionstate;
        return this;
    }

    public final track_collection_state track_metadata(ProtoTrackMetadata prototrackmetadata)
    {
        track_metadata = prototrackmetadata;
        return this;
    }

    public final track_metadata track_offline_state(ProtoTrackOfflineState prototrackofflinestate)
    {
        track_offline_state = prototrackofflinestate;
        return this;
    }

    public ()
    {
    }

    public (ProtoPlaylistRowsItem protoplaylistrowsitem)
    {
        super(protoplaylistrowsitem);
        if (protoplaylistrowsitem == null)
        {
            return;
        } else
        {
            header_field = protoplaylistrowsitem.header_field;
            add_time = protoplaylistrowsitem.add_time;
            added_by = protoplaylistrowsitem.added_by;
            track_metadata = protoplaylistrowsitem.track_metadata;
            track_collection_state = protoplaylistrowsitem.track_collection_state;
            track_offline_state = protoplaylistrowsitem.track_offline_state;
            row_id = protoplaylistrowsitem.row_id;
            return;
        }
    }
}
