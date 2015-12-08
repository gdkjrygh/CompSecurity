// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.joda.time.DurationFieldType;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;

// Referenced classes of package org.joda.time.format:
//            PeriodPrinter, PeriodParser, PeriodFormatter, FormatUtils

public class PeriodFormatterBuilder
{
    static class Composite
        implements PeriodParser, PeriodPrinter
    {

        private final PeriodParser iParsers[];
        private final PeriodPrinter iPrinters[];

        private void addArrayToList(List list, Object aobj[])
        {
            if (aobj != null)
            {
                for (int i = 0; i < aobj.length; i++)
                {
                    list.add(aobj[i]);
                }

            }
        }

        private void decompose(List list, List list1, List list2)
        {
            int j = list.size();
            int i = 0;
            while (i < j) 
            {
                Object obj = list.get(i);
                if (obj instanceof PeriodPrinter)
                {
                    if (obj instanceof Composite)
                    {
                        addArrayToList(list1, ((Composite)obj).iPrinters);
                    } else
                    {
                        list1.add(obj);
                    }
                }
                obj = list.get(i + 1);
                if (obj instanceof PeriodParser)
                {
                    if (obj instanceof Composite)
                    {
                        addArrayToList(list2, ((Composite)obj).iParsers);
                    } else
                    {
                        list2.add(obj);
                    }
                }
                i += 2;
            }
        }

        public int calculatePrintedLength(ReadablePeriod readableperiod, Locale locale)
        {
            int i = 0;
            PeriodPrinter aperiodprinter[] = iPrinters;
            int j = aperiodprinter.length;
            do
            {
                j--;
                if (j >= 0)
                {
                    i += aperiodprinter[j].calculatePrintedLength(readableperiod, locale);
                } else
                {
                    return i;
                }
            } while (true);
        }

        public int countFieldsToPrint(ReadablePeriod readableperiod, int i, Locale locale)
        {
            int j = 0;
            PeriodPrinter aperiodprinter[] = iPrinters;
            int k = aperiodprinter.length;
            do
            {
                if (j >= i)
                {
                    break;
                }
                k--;
                if (k < 0)
                {
                    break;
                }
                j += aperiodprinter[k].countFieldsToPrint(readableperiod, 0x7fffffff, locale);
            } while (true);
            return j;
        }

        public int parseInto(ReadWritablePeriod readwritableperiod, String s, int i, Locale locale)
        {
            PeriodParser aperiodparser[] = iParsers;
            if (aperiodparser == null)
            {
                throw new UnsupportedOperationException();
            }
            int k = aperiodparser.length;
            boolean flag = false;
            int j = i;
            for (i = ((flag) ? 1 : 0); i < k && j >= 0; i++)
            {
                j = aperiodparser[i].parseInto(readwritableperiod, s, j, locale);
            }

            return j;
        }

        public void printTo(Writer writer, ReadablePeriod readableperiod, Locale locale)
            throws IOException
        {
            PeriodPrinter aperiodprinter[] = iPrinters;
            int j = aperiodprinter.length;
            for (int i = 0; i < j; i++)
            {
                aperiodprinter[i].printTo(writer, readableperiod, locale);
            }

        }

        public void printTo(StringBuffer stringbuffer, ReadablePeriod readableperiod, Locale locale)
        {
            PeriodPrinter aperiodprinter[] = iPrinters;
            int j = aperiodprinter.length;
            for (int i = 0; i < j; i++)
            {
                aperiodprinter[i].printTo(stringbuffer, readableperiod, locale);
            }

        }

        Composite(List list)
        {
            ArrayList arraylist = new ArrayList();
            ArrayList arraylist1 = new ArrayList();
            decompose(list, arraylist, arraylist1);
            if (arraylist.size() <= 0)
            {
                iPrinters = null;
            } else
            {
                iPrinters = (PeriodPrinter[])arraylist.toArray(new PeriodPrinter[arraylist.size()]);
            }
            if (arraylist1.size() <= 0)
            {
                iParsers = null;
                return;
            } else
            {
                iParsers = (PeriodParser[])arraylist1.toArray(new PeriodParser[arraylist1.size()]);
                return;
            }
        }
    }

    static class CompositeAffix extends IgnorableAffix
    {

        private final PeriodFieldAffix iLeft;
        private final String iLeftRightCombinations[];
        private final PeriodFieldAffix iRight;

        public int calculatePrintedLength(int i)
        {
            return iLeft.calculatePrintedLength(i) + iRight.calculatePrintedLength(i);
        }

        public String[] getAffixes()
        {
            return (String[])iLeftRightCombinations.clone();
        }

        public int parse(String s, int i)
        {
            int k = iLeft.parse(s, i);
            int j = k;
            if (k >= 0)
            {
                k = iRight.parse(s, k);
                j = k;
                if (k >= 0)
                {
                    j = k;
                    if (matchesOtherAffix(parse(s, k) - k, s, i))
                    {
                        j = ~i;
                    }
                }
            }
            return j;
        }

