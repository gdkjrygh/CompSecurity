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

    public Boolean ignoreDeadline;
    public byte serverData[];

    private clear clear()
    {
        ignoreDeadline = null;
        serverData = null;
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

            case 16: // '\020'
                ignoreDeadline = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 26: // '\032'
                serverData = codedinputbytebuffernano.readBytes();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (ignoreDeadline != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(2, ignoreDeadline.booleanValue());
        }
        j = i;
        if (serverData != null)
        {
            j = i + CodedOutputByteBufferNano.computeBytesSize(3, serverData);
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
        if (ignoreDeadline != null)
        {
            codedoutputbytebuffernano.writeBool(2, ignoreDeadline.booleanValue());
        }
        if (serverData != null)
        {
            codedoutputbytebuffernano.writeBytes(3, serverData);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
