// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;


// Referenced classes of package com.google.inject.internal.util:
//            $FinalizableWeakReference, $MapMaker

private static class entry extends $FinalizableWeakReference
    implements entry
{

    final get entry;

    public entry copyFor(entry entry1)
    {
        return new <init>(get(), entry1);
    }

    public void finalizeReferent()
    {
        entry.eReclaimed();
    }

    public Object waitForValue()
        throws InterruptedException
    {
        return get();
    }

    (Object obj,  )
    {
        super(obj, it>);
        entry = ;
    }
}
