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

    public String destinationInstrumentSubId;
    public String transferIds[];
    public userChallenge userChallenge[];

    private clear clear()
    {
        transferIds = WireFormatNano.EMPTY_STRING_ARRAY;
        destinationInstrumentSubId = null;
        userChallenge = userChallenge();
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
                String as[];
                int j;
                if (transferIds == null)
                {
                    j = 0;
                } else
                {
                    j = transferIds.length;
                }
                as = new String[j + l];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(transferIds, 0, as, 0, j);
                    l = j;
                }
                for (; l < as.length - 1; l++)
                {
                    as[l] = codedinputbytebuffernano.readString();
                    codedinputbytebuffernano.readTag();
                }

                as[l] = codedinputbytebuffernano.readString();
                transferIds = as;
                break;

            case 18: // '\022'
                destinationInstrumentSubId = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                cachedSize acachedsize[];
                int k;
                if (userChallenge == null)
                {
                    k = 0;
                } else
                {
                    k = userChallenge.length;
                }
                acachedsize = new userChallenge[k + i1];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(userChallenge, 0, acachedsize, 0, k);
                    i1 = k;
                }
                for (; i1 < acachedsize.length - 1; i1++)
                {
                    acachedsize[i1] = new userChallenge();
                    codedinputbytebuffernano.readMessage(acachedsize[i1]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize[i1] = new userChallenge();
                codedinputbytebuffernano.readMessage(acachedsize[i1]);
                userChallenge = acachedsize;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i2 = super.computeSerializedSize();
        int k = i2;
        if (transferIds != null)
        {
            k = i2;
            if (transferIds.length > 0)
            {
                int k1 = 0;
                k = 0;
                for (int i = 0; i < transferIds.length;)
                {
                    String s = transferIds[i];
                    int l1 = k1;
                    int i1 = k;
                    if (s != null)
                    {
                        l1 = k1 + 1;
                        i1 = k + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                    }
                    i++;
                    k1 = l1;
                    k = i1;
                }

                k = i2 + k + k1 * 1;
            }
        }
        int j = k;
        if (destinationInstrumentSubId != null)
        {
            j = k + CodedOutputByteBufferNano.computeStringSize(2, destinationInstrumentSubId);
        }
        int j1 = j;
        if (userChallenge != null)
        {
            j1 = j;
            if (userChallenge.length > 0)
            {
                int l = 0;
                do
                {
                    j1 = j;
                    if (l >= userChallenge.length)
                    {
                        break;
                    }
                    userChallenge userchallenge = userChallenge[l];
                    j1 = j;
                    if (userchallenge != null)
                    {
                        j1 = j + CodedOutputByteBufferNano.computeMessageSize(3, userchallenge);
                    }
                    l++;
                    j = j1;
                } while (true);
            }
        }
        return j1;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (transferIds != null && transferIds.length > 0)
        {
            for (int i = 0; i < transferIds.length; i++)
            {
                String s = transferIds[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.writeString(1, s);
                }
            }

        }
        if (destinationInstrumentSubId != null)
        {
            codedoutputbytebuffernano.writeString(2, destinationInstrumentSubId);
        }
        if (userChallenge != null && userChallenge.length > 0)
        {
            for (int j = 0; j < userChallenge.length; j++)
            {
                mergeFrom mergefrom = userChallenge[j];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(3, mergefrom);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
