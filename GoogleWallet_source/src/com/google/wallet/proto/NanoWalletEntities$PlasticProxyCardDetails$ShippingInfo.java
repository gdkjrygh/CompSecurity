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
//            NanoWalletEntities

public static final class clear extends ExtendableMessageNano
{

    public Integer maxCardEtaDays;
    public Integer minCardEtaDays;
    public maxCardEtaDays shippingAddress;
    public Long shippingTimestampMillis;

    private clear clear()
    {
        shippingAddress = null;
        shippingTimestampMillis = null;
        minCardEtaDays = null;
        maxCardEtaDays = null;
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
                if (shippingAddress == null)
                {
                    shippingAddress = new shippingAddress();
                }
                codedinputbytebuffernano.readMessage(shippingAddress);
                break;

            case 16: // '\020'
                shippingTimestampMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 24: // '\030'
                minCardEtaDays = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 32: // ' '
                maxCardEtaDays = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (shippingAddress != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, shippingAddress);
        }
        j = i;
        if (shippingTimestampMillis != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(2, shippingTimestampMillis.longValue());
        }
        i = j;
        if (minCardEtaDays != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, minCardEtaDays.intValue());
        }
        j = i;
        if (maxCardEtaDays != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(4, maxCardEtaDays.intValue());
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
        if (shippingAddress != null)
        {
            codedoutputbytebuffernano.writeMessage(1, shippingAddress);
        }
        if (shippingTimestampMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(2, shippingTimestampMillis.longValue());
        }
        if (minCardEtaDays != null)
        {
            codedoutputbytebuffernano.writeInt32(3, minCardEtaDays.intValue());
        }
        if (maxCardEtaDays != null)
        {
            codedoutputbytebuffernano.writeInt32(4, maxCardEtaDays.intValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
