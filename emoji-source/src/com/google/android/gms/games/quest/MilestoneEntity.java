// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.quest;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hk;

// Referenced classes of package com.google.android.gms.games.quest:
//            Milestone, MilestoneEntityCreator

public final class MilestoneEntity
    implements SafeParcelable, Milestone
{

    public static final MilestoneEntityCreator CREATOR = new MilestoneEntityCreator();
    private final String Ni;
    private final String Ot;
    private final long TM;
    private final long TN;
    private final byte TO[];
    private final int mState;
    private final int xM;

    MilestoneEntity(int i, String s, long l, long l1, byte abyte0[], 
            int j, String s1)
    {
        xM = i;
        Ot = s;
        TM = l;
        TN = l1;
        TO = abyte0;
        mState = j;
        Ni = s1;
    }

    public MilestoneEntity(Milestone milestone)
    {
        xM = 4;
        Ot = milestone.getMilestoneId();
        TM = milestone.getCurrentProgress();
        TN = milestone.getTargetProgress();
        mState = milestone.getState();
        Ni = milestone.getEventId();
        milestone = milestone.getCompletionRewardData();
        if (milestone == null)
        {
            TO = null;
            return;
        } else
        {
            TO = new byte[milestone.length];
            System.arraycopy(milestone, 0, TO, 0, milestone.length);
            return;
        }
    }

    static int a(Milestone milestone)
    {
        return hk.hashCode(new Object[] {
            milestone.getMilestoneId(), Long.valueOf(milestone.getCurrentProgress()), Long.valueOf(milestone.getTargetProgress()), Integer.valueOf(milestone.getState()), milestone.getEventId()
        });
    }

    static boolean a(Milestone milestone, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof Milestone) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (milestone == obj) goto _L4; else goto _L3
_L3:
        obj = (Milestone)obj;
        if (!hk.equal(((Milestone) (obj)).getMilestoneId(), milestone.getMilestoneId()) || !hk.equal(Long.valueOf(((Milestone) (obj)).getCurrentProgress()), Long.valueOf(milestone.getCurrentProgress())) || !hk.equal(Long.valueOf(((Milestone) (obj)).getTargetProgress()), Long.valueOf(milestone.getTargetProgress())) || !hk.equal(Integer.valueOf(((Milestone) (obj)).getState()), Integer.valueOf(milestone.getState())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hk.equal(((Milestone) (obj)).getEventId(), milestone.getEventId())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(Milestone milestone)
    {
        return hk.e(milestone).a("MilestoneId", milestone.getMilestoneId()).a("CurrentProgress", Long.valueOf(milestone.getCurrentProgress())).a("TargetProgress", Long.valueOf(milestone.getTargetProgress())).a("State", Integer.valueOf(milestone.getState())).a("CompletionRewardData", milestone.getCompletionRewardData()).a("EventId", milestone.getEventId()).toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public Milestone freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public byte[] getCompletionRewardData()
    {
        return TO;
    }

    public long getCurrentProgress()
    {
        return TM;
    }

    public String getEventId()
    {
        return Ni;
    }

    public String getMilestoneId()
    {
        return Ot;
    }

    public int getState()
    {
        return mState;
    }

    public long getTargetProgress()
    {
        return TN;
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

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        MilestoneEntityCreator.a(this, parcel, i);
    }

}
