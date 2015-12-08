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

public interface NanoWalletFrontingInstrument
{
    public static final class ActivatePlasticCardRequest extends ExtendableMessageNano
    {

        public String cardNumberLast4;
        public com.google.wallet.proto.NanoWalletEntities.CdpIdData proxyCardId;

        private ActivatePlasticCardRequest clear()
        {
            proxyCardId = null;
            cardNumberLast4 = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ActivatePlasticCardRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (proxyCardId == null)
                    {
                        proxyCardId = new com.google.wallet.proto.NanoWalletEntities.CdpIdData();
                    }
                    codedinputbytebuffernano.readMessage(proxyCardId);
                    break;

                case 18: // '\022'
                    cardNumberLast4 = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (proxyCardId != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, proxyCardId);
            }
            j = i;
            if (cardNumberLast4 != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, cardNumberLast4);
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
            if (proxyCardId != null)
            {
                codedoutputbytebuffernano.writeMessage(1, proxyCardId);
            }
            if (cardNumberLast4 != null)
            {
                codedoutputbytebuffernano.writeString(2, cardNumberLast4);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ActivatePlasticCardRequest()
        {
            clear();
        }
    }

    public static final class ActivatePlasticCardResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo frontingInstrumentInfo;

        private ActivatePlasticCardResponse clear()
        {
            callError = null;
            frontingInstrumentInfo = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ActivatePlasticCardResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

                case 26: // '\032'
                    if (callError == null)
                    {
                        callError = new com.google.wallet.proto.NanoWalletError.CallError();
                    }
                    codedinputbytebuffernano.readMessage(callError);
                    break;

                case 34: // '"'
                    if (frontingInstrumentInfo == null)
                    {
                        frontingInstrumentInfo = new com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo();
                    }
                    codedinputbytebuffernano.readMessage(frontingInstrumentInfo);
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
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, callError);
            }
            j = i;
            if (frontingInstrumentInfo != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, frontingInstrumentInfo);
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
                codedoutputbytebuffernano.writeMessage(3, callError);
            }
            if (frontingInstrumentInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(4, frontingInstrumentInfo);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ActivatePlasticCardResponse()
        {
            clear();
        }
    }

    public static final class CancelPlasticCardRequest extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletEntities.CdpIdData proxyCardId;
        public com.google.wallet.proto.NanoWalletEntities.CancelPlasticCardReason reason;

        private CancelPlasticCardRequest clear()
        {
            proxyCardId = null;
            reason = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private CancelPlasticCardRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (proxyCardId == null)
                    {
                        proxyCardId = new com.google.wallet.proto.NanoWalletEntities.CdpIdData();
                    }
                    codedinputbytebuffernano.readMessage(proxyCardId);
                    break;

                case 18: // '\022'
                    if (reason == null)
                    {
                        reason = new com.google.wallet.proto.NanoWalletEntities.CancelPlasticCardReason();
                    }
                    codedinputbytebuffernano.readMessage(reason);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (proxyCardId != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, proxyCardId);
            }
            j = i;
            if (reason != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, reason);
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
            if (proxyCardId != null)
            {
                codedoutputbytebuffernano.writeMessage(1, proxyCardId);
            }
            if (reason != null)
            {
                codedoutputbytebuffernano.writeMessage(2, reason);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public CancelPlasticCardRequest()
        {
            clear();
        }
    }

    public static final class CancelPlasticCardResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public com.google.wallet.proto.NanoWalletEntities.PlasticProxyCardDetails plasticProxyCardDetails;

        private CancelPlasticCardResponse clear()
        {
            callError = null;
            plasticProxyCardDetails = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private CancelPlasticCardResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (plasticProxyCardDetails == null)
                    {
                        plasticProxyCardDetails = new com.google.wallet.proto.NanoWalletEntities.PlasticProxyCardDetails();
                    }
                    codedinputbytebuffernano.readMessage(plasticProxyCardDetails);
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
            if (plasticProxyCardDetails != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, plasticProxyCardDetails);
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
            if (plasticProxyCardDetails != null)
            {
                codedoutputbytebuffernano.writeMessage(2, plasticProxyCardDetails);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public CancelPlasticCardResponse()
        {
            clear();
        }
    }

    public static final class CreatePaymentBundleRequest extends ExtendableMessageNano
    {

        public Integer bundleType;
        public Long clientTimeMillisSinceEpoch;
        public byte encryptedKeyczarSessionMaterial[];

        private CreatePaymentBundleRequest clear()
        {
            encryptedKeyczarSessionMaterial = null;
            clientTimeMillisSinceEpoch = null;
            bundleType = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private CreatePaymentBundleRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L6:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 57
        //                       10: 59
        //                       16: 70
        //                       24: 84;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
            encryptedKeyczarSessionMaterial = codedinputbytebuffernano.readBytes();
              goto _L6
_L4:
            clientTimeMillisSinceEpoch = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L6
_L5:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 2: // '\002'
            case 4: // '\004'
                bundleType = Integer.valueOf(j);
                break;
            }
            if (true) goto _L6; else goto _L7
_L7:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (encryptedKeyczarSessionMaterial != null)
            {
                i = j + CodedOutputByteBufferNano.computeBytesSize(1, encryptedKeyczarSessionMaterial);
            }
            j = i;
            if (clientTimeMillisSinceEpoch != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(2, clientTimeMillisSinceEpoch.longValue());
            }
            i = j;
            if (bundleType != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, bundleType.intValue());
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
            if (encryptedKeyczarSessionMaterial != null)
            {
                codedoutputbytebuffernano.writeBytes(1, encryptedKeyczarSessionMaterial);
            }
            if (clientTimeMillisSinceEpoch != null)
            {
                codedoutputbytebuffernano.writeInt64(2, clientTimeMillisSinceEpoch.longValue());
            }
            if (bundleType != null)
            {
                codedoutputbytebuffernano.writeInt32(3, bundleType.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public CreatePaymentBundleRequest()
        {
            clear();
        }
    }

    public static final class CreatePaymentBundleResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public byte encryptedPaymentBundle[];
        public com.google.wallet.proto.features.NanoWalletHce.Metadata metadata;

        private CreatePaymentBundleResponse clear()
        {
            callError = null;
            encryptedPaymentBundle = null;
            metadata = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private CreatePaymentBundleResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    encryptedPaymentBundle = codedinputbytebuffernano.readBytes();
                    break;

                case 26: // '\032'
                    if (metadata == null)
                    {
                        metadata = new com.google.wallet.proto.features.NanoWalletHce.Metadata();
                    }
                    codedinputbytebuffernano.readMessage(metadata);
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
            if (encryptedPaymentBundle != null)
            {
                j = i + CodedOutputByteBufferNano.computeBytesSize(2, encryptedPaymentBundle);
            }
            i = j;
            if (metadata != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, metadata);
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
            if (encryptedPaymentBundle != null)
            {
                codedoutputbytebuffernano.writeBytes(2, encryptedPaymentBundle);
            }
            if (metadata != null)
            {
                codedoutputbytebuffernano.writeMessage(3, metadata);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public CreatePaymentBundleResponse()
        {
            clear();
        }
    }

    public static final class GetFrontingInstrumentInfoRequest extends ExtendableMessageNano
    {

        private GetFrontingInstrumentInfoRequest clear()
        {
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetFrontingInstrumentInfoRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public GetFrontingInstrumentInfoRequest()
        {
            clear();
        }
    }

    public static final class GetFrontingInstrumentInfoResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo frontingInstrumentInfo;

        private GetFrontingInstrumentInfoResponse clear()
        {
            callError = null;
            frontingInstrumentInfo = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetFrontingInstrumentInfoResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (frontingInstrumentInfo == null)
                    {
                        frontingInstrumentInfo = new com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo();
                    }
                    codedinputbytebuffernano.readMessage(frontingInstrumentInfo);
                    break;

                case 26: // '\032'
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
            if (frontingInstrumentInfo != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, frontingInstrumentInfo);
            }
            j = i;
            if (callError != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(3, callError);
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
            if (frontingInstrumentInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(1, frontingInstrumentInfo);
            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(3, callError);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GetFrontingInstrumentInfoResponse()
        {
            clear();
        }
    }

    public static final class IssuePlasticCardRequest extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletEntities.Address shippingAddress;

        private IssuePlasticCardRequest clear()
        {
            shippingAddress = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private IssuePlasticCardRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (shippingAddress == null)
                    {
                        shippingAddress = new com.google.wallet.proto.NanoWalletEntities.Address();
                    }
                    codedinputbytebuffernano.readMessage(shippingAddress);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (shippingAddress != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(2, shippingAddress);
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
            if (shippingAddress != null)
            {
                codedoutputbytebuffernano.writeMessage(2, shippingAddress);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public IssuePlasticCardRequest()
        {
            clear();
        }
    }

    public static final class IssuePlasticCardResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo frontingInstrumentInfo;

        private IssuePlasticCardResponse clear()
        {
            callError = null;
            frontingInstrumentInfo = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private IssuePlasticCardResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

                case 26: // '\032'
                    if (callError == null)
                    {
                        callError = new com.google.wallet.proto.NanoWalletError.CallError();
                    }
                    codedinputbytebuffernano.readMessage(callError);
                    break;

                case 34: // '"'
                    if (frontingInstrumentInfo == null)
                    {
                        frontingInstrumentInfo = new com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo();
                    }
                    codedinputbytebuffernano.readMessage(frontingInstrumentInfo);
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
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, callError);
            }
            j = i;
            if (frontingInstrumentInfo != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, frontingInstrumentInfo);
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
                codedoutputbytebuffernano.writeMessage(3, callError);
            }
            if (frontingInstrumentInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(4, frontingInstrumentInfo);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public IssuePlasticCardResponse()
        {
            clear();
        }
    }

    public static final class LockPlasticCardRequest extends ExtendableMessageNano
    {

        public String proxyCardSubId;

        private LockPlasticCardRequest clear()
        {
            proxyCardSubId = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private LockPlasticCardRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    proxyCardSubId = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (proxyCardSubId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, proxyCardSubId);
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
            if (proxyCardSubId != null)
            {
                codedoutputbytebuffernano.writeString(1, proxyCardSubId);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LockPlasticCardRequest()
        {
            clear();
        }
    }

    public static final class LockPlasticCardResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public com.google.wallet.proto.NanoWalletEntities.PlasticProxyCardDetails plasticProxyCardDetails;

        private LockPlasticCardResponse clear()
        {
            callError = null;
            plasticProxyCardDetails = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private LockPlasticCardResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (plasticProxyCardDetails == null)
                    {
                        plasticProxyCardDetails = new com.google.wallet.proto.NanoWalletEntities.PlasticProxyCardDetails();
                    }
                    codedinputbytebuffernano.readMessage(plasticProxyCardDetails);
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
            if (plasticProxyCardDetails != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, plasticProxyCardDetails);
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
            if (plasticProxyCardDetails != null)
            {
                codedoutputbytebuffernano.writeMessage(2, plasticProxyCardDetails);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LockPlasticCardResponse()
        {
            clear();
        }
    }

    public static final class SetFundingSourcesRequest extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletEntities.CdpIdData backingInstrumentIds[];

        private SetFundingSourcesRequest clear()
        {
            backingInstrumentIds = com.google.wallet.proto.NanoWalletEntities.CdpIdData.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private SetFundingSourcesRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    com.google.wallet.proto.NanoWalletEntities.CdpIdData acdpiddata[];
                    int j;
                    if (backingInstrumentIds == null)
                    {
                        j = 0;
                    } else
                    {
                        j = backingInstrumentIds.length;
                    }
                    acdpiddata = new com.google.wallet.proto.NanoWalletEntities.CdpIdData[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(backingInstrumentIds, 0, acdpiddata, 0, j);
                        k = j;
                    }
                    for (; k < acdpiddata.length - 1; k++)
                    {
                        acdpiddata[k] = new com.google.wallet.proto.NanoWalletEntities.CdpIdData();
                        codedinputbytebuffernano.readMessage(acdpiddata[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    acdpiddata[k] = new com.google.wallet.proto.NanoWalletEntities.CdpIdData();
                    codedinputbytebuffernano.readMessage(acdpiddata[k]);
                    backingInstrumentIds = acdpiddata;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int k = i;
            if (backingInstrumentIds != null)
            {
                k = i;
                if (backingInstrumentIds.length > 0)
                {
                    int j = 0;
                    do
                    {
                        k = i;
                        if (j >= backingInstrumentIds.length)
                        {
                            break;
                        }
                        com.google.wallet.proto.NanoWalletEntities.CdpIdData cdpiddata = backingInstrumentIds[j];
                        k = i;
                        if (cdpiddata != null)
                        {
                            k = i + CodedOutputByteBufferNano.computeMessageSize(1, cdpiddata);
                        }
                        j++;
                        i = k;
                    } while (true);
                }
            }
            return k;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (backingInstrumentIds != null && backingInstrumentIds.length > 0)
            {
                for (int i = 0; i < backingInstrumentIds.length; i++)
                {
                    com.google.wallet.proto.NanoWalletEntities.CdpIdData cdpiddata = backingInstrumentIds[i];
                    if (cdpiddata != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, cdpiddata);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SetFundingSourcesRequest()
        {
            clear();
        }
    }

    public static final class SetFundingSourcesResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo frontingInstrumentInfo;

        private SetFundingSourcesResponse clear()
        {
            callError = null;
            frontingInstrumentInfo = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private SetFundingSourcesResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (frontingInstrumentInfo == null)
                    {
                        frontingInstrumentInfo = new com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo();
                    }
                    codedinputbytebuffernano.readMessage(frontingInstrumentInfo);
                    break;

                case 26: // '\032'
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
            if (frontingInstrumentInfo != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, frontingInstrumentInfo);
            }
            j = i;
            if (callError != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(3, callError);
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
            if (frontingInstrumentInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(1, frontingInstrumentInfo);
            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(3, callError);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SetFundingSourcesResponse()
        {
            clear();
        }
    }

    public static final class UnlockPlasticCardRequest extends ExtendableMessageNano
    {

        public String proxyCardSubId;

        private UnlockPlasticCardRequest clear()
        {
            proxyCardSubId = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private UnlockPlasticCardRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    proxyCardSubId = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (proxyCardSubId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, proxyCardSubId);
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
            if (proxyCardSubId != null)
            {
                codedoutputbytebuffernano.writeString(1, proxyCardSubId);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public UnlockPlasticCardRequest()
        {
            clear();
        }
    }

    public static final class UnlockPlasticCardResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public com.google.wallet.proto.NanoWalletEntities.PlasticProxyCardDetails plasticProxyCardDetails;

        private UnlockPlasticCardResponse clear()
        {
            callError = null;
            plasticProxyCardDetails = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private UnlockPlasticCardResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (plasticProxyCardDetails == null)
                    {
                        plasticProxyCardDetails = new com.google.wallet.proto.NanoWalletEntities.PlasticProxyCardDetails();
                    }
                    codedinputbytebuffernano.readMessage(plasticProxyCardDetails);
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
            if (plasticProxyCardDetails != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, plasticProxyCardDetails);
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
            if (plasticProxyCardDetails != null)
            {
                codedoutputbytebuffernano.writeMessage(2, plasticProxyCardDetails);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public UnlockPlasticCardResponse()
        {
            clear();
        }
    }

}
