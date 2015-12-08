// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.data;

import android.os.Parcel;
import android.os.ParcelUuid;
import java.util.Date;

// Referenced classes of package com.fitbit.runtrack.data:
//            ExerciseSession

static final class atus
    implements android.os.
{

    public ExerciseSession a(Parcel parcel)
    {
        Date date = null;
        ParcelUuid parceluuid = (ParcelUuid)parcel.readParcelable(android/os/ParcelUuid.getClassLoader());
        atus atus = com.fitbit.runtrack.data.atus.values()[parcel.readInt()];
        int i = parcel.readInt();
        long l = parcel.readLong();
        Object obj;
        String s;
        if (l >= 0L)
        {
            obj = new Date(l);
        } else
        {
            obj = null;
        }
        l = parcel.readLong();
        if (l >= 0L)
        {
            date = new Date(l);
        }
        l = parcel.readLong();
        s = parcel.readString();
        obj = new ExerciseSession(parceluuid.getUuid(), atus, ((Date) (obj)), date, i, l, s);
        ((ExerciseSession) (obj)).readEntityFromParcel(parcel);
        return ((ExerciseSession) (obj));
    }

    public ExerciseSession[] a(int i)
    {
        return new ExerciseSession[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    atus()
    {
    }
}
