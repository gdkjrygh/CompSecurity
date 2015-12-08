// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.games:
//            c, PlayerEntity

static final class  extends c
{

    public Object createFromParcel(Parcel parcel)
    {
        return u(parcel);
    }

    public PlayerEntity u(Parcel parcel)
    {
        Uri uri = null;
        if (PlayerEntity.b(PlayerEntity.bQ()) || PlayerEntity.J(com/google/android/gms/games/PlayerEntity.getCanonicalName()))
        {
            return super.u(parcel);
        }
        String s = parcel.readString();
        String s1 = parcel.readString();
        Object obj = parcel.readString();
        String s2 = parcel.readString();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = Uri.parse(((String) (obj)));
        }
        if (s2 != null)
        {
            uri = Uri.parse(s2);
        }
        return new PlayerEntity(1, s, s1, ((Uri) (obj)), uri, parcel.readLong());
    }

    ()
    {
    }
}
