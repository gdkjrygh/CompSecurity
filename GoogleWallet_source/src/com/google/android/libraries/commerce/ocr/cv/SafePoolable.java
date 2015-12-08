// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.cv;

import com.google.common.base.Preconditions;

// Referenced classes of package com.google.android.libraries.commerce.ocr.cv:
//            RecyclablePool

public class SafePoolable
{

    private boolean isValid;
    private final Object poolable;
    private final RecyclablePool resourcePool;

    public SafePoolable(RecyclablePool recyclablepool, Object obj)
    {
        resourcePool = recyclablepool;
        poolable = obj;
        isValid = true;
    }

    protected SafePoolable(SafePoolable safepoolable)
    {
        this(safepoolable.resourcePool, safepoolable.poolable);
    }

    public Object get()
    {
        Preconditions.checkState(isValid, "value already recycled and is invalid");
        return poolable;
    }

    public boolean isValid()
    {
        return isValid;
    }

    public void recycle()
    {
        if (isValid)
        {
            resourcePool.recycle(poolable);
        }
        isValid = false;
    }
}
