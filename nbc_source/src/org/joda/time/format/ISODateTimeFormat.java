// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.joda.time.DateTimeFieldType;

// Referenced classes of package org.joda.time.format:
//            DateTimeFormatterBuilder, DateTimeFormatter, DateTimeParser

public class ISODateTimeFormat
{
    static final class Constants
    {

        private static final DateTimeFormatter bd = basicDate();
        private static final DateTimeFormatter bdt = basicDateTime();
        private static final DateTimeFormatter bdtx = basicDateTimeNoMillis();
        private static final DateTimeFormatter bod = basicOrdinalDate();
        private static final DateTimeFormatter bodt = basicOrdinalDateTime();
        private static final DateTimeFormatter bodtx = basicOrdinalDateTimeNoMillis();
        private static final DateTimeFormatter bt = basicTime();
        private static final DateTimeFormatter btt = basicTTime();
        private static final DateTimeFormatter bttx = basicTTimeNoMillis();
        private static final DateTimeFormatter btx = basicTimeNoMillis();
        private static final DateTimeFormatter bwd = basicWeekDate();
        private static final DateTimeFormatter bwdt = basicWeekDateTime();
        private static final DateTimeFormatter bwdtx = basicWeekDateTimeNoMillis();
        private static final DateTimeFormatter dh = dateHour();
        private static final DateTimeFormatter dhm = dateHourMinute();
        private static final DateTimeFormatter dhms = dateHourMinuteSecond();
        private static final DateTimeFormatter dhmsf = dateHourMinuteSecondFraction();
        private static final DateTimeFormatter dhmsl = dateHourMinuteSecondMillis();
        private static final DateTimeFormatter dme = dayOfMonthElement();
        private static final DateTimeFormatter dotp = dateOptionalTimeParser();
        private static final DateTimeFormatter dp = dateParser();
        private static final DateTimeFormatter dpe = dateElementParser();
        private static final DateTimeFormatter dt = dateTime();
        private static final DateTimeFormatter dtp = dateTimeParser();
        private static final DateTimeFormatter dtx = dateTimeNoMillis();
        private static final DateTimeFormatter dwe = dayOfWeekElement();
        private static final DateTimeFormatter dye = dayOfYearElement();
        private static final DateTimeFormatter fse = fractionElement();
        private static final DateTimeFormatter hde = hourElement();
        private static final DateTimeFormatter hm = hourMinute();
        private static final DateTimeFormatter hms = hourMinuteSecond();
        private static final DateTimeFormatter hmsf = hourMinuteSecondFraction();
        private static final DateTimeFormatter hmsl = hourMinuteSecondMillis();
        private static final DateTimeFormatter ldotp = localDateOptionalTimeParser();
        private static final DateTimeFormatter ldp = localDateParser();
        private static final DateTimeFormatter lte = literalTElement();
        private static final DateTimeFormatter ltp = localTimeParser();
        private static final DateTimeFormatter mhe = minuteElement();
        private static final DateTimeFormatter mye = monthElement();
        private static final DateTimeFormatter od = ordinalDate();
        private static final DateTimeFormatter odt = ordinalDateTime();
        private static final DateTimeFormatter odtx = ordinalDateTimeNoMillis();
        private static final DateTimeFormatter sme = secondElement();
        private static final DateTimeFormatter t = time();
        private static final DateTimeFormatter tp = timeParser();
        private static final DateTimeFormatter tpe = timeElementParser();
        private static final DateTimeFormatter tt = tTime();
        private static final DateTimeFormatter ttx = tTimeNoMillis();
        private static final DateTimeFormatter tx = timeNoMillis();
        private static final DateTimeFormatter wdt = weekDateTime();
        private static final DateTimeFormatter wdtx = weekDateTimeNoMillis();
        private static final DateTimeFormatter we = weekyearElement();
        private static final DateTimeFormatter ww = weekyearWeek();
        private static final DateTimeFormatter wwd = weekyearWeekDay();
        private static final DateTimeFormatter wwe = weekElement();
        private static final DateTimeFormatter ye = yearElement();
        private static final DateTimeFormatter ym = yearMonth();
        private static final DateTimeFormatter ymd = yearMonthDay();
        private static final DateTimeFormatter ze = offsetElement();

        private static DateTimeFormatter basicDate()
        {
            if (bd == null)
            {
                return (new DateTimeFormatterBuilder()).appendYear(4, 4).appendFixedDecimal(DateTimeFieldType.monthOfYear(), 2).appendFixedDecimal(DateTimeFieldType.dayOfMonth(), 2).toFormatter();
            } else
            {
                return bd;
            }
        }

        private static DateTimeFormatter basicDateTime()
        {
            if (bdt == null)
            {
                return (new DateTimeFormatterBuilder()).append(basicDate()).append(basicTTime()).toFormatter();
            } else
            {
                return bdt;
            }
        }

