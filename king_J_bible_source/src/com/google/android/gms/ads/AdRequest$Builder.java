// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.internal.fq;
import java.util.Date;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest

public static final class xtras
{

    private final com.google.android.gms.internal. kq = new com.google.android.gms.internal.();

    static com.google.android.gms.internal. a(xtras xtras)
    {
        return xtras.kq;
    }

    public kq addKeyword(String s)
    {
        kq.(s);
        return this;
    }

    public xtras addNetworkExtras(NetworkExtras networkextras)
    {
        kq.(networkextras);
        return this;
    }

    public xtras addNetworkExtrasBundle(Class class1, Bundle bundle)
    {
        kq.(class1, bundle);
        return this;
    }

    public kq addTestDevice(String s)
    {
        kq.(s);
        return this;
    }

    public AdRequest build()
    {
        return new AdRequest(this, null);
    }

    public kq setBirthday(Date date)
    {
        kq.(date);
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
        kq.(s);
        return this;
    }

    public kq setGender(int i)
    {
        kq.(i);
        return this;
    }

    public kq setLocation(Location location)
    {
        kq.(location);
        return this;
    }

    public kq tagForChildDirectedTreatment(boolean flag)
    {
        kq.(flag);
        return this;
    }

    public xtras()
    {
    }
}
