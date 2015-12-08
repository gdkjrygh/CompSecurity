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
//            NanoWalletFundsTransfer

public static final class clear extends ExtendableMessageNano
{

    public com.google.wallet.proto.tch.expectedTotalAmount expectedFeeAmount;
    public String expectedFeeDescription;
    public com.google.wallet.proto.tch.expectedTotalAmount expectedTotalAmount;
    public expectedTotalAmount info;

    private clear clear()
    {
        info = null;
        expectedFeeAmount = null;
        expectedFeeDescription = null;
        expectedTotalAmount = null;
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
                if (info == null)
                {
                    info = new info();
                }
                codedinputbytebuffernano.readMessage(info);
                break;

            case 18: // '\022'
                if (expectedFeeAmount == null)
                {
                    expectedFeeAmount = new com.google.wallet.proto.tch.expectedFeeAmount();
                }
                codedinputbytebuffernano.readMessage(expectedFeeAmount);
                break;

            case 26: // '\032'
                expectedFeeDescription = codedinputbytebuffernano.readString();
                break;

            case 34: // '"'
                if (expectedTotalAmount == null)
                {
                    expectedTotalAmount = new com.google.wallet.proto.tch.expectedTotalAmount();
                }
                codedinputbytebuffernano.readMessage(expectedTotalAmount);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (info != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, info);
        }
        j = i;
        if (expectedFeeAmount != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, expectedFeeAmount);
        }
        i = j;
        if (expectedFeeDescription != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, expectedFeeDescription);
        }
        j = i;
        if (expectedTotalAmount != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, expectedTotalAmount);
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
        if (info != null)
        {
            codedoutputbytebuffernano.writeMessage(1, info);
        }
        if (expectedFeeAmount != null)
        {
            codedoutputbytebuffernano.writeMessage(2, expectedFeeAmount);
        }
        if (expectedFeeDescription != null)
        {
            codedoutputbytebuffernano.writeString(3, expectedFeeDescription);
        }
        if (expectedTotalAmount != null)
        {
            codedoutputbytebuffernano.writeMessage(4, expectedTotalAmount);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
