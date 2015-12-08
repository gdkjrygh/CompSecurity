// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.functions.Action1;
import rx.observables.ConnectableObservable;

// Referenced classes of package rx.internal.operators:
//            OperatorReplay

final class nit> extends ConnectableObservable
{

    final ConnectableObservable val$co;

    public void connect(Action1 action1)
    {
        val$co.connect(action1);
    }

    (ConnectableObservable connectableobservable)
    {
        val$co = connectableobservable;
        super(final_cribe);
    }
}
