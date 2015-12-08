// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.proto:
//            ProtoTrackMetadata, ProtoTrackOfflineState, ProtoTrackPlayState, ProtoTrackCollectionState

public final class ProtoDecorateTrackItem extends Message
{

    public final ProtoTrackCollectionState collection_state;
    public final ProtoTrackOfflineState offline_state;
    public final ProtoTrackPlayState play_state;
    public final ProtoTrackMetadata track_metadata;

    private ProtoDecorateTrackItem(Builder builder)
    {
        super(builder);
        track_metadata = builder.track_metadata;
        offline_state = builder.offline_state;
        play_state = builder.play_state;
        collection_state = builder.collection_state;
    }

    ProtoDecorateTrackItem(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoDecorateTrackItem))
            {
                return false;
            }
            obj = (ProtoDecorateTrackItem)obj;
            if (!a(track_metadata, ((ProtoDecorateTrackItem) (obj)).track_metadata) || !a(offline_state, ((ProtoDecorateTrackItem) (obj)).offline_state) || !a(play_state, ((ProtoDecorateTrackItem) (obj)).play_state) || !a(collection_state, ((ProtoDecorateTrackItem) (obj)).collection_state))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int i1 = 0;
        int j = hashCode;
        int i = j;
        if (j == 0)
        {
            int k;
            int l;
            if (track_metadata != null)
            {
                i = track_metadata.hashCode();
            } else
            {
                i = 0;
            }
            if (offline_state != null)
            {
                k = offline_state.hashCode();
            } else
            {
                k = 0;
            }
            if (play_state != null)
            {
                l = play_state.hashCode();
            } else
            {
                l = 0;
            }
            if (collection_state != null)
            {
                i1 = collection_state.hashCode();
            }
            i = (l + (k + i * 37) * 37) * 37 + i1;
            hashCode = i;
        }
        return i;
    }

    private class Builder extends gxc
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

        public final Builder collection_state(ProtoTrackCollectionState prototrackcollectionstate)
        {
            collection_state = prototrackcollectionstate;
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

        public Builder(ProtoDecorateTrackItem protodecoratetrackitem)
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

}
