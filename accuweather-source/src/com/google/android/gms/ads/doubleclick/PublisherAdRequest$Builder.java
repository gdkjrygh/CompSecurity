// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.doubleclick;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.internal.hn;
import java.util.Date;

// Referenced classes of package com.google.android.gms.ads.doubleclick:
//            PublisherAdRequest

public static final class 
{

    private final com.google.android.gms.internal.uilder.kr kr = new com.google.android.gms.internal.uilder.kr();

    static com.google.android.gms.internal.uilder a( )
    {
        return .kr;
    }

    public kr addCustomEventExtrasBundle(Class class1, Bundle bundle)
    {
        kr.kr(class1, bundle);
        return this;
    }

    public kr addKeyword(String s)
    {
        kr.kr(s);
        return this;
    }

    public kr addNetworkExtras(NetworkExtras networkextras)
    {
        kr.kr(networkextras);
        return this;
    }

    public kr addNetworkExtrasBundle(Class class1, Bundle bundle)
    {
        kr.kr(class1, bundle);
        return this;
    }

    public kr addTestDevice(String s)
    {
        kr.kr(s);
        return this;
    }

    public PublisherAdRequest build()
    {
        return new PublisherAdRequest(this, null);
    }

    public kr setBirthday(Date date)
    {
        kr.kr(date);
        return this;
    }

    public kr setContentUrl(String s)
    {
        hn.b(s, "Content URL must be non-null.");
        hn.b(s, "Content URL must be non-empty.");
        boolean flag;
        if (s.length() <= 512)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hn.b(flag, "Content URL must not exceed %d in length.  Provided length was %d.", new Object[] {
            Integer.valueOf(512), Integer.valueOf(s.length())
        });
        kr.kr(s);
        return this;
    }

    public kr setGender(int i)
    {
        kr.kr(i);
        return this;
    }

    public kr setLocation(Location location)
    {
        kr.kr(location);
        return this;
    }

    public kr setManualImpressionsEnabled(boolean flag)
    {
        kr.kr(flag);
        return this;
    }

    public kr setPublisherProvidedId(String s)
    {
        kr.kr(s);
        return this;
    }

    public kr tagForChildDirectedTreatment(boolean flag)
    {
        kr.kr(flag);
        return this;
    }

    public ()
    {
    }
}
