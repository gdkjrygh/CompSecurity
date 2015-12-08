// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

// Referenced classes of package com.facebook:
//            Request

private static class fileDescriptor
    implements Parcelable
{

    public static final android.os.e.fileDescriptor CREATOR = new android.os.Parcelable.Creator() {

        public Request.ParcelFileDescriptorWithMimeType createFromParcel(Parcel parcel)
        {
            return new Request.ParcelFileDescriptorWithMimeType(parcel, null);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public Request.ParcelFileDescriptorWithMimeType[] newArray(int i)
        {
            return new Request.ParcelFileDescriptorWithMimeType[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private final ParcelFileDescriptor fileDescriptor;
    private final String mimeType;

    public int describeContents()
    {
        return 1;
    }

    public ParcelFileDescriptor getFileDescriptor()
    {
        return fileDescriptor;
    }

    public String getMimeType()
    {
        return mimeType;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mimeType);
        parcel.writeFileDescriptor(fileDescriptor.getFileDescriptor());
    }


    private _cls1(Parcel parcel)
    {
        mimeType = parcel.readString();
        fileDescriptor = parcel.readFileDescriptor();
    }

    fileDescriptor(Parcel parcel, fileDescriptor filedescriptor)
    {
        this(parcel);
    }

    public <init>(ParcelFileDescriptor parcelfiledescriptor, String s)
    {
        mimeType = s;
        fileDescriptor = parcelfiledescriptor;
    }
}
