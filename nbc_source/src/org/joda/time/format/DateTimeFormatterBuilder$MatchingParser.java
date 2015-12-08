// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;


// Referenced classes of package org.joda.time.format:
//            InternalParser, DateTimeFormatterBuilder, DateTimeParserBucket

static class iParsedLengthEstimate
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

    (InternalParser ainternalparser[])
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
