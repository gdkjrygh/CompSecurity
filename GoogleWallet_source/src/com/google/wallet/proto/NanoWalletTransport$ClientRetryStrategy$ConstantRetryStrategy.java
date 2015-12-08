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
//            NanoWalletTransport

public static final class clear extends ExtendableMessageNano
{

    public Long delayMillis;
    public Integer totalNumberOfAttempts;

    private clear clear()
    {
        totalNumberOfAttempts = null;
        delayMillis = null;
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
                totalNumberOfAttempts = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 16: // '\020'
                delayMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (totalNumberOfAttempts != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, totalNumberOfAttempts.intValue());
        }
        j = i;
        if (delayMillis != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(2, delayMillis.longValue());
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
        if (totalNumberOfAttempts != null)
        {
            codedoutputbytebuffernano.writeInt32(1, totalNumberOfAttempts.intValue());
        }
        if (delayMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(2, delayMillis.longValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
