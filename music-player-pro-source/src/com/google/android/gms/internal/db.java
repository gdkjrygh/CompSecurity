// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

public final class db
    implements MediationAdRequest
{

    private final Date d;
    private final Set f;
    private final boolean g;
    private final Location h;
    private final int ow;
    private final int qU;

    public db(Date date, int i, Set set, Location location, boolean flag, int j)
    {
        d = date;
        ow = i;
        f = set;
        h = location;
        g = flag;
        qU = j;
    }

    public Date getBirthday()
    {
        return d;
    }

    public int getGender()
    {
        return ow;
    }

    public Set getKeywords()
    {
        return f;
    }

    public Location getLocation()
    {
        return h;
    }

    public boolean isTesting()
    {
        return g;
    }

    public int taggedForChildDirectedTreatment()
    {
        return qU;
    }
}
