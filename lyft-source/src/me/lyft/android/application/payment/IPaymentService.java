// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.payment;

import me.lyft.android.domain.payment.ICard;
import rx.Observable;

public interface IPaymentService
{

    public abstract Observable applyCoupon(String s);

    public abstract Observable createCreditCard(ICard icard);

    public abstract Observable createCreditCard(ICard icard, String s, String s1);

    public abstract Observable createDebitCard(ICard icard);

    public abstract Observable deleteChargeAccount(String s);

    public abstract Observable makeCardDefault(String s);

    public abstract Observable makeCreditLineDefault(String s);

    public abstract Observable makeFacebookDefault(String s);

    public abstract Observable makePayPalDefault(String s);

    public abstract Observable makeWalletDefault(String s);

    public abstract Observable payDebtWithCreditCard(String s);

    public abstract Observable payDebtWithPayPal(String s);

    public abstract Observable payDebtWithWallet(String s);

    public abstract Observable savePayPal();

    public abstract Observable saveWalletCard();

    public abstract Observable unlinkConcur();

    public abstract Observable updateConcurSendRideReceipts(boolean flag);

    public abstract Observable updateCreditCard(String s, ICard icard);

    public abstract Observable updateCreditCard(String s, ICard icard, String s1, String s2);

    public abstract Observable updateDebitCard(ICard icard);
}
