// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.proto;

import com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackCollectionState;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackOfflineState;
import com.squareup.wire.Message;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.proto:
//            ProtoUser

public final class ProtoPlaylistItem extends Message
{

    public static final Integer DEFAULT_ADD_TIME = Integer.valueOf(0);
    public static final String DEFAULT_HEADER_FIELD = "";
    public static final String DEFAULT_ROW_ID = "";
    public final Integer add_time;
    public final ProtoUser added_by;
    public final String header_field;
    public final String row_id;
    public final ProtoTrackCollectionState track_collection_state;
    public final ProtoTrackMetadata track_metadata;
    public final ProtoTrackOfflineState track_offline_state;

    private ProtoPlaylistItem(Builder builder)
    {
        super(builder);
        header_field = builder.header_field;
        add_time = builder.add_time;
        added_by = builder.added_by;
        track_metadata = builder.track_metadata;
        track_collection_state = builder.track_collection_state;
        track_offline_state = builder.track_offline_state;
        row_id = builder.row_id;
    }

    ProtoPlaylistItem(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoPlaylistItem))
            {
                return false;
            }
            obj = (ProtoPlaylistItem)obj;
            if (!a(header_field, ((ProtoPlaylistItem) (obj)).header_field) || !a(add_time, ((ProtoPlaylistItem) (obj)).add_time) || !a(added_by, ((ProtoPlaylistItem) (obj)).added_by) || !a(track_metadata, ((ProtoPlaylistItem) (obj)).track_metadata) || !a(track_collection_state, ((ProtoPlaylistItem) (obj)).track_collection_state) || !a(track_offline_state, ((ProtoPlaylistItem) (obj)).track_offline_state) || !a(row_id, ((ProtoPlaylistItem) (obj)).row_id))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int l1 = 0;
        int j = hashCode;
        int i = j;
        if (j == 0)
        {
            int k;
            int l;
            int i1;
            int j1;
            int k1;
            if (header_field != null)
            {
                i = header_field.hashCode();
            } else
            {
                i = 0;
            }
            if (add_time != null)
            {
                k = add_time.hashCode();
            } else
            {
                k = 0;
            }
            if (added_by != null)
            {
                l = added_by.hashCode();
            } else
            {
                l = 0;
            }
            if (track_metadata != null)
            {
                i1 = track_metadata.hashCode();
            } else
            {
                i1 = 0;
            }
            if (track_collection_state != null)
            {
                j1 = track_collection_state.hashCode();
            } else
            {
                j1 = 0;
            }
            if (track_offline_state != null)
            {
                k1 = track_offline_state.hashCode();
            } else
            {
                k1 = 0;
            }
            if (row_id != null)
            {
                l1 = row_id.hashCode();
            }
            i = (k1 + (j1 + (i1 + (l + (k + i * 37) * 37) * 37) * 37) * 37) * 37 + l1;
            hashCode = i;
        }
        return i;
    }


    private class Builder extends gxc
    {

        public Integer add_time;
        public ProtoUser added_by;
        public String header_field;
        public String row_id;
        public ProtoTrackCollectionState track_collection_state;
        public ProtoTrackMetadata track_metadata;
        public ProtoTrackOfflineState track_offline_state;

        public final Builder add_time(Integer integer)
        {
            add_time = integer;
            return this;
        }

        public final Builder added_by(ProtoUser protouser)
        {
            added_by = protouser;
            return this;
        }

        public final ProtoPlaylistItem build()
        {
            return new ProtoPlaylistItem(this, (byte)0);
        }

        public final volatile Message build()
        {
            return build();
        }

        public final Builder header_field(String s)
        {
            header_field = s;
            return this;
        }

        public final Builder row_id(String s)
        {
            row_id = s;
            return this;
        }

        public final Builder track_collection_state(ProtoTrackCollectionState prototrackcollectionstate)
        {
            track_collection_state = prototrackcollectionstate;
            return this;
        }

        public final Builder track_metadata(ProtoTrackMetadata prototrackmetadata)
        {
            track_metadata = prototrackmetadata;
            return this;
        }

        public final Builder track_offline_state(ProtoTrackOfflineState prototrackofflinestate)
        {
            track_offline_state = prototrackofflinestate;
            return this;
        }

        public Builder()
        {
        }

        public Builder(ProtoPlaylistItem protoplaylistitem)
        {
            super(protoplaylistitem);
            if (protoplaylistitem == null)
            {
                return;
            } else
            {
                header_field = protoplaylistitem.header_field;
                add_time = protoplaylistitem.add_time;
                added_by = protoplaylistitem.added_by;
                track_metadata = protoplaylistitem.track_metadata;
                track_collection_state = protoplaylistitem.track_collection_state;
                track_offline_state = protoplaylistitem.track_offline_state;
                row_id = protoplaylistitem.row_id;
                return;
            }
        }
    }

}
