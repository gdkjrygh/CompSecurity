// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.spotlets.collection.model.policy.DecorationPolicy;
import com.spotify.mobile.android.spotlets.collection.model.policy.ListPolicy;
import com.spotify.mobile.android.spotlets.collection.model.policy.Policy;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoCollectionArtistsItem;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoCollectionArtistsResponse;
import com.spotify.mobile.android.spotlets.collection.util.UriBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class enn extends epe
    implements epf
{

    private static final Policy m;
    private final gxt k = new gxt(new Class[0]);
    private final String l;

    public enn(Context context, Resolver resolver, String s)
    {
        super(context, resolver);
        l = s;
    }

    private String b()
    {
        UriBuilder uribuilder = (new UriBuilder("sp://core-collection/unstable/<username>/list/artists/all")).a(1000).a(l);
        uribuilder.n = super.c;
        uribuilder.g = super.d;
        uribuilder.e = super.e;
        uribuilder = uribuilder.a(super.i, super.j);
        uribuilder.h = super.f;
        uribuilder.c = super.b;
        uribuilder.q = com.spotify.mobile.android.spotlets.collection.util.UriBuilder.Format.b;
        return uribuilder.a();
    }

    protected final fip a(byte abyte0[])
    {
        abyte0 = (ProtoCollectionArtistsResponse)k.a(abyte0, com/spotify/mobile/android/spotlets/collection/proto/ProtoCollectionArtistsResponse);
        if (abyte0 == null)
        {
            return null;
        }
        ent aent[] = new ent[((ProtoCollectionArtistsResponse) (abyte0)).item.size()];
        Iterator iterator = ((ProtoCollectionArtistsResponse) (abyte0)).item.iterator();
        for (int i = 0; iterator.hasNext(); i++)
        {
            aent[i] = enz.a((ProtoCollectionArtistsItem)iterator.next());
        }

        return new enz._cls8(aent, abyte0);
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
            ArrayList arraylist = new ArrayList(((ent[])fip1.getItems()).length);
            ent aent[] = (ent[])fip1.getItems();
            int j = aent.length;
            for (int i = 0; i < j; i++)
            {
                arraylist.add(eoa.a(aent[i]));
            }

            fip1 = (new com.spotify.mobile.android.spotlets.collection.proto.ProtoCollectionArtistsResponse.Builder()).unranged_length(Integer.valueOf(fip1.getUnrangedLength())).unfiltered_length(Integer.valueOf(fip1.getUnfilteredLength())).loading_contents(Boolean.valueOf(fip1.isLoading())).item(arraylist).build();
        }
        return fip1.a();
    }

    public final volatile byte[] a(Object obj)
    {
        return eoa.a((ent)obj).a();
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
        return enz.a((ProtoCollectionArtistsItem)(new gxt(new Class[0])).a(abyte0, com/spotify/mobile/android/spotlets/collection/proto/ProtoCollectionArtistsItem));
    }

    static 
    {
        ListPolicy listpolicy = new ListPolicy();
        Object obj = new HashMap();
        ((HashMap) (obj)).put("link", Boolean.valueOf(true));
        ((HashMap) (obj)).put("name", Boolean.valueOf(true));
        ((HashMap) (obj)).put("offline", Boolean.valueOf(true));
        ((HashMap) (obj)).put("syncProgress", Boolean.valueOf(true));
        ((HashMap) (obj)).put("portraits", Boolean.valueOf(true));
        ((HashMap) (obj)).put("collectionLink", Boolean.valueOf(true));
        ((HashMap) (obj)).put("isFollowed", Boolean.valueOf(true));
        ((HashMap) (obj)).put("numTracksInCollection", Boolean.valueOf(true));
        listpolicy.setListAttributes(((java.util.Map) (obj)));
        obj = new DecorationPolicy();
        ((DecorationPolicy) (obj)).setListPolicy(listpolicy);
        m = new Policy(((DecorationPolicy) (obj)));
    }
}
