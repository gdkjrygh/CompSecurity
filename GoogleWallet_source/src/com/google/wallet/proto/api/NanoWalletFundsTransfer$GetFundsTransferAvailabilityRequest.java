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

    public com.google.wallet.proto.est.destinationInstrumentSubId amount;
    public String destinationInstrumentSubId;
    public String fundingInstrumentSubId;
    public com.google.wallet.proto.est.destinationInstrumentSubId recipient;
    public com.google.wallet.proto.est.destinationInstrumentSubId transactionType;

    private clear clear()
    {
        transactionType = null;
        fundingInstrumentSubId = null;
        amount = null;
        recipient = null;
        destinationInstrumentSubId = null;
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
                if (transactionType == null)
                {
                    transactionType = new com.google.wallet.proto.est.transactionType();
                }
                codedinputbytebuffernano.readMessage(transactionType);
                break;

            case 18: // '\022'
                fundingInstrumentSubId = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                if (amount == null)
                {
                    amount = new com.google.wallet.proto.est.amount();
                }
                codedinputbytebuffernano.readMessage(amount);
                break;

            case 34: // '"'
                if (recipient == null)
                {
                    recipient = new com.google.wallet.proto.est.recipient();
                }
                codedinputbytebuffernano.readMessage(recipient);
                break;

            case 42: // '*'
                destinationInstrumentSubId = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (transactionType != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, transactionType);
        }
        j = i;
        if (fundingInstrumentSubId != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, fundingInstrumentSubId);
        }
        i = j;
        if (amount != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, amount);
        }
        j = i;
        if (recipient != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, recipient);
        }
        i = j;
        if (destinationInstrumentSubId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(5, destinationInstrumentSubId);
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
        if (transactionType != null)
        {
            codedoutputbytebuffernano.writeMessage(1, transactionType);
        }
        if (fundingInstrumentSubId != null)
        {
            codedoutputbytebuffernano.writeString(2, fundingInstrumentSubId);
        }
        if (amount != null)
        {
            codedoutputbytebuffernano.writeMessage(3, amount);
        }
        if (recipient != null)
        {
            codedoutputbytebuffernano.writeMessage(4, recipient);
        }
        if (destinationInstrumentSubId != null)
        {
            codedoutputbytebuffernano.writeString(5, destinationInstrumentSubId);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
