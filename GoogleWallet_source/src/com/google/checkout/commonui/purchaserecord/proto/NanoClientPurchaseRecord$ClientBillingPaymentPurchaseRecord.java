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
    public paymentEvent instrument;
    public String internalAccountId;
    public paymentEvent lineItem[];
    public paymentEvent paymentEvent[];

    private clear clear()
    {
        internalAccountId = null;
        description = null;
        instrument = null;
        lineItem = lineItem();
        paymentEvent = paymentEvent();
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
                internalAccountId = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                description = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                if (instrument == null)
                {
                    instrument = new instrument();
                }
                codedinputbytebuffernano.readMessage(instrument);
                break;

            case 34: // '"'
                int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                cachedSize acachedsize[];
                int j;
                if (lineItem == null)
                {
                    j = 0;
                } else
                {
                    j = lineItem.length;
                }
                acachedsize = new lineItem[j + l];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(lineItem, 0, acachedsize, 0, j);
                    l = j;
                }
                for (; l < acachedsize.length - 1; l++)
                {
                    acachedsize[l] = new lineItem();
                    codedinputbytebuffernano.readMessage(acachedsize[l]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize[l] = new lineItem();
                codedinputbytebuffernano.readMessage(acachedsize[l]);
                lineItem = acachedsize;
                break;

            case 42: // '*'
                int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 42);
                cachedSize acachedsize1[];
                int k;
                if (paymentEvent == null)
                {
                    k = 0;
                } else
                {
                    k = paymentEvent.length;
                }
                acachedsize1 = new paymentEvent[k + i1];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(paymentEvent, 0, acachedsize1, 0, k);
                    i1 = k;
                }
                for (; i1 < acachedsize1.length - 1; i1++)
                {
                    acachedsize1[i1] = new paymentEvent();
                    codedinputbytebuffernano.readMessage(acachedsize1[i1]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize1[i1] = new paymentEvent();
                codedinputbytebuffernano.readMessage(acachedsize1[i1]);
                paymentEvent = acachedsize1;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (internalAccountId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, internalAccountId);
        }
        int l = i;
        if (description != null)
        {
            l = i + CodedOutputByteBufferNano.computeStringSize(2, description);
        }
        j = l;
        if (instrument != null)
        {
            j = l + CodedOutputByteBufferNano.computeMessageSize(3, instrument);
        }
        i = j;
        if (lineItem != null)
        {
            i = j;
            if (lineItem.length > 0)
            {
                l = 0;
                do
                {
                    i = j;
                    if (l >= lineItem.length)
                    {
                        break;
                    }
                    paymentEvent paymentevent = lineItem[l];
                    i = j;
                    if (paymentevent != null)
                    {
                        i = j + CodedOutputByteBufferNano.computeMessageSize(4, paymentevent);
                    }
                    l++;
                    j = i;
                } while (true);
            }
        }
        l = i;
        if (paymentEvent != null)
        {
            l = i;
            if (paymentEvent.length > 0)
            {
                int k = 0;
                do
                {
                    l = i;
                    if (k >= paymentEvent.length)
                    {
                        break;
                    }
                    paymentEvent paymentevent1 = paymentEvent[k];
                    l = i;
                    if (paymentevent1 != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(5, paymentevent1);
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
        if (internalAccountId != null)
        {
            codedoutputbytebuffernano.writeString(1, internalAccountId);
        }
        if (description != null)
        {
            codedoutputbytebuffernano.writeString(2, description);
        }
        if (instrument != null)
        {
            codedoutputbytebuffernano.writeMessage(3, instrument);
        }
        if (lineItem != null && lineItem.length > 0)
        {
            for (int i = 0; i < lineItem.length; i++)
            {
                mergeFrom mergefrom = lineItem[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(4, mergefrom);
                }
            }

        }
        if (paymentEvent != null && paymentEvent.length > 0)
        {
            for (int j = 0; j < paymentEvent.length; j++)
            {
                mergeFrom mergefrom1 = paymentEvent[j];
                if (mergefrom1 != null)
                {
                    codedoutputbytebuffernano.writeMessage(5, mergefrom1);
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
