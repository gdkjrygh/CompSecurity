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

public class Cart
    implements SafeParcelable
{
    public final class Builder
    {

        final Cart tG;

        public Builder addLineItem(LineItem lineitem)
        {
            tG.tF.add(lineitem);
            return this;
        }

        public Cart build()
        {
            return tG;
        }

        public Builder setCurrencyCode(String s)
        {
            tG.tE = s;
            return this;
        }

        public Builder setLineItems(List list)
        {
            tG.tF.clear();
            tG.tF.addAll(list);
            return this;
        }

        public Builder setTotalPrice(String s)
        {
            tG.tD = s;
            return this;
        }

        private Builder()
        {
            tG = Cart.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new b();
    private final int iM;
    String tD;
    String tE;
    ArrayList tF;

    public Cart()
    {
        iM = 1;
        tF = new ArrayList();
    }

    Cart(int i, String s, String s1, ArrayList arraylist)
    {
        iM = i;
        tD = s;
        tE = s1;
        tF = arraylist;
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
        return tE;
    }

    public ArrayList getLineItems()
    {
        return tF;
    }

    public String getTotalPrice()
    {
        return tD;
    }

    public int getVersionCode()
    {
        return iM;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
