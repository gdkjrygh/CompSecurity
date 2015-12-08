// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.internal.client.zzh;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest

public class AdLoader
{

    private final zzh a;
    private final Context b;
    private final zzp c;

    AdLoader(Context context, zzp zzp1)
    {
        this(context, zzp1, zzh.zzcB());
    }

    private AdLoader(Context context, zzp zzp1, zzh zzh1)
    {
        b = context;
        c = zzp1;
        a = zzh1;
    }

    private void a(zzy zzy)
    {
        try
        {
            c.zzf(a.zza(b, zzy));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzy zzy)
        {
            zzb.zzb("Failed to load ad.", zzy);
        }
    }

    public String getMediationAdapterClassName()
    {
        String s;
        try
        {
            s = c.getMediationAdapterClassName();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Failed to get the mediation adapter class name.", remoteexception);
            return null;
        }
        return s;
    }

    public boolean isLoading()
    {
        boolean flag;
        try
        {
            flag = c.isLoading();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Failed to check if ad is loading.", remoteexception);
            return false;
        }
        return flag;
    }

    public void loadAd(AdRequest adrequest)
    {
        a(adrequest.zzaF());
    }

    public void loadAd(PublisherAdRequest publisheradrequest)
    {
        a(publisheradrequest.zzaF());
    }
}
