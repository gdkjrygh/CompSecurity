// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.cv;

import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.libraries.commerce.ocr.cv:
//            RecyclablePool, SafePoolable

public class SafeCountingPool
    implements RecyclablePool
{

    private static final String TAG = "SafeCountingPool";
    private final AtomicInteger numReferences = new AtomicInteger(0);
    private final SafePoolable safePoolable;

    public SafeCountingPool(SafePoolable safepoolable)
    {
        safePoolable = safepoolable;
    }

    public boolean recycle(Object obj)
    {
        if (obj != safePoolable.get())
        {
            Log.w("SafeCountingPool", "Resource recycled was not the same as the one managed by this pool");
        } else
        if (numReferences.decrementAndGet() <= 0)
        {
            safePoolable.recycle();
            obj = String.valueOf(safePoolable);
            Log.d("SafeCountingPool", (new StringBuilder(String.valueOf(obj).length() + 38)).append("Resource released from counting pool: ").append(((String) (obj))).toString());
            return true;
        }
        return false;
    }

    public SafePoolable useReference()
    {
        numReferences.incrementAndGet();
        return new SafePoolable(this, safePoolable.get());
    }
}
