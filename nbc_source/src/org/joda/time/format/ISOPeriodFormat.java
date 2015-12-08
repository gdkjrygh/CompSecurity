// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;


// Referenced classes of package org.joda.time.format:
//            PeriodFormatterBuilder, PeriodFormatter

public class ISOPeriodFormat
{

    private static PeriodFormatter cAlternate;
    private static PeriodFormatter cAlternateExtended;
    private static PeriodFormatter cAlternateExtendedWihWeeks;
    private static PeriodFormatter cAlternateWithWeeks;
    private static PeriodFormatter cStandard;

    protected ISOPeriodFormat()
    {
    }

    public static PeriodFormatter alternate()
    {
        if (cAlternate == null)
        {
            cAlternate = (new PeriodFormatterBuilder()).appendLiteral("P").printZeroAlways().minimumPrintedDigits(4).appendYears().minimumPrintedDigits(2).appendMonths().appendDays().appendSeparatorIfFieldsAfter("T").appendHours().appendMinutes().appendSecondsWithOptionalMillis().toFormatter();
        }
        return cAlternate;
    }

    public static PeriodFormatter alternateExtended()
    {
        if (cAlternateExtended == null)
        {
            cAlternateExtended = (new PeriodFormatterBuilder()).appendLiteral("P").printZeroAlways().minimumPrintedDigits(4).appendYears().appendSeparator("-").minimumPrintedDigits(2).appendMonths().appendSeparator("-").appendDays().appendSeparatorIfFieldsAfter("T").appendHours().appendSeparator(":").appendMinutes().appendSeparator(":").appendSecondsWithOptionalMillis().toFormatter();
        }
        return cAlternateExtended;
    }

    public static PeriodFormatter alternateExtendedWithWeeks()
    {
        if (cAlternateExtendedWihWeeks == null)
        {
            cAlternateExtendedWihWeeks = (new PeriodFormatterBuilder()).appendLiteral("P").printZeroAlways().minimumPrintedDigits(4).appendYears().appendSeparator("-").minimumPrintedDigits(2).appendPrefix("W").appendWeeks().appendSeparator("-").appendDays().appendSeparatorIfFieldsAfter("T").appendHours().appendSeparator(":").appendMinutes().appendSeparator(":").appendSecondsWithOptionalMillis().toFormatter();
        }
        return cAlternateExtendedWihWeeks;
    }

    public static PeriodFormatter alternateWithWeeks()
    {
        if (cAlternateWithWeeks == null)
        {
            cAlternateWithWeeks = (new PeriodFormatterBuilder()).appendLiteral("P").printZeroAlways().minimumPrintedDigits(4).appendYears().minimumPrintedDigits(2).appendPrefix("W").appendWeeks().appendDays().appendSeparatorIfFieldsAfter("T").appendHours().appendMinutes().appendSecondsWithOptionalMillis().toFormatter();
        }
        return cAlternateWithWeeks;
    }

    public static PeriodFormatter standard()
    {
        if (cStandard == null)
        {
            cStandard = (new PeriodFormatterBuilder()).appendLiteral("P").appendYears().appendSuffix("Y").appendMonths().appendSuffix("M").appendWeeks().appendSuffix("W").appendDays().appendSuffix("D").appendSeparatorIfFieldsAfter("T").appendHours().appendSuffix("H").appendMinutes().appendSuffix("M").appendSecondsWithOptionalMillis().appendSuffix("S").toFormatter();
        }
        return cStandard;
    }
}
