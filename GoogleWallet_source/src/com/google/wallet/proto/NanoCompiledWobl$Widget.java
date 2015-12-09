// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoCompiledWobl

public static final class clear extends ExtendableMessageNano
{

    private static volatile no _emptyArray[];
    public idget actionWidget;
    public Widget barcodeWidget;
    public ayoutWidget columnLayoutWidget;
    public dget fieldWidget;
    public dget imageWidget;
    public get lineWidget;
    public Widget spinnerWidget;
    public get textWidget;

    private clear clear()
    {
        actionWidget = null;
        barcodeWidget = null;
        columnLayoutWidget = null;
        fieldWidget = null;
        imageWidget = null;
        lineWidget = null;
        textWidget = null;
        spinnerWidget = null;
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
                if (actionWidget == null)
                {
                    actionWidget = new idget();
                }
                codedinputbytebuffernano.readMessage(actionWidget);
                break;

            case 18: // '\022'
                if (barcodeWidget == null)
                {
                    barcodeWidget = new Widget();
                }
                codedinputbytebuffernano.readMessage(barcodeWidget);
                break;

            case 26: // '\032'
                if (columnLayoutWidget == null)
                {
                    columnLayoutWidget = new ayoutWidget();
                }
                codedinputbytebuffernano.readMessage(columnLayoutWidget);
                break;

            case 34: // '"'
                if (fieldWidget == null)
                {
                    fieldWidget = new dget();
                }
                codedinputbytebuffernano.readMessage(fieldWidget);
                break;

            case 42: // '*'
                if (imageWidget == null)
                {
                    imageWidget = new dget();
                }
                codedinputbytebuffernano.readMessage(imageWidget);
                break;

            case 50: // '2'
                if (lineWidget == null)
                {
                    lineWidget = new get();
                }
                codedinputbytebuffernano.readMessage(lineWidget);
                break;

            case 58: // ':'
                if (textWidget == null)
                {
                    textWidget = new get();
                }
                codedinputbytebuffernano.readMessage(textWidget);
                break;

            case 66: // 'B'
                if (spinnerWidget == null)
                {
                    spinnerWidget = new Widget();
                }
                codedinputbytebuffernano.readMessage(spinnerWidget);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (actionWidget != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, actionWidget);
        }
        j = i;
        if (barcodeWidget != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, barcodeWidget);
        }
        i = j;
        if (columnLayoutWidget != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, columnLayoutWidget);
        }
        j = i;
        if (fieldWidget != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, fieldWidget);
        }
        i = j;
        if (imageWidget != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, imageWidget);
        }
        j = i;
        if (lineWidget != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(6, lineWidget);
        }
        i = j;
        if (textWidget != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(7, textWidget);
        }
        j = i;
        if (spinnerWidget != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(8, spinnerWidget);
        }
        return j;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (actionWidget != null)
        {
            codedoutputbytebuffernano.writeMessage(1, actionWidget);
        }
        if (barcodeWidget != null)
        {
            codedoutputbytebuffernano.writeMessage(2, barcodeWidget);
        }
        if (columnLayoutWidget != null)
        {
            codedoutputbytebuffernano.writeMessage(3, columnLayoutWidget);
        }
        if (fieldWidget != null)
        {
            codedoutputbytebuffernano.writeMessage(4, fieldWidget);
        }
        if (imageWidget != null)
        {
            codedoutputbytebuffernano.writeMessage(5, imageWidget);
        }
        if (lineWidget != null)
        {
            codedoutputbytebuffernano.writeMessage(6, lineWidget);
        }
        if (textWidget != null)
        {
            codedoutputbytebuffernano.writeMessage(7, textWidget);
        }
        if (spinnerWidget != null)
        {
            codedoutputbytebuffernano.writeMessage(8, spinnerWidget);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public no()
    {
        clear();
    }
}
