// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.spotlets.collection.model.policy.DecorationPolicy;
import com.spotify.mobile.android.spotlets.collection.model.policy.ListPolicy;
import com.spotify.mobile.android.spotlets.collection.model.policy.Policy;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoCollectionTracksItem;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoCollectionTracksResponse;
import com.spotify.mobile.android.spotlets.collection.util.UriBuilder;
import com.spotify.mobile.android.spotlets.common.loader.PlayPayload;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class enq extends epe
    implements epf, eph, epi
{

    private static final Policy m;
    private final gxt k = new gxt(new Class[0]);
    private final String l;

    public enq(Context context, Resolver resolver, String s)
    {
        super(context, resolver);
        l = s;
    }

    private String b()
    {
        UriBuilder uribuilder = (new UriBuilder("sp://core-collection/unstable/<username>/list/tracks/all")).a(1000).a(l);
        uribuilder.n = super.c;
        uribuilder.g = super.d;
        uribuilder.e = super.e;
        uribuilder.i = super.h;
        uribuilder = uribuilder.a(super.i, super.j);
        uribuilder.h = super.f;
        uribuilder.c = super.b;
        uribuilder.q = com.spotify.mobile.android.spotlets.collection.util.UriBuilder.Format.b;
        return uribuilder.a();
    }

    private enx d(byte abyte0[])
    {
        ProtoCollectionTracksResponse protocollectiontracksresponse = (ProtoCollectionTracksResponse)k.a(abyte0, com/spotify/mobile/android/spotlets/collection/proto/ProtoCollectionTracksResponse);
        if (protocollectiontracksresponse == null)
        {
            return null;
        }
        abyte0 = protocollectiontracksresponse.offline;
        Iterator iterator;
        int j;
        if (abyte0 == null)
        {
            abyte0 = "";
        }
        j = com.spotify.mobile.android.provider.Metadata.OfflineSync.a((String)abyte0);
        abyte0 = new enw[protocollectiontracksresponse.item.size()];
        iterator = protocollectiontracksresponse.item.iterator();
        for (int i = 0; iterator.hasNext(); i++)
        {
            abyte0[i] = enz.a((ProtoCollectionTracksItem)iterator.next());
        }

        return new enz._cls1(j, protocollectiontracksresponse, abyte0);
    }

    protected final fip a(byte abyte0[])
    {
        return d(abyte0);
    }

    public final void a(PlayOptions playoptions, PlayOrigin playorigin)
    {
        UriBuilder uribuilder = new UriBuilder("sp://core-collection/unstable/<username>/list/tracks/all");
        uribuilder.l = true;
        uribuilder = uribuilder.a(l);
        uribuilder.n = super.c;
        uribuilder.g = super.d;
        uribuilder.e = super.e;
        uribuilder.h = super.f;
        uribuilder.c = super.b;
        a(uribuilder.a(), ((com.spotify.mobile.android.cosmos.JacksonModel) (new PlayPayload(playoptions, playorigin))), true);
    }

    public final void a(epg epg)
    {
        a(b(), epg, m);
    }

    public final void a(boolean flag)
    {
        Object obj = new UriBuilder("sp://core-collection/unstable/<username>/list/tracks/all");
        obj.m = true;
        obj = ((UriBuilder) (obj)).a(l);
        obj.n = super.c;
        obj = ((UriBuilder) (obj)).a();
        if (flag)
        {
            a(((String) (obj)), null, false);
            return;
        } else
        {
            a(((String) (obj)));
            return;
        }
    }

    protected final byte[] a(fip fip)
    {
        fip = (enx)fip;
        if (fip == null)
        {
            fip = null;
        } else
        {
            ArrayList arraylist = new ArrayList(((enw[])fip.getItems()).length);
            enw aenw[] = (enw[])fip.getItems();
            int j = aenw.length;
            for (int i = 0; i < j; i++)
            {
                arraylist.add(eoa.a(aenw[i]));
            }

            fip = (new com.spotify.mobile.android.spotlets.collection.proto.ProtoCollectionTracksResponse.Builder()).unranged_length(Integer.valueOf(fip.getUnrangedLength())).unfiltered_length(Integer.valueOf(fip.getUnfilteredLength())).sync_progress(Integer.valueOf(fip.b())).offline(fit.b(fip.a())).loading_contents(Boolean.valueOf(fip.isLoading())).item(arraylist).build();
        }
        return fip.a();
    }

    public final volatile byte[] a(Object obj)
    {
        return eoa.a((enw)obj).a();
    }

    protected final fip b(byte abyte0[])
    {
        return d(abyte0);
    }

    public final void b(epg epg)
    {
        b(b(), epg, m);
    }

    public final Object c(byte abyte0[])
    {
        return enz.a((ProtoCollectionTracksItem)(new gxt(new Class[0])).a(abyte0, com/spotify/mobile/android/spotlets/collection/proto/ProtoCollectionTracksItem));
    }

    static 
    {
        ListPolicy listpolicy = new ListPolicy();
        Object obj = new HashMap();
        ((HashMap) (obj)).put("link", Boolean.valueOf(true));
        ((HashMap) (obj)).put("name", Boolean.valueOf(true));
        ((HashMap) (obj)).put("offline", Boolean.valueOf(true));
        ((HashMap) (obj)).put("playable", Boolean.valueOf(true));
        ((HashMap) (obj)).put("available", Boolean.valueOf(true));
        ((HashMap) (obj)).put("isExplicit", Boolean.valueOf(true));
        ((HashMap) (obj)).put("inCollection", Boolean.valueOf(true));
        listpolicy.setListAttributes(((java.util.Map) (obj)));
        obj = new HashMap();
        ((HashMap) (obj)).put("name", Boolean.valueOf(true));
        listpolicy.setAlbumAttributes(((java.util.Map) (obj)));
        listpolicy.setArtistAttributes(((java.util.Map) (obj)));
        listpolicy.setArtistsAttributes(((java.util.Map) (obj)));
        obj = new DecorationPolicy();
        ((DecorationPolicy) (obj)).setListPolicy(listpolicy);
        m = new Policy(((DecorationPolicy) (obj)));
    }
}
