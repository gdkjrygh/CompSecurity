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

    public com.google.wallet.proto.nfo.fundingSourceOverview fees[];
    public com.google.wallet.proto.nfo.fundingSourceOverview fundingSourceInfo[];
    public com.google.wallet.proto.nfo.fundingSourceOverview fundingSourceOverview;
    public com.google.wallet.proto.nfo.fundingSourceOverview maxTransactionAmount;

    private clear clear()
    {
        fees = com.google.wallet.proto.nfo.fees();
        maxTransactionAmount = null;
        fundingSourceInfo = com.google.wallet.proto.Array();
        fundingSourceOverview = null;
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
                int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                com.google.wallet.proto.nfo anfo[];
                int j;
                if (fees == null)
                {
                    j = 0;
                } else
                {
                    j = fees.length;
                }
                anfo = new com.google.wallet.proto.nfo.fees[j + l];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(fees, 0, anfo, 0, j);
                    l = j;
                }
                for (; l < anfo.length - 1; l++)
                {
                    anfo[l] = new com.google.wallet.proto.nfo.fees();
                    codedinputbytebuffernano.readMessage(anfo[l]);
                    codedinputbytebuffernano.readTag();
                }

                anfo[l] = new com.google.wallet.proto.nfo.fees();
                codedinputbytebuffernano.readMessage(anfo[l]);
                fees = anfo;
                break;

            case 18: // '\022'
                if (maxTransactionAmount == null)
                {
                    maxTransactionAmount = new com.google.wallet.proto.();
                }
                codedinputbytebuffernano.readMessage(maxTransactionAmount);
                break;

            case 26: // '\032'
                int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                com.google.wallet.proto.nfo anfo1[];
                int k;
                if (fundingSourceInfo == null)
                {
                    k = 0;
                } else
                {
                    k = fundingSourceInfo.length;
                }
                anfo1 = new com.google.wallet.proto.nfo.fundingSourceInfo[k + i1];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(fundingSourceInfo, 0, anfo1, 0, k);
                    i1 = k;
                }
                for (; i1 < anfo1.length - 1; i1++)
                {
                    anfo1[i1] = new com.google.wallet.proto.>();
                    codedinputbytebuffernano.readMessage(anfo1[i1]);
                    codedinputbytebuffernano.readTag();
                }

                anfo1[i1] = new com.google.wallet.proto.>();
                codedinputbytebuffernano.readMessage(anfo1[i1]);
                fundingSourceInfo = anfo1;
                break;

            case 34: // '"'
                if (fundingSourceOverview == null)
                {
                    fundingSourceOverview = new com.google.wallet.proto.nfo.fundingSourceOverview();
                }
                codedinputbytebuffernano.readMessage(fundingSourceOverview);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (fees != null)
        {
            j = i;
            if (fees.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= fees.length)
                    {
                        break;
                    }
                    com.google.wallet.proto.nfo nfo = fees[k];
                    j = i;
                    if (nfo != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(1, nfo);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (maxTransactionAmount != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(2, maxTransactionAmount);
        }
        j = i;
        if (fundingSourceInfo != null)
        {
            j = i;
            if (fundingSourceInfo.length > 0)
            {
                int l = 0;
                do
                {
                    j = i;
                    if (l >= fundingSourceInfo.length)
                    {
                        break;
                    }
                    com.google.wallet.proto.nfo nfo1 = fundingSourceInfo[l];
                    j = i;
                    if (nfo1 != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(3, nfo1);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (fundingSourceOverview != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(4, fundingSourceOverview);
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
        if (fees != null && fees.length > 0)
        {
            for (int i = 0; i < fees.length; i++)
            {
                com.google.wallet.proto.nfo nfo = fees[i];
                if (nfo != null)
                {
                    codedoutputbytebuffernano.writeMessage(1, nfo);
                }
            }

        }
        if (maxTransactionAmount != null)
        {
            codedoutputbytebuffernano.writeMessage(2, maxTransactionAmount);
        }
        if (fundingSourceInfo != null && fundingSourceInfo.length > 0)
        {
            for (int j = 0; j < fundingSourceInfo.length; j++)
            {
                com.google.wallet.proto.nfo nfo1 = fundingSourceInfo[j];
                if (nfo1 != null)
                {
                    codedoutputbytebuffernano.writeMessage(3, nfo1);
                }
            }

        }
        if (fundingSourceOverview != null)
        {
            codedoutputbytebuffernano.writeMessage(4, fundingSourceOverview);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
