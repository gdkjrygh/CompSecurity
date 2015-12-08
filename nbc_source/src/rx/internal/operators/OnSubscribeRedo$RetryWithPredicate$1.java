// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Notification;
import rx.functions.Func2;

// Referenced classes of package rx.internal.operators:
//            OnSubscribeRedo

class this._cls0
    implements Func2
{

    final this._cls0 this$0;

    public volatile Object call(Object obj, Object obj1)
    {
        return call((Notification)obj, (Notification)obj1);
    }

    public Notification call(Notification notification, Notification notification1)
    {
        int i = ((Integer)notification.getValue()).intValue();
        notification = notification1;
        if (((Boolean)cess._mth100(this._cls0.this).call(Integer.valueOf(i), notification1.getThrowable())).booleanValue())
        {
            notification = Notification.createOnNext(Integer.valueOf(i + 1));
        }
        return notification;
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
