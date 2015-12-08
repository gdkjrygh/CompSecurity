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
    public static final class DisplayableDateTime extends ExtendableMessageNano
    {

        public String date;
        public String time;
        public Long timestamp;

        private DisplayableDateTime clear()
        {
            timestamp = null;
            date = null;
            time = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DisplayableDateTime mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    timestamp = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 18: // '\022'
                    date = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    time = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (timestamp != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(1, timestamp.longValue());
            }
            j = i;
            if (date != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, date);
            }
            i = j;
            if (time != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, time);
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
            if (timestamp != null)
            {
                codedoutputbytebuffernano.writeInt64(1, timestamp.longValue());
            }
            if (date != null)
            {
                codedoutputbytebuffernano.writeString(2, date);
            }
            if (time != null)
            {
                codedoutputbytebuffernano.writeString(3, time);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DisplayableDateTime()
        {
            clear();
        }
    }

    public static final class ErrorState extends ExtendableMessageNano
    {

        public String description;
        public DisplayableDateTime timestamp;

        private ErrorState clear()
        {
            timestamp = null;
            description = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ErrorState mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (timestamp == null)
                    {
                        timestamp = new DisplayableDateTime();
                    }
                    codedinputbytebuffernano.readMessage(timestamp);
                    break;

                case 18: // '\022'
                    description = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (timestamp != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, timestamp);
            }
            j = i;
            if (description != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, description);
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
            if (timestamp != null)
            {
                codedoutputbytebuffernano.writeMessage(1, timestamp);
            }
            if (description != null)
            {
                codedoutputbytebuffernano.writeString(2, description);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ErrorState()
        {
            clear();
        }
    }

    public static final class FundingSource extends ExtendableMessageNano
    {

        public String description;
        public String fees;
        public String nickname;

        private FundingSource clear()
        {
            description = null;
            nickname = null;
            fees = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FundingSource mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    nickname = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    fees = codedinputbytebuffernano.readString();
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
            if (nickname != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, nickname);
            }
            i = j;
            if (fees != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, fees);
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
            if (description != null)
            {
                codedoutputbytebuffernano.writeString(1, description);
            }
            if (nickname != null)
            {
                codedoutputbytebuffernano.writeString(2, nickname);
            }
            if (fees != null)
            {
                codedoutputbytebuffernano.writeString(3, fees);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public FundingSource()
        {
            clear();
        }
    }

    public static final class HelpLink extends ExtendableMessageNano
    {

        public String linkUri;
        public String text;

        private HelpLink clear()
        {
            text = null;
            linkUri = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private HelpLink mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    text = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    linkUri = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (text != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, text);
            }
            j = i;
            if (linkUri != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, linkUri);
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
            if (text != null)
            {
                codedoutputbytebuffernano.writeString(1, text);
            }
            if (linkUri != null)
            {
                codedoutputbytebuffernano.writeString(2, linkUri);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public HelpLink()
        {
            clear();
        }
    }

    public static final class NextTopup extends ExtendableMessageNano
    {

        public String availabilityMessage;
        public String detailsMessage;
        public HelpLink helpLink;
        public DisplayableDateTime startDate;
        public String startMessage;
        public Boolean transferHold;

        private NextTopup clear()
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

        private NextTopup mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                        startDate = new DisplayableDateTime();
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
                        helpLink = new HelpLink();
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

        public NextTopup()
        {
            clear();
        }
    }


    public com.google.wallet.proto.ule.fundingSource amount;
    public Boolean disableSkipSupport;
    public ErrorState errorState;
    public String fundingInstrumentSubId;
    public FundingSource fundingSource;
    public byte id[];
    public NextTopup nextTopup;
    public String recurrenceMessage;
    public String recurrenceMessageAmount;
    public String recurrenceMessageDay;
    public com.google.wallet.proto.features.opup schedule;
    public byte serverData[];

    private DisplayableDateTime clear()
    {
        serverData = null;
        id = null;
        schedule = null;
        amount = null;
        fundingInstrumentSubId = null;
        fundingSource = null;
        errorState = null;
        nextTopup = null;
        recurrenceMessage = null;
        disableSkipSupport = null;
        recurrenceMessageAmount = null;
        recurrenceMessageDay = null;
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
                    schedule = new com.google.wallet.proto.features.ule();
                }
                codedinputbytebuffernano.readMessage(schedule);
                break;

            case 26: // '\032'
                if (amount == null)
                {
                    amount = new com.google.wallet.proto.ule.amount();
                }
                codedinputbytebuffernano.readMessage(amount);
                break;

            case 34: // '"'
                fundingInstrumentSubId = codedinputbytebuffernano.readString();
                break;

            case 74: // 'J'
                if (errorState == null)
                {
                    errorState = new ErrorState();
                }
                codedinputbytebuffernano.readMessage(errorState);
                break;

            case 90: // 'Z'
                if (nextTopup == null)
                {
                    nextTopup = new NextTopup();
                }
                codedinputbytebuffernano.readMessage(nextTopup);
                break;

            case 98: // 'b'
                recurrenceMessage = codedinputbytebuffernano.readString();
                break;

            case 104: // 'h'
                disableSkipSupport = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 114: // 'r'
                serverData = codedinputbytebuffernano.readBytes();
                break;

            case 122: // 'z'
                id = codedinputbytebuffernano.readBytes();
                break;

            case 130: 
                recurrenceMessageAmount = codedinputbytebuffernano.readString();
                break;

            case 138: 
                recurrenceMessageDay = codedinputbytebuffernano.readString();
                break;

            case 146: 
                if (fundingSource == null)
                {
                    fundingSource = new FundingSource();
                }
                codedinputbytebuffernano.readMessage(fundingSource);
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
        j = i;
        if (errorState != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(9, errorState);
        }
        i = j;
        if (nextTopup != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(11, nextTopup);
        }
        j = i;
        if (recurrenceMessage != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(12, recurrenceMessage);
        }
        i = j;
        if (disableSkipSupport != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(13, disableSkipSupport.booleanValue());
        }
        j = i;
        if (serverData != null)
        {
            j = i + CodedOutputByteBufferNano.computeBytesSize(14, serverData);
        }
        i = j;
        if (id != null)
        {
            i = j + CodedOutputByteBufferNano.computeBytesSize(15, id);
        }
        j = i;
        if (recurrenceMessageAmount != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(16, recurrenceMessageAmount);
        }
        i = j;
        if (recurrenceMessageDay != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(17, recurrenceMessageDay);
        }
        j = i;
        if (fundingSource != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(18, fundingSource);
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
        if (errorState != null)
        {
            codedoutputbytebuffernano.writeMessage(9, errorState);
        }
        if (nextTopup != null)
        {
            codedoutputbytebuffernano.writeMessage(11, nextTopup);
        }
        if (recurrenceMessage != null)
        {
            codedoutputbytebuffernano.writeString(12, recurrenceMessage);
        }
        if (disableSkipSupport != null)
        {
            codedoutputbytebuffernano.writeBool(13, disableSkipSupport.booleanValue());
        }
        if (serverData != null)
        {
            codedoutputbytebuffernano.writeBytes(14, serverData);
        }
        if (id != null)
        {
            codedoutputbytebuffernano.writeBytes(15, id);
        }
        if (recurrenceMessageAmount != null)
        {
            codedoutputbytebuffernano.writeString(16, recurrenceMessageAmount);
        }
        if (recurrenceMessageDay != null)
        {
            codedoutputbytebuffernano.writeString(17, recurrenceMessageDay);
        }
        if (fundingSource != null)
        {
            codedoutputbytebuffernano.writeMessage(18, fundingSource);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public NextTopup.clear()
    {
        clear();
    }
}
