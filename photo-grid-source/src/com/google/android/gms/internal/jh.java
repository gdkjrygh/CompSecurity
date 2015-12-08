// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

public final class jh
    implements MediationAdRequest
{

    private final Date a;
    private final int b;
    private final Set c;
    private final boolean d;
    private final Location e;
    private final int f;

    public jh(Date date, int i, Set set, Location location, boolean flag, int j)
    {
        a = date;
        b = i;
        c = set;
        e = location;
        d = flag;
        f = j;
    }

    public final Date getBirthday()
    {
        return a;
    }

    public final int getGender()
    {
        return b;
    }

    public final Set getKeywords()
    {
        return c;
    }

    public final Location getLocation()
    {
        return e;
    }

    public final boolean isTesting()
    {
        return d;
    }

    public final int taggedForChildDirectedTreatment()
    {
        return f;
    }
}
