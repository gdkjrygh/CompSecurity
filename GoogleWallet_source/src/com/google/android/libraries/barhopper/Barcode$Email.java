// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.google.android.libraries.barhopper:
//            Barcode

public static class <init>
    implements Parcelable
{

    public static final android.os.ator CREATOR = new android.os.Parcelable.Creator() {

        private static Barcode.Email createFromParcel(Parcel parcel)
        {
            return new Barcode.Email(parcel, null);
        }

        private static Barcode.Email[] newArray(int i)
        {
            return new Barcode.Email[i];
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
    public String address;
    public String body;
    public String subject;
    public int type;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(type);
        parcel.writeString(address);
        parcel.writeString(subject);
        parcel.writeString(body);
    }


    public _cls1()
    {
    }

    private _cls1(Parcel parcel)
    {
        type = parcel.readInt();
        address = parcel.readString();
        subject = parcel.readString();
        body = parcel.readString();
    }

    body(Parcel parcel, body body1)
    {
        this(parcel);
    }
}
