// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.purchase.InAppPurchaseResult;

// Referenced classes of package com.google.android.gms.internal:
//            lr

public final class ma
    implements InAppPurchaseResult
{

    private final lr a;

    public ma(lr lr1)
    {
        a = lr1;
    }

    public final void finishPurchase()
    {
        try
        {
            a.finishPurchase();
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not forward finishPurchase to InAppPurchaseResult", remoteexception);
        }
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
            zzb.zzd("Could not forward getProductId to InAppPurchaseResult", remoteexception);
            return null;
        }
        return s;
    }

    public final Intent getPurchaseData()
    {
        Intent intent;
        try
        {
            intent = a.getPurchaseData();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not forward getPurchaseData to InAppPurchaseResult", remoteexception);
            return null;
        }
        return intent;
    }

    public final int getResultCode()
    {
        int i;
        try
        {
            i = a.getResultCode();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not forward getPurchaseData to InAppPurchaseResult", remoteexception);
            return 0;
        }
        return i;
    }

    public final boolean isVerified()
    {
        boolean flag;
        try
        {
            flag = a.isVerified();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not forward isVerified to InAppPurchaseResult", remoteexception);
            return false;
        }
        return flag;
    }
}
