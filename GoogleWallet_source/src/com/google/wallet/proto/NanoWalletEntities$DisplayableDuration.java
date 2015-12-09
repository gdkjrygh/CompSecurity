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

    public String displayDuration;
    public Long durationMillis;

    private clear clear()
    {
        durationMillis = null;
        displayDuration = null;
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
                durationMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 18: // '\022'
                displayDuration = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (durationMillis != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(1, durationMillis.longValue());
        }
        j = i;
        if (displayDuration != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, displayDuration);
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
        if (durationMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(1, durationMillis.longValue());
        }
        if (displayDuration != null)
        {
            codedoutputbytebuffernano.writeString(2, displayDuration);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
