// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Iterator;
import rx.Observable;

// Referenced classes of package rx.internal.operators:
//            BlockingOperatorLatest

static final class val.source
    implements Iterable
{

    final Observable val$source;

    public Iterator iterator()
    {
        testObserverIterator testobserveriterator = new testObserverIterator();
        val$source.materialize().subscribe(testobserveriterator);
        return testobserveriterator;
    }

    testObserverIterator(Observable observable)
    {
        val$source = observable;
        super();
    }
}