        private static DateTimeFormatter basicDateTimeNoMillis()
        {
            if (bdtx == null)
            {
                return (new DateTimeFormatterBuilder()).append(basicDate()).append(basicTTimeNoMillis()).toFormatter();
            } else
            {
                return bdtx;
            }
        }

        private static DateTimeFormatter basicOrdinalDate()
        {
            if (bod == null)
            {
                return (new DateTimeFormatterBuilder()).appendYear(4, 4).appendFixedDecimal(DateTimeFieldType.dayOfYear(), 3).toFormatter();
            } else
            {
                return bod;
            }
        }

        private static DateTimeFormatter basicOrdinalDateTime()
        {
            if (bodt == null)
            {
                return (new DateTimeFormatterBuilder()).append(basicOrdinalDate()).append(basicTTime()).toFormatter();
            } else
            {
                return bodt;
            }
        }

        private static DateTimeFormatter basicOrdinalDateTimeNoMillis()
        {
            if (bodtx == null)
            {
                return (new DateTimeFormatterBuilder()).append(basicOrdinalDate()).append(basicTTimeNoMillis()).toFormatter();
            } else
            {
                return bodtx;
            }
        }

        private static DateTimeFormatter basicTTime()
        {
            if (btt == null)
            {
                return (new DateTimeFormatterBuilder()).append(literalTElement()).append(basicTime()).toFormatter();
            } else
            {
                return btt;
            }
        }

        private static DateTimeFormatter basicTTimeNoMillis()
        {
            if (bttx == null)
            {
                return (new DateTimeFormatterBuilder()).append(literalTElement()).append(basicTimeNoMillis()).toFormatter();
            } else
            {
                return bttx;
            }
        }

        private static DateTimeFormatter basicTime()
        {
            if (bt == null)
            {
                return (new DateTimeFormatterBuilder()).appendFixedDecimal(DateTimeFieldType.hourOfDay(), 2).appendFixedDecimal(DateTimeFieldType.minuteOfHour(), 2).appendFixedDecimal(DateTimeFieldType.secondOfMinute(), 2).appendLiteral('.').appendFractionOfSecond(3, 9).appendTimeZoneOffset("Z", false, 2, 2).toFormatter();
            } else
            {
                return bt;
            }
        }

        private static DateTimeFormatter basicTimeNoMillis()
        {
            if (btx == null)
            {
                return (new DateTimeFormatterBuilder()).appendFixedDecimal(DateTimeFieldType.hourOfDay(), 2).appendFixedDecimal(DateTimeFieldType.minuteOfHour(), 2).appendFixedDecimal(DateTimeFieldType.secondOfMinute(), 2).appendTimeZoneOffset("Z", false, 2, 2).toFormatter();
            } else
            {
                return btx;
            }
        }

        private static DateTimeFormatter basicWeekDate()
        {
            if (bwd == null)
            {
                return (new DateTimeFormatterBuilder()).appendWeekyear(4, 4).appendLiteral('W').appendFixedDecimal(DateTimeFieldType.weekOfWeekyear(), 2).appendFixedDecimal(DateTimeFieldType.dayOfWeek(), 1).toFormatter();
            } else
            {
                return bwd;
            }
        }

        private static DateTimeFormatter basicWeekDateTime()
        {
            if (bwdt == null)
            {
                return (new DateTimeFormatterBuilder()).append(basicWeekDate()).append(basicTTime()).toFormatter();
            } else
            {
                return bwdt;
            }
        }

        private static DateTimeFormatter basicWeekDateTimeNoMillis()
        {
            if (bwdtx == null)
            {
                return (new DateTimeFormatterBuilder()).append(basicWeekDate()).append(basicTTimeNoMillis()).toFormatter();
            } else
            {
                return bwdtx;
            }
        }

        private static DateTimeFormatter dateElementParser()
        {
            if (dpe == null)
            {
                return (new DateTimeFormatterBuilder()).append(null, new DateTimeParser[] {
                    (new DateTimeFormatterBuilder()).append(yearElement()).appendOptional((new DateTimeFormatterBuilder()).append(monthElement()).appendOptional(dayOfMonthElement().getParser()).toParser()).toParser(), (new DateTimeFormatterBuilder()).append(weekyearElement()).append(weekElement()).appendOptional(dayOfWeekElement().getParser()).toParser(), (new DateTimeFormatterBuilder()).append(yearElement()).append(dayOfYearElement()).toParser()
                }).toFormatter();
            } else
            {
                return dpe;
            }
        }

        private static DateTimeFormatter dateHour()
        {
            if (dh == null)
            {
                return (new DateTimeFormatterBuilder()).append(ISODateTimeFormat.date()).append(literalTElement()).append(ISODateTimeFormat.hour()).toFormatter();
            } else
            {
                return dh;
            }
        }

