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
//            NanoWalletEntities

public static final class clear extends ExtendableMessageNano
{

    private static volatile longMessage _emptyArray[];
    public String longMessage;
    public longMessage restriction;
    public String shortMessage;
    public longMessage use;

    private clear clear()
    {
        use = null;
        restriction = null;
        shortMessage = null;
        longMessage = null;
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
                if (use == null)
                {
                    use = new use();
                }
                codedinputbytebuffernano.readMessage(use);
                break;

            case 18: // '\022'
                if (restriction == null)
                {
                    restriction = new restriction();
                }
                codedinputbytebuffernano.readMessage(restriction);
                break;

            case 26: // '\032'
                shortMessage = codedinputbytebuffernano.readString();
                break;

            case 34: // '"'
                longMessage = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (use != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, use);
        }
        j = i;
        if (restriction != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, restriction);
        }
        i = j;
        if (shortMessage != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, shortMessage);
        }
        j = i;
        if (longMessage != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, longMessage);
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
        if (use != null)
        {
            codedoutputbytebuffernano.writeMessage(1, use);
        }
        if (restriction != null)
        {
            codedoutputbytebuffernano.writeMessage(2, restriction);
        }
        if (shortMessage != null)
        {
            codedoutputbytebuffernano.writeString(3, shortMessage);
        }
        if (longMessage != null)
        {
            codedoutputbytebuffernano.writeString(4, longMessage);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
