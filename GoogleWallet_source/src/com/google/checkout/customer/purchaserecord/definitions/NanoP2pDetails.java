// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.checkout.customer.purchaserecord.definitions;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

public interface NanoP2pDetails
{
    public static final class P2pDetails extends ExtendableMessageNano
    {

        public com.google.checkout.customer.common.definitions.NanoDatetime.DateTime autoRejectTime;
        public Boolean canAccept;
        public Boolean canReject;
        public Integer cancellationReason;
        public com.google.checkout.customer.common.definitions.NanoDatetime.DateTime earliestEstimatedCompletionTime;
        public String feeDescription;
        public com.google.checkout.customer.common.definitions.NanoMoney.Money fees;
        public P2pMoneyRequestInfo fulfilledMoneyRequest;
        public String imageUrl;
        public Boolean includesDeposit;
        public com.google.checkout.customer.common.definitions.NanoDatetime.DateTime latestEstimatedCompletionTime;
        public String moneyRequestId;
        public NanoP2pFee.P2pFee p2PFee;
        public com.google.checkout.customer.common.definitions.NanoMoney.Money recipientAmount;
        public Integer recurrenceCancelReason;
        public P2pRecurrenceDetails recurrenceDetails;
        public com.google.checkout.customer.common.definitions.NanoDatetime.DateTime scheduledExecutionTime;
        public String sendersMessage;
        public String transactionRecurrenceId;

