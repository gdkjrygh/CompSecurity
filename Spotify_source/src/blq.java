// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.analytics.CampaignTrackingService;

public class blq extends BroadcastReceiver
{

    public static Object a = new Object();
    public static con b;
    private static Boolean c;

    public blq()
    {
    }

    public static boolean a(Context context)
    {
        btl.a(context);
        if (c != null)
        {
            return c.booleanValue();
        } else
        {
            boolean flag = bmz.a(context, blq, true);
            c = Boolean.valueOf(flag);
            return flag;
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        bmp bmp1;
        Intent intent1;
        boolean flag;
        bmp1 = bnf.a(context).a();
        String s = intent.getStringExtra("referrer");
        intent = intent.getAction();
        bmp1.a("CampaignTrackingReceiver received", intent);
        if (!"com.android.vending.INSTALL_REFERRER".equals(intent) || TextUtils.isEmpty(s))
        {
            bmp1.e("CampaignTrackingReceiver received unexpected intent without referrer extra");
            return;
        }
        flag = CampaignTrackingService.a(context);
        if (!flag)
        {
            bmp1.e("CampaignTrackingService not registered or disabled. Installation tracking not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        btl.a(com/google/android/gms/analytics/CampaignTrackingService);
        intent1 = new Intent(context, com/google/android/gms/analytics/CampaignTrackingService);
        intent1.putExtra("referrer", s);
        intent = ((Intent) (a));
        intent;
        JVM INSTR monitorenter ;
        context.startService(intent1);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        intent;
        JVM INSTR monitorexit ;
        return;
        context;
        intent;
        JVM INSTR monitorexit ;
        throw context;
        if (b == null)
        {
            context = new con(context, "Analytics campaign WakeLock", (byte)0);
            b = context;
            context.c();
        }
        b.a();
_L1:
        intent;
        JVM INSTR monitorexit ;
        return;
        context;
        bmp1.e("CampaignTrackingService service at risk of not starting. For more reliable installation campaign reports, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
          goto _L1
    }

}
