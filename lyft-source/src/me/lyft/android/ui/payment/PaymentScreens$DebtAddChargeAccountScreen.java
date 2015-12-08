// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import com.lyft.scoop.IHaveParent;
import com.lyft.scoop.Screen;
import me.lyft.android.domain.payment.ChargeAccount;

// Referenced classes of package me.lyft.android.ui.payment:
//            PaymentScreens

public class chargeAccount extends PaymentScreens
    implements IHaveParent
{

    private final ChargeAccount chargeAccount;

    public ChargeAccount getChargeAccount()
    {
        return chargeAccount;
    }

    public Screen getParent()
    {
        return new chargeAccount();
    }

    public (ChargeAccount chargeaccount)
    {
        chargeAccount = chargeaccount;
    }
}
