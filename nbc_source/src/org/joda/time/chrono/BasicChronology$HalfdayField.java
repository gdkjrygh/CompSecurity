// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.PreciseDateTimeField;

// Referenced classes of package org.joda.time.chrono:
//            BasicChronology, GJLocaleSymbols

private static class  extends PreciseDateTimeField
{

    private static final long serialVersionUID = 0x812436e7a068fe6L;

    public String getAsText(int i, Locale locale)
    {
        return GJLocaleSymbols.forLocale(locale).halfdayValueToText(i);
    }

    public int getMaximumTextLength(Locale locale)
    {
        return GJLocaleSymbols.forLocale(locale).getHalfdayMaxTextLength();
    }

    public long set(long l, String s, Locale locale)
    {
        return set(l, GJLocaleSymbols.forLocale(locale).halfdayTextToValue(s));
    }

    ()
    {
        super(DateTimeFieldType.halfdayOfDay(), BasicChronology.access$000(), BasicChronology.access$100());
    }
}
