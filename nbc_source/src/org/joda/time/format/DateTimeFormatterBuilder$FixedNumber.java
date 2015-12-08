// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import org.joda.time.DateTimeFieldType;

// Referenced classes of package org.joda.time.format:
//            DateTimeFormatterBuilder, DateTimeParserBucket

static class  extends 
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

    protected (DateTimeFieldType datetimefieldtype, int i, boolean flag)
    {
        super(datetimefieldtype, i, flag, i);
    }
}