        private static DateTimeFormatter dateHourMinute()
        {
            if (dhm == null)
            {
                return (new DateTimeFormatterBuilder()).append(ISODateTimeFormat.date()).append(literalTElement()).append(hourMinute()).toFormatter();
            } else
            {
                return dhm;
            }
        }

        private static DateTimeFormatter dateHourMinuteSecond()
        {
            if (dhms == null)
            {
                return (new DateTimeFormatterBuilder()).append(ISODateTimeFormat.date()).append(literalTElement()).append(hourMinuteSecond()).toFormatter();
            } else
            {
                return dhms;
            }
        }

        private static DateTimeFormatter dateHourMinuteSecondFraction()
        {
            if (dhmsf == null)
            {
                return (new DateTimeFormatterBuilder()).append(ISODateTimeFormat.date()).append(literalTElement()).append(hourMinuteSecondFraction()).toFormatter();
            } else
            {
                return dhmsf;
            }
        }

        private static DateTimeFormatter dateHourMinuteSecondMillis()
        {
            if (dhmsl == null)
            {
                return (new DateTimeFormatterBuilder()).append(ISODateTimeFormat.date()).append(literalTElement()).append(hourMinuteSecondMillis()).toFormatter();
            } else
            {
                return dhmsl;
            }
        }

        private static DateTimeFormatter dateOptionalTimeParser()
        {
            if (dotp == null)
            {
                DateTimeParser datetimeparser = (new DateTimeFormatterBuilder()).appendLiteral('T').appendOptional(timeElementParser().getParser()).appendOptional(offsetElement().getParser()).toParser();
                return (new DateTimeFormatterBuilder()).append(dateElementParser()).appendOptional(datetimeparser).toFormatter();
            } else
            {
                return dotp;
            }
        }

        private static DateTimeFormatter dateParser()
        {
            if (dp == null)
            {
                DateTimeParser datetimeparser = (new DateTimeFormatterBuilder()).appendLiteral('T').append(offsetElement()).toParser();
                return (new DateTimeFormatterBuilder()).append(dateElementParser()).appendOptional(datetimeparser).toFormatter();
            } else
            {
                return dp;
            }
        }

        private static DateTimeFormatter dateTime()
        {
            if (dt == null)
            {
                return (new DateTimeFormatterBuilder()).append(ISODateTimeFormat.date()).append(tTime()).toFormatter();
            } else
            {
                return dt;
            }
        }

        private static DateTimeFormatter dateTimeNoMillis()
        {
            if (dtx == null)
            {
                return (new DateTimeFormatterBuilder()).append(ISODateTimeFormat.date()).append(tTimeNoMillis()).toFormatter();
            } else
            {
                return dtx;
            }
        }

        private static DateTimeFormatter dateTimeParser()
        {
            if (dtp == null)
            {
                DateTimeParser datetimeparser = (new DateTimeFormatterBuilder()).appendLiteral('T').append(timeElementParser()).appendOptional(offsetElement().getParser()).toParser();
                return (new DateTimeFormatterBuilder()).append(null, new DateTimeParser[] {
                    datetimeparser, dateOptionalTimeParser().getParser()
                }).toFormatter();
            } else
            {
                return dtp;
            }
        }

        private static DateTimeFormatter dayOfMonthElement()
        {
            if (dme == null)
            {
                return (new DateTimeFormatterBuilder()).appendLiteral('-').appendDayOfMonth(2).toFormatter();
            } else
            {
                return dme;
            }
        }

        private static DateTimeFormatter dayOfWeekElement()
        {
            if (dwe == null)
            {
                return (new DateTimeFormatterBuilder()).appendLiteral('-').appendDayOfWeek(1).toFormatter();
            } else
            {
                return dwe;
            }
        }

        private static DateTimeFormatter dayOfYearElement()
        {
            if (dye == null)
            {
                return (new DateTimeFormatterBuilder()).appendLiteral('-').appendDayOfYear(3).toFormatter();
            } else
            {
                return dye;
            }
        }

        private static DateTimeFormatter fractionElement()
        {
            if (fse == null)
            {
                return (new DateTimeFormatterBuilder()).appendLiteral('.').appendFractionOfSecond(3, 9).toFormatter();
            } else
            {
                return fse;
            }
        }

        private static DateTimeFormatter hourElement()
        {
            if (hde == null)
            {
                return (new DateTimeFormatterBuilder()).appendHourOfDay(2).toFormatter();
            } else
            {
                return hde;
            }
        }

        private static DateTimeFormatter hourMinute()
        {
            if (hm == null)
            {
                return (new DateTimeFormatterBuilder()).append(hourElement()).append(minuteElement()).toFormatter();
            } else
            {
                return hm;
            }
        }

