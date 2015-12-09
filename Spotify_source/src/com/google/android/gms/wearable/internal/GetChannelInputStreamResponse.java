// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import cqz;

public class GetChannelInputStreamResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new cqz();
    public final int a;
    public final int b;
    public final ParcelFileDescriptor c;

    public GetChannelInputStreamResponse(int i, int j, ParcelFileDescriptor parcelfiledescriptor)
    {
        a = i;
        b = j;
        c = parcelfiledescriptor;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        cqz.a(this, parcel, i);
    }

}
