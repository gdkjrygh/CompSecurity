// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.Parcel;

final class ah
    implements android.os.Parcelable.Creator
{

    ah()
    {
    }

    public GraphRequest.ParcelableResourceWithMimeType a(Parcel parcel)
    {
        return new GraphRequest.ParcelableResourceWithMimeType(parcel, null);
    }

    public GraphRequest.ParcelableResourceWithMimeType[] a(int i)
    {
        return new GraphRequest.ParcelableResourceWithMimeType[i];
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
