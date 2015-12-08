// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.FinalizableSoftReference;

// Referenced classes of package com.google.common.collect:
//            CustomConcurrentHashMap

private static class entry extends FinalizableSoftReference
    implements entry
{

    final get entry;

    public entry copyFor(entry entry1)
    {
        return new <init>(get(), entry1);
    }

    public void finalizeReferent()
    {
        entry.fyValueReclaimed(this);
    }

    public boolean isComputingReference()
    {
        return false;
    }

    public void notifyValueReclaimed()
    {
        finalizeReferent();
    }

    public Object waitForValue()
    {
        return get();
    }

    (Object obj,  )
    {
        super(obj, );
        entry = ;
    }
}
