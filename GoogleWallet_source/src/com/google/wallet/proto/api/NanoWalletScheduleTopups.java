// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

public interface NanoWalletScheduleTopups
{
    public static final class CancelTopupScheduleRequest extends ExtendableMessageNano
    {

        public Boolean ignoreDeadline;
        public byte serverData[];

        private CancelTopupScheduleRequest clear()
        {
            ignoreDeadline = null;
            serverData = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private CancelTopupScheduleRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

                case 16: // '\020'
                    ignoreDeadline = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 26: // '\032'
                    serverData = codedinputbytebuffernano.readBytes();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (ignoreDeadline != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(2, ignoreDeadline.booleanValue());
            }
            j = i;
            if (serverData != null)
            {
                j = i + CodedOutputByteBufferNano.computeBytesSize(3, serverData);
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
            if (ignoreDeadline != null)
            {
                codedoutputbytebuffernano.writeBool(2, ignoreDeadline.booleanValue());
            }
            if (serverData != null)
            {
                codedoutputbytebuffernano.writeBytes(3, serverData);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public CancelTopupScheduleRequest()
        {
            clear();
        }
    }

    public static final class CancelTopupScheduleResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;

        private CancelTopupScheduleResponse clear()
        {
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private CancelTopupScheduleResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (callError == null)
                    {
                        callError = new com.google.wallet.proto.NanoWalletError.CallError();
                    }
                    codedinputbytebuffernano.readMessage(callError);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (callError != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, callError);
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
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(1, callError);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public CancelTopupScheduleResponse()
        {
            clear();
        }
    }

    public static final class CheckScheduledTopupEligibilityRequest extends ExtendableMessageNano
    {

        private CheckScheduledTopupEligibilityRequest clear()
        {
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private CheckScheduledTopupEligibilityRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L3:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR tableswitch 0 0: default 24
        //                       0 33;
               goto _L1 _L2
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L3; else goto _L2
_L2:
            return this;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public CheckScheduledTopupEligibilityRequest()
        {
            clear();
        }
    }

    public static final class CheckScheduledTopupEligibilityResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public EligibilityExplanation explanation;
        public Boolean isEligible;
        public TransferLimit transferLimits[];

        private CheckScheduledTopupEligibilityResponse clear()
        {
            isEligible = null;
            callError = null;
            explanation = null;
            transferLimits = TransferLimit.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private CheckScheduledTopupEligibilityResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    isEligible = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 18: // '\022'
                    if (callError == null)
                    {
                        callError = new com.google.wallet.proto.NanoWalletError.CallError();
                    }
                    codedinputbytebuffernano.readMessage(callError);
                    break;

                case 26: // '\032'
                    if (explanation == null)
                    {
                        explanation = new EligibilityExplanation();
                    }
                    codedinputbytebuffernano.readMessage(explanation);
                    break;

                case 42: // '*'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 42);
                    TransferLimit atransferlimit[];
                    int j;
                    if (transferLimits == null)
                    {
                        j = 0;
                    } else
                    {
                        j = transferLimits.length;
                    }
                    atransferlimit = new TransferLimit[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(transferLimits, 0, atransferlimit, 0, j);
                        k = j;
                    }
                    for (; k < atransferlimit.length - 1; k++)
                    {
                        atransferlimit[k] = new TransferLimit();
                        codedinputbytebuffernano.readMessage(atransferlimit[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    atransferlimit[k] = new TransferLimit();
                    codedinputbytebuffernano.readMessage(atransferlimit[k]);
                    transferLimits = atransferlimit;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (isEligible != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(1, isEligible.booleanValue());
            }
            j = i;
            if (callError != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, callError);
            }
            i = j;
            if (explanation != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, explanation);
            }
            int l = i;
            if (transferLimits != null)
            {
                l = i;
                if (transferLimits.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= transferLimits.length)
                        {
                            break;
                        }
                        TransferLimit transferlimit = transferLimits[k];
                        l = i;
                        if (transferlimit != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(5, transferlimit);
                        }
                        k++;
                        i = l;
                    } while (true);
                }
            }
            return l;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (isEligible != null)
            {
                codedoutputbytebuffernano.writeBool(1, isEligible.booleanValue());
            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(2, callError);
            }
            if (explanation != null)
            {
                codedoutputbytebuffernano.writeMessage(3, explanation);
            }
            if (transferLimits != null && transferLimits.length > 0)
            {
                for (int i = 0; i < transferLimits.length; i++)
                {
                    TransferLimit transferlimit = transferLimits[i];
                    if (transferlimit != null)
                    {
                        codedoutputbytebuffernano.writeMessage(5, transferlimit);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public CheckScheduledTopupEligibilityResponse()
        {
            clear();
        }
    }

    public static final class CheckScheduledTopupEligibilityResponse.EligibilityExplanation extends ExtendableMessageNano
    {

        public String description;
        public HelpLink helpLink;

        private CheckScheduledTopupEligibilityResponse.EligibilityExplanation clear()
        {
            description = null;
            helpLink = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private CheckScheduledTopupEligibilityResponse.EligibilityExplanation mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (helpLink == null)
                    {
                        helpLink = new HelpLink();
                    }
                    codedinputbytebuffernano.readMessage(helpLink);
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
            if (helpLink != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, helpLink);
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
            if (helpLink != null)
            {
                codedoutputbytebuffernano.writeMessage(2, helpLink);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public CheckScheduledTopupEligibilityResponse.EligibilityExplanation()
        {
            clear();
        }
    }

    public static final class CheckScheduledTopupEligibilityResponse.EligibilityExplanation.HelpLink extends ExtendableMessageNano
    {

        public String linkUri;
        public String text;

        private CheckScheduledTopupEligibilityResponse.EligibilityExplanation.HelpLink clear()
        {
            text = null;
            linkUri = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private CheckScheduledTopupEligibilityResponse.EligibilityExplanation.HelpLink mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public CheckScheduledTopupEligibilityResponse.EligibilityExplanation.HelpLink()
        {
            clear();
        }
    }

    public static final class CheckScheduledTopupEligibilityResponse.TransferLimit extends ExtendableMessageNano
    {

        private static volatile CheckScheduledTopupEligibilityResponse.TransferLimit _emptyArray[];
        public com.google.wallet.proto.NanoWalletEntities.DisplayableMoney maximumTopupAmount;
        public com.google.wallet.proto.NanoWalletEntities.DisplayableMoney minimumTopupAmount;
        public Integer recurrence;

        private CheckScheduledTopupEligibilityResponse.TransferLimit clear()
        {
            recurrence = null;
            minimumTopupAmount = null;
            maximumTopupAmount = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static CheckScheduledTopupEligibilityResponse.TransferLimit[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new CheckScheduledTopupEligibilityResponse.TransferLimit[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private CheckScheduledTopupEligibilityResponse.TransferLimit mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L6:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 57
        //                       8: 59
        //                       18: 110
        //                       26: 139;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
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
                recurrence = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            if (minimumTopupAmount == null)
            {
                minimumTopupAmount = new com.google.wallet.proto.NanoWalletEntities.DisplayableMoney();
            }
            codedinputbytebuffernano.readMessage(minimumTopupAmount);
            continue; /* Loop/switch isn't completed */
_L5:
            if (maximumTopupAmount == null)
            {
                maximumTopupAmount = new com.google.wallet.proto.NanoWalletEntities.DisplayableMoney();
            }
            codedinputbytebuffernano.readMessage(maximumTopupAmount);
            if (true) goto _L6; else goto _L7
_L7:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (recurrence != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, recurrence.intValue());
            }
            j = i;
            if (minimumTopupAmount != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, minimumTopupAmount);
            }
            i = j;
            if (maximumTopupAmount != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, maximumTopupAmount);
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
            if (recurrence != null)
            {
                codedoutputbytebuffernano.writeInt32(1, recurrence.intValue());
            }
            if (minimumTopupAmount != null)
            {
                codedoutputbytebuffernano.writeMessage(2, minimumTopupAmount);
            }
            if (maximumTopupAmount != null)
            {
                codedoutputbytebuffernano.writeMessage(3, maximumTopupAmount);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public CheckScheduledTopupEligibilityResponse.TransferLimit()
        {
            clear();
        }
    }

    public static final class DisplayableSchedule extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletEntities.DisplayableMoney amount;
        public Boolean disableSkipSupport;
        public ErrorState errorState;
        public String fundingInstrumentSubId;
        public FundingSource fundingSource;
        public byte id[];
        public NextTopup nextTopup;
        public String recurrenceMessage;
        public String recurrenceMessageAmount;
        public String recurrenceMessageDay;
        public com.google.wallet.proto.features.NanoPaymentSchedule.Schedule schedule;
        public byte serverData[];

        private DisplayableSchedule clear()
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

        private DisplayableSchedule mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                        schedule = new com.google.wallet.proto.features.NanoPaymentSchedule.Schedule();
                    }
                    codedinputbytebuffernano.readMessage(schedule);
                    break;

                case 26: // '\032'
                    if (amount == null)
                    {
                        amount = new com.google.wallet.proto.NanoWalletEntities.DisplayableMoney();
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

        public DisplayableSchedule()
        {
            clear();
        }
    }

    public static final class DisplayableSchedule.DisplayableDateTime extends ExtendableMessageNano
    {

        public String date;
        public String time;
        public Long timestamp;

        private DisplayableSchedule.DisplayableDateTime clear()
        {
            timestamp = null;
            date = null;
            time = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DisplayableSchedule.DisplayableDateTime mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public DisplayableSchedule.DisplayableDateTime()
        {
            clear();
        }
    }

    public static final class DisplayableSchedule.ErrorState extends ExtendableMessageNano
    {

        public String description;
        public DisplayableSchedule.DisplayableDateTime timestamp;

        private DisplayableSchedule.ErrorState clear()
        {
            timestamp = null;
            description = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DisplayableSchedule.ErrorState mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                        timestamp = new DisplayableSchedule.DisplayableDateTime();
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

        public DisplayableSchedule.ErrorState()
        {
            clear();
        }
    }

    public static final class DisplayableSchedule.FundingSource extends ExtendableMessageNano
    {

        public String description;
        public String fees;
        public String nickname;

        private DisplayableSchedule.FundingSource clear()
        {
            description = null;
            nickname = null;
            fees = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DisplayableSchedule.FundingSource mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public DisplayableSchedule.FundingSource()
        {
            clear();
        }
    }

    public static final class DisplayableSchedule.HelpLink extends ExtendableMessageNano
    {

        public String linkUri;
        public String text;

        private DisplayableSchedule.HelpLink clear()
        {
            text = null;
            linkUri = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DisplayableSchedule.HelpLink mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public DisplayableSchedule.HelpLink()
        {
            clear();
        }
    }

    public static final class DisplayableSchedule.NextTopup extends ExtendableMessageNano
    {

        public String availabilityMessage;
        public String detailsMessage;
        public DisplayableSchedule.HelpLink helpLink;
        public DisplayableSchedule.DisplayableDateTime startDate;
        public String startMessage;
        public Boolean transferHold;

        private DisplayableSchedule.NextTopup clear()
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

        private DisplayableSchedule.NextTopup mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                        startDate = new DisplayableSchedule.DisplayableDateTime();
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
                        helpLink = new DisplayableSchedule.HelpLink();
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

        public DisplayableSchedule.NextTopup()
        {
            clear();
        }
    }

    public static final class GetTopupScheduleRequest extends ExtendableMessageNano
    {

        public byte serverData[];

        private GetTopupScheduleRequest clear()
        {
            serverData = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetTopupScheduleRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    serverData = codedinputbytebuffernano.readBytes();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (serverData != null)
            {
                i = j + CodedOutputByteBufferNano.computeBytesSize(1, serverData);
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
            if (serverData != null)
            {
                codedoutputbytebuffernano.writeBytes(1, serverData);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GetTopupScheduleRequest()
        {
            clear();
        }
    }

    public static final class GetTopupScheduleResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public DisplayableSchedule schedule;

        private GetTopupScheduleResponse clear()
        {
            schedule = null;
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetTopupScheduleResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (callError == null)
                    {
                        callError = new com.google.wallet.proto.NanoWalletError.CallError();
                    }
                    codedinputbytebuffernano.readMessage(callError);
                    break;

                case 26: // '\032'
                    if (schedule == null)
                    {
                        schedule = new DisplayableSchedule();
                    }
                    codedinputbytebuffernano.readMessage(schedule);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (callError != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(2, callError);
            }
            j = i;
            if (schedule != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(3, schedule);
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
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(2, callError);
            }
            if (schedule != null)
            {
                codedoutputbytebuffernano.writeMessage(3, schedule);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GetTopupScheduleResponse()
        {
            clear();
        }
    }

    public static final class PreviewTopupScheduleRequest extends ExtendableMessageNano
    {

        public com.google.wallet.proto.features.NanoPaymentSchedule.ScheduleChange scheduleChange;

        private PreviewTopupScheduleRequest clear()
        {
            scheduleChange = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private PreviewTopupScheduleRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (scheduleChange == null)
                    {
                        scheduleChange = new com.google.wallet.proto.features.NanoPaymentSchedule.ScheduleChange();
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
            if (scheduleChange != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, scheduleChange);
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
            if (scheduleChange != null)
            {
                codedoutputbytebuffernano.writeMessage(1, scheduleChange);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PreviewTopupScheduleRequest()
        {
            clear();
        }
    }

    public static final class PreviewTopupScheduleResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public DisplayableSchedule schedule;

        private PreviewTopupScheduleResponse clear()
        {
            schedule = null;
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private PreviewTopupScheduleResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                        schedule = new DisplayableSchedule();
                    }
                    codedinputbytebuffernano.readMessage(schedule);
                    break;

                case 18: // '\022'
                    if (callError == null)
                    {
                        callError = new com.google.wallet.proto.NanoWalletError.CallError();
                    }
                    codedinputbytebuffernano.readMessage(callError);
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
                codedoutputbytebuffernano.writeMessage(1, schedule);
            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(2, callError);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PreviewTopupScheduleResponse()
        {
            clear();
        }
    }

    public static final class ScheduleTopupRequest extends ExtendableMessageNano
    {

        public byte serverData[];

        private ScheduleTopupRequest clear()
        {
            serverData = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ScheduleTopupRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    serverData = codedinputbytebuffernano.readBytes();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (serverData != null)
            {
                i = j + CodedOutputByteBufferNano.computeBytesSize(2, serverData);
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
            if (serverData != null)
            {
                codedoutputbytebuffernano.writeBytes(2, serverData);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ScheduleTopupRequest()
        {
            clear();
        }
    }

    public static final class ScheduleTopupResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public DisplayableSchedule schedule;
        public com.google.wallet.proto.features.NanoPaymentSchedule.ScheduleChange scheduleChange;

        private ScheduleTopupResponse clear()
        {
            schedule = null;
            scheduleChange = null;
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ScheduleTopupResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                        schedule = new DisplayableSchedule();
                    }
                    codedinputbytebuffernano.readMessage(schedule);
                    break;

                case 18: // '\022'
                    if (callError == null)
                    {
                        callError = new com.google.wallet.proto.NanoWalletError.CallError();
                    }
                    codedinputbytebuffernano.readMessage(callError);
                    break;

                case 26: // '\032'
                    if (scheduleChange == null)
                    {
                        scheduleChange = new com.google.wallet.proto.features.NanoPaymentSchedule.ScheduleChange();
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

        public ScheduleTopupResponse()
        {
            clear();
        }
    }

    public static final class SkipNextTopupTransactionRequest extends ExtendableMessageNano
    {

        public byte serverData[];

        private SkipNextTopupTransactionRequest clear()
        {
            serverData = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private SkipNextTopupTransactionRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    serverData = codedinputbytebuffernano.readBytes();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (serverData != null)
            {
                i = j + CodedOutputByteBufferNano.computeBytesSize(2, serverData);
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
            if (serverData != null)
            {
                codedoutputbytebuffernano.writeBytes(2, serverData);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SkipNextTopupTransactionRequest()
        {
            clear();
        }
    }

    public static final class SkipNextTopupTransactionResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public DisplayableSchedule schedule;

        private SkipNextTopupTransactionResponse clear()
        {
            schedule = null;
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private SkipNextTopupTransactionResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                        schedule = new DisplayableSchedule();
                    }
                    codedinputbytebuffernano.readMessage(schedule);
                    break;

                case 18: // '\022'
                    if (callError == null)
                    {
                        callError = new com.google.wallet.proto.NanoWalletError.CallError();
                    }
                    codedinputbytebuffernano.readMessage(callError);
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
                codedoutputbytebuffernano.writeMessage(1, schedule);
            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(2, callError);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SkipNextTopupTransactionResponse()
        {
            clear();
        }
    }

}
