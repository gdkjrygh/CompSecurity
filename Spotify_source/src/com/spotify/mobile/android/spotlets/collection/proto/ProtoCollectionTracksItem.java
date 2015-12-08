// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.proto:
//            ProtoTrackMetadata, ProtoTrackOfflineState, ProtoTrackPlayState, ProtoTrackCollectionState

public final class ProtoCollectionTracksItem extends Message
{

    public static final Integer DEFAULT_ADD_TIME = Integer.valueOf(0);
    public static final Integer DEFAULT_HEADERLESS_INDEX = Integer.valueOf(0);
    public static final String DEFAULT_HEADER_FIELD = "";
    public final Integer add_time;
    public final ProtoTrackCollectionState collection_state;
    public final String header_field;
    public final Integer headerless_index;
    public final ProtoTrackOfflineState offline_state;
    public final ProtoTrackPlayState play_state;
    public final ProtoTrackMetadata track_metadata;

    private ProtoCollectionTracksItem(Builder builder)
    {
        super(builder);
        header_field = builder.header_field;
        headerless_index = builder.headerless_index;
        add_time = builder.add_time;
        track_metadata = builder.track_metadata;
        offline_state = builder.offline_state;
        play_state = builder.play_state;
        collection_state = builder.collection_state;
    }

    ProtoCollectionTracksItem(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoCollectionTracksItem))
            {
                return false;
            }
            obj = (ProtoCollectionTracksItem)obj;
            if (!a(header_field, ((ProtoCollectionTracksItem) (obj)).header_field) || !a(headerless_index, ((ProtoCollectionTracksItem) (obj)).headerless_index) || !a(add_time, ((ProtoCollectionTracksItem) (obj)).add_time) || !a(track_metadata, ((ProtoCollectionTracksItem) (obj)).track_metadata) || !a(offline_state, ((ProtoCollectionTracksItem) (obj)).offline_state) || !a(play_state, ((ProtoCollectionTracksItem) (obj)).play_state) || !a(collection_state, ((ProtoCollectionTracksItem) (obj)).collection_state))
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
            if (headerless_index != null)
            {
                k = headerless_index.hashCode();
            } else
            {
                k = 0;
            }
            if (add_time != null)
            {
                l = add_time.hashCode();
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
            if (offline_state != null)
            {
                j1 = offline_state.hashCode();
            } else
            {
                j1 = 0;
            }
            if (play_state != null)
            {
                k1 = play_state.hashCode();
            } else
            {
                k1 = 0;
            }
            if (collection_state != null)
            {
                l1 = collection_state.hashCode();
            }
            i = (k1 + (j1 + (i1 + (l + (k + i * 37) * 37) * 37) * 37) * 37) * 37 + l1;
            hashCode = i;
        }
        return i;
    }


    private class Builder extends gxc
    {

        public Integer add_time;
        public ProtoTrackCollectionState collection_state;
        public String header_field;
        public Integer headerless_index;
        public ProtoTrackOfflineState offline_state;
        public ProtoTrackPlayState play_state;
        public ProtoTrackMetadata track_metadata;

        public final Builder add_time(Integer integer)
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

        public final Builder collection_state(ProtoTrackCollectionState prototrackcollectionstate)
        {
            collection_state = prototrackcollectionstate;
            return this;
        }

        public final Builder header_field(String s)
        {
            header_field = s;
            return this;
        }

        public final Builder headerless_index(Integer integer)
        {
            headerless_index = integer;
            return this;
        }

        public final Builder offline_state(ProtoTrackOfflineState prototrackofflinestate)
        {
            offline_state = prototrackofflinestate;
            return this;
        }

        public final Builder play_state(ProtoTrackPlayState prototrackplaystate)
        {
            play_state = prototrackplaystate;
            return this;
        }

        public final Builder track_metadata(ProtoTrackMetadata prototrackmetadata)
        {
            track_metadata = prototrackmetadata;
            return this;
        }

        public Builder()
        {
        }

        public Builder(ProtoCollectionTracksItem protocollectiontracksitem)
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

}
