// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.catalogue;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.Locale;

// Referenced classes of package ly.kite.catalogue:
//            IGroupOrProduct, Product, MultipleCurrencyAmount, SingleCurrencyAmount

public class ProductGroup
    implements Parcelable, IGroupOrProduct
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private static final String LOG_TAG = "ProductGroup";
    private URL mImageURL;
    private String mLabel;
    private int mLabelColour;
    private ArrayList mProductList;

    private ProductGroup(Parcel parcel)
    {
        mLabel = parcel.readString();
        mLabelColour = parcel.readInt();
        mImageURL = (URL)parcel.readSerializable();
        mProductList = new ArrayList();
        parcel.readTypedList(mProductList, Product.CREATOR);
    }

    ProductGroup(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    ProductGroup(String s, int i, URL url)
    {
        mLabel = s;
        mLabelColour = i;
        mImageURL = url;
        mProductList = new ArrayList();
    }

    void add(Product product)
    {
        mProductList.add(product);
    }

    public boolean containsMultiplePrices()
    {
        return mProductList != null && mProductList.size() > 1;
    }

    public boolean currencyIsSupportedByAllProducts(String s)
    {
        if (s == null || s.trim().equals(""))
        {
            return false;
        }
        for (Iterator iterator = mProductList.iterator(); iterator.hasNext();)
        {
            if (((Product)iterator.next()).getCost().get(s) == null)
            {
                return false;
            }
        }

        return true;
    }

    public int describeContents()
    {
        return 0;
    }

    public URL getDisplayImageURL()
    {
        return mImageURL;
    }

    public String getDisplayLabel()
    {
        return mLabel;
    }

    public int getDisplayLabelColour()
    {
        return mLabelColour;
    }

    public String getDisplayPrice()
    {
        SingleCurrencyAmount singlecurrencyamount;
        Locale locale;
        String s;
        Iterator iterator;
        locale = Locale.getDefault();
        s = getPreferredCurrency(Currency.getInstance(locale).getCurrencyCode());
        if (s == null)
        {
            Log.e("ProductGroup", "No currency is supported across all products");
            return "?";
        }
        singlecurrencyamount = null;
        iterator = mProductList.iterator();
_L2:
        SingleCurrencyAmount singlecurrencyamount1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        SingleCurrencyAmount singlecurrencyamount2 = ((Product)iterator.next()).getCost().get(s);
        if (singlecurrencyamount2 == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        singlecurrencyamount1 = singlecurrencyamount2;
        if (singlecurrencyamount != null)
        {
            if (singlecurrencyamount2.getAmount().compareTo(singlecurrencyamount.getAmount()) >= 0)
            {
                break MISSING_BLOCK_LABEL_120;
            }
            singlecurrencyamount1 = singlecurrencyamount2;
        }
_L3:
        singlecurrencyamount = singlecurrencyamount1;
        if (true) goto _L2; else goto _L1
_L1:
        if (singlecurrencyamount != null)
        {
            return singlecurrencyamount.getDisplayAmountForLocale(locale);
        } else
        {
            return "?";
        }
        singlecurrencyamount1 = singlecurrencyamount;
          goto _L3
    }

    public String getPreferredCurrency(String s)
    {
        if (s == null || !currencyIsSupportedByAllProducts(s)) goto _L2; else goto _L1
_L1:
        return s;
_L2:
        String as[] = MultipleCurrencyAmount.FALLBACK_CURRENCY_CODES;
        int j = as.length;
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                String s1 = as[i];
                s = s1;
                if (currencyIsSupportedByAllProducts(s1))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return null;
    }

    public ArrayList getProductList()
    {
        return mProductList;
    }

    public String toLogString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Label        : ").append(mLabel).append("\n");
        stringbuilder.append("Label Colour : 0x").append(Integer.toHexString(mLabelColour)).append("\n");
        stringbuilder.append("Image URL    : ").append(mImageURL.toString()).append("\n");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mLabel);
        parcel.writeInt(mLabelColour);
        parcel.writeSerializable(mImageURL);
        parcel.writeTypedList(mProductList);
    }


    /* member class not found */
    class _cls1 {}

}
