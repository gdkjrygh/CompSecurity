// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.bind.util.ParcelUtil;
import com.google.android.libraries.bind.util.Util;

public class FragmentAdapterKey
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return new FragmentAdapterKey(ParcelUtil.readObjectFromParcel(parcel, com/google/android/libraries/bind/data/FragmentAdapterKey.getClassLoader()));
        }

        public final volatile Object[] newArray(int i)
        {
            return new FragmentAdapterKey[i];
        }

    };
    public final Object key;

    public FragmentAdapterKey(Object obj)
    {
        key = obj;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof FragmentAdapterKey)
        {
            obj = (FragmentAdapterKey)obj;
            return Util.objectsEqual(key, ((FragmentAdapterKey) (obj)).key);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return key.hashCode();
    }

    public String toString()
    {
        return String.format("key: %s", new Object[] {
            key
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ParcelUtil.writeObjectToParcel(key, parcel, i);
    }

}
