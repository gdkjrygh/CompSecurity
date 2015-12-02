// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.d.a;

import java.io.FilterOutputStream;
import java.io.OutputStream;

// Referenced classes of package com.facebook.http.d.a:
//            a

public class c extends FilterOutputStream
{

    private final a a;
    private long b;

    c(OutputStream outputstream, a a1)
    {
        super(outputstream);
        b = 0L;
        a = a1;
    }

    private void a(int i)
    {
        b = b + (long)i;
        if (a != null)
        {
            a.a(b);
        }
    }

    public void write(int i)
    {
        out.write(i);
        a(1);
    }

    public void write(byte abyte0[])
    {
        out.write(abyte0);
        a(abyte0.length);
    }

    public void write(byte abyte0[], int i, int j)
    {
        out.write(abyte0, i, j);
        a(j);
    }
}
