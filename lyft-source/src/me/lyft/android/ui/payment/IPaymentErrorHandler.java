// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.widget.TextView;
import me.lyft.android.controls.AdvancedEditText;
import me.lyft.android.ui.payment.cardinput.CreditCardInput;

public interface IPaymentErrorHandler
{

    public abstract void attach(CreditCardInput creditcardinput, TextView textview);

    public abstract void handleCardError(Throwable throwable);

    public abstract void handleCouponError(Throwable throwable, AdvancedEditText advancededittext);

    public abstract void handleFacebookCardError(Throwable throwable);

    public abstract void handlePayDebtError(Throwable throwable);

    public abstract void handlePayPalError(Throwable throwable);

    public abstract void handleSaveDebtCardError(Throwable throwable);

    public abstract void handleWalletError(Throwable throwable);
}
