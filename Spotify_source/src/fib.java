// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.spotify.mobile.android.spotlets.share.model.Network;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class fib
{

    public boolean a;
    private HashMap b;
    private Context c;

    public fib(Context context)
    {
        dmz.a(fop);
        c = context;
        b = new HashMap();
        b.put("post_to", com.spotify.mobile.android.util.ClientEvent.SubEvent.cC);
        b.put("send_to", com.spotify.mobile.android.util.ClientEvent.SubEvent.cD);
        b.put(com.spotify.mobile.android.spotlets.share.util.AppInfoHelper.App.f.mPackageNameSpace, com.spotify.mobile.android.util.ClientEvent.SubEvent.cy);
        b.put(com.spotify.mobile.android.spotlets.share.util.AppInfoHelper.App.c.mPackageNameSpace, com.spotify.mobile.android.util.ClientEvent.SubEvent.cz);
        b.put(com.spotify.mobile.android.spotlets.share.util.AppInfoHelper.App.a.mPackageNameSpace, com.spotify.mobile.android.util.ClientEvent.SubEvent.cA);
        b.put(com.spotify.mobile.android.spotlets.share.util.AppInfoHelper.App.d.mPackageNameSpace, com.spotify.mobile.android.util.ClientEvent.SubEvent.cE);
        b.put(com.spotify.mobile.android.spotlets.share.util.AppInfoHelper.App.e.mPackageNameSpace, com.spotify.mobile.android.util.ClientEvent.SubEvent.cG);
        b.put(com.spotify.mobile.android.spotlets.share.util.AppInfoHelper.App.h.mPackageNameSpace, com.spotify.mobile.android.util.ClientEvent.SubEvent.cH);
        b.put(com.spotify.mobile.android.spotlets.share.util.AppInfoHelper.App.i.mPackageNameSpace, com.spotify.mobile.android.util.ClientEvent.SubEvent.cI);
        b.put(com.spotify.mobile.android.spotlets.share.util.AppInfoHelper.App.j.mPackageNameSpace, com.spotify.mobile.android.util.ClientEvent.SubEvent.cJ);
    }

    public final void a(com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, com.spotify.mobile.android.util.ClientEvent.SubEvent subevent, String s)
    {
        a(subview, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, subevent), s, false);
        a = true;
    }

    public final void a(com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, ClientEvent clientevent, String s, boolean flag)
    {
        if (s != null)
        {
            clientevent.a("uri", s);
        }
        Context context = c;
        if (flag)
        {
            s = ViewUri.bb;
        } else
        {
            s = ViewUri.bc;
        }
        fop.a(context, s, subview, clientevent);
    }

    public final void a(com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, String s)
    {
        a(subview, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.R), s, false);
    }

    public final void a(fhs fhs1, String s)
    {
        ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.cR);
        clientevent.a("network", fhs1.a.getNetworkType().toString());
        if (fhs1.b())
        {
            fhs1 = BooleanNode.TRUE;
        } else
        {
            fhs1 = BooleanNode.FALSE;
        }
        clientevent.a("toggle_on", fhs1);
        a(com.spotify.mobile.android.util.viewuri.ViewUri.SubView.R, clientevent, s, false);
    }

    public final void a(String s)
    {
        a(com.spotify.mobile.android.util.viewuri.ViewUri.SubView.R, com.spotify.mobile.android.util.ClientEvent.SubEvent.cx, s);
    }

    public final void a(String s, String s1, boolean flag)
    {
        com.spotify.mobile.android.util.ClientEvent.SubEvent subevent = (com.spotify.mobile.android.util.ClientEvent.SubEvent)b.get(s);
        Object obj = subevent;
        if (subevent == null)
        {
            obj = com.spotify.mobile.android.util.ClientEvent.SubEvent.cB;
        }
        obj = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, ((com.spotify.mobile.android.util.ClientEvent.SubEvent) (obj)));
        ((ClientEvent) (obj)).a("package", s);
        if (flag)
        {
            a(com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, ((ClientEvent) (obj)), s1, flag);
        } else
        {
            a(com.spotify.mobile.android.util.viewuri.ViewUri.SubView.S, ((ClientEvent) (obj)), s1, flag);
        }
        a = false;
    }

    public final void a(com.spotify.mobile.android.spotlets.share.model.Network.Type atype[], boolean flag, String s)
    {
        ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.cw);
        ArrayList arraylist = new ArrayList();
        int j = atype.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(atype[i].toString());
        }

        Collections.sort(arraylist);
        if (flag)
        {
            atype = BooleanNode.TRUE;
        } else
        {
            atype = BooleanNode.FALSE;
        }
        clientevent.a("included_text", atype);
        clientevent.a("networks", TextUtils.join(",", arraylist));
        a(com.spotify.mobile.android.util.viewuri.ViewUri.SubView.R, clientevent, s, false);
    }

    public final void b(String s)
    {
        a(com.spotify.mobile.android.util.viewuri.ViewUri.SubView.S, com.spotify.mobile.android.util.ClientEvent.SubEvent.cP, s);
    }
}
