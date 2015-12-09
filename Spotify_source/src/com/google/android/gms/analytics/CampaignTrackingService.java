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
import blq;
import bmp;
import bmz;
import bnc;
import bnf;
import bns;
import btl;
import con;
import cpf;

public class CampaignTrackingService extends Service
{

    private static Boolean b;
    private Handler a;

    public CampaignTrackingService()
    {
    }

    public static boolean a(Context context)
    {
        btl.a(context);
        if (b != null)
        {
            return b.booleanValue();
        } else
        {
            boolean flag = bmz.a(context, com/google/android/gms/analytics/CampaignTrackingService);
            b = Boolean.valueOf(flag);
            return flag;
        }
    }

    protected final void a(bmp bmp1, Handler handler, int i)
    {
        handler.post(new Runnable(i, bmp1) {

            private int a;
            private bmp b;
            private CampaignTrackingService c;

            public final void run()
            {
                boolean flag = c.stopSelfResult(a);
                if (flag)
                {
                    b.a("Install campaign broadcast processed", Boolean.valueOf(flag));
                }
            }

            
            {
                c = CampaignTrackingService.this;
                a = i;
                b = bmp1;
                super();
            }
        });
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        bnf.a(this).a().b("CampaignTrackingService is starting up");
    }

    public void onDestroy()
    {
        bnf.a(this).a().b("CampaignTrackingService is shutting down");
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        Object obj = blq.a;
        obj;
        JVM INSTR monitorenter ;
        Object obj2 = blq.b;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        if (((con) (obj2)).a.isHeld())
        {
            ((con) (obj2)).b();
        }
        obj;
        JVM INSTR monitorexit ;
_L2:
        bmp bmp1;
        bnf bnf1;
        bnf1 = bnf.a(this);
        bmp1 = bnf1.a();
        obj2 = intent.getStringExtra("referrer");
        obj = a;
        intent = ((Intent) (obj));
        if (obj == null)
        {
            intent = new Handler(getMainLooper());
            a = intent;
        }
        if (TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            bmp1.e("No campaign found on com.android.vending.INSTALL_REFERRER \"referrer\" extra");
            bnf1.b().a(new Runnable(bmp1, intent, j) {

                private bmp a;
                private Handler b;
                private int c;
                private CampaignTrackingService d;

                public final void run()
                {
                    d.a(a, b, c);
                }

            
            {
                d = CampaignTrackingService.this;
                a = bmp1;
                b = handler;
                c = i;
                super();
            }
            });
            return 2;
        }
        break; /* Loop/switch isn't completed */
        obj2;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw obj2;
        }
        catch (SecurityException securityexception) { }
        if (true) goto _L2; else goto _L1
_L1:
        i = bns.c();
        Object obj1 = obj2;
        if (((String) (obj2)).length() > i)
        {
            bmp1.c("Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(((String) (obj2)).length()), Integer.valueOf(i));
            obj1 = ((String) (obj2)).substring(0, i);
        }
        bmp1.a("CampaignTrackingService called. startId, campaign", Integer.valueOf(j), obj1);
        obj2 = bnf1.c();
        intent = new Runnable(bmp1, intent, j) {

            private bmp a;
            private Handler b;
            private int c;
            private CampaignTrackingService d;

            public final void run()
            {
                d.a(a, b, c);
            }

            
            {
                d = CampaignTrackingService.this;
                a = bmp1;
                b = handler;
                c = i;
                super();
            }
        };
        btl.a(((String) (obj1)), "campaign param can't be empty");
        ((bnc) (obj2)).f.b().a(new bnb._cls3(((bnb) (obj2)), ((String) (obj1)), intent));
        return 2;
    }
}
