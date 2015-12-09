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
//            NanoWalletShared

public static final class clear extends ExtendableMessageNano
{

    public String appId;
    public String appVersion;
    public String systemName;
    public String systemVersion;
    public String vendorIdentifier;
    public String walletUuid;

    private clear clear()
    {
        walletUuid = null;
        appVersion = null;
        appId = null;
        systemName = null;
        systemVersion = null;
        vendorIdentifier = null;
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
                walletUuid = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                appVersion = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                appId = codedinputbytebuffernano.readString();
                break;

            case 34: // '"'
                systemName = codedinputbytebuffernano.readString();
                break;

            case 42: // '*'
                systemVersion = codedinputbytebuffernano.readString();
                break;

            case 50: // '2'
                vendorIdentifier = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (walletUuid != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, walletUuid);
        }
        j = i;
        if (appVersion != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, appVersion);
        }
        i = j;
        if (appId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, appId);
        }
        j = i;
        if (systemName != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, systemName);
        }
        i = j;
        if (systemVersion != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(5, systemVersion);
        }
        j = i;
        if (vendorIdentifier != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(6, vendorIdentifier);
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
        if (walletUuid != null)
        {
            codedoutputbytebuffernano.writeString(1, walletUuid);
        }
        if (appVersion != null)
        {
            codedoutputbytebuffernano.writeString(2, appVersion);
        }
        if (appId != null)
        {
            codedoutputbytebuffernano.writeString(3, appId);
        }
        if (systemName != null)
        {
            codedoutputbytebuffernano.writeString(4, systemName);
        }
        if (systemVersion != null)
        {
            codedoutputbytebuffernano.writeString(5, systemVersion);
        }
        if (vendorIdentifier != null)
        {
            codedoutputbytebuffernano.writeString(6, vendorIdentifier);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
