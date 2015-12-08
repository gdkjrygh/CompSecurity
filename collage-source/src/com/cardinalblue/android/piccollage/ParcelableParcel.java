// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableParcel
    implements Parcelable
{

    public static final android.os.Parcelable.ClassLoaderCreator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

        public ParcelableParcel a(Parcel parcel)
        {
            return new ParcelableParcel(parcel, null);
        }

        public ParcelableParcel a(Parcel parcel, ClassLoader classloader)
        {
            return new ParcelableParcel(parcel, classloader);
        }

        public ParcelableParcel[] a(int i)
        {
            return new ParcelableParcel[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object createFromParcel(Parcel parcel, ClassLoader classloader)
        {
            return a(parcel, classloader);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    final Parcel a;
    final ClassLoader b;

    public ParcelableParcel(Parcel parcel, ClassLoader classloader)
    {
        a = Parcel.obtain();
        b = classloader;
        int i = parcel.readInt();
        int j = parcel.dataPosition();
        a.appendFrom(parcel, parcel.dataPosition(), i);
        parcel.setDataPosition(i + j);
    }

    public ParcelableParcel(ClassLoader classloader)
    {
        a = Parcel.obtain();
        b = classloader;
    }

    public Parcel a()
    {
        a.setDataPosition(0);
        return a;
    }

    public ClassLoader b()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a.dataSize());
        parcel.appendFrom(a, 0, a.dataSize());
    }

}
