// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.nielsen.app.sdk:
//            h, c

public class f extends FilterOutputStream
{

    final a a;
    private int b;
    private String c;
    private int d;
    private int e;
    private int f;

    public void write(int i)
    {
        out.write(i);
        b = b + 4;
        int j = b - d;
        i = j;
        if (j > e)
        {
            f = f + 1;
            d = d + e;
            if (e(a) != null && f < f(a).length)
            {
                c = c(a)[f];
            }
            if (f(a) != null && f < f(a).length)
            {
                e = e(a)[f];
            }
            i = b - d;
        }
        if (d(a) == null)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        long l = h.g();
        f f1 = new a(a.a, 3, a(a), a(a), l, i, e, c, null);
        c(a).put(f1);
        return;
        InterruptedException interruptedexception;
        interruptedexception;
        com.nielsen.app.sdk.c.a(interruptedexception, true, 9, 'E', (new StringBuilder("Request ")).append(a(a)).append(" was interrupted while waiting to add data to the messaging queue. VERY unliquely event").toString(), new Object[0]);
        return;
    }

    public void write(byte abyte0[], int i, int j)
    {
        out.write(abyte0, i, j);
        b = b + j;
        j = b - d;
        i = j;
        if (j > e)
        {
            f = f + 1;
            d = d + e;
            if (e(a) != null && f < f(a).length)
            {
                c = c(a)[f];
            }
            if (f(a) != null && f < f(a).length)
            {
                e = e(a)[f];
            }
            i = b - d;
        }
        if (d(a) == null)
        {
            break MISSING_BLOCK_LABEL_227;
        }
        long l = h.g();
        abyte0 = new a(a.a, 3, a(a), a(a), l, i, e, c, null);
        c(a).put(abyte0);
        return;
        abyte0;
        com.nielsen.app.sdk.c.a(abyte0, true, 9, 'E', (new StringBuilder("Request ")).append(a(a)).append(" was interrupted while waiting to add data to the messaging queue. VERY unliquely event").toString(), new Object[0]);
        return;
    }

    public ( , OutputStream outputstream)
    {
        a = ;
        super(outputstream);
        c = "";
        d = 0;
        e = 0;
        f = 0;
        b = 0;
        d = 0;
        if (d() != null && d().length < 0 && f >= 0)
        {
            c = c()[f];
            e = e()[f];
        }
    }
}
