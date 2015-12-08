// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.spotify.mobile.android.service.SpotifyService;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import dmz;
import fop;
import fos;
import gbn;
import gbo;

public class SpotifyWidget extends AppWidgetProvider
{

    public SpotifyWidget()
    {
    }

    public static PendingIntent a(Context context, Intent intent)
    {
        Assertion.a(context);
        Assertion.a(intent);
        Intent intent1 = new Intent("com.spotify.mobile.android.ui.widget.BROKER");
        intent1.putExtra("broker.pending.intent", intent);
        return PendingIntent.getBroadcast(context, 2, intent1, 0x8000000);
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent == null) goto _L2; else goto _L1
_L1:
        Object obj;
        gbo gbo1;
        obj = intent.getAction();
        gbo1 = new gbo();
        if (!"android.appwidget.action.APPWIDGET_UPDATE".equals(obj)) goto _L4; else goto _L3
_L3:
        gbo1.a(context, intent);
_L9:
        dmz.a(fos);
        dmz.a(fop);
        if (!"com.spotify.mobile.android.ui.widget.PREVIOUS".equals(obj)) goto _L6; else goto _L5
_L5:
        fos.a(context);
_L2:
        return;
_L4:
        if ("android.appwidget.action.APPWIDGET_ENABLED".equals(obj))
        {
            gbo1.a(context);
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if ("com.spotify.mobile.android.ui.widget.PLAY".equals(obj))
        {
            fos.c(context);
            return;
        }
        if ("com.spotify.mobile.android.ui.widget.NEXT".equals(obj))
        {
            boolean flag = intent.getBooleanExtra("is_suggested_track", false);
            obj = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.ac);
            if (flag)
            {
                intent = "true";
            } else
            {
                intent = "false";
            }
            ((ClientEvent) (obj)).a("suggested_track", intent);
            fop.a(context, ViewUri.O, ((ClientEvent) (obj)));
            fos.b(context);
            return;
        }
        if (!"com.spotify.mobile.android.ui.widget.BROKER".equals(obj)) goto _L2; else goto _L7
_L7:
        if (SpotifyService.a(context))
        {
            intent = (Intent)intent.getParcelableExtra("broker.pending.intent");
            Assertion.a(intent);
            context.startActivity(intent);
            return;
        }
        context.startActivity(context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()));
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }
}
