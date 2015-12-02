// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.location;

import android.os.Parcel;

// Referenced classes of package com.facebook.location:
//            Coordinates

final class a
    implements android.os.Parcelable.Creator
{

    a()
    {
    }

    public Coordinates a(Parcel parcel)
    {
        return new Coordinates(parcel, null);
    }

    public Coordinates[] a(int i)
    {
        return new Coordinates[i];
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
