// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletClient

public static final class clear extends ExtendableMessageNano
{
    public static final class DeviceCapabilityInfo extends ExtendableMessageNano
    {

        public int deviceCapability[];

        private DeviceCapabilityInfo clear()
        {
            deviceCapability = WireFormatNano.EMPTY_INT_ARRAY;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DeviceCapabilityInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L19:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 3: default 44
        //                       0: 54
        //                       8: 56
        //                       10: 248;
               goto _L1 _L2 _L3 _L4
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i))
            {
                continue; /* Loop/switch isn't completed */
            }
_L2:
            return this;
_L3:
            int ai[];
            int j;
            int i1;
            i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 8);
            ai = new int[i1];
            j = 0;
            i = 0;
_L11:
            if (j >= i1) goto _L6; else goto _L5
_L5:
            int j1;
            if (j != 0)
            {
                codedinputbytebuffernano.readTag();
            }
            j1 = codedinputbytebuffernano.readInt32();
            j1;
            JVM INSTR tableswitch 1 4: default 132
        //                       1 141
        //                       2 141
        //                       3 132
        //                       4 141;
               goto _L7 _L8 _L8 _L7 _L8
_L7:
            j++;
              goto _L9
_L8:
            int k = i + 1;
            ai[i] = j1;
            i = k;
            if (true) goto _L7; else goto _L9
_L9:
            if (true) goto _L11; else goto _L10
_L10:
_L6:
            if (i != 0)
            {
                if (deviceCapability == null)
                {
                    j = 0;
                } else
                {
                    j = deviceCapability.length;
                }
                if (j == 0 && i == i1)
                {
                    deviceCapability = ai;
                } else
                {
                    int ai1[] = new int[j + i];
                    if (j != 0)
                    {
                        System.arraycopy(deviceCapability, 0, ai1, 0, j);
                    }
                    System.arraycopy(ai, 0, ai1, j, i);
                    deviceCapability = ai1;
                }
            }
            continue; /* Loop/switch isn't completed */
_L4:
            int l;
            l = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
            j = 0;
            i = codedinputbytebuffernano.getPosition();
_L17:
            if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
            {
                switch (codedinputbytebuffernano.readInt32())
                {
                case 1: // '\001'
                case 2: // '\002'
                case 4: // '\004'
                    j++;
                    break;
                }
                continue; /* Loop/switch isn't completed */
            }
            if (j == 0) goto _L13; else goto _L12
_L12:
            codedinputbytebuffernano.rewindToPosition(i);
            if (deviceCapability == null)
            {
                i = 0;
            } else
            {
                i = deviceCapability.length;
            }
            ai = new int[i + j];
            j = i;
            if (i != 0)
            {
                System.arraycopy(deviceCapability, 0, ai, 0, i);
                j = i;
            }
_L15:
            if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
            {
                i = codedinputbytebuffernano.readInt32();
                switch (i)
                {
                case 1: // '\001'
                case 2: // '\002'
                case 4: // '\004'
                    ai[j] = i;
                    j++;
                    break;
                }
                continue; /* Loop/switch isn't completed */
            }
            deviceCapability = ai;
              goto _L13
            if (true) goto _L15; else goto _L14
_L14:
            if (true) goto _L17; else goto _L16
_L16:
_L13:
            codedinputbytebuffernano.popLimit(l);
            if (true) goto _L19; else goto _L18
