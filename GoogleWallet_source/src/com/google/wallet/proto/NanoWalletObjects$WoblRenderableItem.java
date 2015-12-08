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
//            NanoWalletObjects

public static final class clear extends ExtendableMessageNano
{

    public String entityUri;
    public entityUri renderOutput;

    private clear clear()
    {
        renderOutput = null;
        entityUri = null;
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
                if (renderOutput == null)
                {
                    renderOutput = new renderOutput();
                }
                codedinputbytebuffernano.readMessage(renderOutput);
                break;

            case 18: // '\022'
                entityUri = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (renderOutput != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, renderOutput);
        }
        j = i;
        if (entityUri != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, entityUri);
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
        if (renderOutput != null)
        {
            codedoutputbytebuffernano.writeMessage(1, renderOutput);
        }
        if (entityUri != null)
        {
            codedoutputbytebuffernano.writeString(2, entityUri);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
