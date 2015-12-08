// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gwh
{

    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final int m;
    private long n;

    public gwh(int i1, int j1, long l1, long l2, long l3, long l4, long l5, long l6, 
            long l7, long l8, int k1, int i2, int j2, 
            long l9)
    {
        a = i1;
        b = j1;
        c = l1;
        d = l2;
        e = l3;
        f = l4;
        g = l5;
        h = l6;
        i = l7;
        j = l8;
        k = k1;
        l = i2;
        m = j2;
        n = l9;
    }

    public final String toString()
    {
        return (new StringBuilder("StatsSnapshot{maxSize=")).append(a).append(", size=").append(b).append(", cacheHits=").append(c).append(", cacheMisses=").append(d).append(", downloadCount=").append(k).append(", totalDownloadSize=").append(e).append(", averageDownloadSize=").append(h).append(", totalOriginalBitmapSize=").append(f).append(", totalTransformedBitmapSize=").append(g).append(", averageOriginalBitmapSize=").append(i).append(", averageTransformedBitmapSize=").append(j).append(", originalBitmapCount=").append(l).append(", transformedBitmapCount=").append(m).append(", timeStamp=").append(n).append('}').toString();
    }
}
