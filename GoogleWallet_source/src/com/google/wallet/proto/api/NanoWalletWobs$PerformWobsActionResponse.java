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

    public com.google.wallet.proto.nse.redirectUri callError;
    public String redirectUri;
    public String toastMessage;
    public com.google.wallet.proto.nse.redirectUri updatedWobInstance;

    private clear clear()
    {
        updatedWobInstance = null;
        toastMessage = null;
        callError = null;
        redirectUri = null;
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
                if (updatedWobInstance == null)
                {
                    updatedWobInstance = new com.google.wallet.proto.nse.updatedWobInstance();
                }
                codedinputbytebuffernano.readMessage(updatedWobInstance);
                break;

            case 18: // '\022'
                toastMessage = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                if (callError == null)
                {
                    callError = new com.google.wallet.proto.nse.callError();
                }
                codedinputbytebuffernano.readMessage(callError);
                break;

            case 34: // '"'
                redirectUri = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (updatedWobInstance != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, updatedWobInstance);
        }
        j = i;
        if (toastMessage != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, toastMessage);
        }
        i = j;
        if (callError != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, callError);
        }
        j = i;
        if (redirectUri != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, redirectUri);
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
        if (updatedWobInstance != null)
        {
            codedoutputbytebuffernano.writeMessage(1, updatedWobInstance);
        }
        if (toastMessage != null)
        {
            codedoutputbytebuffernano.writeString(2, toastMessage);
        }
        if (callError != null)
        {
            codedoutputbytebuffernano.writeMessage(3, callError);
        }
        if (redirectUri != null)
        {
            codedoutputbytebuffernano.writeString(4, redirectUri);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
