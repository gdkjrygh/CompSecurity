// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.facebook.ads.internal.adapters.o;
import com.facebook.ads.internal.adapters.p;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.facebook.ads:
//            NativeAd

class <init> extends BroadcastReceiver
{

    final NativeAd a;
    private boolean b;

    public void a()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction((new StringBuilder("com.facebook.ads.native.impression:")).append(NativeAd.e(a).o()).toString());
        intentfilter.addAction((new StringBuilder("com.facebook.ads.native.click:")).append(NativeAd.e(a).o()).toString());
        LocalBroadcastManager.getInstance(NativeAd.c(a)).registerReceiver(this, intentfilter);
        b = true;
    }

    public void b()
    {
        if (!b)
        {
            return;
        }
        try
        {
            LocalBroadcastManager.getInstance(NativeAd.c(a)).unregisterReceiver(this);
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction().split(":")[0];
        if ("com.facebook.ads.native.impression".equals(context))
        {
            NativeAd.g(a).a();
        } else
        if ("com.facebook.ads.native.click".equals(context))
        {
            context = new HashMap();
            context.put("mil", Boolean.valueOf(true));
            NativeAd.e(a).b(context);
            return;
        }
    }

    private apters.o(NativeAd nativead)
    {
        a = nativead;
        super();
    }

    eiver(NativeAd nativead, eiver eiver)
    {
        this(nativead);
    }
}
