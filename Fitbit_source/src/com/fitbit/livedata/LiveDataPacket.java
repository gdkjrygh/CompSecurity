// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.livedata;

import android.os.Parcel;
import android.os.Parcelable;

public class LiveDataPacket
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public LiveDataPacket a(Parcel parcel)
        {
            LiveDataPacket livedatapacket = new LiveDataPacket();
            LiveDataPacket.a(livedatapacket, parcel.readInt());
            LiveDataPacket.b(livedatapacket, parcel.readInt());
            LiveDataPacket.a(livedatapacket, parcel.readDouble());
            LiveDataPacket.b(livedatapacket, parcel.readDouble());
            LiveDataPacket.c(livedatapacket, parcel.readInt());
            LiveDataPacket.a(livedatapacket, (short)parcel.readInt());
            LiveDataPacket.b(livedatapacket, (short)parcel.readInt());
            return livedatapacket;
        }

        public LiveDataPacket[] a(int i)
        {
            return new LiveDataPacket[i];
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
    private int a;
    private int b;
    private double c;
    private double d;
    private int e;
    private short f;
    private short g;

    public LiveDataPacket()
    {
        a = -1;
        b = -1;
        c = -1D;
        d = -1D;
        e = -1;
        f = -1;
        g = -1;
    }

    static double a(LiveDataPacket livedatapacket, double d1)
    {
        livedatapacket.c = d1;
        return d1;
    }

    static int a(LiveDataPacket livedatapacket, int i)
    {
        livedatapacket.a = i;
        return i;
    }

    static short a(LiveDataPacket livedatapacket, short word0)
    {
        livedatapacket.f = word0;
        return word0;
    }

    static double b(LiveDataPacket livedatapacket, double d1)
    {
        livedatapacket.d = d1;
        return d1;
    }

    static int b(LiveDataPacket livedatapacket, int i)
    {
        livedatapacket.b = i;
        return i;
    }

    static short b(LiveDataPacket livedatapacket, short word0)
    {
        livedatapacket.g = word0;
        return word0;
    }

    static int c(LiveDataPacket livedatapacket, int i)
    {
        livedatapacket.e = i;
        return i;
    }

    public int a()
    {
        return a;
    }

    public void a(double d1)
    {
        c = d1;
    }

    public void a(int i)
    {
        a = i;
    }

    public void a(short word0)
    {
        f = word0;
    }

    public int b()
    {
        return b;
    }

    public void b(double d1)
    {
        d = d1;
    }

    public void b(int i)
    {
        b = i;
    }

    public void b(short word0)
    {
        g = word0;
    }

    public double c()
    {
        return c;
    }

    public void c(int i)
    {
        e = i;
    }

    public double d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public int e()
    {
        return e;
    }

    public short f()
    {
        return f;
    }

    public short g()
    {
        return g;
    }

    public boolean h()
    {
        return g > 0;
    }

    public String toString()
    {
        return String.format("LiveData packet: steps[%d] calories[%d] distance[%f] floors[%f] activeMinutes[%d] heartRate[%d] heartRateConfidence[%d]", new Object[] {
            Integer.valueOf(a), Integer.valueOf(b), Double.valueOf(d), Double.valueOf(c), Integer.valueOf(e), Short.valueOf(f), Short.valueOf(g)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeInt(b);
        parcel.writeDouble(c);
        parcel.writeDouble(d);
        parcel.writeInt(e);
        parcel.writeInt(f);
        parcel.writeInt(g);
    }

}
