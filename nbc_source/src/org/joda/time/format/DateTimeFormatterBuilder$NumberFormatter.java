// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import org.joda.time.DateTimeFieldType;

// Referenced classes of package org.joda.time.format:
//            InternalParser, InternalPrinter, DateTimeFormatterBuilder, DateTimeParserBucket

static abstract class iSigned
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

    (DateTimeFieldType datetimefieldtype, int i, boolean flag)
    {
        iFieldType = datetimefieldtype;
        iMaxParsedDigits = i;
        iSigned = flag;
    }
}
