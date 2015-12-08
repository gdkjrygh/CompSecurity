// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            i

public final class LineItem
    implements SafeParcelable
{
    public final class Builder
    {

        final LineItem avc;

        public LineItem build()
        {
            return avc;
        }

        public Builder setCurrencyCode(String s)
        {
            avc.auG = s;
            return this;
        }

        public Builder setDescription(String s)
        {
            avc.description = s;
            return this;
        }

        public Builder setQuantity(String s)
        {
            avc.auZ = s;
            return this;
        }

        public Builder setRole(int j)
        {
            avc.avb = j;
            return this;
        }

        public Builder setTotalPrice(String s)
        {
            avc.auF = s;
            return this;
        }

        public Builder setUnitPrice(String s)
        {
            avc.ava = s;
            return this;
        }

        private Builder()
        {
            avc = LineItem.this;
            super();
        }

    }

    public static interface Role
    {

        public static final int REGULAR = 0;
        public static final int SHIPPING = 2;
        public static final int TAX = 1;
    }


    public static final android.os.Parcelable.Creator CREATOR = new i();
    private final int CK;
    String auF;
    String auG;
    String auZ;
    String ava;
    int avb;
    String description;

    LineItem()
    {
        CK = 1;
        avb = 0;
    }

    LineItem(int j, String s, String s1, String s2, String s3, int k, String s4)
    {
        CK = j;
        description = s;
        auZ = s1;
        ava = s2;
        auF = s3;
        avb = k;
        auG = s4;
    }

    public static Builder newBuilder()
    {
        LineItem lineitem = new LineItem();
        lineitem.getClass();
        return lineitem. new Builder();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCurrencyCode()
    {
        return auG;
    }

    public String getDescription()
    {
        return description;
    }

    public String getQuantity()
    {
        return auZ;
    }

    public int getRole()
    {
        return avb;
    }

    public String getTotalPrice()
    {
        return auF;
    }

    public String getUnitPrice()
    {
        return ava;
    }

    public int getVersionCode()
    {
        return CK;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel, j);
    }

}
