// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.util.Log;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            CancelState, StringUtils

class ProfileState
    implements CancelState
{

    private static final String i = StringUtils.a(com/threatmetrix/TrustDefenderMobile/ProfileState);
    boolean a;
    boolean b;
    boolean c;
    boolean d;
    boolean e;
    CountDownLatch f;
    CountDownLatch g;
    private final ReentrantReadWriteLock h = new ReentrantReadWriteLock();

    ProfileState()
    {
        a = false;
        b = false;
        c = false;
        d = false;
        e = false;
        f = null;
        g = null;
    }

    public boolean a()
    {
        h.readLock().lock();
        boolean flag = c;
        h.readLock().unlock();
        return flag;
        Exception exception;
        exception;
        h.readLock().unlock();
        throw exception;
    }

    boolean a(int i1)
    {
        h.readLock().lock();
        if (a && f != null) goto _L2; else goto _L1
_L1:
        Log.d(i, "init not in progress, nothing to wait for");
        boolean flag1;
        flag1 = true;
        h.readLock().unlock();
_L4:
        return flag1;
_L2:
        CountDownLatch countdownlatch = f;
        long l1;
        h.readLock().unlock();
        Log.d(i, "Waiting for init to complete");
        l1 = i1;
        boolean flag = countdownlatch.await(l1, TimeUnit.MILLISECONDS);
        flag1 = flag;
        if (flag) goto _L4; else goto _L3
_L3:
        Log.e(i, "Timed out waiting for init to complete");
        return flag;
        Object obj;
        obj;
_L6:
        Log.e(i, "Waiting for init to complete interrupted", ((Throwable) (obj)));
        return flag;
        obj;
        h.readLock().unlock();
        throw obj;
        obj;
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    boolean a(boolean flag)
    {
        h.writeLock().lock();
        if (e) goto _L2; else goto _L1
_L1:
        if (!flag) goto _L4; else goto _L3
_L3:
        if (!b) goto _L5; else goto _L4
_L5:
        if (!d)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        Log.d(i, "startScanning: aborted, marked as cancelled");
        d = false;
        h.writeLock().unlock();
        return false;
        e = true;
        g = new CountDownLatch(1);
        h.writeLock().unlock();
        return true;
_L2:
        h.writeLock().unlock();
        return false;
        Exception exception;
        exception;
        h.writeLock().unlock();
        throw exception;
_L4:
        if (flag) goto _L2; else goto _L5
    }

    void b()
    {
        h.writeLock().lock();
        a = false;
        b = false;
        e = false;
        d = false;
        c = false;
        h.writeLock().unlock();
        return;
        Exception exception;
        exception;
        h.writeLock().unlock();
        throw exception;
    }

    boolean c()
    {
        h.readLock().lock();
        boolean flag = a;
        h.readLock().unlock();
        return flag;
        Exception exception;
        exception;
        h.readLock().unlock();
        throw exception;
    }

    boolean d()
    {
        h.readLock().lock();
        if (!a) goto _L2; else goto _L1
_L1:
        long l1 = f.getCount();
        if (l1 != 0L) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        h.readLock().unlock();
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        h.readLock().unlock();
        throw exception;
    }

    boolean e()
    {
        h.writeLock().lock();
        if (a)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        a = true;
        f = new CountDownLatch(1);
        h.writeLock().unlock();
        return true;
        h.writeLock().unlock();
        return false;
        Exception exception;
        exception;
        h.writeLock().unlock();
        throw exception;
    }

    void f()
    {
        h.readLock().lock();
        CountDownLatch countdownlatch = f;
        h.readLock().unlock();
        if (countdownlatch != null)
        {
            countdownlatch.countDown();
        }
        return;
        Exception exception;
        exception;
        h.readLock().unlock();
        throw exception;
    }

    boolean g()
    {
        CountDownLatch countdownlatch;
        countdownlatch = null;
        h.readLock().lock();
        if (a)
        {
            countdownlatch = f;
        }
        h.readLock().unlock();
        Exception exception;
        return countdownlatch != null && countdownlatch.getCount() > 0L;
        exception;
        h.readLock().unlock();
        throw exception;
    }

    boolean h()
    {
        h.readLock().lock();
        boolean flag = b;
        h.readLock().unlock();
        return flag;
        Exception exception;
        exception;
        h.readLock().unlock();
        throw exception;
    }

    boolean i()
    {
        h.writeLock().lock();
        if (b)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        b = true;
        c = false;
        h.writeLock().unlock();
        return true;
        h.writeLock().unlock();
        return false;
        Exception exception;
        exception;
        h.writeLock().unlock();
        throw exception;
    }

    void j()
    {
        h.writeLock().lock();
        b = false;
        h.writeLock().unlock();
        return;
        Exception exception;
        exception;
        h.writeLock().unlock();
        throw exception;
    }

    boolean k()
    {
        h.writeLock().lock();
        if (c)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        c = true;
        h.writeLock().unlock();
        return true;
        h.writeLock().unlock();
        return false;
        Exception exception;
        exception;
        h.writeLock().unlock();
        throw exception;
    }

    boolean l()
    {
        h.writeLock().lock();
        if (!c)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        c = false;
        d = false;
        h.writeLock().unlock();
        return true;
        h.writeLock().unlock();
        return false;
        Exception exception;
        exception;
        h.writeLock().unlock();
        throw exception;
    }

    boolean m()
    {
        Log.d(i, "Attempting to cancel doPackageScan");
        h.writeLock().lock();
        if (d)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        d = true;
        h.writeLock().unlock();
        return true;
        h.writeLock().unlock();
        return false;
        Exception exception;
        exception;
        h.writeLock().unlock();
        throw exception;
    }

    void n()
    {
        CountDownLatch countdownlatch;
        countdownlatch = null;
        h.readLock().lock();
        if (e)
        {
            e = false;
            d = false;
            countdownlatch = g;
        }
        h.readLock().unlock();
        if (countdownlatch != null)
        {
            countdownlatch.countDown();
        }
        return;
        Exception exception;
        exception;
        h.readLock().unlock();
        throw exception;
    }

    boolean o()
    {
        h.readLock().lock();
        if (e && g != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        Log.d(i, "waitForScan: No scan in progress, nothing to wait for");
        h.readLock().unlock();
        return true;
        CountDownLatch countdownlatch = g;
        h.readLock().unlock();
        Log.d(i, "waitForScan: Waiting for scan to complete");
        try
        {
            countdownlatch.await();
        }
        catch (Object obj)
        {
            if (!a())
            {
                Log.e(i, "waitForScan: Waiting for scan to complete interrupted", ((Throwable) (obj)));
                return false;
            } else
            {
                Log.d(i, "waitForScan: interrupted by cancel");
                return false;
            }
        }
        return true;
        obj;
        h.readLock().unlock();
        throw obj;
    }

    boolean p()
    {
        CountDownLatch countdownlatch;
        countdownlatch = null;
        h.readLock().lock();
        if (e)
        {
            countdownlatch = g;
        }
        h.readLock().unlock();
        Exception exception;
        return countdownlatch != null && countdownlatch.getCount() > 0L;
        exception;
        h.readLock().unlock();
        throw exception;
    }

}
