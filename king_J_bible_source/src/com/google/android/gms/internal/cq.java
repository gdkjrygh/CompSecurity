// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.purchase.InAppPurchase;

// Referenced classes of package com.google.android.gms.internal:
//            cn, dw

public class cq
    implements InAppPurchase
{

    private final cn oF;

    public cq(cn cn1)
    {
        oF = cn1;
    }

    public String getProductId()
    {
        String s;
        try
        {
            s = oF.getProductId();
        }
        catch (RemoteException remoteexception)
        {
            dw.c("Could not forward getProductId to InAppPurchase", remoteexception);
            return null;
        }
        return s;
    }

    public void recordPlayBillingResolution(int i)
    {
        try
        {
            oF.recordPlayBillingResolution(i);
            return;
        }
        catch (RemoteException remoteexception)
        {
            dw.c("Could not forward recordPlayBillingResolution to InAppPurchase", remoteexception);
        }
    }

    public void recordResolution(int i)
    {
        try
        {
            oF.recordResolution(i);
            return;
        }
        catch (RemoteException remoteexception)
        {
            dw.c("Could not forward recordResolution to InAppPurchase", remoteexception);
        }
    }
}
