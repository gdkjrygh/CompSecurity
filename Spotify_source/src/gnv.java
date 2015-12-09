// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;

public final class gnv
{

    public static ClientEvent a(String s, long l, String s1, String s2)
    {
        ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.P, com.spotify.mobile.android.util.ClientEvent.SubEvent.dd);
        clientevent.a("target_uri", s);
        clientevent.a("status", s1);
        clientevent.a("message", s2);
        clientevent.a("duration", Long.toString(l));
        return clientevent;
    }

    public static void a(Context context, ClientEvent clientevent)
    {
        dmz.a(fop);
        fop.a(context, ViewUri.n, clientevent);
    }
}
