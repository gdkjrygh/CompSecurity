// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.service;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.cleanmaster.ui.app.market.storage.MarketStorage;

// Referenced classes of package com.cleanmaster.service:
//            a

public class LocalService extends IntentService
{

    public static boolean a = true;
    public static long b = 15000L;
    public static boolean d = false;
    PackageManager c;
    int e;

    public LocalService()
    {
        super("LocalService");
        c = null;
        e = 0;
    }

    public static void a(Context context, String s)
    {
        Intent intent = new Intent();
        intent.setClass(context, com/cleanmaster/service/LocalService);
        intent.setAction("com.cleanmaster.service.ACTION_MARKET_SAVE_PENDDING_DOWNLOAD");
        intent.putExtra(":package-name", s);
        context.startService(intent);
    }

    private void a(Intent intent)
    {
        long l = intent.getLongExtra(":recent", com.cleanmaster.service.a.a(1));
        MarketStorage.a().a(l);
    }

    public void onCreate()
    {
        super.onCreate();
    }

    protected void onHandleIntent(Intent intent)
    {
        while (intent == null || !"com.cleanmaster.service.ACTION_MARKET_CLEAN_CACHE".equals(intent.getAction())) 
        {
            return;
        }
        a(intent);
    }

}
