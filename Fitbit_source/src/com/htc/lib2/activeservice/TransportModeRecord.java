// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.lib2.activeservice;

import android.os.Parcel;
import android.os.Parcelable;

public class TransportModeRecord
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final int MODE_BICYCLE = 3;
    public static final int MODE_DOWNSTAIRS = 6;
    public static final int MODE_RUN = 2;
    public static final int MODE_STILL = 0;
    public static final int MODE_UNKNOWN = 7;
    public static final int MODE_UPSTAIRS = 5;
    public static final int MODE_VEHICLE = 4;
    public static final int MODE_WALK = 1;
    private float barometer;
    private float met;
    private int mode;
    private int period;
    private int steps;
    private long timestamp;

    public TransportModeRecord(long l, int i, int j, int k, float f, float f1)
    {
        timestamp = l;
        mode = i;
        steps = j;
        period = k;
        met = f1;
        barometer = f;
    }

    public TransportModeRecord(long l, int i, int j, int k, float f, int i1)
    {
        timestamp = l;
        mode = i;
        steps = j;
        period = k;
        met = accLevel2MET(i1, k);
        barometer = f;
    }

    public TransportModeRecord(Parcel parcel)
    {
        timestamp = parcel.readLong();
        mode = parcel.readInt();
        steps = parcel.readInt();
        period = parcel.readInt();
        met = parcel.readFloat();
        barometer = parcel.readFloat();
    }

    public TransportModeRecord(TransportModeRecord transportmoderecord)
    {
        timestamp = transportmoderecord.getTimestamp();
        mode = transportmoderecord.getMode();
        steps = transportmoderecord.getSteps();
        period = transportmoderecord.getPeriod();
        met = transportmoderecord.getMET();
        barometer = transportmoderecord.getBarometerData();
    }

    public TransportModeRecord(String s)
    {
        s = s.split(" ");
        timestamp = Long.parseLong(s[0]);
        mode = Integer.parseInt(s[1]);
        steps = Integer.parseInt(s[2]);
        period = Integer.parseInt(s[3]);
        met = Float.parseFloat(s[4]);
        barometer = Float.parseFloat(s[5]);
    }

    private float accLevel2MET(int i, int j)
    {
        return 0.688F * (float)i + 1.0522F;
    }

    public int describeContents()
    {
        return 0;
    }

    public float getBarometerData()
    {
        return barometer;
    }

    public float getMET()
    {
        return met;
    }

    public int getMode()
    {
        return mode;
    }

    public int getPeriod()
    {
        return period;
    }

    public int getSteps()
    {
        return steps;
    }

    public long getTimestamp()
    {
        return timestamp;
    }

    public String toString()
    {
        return (new StringBuilder()).append(timestamp).append(" ").append(mode).append(" ").append(steps).append(" ").append(period).append(" ").append(met).append(" ").append(barometer).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(timestamp);
        parcel.writeInt(mode);
        parcel.writeInt(steps);
        parcel.writeInt(period);
        parcel.writeFloat(met);
        parcel.writeFloat(barometer);
    }


    /* member class not found */
    class _cls1 {}

}
