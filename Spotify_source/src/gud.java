// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

final class gud extends gub
{

    private long b;
    private boolean c;
    private final gui d;
    private gua e;

    gud(gua gua1, gui gui1)
    {
        e = gua1;
        super(gua1, (byte)0);
        b = -1L;
        c = true;
        d = gui1;
    }

    public final long a(hch hch, long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l).toString());
        }
        if (a)
        {
            throw new IllegalStateException("closed");
        }
        if (c) goto _L2; else goto _L1
_L1:
        return -1L;
_L2:
        if (b != 0L && b != -1L)
        {
            break; /* Loop/switch isn't completed */
        }
        if (b != -1L)
        {
            e.c.q();
        }
        try
        {
            b = e.c.n();
            String s = e.c.q().trim();
            if (b < 0L || !s.isEmpty() && !s.startsWith(";"))
            {
                throw new ProtocolException((new StringBuilder("expected chunk size and optional extensions but was \"")).append(b).append(s).append("\"").toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (hch hch)
        {
            throw new ProtocolException(hch.getMessage());
        }
        if (b == 0L)
        {
            c = false;
            gri gri1 = new gri();
            e.a(gri1);
            d.a(gri1.a());
            a(true);
        }
        if (!c) goto _L1; else goto _L3
_L3:
        l = e.c.a(hch, Math.min(l, b));
        if (l == -1L)
        {
            b();
            throw new ProtocolException("unexpected end of stream");
        } else
        {
            b = b - l;
            return l;
        }
    }

    public final void close()
    {
        if (a)
        {
            return;
        }
        if (c && !gsp.a(this, TimeUnit.MILLISECONDS))
        {
            b();
        }
        a = true;
    }
}
