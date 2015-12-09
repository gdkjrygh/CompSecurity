// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.c;

import com.google.a.a.ad;
import com.google.a.a.aw;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

// Referenced classes of package com.google.a.c:
//            i, h, j

public final class g
    implements Closeable
{

    private static final j b;
    final j a;
    private final Deque c = new ArrayDeque(4);
    private Throwable d;

    private g(j j1)
    {
        a = (j)ad.a(j1);
    }

    public static g a()
    {
        return new g(b);
    }

    public final Closeable a(Closeable closeable)
    {
        if (closeable != null)
        {
            c.addFirst(closeable);
        }
        return closeable;
    }

    public final RuntimeException a(Throwable throwable)
    {
        ad.a(throwable);
        d = throwable;
        aw.a(throwable, java/io/IOException);
        throw new RuntimeException(throwable);
    }

    public final void close()
    {
        Throwable throwable = d;
        while (!c.isEmpty()) 
        {
            Closeable closeable = (Closeable)c.removeFirst();
            try
            {
                closeable.close();
            }
            catch (Throwable throwable1)
            {
                if (throwable == null)
                {
                    throwable = throwable1;
                } else
                {
                    a.a(closeable, throwable, throwable1);
                }
            }
        }
        if (d == null && throwable != null)
        {
            aw.a(throwable, java/io/IOException);
            throw new AssertionError(throwable);
        } else
        {
            return;
        }
    }

    static 
    {
        Object obj;
        if (i.a())
        {
            obj = i.a;
        } else
        {
            obj = h.a;
        }
        b = ((j) (obj));
    }
}
