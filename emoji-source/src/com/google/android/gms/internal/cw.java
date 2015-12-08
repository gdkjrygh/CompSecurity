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
//            cy, cr, eu, cx, 
//            cv

public final class cw extends df.a
    implements ServiceConnection
{

    private Context mContext;
    private cr oY;
    private String pf;
    private cv pj;
    private boolean po;
    private int pp;
    private Intent pq;

    public cw(Context context, String s, boolean flag, int i, Intent intent, cv cv)
    {
        po = false;
        pf = s;
        pp = i;
        pq = intent;
        po = flag;
        mContext = context;
        pj = cv;
    }

    public void finishPurchase()
    {
        int i = cy.c(pq);
        if (pp != -1 || i != 0)
        {
            return;
        } else
        {
            oY = new cr(mContext);
            Context context = mContext;
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            Context context1 = mContext;
            context.bindService(intent, this, 1);
            return;
        }
    }

    public String getProductId()
    {
        return pf;
    }

    public Intent getPurchaseData()
    {
        return pq;
    }

    public int getResultCode()
    {
        return pp;
    }

    public boolean isVerified()
    {
        return po;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        eu.B("In-app billing service connected.");
        oY.o(ibinder);
        componentname = cy.q(cy.d(pq));
        if (componentname == null)
        {
            return;
        }
        if (oY.a(mContext.getPackageName(), componentname) == 0)
        {
            cx.k(mContext).a(pj);
        }
        mContext.unbindService(this);
        oY.destroy();
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        eu.B("In-app billing service disconnected.");
        oY.destroy();
    }
}
