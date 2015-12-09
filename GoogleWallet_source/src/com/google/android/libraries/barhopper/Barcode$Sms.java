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

    public static final android.os.reator CREATOR = new android.os.Parcelable.Creator() {

        private static Barcode.Sms createFromParcel(Parcel parcel)
        {
            return new Barcode.Sms(parcel, null);
        }

        private static Barcode.Sms[] newArray(int i)
        {
            return new Barcode.Sms[i];
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
    public String message;
    public String phoneNumber;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(message);
        parcel.writeString(phoneNumber);
    }


    public _cls1()
    {
    }

    private _cls1(Parcel parcel)
    {
        message = parcel.readString();
        phoneNumber = parcel.readString();
    }

    phoneNumber(Parcel parcel, phoneNumber phonenumber)
    {
        this(parcel);
    }
}
