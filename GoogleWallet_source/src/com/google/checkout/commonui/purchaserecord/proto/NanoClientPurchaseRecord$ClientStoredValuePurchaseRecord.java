// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.checkout.commonui.purchaserecord.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.checkout.commonui.purchaserecord.proto:
//            NanoClientPurchaseRecord

public static final class clear extends ExtendableMessageNano
{

    public String description;
    public feeInfo destination;
    public feeInfo feeInfo;
    public feeInfo source;

    private clear clear()
    {
        source = null;
        destination = null;
        description = null;
        feeInfo = null;
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
                if (source == null)
                {
                    source = new source();
                }
                codedinputbytebuffernano.readMessage(source);
                break;

            case 18: // '\022'
                if (destination == null)
                {
                    destination = new destination();
                }
                codedinputbytebuffernano.readMessage(destination);
                break;

            case 26: // '\032'
                description = codedinputbytebuffernano.readString();
                break;

            case 58: // ':'
                if (feeInfo == null)
                {
                    feeInfo = new feeInfo();
                }
                codedinputbytebuffernano.readMessage(feeInfo);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (source != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, source);
        }
        j = i;
        if (destination != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, destination);
        }
        i = j;
        if (description != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, description);
        }
        j = i;
        if (feeInfo != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(7, feeInfo);
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
        if (source != null)
        {
            codedoutputbytebuffernano.writeMessage(1, source);
        }
        if (destination != null)
        {
            codedoutputbytebuffernano.writeMessage(2, destination);
        }
        if (description != null)
        {
            codedoutputbytebuffernano.writeString(3, description);
        }
        if (feeInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(7, feeInfo);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
