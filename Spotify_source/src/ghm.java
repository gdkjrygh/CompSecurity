// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import org.json.JSONException;
import org.json.JSONObject;

public class ghm
    implements dmx
{

    private final gcz a;
    private ghn b;
    private ghn c;

    public ghm(gcz gcz1)
    {
        b = new ghn() {

            public final void a(Context context, ClientEvent clientevent)
            {
                fop.a(context, ViewUri.a, clientevent);
            }

        };
        c = new ghn() {

            public final void a(Context context, ClientEvent clientevent)
            {
                gdu.a(ViewUri.a, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, clientevent);
            }

        };
        a = gcz1;
    }

    private void a(Context context, SpotifyLink spotifylink, ClientEvent clientevent, boolean flag)
    {
        ctz.a(spotifylink);
        if (!spotifylink.f())
        {
            Assertion.b((new StringBuilder("link is not tracked: ")).append(spotifylink.toString()).toString());
            return;
        }
        clientevent.a("device-id", a.e());
        clientevent.a("tracking-id", spotifylink.b);
        String s;
        if (flag)
        {
            b.a(context, clientevent);
        } else
        {
            c.a(context, clientevent);
        }
        s = spotifylink.b;
        context = cxk.a(context, "6220470886a584968d7466d2d0953005");
        context.a(s);
        try
        {
            JSONObject jsonobject = new JSONObject(clientevent.a());
            jsonobject.remove("tracking-id");
            context.a(clientevent.b.toString(), jsonobject);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Assertion.a("Exception while building tracking request", context);
        }
        clientevent.b.toString();
        spotifylink.toString();
    }

    public final void a(Context context, Intent intent, ClientEvent clientevent)
    {
        if ("android.intent.action.VIEW".equals(intent.getAction()))
        {
            if ((intent = intent.getDataString()) != null && (intent = new SpotifyLink(intent)).f())
            {
                a(context, ((SpotifyLink) (intent)), clientevent, false);
                return;
            }
        }
    }

    public final void a(Context context, SpotifyLink spotifylink, ClientEvent clientevent)
    {
        a(context, spotifylink, clientevent, true);
    }
}
