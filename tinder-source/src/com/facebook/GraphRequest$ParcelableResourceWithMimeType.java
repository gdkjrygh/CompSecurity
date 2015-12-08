// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook:
//            GraphRequest, g

public static class <init>
    implements Parcelable
{

    public static final android.os.e.b CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new GraphRequest.ParcelableResourceWithMimeType(parcel, (byte)0);
        }

        public final volatile Object[] newArray(int i)
        {
            return new GraphRequest.ParcelableResourceWithMimeType[i];
        }

    };
    final String a;
    final Parcelable b;

    public int describeContents()
    {
        return 1;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeParcelable(b, i);
    }


    private _cls1(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readParcelable(g.g().getClassLoader());
    }

    b(Parcel parcel, byte byte0)
    {
        this(parcel);
    }
}
