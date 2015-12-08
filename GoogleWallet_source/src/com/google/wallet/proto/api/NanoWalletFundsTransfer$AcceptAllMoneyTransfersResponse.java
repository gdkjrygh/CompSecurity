// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletFundsTransfer

public static final class clear extends ExtendableMessageNano
{

    public String acceptedAmount;
    public com.google.wallet.proto.nse.expectedAvailabilityDescription callError;
    public String expectedAvailabilityDescription;
    public expectedAvailabilityDescription requestedChallenge;
    public String successfullyAcceptedTransferIds[];

    private clear clear()
    {
        callError = null;
        successfullyAcceptedTransferIds = WireFormatNano.EMPTY_STRING_ARRAY;
        requestedChallenge = null;
        acceptedAmount = null;
        expectedAvailabilityDescription = null;
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
                if (callError == null)
                {
                    callError = new com.google.wallet.proto.nse.callError();
                }
                codedinputbytebuffernano.readMessage(callError);
                break;

            case 18: // '\022'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                String as[];
                int j;
                if (successfullyAcceptedTransferIds == null)
                {
                    j = 0;
                } else
                {
                    j = successfullyAcceptedTransferIds.length;
                }
                as = new String[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(successfullyAcceptedTransferIds, 0, as, 0, j);
                    k = j;
                }
                for (; k < as.length - 1; k++)
                {
                    as[k] = codedinputbytebuffernano.readString();
                    codedinputbytebuffernano.readTag();
                }

                as[k] = codedinputbytebuffernano.readString();
                successfullyAcceptedTransferIds = as;
                break;

            case 26: // '\032'
                if (requestedChallenge == null)
                {
                    requestedChallenge = new requestedChallenge();
                }
                codedinputbytebuffernano.readMessage(requestedChallenge);
                break;

            case 34: // '"'
                acceptedAmount = codedinputbytebuffernano.readString();
                break;

            case 42: // '*'
                expectedAvailabilityDescription = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (callError != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, callError);
        }
        j = i;
        if (successfullyAcceptedTransferIds != null)
        {
            j = i;
            if (successfullyAcceptedTransferIds.length > 0)
            {
                int i1 = 0;
                int k = 0;
                for (j = 0; j < successfullyAcceptedTransferIds.length;)
                {
                    String s = successfullyAcceptedTransferIds[j];
                    int j1 = i1;
                    int l = k;
                    if (s != null)
                    {
                        j1 = i1 + 1;
                        l = k + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                    }
                    j++;
                    i1 = j1;
                    k = l;
                }

                j = i + k + i1 * 1;
            }
        }
        i = j;
        if (requestedChallenge != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, requestedChallenge);
        }
        j = i;
        if (acceptedAmount != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, acceptedAmount);
        }
        i = j;
        if (expectedAvailabilityDescription != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(5, expectedAvailabilityDescription);
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
        if (callError != null)
        {
            codedoutputbytebuffernano.writeMessage(1, callError);
        }
        if (successfullyAcceptedTransferIds != null && successfullyAcceptedTransferIds.length > 0)
        {
            for (int i = 0; i < successfullyAcceptedTransferIds.length; i++)
            {
                String s = successfullyAcceptedTransferIds[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.writeString(2, s);
                }
            }

        }
        if (requestedChallenge != null)
        {
            codedoutputbytebuffernano.writeMessage(3, requestedChallenge);
        }
        if (acceptedAmount != null)
        {
            codedoutputbytebuffernano.writeString(4, acceptedAmount);
        }
        if (expectedAvailabilityDescription != null)
        {
            codedoutputbytebuffernano.writeString(5, expectedAvailabilityDescription);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public Y()
    {
        clear();
    }
}
