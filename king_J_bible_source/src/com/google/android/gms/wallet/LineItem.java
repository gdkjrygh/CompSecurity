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

        final LineItem aby;

        public LineItem build()
        {
            return aby;
        }

        public Builder setCurrencyCode(String s)
        {
            aby.abd = s;
            return this;
        }

        public Builder setDescription(String s)
        {
            aby.description = s;
            return this;
        }

        public Builder setQuantity(String s)
        {
            aby.abv = s;
            return this;
        }

        public Builder setRole(int j)
        {
            aby.abx = j;
            return this;
        }

        public Builder setTotalPrice(String s)
        {
            aby.abc = s;
            return this;
        }

        public Builder setUnitPrice(String s)
        {
            aby.abw = s;
            return this;
        }

        private Builder()
        {
            aby = LineItem.this;
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
    String abc;
    String abd;
    String abv;
    String abw;
    int abx;
    String description;
    private final int xH;

    LineItem()
    {
        xH = 1;
        abx = 0;
    }

    LineItem(int j, String s, String s1, String s2, String s3, int k, String s4)
    {
        xH = j;
        description = s;
        abv = s1;
        abw = s2;
        abc = s3;
        abx = k;
        abd = s4;
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
        return abd;
    }

    public String getDescription()
    {
        return description;
    }

    public String getQuantity()
    {
        return abv;
    }

    public int getRole()
    {
        return abx;
    }

    public String getTotalPrice()
    {
        return abc;
    }

    public String getUnitPrice()
    {
        return abw;
    }

    public int getVersionCode()
    {
        return xH;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel, j);
    }

}
