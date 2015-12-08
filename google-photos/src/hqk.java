// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public final class hqk extends BroadcastReceiver
{

    private boolean a;

    public hqk()
    {
    }

    public final void a(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a = true;
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.SCREEN_ON");
        intentfilter.addAction("android.intent.action.SCREEN_OFF");
        context.registerReceiver(this, intentfilter);
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    public final void b(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a = false;
        context.unregisterReceiver(this);
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    public final void onReceive(Context context, Intent intent)
    {
        ((hqj)olm.a(context, hqj)).a(intent);
    }
}
