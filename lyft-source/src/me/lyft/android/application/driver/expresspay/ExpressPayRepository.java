// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.driver.expresspay;

import me.lyft.android.domain.driver.ExpressPay;
import me.lyft.android.domain.driver.ExpressPayAccount;
import rx.Observable;
import rx.subjects.BehaviorSubject;

// Referenced classes of package me.lyft.android.application.driver.expresspay:
//            IExpressPayRepository

public class ExpressPayRepository
    implements IExpressPayRepository
{

    private ExpressPay expressPay;
    BehaviorSubject expressPayAccountSubject;

    public ExpressPayRepository()
    {
        expressPayAccountSubject = BehaviorSubject.create(ExpressPayAccount.empty());
        expressPay = ExpressPay.empty();
    }

    public ExpressPay getExpressPay()
    {
        return expressPay;
    }

    public ExpressPayAccount getExpressPayAccount()
    {
        return (ExpressPayAccount)expressPayAccountSubject.getValue();
    }

    public Observable observeExpressPayAccountChange()
    {
        return expressPayAccountSubject.asObservable();
    }

    public void setExpressAccount(ExpressPayAccount expresspayaccount)
    {
        expressPayAccountSubject.onNext(expresspayaccount);
    }

    public void setExpressPay(ExpressPay expresspay)
    {
        expressPay = expresspay;
    }
}
