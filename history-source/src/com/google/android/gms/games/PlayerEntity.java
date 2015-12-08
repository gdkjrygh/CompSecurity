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
import com.google.android.gms.internal.je;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.le;

// Referenced classes of package com.google.android.gms.games:
//            Player, PlayerEntityCreator, PlayerLevelInfo

public final class PlayerEntity extends GamesDowngradeableSafeParcel
    implements Player
{
    static final class PlayerEntityCreatorCompat extends PlayerEntityCreator
    {

        public PlayerEntity cm(Parcel parcel)
        {
            if (PlayerEntity.b(PlayerEntity.kD()) || PlayerEntity.bz(com/google/android/gms/games/PlayerEntity.getCanonicalName()))
            {
                return super.cm(parcel);
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
            return new PlayerEntity(11, s, s1, ((Uri) (obj)), ((Uri) (obj1)), parcel.readLong(), -1, -1L, null, null, null, null, null, true);
        }

        public Object createFromParcel(Parcel parcel)
        {
            return cm(parcel);
        }

        PlayerEntityCreatorCompat()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new PlayerEntityCreatorCompat();
    private final int CK;
    private final String OH;
    private final String OS;
    private final Uri WD;
    private final Uri WE;
    private final String WO;
    private final String WP;
    private final String Xh;
    private final long Xi;
    private final int Xj;
    private final long Xk;
    private final MostRecentGameInfoEntity Xl;
    private final PlayerLevelInfo Xm;
    private final boolean Xn;

    PlayerEntity(int i, String s, String s1, Uri uri, Uri uri1, long l, 
            int j, long l1, String s2, String s3, String s4, MostRecentGameInfoEntity mostrecentgameinfoentity, 
            PlayerLevelInfo playerlevelinfo, boolean flag)
    {
        CK = i;
        Xh = s;
        OS = s1;
        WD = uri;
        WO = s2;
        WE = uri1;
        WP = s3;
        Xi = l;
        Xj = j;
        Xk = l1;
        OH = s4;
        Xn = flag;
        Xl = mostrecentgameinfoentity;
        Xm = playerlevelinfo;
    }

    public PlayerEntity(Player player)
    {
        CK = 11;
        Xh = player.getPlayerId();
        OS = player.getDisplayName();
        WD = player.getIconImageUri();
        WO = player.getIconImageUrl();
        WE = player.getHiResImageUri();
        WP = player.getHiResImageUrl();
        Xi = player.getRetrievedTimestamp();
        Xj = player.kE();
        Xk = player.getLastPlayedWithTimestamp();
        OH = player.getTitle();
        Xn = player.isProfileVisible();
        Object obj = player.kF();
        boolean flag;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = new MostRecentGameInfoEntity(((MostRecentGameInfo) (obj)));
        }
        Xl = ((MostRecentGameInfoEntity) (obj));
        Xm = player.getLevelInfo();
        je.f(Xh);
        je.f(OS);
        if (Xi > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        je.K(flag);
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
        if (!jv.equal(((Player) (obj)).getPlayerId(), player.getPlayerId()) || !jv.equal(((Player) (obj)).getDisplayName(), player.getDisplayName()) || !jv.equal(((Player) (obj)).getIconImageUri(), player.getIconImageUri()) || !jv.equal(((Player) (obj)).getHiResImageUri(), player.getHiResImageUri()) || !jv.equal(Long.valueOf(((Player) (obj)).getRetrievedTimestamp()), Long.valueOf(player.getRetrievedTimestamp())) || !jv.equal(((Player) (obj)).getTitle(), player.getTitle()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (jv.equal(((Player) (obj)).getLevelInfo(), player.getLevelInfo())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static int b(Player player)
    {
        return jv.hashCode(new Object[] {
            player.getPlayerId(), player.getDisplayName(), player.getIconImageUri(), player.getHiResImageUri(), Long.valueOf(player.getRetrievedTimestamp()), player.getTitle(), player.getLevelInfo()
        });
    }

    static boolean b(Integer integer)
    {
        return c(integer);
    }

    static boolean bz(String s)
    {
        return aW(s);
    }

    static String c(Player player)
    {
        return jv.h(player).a("PlayerId", player.getPlayerId()).a("DisplayName", player.getDisplayName()).a("IconImageUri", player.getIconImageUri()).a("IconImageUrl", player.getIconImageUrl()).a("HiResImageUri", player.getHiResImageUri()).a("HiResImageUrl", player.getHiResImageUrl()).a("RetrievedTimestamp", Long.valueOf(player.getRetrievedTimestamp())).a("Title", player.getTitle()).a("LevelInfo", player.getLevelInfo()).toString();
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

    public Player freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public String getDisplayName()
    {
        return OS;
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        le.b(OS, chararraybuffer);
    }

    public Uri getHiResImageUri()
    {
        return WE;
    }

    public String getHiResImageUrl()
    {
        return WP;
    }

    public Uri getIconImageUri()
    {
        return WD;
    }

    public String getIconImageUrl()
    {
        return WO;
    }

    public long getLastPlayedWithTimestamp()
    {
        return Xk;
    }

    public PlayerLevelInfo getLevelInfo()
    {
        return Xm;
    }

    public String getPlayerId()
    {
        return Xh;
    }

    public long getRetrievedTimestamp()
    {
        return Xi;
    }

    public String getTitle()
    {
        return OH;
    }

    public void getTitle(CharArrayBuffer chararraybuffer)
    {
        le.b(OH, chararraybuffer);
    }

    public int getVersionCode()
    {
        return CK;
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
        return b(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public boolean isProfileVisible()
    {
        return Xn;
    }

    public int kE()
    {
        return Xj;
    }

    public MostRecentGameInfo kF()
    {
        return Xl;
    }

    public String toString()
    {
        return c(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        Object obj = null;
        if (!hu())
        {
            PlayerEntityCreator.a(this, parcel, i);
            return;
        }
        parcel.writeString(Xh);
        parcel.writeString(OS);
        String s;
        if (WD == null)
        {
            s = null;
        } else
        {
            s = WD.toString();
        }
        parcel.writeString(s);
        if (WE == null)
        {
            s = obj;
        } else
        {
            s = WE.toString();
        }
        parcel.writeString(s);
        parcel.writeLong(Xi);
    }

}
