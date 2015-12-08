// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.ridehistory;

import me.lyft.android.infrastructure.lyft.payment.MoneyDTO;

public class ReceiptItemDTO
{

    public final MoneyDTO money;
    public final String title;

    public ReceiptItemDTO(String s, MoneyDTO moneydto)
    {
        title = s;
        money = moneydto;
    }
}
