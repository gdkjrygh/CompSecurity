// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class eht
{

    private static final byte c[] = new byte[0];
    final OutputStream a;
    final ScheduledExecutorService b;
    private byte d[];
    private byte e[];
    private final Deque f = new LinkedList();
    private ScheduledFuture g;
    private byte h;

    public eht(OutputStream outputstream, ScheduledExecutorService scheduledexecutorservice)
    {
        d = new byte[0x30d40];
        e = new byte[256];
        a = outputstream;
        b = scheduledexecutorservice;
    }

    static ScheduledFuture a(eht eht1, Runnable runnable, long l)
    {
        return eht1.a(runnable, l);
    }

    static ScheduledFuture a(eht eht1, ScheduledFuture scheduledfuture)
    {
        eht1.g = scheduledfuture;
        return scheduledfuture;
    }

    private ScheduledFuture a(Runnable runnable, long l)
    {
        if (!b.isShutdown())
        {
            return b.schedule(runnable, l, TimeUnit.MILLISECONDS);
        } else
        {
            return null;
        }
    }

    static void a(eht eht1, byte byte0)
    {
        eht1.h = byte0;
    }

    static void a(IOException ioexception)
    {
        ioexception.getMessage();
    }

    static byte[] a(eht eht1)
    {
        return eht1.d;
    }

    static byte b(eht eht1)
    {
        return eht1.h;
    }

    private void b(int i, byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        g = a(new Runnable(abyte0, i) {

            private int a;
            private byte b[];
            private int c;
            private eht d;

            public final void run()
            {
                ByteBuffer bytebuffer = ByteBuffer.wrap(eht.a(d));
                ehp.a(b, c, (byte)0, eht.b(d), bytebuffer);
                if (a < 5)
                {
                    try
                    {
                        bytebuffer.array();
                        bytebuffer.position();
                        eht.c(d).write(bytebuffer.array(), 0, bytebuffer.position());
                        a = a + 1;
                        long l = Math.max(750L, Math.min(5000L, (long)(((double)c / 35000D) * 5000D)));
                        eht.a(d, eht.a(d, this, l));
                        return;
                    }
                    catch (IOException ioexception)
                    {
                        eht.b(new IOException("Error sending data", ioexception));
                    }
                    eht.d(d);
                    eht.e(d);
                    return;
                } else
                {
                    eht.b(new IOException("Message resent five times without being ACKed, giving up on this message"));
                    eht.d(d);
                    eht.e(d);
                    return;
                }
            }

            
            {
                d = eht.this;
                b = abyte0;
                c = i;
                super();
            }
        }, 0L);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    static void b(IOException ioexception)
    {
        a(ioexception);
    }

    static byte[] b()
    {
        return c;
    }

    static OutputStream c(eht eht1)
    {
        return eht1.a;
    }

    private boolean c()
    {
        return g != null;
    }

    private void d()
    {
        f.size();
    }

    static void d(eht eht1)
    {
        eht1.a();
    }

    static void e(eht eht1)
    {
        if (eht1.f.size() > 0)
        {
            byte abyte0[] = (byte[])eht1.f.removeLast();
            eht1.d();
            eht1.a(abyte0.length, abyte0);
        }
    }

    static byte[] f(eht eht1)
    {
        return eht1.e;
    }

    static boolean g(eht eht1)
    {
        return eht1.c();
    }

    static byte h(eht eht1)
    {
        return eht1.h;
    }

    final void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (g != null)
        {
            g.cancel(false);
            g = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(byte byte0)
    {
        this;
        JVM INSTR monitorenter ;
        a(new Runnable(byte0) {

            private byte a;
            private eht b;

            public final void run()
            {
                byte byte1 = 0;
                ByteBuffer bytebuffer = ByteBuffer.wrap(eht.f(b));
                if (a == 0)
                {
                    byte1 = 1;
                }
                ehp.a(eht.b(), eht.b().length, (byte)1, byte1, bytebuffer);
                bytebuffer.array();
                bytebuffer.position();
                try
                {
                    eht.c(b).write(bytebuffer.array(), 0, bytebuffer.position());
                    return;
                }
                catch (IOException ioexception)
                {
                    eht.b(ioexception);
                }
            }

            
            {
                b = eht.this;
                a = byte0;
                super();
            }
        }, 0L);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(int i, byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        byte abyte1[];
        if (!c())
        {
            break MISSING_BLOCK_LABEL_65;
        }
        abyte1 = new byte[i];
        System.arraycopy(abyte0, 0, abyte1, 0, i);
        if (f.size() >= 100) goto _L2; else goto _L1
_L1:
        f.addFirst(abyte1);
_L3:
        d();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Assertion.b("Queue full");
          goto _L3
        abyte0;
        throw abyte0;
        b(i, abyte0);
          goto _L4
    }

    public final void b(byte byte0)
    {
        this;
        JVM INSTR monitorenter ;
        Runnable runnable = new Runnable(byte0) {

            private byte a;
            private eht b;

            public final void run()
            {
                if (eht.g(b) && a != eht.b(b))
                {
                    eht.d(b);
                    eht.a(b, a);
                    eht.e(b);
                    return;
                } else
                {
                    Logger.a("ACK ignored. Invalid sequence #. Last sent data had %s got %s", new Object[] {
                        Integer.toHexString(eht.h(b) & 0xff), Integer.toHexString(a & 0xff)
                    });
                    return;
                }
            }

            
            {
                b = eht.this;
                a = byte0;
                super();
            }
        };
        if (!b.isShutdown())
        {
            b.execute(runnable);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
