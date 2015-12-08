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

    public ontent inlineTextContent[];
    public ibutes textBoxAttributes;
    public tributes textStyleAttributes;
    public butes widgetAttributes;

    private clear clear()
    {
        widgetAttributes = null;
        textBoxAttributes = null;
        textStyleAttributes = null;
        inlineTextContent = ontent.emptyArray();
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
                if (widgetAttributes == null)
                {
                    widgetAttributes = new butes();
                }
                codedinputbytebuffernano.readMessage(widgetAttributes);
                break;

            case 18: // '\022'
                if (textBoxAttributes == null)
                {
                    textBoxAttributes = new ibutes();
                }
                codedinputbytebuffernano.readMessage(textBoxAttributes);
                break;

            case 26: // '\032'
                if (textStyleAttributes == null)
                {
                    textStyleAttributes = new tributes();
                }
                codedinputbytebuffernano.readMessage(textStyleAttributes);
                break;

            case 34: // '"'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                ontent aontent[];
                int j;
                if (inlineTextContent == null)
                {
                    j = 0;
                } else
                {
                    j = inlineTextContent.length;
                }
                aontent = new ontent[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(inlineTextContent, 0, aontent, 0, j);
                    k = j;
                }
                for (; k < aontent.length - 1; k++)
                {
                    aontent[k] = new ontent();
                    codedinputbytebuffernano.readMessage(aontent[k]);
                    codedinputbytebuffernano.readTag();
                }

                aontent[k] = new ontent();
                codedinputbytebuffernano.readMessage(aontent[k]);
                inlineTextContent = aontent;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (widgetAttributes != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, widgetAttributes);
        }
        j = i;
        if (textBoxAttributes != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, textBoxAttributes);
        }
        i = j;
        if (textStyleAttributes != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, textStyleAttributes);
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
                    ontent ontent = inlineTextContent[k];
                    l = i;
                    if (ontent != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(4, ontent);
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
        if (widgetAttributes != null)
        {
            codedoutputbytebuffernano.writeMessage(1, widgetAttributes);
        }
        if (textBoxAttributes != null)
        {
            codedoutputbytebuffernano.writeMessage(2, textBoxAttributes);
        }
        if (textStyleAttributes != null)
        {
            codedoutputbytebuffernano.writeMessage(3, textStyleAttributes);
        }
        if (inlineTextContent != null && inlineTextContent.length > 0)
        {
            for (int i = 0; i < inlineTextContent.length; i++)
            {
                ontent ontent = inlineTextContent[i];
                if (ontent != null)
                {
                    codedoutputbytebuffernano.writeMessage(4, ontent);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public butes()
    {
        clear();
    }
}
