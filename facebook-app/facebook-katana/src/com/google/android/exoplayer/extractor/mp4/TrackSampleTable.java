// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor.mp4;

import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.Util;

final class TrackSampleTable
{

    public final int a;
    public final long b[];
    public final int c[];
    public final long d[];
    public final int e[];

    TrackSampleTable(long al[], int ai[], long al1[], int ai1[])
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (ai.length == al1.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.a(flag);
        if (al.length == al1.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.a(flag);
        if (ai1.length == al1.length)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Assertions.a(flag);
        b = al;
        c = ai;
        d = al1;
        e = ai1;
        a = al.length;
    }

    public final int a(long l)
    {
        for (int i = Util.a(d, l, true, false); i >= 0; i--)
        {
            if (d[i] <= l && (e[i] & 1) != 0)
            {
                return i;
            }
        }

        return -1;
    }

    public final int b(long l)
    {
        for (int i = Util.b(d, l, true, false); i < d.length; i++)
        {
            if (d[i] >= l && (e[i] & 1) != 0)
            {
                return i;
            }
        }

        return -1;
    }
}
