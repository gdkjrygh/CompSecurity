// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.gcm:
//            Task

public class PeriodicTask extends Task
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new PeriodicTask(parcel, (byte)0);
        }

        public final Object[] newArray(int i)
        {
            return new PeriodicTask[i];
        }

    };
    protected long a;
    protected long b;

    private PeriodicTask(Parcel parcel)
    {
        super(parcel);
        a = -1L;
        b = -1L;
        a = parcel.readLong();
        b = parcel.readLong();
    }

    PeriodicTask(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public String toString()
    {
        return (new StringBuilder()).append(super.toString()).append(" period=").append(a).append(" flex=").append(b).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeLong(a);
        parcel.writeLong(b);
    }

}
