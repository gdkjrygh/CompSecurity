// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.purchase.InAppPurchase;

// Referenced classes of package com.google.android.gms.internal:
//            em, gr

public class ev
    implements InAppPurchase
{

    private final em sP;

    public ev(em em1)
    {
        sP = em1;
    }

    public String getProductId()
    {
        String s;
        try
        {
            s = sP.getProductId();
        }
        catch (RemoteException remoteexception)
        {
            gr.d("Could not forward getProductId to InAppPurchase", remoteexception);
            return null;
        }
        return s;
    }

    public void recordPlayBillingResolution(int i)
    {
        try
        {
            sP.recordPlayBillingResolution(i);
            return;
        }
        catch (RemoteException remoteexception)
        {
            gr.d("Could not forward recordPlayBillingResolution to InAppPurchase", remoteexception);
        }
    }

    public void recordResolution(int i)
    {
        try
        {
            sP.recordResolution(i);
            return;
        }
        catch (RemoteException remoteexception)
        {
            gr.d("Could not forward recordResolution to InAppPurchase", remoteexception);
        }
    }
}
