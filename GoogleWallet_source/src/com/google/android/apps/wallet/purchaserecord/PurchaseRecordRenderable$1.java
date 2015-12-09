// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.os.Parcel;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordRenderable

final class pe
    implements android.os.erecord.PurchaseRecordRenderable._cls1
{

    private static PurchaseRecordRenderable createFromParcel(Parcel parcel)
    {
        PurchaseRecordRenderable purchaserecordrenderable = new PurchaseRecordRenderable();
        PurchaseRecordRenderable.access$002(purchaserecordrenderable, yle.valueOf(parcel.readString()));
        PurchaseRecordRenderable.access$102(purchaserecordrenderable, parcel.readString());
        PurchaseRecordRenderable.access$202(purchaserecordrenderable, parcel.readString());
        PurchaseRecordRenderable.access$302(purchaserecordrenderable, (Long)parcel.readValue(java/lang/Long.getClassLoader()));
        PurchaseRecordRenderable.access$402(purchaserecordrenderable, parcel.readString());
        PurchaseRecordRenderable.access$502(purchaserecordrenderable, pe.valueOf(parcel.readString()));
        PurchaseRecordRenderable.access$602(purchaserecordrenderable, parcel.readString());
        return purchaserecordrenderable;
    }

    private static PurchaseRecordRenderable[] newArray(int i)
    {
        return new PurchaseRecordRenderable[i];
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    pe()
    {
    }
}
