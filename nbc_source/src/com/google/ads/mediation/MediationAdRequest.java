// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation;

import android.location.Location;
import java.util.Date;
import java.util.Set;

public class MediationAdRequest
{

    private final Date zzaQ;
    private final com.google.ads.AdRequest.Gender zzaR;
    private final Set zzaS;
    private final boolean zzaT;
    private final Location zzaU;

    public MediationAdRequest(Date date, com.google.ads.AdRequest.Gender gender, Set set, boolean flag, Location location)
    {
        zzaQ = date;
        zzaR = gender;
        zzaS = set;
        zzaT = flag;
        zzaU = location;
    }
}
