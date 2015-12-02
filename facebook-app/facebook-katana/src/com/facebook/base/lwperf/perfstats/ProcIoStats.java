// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.lwperf.perfstats;

import android.os.Process;

// Referenced classes of package com.facebook.base.lwperf.perfstats:
//            ProcReader

public class ProcIoStats
{

    private static final int a[] = {
        32, 32, 32, 32, 32, 32, 32, 32, 32, 8224, 
        8224, 8224, 8224, 32
    };

    public ProcIoStats()
    {
    }

    public static final long[] a()
    {
        return a(d());
    }

    private static final long[] a(String s)
    {
        long al[] = new long[4];
        long[] _tmp = al;
        al[0] = -1L;
        al[1] = -1L;
        al[2] = -1L;
        al[3] = -1L;
        ProcReader.a(s, a, al);
        return al;
    }

    public static final long[] b()
    {
        return a(d());
    }

    public static final long[] c()
    {
        return a(e());
    }

    private static final String d()
    {
        int i = Process.myPid();
        return (new StringBuilder("/proc/")).append(Integer.toString(i)).append("/stat").toString();
    }

    private static final String e()
    {
        int i = Process.myPid();
        int j = Process.myTid();
        return (new StringBuilder("/proc/")).append(Integer.toString(i)).append("/task/").append(Integer.toString(j)).append("/stat").toString();
    }

}
