// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.games:
//            GameEntityCreator, GameEntity

static final class  extends GameEntityCreator
{

    public GameEntity bd(Parcel parcel)
    {
        if (GameEntity.b(GameEntity.gR()) || GameEntity.aQ(com/google/android/gms/games/GameEntity.getCanonicalName()))
        {
            return super.bd(parcel);
        }
        String s = parcel.readString();
        String s1 = parcel.readString();
        String s2 = parcel.readString();
        String s3 = parcel.readString();
        String s4 = parcel.readString();
        String s5 = parcel.readString();
        Object obj = parcel.readString();
        Object obj1;
        Object obj2;
        boolean flag;
        boolean flag1;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = Uri.parse(((String) (obj)));
        }
        obj1 = parcel.readString();
        if (obj1 == null)
        {
            obj1 = null;
        } else
        {
            obj1 = Uri.parse(((String) (obj1)));
        }
        obj2 = parcel.readString();
        if (obj2 == null)
        {
            obj2 = null;
        } else
        {
            obj2 = Uri.parse(((String) (obj2)));
        }
        if (parcel.readInt() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (parcel.readInt() > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        return new GameEntity(4, s, s1, s2, s3, s4, s5, ((Uri) (obj)), ((Uri) (obj1)), ((Uri) (obj2)), flag, flag1, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), false, false, null, null, null, false, false, false);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bd(parcel);
    }

    ()
    {
    }
}
