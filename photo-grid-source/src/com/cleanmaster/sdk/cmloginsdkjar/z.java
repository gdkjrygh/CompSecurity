// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar;

import android.os.Parcel;

final class z
    implements android.os.Parcelable.Creator
{

    z()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new Request.ParcelFileDescriptorWithMimeType(parcel, (byte)0);
    }

    public final volatile Object[] newArray(int i)
    {
        return new Request.ParcelFileDescriptorWithMimeType[i];
    }
}
