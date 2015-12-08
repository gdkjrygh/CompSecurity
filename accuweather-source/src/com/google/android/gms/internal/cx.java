// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.internal:
//            cz, cs, ev, cy, 
//            cw

public final class cx extends dg.a
    implements ServiceConnection
{

    private Context mContext;
    private cs oW;
    private String pd;
    private cw ph;
    private boolean pm;
    private int pn;
    private Intent po;

    public cx(Context context, String s, boolean flag, int i, Intent intent, cw cw)
    {
        pm = false;
        pd = s;
        pn = i;
        po = intent;
        pm = flag;
        mContext = context;
        ph = cw;
    }

    public void finishPurchase()
    {
        int i = cz.c(po);
        if (pn != -1 || i != 0)
        {
            return;
        } else
        {
            oW = new cs(mContext);
            Context context = mContext;
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            Context context1 = mContext;
            context.bindService(intent, this, 1);
            return;
        }
    }

    public String getProductId()
    {
        return pd;
    }

    public Intent getPurchaseData()
    {
        return po;
    }

    public int getResultCode()
    {
        return pn;
    }

    public boolean isVerified()
    {
        return pm;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        ev.B("In-app billing service connected.");
        oW.o(ibinder);
        componentname = cz.q(cz.d(po));
        if (componentname == null)
        {
            return;
        }
        if (oW.a(mContext.getPackageName(), componentname) == 0)
        {
            cy.h(mContext).a(ph);
        }
        mContext.unbindService(this);
        oW.destroy();
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        ev.B("In-app billing service disconnected.");
        oW.destroy();
    }
}
