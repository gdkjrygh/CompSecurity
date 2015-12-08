// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import java.io.IOException;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDateTimeField;

// Referenced classes of package org.joda.time.format:
//            InternalParser, InternalPrinter, DateTimeFormatterBuilder, DateTimeParserBucket

static class iMaxDigits
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
    //                   1 141
    //                   2 149
    //                   3 157
    //                   4 165
    //                   5 173
    //                   6 181
    //                   7 189
    //                   8 197
    //                   9 205
    //                   10 213
    //                   11 221
    //                   12 229
    //                   13 237
    //                   14 245
    //                   15 253
    //                   16 261
    //                   17 269
    //                   18 277;
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

    protected (DateTimeFieldType datetimefieldtype, int i, int j)
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
