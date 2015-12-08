// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.doubleclick;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.internal.jx;
import java.util.Date;

// Referenced classes of package com.google.android.gms.ads.doubleclick:
//            PublisherAdRequest

public static final class 
{

    private final com.google.android.gms.internal.uilder.lh lh = new com.google.android.gms.internal.uilder.lh();

    static com.google.android.gms.internal.uilder a( )
    {
        return .lh;
    }

    public lh addCustomEventExtrasBundle(Class class1, Bundle bundle)
    {
        lh.lh(class1, bundle);
        return this;
    }

    public lh addKeyword(String s)
    {
        lh.lh(s);
        return this;
    }

    public lh addNetworkExtras(NetworkExtras networkextras)
    {
        lh.lh(networkextras);
        return this;
    }

    public lh addNetworkExtrasBundle(Class class1, Bundle bundle)
    {
        lh.lh(class1, bundle);
        return this;
    }

    public lh addTestDevice(String s)
    {
        lh.lh(s);
        return this;
    }

    public PublisherAdRequest build()
    {
        return new PublisherAdRequest(this, null);
    }

    public lh setBirthday(Date date)
    {
        lh.lh(date);
        return this;
    }

    public lh setContentUrl(String s)
    {
        jx.b(s, "Content URL must be non-null.");
        jx.b(s, "Content URL must be non-empty.");
        boolean flag;
        if (s.length() <= 512)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, "Content URL must not exceed %d in length.  Provided length was %d.", new Object[] {
            Integer.valueOf(512), Integer.valueOf(s.length())
        });
        lh.lh(s);
        return this;
    }

    public lh setGender(int i)
    {
        lh.lh(i);
        return this;
    }

    public lh setLocation(Location location)
    {
        lh.lh(location);
        return this;
    }

    public lh setManualImpressionsEnabled(boolean flag)
    {
        lh.lh(flag);
        return this;
    }

    public lh setPublisherProvidedId(String s)
    {
        lh.lh(s);
        return this;
    }

    public lh tagForChildDirectedTreatment(boolean flag)
    {
        lh.lh(flag);
        return this;
    }

    public ()
    {
    }
}
