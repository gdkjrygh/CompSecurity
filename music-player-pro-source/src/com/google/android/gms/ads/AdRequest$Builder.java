// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.internal.jx;
import java.util.Date;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest

public static final class xtras
{

    private final com.google.android.gms.internal. lh = new com.google.android.gms.internal.();

    static com.google.android.gms.internal. a(xtras xtras)
    {
        return xtras.lh;
    }

    public lh addCustomEventExtrasBundle(Class class1, Bundle bundle)
    {
        lh.(class1, bundle);
        return this;
    }

    public lh addKeyword(String s)
    {
        lh.(s);
        return this;
    }

    public xtras addNetworkExtras(NetworkExtras networkextras)
    {
        lh.(networkextras);
        return this;
    }

    public xtras addNetworkExtrasBundle(Class class1, Bundle bundle)
    {
        lh.(class1, bundle);
        return this;
    }

    public lh addTestDevice(String s)
    {
        lh.(s);
        return this;
    }

    public AdRequest build()
    {
        return new AdRequest(this, null);
    }

    public lh setBirthday(Date date)
    {
        lh.(date);
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
        lh.(s);
        return this;
    }

    public lh setGender(int i)
    {
        lh.(i);
        return this;
    }

    public lh setLocation(Location location)
    {
        lh.(location);
        return this;
    }

    public lh tagForChildDirectedTreatment(boolean flag)
    {
        lh.(flag);
        return this;
    }

    public xtras()
    {
    }
}
