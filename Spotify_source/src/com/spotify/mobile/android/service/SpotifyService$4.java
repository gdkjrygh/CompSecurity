// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service;

import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import dmz;
import fop;

// Referenced classes of package com.spotify.mobile.android.service:
//            SpotifyService

final class a
    implements Runnable
{

    private String a;

    public final void run()
    {
        ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util..as, com.spotify.mobile.android.util.ent.dh);
        clientevent.a("version_code", SpotifyService.b);
        clientevent.a("reason", a);
        dmz.a(fop);
        fop.a(ViewUri.a, com.spotify.mobile.android.util.viewuri., clientevent);
    }

    iew(String s)
    {
        a = s;
        super();
    }
}
