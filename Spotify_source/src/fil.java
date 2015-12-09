// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.spotlets.collection.model.policy.DecorationPolicy;
import com.spotify.mobile.android.spotlets.collection.model.policy.ListPolicy;
import com.spotify.mobile.android.spotlets.collection.model.policy.Policy;
import com.spotify.mobile.android.spotlets.collection.util.UriBuilder;
import com.spotify.mobile.android.spotlets.show.model.Show;
import com.spotify.mobile.android.spotlets.show.proto.ProtoShowsRequestItem;
import com.spotify.mobile.android.spotlets.show.proto.ProtoShowsResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class fil extends epe
    implements epf
{

    private static Policy m;
    private final gxt k = new gxt(new Class[0]);
    private final String l;

    public fil(Context context, Resolver resolver, String s)
    {
        super(context, resolver);
        l = s;
    }

    private String b()
    {
        UriBuilder uribuilder = (new UriBuilder("sp://core-collection/unstable/<username>/list/shows/all")).a(100).a(l);
        uribuilder.n = super.c;
        uribuilder = uribuilder.a(super.i, super.j);
        uribuilder.g = super.d;
        uribuilder.e = super.e;
        uribuilder.h = super.f;
        uribuilder.q = com.spotify.mobile.android.spotlets.collection.util.UriBuilder.Format.b;
        return uribuilder.a();
    }

    private fis d(byte abyte0[])
    {
        abyte0 = (ProtoShowsResponse)k.a(abyte0, com/spotify/mobile/android/spotlets/show/proto/ProtoShowsResponse);
        if (abyte0 == null)
        {
            return null;
        }
        Show ashow[] = new Show[((ProtoShowsResponse) (abyte0)).item.size()];
        Iterator iterator = ((ProtoShowsResponse) (abyte0)).item.iterator();
        for (int i = 0; iterator.hasNext(); i++)
        {
            ashow[i] = fiu.a((ProtoShowsRequestItem)iterator.next());
        }

        return new fiu._cls3(abyte0, ashow);
    }

    public final fip a(byte abyte0[])
    {
        return d(abyte0);
    }

    public final void a(epg epg)
    {
        a(b(), epg, m);
    }

    public final byte[] a(fip fip)
    {
        fip = (fis)fip;
        if (fip == null)
        {
            fip = null;
        } else
        {
            ArrayList arraylist = new ArrayList(((Show[])fip.getItems()).length);
            Show ashow[] = (Show[])fip.getItems();
            int j = ashow.length;
            for (int i = 0; i < j; i++)
            {
                arraylist.add(fiv.a(ashow[i]));
            }

            fip = (new com.spotify.mobile.android.spotlets.show.proto.ProtoShowsResponse.Builder()).unfiltered_length(Integer.valueOf(fip.getUnfilteredLength())).unranged_length(Integer.valueOf(fip.getUnrangedLength())).loading_contents(Boolean.valueOf(fip.isLoading())).num_offlined_episodes(Integer.valueOf(fip.a())).item(arraylist).build();
        }
        return fip.a();
    }

    public final volatile byte[] a(Object obj)
    {
        return fiv.a((Show)obj).a();
    }

    public final fip b(byte abyte0[])
    {
        return d(abyte0);
    }

    public final void b(epg epg)
    {
        b(b(), epg, m);
    }

    public final Object c(byte abyte0[])
    {
        return fiu.a((ProtoShowsRequestItem)k.a(abyte0, com/spotify/mobile/android/spotlets/show/proto/ProtoShowsRequestItem));
    }

    static 
    {
        ListPolicy listpolicy = new ListPolicy();
        Object obj = new HashMap();
        ((HashMap) (obj)).put("link", Boolean.valueOf(true));
        ((HashMap) (obj)).put("name", Boolean.valueOf(true));
        ((HashMap) (obj)).put("covers", Boolean.valueOf(true));
        ((HashMap) (obj)).put("publisher", Boolean.valueOf(true));
        listpolicy.setListAttributes(((java.util.Map) (obj)));
        obj = new DecorationPolicy();
        ((DecorationPolicy) (obj)).setListPolicy(listpolicy);
        m = new Policy(((DecorationPolicy) (obj)));
    }
}
