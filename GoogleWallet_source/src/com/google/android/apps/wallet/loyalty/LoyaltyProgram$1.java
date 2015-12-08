// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import android.os.Parcel;
import com.google.android.apps.wallet.wobs.add.UserDataPrompt;
import com.google.common.collect.ImmutableList;

// Referenced classes of package com.google.android.apps.wallet.loyalty:
//            LoyaltyProgram, LoyaltyCardInfo

final class 
    implements android.os.r
{

    private static LoyaltyProgram createFromParcel(Parcel parcel)
    {
        boolean flag = true;
        int i = 0;
        ClassLoader classloader = com/google/android/apps/wallet/loyalty/LoyaltyCardInfo.getClassLoader();
        String s = parcel.readString();
        String s1 = parcel.readString();
        String s2 = parcel.readString();
        String s3 = parcel.readString();
        int j = parcel.readInt();
        String s4;
        String s5;
        com.google.common.collect.lder lder;
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        s4 = parcel.readString();
        s5 = parcel.readString();
        lder = ImmutableList.builder();
        parcel = parcel.readParcelableArray(classloader);
        for (int k = parcel.length; i < k; i++)
        {
            lder.add((UserDataPrompt)parcel[i]);
        }

        return new LoyaltyProgram(s, s1, s2, s3, j, lder.build(), flag, s4, s5);
    }

    private static LoyaltyProgram[] newArray(int i)
    {
        return new LoyaltyProgram[i];
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
