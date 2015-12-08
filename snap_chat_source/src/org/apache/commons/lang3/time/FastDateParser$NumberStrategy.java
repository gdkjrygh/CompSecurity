// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.time;

import java.util.Calendar;

// Referenced classes of package org.apache.commons.lang3.time:
//            FastDateParser

static class field extends field
{

    private final int field;

    boolean addRegex(FastDateParser fastdateparser, StringBuilder stringbuilder)
    {
        if (fastdateparser.isNextNumber())
        {
            stringbuilder.append("(\\p{Nd}{").append(fastdateparser.getFieldWidth()).append("}+)");
        } else
        {
            stringbuilder.append("(\\p{Nd}++)");
        }
        return true;
    }

    boolean isNumber()
    {
        return true;
    }

    int modify(int i)
    {
        return i;
    }

    void setCalendar(FastDateParser fastdateparser, Calendar calendar, String s)
    {
        calendar.set(field, modify(Integer.parseInt(s)));
    }

    A(int i)
    {
        super(null);
        field = i;
    }
}
