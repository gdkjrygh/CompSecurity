// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.tap;

import android.os.Parcel;

// Referenced classes of package com.google.android.apps.wallet.hce.tap:
//            WalletHcePaymentEvent

final class imit
    implements android.os.tap.WalletHcePaymentEvent._cls1
{

    private static WalletHcePaymentEvent createFromParcel(Parcel parcel)
    {
        long l = parcel.readLong();
        com.google.android.apps.wallet.hce.emv.imit imit;
        boolean flag;
        boolean flag1;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        imit = (com.google.android.apps.wallet.hce.emv.imit)parcel.readParcelable(com/google/android/apps/wallet/hce/emv/RotatingAtc$RotatingAtcLimit.getClassLoader());
        if (parcel.readInt() == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        return new WalletHcePaymentEvent(l, flag, imit, null, flag1);
    }

    private static WalletHcePaymentEvent[] newArray(int i)
    {
        return new WalletHcePaymentEvent[i];
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    imit()
    {
    }
}
