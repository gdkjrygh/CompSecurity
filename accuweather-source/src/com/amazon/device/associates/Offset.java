// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.amazon.device.associates:
//            aj, an

public class Offset
    implements Parcelable
{

    public static final Offset BEGINNING = new Offset("0");
    public static final android.os.Parcelable.Creator CREATOR = new aj();
    private final String a;

    private Offset(Parcel parcel)
    {
        a = parcel.readString();
    }

    Offset(Parcel parcel, aj aj1)
    {
        this(parcel);
    }

    Offset(String s)
    {
        a = s;
    }

    public static Offset fromString(String s)
    {
        an.a(s, "encodedOffset");
        if ("0".equals(s))
        {
            return BEGINNING;
        } else
        {
            return new Offset(s);
        }
    }

    public int describeContents()
    {
        return hashCode();
    }

    public String toString()
    {
        return a;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
    }


    // Unreferenced inner class com/amazon/device/associates/aj
    static final class aj
        implements android.os.Parcelable.Creator
    {

        public Offset a(Parcel parcel)
        {
            return new Offset(parcel, null);
        }

        public Offset[] a(int i)
        {
            return new Offset[i];
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public volatile Object[] newArray(int i)
        {
            return a(i);
        }

            aj()
            {
            }
    }

}
