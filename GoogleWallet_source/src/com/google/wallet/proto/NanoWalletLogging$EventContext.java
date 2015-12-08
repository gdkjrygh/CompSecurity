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

    public Long clientEventTimeMicros;
    public String clientVersion;
    public Integer processId;

    private clear clear()
    {
        clientEventTimeMicros = null;
        processId = null;
        clientVersion = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

            case 8: // '\b'
                clientEventTimeMicros = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 16: // '\020'
                processId = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 26: // '\032'
                clientVersion = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (clientEventTimeMicros != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(1, clientEventTimeMicros.longValue());
        }
        j = i;
        if (processId != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(2, processId.intValue());
        }
        i = j;
        if (clientVersion != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, clientVersion);
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
        if (clientEventTimeMicros != null)
        {
            codedoutputbytebuffernano.writeInt64(1, clientEventTimeMicros.longValue());
        }
        if (processId != null)
        {
            codedoutputbytebuffernano.writeInt32(2, processId.intValue());
        }
        if (clientVersion != null)
        {
            codedoutputbytebuffernano.writeString(3, clientVersion);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
