// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.time;

import java.util.Calendar;

// Referenced classes of package org.apache.commons.lang3.time:
//            FastDateFormat

private static class mValues
    implements mValues
{

    private final int mField;
    private final String mValues[];

    public void appendTo(StringBuffer stringbuffer, Calendar calendar)
    {
        stringbuffer.append(mValues[calendar.get(mField)]);
    }

    public int estimateLength()
    {
        int j = 0;
        int i = mValues.length;
        do
        {
            int k = i - 1;
            if (k < 0)
            {
                break;
            }
            int l = mValues[k].length();
            i = k;
            if (l > j)
            {
                j = l;
                i = k;
            }
        } while (true);
        return j;
    }

    (int i, String as[])
    {
        mField = i;
        mValues = as;
    }
}
