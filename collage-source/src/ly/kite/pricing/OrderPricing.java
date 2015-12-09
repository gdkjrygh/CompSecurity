// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.pricing;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import ly.kite.catalogue.MultipleCurrencyAmount;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class OrderPricing
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private static final String JSON_NAME_DESCRIPTION = "description";
    private static final String JSON_NAME_DISCOUNT = "discount";
    private static final String JSON_NAME_INVALID_MESSAGE = "invalid_message";
    private static final String JSON_NAME_LINE_ITEMS = "line_items";
    private static final String JSON_NAME_PRODUCT_COST = "product_cost";
    private static final String JSON_NAME_PROMO_CODE = "promo_code";
    private static final String JSON_NAME_QUANTITY = "quantity";
    private static final String JSON_NAME_SHIPPING_COST = "shipping_cost";
    private static final String JSON_NAME_TEMPLATE_ID = "template_id";
    private static final String JSON_NAME_TOTAL = "total";
    private static final String JSON_NAME_TOTAL_PRODUCT_COST = "total_product_cost";
    private static final String JSON_NAME_TOTAL_SHIPPING_COST = "total_shipping_cost";
    private static final String JSON_VALUE_NULL = "null";
    private static final String LOG_TAG = "OrderPricing";
    private ArrayList mLineItemArrayList;
    private MultipleCurrencyAmount mPromoCodeDiscount;
    private String mPromoCodeInvalidMessage;
    private MultipleCurrencyAmount mTotalCost;
    private MultipleCurrencyAmount mTotalProductCost;
    private MultipleCurrencyAmount mTotalShippingCost;

    private OrderPricing(Parcel parcel)
    {
        mPromoCodeInvalidMessage = parcel.readString();
        mPromoCodeDiscount = (MultipleCurrencyAmount)parcel.readParcelable(ly/kite/catalogue/MultipleCurrencyAmount.getClassLoader());
        mLineItemArrayList = new ArrayList();
        parcel.readList(mLineItemArrayList, ly/kite/pricing/OrderPricing$LineItem.getClassLoader());
        mTotalProductCost = (MultipleCurrencyAmount)parcel.readParcelable(ly/kite/catalogue/MultipleCurrencyAmount.getClassLoader());
        mTotalCost = (MultipleCurrencyAmount)parcel.readParcelable(ly/kite/catalogue/MultipleCurrencyAmount.getClassLoader());
        mTotalShippingCost = (MultipleCurrencyAmount)parcel.readParcelable(ly/kite/catalogue/MultipleCurrencyAmount.getClassLoader());
    }

    OrderPricing(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    OrderPricing(JSONObject jsonobject)
        throws JSONException
    {
        Object obj = jsonobject.optJSONObject("promo_code");
        JSONObject jsonobject1 = jsonobject.getJSONObject("total_product_cost");
        JSONArray jsonarray = jsonobject.getJSONArray("line_items");
        JSONObject jsonobject2 = jsonobject.getJSONObject("total");
        jsonobject = jsonobject.getJSONObject("total_shipping_cost");
        if (obj != null)
        {
            String s = ((JSONObject) (obj)).getString("invalid_message");
    /* block-local class not found */
    class LineItem {}

            int i;
            if (s == null || s.equals("null"))
            {
                mPromoCodeInvalidMessage = null;
            } else
            {
                mPromoCodeInvalidMessage = s;
            }
            try
            {
                mPromoCodeDiscount = new MultipleCurrencyAmount(((JSONObject) (obj)).getJSONObject("discount"));
            }
            catch (Exception exception) { }
        }
        mLineItemArrayList = new ArrayList(jsonarray.length());
        for (i = 0; i < jsonarray.length(); i++)
        {
            obj = new LineItem(jsonarray.getJSONObject(i));
            mLineItemArrayList.add(obj);
        }

        mTotalProductCost = new MultipleCurrencyAmount(jsonobject1);
        mTotalCost = new MultipleCurrencyAmount(jsonobject2);
        mTotalShippingCost = new MultipleCurrencyAmount(jsonobject);
    }

    public int describeContents()
    {
        return 0;
    }

    public List getLineItems()
    {
        return mLineItemArrayList;
    }

    public MultipleCurrencyAmount getPromoCodeDiscount()
    {
        return mPromoCodeDiscount;
    }

    public String getPromoCodeInvalidMessage()
    {
        return mPromoCodeInvalidMessage;
    }

    public MultipleCurrencyAmount getTotalCost()
    {
        return mTotalCost;
    }

    public MultipleCurrencyAmount getTotalShippingCost()
    {
        return mTotalShippingCost;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mPromoCodeInvalidMessage);
        parcel.writeParcelable(mPromoCodeDiscount, i);
        parcel.writeList(mLineItemArrayList);
        parcel.readList(mLineItemArrayList, ly/kite/pricing/OrderPricing$LineItem.getClassLoader());
        parcel.writeParcelable(mTotalProductCost, i);
        parcel.writeParcelable(mTotalCost, i);
        parcel.writeParcelable(mTotalShippingCost, i);
    }


    /* member class not found */
    class _cls1 {}

}
