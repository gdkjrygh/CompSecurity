// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;


public final class Pools
{
    public static interface Pool
    {

        public abstract Object acquire();

        public abstract boolean release(Object obj);
    }

    public static class SimplePool
        implements Pool
    {

        private final Object mPool[];
        private int mPoolSize;

        private boolean isInPool(Object obj)
        {
            for (int i = 0; i < mPoolSize; i++)
            {
                if (mPool[i] == obj)
                {
                    return true;
                }
            }

            return false;
        }

        public Object acquire()
        {
            if (mPoolSize > 0)
            {
                int i = mPoolSize - 1;
                Object obj = mPool[i];
                mPool[i] = null;
                mPoolSize = mPoolSize - 1;
                return obj;
            } else
            {
                return null;
            }
        }

        public boolean release(Object obj)
        {
            if (isInPool(obj))
            {
                throw new IllegalStateException("Already in the pool!");
            }
            if (mPoolSize < mPool.length)
            {
                mPool[mPoolSize] = obj;
                mPoolSize = mPoolSize + 1;
                return true;
            } else
            {
                return false;
            }
        }

        public SimplePool(int i)
        {
            if (i <= 0)
            {
                throw new IllegalArgumentException("The max pool size must be > 0");
            } else
            {
                mPool = new Object[i];
                return;
            }
        }
    }

    public static class SynchronizedPool extends SimplePool
    {

        private final Object mLock = new Object();

        public Object acquire()
        {
            Object obj1;
            synchronized (mLock)
            {
                obj1 = super.acquire();
            }
            return obj1;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public boolean release(Object obj)
        {
            boolean flag;
            synchronized (mLock)
            {
                flag = super.release(obj);
            }
            return flag;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public SynchronizedPool(int i)
        {
            super(i);
        }
    }


    private Pools()
    {
    }
}
