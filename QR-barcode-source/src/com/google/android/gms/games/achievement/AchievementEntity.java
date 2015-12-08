// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.a;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.jv;

// Referenced classes of package com.google.android.gms.games.achievement:
//            Achievement, AchievementEntityCreator

public final class AchievementEntity
    implements SafeParcelable, Achievement
{

    public static final AchievementEntityCreator CREATOR = new AchievementEntityCreator();
    private final int BR;
    private final int FD;
    private final String Tr;
    private final String Wa;
    private final Uri Wb;
    private final String Wc;
    private final Uri Wd;
    private final String We;
    private final int Wf;
    private final String Wg;
    private final PlayerEntity Wh;
    private final int Wi;
    private final String Wj;
    private final long Wk;
    private final long Wl;
    private final String mName;
    private final int mState;

    AchievementEntity(int i, String s, int j, String s1, String s2, Uri uri, String s3, 
            Uri uri1, String s4, int k, String s5, PlayerEntity playerentity, int l, int i1, 
            String s6, long l1, long l2)
    {
        BR = i;
        Wa = s;
        FD = j;
        mName = s1;
        Tr = s2;
        Wb = uri;
        Wc = s3;
        Wd = uri1;
        We = s4;
        Wf = k;
        Wg = s5;
        Wh = playerentity;
        mState = l;
        Wi = i1;
        Wj = s6;
        Wk = l1;
        Wl = l2;
    }

    public AchievementEntity(Achievement achievement)
    {
        BR = 1;
        Wa = achievement.getAchievementId();
        FD = achievement.getType();
        mName = achievement.getName();
        Tr = achievement.getDescription();
        Wb = achievement.getUnlockedImageUri();
        Wc = achievement.getUnlockedImageUrl();
        Wd = achievement.getRevealedImageUri();
        We = achievement.getRevealedImageUrl();
        Wh = (PlayerEntity)achievement.getPlayer().freeze();
        mState = achievement.getState();
        Wk = achievement.getLastUpdatedTimestamp();
        Wl = achievement.getXpValue();
        if (achievement.getType() == 1)
        {
            Wf = achievement.getTotalSteps();
            Wg = achievement.getFormattedTotalSteps();
            Wi = achievement.getCurrentSteps();
            Wj = achievement.getFormattedCurrentSteps();
        } else
        {
            Wf = 0;
            Wg = null;
            Wi = 0;
            Wj = null;
        }
        com.google.android.gms.common.internal.a.f(Wa);
        com.google.android.gms.common.internal.a.f(Tr);
    }

    static int a(Achievement achievement)
    {
        int i;
        int j;
        if (achievement.getType() == 1)
        {
            j = achievement.getCurrentSteps();
            i = achievement.getTotalSteps();
        } else
        {
            i = 0;
            j = 0;
        }
        return n.hashCode(new Object[] {
            achievement.getAchievementId(), achievement.getName(), Integer.valueOf(achievement.getType()), achievement.getDescription(), Long.valueOf(achievement.getXpValue()), Integer.valueOf(achievement.getState()), Long.valueOf(achievement.getLastUpdatedTimestamp()), achievement.getPlayer(), Integer.valueOf(j), Integer.valueOf(i)
        });
    }

    static boolean a(Achievement achievement, Object obj)
    {
        boolean flag2 = true;
        if (obj instanceof Achievement) goto _L2; else goto _L1
_L1:
        boolean flag1 = false;
_L4:
        return flag1;
_L2:
        flag1 = flag2;
        if (achievement == obj) goto _L4; else goto _L3
_L3:
        obj = (Achievement)obj;
        boolean flag;
        if (achievement.getType() == 1)
        {
            flag1 = n.equal(Integer.valueOf(((Achievement) (obj)).getCurrentSteps()), Integer.valueOf(achievement.getCurrentSteps()));
            flag = n.equal(Integer.valueOf(((Achievement) (obj)).getTotalSteps()), Integer.valueOf(achievement.getTotalSteps()));
        } else
        {
            flag = true;
            flag1 = true;
        }
        if (!n.equal(((Achievement) (obj)).getAchievementId(), achievement.getAchievementId()) || !n.equal(((Achievement) (obj)).getName(), achievement.getName()) || !n.equal(Integer.valueOf(((Achievement) (obj)).getType()), Integer.valueOf(achievement.getType())) || !n.equal(((Achievement) (obj)).getDescription(), achievement.getDescription()) || !n.equal(Long.valueOf(((Achievement) (obj)).getXpValue()), Long.valueOf(achievement.getXpValue())) || !n.equal(Integer.valueOf(((Achievement) (obj)).getState()), Integer.valueOf(achievement.getState())) || !n.equal(Long.valueOf(((Achievement) (obj)).getLastUpdatedTimestamp()), Long.valueOf(achievement.getLastUpdatedTimestamp())) || !n.equal(((Achievement) (obj)).getPlayer(), achievement.getPlayer()) || !flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = flag2;
        if (flag) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(Achievement achievement)
    {
        com.google.android.gms.common.internal.n.a a1 = n.h(achievement).a("Id", achievement.getAchievementId()).a("Type", Integer.valueOf(achievement.getType())).a("Name", achievement.getName()).a("Description", achievement.getDescription()).a("Player", achievement.getPlayer()).a("State", Integer.valueOf(achievement.getState()));
        if (achievement.getType() == 1)
        {
            a1.a("CurrentSteps", Integer.valueOf(achievement.getCurrentSteps()));
            a1.a("TotalSteps", Integer.valueOf(achievement.getTotalSteps()));
        }
        return a1.toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public Achievement freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public String getAchievementId()
    {
        return Wa;
    }

    public int getCurrentSteps()
    {
        return Wi;
    }

    public String getDescription()
    {
        return Tr;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        jv.b(Tr, chararraybuffer);
    }

    public String getFormattedCurrentSteps()
    {
        return Wj;
    }

    public void getFormattedCurrentSteps(CharArrayBuffer chararraybuffer)
    {
        jv.b(Wj, chararraybuffer);
    }

    public String getFormattedTotalSteps()
    {
        return Wg;
    }

    public void getFormattedTotalSteps(CharArrayBuffer chararraybuffer)
    {
        jv.b(Wg, chararraybuffer);
    }

    public long getLastUpdatedTimestamp()
    {
        return Wk;
    }

    public String getName()
    {
        return mName;
    }

    public void getName(CharArrayBuffer chararraybuffer)
    {
        jv.b(mName, chararraybuffer);
    }

    public Player getPlayer()
    {
        return Wh;
    }

    public Uri getRevealedImageUri()
    {
        return Wd;
    }

    public String getRevealedImageUrl()
    {
        return We;
    }

    public int getState()
    {
        return mState;
    }

    public int getTotalSteps()
    {
        return Wf;
    }

    public int getType()
    {
        return FD;
    }

    public Uri getUnlockedImageUri()
    {
        return Wb;
    }

    public String getUnlockedImageUrl()
    {
        return Wc;
    }

    public int getVersionCode()
    {
        return BR;
    }

    public long getXpValue()
    {
        return Wl;
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
        com.google.android.gms.games.achievement.AchievementEntityCreator.a(this, parcel, i);
    }

}
