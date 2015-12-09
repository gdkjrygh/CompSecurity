// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public class t
{

    public static Enum a(Parcel parcel, Class class1)
    {
        parcel = parcel.readString();
        if ("".equals(parcel))
        {
            return null;
        } else
        {
            return Enum.valueOf(class1, parcel);
        }
    }

    public static String a(Parcel parcel)
    {
        if (parcel.readByte() == 1)
        {
            return parcel.readString();
        } else
        {
            return null;
        }
    }

    public static void a(Parcel parcel, Parcelable parcelable, int i)
    {
        int j;
        if (parcelable == null)
        {
            j = 0;
        } else
        {
            j = 1;
        }
        parcel.writeByte((byte)j);
        if (parcelable != null)
        {
            parcel.writeParcelable(parcelable, i);
        }
    }

    public static void a(Parcel parcel, CharSequence charsequence, int i)
    {
        int j;
        if (charsequence == null)
        {
            j = 0;
        } else
        {
            j = 1;
        }
        parcel.writeByte((byte)j);
        if (charsequence != null)
        {
            TextUtils.writeToParcel(charsequence, parcel, i);
        }
    }

    public static void a(Parcel parcel, Enum enum)
    {
        if (enum == null)
        {
            parcel.writeString("");
            return;
        } else
        {
            parcel.writeString(enum.name());
            return;
        }
    }

    public static void a(Parcel parcel, String s)
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

    public static void a(Parcel parcel, boolean flag)
    {
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
    }

    public static CharSequence b(Parcel parcel)
    {
        if (parcel.readByte() == 1)
        {
            return (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        } else
        {
            return null;
        }
    }

    public static Parcelable c(Parcel parcel)
    {
        Parcelable parcelable = null;
        if (parcel.readByte() == 1)
        {
            parcelable = parcel.readParcelable(null);
        }
        return parcelable;
    }

    public static boolean d(Parcel parcel)
    {
        return parcel.readByte() == 1;
    }
}
