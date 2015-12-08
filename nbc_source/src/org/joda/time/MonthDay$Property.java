// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;

import java.io.Serializable;
import java.util.Locale;
import org.joda.time.field.AbstractPartialFieldProperty;

// Referenced classes of package org.joda.time:
//            MonthDay, DateTimeField, ReadablePartial

public static class iFieldIndex extends AbstractPartialFieldProperty
    implements Serializable
{

    private static final long serialVersionUID = 0x4f7cffbcbc856febL;
    private final MonthDay iBase;
    private final int iFieldIndex;

    public MonthDay addToCopy(int i)
    {
        int ai[] = iBase.getValues();
        ai = getField().add(iBase, iFieldIndex, ai, i);
        return new MonthDay(iBase, ai);
    }

    public MonthDay addWrapFieldToCopy(int i)
    {
        int ai[] = iBase.getValues();
        ai = getField().addWrapField(iBase, iFieldIndex, ai, i);
        return new MonthDay(iBase, ai);
    }

    public int get()
    {
        return iBase.getValue(iFieldIndex);
    }

    public DateTimeField getField()
    {
        return iBase.getField(iFieldIndex);
    }

    public MonthDay getMonthDay()
    {
        return iBase;
    }

    protected ReadablePartial getReadablePartial()
    {
        return iBase;
    }

    public MonthDay setCopy(int i)
    {
        int ai[] = iBase.getValues();
        ai = getField().set(iBase, iFieldIndex, ai, i);
        return new MonthDay(iBase, ai);
    }

    public MonthDay setCopy(String s)
    {
        return setCopy(s, null);
    }

    public MonthDay setCopy(String s, Locale locale)
    {
        int ai[] = iBase.getValues();
        s = getField().set(iBase, iFieldIndex, ai, s, locale);
        return new MonthDay(iBase, s);
    }

    ialFieldProperty(MonthDay monthday, int i)
    {
        iBase = monthday;
        iFieldIndex = i;
    }
}
