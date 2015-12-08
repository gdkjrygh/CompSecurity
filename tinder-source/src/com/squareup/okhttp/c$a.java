// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.http.b;
import com.squareup.okhttp.internal.k;
import java.io.IOException;
import okio.g;
import okio.q;

// Referenced classes of package com.squareup.okhttp:
//            c

private final class rnal.b.a
    implements b
{

    boolean a;
    final c b;
    private final com.squareup.okhttp.internal.b c;
    private q d;
    private q e;

    public final void a()
    {
label0:
        {
            synchronized (b)
            {
                if (!a)
                {
                    break label0;
                }
            }
            return;
        }
        a = true;
        c c1 = b;
        c1.d = c1.d + 1;
        obj;
        JVM INSTR monitorexit ;
        k.a(d);
        try
        {
            c.b();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final q b()
    {
        return e;
    }

    public rnal..b(c c1, com.squareup.okhttp.internal..b b1)
        throws IOException
    {
        b = c1;
        super();
        c = b1;
        d = b1.a(1);
        e = new g(d, c1, b1) {

            final c a;
            final com.squareup.okhttp.internal.b.a b;
            final c.a c;

            public final void close()
                throws IOException
            {
label0:
                {
                    synchronized (c.b)
                    {
                        if (!c.a)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                c.a = true;
                c c3 = c.b;
                c3.c = c3.c + 1;
                c2;
                JVM INSTR monitorexit ;
                super.close();
                b.a();
                return;
                exception;
                c2;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                c = c.a.this;
                a = c1;
                b = a2;
                super(q);
            }
        };
    }
}
