// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.doubleclick;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzv;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.doubleclick:
//            PublisherAdRequest

public static final class 
{

    private final com.google.android.gms.ads.internal.client. zzlZ = new com.google.android.gms.ads.internal.client.();

    static com.google.android.gms.ads.internal.client. zza( )
    {
        return .zzlZ;
    }

    public zzlZ addCategoryExclusion(String s)
    {
        zzlZ.(s);
        return this;
    }

    public zzlZ addCustomEventExtrasBundle(Class class1, Bundle bundle)
    {
        zzlZ.(class1, bundle);
        return this;
    }

    public zzlZ addCustomTargeting(String s, String s1)
    {
        zzlZ.(s, s1);
        return this;
    }

    public zzlZ addCustomTargeting(String s, List list)
    {
        if (list != null)
        {
            zzlZ.(s, zzt.zzbR(",").zza(list));
        }
        return this;
    }

    public zzlZ addKeyword(String s)
    {
        zzlZ.(s);
        return this;
    }

    public zzlZ addNetworkExtras(NetworkExtras networkextras)
    {
        zzlZ.(networkextras);
        return this;
    }

    public zzlZ addNetworkExtrasBundle(Class class1, Bundle bundle)
    {
        zzlZ.(class1, bundle);
        return this;
    }

    public zzlZ addTestDevice(String s)
    {
        zzlZ.(s);
        return this;
    }

    public PublisherAdRequest build()
    {
        return new PublisherAdRequest(this, null);
    }

    public zzlZ setBirthday(Date date)
    {
        zzlZ.(date);
        return this;
    }

    public zzlZ setContentUrl(String s)
    {
        zzv.zzb(s, "Content URL must be non-null.");
        zzv.zzh(s, "Content URL must be non-empty.");
        boolean flag;
        if (s.length() <= 512)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzv.zzb(flag, "Content URL must not exceed %d in length.  Provided length was %d.", new Object[] {
            Integer.valueOf(512), Integer.valueOf(s.length())
        });
        zzlZ.(s);
        return this;
    }

    public zzlZ setGender(int i)
    {
        zzlZ.(i);
        return this;
    }

    public zzlZ setLocation(Location location)
    {
        zzlZ.(location);
        return this;
    }

    public zzlZ setManualImpressionsEnabled(boolean flag)
    {
        zzlZ.(flag);
        return this;
    }

    public zzlZ setPublisherProvidedId(String s)
    {
        zzlZ.(s);
        return this;
    }

    public zzlZ setRequestAgent(String s)
    {
        zzlZ.(s);
        return this;
    }

    public zzlZ tagForChildDirectedTreatment(boolean flag)
    {
        zzlZ.(flag);
        return this;
    }

    public ()
    {
    }
}
