// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package rx.internal.operators:
//            OnSubscribeAmb

private static class <init>
{

    final Collection ambSubscribers;
    final AtomicReference choice;

    public void unsubscribeLosers()
    {
        ber ber = (ber)choice.get();
        if (ber != null)
        {
            unsubscribeOthers(ber);
        }
    }

    public void unsubscribeOthers(ber ber)
    {
        Iterator iterator = ambSubscribers.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ber ber1 = (ber)iterator.next();
            if (ber1 != ber)
            {
                ber1.unsubscribe();
            }
        } while (true);
        ambSubscribers.clear();
    }

    private ber()
    {
        choice = new AtomicReference();
        ambSubscribers = new ConcurrentLinkedQueue();
    }

    t>(t> t>)
    {
        this();
    }
}
