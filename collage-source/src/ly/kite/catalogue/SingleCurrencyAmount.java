// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.catalogue;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class SingleCurrencyAmount
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private static final String FORMAL_AMOUNT_FORMAT_STRING = "%1$s %2$.2f";
    private static final String LOG_TAG = "SingleCurrencyAmount";
    private BigDecimal mAmount;
    private Currency mCurrency;
    private String mFormattedAmount;

    private SingleCurrencyAmount(Parcel parcel)
    {
        mCurrency = (Currency)parcel.readSerializable();
        mAmount = (BigDecimal)parcel.readSerializable();
        mFormattedAmount = parcel.readString();
    }

    SingleCurrencyAmount(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    public SingleCurrencyAmount(Currency currency, BigDecimal bigdecimal)
    {
        this(currency, bigdecimal, null);
    }

    public SingleCurrencyAmount(Currency currency, BigDecimal bigdecimal, String s)
    {
        mCurrency = currency;
        mAmount = bigdecimal;
        mFormattedAmount = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public BigDecimal getAmount()
    {
        return mAmount;
    }

    public double getAmountAsDouble()
    {
        return mAmount.doubleValue();
    }

    public Currency getCurrency()
    {
        return mCurrency;
    }

    public String getCurrencyCode()
    {
        return mCurrency.getCurrencyCode();
    }

    public String getDisplayAmountForLocale(Locale locale)
    {
        Currency currency = Currency.getInstance(locale);
        if (mCurrency.equals(currency))
        {
            return NumberFormat.getCurrencyInstance(locale).format(getAmountAsDouble());
        } else
        {
            return String.format("%1$s %2$.2f", new Object[] {
                mCurrency.getCurrencyCode(), Double.valueOf(getAmountAsDouble())
            });
        }
    }

    public String getFormattedAmount()
    {
        return mFormattedAmount;
    }

    public boolean isNonZero()
    {
        return mAmount.compareTo(BigDecimal.ZERO) != 0;
    }

    public boolean isZero()
    {
        return mAmount.compareTo(BigDecimal.ZERO) == 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeSerializable(mCurrency);
        parcel.writeSerializable(mAmount);
        parcel.writeString(mFormattedAmount);
    }


    /* member class not found */
    class _cls1 {}

}
