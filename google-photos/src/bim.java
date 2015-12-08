// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class bim
{

    public final bil a;
    public long b;
    public final bij c[];

    private transient bim(bil bil1, long l, bij abij[])
    {
        a = (bil)b.a(bil1, "phase", null);
        b = b.a(-1L, "checkpointDurationUs", -1L, 0x7fffffffffffffffL);
        c = (bij[])b.a(abij, "disabledFilters", null);
    }

    public transient bim(bil bil1, bij abij[])
    {
        this(bil1, -1L, abij);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof bim))
            {
                return false;
            }
            obj = (bim)obj;
            if (a != ((bim) (obj)).a || !Arrays.equals(c, ((bim) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        bil bil1;
        bij abij[];
        bil1 = a;
        abij = c;
        if (abij != null) goto _L2; else goto _L1
_L1:
        char c1 = '\u020F';
_L4:
        return b.h(bil1, c1);
_L2:
        int k = abij.length;
        int i = 17;
        int j = 0;
        do
        {
            c1 = i;
            if (j >= k)
            {
                continue;
            }
            i = b.h(abij[j], i);
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final String toString()
    {
        return b.a(getClass(), new Object[] {
            a, Arrays.toString(c)
        });
    }
}
