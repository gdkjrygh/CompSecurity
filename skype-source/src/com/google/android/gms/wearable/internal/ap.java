// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.wearable.e;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ChannelEventParcelable, AmsEntityUpdateParcelable, AncsNotificationParcelable, CapabilityInfoParcelable, 
//            MessageEventParcelable, NodeParcelable

final class ap extends w.a
{

    private com.google.android.gms.wearable.p.a a;
    private com.google.android.gms.wearable.q.a b;
    private com.google.android.gms.wearable.c.b c;
    private com.google.android.gms.wearable.j.a d;
    private com.google.android.gms.wearable.m.a e;
    private com.google.android.gms.wearable.m.b f;
    private com.google.android.gms.wearable.ChannelApi.a g;
    private com.google.android.gms.wearable.a.a h;
    private final IntentFilter i[];
    private final String j = null;
    private final String k = null;

    private ap(com.google.android.gms.wearable.j.a a1, IntentFilter aintentfilter[])
    {
        a = null;
        b = null;
        c = null;
        d = a1;
        e = null;
        f = null;
        g = null;
        h = null;
        i = aintentfilter;
    }

    public static ap a(com.google.android.gms.wearable.j.a a1, IntentFilter aintentfilter[])
    {
        return new ap((com.google.android.gms.wearable.j.a)y.a(a1), aintentfilter);
    }

    public final void a()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
    }

    public final void a(DataHolder dataholder)
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        c.onDataChanged(new e(dataholder));
        dataholder.g();
        return;
        Exception exception;
        exception;
        dataholder.g();
        throw exception;
        dataholder.g();
        return;
    }

    public final void a(AmsEntityUpdateParcelable amsentityupdateparcelable)
    {
    }

    public final void a(AncsNotificationParcelable ancsnotificationparcelable)
    {
    }

    public final void a(CapabilityInfoParcelable capabilityinfoparcelable)
    {
        if (h != null)
        {
            h.onCapabilityChanged(capabilityinfoparcelable);
        }
    }

    public final void a(ChannelEventParcelable channeleventparcelable)
    {
        if (g != null)
        {
            channeleventparcelable.a(g);
        }
    }

    public final void a(MessageEventParcelable messageeventparcelable)
    {
        if (d != null)
        {
            d.onMessageReceived(messageeventparcelable);
        }
    }

    public final void a(NodeParcelable nodeparcelable)
    {
        if (e != null)
        {
            e.onPeerConnected(nodeparcelable);
        }
    }

    public final void a(List list)
    {
        if (f != null)
        {
            f.onConnectedNodes(list);
        }
    }

    public final void b(NodeParcelable nodeparcelable)
    {
        if (e != null)
        {
            e.onPeerDisconnected(nodeparcelable);
        }
    }

    public final IntentFilter[] b()
    {
        return i;
    }

    public final String c()
    {
        return j;
    }

    public final String d()
    {
        return k;
    }
}
