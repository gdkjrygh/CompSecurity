// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.challenges;

import android.os.Parcel;
import java.util.Date;

public class g
{

    public g()
    {
    }

    static final Enum a(Parcel parcel, Class class1)
    {
        int i = parcel.readInt();
        if (i == -1)
        {
            return null;
        } else
        {
            return ((Enum[])class1.getEnumConstants())[i];
        }
    }

    static Date a(Parcel parcel)
    {
        long l = parcel.readLong();
        if (l < 0L)
        {
            return null;
        } else
        {
            return new Date(l);
        }
    }

    static final void a(Parcel parcel, Boolean boolean1)
    {
        byte byte0;
        if (boolean1 == null)
        {
            byte0 = -1;
        } else
        if (boolean1.booleanValue())
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeInt(byte0);
    }

    static final void a(Parcel parcel, Enum enum)
    {
        int i;
        if (enum != null)
        {
            i = enum.ordinal();
        } else
        {
            i = -1;
        }
        parcel.writeInt(i);
    }

    static final void a(Parcel parcel, Integer integer)
    {
        int j = 0;
        int i;
        if (integer != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (integer != null)
        {
            j = integer.intValue();
        }
        parcel.writeIntArray(new int[] {
            i, j
        });
    }

    static final void a(Parcel parcel, Date date)
    {
        long l;
        if (date == null)
        {
            l = -1L;
        } else
        {
            l = date.getTime();
        }
        parcel.writeLong(l);
    }

    static final Integer b(Parcel parcel)
    {
        parcel = parcel.createIntArray();
        if (parcel[0] == 1)
        {
            return Integer.valueOf(parcel[1]);
        } else
        {
            return null;
        }
    }

    static Boolean c(Parcel parcel)
    {
        boolean flag = true;
        int i = parcel.readInt();
        if (i == -1)
        {
            return null;
        }
        if (i != 1)
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }
}
