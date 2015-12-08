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
//            NanoWalletGiftCards

public static final class clear extends ExtendableMessageNano
{

    public String continuationToken;
    public Integer pageSize;
    public String queryString;
    public com.google.wallet.proto.est.renderInfo renderInfo;

    private clear clear()
    {
        queryString = null;
        continuationToken = null;
        pageSize = null;
        renderInfo = null;
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
                queryString = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                continuationToken = codedinputbytebuffernano.readString();
                break;

            case 24: // '\030'
                pageSize = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 34: // '"'
                if (renderInfo == null)
                {
                    renderInfo = new com.google.wallet.proto.est.renderInfo();
                }
                codedinputbytebuffernano.readMessage(renderInfo);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (queryString != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, queryString);
        }
        j = i;
        if (continuationToken != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, continuationToken);
        }
        i = j;
        if (pageSize != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, pageSize.intValue());
        }
        j = i;
        if (renderInfo != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, renderInfo);
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
        if (queryString != null)
        {
            codedoutputbytebuffernano.writeString(1, queryString);
        }
        if (continuationToken != null)
        {
            codedoutputbytebuffernano.writeString(2, continuationToken);
        }
        if (pageSize != null)
        {
            codedoutputbytebuffernano.writeInt32(3, pageSize.intValue());
        }
        if (renderInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(4, renderInfo);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
