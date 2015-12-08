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

    public fier id;
    public ta metadata;
    public String publicKey;
    public String signingKey;

    private clear clear()
    {
        id = null;
        metadata = null;
        publicKey = null;
        signingKey = null;
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
                if (id == null)
                {
                    id = new fier();
                }
                codedinputbytebuffernano.readMessage(id);
                break;

            case 18: // '\022'
                if (metadata == null)
                {
                    metadata = new ta();
                }
                codedinputbytebuffernano.readMessage(metadata);
                break;

            case 26: // '\032'
                publicKey = codedinputbytebuffernano.readString();
                break;

            case 34: // '"'
                signingKey = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (id != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, id);
        }
        j = i;
        if (metadata != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, metadata);
        }
        i = j;
        if (publicKey != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, publicKey);
        }
        j = i;
        if (signingKey != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, signingKey);
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
        if (id != null)
        {
            codedoutputbytebuffernano.writeMessage(1, id);
        }
        if (metadata != null)
        {
            codedoutputbytebuffernano.writeMessage(2, metadata);
        }
        if (publicKey != null)
        {
            codedoutputbytebuffernano.writeString(3, publicKey);
        }
        if (signingKey != null)
        {
            codedoutputbytebuffernano.writeString(4, signingKey);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ta()
    {
        clear();
    }
}
