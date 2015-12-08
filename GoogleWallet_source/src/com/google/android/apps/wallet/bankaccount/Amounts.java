// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount;

import com.google.android.apps.wallet.money.CurrencyUtil;
import java.math.BigDecimal;

final class Amounts
{

    static final String MAX_DEPOSIT_AMOUNT = CurrencyUtil.decimalToDisplayableMoney(new BigDecimal(1.0D), CurrencyUtil.getLegalAddressCurrency());

}
