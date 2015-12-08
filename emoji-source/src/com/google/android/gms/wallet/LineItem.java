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

        final LineItem ajh;

        public LineItem build()
        {
            return ajh;
        }

        public Builder setCurrencyCode(String s)
        {
            ajh.aiL = s;
            return this;
        }

        public Builder setDescription(String s)
        {
            ajh.description = s;
            return this;
        }

        public Builder setQuantity(String s)
        {
            ajh.aje = s;
            return this;
        }

        public Builder setRole(int j)
        {
            ajh.ajg = j;
            return this;
        }

        public Builder setTotalPrice(String s)
        {
            ajh.aiK = s;
            return this;
        }

        public Builder setUnitPrice(String s)
        {
            ajh.ajf = s;
            return this;
        }

        private Builder()
        {
            ajh = LineItem.this;
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
    String aiK;
    String aiL;
    String aje;
    String ajf;
    int ajg;
    String description;
    private final int xM;

    LineItem()
    {
        xM = 1;
        ajg = 0;
    }

    LineItem(int j, String s, String s1, String s2, String s3, int k, String s4)
    {
        xM = j;
        description = s;
        aje = s1;
        ajf = s2;
        aiK = s3;
        ajg = k;
        aiL = s4;
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
        return aiL;
    }

    public String getDescription()
    {
        return description;
    }

    public String getQuantity()
    {
        return aje;
    }

    public int getRole()
    {
        return ajg;
    }

    public String getTotalPrice()
    {
        return aiK;
    }

    public String getUnitPrice()
    {
        return ajf;
    }

    public int getVersionCode()
    {
        return xM;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel, j);
    }

}
