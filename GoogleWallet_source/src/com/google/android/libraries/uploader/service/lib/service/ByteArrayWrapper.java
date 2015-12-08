// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.uploader.service.lib.service;

import android.os.Parcel;
import android.os.Parcelable;

public final class ByteArrayWrapper
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static ByteArrayWrapper createFromParcel(Parcel parcel)
        {
            return new ByteArrayWrapper(parcel);
        }

        private static ByteArrayWrapper[] newArray(int i)
        {
            return new ByteArrayWrapper[i];
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private byte byteArray[];

    public ByteArrayWrapper()
    {
    }

    public ByteArrayWrapper(Parcel parcel)
    {
        readFromParcel(parcel);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final byte[] getByteArray()
    {
        return byteArray;
    }

    public final void readFromParcel(Parcel parcel)
    {
        byteArray = new byte[parcel.readInt()];
        parcel.readByteArray(byteArray);
    }

    public final void setByteArray(byte abyte0[])
    {
        byteArray = abyte0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
    }

}
