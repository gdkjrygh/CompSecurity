// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.time;

import java.util.Calendar;
import org.apache.commons.lang3.Validate;

// Referenced classes of package org.apache.commons.lang3.time:
//            FastDateFormat

private static class mSize
    implements mSize
{

    private final int mField;
    private final int mSize;

    public final void appendTo(StringBuffer stringbuffer, int i)
    {
        if (i < 100)
        {
            int j = mSize;
            do
            {
                j--;
                if (j >= 2)
                {
                    stringbuffer.append('0');
                } else
                {
                    stringbuffer.append((char)(i / 10 + 48));
                    stringbuffer.append((char)(i % 10 + 48));
                    return;
                }
            } while (true);
        }
        int k;
        int l;
        if (i < 1000)
        {
            k = 3;
        } else
        {
            boolean flag;
            if (i > -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Validate.isTrue(flag, "Negative values should not be possible", i);
            k = Integer.toString(i).length();
        }
        l = mSize;
        do
        {
            l--;
            if (l >= k)
            {
                stringbuffer.append('0');
            } else
            {
                stringbuffer.append(Integer.toString(i));
                return;
            }
        } while (true);
    }

    public void appendTo(StringBuffer stringbuffer, Calendar calendar)
    {
        appendTo(stringbuffer, calendar.get(mField));
    }

    public int estimateLength()
    {
        return 4;
    }

    (int i, int j)
    {
        if (j < 3)
        {
            throw new IllegalArgumentException();
        } else
        {
            mField = i;
            mSize = j;
            return;
        }
    }
}
