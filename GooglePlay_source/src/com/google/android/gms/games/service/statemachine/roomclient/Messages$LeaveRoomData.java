// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.internal.ConnectionInfo;
import com.google.android.gms.games.service.statemachine.MessageBase;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            Messages

public static final class mData extends MessageBase
{

    public final mData clientLeaveRoomData;
    public final ConnectionInfo mConnectionInfo;
    public final ClientContext mConnectorClientContext;
    public final long mConnectorClientId;

    public mData(mData mdata, long l, ClientContext clientcontext, ConnectionInfo connectioninfo)
    {
        super(26);
        mConnectorClientId = ((Long)Preconditions.checkNotNull(Long.valueOf(l))).longValue();
        mConnectorClientContext = (ClientContext)Preconditions.checkNotNull(clientcontext);
        mConnectionInfo = (ConnectionInfo)Preconditions.checkNotNull(connectioninfo);
        clientLeaveRoomData = (mData)Preconditions.checkNotNull(mdata);
    }
}
