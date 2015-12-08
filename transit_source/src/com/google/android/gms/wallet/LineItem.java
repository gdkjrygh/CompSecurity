// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            e

public class LineItem
    implements SafeParcelable
{
    public final class Builder
    {

        final LineItem tT;

        public LineItem build()
        {
            return tT;
        }

        public Builder setCurrencyCode(String s)
        {
            tT.tE = s;
            return this;
        }

        public Builder setDescription(String s)
        {
            tT.description = s;
            return this;
        }

        public Builder setQuantity(String s)
        {
            tT.tQ = s;
            return this;
        }

        public Builder setRole(int i)
        {
            tT.tS = i;
            return this;
        }

        public Builder setTotalPrice(String s)
        {
            tT.tD = s;
            return this;
        }

        public Builder setUnitPrice(String s)
        {
            tT.tR = s;
            return this;
        }

        private Builder()
        {
            tT = LineItem.this;
            super();
        }

    }

    public static interface Role
    {

        public static final int REGULAR = 0;
        public static final int SHIPPING = 2;
        public static final int TAX = 1;
    }


    public static final android.os.Parcelable.Creator CREATOR = new e();
    String description;
    private final int iM;
    String tD;
    String tE;
    String tQ;
    String tR;
    int tS;

    public LineItem()
    {
        tS = 0;
        iM = 1;
    }

    LineItem(int i, String s, String s1, String s2, String s3, int j, String s4)
    {
        tS = 0;
        iM = i;
        description = s;
        tQ = s1;
        tR = s2;
        tD = s3;
        tS = j;
        tE = s4;
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
        return tE;
    }

    public String getDescription()
    {
        return description;
    }

    public String getQuantity()
    {
        return tQ;
    }

    public int getRole()
    {
        return tS;
    }

    public String getTotalPrice()
    {
        return tD;
    }

    public String getUnitPrice()
    {
        return tR;
    }

    public int getVersionCode()
    {
        return iM;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        e.a(this, parcel, i);
    }

}
