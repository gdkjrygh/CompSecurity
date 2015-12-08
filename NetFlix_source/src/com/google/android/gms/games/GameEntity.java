// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.fo;
import com.google.android.gms.internal.gm;

// Referenced classes of package com.google.android.gms.games:
//            Game, GameEntityCreator

public final class GameEntity extends GamesDowngradeableSafeParcel
    implements Game
{
    static final class GameEntityCreatorCompat extends GameEntityCreator
    {

        public GameEntity an(Parcel parcel)
        {
            if (GameEntity.b(GameEntity.gg()) || GameEntity.az(com/google/android/gms/games/GameEntity.getCanonicalName()))
            {
                return super.an(parcel);
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
            return new GameEntity(3, s, s1, s2, s3, s4, s5, ((Uri) (obj)), ((Uri) (obj1)), ((Uri) (obj2)), flag, flag1, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), false, false, null, null, null, false, false);
        }

        public Object createFromParcel(Parcel parcel)
        {
            return an(parcel);
        }

        GameEntityCreatorCompat()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new GameEntityCreatorCompat();
    private final String HA;
    private final String HB;
    private final String HC;
    private final String HD;
    private final String HE;
    private final Uri HF;
    private final Uri HG;
    private final Uri HH;
    private final boolean HI;
    private final boolean HJ;
    private final String HK;
    private final int HL;
    private final int HM;
    private final int HN;
    private final boolean HO;
    private final boolean HP;
    private final String HQ;
    private final String HR;
    private final String HS;
    private final boolean HT;
    private final boolean HU;
    private final int xH;
    private final String xI;

    GameEntity(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            Uri uri, Uri uri1, Uri uri2, boolean flag, boolean flag1, String s6, int j, 
            int k, int l, boolean flag2, boolean flag3, String s7, String s8, String s9, 
            boolean flag4, boolean flag5)
    {
        xH = i;
        xI = s;
        HA = s1;
        HB = s2;
        HC = s3;
        HD = s4;
        HE = s5;
        HF = uri;
        HQ = s7;
        HG = uri1;
        HR = s8;
        HH = uri2;
        HS = s9;
        HI = flag;
        HJ = flag1;
        HK = s6;
        HL = j;
        HM = k;
        HN = l;
        HO = flag2;
        HP = flag3;
        HT = flag4;
        HU = flag5;
    }

    public GameEntity(Game game)
    {
        xH = 3;
        xI = game.getApplicationId();
        HB = game.getPrimaryCategory();
        HC = game.getSecondaryCategory();
        HD = game.getDescription();
        HE = game.getDeveloperName();
        HA = game.getDisplayName();
        HF = game.getIconImageUri();
        HQ = game.getIconImageUrl();
        HG = game.getHiResImageUri();
        HR = game.getHiResImageUrl();
        HH = game.getFeaturedImageUri();
        HS = game.getFeaturedImageUrl();
        HI = game.gb();
        HJ = game.gd();
        HK = game.ge();
        HL = game.gf();
        HM = game.getAchievementTotalCount();
        HN = game.getLeaderboardCount();
        HO = game.isRealTimeMultiplayerEnabled();
        HP = game.isTurnBasedMultiplayerEnabled();
        HT = game.isMuted();
        HU = game.gc();
    }

    static int a(Game game)
    {
        return fo.hashCode(new Object[] {
            game.getApplicationId(), game.getDisplayName(), game.getPrimaryCategory(), game.getSecondaryCategory(), game.getDescription(), game.getDeveloperName(), game.getIconImageUri(), game.getHiResImageUri(), game.getFeaturedImageUri(), Boolean.valueOf(game.gb()), 
            Boolean.valueOf(game.gd()), game.ge(), Integer.valueOf(game.gf()), Integer.valueOf(game.getAchievementTotalCount()), Integer.valueOf(game.getLeaderboardCount()), Boolean.valueOf(game.isRealTimeMultiplayerEnabled()), Boolean.valueOf(game.isTurnBasedMultiplayerEnabled()), Boolean.valueOf(game.isMuted()), Boolean.valueOf(game.gc())
        });
    }

    static boolean a(Game game, Object obj)
    {
        boolean flag2 = true;
        if (obj instanceof Game) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag2;
        if (game == obj) goto _L4; else goto _L3
_L3:
        obj = (Game)obj;
        if (!fo.equal(((Game) (obj)).getApplicationId(), game.getApplicationId()) || !fo.equal(((Game) (obj)).getDisplayName(), game.getDisplayName()) || !fo.equal(((Game) (obj)).getPrimaryCategory(), game.getPrimaryCategory()) || !fo.equal(((Game) (obj)).getSecondaryCategory(), game.getSecondaryCategory()) || !fo.equal(((Game) (obj)).getDescription(), game.getDescription()) || !fo.equal(((Game) (obj)).getDeveloperName(), game.getDeveloperName()) || !fo.equal(((Game) (obj)).getIconImageUri(), game.getIconImageUri()) || !fo.equal(((Game) (obj)).getHiResImageUri(), game.getHiResImageUri()) || !fo.equal(((Game) (obj)).getFeaturedImageUri(), game.getFeaturedImageUri()) || !fo.equal(Boolean.valueOf(((Game) (obj)).gb()), Boolean.valueOf(game.gb())) || !fo.equal(Boolean.valueOf(((Game) (obj)).gd()), Boolean.valueOf(game.gd())) || !fo.equal(((Game) (obj)).ge(), game.ge()) || !fo.equal(Integer.valueOf(((Game) (obj)).gf()), Integer.valueOf(game.gf())) || !fo.equal(Integer.valueOf(((Game) (obj)).getAchievementTotalCount()), Integer.valueOf(game.getAchievementTotalCount())) || !fo.equal(Integer.valueOf(((Game) (obj)).getLeaderboardCount()), Integer.valueOf(game.getLeaderboardCount())) || !fo.equal(Boolean.valueOf(((Game) (obj)).isRealTimeMultiplayerEnabled()), Boolean.valueOf(game.isRealTimeMultiplayerEnabled())))
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag3 = ((Game) (obj)).isTurnBasedMultiplayerEnabled();
        boolean flag1;
        if (game.isTurnBasedMultiplayerEnabled() && fo.equal(Boolean.valueOf(((Game) (obj)).isMuted()), Boolean.valueOf(game.isMuted())) && fo.equal(Boolean.valueOf(((Game) (obj)).gc()), Boolean.valueOf(game.gc())))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag = flag2;
        if (fo.equal(Boolean.valueOf(flag3), Boolean.valueOf(flag1))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static boolean az(String s)
    {
        return al(s);
    }

    static String b(Game game)
    {
        return fo.e(game).a("ApplicationId", game.getApplicationId()).a("DisplayName", game.getDisplayName()).a("PrimaryCategory", game.getPrimaryCategory()).a("SecondaryCategory", game.getSecondaryCategory()).a("Description", game.getDescription()).a("DeveloperName", game.getDeveloperName()).a("IconImageUri", game.getIconImageUri()).a("IconImageUrl", game.getIconImageUrl()).a("HiResImageUri", game.getHiResImageUri()).a("HiResImageUrl", game.getHiResImageUrl()).a("FeaturedImageUri", game.getFeaturedImageUri()).a("FeaturedImageUrl", game.getFeaturedImageUrl()).a("PlayEnabledGame", Boolean.valueOf(game.gb())).a("InstanceInstalled", Boolean.valueOf(game.gd())).a("InstancePackageName", game.ge()).a("AchievementTotalCount", Integer.valueOf(game.getAchievementTotalCount())).a("LeaderboardCount", Integer.valueOf(game.getLeaderboardCount())).a("RealTimeMultiplayerEnabled", Boolean.valueOf(game.isRealTimeMultiplayerEnabled())).a("TurnBasedMultiplayerEnabled", Boolean.valueOf(game.isTurnBasedMultiplayerEnabled())).toString();
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

    public Game freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public boolean gb()
    {
        return HI;
    }

    public boolean gc()
    {
        return HU;
    }

    public boolean gd()
    {
        return HJ;
    }

    public String ge()
    {
        return HK;
    }

    public int getAchievementTotalCount()
    {
        return HM;
    }

    public String getApplicationId()
    {
        return xI;
    }

    public String getDescription()
    {
        return HD;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        gm.b(HD, chararraybuffer);
    }

    public String getDeveloperName()
    {
        return HE;
    }

    public void getDeveloperName(CharArrayBuffer chararraybuffer)
    {
        gm.b(HE, chararraybuffer);
    }

    public String getDisplayName()
    {
        return HA;
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        gm.b(HA, chararraybuffer);
    }

    public Uri getFeaturedImageUri()
    {
        return HH;
    }

    public String getFeaturedImageUrl()
    {
        return HS;
    }

    public Uri getHiResImageUri()
    {
        return HG;
    }

    public String getHiResImageUrl()
    {
        return HR;
    }

    public Uri getIconImageUri()
    {
        return HF;
    }

    public String getIconImageUrl()
    {
        return HQ;
    }

    public int getLeaderboardCount()
    {
        return HN;
    }

    public String getPrimaryCategory()
    {
        return HB;
    }

    public String getSecondaryCategory()
    {
        return HC;
    }

    public int getVersionCode()
    {
        return xH;
    }

    public int gf()
    {
        return HL;
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
        return HT;
    }

    public boolean isRealTimeMultiplayerEnabled()
    {
        return HO;
    }

    public boolean isTurnBasedMultiplayerEnabled()
    {
        return HP;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        Object obj = null;
        if (!eK())
        {
            GameEntityCreator.a(this, parcel, i);
            return;
        }
        parcel.writeString(xI);
        parcel.writeString(HA);
        parcel.writeString(HB);
        parcel.writeString(HC);
        parcel.writeString(HD);
        parcel.writeString(HE);
        String s;
        if (HF == null)
        {
            s = null;
        } else
        {
            s = HF.toString();
        }
        parcel.writeString(s);
        if (HG == null)
        {
            s = null;
        } else
        {
            s = HG.toString();
        }
        parcel.writeString(s);
        if (HH == null)
        {
            s = obj;
        } else
        {
            s = HH.toString();
        }
        parcel.writeString(s);
        if (HI)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (HJ)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeString(HK);
        parcel.writeInt(HL);
        parcel.writeInt(HM);
        parcel.writeInt(HN);
    }

}
