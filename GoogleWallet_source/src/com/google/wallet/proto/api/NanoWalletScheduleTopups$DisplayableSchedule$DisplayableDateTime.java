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
//            NanoWalletScheduleTopups

public static final class clear extends ExtendableMessageNano
{

    public String date;
    public String time;
    public Long timestamp;

    private clear clear()
    {
        timestamp = null;
        date = null;
        time = null;
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
                timestamp = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 18: // '\022'
                date = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                time = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (timestamp != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(1, timestamp.longValue());
        }
        j = i;
        if (date != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, date);
        }
        i = j;
        if (time != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, time);
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
        if (timestamp != null)
        {
            codedoutputbytebuffernano.writeInt64(1, timestamp.longValue());
        }
        if (date != null)
        {
            codedoutputbytebuffernano.writeString(2, date);
        }
        if (time != null)
        {
            codedoutputbytebuffernano.writeString(3, time);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
