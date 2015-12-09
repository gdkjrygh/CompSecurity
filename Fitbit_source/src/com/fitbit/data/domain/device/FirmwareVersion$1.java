// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.device;

import android.os.Parcel;

// Referenced classes of package com.fitbit.data.domain.device:
//            FirmwareVersion

static final class 
    implements android.os.
{

    public FirmwareVersion a(Parcel parcel)
    {
        return new FirmwareVersion(parcel.createIntArray());
    }

    public FirmwareVersion[] a(int i)
    {
        return new FirmwareVersion[i];
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
