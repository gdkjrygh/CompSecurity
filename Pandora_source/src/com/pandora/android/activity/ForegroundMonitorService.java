// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import p.bz.d;

public class ForegroundMonitorService extends Service
{

    static boolean a;
    private String b;

    public ForegroundMonitorService()
    {
    }

    public static boolean a()
    {
        return a;
    }

    public IBinder onBind(Intent intent)
    {
        a = true;
        b = intent.getStringExtra("intent_activity_name");
        if (s.a(b))
        {
            b = "";
        }
        b.a.e().a(new d(p.bz.d.a.a, b));
        return null;
    }

    public void onRebind(Intent intent)
    {
        super.onRebind(intent);
        a = true;
    }

    public boolean onUnbind(Intent intent)
    {
        a = false;
        b.a.e().a(new d(p.bz.d.a.b, b));
        return super.onUnbind(intent);
    }
}
