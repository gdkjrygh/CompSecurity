// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.money;

import android.content.res.Resources;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.validator.DataValidator;
import java.math.BigDecimal;
import java.math.RoundingMode;

// Referenced classes of package com.google.android.apps.wallet.money:
//            CurrencyUtil

public final class PositiveMaxAmountMoneyValidator
    implements DataValidator
{

    private boolean allowZeroAmount;
    private AnalyticsUtil analyticsUtil;
    private BigDecimal maxAmountInMicros;
    private String overMaxAmountMessage;
    private String previousError;

    public PositiveMaxAmountMoneyValidator(long l, String s, boolean flag)
    {
        maxAmountInMicros = new BigDecimal(l);
        overMaxAmountMessage = s;
        allowZeroAmount = flag;
    }

    private boolean isValid(String s, Resources resources)
    {
        return "".equals(validate(s, resources));
    }

    private void sendUserError(String s)
    {
        if (analyticsUtil != null && !s.equals(previousError))
        {
            analyticsUtil.sendUserError(s, new AnalyticsCustomDimension[0]);
        }
        previousError = s;
    }

    private String validate(String s, Resources resources)
    {
        try
        {
            s = new BigDecimal(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            sendUserError("MoneyTransferCannotSendZero");
            return resources.getString(com.google.android.apps.walletnfcrel.R.string.must_enter_a_positive_amount);
        }
        s = s.multiply(CurrencyUtil.MICROS_PER_UNIT).setScale(0, RoundingMode.HALF_UP);
        if (s.compareTo(BigDecimal.ZERO) < 0)
        {
            sendUserError("MoneyTransferAmountTooLow");
            return resources.getString(com.google.android.apps.walletnfcrel.R.string.must_enter_a_positive_amount);
        }
        if (!allowZeroAmount && s.compareTo(BigDecimal.ZERO) == 0)
        {
            sendUserError("MoneyTransferCannotSendZero");
            return resources.getString(com.google.android.apps.walletnfcrel.R.string.must_enter_a_positive_amount);
        }
        if (s.compareTo(maxAmountInMicros) > 0)
        {
            sendUserError("MoneyTransferAmountTooHigh");
            return overMaxAmountMessage;
        } else
        {
            return "";
        }
    }

    public final volatile boolean isValid(Object obj, Resources resources)
    {
        return isValid((String)obj, resources);
    }

    public final volatile String validate(Object obj, Resources resources)
    {
        return validate((String)obj, resources);
    }
}
