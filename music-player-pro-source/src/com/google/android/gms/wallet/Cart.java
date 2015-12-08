// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.wallet:
//            b, LineItem

public final class Cart
    implements SafeParcelable
{
    public final class Builder
    {

        final Cart auI;

        public Builder addLineItem(LineItem lineitem)
        {
            auI.auH.add(lineitem);
            return this;
        }

        public Cart build()
        {
            return auI;
        }

        public Builder setCurrencyCode(String s)
        {
            auI.auG = s;
            return this;
        }

        public Builder setLineItems(List list)
        {
            auI.auH.clear();
            auI.auH.addAll(list);
            return this;
        }

        public Builder setTotalPrice(String s)
        {
            auI.auF = s;
            return this;
        }

        private Builder()
        {
            auI = Cart.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new b();
    private final int CK;
    String auF;
    String auG;
    ArrayList auH;

    Cart()
    {
        CK = 1;
        auH = new ArrayList();
    }

    Cart(int i, String s, String s1, ArrayList arraylist)
    {
        CK = i;
        auF = s;
        auG = s1;
        auH = arraylist;
    }

    public static Builder newBuilder()
    {
        Cart cart = new Cart();
        cart.getClass();
        return cart. new Builder();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCurrencyCode()
    {
        return auG;
    }

    public ArrayList getLineItems()
    {
        return auH;
    }

    public String getTotalPrice()
    {
        return auF;
    }

    public int getVersionCode()
    {
        return CK;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
