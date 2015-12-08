// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

// Referenced classes of package com.google.common.collect:
//            MapMakerInternalMap

static final class entry extends SoftReference
    implements entry
{

    final entry entry;

    public final void clear(entry entry1)
    {
        clear();
    }

    public final clear copyFor(ReferenceQueue referencequeue, Object obj, clear clear1)
    {
        return new <init>(referencequeue, obj, clear1);
    }

    public final <init> getEntry()
    {
        return entry;
    }

    public final boolean isComputingReference()
    {
        return false;
    }

    (ReferenceQueue referencequeue, Object obj,  )
    {
        super(obj, referencequeue);
        entry = ;
    }
}
