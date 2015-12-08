// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import org.joda.time.DateTimeFieldType;

// Referenced classes of package org.joda.time.format:
//            ISODateTimeFormat, DateTimeFormatterBuilder, DateTimeParser, DateTimeFormatter

static final class 
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



















































    ()
    {
    }
}
