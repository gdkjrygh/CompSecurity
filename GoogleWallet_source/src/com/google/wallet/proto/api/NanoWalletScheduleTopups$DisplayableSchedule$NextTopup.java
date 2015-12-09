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

    public String availabilityMessage;
    public String detailsMessage;
    public transferHold helpLink;
    public eDateTime startDate;
    public String startMessage;
    public Boolean transferHold;

    private clear clear()
    {
        startDate = null;
        startMessage = null;
        availabilityMessage = null;
        detailsMessage = null;
        helpLink = null;
        transferHold = null;
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
                if (startDate == null)
                {
                    startDate = new eDateTime();
                }
                codedinputbytebuffernano.readMessage(startDate);
                break;

            case 18: // '\022'
                startMessage = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                availabilityMessage = codedinputbytebuffernano.readString();
                break;

            case 34: // '"'
                detailsMessage = codedinputbytebuffernano.readString();
                break;

            case 50: // '2'
                if (helpLink == null)
                {
                    helpLink = new init>();
                }
                codedinputbytebuffernano.readMessage(helpLink);
                break;

            case 56: // '8'
                transferHold = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (startDate != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, startDate);
        }
        j = i;
        if (startMessage != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, startMessage);
        }
        i = j;
        if (availabilityMessage != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, availabilityMessage);
        }
        j = i;
        if (detailsMessage != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, detailsMessage);
        }
        i = j;
        if (helpLink != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(6, helpLink);
        }
        j = i;
        if (transferHold != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(7, transferHold.booleanValue());
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
        if (startDate != null)
        {
            codedoutputbytebuffernano.writeMessage(1, startDate);
        }
        if (startMessage != null)
        {
            codedoutputbytebuffernano.writeString(2, startMessage);
        }
        if (availabilityMessage != null)
        {
            codedoutputbytebuffernano.writeString(3, availabilityMessage);
        }
        if (detailsMessage != null)
        {
            codedoutputbytebuffernano.writeString(4, detailsMessage);
        }
        if (helpLink != null)
        {
            codedoutputbytebuffernano.writeMessage(6, helpLink);
        }
        if (transferHold != null)
        {
            codedoutputbytebuffernano.writeBool(7, transferHold.booleanValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public eDateTime()
    {
        clear();
    }
}
