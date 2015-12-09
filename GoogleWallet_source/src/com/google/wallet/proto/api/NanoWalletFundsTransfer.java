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

public interface NanoWalletFundsTransfer
{
    public static final class AcceptAllMoneyTransfersRequest extends ExtendableMessageNano
    {

        public String destinationInstrumentSubId;
        public String transferIds[];
        public UserChallenge userChallenge[];

        private AcceptAllMoneyTransfersRequest clear()
        {
            transferIds = WireFormatNano.EMPTY_STRING_ARRAY;
            destinationInstrumentSubId = null;
            userChallenge = UserChallenge.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private AcceptAllMoneyTransfersRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                    String as[];
                    int j;
                    if (transferIds == null)
                    {
                        j = 0;
                    } else
                    {
                        j = transferIds.length;
                    }
                    as = new String[j + l];
                    l = j;
                    if (j != 0)
                    {
                        System.arraycopy(transferIds, 0, as, 0, j);
                        l = j;
                    }
                    for (; l < as.length - 1; l++)
                    {
                        as[l] = codedinputbytebuffernano.readString();
                        codedinputbytebuffernano.readTag();
                    }

                    as[l] = codedinputbytebuffernano.readString();
                    transferIds = as;
                    break;

                case 18: // '\022'
                    destinationInstrumentSubId = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    UserChallenge auserchallenge[];
                    int k;
                    if (userChallenge == null)
                    {
                        k = 0;
                    } else
                    {
                        k = userChallenge.length;
                    }
                    auserchallenge = new UserChallenge[k + i1];
                    i1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(userChallenge, 0, auserchallenge, 0, k);
                        i1 = k;
                    }
                    for (; i1 < auserchallenge.length - 1; i1++)
                    {
                        auserchallenge[i1] = new UserChallenge();
                        codedinputbytebuffernano.readMessage(auserchallenge[i1]);
                        codedinputbytebuffernano.readTag();
                    }

