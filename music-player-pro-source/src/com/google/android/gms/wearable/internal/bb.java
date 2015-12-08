// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataEventBuffer;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ai, al

public class bb extends ae.a
{

    private final IntentFilter axD[];
    private com.google.android.gms.wearable.DataApi.DataListener ayl;
    private com.google.android.gms.wearable.MessageApi.MessageListener aym;
    private com.google.android.gms.wearable.NodeApi.NodeListener ayn;

    private bb(com.google.android.gms.wearable.DataApi.DataListener datalistener, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener, IntentFilter aintentfilter[])
    {
        ayl = datalistener;
        aym = messagelistener;
        ayn = nodelistener;
        axD = aintentfilter;
    }

    public static bb a(com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
    {
        return new bb(null, null, nodelistener, null);
    }

    public static bb b(com.google.android.gms.wearable.DataApi.DataListener datalistener, IntentFilter aintentfilter[])
    {
        return new bb(datalistener, null, null, aintentfilter);
    }

    public static bb b(com.google.android.gms.wearable.MessageApi.MessageListener messagelistener, IntentFilter aintentfilter[])
    {
        return new bb(null, messagelistener, null, aintentfilter);
    }

    public void a(ai ai)
    {
        if (aym != null)
        {
            aym.onMessageReceived(ai);
        }
    }

    public void a(al al)
    {
        if (ayn != null)
        {
            ayn.onPeerConnected(al);
        }
    }

    public void aa(DataHolder dataholder)
    {
        if (ayl == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        ayl.onDataChanged(new DataEventBuffer(dataholder));
        dataholder.close();
        return;
        Exception exception;
        exception;
        dataholder.close();
        throw exception;
        dataholder.close();
        return;
    }

    public void b(al al)
    {
        if (ayn != null)
        {
            ayn.onPeerDisconnected(al);
        }
    }

    public void clear()
    {
        ayl = null;
        aym = null;
        ayn = null;
    }

    public IntentFilter[] rs()
    {
        return axD;
    }
}
