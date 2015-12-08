// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import android.os.Parcel;
import com.google.android.apps.wallet.wobs.add.UserDataPrompt;
import com.google.common.collect.Lists;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.loyalty:
//            LoyaltyCardInfo, LoyaltyProgram

final class 
    implements android.os.
{

    private static LoyaltyCardInfo createFromParcel(Parcel parcel)
    {
        boolean flag1 = true;
        ClassLoader classloader = com/google/android/apps/wallet/loyalty/LoyaltyCardInfo.getClassLoader();
        LoyaltyCardInfo loyaltycardinfo = new LoyaltyCardInfo();
        LoyaltyCardInfo.access$002(loyaltycardinfo, Lists.newArrayList());
        android.os.Parcelable aparcelable[] = parcel.readParcelableArray(classloader);
        int j = aparcelable.length;
        for (int i = 0; i < j; i++)
        {
            android.os.Parcelable parcelable = aparcelable[i];
            LoyaltyCardInfo.access$000(loyaltycardinfo).add((UserDataPrompt)parcelable);
        }

        LoyaltyCardInfo.access$102(loyaltycardinfo, (UserDataPrompt)parcel.readParcelable(classloader));
        LoyaltyCardInfo.access$202(loyaltycardinfo, (UserDataPrompt)parcel.readParcelable(classloader));
        loyaltycardinfo.barcodePrompt = (UserDataPrompt)parcel.readParcelable(classloader);
        LoyaltyCardInfo.access$302(loyaltycardinfo, (LoyaltyProgram)parcel.readParcelable(classloader));
        boolean flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        LoyaltyCardInfo.access$402(loyaltycardinfo, flag);
        if (parcel.readInt() == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        LoyaltyCardInfo.access$502(loyaltycardinfo, flag);
        return loyaltycardinfo;
    }

    private static LoyaltyCardInfo[] newArray(int i)
    {
        return new LoyaltyCardInfo[i];
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
