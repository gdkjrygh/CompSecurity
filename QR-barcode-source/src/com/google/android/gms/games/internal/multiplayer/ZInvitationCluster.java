// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.a;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationEntity;
import com.google.android.gms.games.multiplayer.Participant;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.internal.multiplayer:
//            InvitationClusterCreator

public final class ZInvitationCluster
    implements SafeParcelable, Invitation
{

    public static final InvitationClusterCreator CREATOR = new InvitationClusterCreator();
    private final int BR;
    private final ArrayList aaL;

    ZInvitationCluster(int i, ArrayList arraylist)
    {
        BR = i;
        aaL = arraylist;
        li();
    }

    private void li()
    {
        Invitation invitation;
        int j;
        boolean flag;
        if (!aaL.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a.I(flag);
        invitation = (Invitation)aaL.get(0);
        j = aaL.size();
        for (int i = 1; i < j; i++)
        {
            Invitation invitation1 = (Invitation)aaL.get(i);
            a.a(invitation.getInviter().equals(invitation1.getInviter()), "All the invitations must be from the same inviter");
        }

    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof ZInvitationCluster))
        {
            return false;
        }
        if (this == obj)
        {
            return true;
        }
        obj = (ZInvitationCluster)obj;
        if (((ZInvitationCluster) (obj)).aaL.size() != aaL.size())
        {
            return false;
        }
        int j = aaL.size();
        for (int i = 0; i < j; i++)
        {
            if (!((Invitation)aaL.get(i)).equals((Invitation)((ZInvitationCluster) (obj)).aaL.get(i)))
            {
                return false;
            }
        }

        return true;
    }

    public Invitation freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public int getAvailableAutoMatchSlots()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public long getCreationTimestamp()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public Game getGame()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public String getInvitationId()
    {
        return ((InvitationEntity)aaL.get(0)).getInvitationId();
    }

    public int getInvitationType()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public Participant getInviter()
    {
        return ((InvitationEntity)aaL.get(0)).getInviter();
    }

    public ArrayList getParticipants()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int getVariant()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return n.hashCode(aaL.toArray());
    }

    public boolean isDataValid()
    {
        return true;
    }

    public ArrayList lj()
    {
        return new ArrayList(aaL);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.games.internal.multiplayer.InvitationClusterCreator.a(this, parcel, i);
    }

}
