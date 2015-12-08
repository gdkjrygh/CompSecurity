// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

// Referenced classes of package rx.internal.util:
//            IndexedRingBuffer

class <init>
{

    private final AtomicReferenceArray array;
    private final AtomicReference next;

    <init> getNext()
    {
        <init> <init>1;
        if (next.get() != null)
        {
            <init>1 = (next)next.get();
        } else
        {
            <init> <init>2 = new <init>();
            <init>1 = <init>2;
            if (!next.compareAndSet(null, <init>2))
            {
                return (eAndSet)next.get();
            }
        }
        return <init>1;
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
