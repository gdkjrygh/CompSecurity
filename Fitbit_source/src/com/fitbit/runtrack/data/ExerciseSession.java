// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.data;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import android.text.TextUtils;
import com.fitbit.data.domain.Entity;
import com.fitbit.savedstate.s;
import java.util.Date;
import java.util.UUID;

public class ExerciseSession extends Entity
    implements Parcelable
{
    public static final class Status extends Enum
    {

        public static final Status a;
        public static final Status b;
        public static final Status c;
        private static final Status d[];
        public final String statusLabel;

        public static Status a(String s1)
        {
            Status astatus[] = values();
            int j = astatus.length;
            for (int i = 0; i < j; i++)
            {
                Status status1 = astatus[i];
                if (TextUtils.equals(s1, status1.statusLabel))
                {
                    return status1;
                }
            }

            return a;
        }

        public static Status valueOf(String s1)
        {
            return (Status)Enum.valueOf(com/fitbit/runtrack/data/ExerciseSession$Status, s1);
        }

        public static Status[] values()
        {
            return (Status[])d.clone();
        }

        static 
        {
            a = new Status("INACTIVE", 0, "inactive");
            b = new Status("ACTIVE", 1, "active");
            c = new Status("ENDED", 2, "ended");
            d = (new Status[] {
                a, b, c
            });
        }

        private Status(String s1, int i, String s2)
        {
            super(s1, i);
            statusLabel = s2;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ExerciseSession a(Parcel parcel)
        {
            Date date = null;
            ParcelUuid parceluuid = (ParcelUuid)parcel.readParcelable(android/os/ParcelUuid.getClassLoader());
            Status status1 = Status.values()[parcel.readInt()];
            int i = parcel.readInt();
            long l = parcel.readLong();
            Object obj;
            String s1;
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
            s1 = parcel.readString();
            obj = new ExerciseSession(parceluuid.getUuid(), status1, ((Date) (obj)), date, i, l, s1);
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

    };
    private int cueIndex;
    private final long exerciseType;
    private Status status;
    private Date timeEnded;
    private Date timeStarted;
    private String wireId;

    public ExerciseSession(long l)
    {
        this(UUID.randomUUID(), Status.a, null, null, 0, l, null);
    }

    public ExerciseSession(UUID uuid, Status status1, Date date, Date date1, int i, long l, 
            String s1)
    {
        setUuid(uuid);
        status = status1;
        timeStarted = date;
        timeEnded = date1;
        cueIndex = i;
        exerciseType = l;
        if (s1 == null)
        {
            s1 = s.a();
        }
        wireId = s1;
    }

    public Status a()
    {
        return status;
    }

    public void a(int i)
    {
        cueIndex = i;
    }

    protected Date b()
    {
        status = Status.b;
        Date date = new Date();
        timeStarted = date;
        return date;
    }

    public Date c()
    {
        return timeStarted;
    }

    protected Date d()
    {
        status = Status.c;
        Date date = new Date();
        timeEnded = date;
        return date;
    }

    public int describeContents()
    {
        return 0;
    }

    public Date e()
    {
        return timeEnded;
    }

    public int f()
    {
        return cueIndex;
    }

    public String g()
    {
        return wireId;
    }

    public long h()
    {
        return exerciseType;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        long l1 = -1L;
        parcel.writeParcelable(new ParcelUuid(getUuid()), 0);
        parcel.writeInt(status.ordinal());
        parcel.writeInt(cueIndex);
        long l;
        if (timeStarted != null)
        {
            l = timeStarted.getTime();
        } else
        {
            l = -1L;
        }
        parcel.writeLong(l);
        l = l1;
        if (timeEnded != null)
        {
            l = timeEnded.getTime();
        }
        parcel.writeLong(l);
        parcel.writeLong(exerciseType);
        parcel.writeString(wireId);
        writeEntityToParcel(parcel, i);
    }

}
