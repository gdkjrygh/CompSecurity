// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.doubleclick;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.internal.fq;
import java.util.Date;

// Referenced classes of package com.google.android.gms.ads.doubleclick:
//            PublisherAdRequest

public static final class 
{

    private final com.google.android.gms.internal.uilder.kq kq = new com.google.android.gms.internal.uilder.kq();

    static com.google.android.gms.internal.uilder a( )
    {
        return .kq;
    }

    public kq addKeyword(String s)
    {
        kq.kq(s);
        return this;
    }

    public kq addNetworkExtras(NetworkExtras networkextras)
    {
        kq.kq(networkextras);
        return this;
    }

    public kq addNetworkExtrasBundle(Class class1, Bundle bundle)
    {
        kq.kq(class1, bundle);
        return this;
    }

    public kq addTestDevice(String s)
    {
        kq.kq(s);
        return this;
    }

    public PublisherAdRequest build()
    {
        return new PublisherAdRequest(this, null);
    }

    public kq setBirthday(Date date)
    {
        kq.kq(date);
        return this;
    }

    public kq setContentUrl(String s)
    {
        fq.b(s, "Content URL must be non-null.");
        fq.b(s, "Content URL must be non-empty.");
        boolean flag;
        if (s.length() <= 512)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fq.a(flag, "Content URL must not exceed %d in length.  Provided length was %d.", new Object[] {
            Integer.valueOf(512), Integer.valueOf(s.length())
        });
        kq.kq(s);
        return this;
    }

    public kq setGender(int i)
    {
        kq.kq(i);
        return this;
    }

    public kq setLocation(Location location)
    {
        kq.kq(location);
        return this;
    }

    public kq setManualImpressionsEnabled(boolean flag)
    {
        kq.kq(flag);
        return this;
    }

    public kq setPublisherProvidedId(String s)
    {
        kq.kq(s);
        return this;
    }

    public kq tagForChildDirectedTreatment(boolean flag)
    {
        kq.kq(flag);
        return this;
    }

    public ()
    {
    }
}
