// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadablePartial;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDateTimeField;

// Referenced classes of package org.joda.time.format:
//            InternalParser, InternalPrinter, DateTimeFormatter, DateTimeParserInternalParser, 
//            DateTimePrinterInternalPrinter, DateTimeFormat, InternalParserDateTimeParser, InternalPrinterDateTimePrinter, 
//            DateTimeParser, DateTimePrinter, DateTimeParserBucket, FormatUtils

public class DateTimeFormatterBuilder
{
    static class CharacterLiteral
        implements InternalParser, InternalPrinter
    {

        private final char iValue;

        public int estimateParsedLength()
        {
            return 1;
        }

        public int estimatePrintedLength()
        {
            return 1;
        }

        public int parseInto(DateTimeParserBucket datetimeparserbucket, CharSequence charsequence, int i)
        {
            if (i >= charsequence.length())
            {
                return ~i;
            }
            char c1 = charsequence.charAt(i);
            char c = iValue;
            if (c1 != c)
            {
                c1 = Character.toUpperCase(c1);
                c = Character.toUpperCase(c);
                if (c1 != c && Character.toLowerCase(c1) != Character.toLowerCase(c))
                {
                    return ~i;
                }
            }
            return i + 1;
        }

        public void printTo(Appendable appendable, long l, Chronology chronology, int i, DateTimeZone datetimezone, Locale locale)
            throws IOException
        {
            appendable.append(iValue);
        }

        public void printTo(Appendable appendable, ReadablePartial readablepartial, Locale locale)
            throws IOException
        {
            appendable.append(iValue);
        }

        CharacterLiteral(char c)
        {
            iValue = c;
        }
    }

