// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.picking;

import android.os.Parcel;

// Referenced classes of package com.facebook.orca.photos.picking:
//            PickMediaParams

final class j
    implements android.os.Parcelable.Creator
{

    j()
    {
    }

    public PickMediaParams a(Parcel parcel)
    {
        return new PickMediaParams(parcel, null);
    }

    public PickMediaParams[] a(int i)
    {
        return new PickMediaParams[i];
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
