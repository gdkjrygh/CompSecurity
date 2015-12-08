// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoCompiledWobl

public static final class clear extends ExtendableMessageNano
{
    public static final class Widget extends ExtendableMessageNano
    {

        public NanoCompiledWobl.ColumnLayoutWidget columnLayout;

        private Widget clear()
        {
            columnLayout = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private Widget mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (columnLayout == null)
                    {
                        columnLayout = new NanoCompiledWobl.ColumnLayoutWidget();
                    }
                    codedinputbytebuffernano.readMessage(columnLayout);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (columnLayout != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, columnLayout);
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
            if (columnLayout != null)
            {
                codedoutputbytebuffernano.writeMessage(1, columnLayout);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Widget()
        {
            clear();
        }
    }


    public Widget widget;

    private ayoutWidget clear()
    {
        widget = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private o mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                if (widget == null)
                {
                    widget = new Widget();
                }
                codedinputbytebuffernano.readMessage(widget);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (widget != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, widget);
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
        if (widget != null)
        {
            codedoutputbytebuffernano.writeMessage(1, widget);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public Widget.clear()
    {
        clear();
    }
}
