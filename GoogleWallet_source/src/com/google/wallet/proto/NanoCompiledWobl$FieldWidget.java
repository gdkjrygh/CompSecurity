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
    public static final class FieldChild extends ExtendableMessageNano
    {

        public NanoCompiledWobl.InlineTextContent inlineTextContent[];
        public NanoCompiledWobl.TextBoxAttributes textBoxAttributes;
        public NanoCompiledWobl.TextStyleAttributes textStyleAttributes;

        private FieldChild clear()
        {
            textBoxAttributes = null;
            textStyleAttributes = null;
            inlineTextContent = NanoCompiledWobl.InlineTextContent.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FieldChild mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                        textBoxAttributes = new NanoCompiledWobl.TextBoxAttributes();
                    }
                    codedinputbytebuffernano.readMessage(textBoxAttributes);
                    break;

                case 18: // '\022'
                    if (textStyleAttributes == null)
                    {
                        textStyleAttributes = new NanoCompiledWobl.TextStyleAttributes();
                    }
                    codedinputbytebuffernano.readMessage(textStyleAttributes);
                    break;

                case 26: // '\032'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    NanoCompiledWobl.InlineTextContent ainlinetextcontent[];
                    int j;
                    if (inlineTextContent == null)
                    {
                        j = 0;
                    } else
                    {
                        j = inlineTextContent.length;
                    }
                    ainlinetextcontent = new NanoCompiledWobl.InlineTextContent[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(inlineTextContent, 0, ainlinetextcontent, 0, j);
                        k = j;
                    }
                    for (; k < ainlinetextcontent.length - 1; k++)
                    {
                        ainlinetextcontent[k] = new NanoCompiledWobl.InlineTextContent();
                        codedinputbytebuffernano.readMessage(ainlinetextcontent[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    ainlinetextcontent[k] = new NanoCompiledWobl.InlineTextContent();
                    codedinputbytebuffernano.readMessage(ainlinetextcontent[k]);
                    inlineTextContent = ainlinetextcontent;
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
                        NanoCompiledWobl.InlineTextContent inlinetextcontent = inlineTextContent[k];
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
                    NanoCompiledWobl.InlineTextContent inlinetextcontent = inlineTextContent[i];
                    if (inlinetextcontent != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, inlinetextcontent);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public FieldChild()
        {
            clear();
        }
    }


    public FieldChild name;
    public FieldChild value;
    public utes widgetAttributes;

    private ributes clear()
    {
        widgetAttributes = null;
        name = null;
        value = null;
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
                    widgetAttributes = new utes();
                }
                codedinputbytebuffernano.readMessage(widgetAttributes);
                break;

            case 18: // '\022'
                if (name == null)
                {
                    name = new FieldChild();
                }
                codedinputbytebuffernano.readMessage(name);
                break;

            case 26: // '\032'
                if (value == null)
                {
                    value = new FieldChild();
                }
                codedinputbytebuffernano.readMessage(value);
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
        if (name != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, name);
        }
        i = j;
        if (value != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, value);
        }
        return i;
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
        if (name != null)
        {
            codedoutputbytebuffernano.writeMessage(2, name);
        }
        if (value != null)
        {
            codedoutputbytebuffernano.writeMessage(3, value);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public FieldChild.clear()
    {
        clear();
    }
}
