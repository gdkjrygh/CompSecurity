// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.io.IOException;
import okio.g;
import okio.q;

// Referenced classes of package com.squareup.okhttp:
//            c

final class b extends g
{

    final c a;
    final com.squareup.okhttp.internal. b;
    final al. c;

    public final void close()
        throws IOException
    {
label0:
        {
            synchronized (c.c)
            {
                if (!c.c)
                {
                    break label0;
                }
            }
            return;
        }
        c.c = true;
        c c2 = c.c;
        c2.c = c2.c + 1;
        c1;
        JVM INSTR monitorexit ;
        super.close();
        b.();
        return;
        exception;
        c1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    al.(al. , q q, c c1, com.squareup.okhttp.internal. 1)
    {
        c = ;
        a = c1;
        b = 1;
        super(q);
    }
}
