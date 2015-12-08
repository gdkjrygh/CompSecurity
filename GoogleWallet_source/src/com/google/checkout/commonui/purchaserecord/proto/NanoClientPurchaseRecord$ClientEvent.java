// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.checkout.commonui.purchaserecord.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.checkout.commonui.purchaserecord.proto:
//            NanoClientPurchaseRecord

public static final class clear extends ExtendableMessageNano
{

    private static volatile shipment _emptyArray[];
    public String detail[];
    public com.google.checkout.customer.common.definitions.t eventTime;
    public shipment shipment;

    private clear clear()
    {
        eventTime = null;
        detail = WireFormatNano.EMPTY_STRING_ARRAY;
        shipment = null;
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
                if (eventTime == null)
                {
                    eventTime = new com.google.checkout.customer.common.definitions.t.eventTime();
                }
                codedinputbytebuffernano.readMessage(eventTime);
                break;

            case 34: // '"'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                String as[];
                int j;
                if (detail == null)
                {
                    j = 0;
                } else
                {
                    j = detail.length;
                }
                as = new String[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(detail, 0, as, 0, j);
                    k = j;
                }
                for (; k < as.length - 1; k++)
                {
                    as[k] = codedinputbytebuffernano.readString();
                    codedinputbytebuffernano.readTag();
                }

                as[k] = codedinputbytebuffernano.readString();
                detail = as;
                break;

            case 42: // '*'
                if (shipment == null)
                {
                    shipment = new it>();
                }
                codedinputbytebuffernano.readMessage(shipment);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (eventTime != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, eventTime);
        }
        j = i;
        if (detail != null)
        {
            j = i;
            if (detail.length > 0)
            {
                int i1 = 0;
                int k = 0;
                for (j = 0; j < detail.length;)
                {
                    String s = detail[j];
                    int j1 = i1;
                    int l = k;
                    if (s != null)
                    {
                        j1 = i1 + 1;
                        l = k + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                    }
                    j++;
                    i1 = j1;
                    k = l;
                }

                j = i + k + i1 * 1;
            }
        }
        i = j;
        if (shipment != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, shipment);
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
        if (eventTime != null)
        {
            codedoutputbytebuffernano.writeMessage(1, eventTime);
        }
        if (detail != null && detail.length > 0)
        {
            for (int i = 0; i < detail.length; i++)
            {
                String s = detail[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.writeString(4, s);
                }
            }

        }
        if (shipment != null)
        {
            codedoutputbytebuffernano.writeMessage(5, shipment);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
