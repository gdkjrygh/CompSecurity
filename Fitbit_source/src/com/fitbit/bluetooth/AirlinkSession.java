// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public class AirlinkSession
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public AirlinkSession a(Parcel parcel)
        {
            return new AirlinkSession(com.fitbit.galileo.ota.GalileoOtaMessages.BootMode.values()[parcel.readInt()], parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        public AirlinkSession[] a(int i)
        {
            return new AirlinkSession[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    public final com.fitbit.galileo.ota.GalileoOtaMessages.BootMode a;
    public final int b;
    public final int c;
    public final int d;

    public AirlinkSession(com.fitbit.galileo.ota.GalileoOtaMessages.BootMode bootmode, int i, int j, int k)
    {
        a = bootmode;
        b = i;
        c = j;
        d = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return String.format("AirlinkVersion %s.%s - BootMode:%s - MTU - %s bytes", new Object[] {
            Integer.valueOf(c), Integer.valueOf(d), a, Integer.valueOf(b)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (a != null)
        {
            i = a.ordinal();
        } else
        {
            i = com.fitbit.galileo.ota.GalileoOtaMessages.BootMode.a.ordinal();
        }
        parcel.writeInt(i);
        parcel.writeInt(b);
        parcel.writeInt(c);
        parcel.writeInt(d);
    }

}
