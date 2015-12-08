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

    public String advertisingIdentifier;
    public String deviceType;
    public String model;
    public String userAssignedName;

    private clear clear()
    {
        deviceType = null;
        model = null;
        userAssignedName = null;
        advertisingIdentifier = null;
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
                deviceType = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                model = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                userAssignedName = codedinputbytebuffernano.readString();
                break;

            case 34: // '"'
                advertisingIdentifier = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (deviceType != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, deviceType);
        }
        j = i;
        if (model != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, model);
        }
        i = j;
        if (userAssignedName != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, userAssignedName);
        }
        j = i;
        if (advertisingIdentifier != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, advertisingIdentifier);
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
        if (deviceType != null)
        {
            codedoutputbytebuffernano.writeString(1, deviceType);
        }
        if (model != null)
        {
            codedoutputbytebuffernano.writeString(2, model);
        }
        if (userAssignedName != null)
        {
            codedoutputbytebuffernano.writeString(3, userAssignedName);
        }
        if (advertisingIdentifier != null)
        {
            codedoutputbytebuffernano.writeString(4, advertisingIdentifier);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
