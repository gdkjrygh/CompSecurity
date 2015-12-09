// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.cv;

import android.util.Log;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Stack;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.cv:
//            RecyclablePool, SafePoolable

public class ResourcePool
    implements RecyclablePool
{
    public static class ResourcePoolClosedException extends Exception
    {

        private ResourcePoolClosedException()
        {
        }

    }


    private static final String TAG = "ResourcePool";
    private final Stack available = new Stack();
    private boolean isClosed;
    private final ArrayList pool;
    private final int poolCapacity;
    private final Provider provider;

    public ResourcePool(int i, Provider provider1)
    {
        poolCapacity = i;
        provider = provider1;
        pool = new ArrayList(i);
        isClosed = false;
    }

    public void close()
    {
        this;
        JVM INSTR monitorenter ;
        isClosed = true;
        pool.clear();
        available.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void evict()
    {
        this;
        JVM INSTR monitorenter ;
        isClosed = false;
        pool.clear();
        available.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public int getAvailableResources()
    {
        return available.size();
    }

    boolean isAvailable(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = available.contains(obj);
        this;
        JVM INSTR monitorexit ;
        return flag;
        obj;
        throw obj;
    }

    public boolean isInPool(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = pool.contains(obj);
        this;
        JVM INSTR monitorexit ;
        return flag;
        obj;
        throw obj;
    }

    Object obtain()
        throws NoSuchElementException, ResourcePoolClosedException
    {
        this;
        JVM INSTR monitorenter ;
        if (isClosed)
        {
            throw new ResourcePoolClosedException();
        }
        break MISSING_BLOCK_LABEL_23;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj;
        if (available.isEmpty())
        {
            break MISSING_BLOCK_LABEL_45;
        }
        obj = available.pop();
_L1:
        this;
        JVM INSTR monitorexit ;
        return obj;
label0:
        {
            if (pool.size() >= poolCapacity)
            {
                break label0;
            }
            obj = provider.get();
            pool.add(obj);
            Log.v("ResourcePool", String.format("add (%s) to pool. Size: %d", new Object[] {
                obj, Integer.valueOf(pool.size())
            }));
        }
          goto _L1
        throw new NoSuchElementException("Pool is exhausted");
    }

    public SafePoolable obtainSafePoolable()
    {
        this;
        JVM INSTR monitorenter ;
        SafePoolable safepoolable = new SafePoolable(this, obtain());
_L2:
        this;
        JVM INSTR monitorexit ;
        return safepoolable;
        Object obj;
        obj;
_L3:
        Log.d("ResourcePool", "Pool limit reached, returning unmanaged resource.");
        obj = new SafePoolable(this, provider.get());
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
        obj;
          goto _L3
    }

    public boolean recycle(Object obj)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        boolean flag = isInPool(obj);
        if (flag) goto _L2; else goto _L1
_L1:
        flag = flag1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        boolean flag2;
        if (!isClosed)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Object should not be in a *closed* pool");
        if (available.contains(obj))
        {
            break MISSING_BLOCK_LABEL_63;
        }
        flag2 = available.add(obj);
        flag = flag1;
        if (!flag2)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        throw obj;
    }
}
