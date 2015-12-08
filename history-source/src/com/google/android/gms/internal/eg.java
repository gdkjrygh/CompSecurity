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
//            ei, eb, gr, eh, 
//            ef

public final class eg extends eq.a
    implements ServiceConnection
{

    private Context mContext;
    private eb sF;
    private String sM;
    private ef sQ;
    private boolean sW;
    private int sX;
    private Intent sY;

    public eg(Context context, String s, boolean flag, int i, Intent intent, ef ef)
    {
        sW = false;
        sM = s;
        sX = i;
        sY = intent;
        sW = flag;
        mContext = context;
        sQ = ef;
    }

    public void finishPurchase()
    {
        int i = ei.d(sY);
        if (sX != -1 || i != 0)
        {
            return;
        } else
        {
            sF = new eb(mContext);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            mContext.bindService(intent, this, 1);
            return;
        }
    }

    public String getProductId()
    {
        return sM;
    }

    public Intent getPurchaseData()
    {
        return sY;
    }

    public int getResultCode()
    {
        return sX;
    }

    public boolean isVerified()
    {
        return sW;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        gr.U("In-app billing service connected.");
        sF.t(ibinder);
        componentname = ei.E(ei.e(sY));
        if (componentname == null)
        {
            return;
        }
        if (sF.c(mContext.getPackageName(), componentname) == 0)
        {
            eh.j(mContext).a(sQ);
        }
        mContext.unbindService(this);
        sF.destroy();
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        gr.U("In-app billing service disconnected.");
        sF.destroy();
    }
}
