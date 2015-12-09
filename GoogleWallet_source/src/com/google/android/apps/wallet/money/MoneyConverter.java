// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.money;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Currency;

// Referenced classes of package com.google.android.apps.wallet.money:
//            CurrencyUtil

public final class MoneyConverter
{

    public static final BigDecimal MICROS_PER_UNIT = new BigDecimal(0xf4240);

    public static String toMoneyFieldString(com.google.wallet.proto.NanoWalletEntities.MoneyProto moneyproto)
    {
        DecimalFormat decimalformat = new DecimalFormat("0.00");
        Currency currency = Currency.getInstance(moneyproto.currencyCode);
        long l;
        if (moneyproto.micros == null)
        {
            l = 0L;
        } else
        {
            l = moneyproto.micros.longValue();
        }
        return decimalformat.format((new BigDecimal(l)).divide(MICROS_PER_UNIT).setScale(currency.getDefaultFractionDigits(), 4));
    }

    public static com.google.wallet.proto.NanoWalletEntities.MoneyProto toMoneyProto(BigDecimal bigdecimal)
    {
        com.google.wallet.proto.NanoWalletEntities.MoneyProto moneyproto = new com.google.wallet.proto.NanoWalletEntities.MoneyProto();
        moneyproto.currencyCode = CurrencyUtil.getCurrencyCode();
        moneyproto.micros = Long.valueOf(bigdecimal.multiply(MICROS_PER_UNIT).longValue());
        return moneyproto;
    }

    public static String toString(com.google.wallet.proto.NanoWalletEntities.MoneyProto moneyproto)
    {
        Currency currency = Currency.getInstance(moneyproto.currencyCode);
        return CurrencyUtil.microsToDisplayableMoney(moneyproto.micros.longValue(), currency);
    }

}
