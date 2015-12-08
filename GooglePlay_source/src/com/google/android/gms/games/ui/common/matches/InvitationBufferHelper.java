// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.matches;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.ObjectDataBuffer;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.internal.multiplayer.ZInvitationCluster;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationEntity;
import com.google.android.gms.games.multiplayer.Participant;
import java.util.ArrayList;

public final class InvitationBufferHelper
{

    final ObjectDataBuffer mAggregatedInvitationBuffer = new ObjectDataBuffer();
    final ObjectDataBuffer mInCirclesInvitationBuffer = new ObjectDataBuffer();

    public InvitationBufferHelper(DataBuffer databuffer)
    {
        Asserts.checkNotNull(databuffer);
        com.google.android.gms.games.multiplayer.ParticipantEntity participantentity = null;
        Object obj = null;
        int i = 0;
        int j = databuffer.getCount();
        while (i < j) 
        {
            InvitationEntity invitationentity = (InvitationEntity)((Invitation)databuffer.get(i)).freeze();
            com.google.android.gms.games.multiplayer.ParticipantEntity participantentity1 = invitationentity.mInviter;
            Player player = participantentity1.getPlayer();
            if (player == null || player.isInCircles() == 1)
            {
                mInCirclesInvitationBuffer.add(invitationentity);
            } else
            if (!participantentity1.equals(participantentity))
            {
                participantentity = participantentity1;
                if (obj != null)
                {
                    obj = new ZInvitationCluster(((ArrayList) (obj)));
                    mAggregatedInvitationBuffer.add(obj);
                }
                obj = new ArrayList();
                ((ArrayList) (obj)).add(invitationentity);
            } else
            {
                ((ArrayList) (obj)).add(invitationentity);
            }
            i++;
        }
        if (obj != null)
        {
            databuffer = new ZInvitationCluster(((ArrayList) (obj)));
            mAggregatedInvitationBuffer.add(databuffer);
        }
    }
}
