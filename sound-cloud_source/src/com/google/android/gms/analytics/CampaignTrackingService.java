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
import com.google.android.gms.analytics.internal.R;
import com.google.android.gms.analytics.internal.g;
import com.google.android.gms.analytics.internal.l;
import com.google.android.gms.analytics.internal.p;
import com.google.android.gms.analytics.internal.s;
import com.google.android.gms.analytics.internal.v;
import com.google.android.gms.b.aj;
import com.google.android.gms.b.ay;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzx;

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
        zzx.zzv(context);
        if (b != null)
        {
            return b.booleanValue();
        } else
        {
            boolean flag = l.a(context, com/google/android/gms/analytics/CampaignTrackingService);
            b = Boolean.valueOf(flag);
            return flag;
        }
    }

    protected final void a(g g1, Handler handler, int i)
    {
        handler.post(new e(this, i, g1));
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        v.a(this).a().b("CampaignTrackingService is starting up");
    }

    public void onDestroy()
    {
        v.a(this).a().b("CampaignTrackingService is shutting down");
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        Object obj = CampaignTrackingReceiver.a;
        obj;
        JVM INSTR monitorenter ;
        ay ay1 = CampaignTrackingReceiver.b;
        if (ay1 == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        if (ay1.a.isHeld())
        {
            ay1.b();
        }
        obj;
        JVM INSTR monitorexit ;
_L1:
        g g1;
        v v1;
        v1 = v.a(this);
        g1 = v1.a();
        obj = null;
        Handler handler;
        Exception exception;
        if (zzd.zzacF)
        {
            g1.f("Unexpected installation campaign (package side)");
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
            if (!zzd.zzacF)
            {
                g1.e("No campaign found on com.android.vending.INSTALL_REFERRER \"referrer\" extra");
            }
            v1.b().a(new c(this, g1, ((Handler) (obj)), j));
            return 2;
        }
        break MISSING_BLOCK_LABEL_169;
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
        i = R.c();
        Object obj1 = intent;
        if (intent.length() > i)
        {
            g1.c("Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(intent.length()), Integer.valueOf(i));
            obj1 = intent.substring(0, i);
        }
        g1.a("CampaignTrackingService called. startId, campaign", Integer.valueOf(j), obj1);
        intent = v1.c();
        obj = new d(this, g1, ((Handler) (obj)), j);
        zzx.zzh(((String) (obj1)), "campaign param can't be empty");
        ((s) (intent)).i.b().a(new p(intent, ((String) (obj1)), ((Runnable) (obj))));
        return 2;
    }
}
