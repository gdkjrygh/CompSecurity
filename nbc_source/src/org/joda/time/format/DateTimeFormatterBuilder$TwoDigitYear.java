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
import org.joda.time.ReadablePartial;

// Referenced classes of package org.joda.time.format:
//            InternalParser, InternalPrinter, DateTimeFormatterBuilder, DateTimeParserBucket, 
//            FormatUtils

static class iLenientParse
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

    (DateTimeFieldType datetimefieldtype, int i, boolean flag)
    {
        iType = datetimefieldtype;
        iPivot = i;
        iLenientParse = flag;
    }
}
