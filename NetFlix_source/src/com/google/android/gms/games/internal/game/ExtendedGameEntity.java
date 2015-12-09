// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import android.os.Parcel;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.fo;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            ExtendedGame, GameBadge, GameBadgeEntity, ExtendedGameEntityCreator, 
//            GameBadgeEntityCreator

public final class ExtendedGameEntity extends GamesDowngradeableSafeParcel
    implements ExtendedGame
{
    static final class ExtendedGameEntityCreatorCompat extends ExtendedGameEntityCreator
    {

        public ExtendedGameEntity aq(Parcel parcel)
        {
            if (ExtendedGameEntity.b(ExtendedGameEntity.gg()) || ExtendedGameEntity.az(com/google/android/gms/games/internal/game/ExtendedGameEntity.getCanonicalName()))
            {
                return super.aq(parcel);
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
                arraylist.add(GameBadgeEntity.CREATOR.ar(parcel));
            }

            return new ExtendedGameEntity(1, gameentity, j, flag, k, l1, l2, s, l3, s1, arraylist);
        }

        public Object createFromParcel(Parcel parcel)
        {
            return aq(parcel);
        }

        ExtendedGameEntityCreatorCompat()
        {
        }
    }


    public static final ExtendedGameEntityCreator CREATOR = new ExtendedGameEntityCreatorCompat();
    private final long LA;
    private final String LB;
    private final ArrayList LC;
    private final GameEntity Lt;
    private final int Lu;
    private final boolean Lv;
    private final int Lw;
    private final long Lx;
    private final long Ly;
    private final String Lz;
    private final int xH;

    ExtendedGameEntity(int i, GameEntity gameentity, int j, boolean flag, int k, long l, 
            long l1, String s, long l2, String s1, ArrayList arraylist)
    {
        xH = i;
        Lt = gameentity;
        Lu = j;
        Lv = flag;
        Lw = k;
        Lx = l;
        Ly = l1;
        Lz = s;
        LA = l2;
        LB = s1;
        LC = arraylist;
    }

    public ExtendedGameEntity(ExtendedGame extendedgame)
    {
        xH = 1;
        Object obj = extendedgame.getGame();
        int j;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = new GameEntity(((Game) (obj)));
        }
        Lt = ((GameEntity) (obj));
        Lu = extendedgame.gX();
        Lv = extendedgame.gY();
        Lw = extendedgame.gZ();
        Lx = extendedgame.ha();
        Ly = extendedgame.hb();
        Lz = extendedgame.hc();
        LA = extendedgame.hd();
        LB = extendedgame.he();
        extendedgame = extendedgame.gW();
        j = extendedgame.size();
        LC = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            LC.add((GameBadgeEntity)((GameBadge)extendedgame.get(i)).freeze());
        }

    }

    static int a(ExtendedGame extendedgame)
    {
        return fo.hashCode(new Object[] {
            extendedgame.getGame(), Integer.valueOf(extendedgame.gX()), Boolean.valueOf(extendedgame.gY()), Integer.valueOf(extendedgame.gZ()), Long.valueOf(extendedgame.ha()), Long.valueOf(extendedgame.hb()), extendedgame.hc(), Long.valueOf(extendedgame.hd()), extendedgame.he()
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
        if (!fo.equal(((ExtendedGame) (obj)).getGame(), extendedgame.getGame()) || !fo.equal(Integer.valueOf(((ExtendedGame) (obj)).gX()), Integer.valueOf(extendedgame.gX())) || !fo.equal(Boolean.valueOf(((ExtendedGame) (obj)).gY()), Boolean.valueOf(extendedgame.gY())) || !fo.equal(Integer.valueOf(((ExtendedGame) (obj)).gZ()), Integer.valueOf(extendedgame.gZ())) || !fo.equal(Long.valueOf(((ExtendedGame) (obj)).ha()), Long.valueOf(extendedgame.ha())) || !fo.equal(Long.valueOf(((ExtendedGame) (obj)).hb()), Long.valueOf(extendedgame.hb())) || !fo.equal(((ExtendedGame) (obj)).hc(), extendedgame.hc()) || !fo.equal(Long.valueOf(((ExtendedGame) (obj)).hd()), Long.valueOf(extendedgame.hd())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (fo.equal(((ExtendedGame) (obj)).he(), extendedgame.he())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static boolean az(String s)
    {
        return al(s);
    }

    static String b(ExtendedGame extendedgame)
    {
        return fo.e(extendedgame).a("Game", extendedgame.getGame()).a("Availability", Integer.valueOf(extendedgame.gX())).a("Owned", Boolean.valueOf(extendedgame.gY())).a("AchievementUnlockedCount", Integer.valueOf(extendedgame.gZ())).a("LastPlayedServerTimestamp", Long.valueOf(extendedgame.ha())).a("PriceMicros", Long.valueOf(extendedgame.hb())).a("FormattedPrice", extendedgame.hc()).a("FullPriceMicros", Long.valueOf(extendedgame.hd())).a("FormattedFullPrice", extendedgame.he()).toString();
    }

    static boolean b(Integer integer)
    {
        return c(integer);
    }

    static Integer gg()
    {
        return eJ();
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
        return hg();
    }

    public ArrayList gW()
    {
        return new ArrayList(LC);
    }

    public int gX()
    {
        return Lu;
    }

    public boolean gY()
    {
        return Lv;
    }

    public int gZ()
    {
        return Lw;
    }

    public Game getGame()
    {
        return hf();
    }

    public int getVersionCode()
    {
        return xH;
    }

    public long ha()
    {
        return Lx;
    }

    public int hashCode()
    {
        return a(this);
    }

    public long hb()
    {
        return Ly;
    }

    public String hc()
    {
        return Lz;
    }

    public long hd()
    {
        return LA;
    }

    public String he()
    {
        return LB;
    }

    public GameEntity hf()
    {
        return Lt;
    }

    public ExtendedGame hg()
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
        if (!eK())
        {
            ExtendedGameEntityCreator.a(this, parcel, i);
        } else
        {
            Lt.writeToParcel(parcel, i);
            parcel.writeInt(Lu);
            int j;
            int k;
            if (Lv)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            parcel.writeInt(j);
            parcel.writeInt(Lw);
            parcel.writeLong(Lx);
            parcel.writeLong(Ly);
            parcel.writeString(Lz);
            parcel.writeLong(LA);
            parcel.writeString(LB);
            k = LC.size();
            parcel.writeInt(k);
            j = ((flag) ? 1 : 0);
            while (j < k) 
            {
                ((GameBadgeEntity)LC.get(j)).writeToParcel(parcel, i);
                j++;
            }
        }
    }

}
