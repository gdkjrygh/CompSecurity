// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.a;

// Referenced classes of package com.google.android.gms.wallet:
//            y

public final class OfferWalletObject
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new y();
    String a;
    String b;
    CommonWalletObject c;
    private final int d;

    OfferWalletObject()
    {
        d = 3;
    }

    OfferWalletObject(int i, String s, String s1, CommonWalletObject commonwalletobject)
    {
        d = i;
        b = s1;
        if (i < 3)
        {
            c = CommonWalletObject.a().a(s).a();
            return;
        } else
        {
            c = commonwalletobject;
            return;
        }
    }

    public final int a()
    {
        return d;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.wallet.y.a(this, parcel, i);
    }

}
