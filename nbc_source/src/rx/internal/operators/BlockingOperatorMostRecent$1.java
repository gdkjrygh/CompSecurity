// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Iterator;
import rx.Observable;

// Referenced classes of package rx.internal.operators:
//            BlockingOperatorMostRecent

static final class val.source
    implements Iterable
{

    final Object val$initialValue;
    final Observable val$source;

    public Iterator iterator()
    {
        stRecentObserver strecentobserver = new stRecentObserver(val$initialValue, null);
        val$source.subscribe(strecentobserver);
        return strecentobserver.getIterable();
    }

    stRecentObserver(Object obj, Observable observable)
    {
        val$initialValue = obj;
        val$source = observable;
        super();
    }
}
