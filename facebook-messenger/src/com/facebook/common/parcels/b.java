// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.parcels;

import android.os.Parcel;

// Referenced classes of package com.facebook.common.parcels:
//            ParcelableBoolean

final class b
    implements android.os.Parcelable.Creator
{

    b()
    {
    }

    public ParcelableBoolean a(Parcel parcel)
    {
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new ParcelableBoolean(flag);
    }

    public ParcelableBoolean[] a(int i)
    {
        return new ParcelableBoolean[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
