// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.TrafficStats;
import com.spotify.mobile.android.service.SpotifyService;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import java.util.concurrent.TimeUnit;

public final class dut
    implements Runnable
{

    private int a;
    private gin b;
    private dus c;

    public dut(dus dus1, int i, gin gin1)
    {
        c = dus1;
        super();
        a = i;
        b = gin1;
    }

    public final void run()
    {
        long l1 = TrafficStats.getUidRxBytes(a);
        long l;
        long l2;
        if (b.f(dus.b))
        {
            l = (l1 - b.b(dus.b)) + b.b(dus.c);
        } else
        {
            l = l1;
        }
        b.b().a(dus.c, l).b();
        if (l > dus.a(c))
        {
            ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.k);
            clientevent.a("version_code", SpotifyService.b);
            clientevent.a("usage", String.valueOf(l1));
            dmz.a(fop);
            fop.a(ViewUri.a, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, clientevent);
            dus.a(c, dus.a(c) << 1);
        }
        l = System.currentTimeMillis();
        l2 = b.b(dus.a);
        if (TimeUnit.DAYS.convert(l - l2, TimeUnit.MILLISECONDS) >= 30L)
        {
            b.g(dus.c);
            b.b().a(dus.b, l1).b();
        }
    }
}
