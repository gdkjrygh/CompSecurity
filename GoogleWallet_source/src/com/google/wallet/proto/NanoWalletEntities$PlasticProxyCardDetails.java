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
    public static final class ShippingInfo extends ExtendableMessageNano
    {

        public Integer maxCardEtaDays;
        public Integer minCardEtaDays;
        public NanoWalletEntities.Address shippingAddress;
        public Long shippingTimestampMillis;

        private ShippingInfo clear()
        {
            shippingAddress = null;
            shippingTimestampMillis = null;
            minCardEtaDays = null;
            maxCardEtaDays = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ShippingInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (shippingAddress == null)
                    {
                        shippingAddress = new NanoWalletEntities.Address();
                    }
                    codedinputbytebuffernano.readMessage(shippingAddress);
                    break;

                case 16: // '\020'
                    shippingTimestampMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 24: // '\030'
                    minCardEtaDays = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 32: // ' '
                    maxCardEtaDays = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (shippingAddress != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, shippingAddress);
            }
            j = i;
            if (shippingTimestampMillis != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(2, shippingTimestampMillis.longValue());
            }
            i = j;
            if (minCardEtaDays != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, minCardEtaDays.intValue());
            }
            j = i;
            if (maxCardEtaDays != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(4, maxCardEtaDays.intValue());
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
            if (shippingAddress != null)
            {
                codedoutputbytebuffernano.writeMessage(1, shippingAddress);
            }
            if (shippingTimestampMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(2, shippingTimestampMillis.longValue());
            }
            if (minCardEtaDays != null)
            {
                codedoutputbytebuffernano.writeInt32(3, minCardEtaDays.intValue());
            }
            if (maxCardEtaDays != null)
            {
                codedoutputbytebuffernano.writeInt32(4, maxCardEtaDays.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ShippingInfo()
        {
            clear();
        }
    }


    private static volatile shippingInfo _emptyArray[];
    public Integer fulfillmentStatus;
    public shippingInfo proxyCard;
    public ShippingInfo shippingInfo;

    private ShippingInfo.maxCardEtaDays clear()
    {
        proxyCard = null;
        fulfillmentStatus = null;
        shippingInfo = null;
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
_L6:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   10: 59
    //                   16: 88
    //                   26: 142;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        if (proxyCard == null)
        {
            proxyCard = new proxyCard();
        }
        codedinputbytebuffernano.readMessage(proxyCard);
          goto _L6
_L4:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            fulfillmentStatus = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (shippingInfo == null)
        {
            shippingInfo = new ShippingInfo();
        }
        codedinputbytebuffernano.readMessage(shippingInfo);
        if (true) goto _L6; else goto _L7
_L7:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (proxyCard != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, proxyCard);
        }
        j = i;
        if (fulfillmentStatus != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(2, fulfillmentStatus.intValue());
        }
        i = j;
        if (shippingInfo != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, shippingInfo);
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
        if (proxyCard != null)
        {
            codedoutputbytebuffernano.writeMessage(1, proxyCard);
        }
        if (fulfillmentStatus != null)
        {
            codedoutputbytebuffernano.writeInt32(2, fulfillmentStatus.intValue());
        }
        if (shippingInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(3, shippingInfo);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ShippingInfo.clear()
    {
        clear();
    }
}