        private static DateTimeFormatter hourMinuteSecond()
        {
            if (hms == null)
            {
                return (new DateTimeFormatterBuilder()).append(hourElement()).append(minuteElement()).append(secondElement()).toFormatter();
            } else
            {
                return hms;
            }
        }

        private static DateTimeFormatter hourMinuteSecondFraction()
        {
            if (hmsf == null)
            {
                return (new DateTimeFormatterBuilder()).append(hourElement()).append(minuteElement()).append(secondElement()).append(fractionElement()).toFormatter();
            } else
            {
                return hmsf;
            }
        }

        private static DateTimeFormatter hourMinuteSecondMillis()
        {
            if (hmsl == null)
            {
                return (new DateTimeFormatterBuilder()).append(hourElement()).append(minuteElement()).append(secondElement()).appendLiteral('.').appendFractionOfSecond(3, 3).toFormatter();
            } else
            {
                return hmsl;
            }
        }

        private static DateTimeFormatter literalTElement()
        {
            if (lte == null)
            {
                return (new DateTimeFormatterBuilder()).appendLiteral('T').toFormatter();
            } else
            {
                return lte;
            }
        }

        private static DateTimeFormatter localDateOptionalTimeParser()
        {
            if (ldotp == null)
            {
                DateTimeParser datetimeparser = (new DateTimeFormatterBuilder()).appendLiteral('T').append(timeElementParser()).toParser();
                return (new DateTimeFormatterBuilder()).append(dateElementParser()).appendOptional(datetimeparser).toFormatter().withZoneUTC();
            } else
            {
                return ldotp;
            }
        }

        private static DateTimeFormatter localDateParser()
        {
            if (ldp == null)
            {
                return dateElementParser().withZoneUTC();
            } else
            {
                return ldp;
            }
        }

        private static DateTimeFormatter localTimeParser()
        {
            if (ltp == null)
            {
                return (new DateTimeFormatterBuilder()).appendOptional(literalTElement().getParser()).append(timeElementParser()).toFormatter().withZoneUTC();
            } else
            {
                return ltp;
            }
        }

        private static DateTimeFormatter minuteElement()
        {
            if (mhe == null)
            {
                return (new DateTimeFormatterBuilder()).appendLiteral(':').appendMinuteOfHour(2).toFormatter();
            } else
            {
                return mhe;
            }
        }

        private static DateTimeFormatter monthElement()
        {
            if (mye == null)
            {
                return (new DateTimeFormatterBuilder()).appendLiteral('-').appendMonthOfYear(2).toFormatter();
            } else
            {
                return mye;
            }
        }

        private static DateTimeFormatter offsetElement()
        {
            if (ze == null)
            {
                return (new DateTimeFormatterBuilder()).appendTimeZoneOffset("Z", true, 2, 4).toFormatter();
            } else
            {
                return ze;
            }
        }

        private static DateTimeFormatter ordinalDate()
        {
            if (od == null)
            {
                return (new DateTimeFormatterBuilder()).append(yearElement()).append(dayOfYearElement()).toFormatter();
            } else
            {
                return od;
            }
        }

        private static DateTimeFormatter ordinalDateTime()
        {
            if (odt == null)
            {
                return (new DateTimeFormatterBuilder()).append(ordinalDate()).append(tTime()).toFormatter();
            } else
            {
                return odt;
            }
        }

        private static DateTimeFormatter ordinalDateTimeNoMillis()
        {
            if (odtx == null)
            {
                return (new DateTimeFormatterBuilder()).append(ordinalDate()).append(tTimeNoMillis()).toFormatter();
            } else
            {
                return odtx;
            }
        }

        private static DateTimeFormatter secondElement()
        {
            if (sme == null)
            {
                return (new DateTimeFormatterBuilder()).appendLiteral(':').appendSecondOfMinute(2).toFormatter();
            } else
            {
                return sme;
            }
        }

        private static DateTimeFormatter tTime()
        {
            if (tt == null)
            {
                return (new DateTimeFormatterBuilder()).append(literalTElement()).append(time()).toFormatter();
            } else
            {
                return tt;
            }
        }

        private static DateTimeFormatter tTimeNoMillis()
        {
            if (ttx == null)
            {
                return (new DateTimeFormatterBuilder()).append(literalTElement()).append(timeNoMillis()).toFormatter();
            } else
            {
                return ttx;
            }
        }

        private static DateTimeFormatter time()
        {
            if (t == null)
            {
                return (new DateTimeFormatterBuilder()).append(hourMinuteSecondFraction()).append(offsetElement()).toFormatter();
            } else
            {
                return t;
            }
        }

