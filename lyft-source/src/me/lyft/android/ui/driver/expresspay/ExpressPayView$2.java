// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.expresspay;

import me.lyft.android.domain.driver.ExpressPayAccount;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver.expresspay:
//            ExpressPayView

class this._cls0
    implements Action1
{

    final ExpressPayView this$0;

    public volatile void call(Object obj)
    {
        call((ExpressPayAccount)obj);
    }

    public void call(ExpressPayAccount expresspayaccount)
    {
        ExpressPayView.access$000(ExpressPayView.this, expresspayaccount);
    }

    ()
    {
        this$0 = ExpressPayView.this;
        super();
    }
}
