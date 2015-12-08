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

        final Cart aiN;

        public Builder addLineItem(LineItem lineitem)
        {
            aiN.aiM.add(lineitem);
            return this;
        }

        public Cart build()
        {
            return aiN;
        }

        public Builder setCurrencyCode(String s)
        {
            aiN.aiL = s;
            return this;
        }

        public Builder setLineItems(List list)
        {
            aiN.aiM.clear();
            aiN.aiM.addAll(list);
            return this;
        }

        public Builder setTotalPrice(String s)
        {
            aiN.aiK = s;
            return this;
        }

        private Builder()
        {
            aiN = Cart.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new b();
    String aiK;
    String aiL;
    ArrayList aiM;
    private final int xM;

    Cart()
    {
        xM = 1;
        aiM = new ArrayList();
    }

    Cart(int i, String s, String s1, ArrayList arraylist)
    {
        xM = i;
        aiK = s;
        aiL = s1;
        aiM = arraylist;
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
        return aiL;
    }

    public ArrayList getLineItems()
    {
        return aiM;
    }

    public String getTotalPrice()
    {
        return aiK;
    }

    public int getVersionCode()
    {
        return xM;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
