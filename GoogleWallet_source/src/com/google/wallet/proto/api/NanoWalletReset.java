// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

public interface NanoWalletReset
{
    public static final class ResetRequest extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletShared.DeviceContext deviceContext;

        private ResetRequest clear()
        {
            deviceContext = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ResetRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
            if (deviceContext != null)
            {
                codedoutputbytebuffernano.writeMessage(1, deviceContext);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ResetRequest()
        {
            clear();
        }
    }

    public static final class ResetResponse extends ExtendableMessageNano
    {

        private ResetResponse clear()
        {
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ResetResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public ResetResponse()
        {
            clear();
        }
    }

}
