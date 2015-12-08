// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.features;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.features:
//            NanoPaymentSchedule

public static final class clear extends ExtendableMessageNano
{

    public com.google.wallet.proto.leChange.fundingInstrumentSubId amount;
    public String fundingInstrumentSubId;
    public fundingInstrumentSubId schedule;

    private clear clear()
    {
        schedule = null;
        amount = null;
        fundingInstrumentSubId = null;
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

            case 18: // '\022'
                if (schedule == null)
                {
                    schedule = new ();
                }
                codedinputbytebuffernano.readMessage(schedule);
                break;

            case 26: // '\032'
                if (amount == null)
                {
                    amount = new com.google.wallet.proto.>();
                }
                codedinputbytebuffernano.readMessage(amount);
                break;

            case 34: // '"'
                fundingInstrumentSubId = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (schedule != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(2, schedule);
        }
        j = i;
        if (amount != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(3, amount);
        }
        i = j;
        if (fundingInstrumentSubId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(4, fundingInstrumentSubId);
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
        if (schedule != null)
        {
            codedoutputbytebuffernano.writeMessage(2, schedule);
        }
        if (amount != null)
        {
            codedoutputbytebuffernano.writeMessage(3, amount);
        }
        if (fundingInstrumentSubId != null)
        {
            codedoutputbytebuffernano.writeString(4, fundingInstrumentSubId);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public I()
    {
        clear();
    }
}
