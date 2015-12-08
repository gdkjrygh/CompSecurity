// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.checkout.commonui.purchaserecord.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.checkout.commonui.purchaserecord.proto:
//            NanoClientPurchaseRecord

public static final class clear extends ExtendableMessageNano
{

    public String description;
    public instrument instrument[];

    private clear clear()
    {
        description = null;
        instrument = instrument();
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
                description = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                cachedSize acachedsize[];
                int j;
                if (instrument == null)
                {
                    j = 0;
                } else
                {
                    j = instrument.length;
                }
                acachedsize = new instrument[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(instrument, 0, acachedsize, 0, j);
                    k = j;
                }
                for (; k < acachedsize.length - 1; k++)
                {
                    acachedsize[k] = new instrument();
                    codedinputbytebuffernano.readMessage(acachedsize[k]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize[k] = new instrument();
                codedinputbytebuffernano.readMessage(acachedsize[k]);
                instrument = acachedsize;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (description != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, description);
        }
        int l = i;
        if (instrument != null)
        {
            l = i;
            if (instrument.length > 0)
            {
                int k = 0;
                do
                {
                    l = i;
                    if (k >= instrument.length)
                    {
                        break;
                    }
                    instrument instrument1 = instrument[k];
                    l = i;
                    if (instrument1 != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(2, instrument1);
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
        if (description != null)
        {
            codedoutputbytebuffernano.writeString(1, description);
        }
        if (instrument != null && instrument.length > 0)
        {
            for (int i = 0; i < instrument.length; i++)
            {
                mergeFrom mergefrom = instrument[i];
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
