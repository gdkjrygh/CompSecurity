// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.purchase.InAppPurchase;

// Referenced classes of package com.google.android.gms.internal:
//            db, eu

public class dk
    implements InAppPurchase
{

    private final db pi;

    public dk(db db1)
    {
        pi = db1;
    }

    public String getProductId()
    {
        String s;
        try
        {
            s = pi.getProductId();
        }
        catch (RemoteException remoteexception)
        {
            eu.c("Could not forward getProductId to InAppPurchase", remoteexception);
            return null;
        }
        return s;
    }

    public void recordPlayBillingResolution(int i)
    {
        try
        {
            pi.recordPlayBillingResolution(i);
            return;
        }
        catch (RemoteException remoteexception)
        {
            eu.c("Could not forward recordPlayBillingResolution to InAppPurchase", remoteexception);
        }
    }

    public void recordResolution(int i)
    {
        try
        {
            pi.recordResolution(i);
            return;
        }
        catch (RemoteException remoteexception)
        {
            eu.c("Could not forward recordResolution to InAppPurchase", remoteexception);
        }
    }
}
