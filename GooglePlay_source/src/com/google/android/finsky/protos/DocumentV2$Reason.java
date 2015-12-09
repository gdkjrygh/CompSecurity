// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.finsky.protos:
//            DocumentV2

public static final class cachedSize extends MessageNano
{

    private static volatile reasonUserAction _emptyArray[];
    public String descriptionHtml;
    public al dismissal;
    public boolean hasDescriptionHtml;
    public lusOne reasonPlusOne;
    public eview reasonReview;
    public serAction reasonUserAction;

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

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasDescriptionHtml)
            {
                i = j;
                if (descriptionHtml.equals(""))
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeStringSize(3, descriptionHtml);
        }
        int k = i;
        if (reasonPlusOne != null)
        {
            k = i + CodedOutputByteBufferNano.computeMessageSize(4, reasonPlusOne);
        }
        i = k;
        if (reasonReview != null)
        {
            i = k + CodedOutputByteBufferNano.computeMessageSize(5, reasonReview);
        }
        k = i;
        if (dismissal != null)
        {
            k = i + CodedOutputByteBufferNano.computeMessageSize(7, dismissal);
        }
        i = k;
        if (reasonUserAction != null)
        {
            i = k + CodedOutputByteBufferNano.computeMessageSize(9, reasonUserAction);
        }
        return i;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        do
        {
            int i = codedinputbytebuffernano.readTag();
            switch (i)
            {
            default:
                if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 26: // '\032'
                descriptionHtml = codedinputbytebuffernano.readString();
                hasDescriptionHtml = true;
                break;

            case 34: // '"'
                if (reasonPlusOne == null)
                {
                    reasonPlusOne = new lusOne();
                }
                codedinputbytebuffernano.readMessage(reasonPlusOne);
                break;

            case 42: // '*'
                if (reasonReview == null)
                {
                    reasonReview = new eview();
                }
                codedinputbytebuffernano.readMessage(reasonReview);
                break;

            case 58: // ':'
                if (dismissal == null)
                {
                    dismissal = new al();
                }
                codedinputbytebuffernano.readMessage(dismissal);
                break;

            case 74: // 'J'
                if (reasonUserAction == null)
                {
                    reasonUserAction = new serAction();
                }
                codedinputbytebuffernano.readMessage(reasonUserAction);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasDescriptionHtml || !descriptionHtml.equals(""))
        {
            codedoutputbytebuffernano.writeString(3, descriptionHtml);
        }
        if (reasonPlusOne != null)
        {
            codedoutputbytebuffernano.writeMessage(4, reasonPlusOne);
        }
        if (reasonReview != null)
        {
            codedoutputbytebuffernano.writeMessage(5, reasonReview);
        }
        if (dismissal != null)
        {
            codedoutputbytebuffernano.writeMessage(7, dismissal);
        }
        if (reasonUserAction != null)
        {
            codedoutputbytebuffernano.writeMessage(9, reasonUserAction);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public serAction()
    {
        dismissal = null;
        descriptionHtml = "";
        hasDescriptionHtml = false;
        reasonPlusOne = null;
        reasonReview = null;
        reasonUserAction = null;
        cachedSize = -1;
    }
}
