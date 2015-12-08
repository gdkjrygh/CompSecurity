// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.net;

import java.io.BufferedReader;
import java.io.Reader;
import org.c.b;
import org.c.c;

public final class a extends BufferedReader
{

    private static final b f = org.c.c.a("LoggingBufferedReader");
    private StringBuffer a;
    private String b;
    private boolean c;
    private com.kik.android.b.a d;
    private volatile long e;

    public a(Reader reader, String s, com.kik.android.b.a a1)
    {
        super(reader, 32768);
        c = false;
        e = 0L;
        a = new StringBuffer(32768);
        b = s;
        d = a1;
    }

    public final void a()
    {
        (new StringBuilder()).append(b).append(":  ").append(a.toString());
        a.delete(0, a.length());
        c = false;
    }

    public final long b()
    {
        return e;
    }

    public final void close()
    {
        d.e();
        super.close();
    }

    public final int read()
    {
        int i = super.read();
        d.a(1000L);
        e = System.currentTimeMillis();
        if (i == -1)
        {
            return -1;
        }
        if (a.length() + i >= a.capacity())
        {
            a();
        }
        if (i >= 0 && !c)
        {
            if (a.capacity() - a.length() - 13 > 0)
            {
                a.append((char)i);
            } else
            {
                a.append("... TRUNCATED");
                c = true;
            }
        }
        return i;
    }

    public final int read(char ac[], int i, int j)
    {
        j = super.read(ac, i, j);
        d.a(1000L);
        e = System.currentTimeMillis();
        if (j == -1)
        {
            return -1;
        }
        int k = a.capacity() - a.length() - 13;
        if (!c)
        {
            if (j < k)
            {
                a.append(ac, i, j);
            } else
            {
                a.append(ac, i, k);
                a.append("... TRUNCATED");
                c = true;
            }
        }
        return j;
    }

}
