// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.widgets;


interface 
    extends me.lyft.android.ui.er.PaymentWidgetView
{

    public abstract void setHasPaymentMethod(boolean flag);

    public abstract void setImageResource(int i);

    public abstract void setLabel(String s);

    public abstract void showConcurRideReceipts(boolean flag);

    public abstract void showCreditCardLabel(boolean flag);
}
