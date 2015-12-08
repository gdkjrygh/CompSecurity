// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.a;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;
import com.google.android.gms.internal.jv;

// Referenced classes of package com.google.android.gms.games:
//            Player, PlayerEntityCreator, PlayerLevelInfo

public final class PlayerEntity extends GamesDowngradeableSafeParcel
    implements Player
{
    static final class PlayerEntityCreatorCompat extends PlayerEntityCreator
    {

        public PlayerEntity ce(Parcel parcel)
        {
            if (PlayerEntity.b(PlayerEntity.jT()) || PlayerEntity.bw(com/google/android/gms/games/PlayerEntity.getCanonicalName()))
            {
                return super.ce(parcel);
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
            return ce(parcel);
        }

        PlayerEntityCreatorCompat()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new PlayerEntityCreatorCompat();
    private final int BR;
    private final String NH;
    private final String Nw;
    private final String VK;
    private final long VL;
    private final int VM;
    private final long VN;
    private final MostRecentGameInfoEntity VO;
    private final PlayerLevelInfo VP;
    private final boolean VQ;
    private final Uri Vh;
    private final Uri Vi;
    private final String Vs;
    private final String Vt;

    PlayerEntity(int i, String s, String s1, Uri uri, Uri uri1, long l, 
            int j, long l1, String s2, String s3, String s4, MostRecentGameInfoEntity mostrecentgameinfoentity, 
            PlayerLevelInfo playerlevelinfo, boolean flag)
    {
        BR = i;
        VK = s;
        NH = s1;
        Vh = uri;
        Vs = s2;
        Vi = uri1;
        Vt = s3;
        VL = l;
        VM = j;
        VN = l1;
        Nw = s4;
        VQ = flag;
        VO = mostrecentgameinfoentity;
        VP = playerlevelinfo;
    }

    public PlayerEntity(Player player)
    {
        BR = 11;
        VK = player.getPlayerId();
        NH = player.getDisplayName();
        Vh = player.getIconImageUri();
        Vs = player.getIconImageUrl();
        Vi = player.getHiResImageUri();
        Vt = player.getHiResImageUrl();
        VL = player.getRetrievedTimestamp();
        VM = player.jU();
        VN = player.getLastPlayedWithTimestamp();
        Nw = player.getTitle();
        VQ = player.isProfileVisible();
        Object obj = player.jV();
        boolean flag;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = new MostRecentGameInfoEntity(((MostRecentGameInfo) (obj)));
        }
        VO = ((MostRecentGameInfoEntity) (obj));
        VP = player.getLevelInfo();
        com.google.android.gms.common.internal.a.f(VK);
        com.google.android.gms.common.internal.a.f(NH);
        if (VL > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.gms.common.internal.a.I(flag);
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
        if (!n.equal(((Player) (obj)).getPlayerId(), player.getPlayerId()) || !n.equal(((Player) (obj)).getDisplayName(), player.getDisplayName()) || !n.equal(((Player) (obj)).getIconImageUri(), player.getIconImageUri()) || !n.equal(((Player) (obj)).getHiResImageUri(), player.getHiResImageUri()) || !n.equal(Long.valueOf(((Player) (obj)).getRetrievedTimestamp()), Long.valueOf(player.getRetrievedTimestamp())) || !n.equal(((Player) (obj)).getTitle(), player.getTitle()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (n.equal(((Player) (obj)).getLevelInfo(), player.getLevelInfo())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static int b(Player player)
    {
        return n.hashCode(new Object[] {
            player.getPlayerId(), player.getDisplayName(), player.getIconImageUri(), player.getHiResImageUri(), Long.valueOf(player.getRetrievedTimestamp()), player.getTitle(), player.getLevelInfo()
        });
    }

    static boolean b(Integer integer)
    {
        return c(integer);
    }

    static boolean bw(String s)
    {
        return aV(s);
    }

    static String c(Player player)
    {
        return n.h(player).a("PlayerId", player.getPlayerId()).a("DisplayName", player.getDisplayName()).a("IconImageUri", player.getIconImageUri()).a("IconImageUrl", player.getIconImageUrl()).a("HiResImageUri", player.getHiResImageUri()).a("HiResImageUrl", player.getHiResImageUrl()).a("RetrievedTimestamp", Long.valueOf(player.getRetrievedTimestamp())).a("Title", player.getTitle()).a("LevelInfo", player.getLevelInfo()).toString();
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
        return NH;
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        jv.b(NH, chararraybuffer);
    }

    public Uri getHiResImageUri()
    {
        return Vi;
    }

    public String getHiResImageUrl()
    {
        return Vt;
    }

    public Uri getIconImageUri()
    {
        return Vh;
    }

    public String getIconImageUrl()
    {
        return Vs;
    }

    public long getLastPlayedWithTimestamp()
    {
        return VN;
    }

    public PlayerLevelInfo getLevelInfo()
    {
        return VP;
    }

    public String getPlayerId()
    {
        return VK;
    }

    public long getRetrievedTimestamp()
    {
        return VL;
    }

    public String getTitle()
    {
        return Nw;
    }

    public void getTitle(CharArrayBuffer chararraybuffer)
    {
        jv.b(Nw, chararraybuffer);
    }

    public int getVersionCode()
    {
        return BR;
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
        return VQ;
    }

    public int jU()
    {
        return VM;
    }

    public MostRecentGameInfo jV()
    {
        return VO;
    }

    public String toString()
    {
        return c(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        Object obj = null;
        if (!gQ())
        {
            com.google.android.gms.games.PlayerEntityCreator.a(this, parcel, i);
            return;
        }
        parcel.writeString(VK);
        parcel.writeString(NH);
        String s;
        if (Vh == null)
        {
            s = null;
        } else
        {
            s = Vh.toString();
        }
        parcel.writeString(s);
        if (Vi == null)
        {
            s = obj;
        } else
        {
            s = Vi.toString();
        }
        parcel.writeString(s);
        parcel.writeLong(VL);
    }

}
