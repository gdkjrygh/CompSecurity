// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Notification;
import rx.functions.Func1;

// Referenced classes of package rx.internal.operators:
//            OnSubscribeRedo

class num
    implements Func1
{

    int num;
    final num this$0;

    public volatile Object call(Object obj)
    {
        return call((Notification)obj);
    }

    public Notification call(Notification notification)
    {
        if (cess._mth000(this._cls0.this) != 0L)
        {
            num = num + 1;
            if ((long)num <= cess._mth000(this._cls0.this))
            {
                return Notification.createOnNext(Integer.valueOf(num));
            }
        }
        return notification;
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
        num = 0;
    }
}
