// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.money;

import com.google.android.apps.wallet.logging.WLog;
import com.google.common.base.Strings;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

// Referenced classes of package com.google.android.apps.wallet.money:
//            CurrencySymbolPosition

public class CurrencyUtil
{

    public static final BigDecimal MICROS_PER_UNIT = new BigDecimal(0xf4240);
    private static final String TAG = com/google/android/apps/wallet/money/CurrencyUtil.getSimpleName();

    private CurrencyUtil()
    {
    }

    public static String decimalToDisplayableMoney(BigDecimal bigdecimal, Currency currency)
    {
        NumberFormat numberformat = NumberFormat.getCurrencyInstance();
        numberformat.setCurrency(currency);
        return numberformat.format(bigdecimal.setScale(currency.getDefaultFractionDigits(), 4));
    }

    public static String getCurrencyCode()
    {
        return getLegalAddressCurrency().getCurrencyCode();
    }

    public static String getCurrencySymbol()
    {
        return getLegalAddressCurrency().getSymbol();
    }

    public static CurrencySymbolPosition getCurrencySymbolPosition(Locale locale)
    {
        Object obj = NumberFormat.getCurrencyInstance(locale);
        String s = ((NumberFormat) (obj)).format(1.0D);
        obj = ((NumberFormat) (obj)).getCurrency();
        if (obj == null)
        {
            return CurrencySymbolPosition.UNKNOWN;
        }
        obj = ((Currency) (obj)).getSymbol(locale);
        if (obj == null)
        {
            return CurrencySymbolPosition.UNKNOWN;
        }
        int i = s.indexOf(((String) (obj)));
        if (i == 0)
        {
            return CurrencySymbolPosition.PRECEDE_AMOUNT;
        }
        if (i > 0)
        {
            return CurrencySymbolPosition.FOLLOW_AMOUNT;
        }
        i = s.indexOf("\244");
        if (i == 0)
        {
            return CurrencySymbolPosition.PRECEDE_AMOUNT;
        }
        if (i > 0)
        {
            return CurrencySymbolPosition.FOLLOW_AMOUNT;
        }
        if (!Strings.isNullOrEmpty(locale.getVariant()))
        {
            Locale locale1 = new Locale(locale.getLanguage(), locale.getCountry());
            WLog.vfmt(TAG, "Unable to infer currency symbol position for Locale: %s, attempting without variant: %s", new Object[] {
                locale.toString(), locale1.toString()
            });
            return getCurrencySymbolPosition(locale1);
        } else
        {
            WLog.vfmt(TAG, "Unable to infer currency symbol position for Locale: %s", new Object[] {
                locale.toString()
            });
            return CurrencySymbolPosition.UNKNOWN;
        }
    }

    public static Currency getLegalAddressCurrency()
    {
        return Currency.getInstance(getLegalAddressLocale());
    }

    public static Locale getLegalAddressLocale()
    {
        return Locale.US;
    }

    public static String microsToDisplayableMoney(long l, Currency currency)
    {
        NumberFormat numberformat = NumberFormat.getCurrencyInstance();
        numberformat.setCurrency(currency);
        return numberformat.format((new BigDecimal(l)).divide(MICROS_PER_UNIT).setScale(currency.getDefaultFractionDigits(), 4));
    }

}
