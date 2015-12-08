// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.en;

// Referenced classes of package com.google.android.gms.games:
//            Game, a

public final class GameEntity extends en
    implements Game
{
    static final class a extends com.google.android.gms.games.a
    {

        public Object createFromParcel(Parcel parcel)
        {
            return t(parcel);
        }

        public GameEntity t(Parcel parcel)
        {
            if (GameEntity.b(GameEntity.bQ()) || GameEntity.J(com/google/android/gms/games/GameEntity.getCanonicalName()))
            {
                return super.t(parcel);
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
            return new GameEntity(1, s, s1, s2, s3, s4, s5, ((Uri) (obj)), ((Uri) (obj1)), ((Uri) (obj2)), flag, flag1, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        a()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final int iM;
    private final String mk;
    private final String ml;
    private final String mm;
    private final String mn;
    private final String mo;
    private final String mp;
    private final Uri mq;
    private final Uri mr;
    private final Uri ms;
    private final boolean mt;
    private final boolean mu;
    private final String mv;
    private final int mw;
    private final int mx;
    private final int my;

    GameEntity(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            Uri uri, Uri uri1, Uri uri2, boolean flag, boolean flag1, String s6, int j, 
            int k, int l)
    {
        iM = i;
        mk = s;
        ml = s1;
        mm = s2;
        mn = s3;
        mo = s4;
        mp = s5;
        mq = uri;
        mr = uri1;
        ms = uri2;
        mt = flag;
        mu = flag1;
        mv = s6;
        mw = j;
        mx = k;
        my = l;
    }

    public GameEntity(Game game)
    {
        iM = 1;
        mk = game.getApplicationId();
        mm = game.getPrimaryCategory();
        mn = game.getSecondaryCategory();
        mo = game.getDescription();
        mp = game.getDeveloperName();
        ml = game.getDisplayName();
        mq = game.getIconImageUri();
        mr = game.getHiResImageUri();
        ms = game.getFeaturedImageUri();
        mt = game.isPlayEnabledGame();
        mu = game.isInstanceInstalled();
        mv = game.getInstancePackageName();
        mw = game.getGameplayAclStatus();
        mx = game.getAchievementTotalCount();
        my = game.getLeaderboardCount();
    }

    static boolean J(String s)
    {
        return y(s);
    }

    static int a(Game game)
    {
        return dl.hashCode(new Object[] {
            game.getApplicationId(), game.getDisplayName(), game.getPrimaryCategory(), game.getSecondaryCategory(), game.getDescription(), game.getDeveloperName(), game.getIconImageUri(), game.getHiResImageUri(), game.getFeaturedImageUri(), Boolean.valueOf(game.isPlayEnabledGame()), 
            Boolean.valueOf(game.isInstanceInstalled()), game.getInstancePackageName(), Integer.valueOf(game.getGameplayAclStatus()), Integer.valueOf(game.getAchievementTotalCount()), Integer.valueOf(game.getLeaderboardCount())
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
        if (!dl.equal(((Game) (obj)).getApplicationId(), game.getApplicationId()) || !dl.equal(((Game) (obj)).getDisplayName(), game.getDisplayName()) || !dl.equal(((Game) (obj)).getPrimaryCategory(), game.getPrimaryCategory()) || !dl.equal(((Game) (obj)).getSecondaryCategory(), game.getSecondaryCategory()) || !dl.equal(((Game) (obj)).getDescription(), game.getDescription()) || !dl.equal(((Game) (obj)).getDeveloperName(), game.getDeveloperName()) || !dl.equal(((Game) (obj)).getIconImageUri(), game.getIconImageUri()) || !dl.equal(((Game) (obj)).getHiResImageUri(), game.getHiResImageUri()) || !dl.equal(((Game) (obj)).getFeaturedImageUri(), game.getFeaturedImageUri()) || !dl.equal(Boolean.valueOf(((Game) (obj)).isPlayEnabledGame()), Boolean.valueOf(game.isPlayEnabledGame())) || !dl.equal(Boolean.valueOf(((Game) (obj)).isInstanceInstalled()), Boolean.valueOf(game.isInstanceInstalled())) || !dl.equal(((Game) (obj)).getInstancePackageName(), game.getInstancePackageName()) || !dl.equal(Integer.valueOf(((Game) (obj)).getGameplayAclStatus()), Integer.valueOf(game.getGameplayAclStatus())) || !dl.equal(Integer.valueOf(((Game) (obj)).getAchievementTotalCount()), Integer.valueOf(game.getAchievementTotalCount())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (dl.equal(Integer.valueOf(((Game) (obj)).getLeaderboardCount()), Integer.valueOf(game.getLeaderboardCount()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(Game game)
    {
        return dl.d(game).a("ApplicationId", game.getApplicationId()).a("DisplayName", game.getDisplayName()).a("PrimaryCategory", game.getPrimaryCategory()).a("SecondaryCategory", game.getSecondaryCategory()).a("Description", game.getDescription()).a("DeveloperName", game.getDeveloperName()).a("IconImageUri", game.getIconImageUri()).a("HiResImageUri", game.getHiResImageUri()).a("FeaturedImageUri", game.getFeaturedImageUri()).a("PlayEnabledGame", Boolean.valueOf(game.isPlayEnabledGame())).a("InstanceInstalled", Boolean.valueOf(game.isInstanceInstalled())).a("InstancePackageName", game.getInstancePackageName()).a("GameplayAclStatus", Integer.valueOf(game.getGameplayAclStatus())).a("AchievementTotalCount", Integer.valueOf(game.getAchievementTotalCount())).a("LeaderboardCount", Integer.valueOf(game.getLeaderboardCount())).toString();
    }

    static boolean b(Integer integer)
    {
        return c(integer);
    }

    static Integer bQ()
    {
        return aW();
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
        return mx;
    }

    public String getApplicationId()
    {
        return mk;
    }

    public String getDescription()
    {
        return mo;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        eg.b(mo, chararraybuffer);
    }

    public String getDeveloperName()
    {
        return mp;
    }

    public void getDeveloperName(CharArrayBuffer chararraybuffer)
    {
        eg.b(mp, chararraybuffer);
    }

    public String getDisplayName()
    {
        return ml;
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        eg.b(ml, chararraybuffer);
    }

    public Uri getFeaturedImageUri()
    {
        return ms;
    }

    public int getGameplayAclStatus()
    {
        return mw;
    }

    public Uri getHiResImageUri()
    {
        return mr;
    }

    public Uri getIconImageUri()
    {
        return mq;
    }

    public String getInstancePackageName()
    {
        return mv;
    }

    public int getLeaderboardCount()
    {
        return my;
    }

    public String getPrimaryCategory()
    {
        return mm;
    }

    public String getSecondaryCategory()
    {
        return mn;
    }

    public int getVersionCode()
    {
        return iM;
    }

    public int hashCode()
    {
        return a(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public boolean isInstanceInstalled()
    {
        return mu;
    }

    public boolean isPlayEnabledGame()
    {
        return mt;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        Object obj = null;
        if (!aX())
        {
            com.google.android.gms.games.a.a(this, parcel, i);
            return;
        }
        parcel.writeString(mk);
        parcel.writeString(ml);
        parcel.writeString(mm);
        parcel.writeString(mn);
        parcel.writeString(mo);
        parcel.writeString(mp);
        String s;
        if (mq == null)
        {
            s = null;
        } else
        {
            s = mq.toString();
        }
        parcel.writeString(s);
        if (mr == null)
        {
            s = null;
        } else
        {
            s = mr.toString();
        }
        parcel.writeString(s);
        if (ms == null)
        {
            s = obj;
        } else
        {
            s = ms.toString();
        }
        parcel.writeString(s);
        if (mt)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (mu)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeString(mv);
        parcel.writeInt(mw);
        parcel.writeInt(mx);
        parcel.writeInt(my);
    }

}
