// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.je;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.le;

// Referenced classes of package com.google.android.gms.games.achievement:
//            Achievement, AchievementEntityCreator

public final class AchievementEntity
    implements SafeParcelable, Achievement
{

    public static final AchievementEntityCreator CREATOR = new AchievementEntityCreator();
    private final int CK;
    private final int Gt;
    private final String UO;
    private final Uri XA;
    private final String XB;
    private final int XC;
    private final String XD;
    private final PlayerEntity XE;
    private final int XF;
    private final String XG;
    private final long XH;
    private final long XI;
    private final String Xx;
    private final Uri Xy;
    private final String Xz;
    private final String mName;
    private final int mState;

    AchievementEntity(int i, String s, int j, String s1, String s2, Uri uri, String s3, 
            Uri uri1, String s4, int k, String s5, PlayerEntity playerentity, int l, int i1, 
            String s6, long l1, long l2)
    {
        CK = i;
        Xx = s;
        Gt = j;
        mName = s1;
        UO = s2;
        Xy = uri;
        Xz = s3;
        XA = uri1;
        XB = s4;
        XC = k;
        XD = s5;
        XE = playerentity;
        mState = l;
        XF = i1;
        XG = s6;
        XH = l1;
        XI = l2;
    }

    public AchievementEntity(Achievement achievement)
    {
        CK = 1;
        Xx = achievement.getAchievementId();
        Gt = achievement.getType();
        mName = achievement.getName();
        UO = achievement.getDescription();
        Xy = achievement.getUnlockedImageUri();
        Xz = achievement.getUnlockedImageUrl();
        XA = achievement.getRevealedImageUri();
        XB = achievement.getRevealedImageUrl();
        XE = (PlayerEntity)achievement.getPlayer().freeze();
        mState = achievement.getState();
        XH = achievement.getLastUpdatedTimestamp();
        XI = achievement.getXpValue();
        if (achievement.getType() == 1)
        {
            XC = achievement.getTotalSteps();
            XD = achievement.getFormattedTotalSteps();
            XF = achievement.getCurrentSteps();
            XG = achievement.getFormattedCurrentSteps();
        } else
        {
            XC = 0;
            XD = null;
            XF = 0;
            XG = null;
        }
        je.f(Xx);
        je.f(UO);
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
        return jv.hashCode(new Object[] {
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
            flag1 = jv.equal(Integer.valueOf(((Achievement) (obj)).getCurrentSteps()), Integer.valueOf(achievement.getCurrentSteps()));
            flag = jv.equal(Integer.valueOf(((Achievement) (obj)).getTotalSteps()), Integer.valueOf(achievement.getTotalSteps()));
        } else
        {
            flag = true;
            flag1 = true;
        }
        if (!jv.equal(((Achievement) (obj)).getAchievementId(), achievement.getAchievementId()) || !jv.equal(((Achievement) (obj)).getName(), achievement.getName()) || !jv.equal(Integer.valueOf(((Achievement) (obj)).getType()), Integer.valueOf(achievement.getType())) || !jv.equal(((Achievement) (obj)).getDescription(), achievement.getDescription()) || !jv.equal(Long.valueOf(((Achievement) (obj)).getXpValue()), Long.valueOf(achievement.getXpValue())) || !jv.equal(Integer.valueOf(((Achievement) (obj)).getState()), Integer.valueOf(achievement.getState())) || !jv.equal(Long.valueOf(((Achievement) (obj)).getLastUpdatedTimestamp()), Long.valueOf(achievement.getLastUpdatedTimestamp())) || !jv.equal(((Achievement) (obj)).getPlayer(), achievement.getPlayer()) || !flag1)
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
        com.google.android.gms.internal.jv.a a1 = jv.h(achievement).a("Id", achievement.getAchievementId()).a("Type", Integer.valueOf(achievement.getType())).a("Name", achievement.getName()).a("Description", achievement.getDescription()).a("Player", achievement.getPlayer()).a("State", Integer.valueOf(achievement.getState()));
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
        return Xx;
    }

    public int getCurrentSteps()
    {
        return XF;
    }

    public String getDescription()
    {
        return UO;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        le.b(UO, chararraybuffer);
    }

    public String getFormattedCurrentSteps()
    {
        return XG;
    }

    public void getFormattedCurrentSteps(CharArrayBuffer chararraybuffer)
    {
        le.b(XG, chararraybuffer);
    }

    public String getFormattedTotalSteps()
    {
        return XD;
    }

    public void getFormattedTotalSteps(CharArrayBuffer chararraybuffer)
    {
        le.b(XD, chararraybuffer);
    }

    public long getLastUpdatedTimestamp()
    {
        return XH;
    }

    public String getName()
    {
        return mName;
    }

    public void getName(CharArrayBuffer chararraybuffer)
    {
        le.b(mName, chararraybuffer);
    }

    public Player getPlayer()
    {
        return XE;
    }

    public Uri getRevealedImageUri()
    {
        return XA;
    }

    public String getRevealedImageUrl()
    {
        return XB;
    }

    public int getState()
    {
        return mState;
    }

    public int getTotalSteps()
    {
        return XC;
    }

    public int getType()
    {
        return Gt;
    }

    public Uri getUnlockedImageUri()
    {
        return Xy;
    }

    public String getUnlockedImageUrl()
    {
        return Xz;
    }

    public int getVersionCode()
    {
        return CK;
    }

    public long getXpValue()
    {
        return XI;
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
        AchievementEntityCreator.a(this, parcel, i);
    }

}
