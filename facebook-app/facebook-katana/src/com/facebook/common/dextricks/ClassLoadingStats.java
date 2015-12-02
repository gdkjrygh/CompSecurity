// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.dextricks;


public final class ClassLoadingStats
{

    private static final ClassLoadingStats a = new ClassLoadingStats();
    private volatile int b;
    private int c;

    private ClassLoadingStats()
    {
        b = 0;
        c = 0;
    }

    public static ClassLoadingStats a()
    {
        return a;
    }

    public final SnapshotStats a(SnapshotStats snapshotstats)
    {
        return new SnapshotStats(b - snapshotstats.a, c - snapshotstats.b);
    }

    public final void a(int i)
    {
        c = c + i;
    }

    public final void b()
    {
        b = b + 1;
    }

    public final SnapshotStats c()
    {
        return new SnapshotStats(b, c);
    }


    private class SnapshotStats
    {

        public final int a;
        public final int b;

        public String toString()
        {
            return (new StringBuilder("[ Class Load Attempts:")).append(a).append("Secondary Dex Queries:").append(b).append(" ]").toString();
        }

        public SnapshotStats(int i, int j)
        {
            a = i;
            b = j;
        }
    }

}
