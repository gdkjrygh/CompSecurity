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
//            NanoWalletLogging

public static final class clear extends ExtendableMessageNano
{

    public String exception;
    public String log;
    public String namespace;

    private clear clear()
    {
        log = null;
        exception = null;
        namespace = null;
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
                log = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                exception = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                namespace = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (log != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, log);
        }
        j = i;
        if (exception != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, exception);
        }
        i = j;
        if (namespace != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, namespace);
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
        if (log != null)
        {
            codedoutputbytebuffernano.writeString(1, log);
        }
        if (exception != null)
        {
            codedoutputbytebuffernano.writeString(2, exception);
        }
        if (namespace != null)
        {
            codedoutputbytebuffernano.writeString(3, namespace);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
