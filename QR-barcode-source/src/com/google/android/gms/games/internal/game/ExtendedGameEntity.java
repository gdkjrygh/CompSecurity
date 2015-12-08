// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            ExtendedGame, GameBadge, GameBadgeEntity, ExtendedGameEntityCreator, 
//            GameBadgeEntityCreator

public final class ExtendedGameEntity extends GamesDowngradeableSafeParcel
    implements ExtendedGame
{
    static final class ExtendedGameEntityCreatorCompat extends ExtendedGameEntityCreator
    {

        public ExtendedGameEntity cg(Parcel parcel)
        {
            if (ExtendedGameEntity.b(ExtendedGameEntity.jT()) || ExtendedGameEntity.bw(com/google/android/gms/games/internal/game/ExtendedGameEntity.getCanonicalName()))
            {
                return super.cg(parcel);
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
                arraylist.add(GameBadgeEntity.CREATOR.ch(parcel));
            }

            return new ExtendedGameEntity(2, gameentity, j, flag, k, l1, l2, s, l3, s1, arraylist, null);
        }

        public Object createFromParcel(Parcel parcel)
        {
            return cg(parcel);
        }

        ExtendedGameEntityCreatorCompat()
        {
        }
    }


    public static final ExtendedGameEntityCreator CREATOR = new ExtendedGameEntityCreatorCompat();
    private final int BR;
    private final boolean aaA;
    private final int aaB;
    private final long aaC;
    private final long aaD;
    private final String aaE;
    private final long aaF;
    private final String aaG;
    private final ArrayList aaH;
    private final SnapshotMetadataEntity aaI;
    private final GameEntity aay;
    private final int aaz;

    ExtendedGameEntity(int i, GameEntity gameentity, int j, boolean flag, int k, long l, 
            long l1, String s, long l2, String s1, ArrayList arraylist, 
            SnapshotMetadataEntity snapshotmetadataentity)
    {
        BR = i;
        aay = gameentity;
        aaz = j;
        aaA = flag;
        aaB = k;
        aaC = l;
        aaD = l1;
        aaE = s;
        aaF = l2;
        aaG = s1;
        aaH = arraylist;
        aaI = snapshotmetadataentity;
    }

    public ExtendedGameEntity(ExtendedGame extendedgame)
    {
        Object obj1 = null;
        super();
        BR = 2;
        Object obj = extendedgame.getGame();
        int j;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = new GameEntity(((Game) (obj)));
        }
        aay = ((GameEntity) (obj));
        aaz = extendedgame.kS();
        aaA = extendedgame.kT();
        aaB = extendedgame.kU();
        aaC = extendedgame.kV();
        aaD = extendedgame.kW();
        aaE = extendedgame.kX();
        aaF = extendedgame.kY();
        aaG = extendedgame.kZ();
        obj = extendedgame.la();
        if (obj == null)
        {
            obj = obj1;
        } else
        {
            obj = new SnapshotMetadataEntity(((SnapshotMetadata) (obj)));
        }
        aaI = ((SnapshotMetadataEntity) (obj));
        extendedgame = extendedgame.kR();
        j = extendedgame.size();
        aaH = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            aaH.add((GameBadgeEntity)((GameBadge)extendedgame.get(i)).freeze());
        }

    }

    static int a(ExtendedGame extendedgame)
    {
        return n.hashCode(new Object[] {
            extendedgame.getGame(), Integer.valueOf(extendedgame.kS()), Boolean.valueOf(extendedgame.kT()), Integer.valueOf(extendedgame.kU()), Long.valueOf(extendedgame.kV()), Long.valueOf(extendedgame.kW()), extendedgame.kX(), Long.valueOf(extendedgame.kY()), extendedgame.kZ()
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
        if (!n.equal(((ExtendedGame) (obj)).getGame(), extendedgame.getGame()) || !n.equal(Integer.valueOf(((ExtendedGame) (obj)).kS()), Integer.valueOf(extendedgame.kS())) || !n.equal(Boolean.valueOf(((ExtendedGame) (obj)).kT()), Boolean.valueOf(extendedgame.kT())) || !n.equal(Integer.valueOf(((ExtendedGame) (obj)).kU()), Integer.valueOf(extendedgame.kU())) || !n.equal(Long.valueOf(((ExtendedGame) (obj)).kV()), Long.valueOf(extendedgame.kV())) || !n.equal(Long.valueOf(((ExtendedGame) (obj)).kW()), Long.valueOf(extendedgame.kW())) || !n.equal(((ExtendedGame) (obj)).kX(), extendedgame.kX()) || !n.equal(Long.valueOf(((ExtendedGame) (obj)).kY()), Long.valueOf(extendedgame.kY())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (n.equal(((ExtendedGame) (obj)).kZ(), extendedgame.kZ())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(ExtendedGame extendedgame)
    {
        return n.h(extendedgame).a("Game", extendedgame.getGame()).a("Availability", Integer.valueOf(extendedgame.kS())).a("Owned", Boolean.valueOf(extendedgame.kT())).a("AchievementUnlockedCount", Integer.valueOf(extendedgame.kU())).a("LastPlayedServerTimestamp", Long.valueOf(extendedgame.kV())).a("PriceMicros", Long.valueOf(extendedgame.kW())).a("FormattedPrice", extendedgame.kX()).a("FullPriceMicros", Long.valueOf(extendedgame.kY())).a("FormattedFullPrice", extendedgame.kZ()).a("Snapshot", extendedgame.la()).toString();
    }

    static boolean b(Integer integer)
    {
        return c(integer);
    }

    static boolean bw(String s)
    {
        return aV(s);
    }

    static Integer jT()
    {
        return gP();
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
        return lc();
    }

    public Game getGame()
    {
        return lb();
    }

    public int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return a(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public ArrayList kR()
    {
        return new ArrayList(aaH);
    }

    public int kS()
    {
        return aaz;
    }

    public boolean kT()
    {
        return aaA;
    }

    public int kU()
    {
        return aaB;
    }

    public long kV()
    {
        return aaC;
    }

    public long kW()
    {
        return aaD;
    }

    public String kX()
    {
        return aaE;
    }

    public long kY()
    {
        return aaF;
    }

    public String kZ()
    {
        return aaG;
    }

    public SnapshotMetadata la()
    {
        return aaI;
    }

    public GameEntity lb()
    {
        return aay;
    }

    public ExtendedGame lc()
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
        if (!gQ())
        {
            ExtendedGameEntityCreator.a(this, parcel, i);
        } else
        {
            aay.writeToParcel(parcel, i);
            parcel.writeInt(aaz);
            int j;
            int k;
            if (aaA)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            parcel.writeInt(j);
            parcel.writeInt(aaB);
            parcel.writeLong(aaC);
            parcel.writeLong(aaD);
            parcel.writeString(aaE);
            parcel.writeLong(aaF);
            parcel.writeString(aaG);
            k = aaH.size();
            parcel.writeInt(k);
            j = ((flag) ? 1 : 0);
            while (j < k) 
            {
                ((GameBadgeEntity)aaH.get(j)).writeToParcel(parcel, i);
                j++;
            }
        }
    }

}
