// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.os.Parcel;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordAction

final class 
    implements android.os.chaserecord.PurchaseRecordAction._cls2
{

    private static PurchaseRecordAction createFromParcel(Parcel parcel)
    {
        return new PurchaseRecordAction(parcel.readString(), parcel.readString());
    }

    private static PurchaseRecordAction[] newArray(int i)
    {
        return new PurchaseRecordAction[i];
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
