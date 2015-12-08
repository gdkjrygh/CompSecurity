// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import android.os.Parcel;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            ExtendedGameEntityCreator, ExtendedGameEntity, GameBadgeEntity, GameBadgeEntityCreator

static final class  extends ExtendedGameEntityCreator
{

    public ExtendedGameEntity aq(Parcel parcel)
    {
        if (ExtendedGameEntity.b(ExtendedGameEntity.gg()) || ExtendedGameEntity.az(com/google/android/gms/games/internal/game/ExtendedGameEntity.getCanonicalName()))
        {
            return super.aq(parcel);
        }
        GameEntity gameentity = (GameEntity)GameEntity.CREATOR.aq(parcel);
        int j = parcel.readInt();
        String s;
        String s1;
        ArrayList arraylist;
        int k;
        int l;
        long l1;
        long l2;
        long l3;
        boolean flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = parcel.readInt();
        l1 = parcel.readLong();
        l2 = parcel.readLong();
        s = parcel.readString();
        l3 = parcel.readLong();
        s1 = parcel.readString();
        l = parcel.readInt();
        arraylist = new ArrayList(l);
        for (int i = 0; i < l; i++)
        {
            arraylist.add(GameBadgeEntity.CREATOR.ar(parcel));
        }

        return new ExtendedGameEntity(1, gameentity, j, flag, k, l1, l2, s, l3, s1, arraylist);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return aq(parcel);
    }

    ()
    {
    }
}
