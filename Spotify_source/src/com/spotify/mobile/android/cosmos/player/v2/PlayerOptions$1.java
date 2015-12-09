// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcel;

// Referenced classes of package com.spotify.mobile.android.cosmos.player.v2:
//            PlayerOptions

final class A
    implements android.os.or
{

    public final PlayerOptions createFromParcel(Parcel parcel)
    {
        return new PlayerOptions(parcel);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final PlayerOptions[] newArray(int i)
    {
        return new PlayerOptions[i];
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    A()
    {
    }
}
