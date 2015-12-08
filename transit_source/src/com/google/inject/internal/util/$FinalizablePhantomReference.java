// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.lang.ref.PhantomReference;

// Referenced classes of package com.google.inject.internal.util:
//            $FinalizableReference, $FinalizableReferenceQueue

public abstract class $FinalizablePhantomReference extends PhantomReference
    implements $FinalizableReference
{

    protected $FinalizablePhantomReference(Object obj, $FinalizableReferenceQueue $finalizablereferencequeue)
    {
        super(obj, $finalizablereferencequeue.queue);
        $finalizablereferencequeue.cleanUp();
    }
}
