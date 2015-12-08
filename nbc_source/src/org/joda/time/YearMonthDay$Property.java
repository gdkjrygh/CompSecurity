// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;

import java.io.Serializable;
import java.util.Locale;
import org.joda.time.field.AbstractPartialFieldProperty;

// Referenced classes of package org.joda.time:
//            YearMonthDay, DateTimeField, ReadablePartial

public static class iFieldIndex extends AbstractPartialFieldProperty
    implements Serializable
{

    private static final long serialVersionUID = 0x4f7cffbcbc856febL;
    private final int iFieldIndex;
    private final YearMonthDay iYearMonthDay;

    public YearMonthDay addToCopy(int i)
    {
        int ai[] = iYearMonthDay.getValues();
        ai = getField().add(iYearMonthDay, iFieldIndex, ai, i);
        return new YearMonthDay(iYearMonthDay, ai);
    }

    public YearMonthDay addWrapFieldToCopy(int i)
    {
        int ai[] = iYearMonthDay.getValues();
        ai = getField().addWrapField(iYearMonthDay, iFieldIndex, ai, i);
        return new YearMonthDay(iYearMonthDay, ai);
    }

    public int get()
    {
        return iYearMonthDay.getValue(iFieldIndex);
    }

    public DateTimeField getField()
    {
        return iYearMonthDay.getField(iFieldIndex);
    }

    protected ReadablePartial getReadablePartial()
    {
        return iYearMonthDay;
    }

    public YearMonthDay getYearMonthDay()
    {
        return iYearMonthDay;
    }

    public YearMonthDay setCopy(int i)
    {
        int ai[] = iYearMonthDay.getValues();
        ai = getField().set(iYearMonthDay, iFieldIndex, ai, i);
        return new YearMonthDay(iYearMonthDay, ai);
    }

    public YearMonthDay setCopy(String s)
    {
        return setCopy(s, null);
    }

    public YearMonthDay setCopy(String s, Locale locale)
    {
        int ai[] = iYearMonthDay.getValues();
        s = getField().set(iYearMonthDay, iFieldIndex, ai, s, locale);
        return new YearMonthDay(iYearMonthDay, s);
    }

    public YearMonthDay withMaximumValue()
    {
        return setCopy(getMaximumValue());
    }

    public YearMonthDay withMinimumValue()
    {
        return setCopy(getMinimumValue());
    }

    ieldProperty(YearMonthDay yearmonthday, int i)
    {
        iYearMonthDay = yearmonthday;
        iFieldIndex = i;
    }
}
