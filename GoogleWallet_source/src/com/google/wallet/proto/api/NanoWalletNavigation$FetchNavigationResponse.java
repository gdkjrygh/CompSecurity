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
//            NanoWalletNavigation

public static final class clear extends ExtendableMessageNano
{

    public byte token[];
    public token topNavigation;

    private clear clear()
    {
        topNavigation = null;
        token = null;
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
                if (topNavigation == null)
                {
                    topNavigation = new topNavigation();
                }
                codedinputbytebuffernano.readMessage(topNavigation);
                break;

            case 18: // '\022'
                token = codedinputbytebuffernano.readBytes();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (topNavigation != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, topNavigation);
        }
        j = i;
        if (token != null)
        {
            j = i + CodedOutputByteBufferNano.computeBytesSize(2, token);
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
        if (topNavigation != null)
        {
            codedoutputbytebuffernano.writeMessage(1, topNavigation);
        }
        if (token != null)
        {
            codedoutputbytebuffernano.writeBytes(2, token);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
