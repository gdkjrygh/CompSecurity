// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.rpc;

import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.proto.DelimitedProtoIo;
import com.google.common.base.Optional;
import com.google.protobuf.nano.MessageNano;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

// Referenced classes of package com.google.android.apps.wallet.rpc:
//            PayloadSerializer, ResponsePayload, RpcException

public class ResponsePayloadSerializer
    implements PayloadSerializer
{

    private static final String TAG = com/google/android/apps/wallet/rpc/ResponsePayloadSerializer.getSimpleName();

    public ResponsePayloadSerializer()
    {
    }

    public static byte[] getRequestBytes(MessageNano messagenano, com.google.wallet.proto.NanoWalletTransport.RequestMetadata requestmetadata)
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        DelimitedProtoIo.writeDelimitedTo(requestmetadata, bytearrayoutputstream);
        DelimitedProtoIo.writeDelimitedTo(messagenano, bytearrayoutputstream);
        return bytearrayoutputstream.toByteArray();
    }

    private static com.google.wallet.proto.NanoWalletTransport.ResponseMetadata getResponseMetdataPayload(InputStream inputstream)
        throws IOException
    {
        com.google.wallet.proto.NanoWalletTransport.ResponseMetadata responsemetadata = new com.google.wallet.proto.NanoWalletTransport.ResponseMetadata();
        DelimitedProtoIo.parseDelimitedFrom(responsemetadata, inputstream);
        return responsemetadata;
    }

    private ResponsePayload getResponsePayload(InputStream inputstream, MessageNano messagenano)
        throws IOException
    {
        com.google.wallet.proto.NanoWalletTransport.ResponseMetadata responsemetadata = getResponseMetdataPayload(inputstream);
        DelimitedProtoIo.parseDelimitedFrom(messagenano, inputstream);
        return new ResponsePayload(Optional.fromNullable(responsemetadata), messagenano);
    }

    public final RpcException getBadResponseRpcException(int i, HttpURLConnection httpurlconnection, Optional optional)
        throws IOException
    {
        optional = getResponseMetdataPayload(new ByteArrayInputStream((byte[])optional.get()));
        WLog.dfmt(TAG, "non-OK status code with ResponseMetadata: %d %s.", new Object[] {
            Integer.valueOf(i), httpurlconnection.getResponseMessage()
        });
        return new RpcException("non-OK status code, has metadata", optional);
    }

    public final volatile Object getResponsePayload(InputStream inputstream, Object obj)
        throws IOException
    {
        return getResponsePayload(inputstream, (MessageNano)obj);
    }

}
