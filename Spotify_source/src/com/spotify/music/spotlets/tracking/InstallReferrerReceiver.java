// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.tracking;

import acn;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import blq;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import dmz;
import fop;
import gin;
import gio;
import gip;
import giq;
import gms;

public class InstallReferrerReceiver extends BroadcastReceiver
{

    private static final gip a = gip.a("install_referrer");

    public InstallReferrerReceiver()
    {
    }

    public static void a(Context context)
    {
        String s = ((giq)dmz.a(giq)).a(context).a(a, "");
        if (!TextUtils.isEmpty(s))
        {
            ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.aq);
            clientevent.a("referrer", s);
            dmz.a(fop);
            fop.a(context, ViewUri.a, clientevent);
            a(context, null);
        }
    }

    private static void a(Context context, String s)
    {
        ((giq)dmz.a(giq)).a(context).b().a(a, s).a();
    }

    public void onReceive(Context context, Intent intent)
    {
        boolean flag = false;
        Object obj = intent.getExtras();
        if (obj == null)
        {
            Assertion.b("Intent's extras is null");
        } else
        {
            if (!((Bundle) (obj)).containsKey("referrer"))
            {
                Assertion.b("Intent has no referrer extra");
                return;
            }
            obj = ((Bundle) (obj)).getString("referrer");
            Object obj1 = (new StringBuilder("https://r.spotify.com/")).append(Uri.decode(((String) (obj)))).toString();
            if ((new SpotifyLink(((String) (obj1)))).f())
            {
                obj1 = gms.a(context, ((String) (obj1))).a;
                ((Intent) (obj1)).setFlags(0x10000000);
                context.startActivity(((Intent) (obj1)));
                flag = true;
            }
            if (!flag)
            {
                a(context, ((String) (obj)));
                (new blq()).onReceive(context, intent);
                (new acn()).onReceive(context, intent);
                return;
            }
        }
    }

}
