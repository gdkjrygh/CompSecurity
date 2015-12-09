// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import android.os.Parcel;

// Referenced classes of package com.google.android.apps.wallet.wobs.add:
//            UserDataPrompt, ParcelHelper

final class putType
    implements android.os.r
{

    private static UserDataPrompt createFromParcel(Parcel parcel)
    {
        Object obj = ParcelHelper.readNullableInteger(parcel);
        putType puttype = (putType)ParcelHelper.readEnum(parcel, com/google/android/apps/wallet/wobs/add/UserDataPrompt$InputType);
        String s = ParcelHelper.readNullableString(parcel);
        String s1 = ParcelHelper.readNullableString(parcel);
        boolean flag = ParcelHelper.readNullableBoolean(parcel).booleanValue();
        boolean flag1 = ParcelHelper.readNullableBoolean(parcel).booleanValue();
        Integer integer = ParcelHelper.readNullableInteger(parcel);
        parcel = parcel.readString();
        obj = new UserDataPrompt(((Integer) (obj)), puttype, s, s1, flag, flag1, integer, null);
        ((UserDataPrompt) (obj)).setValue(parcel);
        return ((UserDataPrompt) (obj));
    }

    private static UserDataPrompt[] newArray(int i)
    {
        return new UserDataPrompt[i];
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    putType()
    {
    }
}
