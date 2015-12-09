// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.os.Parcel;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecord, PurchaseRecordRow, PurchaseRecordAction

final class ion
    implements android.os.r
{

    private static PurchaseRecord createFromParcel(Parcel parcel)
    {
        PurchaseRecord purchaserecord = new PurchaseRecord();
        PurchaseRecord.access$002(purchaserecord, (Integer)parcel.readValue(java/lang/Integer.getClassLoader()));
        PurchaseRecord.access$102(purchaserecord, (Integer)parcel.readValue(java/lang/Integer.getClassLoader()));
        PurchaseRecord.access$202(purchaserecord, parcel.readString());
        PurchaseRecord.access$302(purchaserecord, parcel.readString());
        PurchaseRecord.access$402(purchaserecord, parcel.readString());
        PurchaseRecord.access$502(purchaserecord, parcel.readString());
        PurchaseRecord.access$602(purchaserecord, (Long)parcel.readValue(java/lang/Long.getClassLoader()));
        PurchaseRecord.access$702(purchaserecord, parcel.readString());
        boolean aflag[] = new boolean[1];
        parcel.readBooleanArray(aflag);
        PurchaseRecord.access$802(purchaserecord, aflag[0]);
        PurchaseRecord.access$902(purchaserecord, (Integer)parcel.readValue(java/lang/Integer.getClassLoader()));
        PurchaseRecord.access$1002(purchaserecord, parcel.readString());
        PurchaseRecord.access$1102(purchaserecord, parcel.readString());
        PurchaseRecord.access$1202(purchaserecord, (Long)parcel.readValue(java/lang/Long.getClassLoader()));
        PurchaseRecord.access$1302(purchaserecord, parcel.readString());
        PurchaseRecord.access$1402(purchaserecord, parcel.readString());
        PurchaseRecord.access$1502(purchaserecord, parcel.createTypedArrayList(PurchaseRecordRow.CREATOR));
        PurchaseRecord.access$1602(purchaserecord, parcel.createTypedArrayList(PurchaseRecordAction.CREATOR));
        return purchaserecord;
    }

    private static PurchaseRecord[] newArray(int i)
    {
        return new PurchaseRecord[i];
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ion()
    {
    }
}
