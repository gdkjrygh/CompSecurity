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
import com.google.android.gms.internal.hl;
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
            if (ExtendedGameEntity.b(ExtendedGameEntity.gM()) || ExtendedGameEntity.aQ(com/google/android/gms/games/internal/game/ExtendedGameEntity.getCanonicalName()))
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
    private final SnapshotMetadataEntity RA;
    private final GameEntity Rq;
    private final int Rr;
    private final boolean Rs;
    private final int Rt;
    private final long Ru;
    private final long Rv;
    private final String Rw;
    private final long Rx;
    private final String Ry;
    private final ArrayList Rz;
    private final int xJ;

    ExtendedGameEntity(int i, GameEntity gameentity, int j, boolean flag, int k, long l, 
            long l1, String s, long l2, String s1, ArrayList arraylist, 
            SnapshotMetadataEntity snapshotmetadataentity)
    {
        xJ = i;
        Rq = gameentity;
        Rr = j;
        Rs = flag;
        Rt = k;
        Ru = l;
        Rv = l1;
        Rw = s;
        Rx = l2;
        Ry = s1;
        Rz = arraylist;
        RA = snapshotmetadataentity;
    }

    public ExtendedGameEntity(ExtendedGame extendedgame)
    {
        Object obj1 = null;
        super();
        xJ = 2;
        Object obj = extendedgame.getGame();
        int j;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = new GameEntity(((Game) (obj)));
        }
        Rq = ((GameEntity) (obj));
        Rr = extendedgame.hM();
        Rs = extendedgame.hN();
        Rt = extendedgame.hO();
        Ru = extendedgame.hP();
        Rv = extendedgame.hQ();
        Rw = extendedgame.hR();
        Rx = extendedgame.hS();
        Ry = extendedgame.hT();
        obj = extendedgame.hU();
        if (obj == null)
        {
            obj = obj1;
        } else
        {
            obj = new SnapshotMetadataEntity(((SnapshotMetadata) (obj)));
        }
        RA = ((SnapshotMetadataEntity) (obj));
        extendedgame = extendedgame.hL();
        j = extendedgame.size();
        Rz = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            Rz.add((GameBadgeEntity)((GameBadge)extendedgame.get(i)).freeze());
        }

    }

    static int a(ExtendedGame extendedgame)
    {
        return hl.hashCode(new Object[] {
            extendedgame.getGame(), Integer.valueOf(extendedgame.hM()), Boolean.valueOf(extendedgame.hN()), Integer.valueOf(extendedgame.hO()), Long.valueOf(extendedgame.hP()), Long.valueOf(extendedgame.hQ()), extendedgame.hR(), Long.valueOf(extendedgame.hS()), extendedgame.hT()
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
        if (!hl.equal(((ExtendedGame) (obj)).getGame(), extendedgame.getGame()) || !hl.equal(Integer.valueOf(((ExtendedGame) (obj)).hM()), Integer.valueOf(extendedgame.hM())) || !hl.equal(Boolean.valueOf(((ExtendedGame) (obj)).hN()), Boolean.valueOf(extendedgame.hN())) || !hl.equal(Integer.valueOf(((ExtendedGame) (obj)).hO()), Integer.valueOf(extendedgame.hO())) || !hl.equal(Long.valueOf(((ExtendedGame) (obj)).hP()), Long.valueOf(extendedgame.hP())) || !hl.equal(Long.valueOf(((ExtendedGame) (obj)).hQ()), Long.valueOf(extendedgame.hQ())) || !hl.equal(((ExtendedGame) (obj)).hR(), extendedgame.hR()) || !hl.equal(Long.valueOf(((ExtendedGame) (obj)).hS()), Long.valueOf(extendedgame.hS())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hl.equal(((ExtendedGame) (obj)).hT(), extendedgame.hT())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static boolean aQ(String s)
    {
        return aA(s);
    }

    static String b(ExtendedGame extendedgame)
    {
        return hl.e(extendedgame).a("Game", extendedgame.getGame()).a("Availability", Integer.valueOf(extendedgame.hM())).a("Owned", Boolean.valueOf(extendedgame.hN())).a("AchievementUnlockedCount", Integer.valueOf(extendedgame.hO())).a("LastPlayedServerTimestamp", Long.valueOf(extendedgame.hP())).a("PriceMicros", Long.valueOf(extendedgame.hQ())).a("FormattedPrice", extendedgame.hR()).a("FullPriceMicros", Long.valueOf(extendedgame.hS())).a("FormattedFullPrice", extendedgame.hT()).a("Snapshot", extendedgame.hU()).toString();
    }

    static boolean b(Integer integer)
    {
        return c(integer);
    }

    static Integer gM()
    {
        return fl();
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
        return hW();
    }

    public Game getGame()
    {
        return hV();
    }

    public int getVersionCode()
    {
        return xJ;
    }

    public ArrayList hL()
    {
        return new ArrayList(Rz);
    }

    public int hM()
    {
        return Rr;
    }

    public boolean hN()
    {
        return Rs;
    }

    public int hO()
    {
        return Rt;
    }

    public long hP()
    {
        return Ru;
    }

    public long hQ()
    {
        return Rv;
    }

    public String hR()
    {
        return Rw;
    }

    public long hS()
    {
        return Rx;
    }

    public String hT()
    {
        return Ry;
    }

    public SnapshotMetadata hU()
    {
        return RA;
    }

    public GameEntity hV()
    {
        return Rq;
    }

    public ExtendedGame hW()
    {
        return this;
    }

    public int hashCode()
    {
        return a(this);
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
        if (!fm())
        {
            ExtendedGameEntityCreator.a(this, parcel, i);
        } else
        {
            Rq.writeToParcel(parcel, i);
            parcel.writeInt(Rr);
            int j;
            int k;
            if (Rs)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            parcel.writeInt(j);
            parcel.writeInt(Rt);
            parcel.writeLong(Ru);
            parcel.writeLong(Rv);
            parcel.writeString(Rw);
            parcel.writeLong(Rx);
            parcel.writeString(Ry);
            k = Rz.size();
            parcel.writeInt(k);
            j = ((flag) ? 1 : 0);
            while (j < k) 
            {
                ((GameBadgeEntity)Rz.get(j)).writeToParcel(parcel, i);
                j++;
            }
        }
    }

}
