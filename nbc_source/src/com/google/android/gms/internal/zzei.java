// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

public final class zzei
    implements MediationAdRequest
{

    private final Date zzaQ;
    private final Set zzaS;
    private final boolean zzaT;
    private final Location zzaU;
    private final int zzsC;
    private final int zzye;

    public zzei(Date date, int i, Set set, Location location, boolean flag, int j)
    {
        zzaQ = date;
        zzsC = i;
        zzaS = set;
        zzaU = location;
        zzaT = flag;
        zzye = j;
    }

    public Date getBirthday()
    {
        return zzaQ;
    }

    public int getGender()
    {
        return zzsC;
    }

    public Set getKeywords()
    {
        return zzaS;
    }

    public Location getLocation()
    {
        return zzaU;
    }

    public boolean isTesting()
    {
        return zzaT;
    }

    public int taggedForChildDirectedTreatment()
    {
        return zzye;
    }
}
