// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.util;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public final class ParcelUtil
{

    public static Object readObjectFromParcel(Parcel parcel, ClassLoader classloader)
    {
        boolean flag = true;
        if (parcel.readByte() != 1)
        {
            flag = false;
        }
        if (flag)
        {
            return parcel.readParcelable(classloader);
        } else
        {
            return parcel.readSerializable();
        }
    }

    public static void writeObjectToParcel(Object obj, Parcel parcel, int i)
    {
        boolean flag = obj instanceof Parcelable;
        int j;
        if (flag)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        parcel.writeByte((byte)j);
        if (flag)
        {
            parcel.writeParcelable((Parcelable)obj, i);
            return;
        } else
        {
            parcel.writeSerializable((Serializable)obj);
            return;
        }
    }
}
