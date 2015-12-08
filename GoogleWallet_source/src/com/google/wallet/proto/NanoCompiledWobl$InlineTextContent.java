// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoCompiledWobl

public static final class clear extends ExtendableMessageNano
{
    public static final class Date extends ExtendableMessageNano
    {

        public String absoluteTemplate;
        public Long millisSinceEpoch;
        public Integer style;
        public NanoCompiledWobl.TextStyleAttributes textStyleAttributes;
        public String timeZone;

        private Date clear()
        {
            textStyleAttributes = null;
            millisSinceEpoch = null;
            style = null;
            absoluteTemplate = null;
            timeZone = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private Date mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L8:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 6: default 64
        //                       0: 73
        //                       10: 75
        //                       16: 104
        //                       24: 118
        //                       34: 166
        //                       42: 177;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
_L2:
            return this;
_L3:
            if (textStyleAttributes == null)
            {
                textStyleAttributes = new NanoCompiledWobl.TextStyleAttributes();
            }
            codedinputbytebuffernano.readMessage(textStyleAttributes);
              goto _L8
_L4:
            millisSinceEpoch = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L8
_L5:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                style = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L6:
            absoluteTemplate = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L7:
            timeZone = codedinputbytebuffernano.readString();
            if (true) goto _L8; else goto _L9
_L9:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (textStyleAttributes != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, textStyleAttributes);
            }
            j = i;
            if (millisSinceEpoch != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(2, millisSinceEpoch.longValue());
            }
            i = j;
            if (style != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, style.intValue());
            }
            j = i;
            if (absoluteTemplate != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, absoluteTemplate);
            }
            i = j;
            if (timeZone != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, timeZone);
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
            if (textStyleAttributes != null)
            {
                codedoutputbytebuffernano.writeMessage(1, textStyleAttributes);
            }
            if (millisSinceEpoch != null)
            {
                codedoutputbytebuffernano.writeInt64(2, millisSinceEpoch.longValue());
            }
            if (style != null)
            {
                codedoutputbytebuffernano.writeInt32(3, style.intValue());
            }
            if (absoluteTemplate != null)
            {
                codedoutputbytebuffernano.writeString(4, absoluteTemplate);
            }
            if (timeZone != null)
            {
                codedoutputbytebuffernano.writeString(5, timeZone);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Date()
        {
            clear();
        }
    }

    public static final class Link extends ExtendableMessageNano
    {

        public NanoCompiledWobl.TapUri tapUri[];
        public String text;
        public NanoCompiledWobl.TextStyleAttributes textStyleAttributes;

        private Link clear()
        {
            textStyleAttributes = null;
            tapUri = NanoCompiledWobl.TapUri.emptyArray();
            text = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private Link mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (textStyleAttributes == null)
                    {
                        textStyleAttributes = new NanoCompiledWobl.TextStyleAttributes();
                    }
                    codedinputbytebuffernano.readMessage(textStyleAttributes);
                    break;

                case 18: // '\022'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                    NanoCompiledWobl.TapUri atapuri[];
                    int j;
                    if (tapUri == null)
                    {
                        j = 0;
                    } else
                    {
                        j = tapUri.length;
                    }
                    atapuri = new NanoCompiledWobl.TapUri[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(tapUri, 0, atapuri, 0, j);
                        k = j;
                    }
                    for (; k < atapuri.length - 1; k++)
                    {
                        atapuri[k] = new NanoCompiledWobl.TapUri();
                        codedinputbytebuffernano.readMessage(atapuri[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    atapuri[k] = new NanoCompiledWobl.TapUri();
                    codedinputbytebuffernano.readMessage(atapuri[k]);
                    tapUri = atapuri;
                    break;

                case 26: // '\032'
                    text = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (textStyleAttributes != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, textStyleAttributes);
            }
            j = i;
            if (tapUri != null)
            {
                j = i;
                if (tapUri.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= tapUri.length)
                        {
                            break;
                        }
                        NanoCompiledWobl.TapUri tapuri = tapUri[k];
                        j = i;
                        if (tapuri != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(2, tapuri);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (text != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, text);
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
            if (textStyleAttributes != null)
            {
                codedoutputbytebuffernano.writeMessage(1, textStyleAttributes);
            }
            if (tapUri != null && tapUri.length > 0)
            {
                for (int i = 0; i < tapUri.length; i++)
                {
                    NanoCompiledWobl.TapUri tapuri = tapUri[i];
                    if (tapuri != null)
                    {
                        codedoutputbytebuffernano.writeMessage(2, tapuri);
                    }
                }

            }
            if (text != null)
            {
                codedoutputbytebuffernano.writeString(3, text);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Link()
        {
            clear();
        }
    }


    private static volatile date _emptyArray[];
    public Date date;
    public Link link;
    public String text;

    private s clear()
    {
        text = null;
        link = null;
        date = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    public static cachedSize[] emptyArray()
    {
        if (_emptyArray == null)
        {
            synchronized (InternalNano.LAZY_INIT_LOCK)
            {
                if (_emptyArray == null)
                {
                    _emptyArray = new _emptyArray[0];
                }
            }
        }
        return _emptyArray;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private _emptyArray mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                text = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                if (link == null)
                {
                    link = new Link();
                }
                codedinputbytebuffernano.readMessage(link);
                break;

            case 26: // '\032'
                if (date == null)
                {
                    date = new Date();
                }
                codedinputbytebuffernano.readMessage(date);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (text != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, text);
        }
        j = i;
        if (link != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, link);
        }
        i = j;
        if (date != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, date);
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
        if (text != null)
        {
            codedoutputbytebuffernano.writeString(1, text);
        }
        if (link != null)
        {
            codedoutputbytebuffernano.writeMessage(2, link);
        }
        if (date != null)
        {
            codedoutputbytebuffernano.writeMessage(3, date);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public Link.clear()
    {
        clear();
    }
}
