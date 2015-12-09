// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.catalogue;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package ly.kite.catalogue:
//            SingleCurrencyAmount

public class MultipleCurrencyAmount
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final String FALLBACK_CURRENCY_CODES[] = {
        "USD", "GBP", "EUR"
    };
    private static final String FALLBACK_CURRENCY_CODE_1 = "USD";
    private static final String FALLBACK_CURRENCY_CODE_2 = "GBP";
    private static final String FALLBACK_CURRENCY_CODE_3 = "EUR";
    private static final String LOG_TAG = "MultipleCurrencyAmount";
    private HashMap mCurrencyAmountTable;
    private HashMap mCurrencyCodeAmountTable;

    public MultipleCurrencyAmount()
    {
        mCurrencyAmountTable = new HashMap();
        mCurrencyCodeAmountTable = new HashMap();
    }

    private MultipleCurrencyAmount(Parcel parcel)
    {
        this();
        int j = parcel.readInt();
        for (int i = 0; i < j; i++)
        {
            add((SingleCurrencyAmount)parcel.readParcelable(ly/kite/catalogue/SingleCurrencyAmount.getClassLoader()));
        }

    }

    MultipleCurrencyAmount(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    public MultipleCurrencyAmount(JSONObject jsonobject)
    {
        this();
        for (Iterator iterator = jsonobject.keys(); iterator.hasNext();)
        {
            try
            {
                String s = (String)iterator.next();
                BigDecimal bigdecimal = new BigDecimal(jsonobject.getString(s));
                add(new SingleCurrencyAmount(Currency.getInstance(s), bigdecimal));
            }
            catch (JSONException jsonexception)
            {
                Log.e("MultipleCurrencyAmount", (new StringBuilder()).append("Could not get amounts from: ").append(jsonobject.toString()).toString());
            }
        }

    }

    public void add(SingleCurrencyAmount singlecurrencyamount)
    {
        mCurrencyAmountTable.put(singlecurrencyamount.getCurrency(), singlecurrencyamount);
        mCurrencyCodeAmountTable.put(singlecurrencyamount.getCurrency().getCurrencyCode(), singlecurrencyamount);
    }

    public Collection asCollection()
    {
        return mCurrencyAmountTable.values();
    }

    public int describeContents()
    {
        return 0;
    }

    public SingleCurrencyAmount get(int i)
    {
        return (SingleCurrencyAmount)mCurrencyCodeAmountTable.get(Integer.valueOf(i));
    }

    public SingleCurrencyAmount get(String s)
    {
        return (SingleCurrencyAmount)mCurrencyCodeAmountTable.get(s);
    }

    public Set getAllCurrencyCodes()
    {
        return mCurrencyCodeAmountTable.keySet();
    }

    public SingleCurrencyAmount getAmountWithFallback(String s)
    {
        s = get(s);
        if (s == null) goto _L2; else goto _L1
_L1:
        return s;
_L2:
        String as[] = FALLBACK_CURRENCY_CODES;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            SingleCurrencyAmount singlecurrencyamount = get(as[i]);
            s = singlecurrencyamount;
            if (singlecurrencyamount != null)
            {
                continue; /* Loop/switch isn't completed */
            }
        }

        SingleCurrencyAmount singlecurrencyamount1 = get(0);
        s = singlecurrencyamount1;
        if (singlecurrencyamount1 == null)
        {
            return null;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public SingleCurrencyAmount getAmountWithFallback(Currency currency)
    {
        return getAmountWithFallback(currency.getCurrencyCode());
    }

    public SingleCurrencyAmount getAmountWithFallback(Locale locale)
    {
        return getAmountWithFallback(Currency.getInstance(locale));
    }

    public SingleCurrencyAmount getDefaultAmountWithFallback()
    {
        return getAmountWithFallback(Currency.getInstance(Locale.getDefault()).getCurrencyCode());
    }

    public String getDefaultDisplayAmountWithFallback()
    {
        return getDisplayAmountWithFallback(Locale.getDefault());
    }

    public String getDisplayAmountWithFallback(Locale locale)
    {
        SingleCurrencyAmount singlecurrencyamount = getAmountWithFallback(Currency.getInstance(locale).getCurrencyCode());
        if (singlecurrencyamount == null)
        {
            return null;
        } else
        {
            return singlecurrencyamount.getDisplayAmountForLocale(locale);
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(mCurrencyAmountTable.size());
        for (Iterator iterator = mCurrencyCodeAmountTable.values().iterator(); iterator.hasNext(); parcel.writeParcelable((SingleCurrencyAmount)iterator.next(), i)) { }
    }


    /* member class not found */
    class _cls1 {}

}
