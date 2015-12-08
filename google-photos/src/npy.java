// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import java.util.Map;

public final class npy
{

    public int a;
    public String b[];
    public String c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public int i;
    public String j;
    public long k;
    public Map l;
    private final long m;

    public npy(int i1, String as[], String s, long l1, long l2, 
            long l3, long l4, long l5, int j1, 
            String s1)
    {
        a = 1;
        b = as;
        c = s;
        d = l1;
        e = l2;
        f = l3;
        g = 0L;
        h = l5;
        i = j1;
        j = s1;
        k = 0L;
        l = null;
        m = SystemClock.uptimeMillis();
    }

    public npy(int i1, String as[], String s, long l1, long l2, 
            long l3, long l4, long l5, int j1, 
            String s1, long l6, Map map)
    {
        a = 5;
        b = as;
        c = s;
        d = l1;
        e = l2;
        f = l3;
        g = l4;
        h = l5;
        i = j1;
        j = s1;
        k = l6;
        l = map;
        m = SystemClock.uptimeMillis();
    }

    public final boolean a(int i1)
    {
        return m + 7200L <= SystemClock.uptimeMillis();
    }
}
