// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            RealTimeMessage

static final class I
    implements android.os.
{

    public RealTimeMessage bn(Parcel parcel)
    {
        return new RealTimeMessage(parcel, null);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bn(parcel);
    }

    public RealTimeMessage[] cz(int i)
    {
        return new RealTimeMessage[i];
    }

    public Object[] newArray(int i)
    {
        return cz(i);
    }

    I()
    {
    }
}
