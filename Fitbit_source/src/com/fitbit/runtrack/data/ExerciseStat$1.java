// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.data;

import android.os.Parcel;
import android.os.ParcelUuid;
import com.fitbit.data.domain.Length;
import com.fitbit.runtrack.Duration;

// Referenced classes of package com.fitbit.runtrack.data:
//            ExerciseStat

static final class 
    implements android.os.tor
{

    public ExerciseStat a(Parcel parcel)
    {
        Length length = (Length)parcel.readParcelable(com/fitbit/data/domain/Length.getClassLoader());
        Length length1 = (Length)parcel.readParcelable(com/fitbit/data/domain/Length.getClassLoader());
        Duration duration = (Duration)parcel.readParcelable(com/fitbit/runtrack/Duration.getClassLoader());
        double d = parcel.readDouble();
        Object obj = (ParcelUuid)parcel.readParcelable(android/os/ParcelUuid.getClassLoader());
        parcel = parcel.createLongArray();
        obj = ((ParcelUuid) (obj)).getUuid();
        if (parcel.length > 0)
        {
            parcel = Long.valueOf(parcel[0]);
        } else
        {
            parcel = null;
        }
        return new ExerciseStat(((java.util.UUID) (obj)), parcel, length, length1, duration, d);
    }

    public ExerciseStat[] a(int i)
    {
        return new ExerciseStat[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    ()
    {
    }
}
