// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

public interface NanoWalletKyc
{
    public static final class AcceptKycTosRequest extends ExtendableMessageNano
    {

        public String acceptedTosId[];

        private AcceptKycTosRequest clear()
        {
            acceptedTosId = WireFormatNano.EMPTY_STRING_ARRAY;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private AcceptKycTosRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                    String as[];
                    int j;
                    if (acceptedTosId == null)
                    {
                        j = 0;
                    } else
                    {
                        j = acceptedTosId.length;
                    }
                    as = new String[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(acceptedTosId, 0, as, 0, j);
                        k = j;
                    }
                    for (; k < as.length - 1; k++)
                    {
                        as[k] = codedinputbytebuffernano.readString();
                        codedinputbytebuffernano.readTag();
                    }

                    as[k] = codedinputbytebuffernano.readString();
                    acceptedTosId = as;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j1 = super.computeSerializedSize();
            int i = j1;
            if (acceptedTosId != null)
            {
                i = j1;
                if (acceptedTosId.length > 0)
                {
                    int l = 0;
                    int j = 0;
                    for (i = 0; i < acceptedTosId.length;)
                    {
                        String s = acceptedTosId[i];
                        int i1 = l;
                        int k = j;
                        if (s != null)
                        {
                            i1 = l + 1;
                            k = j + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                        }
                        i++;
                        l = i1;
                        j = k;
                    }

                    i = j1 + j + l * 1;
                }
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
            if (acceptedTosId != null && acceptedTosId.length > 0)
            {
                for (int i = 0; i < acceptedTosId.length; i++)
                {
                    String s = acceptedTosId[i];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(1, s);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public AcceptKycTosRequest()
        {
            clear();
        }
    }

    public static final class AcceptKycTosResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;

        private AcceptKycTosResponse clear()
        {
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private AcceptKycTosResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public AcceptKycTosResponse()
        {
            clear();
        }
    }

    public static final class GetKycDataRequest extends ExtendableMessageNano
    {

        private GetKycDataRequest clear()
        {
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetKycDataRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public GetKycDataRequest()
        {
            clear();
        }
    }

    public static final class GetKycDataResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletEntities.Address address;
        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument esignLegalDocument;
        public Integer experiment;
        public String firstName;
        public com.google.wallet.proto.NanoWalletAnalytics.GoogleAnalyticsCustomDimension gaCustomDimensions[];
        public String lastName;
        public String regionCode;
        public com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument walletLegalDocument;

        private GetKycDataResponse clear()
        {
            firstName = null;
            lastName = null;
            address = null;
            walletLegalDocument = null;
            esignLegalDocument = null;
            callError = null;
            regionCode = null;
            experiment = null;
            gaCustomDimensions = com.google.wallet.proto.NanoWalletAnalytics.GoogleAnalyticsCustomDimension.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetKycDataResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L12:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 10: default 96
        //                       0: 105
        //                       10: 107
        //                       18: 118
        //                       26: 129
        //                       34: 158
        //                       42: 187
        //                       50: 216
        //                       58: 245
        //                       64: 256
        //                       74: 306;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L12; else goto _L2
_L2:
            return this;
_L3:
            firstName = codedinputbytebuffernano.readString();
              goto _L12
_L4:
            lastName = codedinputbytebuffernano.readString();
              goto _L12
_L5:
            if (address == null)
            {
                address = new com.google.wallet.proto.NanoWalletEntities.Address();
            }
            codedinputbytebuffernano.readMessage(address);
              goto _L12
_L6:
            if (walletLegalDocument == null)
            {
                walletLegalDocument = new com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument();
            }
            codedinputbytebuffernano.readMessage(walletLegalDocument);
              goto _L12
_L7:
            if (esignLegalDocument == null)
            {
                esignLegalDocument = new com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument();
            }
            codedinputbytebuffernano.readMessage(esignLegalDocument);
              goto _L12
_L8:
            if (callError == null)
            {
                callError = new com.google.wallet.proto.NanoWalletError.CallError();
            }
            codedinputbytebuffernano.readMessage(callError);
              goto _L12
_L9:
            regionCode = codedinputbytebuffernano.readString();
              goto _L12
_L10:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                experiment = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L11:
            int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 74);
            com.google.wallet.proto.NanoWalletAnalytics.GoogleAnalyticsCustomDimension agoogleanalyticscustomdimension[];
            int k;
            if (gaCustomDimensions == null)
            {
                k = 0;
            } else
            {
                k = gaCustomDimensions.length;
            }
            agoogleanalyticscustomdimension = new com.google.wallet.proto.NanoWalletAnalytics.GoogleAnalyticsCustomDimension[k + l];
            l = k;
            if (k != 0)
            {
                System.arraycopy(gaCustomDimensions, 0, agoogleanalyticscustomdimension, 0, k);
                l = k;
            }
            for (; l < agoogleanalyticscustomdimension.length - 1; l++)
            {
                agoogleanalyticscustomdimension[l] = new com.google.wallet.proto.NanoWalletAnalytics.GoogleAnalyticsCustomDimension();
                codedinputbytebuffernano.readMessage(agoogleanalyticscustomdimension[l]);
                codedinputbytebuffernano.readTag();
            }

            agoogleanalyticscustomdimension[l] = new com.google.wallet.proto.NanoWalletAnalytics.GoogleAnalyticsCustomDimension();
            codedinputbytebuffernano.readMessage(agoogleanalyticscustomdimension[l]);
            gaCustomDimensions = agoogleanalyticscustomdimension;
            if (true) goto _L12; else goto _L13
_L13:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (firstName != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, firstName);
            }
            j = i;
            if (lastName != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, lastName);
            }
            i = j;
            if (address != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, address);
            }
            j = i;
            if (walletLegalDocument != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, walletLegalDocument);
            }
            i = j;
            if (esignLegalDocument != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, esignLegalDocument);
            }
            j = i;
            if (callError != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(6, callError);
            }
            int l = j;
            if (regionCode != null)
            {
                l = j + CodedOutputByteBufferNano.computeStringSize(7, regionCode);
            }
            i = l;
            if (experiment != null)
            {
                i = l + CodedOutputByteBufferNano.computeInt32Size(8, experiment.intValue());
            }
            l = i;
            if (gaCustomDimensions != null)
            {
                l = i;
                if (gaCustomDimensions.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= gaCustomDimensions.length)
                        {
                            break;
                        }
                        com.google.wallet.proto.NanoWalletAnalytics.GoogleAnalyticsCustomDimension googleanalyticscustomdimension = gaCustomDimensions[k];
                        l = i;
                        if (googleanalyticscustomdimension != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(9, googleanalyticscustomdimension);
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
            if (firstName != null)
            {
                codedoutputbytebuffernano.writeString(1, firstName);
            }
            if (lastName != null)
            {
                codedoutputbytebuffernano.writeString(2, lastName);
            }
            if (address != null)
            {
                codedoutputbytebuffernano.writeMessage(3, address);
            }
            if (walletLegalDocument != null)
            {
                codedoutputbytebuffernano.writeMessage(4, walletLegalDocument);
            }
            if (esignLegalDocument != null)
            {
                codedoutputbytebuffernano.writeMessage(5, esignLegalDocument);
            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(6, callError);
            }
            if (regionCode != null)
            {
                codedoutputbytebuffernano.writeString(7, regionCode);
            }
            if (experiment != null)
            {
                codedoutputbytebuffernano.writeInt32(8, experiment.intValue());
            }
            if (gaCustomDimensions != null && gaCustomDimensions.length > 0)
            {
                for (int i = 0; i < gaCustomDimensions.length; i++)
                {
                    com.google.wallet.proto.NanoWalletAnalytics.GoogleAnalyticsCustomDimension googleanalyticscustomdimension = gaCustomDimensions[i];
                    if (googleanalyticscustomdimension != null)
                    {
                        codedoutputbytebuffernano.writeMessage(9, googleanalyticscustomdimension);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GetKycDataResponse()
        {
            clear();
        }
    }

    public static final class GetKycStatusRequest extends ExtendableMessageNano
    {

        private GetKycStatusRequest clear()
        {
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetKycStatusRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public GetKycStatusRequest()
        {
            clear();
        }
    }

    public static final class GetKycStatusResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public com.google.wallet.proto.NanoWalletEntities.KycStatus kycStatus;

        private GetKycStatusResponse clear()
        {
            kycStatus = null;
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetKycStatusResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (kycStatus == null)
                    {
                        kycStatus = new com.google.wallet.proto.NanoWalletEntities.KycStatus();
                    }
                    codedinputbytebuffernano.readMessage(kycStatus);
                    break;

                case 34: // '"'
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
            if (kycStatus != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, kycStatus);
            }
            j = i;
            if (callError != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, callError);
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
            if (kycStatus != null)
            {
                codedoutputbytebuffernano.writeMessage(1, kycStatus);
            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(4, callError);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GetKycStatusResponse()
        {
            clear();
        }
    }

    public static final class SubmitAnswersRequest extends ExtendableMessageNano
    {

        public Integer country;
        public com.google.wallet.proto.features.ReferralAnswer referralAnswer[];
        public String source;

        private SubmitAnswersRequest clear()
        {
            referralAnswer = com.google.wallet.proto.features.ReferralAnswer.emptyArray();
            source = null;
            country = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private SubmitAnswersRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L6:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 57
        //                       10: 59
        //                       18: 183
        //                       24: 194;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
            int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
            com.google.wallet.proto.features.ReferralAnswer areferralanswer[];
            int j;
            if (referralAnswer == null)
            {
                j = 0;
            } else
            {
                j = referralAnswer.length;
            }
            areferralanswer = new com.google.wallet.proto.features.ReferralAnswer[j + l];
            l = j;
            if (j != 0)
            {
                System.arraycopy(referralAnswer, 0, areferralanswer, 0, j);
                l = j;
            }
            for (; l < areferralanswer.length - 1; l++)
            {
                areferralanswer[l] = new com.google.wallet.proto.features.ReferralAnswer();
                codedinputbytebuffernano.readMessage(areferralanswer[l]);
                codedinputbytebuffernano.readTag();
            }

            areferralanswer[l] = new com.google.wallet.proto.features.ReferralAnswer();
            codedinputbytebuffernano.readMessage(areferralanswer[l]);
            referralAnswer = areferralanswer;
              goto _L6
_L4:
            source = codedinputbytebuffernano.readString();
              goto _L6
_L5:
            int k = codedinputbytebuffernano.readInt32();
            switch (k)
            {
            case 1: // '\001'
            case 2: // '\002'
                country = Integer.valueOf(k);
                break;
            }
            if (true) goto _L6; else goto _L7
_L7:
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (referralAnswer != null)
            {
                j = i;
                if (referralAnswer.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= referralAnswer.length)
                        {
                            break;
                        }
                        com.google.wallet.proto.features.ReferralAnswer referralanswer = referralAnswer[k];
                        j = i;
                        if (referralanswer != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(1, referralanswer);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (source != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(2, source);
            }
            j = i;
            if (country != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(3, country.intValue());
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
            if (referralAnswer != null && referralAnswer.length > 0)
            {
                for (int i = 0; i < referralAnswer.length; i++)
                {
                    com.google.wallet.proto.features.ReferralAnswer referralanswer = referralAnswer[i];
                    if (referralanswer != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, referralanswer);
                    }
                }

            }
            if (source != null)
            {
                codedoutputbytebuffernano.writeString(2, source);
            }
            if (country != null)
            {
                codedoutputbytebuffernano.writeInt32(3, country.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SubmitAnswersRequest()
        {
            clear();
        }
    }

    public static final class SubmitAnswersResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public com.google.wallet.proto.NanoWalletEntities.KycStatus kycStatus;

        private SubmitAnswersResponse clear()
        {
            kycStatus = null;
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private SubmitAnswersResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (kycStatus == null)
                    {
                        kycStatus = new com.google.wallet.proto.NanoWalletEntities.KycStatus();
                    }
                    codedinputbytebuffernano.readMessage(kycStatus);
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
            if (kycStatus != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, kycStatus);
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
            if (kycStatus != null)
            {
                codedoutputbytebuffernano.writeMessage(1, kycStatus);
            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(2, callError);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SubmitAnswersResponse()
        {
            clear();
        }
    }

    public static final class SubmitFullSsnRequest extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletShared.ClientEncryptedData fullSsn;
        public String source;

        private SubmitFullSsnRequest clear()
        {
            fullSsn = null;
            source = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private SubmitFullSsnRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (fullSsn == null)
                    {
                        fullSsn = new com.google.wallet.proto.NanoWalletShared.ClientEncryptedData();
                    }
                    codedinputbytebuffernano.readMessage(fullSsn);
                    break;

                case 18: // '\022'
                    source = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (fullSsn != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, fullSsn);
            }
            j = i;
            if (source != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, source);
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
            if (fullSsn != null)
            {
                codedoutputbytebuffernano.writeMessage(1, fullSsn);
            }
            if (source != null)
            {
                codedoutputbytebuffernano.writeString(2, source);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SubmitFullSsnRequest()
        {
            clear();
        }
    }

    public static final class SubmitFullSsnResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public com.google.wallet.proto.NanoWalletEntities.KycStatus kycStatus;

        private SubmitFullSsnResponse clear()
        {
            callError = null;
            kycStatus = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private SubmitFullSsnResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (kycStatus == null)
                    {
                        kycStatus = new com.google.wallet.proto.NanoWalletEntities.KycStatus();
                    }
                    codedinputbytebuffernano.readMessage(kycStatus);
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
            if (kycStatus != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, kycStatus);
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
            if (kycStatus != null)
            {
                codedoutputbytebuffernano.writeMessage(2, kycStatus);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SubmitFullSsnResponse()
        {
            clear();
        }
    }

    public static final class SubmitVerificationDocumentRequest extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletShared.ClientEncryptedData identityDocument;
        public String mimeType;
        public String source;
        public com.google.wallet.proto.NanoWalletShared.ClientEncryptedData ssnLastFour;

        private SubmitVerificationDocumentRequest clear()
        {
            identityDocument = null;
            mimeType = null;
            ssnLastFour = null;
            source = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private SubmitVerificationDocumentRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (identityDocument == null)
                    {
                        identityDocument = new com.google.wallet.proto.NanoWalletShared.ClientEncryptedData();
                    }
                    codedinputbytebuffernano.readMessage(identityDocument);
                    break;

                case 18: // '\022'
                    mimeType = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    if (ssnLastFour == null)
                    {
                        ssnLastFour = new com.google.wallet.proto.NanoWalletShared.ClientEncryptedData();
                    }
                    codedinputbytebuffernano.readMessage(ssnLastFour);
                    break;

                case 34: // '"'
                    source = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (identityDocument != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, identityDocument);
            }
            j = i;
            if (mimeType != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, mimeType);
            }
            i = j;
            if (ssnLastFour != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, ssnLastFour);
            }
            j = i;
            if (source != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, source);
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
            if (identityDocument != null)
            {
                codedoutputbytebuffernano.writeMessage(1, identityDocument);
            }
            if (mimeType != null)
            {
                codedoutputbytebuffernano.writeString(2, mimeType);
            }
            if (ssnLastFour != null)
            {
                codedoutputbytebuffernano.writeMessage(3, ssnLastFour);
            }
            if (source != null)
            {
                codedoutputbytebuffernano.writeString(4, source);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SubmitVerificationDocumentRequest()
        {
            clear();
        }
    }

    public static final class SubmitVerificationDocumentResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public com.google.wallet.proto.NanoWalletEntities.KycStatus kycStatus;

        private SubmitVerificationDocumentResponse clear()
        {
            callError = null;
            kycStatus = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private SubmitVerificationDocumentResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (kycStatus == null)
                    {
                        kycStatus = new com.google.wallet.proto.NanoWalletEntities.KycStatus();
                    }
                    codedinputbytebuffernano.readMessage(kycStatus);
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
            if (kycStatus != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, kycStatus);
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
            if (kycStatus != null)
            {
                codedoutputbytebuffernano.writeMessage(2, kycStatus);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SubmitVerificationDocumentResponse()
        {
            clear();
        }
    }

    public static final class VerifyIdentityRequest extends ExtendableMessageNano
    {

        public Integer country;
        public GbKycData gbKycData;
        public String source;
        public UsKycData usKycData;

        private VerifyIdentityRequest clear()
        {
            country = null;
            usKycData = null;
            gbKycData = null;
            source = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private VerifyIdentityRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L7:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 5: default 56
        //                       0: 65
        //                       8: 67
        //                       18: 106
        //                       26: 135
        //                       34: 164;
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
                country = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            if (usKycData == null)
            {
                usKycData = new UsKycData();
            }
            codedinputbytebuffernano.readMessage(usKycData);
            continue; /* Loop/switch isn't completed */
_L5:
            if (gbKycData == null)
            {
                gbKycData = new GbKycData();
            }
            codedinputbytebuffernano.readMessage(gbKycData);
            continue; /* Loop/switch isn't completed */
_L6:
            source = codedinputbytebuffernano.readString();
            if (true) goto _L7; else goto _L8
_L8:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (country != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, country.intValue());
            }
            j = i;
            if (usKycData != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, usKycData);
            }
            i = j;
            if (gbKycData != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, gbKycData);
            }
            j = i;
            if (source != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, source);
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
            if (country != null)
            {
                codedoutputbytebuffernano.writeInt32(1, country.intValue());
            }
            if (usKycData != null)
            {
                codedoutputbytebuffernano.writeMessage(2, usKycData);
            }
            if (gbKycData != null)
            {
                codedoutputbytebuffernano.writeMessage(3, gbKycData);
            }
            if (source != null)
            {
                codedoutputbytebuffernano.writeString(4, source);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public VerifyIdentityRequest()
        {
            clear();
        }
    }

    public static final class VerifyIdentityRequest.GbKycData extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletEntities.Address address;
        public com.google.wallet.proto.features.DateOfBirth dateOfBirth;
        public String firstName;
        public Integer kycStep;
        public String lastName;

        private VerifyIdentityRequest.GbKycData clear()
        {
            firstName = null;
            lastName = null;
            address = null;
            dateOfBirth = null;
            kycStep = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private VerifyIdentityRequest.GbKycData mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L8:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 6: default 64
        //                       0: 73
        //                       10: 75
        //                       18: 86
        //                       26: 97
        //                       34: 126
        //                       40: 155;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
_L2:
            return this;
_L3:
            firstName = codedinputbytebuffernano.readString();
              goto _L8
_L4:
            lastName = codedinputbytebuffernano.readString();
              goto _L8
_L5:
            if (address == null)
            {
                address = new com.google.wallet.proto.NanoWalletEntities.Address();
            }
            codedinputbytebuffernano.readMessage(address);
              goto _L8
_L6:
            if (dateOfBirth == null)
            {
                dateOfBirth = new com.google.wallet.proto.features.DateOfBirth();
            }
            codedinputbytebuffernano.readMessage(dateOfBirth);
              goto _L8
_L7:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
                kycStep = Integer.valueOf(j);
                break;
            }
            if (true) goto _L8; else goto _L9
_L9:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (firstName != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, firstName);
            }
            j = i;
            if (lastName != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, lastName);
            }
            i = j;
            if (address != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, address);
            }
            j = i;
            if (dateOfBirth != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, dateOfBirth);
            }
            i = j;
            if (kycStep != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(5, kycStep.intValue());
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
            if (firstName != null)
            {
                codedoutputbytebuffernano.writeString(1, firstName);
            }
            if (lastName != null)
            {
                codedoutputbytebuffernano.writeString(2, lastName);
            }
            if (address != null)
            {
                codedoutputbytebuffernano.writeMessage(3, address);
            }
            if (dateOfBirth != null)
            {
                codedoutputbytebuffernano.writeMessage(4, dateOfBirth);
            }
            if (kycStep != null)
            {
                codedoutputbytebuffernano.writeInt32(5, kycStep.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public VerifyIdentityRequest.GbKycData()
        {
            clear();
        }
    }

    public static final class VerifyIdentityRequest.UsKycData extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletEntities.Address address;
        public com.google.wallet.proto.features.DateOfBirth dateOfBirth;
        public String firstName;
        public com.google.wallet.proto.NanoWalletShared.ClientEncryptedData fullSsn;
        public Integer kycStep;
        public com.google.wallet.proto.NanoWalletShared.ClientEncryptedData lastFourSsn;
        public String lastName;

        private VerifyIdentityRequest.UsKycData clear()
        {
            firstName = null;
            lastName = null;
            address = null;
            dateOfBirth = null;
            kycStep = null;
            lastFourSsn = null;
            fullSsn = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private VerifyIdentityRequest.UsKycData mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L10:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 8: default 80
        //                       0: 89
        //                       10: 91
        //                       18: 102
        //                       26: 113
        //                       34: 142
        //                       40: 171
        //                       50: 214
        //                       58: 243;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L10; else goto _L2
_L2:
            return this;
_L3:
            firstName = codedinputbytebuffernano.readString();
              goto _L10
_L4:
            lastName = codedinputbytebuffernano.readString();
              goto _L10
_L5:
            if (address == null)
            {
                address = new com.google.wallet.proto.NanoWalletEntities.Address();
            }
            codedinputbytebuffernano.readMessage(address);
              goto _L10
_L6:
            if (dateOfBirth == null)
            {
                dateOfBirth = new com.google.wallet.proto.features.DateOfBirth();
            }
            codedinputbytebuffernano.readMessage(dateOfBirth);
              goto _L10
_L7:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
                kycStep = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L8:
            if (lastFourSsn == null)
            {
                lastFourSsn = new com.google.wallet.proto.NanoWalletShared.ClientEncryptedData();
            }
            codedinputbytebuffernano.readMessage(lastFourSsn);
            continue; /* Loop/switch isn't completed */
_L9:
            if (fullSsn == null)
            {
                fullSsn = new com.google.wallet.proto.NanoWalletShared.ClientEncryptedData();
            }
            codedinputbytebuffernano.readMessage(fullSsn);
            if (true) goto _L10; else goto _L11
_L11:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (firstName != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, firstName);
            }
            j = i;
            if (lastName != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, lastName);
            }
            i = j;
            if (address != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, address);
            }
            j = i;
            if (dateOfBirth != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, dateOfBirth);
            }
            i = j;
            if (kycStep != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(5, kycStep.intValue());
            }
            j = i;
            if (lastFourSsn != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(6, lastFourSsn);
            }
            i = j;
            if (fullSsn != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(7, fullSsn);
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
            if (firstName != null)
            {
                codedoutputbytebuffernano.writeString(1, firstName);
            }
            if (lastName != null)
            {
                codedoutputbytebuffernano.writeString(2, lastName);
            }
            if (address != null)
            {
                codedoutputbytebuffernano.writeMessage(3, address);
            }
            if (dateOfBirth != null)
            {
                codedoutputbytebuffernano.writeMessage(4, dateOfBirth);
            }
            if (kycStep != null)
            {
                codedoutputbytebuffernano.writeInt32(5, kycStep.intValue());
            }
            if (lastFourSsn != null)
            {
                codedoutputbytebuffernano.writeMessage(6, lastFourSsn);
            }
            if (fullSsn != null)
            {
                codedoutputbytebuffernano.writeMessage(7, fullSsn);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public VerifyIdentityRequest.UsKycData()
        {
            clear();
        }
    }

    public static final class VerifyIdentityResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public com.google.wallet.proto.NanoWalletEntities.KycStatus kycStatus;
        public com.google.wallet.proto.features.ReferralQuestion referralQuestion[];
        public Long timeToCompleteQuestionsMillis;

        private VerifyIdentityResponse clear()
        {
            kycStatus = null;
            referralQuestion = com.google.wallet.proto.features.ReferralQuestion.emptyArray();
            timeToCompleteQuestionsMillis = null;
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private VerifyIdentityResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (kycStatus == null)
                    {
                        kycStatus = new com.google.wallet.proto.NanoWalletEntities.KycStatus();
                    }
                    codedinputbytebuffernano.readMessage(kycStatus);
                    break;

                case 18: // '\022'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                    com.google.wallet.proto.features.ReferralQuestion areferralquestion[];
                    int j;
                    if (referralQuestion == null)
                    {
                        j = 0;
                    } else
                    {
                        j = referralQuestion.length;
                    }
                    areferralquestion = new com.google.wallet.proto.features.ReferralQuestion[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(referralQuestion, 0, areferralquestion, 0, j);
                        k = j;
                    }
                    for (; k < areferralquestion.length - 1; k++)
                    {
                        areferralquestion[k] = new com.google.wallet.proto.features.ReferralQuestion();
                        codedinputbytebuffernano.readMessage(areferralquestion[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    areferralquestion[k] = new com.google.wallet.proto.features.ReferralQuestion();
                    codedinputbytebuffernano.readMessage(areferralquestion[k]);
                    referralQuestion = areferralquestion;
                    break;

                case 24: // '\030'
                    timeToCompleteQuestionsMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 34: // '"'
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
            if (kycStatus != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, kycStatus);
            }
            j = i;
            if (referralQuestion != null)
            {
                j = i;
                if (referralQuestion.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= referralQuestion.length)
                        {
                            break;
                        }
                        com.google.wallet.proto.features.ReferralQuestion referralquestion = referralQuestion[k];
                        j = i;
                        if (referralquestion != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(2, referralquestion);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (timeToCompleteQuestionsMillis != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(3, timeToCompleteQuestionsMillis.longValue());
            }
            j = i;
            if (callError != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, callError);
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
            if (kycStatus != null)
            {
                codedoutputbytebuffernano.writeMessage(1, kycStatus);
            }
            if (referralQuestion != null && referralQuestion.length > 0)
            {
                for (int i = 0; i < referralQuestion.length; i++)
                {
                    com.google.wallet.proto.features.ReferralQuestion referralquestion = referralQuestion[i];
                    if (referralquestion != null)
                    {
                        codedoutputbytebuffernano.writeMessage(2, referralquestion);
                    }
                }

            }
            if (timeToCompleteQuestionsMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(3, timeToCompleteQuestionsMillis.longValue());
            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(4, callError);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public VerifyIdentityResponse()
        {
            clear();
        }
    }

}
