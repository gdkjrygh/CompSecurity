// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.checkout.commonui.purchaserecord.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.checkout.commonui.purchaserecord.proto:
//            NanoClientPurchaseRecord

public static final class clear extends ExtendableMessageNano
{

    private static volatile aboStatus _emptyArray[];
    public String aboStatus;
    public String description;
    public String offerImageUrl;
    public com.google.checkout.customer.common.definitions.r totalSavings;

    private clear clear()
    {
        description = null;
        totalSavings = null;
        offerImageUrl = null;
        aboStatus = null;
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

            case 10: // '\n'
                description = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                if (totalSavings == null)
                {
                    totalSavings = new com.google.checkout.customer.common.definitions.r.totalSavings();
                }
                codedinputbytebuffernano.readMessage(totalSavings);
                break;

            case 26: // '\032'
                offerImageUrl = codedinputbytebuffernano.readString();
                break;

            case 34: // '"'
                aboStatus = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (description != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, description);
        }
        j = i;
        if (totalSavings != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, totalSavings);
        }
        i = j;
        if (offerImageUrl != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, offerImageUrl);
        }
        j = i;
        if (aboStatus != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, aboStatus);
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
        if (description != null)
        {
            codedoutputbytebuffernano.writeString(1, description);
        }
        if (totalSavings != null)
        {
            codedoutputbytebuffernano.writeMessage(2, totalSavings);
        }
        if (offerImageUrl != null)
        {
            codedoutputbytebuffernano.writeString(3, offerImageUrl);
        }
        if (aboStatus != null)
        {
            codedoutputbytebuffernano.writeString(4, aboStatus);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
