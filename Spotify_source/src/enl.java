// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.spotlets.collection.json.AlbumEntityJacksonModel;
import com.spotify.mobile.android.spotlets.collection.json.TrackJacksonModel;
import com.spotify.mobile.android.spotlets.collection.model.policy.DecorationPolicy;
import com.spotify.mobile.android.spotlets.collection.model.policy.ListPolicy;
import com.spotify.mobile.android.spotlets.collection.model.policy.Policy;
import com.spotify.mobile.android.spotlets.collection.util.UriBuilder;
import com.spotify.mobile.android.spotlets.common.loader.PlayPayload;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.HashMap;

public final class enl extends epe
    implements epf, eph, epi
{

    private static final gfp k;
    private static final Policy n;
    private final ObjectMapper l;
    private final String m;

    public enl(Context context, Resolver resolver, String s, ObjectMapper objectmapper)
    {
        super(context, resolver);
        m = (new SpotifyLink(s)).b();
        l = objectmapper;
        super.c = k;
    }

    private byte[] a(ens ens1)
    {
        try
        {
            ens1 = l.writeValueAsBytes(ens1);
        }
        // Misplaced declaration of an exception variable
        catch (ens ens1)
        {
            Logger.b(ens1, "Failed to serialize AlbumEntity", new Object[0]);
            return new byte[0];
        }
        return ens1;
    }

    private byte[] a(enw enw1)
    {
        try
        {
            enw1 = l.writeValueAsBytes(enw1);
        }
        // Misplaced declaration of an exception variable
        catch (enw enw1)
        {
            Logger.b(enw1, "Failed to serialize Track", new Object[0]);
            return new byte[0];
        }
        return enw1;
    }

    private String b()
    {
        UriBuilder uribuilder = (new UriBuilder("sp://core-collection/unstable/@/view/album/<b62-album-id>")).a(500).b(m);
        uribuilder.n = super.c;
        uribuilder.e = super.e;
        uribuilder.i = super.h;
        uribuilder = uribuilder.a(super.i, super.j);
        uribuilder.c = super.b;
        uribuilder.q = com.spotify.mobile.android.spotlets.collection.util.UriBuilder.Format.a;
        return uribuilder.a();
    }

    private ens d(byte abyte0[])
    {
        return (ens)l.readValue(abyte0, com/spotify/mobile/android/spotlets/collection/json/AlbumEntityJacksonModel);
    }

    protected final fip a(byte abyte0[])
    {
        return d(abyte0);
    }

    public final void a(PlayOptions playoptions, PlayOrigin playorigin)
    {
        UriBuilder uribuilder = new UriBuilder("sp://core-collection/unstable/@/list/tracks/album/<b62-album-id>");
        uribuilder.l = true;
        uribuilder = uribuilder.b(m);
        uribuilder.n = super.c;
        uribuilder.e = super.e;
        uribuilder.c = super.b;
        a(uribuilder.a(), ((com.spotify.mobile.android.cosmos.JacksonModel) (new PlayPayload(playoptions, playorigin))), true);
    }

    public final void a(epg epg)
    {
        a(b(), epg, n);
    }

    public final void a(boolean flag)
    {
        Object obj = new UriBuilder("sp://core-collection/unstable/@/view/album/<b62-album-id>");
        obj.m = true;
        obj = ((UriBuilder) (obj)).b(m);
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

    protected final volatile byte[] a(fip fip)
    {
        return a((ens)fip);
    }

    public final volatile byte[] a(Object obj)
    {
        return a((enw)obj);
    }

    protected final fip b(byte abyte0[])
    {
        return d(abyte0);
    }

    public final void b(epg epg)
    {
        b(b(), epg, n);
    }

    public final Object c(byte abyte0[])
    {
        return (enw)l.readValue(abyte0, com/spotify/mobile/android/spotlets/collection/json/TrackJacksonModel);
    }

    static 
    {
        Object obj = new gfp("discNumber");
        obj.d = new gfp("trackNumber");
        k = ((gfp) (obj));
        obj = new ListPolicy();
        Object obj1 = new HashMap();
        ((HashMap) (obj1)).put("link", Boolean.valueOf(true));
        ((HashMap) (obj1)).put("name", Boolean.valueOf(true));
        ((HashMap) (obj1)).put("offline", Boolean.valueOf(true));
        ((HashMap) (obj1)).put("playable", Boolean.valueOf(true));
        ((HashMap) (obj1)).put("isExplicit", Boolean.valueOf(true));
        ((ListPolicy) (obj)).setListAttributes(((java.util.Map) (obj1)));
        obj1 = new HashMap();
        ((HashMap) (obj1)).put("name", Boolean.valueOf(true));
        ((ListPolicy) (obj)).setAlbumAttributes(((java.util.Map) (obj1)));
        ((ListPolicy) (obj)).setArtistAttributes(((java.util.Map) (obj1)));
        ((ListPolicy) (obj)).setArtistsAttributes(((java.util.Map) (obj1)));
        obj1 = new DecorationPolicy();
        ((DecorationPolicy) (obj1)).setListPolicy(((ListPolicy) (obj)));
        n = new Policy(((DecorationPolicy) (obj1)));
    }
}
