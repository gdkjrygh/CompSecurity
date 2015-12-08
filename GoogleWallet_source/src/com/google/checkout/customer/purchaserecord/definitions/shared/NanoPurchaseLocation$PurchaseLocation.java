// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.checkout.customer.purchaserecord.definitions.shared;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.checkout.customer.purchaserecord.definitions.shared:
//            NanoPurchaseLocation

public static final class clear extends ExtendableMessageNano
{

    public Float accuracy;
    public phoneNumber address;
    public Integer latitudeE7;
    public Integer longitudeE7;
    public String phoneNumber;

    private clear clear()
    {
        address = null;
        latitudeE7 = null;
        longitudeE7 = null;
        accuracy = null;
        phoneNumber = null;
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
                if (address == null)
                {
                    address = new address();
                }
                codedinputbytebuffernano.readMessage(address);
                break;

            case 16: // '\020'
                latitudeE7 = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 24: // '\030'
                longitudeE7 = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 37: // '%'
                accuracy = Float.valueOf(codedinputbytebuffernano.readFloat());
                break;

            case 42: // '*'
                phoneNumber = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (address != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, address);
        }
        j = i;
        if (latitudeE7 != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(2, latitudeE7.intValue());
        }
        i = j;
        if (longitudeE7 != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, longitudeE7.intValue());
        }
        j = i;
        if (accuracy != null)
        {
            j = i + CodedOutputByteBufferNano.computeFloatSize(4, accuracy.floatValue());
        }
        i = j;
        if (phoneNumber != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(5, phoneNumber);
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
        if (address != null)
        {
            codedoutputbytebuffernano.writeMessage(1, address);
        }
        if (latitudeE7 != null)
        {
            codedoutputbytebuffernano.writeInt32(2, latitudeE7.intValue());
        }
        if (longitudeE7 != null)
        {
            codedoutputbytebuffernano.writeInt32(3, longitudeE7.intValue());
        }
        if (accuracy != null)
        {
            codedoutputbytebuffernano.writeFloat(4, accuracy.floatValue());
        }
        if (phoneNumber != null)
        {
            codedoutputbytebuffernano.writeString(5, phoneNumber);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
