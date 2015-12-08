// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.joda.time.DurationFieldType;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;

// Referenced classes of package org.joda.time.format:
//            PeriodParser, PeriodPrinter, PeriodFormatterBuilder, FormatUtils

static class x
    implements PeriodParser, PeriodPrinter
{

    private final x.printTo iFieldFormatters[];
    private final int iFieldType;
    private final int iMaxParsedDigits;
    private final int iMinPrintedDigits;
    private final x iPrefix;
    private final int iPrintZeroSetting;
    private final boolean iRejectSignedValues;
    private final x iSuffix;

    private int parseInt(String s, int i, int j)
    {
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag1 = false;
        if (j < 10) goto _L2; else goto _L1
_L1:
        int k = Integer.parseInt(s.substring(i, i + j));
_L4:
        return k;
_L2:
        k = ((flag1) ? 1 : 0);
        if (j <= 0) goto _L4; else goto _L3
_L3:
        int l;
        int i1;
        l = i + 1;
        i = s.charAt(i);
        i1 = j - 1;
        if (i != 45) goto _L6; else goto _L5
_L5:
        i = i1 - 1;
        k = ((flag1) ? 1 : 0);
        if (i < 0) goto _L4; else goto _L7
_L7:
        boolean flag;
        flag = true;
        j = l + 1;
        l = s.charAt(l);
_L9:
        l -= 48;
        for (; i > 0; i--)
        {
            l = ((l << 1) + (l << 3) + s.charAt(j)) - 48;
            j++;
        }

        break; /* Loop/switch isn't completed */
_L6:
        j = l;
        flag = flag2;
        l = i;
        i = i1;
        if (true) goto _L9; else goto _L8
_L8:
        if (flag)
        {
            return -l;
        } else
        {
            return l;
        }
    }

    public int calculatePrintedLength(ReadablePeriod readableperiod, Locale locale)
    {
        long l1 = getFieldValue(readableperiod);
        int i;
        if (l1 == 0x7fffffffffffffffL)
        {
            i = 0;
        } else
        {
            int j = Math.max(FormatUtils.calculateDigitCount(l1), iMinPrintedDigits);
            i = j;
            long l = l1;
            if (iFieldType >= 8)
            {
                int k;
                if (l1 < 0L)
                {
                    i = Math.max(j, 5);
                } else
                {
                    i = Math.max(j, 4);
                }
                j = i + 1;
                i = j;
                if (iFieldType == 9)
                {
                    i = j;
                    if (Math.abs(l1) % 1000L == 0L)
                    {
                        i = j - 4;
                    }
                }
                l = l1 / 1000L;
            }
            k = (int)l;
            j = i;
            if (iPrefix != null)
            {
                j = i + iPrefix.calculatePrintedLength(k);
            }
            i = j;
            if (iSuffix != null)
            {
                return j + iSuffix.calculatePrintedLength(k);
            }
        }
        return i;
    }

    public int countFieldsToPrint(ReadablePeriod readableperiod, int i, Locale locale)
    {
        while (i <= 0 || iPrintZeroSetting != 4 && getFieldValue(readableperiod) == 0x7fffffffffffffffL) 
        {
            return 0;
        }
        return 1;
    }

    public void finish(getFieldValue agetfieldvalue[])
    {
        HashSet hashset = new HashSet();
        HashSet hashset1 = new HashSet();
        int j = agetfieldvalue.length;
        for (int i = 0; i < j; i++)
        {
            getFieldValue getfieldvalue = agetfieldvalue[i];
            if (getfieldvalue != null && !equals(getfieldvalue))
            {
                hashset.add(getfieldvalue.iPrefix);
                hashset1.add(getfieldvalue.iSuffix);
            }
        }

        if (iPrefix != null)
        {
            iPrefix.finish(hashset);
        }
        if (iSuffix != null)
        {
            iSuffix.finish(hashset1);
        }
    }

    int getFieldType()
    {
        return iFieldType;
    }

    long getFieldValue(ReadablePeriod readableperiod)
    {
        PeriodType periodtype;
        if (iPrintZeroSetting == 4)
        {
            periodtype = null;
        } else
        {
            periodtype = readableperiod.getPeriodType();
        }
        if (periodtype == null || isSupported(periodtype, iFieldType)) goto _L2; else goto _L1
_L1:
        return 0x7fffffffffffffffL;
_L2:
        iFieldType;
        JVM INSTR tableswitch 0 9: default 100
    //                   0 104
    //                   1 163
    //                   2 178
    //                   3 193
    //                   4 208
    //                   5 223
    //                   6 238
    //                   7 253
    //                   8 268
    //                   9 268;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L12
_L3:
        return 0x7fffffffffffffffL;
_L4:
        long l = readableperiod.get(DurationFieldType.years());
_L17:
        if (l != 0L) goto _L14; else goto _L13
_L13:
        iPrintZeroSetting;
        JVM INSTR tableswitch 1 5: default 160
    //                   1 367
    //                   2 308
    //                   3 160
    //                   4 160
    //                   5 26;
           goto _L14 _L15 _L16 _L14 _L14 _L1
_L15:
        continue; /* Loop/switch isn't completed */
_L14:
        return l;
_L5:
        l = readableperiod.get(DurationFieldType.months());
          goto _L17
_L6:
        l = readableperiod.get(DurationFieldType.weeks());
          goto _L17
_L7:
        l = readableperiod.get(DurationFieldType.days());
          goto _L17
_L8:
        l = readableperiod.get(DurationFieldType.hours());
          goto _L17
_L9:
        l = readableperiod.get(DurationFieldType.minutes());
          goto _L17
_L10:
        l = readableperiod.get(DurationFieldType.seconds());
          goto _L17
_L11:
        l = readableperiod.get(DurationFieldType.millis());
          goto _L17
_L12:
        int i = readableperiod.get(DurationFieldType.seconds());
        int k = readableperiod.get(DurationFieldType.millis());
        l = i;
        l = (long)k + l * 1000L;
          goto _L17
_L16:
        if (!isZero(readableperiod) || iFieldFormatters[iFieldType] != this) goto _L1; else goto _L18
_L18:
        int j = iFieldType + 1;
_L21:
        if (j > 9) goto _L14; else goto _L19
_L19:
        if (isSupported(periodtype, j) && iFieldFormatters[j] != null) goto _L1; else goto _L20
_L20:
        j++;
          goto _L21
        if (!isZero(readableperiod) || iFieldFormatters[iFieldType] != this) goto _L1; else goto _L22
_L22:
        j = Math.min(iFieldType, 8) - 1;
_L25:
        if (j < 0 || j > 9) goto _L14; else goto _L23
_L23:
        if (isSupported(periodtype, j) && iFieldFormatters[j] != null) goto _L1; else goto _L24
_L24:
        j--;
          goto _L25
    }

    boolean isSupported(PeriodType periodtype, int i)
    {
        i;
        JVM INSTR tableswitch 0 9: default 56
    //                   0 58
    //                   1 66
    //                   2 74
    //                   3 82
    //                   4 90
    //                   5 98
    //                   6 106
    //                   7 114
    //                   8 122
    //                   9 122;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L10
_L1:
        return false;
_L2:
        return periodtype.isSupported(DurationFieldType.years());
_L3:
        return periodtype.isSupported(DurationFieldType.months());
_L4:
        return periodtype.isSupported(DurationFieldType.weeks());
_L5:
        return periodtype.isSupported(DurationFieldType.days());
_L6:
        return periodtype.isSupported(DurationFieldType.hours());
_L7:
        return periodtype.isSupported(DurationFieldType.minutes());
_L8:
        return periodtype.isSupported(DurationFieldType.seconds());
_L9:
        return periodtype.isSupported(DurationFieldType.millis());
_L10:
        if (periodtype.isSupported(DurationFieldType.seconds()) || periodtype.isSupported(DurationFieldType.millis()))
        {
            return true;
        }
        if (true) goto _L1; else goto _L11
_L11:
    }

    boolean isZero(ReadablePeriod readableperiod)
    {
        int j = readableperiod.size();
        for (int i = 0; i < j; i++)
        {
            if (readableperiod.getValue(i) != 0)
            {
                return false;
            }
        }

        return true;
    }

    public int parseInto(ReadWritablePeriod readwritableperiod, String s, int i, Locale locale)
    {
        int k;
        int l;
        if (iPrintZeroSetting == 4)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (i < s.length()) goto _L2; else goto _L1
_L1:
        k = i;
        if (l != 0)
        {
            k = ~i;
        }
_L10:
        return k;
_L2:
        int j;
        k = l;
        j = i;
        if (iPrefix == null) goto _L4; else goto _L3
_L3:
        j = iPrefix.parse(s, i);
        if (j < 0) goto _L6; else goto _L5
_L5:
        k = 1;
_L4:
        int i1;
        if (iSuffix == null || k != 0)
        {
            break MISSING_BLOCK_LABEL_735;
        }
        i1 = iSuffix.scan(s, j);
        if (i1 < 0) goto _L8; else goto _L7
_L7:
        k = 1;
_L36:
        if (k != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        k = j;
        if (!isSupported(readwritableperiod.getPeriodType(), iFieldType)) goto _L10; else goto _L9
_L9:
        int j1;
        int k1;
        boolean flag;
        char c;
        if (i1 > 0)
        {
            i = Math.min(iMaxParsedDigits, i1 - j);
        } else
        {
            i = Math.min(iMaxParsedDigits, s.length() - j);
        }
        k1 = -1;
        flag = false;
        j1 = 0;
        k = i;
        l = 0;
        i = j1;
        j1 = j;
        j = l;
_L20:
        l = i;
        if (j >= k) goto _L12; else goto _L11
_L11:
        c = s.charAt(j1 + j);
        if (j != 0 || c != '-' && c != '+' || iRejectSignedValues) goto _L14; else goto _L13
_L13:
        if (c == '-')
        {
            i = 1;
        } else
        {
            i = 0;
        }
        l = i;
        if (j + 1 >= k) goto _L12; else goto _L15
_L15:
        c = s.charAt(j1 + j + 1);
        l = i;
        if (c < '0') goto _L12; else goto _L16
_L16:
        if (c <= '9') goto _L18; else goto _L17
_L17:
        k = i;
_L27:
        if (!flag)
        {
            return ~j1;
        }
        if (i1 >= 0 && j1 + j != i1)
        {
            return j1;
        }
          goto _L19
_L6:
        k = j;
        if (l == 0)
        {
            return ~j;
        }
          goto _L10
_L8:
        if (k == 0)
        {
            return ~i1;
        } else
        {
            return i1;
        }
_L18:
        if (i != 0)
        {
            j++;
        } else
        {
            j1++;
        }
        k = Math.min(k + 1, s.length() - j1);
          goto _L20
_L14:
        if (c < '0' || c > '9') goto _L22; else goto _L21
_L21:
        flag = true;
_L28:
        j++;
          goto _L20
_L22:
        if (c == '.') goto _L24; else goto _L23
_L23:
        l = i;
        if (c != ',') goto _L12; else goto _L24
_L24:
        if (iFieldType == 8) goto _L26; else goto _L25
_L25:
        l = i;
        if (iFieldType != 9) goto _L12; else goto _L26
_L26:
label0:
        {
            if (k1 < 0)
            {
                break label0;
            }
            k = i;
        }
          goto _L27
        k1 = j1 + j + 1;
        k = Math.min(k + 1, s.length() - j1);
          goto _L28
_L19:
        if (iFieldType == 8 || iFieldType == 9) goto _L30; else goto _L29
_L29:
        setFieldValue(readwritableperiod, iFieldType, parseInt(s, j1, j));
_L32:
        j += j1;
        i = j;
        if (j >= 0)
        {
            i = j;
            if (iSuffix != null)
            {
                i = iSuffix.parse(s, j);
            }
        }
        return i;
_L30:
        if (k1 < 0)
        {
            setFieldValue(readwritableperiod, 6, parseInt(s, j1, j));
            setFieldValue(readwritableperiod, 7, 0);
            continue; /* Loop/switch isn't completed */
        }
        l = parseInt(s, j1, k1 - j1 - 1);
        setFieldValue(readwritableperiod, 6, l);
        i = (j1 + j) - k1;
        if (i > 0)
        {
            break; /* Loop/switch isn't completed */
        }
        k = 0;
_L35:
        setFieldValue(readwritableperiod, 7, k);
        if (true) goto _L32; else goto _L31
_L31:
        if (i >= 3)
        {
            i = parseInt(s, k1, 3);
        } else
        {
            i1 = parseInt(s, k1, i);
            if (i == 1)
            {
                i = i1 * 100;
            } else
            {
                i = i1 * 10;
            }
        }
        if (k != 0) goto _L34; else goto _L33
_L33:
        k = i;
        if (l >= 0) goto _L35; else goto _L34
_L34:
        k = -i;
          goto _L35
_L12:
        k = l;
          goto _L27
        i1 = -1;
          goto _L36
    }

    public void printTo(Writer writer, ReadablePeriod readableperiod, Locale locale)
        throws IOException
    {
        long l = getFieldValue(readableperiod);
        if (l != 0x7fffffffffffffffL)
        {
            int i = (int)l;
            if (iFieldType >= 8)
            {
                i = (int)(l / 1000L);
            }
            if (iPrefix != null)
            {
                iPrefix.printTo(writer, i);
            }
            int j = iMinPrintedDigits;
            if (j <= 1)
            {
                FormatUtils.writeUnpaddedInteger(writer, i);
            } else
            {
                FormatUtils.writePaddedInteger(writer, i, j);
            }
            if (iFieldType >= 8)
            {
                j = (int)(Math.abs(l) % 1000L);
                if (iFieldType == 8 || j > 0)
                {
                    writer.write(46);
                    FormatUtils.writePaddedInteger(writer, j, 3);
                }
            }
            if (iSuffix != null)
            {
                iSuffix.printTo(writer, i);
                return;
            }
        }
    }

    public void printTo(StringBuffer stringbuffer, ReadablePeriod readableperiod, Locale locale)
    {
        long l = getFieldValue(readableperiod);
        if (l != 0x7fffffffffffffffL)
        {
            int i = (int)l;
            if (iFieldType >= 8)
            {
                i = (int)(l / 1000L);
            }
            if (iPrefix != null)
            {
                iPrefix.printTo(stringbuffer, i);
            }
            int j = stringbuffer.length();
            int k = iMinPrintedDigits;
            if (k <= 1)
            {
                FormatUtils.appendUnpaddedInteger(stringbuffer, i);
            } else
            {
                FormatUtils.appendPaddedInteger(stringbuffer, i, k);
            }
            if (iFieldType >= 8)
            {
                k = (int)(Math.abs(l) % 1000L);
                if (iFieldType == 8 || k > 0)
                {
                    if (l < 0L && l > -1000L)
                    {
                        stringbuffer.insert(j, '-');
                    }
                    stringbuffer.append('.');
                    FormatUtils.appendPaddedInteger(stringbuffer, k, 3);
                }
            }
            if (iSuffix != null)
            {
                iSuffix.printTo(stringbuffer, i);
                return;
            }
        }
    }

    void setFieldValue(ReadWritablePeriod readwritableperiod, int i, int j)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            readwritableperiod.setYears(j);
            return;

        case 1: // '\001'
            readwritableperiod.setMonths(j);
            return;

        case 2: // '\002'
            readwritableperiod.setWeeks(j);
            return;

        case 3: // '\003'
            readwritableperiod.setDays(j);
            return;

        case 4: // '\004'
            readwritableperiod.setHours(j);
            return;

        case 5: // '\005'
            readwritableperiod.setMinutes(j);
            return;

        case 6: // '\006'
            readwritableperiod.setSeconds(j);
            return;

        case 7: // '\007'
            readwritableperiod.setMillis(j);
            break;
        }
    }

    x(int i, int j, int k, boolean flag, int l, x ax[], x x, 
            x x1)
    {
        iMinPrintedDigits = i;
        iPrintZeroSetting = j;
        iMaxParsedDigits = k;
        iRejectSignedValues = flag;
        iFieldType = l;
        iFieldFormatters = ax;
        iPrefix = x;
        iSuffix = x1;
    }

    x(x x, x x1)
    {
        iMinPrintedDigits = x.iMinPrintedDigits;
        iPrintZeroSetting = x.iPrintZeroSetting;
        iMaxParsedDigits = x.iMaxParsedDigits;
        iRejectSignedValues = x.iRejectSignedValues;
        iFieldType = x.iFieldType;
        iFieldFormatters = x.iFieldFormatters;
        iPrefix = x.iPrefix;
        Object obj = x1;
        if (x.iSuffix != null)
        {
            obj = new <init>(x.iSuffix, x1);
        }
        iSuffix = ((x) (obj));
    }
}
