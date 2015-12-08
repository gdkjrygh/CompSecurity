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

        private static Barcode.Phone createFromParcel(Parcel parcel)
        {
            return new Barcode.Phone(parcel, null);
        }

        private static Barcode.Phone[] newArray(int i)
        {
            return new Barcode.Phone[i];
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
    public String number;
    public int type;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(type);
        parcel.writeString(number);
    }


    public _cls1()
    {
    }

    private _cls1(Parcel parcel)
    {
        type = parcel.readInt();
        number = parcel.readString();
    }

    number(Parcel parcel, number number1)
    {
        this(parcel);
    }
}
