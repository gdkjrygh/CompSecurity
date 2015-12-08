// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.logging;

import com.google.android.gms.games.internal.GamesLog;
import java.lang.reflect.Array;

// Referenced classes of package com.google.android.gms.games.logging:
//            EventProtoCache

public static final class mClazz
{

    private Object mCache[];
    Class mClazz;
    private int mCount;
    private int mHighWater;
    private final int mLimit;

    public final Object obtain()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (mCount <= 0)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        mCount = mCount - 1;
        obj = mCache[mCount];
        mCache[mCount] = null;
        this;
        JVM INSTR monitorexit ;
        return obj;
        this;
        JVM INSTR monitorexit ;
        Object obj1;
        Exception exception;
        try
        {
            obj1 = mClazz.newInstance();
        }
        catch (Exception exception1)
        {
            GamesLog.e("EventProtoCache", "Exception from mClazz.newInstance ", exception1);
            return null;
        }
        return obj1;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void recycle(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        if (mCount < mLimit)
        {
            mCache[mCount] = obj;
            mCount = mCount + 1;
            if (mCount > mHighWater)
            {
                mHighWater = mCount;
            }
        }
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public (Class class1, int i)
    {
        mLimit = i;
        mCount = 0;
        mHighWater = 0;
        mCache = (Object[])Array.newInstance(class1, i);
        mClazz = class1;
    }
}
