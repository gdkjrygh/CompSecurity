// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.purchase.InAppPurchaseResult;

// Referenced classes of package com.google.android.gms.internal:
//            dg, ev

public class dk
    implements InAppPurchaseResult
{

    private final dg pu;

    public dk(dg dg1)
    {
        pu = dg1;
    }

    public void finishPurchase()
    {
        try
        {
            pu.finishPurchase();
            return;
        }
        catch (RemoteException remoteexception)
        {
            ev.c("Could not forward finishPurchase to InAppPurchaseResult", remoteexception);
        }
    }

    public String getProductId()
    {
        String s;
        try
        {
            s = pu.getProductId();
        }
        catch (RemoteException remoteexception)
        {
            ev.c("Could not forward getProductId to InAppPurchaseResult", remoteexception);
            return null;
        }
        return s;
    }

    public Intent getPurchaseData()
    {
        Intent intent;
        try
        {
            intent = pu.getPurchaseData();
        }
        catch (RemoteException remoteexception)
        {
            ev.c("Could not forward getPurchaseData to InAppPurchaseResult", remoteexception);
            return null;
        }
        return intent;
    }

    public int getResultCode()
    {
        int i;
        try
        {
            i = pu.getResultCode();
        }
        catch (RemoteException remoteexception)
        {
            ev.c("Could not forward getPurchaseData to InAppPurchaseResult", remoteexception);
            return 0;
        }
        return i;
    }

    public boolean isVerified()
    {
        boolean flag;
        try
        {
            flag = pu.isVerified();
        }
        catch (RemoteException remoteexception)
        {
            ev.c("Could not forward isVerified to InAppPurchaseResult", remoteexception);
            return false;
        }
        return flag;
    }
}
