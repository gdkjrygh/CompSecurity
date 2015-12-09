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

public interface NanoWalletSettings
{
    public static final class DynamicSetting extends ExtendableMessageNano
    {

        private static volatile DynamicSetting _emptyArray[];
        public String analyticsLabel;
        public String description;
        public Integer id;
        public Boolean requiresLocationConsent;
        public String title;
        public Boolean value;

        private DynamicSetting clear()
        {
            id = null;
            title = null;
            description = null;
            value = null;
            requiresLocationConsent = null;
            analyticsLabel = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static DynamicSetting[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new DynamicSetting[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private DynamicSetting mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    id = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 18: // '\022'
                    title = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    description = codedinputbytebuffernano.readString();
                    break;

                case 32: // ' '
                    value = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 40: // '('
                    requiresLocationConsent = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 50: // '2'
                    analyticsLabel = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (id != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, id.intValue());
            }
            j = i;
            if (title != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, title);
            }
            i = j;
            if (description != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, description);
            }
            j = i;
            if (value != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(4, value.booleanValue());
            }
            i = j;
            if (requiresLocationConsent != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(5, requiresLocationConsent.booleanValue());
            }
            j = i;
            if (analyticsLabel != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, analyticsLabel);
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
            if (id != null)
            {
                codedoutputbytebuffernano.writeInt32(1, id.intValue());
            }
            if (title != null)
            {
                codedoutputbytebuffernano.writeString(2, title);
            }
            if (description != null)
            {
                codedoutputbytebuffernano.writeString(3, description);
            }
            if (value != null)
            {
                codedoutputbytebuffernano.writeBool(4, value.booleanValue());
            }
            if (requiresLocationConsent != null)
            {
                codedoutputbytebuffernano.writeBool(5, requiresLocationConsent.booleanValue());
            }
            if (analyticsLabel != null)
            {
                codedoutputbytebuffernano.writeString(6, analyticsLabel);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DynamicSetting()
        {
            clear();
        }
    }

    public static final class FetchSettingsRequest extends ExtendableMessageNano
    {

        public Boolean isWhisky;

