// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.IInterface;
import com.google.android.gms.common.data.DataHolder;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            AncsNotificationParcelable, CapabilityInfoParcelable, ChannelEventParcelable, MessageEventParcelable, 
//            NodeParcelable

public interface zzas
    extends IInterface
{

    public abstract void a(DataHolder dataholder);

    public abstract void a(AncsNotificationParcelable ancsnotificationparcelable);

    public abstract void a(CapabilityInfoParcelable capabilityinfoparcelable);

    public abstract void a(ChannelEventParcelable channeleventparcelable);

    public abstract void a(MessageEventParcelable messageeventparcelable);

    public abstract void a(NodeParcelable nodeparcelable);

    public abstract void a(List list);

    public abstract void b(NodeParcelable nodeparcelable);
}
