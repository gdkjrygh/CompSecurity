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
import com.google.android.gms.internal.hk;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            ExtendedGame, GameBadge, GameBadgeEntity, ExtendedGameEntityCreator, 
//            GameBadgeEntityCreator

public final class ExtendedGameEntity extends GamesDowngradeableSafeParcel
    implements ExtendedGame
{
    static final class ExtendedGameEntityCreatorCompat extends ExtendedGameEntityCreator
    {

        public ExtendedGameEntity bg(Parcel parcel)
        {
            if (ExtendedGameEntity.b(ExtendedGameEntity.gR()) || ExtendedGameEntity.aQ(com/google/android/gms/games/internal/game/ExtendedGameEntity.getCanonicalName()))
            {
                return super.bg(parcel);
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
                arraylist.add(GameBadgeEntity.CREATOR.bh(parcel));
            }

            return new ExtendedGameEntity(2, gameentity, j, flag, k, l1, l2, s, l3, s1, arraylist, null);
        }

        public Object createFromParcel(Parcel parcel)
        {
            return bg(parcel);
        }

        ExtendedGameEntityCreatorCompat()
        {
        }
    }


    public static final ExtendedGameEntityCreator CREATOR = new ExtendedGameEntityCreatorCompat();
    private final long RA;
    private final String RB;
    private final ArrayList RC;
    private final SnapshotMetadataEntity RD;
    private final GameEntity Rt;
    private final int Ru;
    private final boolean Rv;
    private final int Rw;
    private final long Rx;
    private final long Ry;
    private final String Rz;
    private final int xM;

    ExtendedGameEntity(int i, GameEntity gameentity, int j, boolean flag, int k, long l, 
            long l1, String s, long l2, String s1, ArrayList arraylist, 
            SnapshotMetadataEntity snapshotmetadataentity)
    {
        xM = i;
        Rt = gameentity;
        Ru = j;
        Rv = flag;
        Rw = k;
        Rx = l;
        Ry = l1;
        Rz = s;
        RA = l2;
        RB = s1;
        RC = arraylist;
        RD = snapshotmetadataentity;
    }

    public ExtendedGameEntity(ExtendedGame extendedgame)
    {
        Object obj1 = null;
        super();
        xM = 2;
        Object obj = extendedgame.getGame();
        int j;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = new GameEntity(((Game) (obj)));
        }
        Rt = ((GameEntity) (obj));
        Ru = extendedgame.hR();
        Rv = extendedgame.hS();
        Rw = extendedgame.hT();
        Rx = extendedgame.hU();
        Ry = extendedgame.hV();
        Rz = extendedgame.hW();
        RA = extendedgame.hX();
        RB = extendedgame.hY();
        obj = extendedgame.hZ();
        if (obj == null)
        {
            obj = obj1;
        } else
        {
            obj = new SnapshotMetadataEntity(((SnapshotMetadata) (obj)));
        }
        RD = ((SnapshotMetadataEntity) (obj));
        extendedgame = extendedgame.hQ();
        j = extendedgame.size();
        RC = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            RC.add((GameBadgeEntity)((GameBadge)extendedgame.get(i)).freeze());
        }

    }

    static int a(ExtendedGame extendedgame)
    {
        return hk.hashCode(new Object[] {
            extendedgame.getGame(), Integer.valueOf(extendedgame.hR()), Boolean.valueOf(extendedgame.hS()), Integer.valueOf(extendedgame.hT()), Long.valueOf(extendedgame.hU()), Long.valueOf(extendedgame.hV()), extendedgame.hW(), Long.valueOf(extendedgame.hX()), extendedgame.hY()
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
        if (!hk.equal(((ExtendedGame) (obj)).getGame(), extendedgame.getGame()) || !hk.equal(Integer.valueOf(((ExtendedGame) (obj)).hR()), Integer.valueOf(extendedgame.hR())) || !hk.equal(Boolean.valueOf(((ExtendedGame) (obj)).hS()), Boolean.valueOf(extendedgame.hS())) || !hk.equal(Integer.valueOf(((ExtendedGame) (obj)).hT()), Integer.valueOf(extendedgame.hT())) || !hk.equal(Long.valueOf(((ExtendedGame) (obj)).hU()), Long.valueOf(extendedgame.hU())) || !hk.equal(Long.valueOf(((ExtendedGame) (obj)).hV()), Long.valueOf(extendedgame.hV())) || !hk.equal(((ExtendedGame) (obj)).hW(), extendedgame.hW()) || !hk.equal(Long.valueOf(((ExtendedGame) (obj)).hX()), Long.valueOf(extendedgame.hX())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hk.equal(((ExtendedGame) (obj)).hY(), extendedgame.hY())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static boolean aQ(String s)
    {
        return aA(s);
    }

    static String b(ExtendedGame extendedgame)
    {
        return hk.e(extendedgame).a("Game", extendedgame.getGame()).a("Availability", Integer.valueOf(extendedgame.hR())).a("Owned", Boolean.valueOf(extendedgame.hS())).a("AchievementUnlockedCount", Integer.valueOf(extendedgame.hT())).a("LastPlayedServerTimestamp", Long.valueOf(extendedgame.hU())).a("PriceMicros", Long.valueOf(extendedgame.hV())).a("FormattedPrice", extendedgame.hW()).a("FullPriceMicros", Long.valueOf(extendedgame.hX())).a("FormattedFullPrice", extendedgame.hY()).a("Snapshot", extendedgame.hZ()).toString();
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
        return ib();
    }

    public Game getGame()
    {
        return ia();
    }

    public int getVersionCode()
    {
        return xM;
    }

    public ArrayList hQ()
    {
        return new ArrayList(RC);
    }

    public int hR()
    {
        return Ru;
    }

    public boolean hS()
    {
        return Rv;
    }

    public int hT()
    {
        return Rw;
    }

    public long hU()
    {
        return Rx;
    }

    public long hV()
    {
        return Ry;
    }

    public String hW()
    {
        return Rz;
    }

    public long hX()
    {
        return RA;
    }

    public String hY()
    {
        return RB;
    }

    public SnapshotMetadata hZ()
    {
        return RD;
    }

    public int hashCode()
    {
        return a(this);
    }

    public GameEntity ia()
    {
        return Rt;
    }

    public ExtendedGame ib()
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
        boolean flag = false;
        if (!fr())
        {
            ExtendedGameEntityCreator.a(this, parcel, i);
        } else
        {
            Rt.writeToParcel(parcel, i);
            parcel.writeInt(Ru);
            int j;
            int k;
            if (Rv)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            parcel.writeInt(j);
            parcel.writeInt(Rw);
            parcel.writeLong(Rx);
            parcel.writeLong(Ry);
            parcel.writeString(Rz);
            parcel.writeLong(RA);
            parcel.writeString(RB);
            k = RC.size();
            parcel.writeInt(k);
            j = ((flag) ? 1 : 0);
            while (j < k) 
            {
                ((GameBadgeEntity)RC.get(j)).writeToParcel(parcel, i);
                j++;
            }
        }
    }

}
