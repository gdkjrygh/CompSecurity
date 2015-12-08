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

    public imension customDimensions[];
    public String name;

    private clear clear()
    {
        name = null;
        customDimensions = imension.emptyArray();
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
                name = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                imension aimension[];
                int j;
                if (customDimensions == null)
                {
                    j = 0;
                } else
                {
                    j = customDimensions.length;
                }
                aimension = new imension[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(customDimensions, 0, aimension, 0, j);
                    k = j;
                }
                for (; k < aimension.length - 1; k++)
                {
                    aimension[k] = new imension();
                    codedinputbytebuffernano.readMessage(aimension[k]);
                    codedinputbytebuffernano.readTag();
                }

                aimension[k] = new imension();
                codedinputbytebuffernano.readMessage(aimension[k]);
                customDimensions = aimension;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (name != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, name);
        }
        int l = i;
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
                    imension imension = customDimensions[k];
                    l = i;
                    if (imension != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(2, imension);
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
        if (name != null)
        {
            codedoutputbytebuffernano.writeString(1, name);
        }
        if (customDimensions != null && customDimensions.length > 0)
        {
            for (int i = 0; i < customDimensions.length; i++)
            {
                imension imension = customDimensions[i];
                if (imension != null)
                {
                    codedoutputbytebuffernano.writeMessage(2, imension);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public imension()
    {
        clear();
    }
}
