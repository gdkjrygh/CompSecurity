// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import com.google.android.gms.ads.mediation.NetworkExtras;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest

public static final class dK
{

    private Date d;
    private int dI;
    private int dK;
    private final HashSet dM = new HashSet();
    private final HashMap dN = new HashMap();
    private final HashSet dO = new HashSet();

    static Date a(dK dk)
    {
        return dk.d;
    }

    static int b(d d1)
    {
        return d1.dI;
    }

    static HashSet c(dI di)
    {
        return di.dM;
    }

    static HashMap d(dM dm)
    {
        return dm.dN;
    }

    static int e(dN dn)
    {
        return dn.dK;
    }

    static HashSet f(dK dk)
    {
        return dk.dO;
    }

    public dO addKeyword(String s)
    {
        dM.add(s);
        return this;
    }

    public xtras addNetworkExtras(NetworkExtras networkextras)
    {
        dN.put(networkextras.getClass(), networkextras);
        return this;
    }

    public dN addTestDevice(String s)
    {
        dO.add(s);
        return this;
    }

    public AdRequest build()
    {
        return new AdRequest(this, null);
    }

    public dO setBirthday(Date date)
    {
        d = date;
        return this;
    }

    public d setGender(int i)
    {
        dI = i;
        return this;
    }

    public dI tagForChildDirectedTreatment(boolean flag)
    {
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        dK = i;
        return this;
    }

    public xtras()
    {
        dI = -1;
        dK = -1;
    }
}
