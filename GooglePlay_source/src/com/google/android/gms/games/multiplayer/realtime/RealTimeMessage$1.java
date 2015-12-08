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

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return new RealTimeMessage(parcel, (byte)0);
    }

    public final volatile Object[] newArray(int i)
    {
        return new RealTimeMessage[i];
    }

    I()
    {
    }
}
