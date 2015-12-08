// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.internal.hn;
import java.util.Date;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest

public static final class xtras
{

    private final com.google.android.gms.internal. kr = new com.google.android.gms.internal.();

    static com.google.android.gms.internal. a(xtras xtras)
    {
        return xtras.kr;
    }

    public kr addCustomEventExtrasBundle(Class class1, Bundle bundle)
    {
        kr.(class1, bundle);
        return this;
    }

    public kr addKeyword(String s)
    {
        kr.(s);
        return this;
    }

    public xtras addNetworkExtras(NetworkExtras networkextras)
    {
        kr.(networkextras);
        return this;
    }

    public xtras addNetworkExtrasBundle(Class class1, Bundle bundle)
    {
        kr.(class1, bundle);
        return this;
    }

    public kr addTestDevice(String s)
    {
        kr.(s);
        return this;
    }

    public AdRequest build()
    {
        return new AdRequest(this, null);
    }

    public kr setBirthday(Date date)
    {
        kr.(date);
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
        kr.(s);
        return this;
    }

    public kr setGender(int i)
    {
        kr.(i);
        return this;
    }

    public kr setLocation(Location location)
    {
        kr.(location);
        return this;
    }

    public kr tagForChildDirectedTreatment(boolean flag)
    {
        kr.(flag);
        return this;
    }

    public xtras()
    {
    }
}
