// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

public class <init>
    implements Parcelable
{

    public static final android.os.e.b CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new Request.ParcelFileDescriptorWithMimeType(parcel, (byte)0);
        }

        public final volatile Object[] newArray(int i)
        {
            return new Request.ParcelFileDescriptorWithMimeType[i];
        }

    };
    public final String a;
    public final ParcelFileDescriptor b;

    public int describeContents()
    {
        return 1;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeFileDescriptor(b.getFileDescriptor());
    }


    private _cls1(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readFileDescriptor();
    }

    b(Parcel parcel, byte byte0)
    {
        this(parcel);
    }
}
