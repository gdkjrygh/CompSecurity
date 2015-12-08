// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.paypal;

import rx.Observable;

public interface IPayPalService
{

    public abstract String obtainChargeToken();

    public abstract Observable obtainPayPalChargeData(String s);
}
