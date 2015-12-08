// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.driver.expresspay;

import me.lyft.android.domain.driver.ExpressPay;
import me.lyft.android.domain.driver.ExpressPayAccount;
import me.lyft.android.infrastructure.lyft.driver.ExpressPayDTO;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.application.driver.expresspay:
//            ExpressPayService, IExpressPayRepository

class this._cls0
    implements Action1
{

    final ExpressPayService this$0;

    public volatile void call(Object obj)
    {
        call((ExpressPayDTO)obj);
    }

    public void call(ExpressPayDTO expresspaydto)
    {
        ExpressPayService.access$000(ExpressPayService.this).setExpressPay(ExpressPay.fromDTO(expresspaydto));
        ExpressPayService.access$000(ExpressPayService.this).setExpressAccount(ExpressPayAccount.fromDTO(expresspaydto.expressAccount));
    }

    y()
    {
        this$0 = ExpressPayService.this;
        super();
    }
}
