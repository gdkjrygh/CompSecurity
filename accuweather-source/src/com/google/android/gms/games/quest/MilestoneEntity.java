// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.quest;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hl;

// Referenced classes of package com.google.android.gms.games.quest:
//            Milestone, MilestoneEntityCreator

public final class MilestoneEntity
    implements SafeParcelable, Milestone
{

    public static final MilestoneEntityCreator CREATOR = new MilestoneEntityCreator();
    private final String Nf;
    private final String Oq;
    private final long TJ;
    private final long TK;
    private final byte TL[];
    private final int mState;
    private final int xJ;

    MilestoneEntity(int i, String s, long l, long l1, byte abyte0[], 
            int j, String s1)
    {
        xJ = i;
        Oq = s;
        TJ = l;
        TK = l1;
        TL = abyte0;
        mState = j;
        Nf = s1;
    }

    public MilestoneEntity(Milestone milestone)
    {
        xJ = 4;
        Oq = milestone.getMilestoneId();
        TJ = milestone.getCurrentProgress();
        TK = milestone.getTargetProgress();
        mState = milestone.getState();
        Nf = milestone.getEventId();
        milestone = milestone.getCompletionRewardData();
        if (milestone == null)
        {
            TL = null;
            return;
        } else
        {
            TL = new byte[milestone.length];
            System.arraycopy(milestone, 0, TL, 0, milestone.length);
            return;
        }
    }

    static int a(Milestone milestone)
    {
        return hl.hashCode(new Object[] {
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
        if (!hl.equal(((Milestone) (obj)).getMilestoneId(), milestone.getMilestoneId()) || !hl.equal(Long.valueOf(((Milestone) (obj)).getCurrentProgress()), Long.valueOf(milestone.getCurrentProgress())) || !hl.equal(Long.valueOf(((Milestone) (obj)).getTargetProgress()), Long.valueOf(milestone.getTargetProgress())) || !hl.equal(Integer.valueOf(((Milestone) (obj)).getState()), Integer.valueOf(milestone.getState())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hl.equal(((Milestone) (obj)).getEventId(), milestone.getEventId())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(Milestone milestone)
    {
        return hl.e(milestone).a("MilestoneId", milestone.getMilestoneId()).a("CurrentProgress", Long.valueOf(milestone.getCurrentProgress())).a("TargetProgress", Long.valueOf(milestone.getTargetProgress())).a("State", Integer.valueOf(milestone.getState())).a("CompletionRewardData", milestone.getCompletionRewardData()).a("EventId", milestone.getEventId()).toString();
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
        return TL;
    }

    public long getCurrentProgress()
    {
        return TJ;
    }

    public String getEventId()
    {
        return Nf;
    }

    public String getMilestoneId()
    {
        return Oq;
    }

    public int getState()
    {
        return mState;
    }

    public long getTargetProgress()
    {
        return TK;
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

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        MilestoneEntityCreator.a(this, parcel, i);
    }

}
