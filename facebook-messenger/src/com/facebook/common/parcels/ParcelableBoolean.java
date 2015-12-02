// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.parcels;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.common.parcels:
//            b

public class ParcelableBoolean
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    public final boolean a;

    public ParcelableBoolean(boolean flag)
    {
        a = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (a)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

}
