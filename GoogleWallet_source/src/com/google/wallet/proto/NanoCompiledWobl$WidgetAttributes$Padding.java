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

    public left bottom;
    public left left;
    public left right;
    public left top;

    private clear clear()
    {
        top = null;
        right = null;
        bottom = null;
        left = null;
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
                if (top == null)
                {
                    top = new top();
                }
                codedinputbytebuffernano.readMessage(top);
                break;

            case 18: // '\022'
                if (right == null)
                {
                    right = new right();
                }
                codedinputbytebuffernano.readMessage(right);
                break;

            case 26: // '\032'
                if (bottom == null)
                {
                    bottom = new bottom();
                }
                codedinputbytebuffernano.readMessage(bottom);
                break;

            case 34: // '"'
                if (left == null)
                {
                    left = new left();
                }
                codedinputbytebuffernano.readMessage(left);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (top != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, top);
        }
        j = i;
        if (right != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, right);
        }
        i = j;
        if (bottom != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, bottom);
        }
        j = i;
        if (left != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, left);
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
        if (top != null)
        {
            codedoutputbytebuffernano.writeMessage(1, top);
        }
        if (right != null)
        {
            codedoutputbytebuffernano.writeMessage(2, right);
        }
        if (bottom != null)
        {
            codedoutputbytebuffernano.writeMessage(3, bottom);
        }
        if (left != null)
        {
            codedoutputbytebuffernano.writeMessage(4, left);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
