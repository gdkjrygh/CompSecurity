// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.purchase.InAppPurchaseResult;

// Referenced classes of package com.google.android.gms.internal:
//            df, eu

public class dj
    implements InAppPurchaseResult
{

    private final df pw;

    public dj(df df1)
    {
        pw = df1;
    }

    public void finishPurchase()
    {
        try
        {
            pw.finishPurchase();
            return;
        }
        catch (RemoteException remoteexception)
        {
            eu.c("Could not forward finishPurchase to InAppPurchaseResult", remoteexception);
        }
    }

    public String getProductId()
    {
        String s;
        try
        {
            s = pw.getProductId();
        }
        catch (RemoteException remoteexception)
        {
            eu.c("Could not forward getProductId to InAppPurchaseResult", remoteexception);
            return null;
        }
        return s;
    }

    public Intent getPurchaseData()
    {
        Intent intent;
        try
        {
            intent = pw.getPurchaseData();
        }
        catch (RemoteException remoteexception)
        {
            eu.c("Could not forward getPurchaseData to InAppPurchaseResult", remoteexception);
            return null;
        }
        return intent;
    }

    public int getResultCode()
    {
        int i;
        try
        {
            i = pw.getResultCode();
        }
        catch (RemoteException remoteexception)
        {
            eu.c("Could not forward getPurchaseData to InAppPurchaseResult", remoteexception);
            return 0;
        }
        return i;
    }

    public boolean isVerified()
    {
        boolean flag;
        try
        {
            flag = pw.isVerified();
        }
        catch (RemoteException remoteexception)
        {
            eu.c("Could not forward isVerified to InAppPurchaseResult", remoteexception);
            return false;
        }
        return flag;
    }
}
