// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;

import org.joda.time.chrono.BaseChronology;

// Referenced classes of package org.joda.time:
//            DateTimeZone, Chronology

static class  extends BaseChronology
{

    private static final long serialVersionUID = 0xd4947ab9cf0bf864L;

    public DateTimeZone getZone()
    {
        return null;
    }

    public String toString()
    {
        return getClass().getName();
    }

    public Chronology withUTC()
    {
        return this;
    }

    public Chronology withZone(DateTimeZone datetimezone)
    {
        return this;
    }

    ()
    {
    }
}
