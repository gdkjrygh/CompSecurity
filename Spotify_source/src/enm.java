// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.spotlets.collection.model.policy.DecorationPolicy;
import com.spotify.mobile.android.spotlets.collection.model.policy.ListPolicy;
import com.spotify.mobile.android.spotlets.collection.model.policy.Policy;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoCollectionAlbumsItem;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoCollectionAlbumsResponse;
import com.spotify.mobile.android.spotlets.collection.util.UriBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class enm extends epe
    implements epf
{

    private static final Policy m;
    private final gxt k = new gxt(new Class[0]);
    private final String l;

    public enm(Context context, Resolver resolver, String s)
    {
        super(context, resolver);
        l = s;
    }

    private String b()
    {
        UriBuilder uribuilder = (new UriBuilder("sp://core-collection/unstable/<username>/list/albums/all")).a(1000).a(l);
        uribuilder.n = super.c;
        uribuilder.g = super.d;
        uribuilder.e = super.e;
        uribuilder.f = super.g;
        uribuilder = uribuilder.a(super.i, super.j);
        uribuilder.h = super.f;
        uribuilder.c = super.b;
        uribuilder.q = com.spotify.mobile.android.spotlets.collection.util.UriBuilder.Format.b;
        return uribuilder.a();
    }

    protected final fip a(byte abyte0[])
    {
        abyte0 = (ProtoCollectionAlbumsResponse)k.a(abyte0, com/spotify/mobile/android/spotlets/collection/proto/ProtoCollectionAlbumsResponse);
        if (abyte0 == null)
        {
            return null;
        }
        enr aenr[] = new enr[((ProtoCollectionAlbumsResponse) (abyte0)).item.size()];
        Iterator iterator = ((ProtoCollectionAlbumsResponse) (abyte0)).item.iterator();
        for (int i = 0; iterator.hasNext(); i++)
        {
            aenr[i] = enz.a((ProtoCollectionAlbumsItem)iterator.next());
        }

        return new enz._cls7(aenr, abyte0);
    }

    public final void a(epg epg)
    {
        a(b(), epg, m);
    }

    protected final byte[] a(fip fip1)
    {
        if (fip1 == null)
        {
            fip1 = null;
        } else
        {
            ArrayList arraylist = new ArrayList(((enr[])fip1.getItems()).length);
            enr aenr[] = (enr[])fip1.getItems();
            int j = aenr.length;
            for (int i = 0; i < j; i++)
            {
                arraylist.add(eoa.a(aenr[i]));
            }

            fip1 = (new com.spotify.mobile.android.spotlets.collection.proto.ProtoCollectionAlbumsResponse.Builder()).unranged_length(Integer.valueOf(fip1.getUnrangedLength())).unfiltered_length(Integer.valueOf(fip1.getUnfilteredLength())).loading_contents(Boolean.valueOf(fip1.isLoading())).item(arraylist).build();
        }
        return fip1.a();
    }

    public final volatile byte[] a(Object obj)
    {
        return eoa.a((enr)obj).a();
    }

    protected final fip b(byte abyte0[])
    {
        return a(abyte0);
    }

    public final void b(epg epg)
    {
        b(b(), epg, m);
    }

    public final Object c(byte abyte0[])
    {
        return enz.a((ProtoCollectionAlbumsItem)(new gxt(new Class[0])).a(abyte0, com/spotify/mobile/android/spotlets/collection/proto/ProtoCollectionAlbumsItem));
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
        ((HashMap) (obj)).put("inCollection", Boolean.valueOf(true));
        listpolicy.setListAttributes(((java.util.Map) (obj)));
        obj = new HashMap();
        ((HashMap) (obj)).put("name", Boolean.valueOf(true));
        listpolicy.setArtistAttributes(((java.util.Map) (obj)));
        obj = new DecorationPolicy();
        ((DecorationPolicy) (obj)).setListPolicy(listpolicy);
        m = new Policy(((DecorationPolicy) (obj)));
    }
}
