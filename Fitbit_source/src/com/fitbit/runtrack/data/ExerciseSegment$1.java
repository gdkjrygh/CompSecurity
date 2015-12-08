// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.data;

import android.os.Parcel;
import android.os.ParcelUuid;
import java.util.Date;

// Referenced classes of package com.fitbit.runtrack.data:
//            ExerciseSegment

static final class 
    implements android.os.
{

    public ExerciseSegment a(Parcel parcel)
    {
        Date date = null;
        ParcelUuid parceluuid = (ParcelUuid)parcel.readParcelable(android/os/ParcelUuid.getClassLoader());
        long l = parcel.readLong();
        long l1 = parcel.readLong();
        long l2 = parcel.readLong();
        long l3 = parcel.readLong();
        Object obj;
        if (l1 != 0L)
        {
            obj = new Date(l1);
        } else
        {
            obj = null;
        }
        if (l3 != 0L)
        {
            date = new Date(l3);
        }
        obj = new ExerciseSegment(parceluuid.getUuid(), l, ((Date) (obj)), l2, date);
        ((ExerciseSegment) (obj)).readEntityFromParcel(parcel);
        return ((ExerciseSegment) (obj));
    }

    public ExerciseSegment[] a(int i)
    {
        return new ExerciseSegment[i];
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
