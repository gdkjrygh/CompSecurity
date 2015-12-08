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

        final Cart asy;

        public Builder addLineItem(LineItem lineitem)
        {
            asy.asx.add(lineitem);
            return this;
        }

        public Cart build()
        {
            return asy;
        }

        public Builder setCurrencyCode(String s)
        {
            asy.asw = s;
            return this;
        }

        public Builder setLineItems(List list)
        {
            asy.asx.clear();
            asy.asx.addAll(list);
            return this;
        }

        public Builder setTotalPrice(String s)
        {
            asy.asv = s;
            return this;
        }

        private Builder()
        {
            asy = Cart.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new b();
    private final int BR;
    String asv;
    String asw;
    ArrayList asx;

    Cart()
    {
        BR = 1;
        asx = new ArrayList();
    }

    Cart(int i, String s, String s1, ArrayList arraylist)
    {
        BR = i;
        asv = s;
        asw = s1;
        asx = arraylist;
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
        return asw;
    }

    public ArrayList getLineItems()
    {
        return asx;
    }

    public String getTotalPrice()
    {
        return asv;
    }

    public int getVersionCode()
    {
        return BR;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
