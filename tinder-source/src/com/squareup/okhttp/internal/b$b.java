// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import com.squareup.okhttp.internal.a.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import okio.d;
import okio.r;

// Referenced classes of package com.squareup.okhttp.internal:
//            b, k

private final class <init>
{

    final String a;
    final long b[];
    final File c[];
    final File d[];
    boolean e;
    b f;
    long g;
    final b h;

    private static IOException b(String as[])
        throws IOException
    {
        throw new IOException((new StringBuilder("unexpected journal line: ")).append(Arrays.toString(as)).toString());
    }

    final <init> a()
    {
        r ar[];
        long al[];
        int i;
        boolean flag;
        flag = false;
        if (!Thread.holdsLock(h))
        {
            throw new AssertionError();
        }
        ar = new r[com.squareup.okhttp.internal.b.h(h)];
        al = (long[])b.clone();
        i = 0;
_L2:
        if (i >= com.squareup.okhttp.internal.b.h(h))
        {
            break; /* Loop/switch isn't completed */
        }
        ar[i] = com.squareup.okhttp.internal.b.i(h).a(c[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        <init> <init>1 = new <init>(h, a, g, ar, al, (byte)0);
        return <init>1;
_L4:
        for (; i < com.squareup.okhttp.internal.b.h(h) && ar[i] != null; i++)
        {
            com.squareup.okhttp.internal.k.a(ar[i]);
        }

        return null;
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        i = ((flag) ? 1 : 0);
        if (true) goto _L4; else goto _L3
_L3:
    }

    final void a(d d1)
        throws IOException
    {
        long al[] = b;
        int j = al.length;
        for (int i = 0; i < j; i++)
        {
            long l = al[i];
            d1.h(32).k(l);
        }

    }

    final void a(String as[])
        throws IOException
    {
        if (as.length != com.squareup.okhttp.internal.b.h(h))
        {
            throw b(as);
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
                b[i] = Long.parseLong(as[i]);
            }
            catch (NumberFormatException numberformatexception)
            {
                throw b(as);
            }
            i++;
        } while (true);
    }

    private (b b1, String s)
    {
        h = b1;
        super();
        a = s;
        b = new long[com.squareup.okhttp.internal.b.h(b1)];
        c = new File[com.squareup.okhttp.internal.b.h(b1)];
        d = new File[com.squareup.okhttp.internal.b.h(b1)];
        s = (new StringBuilder(s)).append('.');
        int j = s.length();
        for (int i = 0; i < com.squareup.okhttp.internal.b.h(b1); i++)
        {
            s.append(i);
            c[i] = new File(com.squareup.okhttp.internal.b.j(b1), s.toString());
            s.append(".tmp");
            d[i] = new File(com.squareup.okhttp.internal.b.j(b1), s.toString());
            s.setLength(j);
        }

    }

    (b b1, String s, byte byte0)
    {
        this(b1, s);
    }
}
