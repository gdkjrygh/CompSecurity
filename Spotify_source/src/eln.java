// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import com.spotify.mobile.android.util.ClientEvent;

public final class eln
{

    private final elq a;

    public eln(elq elq1)
    {
        dmz.a(fop);
        ctz.a(elq1);
        a = elq1;
    }

    public final ClientEvent a(int i, String s, String s1, String s2, String s3)
    {
        ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, a.a);
        clientevent.a("index", String.valueOf(i));
        clientevent.a("name", (String)ctz.a(s));
        clientevent.a("target_uri", (String)ctz.a(s1));
        if (!TextUtils.isEmpty(s2))
        {
            clientevent.a("section", s2);
        }
        if (!TextUtils.isEmpty(s3))
        {
            clientevent.a("action", s3);
        }
        return clientevent;
    }

    public final void a(Context context, int i, String s, String s1, String s2)
    {
        s = a(i, s, s1, s2, null);
        fop.a(context, a.b, a.c, s);
    }
}
