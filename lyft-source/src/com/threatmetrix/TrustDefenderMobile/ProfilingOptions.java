// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.location.Location;
import java.util.List;

public class ProfilingOptions
{

    private String a;
    private List b;
    private Location c;

    public ProfilingOptions()
    {
    }

    public ProfilingOptions a(Location location)
    {
        c = location;
        return this;
    }

    public ProfilingOptions a(String s)
    {
        a = s;
        return this;
    }

    String a()
    {
        return a;
    }

    List b()
    {
        return b;
    }

    Location c()
    {
        return c;
    }
}
