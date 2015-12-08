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

    public Long androidId;
    public isRegisteredWithServer id;
    public Boolean isRegistered;
    public Boolean isRegisteredWithServer;
    public isRegisteredWithServer metadata;
    public String registrationId;
    public String walletPackageName;

    private clear clear()
    {
        id = null;
        metadata = null;
        registrationId = null;
        isRegistered = null;
        androidId = null;
        walletPackageName = null;
        isRegisteredWithServer = null;
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
                if (id == null)
                {
                    id = new t>();
                }
                codedinputbytebuffernano.readMessage(id);
                break;

            case 18: // '\022'
                registrationId = codedinputbytebuffernano.readString();
                break;

            case 24: // '\030'
                isRegistered = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 34: // '"'
                if (metadata == null)
                {
                    metadata = new ();
                }
                codedinputbytebuffernano.readMessage(metadata);
                break;

            case 40: // '('
                androidId = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 50: // '2'
                walletPackageName = codedinputbytebuffernano.readString();
                break;

            case 56: // '8'
                isRegisteredWithServer = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (id != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, id);
        }
        j = i;
        if (registrationId != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, registrationId);
        }
        i = j;
        if (isRegistered != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(3, isRegistered.booleanValue());
        }
        j = i;
        if (metadata != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, metadata);
        }
        i = j;
        if (androidId != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(5, androidId.longValue());
        }
        j = i;
        if (walletPackageName != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(6, walletPackageName);
        }
        i = j;
        if (isRegisteredWithServer != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(7, isRegisteredWithServer.booleanValue());
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
        if (id != null)
        {
            codedoutputbytebuffernano.writeMessage(1, id);
        }
        if (registrationId != null)
        {
            codedoutputbytebuffernano.writeString(2, registrationId);
        }
        if (isRegistered != null)
        {
            codedoutputbytebuffernano.writeBool(3, isRegistered.booleanValue());
        }
        if (metadata != null)
        {
            codedoutputbytebuffernano.writeMessage(4, metadata);
        }
        if (androidId != null)
        {
            codedoutputbytebuffernano.writeInt64(5, androidId.longValue());
        }
        if (walletPackageName != null)
        {
            codedoutputbytebuffernano.writeString(6, walletPackageName);
        }
        if (isRegisteredWithServer != null)
        {
            codedoutputbytebuffernano.writeBool(7, isRegisteredWithServer.booleanValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
