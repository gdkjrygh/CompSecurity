// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;
import com.google.android.gms.internal.gy;
import com.google.android.gms.internal.hl;
import com.google.android.gms.internal.il;

// Referenced classes of package com.google.android.gms.games:
//            Player, PlayerEntityCreator, PlayerLevelInfo

public final class PlayerEntity extends GamesDowngradeableSafeParcel
    implements Player
{
    static final class PlayerEntityCreatorCompat extends PlayerEntityCreator
    {

        public PlayerEntity be(Parcel parcel)
        {
            if (PlayerEntity.b(PlayerEntity.gM()) || PlayerEntity.aQ(com/google/android/gms/games/PlayerEntity.getCanonicalName()))
            {
                return super.be(parcel);
            }
            String s = parcel.readString();
            String s1 = parcel.readString();
            Object obj = parcel.readString();
            Object obj1 = parcel.readString();
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = Uri.parse(((String) (obj)));
            }
            if (obj1 == null)
            {
                obj1 = null;
            } else
            {
                obj1 = Uri.parse(((String) (obj1)));
            }
            return new PlayerEntity(10, s, s1, ((Uri) (obj)), ((Uri) (obj1)), parcel.readLong(), -1, -1L, null, null, null, null, null, true);
        }

        public Object createFromParcel(Parcel parcel)
        {
            return be(parcel);
        }

        PlayerEntityCreatorCompat()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new PlayerEntityCreatorCompat();
    private final String HV;
    private final String Lk;
    private final String MA;
    private final String MP;
    private final long MQ;
    private final int MR;
    private final long MS;
    private final MostRecentGameInfoEntity MT;
    private final PlayerLevelInfo MU;
    private final boolean MV;
    private final Uri Mo;
    private final Uri Mp;
    private final String Mz;
    private final int xJ;

    PlayerEntity(int i, String s, String s1, Uri uri, Uri uri1, long l, 
            int j, long l1, String s2, String s3, String s4, MostRecentGameInfoEntity mostrecentgameinfoentity, 
            PlayerLevelInfo playerlevelinfo, boolean flag)
    {
        xJ = i;
        MP = s;
        Lk = s1;
        Mo = uri;
        Mz = s2;
        Mp = uri1;
        MA = s3;
        MQ = l;
        MR = j;
        MS = l1;
        HV = s4;
        MV = flag;
        MT = mostrecentgameinfoentity;
        MU = playerlevelinfo;
    }

    public PlayerEntity(Player player)
    {
        xJ = 10;
        MP = player.getPlayerId();
        Lk = player.getDisplayName();
        Mo = player.getIconImageUri();
        Mz = player.getIconImageUrl();
        Mp = player.getHiResImageUri();
        MA = player.getHiResImageUrl();
        MQ = player.getRetrievedTimestamp();
        MR = player.gN();
        MS = player.getLastPlayedWithTimestamp();
        HV = player.getTitle();
        MV = player.gO();
        Object obj = player.gP();
        boolean flag;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = new MostRecentGameInfoEntity(((MostRecentGameInfo) (obj)));
        }
        MT = ((MostRecentGameInfoEntity) (obj));
        MU = player.getLevelInfo();
        gy.c(MP);
        gy.c(Lk);
        if (MQ > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gy.A(flag);
    }

    static int a(Player player)
    {
        return hl.hashCode(new Object[] {
            player.getPlayerId(), player.getDisplayName(), player.getIconImageUri(), player.getHiResImageUri(), Long.valueOf(player.getRetrievedTimestamp()), player.getTitle(), player.getLevelInfo()
        });
    }

    static boolean a(Player player, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof Player) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (player == obj) goto _L4; else goto _L3
_L3:
        obj = (Player)obj;
        if (!hl.equal(((Player) (obj)).getPlayerId(), player.getPlayerId()) || !hl.equal(((Player) (obj)).getDisplayName(), player.getDisplayName()) || !hl.equal(((Player) (obj)).getIconImageUri(), player.getIconImageUri()) || !hl.equal(((Player) (obj)).getHiResImageUri(), player.getHiResImageUri()) || !hl.equal(Long.valueOf(((Player) (obj)).getRetrievedTimestamp()), Long.valueOf(player.getRetrievedTimestamp())) || !hl.equal(((Player) (obj)).getTitle(), player.getTitle()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hl.equal(((Player) (obj)).getLevelInfo(), player.getLevelInfo())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static boolean aQ(String s)
    {
        return aA(s);
    }

    static String b(Player player)
    {
        return hl.e(player).a("PlayerId", player.getPlayerId()).a("DisplayName", player.getDisplayName()).a("IconImageUri", player.getIconImageUri()).a("IconImageUrl", player.getIconImageUrl()).a("HiResImageUri", player.getHiResImageUri()).a("HiResImageUrl", player.getHiResImageUrl()).a("RetrievedTimestamp", Long.valueOf(player.getRetrievedTimestamp())).a("Title", player.getTitle()).a("LevelInfo", player.getLevelInfo()).toString();
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

    public Player freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public int gN()
    {
        return MR;
    }

    public boolean gO()
    {
        return MV;
    }

    public MostRecentGameInfo gP()
    {
        return MT;
    }

    public String getDisplayName()
    {
        return Lk;
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        il.b(Lk, chararraybuffer);
    }

    public Uri getHiResImageUri()
    {
        return Mp;
    }

    public String getHiResImageUrl()
    {
        return MA;
    }

    public Uri getIconImageUri()
    {
        return Mo;
    }

    public String getIconImageUrl()
    {
        return Mz;
    }

    public long getLastPlayedWithTimestamp()
    {
        return MS;
    }

    public PlayerLevelInfo getLevelInfo()
    {
        return MU;
    }

    public String getPlayerId()
    {
        return MP;
    }

    public long getRetrievedTimestamp()
    {
        return MQ;
    }

    public String getTitle()
    {
        return HV;
    }

    public void getTitle(CharArrayBuffer chararraybuffer)
    {
        il.b(HV, chararraybuffer);
    }

    public int getVersionCode()
    {
        return xJ;
    }

    public boolean hasHiResImage()
    {
        return getHiResImageUri() != null;
    }

    public boolean hasIconImage()
    {
        return getIconImageUri() != null;
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
        Object obj = null;
        if (!fm())
        {
            PlayerEntityCreator.a(this, parcel, i);
            return;
        }
        parcel.writeString(MP);
        parcel.writeString(Lk);
        String s;
        if (Mo == null)
        {
            s = null;
        } else
        {
            s = Mo.toString();
        }
        parcel.writeString(s);
        if (Mp == null)
        {
            s = obj;
        } else
        {
            s = Mp.toString();
        }
        parcel.writeString(s);
        parcel.writeLong(MQ);
    }

}
