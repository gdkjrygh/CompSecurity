// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataEventBuffer;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ChannelEventParcelable, AncsNotificationParcelable, CapabilityInfoParcelable, MessageEventParcelable, 
//            NodeParcelable

final class zzbl extends zzas.zza
{

    private com.google.android.gms.wearable.zza.zza a;
    private com.google.android.gms.wearable.DataApi.DataListener b;
    private com.google.android.gms.wearable.MessageApi.MessageListener c;
    private com.google.android.gms.wearable.NodeApi.NodeListener d;
    private com.google.android.gms.wearable.NodeApi.zza e;
    private com.google.android.gms.wearable.ChannelApi.ChannelListener f;
    private com.google.android.gms.wearable.CapabilityApi.CapabilityListener g;
    private final IntentFilter h[];
    private final String i;
    private final String j;

    public void a()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
    }

    public void a(DataHolder dataholder)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        b.onDataChanged(new DataEventBuffer(dataholder));
        dataholder.i();
        return;
        Exception exception;
        exception;
        dataholder.i();
        throw exception;
        dataholder.i();
        return;
    }

    public void a(AncsNotificationParcelable ancsnotificationparcelable)
    {
        if (a != null)
        {
            a.a(ancsnotificationparcelable);
        }
    }

    public void a(CapabilityInfoParcelable capabilityinfoparcelable)
    {
        if (g != null)
        {
            g.onCapabilityChanged(capabilityinfoparcelable);
        }
    }

    public void a(ChannelEventParcelable channeleventparcelable)
    {
        if (f != null)
        {
            channeleventparcelable.a(f);
        }
    }

    public void a(MessageEventParcelable messageeventparcelable)
    {
        if (c != null)
        {
            c.onMessageReceived(messageeventparcelable);
        }
    }

    public void a(NodeParcelable nodeparcelable)
    {
        if (d != null)
        {
            d.onPeerConnected(nodeparcelable);
        }
    }

    public void a(List list)
    {
        if (e != null)
        {
            e.onConnectedNodes(list);
        }
    }

    public void b(NodeParcelable nodeparcelable)
    {
        if (d != null)
        {
            d.onPeerDisconnected(nodeparcelable);
        }
    }

    public IntentFilter[] b()
    {
        return h;
    }

    public String c()
    {
        return i;
    }

    public String d()
    {
        return j;
    }
}
