// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear;


// Referenced classes of package com.qihoo.security.opti.trashclear:
//            e

public static class n
{

    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public int l;
    public int m;
    public long n;

    public n a()
    {
        n n1 = new <init>();
        n1.a = a;
        n1.b = b;
        n1.c = c;
        n1.d = d;
        n1.e = e;
        n1.f = f;
        n1.g = g;
        n1.h = h;
        n1.i = i;
        n1.m = m;
        n1.l = l;
        n1.j = j;
        n1.k = k;
        return n1;
    }

    public long b()
    {
        return b + i + k + n;
    }

    public long c()
    {
        return a;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return a();
    }

    public long d()
    {
        return j + c;
    }

    public long e()
    {
        return b() + c() + d();
    }

    public long f()
    {
        return b() + c();
    }

    public String toString()
    {
        return (new StringBuilder()).append("CleanSizeInfo [appCacheLength=").append(a).append(", sysAppCacheLength=").append(b).append(", residualFileLength=").append(c).append(", emptyDirLength=").append(d).append(", logLength=").append(e).append(", lostDirLength=").append(f).append(", tempLength=").append(g).append(", thumbnailLength=").append(h).append(", uselessApkLength=").append(i).append(", bigfileLength=").append(j).append(", adFileLength=").append(k).append(", privacyType=").append(l).append(", privacyCount=").append(m).toString();
    }

    public ()
    {
        a = 0L;
        b = 0L;
        c = 0L;
        d = 0L;
        e = 0L;
        f = 0L;
        g = 0L;
        h = 0L;
        i = 0L;
        j = 0L;
        k = 0L;
        l = 0;
        m = 0;
        n = 0L;
    }
}
