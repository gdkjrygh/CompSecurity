// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.ridehistory;

import me.lyft.android.infrastructure.lyft.payment.MoneyDTO;

// Referenced classes of package me.lyft.android.infrastructure.lyft.ridehistory:
//            ReceiptItemDTO, AccountInfoDTO

public class ChargeItemDTO extends ReceiptItemDTO
{

    public final AccountInfoDTO accountInfo;

    public ChargeItemDTO(String s, MoneyDTO moneydto, AccountInfoDTO accountinfodto)
    {
        super(s, moneydto);
        accountInfo = accountinfodto;
    }
}
