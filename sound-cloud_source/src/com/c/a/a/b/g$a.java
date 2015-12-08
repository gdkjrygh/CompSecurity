// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.b;

import c.e;
import c.h;
import c.y;
import c.z;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.c.a.a.b:
//            g

static final class f
    implements y
{

    int a;
    byte b;
    int c;
    int d;
    short e;
    private final h f;

    public final long a(e e1, long l)
        throws IOException
    {
_L7:
        if (d != 0) goto _L2; else goto _L1
_L1:
        f.f(e);
        e = 0;
        if ((b & 4) == 0) goto _L4; else goto _L3
_L3:
        return -1L;
_L4:
        int i = c;
        int j = g.a(f);
        d = j;
        a = j;
        byte byte0 = (byte)(f.e() & 0xff);
        b = (byte)(f.e() & 0xff);
        if (g.b().isLoggable(Level.FINE))
        {
            g.b().fine(a(true, c, a, byte0, b));
        }
        c = f.g() & 0x7fffffff;
        if (byte0 != 9)
        {
            throw g.a("%s != TYPE_CONTINUATION", new Object[] {
                Byte.valueOf(byte0)
            });
        }
        if (c != i)
        {
            throw g.a("TYPE_CONTINUATION streamId changed", new Object[0]);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        l = f.a(e1, Math.min(l, d));
        if (l == -1L) goto _L3; else goto _L5
_L5:
        d = (int)((long)d - l);
        return l;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void close()
        throws IOException
    {
    }

    public final z timeout()
    {
        return f.timeout();
    }

    public ion(h h1)
    {
        f = h1;
    }
}
