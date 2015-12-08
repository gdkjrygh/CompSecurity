// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.CustomRenderedAd;

// Referenced classes of package com.google.android.gms.internal:
//            zzci, zzhx

public class zzch
    implements CustomRenderedAd
{

    private final zzci zzrj;

    public zzch(zzci zzci1)
    {
        zzrj = zzci1;
    }

    public String getContent()
    {
        String s;
        try
        {
            s = zzrj.getContent();
        }
        catch (RemoteException remoteexception)
        {
            zzhx.zzd("Could not delegate getContent to CustomRenderedAd", remoteexception);
            return null;
        }
        return s;
    }

    public void recordImpression()
    {
        try
        {
            zzrj.recordImpression();
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzhx.zzd("Could not delegate recordImpression to CustomRenderedAd", remoteexception);
        }
    }
}
