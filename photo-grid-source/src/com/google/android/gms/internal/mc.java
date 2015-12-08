// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.purchase.InAppPurchase;

// Referenced classes of package com.google.android.gms.internal:
//            lf

public final class mc
    implements InAppPurchase
{

    private final lf a;

    public mc(lf lf1)
    {
        a = lf1;
    }

    public final String getProductId()
    {
        String s;
        try
        {
            s = a.getProductId();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not forward getProductId to InAppPurchase", remoteexception);
            return null;
        }
        return s;
    }

    public final void recordPlayBillingResolution(int i)
    {
        try
        {
            a.recordPlayBillingResolution(i);
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not forward recordPlayBillingResolution to InAppPurchase", remoteexception);
        }
    }

    public final void recordResolution(int i)
    {
        try
        {
            a.recordResolution(i);
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not forward recordResolution to InAppPurchase", remoteexception);
        }
    }
}
