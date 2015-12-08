// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.data;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.fitbit.data.domain.Length;
import com.fitbit.runtrack.Duration;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class ExerciseStat
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ExerciseStat a(Parcel parcel)
        {
            Length length = (Length)parcel.readParcelable(com/fitbit/data/domain/Length.getClassLoader());
            Length length1 = (Length)parcel.readParcelable(com/fitbit/data/domain/Length.getClassLoader());
            Duration duration = (Duration)parcel.readParcelable(com/fitbit/runtrack/Duration.getClassLoader());
            double d1 = parcel.readDouble();
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
            return new ExerciseStat(((UUID) (obj)), parcel, length, length1, duration, d1);
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

    };
    public final Long a;
    public final UUID b;
    private Length c;
    private final Length d;
    private Duration e;
    private final double f;

    public ExerciseStat(UUID uuid, Long long1, Length length, Length length1, Duration duration, double d1)
    {
        c = length;
        d = length1;
        e = duration;
        b = uuid;
        a = long1;
        f = d1;
    }

    public Length a()
    {
        return c;
    }

    public Duration a(com.fitbit.data.domain.Length.LengthUnits lengthunits)
    {
        double d1 = (double)e.a(TimeUnit.MILLISECONDS) / c.a(lengthunits).b();
        if (Double.isInfinite(d1) || Double.isNaN(d1))
        {
            return null;
        } else
        {
            return new Duration((long)d1);
        }
    }

    public void a(Length length)
    {
        c = length;
    }

    public void a(Duration duration)
    {
        e = duration;
    }

    public double b()
    {
        return f;
    }

    public double b(com.fitbit.data.domain.Length.LengthUnits lengthunits)
    {
        double d1 = (1.0D * (double)e.a(TimeUnit.MILLISECONDS)) / 3600000D;
        return c.a(lengthunits).b() / d1;
    }

    public Duration c()
    {
        return e;
    }

    public Length d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public UUID e()
    {
        return b;
    }

    public Long f()
    {
        return a;
    }

    public String toString()
    {
        return String.format(Locale.US, "distance(%s)\nelevation(%s)\nspeed(%s mph)\npace(%s / m)\nmets(%s)", new Object[] {
            c, d, Double.valueOf(b(com.fitbit.data.domain.Length.LengthUnits.MILES)), a(com.fitbit.data.domain.Length.LengthUnits.METERS), Double.valueOf(b())
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(c, i);
        parcel.writeParcelable(d, i);
        parcel.writeParcelable(e, i);
        parcel.writeDouble(f);
        parcel.writeParcelable(new ParcelUuid(b), i);
        long al[];
        if (a == null)
        {
            al = new long[0];
        } else
        {
            al = new long[1];
            al[0] = a.longValue();
        }
        parcel.writeLongArray(al);
    }

}
