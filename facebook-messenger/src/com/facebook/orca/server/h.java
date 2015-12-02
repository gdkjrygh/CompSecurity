// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;

// Referenced classes of package com.facebook.orca.server:
//            DeliveredReceiptParams

final class h
    implements android.os.Parcelable.Creator
{

    h()
    {
    }

    public DeliveredReceiptParams a(Parcel parcel)
    {
        return new DeliveredReceiptParams(parcel, null);
    }

    public DeliveredReceiptParams[] a(int i)
    {
        return new DeliveredReceiptParams[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
