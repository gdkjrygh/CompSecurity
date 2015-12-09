// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

public final class gjv extends gjs
{

    private Map c;
    private Context d;

    public gjv(Context context)
    {
        super(context);
        c = new HashMap();
        d = context;
    }

    private static ClientEvent a(Map map, com.spotify.mobile.android.util.ClientEvent.Event event)
    {
        event = new ClientEvent(event);
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); event.a((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        map = new SimpleDateFormat("EEE MMM dd yyyy HH:mm:ss 'GMT'Z", Locale.US);
        map.setTimeZone(TimeZone.getTimeZone("GMT"));
        event.a("date", map.format(new Date()));
        event.a("testing-test-group");
        return event;
    }

    public final void a()
    {
        Map map = super.b;
        String s = (String)map.get("key");
        String s1 = (String)map.get("value");
        if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1))
        {
            c.put(s, s1);
        }
        if (map.containsKey("survey_shown"))
        {
            ClientEvent clientevent1 = a(c, com.spotify.mobile.android.util.ClientEvent.Event.ag);
            dmz.a(fop);
            fop.a(d, ViewUri.a, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.B, clientevent1);
        }
        if (map.containsKey("submit"))
        {
            ClientEvent clientevent = a(c, com.spotify.mobile.android.util.ClientEvent.Event.af);
            dmz.a(fop);
            fop.a(d, ViewUri.a, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.B, clientevent);
        }
    }
}
