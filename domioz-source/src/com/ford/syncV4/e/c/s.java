// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c;

import com.ford.syncV4.e.h;
import java.util.Hashtable;

public final class s extends h
{

    public s()
    {
    }

    public s(Hashtable hashtable)
    {
        super(hashtable);
    }

    public final Double a()
    {
        return (Double)d.get("longitudeDegrees");
    }

    public final Double b()
    {
        return (Double)d.get("latitudeDegrees");
    }

    public final Integer c()
    {
        return (Integer)d.get("utcYear");
    }

    public final Integer d()
    {
        return (Integer)d.get("utcMonth");
    }

    public final Integer e()
    {
        return (Integer)d.get("utcDay");
    }

    public final Integer f()
    {
        return (Integer)d.get("utcHours");
    }

    public final Integer i()
    {
        return (Integer)d.get("utcMinutes");
    }

    public final Integer j()
    {
        return (Integer)d.get("utcSeconds");
    }

    public final Double k()
    {
        return (Double)d.get("hdop");
    }

    public final Double l()
    {
        return (Double)d.get("altitude");
    }

    public final Double m()
    {
        return (Double)d.get("heading");
    }

    public final Double n()
    {
        return (Double)d.get("speed");
    }
}
