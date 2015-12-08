// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.hk;
import com.google.android.gms.internal.ik;

// Referenced classes of package com.google.android.gms.games:
//            Game, GameEntityCreator

public final class GameEntity extends GamesDowngradeableSafeParcel
    implements Game
{
    static final class GameEntityCreatorCompat extends GameEntityCreator
    {

        public GameEntity bd(Parcel parcel)
        {
            if (GameEntity.b(GameEntity.gR()) || GameEntity.aQ(com/google/android/gms/games/GameEntity.getCanonicalName()))
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
    private final String Ln;
    private final boolean MA;
    private final boolean MB;
    private final String MC;
    private final String MD;
    private final String ME;
    private final boolean MF;
    private final boolean MG;
    private final boolean MH;
    private final String Mn;
    private final String Mo;
    private final String Mp;
    private final String Mq;
    private final Uri Mr;
    private final Uri Ms;
    private final Uri Mt;
    private final boolean Mu;
    private final boolean Mv;
    private final String Mw;
    private final int Mx;
    private final int My;
    private final int Mz;
    private final int xM;
    private final String zP;

    GameEntity(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            Uri uri, Uri uri1, Uri uri2, boolean flag, boolean flag1, String s6, int j, 
            int k, int l, boolean flag2, boolean flag3, String s7, String s8, String s9, 
            boolean flag4, boolean flag5, boolean flag6)
    {
        xM = i;
        zP = s;
        Ln = s1;
        Mn = s2;
        Mo = s3;
        Mp = s4;
        Mq = s5;
        Mr = uri;
        MC = s7;
        Ms = uri1;
        MD = s8;
        Mt = uri2;
        ME = s9;
        Mu = flag;
        Mv = flag1;
        Mw = s6;
        Mx = j;
        My = k;
        Mz = l;
        MA = flag2;
        MB = flag3;
        MF = flag4;
        MG = flag5;
        MH = flag6;
    }

    public GameEntity(Game game)
    {
        xM = 4;
        zP = game.getApplicationId();
        Mn = game.getPrimaryCategory();
        Mo = game.getSecondaryCategory();
        Mp = game.getDescription();
        Mq = game.getDeveloperName();
        Ln = game.getDisplayName();
        Mr = game.getIconImageUri();
        MC = game.getIconImageUrl();
        Ms = game.getHiResImageUri();
        MD = game.getHiResImageUrl();
        Mt = game.getFeaturedImageUri();
        ME = game.getFeaturedImageUrl();
        Mu = game.gM();
        Mv = game.gO();
        Mw = game.gP();
        Mx = game.gQ();
        My = game.getAchievementTotalCount();
        Mz = game.getLeaderboardCount();
        MA = game.isRealTimeMultiplayerEnabled();
        MB = game.isTurnBasedMultiplayerEnabled();
        MF = game.isMuted();
        MG = game.gN();
        MH = game.areSnapshotsEnabled();
    }

    static int a(Game game)
    {
        return hk.hashCode(new Object[] {
            game.getApplicationId(), game.getDisplayName(), game.getPrimaryCategory(), game.getSecondaryCategory(), game.getDescription(), game.getDeveloperName(), game.getIconImageUri(), game.getHiResImageUri(), game.getFeaturedImageUri(), Boolean.valueOf(game.gM()), 
            Boolean.valueOf(game.gO()), game.gP(), Integer.valueOf(game.gQ()), Integer.valueOf(game.getAchievementTotalCount()), Integer.valueOf(game.getLeaderboardCount()), Boolean.valueOf(game.isRealTimeMultiplayerEnabled()), Boolean.valueOf(game.isTurnBasedMultiplayerEnabled()), Boolean.valueOf(game.isMuted()), Boolean.valueOf(game.gN()), Boolean.valueOf(game.areSnapshotsEnabled())
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
        if (!hk.equal(((Game) (obj)).getApplicationId(), game.getApplicationId()) || !hk.equal(((Game) (obj)).getDisplayName(), game.getDisplayName()) || !hk.equal(((Game) (obj)).getPrimaryCategory(), game.getPrimaryCategory()) || !hk.equal(((Game) (obj)).getSecondaryCategory(), game.getSecondaryCategory()) || !hk.equal(((Game) (obj)).getDescription(), game.getDescription()) || !hk.equal(((Game) (obj)).getDeveloperName(), game.getDeveloperName()) || !hk.equal(((Game) (obj)).getIconImageUri(), game.getIconImageUri()) || !hk.equal(((Game) (obj)).getHiResImageUri(), game.getHiResImageUri()) || !hk.equal(((Game) (obj)).getFeaturedImageUri(), game.getFeaturedImageUri()) || !hk.equal(Boolean.valueOf(((Game) (obj)).gM()), Boolean.valueOf(game.gM())) || !hk.equal(Boolean.valueOf(((Game) (obj)).gO()), Boolean.valueOf(game.gO())) || !hk.equal(((Game) (obj)).gP(), game.gP()) || !hk.equal(Integer.valueOf(((Game) (obj)).gQ()), Integer.valueOf(game.gQ())) || !hk.equal(Integer.valueOf(((Game) (obj)).getAchievementTotalCount()), Integer.valueOf(game.getAchievementTotalCount())) || !hk.equal(Integer.valueOf(((Game) (obj)).getLeaderboardCount()), Integer.valueOf(game.getLeaderboardCount())) || !hk.equal(Boolean.valueOf(((Game) (obj)).isRealTimeMultiplayerEnabled()), Boolean.valueOf(game.isRealTimeMultiplayerEnabled())))
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag2 = ((Game) (obj)).isTurnBasedMultiplayerEnabled();
        if (game.isTurnBasedMultiplayerEnabled() && hk.equal(Boolean.valueOf(((Game) (obj)).isMuted()), Boolean.valueOf(game.isMuted())) && hk.equal(Boolean.valueOf(((Game) (obj)).gN()), Boolean.valueOf(game.gN())))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!hk.equal(Boolean.valueOf(flag2), Boolean.valueOf(flag)))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hk.equal(Boolean.valueOf(((Game) (obj)).areSnapshotsEnabled()), Boolean.valueOf(game.areSnapshotsEnabled()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static boolean aQ(String s)
    {
        return aA(s);
    }

    static String b(Game game)
    {
        return hk.e(game).a("ApplicationId", game.getApplicationId()).a("DisplayName", game.getDisplayName()).a("PrimaryCategory", game.getPrimaryCategory()).a("SecondaryCategory", game.getSecondaryCategory()).a("Description", game.getDescription()).a("DeveloperName", game.getDeveloperName()).a("IconImageUri", game.getIconImageUri()).a("IconImageUrl", game.getIconImageUrl()).a("HiResImageUri", game.getHiResImageUri()).a("HiResImageUrl", game.getHiResImageUrl()).a("FeaturedImageUri", game.getFeaturedImageUri()).a("FeaturedImageUrl", game.getFeaturedImageUrl()).a("PlayEnabledGame", Boolean.valueOf(game.gM())).a("InstanceInstalled", Boolean.valueOf(game.gO())).a("InstancePackageName", game.gP()).a("AchievementTotalCount", Integer.valueOf(game.getAchievementTotalCount())).a("LeaderboardCount", Integer.valueOf(game.getLeaderboardCount())).a("RealTimeMultiplayerEnabled", Boolean.valueOf(game.isRealTimeMultiplayerEnabled())).a("TurnBasedMultiplayerEnabled", Boolean.valueOf(game.isTurnBasedMultiplayerEnabled())).a("AreSnapshotsEnabled", Boolean.valueOf(game.areSnapshotsEnabled())).toString();
    }

    static boolean b(Integer integer)
    {
        return c(integer);
    }

    static Integer gR()
    {
        return fq();
    }

    public boolean areSnapshotsEnabled()
    {
        return MH;
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

    public boolean gM()
    {
        return Mu;
    }

    public boolean gN()
    {
        return MG;
    }

    public boolean gO()
    {
        return Mv;
    }

    public String gP()
    {
        return Mw;
    }

    public int gQ()
    {
        return Mx;
    }

    public int getAchievementTotalCount()
    {
        return My;
    }

    public String getApplicationId()
    {
        return zP;
    }

    public String getDescription()
    {
        return Mp;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        ik.b(Mp, chararraybuffer);
    }

    public String getDeveloperName()
    {
        return Mq;
    }

    public void getDeveloperName(CharArrayBuffer chararraybuffer)
    {
        ik.b(Mq, chararraybuffer);
    }

    public String getDisplayName()
    {
        return Ln;
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        ik.b(Ln, chararraybuffer);
    }

    public Uri getFeaturedImageUri()
    {
        return Mt;
    }

    public String getFeaturedImageUrl()
    {
        return ME;
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

    public int getLeaderboardCount()
    {
        return Mz;
    }

    public String getPrimaryCategory()
    {
        return Mn;
    }

    public String getSecondaryCategory()
    {
        return Mo;
    }

    public int getVersionCode()
    {
        return xM;
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
        return MF;
    }

    public boolean isRealTimeMultiplayerEnabled()
    {
        return MA;
    }

    public boolean isTurnBasedMultiplayerEnabled()
    {
        return MB;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        Object obj = null;
        if (!fr())
        {
            GameEntityCreator.a(this, parcel, i);
            return;
        }
        parcel.writeString(zP);
        parcel.writeString(Ln);
        parcel.writeString(Mn);
        parcel.writeString(Mo);
        parcel.writeString(Mp);
        parcel.writeString(Mq);
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
            s = null;
        } else
        {
            s = Ms.toString();
        }
        parcel.writeString(s);
        if (Mt == null)
        {
            s = obj;
        } else
        {
            s = Mt.toString();
        }
        parcel.writeString(s);
        if (Mu)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (Mv)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeString(Mw);
        parcel.writeInt(Mx);
        parcel.writeInt(My);
        parcel.writeInt(Mz);
    }

}
