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
//            NanoWalletTransaction

public static final class clear extends ExtendableMessageNano
{
    public static final class GeoMerchant extends ExtendableMessageNano
    {

        public Long locationDocid;

        private GeoMerchant clear()
        {
            locationDocid = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GeoMerchant mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    locationDocid = Long.valueOf(codedinputbytebuffernano.readUInt64());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (locationDocid != null)
            {
                i = j + CodedOutputByteBufferNano.computeUInt64Size(1, locationDocid.longValue());
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
            if (locationDocid != null)
            {
                codedoutputbytebuffernano.writeUInt64(1, locationDocid.longValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GeoMerchant()
        {
            clear();
        }
    }


    public Integer feedbackValue;
    public GeoMerchant geoMerchant;
    public String transactionId;

    private GeoMerchant.locationDocid clear()
    {
        transactionId = null;
        geoMerchant = null;
        feedbackValue = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L6:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   10: 59
    //                   18: 70
    //                   24: 99;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        transactionId = codedinputbytebuffernano.readString();
          goto _L6
_L4:
        if (geoMerchant == null)
        {
            geoMerchant = new GeoMerchant();
        }
        codedinputbytebuffernano.readMessage(geoMerchant);
          goto _L6
_L5:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 0: // '\0'
            feedbackValue = Integer.valueOf(j);
            break;
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (transactionId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, transactionId);
        }
        j = i;
        if (geoMerchant != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, geoMerchant);
        }
        i = j;
        if (feedbackValue != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, feedbackValue.intValue());
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
        if (transactionId != null)
        {
            codedoutputbytebuffernano.writeString(1, transactionId);
        }
        if (geoMerchant != null)
        {
            codedoutputbytebuffernano.writeMessage(2, geoMerchant);
        }
        if (feedbackValue != null)
        {
            codedoutputbytebuffernano.writeInt32(3, feedbackValue.intValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public GeoMerchant.clear()
    {
        clear();
    }
}