_L18:
        }

        protected final int computeSerializedSize()
        {
            int k = super.computeSerializedSize();
            int i = k;
            if (deviceCapability != null)
            {
                i = k;
                if (deviceCapability.length > 0)
                {
                    int j = 0;
                    for (i = 0; i < deviceCapability.length; i++)
                    {
                        j += CodedOutputByteBufferNano.computeInt32SizeNoTag(deviceCapability[i]);
                    }

                    i = k + j + deviceCapability.length * 1;
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
            if (deviceCapability != null && deviceCapability.length > 0)
            {
                for (int i = 0; i < deviceCapability.length; i++)
                {
                    codedoutputbytebuffernano.writeInt32(1, deviceCapability[i]);
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DeviceCapabilityInfo()
        {
            clear();
        }
    }

    public static final class PinInfo extends ExtendableMessageNano
    {

        public Integer badPinAttempts;
        public Long cloudPinGeneration;
        public Boolean cloudPinSet;
        public Boolean deprecatedPinExpired;
        public String localPinHash;
        public Long localSalt;
        public byte pendingSecurePinBytes[];
        public Long pendingSecurePinGeneration;
        public Integer pendingSecurePinVersion;
        public Integer pinTryCounter;
        public Integer pinTryLimit;
        public byte securePinBytes[];
        public Long securePinGeneration;
        public Integer securePinVersion;
        public Long stateTransitionDeltaMs;
        public Long stateTransitionTimestamp;

        private PinInfo clear()
        {
            localSalt = null;
            localPinHash = null;
            badPinAttempts = null;
            deprecatedPinExpired = null;
            stateTransitionTimestamp = null;
            stateTransitionDeltaMs = null;
            securePinVersion = null;
            securePinBytes = null;
            pinTryCounter = null;
            pinTryLimit = null;
            pendingSecurePinVersion = null;
            pendingSecurePinBytes = null;
            pendingSecurePinGeneration = null;
            cloudPinSet = null;
            cloudPinGeneration = null;
            securePinGeneration = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private PinInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    localSalt = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 18: // '\022'
                    localPinHash = codedinputbytebuffernano.readString();
                    break;

                case 24: // '\030'
                    badPinAttempts = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 32: // ' '
                    deprecatedPinExpired = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 40: // '('
                    stateTransitionTimestamp = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 48: // '0'
                    stateTransitionDeltaMs = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 56: // '8'
                    securePinVersion = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 66: // 'B'
                    securePinBytes = codedinputbytebuffernano.readBytes();
                    break;

                case 72: // 'H'
                    pinTryCounter = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 80: // 'P'
                    pinTryLimit = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 88: // 'X'
                    pendingSecurePinVersion = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 98: // 'b'
                    pendingSecurePinBytes = codedinputbytebuffernano.readBytes();
                    break;

                case 104: // 'h'
                    pendingSecurePinGeneration = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 112: // 'p'
                    cloudPinSet = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 120: // 'x'
                    cloudPinGeneration = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 128: 
                    securePinGeneration = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (localSalt != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(1, localSalt.longValue());
            }
            j = i;
            if (localPinHash != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, localPinHash);
            }
            i = j;
            if (badPinAttempts != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, badPinAttempts.intValue());
            }
            j = i;
            if (deprecatedPinExpired != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(4, deprecatedPinExpired.booleanValue());
            }
            i = j;
            if (stateTransitionTimestamp != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(5, stateTransitionTimestamp.longValue());
            }
            j = i;
            if (stateTransitionDeltaMs != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(6, stateTransitionDeltaMs.longValue());
            }
            i = j;
            if (securePinVersion != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(7, securePinVersion.intValue());
            }
            j = i;
            if (securePinBytes != null)
            {
                j = i + CodedOutputByteBufferNano.computeBytesSize(8, securePinBytes);
            }
            i = j;
            if (pinTryCounter != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(9, pinTryCounter.intValue());
            }
            j = i;
            if (pinTryLimit != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(10, pinTryLimit.intValue());
            }
            i = j;
            if (pendingSecurePinVersion != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(11, pendingSecurePinVersion.intValue());
            }
            j = i;
            if (pendingSecurePinBytes != null)
            {
                j = i + CodedOutputByteBufferNano.computeBytesSize(12, pendingSecurePinBytes);
            }
            i = j;
            if (pendingSecurePinGeneration != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(13, pendingSecurePinGeneration.longValue());
            }
            j = i;
            if (cloudPinSet != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(14, cloudPinSet.booleanValue());
            }
            i = j;
            if (cloudPinGeneration != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(15, cloudPinGeneration.longValue());
            }
            j = i;
            if (securePinGeneration != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(16, securePinGeneration.longValue());
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
            if (localSalt != null)
            {
                codedoutputbytebuffernano.writeInt64(1, localSalt.longValue());
            }
            if (localPinHash != null)
            {
                codedoutputbytebuffernano.writeString(2, localPinHash);
            }
            if (badPinAttempts != null)
            {
                codedoutputbytebuffernano.writeInt32(3, badPinAttempts.intValue());
            }
            if (deprecatedPinExpired != null)
            {
                codedoutputbytebuffernano.writeBool(4, deprecatedPinExpired.booleanValue());
            }
            if (stateTransitionTimestamp != null)
            {
                codedoutputbytebuffernano.writeInt64(5, stateTransitionTimestamp.longValue());
            }
            if (stateTransitionDeltaMs != null)
            {
                codedoutputbytebuffernano.writeInt64(6, stateTransitionDeltaMs.longValue());
            }
            if (securePinVersion != null)
            {
                codedoutputbytebuffernano.writeInt32(7, securePinVersion.intValue());
            }
            if (securePinBytes != null)
            {
                codedoutputbytebuffernano.writeBytes(8, securePinBytes);
            }
            if (pinTryCounter != null)
            {
                codedoutputbytebuffernano.writeInt32(9, pinTryCounter.intValue());
            }
            if (pinTryLimit != null)
            {
                codedoutputbytebuffernano.writeInt32(10, pinTryLimit.intValue());
            }
            if (pendingSecurePinVersion != null)
            {
                codedoutputbytebuffernano.writeInt32(11, pendingSecurePinVersion.intValue());
            }
            if (pendingSecurePinBytes != null)
            {
                codedoutputbytebuffernano.writeBytes(12, pendingSecurePinBytes);
            }
            if (pendingSecurePinGeneration != null)
            {
                codedoutputbytebuffernano.writeInt64(13, pendingSecurePinGeneration.longValue());
            }
            if (cloudPinSet != null)
            {
                codedoutputbytebuffernano.writeBool(14, cloudPinSet.booleanValue());
            }
            if (cloudPinGeneration != null)
            {
                codedoutputbytebuffernano.writeInt64(15, cloudPinGeneration.longValue());
            }
            if (securePinGeneration != null)
            {
                codedoutputbytebuffernano.writeInt64(16, securePinGeneration.longValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PinInfo()
        {
            clear();
        }
    }


    public DeviceCapabilityInfo deviceCapabilityInfo;
    public Boolean factoryResetComplete;
    public String gaiaAccount;
    public Long nextLocalId;
    public PinInfo pinInfo;
    public String walletUuid;

    private To clear()
    {
        walletUuid = null;
        nextLocalId = null;
        pinInfo = null;
        gaiaAccount = null;
        factoryResetComplete = null;
        deviceCapabilityInfo = null;
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
                walletUuid = codedinputbytebuffernano.readString();
                break;

            case 16: // '\020'
                nextLocalId = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 26: // '\032'
                if (pinInfo == null)
                {
                    pinInfo = new PinInfo();
                }
                codedinputbytebuffernano.readMessage(pinInfo);
                break;

            case 34: // '"'
                gaiaAccount = codedinputbytebuffernano.readString();
                break;

            case 96: // '`'
                factoryResetComplete = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 210: 
                if (deviceCapabilityInfo == null)
                {
                    deviceCapabilityInfo = new DeviceCapabilityInfo();
                }
                codedinputbytebuffernano.readMessage(deviceCapabilityInfo);
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
        if (nextLocalId != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(2, nextLocalId.longValue());
        }
        i = j;
        if (pinInfo != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, pinInfo);
        }
        j = i;
        if (gaiaAccount != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, gaiaAccount);
        }
        i = j;
        if (factoryResetComplete != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(12, factoryResetComplete.booleanValue());
        }
        j = i;
        if (deviceCapabilityInfo != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(26, deviceCapabilityInfo);
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
        if (nextLocalId != null)
        {
            codedoutputbytebuffernano.writeInt64(2, nextLocalId.longValue());
        }
        if (pinInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(3, pinInfo);
        }
        if (gaiaAccount != null)
        {
            codedoutputbytebuffernano.writeString(4, gaiaAccount);
        }
        if (factoryResetComplete != null)
        {
            codedoutputbytebuffernano.writeBool(12, factoryResetComplete.booleanValue());
        }
        if (deviceCapabilityInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(26, deviceCapabilityInfo);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public PinInfo.clear()
    {
        clear();
    }
}
