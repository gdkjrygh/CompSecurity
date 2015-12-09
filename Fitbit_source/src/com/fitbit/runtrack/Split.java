// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.fitbit.data.domain.Entity;
import com.fitbit.runtrack.data.ExerciseStat;

public class Split extends Entity
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Split a(Parcel parcel)
        {
            Split split = new Split((Location)parcel.readParcelable(android/location/Location.getClassLoader()), (ExerciseStat)parcel.readParcelable(com/fitbit/runtrack/data/ExerciseStat.getClassLoader()));
            split.readEntityFromParcel(parcel);
            return split;
        }

        public Split[] a(int i)
        {
            return new Split[i];
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
    private final Location location;
    private final ExerciseStat stat;

    public Split(Location location1, ExerciseStat exercisestat)
    {
        location = location1;
        stat = exercisestat;
    }

    public Location a()
    {
        return location;
    }

    public ExerciseStat b()
    {
        return stat;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(location, i);
        parcel.writeParcelable(stat, i);
        writeEntityToParcel(parcel, i);
    }

}
