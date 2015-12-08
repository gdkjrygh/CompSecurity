// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            dw, do, zzfb, dl, 
//            a, eu, fj, ds, 
//            es, du, dn, dr

public final class dm extends dw
    implements ServiceConnection
{

    do a;
    private final Activity b;
    private Context c;
    private du d;
    private dl e;
    private dn f;
    private dr g;
    private ds h;
    private String i;

    public dm(Activity activity)
    {
        i = null;
        b = activity;
        a = com.google.android.gms.internal.do.a(b.getApplicationContext());
    }

    public final void a()
    {
        Object obj = zzfb.a(b.getIntent());
        g = ((zzfb) (obj)).e;
        h = ((zzfb) (obj)).b;
        d = ((zzfb) (obj)).c;
        e = new dl(b.getApplicationContext());
        c = ((zzfb) (obj)).d;
        if (b.getResources().getConfiguration().orientation == 2)
        {
            b.setRequestedOrientation(com.google.android.gms.internal.a.e().a());
        } else
        {
            b.setRequestedOrientation(com.google.android.gms.internal.a.e().b());
        }
        obj = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        ((Intent) (obj)).setPackage("com.android.vending");
        b.bindService(((Intent) (obj)), this, 1);
    }

    public final void a(int j, int k, Intent intent)
    {
        if (j != 1001) goto _L2; else goto _L1
_L1:
        Object obj;
        com.google.android.gms.internal.a.i();
        obj = intent.getExtras().get("RESPONSE_CODE");
        if (obj != null) goto _L4; else goto _L3
_L3:
        fj.e("Intent with no response code, assuming OK (known issue)");
        j = 0;
_L10:
        if (k != -1) goto _L6; else goto _L5
_L5:
        com.google.android.gms.internal.a.i();
        if (j != 0) goto _L6; else goto _L7
_L7:
        if (!h.a(i, intent));
_L8:
        b.finish();
        i = null;
_L2:
        return;
_L4:
        if (obj instanceof Integer)
        {
            j = ((Integer)obj).intValue();
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Long)
        {
            j = (int)((Long)obj).longValue();
            continue; /* Loop/switch isn't completed */
        }
        fj.e((new StringBuilder("Unexpected type for intent response code. ")).append(obj.getClass().getName()).toString());
        j = 5;
        continue; /* Loop/switch isn't completed */
_L6:
        a.a(f);
          goto _L8
        intent;
        fj.e("Fail to process purchase result.");
        b.finish();
        i = null;
        return;
        intent;
        i = null;
        throw intent;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final void b()
    {
        b.unbindService(this);
        e.a = null;
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        e.a(ibinder);
        com.google.android.gms.internal.a.c();
        i = es.a();
        componentname = e.a(b.getPackageName(), d.a(), i);
        ibinder = (PendingIntent)componentname.getParcelable("BUY_INTENT");
        if (ibinder != null)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        com.google.android.gms.internal.a.i();
        componentname = ((ComponentName) (componentname.get("RESPONSE_CODE")));
        if (componentname != null) goto _L2; else goto _L1
_L1:
        fj.e("Bundle with null response code, assuming OK (known issue)");
_L3:
        b.finish();
        return;
_L2:
        if (!(componentname instanceof Integer))
        {
            break MISSING_BLOCK_LABEL_122;
        }
        ((Integer)componentname).intValue();
          goto _L3
        try
        {
            f = new dn(d.a(), i);
            a.b(f);
            b.startIntentSenderForResult(ibinder.getIntentSender(), 1001, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname) { }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname) { }
        fj.c("Error when connecting in-app billing service", componentname);
        b.finish();
        return;
label0:
        {
            if (!(componentname instanceof Long))
            {
                break label0;
            }
            ((Long)componentname).longValue();
        }
          goto _L3
        fj.e((new StringBuilder("Unexpected type for intent response code. ")).append(componentname.getClass().getName()).toString());
          goto _L3
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        fj.c("In-app billing service disconnected.");
        e.a = null;
    }
}
