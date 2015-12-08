// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.features;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.features:
//            NanoWalletHce

public static final class clear extends ExtendableMessageNano
{

    public com.google.wallet.proto.splayableDuration duration;
    public Long expirationThresholdTimestampMillisClientOffset;
    public Long expirationTimestampMillisClientOffset;
    public Integer transactionCountLimit;
    public Integer transactionCountThreshold;

    private clear clear()
    {
        expirationTimestampMillisClientOffset = null;
        transactionCountLimit = null;
        transactionCountThreshold = null;
        expirationThresholdTimestampMillisClientOffset = null;
        duration = null;
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

            case 16: // '\020'
                expirationTimestampMillisClientOffset = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 32: // ' '
                transactionCountLimit = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 40: // '('
                transactionCountThreshold = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 48: // '0'
                expirationThresholdTimestampMillisClientOffset = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 58: // ':'
                if (duration == null)
                {
                    duration = new com.google.wallet.proto.splayableDuration();
                }
                codedinputbytebuffernano.readMessage(duration);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (expirationTimestampMillisClientOffset != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(2, expirationTimestampMillisClientOffset.longValue());
        }
        j = i;
        if (transactionCountLimit != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(4, transactionCountLimit.intValue());
        }
        i = j;
        if (transactionCountThreshold != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(5, transactionCountThreshold.intValue());
        }
        j = i;
        if (expirationThresholdTimestampMillisClientOffset != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(6, expirationThresholdTimestampMillisClientOffset.longValue());
        }
        i = j;
        if (duration != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(7, duration);
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
        if (expirationTimestampMillisClientOffset != null)
        {
            codedoutputbytebuffernano.writeInt64(2, expirationTimestampMillisClientOffset.longValue());
        }
        if (transactionCountLimit != null)
        {
            codedoutputbytebuffernano.writeInt32(4, transactionCountLimit.intValue());
        }
        if (transactionCountThreshold != null)
        {
            codedoutputbytebuffernano.writeInt32(5, transactionCountThreshold.intValue());
        }
        if (expirationThresholdTimestampMillisClientOffset != null)
        {
            codedoutputbytebuffernano.writeInt64(6, expirationThresholdTimestampMillisClientOffset.longValue());
        }
        if (duration != null)
        {
            codedoutputbytebuffernano.writeMessage(7, duration);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public Duration()
    {
        clear();
    }
}
