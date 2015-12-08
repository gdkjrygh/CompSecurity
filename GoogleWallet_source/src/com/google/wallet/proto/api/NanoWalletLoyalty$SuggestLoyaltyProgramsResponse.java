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
//            NanoWalletLoyalty

public static final class clear extends ExtendableMessageNano
{

    public matchingPrograms matchingPrograms[];
    public String merchantNameInput;

    private clear clear()
    {
        merchantNameInput = null;
        matchingPrograms = tyArray();
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
                merchantNameInput = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                cachedSize acachedsize[];
                int j;
                if (matchingPrograms == null)
                {
                    j = 0;
                } else
                {
                    j = matchingPrograms.length;
                }
                acachedsize = new matchingPrograms[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(matchingPrograms, 0, acachedsize, 0, j);
                    k = j;
                }
                for (; k < acachedsize.length - 1; k++)
                {
                    acachedsize[k] = new it>();
                    codedinputbytebuffernano.readMessage(acachedsize[k]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize[k] = new it>();
                codedinputbytebuffernano.readMessage(acachedsize[k]);
                matchingPrograms = acachedsize;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (merchantNameInput != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, merchantNameInput);
        }
        int l = i;
        if (matchingPrograms != null)
        {
            l = i;
            if (matchingPrograms.length > 0)
            {
                int k = 0;
                do
                {
                    l = i;
                    if (k >= matchingPrograms.length)
                    {
                        break;
                    }
                    matchingPrograms matchingprograms = matchingPrograms[k];
                    l = i;
                    if (matchingprograms != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(2, matchingprograms);
                    }
                    k++;
                    i = l;
                } while (true);
            }
        }
        return l;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (merchantNameInput != null)
        {
            codedoutputbytebuffernano.writeString(1, merchantNameInput);
        }
        if (matchingPrograms != null && matchingPrograms.length > 0)
        {
            for (int i = 0; i < matchingPrograms.length; i++)
            {
                mergeFrom mergefrom = matchingPrograms[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(2, mergefrom);
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
