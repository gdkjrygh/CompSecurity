// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.hk;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            GameBadge, GameBadgeEntityCreator

public final class GameBadgeEntity extends GamesDowngradeableSafeParcel
    implements GameBadge
{
    static final class GameBadgeEntityCreatorCompat extends GameBadgeEntityCreator
    {

        public GameBadgeEntity bh(Parcel parcel)
        {
            if (GameBadgeEntity.b(GameBadgeEntity.gR()) || GameBadgeEntity.aQ(com/google/android/gms/games/internal/game/GameBadgeEntity.getCanonicalName()))
            {
                return super.bh(parcel);
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

        public Object createFromParcel(Parcel parcel)
        {
            return bh(parcel);
        }

        GameBadgeEntityCreatorCompat()
        {
        }
    }


    public static final GameBadgeEntityCreator CREATOR = new GameBadgeEntityCreatorCompat();
    private int AT;
    private String HY;
    private String Mp;
    private Uri Mr;
    private final int xM;

    GameBadgeEntity(int i, int j, String s, String s1, Uri uri)
    {
        xM = i;
        AT = j;
        HY = s;
        Mp = s1;
        Mr = uri;
    }

    public GameBadgeEntity(GameBadge gamebadge)
    {
        xM = 1;
        AT = gamebadge.getType();
        HY = gamebadge.getTitle();
        Mp = gamebadge.getDescription();
        Mr = gamebadge.getIconImageUri();
    }

    static int a(GameBadge gamebadge)
    {
        return hk.hashCode(new Object[] {
            Integer.valueOf(gamebadge.getType()), gamebadge.getTitle(), gamebadge.getDescription(), gamebadge.getIconImageUri()
        });
    }

    static boolean a(GameBadge gamebadge, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof GameBadge) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (gamebadge == obj) goto _L4; else goto _L3
_L3:
        obj = (GameBadge)obj;
        if (!hk.equal(Integer.valueOf(((GameBadge) (obj)).getType()), gamebadge.getTitle()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hk.equal(((GameBadge) (obj)).getDescription(), gamebadge.getIconImageUri())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static boolean aQ(String s)
    {
        return aA(s);
    }

    static String b(GameBadge gamebadge)
    {
        return hk.e(gamebadge).a("Type", Integer.valueOf(gamebadge.getType())).a("Title", gamebadge.getTitle()).a("Description", gamebadge.getDescription()).a("IconImageUri", gamebadge.getIconImageUri()).toString();
    }

    static boolean b(Integer integer)
    {
        return c(integer);
    }

    static Integer gR()
    {
        return fq();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public Object freeze()
    {
        return ic();
    }

    public String getDescription()
    {
        return Mp;
    }

    public Uri getIconImageUri()
    {
        return Mr;
    }

    public String getTitle()
    {
        return HY;
    }

    public int getType()
    {
        return AT;
    }

    public int getVersionCode()
    {
        return xM;
    }

    public int hashCode()
    {
        return a(this);
    }

    public GameBadge ic()
    {
        return this;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (!fr())
        {
            GameBadgeEntityCreator.a(this, parcel, i);
            return;
        }
        parcel.writeInt(AT);
        parcel.writeString(HY);
        parcel.writeString(Mp);
        String s;
        if (Mr == null)
        {
            s = null;
        } else
        {
            s = Mr.toString();
        }
        parcel.writeString(s);
    }

}
