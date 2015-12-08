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
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            ec, dv, eb, el, 
//            gs, ed, ee, eg, 
//            dw, ea

public class dz extends ei.a
    implements ServiceConnection
{

    private final Activity nr;
    private el sm;
    private dw sn;
    private final ec so;
    private ee sq;
    private Context sw;
    private eg sx;
    private ea sy;
    private String sz;

    public dz(Activity activity)
    {
        sz = null;
        nr = activity;
        so = ec.j(nr.getApplicationContext());
    }

    public static void a(Context context, boolean flag, dv dv1)
    {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.purchase.InAppPurchaseActivity");
        intent.putExtra("com.google.android.gms.ads.internal.purchase.useClientJar", flag);
        dv.a(intent, dv1);
        context.startActivity(intent);
    }

    private void a(String s, boolean flag, int i, Intent intent)
    {
        try
        {
            sm.a(new eb(sw, s, flag, i, intent, sy));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            gs.W("Fail to invoke PlayStorePurchaseListener.");
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (i != 1001) goto _L2; else goto _L1
_L1:
        i = ed.d(intent);
        if (j != -1 || i != 0)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        if (!sq.a(sz, j, intent)) goto _L4; else goto _L3
_L3:
        a(sx.getProductId(), true, j, intent);
_L5:
        sx.recordPlayBillingResolution(i);
        sz = null;
        nr.finish();
_L2:
        return;
_L4:
        a(sx.getProductId(), false, j, intent);
          goto _L5
        intent;
        gs.W("Fail to process purchase result.");
        sz = null;
        nr.finish();
        return;
        so.a(sy);
        a(sx.getProductId(), false, j, intent);
          goto _L5
        intent;
        sz = null;
        nr.finish();
        throw intent;
    }

    public void onCreate()
    {
        Object obj = dv.c(nr.getIntent());
        sm = ((dv) (obj)).lM;
        sq = ((dv) (obj)).lT;
        sx = ((dv) (obj)).si;
        sn = new dw(nr.getApplicationContext());
        sw = ((dv) (obj)).sj;
        obj = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        ((Intent) (obj)).setPackage("com.android.vending");
        nr.bindService(((Intent) (obj)), this, 1);
    }

    public void onDestroy()
    {
        nr.unbindService(this);
        sn.destroy();
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        sn.r(ibinder);
        sz = sq.ct();
        componentname = sn.a(nr.getPackageName(), sx.getProductId(), sz);
        ibinder = (PendingIntent)componentname.getParcelable("BUY_INTENT");
        if (ibinder == null)
        {
            try
            {
                int i = ed.b(componentname);
                sx.recordPlayBillingResolution(i);
                a(sx.getProductId(), false, i, null);
                nr.finish();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            break MISSING_BLOCK_LABEL_179;
        }
        sy = new ea(sx.getProductId(), sz);
        so.b(sy);
        nr.startIntentSenderForResult(ibinder.getIntentSender(), 1001, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
        return;
        gs.d("Error when connecting in-app billing service", componentname);
        nr.finish();
        return;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        gs.U("In-app billing service disconnected.");
        sn.destroy();
    }
}
