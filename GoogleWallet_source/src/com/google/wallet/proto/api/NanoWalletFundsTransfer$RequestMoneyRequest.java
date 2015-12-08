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

    public String batchReplayId;
    public String memo;
    public themeImageUrl moneyRequest[];
    public String themeImageUrl;

    private clear clear()
    {
        memo = null;
        moneyRequest = ray();
        batchReplayId = null;
        themeImageUrl = null;
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
                memo = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                cachedSize acachedsize[];
                int j;
                if (moneyRequest == null)
                {
                    j = 0;
                } else
                {
                    j = moneyRequest.length;
                }
                acachedsize = new moneyRequest[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(moneyRequest, 0, acachedsize, 0, j);
                    k = j;
                }
                for (; k < acachedsize.length - 1; k++)
                {
                    acachedsize[k] = new moneyRequest();
                    codedinputbytebuffernano.readMessage(acachedsize[k]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize[k] = new moneyRequest();
                codedinputbytebuffernano.readMessage(acachedsize[k]);
                moneyRequest = acachedsize;
                break;

            case 26: // '\032'
                batchReplayId = codedinputbytebuffernano.readString();
                break;

            case 34: // '"'
                themeImageUrl = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (memo != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, memo);
        }
        j = i;
        if (moneyRequest != null)
        {
            j = i;
            if (moneyRequest.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= moneyRequest.length)
                    {
                        break;
                    }
                    themeImageUrl themeimageurl = moneyRequest[k];
                    j = i;
                    if (themeimageurl != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(2, themeimageurl);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (batchReplayId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, batchReplayId);
        }
        j = i;
        if (themeImageUrl != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, themeImageUrl);
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
        if (memo != null)
        {
            codedoutputbytebuffernano.writeString(1, memo);
        }
        if (moneyRequest != null && moneyRequest.length > 0)
        {
            for (int i = 0; i < moneyRequest.length; i++)
            {
                mergeFrom mergefrom = moneyRequest[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(2, mergefrom);
                }
            }

        }
        if (batchReplayId != null)
        {
            codedoutputbytebuffernano.writeString(3, batchReplayId);
        }
        if (themeImageUrl != null)
        {
            codedoutputbytebuffernano.writeString(4, themeImageUrl);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
