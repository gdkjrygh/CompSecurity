// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import android.os.Parcel;

// Referenced classes of package com.fitbit.data.domain:
//            WaterLogEntry

static final class 
    implements android.os.or
{

    public WaterLogEntry a(Parcel parcel)
    {
        return new WaterLogEntry(parcel, null);
    }

    public WaterLogEntry[] a(int i)
    {
        return new WaterLogEntry[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    ()
    {
    }
}
