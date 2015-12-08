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

    public com.google.wallet.proto.est.id accountIdentifier;
    public com.google.wallet.proto.est.id amount;
    public com.google.wallet.proto.est.id fees;
    public com.google.wallet.proto.est.id fundingInstrumentId;
    public String id;
    public String memo;
    public String moneyRequestId;
    public String recipientEmail;
    public String transferId;

    private clear clear()
    {
        recipientEmail = null;
        fundingInstrumentId = null;
        amount = null;
        memo = null;
        transferId = null;
        fees = null;
        accountIdentifier = null;
        moneyRequestId = null;
        id = null;
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
                recipientEmail = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                if (fundingInstrumentId == null)
                {
                    fundingInstrumentId = new com.google.wallet.proto.est.fundingInstrumentId();
                }
                codedinputbytebuffernano.readMessage(fundingInstrumentId);
                break;

            case 26: // '\032'
                if (amount == null)
                {
                    amount = new com.google.wallet.proto.est.amount();
                }
                codedinputbytebuffernano.readMessage(amount);
                break;

            case 34: // '"'
                memo = codedinputbytebuffernano.readString();
                break;

            case 42: // '*'
                transferId = codedinputbytebuffernano.readString();
                break;

            case 50: // '2'
                if (fees == null)
                {
                    fees = new com.google.wallet.proto.est.fees();
                }
                codedinputbytebuffernano.readMessage(fees);
                break;

            case 58: // ':'
                if (accountIdentifier == null)
                {
                    accountIdentifier = new com.google.wallet.proto.t>();
                }
                codedinputbytebuffernano.readMessage(accountIdentifier);
                break;

            case 66: // 'B'
                moneyRequestId = codedinputbytebuffernano.readString();
                break;

            case 74: // 'J'
                id = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (recipientEmail != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, recipientEmail);
        }
        j = i;
        if (fundingInstrumentId != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, fundingInstrumentId);
        }
        i = j;
        if (amount != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, amount);
        }
        j = i;
        if (memo != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, memo);
        }
        i = j;
        if (transferId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(5, transferId);
        }
        j = i;
        if (fees != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(6, fees);
        }
        i = j;
        if (accountIdentifier != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(7, accountIdentifier);
        }
        j = i;
        if (moneyRequestId != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(8, moneyRequestId);
        }
        i = j;
        if (id != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(9, id);
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
        if (recipientEmail != null)
        {
            codedoutputbytebuffernano.writeString(1, recipientEmail);
        }
        if (fundingInstrumentId != null)
        {
            codedoutputbytebuffernano.writeMessage(2, fundingInstrumentId);
        }
        if (amount != null)
        {
            codedoutputbytebuffernano.writeMessage(3, amount);
        }
        if (memo != null)
        {
            codedoutputbytebuffernano.writeString(4, memo);
        }
        if (transferId != null)
        {
            codedoutputbytebuffernano.writeString(5, transferId);
        }
        if (fees != null)
        {
            codedoutputbytebuffernano.writeMessage(6, fees);
        }
        if (accountIdentifier != null)
        {
            codedoutputbytebuffernano.writeMessage(7, accountIdentifier);
        }
        if (moneyRequestId != null)
        {
            codedoutputbytebuffernano.writeString(8, moneyRequestId);
        }
        if (id != null)
        {
            codedoutputbytebuffernano.writeString(9, id);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
