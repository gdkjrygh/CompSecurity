// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.PrintWriter;

public final class cgz
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
    public final long n;

    public cgz(int i1, int j1, long l1, long l2, long l3, long l4, long l5, long l6, 
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

    public final void a(PrintWriter printwriter)
    {
        printwriter.println("===============BEGIN PICASSO STATS ===============");
        printwriter.println("Memory Cache Stats");
        printwriter.print("  Max Cache Size: ");
        printwriter.println(a);
        printwriter.print("  Cache Size: ");
        printwriter.println(b);
        printwriter.print("  Cache % Full: ");
        printwriter.println((int)Math.ceil(((float)b / (float)a) * 100F));
        printwriter.print("  Cache Hits: ");
        printwriter.println(c);
        printwriter.print("  Cache Misses: ");
        printwriter.println(d);
        printwriter.println("Network Stats");
        printwriter.print("  Download Count: ");
        printwriter.println(k);
        printwriter.print("  Total Download Size: ");
        printwriter.println(e);
        printwriter.print("  Average Download Size: ");
        printwriter.println(h);
        printwriter.println("Bitmap Stats");
        printwriter.print("  Total Bitmaps Decoded: ");
        printwriter.println(l);
        printwriter.print("  Total Bitmap Size: ");
        printwriter.println(f);
        printwriter.print("  Total Transformed Bitmaps: ");
        printwriter.println(m);
        printwriter.print("  Total Transformed Bitmap Size: ");
        printwriter.println(g);
        printwriter.print("  Average Bitmap Size: ");
        printwriter.println(i);
        printwriter.print("  Average Transformed Bitmap Size: ");
        printwriter.println(j);
        printwriter.println("===============END PICASSO STATS ===============");
        printwriter.flush();
    }

    public final String toString()
    {
        return (new StringBuilder("StatsSnapshot{maxSize=")).append(a).append(", size=").append(b).append(", cacheHits=").append(c).append(", cacheMisses=").append(d).append(", downloadCount=").append(k).append(", totalDownloadSize=").append(e).append(", averageDownloadSize=").append(h).append(", totalOriginalBitmapSize=").append(f).append(", totalTransformedBitmapSize=").append(g).append(", averageOriginalBitmapSize=").append(i).append(", averageTransformedBitmapSize=").append(j).append(", originalBitmapCount=").append(l).append(", transformedBitmapCount=").append(m).append(", timeStamp=").append(n).append('}').toString();
    }
}
