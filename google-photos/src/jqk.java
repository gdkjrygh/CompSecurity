// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

public class jqk extends BroadcastReceiver
{

    static Object a = new Object();
    static lpf b;
    private static Boolean c;

    public jqk()
    {
    }

    public static boolean a(Context context)
    {
        b.d(context);
        if (c != null)
        {
            return c.booleanValue();
        } else
        {
            boolean flag = jtk.a(context, jqk, true);
            c = Boolean.valueOf(flag);
            return flag;
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        jso jso1;
        Intent intent1;
        boolean flag;
        jso1 = jrk.a(context).a();
        String s = intent.getStringExtra("referrer");
        intent = intent.getAction();
        jso1.a("CampaignTrackingReceiver received", intent);
        if (!"com.android.vending.INSTALL_REFERRER".equals(intent) || TextUtils.isEmpty(s))
        {
            jso1.e("CampaignTrackingReceiver received unexpected intent without referrer extra");
            return;
        }
        flag = jql.a(context);
        if (!flag)
        {
            jso1.e("CampaignTrackingService not registered or disabled. Installation tracking not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (kbe.a)
        {
            jso1.f("Received unexpected installation campaign on package side");
            return;
        }
        b.d(jql);
        intent1 = new Intent(context, jql);
        intent1.putExtra("referrer", s);
        intent = ((Intent) (a));
        intent;
        JVM INSTR monitorenter ;
        context.startService(intent1);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_136;
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
            context = new lpf(context, 1, "Analytics campaign WakeLock");
            b = context;
            context.a(false);
        }
        b.a(1000L);
_L1:
        intent;
        JVM INSTR monitorexit ;
        return;
        context;
        jso1.e("CampaignTrackingService service at risk of not starting. For more reliable installation campaign reports, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
          goto _L1
    }

}
