// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import android.os.Parcel;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            OrderPlasticCardUiModel

final class 
    implements android.os.c.OrderPlasticCardUiModel._cls1
{

    private static OrderPlasticCardUiModel createFromParcel(Parcel parcel)
    {
        OrderPlasticCardUiModel orderplasticcarduimodel = new OrderPlasticCardUiModel();
        orderplasticcarduimodel.setAddresses(OrderPlasticCardUiModel.access$000(parcel));
        orderplasticcarduimodel.setSelectedAddressIndex(parcel.readInt());
        return orderplasticcarduimodel;
    }

    private static OrderPlasticCardUiModel[] newArray(int i)
    {
        return new OrderPlasticCardUiModel[i];
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
