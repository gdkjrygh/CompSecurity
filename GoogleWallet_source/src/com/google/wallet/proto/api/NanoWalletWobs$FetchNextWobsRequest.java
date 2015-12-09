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
//            NanoWalletWobs

public static final class clear extends ExtendableMessageNano
{

    public Integer categoryId;
    public byte configurationId[];
    public byte nextPageToken[];
    public Integer pageSize;
    public com.google.wallet.proto.o renderInfo;

    private clear clear()
    {
        configurationId = null;
        categoryId = null;
        nextPageToken = null;
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
                configurationId = codedinputbytebuffernano.readBytes();
                break;

            case 16: // '\020'
                categoryId = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 26: // '\032'
                nextPageToken = codedinputbytebuffernano.readBytes();
                break;

            case 32: // ' '
                pageSize = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 42: // '*'
                if (renderInfo == null)
                {
                    renderInfo = new com.google.wallet.proto.o();
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
        if (configurationId != null)
        {
            i = j + CodedOutputByteBufferNano.computeBytesSize(1, configurationId);
        }
        j = i;
        if (categoryId != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(2, categoryId.intValue());
        }
        i = j;
        if (nextPageToken != null)
        {
            i = j + CodedOutputByteBufferNano.computeBytesSize(3, nextPageToken);
        }
        j = i;
        if (pageSize != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(4, pageSize.intValue());
        }
        i = j;
        if (renderInfo != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, renderInfo);
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
        if (configurationId != null)
        {
            codedoutputbytebuffernano.writeBytes(1, configurationId);
        }
        if (categoryId != null)
        {
            codedoutputbytebuffernano.writeInt32(2, categoryId.intValue());
        }
        if (nextPageToken != null)
        {
            codedoutputbytebuffernano.writeBytes(3, nextPageToken);
        }
        if (pageSize != null)
        {
            codedoutputbytebuffernano.writeInt32(4, pageSize.intValue());
        }
        if (renderInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(5, renderInfo);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
