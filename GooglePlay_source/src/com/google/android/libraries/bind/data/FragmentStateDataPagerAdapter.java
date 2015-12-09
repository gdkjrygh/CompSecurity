// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.bind.util.ParcelUtil;
import com.google.android.libraries.bind.util.Util;

// Referenced classes of package com.google.android.libraries.bind.data:
//            FragmentDataPagerAdapter

public abstract class FragmentStateDataPagerAdapter extends FragmentDataPagerAdapter
{
    static class FragmentAdapterState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return new FragmentAdapterState(ParcelUtil.readObjectFromParcel(parcel, com/google/android/libraries/bind/data/FragmentStateDataPagerAdapter$FragmentAdapterState.getClassLoader()), (android.support.v4.app.Fragment.SavedState)parcel.readParcelable(com/google/android/libraries/bind/data/FragmentStateDataPagerAdapter$FragmentAdapterState.getClassLoader()));
            }

            public final volatile Object[] newArray(int i)
            {
                return new FragmentAdapterState[i];
            }

        };
        public final Object key;
        public final android.support.v4.app.Fragment.SavedState state;

        public int describeContents()
        {
            return 0;
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof FragmentAdapterState)
            {
                obj = (FragmentAdapterState)obj;
                flag = flag1;
                if (Util.objectsEqual(key, ((FragmentAdapterState) (obj)).key))
                {
                    flag = flag1;
                    if (Util.objectsEqual(state, ((FragmentAdapterState) (obj)).state))
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return Util.hashCode(new Object[] {
                key, state
            });
        }

        public String toString()
        {
            return String.format("key: %s, fragmentState: %s", new Object[] {
                key, state
            });
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            ParcelUtil.writeObjectToParcel(key, parcel, i);
            parcel.writeParcelable(state, i);
        }


        public FragmentAdapterState(Object obj, android.support.v4.app.Fragment.SavedState savedstate)
        {
            key = obj;
            state = savedstate;
        }
    }

}
