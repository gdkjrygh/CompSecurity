// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer.validator;

import android.content.res.Resources;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.funding.api.FundingSource;
import com.google.common.base.Optional;

public class MoneyTransferAmountValidator
{

    private final AnalyticsUtil analyticsUtil;

    public MoneyTransferAmountValidator(AnalyticsUtil analyticsutil)
    {
        analyticsUtil = analyticsutil;
    }

    public final String validateAmount(Resources resources, com.google.wallet.proto.NanoWalletEntities.MoneyProto moneyproto, Optional optional, String s, int i)
    {
        if (!optional.isPresent() || moneyproto.micros.longValue() <= ((com.google.wallet.proto.NanoWalletEntities.DisplayableMoney)optional.get()).amount.micros.longValue()) goto _L2; else goto _L1
_L1:
        if (i == 2)
        {
            resources = resources.getString(com.google.android.apps.walletnfcrel.R.string.topup_error_amount_exceeds_limit);
        } else
        if (i == 1)
        {
            resources = resources.getString(com.google.android.apps.walletnfcrel.R.string.send_money_error_exceeds_balance_massively);
        } else
        if (i == 4)
        {
            resources = resources.getString(com.google.android.apps.walletnfcrel.R.string.request_money_too_much_error);
        } else
        if (i == 5)
        {
            resources = resources.getString(com.google.android.apps.walletnfcrel.R.string.withdraw_over_max_amount_error_message, new Object[] {
                ((com.google.wallet.proto.NanoWalletEntities.DisplayableMoney)optional.get()).displayAmount
            });
        } else
        {
            throw new IllegalArgumentException();
        }
_L6:
        moneyproto = resources;
        if (!resources.equals(s))
        {
            analyticsUtil.sendUserError("MoneyTransferAmountTooHigh", new AnalyticsCustomDimension[0]);
            moneyproto = resources;
        }
_L4:
        return moneyproto;
_L2:
        if (moneyproto.micros.longValue() != 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        resources = resources.getString(com.google.android.apps.walletnfcrel.R.string.transfer_money_error_zero);
        moneyproto = resources;
        if (!resources.equals(s))
        {
            analyticsUtil.sendUserError("MoneyTransferCannotSendZero", new AnalyticsCustomDimension[0]);
            return resources;
        }
        if (true) goto _L4; else goto _L3
_L3:
        return null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final String validateInstrument(Resources resources, com.google.wallet.proto.NanoWalletEntities.MoneyProto moneyproto, FundingSource fundingsource, String s)
    {
        if (fundingsource.isStoredValue())
        {
            long l = fundingsource.getStoredValue().balance.amount.micros.longValue();
            if (moneyproto.micros.longValue() > l)
            {
                resources = resources.getString(com.google.android.apps.walletnfcrel.R.string.send_money_error_exceeds_balance);
                if (!resources.equals(s))
                {
                    analyticsUtil.sendUserError("MoneyTransferInsufficientFunds", new AnalyticsCustomDimension[0]);
                }
                return resources;
            }
        }
        return null;
    }
}
