// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.doubleclick;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.common.internal.o;
import java.util.Date;

// Referenced classes of package com.google.android.gms.ads.doubleclick:
//            PublisherAdRequest

public static final class 
{

    private final com.google.android.gms.internal.uilder.le le = new com.google.android.gms.internal.uilder.le();

    static com.google.android.gms.internal.uilder a( )
    {
        return .le;
    }

    public le addCustomEventExtrasBundle(Class class1, Bundle bundle)
    {
        le.le(class1, bundle);
        return this;
    }

    public le addKeyword(String s)
    {
        le.le(s);
        return this;
    }

    public le addNetworkExtras(NetworkExtras networkextras)
    {
        le.le(networkextras);
        return this;
    }

    public le addNetworkExtrasBundle(Class class1, Bundle bundle)
    {
        le.le(class1, bundle);
        return this;
    }

    public le addTestDevice(String s)
    {
        le.le(s);
        return this;
    }

    public PublisherAdRequest build()
    {
        return new PublisherAdRequest(this, null);
    }

    public le setBirthday(Date date)
    {
        le.le(date);
        return this;
    }

    public le setContentUrl(String s)
    {
        o.b(s, "Content URL must be non-null.");
        o.b(s, "Content URL must be non-empty.");
        boolean flag;
        if (s.length() <= 512)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "Content URL must not exceed %d in length.  Provided length was %d.", new Object[] {
            Integer.valueOf(512), Integer.valueOf(s.length())
        });
        le.le(s);
        return this;
    }

    public le setGender(int i)
    {
        le.le(i);
        return this;
    }

    public le setLocation(Location location)
    {
        le.le(location);
        return this;
    }

    public le setManualImpressionsEnabled(boolean flag)
    {
        le.le(flag);
        return this;
    }

    public le setPublisherProvidedId(String s)
    {
        le.le(s);
        return this;
    }

    public le tagForChildDirectedTreatment(boolean flag)
    {
        le.le(flag);
        return this;
    }

    public ()
    {
    }
}
