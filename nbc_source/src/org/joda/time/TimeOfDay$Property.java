// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;

import java.io.Serializable;
import java.util.Locale;
import org.joda.time.field.AbstractPartialFieldProperty;

// Referenced classes of package org.joda.time:
//            TimeOfDay, DateTimeField, ReadablePartial

public static class iFieldIndex extends AbstractPartialFieldProperty
    implements Serializable
{

    private static final long serialVersionUID = 0x4db1b8ed7103ae99L;
    private final int iFieldIndex;
    private final TimeOfDay iTimeOfDay;

    public TimeOfDay addNoWrapToCopy(int i)
    {
        int ai[] = iTimeOfDay.getValues();
        ai = getField().add(iTimeOfDay, iFieldIndex, ai, i);
        return new TimeOfDay(iTimeOfDay, ai);
    }

    public TimeOfDay addToCopy(int i)
    {
        int ai[] = iTimeOfDay.getValues();
        ai = getField().addWrapPartial(iTimeOfDay, iFieldIndex, ai, i);
        return new TimeOfDay(iTimeOfDay, ai);
    }

    public TimeOfDay addWrapFieldToCopy(int i)
    {
        int ai[] = iTimeOfDay.getValues();
        ai = getField().addWrapField(iTimeOfDay, iFieldIndex, ai, i);
        return new TimeOfDay(iTimeOfDay, ai);
    }

    public int get()
    {
        return iTimeOfDay.getValue(iFieldIndex);
    }

    public DateTimeField getField()
    {
        return iTimeOfDay.getField(iFieldIndex);
    }

    protected ReadablePartial getReadablePartial()
    {
        return iTimeOfDay;
    }

    public TimeOfDay getTimeOfDay()
    {
        return iTimeOfDay;
    }

    public TimeOfDay setCopy(int i)
    {
        int ai[] = iTimeOfDay.getValues();
        ai = getField().set(iTimeOfDay, iFieldIndex, ai, i);
        return new TimeOfDay(iTimeOfDay, ai);
    }

    public TimeOfDay setCopy(String s)
    {
        return setCopy(s, null);
    }

    public TimeOfDay setCopy(String s, Locale locale)
    {
        int ai[] = iTimeOfDay.getValues();
        s = getField().set(iTimeOfDay, iFieldIndex, ai, s, locale);
        return new TimeOfDay(iTimeOfDay, s);
    }

    public TimeOfDay withMaximumValue()
    {
        return setCopy(getMaximumValue());
    }

    public TimeOfDay withMinimumValue()
    {
        return setCopy(getMinimumValue());
    }

    alFieldProperty(TimeOfDay timeofday, int i)
    {
        iTimeOfDay = timeofday;
        iFieldIndex = i;
    }
}
