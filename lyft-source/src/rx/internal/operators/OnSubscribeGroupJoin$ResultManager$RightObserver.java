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
        int i;
        synchronized (this._cls1.this.bserver)
        {
            this._cls1 _lcls1 = this._cls1.this;
            i = _lcls1._fld1;
            _lcls1._fld1 = i + 1;
            _fld1.put(Integer.valueOf(i), obj);
        }
        obj1 = (Observable)rightDuration.call(obj);
        bserver bserver = new bserver(this._cls1.this, i);
        _fld1.add(bserver);
        ((Observable) (obj1)).unsafeSubscribe(bserver);
        ArrayList arraylist;
        synchronized (_fld1)
        {
            arraylist = new ArrayList(_fld1.values());
        }
        try
        {
            for (obj1 = arraylist.iterator(); ((Iterator) (obj1)).hasNext(); ((Observer)((Iterator) (obj1)).next()).onNext(obj)) { }
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
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    bserver()
    {
        this$1 = this._cls1.this;
        super();
    }
}
