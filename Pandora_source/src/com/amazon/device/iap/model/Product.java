// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.device.iap.internal.model.ProductBuilder;
import com.amazon.device.iap.internal.util.d;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amazon.device.iap.model:
//            ProductType

public final class Product
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Product createFromParcel(Parcel parcel)
        {
            return new Product(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public Product[] newArray(int i)
        {
            return new Product[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final String DESCRIPTION = "description";
    private static final String PRICE = "price";
    private static final String PRODUCT_TYPE = "productType";
    private static final String SKU = "sku";
    private static final String SMALL_ICON_URL = "smallIconUrl";
    private static final String TITLE = "title";
    private final String description;
    private final String price;
    private final ProductType productType;
    private final String sku;
    private final String smallIconUrl;
    private final String title;

    private Product(Parcel parcel)
    {
        sku = parcel.readString();
        productType = ProductType.valueOf(parcel.readString());
        description = parcel.readString();
        price = parcel.readString();
        smallIconUrl = parcel.readString();
        title = parcel.readString();
    }


    public Product(ProductBuilder productbuilder)
    {
        d.a(productbuilder.getSku(), "sku");
        d.a(productbuilder.getProductType(), "productType");
        d.a(productbuilder.getDescription(), "description");
        d.a(productbuilder.getTitle(), "title");
        d.a(productbuilder.getSmallIconUrl(), "smallIconUrl");
        if (ProductType.SUBSCRIPTION != productbuilder.getProductType())
        {
            d.a(productbuilder.getPrice(), "price");
        }
        sku = productbuilder.getSku();
        productType = productbuilder.getProductType();
        description = productbuilder.getDescription();
        price = productbuilder.getPrice();
        smallIconUrl = productbuilder.getSmallIconUrl();
        title = productbuilder.getTitle();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getDescription()
    {
        return description;
    }

    public String getPrice()
    {
        return price;
    }

    public ProductType getProductType()
    {
        return productType;
    }

    public String getSku()
    {
        return sku;
    }

    public String getSmallIconUrl()
    {
        return smallIconUrl;
    }

    public String getTitle()
    {
        return title;
    }

    public JSONObject toJSON()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("sku", sku);
        jsonobject.put("productType", productType);
        jsonobject.put("description", description);
        jsonobject.put("price", price);
        jsonobject.put("smallIconUrl", smallIconUrl);
        jsonobject.put("title", title);
        return jsonobject;
    }

    public String toString()
    {
        String s;
        try
        {
            s = toJSON().toString(4);
        }
        catch (JSONException jsonexception)
        {
            return null;
        }
        return s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(sku);
        parcel.writeString(productType.toString());
        parcel.writeString(description);
        parcel.writeString(price);
        parcel.writeString(smallIconUrl);
        parcel.writeString(title);
    }

}
