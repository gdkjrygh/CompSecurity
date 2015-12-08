// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.quest;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.quest:
//            Milestone, MilestoneEntityCreator

public final class MilestoneEntity
    implements SafeParcelable, Milestone
{

    public static final android.os.Parcelable.Creator CREATOR = new MilestoneEntityCreator();
    final byte mCompletionBlob[];
    final long mCurrentProgress;
    final String mEventId;
    final String mMilestoneId;
    final int mState;
    final long mTargetProgress;
    final int mVersionCode;

    MilestoneEntity(int i, String s, long l, long l1, byte abyte0[], 
            int j, String s1)
    {
        mVersionCode = i;
        mMilestoneId = s;
        mCurrentProgress = l;
        mTargetProgress = l1;
        mCompletionBlob = abyte0;
        mState = j;
        mEventId = s1;
    }

    public MilestoneEntity(Milestone milestone)
    {
        mVersionCode = 4;
        mMilestoneId = milestone.getMilestoneId();
        mCurrentProgress = milestone.getCurrentProgress();
        mTargetProgress = milestone.getTargetProgress();
        mState = milestone.getState();
        mEventId = milestone.getEventId();
        milestone = milestone.getCompletionRewardData();
        if (milestone == null)
        {
            mCompletionBlob = null;
            return;
        } else
        {
            mCompletionBlob = new byte[milestone.length];
            System.arraycopy(milestone, 0, mCompletionBlob, 0, milestone.length);
            return;
        }
    }

    static boolean equals(Milestone milestone, Object obj)
    {
        if (obj instanceof Milestone)
        {
            if (milestone == obj)
            {
                return true;
            }
            obj = (Milestone)obj;
            if (Objects.equal(((Milestone) (obj)).getMilestoneId(), milestone.getMilestoneId()) && Objects.equal(Long.valueOf(((Milestone) (obj)).getCurrentProgress()), Long.valueOf(milestone.getCurrentProgress())) && Objects.equal(Long.valueOf(((Milestone) (obj)).getTargetProgress()), Long.valueOf(milestone.getTargetProgress())) && Objects.equal(Integer.valueOf(((Milestone) (obj)).getState()), Integer.valueOf(milestone.getState())) && Objects.equal(((Milestone) (obj)).getEventId(), milestone.getEventId()))
            {
                return true;
            }
        }
        return false;
    }

    static int hashCode(Milestone milestone)
    {
        return Arrays.hashCode(new Object[] {
            milestone.getMilestoneId(), Long.valueOf(milestone.getCurrentProgress()), Long.valueOf(milestone.getTargetProgress()), Integer.valueOf(milestone.getState()), milestone.getEventId()
        });
    }

    static String toString(Milestone milestone)
    {
        return Objects.toStringHelper(milestone).add("MilestoneId", milestone.getMilestoneId()).add("CurrentProgress", Long.valueOf(milestone.getCurrentProgress())).add("TargetProgress", Long.valueOf(milestone.getTargetProgress())).add("State", Integer.valueOf(milestone.getState())).add("CompletionRewardData", milestone.getCompletionRewardData()).add("EventId", milestone.getEventId()).toString();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return equals(((Milestone) (this)), obj);
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public final byte[] getCompletionRewardData()
    {
        return mCompletionBlob;
    }

    public final long getCurrentProgress()
    {
        return mCurrentProgress;
    }

    public final String getEventId()
    {
        return mEventId;
    }

    public final String getMilestoneId()
    {
        return mMilestoneId;
    }

    public final int getState()
    {
        return mState;
    }

    public final long getTargetProgress()
    {
        return mTargetProgress;
    }

    public final int hashCode()
    {
        return hashCode(((Milestone) (this)));
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final String toString()
    {
        return toString(((Milestone) (this)));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        MilestoneEntityCreator.writeToParcel$57c02454(this, parcel);
    }

}
