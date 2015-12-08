// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.purchase.InAppPurchaseResult;

// Referenced classes of package com.google.android.gms.internal:
//            eq, gr

public class eu
    implements InAppPurchaseResult
{

    private final eq te;

    public eu(eq eq1)
    {
        te = eq1;
    }

    public void finishPurchase()
    {
        try
        {
            te.finishPurchase();
            return;
        }
        catch (RemoteException remoteexception)
        {
            gr.d("Could not forward finishPurchase to InAppPurchaseResult", remoteexception);
        }
    }

    public String getProductId()
    {
        String s;
        try
        {
            s = te.getProductId();
        }
        catch (RemoteException remoteexception)
        {
            gr.d("Could not forward getProductId to InAppPurchaseResult", remoteexception);
            return null;
        }
        return s;
    }

    public Intent getPurchaseData()
    {
        Intent intent;
        try
        {
            intent = te.getPurchaseData();
        }
        catch (RemoteException remoteexception)
        {
            gr.d("Could not forward getPurchaseData to InAppPurchaseResult", remoteexception);
            return null;
        }
        return intent;
    }

    public int getResultCode()
    {
        int i;
        try
        {
            i = te.getResultCode();
        }
        catch (RemoteException remoteexception)
        {
            gr.d("Could not forward getPurchaseData to InAppPurchaseResult", remoteexception);
            return 0;
        }
        return i;
    }

    public boolean isVerified()
    {
        boolean flag;
        try
        {
            flag = te.isVerified();
        }
        catch (RemoteException remoteexception)
        {
            gr.d("Could not forward isVerified to InAppPurchaseResult", remoteexception);
            return false;
        }
        return flag;
    }
}
