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

    public String billingCountry;
    public alDocument latestLegalDocument;
    public String obfuscatedGaiaId;
    public Boolean walletAllowedInCountry;

    private clear clear()
    {
        billingCountry = null;
        latestLegalDocument = null;
        walletAllowedInCountry = null;
        obfuscatedGaiaId = null;
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
                billingCountry = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                if (latestLegalDocument == null)
                {
                    latestLegalDocument = new alDocument();
                }
                codedinputbytebuffernano.readMessage(latestLegalDocument);
                break;

            case 24: // '\030'
                walletAllowedInCountry = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 34: // '"'
                obfuscatedGaiaId = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (billingCountry != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, billingCountry);
        }
        j = i;
        if (latestLegalDocument != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, latestLegalDocument);
        }
        i = j;
        if (walletAllowedInCountry != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(3, walletAllowedInCountry.booleanValue());
        }
        j = i;
        if (obfuscatedGaiaId != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, obfuscatedGaiaId);
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
        if (billingCountry != null)
        {
            codedoutputbytebuffernano.writeString(1, billingCountry);
        }
        if (latestLegalDocument != null)
        {
            codedoutputbytebuffernano.writeMessage(2, latestLegalDocument);
        }
        if (walletAllowedInCountry != null)
        {
            codedoutputbytebuffernano.writeBool(3, walletAllowedInCountry.booleanValue());
        }
        if (obfuscatedGaiaId != null)
        {
            codedoutputbytebuffernano.writeString(4, obfuscatedGaiaId);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public alDocument()
    {
        clear();
    }
}
