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
import com.google.android.gms.analytics.internal.aa;
import com.google.android.gms.analytics.internal.az;
import com.google.android.gms.analytics.internal.j;
import com.google.android.gms.analytics.internal.q;
import com.google.android.gms.analytics.internal.s;
import com.google.android.gms.c.f;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.xl;

// Referenced classes of package com.google.android.gms.analytics:
//            e, CampaignTrackingReceiver, c, d

public class CampaignTrackingService extends Service
{

    private static Boolean b;
    private Handler a;

    public CampaignTrackingService()
    {
    }

    public static boolean a(Context context)
    {
        bl.a(context);
        if (b != null)
        {
            return b.booleanValue();
        } else
        {
            boolean flag = q.a(context, com/google/android/gms/analytics/CampaignTrackingService);
            b = Boolean.valueOf(flag);
            return flag;
        }
    }

    protected final void a(j j1, Handler handler, int k)
    {
        handler.post(new e(this, k, j1));
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        aa.a(this).e().b("CampaignTrackingService is starting up");
    }

    public void onDestroy()
    {
        aa.a(this).e().b("CampaignTrackingService is shutting down");
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int k, int l)
    {
        Object obj = CampaignTrackingReceiver.a;
        obj;
        JVM INSTR monitorenter ;
        xl xl1 = CampaignTrackingReceiver.b;
        if (xl1 == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        if (xl1.d())
        {
            xl1.b();
        }
        obj;
        JVM INSTR monitorexit ;
_L1:
        aa aa1;
        j j1;
        aa1 = aa.a(this);
        j1 = aa1.e();
        obj = null;
        Handler handler;
        Exception exception;
        if (i.a)
        {
            j1.f("Unexpected installation campaign (package side)");
            intent = ((Intent) (obj));
        } else
        {
            intent = intent.getStringExtra("referrer");
        }
        handler = a;
        obj = handler;
        if (handler == null)
        {
            obj = new Handler(getMainLooper());
            a = ((Handler) (obj));
        }
        if (TextUtils.isEmpty(intent))
        {
            if (!i.a)
            {
                j1.e("No campaign found on com.android.vending.INSTALL_REFERRER \"referrer\" extra");
            }
            aa1.g().a(new c(this, j1, ((Handler) (obj)), l));
            return 2;
        }
        break MISSING_BLOCK_LABEL_166;
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
          goto _L1
        k = az.c();
        Object obj1 = intent;
        if (intent.length() > k)
        {
            j1.c("Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(intent.length()), Integer.valueOf(k));
            obj1 = intent.substring(0, k);
        }
        j1.a("CampaignTrackingService called. startId, campaign", Integer.valueOf(l), obj1);
        aa1.h().a(((String) (obj1)), new d(this, j1, ((Handler) (obj)), l));
        return 2;
    }
}
