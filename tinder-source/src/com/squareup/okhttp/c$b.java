// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.io.IOException;
import okio.e;
import okio.h;
import okio.l;
import okio.r;

// Referenced classes of package com.squareup.okhttp:
//            w, c, r

private static final class rnal.b.c extends w
{

    private final com.squareup.okhttp.internal.e a;
    private final e b;
    private final String c;
    private final String d;

    static com.squareup.okhttp.internal.close a(rnal.b.c c1)
    {
        return c1.a;
    }

    public final com.squareup.okhttp.r a()
    {
        if (c != null)
        {
            return r.a(c);
        } else
        {
            return null;
        }
    }

    public final long b()
    {
        long l1 = -1L;
        try
        {
            if (d != null)
            {
                l1 = Long.parseLong(d);
            }
        }
        catch (NumberFormatException numberformatexception)
        {
            return -1L;
        }
        return l1;
    }

    public final e c()
    {
        return b;
    }

    public rnal.(com.squareup.okhttp.internal. , String s, String s1)
    {
        a = ;
        c = s;
        d = s1;
        b = l.a(new h(.c[1], ) {

            final com.squareup.okhttp.internal.b.c a;
            final c.b b;

            public final void close()
                throws IOException
            {
                a.close();
                super.close();
            }

            
            {
                b = c.b.this;
                a = c1;
                super(r1);
            }
        });
    }
}
