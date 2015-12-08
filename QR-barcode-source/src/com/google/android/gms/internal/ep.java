// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.purchase.InAppPurchase;

// Referenced classes of package com.google.android.gms.internal:
//            eg, gs

public class ep
    implements InAppPurchase
{

    private final eg sx;

    public ep(eg eg1)
    {
        sx = eg1;
    }

    public String getProductId()
    {
        String s;
        try
        {
            s = sx.getProductId();
        }
        catch (RemoteException remoteexception)
        {
            gs.d("Could not forward getProductId to InAppPurchase", remoteexception);
            return null;
        }
        return s;
    }

    public void recordPlayBillingResolution(int i)
    {
        try
        {
            sx.recordPlayBillingResolution(i);
            return;
        }
        catch (RemoteException remoteexception)
        {
            gs.d("Could not forward recordPlayBillingResolution to InAppPurchase", remoteexception);
        }
    }

    public void recordResolution(int i)
    {
        try
        {
            sx.recordResolution(i);
            return;
        }
        catch (RemoteException remoteexception)
        {
            gs.d("Could not forward recordResolution to InAppPurchase", remoteexception);
        }
    }
}
