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
//            NanoWalletNotification

public static final class clear extends ExtendableMessageNano
{

    public String displayName;
    public String email;
    public String imageUrl;
    public com.google.wallet.proto.ils.purchaseRecordId purchaseRecordId;
    public String purchaseRecordLookupId;

    private clear clear()
    {
        purchaseRecordLookupId = null;
        purchaseRecordId = null;
        displayName = null;
        email = null;
        imageUrl = null;
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
                purchaseRecordLookupId = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                displayName = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                email = codedinputbytebuffernano.readString();
                break;

            case 34: // '"'
                imageUrl = codedinputbytebuffernano.readString();
                break;

            case 42: // '*'
                if (purchaseRecordId == null)
                {
                    purchaseRecordId = new com.google.wallet.proto.ils.purchaseRecordId();
                }
                codedinputbytebuffernano.readMessage(purchaseRecordId);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (purchaseRecordLookupId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, purchaseRecordLookupId);
        }
        j = i;
        if (displayName != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, displayName);
        }
        i = j;
        if (email != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, email);
        }
        j = i;
        if (imageUrl != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, imageUrl);
        }
        i = j;
        if (purchaseRecordId != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, purchaseRecordId);
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
        if (purchaseRecordLookupId != null)
        {
            codedoutputbytebuffernano.writeString(1, purchaseRecordLookupId);
        }
        if (displayName != null)
        {
            codedoutputbytebuffernano.writeString(2, displayName);
        }
        if (email != null)
        {
            codedoutputbytebuffernano.writeString(3, email);
        }
        if (imageUrl != null)
        {
            codedoutputbytebuffernano.writeString(4, imageUrl);
        }
        if (purchaseRecordId != null)
        {
            codedoutputbytebuffernano.writeMessage(5, purchaseRecordId);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
