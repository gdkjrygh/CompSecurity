// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.rpc;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.protobuf.nano.MessageNano;

public final class ResponsePayload
{

    private final MessageNano message;
    private final Optional responseMetadata;

    public ResponsePayload(Optional optional, MessageNano messagenano)
    {
        responseMetadata = (Optional)Preconditions.checkNotNull(optional);
        message = (MessageNano)Preconditions.checkNotNull(messagenano);
    }

    public final MessageNano getMessage()
    {
        return message;
    }

    public final Optional getResponseMetadata()
    {
        return responseMetadata;
    }
}
