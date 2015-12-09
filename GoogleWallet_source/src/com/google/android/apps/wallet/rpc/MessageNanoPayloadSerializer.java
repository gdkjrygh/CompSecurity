// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.rpc;

import com.google.android.apps.wallet.util.proto.DelimitedProtoIo;
import com.google.common.base.Optional;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

// Referenced classes of package com.google.android.apps.wallet.rpc:
//            PayloadSerializer, RpcException

public class MessageNanoPayloadSerializer
    implements PayloadSerializer
{

    public MessageNanoPayloadSerializer()
    {
    }

    private static MessageNano getResponsePayload(InputStream inputstream, MessageNano messagenano)
        throws IOException
    {
        DelimitedProtoIo.parseDelimitedFrom(messagenano, inputstream);
        DelimitedProtoIo.parseDelimitedFrom(messagenano, inputstream);
        return messagenano;
    }

    public final RpcException getBadResponseRpcException(int i, HttpURLConnection httpurlconnection, Optional optional)
        throws IOException
    {
        throw new IOException("Don't know how to parse error input");
    }

    public final volatile Object getResponsePayload(InputStream inputstream, Object obj)
        throws IOException
    {
        return getResponsePayload(inputstream, (MessageNano)obj);
    }
}
