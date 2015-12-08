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

    public com.google.wallet.proto.nse.fullName clientPreferences;
    public String fullName;
    public com.google.wallet.proto.nse.fullName globalResources;
    public Long globalResourcesFingerprint;
    public Boolean hasCdpProfile;
    public Boolean pinAuthenticationRequired;

    private clear clear()
    {
        globalResources = null;
        globalResourcesFingerprint = null;
        pinAuthenticationRequired = null;
        hasCdpProfile = null;
        clientPreferences = null;
        fullName = null;
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
                if (globalResources == null)
                {
                    globalResources = new com.google.wallet.proto.t>();
                }
                codedinputbytebuffernano.readMessage(globalResources);
                break;

            case 16: // '\020'
                globalResourcesFingerprint = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 24: // '\030'
                pinAuthenticationRequired = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 32: // ' '
                hasCdpProfile = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 42: // '*'
                if (clientPreferences == null)
                {
                    clientPreferences = new com.google.wallet.proto.nit>();
                }
                codedinputbytebuffernano.readMessage(clientPreferences);
                break;

            case 50: // '2'
                fullName = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (globalResources != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, globalResources);
        }
        j = i;
        if (globalResourcesFingerprint != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(2, globalResourcesFingerprint.longValue());
        }
        i = j;
        if (pinAuthenticationRequired != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(3, pinAuthenticationRequired.booleanValue());
        }
        j = i;
        if (hasCdpProfile != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(4, hasCdpProfile.booleanValue());
        }
        i = j;
        if (clientPreferences != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, clientPreferences);
        }
        j = i;
        if (fullName != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(6, fullName);
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
        if (globalResources != null)
        {
            codedoutputbytebuffernano.writeMessage(1, globalResources);
        }
        if (globalResourcesFingerprint != null)
        {
            codedoutputbytebuffernano.writeInt64(2, globalResourcesFingerprint.longValue());
        }
        if (pinAuthenticationRequired != null)
        {
            codedoutputbytebuffernano.writeBool(3, pinAuthenticationRequired.booleanValue());
        }
        if (hasCdpProfile != null)
        {
            codedoutputbytebuffernano.writeBool(4, hasCdpProfile.booleanValue());
        }
        if (clientPreferences != null)
        {
            codedoutputbytebuffernano.writeMessage(5, clientPreferences);
        }
        if (fullName != null)
        {
            codedoutputbytebuffernano.writeString(6, fullName);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
