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
//            NanoWalletEntities

public static final class clear extends ExtendableMessageNano
{

    public y base;
    public y minimum;
    public  rate;

    private clear clear()
    {
        base = null;
        rate = null;
        minimum = null;
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
                if (base == null)
                {
                    base = new y();
                }
                codedinputbytebuffernano.readMessage(base);
                break;

            case 18: // '\022'
                if (rate == null)
                {
                    rate = new ();
                }
                codedinputbytebuffernano.readMessage(rate);
                break;

            case 26: // '\032'
                if (minimum == null)
                {
                    minimum = new y();
                }
                codedinputbytebuffernano.readMessage(minimum);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (base != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, base);
        }
        j = i;
        if (rate != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, rate);
        }
        i = j;
        if (minimum != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, minimum);
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
        if (base != null)
        {
            codedoutputbytebuffernano.writeMessage(1, base);
        }
        if (rate != null)
        {
            codedoutputbytebuffernano.writeMessage(2, rate);
        }
        if (minimum != null)
        {
            codedoutputbytebuffernano.writeMessage(3, minimum);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
