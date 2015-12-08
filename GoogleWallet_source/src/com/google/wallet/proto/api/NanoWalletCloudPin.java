// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

public interface NanoWalletCloudPin
{
    public static final class PinChangeRequest extends ExtendableMessageNano
    {

        public Long currentClientTime;
        public com.google.wallet.proto.NanoWalletShared.ClientEncryptedData newEncryptedPin;
        public com.google.wallet.proto.NanoWalletShared.ClientEncryptedData oldEncryptedPin;

        private PinChangeRequest clear()
        {
            oldEncryptedPin = null;
            newEncryptedPin = null;
            currentClientTime = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private PinChangeRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

                case 42: // '*'
                    if (oldEncryptedPin == null)
                    {
                        oldEncryptedPin = new com.google.wallet.proto.NanoWalletShared.ClientEncryptedData();
                    }
                    codedinputbytebuffernano.readMessage(oldEncryptedPin);
                    break;

                case 50: // '2'
                    if (newEncryptedPin == null)
                    {
                        newEncryptedPin = new com.google.wallet.proto.NanoWalletShared.ClientEncryptedData();
                    }
                    codedinputbytebuffernano.readMessage(newEncryptedPin);
                    break;

                case 56: // '8'
                    currentClientTime = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (oldEncryptedPin != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, oldEncryptedPin);
            }
            j = i;
            if (newEncryptedPin != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(6, newEncryptedPin);
            }
            i = j;
            if (currentClientTime != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(7, currentClientTime.longValue());
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
            if (oldEncryptedPin != null)
            {
                codedoutputbytebuffernano.writeMessage(5, oldEncryptedPin);
            }
            if (newEncryptedPin != null)
            {
                codedoutputbytebuffernano.writeMessage(6, newEncryptedPin);
            }
            if (currentClientTime != null)
            {
                codedoutputbytebuffernano.writeInt64(7, currentClientTime.longValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PinChangeRequest()
        {
            clear();
        }
    }

    public static final class PinChangeResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public Long pinGeneration;
        public com.google.wallet.proto.NanoWalletEntities.PinToken pinToken;

        private PinChangeResponse clear()
        {
            callError = null;
            pinGeneration = null;
            pinToken = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private PinChangeResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    pinGeneration = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 18: // '\022'
                    if (pinToken == null)
                    {
                        pinToken = new com.google.wallet.proto.NanoWalletEntities.PinToken();
                    }
                    codedinputbytebuffernano.readMessage(pinToken);
                    break;

                case 802: 
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
            if (pinGeneration != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(1, pinGeneration.longValue());
            }
            j = i;
            if (pinToken != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, pinToken);
            }
            i = j;
            if (callError != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(100, callError);
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
            if (pinGeneration != null)
            {
                codedoutputbytebuffernano.writeInt64(1, pinGeneration.longValue());
            }
            if (pinToken != null)
            {
                codedoutputbytebuffernano.writeMessage(2, pinToken);
            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(100, callError);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PinChangeResponse()
        {
            clear();
        }
    }

    public static final class PinExistsRequest extends ExtendableMessageNano
    {

        public Boolean usePaymentsPin;

        private PinExistsRequest clear()
        {
            usePaymentsPin = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private PinExistsRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    usePaymentsPin = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (usePaymentsPin != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(1, usePaymentsPin.booleanValue());
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
            if (usePaymentsPin != null)
            {
                codedoutputbytebuffernano.writeBool(1, usePaymentsPin.booleanValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PinExistsRequest()
        {
            clear();
        }
    }

    public static final class PinExistsResponse extends ExtendableMessageNano
    {

        public Boolean pinExists;

        private PinExistsResponse clear()
        {
            pinExists = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private PinExistsResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    pinExists = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (pinExists != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(1, pinExists.booleanValue());
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
            if (pinExists != null)
            {
                codedoutputbytebuffernano.writeBool(1, pinExists.booleanValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PinExistsResponse()
        {
            clear();
        }
    }

    public static final class PinVerifyRequest extends ExtendableMessageNano
    {

        public Long currentClientTime;
        public com.google.wallet.proto.NanoWalletShared.ClientEncryptedData encryptedPin;
        public String versionInfo;

        private PinVerifyRequest clear()
        {
            encryptedPin = null;
            currentClientTime = null;
            versionInfo = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private PinVerifyRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    currentClientTime = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 26: // '\032'
                    versionInfo = codedinputbytebuffernano.readString();
                    break;

                case 42: // '*'
                    if (encryptedPin == null)
                    {
                        encryptedPin = new com.google.wallet.proto.NanoWalletShared.ClientEncryptedData();
                    }
                    codedinputbytebuffernano.readMessage(encryptedPin);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (currentClientTime != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(2, currentClientTime.longValue());
            }
            j = i;
            if (versionInfo != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(3, versionInfo);
            }
            i = j;
            if (encryptedPin != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, encryptedPin);
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
            if (currentClientTime != null)
            {
                codedoutputbytebuffernano.writeInt64(2, currentClientTime.longValue());
            }
            if (versionInfo != null)
            {
                codedoutputbytebuffernano.writeString(3, versionInfo);
            }
            if (encryptedPin != null)
            {
                codedoutputbytebuffernano.writeMessage(5, encryptedPin);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PinVerifyRequest()
        {
            clear();
        }
    }

    public static final class PinVerifyResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public Long pinGeneration;
        public com.google.wallet.proto.NanoWalletEntities.PinToken pinToken;

        private PinVerifyResponse clear()
        {
            callError = null;
            pinToken = null;
            pinGeneration = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private PinVerifyResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (pinToken == null)
                    {
                        pinToken = new com.google.wallet.proto.NanoWalletEntities.PinToken();
                    }
                    codedinputbytebuffernano.readMessage(pinToken);
                    break;

                case 16: // '\020'
                    pinGeneration = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 802: 
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
            if (pinToken != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, pinToken);
            }
            j = i;
            if (pinGeneration != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(2, pinGeneration.longValue());
            }
            i = j;
            if (callError != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(100, callError);
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
            if (pinToken != null)
            {
                codedoutputbytebuffernano.writeMessage(1, pinToken);
            }
            if (pinGeneration != null)
            {
                codedoutputbytebuffernano.writeInt64(2, pinGeneration.longValue());
            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(100, callError);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PinVerifyResponse()
        {
            clear();
        }
    }

    public static final class SetPinRequest extends ExtendableMessageNano
    {

        public Long currentClientTime;
        public com.google.wallet.proto.NanoWalletShared.ClientEncryptedData encryptedPin;
        public Boolean requirePinForWebP2P;

        private SetPinRequest clear()
        {
            encryptedPin = null;
            currentClientTime = null;
            requirePinForWebP2P = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private SetPinRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (encryptedPin == null)
                    {
                        encryptedPin = new com.google.wallet.proto.NanoWalletShared.ClientEncryptedData();
                    }
                    codedinputbytebuffernano.readMessage(encryptedPin);
                    break;

                case 32: // ' '
                    currentClientTime = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 40: // '('
                    requirePinForWebP2P = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (encryptedPin != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, encryptedPin);
            }
            j = i;
            if (currentClientTime != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(4, currentClientTime.longValue());
            }
            i = j;
            if (requirePinForWebP2P != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(5, requirePinForWebP2P.booleanValue());
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
            if (encryptedPin != null)
            {
                codedoutputbytebuffernano.writeMessage(3, encryptedPin);
            }
            if (currentClientTime != null)
            {
                codedoutputbytebuffernano.writeInt64(4, currentClientTime.longValue());
            }
            if (requirePinForWebP2P != null)
            {
                codedoutputbytebuffernano.writeBool(5, requirePinForWebP2P.booleanValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SetPinRequest()
        {
            clear();
        }
    }

    public static final class SetPinResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public Long pinGeneration;
        public com.google.wallet.proto.NanoWalletEntities.PinToken pinToken;

        private SetPinResponse clear()
        {
            callError = null;
            pinGeneration = null;
            pinToken = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private SetPinResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    pinGeneration = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 18: // '\022'
                    if (pinToken == null)
                    {
                        pinToken = new com.google.wallet.proto.NanoWalletEntities.PinToken();
                    }
                    codedinputbytebuffernano.readMessage(pinToken);
                    break;

                case 802: 
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
            if (pinGeneration != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(1, pinGeneration.longValue());
            }
            j = i;
            if (pinToken != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, pinToken);
            }
            i = j;
            if (callError != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(100, callError);
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
            if (pinGeneration != null)
            {
                codedoutputbytebuffernano.writeInt64(1, pinGeneration.longValue());
            }
            if (pinToken != null)
            {
                codedoutputbytebuffernano.writeMessage(2, pinToken);
            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(100, callError);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SetPinResponse()
        {
            clear();
        }
    }

}
