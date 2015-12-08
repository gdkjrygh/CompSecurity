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

    public byte configurationId[];
    public com.google.wallet.proto.est.renderInfo renderInfo;
    public renderInfo state;

    private clear clear()
    {
        configurationId = null;
        state = null;
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

            case 18: // '\022'
                if (state == null)
                {
                    state = new state();
                }
                codedinputbytebuffernano.readMessage(state);
                break;

            case 26: // '\032'
                if (renderInfo == null)
                {
                    renderInfo = new com.google.wallet.proto.<init>();
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
        if (state != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, state);
        }
        i = j;
        if (renderInfo != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, renderInfo);
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
        if (state != null)
        {
            codedoutputbytebuffernano.writeMessage(2, state);
        }
        if (renderInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(3, renderInfo);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
