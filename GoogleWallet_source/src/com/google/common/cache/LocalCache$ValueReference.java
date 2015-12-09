// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.common.cache:
//            LocalCache

static interface 
{

    public abstract  copyFor(ReferenceQueue referencequeue, Object obj,  );

    public abstract Object get();

    public abstract  getEntry();

    public abstract int getWeight();

    public abstract boolean isActive();

    public abstract boolean isLoading();

    public abstract void notifyNewValue(Object obj);

    public abstract Object waitForValue()
        throws ExecutionException;
}
