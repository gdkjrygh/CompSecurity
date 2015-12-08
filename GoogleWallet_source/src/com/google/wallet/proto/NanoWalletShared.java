// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

public interface NanoWalletShared
{
    public static final class ClientEncryptedData extends ExtendableMessageNano
    {

        public Integer method;
        public String oneTimeKeyPayload;
        public String payload;
        public Integer secureDataType;
        public String sessionMaterial;

        private ClientEncryptedData clear()
        {
            payload = null;
            sessionMaterial = null;
            method = null;
            secureDataType = null;
            oneTimeKeyPayload = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ClientEncryptedData mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L8:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 6: default 64
        //                       0: 73
        //                       10: 75
        //                       18: 86
        //                       24: 97
        //                       32: 142
        //                       42: 156;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
_L2:
            return this;
_L3:
            payload = codedinputbytebuffernano.readString();
              goto _L8
_L4:
            sessionMaterial = codedinputbytebuffernano.readString();
              goto _L8
_L5:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                method = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L6:
            secureDataType = Integer.valueOf(codedinputbytebuffernano.readInt32());
            continue; /* Loop/switch isn't completed */
_L7:
            oneTimeKeyPayload = codedinputbytebuffernano.readString();
            if (true) goto _L8; else goto _L9
_L9:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (payload != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, payload);
            }
            j = i;
            if (sessionMaterial != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, sessionMaterial);
            }
            i = j;
            if (method != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, method.intValue());
            }
            j = i;
            if (secureDataType != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(4, secureDataType.intValue());
            }
            i = j;
            if (oneTimeKeyPayload != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, oneTimeKeyPayload);
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
            if (payload != null)
            {
                codedoutputbytebuffernano.writeString(1, payload);
            }
            if (sessionMaterial != null)
            {
                codedoutputbytebuffernano.writeString(2, sessionMaterial);
            }
            if (method != null)
            {
                codedoutputbytebuffernano.writeInt32(3, method.intValue());
            }
            if (secureDataType != null)
            {
                codedoutputbytebuffernano.writeInt32(4, secureDataType.intValue());
            }
            if (oneTimeKeyPayload != null)
            {
                codedoutputbytebuffernano.writeString(5, oneTimeKeyPayload);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ClientEncryptedData()
        {
            clear();
        }
    }

    public static final class DeviceContext extends ExtendableMessageNano
    {

        public Long androidId;
        public Boolean batteryCharging;
        public String buildFingerprint;
        public String deviceId;
        public String deviceName;
        public String encodedCplc;
        public Integer hardwareType;
        public IosDeviceContext iosDeviceContext;
        public String manufacturer;
        public String model;
        public String oldDeprecatedAndroidId;
        public Integer percentBattery;
        public String phoneNumber;
        public String product;
        public String secureAndroidId;
        public String serial;
        public StableNetworkDetails stableNetworkDetails;

        private DeviceContext clear()
        {
            oldDeprecatedAndroidId = null;
            serial = null;
            deviceId = null;
            phoneNumber = null;
            encodedCplc = null;
            product = null;
            model = null;
            manufacturer = null;
            hardwareType = null;
            iosDeviceContext = null;
            deviceName = null;
            percentBattery = null;
            batteryCharging = null;
            androidId = null;
            stableNetworkDetails = null;
            buildFingerprint = null;
            secureAndroidId = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DeviceContext mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L20:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 18: default 160
        //                       0: 169
        //                       10: 171
        //                       18: 182
        //                       26: 193
        //                       34: 204
        //                       42: 215
        //                       50: 226
        //                       58: 237
        //                       64: 248
        //                       74: 298
        //                       82: 327
        //                       88: 338
        //                       96: 352
        //                       104: 366
        //                       114: 380
        //                       122: 409
        //                       130: 420
        //                       138: 431;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L20; else goto _L2
_L2:
            return this;
_L3:
            oldDeprecatedAndroidId = codedinputbytebuffernano.readString();
              goto _L20
_L4:
            serial = codedinputbytebuffernano.readString();
              goto _L20
_L5:
            deviceId = codedinputbytebuffernano.readString();
              goto _L20
_L6:
            phoneNumber = codedinputbytebuffernano.readString();
              goto _L20
_L7:
            encodedCplc = codedinputbytebuffernano.readString();
              goto _L20
_L8:
            product = codedinputbytebuffernano.readString();
              goto _L20
_L9:
            model = codedinputbytebuffernano.readString();
              goto _L20
_L10:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                hardwareType = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L11:
            if (iosDeviceContext == null)
            {
                iosDeviceContext = new IosDeviceContext();
            }
            codedinputbytebuffernano.readMessage(iosDeviceContext);
            continue; /* Loop/switch isn't completed */
_L12:
            deviceName = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L13:
            percentBattery = Integer.valueOf(codedinputbytebuffernano.readInt32());
            continue; /* Loop/switch isn't completed */
_L14:
            batteryCharging = Boolean.valueOf(codedinputbytebuffernano.readBool());
            continue; /* Loop/switch isn't completed */
_L15:
            androidId = Long.valueOf(codedinputbytebuffernano.readInt64());
            continue; /* Loop/switch isn't completed */
_L16:
            if (stableNetworkDetails == null)
            {
                stableNetworkDetails = new StableNetworkDetails();
            }
            codedinputbytebuffernano.readMessage(stableNetworkDetails);
            continue; /* Loop/switch isn't completed */
_L17:
            buildFingerprint = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L18:
            secureAndroidId = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L19:
            manufacturer = codedinputbytebuffernano.readString();
            if (true) goto _L20; else goto _L21
_L21:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (oldDeprecatedAndroidId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, oldDeprecatedAndroidId);
            }
            j = i;
            if (serial != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, serial);
            }
            i = j;
            if (deviceId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, deviceId);
            }
            j = i;
            if (phoneNumber != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, phoneNumber);
            }
            i = j;
            if (encodedCplc != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, encodedCplc);
            }
            j = i;
            if (product != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, product);
            }
            i = j;
            if (model != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(7, model);
            }
            j = i;
            if (hardwareType != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(8, hardwareType.intValue());
            }
            i = j;
            if (iosDeviceContext != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(9, iosDeviceContext);
            }
            j = i;
            if (deviceName != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(10, deviceName);
            }
            i = j;
            if (percentBattery != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(11, percentBattery.intValue());
            }
            j = i;
            if (batteryCharging != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(12, batteryCharging.booleanValue());
            }
            i = j;
            if (androidId != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(13, androidId.longValue());
            }
            j = i;
            if (stableNetworkDetails != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(14, stableNetworkDetails);
            }
            i = j;
            if (buildFingerprint != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(15, buildFingerprint);
            }
            j = i;
            if (secureAndroidId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(16, secureAndroidId);
            }
            i = j;
            if (manufacturer != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(17, manufacturer);
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
            if (oldDeprecatedAndroidId != null)
            {
                codedoutputbytebuffernano.writeString(1, oldDeprecatedAndroidId);
            }
            if (serial != null)
            {
                codedoutputbytebuffernano.writeString(2, serial);
            }
            if (deviceId != null)
            {
                codedoutputbytebuffernano.writeString(3, deviceId);
            }
            if (phoneNumber != null)
            {
                codedoutputbytebuffernano.writeString(4, phoneNumber);
            }
            if (encodedCplc != null)
            {
                codedoutputbytebuffernano.writeString(5, encodedCplc);
            }
            if (product != null)
            {
                codedoutputbytebuffernano.writeString(6, product);
            }
            if (model != null)
            {
                codedoutputbytebuffernano.writeString(7, model);
            }
            if (hardwareType != null)
            {
                codedoutputbytebuffernano.writeInt32(8, hardwareType.intValue());
            }
            if (iosDeviceContext != null)
            {
                codedoutputbytebuffernano.writeMessage(9, iosDeviceContext);
            }
            if (deviceName != null)
            {
                codedoutputbytebuffernano.writeString(10, deviceName);
            }
            if (percentBattery != null)
            {
                codedoutputbytebuffernano.writeInt32(11, percentBattery.intValue());
            }
            if (batteryCharging != null)
            {
                codedoutputbytebuffernano.writeBool(12, batteryCharging.booleanValue());
            }
            if (androidId != null)
            {
                codedoutputbytebuffernano.writeInt64(13, androidId.longValue());
            }
            if (stableNetworkDetails != null)
            {
                codedoutputbytebuffernano.writeMessage(14, stableNetworkDetails);
            }
            if (buildFingerprint != null)
            {
                codedoutputbytebuffernano.writeString(15, buildFingerprint);
            }
            if (secureAndroidId != null)
            {
                codedoutputbytebuffernano.writeString(16, secureAndroidId);
            }
            if (manufacturer != null)
            {
                codedoutputbytebuffernano.writeString(17, manufacturer);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DeviceContext()
        {
            clear();
        }
    }

    public static final class IosDeviceContext extends ExtendableMessageNano
    {

        public String advertisingIdentifier;
        public String deviceType;
        public String model;
        public String userAssignedName;

        private IosDeviceContext clear()
        {
            deviceType = null;
            model = null;
            userAssignedName = null;
            advertisingIdentifier = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private IosDeviceContext mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    deviceType = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    model = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    userAssignedName = codedinputbytebuffernano.readString();
                    break;

                case 34: // '"'
                    advertisingIdentifier = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (deviceType != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, deviceType);
            }
            j = i;
            if (model != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, model);
            }
            i = j;
            if (userAssignedName != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, userAssignedName);
            }
            j = i;
            if (advertisingIdentifier != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, advertisingIdentifier);
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
            if (deviceType != null)
            {
                codedoutputbytebuffernano.writeString(1, deviceType);
            }
            if (model != null)
            {
                codedoutputbytebuffernano.writeString(2, model);
            }
            if (userAssignedName != null)
            {
                codedoutputbytebuffernano.writeString(3, userAssignedName);
            }
            if (advertisingIdentifier != null)
            {
                codedoutputbytebuffernano.writeString(4, advertisingIdentifier);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public IosDeviceContext()
        {
            clear();
        }
    }

    public static final class IosWalletContext extends ExtendableMessageNano
    {

        public String appId;
        public String appVersion;
        public String systemName;
        public String systemVersion;
        public String vendorIdentifier;
        public String walletUuid;

        private IosWalletContext clear()
        {
            walletUuid = null;
            appVersion = null;
            appId = null;
            systemName = null;
            systemVersion = null;
            vendorIdentifier = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private IosWalletContext mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    walletUuid = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    appVersion = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    appId = codedinputbytebuffernano.readString();
                    break;

                case 34: // '"'
                    systemName = codedinputbytebuffernano.readString();
                    break;

                case 42: // '*'
                    systemVersion = codedinputbytebuffernano.readString();
                    break;

                case 50: // '2'
                    vendorIdentifier = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (walletUuid != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, walletUuid);
            }
            j = i;
            if (appVersion != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, appVersion);
            }
            i = j;
            if (appId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, appId);
            }
            j = i;
            if (systemName != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, systemName);
            }
            i = j;
            if (systemVersion != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, systemVersion);
            }
            j = i;
            if (vendorIdentifier != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, vendorIdentifier);
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
            if (walletUuid != null)
            {
                codedoutputbytebuffernano.writeString(1, walletUuid);
            }
            if (appVersion != null)
            {
                codedoutputbytebuffernano.writeString(2, appVersion);
            }
            if (appId != null)
            {
                codedoutputbytebuffernano.writeString(3, appId);
            }
            if (systemName != null)
            {
                codedoutputbytebuffernano.writeString(4, systemName);
            }
            if (systemVersion != null)
            {
                codedoutputbytebuffernano.writeString(5, systemVersion);
            }
            if (vendorIdentifier != null)
            {
                codedoutputbytebuffernano.writeString(6, vendorIdentifier);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public IosWalletContext()
        {
            clear();
        }
    }

    public static final class OcrAttribution extends ExtendableMessageNano
    {

        private static volatile OcrAttribution _emptyArray[];
        public Float score;
        public String source;

        private OcrAttribution clear()
        {
            score = null;
            source = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static OcrAttribution[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new OcrAttribution[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private OcrAttribution mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

                case 13: // '\r'
                    score = Float.valueOf(codedinputbytebuffernano.readFloat());
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
            if (score != null)
            {
                i = j + CodedOutputByteBufferNano.computeFloatSize(1, score.floatValue());
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
            if (score != null)
            {
                codedoutputbytebuffernano.writeFloat(1, score.floatValue());
            }
            if (source != null)
            {
                codedoutputbytebuffernano.writeString(2, source);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public OcrAttribution()
        {
            clear();
        }
    }

    public static final class PurchaseRecordId extends ExtendableMessageNano
    {

        public String producerId;
        public String subId;

        private PurchaseRecordId clear()
        {
            subId = null;
            producerId = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private PurchaseRecordId mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    subId = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    producerId = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (subId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, subId);
            }
            j = i;
            if (producerId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, producerId);
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
            if (subId != null)
            {
                codedoutputbytebuffernano.writeString(1, subId);
            }
            if (producerId != null)
            {
                codedoutputbytebuffernano.writeString(2, producerId);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PurchaseRecordId()
        {
            clear();
        }
    }

    public static final class StableNetworkDetails extends ExtendableMessageNano
    {

        public String carrier;
        public String networkOperatorCode;
        public String networkOperatorName;
        public Integer phoneType;
        public String simOperatorCode;
        public String simOperatorName;

        private StableNetworkDetails clear()
        {
            phoneType = null;
            networkOperatorCode = null;
            networkOperatorName = null;
            simOperatorCode = null;
            simOperatorName = null;
            carrier = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private StableNetworkDetails mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    phoneType = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 18: // '\022'
                    networkOperatorCode = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    networkOperatorName = codedinputbytebuffernano.readString();
                    break;

                case 34: // '"'
                    simOperatorCode = codedinputbytebuffernano.readString();
                    break;

                case 42: // '*'
                    simOperatorName = codedinputbytebuffernano.readString();
                    break;

                case 50: // '2'
                    carrier = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (phoneType != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, phoneType.intValue());
            }
            j = i;
            if (networkOperatorCode != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, networkOperatorCode);
            }
            i = j;
            if (networkOperatorName != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, networkOperatorName);
            }
            j = i;
            if (simOperatorCode != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, simOperatorCode);
            }
            i = j;
            if (simOperatorName != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, simOperatorName);
            }
            j = i;
            if (carrier != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, carrier);
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
            if (phoneType != null)
            {
                codedoutputbytebuffernano.writeInt32(1, phoneType.intValue());
            }
            if (networkOperatorCode != null)
            {
                codedoutputbytebuffernano.writeString(2, networkOperatorCode);
            }
            if (networkOperatorName != null)
            {
                codedoutputbytebuffernano.writeString(3, networkOperatorName);
            }
            if (simOperatorCode != null)
            {
                codedoutputbytebuffernano.writeString(4, simOperatorCode);
            }
            if (simOperatorName != null)
            {
                codedoutputbytebuffernano.writeString(5, simOperatorName);
            }
            if (carrier != null)
            {
                codedoutputbytebuffernano.writeString(6, carrier);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public StableNetworkDetails()
        {
            clear();
        }
    }

    public static final class UtmCampaignInfo extends ExtendableMessageNano
    {

        public String utmCampaign;
        public String utmContent;
        public String utmMedium;
        public String utmSource;
        public String utmTerm;

        private UtmCampaignInfo clear()
        {
            utmCampaign = null;
            utmSource = null;
            utmMedium = null;
            utmTerm = null;
            utmContent = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private UtmCampaignInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    utmCampaign = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    utmSource = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    utmMedium = codedinputbytebuffernano.readString();
                    break;

                case 34: // '"'
                    utmTerm = codedinputbytebuffernano.readString();
                    break;

                case 42: // '*'
                    utmContent = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (utmCampaign != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, utmCampaign);
            }
            j = i;
            if (utmSource != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, utmSource);
            }
            i = j;
            if (utmMedium != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, utmMedium);
            }
            j = i;
            if (utmTerm != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, utmTerm);
            }
            i = j;
            if (utmContent != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, utmContent);
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
            if (utmCampaign != null)
            {
                codedoutputbytebuffernano.writeString(1, utmCampaign);
            }
            if (utmSource != null)
            {
                codedoutputbytebuffernano.writeString(2, utmSource);
            }
            if (utmMedium != null)
            {
                codedoutputbytebuffernano.writeString(3, utmMedium);
            }
            if (utmTerm != null)
            {
                codedoutputbytebuffernano.writeString(4, utmTerm);
            }
            if (utmContent != null)
            {
                codedoutputbytebuffernano.writeString(5, utmContent);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public UtmCampaignInfo()
        {
            clear();
        }
    }

    public static final class WalletContext extends ExtendableMessageNano
    {

        public String androidFeatureset;
        public String androidVersionCode;
        public String androidVersionName;
        public String buildId;
        public String buildRelease;
        public String buildTags;
        public Integer clientType;
        public String cloudConfig;
        public Integer controllerAppletVersion;
        public IosWalletContext iosWalletContext;
        public String languageCode;
        public String locale;
        public Integer osType;
        public Integer sdkVersion;
        public String supportedLanguageCode[];
        public Long systemCurrentTimeMillis;
        public Long systemGmtOffsetMillis;
        public String timeZone;
        public Boolean twelveHourClock;
        public String walletUuid;

        private WalletContext clear()
        {
            walletUuid = null;
            androidVersionCode = null;
            androidVersionName = null;
            androidFeatureset = null;
            cloudConfig = null;
            buildId = null;
            buildTags = null;
            osType = null;
            clientType = null;
            iosWalletContext = null;
            buildRelease = null;
            sdkVersion = null;
            locale = null;
            controllerAppletVersion = null;
            systemCurrentTimeMillis = null;
            systemGmtOffsetMillis = null;
            timeZone = null;
            supportedLanguageCode = WireFormatNano.EMPTY_STRING_ARRAY;
            languageCode = null;
            twelveHourClock = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private WalletContext mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L23:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 21: default 184
        //                       0: 193
        //                       10: 195
        //                       18: 206
        //                       26: 217
        //                       34: 228
        //                       42: 239
        //                       50: 250
        //                       58: 261
        //                       64: 272
        //                       74: 322
        //                       82: 351
        //                       88: 362
        //                       98: 376
        //                       104: 387
        //                       112: 401
        //                       120: 415
        //                       130: 429
        //                       138: 440
        //                       146: 543
        //                       152: 554
        //                       160: 568;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L23; else goto _L2
_L2:
            return this;
_L3:
            walletUuid = codedinputbytebuffernano.readString();
              goto _L23
_L4:
            androidVersionCode = codedinputbytebuffernano.readString();
              goto _L23
_L5:
            androidVersionName = codedinputbytebuffernano.readString();
              goto _L23
_L6:
            androidFeatureset = codedinputbytebuffernano.readString();
              goto _L23
_L7:
            cloudConfig = codedinputbytebuffernano.readString();
              goto _L23
_L8:
            buildId = codedinputbytebuffernano.readString();
              goto _L23
_L9:
            buildTags = codedinputbytebuffernano.readString();
              goto _L23
_L10:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                osType = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L11:
            if (iosWalletContext == null)
            {
                iosWalletContext = new IosWalletContext();
            }
            codedinputbytebuffernano.readMessage(iosWalletContext);
            continue; /* Loop/switch isn't completed */
_L12:
            buildRelease = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L13:
            sdkVersion = Integer.valueOf(codedinputbytebuffernano.readInt32());
            continue; /* Loop/switch isn't completed */
_L14:
            locale = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L15:
            controllerAppletVersion = Integer.valueOf(codedinputbytebuffernano.readInt32());
            continue; /* Loop/switch isn't completed */
_L16:
            systemCurrentTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
            continue; /* Loop/switch isn't completed */
_L17:
            systemGmtOffsetMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
            continue; /* Loop/switch isn't completed */
_L18:
            timeZone = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L19:
            int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 138);
            String as[];
            int k;
            if (supportedLanguageCode == null)
            {
                k = 0;
            } else
            {
                k = supportedLanguageCode.length;
            }
            as = new String[k + i1];
            i1 = k;
            if (k != 0)
            {
                System.arraycopy(supportedLanguageCode, 0, as, 0, k);
                i1 = k;
            }
            for (; i1 < as.length - 1; i1++)
            {
                as[i1] = codedinputbytebuffernano.readString();
                codedinputbytebuffernano.readTag();
            }

            as[i1] = codedinputbytebuffernano.readString();
            supportedLanguageCode = as;
            continue; /* Loop/switch isn't completed */
_L20:
            languageCode = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L21:
            twelveHourClock = Boolean.valueOf(codedinputbytebuffernano.readBool());
            continue; /* Loop/switch isn't completed */
_L22:
            int l = codedinputbytebuffernano.readInt32();
            switch (l)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                clientType = Integer.valueOf(l);
                break;
            }
            if (true) goto _L23; else goto _L24
_L24:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (walletUuid != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, walletUuid);
            }
            j = i;
            if (androidVersionCode != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, androidVersionCode);
            }
            i = j;
            if (androidVersionName != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, androidVersionName);
            }
            j = i;
            if (androidFeatureset != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, androidFeatureset);
            }
            i = j;
            if (cloudConfig != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, cloudConfig);
            }
            j = i;
            if (buildId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, buildId);
            }
            i = j;
            if (buildTags != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(7, buildTags);
            }
            j = i;
            if (osType != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(8, osType.intValue());
            }
            i = j;
            if (iosWalletContext != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(9, iosWalletContext);
            }
            j = i;
            if (buildRelease != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(10, buildRelease);
            }
            i = j;
            if (sdkVersion != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(11, sdkVersion.intValue());
            }
            j = i;
            if (locale != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(12, locale);
            }
            i = j;
            if (controllerAppletVersion != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(13, controllerAppletVersion.intValue());
            }
            j = i;
            if (systemCurrentTimeMillis != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(14, systemCurrentTimeMillis.longValue());
            }
            int k = j;
            if (systemGmtOffsetMillis != null)
            {
                k = j + CodedOutputByteBufferNano.computeInt64Size(15, systemGmtOffsetMillis.longValue());
            }
            i = k;
            if (timeZone != null)
            {
                i = k + CodedOutputByteBufferNano.computeStringSize(16, timeZone);
            }
            j = i;
            if (supportedLanguageCode != null)
            {
                j = i;
                if (supportedLanguageCode.length > 0)
                {
                    int j1 = 0;
                    int l = 0;
                    for (j = 0; j < supportedLanguageCode.length;)
                    {
                        String s = supportedLanguageCode[j];
                        int k1 = j1;
                        int i1 = l;
                        if (s != null)
                        {
                            k1 = j1 + 1;
                            i1 = l + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                        }
                        j++;
                        j1 = k1;
                        l = i1;
                    }

                    j = i + l + j1 * 2;
                }
            }
            i = j;
            if (languageCode != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(18, languageCode);
            }
            j = i;
            if (twelveHourClock != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(19, twelveHourClock.booleanValue());
            }
            i = j;
            if (clientType != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(20, clientType.intValue());
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
            if (walletUuid != null)
            {
                codedoutputbytebuffernano.writeString(1, walletUuid);
            }
            if (androidVersionCode != null)
            {
                codedoutputbytebuffernano.writeString(2, androidVersionCode);
            }
            if (androidVersionName != null)
            {
                codedoutputbytebuffernano.writeString(3, androidVersionName);
            }
            if (androidFeatureset != null)
            {
                codedoutputbytebuffernano.writeString(4, androidFeatureset);
            }
            if (cloudConfig != null)
            {
                codedoutputbytebuffernano.writeString(5, cloudConfig);
            }
            if (buildId != null)
            {
                codedoutputbytebuffernano.writeString(6, buildId);
            }
            if (buildTags != null)
            {
                codedoutputbytebuffernano.writeString(7, buildTags);
            }
            if (osType != null)
            {
                codedoutputbytebuffernano.writeInt32(8, osType.intValue());
            }
            if (iosWalletContext != null)
            {
                codedoutputbytebuffernano.writeMessage(9, iosWalletContext);
            }
            if (buildRelease != null)
            {
                codedoutputbytebuffernano.writeString(10, buildRelease);
            }
            if (sdkVersion != null)
            {
                codedoutputbytebuffernano.writeInt32(11, sdkVersion.intValue());
            }
            if (locale != null)
            {
                codedoutputbytebuffernano.writeString(12, locale);
            }
            if (controllerAppletVersion != null)
            {
                codedoutputbytebuffernano.writeInt32(13, controllerAppletVersion.intValue());
            }
            if (systemCurrentTimeMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(14, systemCurrentTimeMillis.longValue());
            }
            if (systemGmtOffsetMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(15, systemGmtOffsetMillis.longValue());
            }
            if (timeZone != null)
            {
                codedoutputbytebuffernano.writeString(16, timeZone);
            }
            if (supportedLanguageCode != null && supportedLanguageCode.length > 0)
            {
                for (int i = 0; i < supportedLanguageCode.length; i++)
                {
                    String s = supportedLanguageCode[i];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(17, s);
                    }
                }

            }
            if (languageCode != null)
            {
                codedoutputbytebuffernano.writeString(18, languageCode);
            }
            if (twelveHourClock != null)
            {
                codedoutputbytebuffernano.writeBool(19, twelveHourClock.booleanValue());
            }
            if (clientType != null)
            {
                codedoutputbytebuffernano.writeInt32(20, clientType.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public WalletContext()
        {
            clear();
        }
    }

}
