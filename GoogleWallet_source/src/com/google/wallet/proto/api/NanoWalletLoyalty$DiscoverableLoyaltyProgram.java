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

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletLoyalty

public static final class clear extends ExtendableMessageNano
{
    public static final class LinkingInfo extends ExtendableMessageNano
    {

        public Boolean enableCamera;
        public String identifierLabel;
        public Integer identifierTypeOrdinal;
        public NanoWalletLoyalty.SharedDataConfig sharedDataConfigs[];

        private LinkingInfo clear()
        {
            identifierTypeOrdinal = null;
            identifierLabel = null;
            enableCamera = null;
            sharedDataConfigs = NanoWalletLoyalty.SharedDataConfig.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private LinkingInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    identifierTypeOrdinal = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 18: // '\022'
                    identifierLabel = codedinputbytebuffernano.readString();
                    break;

                case 24: // '\030'
                    enableCamera = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 34: // '"'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                    NanoWalletLoyalty.SharedDataConfig ashareddataconfig[];
                    int j;
                    if (sharedDataConfigs == null)
                    {
                        j = 0;
                    } else
                    {
                        j = sharedDataConfigs.length;
                    }
                    ashareddataconfig = new NanoWalletLoyalty.SharedDataConfig[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(sharedDataConfigs, 0, ashareddataconfig, 0, j);
                        k = j;
                    }
                    for (; k < ashareddataconfig.length - 1; k++)
                    {
                        ashareddataconfig[k] = new NanoWalletLoyalty.SharedDataConfig();
                        codedinputbytebuffernano.readMessage(ashareddataconfig[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    ashareddataconfig[k] = new NanoWalletLoyalty.SharedDataConfig();
                    codedinputbytebuffernano.readMessage(ashareddataconfig[k]);
                    sharedDataConfigs = ashareddataconfig;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (identifierTypeOrdinal != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, identifierTypeOrdinal.intValue());
            }
            j = i;
            if (identifierLabel != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, identifierLabel);
            }
            i = j;
            if (enableCamera != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(3, enableCamera.booleanValue());
            }
            int l = i;
            if (sharedDataConfigs != null)
            {
                l = i;
                if (sharedDataConfigs.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= sharedDataConfigs.length)
                        {
                            break;
                        }
                        NanoWalletLoyalty.SharedDataConfig shareddataconfig = sharedDataConfigs[k];
                        l = i;
                        if (shareddataconfig != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(4, shareddataconfig);
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
            if (identifierTypeOrdinal != null)
            {
                codedoutputbytebuffernano.writeInt32(1, identifierTypeOrdinal.intValue());
            }
            if (identifierLabel != null)
            {
                codedoutputbytebuffernano.writeString(2, identifierLabel);
            }
            if (enableCamera != null)
            {
                codedoutputbytebuffernano.writeBool(3, enableCamera.booleanValue());
            }
            if (sharedDataConfigs != null && sharedDataConfigs.length > 0)
            {
                for (int i = 0; i < sharedDataConfigs.length; i++)
                {
                    NanoWalletLoyalty.SharedDataConfig shareddataconfig = sharedDataConfigs[i];
                    if (shareddataconfig != null)
                    {
                        codedoutputbytebuffernano.writeMessage(4, shareddataconfig);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LinkingInfo()
        {
            clear();
        }
    }

    public static final class NativeRenderingInfo extends ExtendableMessageNano
    {

        public String logoImageUrl;
        public String merchantName;
        public String programName;

        private NativeRenderingInfo clear()
        {
            programName = null;
            merchantName = null;
            logoImageUrl = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private NativeRenderingInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    programName = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    merchantName = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    logoImageUrl = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (programName != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, programName);
            }
            j = i;
            if (merchantName != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, merchantName);
            }
            i = j;
            if (logoImageUrl != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, logoImageUrl);
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
            if (programName != null)
            {
                codedoutputbytebuffernano.writeString(1, programName);
            }
            if (merchantName != null)
            {
                codedoutputbytebuffernano.writeString(2, merchantName);
            }
            if (logoImageUrl != null)
            {
                codedoutputbytebuffernano.writeString(3, logoImageUrl);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public NativeRenderingInfo()
        {
            clear();
        }
    }

    public static final class SignupInfo extends ExtendableMessageNano
    {

        public Boolean marketingOptInDefault;
        public NanoWalletLoyalty.SharedDataConfig sharedDataConfigs[];
        public String signupIncentive;

        private SignupInfo clear()
        {
            sharedDataConfigs = NanoWalletLoyalty.SharedDataConfig.emptyArray();
            signupIncentive = null;
            marketingOptInDefault = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private SignupInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    NanoWalletLoyalty.SharedDataConfig ashareddataconfig[];
                    int j;
                    if (sharedDataConfigs == null)
                    {
                        j = 0;
                    } else
                    {
                        j = sharedDataConfigs.length;
                    }
                    ashareddataconfig = new NanoWalletLoyalty.SharedDataConfig[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(sharedDataConfigs, 0, ashareddataconfig, 0, j);
                        k = j;
                    }
                    for (; k < ashareddataconfig.length - 1; k++)
                    {
                        ashareddataconfig[k] = new NanoWalletLoyalty.SharedDataConfig();
                        codedinputbytebuffernano.readMessage(ashareddataconfig[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    ashareddataconfig[k] = new NanoWalletLoyalty.SharedDataConfig();
                    codedinputbytebuffernano.readMessage(ashareddataconfig[k]);
                    sharedDataConfigs = ashareddataconfig;
                    break;

                case 18: // '\022'
                    signupIncentive = codedinputbytebuffernano.readString();
                    break;

                case 24: // '\030'
                    marketingOptInDefault = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (sharedDataConfigs != null)
            {
                j = i;
                if (sharedDataConfigs.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= sharedDataConfigs.length)
                        {
                            break;
                        }
                        NanoWalletLoyalty.SharedDataConfig shareddataconfig = sharedDataConfigs[k];
                        j = i;
                        if (shareddataconfig != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(1, shareddataconfig);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (signupIncentive != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(2, signupIncentive);
            }
            j = i;
            if (marketingOptInDefault != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(3, marketingOptInDefault.booleanValue());
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
            if (sharedDataConfigs != null && sharedDataConfigs.length > 0)
            {
                for (int i = 0; i < sharedDataConfigs.length; i++)
                {
                    NanoWalletLoyalty.SharedDataConfig shareddataconfig = sharedDataConfigs[i];
                    if (shareddataconfig != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, shareddataconfig);
                    }
                }

            }
            if (signupIncentive != null)
            {
                codedoutputbytebuffernano.writeString(2, signupIncentive);
            }
            if (marketingOptInDefault != null)
            {
                codedoutputbytebuffernano.writeBool(3, marketingOptInDefault.booleanValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SignupInfo()
        {
            clear();
        }
    }


    private static volatile renderOutput _emptyArray[];
    public LinkingInfo linkingInfo;
    public Boolean linkingSupported;
    public NativeRenderingInfo nativeRenderingInfo;
    public String privacyUrl;
    public String programDetailUrl;
    public String programId;
    public com.google.wallet.proto.ram.NativeRenderingInfo renderOutput;
    public SignupInfo signupInfo;
    public Boolean signupSupported;
    public Integer status;
    public String tosUrl;

    private SignupInfo.marketingOptInDefault clear()
    {
        programId = null;
        programDetailUrl = null;
        linkingSupported = null;
        linkingInfo = null;
        signupSupported = null;
        signupInfo = null;
        nativeRenderingInfo = null;
        tosUrl = null;
        status = null;
        privacyUrl = null;
        renderOutput = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    public static cachedSize[] emptyArray()
    {
        if (_emptyArray == null)
        {
            synchronized (InternalNano.LAZY_INIT_LOCK)
            {
                if (_emptyArray == null)
                {
                    _emptyArray = new _emptyArray[0];
                }
            }
        }
        return _emptyArray;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private _emptyArray mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L14:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 12: default 112
    //                   0: 121
    //                   10: 123
    //                   18: 134
    //                   24: 145
    //                   34: 159
    //                   40: 188
    //                   50: 202
    //                   58: 231
    //                   66: 260
    //                   72: 271
    //                   82: 326
    //                   90: 337;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L14; else goto _L2
_L2:
        return this;
_L3:
        programId = codedinputbytebuffernano.readString();
          goto _L14
_L4:
        programDetailUrl = codedinputbytebuffernano.readString();
          goto _L14
_L5:
        linkingSupported = Boolean.valueOf(codedinputbytebuffernano.readBool());
          goto _L14
_L6:
        if (linkingInfo == null)
        {
            linkingInfo = new LinkingInfo();
        }
        codedinputbytebuffernano.readMessage(linkingInfo);
          goto _L14
_L7:
        signupSupported = Boolean.valueOf(codedinputbytebuffernano.readBool());
          goto _L14
_L8:
        if (signupInfo == null)
        {
            signupInfo = new SignupInfo();
        }
        codedinputbytebuffernano.readMessage(signupInfo);
          goto _L14
_L9:
        if (nativeRenderingInfo == null)
        {
            nativeRenderingInfo = new NativeRenderingInfo();
        }
        codedinputbytebuffernano.readMessage(nativeRenderingInfo);
          goto _L14
_L10:
        tosUrl = codedinputbytebuffernano.readString();
          goto _L14
_L11:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            status = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L12:
        privacyUrl = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L13:
        if (renderOutput == null)
        {
            renderOutput = new com.google.wallet.proto.ram.renderOutput();
        }
        codedinputbytebuffernano.readMessage(renderOutput);
        if (true) goto _L14; else goto _L15
_L15:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (programId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, programId);
        }
        j = i;
        if (programDetailUrl != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, programDetailUrl);
        }
        i = j;
        if (linkingSupported != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(3, linkingSupported.booleanValue());
        }
        j = i;
        if (linkingInfo != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, linkingInfo);
        }
        i = j;
        if (signupSupported != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(5, signupSupported.booleanValue());
        }
        j = i;
        if (signupInfo != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(6, signupInfo);
        }
        i = j;
        if (nativeRenderingInfo != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(7, nativeRenderingInfo);
        }
        j = i;
        if (tosUrl != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(8, tosUrl);
        }
        i = j;
        if (status != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(9, status.intValue());
        }
        j = i;
        if (privacyUrl != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(10, privacyUrl);
        }
        i = j;
        if (renderOutput != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(11, renderOutput);
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
        if (programId != null)
        {
            codedoutputbytebuffernano.writeString(1, programId);
        }
        if (programDetailUrl != null)
        {
            codedoutputbytebuffernano.writeString(2, programDetailUrl);
        }
        if (linkingSupported != null)
        {
            codedoutputbytebuffernano.writeBool(3, linkingSupported.booleanValue());
        }
        if (linkingInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(4, linkingInfo);
        }
        if (signupSupported != null)
        {
            codedoutputbytebuffernano.writeBool(5, signupSupported.booleanValue());
        }
        if (signupInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(6, signupInfo);
        }
        if (nativeRenderingInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(7, nativeRenderingInfo);
        }
        if (tosUrl != null)
        {
            codedoutputbytebuffernano.writeString(8, tosUrl);
        }
        if (status != null)
        {
            codedoutputbytebuffernano.writeInt32(9, status.intValue());
        }
        if (privacyUrl != null)
        {
            codedoutputbytebuffernano.writeString(10, privacyUrl);
        }
        if (renderOutput != null)
        {
            codedoutputbytebuffernano.writeMessage(11, renderOutput);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public SignupInfo.clear()
    {
        clear();
    }
}
