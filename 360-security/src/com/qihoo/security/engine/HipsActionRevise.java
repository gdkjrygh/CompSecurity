// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine;

import android.os.Parcel;
import android.os.Parcelable;

public class HipsActionRevise
    implements Parcelable
{

    public static final int ACTION_READ_CONTACT_LIST = 0;
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public HipsActionRevise a(Parcel parcel)
        {
            return new HipsActionRevise(parcel);
        }

        public HipsActionRevise[] a(int i)
        {
            return new HipsActionRevise[i];
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
    public static final int LEVEL_SUGGEST_CLOSE = 2;
    public static final int LEVEL_SUGGEST_OPEN = 1;
    public static final int PRIVILEDEG_AUTO_START = 0;
    public String description;
    public int level;
    public int value;

    public HipsActionRevise()
    {
        value = 0;
        level = 0;
        description = null;
    }

    HipsActionRevise(Parcel parcel)
    {
        value = parcel.readInt();
        level = parcel.readInt();
        description = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return String.format("value:%d level:%d desc:%s", new Object[] {
            Integer.valueOf(value), Integer.valueOf(level), description
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(value);
        parcel.writeInt(level);
        parcel.writeString(description);
    }

}