        private static DateTimeFormatter timeElementParser()
        {
            if (tpe == null)
            {
                DateTimeParser datetimeparser = (new DateTimeFormatterBuilder()).append(null, new DateTimeParser[] {
                    (new DateTimeFormatterBuilder()).appendLiteral('.').toParser(), (new DateTimeFormatterBuilder()).appendLiteral(',').toParser()
                }).toParser();
                return (new DateTimeFormatterBuilder()).append(hourElement()).append(null, new DateTimeParser[] {
                    (new DateTimeFormatterBuilder()).append(minuteElement()).append(null, new DateTimeParser[] {
                        (new DateTimeFormatterBuilder()).append(secondElement()).appendOptional((new DateTimeFormatterBuilder()).append(datetimeparser).appendFractionOfSecond(1, 9).toParser()).toParser(), (new DateTimeFormatterBuilder()).append(datetimeparser).appendFractionOfMinute(1, 9).toParser(), null
                    }).toParser(), (new DateTimeFormatterBuilder()).append(datetimeparser).appendFractionOfHour(1, 9).toParser(), null
                }).toFormatter();
            } else
            {
                return tpe;
            }
        }

        private static DateTimeFormatter timeNoMillis()
        {
            if (tx == null)
            {
                return (new DateTimeFormatterBuilder()).append(hourMinuteSecond()).append(offsetElement()).toFormatter();
            } else
            {
                return tx;
            }
        }

        private static DateTimeFormatter timeParser()
        {
            if (tp == null)
            {
                return (new DateTimeFormatterBuilder()).appendOptional(literalTElement().getParser()).append(timeElementParser()).appendOptional(offsetElement().getParser()).toFormatter();
            } else
            {
                return tp;
            }
        }

        private static DateTimeFormatter weekDateTime()
        {
            if (wdt == null)
            {
                return (new DateTimeFormatterBuilder()).append(ISODateTimeFormat.weekDate()).append(tTime()).toFormatter();
            } else
            {
                return wdt;
            }
        }

        private static DateTimeFormatter weekDateTimeNoMillis()
        {
            if (wdtx == null)
            {
                return (new DateTimeFormatterBuilder()).append(ISODateTimeFormat.weekDate()).append(tTimeNoMillis()).toFormatter();
            } else
            {
                return wdtx;
            }
        }

        private static DateTimeFormatter weekElement()
        {
            if (wwe == null)
            {
                return (new DateTimeFormatterBuilder()).appendLiteral("-W").appendWeekOfWeekyear(2).toFormatter();
            } else
            {
                return wwe;
            }
        }

        private static DateTimeFormatter weekyearElement()
        {
            if (we == null)
            {
                return (new DateTimeFormatterBuilder()).appendWeekyear(4, 9).toFormatter();
            } else
            {
                return we;
            }
        }

        private static DateTimeFormatter weekyearWeek()
        {
            if (ww == null)
            {
                return (new DateTimeFormatterBuilder()).append(weekyearElement()).append(weekElement()).toFormatter();
            } else
            {
                return ww;
            }
        }

        private static DateTimeFormatter weekyearWeekDay()
        {
            if (wwd == null)
            {
                return (new DateTimeFormatterBuilder()).append(weekyearElement()).append(weekElement()).append(dayOfWeekElement()).toFormatter();
            } else
            {
                return wwd;
            }
        }

        private static DateTimeFormatter yearElement()
        {
            if (ye == null)
            {
                return (new DateTimeFormatterBuilder()).appendYear(4, 9).toFormatter();
            } else
            {
                return ye;
            }
        }

        private static DateTimeFormatter yearMonth()
        {
            if (ym == null)
            {
                return (new DateTimeFormatterBuilder()).append(yearElement()).append(monthElement()).toFormatter();
            } else
            {
                return ym;
            }
        }

        private static DateTimeFormatter yearMonthDay()
        {
            if (ymd == null)
            {
                return (new DateTimeFormatterBuilder()).append(yearElement()).append(monthElement()).append(dayOfMonthElement()).toFormatter();
            } else
            {
                return ymd;
            }
        }



















































        Constants()
        {
        }
    }


    protected ISODateTimeFormat()
    {
    }

    private static void appendSeparator(DateTimeFormatterBuilder datetimeformatterbuilder, boolean flag)
    {
        if (flag)
        {
            datetimeformatterbuilder.appendLiteral('-');
        }
    }

    public static DateTimeFormatter basicDate()
    {
        return Constants.bd;
    }

    public static DateTimeFormatter basicDateTime()
    {
        return Constants.bdt;
    }

    public static DateTimeFormatter basicDateTimeNoMillis()
    {
        return Constants.bdtx;
    }

    public static DateTimeFormatter basicOrdinalDate()
    {
        return Constants.bod;
    }

    public static DateTimeFormatter basicOrdinalDateTime()
    {
        return Constants.bodt;
    }

