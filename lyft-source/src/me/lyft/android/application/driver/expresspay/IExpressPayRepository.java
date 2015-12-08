// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.driver.expresspay;

import me.lyft.android.domain.driver.ExpressPay;
import me.lyft.android.domain.driver.ExpressPayAccount;
import rx.Observable;

public interface IExpressPayRepository
{

    public abstract ExpressPay getExpressPay();

    public abstract ExpressPayAccount getExpressPayAccount();

    public abstract Observable observeExpressPayAccountChange();

    public abstract void setExpressAccount(ExpressPayAccount expresspayaccount);

    public abstract void setExpressPay(ExpressPay expresspay);
}
