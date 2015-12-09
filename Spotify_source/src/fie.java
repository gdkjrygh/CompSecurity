// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.spotlets.collection.util.UriBuilder;
import com.spotify.mobile.android.spotlets.show.proto.ProtoDecorateEpisodeItem;
import com.spotify.mobile.android.spotlets.show.proto.ProtoDecorateResponse;
import com.spotify.mobile.android.spotlets.show.proto.ProtoEpisodeMetadata;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class fie extends epa
{

    private final gxt c = new gxt(new Class[0]);

    public fie(Context context, Resolver resolver, epc epc)
    {
        super(context, resolver, epc);
    }

    protected final String a()
    {
        UriBuilder uribuilder = new UriBuilder("sp://core-show/unstable/decorate");
        uribuilder.q = com.spotify.mobile.android.spotlets.collection.util.UriBuilder.Format.b;
        uribuilder.k = super.b;
        return uribuilder.a();
    }

    protected final Map a(byte abyte0[])
    {
        Object obj = (ProtoDecorateResponse)c.a(abyte0, com/spotify/mobile/android/spotlets/show/proto/ProtoDecorateResponse);
        if (obj == null)
        {
            return null;
        }
        abyte0 = new HashMap();
        ProtoDecorateEpisodeItem protodecorateepisodeitem;
        for (obj = ((ProtoDecorateResponse) (obj)).episode.iterator(); ((Iterator) (obj)).hasNext(); abyte0.put(protodecorateepisodeitem.episode_metadata.link, fiu.a(protodecorateepisodeitem.episode_metadata, protodecorateepisodeitem.episode_offline_state, protodecorateepisodeitem.episode_play_state, protodecorateepisodeitem.episode_collection_state, null)))
        {
            protodecorateepisodeitem = (ProtoDecorateEpisodeItem)((Iterator) (obj)).next();
        }

        return abyte0;
    }
}
