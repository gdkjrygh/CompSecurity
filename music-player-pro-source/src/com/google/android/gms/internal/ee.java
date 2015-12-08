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
//            eh, ea, ej, ei, 
//            ek, em, gr, eb, 
//            ef

public class ee extends eo.a
    implements ServiceConnection
{

    private final Activity nB;
    private eb sF;
    private final eh sG;
    private ek sI;
    private Context sO;
    private em sP;
    private ef sQ;
    private ej sR;
    private String sS;

    public ee(Activity activity)
    {
        sS = null;
        nB = activity;
        sG = eh.j(nB.getApplicationContext());
    }

    public static void a(Context context, boolean flag, ea ea1)
    {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.purchase.InAppPurchaseActivity");
        intent.putExtra("com.google.android.gms.ads.internal.purchase.useClientJar", flag);
        ea.a(intent, ea1);
        context.startActivity(intent);
    }

    private void a(String s, boolean flag, int i, Intent intent)
    {
        if (sR != null)
        {
            sR.a(s, flag, i, intent, sQ);
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (i != 1001) goto _L2; else goto _L1
_L1:
        boolean flag = false;
        i = ei.d(intent);
        if (j != -1 || i != 0)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        if (sI.a(sS, j, intent))
        {
            flag = true;
        }
_L3:
        sP.recordPlayBillingResolution(i);
        nB.finish();
        a(sP.getProductId(), flag, j, intent);
        sS = null;
_L2:
        return;
        sG.a(sQ);
          goto _L3
        intent;
        gr.W("Fail to process purchase result.");
        nB.finish();
        sS = null;
        return;
        intent;
        sS = null;
        throw intent;
    }

    public void onCreate()
    {
        Object obj = ea.c(nB.getIntent());
        sR = ((ea) (obj)).sB;
        sI = ((ea) (obj)).md;
        sP = ((ea) (obj)).sz;
        sF = new eb(nB.getApplicationContext());
        sO = ((ea) (obj)).sA;
        if (nB.getResources().getConfiguration().orientation == 2)
        {
            nB.setRequestedOrientation(6);
        } else
        {
            nB.setRequestedOrientation(7);
        }
        obj = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        ((Intent) (obj)).setPackage("com.android.vending");
        nB.bindService(((Intent) (obj)), this, 1);
    }

    public void onDestroy()
    {
        nB.unbindService(this);
        sF.destroy();
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        sF.t(ibinder);
        sS = sI.cC();
        componentname = sF.a(nB.getPackageName(), sP.getProductId(), sS);
        ibinder = (PendingIntent)componentname.getParcelable("BUY_INTENT");
        if (ibinder == null)
        {
            try
            {
                int i = ei.b(componentname);
                sP.recordPlayBillingResolution(i);
                a(sP.getProductId(), false, i, null);
                nB.finish();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            break MISSING_BLOCK_LABEL_179;
        }
        sQ = new ef(sP.getProductId(), sS);
        sG.b(sQ);
        nB.startIntentSenderForResult(ibinder.getIntentSender(), 1001, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
        return;
        gr.d("Error when connecting in-app billing service", componentname);
        nB.finish();
        return;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        gr.U("In-app billing service disconnected.");
        sF.destroy();
    }
}
