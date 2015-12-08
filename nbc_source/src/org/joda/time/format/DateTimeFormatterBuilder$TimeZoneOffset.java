// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import java.io.IOException;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;

// Referenced classes of package org.joda.time.format:
//            InternalParser, InternalPrinter, DateTimeFormatterBuilder, DateTimeParserBucket, 
//            FormatUtils

static class iMaxFields
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

    (String s, String s1, boolean flag, int i, int j)
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
