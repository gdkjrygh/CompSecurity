// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amazon.device.associates:
//            g, an

public class Receipt
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new g();
    private final String a;
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private final Date f;
    private final boolean g;

    private Receipt(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
        e = parcel.readString();
        f = new Date(parcel.readString());
        g = Boolean.valueOf(parcel.readString()).booleanValue();
        d = parcel.readInt();
    }

    Receipt(Parcel parcel, g g1)
    {
        this(parcel);
    }

    Receipt(String s, String s1, String s2, int i, String s3, Date date, boolean flag)
    {
        an.a(s1, "receiptId");
        an.a(s1, "productId");
        an.a(s3, "purchaseToken");
        an.a(date, "purchaseDate");
        a = s;
        b = s1;
        c = s2;
        d = i;
        e = s3;
        f = date;
        g = flag;
    }

    JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("receiptId", a);
            jsonobject.put("productId", b);
            jsonobject.put("parentProductId", c);
            jsonobject.put("quantity", d);
            jsonobject.put("purchaseToken", e);
            jsonobject.put("purchaseDate", f);
            jsonobject.put("isCanceled", g);
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        return jsonobject;
    }

    public int describeContents()
    {
        return hashCode();
    }

    public String getParentProductId()
    {
        return c;
    }

    public String getProductId()
    {
        return b;
    }

    public Date getPurchaseDate()
    {
        return f;
    }

    public String getPurchaseToken()
    {
        return e;
    }

    public int getQuantity()
    {
        return d;
    }

    public String getReceiptId()
    {
        return a;
    }

    public boolean isCanceled()
    {
        return g;
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
            a, b, c, e, f.toString(), Boolean.toString(g)
        });
        parcel.writeInt(d);
    }


    // Unreferenced inner class com/amazon/device/associates/g
    static final class g
        implements android.os.Parcelable.Creator
    {

        public Receipt a(Parcel parcel)
        {
            return new Receipt(parcel, null);
        }

        public Receipt[] a(int i)
        {
            return new Receipt[i];
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public volatile Object[] newArray(int i)
        {
            return a(i);
        }

            g()
            {
            }
    }

}
