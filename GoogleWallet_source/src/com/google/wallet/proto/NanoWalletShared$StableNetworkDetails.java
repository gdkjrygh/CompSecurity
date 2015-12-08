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

    public String carrier;
    public String networkOperatorCode;
    public String networkOperatorName;
    public Integer phoneType;
    public String simOperatorCode;
    public String simOperatorName;

    private clear clear()
    {
        phoneType = null;
        networkOperatorCode = null;
        networkOperatorName = null;
        simOperatorCode = null;
        simOperatorName = null;
        carrier = null;
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
                phoneType = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 18: // '\022'
                networkOperatorCode = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                networkOperatorName = codedinputbytebuffernano.readString();
                break;

            case 34: // '"'
                simOperatorCode = codedinputbytebuffernano.readString();
                break;

            case 42: // '*'
                simOperatorName = codedinputbytebuffernano.readString();
                break;

            case 50: // '2'
                carrier = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (phoneType != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, phoneType.intValue());
        }
        j = i;
        if (networkOperatorCode != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, networkOperatorCode);
        }
        i = j;
        if (networkOperatorName != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, networkOperatorName);
        }
        j = i;
        if (simOperatorCode != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, simOperatorCode);
        }
        i = j;
        if (simOperatorName != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(5, simOperatorName);
        }
        j = i;
        if (carrier != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(6, carrier);
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
        if (phoneType != null)
        {
            codedoutputbytebuffernano.writeInt32(1, phoneType.intValue());
        }
        if (networkOperatorCode != null)
        {
            codedoutputbytebuffernano.writeString(2, networkOperatorCode);
        }
        if (networkOperatorName != null)
        {
            codedoutputbytebuffernano.writeString(3, networkOperatorName);
        }
        if (simOperatorCode != null)
        {
            codedoutputbytebuffernano.writeString(4, simOperatorCode);
        }
        if (simOperatorName != null)
        {
            codedoutputbytebuffernano.writeString(5, simOperatorName);
        }
        if (carrier != null)
        {
            codedoutputbytebuffernano.writeString(6, carrier);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
