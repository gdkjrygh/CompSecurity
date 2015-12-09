// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletFundsTransfer

public static final class clear extends ExtendableMessageNano
{

    public String description;
    public String descriptionPrefix;
    public String explanation;
    public nk helpLink;

    private clear clear()
    {
        descriptionPrefix = null;
        description = null;
        explanation = null;
        helpLink = null;
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
                descriptionPrefix = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                description = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                explanation = codedinputbytebuffernano.readString();
                break;

            case 34: // '"'
                if (helpLink == null)
                {
                    helpLink = new nk();
                }
                codedinputbytebuffernano.readMessage(helpLink);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (descriptionPrefix != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, descriptionPrefix);
        }
        j = i;
        if (description != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, description);
        }
        i = j;
        if (explanation != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, explanation);
        }
        j = i;
        if (helpLink != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, helpLink);
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
        if (descriptionPrefix != null)
        {
            codedoutputbytebuffernano.writeString(1, descriptionPrefix);
        }
        if (description != null)
        {
            codedoutputbytebuffernano.writeString(2, description);
        }
        if (explanation != null)
        {
            codedoutputbytebuffernano.writeString(3, explanation);
        }
        if (helpLink != null)
        {
            codedoutputbytebuffernano.writeMessage(4, helpLink);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public nk()
    {
        clear();
    }
}
