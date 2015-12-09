// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

final class afc
{

    private final Intent a;
    private final Handler b;
    private Boolean c;
    private final BroadcastReceiver d;
    private afb e;

    public afc(afb afb1)
    {
        e = afb1;
        super();
        c = Boolean.valueOf(false);
        d = new BroadcastReceiver() {

            private afc a;

            public final void onReceive(Context context, Intent intent)
            {
                a.a();
                afc.a(a);
            }

            
            {
                a = afc.this;
                super();
            }
        };
        b = new Handler();
        synchronized (c)
        {
            afb.b().b("register mSyncReceiver", new Object[0]);
            a = new Intent((new StringBuilder("ACTION_SYNC_BROADCASTER_RESPONSE")).append(afb.a(afb1)).toString());
            c = Boolean.valueOf(true);
            afb.b(afb1).registerReceiver(d, new IntentFilter("ACTION_SYNC_BROADCASTER_REQUEST"));
        }
        b.postDelayed(new Runnable() {

            private afc a;

            public final void run()
            {
                afc.a(a);
            }

            
            {
                a = afc.this;
                super();
            }
        }, 1000L);
        return;
        afb1;
        boolean1;
        JVM INSTR monitorexit ;
        throw afb1;
    }

    static void a(afc afc1)
    {
        Boolean boolean1 = afc1.c;
        boolean1;
        JVM INSTR monitorenter ;
        if (!afc1.c.booleanValue())
        {
            break MISSING_BLOCK_LABEL_51;
        }
        afb.b().b("unregister mSyncReceiver", new Object[0]);
        afb.b(afc1.e).unregisterReceiver(afc1.d);
        afc1.c = Boolean.valueOf(false);
_L1:
        boolean1;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        afb.b().b("Error unregistering mSyncReceiver %s", new Object[] {
            ((IllegalArgumentException) (obj)).getMessage()
        });
        afc1.c = Boolean.valueOf(false);
          goto _L1
        afc1;
        boolean1;
        JVM INSTR monitorexit ;
        throw afc1;
        obj;
        afc1.c = Boolean.valueOf(false);
        throw obj;
    }

    public final void a()
    {
        afb.b().b("sendNotification(%s, %s)", new Object[] {
            "ACTION_SYNC_BROADCASTER_REQUEST", "init"
        });
        a.putExtra("EXTRA_SYNC_BROADCASTER_RESPONSE_STRING", "success");
        a.putExtra("EXTRA_SYNC_BROADCASTER_IDENT", "init");
        afb.b(e).sendBroadcast(a);
    }
}