    public static DateTimeFormatter basicOrdinalDateTimeNoMillis()
    {
        return Constants.bodtx;
    }

    public static DateTimeFormatter basicTTime()
    {
        return Constants.btt;
    }

    public static DateTimeFormatter basicTTimeNoMillis()
    {
        return Constants.bttx;
    }

    public static DateTimeFormatter basicTime()
    {
        return Constants.bt;
    }

    public static DateTimeFormatter basicTimeNoMillis()
    {
        return Constants.btx;
    }

    public static DateTimeFormatter basicWeekDate()
    {
        return Constants.bwd;
    }

    public static DateTimeFormatter basicWeekDateTime()
    {
        return Constants.bwdt;
    }

    public static DateTimeFormatter basicWeekDateTimeNoMillis()
    {
        return Constants.bwdtx;
    }

    private static void checkNotStrictISO(Collection collection, boolean flag)
    {
        if (flag)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("No valid ISO8601 format for fields: ").append(collection).toString());
        } else
        {
            return;
        }
    }

    public static DateTimeFormatter date()
    {
        return yearMonthDay();
    }

    private static boolean dateByMonth(DateTimeFormatterBuilder datetimeformatterbuilder, Collection collection, boolean flag, boolean flag1)
    {
        if (!collection.remove(DateTimeFieldType.year())) goto _L2; else goto _L1
_L1:
        datetimeformatterbuilder.append(Constants.ye);
        if (!collection.remove(DateTimeFieldType.monthOfYear())) goto _L4; else goto _L3
_L3:
        if (!collection.remove(DateTimeFieldType.dayOfMonth())) goto _L6; else goto _L5
_L5:
        appendSeparator(datetimeformatterbuilder, flag);
        datetimeformatterbuilder.appendMonthOfYear(2);
        appendSeparator(datetimeformatterbuilder, flag);
        datetimeformatterbuilder.appendDayOfMonth(2);
_L8:
        return false;
_L6:
        datetimeformatterbuilder.appendLiteral('-');
        datetimeformatterbuilder.appendMonthOfYear(2);
        return true;
_L4:
        if (collection.remove(DateTimeFieldType.dayOfMonth()))
        {
            checkNotStrictISO(collection, flag1);
            datetimeformatterbuilder.appendLiteral('-');
            datetimeformatterbuilder.appendLiteral('-');
            datetimeformatterbuilder.appendDayOfMonth(2);
            return false;
        } else
        {
            return true;
        }
_L2:
        if (collection.remove(DateTimeFieldType.monthOfYear()))
        {
            datetimeformatterbuilder.appendLiteral('-');
            datetimeformatterbuilder.appendLiteral('-');
            datetimeformatterbuilder.appendMonthOfYear(2);
            if (collection.remove(DateTimeFieldType.dayOfMonth()))
            {
                appendSeparator(datetimeformatterbuilder, flag);
                datetimeformatterbuilder.appendDayOfMonth(2);
                return false;
            } else
            {
                return true;
            }
        }
        if (collection.remove(DateTimeFieldType.dayOfMonth()))
        {
            datetimeformatterbuilder.appendLiteral('-');
            datetimeformatterbuilder.appendLiteral('-');
            datetimeformatterbuilder.appendLiteral('-');
            datetimeformatterbuilder.appendDayOfMonth(2);
            return false;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static boolean dateByOrdinal(DateTimeFormatterBuilder datetimeformatterbuilder, Collection collection, boolean flag, boolean flag1)
    {
        if (!collection.remove(DateTimeFieldType.year())) goto _L2; else goto _L1
_L1:
        datetimeformatterbuilder.append(Constants.ye);
        if (!collection.remove(DateTimeFieldType.dayOfYear())) goto _L4; else goto _L3
_L3:
        appendSeparator(datetimeformatterbuilder, flag);
        datetimeformatterbuilder.appendDayOfYear(3);
_L6:
        return false;
_L4:
        return true;
_L2:
        if (collection.remove(DateTimeFieldType.dayOfYear()))
        {
            datetimeformatterbuilder.appendLiteral('-');
            datetimeformatterbuilder.appendDayOfYear(3);
            return false;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static boolean dateByWeek(DateTimeFormatterBuilder datetimeformatterbuilder, Collection collection, boolean flag, boolean flag1)
    {
        if (!collection.remove(DateTimeFieldType.weekyear())) goto _L2; else goto _L1
_L1:
        datetimeformatterbuilder.append(Constants.we);
        if (!collection.remove(DateTimeFieldType.weekOfWeekyear())) goto _L4; else goto _L3
_L3:
        appendSeparator(datetimeformatterbuilder, flag);
        datetimeformatterbuilder.appendLiteral('W');
        datetimeformatterbuilder.appendWeekOfWeekyear(2);
        if (!collection.remove(DateTimeFieldType.dayOfWeek())) goto _L6; else goto _L5
_L5:
        appendSeparator(datetimeformatterbuilder, flag);
        datetimeformatterbuilder.appendDayOfWeek(1);
_L8:
        return false;
_L6:
        return true;
_L4:
        if (collection.remove(DateTimeFieldType.dayOfWeek()))
        {
            checkNotStrictISO(collection, flag1);
            appendSeparator(datetimeformatterbuilder, flag);
            datetimeformatterbuilder.appendLiteral('W');
            datetimeformatterbuilder.appendLiteral('-');
            datetimeformatterbuilder.appendDayOfWeek(1);
            return false;
        } else
        {
            return true;
        }
_L2:
        if (collection.remove(DateTimeFieldType.weekOfWeekyear()))
        {
            datetimeformatterbuilder.appendLiteral('-');
            datetimeformatterbuilder.appendLiteral('W');
            datetimeformatterbuilder.appendWeekOfWeekyear(2);
            if (collection.remove(DateTimeFieldType.dayOfWeek()))
            {
                appendSeparator(datetimeformatterbuilder, flag);
                datetimeformatterbuilder.appendDayOfWeek(1);
                return false;
            } else
            {
                return true;
            }
        }
        if (collection.remove(DateTimeFieldType.dayOfWeek()))
        {
            datetimeformatterbuilder.appendLiteral('-');
            datetimeformatterbuilder.appendLiteral('W');
            datetimeformatterbuilder.appendLiteral('-');
            datetimeformatterbuilder.appendDayOfWeek(1);
            return false;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static DateTimeFormatter dateElementParser()
    {
        return Constants.dpe;
    }

    public static DateTimeFormatter dateHour()
    {
        return Constants.dh;
    }

    public static DateTimeFormatter dateHourMinute()
    {
        return Constants.dhm;
    }

    public static DateTimeFormatter dateHourMinuteSecond()
    {
        return Constants.dhms;
    }

    public static DateTimeFormatter dateHourMinuteSecondFraction()
    {
        return Constants.dhmsf;
    }

    public static DateTimeFormatter dateHourMinuteSecondMillis()
    {
        return Constants.dhmsl;
    }

    public static DateTimeFormatter dateOptionalTimeParser()
    {
        return Constants.dotp;
    }

    public static DateTimeFormatter dateParser()
    {
        return Constants.dp;
    }

    public static DateTimeFormatter dateTime()
    {
        return Constants.dt;
    }

    public static DateTimeFormatter dateTimeNoMillis()
    {
        return Constants.dtx;
    }

    public static DateTimeFormatter dateTimeParser()
    {
        return Constants.dtp;
    }

    public static DateTimeFormatter forFields(Collection collection, boolean flag, boolean flag1)
    {
        if (collection == null || collection.size() == 0)
        {
            throw new IllegalArgumentException("The fields must not be null or empty");
        }
        HashSet hashset = new HashSet(collection);
        int i = hashset.size();
        DateTimeFormatterBuilder datetimeformatterbuilder = new DateTimeFormatterBuilder();
        boolean flag2;
        boolean flag3;
        if (hashset.contains(DateTimeFieldType.monthOfYear()))
        {
            flag2 = dateByMonth(datetimeformatterbuilder, hashset, flag, flag1);
        } else
        if (hashset.contains(DateTimeFieldType.dayOfYear()))
        {
            flag2 = dateByOrdinal(datetimeformatterbuilder, hashset, flag, flag1);
        } else
        if (hashset.contains(DateTimeFieldType.weekOfWeekyear()))
        {
            flag2 = dateByWeek(datetimeformatterbuilder, hashset, flag, flag1);
        } else
        if (hashset.contains(DateTimeFieldType.dayOfMonth()))
        {
            flag2 = dateByMonth(datetimeformatterbuilder, hashset, flag, flag1);
        } else
        if (hashset.contains(DateTimeFieldType.dayOfWeek()))
        {
            flag2 = dateByWeek(datetimeformatterbuilder, hashset, flag, flag1);
        } else
        if (hashset.remove(DateTimeFieldType.year()))
        {
            datetimeformatterbuilder.append(Constants.ye);
            flag2 = true;
        } else
        if (hashset.remove(DateTimeFieldType.weekyear()))
        {
            datetimeformatterbuilder.append(Constants.we);
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (hashset.size() < i)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        time(datetimeformatterbuilder, hashset, flag, flag1, flag2, flag3);
        if (!datetimeformatterbuilder.canBuildFormatter())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("No valid format for fields: ").append(collection).toString());
        }
        try
        {
            collection.retainAll(hashset);
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection) { }
        return datetimeformatterbuilder.toFormatter();
    }

    public static DateTimeFormatter hour()
    {
        return Constants.hde;
    }

    public static DateTimeFormatter hourMinute()
    {
        return Constants.hm;
    }

    public static DateTimeFormatter hourMinuteSecond()
    {
        return Constants.hms;
    }

    public static DateTimeFormatter hourMinuteSecondFraction()
    {
        return Constants.hmsf;
    }

    public static DateTimeFormatter hourMinuteSecondMillis()
    {
        return Constants.hmsl;
    }

    public static DateTimeFormatter localDateOptionalTimeParser()
    {
        return Constants.ldotp;
    }

    public static DateTimeFormatter localDateParser()
    {
        return Constants.ldp;
    }

    public static DateTimeFormatter localTimeParser()
    {
        return Constants.ltp;
    }

    public static DateTimeFormatter ordinalDate()
    {
        return Constants.od;
    }

    public static DateTimeFormatter ordinalDateTime()
    {
        return Constants.odt;
    }

    public static DateTimeFormatter ordinalDateTimeNoMillis()
    {
        return Constants.odtx;
    }

    public static DateTimeFormatter tTime()
    {
        return Constants.tt;
    }

    public static DateTimeFormatter tTimeNoMillis()
    {
        return Constants.ttx;
    }

    public static DateTimeFormatter time()
    {
        return Constants.t;
    }

    private static void time(DateTimeFormatterBuilder datetimeformatterbuilder, Collection collection, boolean flag, boolean flag1, boolean flag2, boolean flag3)
    {
        boolean flag4;
        boolean flag5;
        boolean flag6;
        boolean flag7;
        flag4 = collection.remove(DateTimeFieldType.hourOfDay());
        flag5 = collection.remove(DateTimeFieldType.minuteOfHour());
        flag6 = collection.remove(DateTimeFieldType.secondOfMinute());
        flag7 = collection.remove(DateTimeFieldType.millisOfSecond());
        if (flag4 || flag5 || flag6 || flag7) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (flag4 || flag5 || flag6 || flag7)
        {
            if (flag1 && flag2)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("No valid ISO8601 format for fields because Date was reduced precision: ").append(collection).toString());
            }
            if (flag3)
            {
                datetimeformatterbuilder.appendLiteral('T');
            }
        }
        if ((!flag4 || !flag5 || !flag6) && (!flag4 || flag6 || flag7)) goto _L4; else goto _L3
_L3:
        if (flag4)
        {
            datetimeformatterbuilder.appendHourOfDay(2);
        } else
        if (flag5 || flag6 || flag7)
        {
            datetimeformatterbuilder.appendLiteral('-');
        }
        if (flag && flag4 && flag5)
        {
            datetimeformatterbuilder.appendLiteral(':');
        }
        if (flag5)
        {
            datetimeformatterbuilder.appendMinuteOfHour(2);
        } else
        if (flag6 || flag7)
        {
            datetimeformatterbuilder.appendLiteral('-');
        }
        if (flag && flag5 && flag6)
        {
            datetimeformatterbuilder.appendLiteral(':');
        }
        if (flag6)
        {
            datetimeformatterbuilder.appendSecondOfMinute(2);
        } else
        if (flag7)
        {
            datetimeformatterbuilder.appendLiteral('-');
        }
        if (flag7)
        {
            datetimeformatterbuilder.appendLiteral('.');
            datetimeformatterbuilder.appendMillisOfSecond(3);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (flag1 && flag3)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("No valid ISO8601 format for fields because Time was truncated: ").append(collection).toString());
        }
        if ((flag4 || (!flag5 || !flag6) && (!flag5 || flag7) && !flag6) && flag1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("No valid ISO8601 format for fields: ").append(collection).toString());
        }
          goto _L3
    }

    public static DateTimeFormatter timeElementParser()
    {
        return Constants.tpe;
    }

    public static DateTimeFormatter timeNoMillis()
    {
        return Constants.tx;
    }

    public static DateTimeFormatter timeParser()
    {
        return Constants.tp;
    }

    public static DateTimeFormatter weekDate()
    {
        return Constants.wwd;
    }

    public static DateTimeFormatter weekDateTime()
    {
        return Constants.wdt;
    }

    public static DateTimeFormatter weekDateTimeNoMillis()
    {
        return Constants.wdtx;
    }

    public static DateTimeFormatter weekyear()
    {
        return Constants.we;
    }

    public static DateTimeFormatter weekyearWeek()
    {
        return Constants.ww;
    }

    public static DateTimeFormatter weekyearWeekDay()
    {
        return Constants.wwd;
    }

    public static DateTimeFormatter year()
    {
        return Constants.ye;
    }

    public static DateTimeFormatter yearMonth()
    {
        return Constants.ym;
    }

    public static DateTimeFormatter yearMonthDay()
    {
        return Constants.ymd;
    }
}
