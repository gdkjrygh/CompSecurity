// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar:
//            z

class <init>
    implements Parcelable
{

    public static final android.os.DescriptorWithMimeType.b CREATOR = new z();
    private final String a;
    private final ParcelFileDescriptor b;

    public final String a()
    {
        return a;
    }

    public final ParcelFileDescriptor b()
    {
        return b;
    }

    public int describeContents()
    {
        return 1;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeFileDescriptor(b.getFileDescriptor());
    }


    private (Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readFileDescriptor();
    }

    b(Parcel parcel, byte byte0)
    {
        this(parcel);
    }
}
