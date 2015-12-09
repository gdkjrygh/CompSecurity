// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.Verified;

public final class gbq
{

    public gbq()
    {
        dmz.a(fop);
    }

    public static void a(Context context, Verified verified, String s)
    {
        ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.aD);
        String s1 = "";
        if (s != null)
        {
            s1 = s;
        }
        clientevent.a("adId", (String)s1);
        fop.a(context, verified, clientevent);
    }
}
