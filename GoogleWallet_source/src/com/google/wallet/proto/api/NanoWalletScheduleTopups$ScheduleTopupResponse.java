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
//            NanoWalletScheduleTopups

public static final class clear extends ExtendableMessageNano
{

    public com.google.wallet.proto.nse.scheduleChange callError;
    public scheduleChange schedule;
    public com.google.wallet.proto.features.uleChange scheduleChange;

    private clear clear()
    {
        schedule = null;
        scheduleChange = null;
        callError = null;
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
                if (schedule == null)
                {
                    schedule = new nit>();
                }
                codedinputbytebuffernano.readMessage(schedule);
                break;

            case 18: // '\022'
                if (callError == null)
                {
                    callError = new com.google.wallet.proto.nse.callError();
                }
                codedinputbytebuffernano.readMessage(callError);
                break;

            case 26: // '\032'
                if (scheduleChange == null)
                {
                    scheduleChange = new com.google.wallet.proto.features.uleChange();
                }
                codedinputbytebuffernano.readMessage(scheduleChange);
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
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, schedule);
        }
        j = i;
        if (callError != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, callError);
        }
        i = j;
        if (scheduleChange != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, scheduleChange);
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
            codedoutputbytebuffernano.writeMessage(1, schedule);
        }
        if (callError != null)
        {
            codedoutputbytebuffernano.writeMessage(2, callError);
        }
        if (scheduleChange != null)
        {
            codedoutputbytebuffernano.writeMessage(3, scheduleChange);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
