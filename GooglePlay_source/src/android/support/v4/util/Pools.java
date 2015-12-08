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

    public static final class SimplePool
        implements Pool
    {

        private final Object mPool[];
        private int mPoolSize;

        public final Object acquire()
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

        public final boolean release(Object obj)
        {
            int i;
            boolean flag;
            flag = false;
            i = 0;
_L8:
            if (i >= mPoolSize) goto _L2; else goto _L1
_L1:
            if (mPool[i] != obj) goto _L4; else goto _L3
_L3:
            i = 1;
_L6:
            if (i != 0)
            {
                throw new IllegalStateException("Already in the pool!");
            }
            break; /* Loop/switch isn't completed */
_L4:
            i++;
            continue; /* Loop/switch isn't completed */
_L2:
            i = 0;
            if (true) goto _L6; else goto _L5
_L5:
            if (mPoolSize < mPool.length)
            {
                mPool[mPoolSize] = obj;
                mPoolSize = mPoolSize + 1;
                flag = true;
            }
            return flag;
            if (true) goto _L8; else goto _L7
_L7:
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

}
