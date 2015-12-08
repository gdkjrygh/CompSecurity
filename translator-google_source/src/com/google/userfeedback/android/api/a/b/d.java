// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api.a.b;


// Referenced classes of package com.google.userfeedback.android.api.a.b:
//            e

final class d extends e
{

    private Long a[] = {
        new Long(0L), new Long(1L), new Long(2L), new Long(3L), new Long(4L), new Long(5L), new Long(6L), new Long(7L), new Long(8L), new Long(9L), 
        new Long(10L), new Long(11L), new Long(12L), new Long(13L), new Long(14L), new Long(15L)
    };
    private Integer b[] = {
        Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8), Integer.valueOf(9), 
        Integer.valueOf(10), Integer.valueOf(11), Integer.valueOf(12), Integer.valueOf(13), Integer.valueOf(14), Integer.valueOf(15)
    };

    d()
    {
    }

    public final Integer a(int i)
    {
        if (i >= 0 && i < b.length)
        {
            return b[i];
        } else
        {
            return Integer.valueOf(i);
        }
    }

    public final Long a(long l)
    {
        if (l >= 0L && l < (long)a.length)
        {
            return a[(int)l];
        } else
        {
            return new Long(l);
        }
    }
}
