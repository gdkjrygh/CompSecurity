// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.gcm:
//            PeriodicTask

static final class 
    implements android.os.tor
{

    private static PeriodicTask eZ(Parcel parcel)
    {
        return new PeriodicTask(parcel, null);
    }

    private static PeriodicTask[] hh(int i)
    {
        return new PeriodicTask[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return eZ(parcel);
    }

    public final Object[] newArray(int i)
    {
        return hh(i);
    }

    ()
    {
    }
}
