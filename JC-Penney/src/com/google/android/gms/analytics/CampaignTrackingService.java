// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.ab;
import com.google.android.gms.analytics.internal.bb;
import com.google.android.gms.analytics.internal.j;
import com.google.android.gms.analytics.internal.r;
import com.google.android.gms.analytics.internal.t;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.d.ad;
import com.google.android.gms.d.au;

// Referenced classes of package com.google.android.gms.analytics:
//            CampaignTrackingReceiver, e, c, d

public class CampaignTrackingService extends Service
{

    private static Boolean b;
    private Handler a;

    public CampaignTrackingService()
    {
    }

    private void a()
    {
        Object obj = CampaignTrackingReceiver.a;
        obj;
        JVM INSTR monitorenter ;
        au au1 = CampaignTrackingReceiver.b;
        if (au1 == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        if (au1.b())
        {
            au1.a();
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (SecurityException securityexception)
        {
            return;
        }
    }

    public static boolean a(Context context)
    {
        u.a(context);
        if (b != null)
        {
            return b.booleanValue();
        } else
        {
            boolean flag = r.a(context, com/google/android/gms/analytics/CampaignTrackingService);
            b = Boolean.valueOf(flag);
            return flag;
        }
    }

    private Handler b()
    {
        Handler handler1 = a;
        Handler handler = handler1;
        if (handler1 == null)
        {
            handler = new Handler(getMainLooper());
            a = handler;
        }
        return handler;
    }

    protected void a(j j1, Handler handler, int i)
    {
        handler.post(new e(this, i, j1));
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        ab.a(this).f().b("CampaignTrackingService is starting up");
    }

    public void onDestroy()
    {
        ab.a(this).f().b("CampaignTrackingService is shutting down");
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int k)
    {
        a();
        ab ab1 = ab.a(this);
        j j1 = ab1.f();
        Handler handler = null;
        if (ab1.e().a())
        {
            j1.f("Unexpected installation campaign (package side)");
            intent = handler;
        } else
        {
            intent = intent.getStringExtra("referrer");
        }
        handler = b();
        if (TextUtils.isEmpty(intent))
        {
            if (!ab1.e().a())
            {
                j1.e("No campaign found on com.android.vending.INSTALL_REFERRER \"referrer\" extra");
            }
            ab1.h().a(new c(this, j1, handler, k));
            return 2;
        }
        i = ab1.e().e();
        if (intent.length() > i)
        {
            j1.c("Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(intent.length()), Integer.valueOf(i));
            intent = intent.substring(0, i);
        }
        j1.a("CampaignTrackingService called. startId, campaign", Integer.valueOf(k), intent);
        ab1.i().a(intent, new d(this, j1, handler, k));
        return 2;
    }
}
