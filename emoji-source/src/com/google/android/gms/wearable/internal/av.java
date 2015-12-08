// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataEventBuffer;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            af, ai

public class av extends ac.a
{

    private final com.google.android.gms.wearable.DataApi.DataListener aml;
    private final com.google.android.gms.wearable.MessageApi.MessageListener amm;
    private final com.google.android.gms.wearable.NodeApi.NodeListener amn;
    private final IntentFilter amo[];

    public av(com.google.android.gms.wearable.DataApi.DataListener datalistener, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener, IntentFilter aintentfilter[])
    {
        aml = datalistener;
        amm = messagelistener;
        amn = nodelistener;
        amo = aintentfilter;
    }

    public static av a(com.google.android.gms.wearable.DataApi.DataListener datalistener, IntentFilter aintentfilter[])
    {
        return new av(datalistener, null, null, aintentfilter);
    }

    public static av a(com.google.android.gms.wearable.MessageApi.MessageListener messagelistener, IntentFilter aintentfilter[])
    {
        return new av(null, messagelistener, null, aintentfilter);
    }

    public static av a(com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
    {
        return new av(null, null, nodelistener, null);
    }

    public void Y(DataHolder dataholder)
    {
        if (aml == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        aml.onDataChanged(new DataEventBuffer(dataholder));
        dataholder.close();
        return;
        Exception exception;
        exception;
        dataholder.close();
        throw exception;
        dataholder.close();
        return;
    }

    public void a(af af)
    {
        if (amm != null)
        {
            amm.onMessageReceived(af);
        }
    }

    public void a(ai ai)
    {
        if (amn != null)
        {
            amn.onPeerConnected(ai);
        }
    }

    public void b(ai ai)
    {
        if (amn != null)
        {
            amn.onPeerDisconnected(ai);
        }
    }

    public IntentFilter[] nu()
    {
        return amo;
    }
}
