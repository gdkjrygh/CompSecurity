// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import java.util.Locale;

// Referenced classes of package org.joda.time.chrono:
//            BasicMonthOfYearDateTimeField, GJLocaleSymbols, BasicChronology

final class GJMonthOfYearDateTimeField extends BasicMonthOfYearDateTimeField
{

    private static final long serialVersionUID = 0xbe1b279198c4b697L;

    GJMonthOfYearDateTimeField(BasicChronology basicchronology)
    {
        super(basicchronology, 2);
    }

    protected int convertText(String s, Locale locale)
    {
        return GJLocaleSymbols.forLocale(locale).monthOfYearTextToValue(s);
    }

    public String getAsShortText(int i, Locale locale)
    {
        return GJLocaleSymbols.forLocale(locale).monthOfYearValueToShortText(i);
    }

    public String getAsText(int i, Locale locale)
    {
        return GJLocaleSymbols.forLocale(locale).monthOfYearValueToText(i);
    }

    public int getMaximumShortTextLength(Locale locale)
    {
        return GJLocaleSymbols.forLocale(locale).getMonthMaxShortTextLength();
    }

    public int getMaximumTextLength(Locale locale)
    {
        return GJLocaleSymbols.forLocale(locale).getMonthMaxTextLength();
    }
}
