// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.spotlets.eventshub.model.Artist;
import com.spotify.mobile.android.spotlets.eventshub.model.Concert;
import com.spotify.mobile.android.spotlets.eventshub.model.SourceType;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public final class ese
{

    private static Map b;
    private static final ObjectMapper d;
    public HashSet a;
    private final Context c;

    public ese(Context context)
    {
        a = new HashSet();
        Assertion.a(context);
        c = context;
    }

    public static void a(ClientEvent clientevent, Concert concert)
    {
        Assertion.a(clientevent);
        Assertion.a(concert);
        clientevent.a("id", concert.getId());
        clientevent.a("title", concert.getTitle());
        clientevent.a("artists-with-affinity", d.valueToTree(a(concert.getArtistsWithAffinity())));
        clientevent.a("artists-without-affinity", d.valueToTree(a(concert.getArtistsWithOutAffinity())));
    }

    public static void a(ClientEvent clientevent, SourceType sourcetype, int i)
    {
        Assertion.a(clientevent);
        Assertion.a(sourcetype);
        clientevent.a("section", (String)b.get(sourcetype));
        clientevent.a("index", Integer.toString(i));
    }

    private static String[] a(Artist aartist[])
    {
        Assertion.a(aartist);
        String as[] = new String[aartist.length];
        for (int i = 0; i < aartist.length; i++)
        {
            as[i] = aartist[i].getUri();
        }

        return as;
    }

    public final void a(int i)
    {
        ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.R, com.spotify.mobile.android.util.ClientEvent.SubEvent.dE);
        clientevent.a("count", Integer.toString(i));
        a(com.spotify.mobile.android.util.viewuri.ViewUri.SubView.Y, clientevent);
    }

    public final void a(com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, ClientEvent clientevent)
    {
        Assertion.a(subview);
        Assertion.a(clientevent);
        dmz.a(fop);
        fop.a(c, ViewUri.Q, subview, clientevent);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        hashmap.put(SourceType.b, "RECOMMENDED");
        hashmap.put(SourceType.a, "POPULAR NEAR YOU");
        b = Collections.unmodifiableMap(hashmap);
        d = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
    }
}
