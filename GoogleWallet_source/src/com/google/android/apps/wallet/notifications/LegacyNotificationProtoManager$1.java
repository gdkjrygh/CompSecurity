// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.notifications;

import com.google.android.apps.wallet.base.entitymanager.EntityId;
import com.google.android.apps.wallet.base.entitymanager.EntityUtil;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;

// Referenced classes of package com.google.android.apps.wallet.notifications:
//            LegacyNotificationProtoManager

final class 
    implements EntityUtil
{

    private static EntityId getId(com.google.wallet.proto.api.ntNotification ntnotification)
    {
        return new EntityId(ntnotification.notificationId, "WALLET");
    }

    private static com.google.wallet.proto.api.ntNotification parseFrom(byte abyte0[])
        throws InvalidProtocolBufferNanoException
    {
        return (com.google.wallet.proto.api.ntNotification)MessageNano.mergeFrom(new com.google.wallet.proto.api.ntNotification(), abyte0);
    }

    public final volatile EntityId getId(MessageNano messagenano)
    {
        return getId((com.google.wallet.proto.api.ntNotification)messagenano);
    }

    public final volatile MessageNano parseFrom(byte abyte0[])
        throws InvalidProtocolBufferNanoException
    {
        return parseFrom(abyte0);
    }

    ()
    {
    }
}
