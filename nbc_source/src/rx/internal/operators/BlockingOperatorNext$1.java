// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Iterator;
import rx.Observable;

// Referenced classes of package rx.internal.operators:
//            BlockingOperatorNext

static final class val.items
    implements Iterable
{

    final Observable val$items;

    public Iterator iterator()
    {
        xtObserver xtobserver = new xtObserver(null);
        return new xtIterator(val$items, xtobserver, null);
    }

    xtIterator(Observable observable)
    {
        val$items = observable;
        super();
    }
}
