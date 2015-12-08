// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.data.FreezableUtils;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationEntity;
import com.google.android.gms.games.multiplayer.Participant;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.internal.multiplayer:
//            InvitationClusterCreator

public final class ZInvitationCluster
    implements SafeParcelable, Invitation
{

    public static final InvitationClusterCreator CREATOR = new InvitationClusterCreator();
    public final ArrayList mInvitationList;
    final int mVersionCode;

    ZInvitationCluster(int i, ArrayList arraylist)
    {
        mVersionCode = i;
        mInvitationList = arraylist;
        verifyData();
    }

    public ZInvitationCluster(ArrayList arraylist)
    {
        mVersionCode = 1;
        arraylist = FreezableUtils.freeze(arraylist);
        mInvitationList = new ArrayList(arraylist.size());
        int i = 0;
        for (int j = arraylist.size(); i < j; i++)
        {
            mInvitationList.add((InvitationEntity)arraylist.get(i));
        }

        verifyData();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof ZInvitationCluster) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (this == obj)
        {
            return true;
        }
        obj = (ZInvitationCluster)obj;
        if (((ZInvitationCluster) (obj)).mInvitationList.size() == mInvitationList.size())
        {
            int i = 0;
            int j = mInvitationList.size();
label0:
            do
            {
label1:
                {
                    if (i >= j)
                    {
                        break label1;
                    }
                    if (!((Invitation)mInvitationList.get(i)).equals((Invitation)((ZInvitationCluster) (obj)).mInvitationList.get(i)))
                    {
                        break label0;
                    }
                    i++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public final int getAvailableAutoMatchSlots()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final long getCreationTimestamp()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final Game getGame()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final String getInvitationId()
    {
        return ((InvitationEntity)mInvitationList.get(0)).mInvitationId;
    }

    public final ArrayList getInvitationList()
    {
        return new ArrayList(mInvitationList);
    }

    public final int getInvitationType()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final Participant getInviter()
    {
        return ((InvitationEntity)mInvitationList.get(0)).mInviter;
    }

    public final ArrayList getParticipants()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final int getVariant()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final int hashCode()
    {
        return Arrays.hashCode(mInvitationList.toArray());
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final void verifyData()
    {
        Invitation invitation;
        int i;
        boolean flag;
        if (!mInvitationList.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        invitation = (Invitation)mInvitationList.get(0);
        i = 1;
        for (int j = mInvitationList.size(); i < j; i++)
        {
            Invitation invitation1 = (Invitation)mInvitationList.get(i);
            Asserts.checkState(invitation.getInviter().equals(invitation1.getInviter()), "All the invitations must be from the same inviter");
        }

    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        InvitationClusterCreator.writeToParcel$985077c(this, parcel);
    }

}
