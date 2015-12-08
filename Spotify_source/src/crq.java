// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IInterface;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.List;

public interface crq
    extends IInterface
{

    public abstract void a(DataHolder dataholder);

    public abstract void a(AmsEntityUpdateParcelable amsentityupdateparcelable);

    public abstract void a(AncsNotificationParcelable ancsnotificationparcelable);

    public abstract void a(CapabilityInfoParcelable capabilityinfoparcelable);

    public abstract void a(ChannelEventParcelable channeleventparcelable);

    public abstract void a(MessageEventParcelable messageeventparcelable);

    public abstract void a(NodeParcelable nodeparcelable);

    public abstract void a(List list);

    public abstract void b(NodeParcelable nodeparcelable);
}
