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
//            NanoWalletSetup

public static final class clear extends ExtendableMessageNano
{

    public String acceptedTosId;
    public com.google.wallet.proto.s clientPreferences;
    public com.google.wallet.proto.s deviceContext;
    public Boolean fetchNumInstruments;
    public com.google.wallet.proto.s walletContext;

    private clear clear()
    {
        fetchNumInstruments = null;
        acceptedTosId = null;
        deviceContext = null;
        walletContext = null;
        clientPreferences = null;
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
                fetchNumInstruments = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 18: // '\022'
                acceptedTosId = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                if (deviceContext == null)
                {
                    deviceContext = new com.google.wallet.proto.t>();
                }
                codedinputbytebuffernano.readMessage(deviceContext);
                break;

            case 34: // '"'
                if (walletContext == null)
                {
                    walletContext = new com.google.wallet.proto.t>();
                }
                codedinputbytebuffernano.readMessage(walletContext);
                break;

            case 42: // '*'
                if (clientPreferences == null)
                {
                    clientPreferences = new com.google.wallet.proto.s();
                }
                codedinputbytebuffernano.readMessage(clientPreferences);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (fetchNumInstruments != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(1, fetchNumInstruments.booleanValue());
        }
        j = i;
        if (acceptedTosId != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, acceptedTosId);
        }
        i = j;
        if (deviceContext != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, deviceContext);
        }
        j = i;
        if (walletContext != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, walletContext);
        }
        i = j;
        if (clientPreferences != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, clientPreferences);
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
        if (fetchNumInstruments != null)
        {
            codedoutputbytebuffernano.writeBool(1, fetchNumInstruments.booleanValue());
        }
        if (acceptedTosId != null)
        {
            codedoutputbytebuffernano.writeString(2, acceptedTosId);
        }
        if (deviceContext != null)
        {
            codedoutputbytebuffernano.writeMessage(3, deviceContext);
        }
        if (walletContext != null)
        {
            codedoutputbytebuffernano.writeMessage(4, walletContext);
        }
        if (clientPreferences != null)
        {
            codedoutputbytebuffernano.writeMessage(5, clientPreferences);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
