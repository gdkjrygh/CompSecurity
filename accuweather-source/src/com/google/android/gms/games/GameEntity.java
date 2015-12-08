// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.hl;
import com.google.android.gms.internal.il;

// Referenced classes of package com.google.android.gms.games:
//            Game, GameEntityCreator

public final class GameEntity extends GamesDowngradeableSafeParcel
    implements Game
{
    static final class GameEntityCreatorCompat extends GameEntityCreator
    {

        public GameEntity bd(Parcel parcel)
        {
            if (GameEntity.b(GameEntity.gM()) || GameEntity.aQ(com/google/android/gms/games/GameEntity.getCanonicalName()))
            {
                return super.bd(parcel);
            }
            String s = parcel.readString();
            String s1 = parcel.readString();
            String s2 = parcel.readString();
            String s3 = parcel.readString();
            String s4 = parcel.readString();
            String s5 = parcel.readString();
            Object obj = parcel.readString();
            Object obj1;
            Object obj2;
            boolean flag;
            boolean flag1;
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = Uri.parse(((String) (obj)));
            }
            obj1 = parcel.readString();
            if (obj1 == null)
            {
                obj1 = null;
            } else
            {
                obj1 = Uri.parse(((String) (obj1)));
            }
            obj2 = parcel.readString();
            if (obj2 == null)
            {
                obj2 = null;
            } else
            {
                obj2 = Uri.parse(((String) (obj2)));
            }
            if (parcel.readInt() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (parcel.readInt() > 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            return new GameEntity(4, s, s1, s2, s3, s4, s5, ((Uri) (obj)), ((Uri) (obj1)), ((Uri) (obj2)), flag, flag1, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), false, false, null, null, null, false, false, false);
        }

        public Object createFromParcel(Parcel parcel)
        {
            return bd(parcel);
        }

        GameEntityCreatorCompat()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new GameEntityCreatorCompat();
    private final String Lk;
    private final String MA;
    private final String MB;
    private final boolean MC;
    private final boolean MD;
    private final boolean ME;
    private final String Mk;
    private final String Ml;
    private final String Mm;
    private final String Mn;
    private final Uri Mo;
    private final Uri Mp;
    private final Uri Mq;
    private final boolean Mr;
    private final boolean Ms;
    private final String Mt;
    private final int Mu;
    private final int Mv;
    private final int Mw;
    private final boolean Mx;
    private final boolean My;
    private final String Mz;
    private final int xJ;
    private final String zM;

    GameEntity(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            Uri uri, Uri uri1, Uri uri2, boolean flag, boolean flag1, String s6, int j, 
            int k, int l, boolean flag2, boolean flag3, String s7, String s8, String s9, 
            boolean flag4, boolean flag5, boolean flag6)
    {
        xJ = i;
        zM = s;
        Lk = s1;
        Mk = s2;
        Ml = s3;
        Mm = s4;
        Mn = s5;
        Mo = uri;
        Mz = s7;
        Mp = uri1;
        MA = s8;
        Mq = uri2;
        MB = s9;
        Mr = flag;
        Ms = flag1;
        Mt = s6;
        Mu = j;
        Mv = k;
        Mw = l;
        Mx = flag2;
        My = flag3;
        MC = flag4;
        MD = flag5;
        ME = flag6;
    }

    public GameEntity(Game game)
    {
        xJ = 4;
        zM = game.getApplicationId();
        Mk = game.getPrimaryCategory();
        Ml = game.getSecondaryCategory();
        Mm = game.getDescription();
        Mn = game.getDeveloperName();
        Lk = game.getDisplayName();
        Mo = game.getIconImageUri();
        Mz = game.getIconImageUrl();
        Mp = game.getHiResImageUri();
        MA = game.getHiResImageUrl();
        Mq = game.getFeaturedImageUri();
        MB = game.getFeaturedImageUrl();
        Mr = game.gH();
        Ms = game.gJ();
        Mt = game.gK();
        Mu = game.gL();
        Mv = game.getAchievementTotalCount();
        Mw = game.getLeaderboardCount();
        Mx = game.isRealTimeMultiplayerEnabled();
        My = game.isTurnBasedMultiplayerEnabled();
        MC = game.isMuted();
        MD = game.gI();
        ME = game.areSnapshotsEnabled();
    }

    static int a(Game game)
    {
        return hl.hashCode(new Object[] {
            game.getApplicationId(), game.getDisplayName(), game.getPrimaryCategory(), game.getSecondaryCategory(), game.getDescription(), game.getDeveloperName(), game.getIconImageUri(), game.getHiResImageUri(), game.getFeaturedImageUri(), Boolean.valueOf(game.gH()), 
            Boolean.valueOf(game.gJ()), game.gK(), Integer.valueOf(game.gL()), Integer.valueOf(game.getAchievementTotalCount()), Integer.valueOf(game.getLeaderboardCount()), Boolean.valueOf(game.isRealTimeMultiplayerEnabled()), Boolean.valueOf(game.isTurnBasedMultiplayerEnabled()), Boolean.valueOf(game.isMuted()), Boolean.valueOf(game.gI()), Boolean.valueOf(game.areSnapshotsEnabled())
        });
    }

    static boolean a(Game game, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof Game) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (game == obj) goto _L4; else goto _L3
_L3:
        obj = (Game)obj;
        if (!hl.equal(((Game) (obj)).getApplicationId(), game.getApplicationId()) || !hl.equal(((Game) (obj)).getDisplayName(), game.getDisplayName()) || !hl.equal(((Game) (obj)).getPrimaryCategory(), game.getPrimaryCategory()) || !hl.equal(((Game) (obj)).getSecondaryCategory(), game.getSecondaryCategory()) || !hl.equal(((Game) (obj)).getDescription(), game.getDescription()) || !hl.equal(((Game) (obj)).getDeveloperName(), game.getDeveloperName()) || !hl.equal(((Game) (obj)).getIconImageUri(), game.getIconImageUri()) || !hl.equal(((Game) (obj)).getHiResImageUri(), game.getHiResImageUri()) || !hl.equal(((Game) (obj)).getFeaturedImageUri(), game.getFeaturedImageUri()) || !hl.equal(Boolean.valueOf(((Game) (obj)).gH()), Boolean.valueOf(game.gH())) || !hl.equal(Boolean.valueOf(((Game) (obj)).gJ()), Boolean.valueOf(game.gJ())) || !hl.equal(((Game) (obj)).gK(), game.gK()) || !hl.equal(Integer.valueOf(((Game) (obj)).gL()), Integer.valueOf(game.gL())) || !hl.equal(Integer.valueOf(((Game) (obj)).getAchievementTotalCount()), Integer.valueOf(game.getAchievementTotalCount())) || !hl.equal(Integer.valueOf(((Game) (obj)).getLeaderboardCount()), Integer.valueOf(game.getLeaderboardCount())) || !hl.equal(Boolean.valueOf(((Game) (obj)).isRealTimeMultiplayerEnabled()), Boolean.valueOf(game.isRealTimeMultiplayerEnabled())))
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag2 = ((Game) (obj)).isTurnBasedMultiplayerEnabled();
        if (game.isTurnBasedMultiplayerEnabled() && hl.equal(Boolean.valueOf(((Game) (obj)).isMuted()), Boolean.valueOf(game.isMuted())) && hl.equal(Boolean.valueOf(((Game) (obj)).gI()), Boolean.valueOf(game.gI())))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!hl.equal(Boolean.valueOf(flag2), Boolean.valueOf(flag)))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hl.equal(Boolean.valueOf(((Game) (obj)).areSnapshotsEnabled()), Boolean.valueOf(game.areSnapshotsEnabled()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static boolean aQ(String s)
    {
        return aA(s);
    }

    static String b(Game game)
    {
        return hl.e(game).a("ApplicationId", game.getApplicationId()).a("DisplayName", game.getDisplayName()).a("PrimaryCategory", game.getPrimaryCategory()).a("SecondaryCategory", game.getSecondaryCategory()).a("Description", game.getDescription()).a("DeveloperName", game.getDeveloperName()).a("IconImageUri", game.getIconImageUri()).a("IconImageUrl", game.getIconImageUrl()).a("HiResImageUri", game.getHiResImageUri()).a("HiResImageUrl", game.getHiResImageUrl()).a("FeaturedImageUri", game.getFeaturedImageUri()).a("FeaturedImageUrl", game.getFeaturedImageUrl()).a("PlayEnabledGame", Boolean.valueOf(game.gH())).a("InstanceInstalled", Boolean.valueOf(game.gJ())).a("InstancePackageName", game.gK()).a("AchievementTotalCount", Integer.valueOf(game.getAchievementTotalCount())).a("LeaderboardCount", Integer.valueOf(game.getLeaderboardCount())).a("RealTimeMultiplayerEnabled", Boolean.valueOf(game.isRealTimeMultiplayerEnabled())).a("TurnBasedMultiplayerEnabled", Boolean.valueOf(game.isTurnBasedMultiplayerEnabled())).a("AreSnapshotsEnabled", Boolean.valueOf(game.areSnapshotsEnabled())).toString();
    }

    static boolean b(Integer integer)
    {
        return c(integer);
    }

    static Integer gM()
    {
        return fl();
    }

    public boolean areSnapshotsEnabled()
    {
        return ME;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public Game freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public boolean gH()
    {
        return Mr;
    }

    public boolean gI()
    {
        return MD;
    }

    public boolean gJ()
    {
        return Ms;
    }

    public String gK()
    {
        return Mt;
    }

    public int gL()
    {
        return Mu;
    }

    public int getAchievementTotalCount()
    {
        return Mv;
    }

    public String getApplicationId()
    {
        return zM;
    }

    public String getDescription()
    {
        return Mm;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        il.b(Mm, chararraybuffer);
    }

    public String getDeveloperName()
    {
        return Mn;
    }

    public void getDeveloperName(CharArrayBuffer chararraybuffer)
    {
        il.b(Mn, chararraybuffer);
    }

    public String getDisplayName()
    {
        return Lk;
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        il.b(Lk, chararraybuffer);
    }

    public Uri getFeaturedImageUri()
    {
        return Mq;
    }

    public String getFeaturedImageUrl()
    {
        return MB;
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

    public int getLeaderboardCount()
    {
        return Mw;
    }

    public String getPrimaryCategory()
    {
        return Mk;
    }

    public String getSecondaryCategory()
    {
        return Ml;
    }

    public int getVersionCode()
    {
        return xJ;
    }

    public int hashCode()
    {
        return a(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public boolean isMuted()
    {
        return MC;
    }

    public boolean isRealTimeMultiplayerEnabled()
    {
        return Mx;
    }

    public boolean isTurnBasedMultiplayerEnabled()
    {
        return My;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        Object obj = null;
        if (!fm())
        {
            GameEntityCreator.a(this, parcel, i);
            return;
        }
        parcel.writeString(zM);
        parcel.writeString(Lk);
        parcel.writeString(Mk);
        parcel.writeString(Ml);
        parcel.writeString(Mm);
        parcel.writeString(Mn);
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
            s = null;
        } else
        {
            s = Mp.toString();
        }
        parcel.writeString(s);
        if (Mq == null)
        {
            s = obj;
        } else
        {
            s = Mq.toString();
        }
        parcel.writeString(s);
        if (Mr)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (Ms)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeString(Mt);
        parcel.writeInt(Mu);
        parcel.writeInt(Mv);
        parcel.writeInt(Mw);
    }

}
