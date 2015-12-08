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

    public renderInfo formSubmission;
    public com.google.wallet.proto.est.renderInfo renderInfo;
    public byte serverData[];

    private clear clear()
    {
        serverData = null;
        formSubmission = null;
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
                serverData = codedinputbytebuffernano.readBytes();
                break;

            case 18: // '\022'
                if (formSubmission == null)
                {
                    formSubmission = new ();
                }
                codedinputbytebuffernano.readMessage(formSubmission);
                break;

            case 26: // '\032'
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
        if (serverData != null)
        {
            i = j + CodedOutputByteBufferNano.computeBytesSize(1, serverData);
        }
        j = i;
        if (formSubmission != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, formSubmission);
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
        if (serverData != null)
        {
            codedoutputbytebuffernano.writeBytes(1, serverData);
        }
        if (formSubmission != null)
        {
            codedoutputbytebuffernano.writeMessage(2, formSubmission);
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
