// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds.billing.util;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

public class Purchase
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Purchase a(Parcel parcel)
        {
            return new Purchase(parcel);
        }

        public Purchase[] a(int k)
        {
            return new Purchase[0];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int k)
        {
            return a(k);
        }

    };
    String a;
    String b;
    String c;
    String d;
    long e;
    int f;
    String g;
    String h;
    String i;
    String j;

    public Purchase(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
        d = parcel.readString();
        e = parcel.readLong();
        f = parcel.readInt();
        g = parcel.readString();
        h = parcel.readString();
        j = parcel.readString();
    }

    public Purchase(String s, String s1, String s2)
        throws JSONException
    {
        a = s;
        i = s1;
        s = new JSONObject(i);
        b = s.optString("orderId");
        c = s.optString("packageName");
        d = s.optString("productId");
        e = s.optLong("purchaseTime");
        f = s.optInt("purchaseState");
        g = s.optString("developerPayload");
        h = s.optString("token", s.optString("purchaseToken"));
        j = s2;
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public String c()
    {
        return d;
    }

    public long d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return h;
    }

    public String toString()
    {
        return (new StringBuilder()).append("PurchaseInfo(type:").append(a).append("):").append(i).toString();
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeLong(e);
        parcel.writeInt(f);
        parcel.writeString(g);
        parcel.writeString(h);
        parcel.writeString(j);
    }

}
