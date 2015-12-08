// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletLogging

public static final class clear extends ExtendableMessageNano
{
    public static final class ServiceInfo extends ExtendableMessageNano
    {

        public String serviceEndpoint;

        private ServiceInfo clear()
        {
            serviceEndpoint = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ServiceInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            do
            {
                int i = codedinputbytebuffernano.readTag();
                switch (i)
                {
                default:
                    if (storeUnknownField(codedinputbytebuffernano, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    serviceEndpoint = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (serviceEndpoint != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, serviceEndpoint);
            }
            return i;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (serviceEndpoint != null)
            {
                codedoutputbytebuffernano.writeString(1, serviceEndpoint);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ServiceInfo()
        {
            clear();
        }
    }


    public Integer networkType;
    public Integer requestSizeBytes;
    public Integer responseCode;
    public Integer responseSizeBytes;
    public ServiceInfo serviceInfo;
    public Long spanId;
    public ServiceInfo timeSpan;
    public Long traceId;

    private ServiceInfo.serviceEndpoint clear()
    {
        serviceInfo = null;
        timeSpan = null;
        networkType = null;
        responseCode = null;
        requestSizeBytes = null;
        responseSizeBytes = null;
        traceId = null;
        spanId = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L11:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 9: default 88
    //                   0: 97
    //                   10: 99
    //                   18: 128
    //                   24: 157
    //                   32: 210
    //                   40: 224
    //                   48: 238
    //                   56: 252
    //                   64: 266;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        if (serviceInfo == null)
        {
            serviceInfo = new ServiceInfo();
        }
        codedinputbytebuffernano.readMessage(serviceInfo);
          goto _L11
_L4:
        if (timeSpan == null)
        {
            timeSpan = new t>();
        }
        codedinputbytebuffernano.readMessage(timeSpan);
          goto _L11
_L5:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            networkType = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        responseCode = Integer.valueOf(codedinputbytebuffernano.readInt32());
        continue; /* Loop/switch isn't completed */
_L7:
        requestSizeBytes = Integer.valueOf(codedinputbytebuffernano.readInt32());
        continue; /* Loop/switch isn't completed */
_L8:
        responseSizeBytes = Integer.valueOf(codedinputbytebuffernano.readInt32());
        continue; /* Loop/switch isn't completed */
_L9:
        traceId = Long.valueOf(codedinputbytebuffernano.readInt64());
        continue; /* Loop/switch isn't completed */
_L10:
        spanId = Long.valueOf(codedinputbytebuffernano.readInt64());
        if (true) goto _L11; else goto _L12
_L12:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (serviceInfo != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, serviceInfo);
        }
        j = i;
        if (timeSpan != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, timeSpan);
        }
        i = j;
        if (networkType != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, networkType.intValue());
        }
        j = i;
        if (responseCode != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(4, responseCode.intValue());
        }
        i = j;
        if (requestSizeBytes != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(5, requestSizeBytes.intValue());
        }
        j = i;
        if (responseSizeBytes != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(6, responseSizeBytes.intValue());
        }
        i = j;
        if (traceId != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(7, traceId.longValue());
        }
        j = i;
        if (spanId != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(8, spanId.longValue());
        }
        return j;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (serviceInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(1, serviceInfo);
        }
        if (timeSpan != null)
        {
            codedoutputbytebuffernano.writeMessage(2, timeSpan);
        }
        if (networkType != null)
        {
            codedoutputbytebuffernano.writeInt32(3, networkType.intValue());
        }
        if (responseCode != null)
        {
            codedoutputbytebuffernano.writeInt32(4, responseCode.intValue());
        }
        if (requestSizeBytes != null)
        {
            codedoutputbytebuffernano.writeInt32(5, requestSizeBytes.intValue());
        }
        if (responseSizeBytes != null)
        {
            codedoutputbytebuffernano.writeInt32(6, responseSizeBytes.intValue());
        }
        if (traceId != null)
        {
            codedoutputbytebuffernano.writeInt64(7, traceId.longValue());
        }
        if (spanId != null)
        {
            codedoutputbytebuffernano.writeInt64(8, spanId.longValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ServiceInfo.clear()
    {
        clear();
    }
}
