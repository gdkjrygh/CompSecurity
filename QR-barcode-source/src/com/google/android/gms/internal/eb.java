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
//            ed, dw, gs, ec, 
//            ea

public final class eb extends ek.a
    implements ServiceConnection
{

    private Context mContext;
    private boolean sD;
    private int sE;
    private Intent sF;
    private dw sn;
    private String su;
    private ea sy;

    public eb(Context context, String s, boolean flag, int i, Intent intent, ea ea)
    {
        sD = false;
        su = s;
        sE = i;
        sF = intent;
        sD = flag;
        mContext = context;
        sy = ea;
    }

    public void finishPurchase()
    {
        int i = ed.d(sF);
        if (sE != -1 || i != 0)
        {
            return;
        } else
        {
            sn = new dw(mContext);
            Context context = mContext;
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            Context context1 = mContext;
            context.bindService(intent, this, 1);
            return;
        }
    }

    public String getProductId()
    {
        return su;
    }

    public Intent getPurchaseData()
    {
        return sF;
    }

    public int getResultCode()
    {
        return sE;
    }

    public boolean isVerified()
    {
        return sD;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        gs.U("In-app billing service connected.");
        sn.r(ibinder);
        componentname = ed.E(ed.e(sF));
        if (componentname == null)
        {
            return;
        }
        if (sn.c(mContext.getPackageName(), componentname) == 0)
        {
            ec.j(mContext).a(sy);
        }
        mContext.unbindService(this);
        sn.destroy();
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        gs.U("In-app billing service disconnected.");
        sn.destroy();
    }
}
