// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.base.entitymanager;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;

// Referenced classes of package com.google.android.apps.wallet.base.entitymanager:
//            EntityId

public interface EntityUtil
{

    public abstract EntityId getId(MessageNano messagenano);

    public abstract MessageNano parseFrom(byte abyte0[])
        throws InvalidProtocolBufferNanoException;
}
