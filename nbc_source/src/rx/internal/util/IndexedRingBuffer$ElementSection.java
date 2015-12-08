// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

// Referenced classes of package rx.internal.util:
//            IndexedRingBuffer

private static class <init>
{

    private final AtomicReferenceArray array;
    private final AtomicReference next;

    <init> getNext()
    {
        if (next.get() != null)
        {
            return (next)next.get();
        }
        <init> <init>1 = new <init>();
        if (next.compareAndSet(null, <init>1))
        {
            return <init>1;
        } else
        {
            return (eAndSet)next.get();
        }
    }



    private ()
    {
        array = new AtomicReferenceArray(IndexedRingBuffer.SIZE);
        next = new AtomicReference();
    }

    ( )
    {
        this();
    }
}
