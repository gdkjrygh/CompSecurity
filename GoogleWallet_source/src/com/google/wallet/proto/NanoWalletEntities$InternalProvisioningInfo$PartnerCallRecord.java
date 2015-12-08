// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletEntities

public static final class clear extends ExtendableMessageNano
{

    private static volatile error _emptyArray[];
    public Long callTimeMillis;
    public error error;
    public String partnerId;
    public String partnerResponse;
    public String requestName;
    public Boolean success;

    private clear clear()
    {
        callTimeMillis = null;
        partnerId = null;
        requestName = null;
        partnerResponse = null;
        success = null;
        error = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    public static cachedSize[] emptyArray()
    {
        if (_emptyArray == null)
        {
            synchronized (InternalNano.LAZY_INIT_LOCK)
            {
                if (_emptyArray == null)
                {
                    _emptyArray = new _emptyArray[0];
                }
            }
        }
        return _emptyArray;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private _emptyArray mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                callTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 18: // '\022'
                partnerId = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                requestName = codedinputbytebuffernano.readString();
                break;

            case 34: // '"'
                partnerResponse = codedinputbytebuffernano.readString();
                break;

            case 40: // '('
                success = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 50: // '2'
                if (error == null)
                {
                    error = new error();
                }
                codedinputbytebuffernano.readMessage(error);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (callTimeMillis != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(1, callTimeMillis.longValue());
        }
        j = i;
        if (partnerId != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, partnerId);
        }
        i = j;
        if (requestName != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, requestName);
        }
        j = i;
        if (partnerResponse != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, partnerResponse);
        }
        i = j;
        if (success != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(5, success.booleanValue());
        }
        j = i;
        if (error != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(6, error);
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
        if (callTimeMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(1, callTimeMillis.longValue());
        }
        if (partnerId != null)
        {
            codedoutputbytebuffernano.writeString(2, partnerId);
        }
        if (requestName != null)
        {
            codedoutputbytebuffernano.writeString(3, requestName);
        }
        if (partnerResponse != null)
        {
            codedoutputbytebuffernano.writeString(4, partnerResponse);
        }
        if (success != null)
        {
            codedoutputbytebuffernano.writeBool(5, success.booleanValue());
        }
        if (error != null)
        {
            codedoutputbytebuffernano.writeMessage(6, error);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