        public void printTo(Writer writer, int i)
            throws IOException
        {
            iLeft.printTo(writer, i);
            iRight.printTo(writer, i);
        }

        public void printTo(StringBuffer stringbuffer, int i)
        {
            iLeft.printTo(stringbuffer, i);
            iRight.printTo(stringbuffer, i);
        }

        public int scan(String s, int i)
        {
            int j = iLeft.scan(s, i);
            if (j >= 0)
            {
                int k = iRight.scan(s, iLeft.parse(s, j));
                if (k < 0 || !matchesOtherAffix(iRight.parse(s, k) - j, s, i))
                {
                    if (j > 0)
                    {
                        return j;
                    } else
                    {
                        return k;
                    }
                }
            }
            return ~i;
        }

        CompositeAffix(PeriodFieldAffix periodfieldaffix, PeriodFieldAffix periodfieldaffix1)
        {
            iLeft = periodfieldaffix;
            iRight = periodfieldaffix1;
            periodfieldaffix = new HashSet();
            periodfieldaffix1 = iLeft.getAffixes();
            int k = periodfieldaffix1.length;
            for (int i = 0; i < k; i++)
            {
                String s = periodfieldaffix1[i];
                String as[] = iRight.getAffixes();
                int l = as.length;
                for (int j = 0; j < l; j++)
                {
                    String s1 = as[j];
                    periodfieldaffix.add((new StringBuilder()).append(s).append(s1).toString());
                }

            }

            iLeftRightCombinations = (String[])periodfieldaffix.toArray(new String[periodfieldaffix.size()]);
        }
    }

