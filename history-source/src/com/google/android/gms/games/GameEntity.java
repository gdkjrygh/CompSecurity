// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.le;

// Referenced classes of package com.google.android.gms.games:
//            Game, GameEntityCreator

public final class GameEntity extends GamesDowngradeableSafeParcel
    implements Game
{
    static final class GameEntityCreatorCompat extends GameEntityCreator
    {

        public GameEntity cl(Parcel parcel)
        {
            if (GameEntity.b(GameEntity.kD()) || GameEntity.bz(com/google/android/gms/games/GameEntity.getCanonicalName()))
            {
                return super.cl(parcel);
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
            return new GameEntity(5, s, s1, s2, s3, s4, s5, ((Uri) (obj)), ((Uri) (obj1)), ((Uri) (obj2)), flag, flag1, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), false, false, null, null, null, false, false, false, null);
        }

        public Object createFromParcel(Parcel parcel)
        {
            return cl(parcel);
        }

        GameEntityCreatorCompat()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new GameEntityCreatorCompat();
    private final int CK;
    private final String Fo;
    private final String OS;
    private final String UO;
    private final String WA;
    private final String WB;
    private final String WC;
    private final Uri WD;
    private final Uri WE;
    private final Uri WF;
    private final boolean WG;
    private final boolean WH;
    private final String WI;
    private final int WJ;
    private final int WK;
    private final int WL;
    private final boolean WM;
    private final boolean WN;
    private final String WO;
    private final String WP;
    private final String WQ;
    private final boolean WR;
    private final boolean WS;
    private final boolean WT;
    private final String WU;

    GameEntity(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            Uri uri, Uri uri1, Uri uri2, boolean flag, boolean flag1, String s6, int j, 
            int k, int l, boolean flag2, boolean flag3, String s7, String s8, String s9, 
            boolean flag4, boolean flag5, boolean flag6, String s10)
    {
        CK = i;
        Fo = s;
        OS = s1;
        WA = s2;
        WB = s3;
        UO = s4;
        WC = s5;
        WD = uri;
        WO = s7;
        WE = uri1;
        WP = s8;
        WF = uri2;
        WQ = s9;
        WG = flag;
        WH = flag1;
        WI = s6;
        WJ = j;
        WK = k;
        WL = l;
        WM = flag2;
        WN = flag3;
        WR = flag4;
        WS = flag5;
        WT = flag6;
        WU = s10;
    }

    public GameEntity(Game game)
    {
        CK = 5;
        Fo = game.getApplicationId();
        WA = game.getPrimaryCategory();
        WB = game.getSecondaryCategory();
        UO = game.getDescription();
        WC = game.getDeveloperName();
        OS = game.getDisplayName();
        WD = game.getIconImageUri();
        WO = game.getIconImageUrl();
        WE = game.getHiResImageUri();
        WP = game.getHiResImageUrl();
        WF = game.getFeaturedImageUri();
        WQ = game.getFeaturedImageUrl();
        WG = game.ky();
        WH = game.kA();
        WI = game.kB();
        WJ = game.kC();
        WK = game.getAchievementTotalCount();
        WL = game.getLeaderboardCount();
        WM = game.isRealTimeMultiplayerEnabled();
        WN = game.isTurnBasedMultiplayerEnabled();
        WR = game.isMuted();
        WS = game.kz();
        WT = game.areSnapshotsEnabled();
        WU = game.getThemeColor();
    }

    static int a(Game game)
    {
        return jv.hashCode(new Object[] {
            game.getApplicationId(), game.getDisplayName(), game.getPrimaryCategory(), game.getSecondaryCategory(), game.getDescription(), game.getDeveloperName(), game.getIconImageUri(), game.getHiResImageUri(), game.getFeaturedImageUri(), Boolean.valueOf(game.ky()), 
            Boolean.valueOf(game.kA()), game.kB(), Integer.valueOf(game.kC()), Integer.valueOf(game.getAchievementTotalCount()), Integer.valueOf(game.getLeaderboardCount()), Boolean.valueOf(game.isRealTimeMultiplayerEnabled()), Boolean.valueOf(game.isTurnBasedMultiplayerEnabled()), Boolean.valueOf(game.isMuted()), Boolean.valueOf(game.kz()), Boolean.valueOf(game.areSnapshotsEnabled()), 
            game.getThemeColor()
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
        if (!jv.equal(((Game) (obj)).getApplicationId(), game.getApplicationId()) || !jv.equal(((Game) (obj)).getDisplayName(), game.getDisplayName()) || !jv.equal(((Game) (obj)).getPrimaryCategory(), game.getPrimaryCategory()) || !jv.equal(((Game) (obj)).getSecondaryCategory(), game.getSecondaryCategory()) || !jv.equal(((Game) (obj)).getDescription(), game.getDescription()) || !jv.equal(((Game) (obj)).getDeveloperName(), game.getDeveloperName()) || !jv.equal(((Game) (obj)).getIconImageUri(), game.getIconImageUri()) || !jv.equal(((Game) (obj)).getHiResImageUri(), game.getHiResImageUri()) || !jv.equal(((Game) (obj)).getFeaturedImageUri(), game.getFeaturedImageUri()) || !jv.equal(Boolean.valueOf(((Game) (obj)).ky()), Boolean.valueOf(game.ky())) || !jv.equal(Boolean.valueOf(((Game) (obj)).kA()), Boolean.valueOf(game.kA())) || !jv.equal(((Game) (obj)).kB(), game.kB()) || !jv.equal(Integer.valueOf(((Game) (obj)).kC()), Integer.valueOf(game.kC())) || !jv.equal(Integer.valueOf(((Game) (obj)).getAchievementTotalCount()), Integer.valueOf(game.getAchievementTotalCount())) || !jv.equal(Integer.valueOf(((Game) (obj)).getLeaderboardCount()), Integer.valueOf(game.getLeaderboardCount())) || !jv.equal(Boolean.valueOf(((Game) (obj)).isRealTimeMultiplayerEnabled()), Boolean.valueOf(game.isRealTimeMultiplayerEnabled())))
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag2 = ((Game) (obj)).isTurnBasedMultiplayerEnabled();
        if (game.isTurnBasedMultiplayerEnabled() && jv.equal(Boolean.valueOf(((Game) (obj)).isMuted()), Boolean.valueOf(game.isMuted())) && jv.equal(Boolean.valueOf(((Game) (obj)).kz()), Boolean.valueOf(game.kz())))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!jv.equal(Boolean.valueOf(flag2), Boolean.valueOf(flag)) || !jv.equal(Boolean.valueOf(((Game) (obj)).areSnapshotsEnabled()), Boolean.valueOf(game.areSnapshotsEnabled())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (jv.equal(((Game) (obj)).getThemeColor(), game.getThemeColor())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(Game game)
    {
        return jv.h(game).a("ApplicationId", game.getApplicationId()).a("DisplayName", game.getDisplayName()).a("PrimaryCategory", game.getPrimaryCategory()).a("SecondaryCategory", game.getSecondaryCategory()).a("Description", game.getDescription()).a("DeveloperName", game.getDeveloperName()).a("IconImageUri", game.getIconImageUri()).a("IconImageUrl", game.getIconImageUrl()).a("HiResImageUri", game.getHiResImageUri()).a("HiResImageUrl", game.getHiResImageUrl()).a("FeaturedImageUri", game.getFeaturedImageUri()).a("FeaturedImageUrl", game.getFeaturedImageUrl()).a("PlayEnabledGame", Boolean.valueOf(game.ky())).a("InstanceInstalled", Boolean.valueOf(game.kA())).a("InstancePackageName", game.kB()).a("AchievementTotalCount", Integer.valueOf(game.getAchievementTotalCount())).a("LeaderboardCount", Integer.valueOf(game.getLeaderboardCount())).a("RealTimeMultiplayerEnabled", Boolean.valueOf(game.isRealTimeMultiplayerEnabled())).a("TurnBasedMultiplayerEnabled", Boolean.valueOf(game.isTurnBasedMultiplayerEnabled())).a("AreSnapshotsEnabled", Boolean.valueOf(game.areSnapshotsEnabled())).a("ThemeColor", game.getThemeColor()).toString();
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

    public boolean areSnapshotsEnabled()
    {
        return WT;
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

    public int getAchievementTotalCount()
    {
        return WK;
    }

    public String getApplicationId()
    {
        return Fo;
    }

    public String getDescription()
    {
        return UO;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        le.b(UO, chararraybuffer);
    }

    public String getDeveloperName()
    {
        return WC;
    }

    public void getDeveloperName(CharArrayBuffer chararraybuffer)
    {
        le.b(WC, chararraybuffer);
    }

    public String getDisplayName()
    {
        return OS;
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        le.b(OS, chararraybuffer);
    }

    public Uri getFeaturedImageUri()
    {
        return WF;
    }

    public String getFeaturedImageUrl()
    {
        return WQ;
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

    public int getLeaderboardCount()
    {
        return WL;
    }

    public String getPrimaryCategory()
    {
        return WA;
    }

    public String getSecondaryCategory()
    {
        return WB;
    }

    public String getThemeColor()
    {
        return WU;
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

    public boolean isMuted()
    {
        return WR;
    }

    public boolean isRealTimeMultiplayerEnabled()
    {
        return WM;
    }

    public boolean isTurnBasedMultiplayerEnabled()
    {
        return WN;
    }

    public boolean kA()
    {
        return WH;
    }

    public String kB()
    {
        return WI;
    }

    public int kC()
    {
        return WJ;
    }

    public boolean ky()
    {
        return WG;
    }

    public boolean kz()
    {
        return WS;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        Object obj = null;
        if (!hu())
        {
            GameEntityCreator.a(this, parcel, i);
            return;
        }
        parcel.writeString(Fo);
        parcel.writeString(OS);
        parcel.writeString(WA);
        parcel.writeString(WB);
        parcel.writeString(UO);
        parcel.writeString(WC);
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
            s = null;
        } else
        {
            s = WE.toString();
        }
        parcel.writeString(s);
        if (WF == null)
        {
            s = obj;
        } else
        {
            s = WF.toString();
        }
        parcel.writeString(s);
        if (WG)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (WH)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeString(WI);
        parcel.writeInt(WJ);
        parcel.writeInt(WK);
        parcel.writeInt(WL);
    }

}
