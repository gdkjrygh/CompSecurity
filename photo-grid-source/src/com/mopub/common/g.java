// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.mopub.common:
//            DiskLruCache

final class g
{

    final DiskLruCache a;
    private final String b;
    private final long c[];
    private boolean d;
    private DiskLruCache.Editor e;
    private long f;

    private g(DiskLruCache disklrucache, String s)
    {
        a = disklrucache;
        super();
        b = s;
        c = new long[DiskLruCache.f(disklrucache)];
    }

    g(DiskLruCache disklrucache, String s, byte byte0)
    {
        this(disklrucache, s);
    }

    static long a(g g1, long l)
    {
        g1.f = l;
        return l;
    }

    static DiskLruCache.Editor a(g g1, DiskLruCache.Editor editor)
    {
        g1.e = editor;
        return editor;
    }

    private static IOException a(String as[])
    {
        throw new IOException((new StringBuilder("unexpected journal line: ")).append(Arrays.toString(as)).toString());
    }

    static void a(g g1, String as[])
    {
        if (as.length != DiskLruCache.f(g1.a))
        {
            throw a(as);
        }
        int i = 0;
        do
        {
            try
            {
                if (i >= as.length)
                {
                    break;
                }
                g1.c[i] = Long.parseLong(as[i]);
            }
            // Misplaced declaration of an exception variable
            catch (g g1)
            {
                throw a(as);
            }
            i++;
        } while (true);
    }

    static boolean a(g g1)
    {
        g1.d = true;
        return true;
    }

    static DiskLruCache.Editor b(g g1)
    {
        return g1.e;
    }

    static long[] c(g g1)
    {
        return g1.c;
    }

    static String d(g g1)
    {
        return g1.b;
    }

    static boolean e(g g1)
    {
        return g1.d;
    }

    static long f(g g1)
    {
        return g1.f;
    }

    public final File getCleanFile(int i)
    {
        return new File(DiskLruCache.g(a), (new StringBuilder()).append(b).append(".").append(i).toString());
    }

    public final File getDirtyFile(int i)
    {
        return new File(DiskLruCache.g(a), (new StringBuilder()).append(b).append(".").append(i).append(".tmp").toString());
    }

    public final String getLengths()
    {
        StringBuilder stringbuilder = new StringBuilder();
        long al[] = c;
        int j = al.length;
        for (int i = 0; i < j; i++)
        {
            long l = al[i];
            stringbuilder.append(' ').append(l);
        }

        return stringbuilder.toString();
    }
}
