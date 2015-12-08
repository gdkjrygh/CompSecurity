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

public interface NanoWalletSetup
{
    public static final class AcceptTosRequest extends ExtendableMessageNano
    {

        public String acceptedTosId;

        private AcceptTosRequest clear()
        {
            acceptedTosId = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private AcceptTosRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    acceptedTosId = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (acceptedTosId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, acceptedTosId);
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
            if (acceptedTosId != null)
            {
                codedoutputbytebuffernano.writeString(1, acceptedTosId);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public AcceptTosRequest()
        {
            clear();
        }
    }

    public static final class AcceptTosResponse extends ExtendableMessageNano
    {

        public String acceptedTosId;

        private AcceptTosResponse clear()
        {
            acceptedTosId = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private AcceptTosResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    acceptedTosId = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (acceptedTosId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, acceptedTosId);
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
            if (acceptedTosId != null)
            {
                codedoutputbytebuffernano.writeString(1, acceptedTosId);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public AcceptTosResponse()
        {
            clear();
        }
    }

    public static final class GetSetupConfigurationRequest extends ExtendableMessageNano
    {

        private GetSetupConfigurationRequest clear()
        {
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetSetupConfigurationRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public GetSetupConfigurationRequest()
        {
            clear();
        }
    }

    public static final class GetSetupConfigurationResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletEntities.BrokerAndRelationships brokerAndRelationships[];
        public com.google.wallet.proto.NanoWalletEntities.LegalDocsForCountry legalDocsForCountries[];
        public String supportedCountries[];

        private GetSetupConfigurationResponse clear()
        {
            supportedCountries = WireFormatNano.EMPTY_STRING_ARRAY;
            brokerAndRelationships = com.google.wallet.proto.NanoWalletEntities.BrokerAndRelationships.emptyArray();
            legalDocsForCountries = com.google.wallet.proto.NanoWalletEntities.LegalDocsForCountry.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetSetupConfigurationResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                    String as[];
                    int j;
                    if (supportedCountries == null)
                    {
                        j = 0;
                    } else
                    {
                        j = supportedCountries.length;
                    }
                    as = new String[j + i1];
                    i1 = j;
                    if (j != 0)
                    {
                        System.arraycopy(supportedCountries, 0, as, 0, j);
                        i1 = j;
                    }
                    for (; i1 < as.length - 1; i1++)
                    {
                        as[i1] = codedinputbytebuffernano.readString();
                        codedinputbytebuffernano.readTag();
                    }

                    as[i1] = codedinputbytebuffernano.readString();
                    supportedCountries = as;
                    break;

                case 18: // '\022'
                    int j1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                    com.google.wallet.proto.NanoWalletEntities.BrokerAndRelationships abrokerandrelationships[];
                    int k;
                    if (brokerAndRelationships == null)
                    {
                        k = 0;
                    } else
                    {
                        k = brokerAndRelationships.length;
                    }
                    abrokerandrelationships = new com.google.wallet.proto.NanoWalletEntities.BrokerAndRelationships[k + j1];
                    j1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(brokerAndRelationships, 0, abrokerandrelationships, 0, k);
                        j1 = k;
                    }
                    for (; j1 < abrokerandrelationships.length - 1; j1++)
                    {
                        abrokerandrelationships[j1] = new com.google.wallet.proto.NanoWalletEntities.BrokerAndRelationships();
                        codedinputbytebuffernano.readMessage(abrokerandrelationships[j1]);
                        codedinputbytebuffernano.readTag();
                    }

                    abrokerandrelationships[j1] = new com.google.wallet.proto.NanoWalletEntities.BrokerAndRelationships();
                    codedinputbytebuffernano.readMessage(abrokerandrelationships[j1]);
                    brokerAndRelationships = abrokerandrelationships;
                    break;

                case 26: // '\032'
                    int k1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    com.google.wallet.proto.NanoWalletEntities.LegalDocsForCountry alegaldocsforcountry[];
                    int l;
                    if (legalDocsForCountries == null)
                    {
                        l = 0;
                    } else
                    {
                        l = legalDocsForCountries.length;
                    }
                    alegaldocsforcountry = new com.google.wallet.proto.NanoWalletEntities.LegalDocsForCountry[l + k1];
                    k1 = l;
                    if (l != 0)
                    {
                        System.arraycopy(legalDocsForCountries, 0, alegaldocsforcountry, 0, l);
                        k1 = l;
                    }
                    for (; k1 < alegaldocsforcountry.length - 1; k1++)
                    {
                        alegaldocsforcountry[k1] = new com.google.wallet.proto.NanoWalletEntities.LegalDocsForCountry();
                        codedinputbytebuffernano.readMessage(alegaldocsforcountry[k1]);
                        codedinputbytebuffernano.readTag();
                    }

                    alegaldocsforcountry[k1] = new com.google.wallet.proto.NanoWalletEntities.LegalDocsForCountry();
                    codedinputbytebuffernano.readMessage(alegaldocsforcountry[k1]);
                    legalDocsForCountries = alegaldocsforcountry;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j2 = super.computeSerializedSize();
            int k = j2;
            if (supportedCountries != null)
            {
                k = j2;
                if (supportedCountries.length > 0)
                {
                    int l1 = 0;
                    k = 0;
                    for (int i = 0; i < supportedCountries.length;)
                    {
                        String s = supportedCountries[i];
                        int i2 = l1;
                        int i1 = k;
                        if (s != null)
                        {
                            i2 = l1 + 1;
                            i1 = k + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                        }
                        i++;
                        l1 = i2;
                        k = i1;
                    }

                    k = j2 + k + l1 * 1;
                }
            }
            int j = k;
            if (brokerAndRelationships != null)
            {
                j = k;
                if (brokerAndRelationships.length > 0)
                {
                    int j1 = 0;
                    do
                    {
                        j = k;
                        if (j1 >= brokerAndRelationships.length)
                        {
                            break;
                        }
                        com.google.wallet.proto.NanoWalletEntities.BrokerAndRelationships brokerandrelationships = brokerAndRelationships[j1];
                        j = k;
                        if (brokerandrelationships != null)
                        {
                            j = k + CodedOutputByteBufferNano.computeMessageSize(2, brokerandrelationships);
                        }
                        j1++;
                        k = j;
                    } while (true);
                }
            }
            int k1 = j;
            if (legalDocsForCountries != null)
            {
                k1 = j;
                if (legalDocsForCountries.length > 0)
                {
                    int l = 0;
                    do
                    {
                        k1 = j;
                        if (l >= legalDocsForCountries.length)
                        {
                            break;
                        }
                        com.google.wallet.proto.NanoWalletEntities.LegalDocsForCountry legaldocsforcountry = legalDocsForCountries[l];
                        k1 = j;
                        if (legaldocsforcountry != null)
                        {
                            k1 = j + CodedOutputByteBufferNano.computeMessageSize(3, legaldocsforcountry);
                        }
                        l++;
                        j = k1;
                    } while (true);
                }
            }
            return k1;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (supportedCountries != null && supportedCountries.length > 0)
            {
                for (int i = 0; i < supportedCountries.length; i++)
                {
                    String s = supportedCountries[i];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(1, s);
                    }
                }

            }
            if (brokerAndRelationships != null && brokerAndRelationships.length > 0)
            {
                for (int j = 0; j < brokerAndRelationships.length; j++)
                {
                    com.google.wallet.proto.NanoWalletEntities.BrokerAndRelationships brokerandrelationships = brokerAndRelationships[j];
                    if (brokerandrelationships != null)
                    {
                        codedoutputbytebuffernano.writeMessage(2, brokerandrelationships);
                    }
                }

            }
            if (legalDocsForCountries != null && legalDocsForCountries.length > 0)
            {
                for (int k = 0; k < legalDocsForCountries.length; k++)
                {
                    com.google.wallet.proto.NanoWalletEntities.LegalDocsForCountry legaldocsforcountry = legalDocsForCountries[k];
                    if (legaldocsforcountry != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, legaldocsforcountry);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GetSetupConfigurationResponse()
        {
            clear();
        }
    }

    public static final class LoadUserInfoRequest extends ExtendableMessageNano
    {

        private LoadUserInfoRequest clear()
        {
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private LoadUserInfoRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public LoadUserInfoRequest()
        {
            clear();
        }
    }

    public static final class LoadUserInfoResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletEntities.UserInfo userInfo;

        private LoadUserInfoResponse clear()
        {
            userInfo = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private LoadUserInfoResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (userInfo == null)
                    {
                        userInfo = new com.google.wallet.proto.NanoWalletEntities.UserInfo();
                    }
                    codedinputbytebuffernano.readMessage(userInfo);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (userInfo != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, userInfo);
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
            if (userInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(1, userInfo);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LoadUserInfoResponse()
        {
            clear();
        }
    }

    public static final class PreSetupWalletRequest extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletShared.DeviceContext deviceContext;
        public com.google.wallet.proto.NanoWalletShared.WalletContext walletContext;

        private PreSetupWalletRequest clear()
        {
            deviceContext = null;
            walletContext = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private PreSetupWalletRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (deviceContext == null)
                    {
                        deviceContext = new com.google.wallet.proto.NanoWalletShared.DeviceContext();
                    }
                    codedinputbytebuffernano.readMessage(deviceContext);
                    break;

                case 18: // '\022'
                    if (walletContext == null)
                    {
                        walletContext = new com.google.wallet.proto.NanoWalletShared.WalletContext();
                    }
                    codedinputbytebuffernano.readMessage(walletContext);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (deviceContext != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, deviceContext);
            }
            j = i;
            if (walletContext != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, walletContext);
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
            if (deviceContext != null)
            {
                codedoutputbytebuffernano.writeMessage(1, deviceContext);
            }
            if (walletContext != null)
            {
                codedoutputbytebuffernano.writeMessage(2, walletContext);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PreSetupWalletRequest()
        {
            clear();
        }
    }

    public static final class PreSetupWalletResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletEntities.ClientPreferences clientPreferences;
        public String fullName;
        public com.google.wallet.proto.NanoWalletEntities.GlobalResources globalResources;
        public Long globalResourcesFingerprint;
        public Boolean hasCdpProfile;
        public Boolean pinAuthenticationRequired;

        private PreSetupWalletResponse clear()
        {
            globalResources = null;
            globalResourcesFingerprint = null;
            pinAuthenticationRequired = null;
            hasCdpProfile = null;
            clientPreferences = null;
            fullName = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private PreSetupWalletResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (globalResources == null)
                    {
                        globalResources = new com.google.wallet.proto.NanoWalletEntities.GlobalResources();
                    }
                    codedinputbytebuffernano.readMessage(globalResources);
                    break;

                case 16: // '\020'
                    globalResourcesFingerprint = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 24: // '\030'
                    pinAuthenticationRequired = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 32: // ' '
                    hasCdpProfile = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 42: // '*'
                    if (clientPreferences == null)
                    {
                        clientPreferences = new com.google.wallet.proto.NanoWalletEntities.ClientPreferences();
                    }
                    codedinputbytebuffernano.readMessage(clientPreferences);
                    break;

                case 50: // '2'
                    fullName = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (globalResources != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, globalResources);
            }
            j = i;
            if (globalResourcesFingerprint != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(2, globalResourcesFingerprint.longValue());
            }
            i = j;
            if (pinAuthenticationRequired != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(3, pinAuthenticationRequired.booleanValue());
            }
            j = i;
            if (hasCdpProfile != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(4, hasCdpProfile.booleanValue());
            }
            i = j;
            if (clientPreferences != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, clientPreferences);
            }
            j = i;
            if (fullName != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, fullName);
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
            if (globalResources != null)
            {
                codedoutputbytebuffernano.writeMessage(1, globalResources);
            }
            if (globalResourcesFingerprint != null)
            {
                codedoutputbytebuffernano.writeInt64(2, globalResourcesFingerprint.longValue());
            }
            if (pinAuthenticationRequired != null)
            {
                codedoutputbytebuffernano.writeBool(3, pinAuthenticationRequired.booleanValue());
            }
            if (hasCdpProfile != null)
            {
                codedoutputbytebuffernano.writeBool(4, hasCdpProfile.booleanValue());
            }
            if (clientPreferences != null)
            {
                codedoutputbytebuffernano.writeMessage(5, clientPreferences);
            }
            if (fullName != null)
            {
                codedoutputbytebuffernano.writeString(6, fullName);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PreSetupWalletResponse()
        {
            clear();
        }
    }

    public static final class SetupWalletRequest extends ExtendableMessageNano
    {

        public String acceptedTosId;
        public com.google.wallet.proto.NanoWalletEntities.ClientPreferences clientPreferences;
        public com.google.wallet.proto.NanoWalletShared.DeviceContext deviceContext;
        public Boolean fetchNumInstruments;
        public com.google.wallet.proto.NanoWalletShared.WalletContext walletContext;

        private SetupWalletRequest clear()
        {
            fetchNumInstruments = null;
            acceptedTosId = null;
            deviceContext = null;
            walletContext = null;
            clientPreferences = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private SetupWalletRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    fetchNumInstruments = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 18: // '\022'
                    acceptedTosId = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    if (deviceContext == null)
                    {
                        deviceContext = new com.google.wallet.proto.NanoWalletShared.DeviceContext();
                    }
                    codedinputbytebuffernano.readMessage(deviceContext);
                    break;

                case 34: // '"'
                    if (walletContext == null)
                    {
                        walletContext = new com.google.wallet.proto.NanoWalletShared.WalletContext();
                    }
                    codedinputbytebuffernano.readMessage(walletContext);
                    break;

                case 42: // '*'
                    if (clientPreferences == null)
                    {
                        clientPreferences = new com.google.wallet.proto.NanoWalletEntities.ClientPreferences();
                    }
                    codedinputbytebuffernano.readMessage(clientPreferences);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (fetchNumInstruments != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(1, fetchNumInstruments.booleanValue());
            }
            j = i;
            if (acceptedTosId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, acceptedTosId);
            }
            i = j;
            if (deviceContext != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, deviceContext);
            }
            j = i;
            if (walletContext != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, walletContext);
            }
            i = j;
            if (clientPreferences != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, clientPreferences);
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
            if (fetchNumInstruments != null)
            {
                codedoutputbytebuffernano.writeBool(1, fetchNumInstruments.booleanValue());
            }
            if (acceptedTosId != null)
            {
                codedoutputbytebuffernano.writeString(2, acceptedTosId);
            }
            if (deviceContext != null)
            {
                codedoutputbytebuffernano.writeMessage(3, deviceContext);
            }
            if (walletContext != null)
            {
                codedoutputbytebuffernano.writeMessage(4, walletContext);
            }
            if (clientPreferences != null)
            {
                codedoutputbytebuffernano.writeMessage(5, clientPreferences);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SetupWalletRequest()
        {
            clear();
        }
    }

    public static final class SetupWalletResponse extends ExtendableMessageNano
    {

        public String acceptedTosId;
        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public Integer errorCode;
        public com.google.wallet.proto.NanoWalletEntities.GlobalResources globalResources;
        public Long globalResourcesFingerprint;
        public Integer numSyncedInstruments;
        public Boolean pinAuthenticationRequired;

        private SetupWalletResponse clear()
        {
            errorCode = null;
            callError = null;
            globalResources = null;
            globalResourcesFingerprint = null;
            acceptedTosId = null;
            numSyncedInstruments = null;
            pinAuthenticationRequired = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private SetupWalletResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L10:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 8: default 80
        //                       0: 89
        //                       10: 91
        //                       16: 120
        //                       26: 134
        //                       32: 145
        //                       40: 159
        //                       48: 173
        //                       58: 214;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L10; else goto _L2
_L2:
            return this;
_L3:
            if (globalResources == null)
            {
                globalResources = new com.google.wallet.proto.NanoWalletEntities.GlobalResources();
            }
            codedinputbytebuffernano.readMessage(globalResources);
              goto _L10
_L4:
            globalResourcesFingerprint = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L10
_L5:
            acceptedTosId = codedinputbytebuffernano.readString();
              goto _L10
_L6:
            numSyncedInstruments = Integer.valueOf(codedinputbytebuffernano.readInt32());
              goto _L10
_L7:
            pinAuthenticationRequired = Boolean.valueOf(codedinputbytebuffernano.readBool());
              goto _L10
_L8:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
                errorCode = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L9:
            if (callError == null)
            {
                callError = new com.google.wallet.proto.NanoWalletError.CallError();
            }
            codedinputbytebuffernano.readMessage(callError);
            if (true) goto _L10; else goto _L11
_L11:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (globalResources != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, globalResources);
            }
            j = i;
            if (globalResourcesFingerprint != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(2, globalResourcesFingerprint.longValue());
            }
            i = j;
            if (acceptedTosId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, acceptedTosId);
            }
            j = i;
            if (numSyncedInstruments != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(4, numSyncedInstruments.intValue());
            }
            i = j;
            if (pinAuthenticationRequired != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(5, pinAuthenticationRequired.booleanValue());
            }
            j = i;
            if (errorCode != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(6, errorCode.intValue());
            }
            i = j;
            if (callError != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(7, callError);
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
            if (globalResources != null)
            {
                codedoutputbytebuffernano.writeMessage(1, globalResources);
            }
            if (globalResourcesFingerprint != null)
            {
                codedoutputbytebuffernano.writeInt64(2, globalResourcesFingerprint.longValue());
            }
            if (acceptedTosId != null)
            {
                codedoutputbytebuffernano.writeString(3, acceptedTosId);
            }
            if (numSyncedInstruments != null)
            {
                codedoutputbytebuffernano.writeInt32(4, numSyncedInstruments.intValue());
            }
            if (pinAuthenticationRequired != null)
            {
                codedoutputbytebuffernano.writeBool(5, pinAuthenticationRequired.booleanValue());
            }
            if (errorCode != null)
            {
                codedoutputbytebuffernano.writeInt32(6, errorCode.intValue());
            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(7, callError);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SetupWalletResponse()
        {
            clear();
        }
    }

}
