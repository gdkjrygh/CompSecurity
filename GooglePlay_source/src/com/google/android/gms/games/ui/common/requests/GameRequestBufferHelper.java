// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.requests;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.ObjectDataBuffer;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.internal.request.GameRequestCluster;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestEntity;
import java.util.ArrayList;

public final class GameRequestBufferHelper
{

    final ObjectDataBuffer mAggregatedRequestBuffer = new ObjectDataBuffer();
    final ObjectDataBuffer mInCirclesRequestBuffer = new ObjectDataBuffer();

    public GameRequestBufferHelper(DataBuffer databuffer)
    {
        Asserts.checkNotNull(databuffer);
        com.google.android.gms.games.PlayerEntity playerentity = null;
        Object obj = null;
        int i = 0;
        int j = databuffer.getCount();
        while (i < j) 
        {
            GameRequestEntity gamerequestentity = (GameRequestEntity)((GameRequest)databuffer.get(i)).freeze();
            com.google.android.gms.games.PlayerEntity playerentity1 = gamerequestentity.mSender;
            if (playerentity1.isInCircles() == 1)
            {
                mInCirclesRequestBuffer.add(gamerequestentity);
            } else
            if (!playerentity1.equals(playerentity))
            {
                playerentity = playerentity1;
                if (obj != null)
                {
                    obj = new GameRequestCluster(((ArrayList) (obj)));
                    mAggregatedRequestBuffer.add(obj);
                }
                obj = new ArrayList();
                ((ArrayList) (obj)).add(gamerequestentity);
            } else
            {
                ((ArrayList) (obj)).add(gamerequestentity);
            }
            i++;
        }
        if (obj != null)
        {
            databuffer = new GameRequestCluster(((ArrayList) (obj)));
            mAggregatedRequestBuffer.add(databuffer);
        }
    }
}
