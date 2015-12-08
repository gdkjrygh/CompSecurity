// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.gcm:
//            PeriodicTask

final class e
    implements android.os.Parcelable.Creator
{

    e()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new PeriodicTask(parcel, (byte)0);
    }

    public final Object[] newArray(int i)
    {
        return new PeriodicTask[i];
    }
}
