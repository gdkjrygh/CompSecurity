// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import java.lang.ref.ReferenceQueue;

// Referenced classes of package com.google.common.cache:
//            LocalCache

static class referent
    implements referent
{

    final Object referent;

    public final referent copyFor(ReferenceQueue referencequeue, Object obj, referent referent1)
    {
        return this;
    }

    public Object get()
    {
        return referent;
    }

    public final referent getEntry()
    {
        return null;
    }

    public int getWeight()
    {
        return 1;
    }

    public final boolean isActive()
    {
        return true;
    }

    public final boolean isLoading()
    {
        return false;
    }

    public final void notifyNewValue(Object obj)
    {
    }

    public final Object waitForValue()
    {
        return get();
    }

    (Object obj)
    {
        referent = obj;
    }
}
