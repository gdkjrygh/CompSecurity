// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletScheduleTopups

public static final class clear extends ExtendableMessageNano
{

    public String description;
    public DateTime timestamp;

    private clear clear()
    {
        timestamp = null;
        description = null;
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

            case 10: // '\n'
                if (timestamp == null)
                {
                    timestamp = new DateTime();
                }
                codedinputbytebuffernano.readMessage(timestamp);
                break;

            case 18: // '\022'
                description = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (timestamp != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, timestamp);
        }
        j = i;
        if (description != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, description);
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
        if (timestamp != null)
        {
            codedoutputbytebuffernano.writeMessage(1, timestamp);
        }
        if (description != null)
        {
            codedoutputbytebuffernano.writeString(2, description);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public DateTime()
    {
        clear();
    }
}
