// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amazon.device.associates:
//            bw, Image, Price, an

public class Product
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new bw();
    private final String a;
    private final String b;
    private final String c;
    private final Image d;
    private final Price e;
    private final String f;
    private final double g;

    private Product(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
        f = parcel.readString();
        g = parcel.readDouble();
        d = (Image)parcel.readParcelable(com/amazon/device/associates/Image.getClassLoader());
        e = (Price)parcel.readParcelable(com/amazon/device/associates/Price.getClassLoader());
    }

    Product(Parcel parcel, bw bw1)
    {
        this(parcel);
    }

    Product(String s, String s1, String s2, Image image, Price price, String s3, double d1)
    {
        an.a(s, "productId");
        an.a(s1, "title");
        an.a(s2, "description");
        a = s;
        b = s1;
        c = s2;
        d = image;
        e = price;
        g = d1;
        f = s3;
    }

    JSONObject a()
    {
        JSONObject jsonobject1 = new JSONObject();
        jsonobject1.put("productId", a);
        jsonobject1.put("title", b);
        jsonobject1.put("description", c);
        if (d == null) goto _L2; else goto _L1
_L1:
        JSONObject jsonobject = d.a();
_L3:
        jsonobject1.put("image", jsonobject);
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        jsonobject = e.a();
_L4:
        jsonobject1.put("price", jsonobject);
        jsonobject1.put("rating", g);
        jsonobject1.put("brand", f);
        return jsonobject1;
_L2:
        try
        {
            jsonobject = (JSONObject)null;
        }
        catch (JSONException jsonexception)
        {
            return jsonobject1;
        }
          goto _L3
        jsonobject = (JSONObject)null;
          goto _L4
    }

    public int describeContents()
    {
        return hashCode();
    }

    public String getBrand()
    {
        return f;
    }

    public String getDescription()
    {
        return c;
    }

    public Image getImage()
    {
        return d;
    }

    public Price getPrice()
    {
        return e;
    }

    public String getProductId()
    {
        return a;
    }

    public double getRating()
    {
        return g;
    }

    public String getTitle()
    {
        return b;
    }

    public String toString()
    {
        String s;
        try
        {
            s = a().toString(4);
        }
        catch (JSONException jsonexception)
        {
            return null;
        }
        return s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeStringArray(new String[] {
            a, b, c, f
        });
        parcel.writeDouble(g);
        parcel.writeParcelable(d, i);
        parcel.writeParcelable(e, i);
    }


    // Unreferenced inner class com/amazon/device/associates/bw
    static final class bw
        implements android.os.Parcelable.Creator
    {

        public Product a(Parcel parcel)
        {
            return new Product(parcel, null);
        }

        public Product[] a(int i)
        {
            return new Product[i];
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public volatile Object[] newArray(int i)
        {
            return a(i);
        }

            bw()
            {
            }
    }

}
