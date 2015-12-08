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

    public String description;
    public String fees;
    public String nickname;

    private clear clear()
    {
        description = null;
        nickname = null;
        fees = null;
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
                description = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                nickname = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                fees = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (description != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, description);
        }
        j = i;
        if (nickname != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, nickname);
        }
        i = j;
        if (fees != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, fees);
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
        if (description != null)
        {
            codedoutputbytebuffernano.writeString(1, description);
        }
        if (nickname != null)
        {
            codedoutputbytebuffernano.writeString(2, nickname);
        }
        if (fees != null)
        {
            codedoutputbytebuffernano.writeString(3, fees);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
