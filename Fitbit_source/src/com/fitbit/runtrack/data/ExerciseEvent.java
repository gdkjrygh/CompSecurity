// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.data;

import android.location.Location;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import android.text.TextUtils;
import com.fitbit.data.domain.Entity;
import java.util.UUID;

public class ExerciseEvent extends Entity
    implements Parcelable
{
    public static final class Type extends Enum
    {

        public static final Type a;
        public static final Type b;
        private static final Type c[];
        public final String label;
        public final boolean recorded;

        public static Type a(String s)
        {
            Type atype[] = values();
            int j = atype.length;
            for (int i = 0; i < j; i++)
            {
                Type type1 = atype[i];
                if (TextUtils.equals(type1.label, s))
                {
                    return type1;
                }
            }

            return null;
        }

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/fitbit/runtrack/data/ExerciseEvent$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])c.clone();
        }

        static 
        {
            a = new Type("Virtual", 0, "virtual");
            b = new Type("Location", 1, "location", true);
            c = (new Type[] {
                a, b
            });
        }

        private Type(String s, int i, String s1)
        {
            this(s, i, s1, false);
        }

        private Type(String s, int i, String s1, boolean flag)
        {
            super(s, i);
            label = s1;
            recorded = flag;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ExerciseEvent a(Parcel parcel)
        {
            long l = parcel.readLong();
            Object obj = Type.values()[parcel.readInt()];
            Location location1 = (Location)parcel.readParcelable(android/location/Location.getClassLoader());
            obj = new ExerciseEvent(l, ((ParcelUuid)parcel.readParcelable(android/os/ParcelUuid.getClassLoader())).getUuid(), ((Type) (obj)), location1);
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

    };
    public final Location location;
    public final UUID sessionId;
    public final Type type;

    public ExerciseEvent(long l, UUID uuid, Type type1, Location location1)
    {
        sessionId = uuid;
        type = type1;
        location = location1;
        setEntityId(Long.valueOf(l));
    }

    public ExerciseEvent(UUID uuid, Type type1, Location location1)
    {
        sessionId = uuid;
        type = type1;
        location = location1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(getEntityId().longValue());
        parcel.writeInt(type.ordinal());
        parcel.writeParcelable(location, i);
        parcel.writeParcelable(new ParcelUuid(sessionId), i);
        writeEntityToParcel(parcel, i);
    }

}
