// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.NSLogger;

import android.util.Log;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.LogRecord;

// Referenced classes of package com.NSLogger:
//            NSLoggerClient

public final class tMessage
{

    final NSLoggerClient a;
    private byte b[];
    private int c;
    private final int d;
    private short e;
    private ReentrantLock f;
    private Condition g;

    private void a(int i)
    {
        int j = b.length;
        if (j >= c + i)
        {
            return;
        } else
        {
            byte abyte0[] = new byte[Math.max(j + j / 2, c + i + 64)];
            System.arraycopy(b, 0, abyte0, 0, c);
            b = abyte0;
            return;
        }
    }

    public int a()
    {
        return d;
    }

    public void a(int i, int j)
    {
        a(4);
        int l = c;
        byte abyte0[] = b;
        int k = l + 1;
        abyte0[l] = (byte)j;
        abyte0 = b;
        j = k + 1;
        abyte0[k] = 2;
        abyte0 = b;
        k = j + 1;
        abyte0[j] = (byte)(i >> 8);
        b[k] = (byte)i;
        c = k + 1;
        e = (short)(e + 1);
    }

    public void a(int i, int j, byte abyte0[])
    {
        int k = abyte0.length;
        a(k + 6);
        int i1 = c;
        byte abyte1[] = b;
        int l = i1 + 1;
        abyte1[i1] = (byte)i;
        abyte1 = b;
        i = l + 1;
        abyte1[l] = (byte)j;
        abyte1 = b;
        j = i + 1;
        abyte1[i] = (byte)(k >> 24);
        abyte1 = b;
        i = j + 1;
        abyte1[j] = (byte)(k >> 16);
        abyte1 = b;
        j = i + 1;
        abyte1[i] = (byte)(k >> 8);
        abyte1 = b;
        i = j + 1;
        abyte1[j] = (byte)k;
        System.arraycopy(abyte0, 0, b, i, k);
        c = k + i;
        e = (short)(e + 1);
    }

    void a(long l)
    {
        long l1 = l;
        if (l == 0L)
        {
            l1 = System.currentTimeMillis();
        }
        a(l1 / 1000L, 1);
        a((int)(l1 % 1000L), 2);
    }

    public void a(long l, int i)
    {
        a(10);
        int k = c;
        byte abyte0[] = b;
        int j = k + 1;
        abyte0[k] = (byte)i;
        abyte0 = b;
        i = j + 1;
        abyte0[j] = 4;
        abyte0 = b;
        j = i + 1;
        abyte0[i] = (byte)(int)(l >> 56);
        abyte0 = b;
        i = j + 1;
        abyte0[j] = (byte)(int)(l >> 48);
        abyte0 = b;
        j = i + 1;
        abyte0[i] = (byte)(int)(l >> 40);
        abyte0 = b;
        i = j + 1;
        abyte0[j] = (byte)(int)(l >> 32);
        abyte0 = b;
        j = i + 1;
        abyte0[i] = (byte)(int)(l >> 24);
        abyte0 = b;
        i = j + 1;
        abyte0[j] = (byte)(int)(l >> 16);
        abyte0 = b;
        j = i + 1;
        abyte0[i] = (byte)(int)(l >> 8);
        b[j] = (byte)(int)l;
        c = j + 1;
        e = (short)(e + 1);
    }

    public void a(String s, int i)
    {
        a(i, 0, s.getBytes(NSLoggerClient.k));
    }

    protected void b()
    {
        f = new ReentrantLock();
        g = f.newCondition();
        f.lock();
    }

    public void b(int i, int j)
    {
        a(6);
        int l = c;
        byte abyte0[] = b;
        int k = l + 1;
        abyte0[l] = (byte)j;
        abyte0 = b;
        j = k + 1;
        abyte0[k] = 3;
        abyte0 = b;
        k = j + 1;
        abyte0[j] = (byte)(i >> 24);
        abyte0 = b;
        j = k + 1;
        abyte0[k] = (byte)(i >> 16);
        abyte0 = b;
        k = j + 1;
        abyte0[j] = (byte)(i >> 8);
        b[k] = (byte)i;
        c = k + 1;
        e = (short)(e + 1);
    }

    void b(long l)
    {
        String s1;
        Thread thread;
        s1 = null;
        thread = Thread.currentThread();
        if (thread.getId() != l) goto _L2; else goto _L1
_L1:
        String s = thread.getName();
_L4:
label0:
        {
            if (s != null)
            {
                s1 = s;
                if (!s.isEmpty())
                {
                    break label0;
                }
            }
            s1 = Long.toString(l);
        }
        a(s1, 4);
        return;
_L2:
        Thread athread[] = new Thread[Thread.activeCount()];
        Thread.enumerate(athread);
        int j = athread.length;
        int i = 0;
        do
        {
            s = s1;
            if (i < j)
            {
label1:
                {
                    if (athread[i].getId() != l)
                    {
                        break label1;
                    }
                    s = thread.getName();
                }
            }
            if (true)
            {
                continue;
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void c()
    {
        Exception exception;
        try
        {
            Log.v("NSLogger", String.format("waiting for flush of message %d", new Object[] {
                Integer.valueOf(d)
            }));
            g.await();
        }
        catch (InterruptedException interruptedexception)
        {
            f.unlock();
            return;
        }
        finally
        {
            f.unlock();
        }
        f.unlock();
        return;
        throw exception;
    }

    protected void d()
    {
        if (f != null)
        {
            Log.v("NSLogger", String.format("marking message %d as flushed", new Object[] {
                Integer.valueOf(d)
            }));
            f.lock();
            g.signal();
            f.unlock();
        }
    }

    byte[] e()
    {
        int i = c - 4;
        b[0] = (byte)(i >> 24);
        b[1] = (byte)(i >> 16);
        b[2] = (byte)(i >> 8);
        b[3] = (byte)i;
        b[4] = (byte)(e >> 8);
        b[5] = (byte)e;
        if (c == b.length)
        {
            return b;
        } else
        {
            byte abyte0[] = new byte[c];
            System.arraycopy(b, 0, abyte0, 0, c);
            b = null;
            return abyte0;
        }
    }

    public (NSLoggerClient nsloggerclient, int i, int j)
    {
        a = nsloggerclient;
        super();
        d = j;
        b = new byte[256];
        c = 6;
        b(i, 0);
        b(d, 10);
        a(0L);
        b(Thread.currentThread().getId());
    }

    public (NSLoggerClient nsloggerclient, LogRecord logrecord, int i)
    {
        a = nsloggerclient;
        super();
        d = i;
        b = new byte[logrecord.getMessage().length() + 64];
        c = 6;
        a(logrecord.getMillis());
        b(0, 0);
        b(d, 10);
        a(Long.toString(logrecord.getThreadID()), 4);
        a(logrecord.getLevel().intValue(), 6);
        a((new StringBuilder()).append(logrecord.getSourceClassName()).append(".").append(logrecord.getSourceMethodName()).toString(), 13);
        a(logrecord.getMessage(), 7);
    }
}
