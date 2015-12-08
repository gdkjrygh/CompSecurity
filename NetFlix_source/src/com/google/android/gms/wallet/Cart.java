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

        final Cart abf;

        public Builder addLineItem(LineItem lineitem)
        {
            abf.abe.add(lineitem);
            return this;
        }

        public Cart build()
        {
            return abf;
        }

        public Builder setCurrencyCode(String s)
        {
            abf.abd = s;
            return this;
        }

        public Builder setLineItems(List list)
        {
            abf.abe.clear();
            abf.abe.addAll(list);
            return this;
        }

        public Builder setTotalPrice(String s)
        {
            abf.abc = s;
            return this;
        }

        private Builder()
        {
            abf = Cart.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new b();
    String abc;
    String abd;
    ArrayList abe;
    private final int xH;

    Cart()
    {
        xH = 1;
        abe = new ArrayList();
    }

    Cart(int i, String s, String s1, ArrayList arraylist)
    {
        xH = i;
        abc = s;
        abd = s1;
        abe = arraylist;
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
        return abd;
    }

    public ArrayList getLineItems()
    {
        return abe;
    }

    public String getTotalPrice()
    {
        return abc;
    }

    public int getVersionCode()
    {
        return xH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
