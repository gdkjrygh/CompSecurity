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

        final Cart aiK;

        public Builder addLineItem(LineItem lineitem)
        {
            aiK.aiJ.add(lineitem);
            return this;
        }

        public Cart build()
        {
            return aiK;
        }

        public Builder setCurrencyCode(String s)
        {
            aiK.aiI = s;
            return this;
        }

        public Builder setLineItems(List list)
        {
            aiK.aiJ.clear();
            aiK.aiJ.addAll(list);
            return this;
        }

        public Builder setTotalPrice(String s)
        {
            aiK.aiH = s;
            return this;
        }

        private Builder()
        {
            aiK = Cart.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new b();
    String aiH;
    String aiI;
    ArrayList aiJ;
    private final int xJ;

    Cart()
    {
        xJ = 1;
        aiJ = new ArrayList();
    }

    Cart(int i, String s, String s1, ArrayList arraylist)
    {
        xJ = i;
        aiH = s;
        aiI = s1;
        aiJ = arraylist;
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
        return aiI;
    }

    public ArrayList getLineItems()
    {
        return aiJ;
    }

    public String getTotalPrice()
    {
        return aiH;
    }

    public int getVersionCode()
    {
        return xJ;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
