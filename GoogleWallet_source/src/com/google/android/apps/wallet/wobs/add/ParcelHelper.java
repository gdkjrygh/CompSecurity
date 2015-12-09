// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import android.os.Parcel;

public final class ParcelHelper
{

    public static Enum readEnum(Parcel parcel, Class class1)
    {
        return Enum.valueOf(class1, parcel.readString());
    }

    public static Boolean readNullableBoolean(Parcel parcel)
    {
        boolean flag = true;
        if (parcel.readByte() == 1)
        {
            if (parcel.readInt() != 1)
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        } else
        {
            return null;
        }
    }

    public static Integer readNullableInteger(Parcel parcel)
    {
        if (parcel.readByte() == 1)
        {
            return Integer.valueOf(parcel.readInt());
        } else
        {
            return null;
        }
    }

    public static String readNullableString(Parcel parcel)
    {
        if (parcel.readByte() == 1)
        {
            return parcel.readString();
        } else
        {
            return null;
        }
    }

    public static void writeEnum(Parcel parcel, Enum enum)
    {
        parcel.writeString(enum.name());
    }

    public static void writeNullableBoolean(Parcel parcel, Boolean boolean1)
    {
        boolean flag = true;
        int i;
        if (boolean1 == null)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        parcel.writeByte((byte)i);
        if (boolean1 != null)
        {
            if (boolean1.booleanValue())
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
        }
    }

    public static void writeNullableInteger(Parcel parcel, Integer integer)
    {
        int i;
        if (integer == null)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        parcel.writeByte((byte)i);
        if (integer != null)
        {
            parcel.writeInt(integer.intValue());
        }
    }

    public static void writeNullableString(Parcel parcel, String s)
    {
        int i;
        if (s == null)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        parcel.writeByte((byte)i);
        if (s != null)
        {
            parcel.writeString(s);
        }
    }
}
