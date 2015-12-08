// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import android.os.Parcel;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
import com.google.android.gms.internal.jv;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            ExtendedGame, GameBadge, GameBadgeEntity, ExtendedGameEntityCreator, 
//            GameBadgeEntityCreator

public final class ExtendedGameEntity extends GamesDowngradeableSafeParcel
    implements ExtendedGame
{
    static final class ExtendedGameEntityCreatorCompat extends ExtendedGameEntityCreator
    {

        public Object createFromParcel(Parcel parcel)
        {
            return cu(parcel);
        }

        public ExtendedGameEntity cu(Parcel parcel)
        {
            if (ExtendedGameEntity.b(ExtendedGameEntity.kD()) || ExtendedGameEntity.bz(com/google/android/gms/games/internal/game/ExtendedGameEntity.getCanonicalName()))
            {
                return super.cu(parcel);
            }
            GameEntity gameentity = (GameEntity)GameEntity.CREATOR.createFromParcel(parcel);
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
                arraylist.add(GameBadgeEntity.CREATOR.cv(parcel));
            }

            return new ExtendedGameEntity(2, gameentity, j, flag, k, l1, l2, s, l3, s1, arraylist, null);
        }

        ExtendedGameEntityCreatorCompat()
        {
        }
    }


    public static final ExtendedGameEntityCreator CREATOR = new ExtendedGameEntityCreatorCompat();
    private final int CK;
    private final String acA;
    private final ArrayList acB;
    private final SnapshotMetadataEntity acC;
    private final GameEntity acs;
    private final int act;
    private final boolean acu;
    private final int acv;
    private final long acw;
    private final long acx;
    private final String acy;
    private final long acz;

    ExtendedGameEntity(int i, GameEntity gameentity, int j, boolean flag, int k, long l, 
            long l1, String s, long l2, String s1, ArrayList arraylist, 
            SnapshotMetadataEntity snapshotmetadataentity)
    {
        CK = i;
        acs = gameentity;
        act = j;
        acu = flag;
        acv = k;
        acw = l;
        acx = l1;
        acy = s;
        acz = l2;
        acA = s1;
        acB = arraylist;
        acC = snapshotmetadataentity;
    }

    public ExtendedGameEntity(ExtendedGame extendedgame)
    {
        Object obj1 = null;
        super();
        CK = 2;
        Object obj = extendedgame.getGame();
        int j;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = new GameEntity(((Game) (obj)));
        }
        acs = ((GameEntity) (obj));
        act = extendedgame.lZ();
        acu = extendedgame.ma();
        acv = extendedgame.mb();
        acw = extendedgame.mc();
        acx = extendedgame.md();
        acy = extendedgame.me();
        acz = extendedgame.mf();
        acA = extendedgame.mg();
        obj = extendedgame.mh();
        if (obj == null)
        {
            obj = obj1;
        } else
        {
            obj = new SnapshotMetadataEntity(((SnapshotMetadata) (obj)));
        }
        acC = ((SnapshotMetadataEntity) (obj));
        extendedgame = extendedgame.lY();
        j = extendedgame.size();
        acB = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            acB.add((GameBadgeEntity)((GameBadge)extendedgame.get(i)).freeze());
        }

    }

    static int a(ExtendedGame extendedgame)
    {
        return jv.hashCode(new Object[] {
            extendedgame.getGame(), Integer.valueOf(extendedgame.lZ()), Boolean.valueOf(extendedgame.ma()), Integer.valueOf(extendedgame.mb()), Long.valueOf(extendedgame.mc()), Long.valueOf(extendedgame.md()), extendedgame.me(), Long.valueOf(extendedgame.mf()), extendedgame.mg()
        });
    }

    static boolean a(ExtendedGame extendedgame, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof ExtendedGame) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (extendedgame == obj) goto _L4; else goto _L3
_L3:
        obj = (ExtendedGame)obj;
        if (!jv.equal(((ExtendedGame) (obj)).getGame(), extendedgame.getGame()) || !jv.equal(Integer.valueOf(((ExtendedGame) (obj)).lZ()), Integer.valueOf(extendedgame.lZ())) || !jv.equal(Boolean.valueOf(((ExtendedGame) (obj)).ma()), Boolean.valueOf(extendedgame.ma())) || !jv.equal(Integer.valueOf(((ExtendedGame) (obj)).mb()), Integer.valueOf(extendedgame.mb())) || !jv.equal(Long.valueOf(((ExtendedGame) (obj)).mc()), Long.valueOf(extendedgame.mc())) || !jv.equal(Long.valueOf(((ExtendedGame) (obj)).md()), Long.valueOf(extendedgame.md())) || !jv.equal(((ExtendedGame) (obj)).me(), extendedgame.me()) || !jv.equal(Long.valueOf(((ExtendedGame) (obj)).mf()), Long.valueOf(extendedgame.mf())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (jv.equal(((ExtendedGame) (obj)).mg(), extendedgame.mg())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(ExtendedGame extendedgame)
    {
        return jv.h(extendedgame).a("Game", extendedgame.getGame()).a("Availability", Integer.valueOf(extendedgame.lZ())).a("Owned", Boolean.valueOf(extendedgame.ma())).a("AchievementUnlockedCount", Integer.valueOf(extendedgame.mb())).a("LastPlayedServerTimestamp", Long.valueOf(extendedgame.mc())).a("PriceMicros", Long.valueOf(extendedgame.md())).a("FormattedPrice", extendedgame.me()).a("FullPriceMicros", Long.valueOf(extendedgame.mf())).a("FormattedFullPrice", extendedgame.mg()).a("Snapshot", extendedgame.mh()).toString();
    }

    static boolean b(Integer integer)
    {
        return c(integer);
    }

    static boolean bz(String s)
    {
        return aW(s);
    }

    static Integer kD()
    {
        return ht();
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
        return mj();
    }

    public Game getGame()
    {
        return mi();
    }

    public int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return a(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public ArrayList lY()
    {
        return new ArrayList(acB);
    }

    public int lZ()
    {
        return act;
    }

    public boolean ma()
    {
        return acu;
    }

    public int mb()
    {
        return acv;
    }

    public long mc()
    {
        return acw;
    }

    public long md()
    {
        return acx;
    }

    public String me()
    {
        return acy;
    }

    public long mf()
    {
        return acz;
    }

    public String mg()
    {
        return acA;
    }

    public SnapshotMetadata mh()
    {
        return acC;
    }

    public GameEntity mi()
    {
        return acs;
    }

    public ExtendedGame mj()
    {
        return this;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = false;
        if (!hu())
        {
            ExtendedGameEntityCreator.a(this, parcel, i);
        } else
        {
            acs.writeToParcel(parcel, i);
            parcel.writeInt(act);
            int j;
            int k;
            if (acu)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            parcel.writeInt(j);
            parcel.writeInt(acv);
            parcel.writeLong(acw);
            parcel.writeLong(acx);
            parcel.writeString(acy);
            parcel.writeLong(acz);
            parcel.writeString(acA);
            k = acB.size();
            parcel.writeInt(k);
            j = ((flag) ? 1 : 0);
            while (j < k) 
            {
                ((GameBadgeEntity)acB.get(j)).writeToParcel(parcel, i);
                j++;
            }
        }
    }

}
