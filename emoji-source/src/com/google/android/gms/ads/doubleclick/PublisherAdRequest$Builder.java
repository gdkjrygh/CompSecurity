// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.doubleclick;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.internal.hm;
import java.util.Date;

// Referenced classes of package com.google.android.gms.ads.doubleclick:
//            PublisherAdRequest

public static final class 
{

    private final com.google.android.gms.internal.uilder.kt kt = new com.google.android.gms.internal.uilder.kt();

    static com.google.android.gms.internal.uilder a( )
    {
        return .kt;
    }

    public kt addCustomEventExtrasBundle(Class class1, Bundle bundle)
    {
        kt.kt(class1, bundle);
        return this;
    }

    public kt addKeyword(String s)
    {
        kt.kt(s);
        return this;
    }

    public kt addNetworkExtras(NetworkExtras networkextras)
    {
        kt.kt(networkextras);
        return this;
    }

    public kt addNetworkExtrasBundle(Class class1, Bundle bundle)
    {
        kt.kt(class1, bundle);
        return this;
    }

    public kt addTestDevice(String s)
    {
        kt.kt(s);
        return this;
    }

    public PublisherAdRequest build()
    {
        return new PublisherAdRequest(this, null);
    }

    public kt setBirthday(Date date)
    {
        kt.kt(date);
        return this;
    }

    public kt setContentUrl(String s)
    {
        hm.b(s, "Content URL must be non-null.");
        hm.b(s, "Content URL must be non-empty.");
        boolean flag;
        if (s.length() <= 512)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hm.b(flag, "Content URL must not exceed %d in length.  Provided length was %d.", new Object[] {
            Integer.valueOf(512), Integer.valueOf(s.length())
        });
        kt.kt(s);
        return this;
    }

    public kt setGender(int i)
    {
        kt.kt(i);
        return this;
    }

    public kt setLocation(Location location)
    {
        kt.kt(location);
        return this;
    }

    public kt setManualImpressionsEnabled(boolean flag)
    {
        kt.kt(flag);
        return this;
    }

    public kt setPublisherProvidedId(String s)
    {
        kt.kt(s);
        return this;
    }

    public kt tagForChildDirectedTreatment(boolean flag)
    {
        kt.kt(flag);
        return this;
    }

    public ()
    {
    }
}
