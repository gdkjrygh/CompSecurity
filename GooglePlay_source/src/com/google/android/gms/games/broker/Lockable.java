// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.internal.GamesLog;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class Lockable
    implements Comparable
{
    public static final class LockableLock extends ReentrantLock
    {

        public final String getOwnerInfo()
        {
            Thread thread = getOwner();
            if (thread != null)
            {
                return String.format("%s (tid %s)", new Object[] {
                    thread.getName(), Long.valueOf(thread.getId())
                });
            } else
            {
                return "Not locked";
            }
        }

        public LockableLock()
        {
        }
    }


    private static final AtomicInteger LOCK_COUNTER = new AtomicInteger(0);
    private final ArrayList mChildren = new ArrayList();
    private final LockableLock mLock;
    private final int mLockOrder;
    private final String mTag;

    Lockable(String s, LockableLock lockablelock, Lockable lockable)
    {
        mTag = (String)Preconditions.checkNotNull(s);
        mLock = (LockableLock)Preconditions.checkNotNull(lockablelock);
        mLockOrder = LOCK_COUNTER.getAndAdd(1);
        if (lockable != null)
        {
            Asserts.checkState(lockable.isLockedByCurrentThread());
            boolean flag;
            if (!lockable.mChildren.contains(this))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Asserts.checkState(flag);
            lockable.mChildren.add(this);
            if (lockable.mChildren.size() > 1)
            {
                assertLockOrder(this, (Lockable)lockable.mChildren.get(lockable.mChildren.size() - 2));
            }
        }
    }

    private void acquireLock()
    {
        boolean flag;
        if (!mLock.isHeldByCurrentThread())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        mLock.lock();
    }

    private static void acquireLocks(List list)
    {
        int i = 0;
        for (int j = list.size(); i < j; i++)
        {
            Lockable lockable = (Lockable)list.get(i);
            if (i > 0)
            {
                assertLockOrder(lockable, (Lockable)list.get(i - 1));
            }
            lockable.acquireLock();
        }

    }

    public static transient void acquireLocks(Lockable alockable[])
    {
        boolean flag;
        if (alockable != null && alockable.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        alockable = Arrays.asList(alockable);
        Collections.sort(alockable);
        acquireLocks(((List) (alockable)));
    }

    private static void assertLockOrder(Lockable lockable, Lockable lockable1)
    {
        if (lockable.mLockOrder <= lockable1.mLockOrder)
        {
            GamesLog.e("Lockable", (new StringBuilder("Invalid lock ordering: locking ")).append(lockable.mTag).append("(").append(lockable.mLockOrder).append(") after ").append(lockable1.mTag).append("(").append(lockable1.mLockOrder).append(")").toString());
            throw new IllegalStateException("Invalid lock ordering!");
        } else
        {
            return;
        }
    }

    private void releaseLock()
    {
        Asserts.checkState(mLock.isHeldByCurrentThread());
        mLock.unlock();
    }

    private static void releaseLocks(List list)
    {
        int i = 0;
        for (int j = list.size(); i < j; i++)
        {
            ((Lockable)list.get(i)).releaseLock();
        }

    }

    public static transient void releaseLocks(Lockable alockable[])
    {
        boolean flag;
        if (alockable != null && alockable.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        releaseLocks(Arrays.asList(alockable));
    }

    public void acquireLockOnAllChildren()
    {
        boolean flag;
        if (!mChildren.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        acquireLock();
        acquireLocks(mChildren);
        releaseLock();
        return;
        Exception exception;
        exception;
        releaseLock();
        throw exception;
    }

    public void assertAllChildrenLockedByCurrentThread()
    {
        int i;
        boolean flag;
        if (!mChildren.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        i = 0;
        for (int j = mChildren.size(); i < j; i++)
        {
            Lockable lockable = (Lockable)mChildren.get(i);
            Asserts.checkState(lockable.isLockedByCurrentThread(), (new StringBuilder("Lock not held: ")).append(lockable.mTag).toString());
        }

    }

    public void assertLockedByCurrentThread()
    {
        Asserts.checkState(isLockedByCurrentThread(), (new StringBuilder("Lock ")).append(mTag).append(" not held by thread!").toString());
    }

    public void assertNoChildrenLockedByCurrentThread()
    {
        int i;
        int j;
        boolean flag;
        if (!mChildren.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        i = 0;
        j = mChildren.size();
        while (i < j) 
        {
            Lockable lockable = (Lockable)mChildren.get(i);
            if (!lockable.isLockedByCurrentThread())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Asserts.checkState(flag, (new StringBuilder("Lock still held: ")).append(lockable.mTag).toString());
            i++;
        }
    }

    public int compareTo(Lockable lockable)
    {
        return mLockOrder - lockable.mLockOrder;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((Lockable)obj);
    }

    public void dumpLockInfo(PrintWriter printwriter, String s)
    {
        printwriter.print(s);
        printwriter.print(mTag);
        printwriter.print(" - ");
        printwriter.println(mLock.getOwnerInfo());
        s = (new StringBuilder()).append(s).append("  ").toString();
        int i = 0;
        for (int j = mChildren.size(); i < j; i++)
        {
            ((Lockable)mChildren.get(i)).dumpLockInfo(printwriter, s);
        }

    }

    public boolean isLockedByCurrentThread()
    {
        return mLock.isHeldByCurrentThread();
    }

    public void releaseLockOnAllChildren()
    {
        boolean flag;
        if (!mChildren.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        releaseLocks(mChildren);
    }

}
