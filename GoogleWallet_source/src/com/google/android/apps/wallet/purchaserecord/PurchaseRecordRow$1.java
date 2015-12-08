// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.os.Parcel;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordRow, PurchaseRecordRenderable

final class able
    implements android.os.purchaserecord.PurchaseRecordRow._cls1
{

    private static PurchaseRecordRow createFromParcel(Parcel parcel)
    {
        PurchaseRecordRow purchaserecordrow = new PurchaseRecordRow();
        PurchaseRecordRow.access$002(purchaserecordrow, parcel.readString());
        PurchaseRecordRow.access$102(purchaserecordrow, parcel.readString());
        PurchaseRecordRow.access$202(purchaserecordrow, parcel.readString());
        PurchaseRecordRow.access$302(purchaserecordrow, leWeight.valueOf(parcel.readString()));
        PurchaseRecordRow.access$402(purchaserecordrow, (PurchaseRecordRenderable)parcel.readParcelable(com/google/android/apps/wallet/purchaserecord/PurchaseRecordRenderable.getClassLoader()));
        PurchaseRecordRow.access$502(purchaserecordrow, (PurchaseRecordRenderable)parcel.readParcelable(com/google/android/apps/wallet/purchaserecord/PurchaseRecordRenderable.getClassLoader()));
        boolean aflag[] = new boolean[1];
        parcel.readBooleanArray(aflag);
        PurchaseRecordRow.access$602(purchaserecordrow, aflag[0]);
        return purchaserecordrow;
    }

    private static PurchaseRecordRow[] newArray(int i)
    {
        return new PurchaseRecordRow[i];
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    able()
    {
    }
}
