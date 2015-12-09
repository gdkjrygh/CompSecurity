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
//            NanoWalletSettings

public static final class clear extends ExtendableMessageNano
{

    public Integer id;
    public Boolean isWhisky;
    public com.google.wallet.proto.est.newStringValue newMoneyValue;
    public Long newNumberValue;
    public String newStringValue;
    public Boolean newValue;

    private clear clear()
    {
        id = null;
        newValue = null;
        newMoneyValue = null;
        newNumberValue = null;
        isWhisky = null;
        newStringValue = null;
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
                id = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 16: // '\020'
                newValue = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 26: // '\032'
                if (newMoneyValue == null)
                {
                    newMoneyValue = new com.google.wallet.proto.est.newMoneyValue();
                }
                codedinputbytebuffernano.readMessage(newMoneyValue);
                break;

            case 32: // ' '
                newNumberValue = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 40: // '('
                isWhisky = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 50: // '2'
                newStringValue = codedinputbytebuffernano.readString();
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
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, id.intValue());
        }
        j = i;
        if (newValue != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(2, newValue.booleanValue());
        }
        i = j;
        if (newMoneyValue != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, newMoneyValue);
        }
        j = i;
        if (newNumberValue != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(4, newNumberValue.longValue());
        }
        i = j;
        if (isWhisky != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(5, isWhisky.booleanValue());
        }
        j = i;
        if (newStringValue != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(6, newStringValue);
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
        if (id != null)
        {
            codedoutputbytebuffernano.writeInt32(1, id.intValue());
        }
        if (newValue != null)
        {
            codedoutputbytebuffernano.writeBool(2, newValue.booleanValue());
        }
        if (newMoneyValue != null)
        {
            codedoutputbytebuffernano.writeMessage(3, newMoneyValue);
        }
        if (newNumberValue != null)
        {
            codedoutputbytebuffernano.writeInt64(4, newNumberValue.longValue());
        }
        if (isWhisky != null)
        {
            codedoutputbytebuffernano.writeBool(5, isWhisky.booleanValue());
        }
        if (newStringValue != null)
        {
            codedoutputbytebuffernano.writeString(6, newStringValue);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public I()
    {
        clear();
    }
}
