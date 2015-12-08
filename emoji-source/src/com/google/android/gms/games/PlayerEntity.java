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
import com.google.android.gms.internal.gx;
import com.google.android.gms.internal.hk;
import com.google.android.gms.internal.ik;

// Referenced classes of package com.google.android.gms.games:
//            Player, PlayerEntityCreator, PlayerLevelInfo

public final class PlayerEntity extends GamesDowngradeableSafeParcel
    implements Player
{
    static final class PlayerEntityCreatorCompat extends PlayerEntityCreator
    {

        public PlayerEntity be(Parcel parcel)
        {
            if (PlayerEntity.b(PlayerEntity.gR()) || PlayerEntity.aQ(com/google/android/gms/games/PlayerEntity.getCanonicalName()))
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
    private final String HY;
    private final String Ln;
    private final String MC;
    private final String MD;
    private final String MS;
    private final long MT;
    private final int MU;
    private final long MV;
    private final MostRecentGameInfoEntity MW;
    private final PlayerLevelInfo MX;
    private final boolean MY;
    private final Uri Mr;
    private final Uri Ms;
    private final int xM;

    PlayerEntity(int i, String s, String s1, Uri uri, Uri uri1, long l, 
            int j, long l1, String s2, String s3, String s4, MostRecentGameInfoEntity mostrecentgameinfoentity, 
            PlayerLevelInfo playerlevelinfo, boolean flag)
    {
        xM = i;
        MS = s;
        Ln = s1;
        Mr = uri;
        MC = s2;
        Ms = uri1;
        MD = s3;
        MT = l;
        MU = j;
        MV = l1;
        HY = s4;
        MY = flag;
        MW = mostrecentgameinfoentity;
        MX = playerlevelinfo;
    }

    public PlayerEntity(Player player)
    {
        xM = 10;
        MS = player.getPlayerId();
        Ln = player.getDisplayName();
        Mr = player.getIconImageUri();
        MC = player.getIconImageUrl();
        Ms = player.getHiResImageUri();
        MD = player.getHiResImageUrl();
        MT = player.getRetrievedTimestamp();
        MU = player.gS();
        MV = player.getLastPlayedWithTimestamp();
        HY = player.getTitle();
        MY = player.gT();
        Object obj = player.gU();
        boolean flag;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = new MostRecentGameInfoEntity(((MostRecentGameInfo) (obj)));
        }
        MW = ((MostRecentGameInfoEntity) (obj));
        MX = player.getLevelInfo();
        gx.c(MS);
        gx.c(Ln);
        if (MT > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gx.A(flag);
    }

    static int a(Player player)
    {
        return hk.hashCode(new Object[] {
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
        if (!hk.equal(((Player) (obj)).getPlayerId(), player.getPlayerId()) || !hk.equal(((Player) (obj)).getDisplayName(), player.getDisplayName()) || !hk.equal(((Player) (obj)).getIconImageUri(), player.getIconImageUri()) || !hk.equal(((Player) (obj)).getHiResImageUri(), player.getHiResImageUri()) || !hk.equal(Long.valueOf(((Player) (obj)).getRetrievedTimestamp()), Long.valueOf(player.getRetrievedTimestamp())) || !hk.equal(((Player) (obj)).getTitle(), player.getTitle()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hk.equal(((Player) (obj)).getLevelInfo(), player.getLevelInfo())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static boolean aQ(String s)
    {
        return aA(s);
    }

    static String b(Player player)
    {
        return hk.e(player).a("PlayerId", player.getPlayerId()).a("DisplayName", player.getDisplayName()).a("IconImageUri", player.getIconImageUri()).a("IconImageUrl", player.getIconImageUrl()).a("HiResImageUri", player.getHiResImageUri()).a("HiResImageUrl", player.getHiResImageUrl()).a("RetrievedTimestamp", Long.valueOf(player.getRetrievedTimestamp())).a("Title", player.getTitle()).a("LevelInfo", player.getLevelInfo()).toString();
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

    public Player freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public int gS()
    {
        return MU;
    }

    public boolean gT()
    {
        return MY;
    }

    public MostRecentGameInfo gU()
    {
        return MW;
    }

    public String getDisplayName()
    {
        return Ln;
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        ik.b(Ln, chararraybuffer);
    }

    public Uri getHiResImageUri()
    {
        return Ms;
    }

    public String getHiResImageUrl()
    {
        return MD;
    }

    public Uri getIconImageUri()
    {
        return Mr;
    }

    public String getIconImageUrl()
    {
        return MC;
    }

    public long getLastPlayedWithTimestamp()
    {
        return MV;
    }

    public PlayerLevelInfo getLevelInfo()
    {
        return MX;
    }

    public String getPlayerId()
    {
        return MS;
    }

    public long getRetrievedTimestamp()
    {
        return MT;
    }

    public String getTitle()
    {
        return HY;
    }

    public void getTitle(CharArrayBuffer chararraybuffer)
    {
        ik.b(HY, chararraybuffer);
    }

    public int getVersionCode()
    {
        return xM;
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
        if (!fr())
        {
            PlayerEntityCreator.a(this, parcel, i);
            return;
        }
        parcel.writeString(MS);
        parcel.writeString(Ln);
        String s;
        if (Mr == null)
        {
            s = null;
        } else
        {
            s = Mr.toString();
        }
        parcel.writeString(s);
        if (Ms == null)
        {
            s = obj;
        } else
        {
            s = Ms.toString();
        }
        parcel.writeString(s);
        parcel.writeLong(MT);
    }

}
