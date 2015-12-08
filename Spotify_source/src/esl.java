// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class esl
    implements dmx
{

    private static final ObjectMapper l;
    public final fop a = (fop)dmz.a(fop);
    public Context b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    private int m;

    public esl()
    {
    }

    public final String a()
    {
        return String.valueOf(m - 1);
    }

    public final void a(esi esi1)
    {
        e = esi1.a;
        f = esi1.a - esi1.b;
        i = esi1.c.size();
        j = esi1.d.size();
    }

    public final void a(esj esj1)
    {
        c = esj1.a;
        d = esj1.a - esj1.b;
        g = esj1.d.size();
        h = esj1.e.size();
        m = esj1.getCount();
        k = esj1.c;
    }

    public final void a(boolean flag)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("FACEBOOK", Boolean.valueOf(flag));
        ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.R, com.spotify.mobile.android.util.ClientEvent.SubEvent.cf);
        clientevent.a("n_friends", String.valueOf(String.valueOf(c)));
        clientevent.a("n_friends_not_followed", String.valueOf(d));
        clientevent.a("networks", l.valueToTree(hashmap));
        clientevent.a("not_connected", String.valueOf(flag));
        fop.a(b, ViewUri.p, clientevent);
    }

    static 
    {
        l = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
    }
}