        private FetchSettingsRequest clear()
        {
            isWhisky = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FetchSettingsRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    isWhisky = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (isWhisky != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(1, isWhisky.booleanValue());
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
            if (isWhisky != null)
            {
                codedoutputbytebuffernano.writeBool(1, isWhisky.booleanValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public FetchSettingsRequest()
        {
            clear();
        }
    }

    public static final class FetchSettingsResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public Settings settings;

        private FetchSettingsResponse clear()
        {
            settings = null;
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FetchSettingsResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (settings == null)
                    {
                        settings = new Settings();
                    }
                    codedinputbytebuffernano.readMessage(settings);
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
            if (settings != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, settings);
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
            if (settings != null)
            {
                codedoutputbytebuffernano.writeMessage(1, settings);
            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(2, callError);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public FetchSettingsResponse()
        {
            clear();
        }
    }

    public static final class GetCommercialUseSettingsRequest extends ExtendableMessageNano
    {

        private GetCommercialUseSettingsRequest clear()
        {
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetCommercialUseSettingsRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public GetCommercialUseSettingsRequest()
        {
            clear();
        }
    }

    public static final class GetCommercialUseSettingsResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public com.google.wallet.proto.NanoWalletEntities.P2pCommercialUseSettings commercialUseSettings;
        public com.google.wallet.proto.NanoWalletEntities.DisplayableP2pCommercialUses displayableCommercialUses;

        private GetCommercialUseSettingsResponse clear()
        {
            callError = null;
            displayableCommercialUses = null;
            commercialUseSettings = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetCommercialUseSettingsResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (displayableCommercialUses == null)
                    {
                        displayableCommercialUses = new com.google.wallet.proto.NanoWalletEntities.DisplayableP2pCommercialUses();
                    }
                    codedinputbytebuffernano.readMessage(displayableCommercialUses);
                    break;

                case 26: // '\032'
                    if (commercialUseSettings == null)
                    {
                        commercialUseSettings = new com.google.wallet.proto.NanoWalletEntities.P2pCommercialUseSettings();
                    }
                    codedinputbytebuffernano.readMessage(commercialUseSettings);
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
            if (displayableCommercialUses != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, displayableCommercialUses);
            }
            i = j;
            if (commercialUseSettings != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, commercialUseSettings);
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
            if (displayableCommercialUses != null)
            {
                codedoutputbytebuffernano.writeMessage(2, displayableCommercialUses);
            }
            if (commercialUseSettings != null)
            {
                codedoutputbytebuffernano.writeMessage(3, commercialUseSettings);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GetCommercialUseSettingsResponse()
        {
            clear();
        }
    }

    public static final class LowBalanceSettings extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletEntities.DisplayableMoney balanceThreshold;
        public Boolean enableNotifications;

        private LowBalanceSettings clear()
        {
            enableNotifications = null;
            balanceThreshold = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private LowBalanceSettings mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    enableNotifications = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 18: // '\022'
                    if (balanceThreshold == null)
                    {
                        balanceThreshold = new com.google.wallet.proto.NanoWalletEntities.DisplayableMoney();
                    }
                    codedinputbytebuffernano.readMessage(balanceThreshold);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (enableNotifications != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(1, enableNotifications.booleanValue());
            }
            j = i;
            if (balanceThreshold != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, balanceThreshold);
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
            if (enableNotifications != null)
            {
                codedoutputbytebuffernano.writeBool(1, enableNotifications.booleanValue());
            }
            if (balanceThreshold != null)
            {
                codedoutputbytebuffernano.writeMessage(2, balanceThreshold);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LowBalanceSettings()
        {
            clear();
        }
    }

    public static final class P2pSettings extends ExtendableMessageNano
    {

        public Boolean enablePayByEmail;

        private P2pSettings clear()
        {
            enablePayByEmail = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private P2pSettings mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    enablePayByEmail = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (enablePayByEmail != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(1, enablePayByEmail.booleanValue());
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
            if (enablePayByEmail != null)
            {
                codedoutputbytebuffernano.writeBool(1, enablePayByEmail.booleanValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public P2pSettings()
        {
            clear();
        }
    }

    public static final class Settings extends ExtendableMessageNano
    {

        public Long cloudPinTtlMinutes;
        public Boolean enableNotifications;
        public LowBalanceSettings lowBalanceSettings;
        public Boolean marketingEmail;
        public P2pSettings p2PSettings;
        public String ringtoneLocation;
        public DynamicSetting transactionNotificationSetting[];
        public Integer vibrationCondition;
        public DynamicSetting wobNotificationSetting[];

        private Settings clear()
        {
            wobNotificationSetting = DynamicSetting.emptyArray();
            transactionNotificationSetting = DynamicSetting.emptyArray();
            enableNotifications = null;
            marketingEmail = null;
            lowBalanceSettings = null;
            cloudPinTtlMinutes = null;
            p2PSettings = null;
            vibrationCondition = null;
            ringtoneLocation = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private Settings mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L12:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 10: default 96
        //                       0: 105
        //                       10: 107
        //                       18: 231
        //                       24: 355
        //                       32: 369
        //                       42: 383
        //                       48: 412
        //                       58: 426
        //                       64: 455
        //                       74: 502;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L12; else goto _L2
_L2:
            return this;
_L3:
            int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
            DynamicSetting adynamicsetting[];
            int j;
            if (wobNotificationSetting == null)
            {
                j = 0;
            } else
            {
                j = wobNotificationSetting.length;
            }
            adynamicsetting = new DynamicSetting[j + i1];
            i1 = j;
            if (j != 0)
            {
                System.arraycopy(wobNotificationSetting, 0, adynamicsetting, 0, j);
                i1 = j;
            }
            for (; i1 < adynamicsetting.length - 1; i1++)
            {
                adynamicsetting[i1] = new DynamicSetting();
                codedinputbytebuffernano.readMessage(adynamicsetting[i1]);
                codedinputbytebuffernano.readTag();
            }

            adynamicsetting[i1] = new DynamicSetting();
            codedinputbytebuffernano.readMessage(adynamicsetting[i1]);
            wobNotificationSetting = adynamicsetting;
              goto _L12
_L4:
            int j1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
            DynamicSetting adynamicsetting1[];
            int k;
            if (transactionNotificationSetting == null)
            {
                k = 0;
            } else
            {
                k = transactionNotificationSetting.length;
            }
            adynamicsetting1 = new DynamicSetting[k + j1];
            j1 = k;
            if (k != 0)
            {
                System.arraycopy(transactionNotificationSetting, 0, adynamicsetting1, 0, k);
                j1 = k;
            }
            for (; j1 < adynamicsetting1.length - 1; j1++)
            {
                adynamicsetting1[j1] = new DynamicSetting();
                codedinputbytebuffernano.readMessage(adynamicsetting1[j1]);
                codedinputbytebuffernano.readTag();
            }

            adynamicsetting1[j1] = new DynamicSetting();
            codedinputbytebuffernano.readMessage(adynamicsetting1[j1]);
            transactionNotificationSetting = adynamicsetting1;
              goto _L12
_L5:
            enableNotifications = Boolean.valueOf(codedinputbytebuffernano.readBool());
              goto _L12
_L6:
            marketingEmail = Boolean.valueOf(codedinputbytebuffernano.readBool());
              goto _L12
_L7:
            if (lowBalanceSettings == null)
            {
                lowBalanceSettings = new LowBalanceSettings();
            }
            codedinputbytebuffernano.readMessage(lowBalanceSettings);
              goto _L12
_L8:
            cloudPinTtlMinutes = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L12
_L9:
            if (p2PSettings == null)
            {
                p2PSettings = new P2pSettings();
            }
            codedinputbytebuffernano.readMessage(p2PSettings);
              goto _L12
_L10:
            int l = codedinputbytebuffernano.readInt32();
            switch (l)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                vibrationCondition = Integer.valueOf(l);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L11:
            ringtoneLocation = codedinputbytebuffernano.readString();
            if (true) goto _L12; else goto _L13
_L13:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (wobNotificationSetting != null)
            {
                i = j;
                if (wobNotificationSetting.length > 0)
                {
                    int k = 0;
                    do
                    {
                        i = j;
                        if (k >= wobNotificationSetting.length)
                        {
                            break;
                        }
                        DynamicSetting dynamicsetting = wobNotificationSetting[k];
                        i = j;
                        if (dynamicsetting != null)
                        {
                            i = j + CodedOutputByteBufferNano.computeMessageSize(1, dynamicsetting);
                        }
                        k++;
                        j = i;
                    } while (true);
                }
            }
            j = i;
            if (transactionNotificationSetting != null)
            {
                j = i;
                if (transactionNotificationSetting.length > 0)
                {
                    int l = 0;
                    do
                    {
                        j = i;
                        if (l >= transactionNotificationSetting.length)
                        {
                            break;
                        }
                        DynamicSetting dynamicsetting1 = transactionNotificationSetting[l];
                        j = i;
                        if (dynamicsetting1 != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(2, dynamicsetting1);
                        }
                        l++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (enableNotifications != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(3, enableNotifications.booleanValue());
            }
            j = i;
            if (marketingEmail != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(4, marketingEmail.booleanValue());
            }
            i = j;
            if (lowBalanceSettings != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, lowBalanceSettings);
            }
            j = i;
            if (cloudPinTtlMinutes != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(6, cloudPinTtlMinutes.longValue());
            }
            i = j;
            if (p2PSettings != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(7, p2PSettings);
            }
            j = i;
            if (vibrationCondition != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(8, vibrationCondition.intValue());
            }
            i = j;
            if (ringtoneLocation != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(9, ringtoneLocation);
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
            if (wobNotificationSetting != null && wobNotificationSetting.length > 0)
            {
                for (int i = 0; i < wobNotificationSetting.length; i++)
                {
                    DynamicSetting dynamicsetting = wobNotificationSetting[i];
                    if (dynamicsetting != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, dynamicsetting);
                    }
                }

            }
            if (transactionNotificationSetting != null && transactionNotificationSetting.length > 0)
            {
                for (int j = 0; j < transactionNotificationSetting.length; j++)
                {
                    DynamicSetting dynamicsetting1 = transactionNotificationSetting[j];
                    if (dynamicsetting1 != null)
                    {
                        codedoutputbytebuffernano.writeMessage(2, dynamicsetting1);
                    }
                }

            }
            if (enableNotifications != null)
            {
                codedoutputbytebuffernano.writeBool(3, enableNotifications.booleanValue());
            }
            if (marketingEmail != null)
            {
                codedoutputbytebuffernano.writeBool(4, marketingEmail.booleanValue());
            }
            if (lowBalanceSettings != null)
            {
                codedoutputbytebuffernano.writeMessage(5, lowBalanceSettings);
            }
            if (cloudPinTtlMinutes != null)
            {
                codedoutputbytebuffernano.writeInt64(6, cloudPinTtlMinutes.longValue());
            }
            if (p2PSettings != null)
            {
                codedoutputbytebuffernano.writeMessage(7, p2PSettings);
            }
            if (vibrationCondition != null)
            {
                codedoutputbytebuffernano.writeInt32(8, vibrationCondition.intValue());
            }
            if (ringtoneLocation != null)
            {
                codedoutputbytebuffernano.writeString(9, ringtoneLocation);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Settings()
        {
            clear();
        }
    }

    public static final class UpdateCommercialUseSettingsRequest extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletEntities.P2pCommercialUseSettings commercialUseSettings;

        private UpdateCommercialUseSettingsRequest clear()
        {
            commercialUseSettings = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private UpdateCommercialUseSettingsRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (commercialUseSettings == null)
                    {
                        commercialUseSettings = new com.google.wallet.proto.NanoWalletEntities.P2pCommercialUseSettings();
                    }
                    codedinputbytebuffernano.readMessage(commercialUseSettings);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (commercialUseSettings != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, commercialUseSettings);
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
            if (commercialUseSettings != null)
            {
                codedoutputbytebuffernano.writeMessage(1, commercialUseSettings);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public UpdateCommercialUseSettingsRequest()
        {
            clear();
        }
    }

    public static final class UpdateCommercialUseSettingsResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;

        private UpdateCommercialUseSettingsResponse clear()
        {
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private UpdateCommercialUseSettingsResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public UpdateCommercialUseSettingsResponse()
        {
            clear();
        }
    }

    public static final class UpdateDeviceInfoRequest extends ExtendableMessageNano
    {

        public String languageCode;
        public String timeZone;

        private UpdateDeviceInfoRequest clear()
        {
            languageCode = null;
            timeZone = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private UpdateDeviceInfoRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    languageCode = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    timeZone = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (languageCode != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, languageCode);
            }
            j = i;
            if (timeZone != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, timeZone);
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
            if (languageCode != null)
            {
                codedoutputbytebuffernano.writeString(1, languageCode);
            }
            if (timeZone != null)
            {
                codedoutputbytebuffernano.writeString(2, timeZone);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public UpdateDeviceInfoRequest()
        {
            clear();
        }
    }

    public static final class UpdateDeviceInfoResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;

        private UpdateDeviceInfoResponse clear()
        {
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private UpdateDeviceInfoResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public UpdateDeviceInfoResponse()
        {
            clear();
        }
    }

    public static final class UpdateSettingRequest extends ExtendableMessageNano
    {

        public Integer id;
        public Boolean isWhisky;
        public com.google.wallet.proto.NanoWalletEntities.MoneyProto newMoneyValue;
        public Long newNumberValue;
        public String newStringValue;
        public Boolean newValue;

        private UpdateSettingRequest clear()
        {
            id = null;
            newValue = null;
            newMoneyValue = null;
            newNumberValue = null;
            isWhisky = null;
            newStringValue = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private UpdateSettingRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    id = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 16: // '\020'
                    newValue = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 26: // '\032'
                    if (newMoneyValue == null)
                    {
                        newMoneyValue = new com.google.wallet.proto.NanoWalletEntities.MoneyProto();
                    }
                    codedinputbytebuffernano.readMessage(newMoneyValue);
                    break;

                case 32: // ' '
                    newNumberValue = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 40: // '('
                    isWhisky = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 50: // '2'
                    newStringValue = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (id != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, id.intValue());
            }
            j = i;
            if (newValue != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(2, newValue.booleanValue());
            }
            i = j;
            if (newMoneyValue != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, newMoneyValue);
            }
            j = i;
            if (newNumberValue != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(4, newNumberValue.longValue());
            }
            i = j;
            if (isWhisky != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(5, isWhisky.booleanValue());
            }
            j = i;
            if (newStringValue != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, newStringValue);
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
            if (id != null)
            {
                codedoutputbytebuffernano.writeInt32(1, id.intValue());
            }
            if (newValue != null)
            {
                codedoutputbytebuffernano.writeBool(2, newValue.booleanValue());
            }
            if (newMoneyValue != null)
            {
                codedoutputbytebuffernano.writeMessage(3, newMoneyValue);
            }
            if (newNumberValue != null)
            {
                codedoutputbytebuffernano.writeInt64(4, newNumberValue.longValue());
            }
            if (isWhisky != null)
            {
                codedoutputbytebuffernano.writeBool(5, isWhisky.booleanValue());
            }
            if (newStringValue != null)
            {
                codedoutputbytebuffernano.writeString(6, newStringValue);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public UpdateSettingRequest()
        {
            clear();
        }
    }

    public static final class UpdateSettingResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public Settings currentSettings;

        private UpdateSettingResponse clear()
        {
            currentSettings = null;
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private UpdateSettingResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (currentSettings == null)
                    {
                        currentSettings = new Settings();
                    }
                    codedinputbytebuffernano.readMessage(currentSettings);
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
            if (currentSettings != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, currentSettings);
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
            if (currentSettings != null)
            {
                codedoutputbytebuffernano.writeMessage(1, currentSettings);
            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(2, callError);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public UpdateSettingResponse()
        {
            clear();
        }
    }

}
