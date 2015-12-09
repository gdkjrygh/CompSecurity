// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public final class gnd extends BroadcastReceiver
{

    private static final List c = Lists.a(new String[] {
        "android.intent.action.TIME_SET", "android.intent.action.TIMEZONE_CHANGED"
    });
    public final Context a;
    public final IntentFilter b = new IntentFilter();
    private TimeZone d;
    private long e;

    public gnd(Context context)
    {
        a = context;
        String s;
        for (context = c.iterator(); context.hasNext(); b.addAction(s))
        {
            s = (String)context.next();
        }

        dmz.a(ggb);
        ggb.a();
    }

    public final void a()
    {
        ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.Q, com.spotify.mobile.android.util.ClientEvent.SubEvent.bX);
        clientevent.a("1");
        TimeZone timezone = gcf.d();
        clientevent.a("seconds_from_UTC", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(timezone.getOffset((new Date()).getTime()))));
        clientevent.a("device_timestamp_UTC", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(gcf.a())));
        dmz.a(fop);
        fop.a(a, ViewUri.J, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.X, clientevent);
        d = gcf.d();
        e = gcf.a();
    }

    public final void onReceive(Context context, Intent intent)
    {
        boolean flag = false;
        Assertion.a(c.contains(intent.getAction()), (new StringBuilder("Unsupported action: ")).append(intent.getAction()).toString());
        intent.getAction();
        if (d == null || !gcf.d().getID().equals(d.getID()) || Math.abs(e - gcf.a()) > TimeUnit.MINUTES.toMillis(5L))
        {
            flag = true;
        }
        if (flag)
        {
            a();
        }
    }

}
