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
//            NanoWalletOcr

public static final class clear extends ExtendableMessageNano
{

    public barcode barcode[];
    public barcode cardNumber;
    public barcode pin;

    private clear clear()
    {
        cardNumber = null;
        pin = null;
        barcode = barcode();
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
                if (cardNumber == null)
                {
                    cardNumber = new cardNumber();
                }
                codedinputbytebuffernano.readMessage(cardNumber);
                break;

            case 18: // '\022'
                if (pin == null)
                {
                    pin = new pin();
                }
                codedinputbytebuffernano.readMessage(pin);
                break;

            case 26: // '\032'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                cachedSize acachedsize[];
                int j;
                if (barcode == null)
                {
                    j = 0;
                } else
                {
                    j = barcode.length;
                }
                acachedsize = new barcode[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(barcode, 0, acachedsize, 0, j);
                    k = j;
                }
                for (; k < acachedsize.length - 1; k++)
                {
                    acachedsize[k] = new barcode();
                    codedinputbytebuffernano.readMessage(acachedsize[k]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize[k] = new barcode();
                codedinputbytebuffernano.readMessage(acachedsize[k]);
                barcode = acachedsize;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (cardNumber != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(1, cardNumber);
        }
        i = j;
        if (pin != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(2, pin);
        }
        int l = i;
        if (barcode != null)
        {
            l = i;
            if (barcode.length > 0)
            {
                int k = 0;
                do
                {
                    l = i;
                    if (k >= barcode.length)
                    {
                        break;
                    }
                    barcode barcode1 = barcode[k];
                    l = i;
                    if (barcode1 != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(3, barcode1);
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
        if (cardNumber != null)
        {
            codedoutputbytebuffernano.writeMessage(1, cardNumber);
        }
        if (pin != null)
        {
            codedoutputbytebuffernano.writeMessage(2, pin);
        }
        if (barcode != null && barcode.length > 0)
        {
            for (int i = 0; i < barcode.length; i++)
            {
                mergeFrom mergefrom = barcode[i];
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
