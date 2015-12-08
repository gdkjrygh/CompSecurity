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

    public String buildIdentifier;
    public es capabilities;
    public es deviceContext;
    public es pinToken;
    public es profileToken;
    public es walletContext;

    private clear clear()
    {
        deviceContext = null;
        walletContext = null;
        capabilities = null;
        pinToken = null;
        profileToken = null;
        buildIdentifier = null;
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
                if (deviceContext == null)
                {
                    deviceContext = new >();
                }
                codedinputbytebuffernano.readMessage(deviceContext);
                break;

            case 18: // '\022'
                if (walletContext == null)
                {
                    walletContext = new >();
                }
                codedinputbytebuffernano.readMessage(walletContext);
                break;

            case 26: // '\032'
                if (capabilities == null)
                {
                    capabilities = new es();
                }
                codedinputbytebuffernano.readMessage(capabilities);
                break;

            case 34: // '"'
                if (pinToken == null)
                {
                    pinToken = new pinToken();
                }
                codedinputbytebuffernano.readMessage(pinToken);
                break;

            case 42: // '*'
                if (profileToken == null)
                {
                    profileToken = new it>();
                }
                codedinputbytebuffernano.readMessage(profileToken);
                break;

            case 50: // '2'
                buildIdentifier = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (deviceContext != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, deviceContext);
        }
        j = i;
        if (walletContext != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, walletContext);
        }
        i = j;
        if (capabilities != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, capabilities);
        }
        j = i;
        if (pinToken != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, pinToken);
        }
        i = j;
        if (profileToken != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, profileToken);
        }
        j = i;
        if (buildIdentifier != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(6, buildIdentifier);
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
        if (deviceContext != null)
        {
            codedoutputbytebuffernano.writeMessage(1, deviceContext);
        }
        if (walletContext != null)
        {
            codedoutputbytebuffernano.writeMessage(2, walletContext);
        }
        if (capabilities != null)
        {
            codedoutputbytebuffernano.writeMessage(3, capabilities);
        }
        if (pinToken != null)
        {
            codedoutputbytebuffernano.writeMessage(4, pinToken);
        }
        if (profileToken != null)
        {
            codedoutputbytebuffernano.writeMessage(5, profileToken);
        }
        if (buildIdentifier != null)
        {
            codedoutputbytebuffernano.writeString(6, buildIdentifier);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public es()
    {
        clear();
    }
}
