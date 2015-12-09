// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.fasterxml.jackson.databind.JsonNode;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.viewuri.Verified;
import java.util.Locale;

public final class fga
    implements fgf
{

    private boolean a;
    private final Context b;

    public fga(fop fop1, Context context)
    {
        ctz.a(fop1);
        b = (Context)ctz.a(context);
    }

    private void a(ClientEvent clientevent, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, fgc fgc1)
    {
        if (a)
        {
            if (fgc1 != null && fgc1.isSessionAvailable())
            {
                clientevent.a("searchIntentSessionId", fgc1.getCurrentSessionId());
                clientevent.a("searchIntentSessionSeqNo", String.valueOf(fgc1.getCurrentSequenceNumber()));
                Locale locale = b.getResources().getConfiguration().locale;
                fgc1 = locale;
                if (locale == null)
                {
                    fgc1 = Locale.getDefault();
                }
                clientevent.a("locale", fgc1.toString());
            }
            fop.a(b, verified, subview, clientevent);
        }
    }

    private void a(ClientEvent clientevent, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, fgg fgg1)
    {
        drw drw1 = fgg1.c().getLoggingData();
        if (drw1 == null)
        {
            Assertion.b("No logging data!");
            return;
        }
        clientevent.a("index", String.valueOf(fgg1.f()));
        if (!drw1.b().isMissingNode() && !drw1.b().isNull())
        {
            clientevent.a("entityLoggingData", drw1.b());
        }
        clientevent.a("query", fgg1.a());
        clientevent.a("target_uri", drw1.a());
        clientevent.a("context", fgg1.d());
        a(clientevent, fgg1.b(), subview, fgg1.e());
    }

    public final void a()
    {
        a = true;
    }

    public final void a(com.spotify.mobile.android.util.ClientEvent.Event event, fgg fgg1)
    {
        a((new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.Q, com.spotify.mobile.android.util.ClientEvent.SubEvent.E)).a("contextMenuEvent", event.toString()), com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, fgg1);
    }

    public final void a(Verified verified)
    {
        a(ClientEventFactory.a("search", com.spotify.mobile.android.util.ClientEvent.SubEvent.aG, null, null), verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.r, null);
    }

    public final void a(fgg fgg1)
    {
        com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.C;
        a(ClientEventFactory.a("search", com.spotify.mobile.android.util.ClientEvent.SubEvent.aV, null, null), subview, fgg1);
    }

    public final void a(String s, int i, Verified verified)
    {
        ClientEvent clientevent = ClientEventFactory.a("search", com.spotify.mobile.android.util.ClientEvent.SubEvent.aE, null, Long.valueOf(i));
        clientevent.a("name", s);
        a(clientevent, verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.r, null);
    }

    public final void a(String s, Verified verified, fgc fgc1)
    {
        a(ClientEventFactory.a("search", com.spotify.mobile.android.util.ClientEvent.SubEvent.aI, null, null).a("query", s), verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.b, fgc1);
    }

    public final void a(String s, String s1, Verified verified)
    {
        ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.Q, com.spotify.mobile.android.util.ClientEvent.SubEvent.H);
        if (s != null)
        {
            clientevent.a("searchIntentSessionOld", s);
        }
        clientevent.a("searchIntentSessionNew", s1);
        a(clientevent, verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, null);
    }

    public final void a(String s, String s1, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, fgc fgc1)
    {
        a(ClientEventFactory.a("search", com.spotify.mobile.android.util.ClientEvent.SubEvent.aH, null, null).a("query", s).a("context", s1), verified, subview, fgc1);
    }

    public final void b()
    {
        a = false;
    }

    public final void b(String s, int i, Verified verified)
    {
        a(ClientEventFactory.a("search", com.spotify.mobile.android.util.ClientEvent.SubEvent.aF, null, Long.valueOf(i)).a("name", s), verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.r, null);
    }
}
