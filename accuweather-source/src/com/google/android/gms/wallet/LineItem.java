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

        final LineItem aje;

        public LineItem build()
        {
            return aje;
        }

        public Builder setCurrencyCode(String s)
        {
            aje.aiI = s;
            return this;
        }

        public Builder setDescription(String s)
        {
            aje.description = s;
            return this;
        }

        public Builder setQuantity(String s)
        {
            aje.ajb = s;
            return this;
        }

        public Builder setRole(int j)
        {
            aje.ajd = j;
            return this;
        }

        public Builder setTotalPrice(String s)
        {
            aje.aiH = s;
            return this;
        }

        public Builder setUnitPrice(String s)
        {
            aje.ajc = s;
            return this;
        }

        private Builder()
        {
            aje = LineItem.this;
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
    String aiH;
    String aiI;
    String ajb;
    String ajc;
    int ajd;
    String description;
    private final int xJ;

    LineItem()
    {
        xJ = 1;
        ajd = 0;
    }

    LineItem(int j, String s, String s1, String s2, String s3, int k, String s4)
    {
        xJ = j;
        description = s;
        ajb = s1;
        ajc = s2;
        aiH = s3;
        ajd = k;
        aiI = s4;
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
        return aiI;
    }

    public String getDescription()
    {
        return description;
    }

    public String getQuantity()
    {
        return ajb;
    }

    public int getRole()
    {
        return ajd;
    }

    public String getTotalPrice()
    {
        return aiH;
    }

    public String getUnitPrice()
    {
        return ajc;
    }

    public int getVersionCode()
    {
        return xJ;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel, j);
    }

}
