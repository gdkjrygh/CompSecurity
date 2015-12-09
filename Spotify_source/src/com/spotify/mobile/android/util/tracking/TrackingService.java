// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util.tracking;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import ctz;
import giy;
import giz;
import gja;
import gjc;
import gje;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TrackingService extends Service
{

    private List a;
    private gjc b;

    public TrackingService()
    {
        a = new LinkedList();
    }

    public static void a(Context context, String s, String s1, Bundle bundle)
    {
        Intent intent = new Intent(context, com/spotify/mobile/android/util/tracking/TrackingService);
        intent.putExtra("EXTRA_TYPE", s);
        intent.putExtra("EXTRA_EVENT", s1);
        intent.putExtra("EXTRA_ARGS", bundle);
        context.startService(intent);
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        b = new gjc(this);
        a.add(new gje(this));
        a.add(new giy(this));
        a.add(new giz());
    }

    public void onDestroy()
    {
        super.onDestroy();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gja)iterator.next()).a()) { }
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        if (intent != null)
        {
            String s = intent.getStringExtra("EXTRA_TYPE");
            String s1 = intent.getStringExtra("EXTRA_EVENT");
            intent = (Bundle)intent.getParcelableExtra("EXTRA_ARGS");
            ctz.a(s);
            for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gja)iterator.next()).a(s, s1, intent)) { }
        }
        b.removeMessages(0);
        b.sendEmptyMessageDelayed(0, 60000L);
        return 2;
    }
}