                    auserchallenge[i1] = new UserChallenge();
                    codedinputbytebuffernano.readMessage(auserchallenge[i1]);
                    userChallenge = auserchallenge;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i2 = super.computeSerializedSize();
            int k = i2;
            if (transferIds != null)
            {
                k = i2;
                if (transferIds.length > 0)
                {
                    int k1 = 0;
                    k = 0;
                    for (int i = 0; i < transferIds.length;)
                    {
                        String s = transferIds[i];
                        int l1 = k1;
                        int i1 = k;
                        if (s != null)
                        {
                            l1 = k1 + 1;
                            i1 = k + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                        }
                        i++;
                        k1 = l1;
                        k = i1;
                    }

                    k = i2 + k + k1 * 1;
                }
            }
            int j = k;
            if (destinationInstrumentSubId != null)
            {
                j = k + CodedOutputByteBufferNano.computeStringSize(2, destinationInstrumentSubId);
            }
            int j1 = j;
            if (userChallenge != null)
            {
                j1 = j;
                if (userChallenge.length > 0)
                {
                    int l = 0;
                    do
                    {
                        j1 = j;
                        if (l >= userChallenge.length)
                        {
                            break;
                        }
                        UserChallenge userchallenge = userChallenge[l];
                        j1 = j;
                        if (userchallenge != null)
                        {
                            j1 = j + CodedOutputByteBufferNano.computeMessageSize(3, userchallenge);
                        }
                        l++;
                        j = j1;
                    } while (true);
                }
            }
            return j1;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (transferIds != null && transferIds.length > 0)
            {
                for (int i = 0; i < transferIds.length; i++)
                {
                    String s = transferIds[i];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(1, s);
                    }
                }

            }
            if (destinationInstrumentSubId != null)
            {
                codedoutputbytebuffernano.writeString(2, destinationInstrumentSubId);
            }
            if (userChallenge != null && userChallenge.length > 0)
            {
                for (int j = 0; j < userChallenge.length; j++)
                {
                    UserChallenge userchallenge = userChallenge[j];
                    if (userchallenge != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, userchallenge);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public AcceptAllMoneyTransfersRequest()
        {
            clear();
        }
    }

    public static final class AcceptAllMoneyTransfersResponse extends ExtendableMessageNano
    {

        public String acceptedAmount;
        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public String expectedAvailabilityDescription;
        public UserChallenge requestedChallenge;
        public String successfullyAcceptedTransferIds[];

        private AcceptAllMoneyTransfersResponse clear()
        {
            callError = null;
            successfullyAcceptedTransferIds = WireFormatNano.EMPTY_STRING_ARRAY;
            requestedChallenge = null;
            acceptedAmount = null;
            expectedAvailabilityDescription = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private AcceptAllMoneyTransfersResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

                case 18: // '\022'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                    String as[];
                    int j;
                    if (successfullyAcceptedTransferIds == null)
                    {
                        j = 0;
                    } else
                    {
                        j = successfullyAcceptedTransferIds.length;
                    }
                    as = new String[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(successfullyAcceptedTransferIds, 0, as, 0, j);
                        k = j;
                    }
                    for (; k < as.length - 1; k++)
                    {
                        as[k] = codedinputbytebuffernano.readString();
                        codedinputbytebuffernano.readTag();
                    }

                    as[k] = codedinputbytebuffernano.readString();
                    successfullyAcceptedTransferIds = as;
                    break;

                case 26: // '\032'
                    if (requestedChallenge == null)
                    {
                        requestedChallenge = new UserChallenge();
                    }
                    codedinputbytebuffernano.readMessage(requestedChallenge);
                    break;

                case 34: // '"'
                    acceptedAmount = codedinputbytebuffernano.readString();
                    break;

                case 42: // '*'
                    expectedAvailabilityDescription = codedinputbytebuffernano.readString();
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
            j = i;
            if (successfullyAcceptedTransferIds != null)
            {
                j = i;
                if (successfullyAcceptedTransferIds.length > 0)
                {
                    int i1 = 0;
                    int k = 0;
                    for (j = 0; j < successfullyAcceptedTransferIds.length;)
                    {
                        String s = successfullyAcceptedTransferIds[j];
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
            if (requestedChallenge != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, requestedChallenge);
            }
            j = i;
            if (acceptedAmount != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, acceptedAmount);
            }
            i = j;
            if (expectedAvailabilityDescription != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, expectedAvailabilityDescription);
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
            if (successfullyAcceptedTransferIds != null && successfullyAcceptedTransferIds.length > 0)
            {
                for (int i = 0; i < successfullyAcceptedTransferIds.length; i++)
                {
                    String s = successfullyAcceptedTransferIds[i];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(2, s);
                    }
                }

            }
            if (requestedChallenge != null)
            {
                codedoutputbytebuffernano.writeMessage(3, requestedChallenge);
            }
            if (acceptedAmount != null)
            {
                codedoutputbytebuffernano.writeString(4, acceptedAmount);
            }
            if (expectedAvailabilityDescription != null)
            {
                codedoutputbytebuffernano.writeString(5, expectedAvailabilityDescription);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public AcceptAllMoneyTransfersResponse()
        {
            clear();
        }
    }

    public static final class AddToStoredValueRequest extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletEntities.MoneyProto amount;
        public com.google.wallet.proto.NanoWalletEntities.MoneyProto fees;
        public com.google.wallet.proto.NanoWalletEntities.CdpIdData fundingInstrumentId;
        public String topUpId;

        private AddToStoredValueRequest clear()
        {
            fundingInstrumentId = null;
            amount = null;
            topUpId = null;
            fees = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private AddToStoredValueRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (fundingInstrumentId == null)
                    {
                        fundingInstrumentId = new com.google.wallet.proto.NanoWalletEntities.CdpIdData();
                    }
                    codedinputbytebuffernano.readMessage(fundingInstrumentId);
                    break;

                case 18: // '\022'
                    if (amount == null)
                    {
                        amount = new com.google.wallet.proto.NanoWalletEntities.MoneyProto();
                    }
                    codedinputbytebuffernano.readMessage(amount);
                    break;

                case 26: // '\032'
                    if (fees == null)
                    {
                        fees = new com.google.wallet.proto.NanoWalletEntities.MoneyProto();
                    }
                    codedinputbytebuffernano.readMessage(fees);
                    break;

                case 34: // '"'
                    topUpId = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (fundingInstrumentId != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, fundingInstrumentId);
            }
            j = i;
            if (amount != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, amount);
            }
            i = j;
            if (fees != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, fees);
            }
            j = i;
            if (topUpId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, topUpId);
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
            if (fundingInstrumentId != null)
            {
                codedoutputbytebuffernano.writeMessage(1, fundingInstrumentId);
            }
            if (amount != null)
            {
                codedoutputbytebuffernano.writeMessage(2, amount);
            }
            if (fees != null)
            {
                codedoutputbytebuffernano.writeMessage(3, fees);
            }
            if (topUpId != null)
            {
                codedoutputbytebuffernano.writeString(4, topUpId);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public AddToStoredValueRequest()
        {
            clear();
        }
    }

    public static final class AddToStoredValueResponse extends ExtendableMessageNano
    {

        public FundsTransferAmountMismatch amountMismatch;
        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public String topUpIdempotencyId;
        public String topUpReceiptId;

        private AddToStoredValueResponse clear()
        {
            callError = null;
            topUpIdempotencyId = null;
            amountMismatch = null;
            topUpReceiptId = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private AddToStoredValueResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

                case 34: // '"'
                    topUpIdempotencyId = codedinputbytebuffernano.readString();
                    break;

                case 42: // '*'
                    if (amountMismatch == null)
                    {
                        amountMismatch = new FundsTransferAmountMismatch();
                    }
                    codedinputbytebuffernano.readMessage(amountMismatch);
                    break;

                case 50: // '2'
                    topUpReceiptId = codedinputbytebuffernano.readString();
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
            if (topUpIdempotencyId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, topUpIdempotencyId);
            }
            i = j;
            if (amountMismatch != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, amountMismatch);
            }
            j = i;
            if (topUpReceiptId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, topUpReceiptId);
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
            if (topUpIdempotencyId != null)
            {
                codedoutputbytebuffernano.writeString(4, topUpIdempotencyId);
            }
            if (amountMismatch != null)
            {
                codedoutputbytebuffernano.writeMessage(5, amountMismatch);
            }
            if (topUpReceiptId != null)
            {
                codedoutputbytebuffernano.writeString(6, topUpReceiptId);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public AddToStoredValueResponse()
        {
            clear();
        }
    }

    public static final class CalculateFeeRequest extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletEntities.MoneyProto amount;
        public String destinationInstrumentSubId;
        public String fundingInstrumentSubId;
        public com.google.wallet.proto.NanoWalletEntities.TransactionType transactionType;

        private CalculateFeeRequest clear()
        {
            transactionType = null;
            fundingInstrumentSubId = null;
            amount = null;
            destinationInstrumentSubId = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private CalculateFeeRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (transactionType == null)
                    {
                        transactionType = new com.google.wallet.proto.NanoWalletEntities.TransactionType();
                    }
                    codedinputbytebuffernano.readMessage(transactionType);
                    break;

                case 18: // '\022'
                    fundingInstrumentSubId = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    if (amount == null)
                    {
                        amount = new com.google.wallet.proto.NanoWalletEntities.MoneyProto();
                    }
                    codedinputbytebuffernano.readMessage(amount);
                    break;

                case 34: // '"'
                    destinationInstrumentSubId = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (transactionType != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, transactionType);
            }
            j = i;
            if (fundingInstrumentSubId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, fundingInstrumentSubId);
            }
            i = j;
            if (amount != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, amount);
            }
            j = i;
            if (destinationInstrumentSubId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, destinationInstrumentSubId);
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
            if (transactionType != null)
            {
                codedoutputbytebuffernano.writeMessage(1, transactionType);
            }
            if (fundingInstrumentSubId != null)
            {
                codedoutputbytebuffernano.writeString(2, fundingInstrumentSubId);
            }
            if (amount != null)
            {
                codedoutputbytebuffernano.writeMessage(3, amount);
            }
            if (destinationInstrumentSubId != null)
            {
                codedoutputbytebuffernano.writeString(4, destinationInstrumentSubId);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public CalculateFeeRequest()
        {
            clear();
        }
    }

    public static final class CalculateFeeResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public com.google.wallet.proto.NanoWalletEntities.DisplayableMoney feeAmount;
        public Boolean isWaived;
        public com.google.wallet.proto.NanoWalletEntities.DisplayableMoney totalAmount;

        private CalculateFeeResponse clear()
        {
            callError = null;
            feeAmount = null;
            isWaived = null;
            totalAmount = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private CalculateFeeResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (feeAmount == null)
                    {
                        feeAmount = new com.google.wallet.proto.NanoWalletEntities.DisplayableMoney();
                    }
                    codedinputbytebuffernano.readMessage(feeAmount);
                    break;

                case 32: // ' '
                    isWaived = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 50: // '2'
                    if (totalAmount == null)
                    {
                        totalAmount = new com.google.wallet.proto.NanoWalletEntities.DisplayableMoney();
                    }
                    codedinputbytebuffernano.readMessage(totalAmount);
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
            if (feeAmount != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(3, feeAmount);
            }
            i = j;
            if (isWaived != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(4, isWaived.booleanValue());
            }
            j = i;
            if (totalAmount != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(6, totalAmount);
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
            if (feeAmount != null)
            {
                codedoutputbytebuffernano.writeMessage(3, feeAmount);
            }
            if (isWaived != null)
            {
                codedoutputbytebuffernano.writeBool(4, isWaived.booleanValue());
            }
            if (totalAmount != null)
            {
                codedoutputbytebuffernano.writeMessage(6, totalAmount);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public CalculateFeeResponse()
        {
            clear();
        }
    }

    public static final class CancelMoneyRequestRequest extends ExtendableMessageNano
    {

        public String id;
        public String moneyRequestId;

        private CancelMoneyRequestRequest clear()
        {
            moneyRequestId = null;
            id = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private CancelMoneyRequestRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    id = codedinputbytebuffernano.readString();
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
            if (id != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, id);
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
            if (moneyRequestId != null)
            {
                codedoutputbytebuffernano.writeString(1, moneyRequestId);
            }
            if (id != null)
            {
                codedoutputbytebuffernano.writeString(2, id);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public CancelMoneyRequestRequest()
        {
            clear();
        }
    }

    public static final class CancelMoneyRequestResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;

        private CancelMoneyRequestResponse clear()
        {
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private CancelMoneyRequestResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public CancelMoneyRequestResponse()
        {
            clear();
        }
    }

    public static final class DeclineMoneyRequestRequest extends ExtendableMessageNano
    {

        public String id;
        public String moneyRequestId;
        public Integer reason;

        private DeclineMoneyRequestRequest clear()
        {
            moneyRequestId = null;
            reason = null;
            id = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DeclineMoneyRequestRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L6:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 57
        //                       10: 59
        //                       16: 70
        //                       26: 118;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
            moneyRequestId = codedinputbytebuffernano.readString();
              goto _L6
_L4:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                reason = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            id = codedinputbytebuffernano.readString();
            if (true) goto _L6; else goto _L7
_L7:
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
            if (reason != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, reason.intValue());
            }
            i = j;
            if (id != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, id);
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
            if (reason != null)
            {
                codedoutputbytebuffernano.writeInt32(2, reason.intValue());
            }
            if (id != null)
            {
                codedoutputbytebuffernano.writeString(3, id);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DeclineMoneyRequestRequest()
        {
            clear();
        }
    }

    public static final class DeclineMoneyRequestResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;

        private DeclineMoneyRequestResponse clear()
        {
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DeclineMoneyRequestResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public DeclineMoneyRequestResponse()
        {
            clear();
        }
    }

    public static final class FundsTransferAmountMismatch extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletEntities.DisplayableMoney expectedFeeAmount;
        public String expectedFeeDescription;
        public com.google.wallet.proto.NanoWalletEntities.DisplayableMoney expectedTotalAmount;
        public FundsTransferInfo info;

        private FundsTransferAmountMismatch clear()
        {
            info = null;
            expectedFeeAmount = null;
            expectedFeeDescription = null;
            expectedTotalAmount = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FundsTransferAmountMismatch mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (info == null)
                    {
                        info = new FundsTransferInfo();
                    }
                    codedinputbytebuffernano.readMessage(info);
                    break;

                case 18: // '\022'
                    if (expectedFeeAmount == null)
                    {
                        expectedFeeAmount = new com.google.wallet.proto.NanoWalletEntities.DisplayableMoney();
                    }
                    codedinputbytebuffernano.readMessage(expectedFeeAmount);
                    break;

                case 26: // '\032'
                    expectedFeeDescription = codedinputbytebuffernano.readString();
                    break;

                case 34: // '"'
                    if (expectedTotalAmount == null)
                    {
                        expectedTotalAmount = new com.google.wallet.proto.NanoWalletEntities.DisplayableMoney();
                    }
                    codedinputbytebuffernano.readMessage(expectedTotalAmount);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (info != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, info);
            }
            j = i;
            if (expectedFeeAmount != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, expectedFeeAmount);
            }
            i = j;
            if (expectedFeeDescription != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, expectedFeeDescription);
            }
            j = i;
            if (expectedTotalAmount != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, expectedTotalAmount);
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
            if (info != null)
            {
                codedoutputbytebuffernano.writeMessage(1, info);
            }
            if (expectedFeeAmount != null)
            {
                codedoutputbytebuffernano.writeMessage(2, expectedFeeAmount);
            }
            if (expectedFeeDescription != null)
            {
                codedoutputbytebuffernano.writeString(3, expectedFeeDescription);
            }
            if (expectedTotalAmount != null)
            {
                codedoutputbytebuffernano.writeMessage(4, expectedTotalAmount);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public FundsTransferAmountMismatch()
        {
            clear();
        }
    }

    public static final class FundsTransferInfo extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletEntities.TransferFee fees[];
        public com.google.wallet.proto.NanoWalletEntities.FundingSourceInfo fundingSourceInfo[];
        public com.google.wallet.proto.NanoWalletWobl.RenderOutput fundingSourceOverview;
        public com.google.wallet.proto.NanoWalletEntities.DisplayableMoney maxTransactionAmount;

        private FundsTransferInfo clear()
        {
            fees = com.google.wallet.proto.NanoWalletEntities.TransferFee.emptyArray();
            maxTransactionAmount = null;
            fundingSourceInfo = com.google.wallet.proto.NanoWalletEntities.FundingSourceInfo.emptyArray();
            fundingSourceOverview = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FundsTransferInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                    com.google.wallet.proto.NanoWalletEntities.TransferFee atransferfee[];
                    int j;
                    if (fees == null)
                    {
                        j = 0;
                    } else
                    {
                        j = fees.length;
                    }
                    atransferfee = new com.google.wallet.proto.NanoWalletEntities.TransferFee[j + l];
                    l = j;
                    if (j != 0)
                    {
                        System.arraycopy(fees, 0, atransferfee, 0, j);
                        l = j;
                    }
                    for (; l < atransferfee.length - 1; l++)
                    {
                        atransferfee[l] = new com.google.wallet.proto.NanoWalletEntities.TransferFee();
                        codedinputbytebuffernano.readMessage(atransferfee[l]);
                        codedinputbytebuffernano.readTag();
                    }

                    atransferfee[l] = new com.google.wallet.proto.NanoWalletEntities.TransferFee();
                    codedinputbytebuffernano.readMessage(atransferfee[l]);
                    fees = atransferfee;
                    break;

                case 18: // '\022'
                    if (maxTransactionAmount == null)
                    {
                        maxTransactionAmount = new com.google.wallet.proto.NanoWalletEntities.DisplayableMoney();
                    }
                    codedinputbytebuffernano.readMessage(maxTransactionAmount);
                    break;

                case 26: // '\032'
                    int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    com.google.wallet.proto.NanoWalletEntities.FundingSourceInfo afundingsourceinfo[];
                    int k;
                    if (fundingSourceInfo == null)
                    {
                        k = 0;
                    } else
                    {
                        k = fundingSourceInfo.length;
                    }
                    afundingsourceinfo = new com.google.wallet.proto.NanoWalletEntities.FundingSourceInfo[k + i1];
                    i1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(fundingSourceInfo, 0, afundingsourceinfo, 0, k);
                        i1 = k;
                    }
                    for (; i1 < afundingsourceinfo.length - 1; i1++)
                    {
                        afundingsourceinfo[i1] = new com.google.wallet.proto.NanoWalletEntities.FundingSourceInfo();
                        codedinputbytebuffernano.readMessage(afundingsourceinfo[i1]);
                        codedinputbytebuffernano.readTag();
                    }

                    afundingsourceinfo[i1] = new com.google.wallet.proto.NanoWalletEntities.FundingSourceInfo();
                    codedinputbytebuffernano.readMessage(afundingsourceinfo[i1]);
                    fundingSourceInfo = afundingsourceinfo;
                    break;

                case 34: // '"'
                    if (fundingSourceOverview == null)
                    {
                        fundingSourceOverview = new com.google.wallet.proto.NanoWalletWobl.RenderOutput();
                    }
                    codedinputbytebuffernano.readMessage(fundingSourceOverview);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (fees != null)
            {
                j = i;
                if (fees.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= fees.length)
                        {
                            break;
                        }
                        com.google.wallet.proto.NanoWalletEntities.TransferFee transferfee = fees[k];
                        j = i;
                        if (transferfee != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(1, transferfee);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (maxTransactionAmount != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(2, maxTransactionAmount);
            }
            j = i;
            if (fundingSourceInfo != null)
            {
                j = i;
                if (fundingSourceInfo.length > 0)
                {
                    int l = 0;
                    do
                    {
                        j = i;
                        if (l >= fundingSourceInfo.length)
                        {
                            break;
                        }
                        com.google.wallet.proto.NanoWalletEntities.FundingSourceInfo fundingsourceinfo = fundingSourceInfo[l];
                        j = i;
                        if (fundingsourceinfo != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(3, fundingsourceinfo);
                        }
                        l++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (fundingSourceOverview != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(4, fundingSourceOverview);
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
            if (fees != null && fees.length > 0)
            {
                for (int i = 0; i < fees.length; i++)
                {
                    com.google.wallet.proto.NanoWalletEntities.TransferFee transferfee = fees[i];
                    if (transferfee != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, transferfee);
                    }
                }

            }
            if (maxTransactionAmount != null)
            {
                codedoutputbytebuffernano.writeMessage(2, maxTransactionAmount);
            }
            if (fundingSourceInfo != null && fundingSourceInfo.length > 0)
            {
                for (int j = 0; j < fundingSourceInfo.length; j++)
                {
                    com.google.wallet.proto.NanoWalletEntities.FundingSourceInfo fundingsourceinfo = fundingSourceInfo[j];
                    if (fundingsourceinfo != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, fundingsourceinfo);
                    }
                }

            }
            if (fundingSourceOverview != null)
            {
                codedoutputbytebuffernano.writeMessage(4, fundingSourceOverview);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public FundsTransferInfo()
        {
            clear();
        }
    }

    public static final class GetAcceptanceOptionsRequest extends ExtendableMessageNano
    {

        public String inviteToken;
        public String moneyTransferId;

        private GetAcceptanceOptionsRequest clear()
        {
            moneyTransferId = null;
            inviteToken = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetAcceptanceOptionsRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    moneyTransferId = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    inviteToken = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (moneyTransferId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, moneyTransferId);
            }
            j = i;
            if (inviteToken != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, inviteToken);
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
            if (moneyTransferId != null)
            {
                codedoutputbytebuffernano.writeString(1, moneyTransferId);
            }
            if (inviteToken != null)
            {
                codedoutputbytebuffernano.writeString(2, inviteToken);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GetAcceptanceOptionsRequest()
        {
            clear();
        }
    }

    public static final class GetAcceptanceOptionsResponse extends ExtendableMessageNano
    {

        public Integer acceptanceOptions;
        public com.google.wallet.proto.NanoWalletError.CallError callError;

        private GetAcceptanceOptionsResponse clear()
        {
            callError = null;
            acceptanceOptions = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetAcceptanceOptionsResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L5:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 49
        //                       10: 51
        //                       16: 80;
               goto _L1 _L2 _L3 _L4
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
_L2:
            return this;
_L3:
            if (callError == null)
            {
                callError = new com.google.wallet.proto.NanoWalletError.CallError();
            }
            codedinputbytebuffernano.readMessage(callError);
              goto _L5
_L4:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
                acceptanceOptions = Integer.valueOf(j);
                break;
            }
            if (true) goto _L5; else goto _L6
_L6:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (callError != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, callError);
            }
            j = i;
            if (acceptanceOptions != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, acceptanceOptions.intValue());
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
                codedoutputbytebuffernano.writeMessage(1, callError);
            }
            if (acceptanceOptions != null)
            {
                codedoutputbytebuffernano.writeInt32(2, acceptanceOptions.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GetAcceptanceOptionsResponse()
        {
            clear();
        }
    }

    public static final class GetFundsTransferAvailabilityRequest extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletEntities.MoneyProto amount;
        public String destinationInstrumentSubId;
        public String fundingInstrumentSubId;
        public com.google.wallet.proto.NanoWalletEntities.AccountIdentifier recipient;
        public com.google.wallet.proto.NanoWalletEntities.TransactionType transactionType;

        private GetFundsTransferAvailabilityRequest clear()
        {
            transactionType = null;
            fundingInstrumentSubId = null;
            amount = null;
            recipient = null;
            destinationInstrumentSubId = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetFundsTransferAvailabilityRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (transactionType == null)
                    {
                        transactionType = new com.google.wallet.proto.NanoWalletEntities.TransactionType();
                    }
                    codedinputbytebuffernano.readMessage(transactionType);
                    break;

                case 18: // '\022'
                    fundingInstrumentSubId = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    if (amount == null)
                    {
                        amount = new com.google.wallet.proto.NanoWalletEntities.MoneyProto();
                    }
                    codedinputbytebuffernano.readMessage(amount);
                    break;

                case 34: // '"'
                    if (recipient == null)
                    {
                        recipient = new com.google.wallet.proto.NanoWalletEntities.AccountIdentifier();
                    }
                    codedinputbytebuffernano.readMessage(recipient);
                    break;

                case 42: // '*'
                    destinationInstrumentSubId = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (transactionType != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, transactionType);
            }
            j = i;
            if (fundingInstrumentSubId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, fundingInstrumentSubId);
            }
            i = j;
            if (amount != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, amount);
            }
            j = i;
            if (recipient != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, recipient);
            }
            i = j;
            if (destinationInstrumentSubId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, destinationInstrumentSubId);
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
            if (transactionType != null)
            {
                codedoutputbytebuffernano.writeMessage(1, transactionType);
            }
            if (fundingInstrumentSubId != null)
            {
                codedoutputbytebuffernano.writeString(2, fundingInstrumentSubId);
            }
            if (amount != null)
            {
                codedoutputbytebuffernano.writeMessage(3, amount);
            }
            if (recipient != null)
            {
                codedoutputbytebuffernano.writeMessage(4, recipient);
            }
            if (destinationInstrumentSubId != null)
            {
                codedoutputbytebuffernano.writeString(5, destinationInstrumentSubId);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GetFundsTransferAvailabilityRequest()
        {
            clear();
        }
    }

    public static final class GetFundsTransferAvailabilityResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public Delay delay;
        public Instant instant;

        private GetFundsTransferAvailabilityResponse clear()
        {
            callError = null;
            instant = null;
            delay = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetFundsTransferAvailabilityResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

                case 18: // '\022'
                    if (instant == null)
                    {
                        instant = new Instant();
                    }
                    codedinputbytebuffernano.readMessage(instant);
                    break;

                case 26: // '\032'
                    if (delay == null)
                    {
                        delay = new Delay();
                    }
                    codedinputbytebuffernano.readMessage(delay);
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
            j = i;
            if (instant != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, instant);
            }
            i = j;
            if (delay != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, delay);
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
            if (instant != null)
            {
                codedoutputbytebuffernano.writeMessage(2, instant);
            }
            if (delay != null)
            {
                codedoutputbytebuffernano.writeMessage(3, delay);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GetFundsTransferAvailabilityResponse()
        {
            clear();
        }
    }

    public static final class GetFundsTransferAvailabilityResponse.Delay extends ExtendableMessageNano
    {

        public String description;
        public String descriptionPrefix;
        public String explanation;
        public GetFundsTransferAvailabilityResponse.HelpLink helpLink;

        private GetFundsTransferAvailabilityResponse.Delay clear()
        {
            descriptionPrefix = null;
            description = null;
            explanation = null;
            helpLink = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetFundsTransferAvailabilityResponse.Delay mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    descriptionPrefix = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    description = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    explanation = codedinputbytebuffernano.readString();
                    break;

                case 34: // '"'
                    if (helpLink == null)
                    {
                        helpLink = new GetFundsTransferAvailabilityResponse.HelpLink();
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
            if (descriptionPrefix != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, descriptionPrefix);
            }
            j = i;
            if (description != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, description);
            }
            i = j;
            if (explanation != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, explanation);
            }
            j = i;
            if (helpLink != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, helpLink);
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
            if (descriptionPrefix != null)
            {
                codedoutputbytebuffernano.writeString(1, descriptionPrefix);
            }
            if (description != null)
            {
                codedoutputbytebuffernano.writeString(2, description);
            }
            if (explanation != null)
            {
                codedoutputbytebuffernano.writeString(3, explanation);
            }
            if (helpLink != null)
            {
                codedoutputbytebuffernano.writeMessage(4, helpLink);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GetFundsTransferAvailabilityResponse.Delay()
        {
            clear();
        }
    }

    public static final class GetFundsTransferAvailabilityResponse.HelpLink extends ExtendableMessageNano
    {

        public String linkUri;
        public String text;

        private GetFundsTransferAvailabilityResponse.HelpLink clear()
        {
            text = null;
            linkUri = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetFundsTransferAvailabilityResponse.HelpLink mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public GetFundsTransferAvailabilityResponse.HelpLink()
        {
            clear();
        }
    }

    public static final class GetFundsTransferAvailabilityResponse.Instant extends ExtendableMessageNano
    {

        public String description;

        private GetFundsTransferAvailabilityResponse.Instant clear()
        {
            description = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetFundsTransferAvailabilityResponse.Instant mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
            super.writeTo(codedoutputbytebuffernano);
        }

        public GetFundsTransferAvailabilityResponse.Instant()
        {
            clear();
        }
    }

    public static final class GetFundsTransferInfoRequest extends ExtendableMessageNano
    {

        public String currencyCode;
        public Integer feeResponseFormat;
        public com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo requestRenderInfo;
        public com.google.wallet.proto.NanoWalletEntities.TransactionType transactionType;

        private GetFundsTransferInfoRequest clear()
        {
            transactionType = null;
            currencyCode = null;
            feeResponseFormat = null;
            requestRenderInfo = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetFundsTransferInfoRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L7:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 5: default 56
        //                       0: 65
        //                       10: 67
        //                       18: 96
        //                       24: 107
        //                       34: 150;
               goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
            return this;
_L3:
            if (transactionType == null)
            {
                transactionType = new com.google.wallet.proto.NanoWalletEntities.TransactionType();
            }
            codedinputbytebuffernano.readMessage(transactionType);
              goto _L7
_L4:
            currencyCode = codedinputbytebuffernano.readString();
              goto _L7
_L5:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
                feeResponseFormat = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L6:
            if (requestRenderInfo == null)
            {
                requestRenderInfo = new com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo();
            }
            codedinputbytebuffernano.readMessage(requestRenderInfo);
            if (true) goto _L7; else goto _L8
_L8:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (transactionType != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, transactionType);
            }
            j = i;
            if (currencyCode != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, currencyCode);
            }
            i = j;
            if (feeResponseFormat != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, feeResponseFormat.intValue());
            }
            j = i;
            if (requestRenderInfo != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, requestRenderInfo);
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
            if (transactionType != null)
            {
                codedoutputbytebuffernano.writeMessage(1, transactionType);
            }
            if (currencyCode != null)
            {
                codedoutputbytebuffernano.writeString(2, currencyCode);
            }
            if (feeResponseFormat != null)
            {
                codedoutputbytebuffernano.writeInt32(3, feeResponseFormat.intValue());
            }
            if (requestRenderInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(4, requestRenderInfo);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GetFundsTransferInfoRequest()
        {
            clear();
        }
    }

    public static final class GetFundsTransferInfoResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public FundsTransferInfo info;

        private GetFundsTransferInfoResponse clear()
        {
            callError = null;
            info = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetFundsTransferInfoResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (info == null)
                    {
                        info = new FundsTransferInfo();
                    }
                    codedinputbytebuffernano.readMessage(info);
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
            if (info != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(3, info);
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
            if (info != null)
            {
                codedoutputbytebuffernano.writeMessage(3, info);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GetFundsTransferInfoResponse()
        {
            clear();
        }
    }

    public static final class MoneyRequest extends ExtendableMessageNano
    {

        private static volatile MoneyRequest _emptyArray[];
        public com.google.wallet.proto.NanoWalletEntities.AccountIdentifier accountIdentifier;
        public com.google.wallet.proto.NanoWalletEntities.MoneyProto amount;
        public String replayId;

        private MoneyRequest clear()
        {
            accountIdentifier = null;
            amount = null;
            replayId = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static MoneyRequest[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new MoneyRequest[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private MoneyRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (accountIdentifier == null)
                    {
                        accountIdentifier = new com.google.wallet.proto.NanoWalletEntities.AccountIdentifier();
                    }
                    codedinputbytebuffernano.readMessage(accountIdentifier);
                    break;

                case 18: // '\022'
                    if (amount == null)
                    {
                        amount = new com.google.wallet.proto.NanoWalletEntities.MoneyProto();
                    }
                    codedinputbytebuffernano.readMessage(amount);
                    break;

                case 26: // '\032'
                    replayId = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (accountIdentifier != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, accountIdentifier);
            }
            j = i;
            if (amount != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, amount);
            }
            i = j;
            if (replayId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, replayId);
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
            if (accountIdentifier != null)
            {
                codedoutputbytebuffernano.writeMessage(1, accountIdentifier);
            }
            if (amount != null)
            {
                codedoutputbytebuffernano.writeMessage(2, amount);
            }
            if (replayId != null)
            {
                codedoutputbytebuffernano.writeString(3, replayId);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public MoneyRequest()
        {
            clear();
        }
    }

    public static final class RejectMoneyRequest extends ExtendableMessageNano
    {

        public String id;
        public String moneyTransferId;

        private RejectMoneyRequest clear()
        {
            moneyTransferId = null;
            id = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private RejectMoneyRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    moneyTransferId = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    id = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (moneyTransferId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, moneyTransferId);
            }
            j = i;
            if (id != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, id);
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
            if (moneyTransferId != null)
            {
                codedoutputbytebuffernano.writeString(1, moneyTransferId);
            }
            if (id != null)
            {
                codedoutputbytebuffernano.writeString(2, id);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public RejectMoneyRequest()
        {
            clear();
        }
    }

    public static final class RejectMoneyResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;

        private RejectMoneyResponse clear()
        {
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private RejectMoneyResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                codedoutputbytebuffernano.writeMessage(2, callError);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public RejectMoneyResponse()
        {
            clear();
        }
    }

    public static final class RequestMoneyRequest extends ExtendableMessageNano
    {

        public String batchReplayId;
        public String memo;
        public MoneyRequest moneyRequest[];
        public String themeImageUrl;

        private RequestMoneyRequest clear()
        {
            memo = null;
            moneyRequest = MoneyRequest.emptyArray();
            batchReplayId = null;
            themeImageUrl = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private RequestMoneyRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    memo = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                    MoneyRequest amoneyrequest[];
                    int j;
                    if (moneyRequest == null)
                    {
                        j = 0;
                    } else
                    {
                        j = moneyRequest.length;
                    }
                    amoneyrequest = new MoneyRequest[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(moneyRequest, 0, amoneyrequest, 0, j);
                        k = j;
                    }
                    for (; k < amoneyrequest.length - 1; k++)
                    {
                        amoneyrequest[k] = new MoneyRequest();
                        codedinputbytebuffernano.readMessage(amoneyrequest[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    amoneyrequest[k] = new MoneyRequest();
                    codedinputbytebuffernano.readMessage(amoneyrequest[k]);
                    moneyRequest = amoneyrequest;
                    break;

                case 26: // '\032'
                    batchReplayId = codedinputbytebuffernano.readString();
                    break;

                case 34: // '"'
                    themeImageUrl = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (memo != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, memo);
            }
            j = i;
            if (moneyRequest != null)
            {
                j = i;
                if (moneyRequest.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= moneyRequest.length)
                        {
                            break;
                        }
                        MoneyRequest moneyrequest = moneyRequest[k];
                        j = i;
                        if (moneyrequest != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(2, moneyrequest);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (batchReplayId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, batchReplayId);
            }
            j = i;
            if (themeImageUrl != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, themeImageUrl);
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
            if (memo != null)
            {
                codedoutputbytebuffernano.writeString(1, memo);
            }
            if (moneyRequest != null && moneyRequest.length > 0)
            {
                for (int i = 0; i < moneyRequest.length; i++)
                {
                    MoneyRequest moneyrequest = moneyRequest[i];
                    if (moneyrequest != null)
                    {
                        codedoutputbytebuffernano.writeMessage(2, moneyrequest);
                    }
                }

            }
            if (batchReplayId != null)
            {
                codedoutputbytebuffernano.writeString(3, batchReplayId);
            }
            if (themeImageUrl != null)
            {
                codedoutputbytebuffernano.writeString(4, themeImageUrl);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public RequestMoneyRequest()
        {
            clear();
        }
    }

    public static final class RequestMoneyResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public RequesteeError requesteeError[];

        private RequestMoneyResponse clear()
        {
            callError = null;
            requesteeError = RequesteeError.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private RequestMoneyResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

                case 18: // '\022'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                    RequesteeError arequesteeerror[];
                    int j;
                    if (requesteeError == null)
                    {
                        j = 0;
                    } else
                    {
                        j = requesteeError.length;
                    }
                    arequesteeerror = new RequesteeError[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(requesteeError, 0, arequesteeerror, 0, j);
                        k = j;
                    }
                    for (; k < arequesteeerror.length - 1; k++)
                    {
                        arequesteeerror[k] = new RequesteeError();
                        codedinputbytebuffernano.readMessage(arequesteeerror[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    arequesteeerror[k] = new RequesteeError();
                    codedinputbytebuffernano.readMessage(arequesteeerror[k]);
                    requesteeError = arequesteeerror;
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
            int l = i;
            if (requesteeError != null)
            {
                l = i;
                if (requesteeError.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= requesteeError.length)
                        {
                            break;
                        }
                        RequesteeError requesteeerror = requesteeError[k];
                        l = i;
                        if (requesteeerror != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(2, requesteeerror);
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
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(1, callError);
            }
            if (requesteeError != null && requesteeError.length > 0)
            {
                for (int i = 0; i < requesteeError.length; i++)
                {
                    RequesteeError requesteeerror = requesteeError[i];
                    if (requesteeerror != null)
                    {
                        codedoutputbytebuffernano.writeMessage(2, requesteeerror);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public RequestMoneyResponse()
        {
            clear();
        }
    }

    public static final class RequesteeError extends ExtendableMessageNano
    {

        private static volatile RequesteeError _emptyArray[];
        public com.google.wallet.proto.NanoWalletEntities.AccountIdentifier accountIdentifier;
        public com.google.wallet.proto.NanoWalletError.CallError callError;

        private RequesteeError clear()
        {
            accountIdentifier = null;
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static RequesteeError[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new RequesteeError[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private RequesteeError mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (accountIdentifier == null)
                    {
                        accountIdentifier = new com.google.wallet.proto.NanoWalletEntities.AccountIdentifier();
                    }
                    codedinputbytebuffernano.readMessage(accountIdentifier);
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
            if (accountIdentifier != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, accountIdentifier);
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
            if (accountIdentifier != null)
            {
                codedoutputbytebuffernano.writeMessage(1, accountIdentifier);
            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(2, callError);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public RequesteeError()
        {
            clear();
        }
    }

    public static final class SendMoneyRequest extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletEntities.AccountIdentifier accountIdentifier;
        public com.google.wallet.proto.NanoWalletEntities.MoneyProto amount;
        public com.google.wallet.proto.NanoWalletEntities.MoneyProto fees;
        public com.google.wallet.proto.NanoWalletEntities.CdpIdData fundingInstrumentId;
        public String id;
        public String memo;
        public String moneyRequestId;
        public String recipientEmail;
        public String transferId;

        private SendMoneyRequest clear()
        {
            recipientEmail = null;
            fundingInstrumentId = null;
            amount = null;
            memo = null;
            transferId = null;
            fees = null;
            accountIdentifier = null;
            moneyRequestId = null;
            id = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private SendMoneyRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    recipientEmail = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    if (fundingInstrumentId == null)
                    {
                        fundingInstrumentId = new com.google.wallet.proto.NanoWalletEntities.CdpIdData();
                    }
                    codedinputbytebuffernano.readMessage(fundingInstrumentId);
                    break;

                case 26: // '\032'
                    if (amount == null)
                    {
                        amount = new com.google.wallet.proto.NanoWalletEntities.MoneyProto();
                    }
                    codedinputbytebuffernano.readMessage(amount);
                    break;

                case 34: // '"'
                    memo = codedinputbytebuffernano.readString();
                    break;

                case 42: // '*'
                    transferId = codedinputbytebuffernano.readString();
                    break;

                case 50: // '2'
                    if (fees == null)
                    {
                        fees = new com.google.wallet.proto.NanoWalletEntities.MoneyProto();
                    }
                    codedinputbytebuffernano.readMessage(fees);
                    break;

                case 58: // ':'
                    if (accountIdentifier == null)
                    {
                        accountIdentifier = new com.google.wallet.proto.NanoWalletEntities.AccountIdentifier();
                    }
                    codedinputbytebuffernano.readMessage(accountIdentifier);
                    break;

                case 66: // 'B'
                    moneyRequestId = codedinputbytebuffernano.readString();
                    break;

                case 74: // 'J'
                    id = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (recipientEmail != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, recipientEmail);
            }
            j = i;
            if (fundingInstrumentId != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, fundingInstrumentId);
            }
            i = j;
            if (amount != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, amount);
            }
            j = i;
            if (memo != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, memo);
            }
            i = j;
            if (transferId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, transferId);
            }
            j = i;
            if (fees != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(6, fees);
            }
            i = j;
            if (accountIdentifier != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(7, accountIdentifier);
            }
            j = i;
            if (moneyRequestId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(8, moneyRequestId);
            }
            i = j;
            if (id != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(9, id);
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
            if (recipientEmail != null)
            {
                codedoutputbytebuffernano.writeString(1, recipientEmail);
            }
            if (fundingInstrumentId != null)
            {
                codedoutputbytebuffernano.writeMessage(2, fundingInstrumentId);
            }
            if (amount != null)
            {
                codedoutputbytebuffernano.writeMessage(3, amount);
            }
            if (memo != null)
            {
                codedoutputbytebuffernano.writeString(4, memo);
            }
            if (transferId != null)
            {
                codedoutputbytebuffernano.writeString(5, transferId);
            }
            if (fees != null)
            {
                codedoutputbytebuffernano.writeMessage(6, fees);
            }
            if (accountIdentifier != null)
            {
                codedoutputbytebuffernano.writeMessage(7, accountIdentifier);
            }
            if (moneyRequestId != null)
            {
                codedoutputbytebuffernano.writeString(8, moneyRequestId);
            }
            if (id != null)
            {
                codedoutputbytebuffernano.writeString(9, id);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SendMoneyRequest()
        {
            clear();
        }
    }

    public static final class SendMoneyResponse extends ExtendableMessageNano
    {

        public FundsTransferAmountMismatch amountMismatch;
        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public String transferIdempotencyId;
        public String transferReceiptId;

        private SendMoneyResponse clear()
        {
            callError = null;
            transferIdempotencyId = null;
            amountMismatch = null;
            transferReceiptId = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private SendMoneyResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    transferIdempotencyId = codedinputbytebuffernano.readString();
                    break;

                case 42: // '*'
                    if (amountMismatch == null)
                    {
                        amountMismatch = new FundsTransferAmountMismatch();
                    }
                    codedinputbytebuffernano.readMessage(amountMismatch);
                    break;

                case 50: // '2'
                    transferReceiptId = codedinputbytebuffernano.readString();
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
            if (transferIdempotencyId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(3, transferIdempotencyId);
            }
            i = j;
            if (amountMismatch != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, amountMismatch);
            }
            j = i;
            if (transferReceiptId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, transferReceiptId);
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
            if (transferIdempotencyId != null)
            {
                codedoutputbytebuffernano.writeString(3, transferIdempotencyId);
            }
            if (amountMismatch != null)
            {
                codedoutputbytebuffernano.writeMessage(5, amountMismatch);
            }
            if (transferReceiptId != null)
            {
                codedoutputbytebuffernano.writeString(6, transferReceiptId);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SendMoneyResponse()
        {
            clear();
        }
    }

    public static final class SendReminderRequest extends ExtendableMessageNano
    {

        public String id;
        public String moneyRequestId;

        private SendReminderRequest clear()
        {
            moneyRequestId = null;
            id = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private SendReminderRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    id = codedinputbytebuffernano.readString();
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
            if (id != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, id);
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
            if (moneyRequestId != null)
            {
                codedoutputbytebuffernano.writeString(1, moneyRequestId);
            }
            if (id != null)
            {
                codedoutputbytebuffernano.writeString(2, id);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SendReminderRequest()
        {
            clear();
        }
    }

    public static final class SendReminderResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;

        private SendReminderResponse clear()
        {
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private SendReminderResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public SendReminderResponse()
        {
            clear();
        }
    }

    public static final class UserChallenge extends ExtendableMessageNano
    {

        private static volatile UserChallenge _emptyArray[];
        public Integer challenge;

        private UserChallenge clear()
        {
            challenge = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static UserChallenge[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new UserChallenge[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private UserChallenge mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L4:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 2: default 32
        //                       0: 41
        //                       8: 43;
               goto _L1 _L2 _L3
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L4; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                challenge = Integer.valueOf(j);
                break;
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (challenge != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, challenge.intValue());
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
            if (challenge != null)
            {
                codedoutputbytebuffernano.writeInt32(1, challenge.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public UserChallenge()
        {
            clear();
        }
    }

    public static final class WithdrawFundsRequest extends ExtendableMessageNano
    {

        public String destinationInstrumentSubId;
        public com.google.wallet.proto.NanoWalletEntities.MoneyProto fees;
        public Boolean pinChallengeSupported;
        public com.google.wallet.proto.NanoWalletEntities.MoneyProto withdrawalAmount;
        public String withdrawalId;

        private WithdrawFundsRequest clear()
        {
            destinationInstrumentSubId = null;
            withdrawalAmount = null;
            withdrawalId = null;
            fees = null;
            pinChallengeSupported = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private WithdrawFundsRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    destinationInstrumentSubId = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    if (withdrawalAmount == null)
                    {
                        withdrawalAmount = new com.google.wallet.proto.NanoWalletEntities.MoneyProto();
                    }
                    codedinputbytebuffernano.readMessage(withdrawalAmount);
                    break;

                case 26: // '\032'
                    withdrawalId = codedinputbytebuffernano.readString();
                    break;

                case 34: // '"'
                    if (fees == null)
                    {
                        fees = new com.google.wallet.proto.NanoWalletEntities.MoneyProto();
                    }
                    codedinputbytebuffernano.readMessage(fees);
                    break;

                case 40: // '('
                    pinChallengeSupported = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (destinationInstrumentSubId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, destinationInstrumentSubId);
            }
            j = i;
            if (withdrawalAmount != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, withdrawalAmount);
            }
            i = j;
            if (withdrawalId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, withdrawalId);
            }
            j = i;
            if (fees != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, fees);
            }
            i = j;
            if (pinChallengeSupported != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(5, pinChallengeSupported.booleanValue());
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
            if (destinationInstrumentSubId != null)
            {
                codedoutputbytebuffernano.writeString(1, destinationInstrumentSubId);
            }
            if (withdrawalAmount != null)
            {
                codedoutputbytebuffernano.writeMessage(2, withdrawalAmount);
            }
            if (withdrawalId != null)
            {
                codedoutputbytebuffernano.writeString(3, withdrawalId);
            }
            if (fees != null)
            {
                codedoutputbytebuffernano.writeMessage(4, fees);
            }
            if (pinChallengeSupported != null)
            {
                codedoutputbytebuffernano.writeBool(5, pinChallengeSupported.booleanValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public WithdrawFundsRequest()
        {
            clear();
        }
    }

    public static final class WithdrawFundsResponse extends ExtendableMessageNano
    {

        public FundsTransferAmountMismatch amountMismatch;
        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public String withdrawalIdempotencyId;
        public String withdrawalReceiptId;

        private WithdrawFundsResponse clear()
        {
            callError = null;
            withdrawalIdempotencyId = null;
            amountMismatch = null;
            withdrawalReceiptId = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private WithdrawFundsResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

                case 18: // '\022'
                    withdrawalIdempotencyId = codedinputbytebuffernano.readString();
                    break;

                case 50: // '2'
                    if (amountMismatch == null)
                    {
                        amountMismatch = new FundsTransferAmountMismatch();
                    }
                    codedinputbytebuffernano.readMessage(amountMismatch);
                    break;

                case 58: // ':'
                    withdrawalReceiptId = codedinputbytebuffernano.readString();
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
            j = i;
            if (withdrawalIdempotencyId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, withdrawalIdempotencyId);
            }
            i = j;
            if (amountMismatch != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(6, amountMismatch);
            }
            j = i;
            if (withdrawalReceiptId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(7, withdrawalReceiptId);
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
                codedoutputbytebuffernano.writeMessage(1, callError);
            }
            if (withdrawalIdempotencyId != null)
            {
                codedoutputbytebuffernano.writeString(2, withdrawalIdempotencyId);
            }
            if (amountMismatch != null)
            {
                codedoutputbytebuffernano.writeMessage(6, amountMismatch);
            }
            if (withdrawalReceiptId != null)
            {
                codedoutputbytebuffernano.writeString(7, withdrawalReceiptId);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public WithdrawFundsResponse()
        {
            clear();
        }
    }

}
