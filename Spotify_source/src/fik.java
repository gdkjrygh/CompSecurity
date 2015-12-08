// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.spotlets.collection.model.policy.DecorationPolicy;
import com.spotify.mobile.android.spotlets.collection.model.policy.ListPolicy;
import com.spotify.mobile.android.spotlets.collection.model.policy.Policy;
import com.spotify.mobile.android.spotlets.collection.util.UriBuilder;
import com.spotify.mobile.android.spotlets.show.proto.ProtoShowResponse;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class fik extends epe
    implements fih
{

    private static Policy n;
    private final String k;
    private final gxt l = new gxt(new Class[0]);
    private String m;

    public fik(Context context, Resolver resolver, String s)
    {
        super(context, resolver);
        k = s;
    }

    private String b()
    {
        UriBuilder uribuilder = (new UriBuilder("sp://core-show/unstable/show/<b62-show-id>")).a(100);
        String s = (new SpotifyLink(k)).b();
        Assertion.a(uribuilder.a.contains("<b62-show-id>"), "Base uri does not contain the show id placeholder.");
        uribuilder.b = s;
        uribuilder.e = super.e;
        uribuilder.g = super.d;
        uribuilder.h = super.f;
        uribuilder = uribuilder.a(super.i, super.j);
        uribuilder.i = true;
        uribuilder.n = super.c;
        uribuilder.q = com.spotify.mobile.android.spotlets.collection.util.UriBuilder.Format.b;
        if (m != null)
        {
            uribuilder.d = m;
            uribuilder.o = Integer.valueOf(15);
        }
        return uribuilder.a();
    }

    public final volatile fip a(byte abyte0[])
    {
        return fiu.a((ProtoShowResponse)l.a(abyte0, com/spotify/mobile/android/spotlets/show/proto/ProtoShowResponse));
    }

    public final void a(epg epg)
    {
        a(b(), epg, n);
    }

    public final byte[] a(fip fip)
    {
        Object obj = null;
        Object obj1 = null;
        fir fir1 = (fir)fip;
        if (fir1 == null)
        {
            fip = obj1;
        } else
        {
            ArrayList arraylist = new ArrayList(((fio[])fir1.getItems()).length);
            fio afio[] = (fio[])fir1.getItems();
            int j = afio.length;
            int i = 0;
            while (i < j) 
            {
                fip = afio[i];
                if (fip == null)
                {
                    fip = null;
                } else
                {
                    fip = (new com.spotify.mobile.android.spotlets.show.proto.ProtoShowRequestItem.Builder()).episode_collection_state(fiv.a(fip)).episode_metadata(fiv.d(fip)).episode_offline_state(fiv.c(fip)).episode_play_state(fiv.b(fip)).header(fip.getHeader()).build();
                }
                arraylist.add(fip);
                i++;
            }
            com.spotify.mobile.android.spotlets.show.proto.ProtoShowResponse.Builder builder = (new com.spotify.mobile.android.spotlets.show.proto.ProtoShowResponse.Builder()).unfiltered_length(Integer.valueOf(fir1.getUnfilteredLength())).unranged_length(Integer.valueOf(fir1.getUnrangedLength())).length(Integer.valueOf(((fio[])fir1.getItems()).length)).loading_contents(Boolean.valueOf(fir1.isLoading()));
            fip = fir1.a();
            if (fip == null)
            {
                fip = null;
            } else
            {
                fip = (new com.spotify.mobile.android.spotlets.show.proto.ProtoShowRequestHeader.Builder()).show_play_state(fiv.d(fip)).show_metadata(fiv.b(fip)).show_collection_state(fiv.c(fip)).build();
            }
            builder = builder.header(fip);
            fip = fir1.b();
            if (fip == null)
            {
                fip = obj;
            } else
            {
                fip = (new com.spotify.mobile.android.spotlets.show.proto.ProtoOnlineData.Builder()).num_followers(Integer.valueOf(fip.a())).build();
            }
            fip = builder.online_data(fip).item(arraylist).build();
        }
        return fip.a();
    }

    public final byte[] a(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final void a_(String s)
    {
        m = s;
    }

    public final fip b(byte abyte0[])
    {
        return fiu.a((ProtoShowResponse)l.a(abyte0, com/spotify/mobile/android/spotlets/show/proto/ProtoShowResponse));
    }

    public final void b(epg epg)
    {
        b(b(), epg, n);
    }

    public final Object c(byte abyte0[])
    {
        throw new UnsupportedOperationException();
    }

    static 
    {
        ListPolicy listpolicy = new ListPolicy();
        Object obj = new HashMap();
        ((HashMap) (obj)).put("link", Boolean.valueOf(true));
        ((HashMap) (obj)).put("name", Boolean.valueOf(true));
        ((HashMap) (obj)).put("offline", Boolean.valueOf(true));
        ((HashMap) (obj)).put("isNew", Boolean.valueOf(true));
        ((HashMap) (obj)).put("isPlayed", Boolean.valueOf(true));
        ((HashMap) (obj)).put("length", Boolean.valueOf(true));
        ((HashMap) (obj)).put("timeLeft", Boolean.valueOf(true));
        ((HashMap) (obj)).put("publishDate", Boolean.valueOf(true));
        ((HashMap) (obj)).put("playable", Boolean.valueOf(true));
        ((HashMap) (obj)).put("available", Boolean.valueOf(true));
        ((HashMap) (obj)).put("covers", Boolean.valueOf(true));
        ((HashMap) (obj)).put("freezeFrames", Boolean.valueOf(true));
        ((HashMap) (obj)).put("manifestId", Boolean.valueOf(true));
        ((HashMap) (obj)).put("mediaTypeEnum", Boolean.valueOf(true));
        listpolicy.setListAttributes(((java.util.Map) (obj)));
        obj = new HashMap();
        ((HashMap) (obj)).put("link", Boolean.valueOf(true));
        ((HashMap) (obj)).put("inCollection", Boolean.valueOf(true));
        listpolicy.setShowAttributes(((java.util.Map) (obj)));
        obj = new DecorationPolicy();
        ((DecorationPolicy) (obj)).setListPolicy(listpolicy);
        n = new Policy(((DecorationPolicy) (obj)));
    }
}
