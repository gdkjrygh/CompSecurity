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

        final LineItem asS;

        public LineItem build()
        {
            return asS;
        }

        public Builder setCurrencyCode(String s)
        {
            asS.asw = s;
            return this;
        }

        public Builder setDescription(String s)
        {
            asS.description = s;
            return this;
        }

        public Builder setQuantity(String s)
        {
            asS.asP = s;
            return this;
        }

        public Builder setRole(int j)
        {
            asS.asR = j;
            return this;
        }

        public Builder setTotalPrice(String s)
        {
            asS.asv = s;
            return this;
        }

        public Builder setUnitPrice(String s)
        {
            asS.asQ = s;
            return this;
        }

        private Builder()
        {
            asS = LineItem.this;
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
    private final int BR;
    String asP;
    String asQ;
    int asR;
    String asv;
    String asw;
    String description;

    LineItem()
    {
        BR = 1;
        asR = 0;
    }

    LineItem(int j, String s, String s1, String s2, String s3, int k, String s4)
    {
        BR = j;
        description = s;
        asP = s1;
        asQ = s2;
        asv = s3;
        asR = k;
        asw = s4;
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
        return asw;
    }

    public String getDescription()
    {
        return description;
    }

    public String getQuantity()
    {
        return asP;
    }

    public int getRole()
    {
        return asR;
    }

    public String getTotalPrice()
    {
        return asv;
    }

    public String getUnitPrice()
    {
        return asQ;
    }

    public int getVersionCode()
    {
        return BR;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel, j);
    }

}
