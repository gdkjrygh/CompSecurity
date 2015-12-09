// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.data;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.fitbit.data.domain.Entity;
import java.util.Date;
import java.util.UUID;

public class ExerciseSegment extends Entity
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

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

    };
    public long endEvent;
    private Date endTime;
    public UUID sessionId;
    public final long startEvent;
    private final Date startTime;

    public ExerciseSegment(UUID uuid, long l, Date date, long l1, Date date1)
    {
        if (uuid == null)
        {
            throw new NullPointerException("Cannot have a segment without a sessionId");
        }
        if (l <= 0L)
        {
            throw new IllegalArgumentException(String.format("Cannot have a segment without a valid start event: %s", new Object[] {
                Long.valueOf(l)
            }));
        }
        if (date == null)
        {
            throw new NullPointerException("Need a valid start time for segment");
        }
        if (l1 < 0L)
        {
            throw new IllegalArgumentException(String.format("Cannot have a segment with an invalid end event: %s", new Object[] {
                Long.valueOf(l1)
            }));
        } else
        {
            sessionId = uuid;
            startEvent = l;
            startTime = date;
            endEvent = l1;
            endTime = date1;
            return;
        }
    }

    protected void a(long l, Date date)
    {
        endEvent = l;
        endTime = date;
    }

    public void a(UUID uuid)
    {
        sessionId = uuid;
    }

    public boolean a()
    {
        return endEvent != 0L;
    }

    public boolean a(long l)
    {
        return !a() || l <= endTime.getTime();
    }

    public long b()
    {
        if (endEvent != 0L && endTime != null)
        {
            return endTime.getTime() - startTime.getTime();
        } else
        {
            return -1L;
        }
    }

    public Date c()
    {
        return startTime;
    }

    public Date d()
    {
        return endTime;
    }

    public int describeContents()
    {
        return 0;
    }

    public long e()
    {
        return startEvent;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ExerciseSegment)obj;
            if (sessionId == null)
            {
                if (((ExerciseSegment) (obj)).sessionId != null)
                {
                    return false;
                }
            } else
            if (!sessionId.equals(((ExerciseSegment) (obj)).sessionId))
            {
                return false;
            }
            if (startEvent != ((ExerciseSegment) (obj)).startEvent)
            {
                return false;
            }
        }
        return true;
    }

    public long f()
    {
        return endEvent;
    }

    public UUID g()
    {
        return sessionId;
    }

    public int hashCode()
    {
        int i;
        if (sessionId == null)
        {
            i = 0;
        } else
        {
            i = sessionId.hashCode();
        }
        return (i + 31) * 31 + (int)(startEvent ^ startEvent >>> 32);
    }

    public String toString()
    {
        return String.format("segment started at %s,  ended at %s [%s]", new Object[] {
            startTime, endTime, Long.valueOf(b())
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        long l1 = 0L;
        parcel.writeParcelable(new ParcelUuid(sessionId), i);
        parcel.writeLong(startEvent);
        long l;
        if (startTime == null)
        {
            l = 0L;
        } else
        {
            l = startTime.getTime();
        }
        parcel.writeLong(l);
        parcel.writeLong(endEvent);
        if (endTime == null)
        {
            l = l1;
        } else
        {
            l = endTime.getTime();
        }
        parcel.writeLong(l);
        writeEntityToParcel(parcel, i);
    }

}
