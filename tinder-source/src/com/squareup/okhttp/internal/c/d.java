// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.c;

import java.io.IOException;
import java.util.Random;
import okio.c;
import okio.e;
import okio.q;
import okio.s;

// Referenced classes of package com.squareup.okhttp.internal.c:
//            b

public final class d
{
    private final class a
        implements q
    {

        final d a;
        private com.squareup.okhttp.ws.WebSocket.PayloadType b;
        private boolean c;

        public final void a_(c c1, long l)
            throws IOException
        {
            a.a(b, c1, l, c, false);
            c = false;
        }

        public final void close()
            throws IOException
        {
            if (a.d)
            {
                throw new IOException("closed");
            }
            okio.d d1 = a.b;
            d1;
            JVM INSTR monitorenter ;
            a.b.h(128);
            if (!a.a)
            {
                break MISSING_BLOCK_LABEL_132;
            }
            a.b.h(128);
            a.c.nextBytes(a.f);
            a.b.c(a.f);
_L1:
            a.b.flush();
            a.e = false;
            return;
            a.b.h(0);
              goto _L1
            Exception exception;
            exception;
            d1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void flush()
            throws IOException
        {
            if (a.d)
            {
                throw new IOException("closed");
            }
            synchronized (a.b)
            {
                a.b.flush();
            }
            return;
            exception;
            d1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final s q_()
        {
            return a.b.q_();
        }

        private a()
        {
            a = d.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    final boolean a;
    final okio.d b;
    final Random c;
    boolean d;
    boolean e;
    final byte f[];
    private final a g = new a((byte)0);
    private final byte h[];

    public d(okio.d d1, Random random)
    {
        if (d1 == null)
        {
            throw new NullPointerException("sink == null");
        }
        if (random == null)
        {
            throw new NullPointerException("random == null");
        } else
        {
            a = true;
            b = d1;
            c = random;
            f = new byte[4];
            h = new byte[2048];
            return;
        }
    }

    private void a(e e1, long l)
        throws IOException
    {
        int i;
        for (long l1 = 0L; l1 < l; l1 += i)
        {
            i = (int)Math.min(l, h.length);
            i = e1.a(h, 0, i);
            if (i == -1)
            {
                throw new AssertionError();
            }
            com.squareup.okhttp.internal.c.b.a(h, i, f, l1);
            b.c(h, 0, i);
        }

    }

    public final void a(int i, String s)
        throws IOException
    {
        c c1 = null;
        if (i != 0 || s != null)
        {
            if (i != 0 && (i < 1000 || i >= 5000))
            {
                throw new IllegalArgumentException("Code must be in range [1000,5000).");
            }
            c c2 = new c();
            c2.c(i);
            c1 = c2;
            if (s != null)
            {
                c2.a(s);
                c1 = c2;
            }
        }
        synchronized (b)
        {
            a(8, c1);
            d = true;
        }
        return;
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final void a(int i, c c1)
        throws IOException
    {
        int j;
        if (d)
        {
            throw new IOException("closed");
        }
        j = 0;
        if (c1 != null)
        {
            int k = (int)c1.b;
            j = k;
            if (k > 125)
            {
                throw new IllegalArgumentException("Payload size must be less than or equal to 125");
            }
        }
        b.h(i | 0x80);
        if (!a) goto _L2; else goto _L1
_L1:
        b.h(j | 0x80);
        c.nextBytes(f);
        b.c(f);
        if (c1 != null)
        {
            a(((e) (c1)), j);
        }
_L4:
        b.flush();
        return;
_L2:
        b.h(j);
        if (c1 != null)
        {
            b.a(c1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    final void a(com.squareup.okhttp.ws.WebSocket.PayloadType payloadtype, c c1, long l, boolean flag, boolean flag1)
        throws IOException
    {
        boolean flag2;
        flag2 = false;
        if (d)
        {
            throw new IOException("closed");
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.squareup.okhttp.ws.WebSocket.PayloadType.values().length];
                try
                {
                    a[com.squareup.okhttp.ws.WebSocket.PayloadType.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.squareup.okhttp.ws.WebSocket.PayloadType.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[payloadtype.ordinal()];
        JVM INSTR tableswitch 1 2: default 56
    //                   1 80
    //                   2 304;
           goto _L3 _L4 _L5
_L3:
        throw new IllegalStateException((new StringBuilder("Unknown payload type: ")).append(payloadtype).toString());
_L4:
        int i = 1;
_L11:
        payloadtype = b;
        payloadtype;
        JVM INSTR monitorenter ;
        int j;
        j = i;
        if (flag1)
        {
            j = i | 0x80;
        }
        b.h(j);
        i = ((flag2) ? 1 : 0);
        if (!a)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        i = 128;
        c.nextBytes(f);
        if (l > 125L) goto _L7; else goto _L6
_L6:
        j = (int)l;
        b.h(j | i);
_L8:
        if (!a)
        {
            break MISSING_BLOCK_LABEL_284;
        }
        b.c(f);
        a(((e) (c1)), l);
_L9:
        b.flush();
        payloadtype;
        JVM INSTR monitorexit ;
        return;
_L7:
        if (l > 65535L)
        {
            break MISSING_BLOCK_LABEL_255;
        }
        b.h(i | 0x7e);
        b.g((int)l);
          goto _L8
        c1;
        payloadtype;
        JVM INSTR monitorexit ;
        throw c1;
        b.h(i | 0x7f);
        b.l(l);
          goto _L8
        b.a_(c1, l);
          goto _L9
_L2:
        i = 0;
        continue; /* Loop/switch isn't completed */
_L5:
        i = 2;
        if (true) goto _L11; else goto _L10
_L10:
    }
}
