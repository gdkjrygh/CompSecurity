// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.lang.ref.ReferenceQueue;

// Referenced classes of package com.google.common.collect:
//            MapMakerInternalMap

static final class referent
    implements referent
{

    final Object referent;

    public final void clear(referent referent1)
    {
    }

    public final referent copyFor(ReferenceQueue referencequeue, Object obj, referent referent1)
    {
        return this;
    }

    public final Object get()
    {
        return referent;
    }

    public final referent getEntry()
    {
        return null;
    }

    public final boolean isComputingReference()
    {
        return false;
    }

    (Object obj)
    {
        referent = obj;
    }
}
