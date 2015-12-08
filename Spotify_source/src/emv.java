// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoDecorateResponse;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoDecorateTrackItem;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackMetadata;
import com.spotify.mobile.android.spotlets.collection.util.UriBuilder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class emv extends epa
{

    private final gxt c = new gxt(new Class[0]);

    public emv(Context context, Resolver resolver, epc epc)
    {
        super(context, resolver, epc);
    }

    protected final String a()
    {
        UriBuilder uribuilder = new UriBuilder("sp://core-collection/unstable/@/decorate");
        uribuilder.q = com.spotify.mobile.android.spotlets.collection.util.UriBuilder.Format.b;
        uribuilder.k = super.b;
        return uribuilder.a();
    }

    protected final Map a(byte abyte0[])
    {
        Object obj = (ProtoDecorateResponse)c.a(abyte0, com/spotify/mobile/android/spotlets/collection/proto/ProtoDecorateResponse);
        if (obj == null)
        {
            return null;
        }
        abyte0 = new HashMap();
        ProtoDecorateTrackItem protodecoratetrackitem;
        for (obj = ((ProtoDecorateResponse) (obj)).track.iterator(); ((Iterator) (obj)).hasNext(); abyte0.put(protodecoratetrackitem.track_metadata.link, enz.a(protodecoratetrackitem.track_metadata, protodecoratetrackitem.offline_state, protodecoratetrackitem.play_state, protodecoratetrackitem.collection_state, null, null)))
        {
            protodecoratetrackitem = (ProtoDecorateTrackItem)((Iterator) (obj)).next();
        }

        return abyte0;
    }
}
