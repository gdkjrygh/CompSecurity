// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.IOException;
import java.io.InterruptedIOException;

// Referenced classes of package okio:
//            Timeout, Sink, Source, Buffer

public class AsyncTimeout extends Timeout
{
    private static final class Watchdog extends Thread
    {

        public void run()
        {
            do
            {
                AsyncTimeout asynctimeout;
                do
                {
                    asynctimeout = AsyncTimeout.awaitTimeout();
                } while (asynctimeout == null);
                try
                {
                    asynctimeout.timedOut();
                }
                catch (InterruptedException interruptedexception) { }
            } while (true);
        }

        public Watchdog()
        {
            super("Okio Watchdog");
            setDaemon(true);
        }
    }


    private static AsyncTimeout head;
    private boolean inQueue;
    private AsyncTimeout next;
    private long timeoutAt;

    public AsyncTimeout()
    {
    }

    private static AsyncTimeout awaitTimeout()
        throws InterruptedException
    {
        okio/AsyncTimeout;
        JVM INSTR monitorenter ;
        AsyncTimeout asynctimeout = head.next;
        if (asynctimeout != null) goto _L2; else goto _L1
_L1:
        okio/AsyncTimeout.wait();
        asynctimeout = null;
_L4:
        okio/AsyncTimeout;
        JVM INSTR monitorexit ;
        return asynctimeout;
_L2:
        long l = asynctimeout.remainingNanos(System.nanoTime());
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        long l1 = l / 0xf4240L;
        okio/AsyncTimeout.wait(l1, (int)(l - l1 * 0xf4240L));
        asynctimeout = null;
        continue; /* Loop/switch isn't completed */
        head.next = asynctimeout.next;
        asynctimeout.next = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private static boolean cancelScheduledTimeout(AsyncTimeout asynctimeout)
    {
        okio/AsyncTimeout;
        JVM INSTR monitorenter ;
        AsyncTimeout asynctimeout1 = head;
_L8:
        if (asynctimeout1 == null) goto _L2; else goto _L1
_L1:
        if (asynctimeout1.next != asynctimeout) goto _L4; else goto _L3
_L3:
        asynctimeout1.next = asynctimeout.next;
        asynctimeout.next = null;
        boolean flag = false;
_L6:
        okio/AsyncTimeout;
        JVM INSTR monitorexit ;
        return flag;
_L4:
        asynctimeout1 = asynctimeout1.next;
        continue; /* Loop/switch isn't completed */
_L2:
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
        asynctimeout;
        throw asynctimeout;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private long remainingNanos(long l)
    {
        return timeoutAt - l;
    }

    private static void scheduleTimeout(AsyncTimeout asynctimeout, long l, boolean flag)
    {
        okio/AsyncTimeout;
        JVM INSTR monitorenter ;
        long l1;
        if (head == null)
        {
            head = new AsyncTimeout();
            (new Watchdog()).start();
        }
        l1 = System.nanoTime();
        if (l == 0L || !flag) goto _L2; else goto _L1
_L1:
        asynctimeout.timeoutAt = Math.min(l, asynctimeout.deadlineNanoTime() - l1) + l1;
_L3:
        l = asynctimeout.remainingNanos(l1);
        for (AsyncTimeout asynctimeout1 = head; asynctimeout1.next != null && l >= asynctimeout1.next.remainingNanos(l1); asynctimeout1 = asynctimeout1.next)
        {
            break MISSING_BLOCK_LABEL_175;
        }

        asynctimeout.next = asynctimeout1.next;
        asynctimeout1.next = asynctimeout;
        if (asynctimeout1 == head)
        {
            okio/AsyncTimeout.notify();
        }
        okio/AsyncTimeout;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (l == 0L)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        asynctimeout.timeoutAt = l1 + l;
          goto _L3
        asynctimeout;
        throw asynctimeout;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        asynctimeout.timeoutAt = asynctimeout.deadlineNanoTime();
          goto _L3
        throw new AssertionError();
    }

    public final void enter()
    {
        if (inQueue)
        {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long l = timeoutNanos();
        boolean flag = hasDeadline();
        if (l == 0L && !flag)
        {
            return;
        } else
        {
            inQueue = true;
            scheduleTimeout(this, l, flag);
            return;
        }
    }

    final IOException exit(IOException ioexception)
        throws IOException
    {
        if (!exit())
        {
            return ioexception;
        } else
        {
            InterruptedIOException interruptedioexception = new InterruptedIOException("timeout");
            interruptedioexception.initCause(ioexception);
            return interruptedioexception;
        }
    }

    final void exit(boolean flag)
        throws IOException
    {
        if (exit() && flag)
        {
            throw new InterruptedIOException("timeout");
        } else
        {
            return;
        }
    }

    public final boolean exit()
    {
        if (!inQueue)
        {
            return false;
        } else
        {
            inQueue = false;
            return cancelScheduledTimeout(this);
        }
    }

    public final Sink sink(final Sink sink)
    {
        return new Sink() {

            final AsyncTimeout this$0;
            final Sink val$sink;

            public void close()
                throws IOException
            {
                enter();
                sink.close();
                exit(true);
                return;
                Object obj;
                obj;
                throw exit(((IOException) (obj)));
                obj;
                exit(false);
                throw obj;
            }

            public void flush()
                throws IOException
            {
                enter();
                sink.flush();
                exit(true);
                return;
                Object obj;
                obj;
                throw exit(((IOException) (obj)));
                obj;
                exit(false);
                throw obj;
            }

            public Timeout timeout()
            {
                return AsyncTimeout.this;
            }

            public String toString()
            {
                return (new StringBuilder()).append("AsyncTimeout.sink(").append(sink).append(")").toString();
            }

            public void write(Buffer buffer, long l)
                throws IOException
            {
                enter();
                sink.write(buffer, l);
                exit(true);
                return;
                buffer;
                throw exit(buffer);
                buffer;
                exit(false);
                throw buffer;
            }

            
            {
                this$0 = AsyncTimeout.this;
                sink = sink1;
                super();
            }
        };
    }

    public final Source source(final Source source)
    {
        return new Source() {

            final AsyncTimeout this$0;
            final Source val$source;

            public void close()
                throws IOException
            {
                source.close();
                exit(true);
                return;
                Object obj;
                obj;
                throw exit(((IOException) (obj)));
                obj;
                exit(false);
                throw obj;
            }

            public long read(Buffer buffer, long l)
                throws IOException
            {
                enter();
                l = source.read(buffer, l);
                exit(true);
                return l;
                buffer;
                throw exit(buffer);
                buffer;
                exit(false);
                throw buffer;
            }

            public Timeout timeout()
            {
                return AsyncTimeout.this;
            }

            public String toString()
            {
                return (new StringBuilder()).append("AsyncTimeout.source(").append(source).append(")").toString();
            }

            
            {
                this$0 = AsyncTimeout.this;
                source = source1;
                super();
            }
        };
    }

    protected void timedOut()
    {
    }

}
