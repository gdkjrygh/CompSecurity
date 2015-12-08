// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            GameBadgeEntityCreator, GameBadgeEntity

static final class  extends GameBadgeEntityCreator
{

    public Object createFromParcel(Parcel parcel)
    {
        return cv(parcel);
    }

    public GameBadgeEntity cv(Parcel parcel)
    {
        if (GameBadgeEntity.b(GameBadgeEntity.kD()) || GameBadgeEntity.bz(com/google/android/gms/games/internal/game/GameBadgeEntity.getCanonicalName()))
        {
            return super.cv(parcel);
        }
        int i = parcel.readInt();
        String s = parcel.readString();
        String s1 = parcel.readString();
        parcel = parcel.readString();
        if (parcel == null)
        {
            parcel = null;
        } else
        {
            parcel = Uri.parse(parcel);
        }
        return new GameBadgeEntity(1, i, s, s1, parcel);
    }

    ()
    {
    }
}
