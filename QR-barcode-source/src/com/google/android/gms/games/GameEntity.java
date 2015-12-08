// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.jv;

// Referenced classes of package com.google.android.gms.games:
//            Game, GameEntityCreator

public final class GameEntity extends GamesDowngradeableSafeParcel
    implements Game
{
    static final class GameEntityCreatorCompat extends GameEntityCreator
    {

        public GameEntity cd(Parcel parcel)
        {
            if (GameEntity.b(GameEntity.jT()) || GameEntity.bw(com/google/android/gms/games/GameEntity.getCanonicalName()))
            {
                return super.cd(parcel);
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
            return cd(parcel);
        }

        GameEntityCreatorCompat()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new GameEntityCreatorCompat();
    private final int BR;
    private final String Ez;
    private final String NH;
    private final String Tr;
    private final String Ve;
    private final String Vf;
    private final String Vg;
    private final Uri Vh;
    private final Uri Vi;
    private final Uri Vj;
    private final boolean Vk;
    private final boolean Vl;
    private final String Vm;
    private final int Vn;
    private final int Vo;
    private final int Vp;
    private final boolean Vq;
    private final boolean Vr;
    private final String Vs;
    private final String Vt;
    private final String Vu;
    private final boolean Vv;
    private final boolean Vw;
    private final boolean Vx;
    private final String Vy;

    GameEntity(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            Uri uri, Uri uri1, Uri uri2, boolean flag, boolean flag1, String s6, int j, 
            int k, int l, boolean flag2, boolean flag3, String s7, String s8, String s9, 
            boolean flag4, boolean flag5, boolean flag6, String s10)
    {
        BR = i;
        Ez = s;
        NH = s1;
        Ve = s2;
        Vf = s3;
        Tr = s4;
        Vg = s5;
        Vh = uri;
        Vs = s7;
        Vi = uri1;
        Vt = s8;
        Vj = uri2;
        Vu = s9;
        Vk = flag;
        Vl = flag1;
        Vm = s6;
        Vn = j;
        Vo = k;
        Vp = l;
        Vq = flag2;
        Vr = flag3;
        Vv = flag4;
        Vw = flag5;
        Vx = flag6;
        Vy = s10;
    }

    public GameEntity(Game game)
    {
        BR = 5;
        Ez = game.getApplicationId();
        Ve = game.getPrimaryCategory();
        Vf = game.getSecondaryCategory();
        Tr = game.getDescription();
        Vg = game.getDeveloperName();
        NH = game.getDisplayName();
        Vh = game.getIconImageUri();
        Vs = game.getIconImageUrl();
        Vi = game.getHiResImageUri();
        Vt = game.getHiResImageUrl();
        Vj = game.getFeaturedImageUri();
        Vu = game.getFeaturedImageUrl();
        Vk = game.jO();
        Vl = game.jQ();
        Vm = game.jR();
        Vn = game.jS();
        Vo = game.getAchievementTotalCount();
        Vp = game.getLeaderboardCount();
        Vq = game.isRealTimeMultiplayerEnabled();
        Vr = game.isTurnBasedMultiplayerEnabled();
        Vv = game.isMuted();
        Vw = game.jP();
        Vx = game.areSnapshotsEnabled();
        Vy = game.getThemeColor();
    }

    static int a(Game game)
    {
        return n.hashCode(new Object[] {
            game.getApplicationId(), game.getDisplayName(), game.getPrimaryCategory(), game.getSecondaryCategory(), game.getDescription(), game.getDeveloperName(), game.getIconImageUri(), game.getHiResImageUri(), game.getFeaturedImageUri(), Boolean.valueOf(game.jO()), 
            Boolean.valueOf(game.jQ()), game.jR(), Integer.valueOf(game.jS()), Integer.valueOf(game.getAchievementTotalCount()), Integer.valueOf(game.getLeaderboardCount()), Boolean.valueOf(game.isRealTimeMultiplayerEnabled()), Boolean.valueOf(game.isTurnBasedMultiplayerEnabled()), Boolean.valueOf(game.isMuted()), Boolean.valueOf(game.jP()), Boolean.valueOf(game.areSnapshotsEnabled()), 
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
        if (!n.equal(((Game) (obj)).getApplicationId(), game.getApplicationId()) || !n.equal(((Game) (obj)).getDisplayName(), game.getDisplayName()) || !n.equal(((Game) (obj)).getPrimaryCategory(), game.getPrimaryCategory()) || !n.equal(((Game) (obj)).getSecondaryCategory(), game.getSecondaryCategory()) || !n.equal(((Game) (obj)).getDescription(), game.getDescription()) || !n.equal(((Game) (obj)).getDeveloperName(), game.getDeveloperName()) || !n.equal(((Game) (obj)).getIconImageUri(), game.getIconImageUri()) || !n.equal(((Game) (obj)).getHiResImageUri(), game.getHiResImageUri()) || !n.equal(((Game) (obj)).getFeaturedImageUri(), game.getFeaturedImageUri()) || !n.equal(Boolean.valueOf(((Game) (obj)).jO()), Boolean.valueOf(game.jO())) || !n.equal(Boolean.valueOf(((Game) (obj)).jQ()), Boolean.valueOf(game.jQ())) || !n.equal(((Game) (obj)).jR(), game.jR()) || !n.equal(Integer.valueOf(((Game) (obj)).jS()), Integer.valueOf(game.jS())) || !n.equal(Integer.valueOf(((Game) (obj)).getAchievementTotalCount()), Integer.valueOf(game.getAchievementTotalCount())) || !n.equal(Integer.valueOf(((Game) (obj)).getLeaderboardCount()), Integer.valueOf(game.getLeaderboardCount())) || !n.equal(Boolean.valueOf(((Game) (obj)).isRealTimeMultiplayerEnabled()), Boolean.valueOf(game.isRealTimeMultiplayerEnabled())))
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag2 = ((Game) (obj)).isTurnBasedMultiplayerEnabled();
        if (game.isTurnBasedMultiplayerEnabled() && n.equal(Boolean.valueOf(((Game) (obj)).isMuted()), Boolean.valueOf(game.isMuted())) && n.equal(Boolean.valueOf(((Game) (obj)).jP()), Boolean.valueOf(game.jP())))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!n.equal(Boolean.valueOf(flag2), Boolean.valueOf(flag)) || !n.equal(Boolean.valueOf(((Game) (obj)).areSnapshotsEnabled()), Boolean.valueOf(game.areSnapshotsEnabled())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (n.equal(((Game) (obj)).getThemeColor(), game.getThemeColor())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(Game game)
    {
        return n.h(game).a("ApplicationId", game.getApplicationId()).a("DisplayName", game.getDisplayName()).a("PrimaryCategory", game.getPrimaryCategory()).a("SecondaryCategory", game.getSecondaryCategory()).a("Description", game.getDescription()).a("DeveloperName", game.getDeveloperName()).a("IconImageUri", game.getIconImageUri()).a("IconImageUrl", game.getIconImageUrl()).a("HiResImageUri", game.getHiResImageUri()).a("HiResImageUrl", game.getHiResImageUrl()).a("FeaturedImageUri", game.getFeaturedImageUri()).a("FeaturedImageUrl", game.getFeaturedImageUrl()).a("PlayEnabledGame", Boolean.valueOf(game.jO())).a("InstanceInstalled", Boolean.valueOf(game.jQ())).a("InstancePackageName", game.jR()).a("AchievementTotalCount", Integer.valueOf(game.getAchievementTotalCount())).a("LeaderboardCount", Integer.valueOf(game.getLeaderboardCount())).a("RealTimeMultiplayerEnabled", Boolean.valueOf(game.isRealTimeMultiplayerEnabled())).a("TurnBasedMultiplayerEnabled", Boolean.valueOf(game.isTurnBasedMultiplayerEnabled())).a("AreSnapshotsEnabled", Boolean.valueOf(game.areSnapshotsEnabled())).a("ThemeColor", game.getThemeColor()).toString();
    }

    static boolean b(Integer integer)
    {
        return c(integer);
    }

    static boolean bw(String s)
    {
        return aV(s);
    }

    static Integer jT()
    {
        return gP();
    }

    public boolean areSnapshotsEnabled()
    {
        return Vx;
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
        return Vo;
    }

    public String getApplicationId()
    {
        return Ez;
    }

    public String getDescription()
    {
        return Tr;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        jv.b(Tr, chararraybuffer);
    }

    public String getDeveloperName()
    {
        return Vg;
    }

    public void getDeveloperName(CharArrayBuffer chararraybuffer)
    {
        jv.b(Vg, chararraybuffer);
    }

    public String getDisplayName()
    {
        return NH;
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        jv.b(NH, chararraybuffer);
    }

    public Uri getFeaturedImageUri()
    {
        return Vj;
    }

    public String getFeaturedImageUrl()
    {
        return Vu;
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

    public int getLeaderboardCount()
    {
        return Vp;
    }

    public String getPrimaryCategory()
    {
        return Ve;
    }

    public String getSecondaryCategory()
    {
        return Vf;
    }

    public String getThemeColor()
    {
        return Vy;
    }

    public int getVersionCode()
    {
        return BR;
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
        return Vv;
    }

    public boolean isRealTimeMultiplayerEnabled()
    {
        return Vq;
    }

    public boolean isTurnBasedMultiplayerEnabled()
    {
        return Vr;
    }

    public boolean jO()
    {
        return Vk;
    }

    public boolean jP()
    {
        return Vw;
    }

    public boolean jQ()
    {
        return Vl;
    }

    public String jR()
    {
        return Vm;
    }

    public int jS()
    {
        return Vn;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        Object obj = null;
        if (!gQ())
        {
            GameEntityCreator.a(this, parcel, i);
            return;
        }
        parcel.writeString(Ez);
        parcel.writeString(NH);
        parcel.writeString(Ve);
        parcel.writeString(Vf);
        parcel.writeString(Tr);
        parcel.writeString(Vg);
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
            s = null;
        } else
        {
            s = Vi.toString();
        }
        parcel.writeString(s);
        if (Vj == null)
        {
            s = obj;
        } else
        {
            s = Vj.toString();
        }
        parcel.writeString(s);
        if (Vk)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (Vl)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeString(Vm);
        parcel.writeInt(Vn);
        parcel.writeInt(Vo);
        parcel.writeInt(Vp);
    }

}
