// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.c;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import okio.e;
import okio.r;
import okio.s;

// Referenced classes of package com.squareup.okhttp.internal.c:
//            b

public final class c
{
    public static interface a
    {

        public abstract void a(int i1, String s);

        public abstract void a(okio.c c1);

        public abstract void a(e e1, com.squareup.okhttp.ws.WebSocket.PayloadType payloadtype)
            throws IOException;
    }

    private final class b
        implements r
    {

        final c a;

        public final long a(okio.c c1, long l1)
            throws IOException
        {
            if (a.d)
            {
                throw new IOException("closed");
            }
            if (a.e)
            {
                throw new IllegalStateException("closed");
            }
            if (a.h == a.g)
            {
                if (a.i)
                {
                    return -1L;
                }
                c.a(a);
                if (a.f != 0)
                {
                    throw new ProtocolException((new StringBuilder("Expected continuation opcode. Got: ")).append(Integer.toHexString(a.f)).toString());
                }
                if (a.i && a.g == 0L)
                {
                    return -1L;
                }
            }
            l1 = Math.min(l1, a.g - a.h);
            if (a.k)
            {
                l1 = Math.min(l1, a.m.length);
                l1 = a.a.a(a.m, 0, (int)l1);
                if (l1 == -1L)
                {
                    throw new EOFException();
                }
                com.squareup.okhttp.internal.c.b.a(a.m, l1, a.l, a.h);
                c1.b(a.m, 0, (int)l1);
            } else
            {
                long l2 = a.a.a(c1, l1);
                l1 = l2;
                if (l2 == -1L)
                {
                    throw new EOFException();
                }
            }
            a.h = a.h + l1;
            return l1;
        }

        public final void close()
            throws IOException
        {
            if (!a.e) goto _L2; else goto _L1
_L1:
            return;
_L2:
            a.e = true;
            if (!a.d)
            {
                a.a.f(a.g - a.h);
                while (!a.i) 
                {
                    c.a(a);
                    a.a.f(a.g);
                }
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

        public final s q_()
        {
            return a.a.q_();
        }

        private b()
        {
            a = c.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }


    final e a;
    final a b;
    final r c = new b((byte)0);
    boolean d;
    boolean e;
    int f;
    long g;
    long h;
    boolean i;
    boolean j;
    boolean k;
    final byte l[] = new byte[4];
    final byte m[] = new byte[2048];
    private final boolean n;

    public c(e e1, a a1)
    {
        if (e1 == null)
        {
            throw new NullPointerException("source == null");
        } else
        {
            n = true;
            a = e1;
            b = a1;
            return;
        }
    }

    static void a(c c1)
        throws IOException
    {
        do
        {
            if (c1.d)
            {
                break;
            }
            c1.a();
            if (!c1.j)
            {
                break;
            }
            c1.b();
        } while (true);
    }

    final void a()
        throws IOException
    {
        boolean flag3 = true;
        if (d)
        {
            throw new IOException("closed");
        }
        int j1 = a.f() & 0xff;
        f = j1 & 0xf;
        boolean flag2;
        if ((j1 & 0x80) != 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        i = flag2;
        if ((j1 & 8) != 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        j = flag2;
        if (j && !i)
        {
            throw new ProtocolException("Control frames must be final.");
        }
        boolean flag;
        boolean flag1;
        if ((j1 & 0x40) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((j1 & 0x20) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if ((j1 & 0x10) != 0)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (flag || flag1 || j1)
        {
            throw new ProtocolException("Reserved flags are unsupported.");
        }
        int i1 = a.f() & 0xff;
        if ((i1 & 0x80) != 0)
        {
            flag2 = flag3;
        } else
        {
            flag2 = false;
        }
        k = flag2;
        if (k == n)
        {
            throw new ProtocolException("Client-sent frames must be masked. Server sent must not.");
        }
        g = i1 & 0x7f;
        if (g == 126L)
        {
            g = (long)a.g() & 65535L;
        } else
        if (g == 127L)
        {
            g = a.i();
            if (g < 0L)
            {
                throw new ProtocolException((new StringBuilder("Frame length 0x")).append(Long.toHexString(g)).append(" > 0x7FFFFFFFFFFFFFFF").toString());
            }
        }
        h = 0L;
        if (j && g > 125L)
        {
            throw new ProtocolException("Control frame must be less than 125B.");
        }
        if (k)
        {
            a.a(l);
        }
    }

    final void b()
        throws IOException
    {
        Object obj = null;
        if (h >= g) goto _L2; else goto _L1
_L1:
        obj = new okio.c();
        if (!n) goto _L4; else goto _L3
_L3:
        a.b(((okio.c) (obj)), g);
_L2:
        int i1;
        switch (f)
        {
        default:
            throw new ProtocolException((new StringBuilder("Unknown control opcode: ")).append(Integer.toHexString(f)).toString());

        case 9: // '\t'
            b.a(((okio.c) (obj)));
            // fall through

        case 10: // '\n'
            return;

        case 8: // '\b'
            break;
        }
        break MISSING_BLOCK_LABEL_213;
_L6:
        com.squareup.okhttp.internal.c.b.a(m, i1, l, h);
        ((okio.c) (obj)).b(m, 0, i1);
        h = h + (long)i1;
_L4:
        if (h >= g)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = (int)Math.min(g - h, m.length);
        i1 = a.a(m, 0, i1);
        if (i1 == -1)
        {
            throw new EOFException();
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L2; else goto _L7
_L7:
        short word0;
        if (obj != null)
        {
            if (((okio.c) (obj)).b < 2L)
            {
                throw new ProtocolException("Close payload must be at least two bytes.");
            }
            word0 = ((okio.c) (obj)).g();
            if (word0 < 1000 || word0 >= 5000)
            {
                throw new ProtocolException((new StringBuilder("Code must be in range [1000,5000): ")).append(word0).toString());
            }
            obj = ((okio.c) (obj)).o();
        } else
        {
            obj = "";
            word0 = 0;
        }
        b.a(word0, ((String) (obj)));
        d = true;
        return;
    }
}
