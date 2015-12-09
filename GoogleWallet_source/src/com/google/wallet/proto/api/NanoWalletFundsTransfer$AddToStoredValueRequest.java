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

    public com.google.wallet.proto.est.topUpId amount;
    public com.google.wallet.proto.est.topUpId fees;
    public com.google.wallet.proto.est.topUpId fundingInstrumentId;
    public String topUpId;

    private clear clear()
    {
        fundingInstrumentId = null;
        amount = null;
        topUpId = null;
        fees = null;
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
                if (fundingInstrumentId == null)
                {
                    fundingInstrumentId = new com.google.wallet.proto.est.fundingInstrumentId();
                }
                codedinputbytebuffernano.readMessage(fundingInstrumentId);
                break;

            case 18: // '\022'
                if (amount == null)
                {
                    amount = new com.google.wallet.proto.est.amount();
                }
                codedinputbytebuffernano.readMessage(amount);
                break;

            case 26: // '\032'
                if (fees == null)
                {
                    fees = new com.google.wallet.proto.est.fees();
                }
                codedinputbytebuffernano.readMessage(fees);
                break;

            case 34: // '"'
                topUpId = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (fundingInstrumentId != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, fundingInstrumentId);
        }
        j = i;
        if (amount != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, amount);
        }
        i = j;
        if (fees != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, fees);
        }
        j = i;
        if (topUpId != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, topUpId);
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
        if (fundingInstrumentId != null)
        {
            codedoutputbytebuffernano.writeMessage(1, fundingInstrumentId);
        }
        if (amount != null)
        {
            codedoutputbytebuffernano.writeMessage(2, amount);
        }
        if (fees != null)
        {
            codedoutputbytebuffernano.writeMessage(3, fees);
        }
        if (topUpId != null)
        {
            codedoutputbytebuffernano.writeString(4, topUpId);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public Q()
    {
        clear();
    }
}