    static class FieldFormatter
        implements PeriodParser, PeriodPrinter
    {

        private final FieldFormatter iFieldFormatters[];
        private final int iFieldType;
        private final int iMaxParsedDigits;
        private final int iMinPrintedDigits;
        private final PeriodFieldAffix iPrefix;
        private final int iPrintZeroSetting;
        private final boolean iRejectSignedValues;
        private final PeriodFieldAffix iSuffix;

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

        public void finish(FieldFormatter afieldformatter[])
        {
            HashSet hashset = new HashSet();
            HashSet hashset1 = new HashSet();
            int j = afieldformatter.length;
            for (int i = 0; i < j; i++)
            {
                FieldFormatter fieldformatter = afieldformatter[i];
                if (fieldformatter != null && !equals(fieldformatter))
                {
                    hashset.add(fieldformatter.iPrefix);
                    hashset1.add(fieldformatter.iSuffix);
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
        //                       0 104
        //                       1 163
        //                       2 178
        //                       3 193
        //                       4 208
        //                       5 223
        //                       6 238
        //                       7 253
        //                       8 268
        //                       9 268;
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
        //                       1 367
        //                       2 308
        //                       3 160
        //                       4 160
        //                       5 26;
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
        //                       0 58
        //                       1 66
        //                       2 74
        //                       3 82
        //                       4 90
        //                       5 98
        //                       6 106
        //                       7 114
        //                       8 122
        //                       9 122;
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

        FieldFormatter(int i, int j, int k, boolean flag, int l, FieldFormatter afieldformatter[], PeriodFieldAffix periodfieldaffix, 
                PeriodFieldAffix periodfieldaffix1)
        {
            iMinPrintedDigits = i;
            iPrintZeroSetting = j;
            iMaxParsedDigits = k;
            iRejectSignedValues = flag;
            iFieldType = l;
            iFieldFormatters = afieldformatter;
            iPrefix = periodfieldaffix;
            iSuffix = periodfieldaffix1;
        }

        FieldFormatter(FieldFormatter fieldformatter, PeriodFieldAffix periodfieldaffix)
        {
            iMinPrintedDigits = fieldformatter.iMinPrintedDigits;
            iPrintZeroSetting = fieldformatter.iPrintZeroSetting;
            iMaxParsedDigits = fieldformatter.iMaxParsedDigits;
            iRejectSignedValues = fieldformatter.iRejectSignedValues;
            iFieldType = fieldformatter.iFieldType;
            iFieldFormatters = fieldformatter.iFieldFormatters;
            iPrefix = fieldformatter.iPrefix;
            Object obj = periodfieldaffix;
            if (fieldformatter.iSuffix != null)
            {
                obj = new CompositeAffix(fieldformatter.iSuffix, periodfieldaffix);
            }
            iSuffix = ((PeriodFieldAffix) (obj));
        }
    }

    static abstract class IgnorableAffix
        implements PeriodFieldAffix
    {

        private volatile String iOtherAffixes[];

        public void finish(Set set)
        {
            if (iOtherAffixes == null)
            {
                int i = 0x7fffffff;
                String s = null;
                String as[] = getAffixes();
                int l = as.length;
                for (int j = 0; j < l; j++)
                {
                    String s1 = as[j];
                    if (s1.length() < i)
                    {
                        i = s1.length();
                        s = s1;
                    }
                }

                HashSet hashset = new HashSet();
                set = set.iterator();
                do
                {
                    if (!set.hasNext())
                    {
                        break;
                    }
                    PeriodFieldAffix periodfieldaffix = (PeriodFieldAffix)set.next();
                    if (periodfieldaffix != null)
                    {
                        String as1[] = periodfieldaffix.getAffixes();
                        int i1 = as1.length;
                        int k = 0;
                        while (k < i1) 
                        {
                            String s2 = as1[k];
                            if (s2.length() > i || s2.equalsIgnoreCase(s) && !s2.equals(s))
                            {
                                hashset.add(s2);
                            }
                            k++;
                        }
                    }
                } while (true);
                iOtherAffixes = (String[])hashset.toArray(new String[hashset.size()]);
            }
        }

        protected boolean matchesOtherAffix(int i, String s, int j)
        {
            if (iOtherAffixes != null)
            {
                String as[] = iOtherAffixes;
                int l = as.length;
                for (int k = 0; k < l; k++)
                {
                    String s1 = as[k];
                    int i1 = s1.length();
                    if (i < i1 && s.regionMatches(true, j, s1, 0, i1) || i == i1 && s.regionMatches(false, j, s1, 0, i1))
                    {
                        return true;
                    }
                }

            }
            return false;
        }

        IgnorableAffix()
        {
        }
    }

    static class Literal
        implements PeriodParser, PeriodPrinter
    {

        static final Literal EMPTY = new Literal("");
        private final String iText;

        public int calculatePrintedLength(ReadablePeriod readableperiod, Locale locale)
        {
            return iText.length();
        }

        public int countFieldsToPrint(ReadablePeriod readableperiod, int i, Locale locale)
        {
            return 0;
        }

        public int parseInto(ReadWritablePeriod readwritableperiod, String s, int i, Locale locale)
        {
            if (s.regionMatches(true, i, iText, 0, iText.length()))
            {
                return iText.length() + i;
            } else
            {
                return ~i;
            }
        }

        public void printTo(Writer writer, ReadablePeriod readableperiod, Locale locale)
            throws IOException
        {
            writer.write(iText);
        }

        public void printTo(StringBuffer stringbuffer, ReadablePeriod readableperiod, Locale locale)
        {
            stringbuffer.append(iText);
        }


        Literal(String s)
        {
            iText = s;
        }
    }

    static interface PeriodFieldAffix
    {

        public abstract int calculatePrintedLength(int i);

        public abstract void finish(Set set);

        public abstract String[] getAffixes();

        public abstract int parse(String s, int i);

        public abstract void printTo(Writer writer, int i)
            throws IOException;

        public abstract void printTo(StringBuffer stringbuffer, int i);

        public abstract int scan(String s, int i);
    }

    static class PluralAffix extends IgnorableAffix
    {

        private final String iPluralText;
        private final String iSingularText;

        public int calculatePrintedLength(int i)
        {
            String s;
            if (i == 1)
            {
                s = iSingularText;
            } else
            {
                s = iPluralText;
            }
            return s.length();
        }

        public String[] getAffixes()
        {
            return (new String[] {
                iSingularText, iPluralText
            });
        }

        public int parse(String s, int i)
        {
            String s2 = iPluralText;
            String s1 = iSingularText;
            String s3;
            if (s2.length() < s1.length())
            {
                s3 = s2;
                s2 = s1;
            } else
            {
                s3 = s1;
            }
            if (s.regionMatches(true, i, s2, 0, s2.length()) && !matchesOtherAffix(s2.length(), s, i))
            {
                return s2.length() + i;
            }
            if (s.regionMatches(true, i, s3, 0, s3.length()) && !matchesOtherAffix(s3.length(), s, i))
            {
                return s3.length() + i;
            } else
            {
                return ~i;
            }
        }

        public void printTo(Writer writer, int i)
            throws IOException
        {
            String s;
            if (i == 1)
            {
                s = iSingularText;
            } else
            {
                s = iPluralText;
            }
            writer.write(s);
        }

        public void printTo(StringBuffer stringbuffer, int i)
        {
            String s;
            if (i == 1)
            {
                s = iSingularText;
            } else
            {
                s = iPluralText;
            }
            stringbuffer.append(s);
        }

        public int scan(String s, int i)
        {
            String s1 = iPluralText;
            String s2 = iSingularText;
            int k;
            int l;
            int i1;
            if (s1.length() >= s2.length())
            {
                String s3 = s2;
                s2 = s1;
                s1 = s3;
            }
            k = s2.length();
            l = s1.length();
            i1 = s.length();
            for (int j = i; j < i1; j++)
            {
                while (s.regionMatches(true, j, s2, 0, k) && !matchesOtherAffix(s2.length(), s, j) || s.regionMatches(true, j, s1, 0, l) && !matchesOtherAffix(s1.length(), s, j)) 
                {
                    return j;
                }
            }

            return ~i;
        }

        PluralAffix(String s, String s1)
        {
            iSingularText = s;
            iPluralText = s1;
        }
    }

    static class RegExAffix extends IgnorableAffix
    {

        private static final Comparator LENGTH_DESC_COMPARATOR = new Comparator() {

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((String)obj, (String)obj1);
            }

            public int compare(String s, String s1)
            {
                return s1.length() - s.length();
            }

        };
        private final Pattern iPatterns[];
        private final String iSuffixes[];
        private final String iSuffixesSortedDescByLength[];

        private int selectSuffixIndex(int i)
        {
            for (int j = 0; j < iPatterns.length; j++)
            {
                if (iPatterns[j].matcher(String.valueOf(i)).matches())
                {
                    return j;
                }
            }

            return iPatterns.length - 1;
        }

        public int calculatePrintedLength(int i)
        {
            return iSuffixes[selectSuffixIndex(i)].length();
        }

        public String[] getAffixes()
        {
            return (String[])iSuffixes.clone();
        }

        public int parse(String s, int i)
        {
            String as[] = iSuffixesSortedDescByLength;
            int k = as.length;
            for (int j = 0; j < k; j++)
            {
                String s1 = as[j];
                if (s.regionMatches(true, i, s1, 0, s1.length()) && !matchesOtherAffix(s1.length(), s, i))
                {
                    return s1.length() + i;
                }
            }

            return ~i;
        }

        public void printTo(Writer writer, int i)
            throws IOException
        {
            writer.write(iSuffixes[selectSuffixIndex(i)]);
        }

        public void printTo(StringBuffer stringbuffer, int i)
        {
            stringbuffer.append(iSuffixes[selectSuffixIndex(i)]);
        }

        public int scan(String s, int i)
        {
            int l = s.length();
            for (int j = i; j < l; j++)
            {
                String as[] = iSuffixesSortedDescByLength;
                int i1 = as.length;
                for (int k = 0; k < i1; k++)
                {
                    String s1 = as[k];
                    if (s.regionMatches(true, j, s1, 0, s1.length()) && !matchesOtherAffix(s1.length(), s, j))
                    {
                        return j;
                    }
                }

            }

            return ~i;
        }


        RegExAffix(String as[], String as1[])
        {
            iSuffixes = (String[])as1.clone();
            iPatterns = new Pattern[as.length];
            for (int i = 0; i < as.length; i++)
            {
                Pattern pattern = (Pattern)PeriodFormatterBuilder.PATTERNS.get(as[i]);
                as1 = pattern;
                if (pattern == null)
                {
                    as1 = Pattern.compile(as[i]);
                    PeriodFormatterBuilder.PATTERNS.putIfAbsent(as[i], as1);
                }
                iPatterns[i] = as1;
            }

            iSuffixesSortedDescByLength = (String[])iSuffixes.clone();
            Arrays.sort(iSuffixesSortedDescByLength, LENGTH_DESC_COMPARATOR);
        }
    }

    static class Separator
        implements PeriodParser, PeriodPrinter
    {

        private volatile PeriodParser iAfterParser;
        private volatile PeriodPrinter iAfterPrinter;
        private final PeriodParser iBeforeParser;
        private final PeriodPrinter iBeforePrinter;
        private final String iFinalText;
        private final String iParsedForms[];
        private final String iText;
        private final boolean iUseAfter;
        private final boolean iUseBefore;

        public int calculatePrintedLength(ReadablePeriod readableperiod, Locale locale)
        {
            PeriodPrinter periodprinter;
            PeriodPrinter periodprinter1;
            int i;
            periodprinter = iBeforePrinter;
            periodprinter1 = iAfterPrinter;
            i = periodprinter.calculatePrintedLength(readableperiod, locale) + periodprinter1.calculatePrintedLength(readableperiod, locale);
            if (!iUseBefore) goto _L2; else goto _L1
_L1:
            int j = i;
            if (periodprinter.countFieldsToPrint(readableperiod, 1, locale) <= 0) goto _L4; else goto _L3
_L3:
            if (!iUseAfter) goto _L6; else goto _L5
_L5:
            j = periodprinter1.countFieldsToPrint(readableperiod, 2, locale);
            if (j > 0)
            {
                if (j > 1)
                {
                    readableperiod = iText;
                } else
                {
                    readableperiod = iFinalText;
                }
                i = readableperiod.length() + i;
            }
            j = i;
_L4:
            return j;
_L6:
            return i + iText.length();
_L2:
            j = i;
            if (iUseAfter)
            {
                j = i;
                if (periodprinter1.countFieldsToPrint(readableperiod, 1, locale) > 0)
                {
                    return i + iText.length();
                }
            }
            if (true) goto _L4; else goto _L7
_L7:
        }

        public int countFieldsToPrint(ReadablePeriod readableperiod, int i, Locale locale)
        {
            int k = iBeforePrinter.countFieldsToPrint(readableperiod, i, locale);
            int j = k;
            if (k < i)
            {
                j = k + iAfterPrinter.countFieldsToPrint(readableperiod, i, locale);
            }
            return j;
        }

        Separator finish(PeriodPrinter periodprinter, PeriodParser periodparser)
        {
            iAfterPrinter = periodprinter;
            iAfterParser = periodparser;
            return this;
        }

        public int parseInto(ReadWritablePeriod readwritableperiod, String s, int i, Locale locale)
        {
            int j;
            int k;
            int l;
            l = 1;
            k = 0;
            j = iBeforeParser.parseInto(readwritableperiod, s, i, locale);
            if (j < 0)
            {
                return j;
            }
            if (j <= i)
            {
                break MISSING_BLOCK_LABEL_200;
            }
            String as[] = iParsedForms;
            int i1 = as.length;
            i = 0;
            do
            {
                if (i >= i1)
                {
                    break MISSING_BLOCK_LABEL_200;
                }
                String s1 = as[i];
                if (s1 == null || s1.length() == 0 || s.regionMatches(true, j, s1, 0, s1.length()))
                {
                    if (s1 == null)
                    {
                        i = k;
                    } else
                    {
                        i = s1.length();
                    }
                    j += i;
                    k = i;
                    i = l;
                    break MISSING_BLOCK_LABEL_112;
                }
                i++;
            } while (true);
_L2:
            l = iAfterParser.parseInto(readwritableperiod, s, j, locale);
            if (l < 0)
            {
                return l;
            }
            if (i != 0 && l == j && k > 0)
            {
                return ~j;
            }
            if (l > j && i == 0 && !iUseBefore)
            {
                return ~j;
            } else
            {
                return l;
            }
            i = 0;
            k = -1;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public void printTo(Writer writer, ReadablePeriod readableperiod, Locale locale)
            throws IOException
        {
            PeriodPrinter periodprinter;
            PeriodPrinter periodprinter1;
            periodprinter = iBeforePrinter;
            periodprinter1 = iAfterPrinter;
            periodprinter.printTo(writer, readableperiod, locale);
            if (!iUseBefore) goto _L2; else goto _L1
_L1:
            if (periodprinter.countFieldsToPrint(readableperiod, 1, locale) > 0)
            {
                if (iUseAfter)
                {
                    int i = periodprinter1.countFieldsToPrint(readableperiod, 2, locale);
                    if (i > 0)
                    {
                        String s;
                        if (i > 1)
                        {
                            s = iText;
                        } else
                        {
                            s = iFinalText;
                        }
                        writer.write(s);
                    }
                } else
                {
                    writer.write(iText);
                }
            }
_L4:
            periodprinter1.printTo(writer, readableperiod, locale);
            return;
_L2:
            if (iUseAfter && periodprinter1.countFieldsToPrint(readableperiod, 1, locale) > 0)
            {
                writer.write(iText);
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public void printTo(StringBuffer stringbuffer, ReadablePeriod readableperiod, Locale locale)
        {
            PeriodPrinter periodprinter;
            PeriodPrinter periodprinter1;
            periodprinter = iBeforePrinter;
            periodprinter1 = iAfterPrinter;
            periodprinter.printTo(stringbuffer, readableperiod, locale);
            if (!iUseBefore) goto _L2; else goto _L1
_L1:
            if (periodprinter.countFieldsToPrint(readableperiod, 1, locale) > 0)
            {
                if (iUseAfter)
                {
                    int i = periodprinter1.countFieldsToPrint(readableperiod, 2, locale);
                    if (i > 0)
                    {
                        String s;
                        if (i > 1)
                        {
                            s = iText;
                        } else
                        {
                            s = iFinalText;
                        }
                        stringbuffer.append(s);
                    }
                } else
                {
                    stringbuffer.append(iText);
                }
            }
_L4:
            periodprinter1.printTo(stringbuffer, readableperiod, locale);
            return;
_L2:
            if (iUseAfter && periodprinter1.countFieldsToPrint(readableperiod, 1, locale) > 0)
            {
                stringbuffer.append(iText);
            }
            if (true) goto _L4; else goto _L3
_L3:
        }



        Separator(String s, String s1, String as[], PeriodPrinter periodprinter, PeriodParser periodparser, boolean flag, boolean flag1)
        {
            iText = s;
            iFinalText = s1;
            if ((s1 == null || s.equals(s1)) && (as == null || as.length == 0))
            {
                iParsedForms = (new String[] {
                    s
                });
            } else
            {
                TreeSet treeset = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                treeset.add(s);
                treeset.add(s1);
                if (as != null)
                {
                    int i = as.length;
                    do
                    {
                        i--;
                        if (i < 0)
                        {
                            break;
                        }
                        treeset.add(as[i]);
                    } while (true);
                }
                s = new ArrayList(treeset);
                Collections.reverse(s);
                iParsedForms = (String[])s.toArray(new String[s.size()]);
            }
            iBeforePrinter = periodprinter;
            iBeforeParser = periodparser;
            iUseBefore = flag;
            iUseAfter = flag1;
        }
    }

    static class SimpleAffix extends IgnorableAffix
    {

        private final String iText;

        public int calculatePrintedLength(int i)
        {
            return iText.length();
        }

        public String[] getAffixes()
        {
            return (new String[] {
                iText
            });
        }

        public int parse(String s, int i)
        {
            String s1 = iText;
            int j = s1.length();
            if (s.regionMatches(true, i, s1, 0, j) && !matchesOtherAffix(j, s, i))
            {
                return i + j;
            } else
            {
                return ~i;
            }
        }

        public void printTo(Writer writer, int i)
            throws IOException
        {
            writer.write(iText);
        }

        public void printTo(StringBuffer stringbuffer, int i)
        {
            stringbuffer.append(iText);
        }

        public int scan(String s, int i)
        {
            String s1;
            int j;
            int k;
            int l;
            s1 = iText;
            k = s1.length();
            l = s.length();
            j = i;
_L5:
            if (j >= l) goto _L2; else goto _L1
_L1:
            if (s.regionMatches(true, j, s1, 0, k) && !matchesOtherAffix(k, s, j))
            {
                return j;
            }
            s.charAt(j);
            JVM INSTR tableswitch 43 57: default 136
        //                       43 140
        //                       44 140
        //                       45 140
        //                       46 140
        //                       47 136
        //                       48 140
        //                       49 140
        //                       50 140
        //                       51 140
        //                       52 140
        //                       53 140
        //                       54 140
        //                       55 140
        //                       56 140
        //                       57 140;
               goto _L2 _L3 _L3 _L3 _L3 _L2 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3
_L2:
            return ~i;
_L3:
            j++;
            if (true) goto _L5; else goto _L4
_L4:
        }

        SimpleAffix(String s)
        {
            iText = s;
        }
    }


    private static final int DAYS = 3;
    private static final int HOURS = 4;
    private static final int MAX_FIELD = 9;
    private static final int MILLIS = 7;
    private static final int MINUTES = 5;
    private static final int MONTHS = 1;
    private static final ConcurrentMap PATTERNS = new ConcurrentHashMap();
    private static final int PRINT_ZERO_ALWAYS = 4;
    private static final int PRINT_ZERO_IF_SUPPORTED = 3;
    private static final int PRINT_ZERO_NEVER = 5;
    private static final int PRINT_ZERO_RARELY_FIRST = 1;
    private static final int PRINT_ZERO_RARELY_LAST = 2;
    private static final int SECONDS = 6;
    private static final int SECONDS_MILLIS = 8;
    private static final int SECONDS_OPTIONAL_MILLIS = 9;
    private static final int WEEKS = 2;
    private static final int YEARS = 0;
    private List iElementPairs;
    private FieldFormatter iFieldFormatters[];
    private int iMaxParsedDigits;
    private int iMinPrintedDigits;
    private boolean iNotParser;
    private boolean iNotPrinter;
    private PeriodFieldAffix iPrefix;
    private int iPrintZeroSetting;
    private boolean iRejectSignedValues;

    public PeriodFormatterBuilder()
    {
        clear();
    }

    private PeriodFormatterBuilder append0(PeriodPrinter periodprinter, PeriodParser periodparser)
    {
        boolean flag1 = true;
        iElementPairs.add(periodprinter);
        iElementPairs.add(periodparser);
        boolean flag2 = iNotPrinter;
        boolean flag;
        if (periodprinter == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        iNotPrinter = flag | flag2;
        flag2 = iNotParser;
        if (periodparser == null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        iNotParser = flag2 | flag;
        return this;
    }

    private void appendField(int i)
    {
        appendField(i, iMinPrintedDigits);
    }

    private void appendField(int i, int j)
    {
        FieldFormatter fieldformatter = new FieldFormatter(j, iPrintZeroSetting, iMaxParsedDigits, iRejectSignedValues, i, iFieldFormatters, iPrefix, null);
        append0(fieldformatter, fieldformatter);
        iFieldFormatters[i] = fieldformatter;
        iPrefix = null;
    }

    private PeriodFormatterBuilder appendPrefix(PeriodFieldAffix periodfieldaffix)
    {
        if (periodfieldaffix == null)
        {
            throw new IllegalArgumentException();
        }
        Object obj = periodfieldaffix;
        if (iPrefix != null)
        {
            obj = new CompositeAffix(iPrefix, periodfieldaffix);
        }
        iPrefix = ((PeriodFieldAffix) (obj));
        return this;
    }

    private PeriodFormatterBuilder appendSeparator(String s, String s1, String as[], boolean flag, boolean flag1)
    {
        if (s == null || s1 == null)
        {
            throw new IllegalArgumentException();
        }
        clearPrefix();
        List list = iElementPairs;
        if (list.size() == 0)
        {
            if (flag1 && !flag)
            {
                s = new Separator(s, s1, as, Literal.EMPTY, Literal.EMPTY, flag, flag1);
                append0(s, s);
            }
            return this;
        }
        Separator separator = null;
        int i = list.size();
        do
        {
label0:
            {
                i--;
                if (i >= 0)
                {
                    if (!(list.get(i) instanceof Separator))
                    {
                        break label0;
                    }
                    separator = (Separator)list.get(i);
                    list = list.subList(i + 1, list.size());
                }
                if (separator != null && list.size() == 0)
                {
                    throw new IllegalStateException("Cannot have two adjacent separators");
                } else
                {
                    Object aobj[] = createComposite(list);
                    list.clear();
                    s = new Separator(s, s1, as, (PeriodPrinter)aobj[0], (PeriodParser)aobj[1], flag, flag1);
                    list.add(s);
                    list.add(s);
                    return this;
                }
            }
            i--;
        } while (true);
    }

    private PeriodFormatterBuilder appendSuffix(PeriodFieldAffix periodfieldaffix)
    {
        Object obj = null;
        Object obj1;
        if (iElementPairs.size() > 0)
        {
            obj = iElementPairs.get(iElementPairs.size() - 2);
            obj1 = iElementPairs.get(iElementPairs.size() - 1);
        } else
        {
            obj1 = null;
        }
        if (obj == null || obj1 == null || obj != obj1 || !(obj instanceof FieldFormatter))
        {
            throw new IllegalStateException("No field to apply suffix to");
        } else
        {
            clearPrefix();
            periodfieldaffix = new FieldFormatter((FieldFormatter)obj, periodfieldaffix);
            iElementPairs.set(iElementPairs.size() - 2, periodfieldaffix);
            iElementPairs.set(iElementPairs.size() - 1, periodfieldaffix);
            iFieldFormatters[periodfieldaffix.getFieldType()] = periodfieldaffix;
            return this;
        }
    }

    private void clearPrefix()
        throws IllegalStateException
    {
        if (iPrefix != null)
        {
            throw new IllegalStateException("Prefix not followed by field");
        } else
        {
            iPrefix = null;
            return;
        }
    }

    private static Object[] createComposite(List list)
    {
        switch (list.size())
        {
        default:
            list = new Composite(list);
            return (new Object[] {
                list, list
            });

        case 0: // '\0'
            return (new Object[] {
                Literal.EMPTY, Literal.EMPTY
            });

        case 1: // '\001'
            return (new Object[] {
                list.get(0), list.get(1)
            });
        }
    }

    private static PeriodFormatter toFormatter(List list, boolean flag, boolean flag1)
    {
        if (flag && flag1)
        {
            throw new IllegalStateException("Builder has created neither a printer nor a parser");
        }
        int i = list.size();
        if (i >= 2 && (list.get(0) instanceof Separator))
        {
            Separator separator = (Separator)list.get(0);
            if (separator.iAfterParser == null && separator.iAfterPrinter == null)
            {
                list = toFormatter(list.subList(2, i), flag, flag1);
                list = separator.finish(list.getPrinter(), list.getParser());
                return new PeriodFormatter(list, list);
            }
        }
        list = ((List) (createComposite(list)));
        if (flag)
        {
            return new PeriodFormatter(null, (PeriodParser)list[1]);
        }
        if (flag1)
        {
            return new PeriodFormatter((PeriodPrinter)list[0], null);
        } else
        {
            return new PeriodFormatter((PeriodPrinter)list[0], (PeriodParser)list[1]);
        }
    }

    public PeriodFormatterBuilder append(PeriodFormatter periodformatter)
    {
        if (periodformatter == null)
        {
            throw new IllegalArgumentException("No formatter supplied");
        } else
        {
            clearPrefix();
            append0(periodformatter.getPrinter(), periodformatter.getParser());
            return this;
        }
    }

    public PeriodFormatterBuilder append(PeriodPrinter periodprinter, PeriodParser periodparser)
    {
        if (periodprinter == null && periodparser == null)
        {
            throw new IllegalArgumentException("No printer or parser supplied");
        } else
        {
            clearPrefix();
            append0(periodprinter, periodparser);
            return this;
        }
    }

    public PeriodFormatterBuilder appendDays()
    {
        appendField(3);
        return this;
    }

    public PeriodFormatterBuilder appendHours()
    {
        appendField(4);
        return this;
    }

    public PeriodFormatterBuilder appendLiteral(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Literal must not be null");
        } else
        {
            clearPrefix();
            s = new Literal(s);
            append0(s, s);
            return this;
        }
    }

    public PeriodFormatterBuilder appendMillis()
    {
        appendField(7);
        return this;
    }

    public PeriodFormatterBuilder appendMillis3Digit()
    {
        appendField(7, 3);
        return this;
    }

    public PeriodFormatterBuilder appendMinutes()
    {
        appendField(5);
        return this;
    }

    public PeriodFormatterBuilder appendMonths()
    {
        appendField(1);
        return this;
    }

    public PeriodFormatterBuilder appendPrefix(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException();
        } else
        {
            return appendPrefix(((PeriodFieldAffix) (new SimpleAffix(s))));
        }
    }

    public PeriodFormatterBuilder appendPrefix(String s, String s1)
    {
        if (s == null || s1 == null)
        {
            throw new IllegalArgumentException();
        } else
        {
            return appendPrefix(((PeriodFieldAffix) (new PluralAffix(s, s1))));
        }
    }

    public PeriodFormatterBuilder appendPrefix(String as[], String as1[])
    {
        if (as == null || as1 == null || as.length < 1 || as.length != as1.length)
        {
            throw new IllegalArgumentException();
        } else
        {
            return appendPrefix(((PeriodFieldAffix) (new RegExAffix(as, as1))));
        }
    }

    public PeriodFormatterBuilder appendSeconds()
    {
        appendField(6);
        return this;
    }

    public PeriodFormatterBuilder appendSecondsWithMillis()
    {
        appendField(8);
        return this;
    }

    public PeriodFormatterBuilder appendSecondsWithOptionalMillis()
    {
        appendField(9);
        return this;
    }

    public PeriodFormatterBuilder appendSeparator(String s)
    {
        return appendSeparator(s, s, null, true, true);
    }

    public PeriodFormatterBuilder appendSeparator(String s, String s1)
    {
        return appendSeparator(s, s1, null, true, true);
    }

    public PeriodFormatterBuilder appendSeparator(String s, String s1, String as[])
    {
        return appendSeparator(s, s1, as, true, true);
    }

    public PeriodFormatterBuilder appendSeparatorIfFieldsAfter(String s)
    {
        return appendSeparator(s, s, null, false, true);
    }

    public PeriodFormatterBuilder appendSeparatorIfFieldsBefore(String s)
    {
        return appendSeparator(s, s, null, true, false);
    }

    public PeriodFormatterBuilder appendSuffix(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException();
        } else
        {
            return appendSuffix(((PeriodFieldAffix) (new SimpleAffix(s))));
        }
    }

    public PeriodFormatterBuilder appendSuffix(String s, String s1)
    {
        if (s == null || s1 == null)
        {
            throw new IllegalArgumentException();
        } else
        {
            return appendSuffix(((PeriodFieldAffix) (new PluralAffix(s, s1))));
        }
    }

    public PeriodFormatterBuilder appendSuffix(String as[], String as1[])
    {
        if (as == null || as1 == null || as.length < 1 || as.length != as1.length)
        {
            throw new IllegalArgumentException();
        } else
        {
            return appendSuffix(((PeriodFieldAffix) (new RegExAffix(as, as1))));
        }
    }

    public PeriodFormatterBuilder appendWeeks()
    {
        appendField(2);
        return this;
    }

    public PeriodFormatterBuilder appendYears()
    {
        appendField(0);
        return this;
    }

    public void clear()
    {
        iMinPrintedDigits = 1;
        iPrintZeroSetting = 2;
        iMaxParsedDigits = 10;
        iRejectSignedValues = false;
        iPrefix = null;
        if (iElementPairs == null)
        {
            iElementPairs = new ArrayList();
        } else
        {
            iElementPairs.clear();
        }
        iNotPrinter = false;
        iNotParser = false;
        iFieldFormatters = new FieldFormatter[10];
    }

    public PeriodFormatterBuilder maximumParsedDigits(int i)
    {
        iMaxParsedDigits = i;
        return this;
    }

    public PeriodFormatterBuilder minimumPrintedDigits(int i)
    {
        iMinPrintedDigits = i;
        return this;
    }

    public PeriodFormatterBuilder printZeroAlways()
    {
        iPrintZeroSetting = 4;
        return this;
    }

    public PeriodFormatterBuilder printZeroIfSupported()
    {
        iPrintZeroSetting = 3;
        return this;
    }

    public PeriodFormatterBuilder printZeroNever()
    {
        iPrintZeroSetting = 5;
        return this;
    }

    public PeriodFormatterBuilder printZeroRarelyFirst()
    {
        iPrintZeroSetting = 1;
        return this;
    }

    public PeriodFormatterBuilder printZeroRarelyLast()
    {
        iPrintZeroSetting = 2;
        return this;
    }

    public PeriodFormatterBuilder rejectSignedValues(boolean flag)
    {
        iRejectSignedValues = flag;
        return this;
    }

    public PeriodFormatter toFormatter()
    {
        PeriodFormatter periodformatter = toFormatter(iElementPairs, iNotPrinter, iNotParser);
        FieldFormatter afieldformatter[] = iFieldFormatters;
        int j = afieldformatter.length;
        for (int i = 0; i < j; i++)
        {
            FieldFormatter fieldformatter = afieldformatter[i];
            if (fieldformatter != null)
            {
                fieldformatter.finish(iFieldFormatters);
            }
        }

        iFieldFormatters = (FieldFormatter[])(FieldFormatter[])iFieldFormatters.clone();
        return periodformatter;
    }

    public PeriodParser toParser()
    {
        if (iNotParser)
        {
            return null;
        } else
        {
            return toFormatter().getParser();
        }
    }

    public PeriodPrinter toPrinter()
    {
        if (iNotPrinter)
        {
            return null;
        } else
        {
            return toFormatter().getPrinter();
        }
    }


}
