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
    public byte metadata[];
    public byte nextPageToken[];

    private clear clear()
    {
        categoryId = null;
        metadata = null;
        nextPageToken = null;
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

            case 8: // '\b'
                categoryId = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 18: // '\022'
                metadata = codedinputbytebuffernano.readBytes();
                break;

            case 26: // '\032'
                nextPageToken = codedinputbytebuffernano.readBytes();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (categoryId != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, categoryId.intValue());
        }
        j = i;
        if (metadata != null)
        {
            j = i + CodedOutputByteBufferNano.computeBytesSize(2, metadata);
        }
        i = j;
        if (nextPageToken != null)
        {
            i = j + CodedOutputByteBufferNano.computeBytesSize(3, nextPageToken);
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
        if (categoryId != null)
        {
            codedoutputbytebuffernano.writeInt32(1, categoryId.intValue());
        }
        if (metadata != null)
        {
            codedoutputbytebuffernano.writeBytes(2, metadata);
        }
        if (nextPageToken != null)
        {
            codedoutputbytebuffernano.writeBytes(3, nextPageToken);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
