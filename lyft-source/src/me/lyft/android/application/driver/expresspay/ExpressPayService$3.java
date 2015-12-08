// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.driver.expresspay;

import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.driver.expresspay:
//            ExpressPayService

class this._cls0
    implements Func1
{

    final ExpressPayService this$0;

    public volatile Object call(Object obj)
    {
        return call((Throwable)obj);
    }

    public Observable call(Throwable throwable)
    {
        return ExpressPayService.access$100(ExpressPayService.this, throwable);
    }

    ()
    {
        this$0 = ExpressPayService.this;
        super();
    }
}