    static class Composite
        implements InternalParser, InternalPrinter
    {

        private final int iParsedLengthEstimate;
        private final InternalParser iParsers[];
        private final int iPrintedLengthEstimate;
        private final InternalPrinter iPrinters[];

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
                if (obj instanceof Composite)
                {
                    addArrayToList(list1, ((Composite)obj).iPrinters);
                } else
                {
                    list1.add(obj);
                }
                obj = list.get(i + 1);
                if (obj instanceof Composite)
                {
                    addArrayToList(list2, ((Composite)obj).iParsers);
                } else
                {
                    list2.add(obj);
                }
                i += 2;
            }
        }

        public int estimateParsedLength()
        {
            return iParsedLengthEstimate;
        }

        public int estimatePrintedLength()
        {
            return iPrintedLengthEstimate;
        }

        boolean isParser()
        {
            return iParsers != null;
        }

        boolean isPrinter()
        {
            return iPrinters != null;
        }

        public int parseInto(DateTimeParserBucket datetimeparserbucket, CharSequence charsequence, int i)
        {
            InternalParser ainternalparser[] = iParsers;
            if (ainternalparser == null)
            {
                throw new UnsupportedOperationException();
            }
            int k = ainternalparser.length;
            boolean flag = false;
            int j = i;
            for (i = ((flag) ? 1 : 0); i < k && j >= 0; i++)
            {
                j = ainternalparser[i].parseInto(datetimeparserbucket, charsequence, j);
            }

            return j;
        }

        public void printTo(Appendable appendable, long l, Chronology chronology, int i, DateTimeZone datetimezone, Locale locale)
            throws IOException
        {
            InternalPrinter ainternalprinter[] = iPrinters;
            if (ainternalprinter == null)
            {
                throw new UnsupportedOperationException();
            }
            if (locale == null)
            {
                locale = Locale.getDefault();
            }
            int k = ainternalprinter.length;
            for (int j = 0; j < k; j++)
            {
                ainternalprinter[j].printTo(appendable, l, chronology, i, datetimezone, locale);
            }

        }

        public void printTo(Appendable appendable, ReadablePartial readablepartial, Locale locale)
            throws IOException
        {
            InternalPrinter ainternalprinter[] = iPrinters;
            if (ainternalprinter == null)
            {
                throw new UnsupportedOperationException();
            }
            Locale locale1 = locale;
            if (locale == null)
            {
                locale1 = Locale.getDefault();
            }
            int j = ainternalprinter.length;
            for (int i = 0; i < j; i++)
            {
                ainternalprinter[i].printTo(appendable, readablepartial, locale1);
            }

        }

        Composite(List list)
        {
            boolean flag = false;
            super();
            ArrayList arraylist1 = new ArrayList();
            ArrayList arraylist = new ArrayList();
            decompose(list, arraylist1, arraylist);
            if (arraylist1.contains(null) || arraylist1.isEmpty())
            {
                iPrinters = null;
                iPrintedLengthEstimate = 0;
            } else
            {
                int i1 = arraylist1.size();
                iPrinters = new InternalPrinter[i1];
                int i = 0;
                int k = 0;
                for (; i < i1; i++)
                {
                    list = (InternalPrinter)arraylist1.get(i);
                    k += list.estimatePrintedLength();
                    iPrinters[i] = list;
                }

                iPrintedLengthEstimate = k;
            }
            if (arraylist.contains(null) || arraylist.isEmpty())
            {
                iParsers = null;
                iParsedLengthEstimate = 0;
                return;
            }
            int j1 = arraylist.size();
            iParsers = new InternalParser[j1];
            int l = 0;
            for (int j = ((flag) ? 1 : 0); j < j1; j++)
            {
                list = (InternalParser)arraylist.get(j);
                l += list.estimateParsedLength();
                iParsers[j] = list;
            }

            iParsedLengthEstimate = l;
        }
    }

    static class FixedNumber extends PaddedNumber
    {

        public int parseInto(DateTimeParserBucket datetimeparserbucket, CharSequence charsequence, int i)
        {
            int l = super.parseInto(datetimeparserbucket, charsequence, i);
            if (l >= 0) goto _L2; else goto _L1
_L1:
            int k;
            return l;
_L2:
            int j;
label0:
            {
                if (l == (k = iMaxParsedDigits + i))
                {
                    continue; /* Loop/switch isn't completed */
                }
                j = k;
                if (!iSigned)
                {
                    break label0;
                }
                i = charsequence.charAt(i);
                if (i != 45)
                {
                    j = k;
                    if (i != 43)
                    {
                        break label0;
                    }
                }
                j = k + 1;
            }
            if (l > j)
            {
                return ~(j + 1);
            }
            if (l < j)
            {
                return ~l;
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

        protected FixedNumber(DateTimeFieldType datetimefieldtype, int i, boolean flag)
        {
            super(datetimefieldtype, i, flag, i);
        }
    }

    static class Fraction
        implements InternalParser, InternalPrinter
    {

        private final DateTimeFieldType iFieldType;
        protected int iMaxDigits;
        protected int iMinDigits;

        private long[] getFractionData(long l, DateTimeField datetimefield)
        {
            int i;
            long l2;
            l2 = datetimefield.getDurationField().getUnitMillis();
            i = iMaxDigits;
_L23:
            i;
            JVM INSTR tableswitch 1 18: default 104
        //                       1 141
        //                       2 149
        //                       3 157
        //                       4 165
        //                       5 173
        //                       6 181
        //                       7 189
        //                       8 197
        //                       9 205
        //                       10 213
        //                       11 221
        //                       12 229
        //                       13 237
        //                       14 245
        //                       15 253
        //                       16 261
        //                       17 269
        //                       18 277;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L1:
            long l1 = 1L;
_L21:
            if ((l2 * l1) / l1 == l2)
            {
                return (new long[] {
                    (l1 * l) / l2, (long)i
                });
            }
            break; /* Loop/switch isn't completed */
_L2:
            l1 = 10L;
            continue; /* Loop/switch isn't completed */
_L3:
            l1 = 100L;
            continue; /* Loop/switch isn't completed */
_L4:
            l1 = 1000L;
            continue; /* Loop/switch isn't completed */
_L5:
            l1 = 10000L;
            continue; /* Loop/switch isn't completed */
_L6:
            l1 = 0x186a0L;
            continue; /* Loop/switch isn't completed */
_L7:
            l1 = 0xf4240L;
            continue; /* Loop/switch isn't completed */
_L8:
            l1 = 0x989680L;
            continue; /* Loop/switch isn't completed */
_L9:
            l1 = 0x5f5e100L;
            continue; /* Loop/switch isn't completed */
_L10:
            l1 = 0x3b9aca00L;
            continue; /* Loop/switch isn't completed */
_L11:
            l1 = 0x2540be400L;
            continue; /* Loop/switch isn't completed */
_L12:
            l1 = 0x174876e800L;
            continue; /* Loop/switch isn't completed */
_L13:
            l1 = 0xe8d4a51000L;
            continue; /* Loop/switch isn't completed */
_L14:
            l1 = 0x9184e72a000L;
            continue; /* Loop/switch isn't completed */
_L15:
            l1 = 0x5af3107a4000L;
            continue; /* Loop/switch isn't completed */
_L16:
            l1 = 0x38d7ea4c68000L;
            continue; /* Loop/switch isn't completed */
_L17:
            l1 = 0x2386f26fc10000L;
            continue; /* Loop/switch isn't completed */
_L18:
            l1 = 0x16345785d8a0000L;
            continue; /* Loop/switch isn't completed */
_L19:
            l1 = 0xde0b6b3a7640000L;
            if (true) goto _L21; else goto _L20
_L20:
            i--;
            if (true) goto _L23; else goto _L22
_L22:
        }

        public int estimateParsedLength()
        {
            return iMaxDigits;
        }

        public int estimatePrintedLength()
        {
            return iMaxDigits;
        }

        public int parseInto(DateTimeParserBucket datetimeparserbucket, CharSequence charsequence, int i)
        {
            DateTimeField datetimefield = iFieldType.getField(datetimeparserbucket.getChronology());
            int k = Math.min(iMaxDigits, charsequence.length() - i);
            long l = 0L;
            long l1 = datetimefield.getDurationField().getUnitMillis() * 10L;
            int j = 0;
label0:
            do
            {
                char c;
label1:
                {
                    if (j < k)
                    {
                        c = charsequence.charAt(i + j);
                        if (c >= '0' && c <= '9')
                        {
                            break label1;
                        }
                    }
                    l /= 10L;
                    if (j == 0)
                    {
                        return ~i;
                    }
                    break label0;
                }
                j++;
                l1 /= 10L;
                l += (long)(c - 48) * l1;
            } while (true);
            if (l > 0x7fffffffL)
            {
                return ~i;
            } else
            {
                datetimeparserbucket.saveField(new PreciseDateTimeField(DateTimeFieldType.millisOfSecond(), MillisDurationField.INSTANCE, datetimefield.getDurationField()), (int)l);
                return j + i;
            }
        }

        protected void printTo(Appendable appendable, long l, Chronology chronology)
            throws IOException
        {
            int j;
            {
                chronology = iFieldType.getField(chronology);
                j = iMinDigits;
                try
                {
                    l = chronology.remainder(l);
                    break MISSING_BLOCK_LABEL_24;
                }
                // Misplaced declaration of an exception variable
                catch (Chronology chronology)
                {
                    DateTimeFormatterBuilder.appendUnknownString(appendable, j);
                }
            }
_L2:
            return;
            if (l == 0L)
            {
                do
                {
                    j--;
                    if (j < 0)
                    {
                        break;
                    }
                    appendable.append('0');
                } while (true);
                break MISSING_BLOCK_LABEL_61;
            }
            chronology = getFractionData(l, chronology);
            l = chronology[0];
            int i = (int)chronology[1];
            int k;
            if ((0x7fffffffL & l) == l)
            {
                chronology = Integer.toString((int)l);
            } else
            {
                chronology = Long.toString(l);
            }
            for (k = chronology.length(); k < i; i--)
            {
                appendable.append('0');
                j--;
            }

            if (j < i)
            {
                do
                {
                    if (j >= i || k <= 1 || chronology.charAt(k - 1) != '0')
                    {
                        if (k >= chronology.length())
                        {
                            break;
                        }
                        i = 0;
                        while (i < k) 
                        {
                            appendable.append(chronology.charAt(i));
                            i++;
                        }
                        continue; /* Loop/switch isn't completed */
                    }
                    i--;
                    k--;
                } while (true);
            }
            appendable.append(chronology);
            return;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public void printTo(Appendable appendable, long l, Chronology chronology, int i, DateTimeZone datetimezone, Locale locale)
            throws IOException
        {
            printTo(appendable, l, chronology);
        }

        public void printTo(Appendable appendable, ReadablePartial readablepartial, Locale locale)
            throws IOException
        {
            printTo(appendable, readablepartial.getChronology().set(readablepartial, 0L), readablepartial.getChronology());
        }

        protected Fraction(DateTimeFieldType datetimefieldtype, int i, int j)
        {
            iFieldType = datetimefieldtype;
            int k = j;
            if (j > 18)
            {
                k = 18;
            }
            iMinDigits = i;
            iMaxDigits = k;
        }
    }

    static class MatchingParser
        implements InternalParser
    {

        private final int iParsedLengthEstimate;
        private final InternalParser iParsers[];

        public int estimateParsedLength()
        {
            return iParsedLengthEstimate;
        }

        public int parseInto(DateTimeParserBucket datetimeparserbucket, CharSequence charsequence, int i)
        {
            Object obj;
            InternalParser ainternalparser[];
            Object obj1;
            int j;
            int k;
            int l;
            int j1;
            ainternalparser = iParsers;
            j1 = ainternalparser.length;
            obj1 = datetimeparserbucket.saveState();
            obj = null;
            l = 0;
            k = i;
            j = i;
_L3:
            InternalParser internalparser;
            if (l >= j1)
            {
                break MISSING_BLOCK_LABEL_208;
            }
            internalparser = ainternalparser[l];
            if (internalparser != null) goto _L2; else goto _L1
_L1:
            if (j <= i)
            {
                return i;
            }
            l = 1;
_L4:
            int i1;
            if (j > i || j == i && l != 0)
            {
                if (obj != null)
                {
                    datetimeparserbucket.restoreState(obj);
                }
                return j;
            } else
            {
                return ~k;
            }
_L2:
            i1 = internalparser.parseInto(datetimeparserbucket, charsequence, i);
            if (i1 >= i)
            {
                if (i1 > j)
                {
                    if (i1 >= charsequence.length() || l + 1 >= j1 || ainternalparser[l + 1] == null)
                    {
                        return i1;
                    }
                    obj = datetimeparserbucket.saveState();
                    j = i1;
                }
            } else
            if (i1 < 0)
            {
                i1 = ~i1;
                if (i1 > k)
                {
                    k = i1;
                }
            }
            datetimeparserbucket.restoreState(obj1);
            l++;
              goto _L3
            l = 0;
              goto _L4
        }

        MatchingParser(InternalParser ainternalparser[])
        {
            iParsers = ainternalparser;
            int i = 0;
            int j = ainternalparser.length;
            do
            {
                j--;
                if (j < 0)
                {
                    break;
                }
                InternalParser internalparser = ainternalparser[j];
                if (internalparser != null)
                {
                    int k = internalparser.estimateParsedLength();
                    if (k > i)
                    {
                        i = k;
                    }
                }
            } while (true);
            iParsedLengthEstimate = i;
        }
    }

    static abstract class NumberFormatter
        implements InternalParser, InternalPrinter
    {

        protected final DateTimeFieldType iFieldType;
        protected final int iMaxParsedDigits;
        protected final boolean iSigned;

        public int estimateParsedLength()
        {
            return iMaxParsedDigits;
        }

        public int parseInto(DateTimeParserBucket datetimeparserbucket, CharSequence charsequence, int i)
        {
            int j;
            int k;
            int i1;
            i1 = Math.min(iMaxParsedDigits, charsequence.length() - i);
            k = 0;
            j = i;
            boolean flag = false;
            i = k;
            k = ((flag) ? 1 : 0);
_L10:
            int l = i;
            if (k >= i1) goto _L2; else goto _L1
_L1:
            char c = charsequence.charAt(j + k);
            if (k != 0 || c != '-' && c != '+' || !iSigned) goto _L4; else goto _L3
_L3:
            if (c == '-')
            {
                i = 1;
            } else
            {
                i = 0;
            }
            l = i;
            if (k + 1 >= i1) goto _L2; else goto _L5
_L5:
            c = charsequence.charAt(j + k + 1);
            l = i;
            if (c < '0') goto _L2; else goto _L6
_L6:
            if (c <= '9') goto _L8; else goto _L7
_L7:
            if (k == 0)
            {
                return ~j;
            }
              goto _L9
_L8:
            if (i != 0)
            {
                k++;
            } else
            {
                j++;
            }
            i1 = Math.min(i1 + 1, charsequence.length() - j);
              goto _L10
_L4:
            l = i;
            if (c < '0') goto _L2; else goto _L11
_L11:
            if (c <= '9') goto _L12; else goto _L7
_L12:
            k++;
              goto _L10
_L9:
            if (k < 9) goto _L14; else goto _L13
_L13:
            l = j + k;
            k = Integer.parseInt(charsequence.subSequence(j, l).toString());
_L15:
            datetimeparserbucket.saveField(iFieldType, k);
            return l;
_L14:
            int j1;
            int k1;
            if (i != 0)
            {
                l = j + 1;
            } else
            {
                l = j;
            }
            k1 = l + 1;
            try
            {
                l = charsequence.charAt(l);
            }
            // Misplaced declaration of an exception variable
            catch (DateTimeParserBucket datetimeparserbucket)
            {
                return ~j;
            }
            j1 = j + k;
            j = l - 48;
            for (k = k1; k < j1; k++)
            {
                j = (charsequence.charAt(k) + ((j << 3) + (j << 1))) - 48;
            }

            k = j;
            l = j1;
            if (i != 0)
            {
                k = -j;
                l = j1;
            }
            if (true) goto _L15; else goto _L2
_L2:
            i = l;
              goto _L7
        }

        NumberFormatter(DateTimeFieldType datetimefieldtype, int i, boolean flag)
        {
            iFieldType = datetimefieldtype;
            iMaxParsedDigits = i;
            iSigned = flag;
        }
    }

    static class PaddedNumber extends NumberFormatter
    {

        protected final int iMinPrintedDigits;

        public int estimatePrintedLength()
        {
            return iMaxParsedDigits;
        }

        public void printTo(Appendable appendable, long l, Chronology chronology, int i, DateTimeZone datetimezone, Locale locale)
            throws IOException
        {
            try
            {
                FormatUtils.appendPaddedInteger(appendable, iFieldType.getField(chronology).get(l), iMinPrintedDigits);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Chronology chronology)
            {
                DateTimeFormatterBuilder.appendUnknownString(appendable, iMinPrintedDigits);
            }
        }

        public void printTo(Appendable appendable, ReadablePartial readablepartial, Locale locale)
            throws IOException
        {
            if (readablepartial.isSupported(iFieldType))
            {
                try
                {
                    FormatUtils.appendPaddedInteger(appendable, readablepartial.get(iFieldType), iMinPrintedDigits);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (ReadablePartial readablepartial)
                {
                    DateTimeFormatterBuilder.appendUnknownString(appendable, iMinPrintedDigits);
                }
                return;
            } else
            {
                DateTimeFormatterBuilder.appendUnknownString(appendable, iMinPrintedDigits);
                return;
            }
        }

        protected PaddedNumber(DateTimeFieldType datetimefieldtype, int i, boolean flag, int j)
        {
            super(datetimefieldtype, i, flag);
            iMinPrintedDigits = j;
        }
    }

    static class StringLiteral
        implements InternalParser, InternalPrinter
    {

        private final String iValue;

        public int estimateParsedLength()
        {
            return iValue.length();
        }

        public int estimatePrintedLength()
        {
            return iValue.length();
        }

        public int parseInto(DateTimeParserBucket datetimeparserbucket, CharSequence charsequence, int i)
        {
            if (DateTimeFormatterBuilder.csStartsWithIgnoreCase(charsequence, i, iValue))
            {
                return iValue.length() + i;
            } else
            {
                return ~i;
            }
        }

        public void printTo(Appendable appendable, long l, Chronology chronology, int i, DateTimeZone datetimezone, Locale locale)
            throws IOException
        {
            appendable.append(iValue);
        }

        public void printTo(Appendable appendable, ReadablePartial readablepartial, Locale locale)
            throws IOException
        {
            appendable.append(iValue);
        }

        StringLiteral(String s)
        {
            iValue = s;
        }
    }

    static class TextField
        implements InternalParser, InternalPrinter
    {

        private static Map cParseCache = new ConcurrentHashMap();
        private final DateTimeFieldType iFieldType;
        private final boolean iShort;

        private String print(long l, Chronology chronology, Locale locale)
        {
            chronology = iFieldType.getField(chronology);
            if (iShort)
            {
                return chronology.getAsShortText(l, locale);
            } else
            {
                return chronology.getAsText(l, locale);
            }
        }

        private String print(ReadablePartial readablepartial, Locale locale)
        {
            if (readablepartial.isSupported(iFieldType))
            {
                DateTimeField datetimefield = iFieldType.getField(readablepartial.getChronology());
                if (iShort)
                {
                    return datetimefield.getAsShortText(readablepartial, locale);
                } else
                {
                    return datetimefield.getAsText(readablepartial, locale);
                }
            } else
            {
                return "\uFFFD";
            }
        }

        public int estimateParsedLength()
        {
            return estimatePrintedLength();
        }

        public int estimatePrintedLength()
        {
            return !iShort ? 20 : 6;
        }

        public int parseInto(DateTimeParserBucket datetimeparserbucket, CharSequence charsequence, int i)
        {
            Locale locale = datetimeparserbucket.getLocale();
            Object obj = (Map)cParseCache.get(locale);
            if (obj == null)
            {
                obj = new ConcurrentHashMap();
                cParseCache.put(locale, obj);
            }
            Object obj1 = ((Object) ((Object[])((Map) (obj)).get(iFieldType)));
            int j;
            if (obj1 == null)
            {
                obj1 = new ConcurrentHashMap(32);
                org.joda.time.MutableDateTime.Property property = (new MutableDateTime(0L, DateTimeZone.UTC)).property(iFieldType);
                j = property.getMinimumValueOverall();
                int l = property.getMaximumValueOverall();
                if (l - j > 32)
                {
                    return ~i;
                }
                int k = property.getMaximumTextLength(locale);
                for (; j <= l; j++)
                {
                    property.set(j);
                    ((Map) (obj1)).put(property.getAsShortText(locale), Boolean.TRUE);
                    ((Map) (obj1)).put(property.getAsShortText(locale).toLowerCase(locale), Boolean.TRUE);
                    ((Map) (obj1)).put(property.getAsShortText(locale).toUpperCase(locale), Boolean.TRUE);
                    ((Map) (obj1)).put(property.getAsText(locale), Boolean.TRUE);
                    ((Map) (obj1)).put(property.getAsText(locale).toLowerCase(locale), Boolean.TRUE);
                    ((Map) (obj1)).put(property.getAsText(locale).toUpperCase(locale), Boolean.TRUE);
                }

                j = k;
                if ("en".equals(locale.getLanguage()))
                {
                    j = k;
                    if (iFieldType == DateTimeFieldType.era())
                    {
                        ((Map) (obj1)).put("BCE", Boolean.TRUE);
                        ((Map) (obj1)).put("bce", Boolean.TRUE);
                        ((Map) (obj1)).put("CE", Boolean.TRUE);
                        ((Map) (obj1)).put("ce", Boolean.TRUE);
                        j = 3;
                    }
                }
                ((Map) (obj)).put(iFieldType, ((Object) (new Object[] {
                    obj1, Integer.valueOf(j)
                })));
                obj = obj1;
            } else
            {
                obj = (Map)obj1[0];
                j = ((Integer)obj1[1]).intValue();
            }
            for (j = Math.min(charsequence.length(), j + i); j > i; j--)
            {
                obj1 = charsequence.subSequence(i, j).toString();
                if (((Map) (obj)).containsKey(obj1))
                {
                    datetimeparserbucket.saveField(iFieldType, ((String) (obj1)), locale);
                    return j;
                }
            }

            return ~i;
        }

        public void printTo(Appendable appendable, long l, Chronology chronology, int i, DateTimeZone datetimezone, Locale locale)
            throws IOException
        {
            try
            {
                appendable.append(print(l, chronology, locale));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Chronology chronology)
            {
                appendable.append('\uFFFD');
            }
        }

        public void printTo(Appendable appendable, ReadablePartial readablepartial, Locale locale)
            throws IOException
        {
            try
            {
                appendable.append(print(readablepartial, locale));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ReadablePartial readablepartial)
            {
                appendable.append('\uFFFD');
            }
        }


        TextField(DateTimeFieldType datetimefieldtype, boolean flag)
        {
            iFieldType = datetimefieldtype;
            iShort = flag;
        }
    }

    static final class TimeZoneId extends Enum
        implements InternalParser, InternalPrinter
    {

        private static final TimeZoneId $VALUES[];
        static final Set ALL_IDS;
        public static final TimeZoneId INSTANCE;
        static final int MAX_LENGTH;

        public static TimeZoneId valueOf(String s)
        {
            return (TimeZoneId)Enum.valueOf(org/joda/time/format/DateTimeFormatterBuilder$TimeZoneId, s);
        }

        public static final TimeZoneId[] values()
        {
            return (TimeZoneId[])$VALUES.clone();
        }

        public int estimateParsedLength()
        {
            return MAX_LENGTH;
        }

        public int estimatePrintedLength()
        {
            return MAX_LENGTH;
        }

        public int parseInto(DateTimeParserBucket datetimeparserbucket, CharSequence charsequence, int i)
        {
            String s;
            Iterator iterator;
            s = null;
            iterator = ALL_IDS.iterator();
_L2:
            String s1;
            if (!iterator.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            String s2 = (String)iterator.next();
            if (!DateTimeFormatterBuilder.csStartsWith(charsequence, i, s2))
            {
                break MISSING_BLOCK_LABEL_104;
            }
            s1 = s2;
            if (s != null)
            {
                if (s2.length() <= s.length())
                {
                    break MISSING_BLOCK_LABEL_104;
                }
                s1 = s2;
            }
_L3:
            s = s1;
            if (true) goto _L2; else goto _L1
_L1:
            if (s != null)
            {
                datetimeparserbucket.setZone(DateTimeZone.forID(s));
                return s.length() + i;
            } else
            {
                return ~i;
            }
            s1 = s;
              goto _L3
        }

        public void printTo(Appendable appendable, long l, Chronology chronology, int i, DateTimeZone datetimezone, Locale locale)
            throws IOException
        {
            if (datetimezone != null)
            {
                chronology = datetimezone.getID();
            } else
            {
                chronology = "";
            }
            appendable.append(chronology);
        }

        public void printTo(Appendable appendable, ReadablePartial readablepartial, Locale locale)
            throws IOException
        {
        }

        static 
        {
            INSTANCE = new TimeZoneId("INSTANCE", 0);
            $VALUES = (new TimeZoneId[] {
                INSTANCE
            });
            ALL_IDS = DateTimeZone.getAvailableIDs();
            Iterator iterator = ALL_IDS.iterator();
            int i;
            for (i = 0; iterator.hasNext(); i = Math.max(i, ((String)iterator.next()).length())) { }
            MAX_LENGTH = i;
        }

        private TimeZoneId(String s, int i)
        {
            super(s, i);
        }
    }

    static class TimeZoneName
        implements InternalParser, InternalPrinter
    {

        static final int LONG_NAME = 0;
        static final int SHORT_NAME = 1;
        private final Map iParseLookup;
        private final int iType;

        private String print(long l, DateTimeZone datetimezone, Locale locale)
        {
            if (datetimezone == null)
            {
                return "";
            }
            switch (iType)
            {
            default:
                return "";

            case 0: // '\0'
                return datetimezone.getName(l, locale);

            case 1: // '\001'
                return datetimezone.getShortName(l, locale);
            }
        }

        public int estimateParsedLength()
        {
            return iType != 1 ? 20 : 4;
        }

        public int estimatePrintedLength()
        {
            return iType != 1 ? 20 : 4;
        }

        public int parseInto(DateTimeParserBucket datetimeparserbucket, CharSequence charsequence, int i)
        {
            String s;
            String s1;
            Map map;
            map = iParseLookup;
            String s2;
            Iterator iterator;
            if (map == null)
            {
                map = DateTimeUtils.getDefaultTimeZoneNames();
            }
            s = null;
            iterator = map.keySet().iterator();
            if (!iterator.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            s2 = (String)iterator.next();
            if (!DateTimeFormatterBuilder.csStartsWith(charsequence, i, s2))
            {
                break MISSING_BLOCK_LABEL_134;
            }
            s1 = s2;
            if (s != null)
            {
                if (s2.length() <= s.length())
                {
                    break MISSING_BLOCK_LABEL_134;
                }
                s1 = s2;
            }
_L4:
            s = s1;
            if (true) goto _L2; else goto _L1
_L2:
            break MISSING_BLOCK_LABEL_28;
_L1:
            if (s != null)
            {
                datetimeparserbucket.setZone((DateTimeZone)map.get(s));
                return s.length() + i;
            } else
            {
                return ~i;
            }
            s1 = s;
            if (true) goto _L4; else goto _L3
_L3:
        }

        public void printTo(Appendable appendable, long l, Chronology chronology, int i, DateTimeZone datetimezone, Locale locale)
            throws IOException
        {
            appendable.append(print(l - (long)i, datetimezone, locale));
        }

        public void printTo(Appendable appendable, ReadablePartial readablepartial, Locale locale)
            throws IOException
        {
        }

        TimeZoneName(int i, Map map)
        {
            iType = i;
            iParseLookup = map;
        }
    }

    static class TimeZoneOffset
        implements InternalParser, InternalPrinter
    {

        private final int iMaxFields;
        private final int iMinFields;
        private final boolean iShowSeparators;
        private final String iZeroOffsetParseText;
        private final String iZeroOffsetPrintText;

        private int digitCount(CharSequence charsequence, int i, int j)
        {
            j = Math.min(charsequence.length() - i, j);
            int k = 0;
            do
            {
label0:
                {
                    if (j > 0)
                    {
                        char c = charsequence.charAt(i + k);
                        if (c >= '0' && c <= '9')
                        {
                            break label0;
                        }
                    }
                    return k;
                }
                k++;
                j--;
            } while (true);
        }

        public int estimateParsedLength()
        {
            return estimatePrintedLength();
        }

        public int estimatePrintedLength()
        {
            int j = iMinFields + 1 << 1;
            int i = j;
            if (iShowSeparators)
            {
                i = j + (iMinFields - 1);
            }
            j = i;
            if (iZeroOffsetPrintText != null)
            {
                j = i;
                if (iZeroOffsetPrintText.length() > i)
                {
                    j = iZeroOffsetPrintText.length();
                }
            }
            return j;
        }

        public int parseInto(DateTimeParserBucket datetimeparserbucket, CharSequence charsequence, int i)
        {
            int j;
            boolean flag1;
            flag1 = false;
            j = charsequence.length() - i;
            if (iZeroOffsetParseText == null) goto _L2; else goto _L1
_L1:
            if (iZeroOffsetParseText.length() != 0) goto _L4; else goto _L3
_L3:
            if (j <= 0) goto _L6; else goto _L5
_L5:
            int k = charsequence.charAt(i);
            if (k != '-' && k != '+') goto _L6; else goto _L2
_L2:
            if (j <= 1)
            {
                return ~i;
            }
            break; /* Loop/switch isn't completed */
_L6:
            datetimeparserbucket.setOffset(Integer.valueOf(0));
            return i;
_L4:
            if (DateTimeFormatterBuilder.csStartsWithIgnoreCase(charsequence, i, iZeroOffsetParseText))
            {
                datetimeparserbucket.setOffset(Integer.valueOf(0));
                return i + iZeroOffsetParseText.length();
            }
            if (true) goto _L2; else goto _L7
_L7:
            boolean flag;
            int l;
            k = charsequence.charAt(i);
            if (k == 45)
            {
                flag = true;
            } else
            if (k == 43)
            {
                flag = false;
            } else
            {
                return ~i;
            }
            k = i + 1;
            if (digitCount(charsequence, k, 2) < 2)
            {
                return ~k;
            }
            i = FormatUtils.parseTwoDigits(charsequence, k);
            if (i > 23)
            {
                return ~k;
            }
            i *= 0x36ee80;
            l = j - 1 - 2;
            k += 2;
            if (l > 0) goto _L9; else goto _L8
_L8:
            j = k;
_L15:
            if (flag)
            {
                i = -i;
            }
            datetimeparserbucket.setOffset(Integer.valueOf(i));
            return j;
_L9:
            char c = charsequence.charAt(k);
            if (c != ':') goto _L11; else goto _L10
_L10:
            j = k + 1;
            l--;
            flag1 = true;
_L13:
            k = digitCount(charsequence, j, 2);
            if (k == 0 && !flag1)
            {
                continue; /* Loop/switch isn't completed */
            }
            break MISSING_BLOCK_LABEL_311;
_L11:
            if (c < '0')
            {
                break; /* Loop/switch isn't completed */
            }
            j = k;
            if (c <= '9') goto _L13; else goto _L12
_L12:
            j = k;
            continue; /* Loop/switch isn't completed */
            if (k < 2)
            {
                return ~j;
            }
            k = FormatUtils.parseTwoDigits(charsequence, j);
            if (k > 59)
            {
                return ~j;
            }
            i += k * 60000;
            int i1 = l - 2;
            k = j + 2;
            if (i1 <= 0)
            {
                j = k;
                continue; /* Loop/switch isn't completed */
            }
            l = i1;
            j = k;
            if (flag1)
            {
                if (charsequence.charAt(k) != ':')
                {
                    j = k;
                    continue; /* Loop/switch isn't completed */
                }
                l = i1 - 1;
                j = k + 1;
            }
            k = digitCount(charsequence, j, 2);
            if (k == 0 && !flag1)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (k < 2)
            {
                return ~j;
            }
            k = FormatUtils.parseTwoDigits(charsequence, j);
            if (k > 59)
            {
                return ~j;
            }
            i += k * 1000;
            k = l - 2;
            j += 2;
            if (k <= 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            k = j;
            if (flag1)
            {
                if (charsequence.charAt(j) != '.' && charsequence.charAt(j) != ',')
                {
                    continue; /* Loop/switch isn't completed */
                }
                k = j + 1;
            }
            l = digitCount(charsequence, k, 3);
            if (l == 0 && !flag1)
            {
                j = k;
            } else
            {
                if (l < 1)
                {
                    return ~k;
                }
                j = k + 1;
                k = (charsequence.charAt(k) - 48) * 100 + i;
                if (l > 1)
                {
                    i = j + 1;
                    k = (charsequence.charAt(j) - 48) * 10 + k;
                    if (l > 2)
                    {
                        j = k + (charsequence.charAt(i) - 48);
                        k = i + 1;
                        i = j;
                        j = k;
                    } else
                    {
                        j = i;
                        i = k;
                    }
                } else
                {
                    i = k;
                }
            }
            if (true) goto _L15; else goto _L14
_L14:
        }

        public void printTo(Appendable appendable, long l, Chronology chronology, int i, DateTimeZone datetimezone, Locale locale)
            throws IOException
        {
            if (datetimezone != null)
            {
                if (i == 0 && iZeroOffsetPrintText != null)
                {
                    appendable.append(iZeroOffsetPrintText);
                    return;
                }
                int j;
                if (i >= 0)
                {
                    appendable.append('+');
                } else
                {
                    appendable.append('-');
                    i = -i;
                }
                j = i / 0x36ee80;
                FormatUtils.appendPaddedInteger(appendable, j, 2);
                if (iMaxFields != 1)
                {
                    i -= j * 0x36ee80;
                    if (i != 0 || iMinFields > 1)
                    {
                        int k = i / 60000;
                        if (iShowSeparators)
                        {
                            appendable.append(':');
                        }
                        FormatUtils.appendPaddedInteger(appendable, k, 2);
                        if (iMaxFields != 2)
                        {
                            i -= k * 60000;
                            if (i != 0 || iMinFields > 2)
                            {
                                int i1 = i / 1000;
                                if (iShowSeparators)
                                {
                                    appendable.append(':');
                                }
                                FormatUtils.appendPaddedInteger(appendable, i1, 2);
                                if (iMaxFields != 3)
                                {
                                    i -= i1 * 1000;
                                    if (i != 0 || iMinFields > 3)
                                    {
                                        if (iShowSeparators)
                                        {
                                            appendable.append('.');
                                        }
                                        FormatUtils.appendPaddedInteger(appendable, i, 3);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        public void printTo(Appendable appendable, ReadablePartial readablepartial, Locale locale)
            throws IOException
        {
        }

        TimeZoneOffset(String s, String s1, boolean flag, int i, int j)
        {
            byte byte0 = 4;
            super();
            iZeroOffsetPrintText = s;
            iZeroOffsetParseText = s1;
            iShowSeparators = flag;
            if (i <= 0 || j < i)
            {
                throw new IllegalArgumentException();
            }
            if (i > 4)
            {
                j = 4;
                i = byte0;
            }
            iMinFields = i;
            iMaxFields = j;
        }
    }

    static class TwoDigitYear
        implements InternalParser, InternalPrinter
    {

        private final boolean iLenientParse;
        private final int iPivot;
        private final DateTimeFieldType iType;

        private int getTwoDigitYear(long l, Chronology chronology)
        {
            int i;
            int j;
            try
            {
                j = iType.getField(chronology).get(l);
            }
            // Misplaced declaration of an exception variable
            catch (Chronology chronology)
            {
                return -1;
            }
            i = j;
            if (j < 0)
            {
                i = -j;
            }
            return i % 100;
        }

        private int getTwoDigitYear(ReadablePartial readablepartial)
        {
            if (!readablepartial.isSupported(iType))
            {
                break MISSING_BLOCK_LABEL_39;
            }
            int j = readablepartial.get(iType);
            int i = j;
            if (j < 0)
            {
                i = -j;
            }
            return i % 100;
            readablepartial;
            return -1;
        }

        public int estimateParsedLength()
        {
            return !iLenientParse ? 2 : 4;
        }

        public int estimatePrintedLength()
        {
            return 2;
        }

        public int parseInto(DateTimeParserBucket datetimeparserbucket, CharSequence charsequence, int i)
        {
            int l;
            char c1;
            c1 = '\0';
            l = charsequence.length() - i;
            if (iLenientParse) goto _L2; else goto _L1
_L1:
            int k;
            k = i;
            if (Math.min(2, l) < 2)
            {
                return ~i;
            }
              goto _L3
_L2:
            boolean flag;
            int j;
            j = 0;
            flag = false;
            k = 0;
label0:
            do
            {
label1:
                {
                    if (j < l)
                    {
                        char c2 = charsequence.charAt(i + j);
                        if (j == 0 && (c2 == '-' || c2 == '+'))
                        {
                            if (c2 == '-')
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                            if (flag)
                            {
                                j++;
                                k = 1;
                            } else
                            {
                                i++;
                                k = 1;
                                l--;
                            }
                            continue;
                        }
                        if (c2 >= '0' && c2 <= '9')
                        {
                            break label1;
                        }
                    }
                    if (j == 0)
                    {
                        return ~i;
                    }
                    break label0;
                }
                j++;
            } while (true);
            if (k != 0) goto _L5; else goto _L4
_L4:
            k = i;
            if (j == 2) goto _L3; else goto _L5
_L5:
            if (j < 9) goto _L7; else goto _L6
_L6:
            k = i + j;
            j = Integer.parseInt(charsequence.subSequence(i, k).toString());
_L8:
            datetimeparserbucket.saveField(iType, j);
            return k;
_L7:
            char c;
            int i1;
            if (flag)
            {
                k = i + 1;
            } else
            {
                k = i;
            }
            try
            {
                c1 = charsequence.charAt(k);
            }
            // Misplaced declaration of an exception variable
            catch (DateTimeParserBucket datetimeparserbucket)
            {
                return ~i;
            }
            i1 = i + j;
            i = c1 - 48;
            for (j = k + 1; j < i1; j++)
            {
                i = (charsequence.charAt(j) + ((i << 3) + (i << 1))) - 48;
            }

            j = i;
            k = i1;
            if (flag)
            {
                j = -i;
                k = i1;
            }
            if (true) goto _L8; else goto _L3
_L3:
            i = charsequence.charAt(k);
            if (i < 48 || i > 57)
            {
                return ~k;
            }
            i -= 48;
            c = charsequence.charAt(k + 1);
            if (c < '0' || c > '9')
            {
                return ~k;
            }
            j = ((i << 1) + (i << 3) + c) - 48;
            i = iPivot;
            if (datetimeparserbucket.getPivotYear() != null)
            {
                i = datetimeparserbucket.getPivotYear().intValue();
            }
            i1 = i - 50;
            if (i1 >= 0)
            {
                i = i1 % 100;
            } else
            {
                i = (i1 + 1) % 100 + 99;
            }
            c = c1;
            if (j < i)
            {
                c = 'd';
            }
            datetimeparserbucket.saveField(iType, ((c + i1) - i) + j);
            return k + 2;
        }

        public void printTo(Appendable appendable, long l, Chronology chronology, int i, DateTimeZone datetimezone, Locale locale)
            throws IOException
        {
            i = getTwoDigitYear(l, chronology);
            if (i < 0)
            {
                appendable.append('\uFFFD');
                appendable.append('\uFFFD');
                return;
            } else
            {
                FormatUtils.appendPaddedInteger(appendable, i, 2);
                return;
            }
        }

        public void printTo(Appendable appendable, ReadablePartial readablepartial, Locale locale)
            throws IOException
        {
            int i = getTwoDigitYear(readablepartial);
            if (i < 0)
            {
                appendable.append('\uFFFD');
                appendable.append('\uFFFD');
                return;
            } else
            {
                FormatUtils.appendPaddedInteger(appendable, i, 2);
                return;
            }
        }

        TwoDigitYear(DateTimeFieldType datetimefieldtype, int i, boolean flag)
        {
            iType = datetimefieldtype;
            iPivot = i;
            iLenientParse = flag;
        }
    }

    static class UnpaddedNumber extends NumberFormatter
    {

        public int estimatePrintedLength()
        {
            return iMaxParsedDigits;
        }

        public void printTo(Appendable appendable, long l, Chronology chronology, int i, DateTimeZone datetimezone, Locale locale)
            throws IOException
        {
            try
            {
                FormatUtils.appendUnpaddedInteger(appendable, iFieldType.getField(chronology).get(l));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Chronology chronology)
            {
                appendable.append('\uFFFD');
            }
        }

        public void printTo(Appendable appendable, ReadablePartial readablepartial, Locale locale)
            throws IOException
        {
            if (readablepartial.isSupported(iFieldType))
            {
                try
                {
                    FormatUtils.appendUnpaddedInteger(appendable, readablepartial.get(iFieldType));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (ReadablePartial readablepartial)
                {
                    appendable.append('\uFFFD');
                }
                return;
            } else
            {
                appendable.append('\uFFFD');
                return;
            }
        }

        protected UnpaddedNumber(DateTimeFieldType datetimefieldtype, int i, boolean flag)
        {
            super(datetimefieldtype, i, flag);
        }
    }


    private ArrayList iElementPairs;
    private Object iFormatter;

    public DateTimeFormatterBuilder()
    {
        iElementPairs = new ArrayList();
    }

    private DateTimeFormatterBuilder append0(Object obj)
    {
        iFormatter = null;
        iElementPairs.add(obj);
        iElementPairs.add(obj);
        return this;
    }

    private DateTimeFormatterBuilder append0(InternalPrinter internalprinter, InternalParser internalparser)
    {
        iFormatter = null;
        iElementPairs.add(internalprinter);
        iElementPairs.add(internalparser);
        return this;
    }

    static void appendUnknownString(Appendable appendable, int i)
        throws IOException
    {
        do
        {
            i--;
            if (i >= 0)
            {
                appendable.append('\uFFFD');
            } else
            {
                return;
            }
        } while (true);
    }

    private void checkParser(DateTimeParser datetimeparser)
    {
        if (datetimeparser == null)
        {
            throw new IllegalArgumentException("No parser supplied");
        } else
        {
            return;
        }
    }

    private void checkPrinter(DateTimePrinter datetimeprinter)
    {
        if (datetimeprinter == null)
        {
            throw new IllegalArgumentException("No printer supplied");
        } else
        {
            return;
        }
    }

    static boolean csStartsWith(CharSequence charsequence, int i, String s)
    {
        int k = s.length();
        if (charsequence.length() - i >= k) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = 0;
label0:
        do
        {
label1:
            {
                if (j >= k)
                {
                    break label1;
                }
                if (charsequence.charAt(i + j) != s.charAt(j))
                {
                    break label0;
                }
                j++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    static boolean csStartsWithIgnoreCase(CharSequence charsequence, int i, String s)
    {
        int k = s.length();
        if (charsequence.length() - i >= k) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = 0;
_L6:
        if (j >= k) goto _L4; else goto _L3
_L3:
        char c;
        char c1;
        c1 = charsequence.charAt(i + j);
        c = s.charAt(j);
        if (c1 == c)
        {
            continue; /* Loop/switch isn't completed */
        }
        c1 = Character.toUpperCase(c1);
        c = Character.toUpperCase(c);
        if (c1 != c && Character.toLowerCase(c1) != Character.toLowerCase(c)) goto _L1; else goto _L5
_L5:
        j++;
          goto _L6
_L4:
        return true;
    }

    private Object getFormatter()
    {
        Object obj;
        Object obj1;
        obj1 = iFormatter;
        obj = obj1;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        obj = obj1;
        if (iElementPairs.size() != 2) goto _L4; else goto _L3
_L3:
        Object obj3;
        Object obj4;
        obj3 = iElementPairs.get(0);
        obj4 = iElementPairs.get(1);
        if (obj3 == null) goto _L6; else goto _L5
_L5:
        if (obj3 == obj4) goto _L8; else goto _L7
_L7:
        obj = obj1;
        if (obj4 != null) goto _L4; else goto _L8
_L8:
        obj = obj3;
_L4:
        Object obj2 = obj;
        if (obj == null)
        {
            obj2 = new Composite(iElementPairs);
        }
        iFormatter = obj2;
        obj = obj2;
_L2:
        return obj;
_L6:
        obj = obj4;
        if (true) goto _L4; else goto _L9
_L9:
    }

    private boolean isFormatter(Object obj)
    {
        return isPrinter(obj) || isParser(obj);
    }

    private boolean isParser(Object obj)
    {
        if (obj instanceof InternalParser)
        {
            if (obj instanceof Composite)
            {
                return ((Composite)obj).isParser();
            } else
            {
                return true;
            }
        } else
        {
            return false;
        }
    }

    private boolean isPrinter(Object obj)
    {
        if (obj instanceof InternalPrinter)
        {
            if (obj instanceof Composite)
            {
                return ((Composite)obj).isPrinter();
            } else
            {
                return true;
            }
        } else
        {
            return false;
        }
    }

    public DateTimeFormatterBuilder append(DateTimeFormatter datetimeformatter)
    {
        if (datetimeformatter == null)
        {
            throw new IllegalArgumentException("No formatter supplied");
        } else
        {
            return append0(datetimeformatter.getPrinter0(), datetimeformatter.getParser0());
        }
    }

    public DateTimeFormatterBuilder append(DateTimeParser datetimeparser)
    {
        checkParser(datetimeparser);
        return append0(null, DateTimeParserInternalParser.of(datetimeparser));
    }

    public DateTimeFormatterBuilder append(DateTimePrinter datetimeprinter)
    {
        checkPrinter(datetimeprinter);
        return append0(DateTimePrinterInternalPrinter.of(datetimeprinter), null);
    }

    public DateTimeFormatterBuilder append(DateTimePrinter datetimeprinter, DateTimeParser datetimeparser)
    {
        checkPrinter(datetimeprinter);
        checkParser(datetimeparser);
        return append0(DateTimePrinterInternalPrinter.of(datetimeprinter), DateTimeParserInternalParser.of(datetimeparser));
    }

    public DateTimeFormatterBuilder append(DateTimePrinter datetimeprinter, DateTimeParser adatetimeparser[])
    {
        int i = 0;
        if (datetimeprinter != null)
        {
            checkPrinter(datetimeprinter);
        }
        if (adatetimeparser == null)
        {
            throw new IllegalArgumentException("No parsers supplied");
        }
        int j = adatetimeparser.length;
        if (j == 1)
        {
            if (adatetimeparser[0] == null)
            {
                throw new IllegalArgumentException("No parser supplied");
            } else
            {
                return append0(DateTimePrinterInternalPrinter.of(datetimeprinter), DateTimeParserInternalParser.of(adatetimeparser[0]));
            }
        }
        InternalParser ainternalparser[] = new InternalParser[j];
        for (; i < j - 1; i++)
        {
            InternalParser internalparser = DateTimeParserInternalParser.of(adatetimeparser[i]);
            ainternalparser[i] = internalparser;
            if (internalparser == null)
            {
                throw new IllegalArgumentException("Incomplete parser array");
            }
        }

        ainternalparser[i] = DateTimeParserInternalParser.of(adatetimeparser[i]);
        return append0(DateTimePrinterInternalPrinter.of(datetimeprinter), new MatchingParser(ainternalparser));
    }

    public DateTimeFormatterBuilder appendCenturyOfEra(int i, int j)
    {
        return appendSignedDecimal(DateTimeFieldType.centuryOfEra(), i, j);
    }

    public DateTimeFormatterBuilder appendClockhourOfDay(int i)
    {
        return appendDecimal(DateTimeFieldType.clockhourOfDay(), i, 2);
    }

    public DateTimeFormatterBuilder appendClockhourOfHalfday(int i)
    {
        return appendDecimal(DateTimeFieldType.clockhourOfHalfday(), i, 2);
    }

    public DateTimeFormatterBuilder appendDayOfMonth(int i)
    {
        return appendDecimal(DateTimeFieldType.dayOfMonth(), i, 2);
    }

    public DateTimeFormatterBuilder appendDayOfWeek(int i)
    {
        return appendDecimal(DateTimeFieldType.dayOfWeek(), i, 1);
    }

    public DateTimeFormatterBuilder appendDayOfWeekShortText()
    {
        return appendShortText(DateTimeFieldType.dayOfWeek());
    }

    public DateTimeFormatterBuilder appendDayOfWeekText()
    {
        return appendText(DateTimeFieldType.dayOfWeek());
    }

    public DateTimeFormatterBuilder appendDayOfYear(int i)
    {
        return appendDecimal(DateTimeFieldType.dayOfYear(), i, 3);
    }

    public DateTimeFormatterBuilder appendDecimal(DateTimeFieldType datetimefieldtype, int i, int j)
    {
        if (datetimefieldtype == null)
        {
            throw new IllegalArgumentException("Field type must not be null");
        }
        int k = j;
        if (j < i)
        {
            k = i;
        }
        if (i < 0 || k <= 0)
        {
            throw new IllegalArgumentException();
        }
        if (i <= 1)
        {
            return append0(new UnpaddedNumber(datetimefieldtype, k, false));
        } else
        {
            return append0(new PaddedNumber(datetimefieldtype, k, false, i));
        }
    }

    public DateTimeFormatterBuilder appendEraText()
    {
        return appendText(DateTimeFieldType.era());
    }

    public DateTimeFormatterBuilder appendFixedDecimal(DateTimeFieldType datetimefieldtype, int i)
    {
        if (datetimefieldtype == null)
        {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i <= 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Illegal number of digits: ").append(i).toString());
        } else
        {
            return append0(new FixedNumber(datetimefieldtype, i, false));
        }
    }

    public DateTimeFormatterBuilder appendFixedSignedDecimal(DateTimeFieldType datetimefieldtype, int i)
    {
        if (datetimefieldtype == null)
        {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i <= 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Illegal number of digits: ").append(i).toString());
        } else
        {
            return append0(new FixedNumber(datetimefieldtype, i, true));
        }
    }

    public DateTimeFormatterBuilder appendFraction(DateTimeFieldType datetimefieldtype, int i, int j)
    {
        if (datetimefieldtype == null)
        {
            throw new IllegalArgumentException("Field type must not be null");
        }
        int k = j;
        if (j < i)
        {
            k = i;
        }
        if (i < 0 || k <= 0)
        {
            throw new IllegalArgumentException();
        } else
        {
            return append0(new Fraction(datetimefieldtype, i, k));
        }
    }

    public DateTimeFormatterBuilder appendFractionOfDay(int i, int j)
    {
        return appendFraction(DateTimeFieldType.dayOfYear(), i, j);
    }

    public DateTimeFormatterBuilder appendFractionOfHour(int i, int j)
    {
        return appendFraction(DateTimeFieldType.hourOfDay(), i, j);
    }

    public DateTimeFormatterBuilder appendFractionOfMinute(int i, int j)
    {
        return appendFraction(DateTimeFieldType.minuteOfDay(), i, j);
    }

    public DateTimeFormatterBuilder appendFractionOfSecond(int i, int j)
    {
        return appendFraction(DateTimeFieldType.secondOfDay(), i, j);
    }

    public DateTimeFormatterBuilder appendHalfdayOfDayText()
    {
        return appendText(DateTimeFieldType.halfdayOfDay());
    }

    public DateTimeFormatterBuilder appendHourOfDay(int i)
    {
        return appendDecimal(DateTimeFieldType.hourOfDay(), i, 2);
    }

    public DateTimeFormatterBuilder appendHourOfHalfday(int i)
    {
        return appendDecimal(DateTimeFieldType.hourOfHalfday(), i, 2);
    }

    public DateTimeFormatterBuilder appendLiteral(char c)
    {
        return append0(new CharacterLiteral(c));
    }

    public DateTimeFormatterBuilder appendLiteral(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Literal must not be null");
        }
        DateTimeFormatterBuilder datetimeformatterbuilder = this;
        switch (s.length())
        {
        default:
            datetimeformatterbuilder = append0(new StringLiteral(s));
            // fall through

        case 0: // '\0'
            return datetimeformatterbuilder;

        case 1: // '\001'
            return append0(new CharacterLiteral(s.charAt(0)));
        }
    }

    public DateTimeFormatterBuilder appendMillisOfDay(int i)
    {
        return appendDecimal(DateTimeFieldType.millisOfDay(), i, 8);
    }

    public DateTimeFormatterBuilder appendMillisOfSecond(int i)
    {
        return appendDecimal(DateTimeFieldType.millisOfSecond(), i, 3);
    }

    public DateTimeFormatterBuilder appendMinuteOfDay(int i)
    {
        return appendDecimal(DateTimeFieldType.minuteOfDay(), i, 4);
    }

    public DateTimeFormatterBuilder appendMinuteOfHour(int i)
    {
        return appendDecimal(DateTimeFieldType.minuteOfHour(), i, 2);
    }

    public DateTimeFormatterBuilder appendMonthOfYear(int i)
    {
        return appendDecimal(DateTimeFieldType.monthOfYear(), i, 2);
    }

    public DateTimeFormatterBuilder appendMonthOfYearShortText()
    {
        return appendShortText(DateTimeFieldType.monthOfYear());
    }

    public DateTimeFormatterBuilder appendMonthOfYearText()
    {
        return appendText(DateTimeFieldType.monthOfYear());
    }

    public DateTimeFormatterBuilder appendOptional(DateTimeParser datetimeparser)
    {
        checkParser(datetimeparser);
        return append0(null, new MatchingParser(new InternalParser[] {
            DateTimeParserInternalParser.of(datetimeparser), null
        }));
    }

    public DateTimeFormatterBuilder appendPattern(String s)
    {
        DateTimeFormat.appendPatternTo(this, s);
        return this;
    }

    public DateTimeFormatterBuilder appendSecondOfDay(int i)
    {
        return appendDecimal(DateTimeFieldType.secondOfDay(), i, 5);
    }

    public DateTimeFormatterBuilder appendSecondOfMinute(int i)
    {
        return appendDecimal(DateTimeFieldType.secondOfMinute(), i, 2);
    }

    public DateTimeFormatterBuilder appendShortText(DateTimeFieldType datetimefieldtype)
    {
        if (datetimefieldtype == null)
        {
            throw new IllegalArgumentException("Field type must not be null");
        } else
        {
            return append0(new TextField(datetimefieldtype, true));
        }
    }

    public DateTimeFormatterBuilder appendSignedDecimal(DateTimeFieldType datetimefieldtype, int i, int j)
    {
        if (datetimefieldtype == null)
        {
            throw new IllegalArgumentException("Field type must not be null");
        }
        int k = j;
        if (j < i)
        {
            k = i;
        }
        if (i < 0 || k <= 0)
        {
            throw new IllegalArgumentException();
        }
        if (i <= 1)
        {
            return append0(new UnpaddedNumber(datetimefieldtype, k, true));
        } else
        {
            return append0(new PaddedNumber(datetimefieldtype, k, true, i));
        }
    }

    public DateTimeFormatterBuilder appendText(DateTimeFieldType datetimefieldtype)
    {
        if (datetimefieldtype == null)
        {
            throw new IllegalArgumentException("Field type must not be null");
        } else
        {
            return append0(new TextField(datetimefieldtype, false));
        }
    }

    public DateTimeFormatterBuilder appendTimeZoneId()
    {
        return append0(TimeZoneId.INSTANCE, TimeZoneId.INSTANCE);
    }

    public DateTimeFormatterBuilder appendTimeZoneName()
    {
        return append0(new TimeZoneName(0, null), null);
    }

    public DateTimeFormatterBuilder appendTimeZoneName(Map map)
    {
        map = new TimeZoneName(0, map);
        return append0(map, map);
    }

    public DateTimeFormatterBuilder appendTimeZoneOffset(String s, String s1, boolean flag, int i, int j)
    {
        return append0(new TimeZoneOffset(s, s1, flag, i, j));
    }

    public DateTimeFormatterBuilder appendTimeZoneOffset(String s, boolean flag, int i, int j)
    {
        return append0(new TimeZoneOffset(s, s, flag, i, j));
    }

    public DateTimeFormatterBuilder appendTimeZoneShortName()
    {
        return append0(new TimeZoneName(1, null), null);
    }

    public DateTimeFormatterBuilder appendTimeZoneShortName(Map map)
    {
        map = new TimeZoneName(1, map);
        return append0(map, map);
    }

    public DateTimeFormatterBuilder appendTwoDigitWeekyear(int i)
    {
        return appendTwoDigitWeekyear(i, false);
    }

    public DateTimeFormatterBuilder appendTwoDigitWeekyear(int i, boolean flag)
    {
        return append0(new TwoDigitYear(DateTimeFieldType.weekyear(), i, flag));
    }

    public DateTimeFormatterBuilder appendTwoDigitYear(int i)
    {
        return appendTwoDigitYear(i, false);
    }

    public DateTimeFormatterBuilder appendTwoDigitYear(int i, boolean flag)
    {
        return append0(new TwoDigitYear(DateTimeFieldType.year(), i, flag));
    }

    public DateTimeFormatterBuilder appendWeekOfWeekyear(int i)
    {
        return appendDecimal(DateTimeFieldType.weekOfWeekyear(), i, 2);
    }

    public DateTimeFormatterBuilder appendWeekyear(int i, int j)
    {
        return appendSignedDecimal(DateTimeFieldType.weekyear(), i, j);
    }

    public DateTimeFormatterBuilder appendYear(int i, int j)
    {
        return appendSignedDecimal(DateTimeFieldType.year(), i, j);
    }

    public DateTimeFormatterBuilder appendYearOfCentury(int i, int j)
    {
        return appendDecimal(DateTimeFieldType.yearOfCentury(), i, j);
    }

    public DateTimeFormatterBuilder appendYearOfEra(int i, int j)
    {
        return appendDecimal(DateTimeFieldType.yearOfEra(), i, j);
    }

    public boolean canBuildFormatter()
    {
        return isFormatter(getFormatter());
    }

    public boolean canBuildParser()
    {
        return isParser(getFormatter());
    }

    public boolean canBuildPrinter()
    {
        return isPrinter(getFormatter());
    }

    public void clear()
    {
        iFormatter = null;
        iElementPairs.clear();
    }

    public DateTimeFormatter toFormatter()
    {
        Object obj = getFormatter();
        InternalPrinter internalprinter;
        if (isPrinter(obj))
        {
            internalprinter = (InternalPrinter)obj;
        } else
        {
            internalprinter = null;
        }
        if (isParser(obj))
        {
            obj = (InternalParser)obj;
        } else
        {
            obj = null;
        }
        if (internalprinter != null || obj != null)
        {
            return new DateTimeFormatter(internalprinter, ((InternalParser) (obj)));
        } else
        {
            throw new UnsupportedOperationException("Both printing and parsing not supported");
        }
    }

    public DateTimeParser toParser()
    {
        Object obj = getFormatter();
        if (isParser(obj))
        {
            return InternalParserDateTimeParser.of((InternalParser)obj);
        } else
        {
            throw new UnsupportedOperationException("Parsing is not supported");
        }
    }

    public DateTimePrinter toPrinter()
    {
        Object obj = getFormatter();
        if (isPrinter(obj))
        {
            return InternalPrinterDateTimePrinter.of((InternalPrinter)obj);
        } else
        {
            throw new UnsupportedOperationException("Printing is not supported");
        }
    }
}
