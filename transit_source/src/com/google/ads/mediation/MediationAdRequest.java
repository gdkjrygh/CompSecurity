// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation;

import android.location.Location;
import java.util.Date;
import java.util.Set;

public final class MediationAdRequest
{

    private final Date d;
    private final com.google.ads.AdRequest.Gender e;
    private final Set f;
    private final boolean g;

    public MediationAdRequest(Date date, com.google.ads.AdRequest.Gender gender, Set set, boolean flag)
    {
        d = date;
        e = gender;
        f = set;
        g = flag;
    }

    public Integer getAgeInYears()
    {
        return null;
    }

    public Date getBirthday()
    {
        return d;
    }

    public com.google.ads.AdRequest.Gender getGender()
    {
        return e;
    }

    public Set getKeywords()
    {
        return f;
    }

    public Location getLocation()
    {
        return null;
    }

    public boolean isTesting()
    {
        return g;
    }
}