        private P2pDetails mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L22:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 20: default 176
        //                       0: 185
        //                       8: 187
        //                       18: 370
        //                       24: 381
        //                       32: 395
        //                       42: 409
        //                       50: 438
        //                       58: 449
        //                       66: 478
        //                       74: 507
        //                       82: 518
        //                       90: 547
        //                       96: 558
        //                       106: 572
        //                       114: 601
        //                       122: 630
        //                       130: 641
        //                       138: 670
        //                       146: 699
        //                       152: 728;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L22; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 20: // '\024'
            case 21: // '\025'
            case 22: // '\026'
            case 30: // '\036'
            case 31: // '\037'
            case 32: // ' '
            case 33: // '!'
            case 34: // '"'
            case 35: // '#'
            case 36: // '$'
                cancellationReason = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            imageUrl = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L5:
            canReject = Boolean.valueOf(codedinputbytebuffernano.readBool());
            continue; /* Loop/switch isn't completed */
_L6:
            canAccept = Boolean.valueOf(codedinputbytebuffernano.readBool());
            continue; /* Loop/switch isn't completed */
_L7:
            if (fees == null)
            {
                fees = new com.google.checkout.customer.common.definitions.NanoMoney.Money();
            }
            codedinputbytebuffernano.readMessage(fees);
            continue; /* Loop/switch isn't completed */
_L8:
            sendersMessage = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L9:
            if (autoRejectTime == null)
            {
                autoRejectTime = new com.google.checkout.customer.common.definitions.NanoDatetime.DateTime();
            }
            codedinputbytebuffernano.readMessage(autoRejectTime);
            continue; /* Loop/switch isn't completed */
_L10:
            if (recipientAmount == null)
            {
                recipientAmount = new com.google.checkout.customer.common.definitions.NanoMoney.Money();
            }
            codedinputbytebuffernano.readMessage(recipientAmount);
            continue; /* Loop/switch isn't completed */
_L11:
            feeDescription = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L12:
            if (p2PFee == null)
            {
                p2PFee = new NanoP2pFee.P2pFee();
            }
            codedinputbytebuffernano.readMessage(p2PFee);
            continue; /* Loop/switch isn't completed */
_L13:
            moneyRequestId = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L14:
            includesDeposit = Boolean.valueOf(codedinputbytebuffernano.readBool());
            continue; /* Loop/switch isn't completed */
_L15:
            if (latestEstimatedCompletionTime == null)
            {
                latestEstimatedCompletionTime = new com.google.checkout.customer.common.definitions.NanoDatetime.DateTime();
            }
            codedinputbytebuffernano.readMessage(latestEstimatedCompletionTime);
            continue; /* Loop/switch isn't completed */
_L16:
            if (earliestEstimatedCompletionTime == null)
            {
                earliestEstimatedCompletionTime = new com.google.checkout.customer.common.definitions.NanoDatetime.DateTime();
            }
            codedinputbytebuffernano.readMessage(earliestEstimatedCompletionTime);
            continue; /* Loop/switch isn't completed */
_L17:
            transactionRecurrenceId = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L18:
            if (scheduledExecutionTime == null)
            {
                scheduledExecutionTime = new com.google.checkout.customer.common.definitions.NanoDatetime.DateTime();
            }
            codedinputbytebuffernano.readMessage(scheduledExecutionTime);
            continue; /* Loop/switch isn't completed */
_L19:
            if (fulfilledMoneyRequest == null)
            {
                fulfilledMoneyRequest = new P2pMoneyRequestInfo();
            }
            codedinputbytebuffernano.readMessage(fulfilledMoneyRequest);
            continue; /* Loop/switch isn't completed */
_L20:
            if (recurrenceDetails == null)
            {
                recurrenceDetails = new P2pRecurrenceDetails();
            }
            codedinputbytebuffernano.readMessage(recurrenceDetails);
            continue; /* Loop/switch isn't completed */
_L21:
            int k = codedinputbytebuffernano.readInt32();
            switch (k)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
            case 13: // '\r'
            case 14: // '\016'
            case 15: // '\017'
            case 16: // '\020'
            case 17: // '\021'
            case 18: // '\022'
            case 19: // '\023'
            case 20: // '\024'
                recurrenceCancelReason = Integer.valueOf(k);
                break;
            }
            if (true) goto _L22; else goto _L23
_L23:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (cancellationReason != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, cancellationReason.intValue());
            }
            j = i;
            if (imageUrl != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, imageUrl);
            }
            i = j;
            if (canReject != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(3, canReject.booleanValue());
            }
            j = i;
            if (canAccept != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(4, canAccept.booleanValue());
            }
            i = j;
            if (fees != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, fees);
            }
            j = i;
            if (sendersMessage != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, sendersMessage);
            }
            i = j;
            if (autoRejectTime != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(7, autoRejectTime);
            }
            j = i;
            if (recipientAmount != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(8, recipientAmount);
            }
            i = j;
            if (feeDescription != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(9, feeDescription);
            }
            j = i;
            if (p2PFee != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(10, p2PFee);
            }
            i = j;
            if (moneyRequestId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(11, moneyRequestId);
            }
            j = i;
            if (includesDeposit != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(12, includesDeposit.booleanValue());
            }
            i = j;
            if (latestEstimatedCompletionTime != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(13, latestEstimatedCompletionTime);
            }
            j = i;
            if (earliestEstimatedCompletionTime != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(14, earliestEstimatedCompletionTime);
            }
            i = j;
            if (transactionRecurrenceId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(15, transactionRecurrenceId);
            }
            j = i;
            if (scheduledExecutionTime != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(16, scheduledExecutionTime);
            }
            i = j;
            if (fulfilledMoneyRequest != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(17, fulfilledMoneyRequest);
            }
            j = i;
            if (recurrenceDetails != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(18, recurrenceDetails);
            }
            i = j;
            if (recurrenceCancelReason != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(19, recurrenceCancelReason.intValue());
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
            if (cancellationReason != null)
            {
                codedoutputbytebuffernano.writeInt32(1, cancellationReason.intValue());
            }
            if (imageUrl != null)
            {
                codedoutputbytebuffernano.writeString(2, imageUrl);
            }
            if (canReject != null)
            {
                codedoutputbytebuffernano.writeBool(3, canReject.booleanValue());
            }
            if (canAccept != null)
            {
                codedoutputbytebuffernano.writeBool(4, canAccept.booleanValue());
            }
            if (fees != null)
            {
                codedoutputbytebuffernano.writeMessage(5, fees);
            }
            if (sendersMessage != null)
            {
                codedoutputbytebuffernano.writeString(6, sendersMessage);
            }
            if (autoRejectTime != null)
            {
                codedoutputbytebuffernano.writeMessage(7, autoRejectTime);
            }
            if (recipientAmount != null)
            {
                codedoutputbytebuffernano.writeMessage(8, recipientAmount);
            }
            if (feeDescription != null)
            {
                codedoutputbytebuffernano.writeString(9, feeDescription);
            }
            if (p2PFee != null)
            {
                codedoutputbytebuffernano.writeMessage(10, p2PFee);
            }
            if (moneyRequestId != null)
            {
                codedoutputbytebuffernano.writeString(11, moneyRequestId);
            }
            if (includesDeposit != null)
            {
                codedoutputbytebuffernano.writeBool(12, includesDeposit.booleanValue());
            }
            if (latestEstimatedCompletionTime != null)
            {
                codedoutputbytebuffernano.writeMessage(13, latestEstimatedCompletionTime);
            }
            if (earliestEstimatedCompletionTime != null)
            {
                codedoutputbytebuffernano.writeMessage(14, earliestEstimatedCompletionTime);
            }
            if (transactionRecurrenceId != null)
            {
                codedoutputbytebuffernano.writeString(15, transactionRecurrenceId);
            }
            if (scheduledExecutionTime != null)
            {
                codedoutputbytebuffernano.writeMessage(16, scheduledExecutionTime);
            }
            if (fulfilledMoneyRequest != null)
            {
                codedoutputbytebuffernano.writeMessage(17, fulfilledMoneyRequest);
            }
            if (recurrenceDetails != null)
            {
                codedoutputbytebuffernano.writeMessage(18, recurrenceDetails);
            }
            if (recurrenceCancelReason != null)
            {
                codedoutputbytebuffernano.writeInt32(19, recurrenceCancelReason.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }
    }

    public static final class P2pDetails.P2pMoneyRequestInfo extends ExtendableMessageNano
    {

        public com.google.checkout.customer.common.definitions.NanoDatetime.DateTime moneyRequestCreationTime;
        public String moneyRequestId;
        public String requesterMessage;

        private P2pDetails.P2pMoneyRequestInfo clear()
        {
            moneyRequestId = null;
            moneyRequestCreationTime = null;
            requesterMessage = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private P2pDetails.P2pMoneyRequestInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    moneyRequestId = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    if (moneyRequestCreationTime == null)
                    {
                        moneyRequestCreationTime = new com.google.checkout.customer.common.definitions.NanoDatetime.DateTime();
                    }
                    codedinputbytebuffernano.readMessage(moneyRequestCreationTime);
                    break;

                case 26: // '\032'
                    requesterMessage = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (moneyRequestId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, moneyRequestId);
            }
            j = i;
            if (moneyRequestCreationTime != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, moneyRequestCreationTime);
            }
            i = j;
            if (requesterMessage != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, requesterMessage);
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
            if (moneyRequestId != null)
            {
                codedoutputbytebuffernano.writeString(1, moneyRequestId);
            }
            if (moneyRequestCreationTime != null)
            {
                codedoutputbytebuffernano.writeMessage(2, moneyRequestCreationTime);
            }
            if (requesterMessage != null)
            {
                codedoutputbytebuffernano.writeString(3, requesterMessage);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public P2pDetails.P2pMoneyRequestInfo()
        {
            clear();
        }
    }

    public static final class P2pRecurrenceDetails extends ExtendableMessageNano
    {

        public Integer dayOfMonth;
        public Integer dayOfWeek;
        public Integer intervalUnit;
        public Integer period;

        private P2pRecurrenceDetails clear()
        {
            intervalUnit = null;
            period = null;
            dayOfWeek = null;
            dayOfMonth = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private P2pRecurrenceDetails mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L7:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 5: default 56
        //                       0: 65
        //                       8: 67
        //                       16: 110
        //                       24: 124
        //                       32: 186;
               goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
                intervalUnit = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            period = Integer.valueOf(codedinputbytebuffernano.readInt32());
            continue; /* Loop/switch isn't completed */
_L5:
            int k = codedinputbytebuffernano.readInt32();
            switch (k)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
                dayOfWeek = Integer.valueOf(k);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L6:
            dayOfMonth = Integer.valueOf(codedinputbytebuffernano.readInt32());
            if (true) goto _L7; else goto _L8
_L8:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (intervalUnit != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, intervalUnit.intValue());
            }
            j = i;
            if (period != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, period.intValue());
            }
            i = j;
            if (dayOfWeek != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, dayOfWeek.intValue());
            }
            j = i;
            if (dayOfMonth != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(4, dayOfMonth.intValue());
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
            if (intervalUnit != null)
            {
                codedoutputbytebuffernano.writeInt32(1, intervalUnit.intValue());
            }
            if (period != null)
            {
                codedoutputbytebuffernano.writeInt32(2, period.intValue());
            }
            if (dayOfWeek != null)
            {
                codedoutputbytebuffernano.writeInt32(3, dayOfWeek.intValue());
            }
            if (dayOfMonth != null)
            {
                codedoutputbytebuffernano.writeInt32(4, dayOfMonth.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public P2pRecurrenceDetails()
        {
            clear();
        }
    }

}
