// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.data;

import android.location.Location;
import android.os.Parcel;
import android.os.ParcelUuid;

// Referenced classes of package com.fitbit.runtrack.data:
//            ExerciseEvent

static final class pe
    implements android.os.or
{

    public ExerciseEvent a(Parcel parcel)
    {
        long l = parcel.readLong();
        Object obj = pe.values()[parcel.readInt()];
        Location location = (Location)parcel.readParcelable(android/location/Location.getClassLoader());
        obj = new ExerciseEvent(l, ((ParcelUuid)parcel.readParcelable(android/os/ParcelUuid.getClassLoader())).getUuid(), ((pe) (obj)), location);
        ((ExerciseEvent) (obj)).readEntityFromParcel(parcel);
        return ((ExerciseEvent) (obj));
    }

    public ExerciseEvent[] a(int i)
    {
        return new ExerciseEvent[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    pe()
    {
    }
}
