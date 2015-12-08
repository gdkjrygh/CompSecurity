// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.bmw.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.spotify.mobile.android.service.media.MediaServiceConsumer;
import com.spotify.mobile.android.util.Assertion;
import dmz;
import dxd;
import eak;
import eaq;
import ebb;
import ekc;
import eke;
import ekl;
import ekn;

public class BmwService extends Service
{

    private MediaServiceConsumer a;
    private boolean b;

    public BmwService()
    {
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onDestroy()
    {
        b = false;
        if (a != null)
        {
            a.a();
        }
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        if (!b && intent != null && ((ekl)dmz.a(ekl)).a())
        {
            String s = intent.getStringExtra("com.bmwgroup.connected.extras.vehicle.brand");
            if (s == null)
            {
                Assertion.b("Brand cannot be null");
                return super.onStartCommand(intent, i, j);
            }
            b = true;
            dmz.a(eaq);
            intent = (eke)dmz.a(eke);
            dmz.a(dxd);
            a = eaq.a(new ekc((ekn)dmz.a(ekn), intent, new eak(), new ebb(this), s));
            a.a(this);
        }
        return 2;
    }
}
