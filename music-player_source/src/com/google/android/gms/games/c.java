// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.games:
//            f, PlayerEntity

final class c extends f
{

    c()
    {
    }

    public final PlayerEntity a(Parcel parcel)
    {
        if (PlayerEntity.a(PlayerEntity.l()) || PlayerEntity.a(com/google/android/gms/games/PlayerEntity.getCanonicalName()))
        {
            return super.a(parcel);
        }
        String s = parcel.readString();
        String s1 = parcel.readString();
        Object obj = parcel.readString();
        Object obj1 = parcel.readString();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = Uri.parse(((String) (obj)));
        }
        if (obj1 == null)
        {
            obj1 = null;
        } else
        {
            obj1 = Uri.parse(((String) (obj1)));
        }
        return new PlayerEntity(4, s, s1, ((Uri) (obj)), ((Uri) (obj1)), parcel.readLong(), -1, -1L, null, null);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }
}
