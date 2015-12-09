// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.model;

import android.os.Parcel;

// Referenced classes of package com.dominos.beacon.model:
//            GeofenceData

final class 
    implements android.os.tor
{

    public final GeofenceData createFromParcel(Parcel parcel)
    {
        return new GeofenceData(parcel);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final GeofenceData[] newArray(int i)
    {
        return new GeofenceData[i];
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
