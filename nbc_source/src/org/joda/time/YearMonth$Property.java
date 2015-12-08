// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;

import java.io.Serializable;
import java.util.Locale;
import org.joda.time.field.AbstractPartialFieldProperty;

// Referenced classes of package org.joda.time:
//            YearMonth, DateTimeField, ReadablePartial

public static class iFieldIndex extends AbstractPartialFieldProperty
    implements Serializable
{

    private static final long serialVersionUID = 0x4f7cffbcbc856febL;
    private final YearMonth iBase;
    private final int iFieldIndex;

    public YearMonth addToCopy(int i)
    {
        int ai[] = iBase.getValues();
        ai = getField().add(iBase, iFieldIndex, ai, i);
        return new YearMonth(iBase, ai);
    }

    public YearMonth addWrapFieldToCopy(int i)
    {
        int ai[] = iBase.getValues();
        ai = getField().addWrapField(iBase, iFieldIndex, ai, i);
        return new YearMonth(iBase, ai);
    }

    public int get()
    {
        return iBase.getValue(iFieldIndex);
    }

    public DateTimeField getField()
    {
        return iBase.getField(iFieldIndex);
    }

    protected ReadablePartial getReadablePartial()
    {
        return iBase;
    }

    public YearMonth getYearMonth()
    {
        return iBase;
    }

    public YearMonth setCopy(int i)
    {
        int ai[] = iBase.getValues();
        ai = getField().set(iBase, iFieldIndex, ai, i);
        return new YearMonth(iBase, ai);
    }

    public YearMonth setCopy(String s)
    {
        return setCopy(s, null);
    }

    public YearMonth setCopy(String s, Locale locale)
    {
        int ai[] = iBase.getValues();
        s = getField().set(iBase, iFieldIndex, ai, s, locale);
        return new YearMonth(iBase, s);
    }

    alFieldProperty(YearMonth yearmonth, int i)
    {
        iBase = yearmonth;
        iFieldIndex = i;
    }
}
