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

    public s businessAddress;
    public String businessName;
    public String id;
    public umber phoneNumber;
    public alLocation redemptionLocation;
    public yOnlyAddress storeAddress;
    public String websiteUrl;

    private clear clear()
    {
        id = null;
        businessName = null;
        phoneNumber = null;
        websiteUrl = null;
        businessAddress = null;
        redemptionLocation = null;
        storeAddress = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private  mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                id = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                businessName = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                if (phoneNumber == null)
                {
                    phoneNumber = new umber();
                }
                codedinputbytebuffernano.readMessage(phoneNumber);
                break;

            case 34: // '"'
                websiteUrl = codedinputbytebuffernano.readString();
                break;

            case 42: // '*'
                if (businessAddress == null)
                {
                    businessAddress = new s();
                }
                codedinputbytebuffernano.readMessage(businessAddress);
                break;

            case 50: // '2'
                if (redemptionLocation == null)
                {
                    redemptionLocation = new alLocation();
                }
                codedinputbytebuffernano.readMessage(redemptionLocation);
                break;

            case 58: // ':'
                if (storeAddress == null)
                {
                    storeAddress = new yOnlyAddress();
                }
                codedinputbytebuffernano.readMessage(storeAddress);
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
            i = j + CodedOutputByteBufferNano.computeStringSize(1, id);
        }
        j = i;
        if (businessName != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, businessName);
        }
        i = j;
        if (phoneNumber != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, phoneNumber);
        }
        j = i;
        if (websiteUrl != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, websiteUrl);
        }
        i = j;
        if (businessAddress != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, businessAddress);
        }
        j = i;
        if (redemptionLocation != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(6, redemptionLocation);
        }
        i = j;
        if (storeAddress != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(7, storeAddress);
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
            codedoutputbytebuffernano.writeString(1, id);
        }
        if (businessName != null)
        {
            codedoutputbytebuffernano.writeString(2, businessName);
        }
        if (phoneNumber != null)
        {
            codedoutputbytebuffernano.writeMessage(3, phoneNumber);
        }
        if (websiteUrl != null)
        {
            codedoutputbytebuffernano.writeString(4, websiteUrl);
        }
        if (businessAddress != null)
        {
            codedoutputbytebuffernano.writeMessage(5, businessAddress);
        }
        if (redemptionLocation != null)
        {
            codedoutputbytebuffernano.writeMessage(6, redemptionLocation);
        }
        if (storeAddress != null)
        {
            codedoutputbytebuffernano.writeMessage(7, storeAddress);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public o()
    {
        clear();
    }
}
