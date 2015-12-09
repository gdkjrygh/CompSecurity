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
//            NanoCompiledWobl

public static final class clear extends ExtendableMessageNano
{

    public inlineTextContent inlineTextContent[];
    public inlineTextContent textBoxAttributes;
    public inlineTextContent textStyleAttributes;

    private clear clear()
    {
        textBoxAttributes = null;
        textStyleAttributes = null;
        inlineTextContent = Array();
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
                if (textBoxAttributes == null)
                {
                    textBoxAttributes = new >();
                }
                codedinputbytebuffernano.readMessage(textBoxAttributes);
                break;

            case 18: // '\022'
                if (textStyleAttributes == null)
                {
                    textStyleAttributes = new it>();
                }
                codedinputbytebuffernano.readMessage(textStyleAttributes);
                break;

            case 26: // '\032'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                cachedSize acachedsize[];
                int j;
                if (inlineTextContent == null)
                {
                    j = 0;
                } else
                {
                    j = inlineTextContent.length;
                }
                acachedsize = new inlineTextContent[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(inlineTextContent, 0, acachedsize, 0, j);
                    k = j;
                }
                for (; k < acachedsize.length - 1; k++)
                {
                    acachedsize[k] = new >();
                    codedinputbytebuffernano.readMessage(acachedsize[k]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize[k] = new >();
                codedinputbytebuffernano.readMessage(acachedsize[k]);
                inlineTextContent = acachedsize;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (textBoxAttributes != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(1, textBoxAttributes);
        }
        i = j;
        if (textStyleAttributes != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(2, textStyleAttributes);
        }
        int l = i;
        if (inlineTextContent != null)
        {
            l = i;
            if (inlineTextContent.length > 0)
            {
                int k = 0;
                do
                {
                    l = i;
                    if (k >= inlineTextContent.length)
                    {
                        break;
                    }
                    inlineTextContent inlinetextcontent = inlineTextContent[k];
                    l = i;
                    if (inlinetextcontent != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(3, inlinetextcontent);
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
        if (textBoxAttributes != null)
        {
            codedoutputbytebuffernano.writeMessage(1, textBoxAttributes);
        }
        if (textStyleAttributes != null)
        {
            codedoutputbytebuffernano.writeMessage(2, textStyleAttributes);
        }
        if (inlineTextContent != null && inlineTextContent.length > 0)
        {
            for (int i = 0; i < inlineTextContent.length; i++)
            {
                mergeFrom mergefrom = inlineTextContent[i];
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
