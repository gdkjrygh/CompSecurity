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

    public String destinationInstrumentSubId;
    public com.google.wallet.proto.est.pinChallengeSupported fees;
    public Boolean pinChallengeSupported;
    public com.google.wallet.proto.est.pinChallengeSupported withdrawalAmount;
    public String withdrawalId;

    private clear clear()
    {
        destinationInstrumentSubId = null;
        withdrawalAmount = null;
        withdrawalId = null;
        fees = null;
        pinChallengeSupported = null;
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
                destinationInstrumentSubId = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                if (withdrawalAmount == null)
                {
                    withdrawalAmount = new com.google.wallet.proto.est.withdrawalAmount();
                }
                codedinputbytebuffernano.readMessage(withdrawalAmount);
                break;

            case 26: // '\032'
                withdrawalId = codedinputbytebuffernano.readString();
                break;

            case 34: // '"'
                if (fees == null)
                {
                    fees = new com.google.wallet.proto.est.fees();
                }
                codedinputbytebuffernano.readMessage(fees);
                break;

            case 40: // '('
                pinChallengeSupported = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (destinationInstrumentSubId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, destinationInstrumentSubId);
        }
        j = i;
        if (withdrawalAmount != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, withdrawalAmount);
        }
        i = j;
        if (withdrawalId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, withdrawalId);
        }
        j = i;
        if (fees != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, fees);
        }
        i = j;
        if (pinChallengeSupported != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(5, pinChallengeSupported.booleanValue());
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
        if (destinationInstrumentSubId != null)
        {
            codedoutputbytebuffernano.writeString(1, destinationInstrumentSubId);
        }
        if (withdrawalAmount != null)
        {
            codedoutputbytebuffernano.writeMessage(2, withdrawalAmount);
        }
        if (withdrawalId != null)
        {
            codedoutputbytebuffernano.writeString(3, withdrawalId);
        }
        if (fees != null)
        {
            codedoutputbytebuffernano.writeMessage(4, fees);
        }
        if (pinChallengeSupported != null)
        {
            codedoutputbytebuffernano.writeBool(5, pinChallengeSupported.booleanValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
