// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

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
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.em;
import com.google.android.gms.internal.gm;
import com.google.android.gms.internal.gn;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            h, j, GInAppPurchaseManagerInfoParcel, b, 
//            i, k, f

public final class e extends com.google.android.gms.internal.eo.a
    implements ServiceConnection
{

    h a;
    private final Activity b;
    private Context c;
    private em d;
    private com.google.android.gms.ads.internal.purchase.b e;
    private f f;
    private j g;
    private k h;
    private String i;

    public e(Activity activity)
    {
        i = null;
        b = activity;
        a = com.google.android.gms.ads.internal.purchase.h.a(b.getApplicationContext());
    }

    private void a(String s, boolean flag, int l, Intent intent)
    {
        if (g != null)
        {
            g.a(s, flag, l, intent, f);
        }
    }

    public final void a()
    {
        Object obj = GInAppPurchaseManagerInfoParcel.a(b.getIntent());
        g = ((GInAppPurchaseManagerInfoParcel) (obj)).e;
        h = ((GInAppPurchaseManagerInfoParcel) (obj)).b;
        d = ((GInAppPurchaseManagerInfoParcel) (obj)).c;
        e = new com.google.android.gms.ads.internal.purchase.b(b.getApplicationContext());
        c = ((GInAppPurchaseManagerInfoParcel) (obj)).d;
        if (b.getResources().getConfiguration().orientation == 2)
        {
            b.setRequestedOrientation(p.g().a());
        } else
        {
            b.setRequestedOrientation(p.g().b());
        }
        obj = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        ((Intent) (obj)).setPackage("com.android.vending");
        b.bindService(((Intent) (obj)), this, 1);
    }

    public final void a(int l, int i1, Intent intent)
    {
        if (l != 1001) goto _L2; else goto _L1
_L1:
        boolean flag = false;
        p.o();
        l = com.google.android.gms.ads.internal.purchase.i.a(intent);
        if (i1 != -1)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        p.o();
        if (l != 0)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        if (h.a(i, intent))
        {
            flag = true;
        }
_L3:
        d.b(l);
        b.finish();
        a(d.a(), flag, i1, intent);
        i = null;
_L2:
        return;
        a.a(f);
          goto _L3
        intent;
        com.google.android.gms.ads.internal.util.client.b.c("Fail to process purchase result.");
        b.finish();
        i = null;
        return;
        intent;
        i = null;
        throw intent;
    }

    public final void b()
    {
        b.unbindService(this);
        e.a = null;
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        e.a(ibinder);
        p.e();
        i = gm.b();
        componentname = e.a(b.getPackageName(), d.a(), i);
        ibinder = (PendingIntent)componentname.getParcelable("BUY_INTENT");
        if (ibinder == null)
        {
            try
            {
                p.o();
                int l = com.google.android.gms.ads.internal.purchase.i.a(componentname);
                d.b(l);
                a(d.a(), false, l, null);
                b.finish();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            break MISSING_BLOCK_LABEL_183;
        }
        f = new f(d.a(), i);
        a.b(f);
        b.startIntentSenderForResult(ibinder.getIntentSender(), 1001, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
        return;
        com.google.android.gms.ads.internal.util.client.b.b("Error when connecting in-app billing service", componentname);
        b.finish();
        return;
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        com.google.android.gms.ads.internal.util.client.b.b("In-app billing service disconnected.");
        e.a = null;
    }
}
