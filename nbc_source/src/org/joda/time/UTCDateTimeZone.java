// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;

import java.util.SimpleTimeZone;
import java.util.TimeZone;

// Referenced classes of package org.joda.time:
//            DateTimeZone

final class UTCDateTimeZone extends DateTimeZone
{

    static final DateTimeZone INSTANCE = new UTCDateTimeZone();
    private static final long serialVersionUID = 0xcf3f4667c8adc9fcL;

    public UTCDateTimeZone()
    {
        super("UTC");
    }

    public boolean equals(Object obj)
    {
        return obj instanceof UTCDateTimeZone;
    }

    public String getNameKey(long l)
    {
        return "UTC";
    }

    public int getOffset(long l)
    {
        return 0;
    }

    public int getOffsetFromLocal(long l)
    {
        return 0;
    }

    public int getStandardOffset(long l)
    {
        return 0;
    }

    public int hashCode()
    {
        return getID().hashCode();
    }

    public boolean isFixed()
    {
        return true;
    }

    public long nextTransition(long l)
    {
        return l;
    }

    public long previousTransition(long l)
    {
        return l;
    }

    public TimeZone toTimeZone()
    {
        return new SimpleTimeZone(0, getID());
    }

}
