// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.transaction;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android_src.mms.g.j;
import com.facebook.debug.log.b;

// Referenced classes of package android_src.mms.transaction:
//            TransactionService, d

public class i extends BroadcastReceiver
{

    private static i a;

    public i()
    {
    }

    public static void a(Context context)
    {
        b(context);
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.ANY_DATA_STATE");
        if (com.facebook.debug.log.b.b(2))
        {
            com.facebook.debug.log.b.a("fb-mms:MmsSystemEventReceiver", "registerForConnectionStateChanges");
        }
        if (a == null)
        {
            a = new i();
        }
        context.registerReceiver(a, intentfilter);
    }

    public static void b(Context context)
    {
        if (com.facebook.debug.log.b.b(2))
        {
            com.facebook.debug.log.b.a("fb-mms:MmsSystemEventReceiver", "unRegisterForConnectionStateChanges");
        }
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        context.unregisterReceiver(a);
        return;
        context;
    }

    private static void c(Context context)
    {
        if (com.facebook.debug.log.b.b(2))
        {
            com.facebook.debug.log.b.a("fb-mms:MmsSystemEventReceiver", "wakeUpService: start transaction service ...");
        }
        context.startService(new Intent(context, android_src/mms/transaction/TransactionService));
    }

    public void onReceive(Context context, Intent intent)
    {
        String s;
        if (com.facebook.debug.log.b.b(2))
        {
            com.facebook.debug.log.b.a("fb-mms:MmsSystemEventReceiver", (new StringBuilder()).append("Intent received: ").append(intent).toString());
        }
        s = intent.getAction();
        if (!s.equals("android.intent.action.CONTENT_CHANGED")) goto _L2; else goto _L1
_L1:
        context = (Uri)intent.getParcelableExtra("deleted_contents");
        j.b().a(context);
_L4:
        return;
_L2:
        if (!s.equals("android.intent.action.ANY_DATA_STATE"))
        {
            continue; /* Loop/switch isn't completed */
        }
        intent = intent.getStringExtra("state");
        if (com.facebook.debug.log.b.b(2))
        {
            com.facebook.debug.log.b.a("fb-mms:MmsSystemEventReceiver", (new StringBuilder()).append("ANY_DATA_STATE event received: ").append(intent).toString());
        }
        if (!intent.equals("CONNECTED")) goto _L4; else goto _L3
_L3:
        c(context);
        return;
        if (!s.equals("android.intent.action.BOOT_COMPLETED")) goto _L4; else goto _L5
_L5:
        d.a(context, false, false);
        return;
    }
}
