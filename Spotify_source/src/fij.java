// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.spotlets.collection.model.policy.DecorationPolicy;
import com.spotify.mobile.android.spotlets.collection.model.policy.ListPolicy;
import com.spotify.mobile.android.spotlets.collection.model.policy.Policy;
import com.spotify.mobile.android.spotlets.collection.util.UriBuilder;
import com.spotify.mobile.android.spotlets.show.proto.ProtoOfflinedEpisodesResponse;
import com.spotify.mobile.android.spotlets.show.proto.ProtoUnplayedEpisodesResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class fij extends epe
    implements fii
{

    private static final String k = "sp://core-collection/unstable/<username>/list/episodes/all";
    private static final String l = "sp://core-collection/unstable/<username>/list/episodes/union";
    private static final String m = "sp://core-collection/unstable/<username>/list/episodes/offline";
    private static final Policy q;
    private final gxt n = new gxt(new Class[0]);
    private final String o;
    private com.spotify.mobile.android.spotlets.show.model.Show.MediaType p;

    public fij(Context context, Resolver resolver, String s)
    {
        super(context, resolver);
        o = s;
    }

    private String b()
    {
        Object obj;
        if (super.d)
        {
            obj = k;
        } else
        if (super.e)
        {
            obj = m;
        } else
        {
            obj = l;
        }
        obj = (new UriBuilder(((String) (obj)))).a(100).a(o);
        obj.n = super.c;
        obj = ((UriBuilder) (obj)).a(super.i, super.j);
        obj.g = super.d;
        obj.e = super.e;
        obj.h = super.f;
        obj.q = com.spotify.mobile.android.spotlets.collection.util.UriBuilder.Format.b;
        if (super.f)
        {
            obj.i = true;
            obj.p = p;
            obj.j = true;
        }
        return ((UriBuilder) (obj)).a();
    }

    public final fip a(byte abyte0[])
    {
        if (super.e)
        {
            return fiu.a((ProtoOfflinedEpisodesResponse)n.a(abyte0, com/spotify/mobile/android/spotlets/show/proto/ProtoOfflinedEpisodesResponse));
        } else
        {
            return fiu.a((ProtoUnplayedEpisodesResponse)n.a(abyte0, com/spotify/mobile/android/spotlets/show/proto/ProtoUnplayedEpisodesResponse));
        }
    }

    public final void a(com.spotify.mobile.android.spotlets.show.model.Show.MediaType mediatype)
    {
        p = mediatype;
    }

    public final void a(epg epg)
    {
        a(b(), epg, q);
    }

    public final byte[] a(fip fip1)
    {
        Object obj = null;
        if (super.e)
        {
            if (fip1 == null)
            {
                fip1 = obj;
            } else
            {
                ArrayList arraylist = new ArrayList(((fio[])fip1.getItems()).length);
                fio afio[] = (fio[])fip1.getItems();
                int j = afio.length;
                int i = 0;
                while (i < j) 
                {
                    Object obj1 = afio[i];
                    if (obj1 == null)
                    {
                        obj1 = null;
                    } else
                    {
                        obj1 = (new com.spotify.mobile.android.spotlets.show.proto.ProtoOfflinedEpisodesRequestItem.Builder()).episode_collection_state(fiv.a(((fio) (obj1)))).episode_metadata(fiv.d(((fio) (obj1)))).episode_offline_state(fiv.c(((fio) (obj1)))).episode_play_state(fiv.b(((fio) (obj1)))).header(((fio) (obj1)).getHeader()).build();
                    }
                    arraylist.add(obj1);
                    i++;
                }
                fip1 = (new com.spotify.mobile.android.spotlets.show.proto.ProtoOfflinedEpisodesResponse.Builder()).unfiltered_length(Integer.valueOf(fip1.getUnfilteredLength())).unranged_length(Integer.valueOf(fip1.getUnrangedLength())).loading_contents(Boolean.valueOf(fip1.isLoading())).item(arraylist).build();
            }
            return fip1.a();
        } else
        {
            return fiv.a(fip1).a();
        }
    }

    public final byte[] a(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final fip b(byte abyte0[])
    {
        if (super.e)
        {
            return fiu.a((ProtoOfflinedEpisodesResponse)n.a(abyte0, com/spotify/mobile/android/spotlets/show/proto/ProtoOfflinedEpisodesResponse));
        } else
        {
            return fiu.a((ProtoUnplayedEpisodesResponse)n.a(abyte0, com/spotify/mobile/android/spotlets/show/proto/ProtoUnplayedEpisodesResponse));
        }
    }

    public final void b(epg epg)
    {
        b(b(), epg, q);
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
        ((HashMap) (obj)).put("playable", Boolean.valueOf(true));
        ((HashMap) (obj)).put("available", Boolean.valueOf(true));
        ((HashMap) (obj)).put("covers", Boolean.valueOf(true));
        ((HashMap) (obj)).put("freezeFrames", Boolean.valueOf(true));
        ((HashMap) (obj)).put("manifestId", Boolean.valueOf(true));
        ((HashMap) (obj)).put("mediaTypeEnum", Boolean.valueOf(true));
        listpolicy.setListAttributes(((java.util.Map) (obj)));
        obj = new HashMap();
        ((HashMap) (obj)).put("name", Boolean.valueOf(true));
        ((HashMap) (obj)).put("link", Boolean.valueOf(true));
        ((HashMap) (obj)).put("inCollection", Boolean.valueOf(true));
        listpolicy.setShowAttributes(((java.util.Map) (obj)));
        obj = new DecorationPolicy();
        ((DecorationPolicy) (obj)).setListPolicy(listpolicy);
        q = new Policy(((DecorationPolicy) (obj)));
    }
}
