// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.observers.SerializedObserver;
import rx.subjects.PublishSubject;
import rx.subscriptions.CompositeSubscription;

// Referenced classes of package rx.internal.operators:
//            OnSubscribeGroupJoin

final class this._cls1 extends Subscriber
{

    final onError this$1;

    public void onCompleted()
    {
        ArrayList arraylist = null;
        synchronized (_fld1)
        {
            _fld1 = true;
            if (_fld1)
            {
                arraylist = new ArrayList(_fld1.values());
                _fld1.clear();
                _fld1.clear();
            }
        }
        _mth1(arraylist);
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onError(Throwable throwable)
    {
        _mth1(throwable);
    }

    public void onNext(Object obj)
    {
        SerializedObserver serializedobserver;
        Object obj2;
        obj2 = PublishSubject.create();
        serializedobserver = new SerializedObserver(((Observer) (obj2)));
        int i;
        synchronized (this._cls1.this.bserver)
        {
            this._cls1 _lcls1 = this._cls1.this;
            i = _lcls1._fld1;
            _lcls1._fld1 = i + 1;
            _fld1.put(Integer.valueOf(i), serializedobserver);
        }
        obj1 = Observable.create(new (((Observable) (obj2)), ));
        obj2 = (Observable)leftDuration.call(obj);
        bserver bserver = new bserver(this._cls1.this, i);
        _fld1.add(bserver);
        ((Observable) (obj2)).unsafeSubscribe(bserver);
        obj1 = resultSelector.call(obj, obj1);
        ArrayList arraylist;
        synchronized (_fld1)
        {
            arraylist = new ArrayList(_fld1.values());
        }
        try
        {
            _fld1.onNext(obj1);
            for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); serializedobserver.onNext(((Iterator) (obj)).next())) { }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            onError(((Throwable) (obj)));
        }
        return;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    bserver()
    {
        this$1 = this._cls1.this;
        super();
    }
}
