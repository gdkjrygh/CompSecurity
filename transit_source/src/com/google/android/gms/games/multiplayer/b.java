// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.data.d;
import com.google.android.gms.games.Game;
import com.google.android.gms.internal.dm;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Invitation, d, InvitationEntity, Participant

public final class b extends com.google.android.gms.common.data.b
    implements Invitation
{

    private final ArrayList nQ;
    private final Game nS;
    private final com.google.android.gms.games.multiplayer.d nT;

    b(d d1, int i, int j)
    {
        super(d1, i);
        nS = new com.google.android.gms.games.b(d1, i);
        nQ = new ArrayList(j);
        String s = getString("external_inviter_id");
        i = 0;
        d1 = null;
        for (; i < j; i++)
        {
            com.google.android.gms.games.multiplayer.d d2 = new com.google.android.gms.games.multiplayer.d(jf, ji + i);
            if (d2.getParticipantId().equals(s))
            {
                d1 = d2;
            }
            nQ.add(d2);
        }

        nT = (com.google.android.gms.games.multiplayer.d)dm.a(d1, "Must have a valid inviter!");
    }

    public int ch()
    {
        return getInteger("type");
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return InvitationEntity.a(this, obj);
    }

    public Invitation freeze()
    {
        return new InvitationEntity(this);
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public long getCreationTimestamp()
    {
        return getLong("creation_timestamp");
    }

    public Game getGame()
    {
        return nS;
    }

    public String getInvitationId()
    {
        return getString("external_invitation_id");
    }

    public Participant getInviter()
    {
        return nT;
    }

    public ArrayList getParticipants()
    {
        return nQ;
    }

    public int getVariant()
    {
        return getInteger("variant");
    }

    public int hashCode()
    {
        return InvitationEntity.a(this);
    }

    public String toString()
    {
        return InvitationEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((InvitationEntity)freeze()).writeToParcel(parcel, i);
    }
}
