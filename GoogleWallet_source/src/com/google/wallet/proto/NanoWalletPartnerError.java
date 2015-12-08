// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

public interface NanoWalletPartnerError
{
    public static final class Error extends ExtendableMessageNano
    {

        public Integer errorBehavior;
        public String errorCode;
        public String errorMessage;
        public String underlyingPartnerCode;
        public String underlyingPartnerMessage;
        public String underlyingTollgateError;
        public String underlyingTollgateErrorDetails;
        public String underlyingTollgatePartnerId;
        public String underlyingTollgateRequestName;

        private Error clear()
        {
            errorCode = null;
            errorMessage = null;
            errorBehavior = null;
            underlyingTollgateError = null;
            underlyingTollgateErrorDetails = null;
            underlyingPartnerCode = null;
            underlyingPartnerMessage = null;
            underlyingTollgatePartnerId = null;
            underlyingTollgateRequestName = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private Error mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L12:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 10: default 96
        //                       0: 105
        //                       10: 107
        //                       18: 118
        //                       24: 129
        //                       34: 174
        //                       42: 185
        //                       50: 196
        //                       58: 207
        //                       66: 218
        //                       74: 229;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L12; else goto _L2
_L2:
            return this;
_L3:
            errorCode = codedinputbytebuffernano.readString();
              goto _L12
_L4:
            errorMessage = codedinputbytebuffernano.readString();
              goto _L12
_L5:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                errorBehavior = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L6:
            underlyingTollgateError = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L7:
            underlyingTollgateErrorDetails = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L8:
            underlyingPartnerCode = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L9:
            underlyingPartnerMessage = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L10:
            underlyingTollgatePartnerId = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L11:
            underlyingTollgateRequestName = codedinputbytebuffernano.readString();
            if (true) goto _L12; else goto _L13
_L13:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (errorCode != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, errorCode);
            }
            j = i;
            if (errorMessage != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, errorMessage);
            }
            i = j;
            if (errorBehavior != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, errorBehavior.intValue());
            }
            j = i;
            if (underlyingTollgateError != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, underlyingTollgateError);
            }
            i = j;
            if (underlyingTollgateErrorDetails != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, underlyingTollgateErrorDetails);
            }
            j = i;
            if (underlyingPartnerCode != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, underlyingPartnerCode);
            }
            i = j;
            if (underlyingPartnerMessage != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(7, underlyingPartnerMessage);
            }
            j = i;
            if (underlyingTollgatePartnerId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(8, underlyingTollgatePartnerId);
            }
            i = j;
            if (underlyingTollgateRequestName != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(9, underlyingTollgateRequestName);
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
            if (errorCode != null)
            {
                codedoutputbytebuffernano.writeString(1, errorCode);
            }
            if (errorMessage != null)
            {
                codedoutputbytebuffernano.writeString(2, errorMessage);
            }
            if (errorBehavior != null)
            {
                codedoutputbytebuffernano.writeInt32(3, errorBehavior.intValue());
            }
            if (underlyingTollgateError != null)
            {
                codedoutputbytebuffernano.writeString(4, underlyingTollgateError);
            }
            if (underlyingTollgateErrorDetails != null)
            {
                codedoutputbytebuffernano.writeString(5, underlyingTollgateErrorDetails);
            }
            if (underlyingPartnerCode != null)
            {
                codedoutputbytebuffernano.writeString(6, underlyingPartnerCode);
            }
            if (underlyingPartnerMessage != null)
            {
                codedoutputbytebuffernano.writeString(7, underlyingPartnerMessage);
            }
            if (underlyingTollgatePartnerId != null)
            {
                codedoutputbytebuffernano.writeString(8, underlyingTollgatePartnerId);
            }
            if (underlyingTollgateRequestName != null)
            {
                codedoutputbytebuffernano.writeString(9, underlyingTollgateRequestName);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Error()
        {
            clear();
        }
    }

}
