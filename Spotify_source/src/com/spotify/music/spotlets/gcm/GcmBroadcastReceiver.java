// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.gcm;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import ba;
import bb;
import byg;
import com.spotify.mobile.android.service.SpotifyService;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.internal.receiver.LoggerReceiver;
import dmz;
import fop;

public class GcmBroadcastReceiver extends BroadcastReceiver
{

    public GcmBroadcastReceiver()
    {
    }

    private static int a(String s)
    {
        int i;
        try
        {
            i = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return -1;
        }
        return i;
    }

    private static ClientEvent a(com.spotify.mobile.android.util.ClientEvent.Event event, String s)
    {
        event = new ClientEvent(event);
        event.a("tag", s);
        return event;
    }

    private static fop a()
    {
        return (fop)dmz.a(fop);
    }

    public void onReceive(Context context, Intent intent)
    {
        Object obj;
        Object obj1;
        String s;
        Object obj2;
        int i;
        byg.a(context);
        obj1 = byg.a(intent);
        intent = intent.getExtras();
        obj = new Bundle();
        boolean flag;
        if (intent == null)
        {
            intent = ((Intent) (obj));
        }
        obj = (Bundle)intent;
        if (!"gcm".equals(obj1)) goto _L2; else goto _L1
_L1:
        if (!"notification".equals(((Bundle) (obj)).getString("type"))) goto _L4; else goto _L3
_L3:
        intent = ((Bundle) (obj)).getString("title", "");
        obj2 = ((Bundle) (obj)).getString("message", "");
        s = ((Bundle) (obj)).getString("uri", "");
        i = a(((Bundle) (obj)).getString("prio", "-1"));
        flag = "true".equals(((Bundle) (obj)).getString("sales"));
        obj = ((Bundle) (obj)).getString("tag", "");
        if (i >= 100) goto _L6; else goto _L5
_L5:
        if (!flag || ((ClientInfo)dmz.a(com/spotify/mobile/android/util/ClientInfo)).a()) goto _L8; else goto _L7
_L7:
        a();
        fop.b(context, ViewUri.bC, a(com.spotify.mobile.android.util.ClientEvent.Event.m, ((String) (obj))));
        Logger.b("Don't show notification since it's marked as sales and we're not allowed to show those on this device.", new Object[0]);
_L6:
        setResultCode(-1);
        return;
_L8:
        obj1 = new bb(context);
        ((bb) (obj1)).a(intent).b(((CharSequence) (obj2))).a((new ba()).a(((CharSequence) (obj2)))).a(0x7f020203).a(System.currentTimeMillis()).d();
        a();
        obj2 = new Intent(context, com/spotify/mobile/android/service/SpotifyService);
        ((Intent) (obj2)).setAction("com.spotify.mobile.android.service.action.URL_OPEN");
        intent = null;
        if (s.length() > 0)
        {
            intent = Uri.parse(s);
        }
        ((Intent) (obj2)).setData(intent);
        intent = a(com.spotify.mobile.android.util.ClientEvent.Event.N, ((String) (obj)));
        ((Intent) (obj2)).putExtra("log_intent", fop.b(context, ViewUri.bC, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, intent));
        ((bb) (obj1)).a(PendingIntent.getService(context, 0, ((Intent) (obj2)), 0));
        intent = a(com.spotify.mobile.android.util.ClientEvent.Event.g, ((String) (obj)));
        ((bb) (obj1)).b(PendingIntent.getBroadcast(context, 0, LoggerReceiver.a(context, ViewUri.bC, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, intent), 0));
        intent = (NotificationManager)context.getSystemService("notification");
        i;
        JVM INSTR tableswitch 1 4: default 396
    //                   1 432
    //                   2 439
    //                   3 446
    //                   4 453;
           goto _L9 _L10 _L11 _L12 _L13
_L9:
        i = 11;
_L14:
        intent.notify(i, ((bb) (obj1)).g());
        a();
        fop.b(context, ViewUri.bC, a(com.spotify.mobile.android.util.ClientEvent.Event.f, ((String) (obj))));
        continue; /* Loop/switch isn't completed */
_L10:
        i = 7;
        continue; /* Loop/switch isn't completed */
_L11:
        i = 8;
        continue; /* Loop/switch isn't completed */
_L12:
        i = 9;
        continue; /* Loop/switch isn't completed */
_L13:
        i = 10;
        if (true) goto _L14; else goto _L4
_L4:
        Logger.b("Received message with unknown type: %s", new Object[] {
            obj
        });
        continue; /* Loop/switch isn't completed */
_L2:
        if ("send_error".equals(obj1))
        {
            Logger.b("Send error: %s", new Object[] {
                obj
            });
        } else
        if ("deleted_messages".equals(obj1))
        {
            Logger.b("Deleted on server: %s", new Object[] {
                obj
            });
        }
        if (true) goto _L6; else goto _L15
_L15:
    }
}
