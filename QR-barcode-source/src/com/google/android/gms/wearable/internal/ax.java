// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataEventBuffer;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ah, ak

public class ax extends ae.a
{

    private final com.google.android.gms.wearable.DataApi.DataListener avX;
    private final com.google.android.gms.wearable.MessageApi.MessageListener avY;
    private final com.google.android.gms.wearable.NodeApi.NodeListener avZ;
    private final IntentFilter awa[];

    public ax(com.google.android.gms.wearable.DataApi.DataListener datalistener, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener, IntentFilter aintentfilter[])
    {
        avX = datalistener;
        avY = messagelistener;
        avZ = nodelistener;
        awa = aintentfilter;
    }

    public static ax a(com.google.android.gms.wearable.DataApi.DataListener datalistener, IntentFilter aintentfilter[])
    {
        return new ax(datalistener, null, null, aintentfilter);
    }

    public static ax a(com.google.android.gms.wearable.MessageApi.MessageListener messagelistener, IntentFilter aintentfilter[])
    {
        return new ax(null, messagelistener, null, aintentfilter);
    }

    public static ax a(com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
    {
        return new ax(null, null, nodelistener, null);
    }

    public void Z(DataHolder dataholder)
    {
        if (avX == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        avX.onDataChanged(new DataEventBuffer(dataholder));
        dataholder.close();
        return;
        Exception exception;
        exception;
        dataholder.close();
        throw exception;
        dataholder.close();
        return;
    }

    public void a(ah ah)
    {
        if (avY != null)
        {
            avY.onMessageReceived(ah);
        }
    }

    public void a(ak ak)
    {
        if (avZ != null)
        {
            avZ.onPeerConnected(ak);
        }
    }

    public void b(ak ak)
    {
        if (avZ != null)
        {
            avZ.onPeerDisconnected(ak);
        }
    }

    public IntentFilter[] qb()
    {
        return awa;
    }
}
