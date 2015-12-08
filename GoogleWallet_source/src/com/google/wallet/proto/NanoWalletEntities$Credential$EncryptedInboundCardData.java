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

    public String billingPublicKeyEncryptedSessionMaterial;
    public String encryptedCardNumber;
    public String encryptedCvc;

    private clear clear()
    {
        billingPublicKeyEncryptedSessionMaterial = null;
        encryptedCardNumber = null;
        encryptedCvc = null;
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
                billingPublicKeyEncryptedSessionMaterial = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                encryptedCardNumber = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                encryptedCvc = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (billingPublicKeyEncryptedSessionMaterial != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, billingPublicKeyEncryptedSessionMaterial);
        }
        j = i;
        if (encryptedCardNumber != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, encryptedCardNumber);
        }
        i = j;
        if (encryptedCvc != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, encryptedCvc);
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
        if (billingPublicKeyEncryptedSessionMaterial != null)
        {
            codedoutputbytebuffernano.writeString(1, billingPublicKeyEncryptedSessionMaterial);
        }
        if (encryptedCardNumber != null)
        {
            codedoutputbytebuffernano.writeString(2, encryptedCardNumber);
        }
        if (encryptedCvc != null)
        {
            codedoutputbytebuffernano.writeString(3, encryptedCvc);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
