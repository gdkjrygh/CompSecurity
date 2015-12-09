// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.requests;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.games.internal.request.GameRequestCluster;
import com.google.android.gms.games.request.GameRequest;
import java.util.ArrayList;

public final class GameRequestUtils
{

    public static transient GameRequest[] extractFromBuffers(DataBuffer adatabuffer[])
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < adatabuffer.length; i++)
        {
            DataBuffer databuffer = adatabuffer[i];
            int k = databuffer.getCount();
            int j = 0;
            while (j < k) 
            {
                GameRequest gamerequest = (GameRequest)((GameRequest)databuffer.get(j)).freeze();
                if (gamerequest instanceof GameRequestCluster)
                {
                    arraylist.addAll(((GameRequestCluster)gamerequest).getRequestList());
                } else
                {
                    arraylist.add(gamerequest);
                }
                j++;
            }
        }

        adatabuffer = new GameRequest[arraylist.size()];
        arraylist.toArray(adatabuffer);
        return adatabuffer;
    }
}
