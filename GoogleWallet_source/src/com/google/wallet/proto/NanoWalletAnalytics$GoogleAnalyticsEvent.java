// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletAnalytics

public static final class clear extends ExtendableMessageNano
{

    public String action;
    public String category;
    public Dimension customDimensions[];
    public String label;
    public Integer value;

    private clear clear()
    {
        category = null;
        action = null;
        label = null;
        value = null;
        customDimensions = Dimension.emptyArray();
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
                category = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                action = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                label = codedinputbytebuffernano.readString();
                break;

            case 32: // ' '
                value = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 42: // '*'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 42);
                Dimension adimension[];
                int j;
                if (customDimensions == null)
                {
                    j = 0;
                } else
                {
                    j = customDimensions.length;
                }
                adimension = new Dimension[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(customDimensions, 0, adimension, 0, j);
                    k = j;
                }
                for (; k < adimension.length - 1; k++)
                {
                    adimension[k] = new Dimension();
                    codedinputbytebuffernano.readMessage(adimension[k]);
                    codedinputbytebuffernano.readTag();
                }

                adimension[k] = new Dimension();
                codedinputbytebuffernano.readMessage(adimension[k]);
                customDimensions = adimension;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (category != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, category);
        }
        j = i;
        if (action != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, action);
        }
        int l = j;
        if (label != null)
        {
            l = j + CodedOutputByteBufferNano.computeStringSize(3, label);
        }
        i = l;
        if (value != null)
        {
            i = l + CodedOutputByteBufferNano.computeInt32Size(4, value.intValue());
        }
        l = i;
        if (customDimensions != null)
        {
            l = i;
            if (customDimensions.length > 0)
            {
                int k = 0;
                do
                {
                    l = i;
                    if (k >= customDimensions.length)
                    {
                        break;
                    }
                    Dimension dimension = customDimensions[k];
                    l = i;
                    if (dimension != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(5, dimension);
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
        if (category != null)
        {
            codedoutputbytebuffernano.writeString(1, category);
        }
        if (action != null)
        {
            codedoutputbytebuffernano.writeString(2, action);
        }
        if (label != null)
        {
            codedoutputbytebuffernano.writeString(3, label);
        }
        if (value != null)
        {
            codedoutputbytebuffernano.writeInt32(4, value.intValue());
        }
        if (customDimensions != null && customDimensions.length > 0)
        {
            for (int i = 0; i < customDimensions.length; i++)
            {
                Dimension dimension = customDimensions[i];
                if (dimension != null)
                {
                    codedoutputbytebuffernano.writeMessage(5, dimension);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public Dimension()
    {
        clear();
    }
}
