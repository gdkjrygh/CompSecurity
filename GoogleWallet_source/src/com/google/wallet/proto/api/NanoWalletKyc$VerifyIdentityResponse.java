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
//            NanoWalletKyc

public static final class clear extends ExtendableMessageNano
{

    public com.google.wallet.proto.nse.callError callError;
    public com.google.wallet.proto.nse.callError kycStatus;
    public com.google.wallet.proto.features.rror referralQuestion[];
    public Long timeToCompleteQuestionsMillis;

    private clear clear()
    {
        kycStatus = null;
        referralQuestion = com.google.wallet.proto.features.rray();
        timeToCompleteQuestionsMillis = null;
        callError = null;
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
                if (kycStatus == null)
                {
                    kycStatus = new com.google.wallet.proto.nse.kycStatus();
                }
                codedinputbytebuffernano.readMessage(kycStatus);
                break;

            case 18: // '\022'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                com.google.wallet.proto.features.dSize adsize[];
                int j;
                if (referralQuestion == null)
                {
                    j = 0;
                } else
                {
                    j = referralQuestion.length;
                }
                adsize = new com.google.wallet.proto.features.ralQuestion[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(referralQuestion, 0, adsize, 0, j);
                    k = j;
                }
                for (; k < adsize.length - 1; k++)
                {
                    adsize[k] = new com.google.wallet.proto.features.();
                    codedinputbytebuffernano.readMessage(adsize[k]);
                    codedinputbytebuffernano.readTag();
                }

                adsize[k] = new com.google.wallet.proto.features.();
                codedinputbytebuffernano.readMessage(adsize[k]);
                referralQuestion = adsize;
                break;

            case 24: // '\030'
                timeToCompleteQuestionsMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 34: // '"'
                if (callError == null)
                {
                    callError = new com.google.wallet.proto.nse.callError();
                }
                codedinputbytebuffernano.readMessage(callError);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (kycStatus != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, kycStatus);
        }
        j = i;
        if (referralQuestion != null)
        {
            j = i;
            if (referralQuestion.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= referralQuestion.length)
                    {
                        break;
                    }
                    com.google.wallet.proto.features.rror rror = referralQuestion[k];
                    j = i;
                    if (rror != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(2, rror);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (timeToCompleteQuestionsMillis != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(3, timeToCompleteQuestionsMillis.longValue());
        }
        j = i;
        if (callError != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, callError);
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
        if (kycStatus != null)
        {
            codedoutputbytebuffernano.writeMessage(1, kycStatus);
        }
        if (referralQuestion != null && referralQuestion.length > 0)
        {
            for (int i = 0; i < referralQuestion.length; i++)
            {
                com.google.wallet.proto.features.From from = referralQuestion[i];
                if (from != null)
                {
                    codedoutputbytebuffernano.writeMessage(2, from);
                }
            }

        }
        if (timeToCompleteQuestionsMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(3, timeToCompleteQuestionsMillis.longValue());
        }
        if (callError != null)
        {
            codedoutputbytebuffernano.writeMessage(4, callError);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
