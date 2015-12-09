// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;

import android.os.Parcel;

// Referenced classes of package com.fitbit.bluetooth:
//            AirlinkSession

static final class ges.BootMode
    implements android.os.r
{

    public AirlinkSession a(Parcel parcel)
    {
        return new AirlinkSession(com.fitbit.galileo.ota.s.BootMode.values()[parcel.readInt()], parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    public AirlinkSession[] a(int i)
    {
        return new AirlinkSession[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    ges.BootMode()
    {
    }
}
