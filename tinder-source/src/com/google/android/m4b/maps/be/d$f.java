// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.be;


// Referenced classes of package com.google.android.m4b.maps.be:
//            d

static final class h
{

    final long a;
    final int b;
    final int c;
    final int d;
    final int e;
    final int f;
    final int g;
    final int h;

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (h)obj;
            if (g != ((g) (obj)).g || h != ((h) (obj)).h)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return (g << 16) + h;
    }

    public final String toString()
    {
        long l1 = a;
        int i = b;
        int j = d;
        int k = e;
        int l = f;
        int i1 = g;
        int j1 = h;
        return (new StringBuilder(140)).append("ID:").append(l1).append(" Off:").append(i).append(" KeyLen:").append(j).append(" DataLen:").append(k).append(" Checksum:").append(l).append(" Shard:").append(i1).append(" ShardIndex:").append(j1).toString();
    }

    (long l, int i, int j, int k, int i1, int j1, 
            int k1, int l1)
    {
        a = l;
        b = i;
        c = i1;
        d = j;
        e = k;
        f = j1;
        g = k1;
        h = l1;
    }
}
