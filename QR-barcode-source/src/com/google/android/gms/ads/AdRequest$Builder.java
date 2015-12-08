// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.common.internal.o;
import java.util.Date;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest

public static final class xtras
{

    private final com.google.android.gms.internal. le = new com.google.android.gms.internal.();

    static com.google.android.gms.internal. a(xtras xtras)
    {
        return xtras.le;
    }

    public le addCustomEventExtrasBundle(Class class1, Bundle bundle)
    {
        le.(class1, bundle);
        return this;
    }

    public le addKeyword(String s)
    {
        le.(s);
        return this;
    }

    public xtras addNetworkExtras(NetworkExtras networkextras)
    {
        le.(networkextras);
        return this;
    }

    public xtras addNetworkExtrasBundle(Class class1, Bundle bundle)
    {
        le.(class1, bundle);
        return this;
    }

    public le addTestDevice(String s)
    {
        le.(s);
        return this;
    }

    public AdRequest build()
    {
        return new AdRequest(this, null);
    }

    public le setBirthday(Date date)
    {
        le.(date);
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
        le.(s);
        return this;
    }

    public le setGender(int i)
    {
        le.(i);
        return this;
    }

    public le setLocation(Location location)
    {
        le.(location);
        return this;
    }

    public le tagForChildDirectedTreatment(boolean flag)
    {
        le.(flag);
        return this;
    }

    public xtras()
    {
    }
}
