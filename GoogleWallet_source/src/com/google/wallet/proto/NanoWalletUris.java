// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

public interface NanoWalletUris
{
    public static final class URI extends ExtendableMessageNano
    {

        private static volatile URI _emptyArray[];
        public Integer pattern;

        private URI clear()
        {
            pattern = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static URI[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new URI[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private URI mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L4:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 2: default 32
        //                       0: 41
        //                       8: 43;
               goto _L1 _L2 _L3
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L4; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 1000: 
            case 1001: 
            case 1002: 
            case 1003: 
            case 2000: 
            case 3000: 
            case 3001: 
            case 3002: 
            case 3003: 
            case 4000: 
            case 4001: 
            case 4002: 
            case 4003: 
            case 4004: 
            case 4005: 
            case 4006: 
            case 4007: 
            case 4008: 
            case 4009: 
            case 4010: 
            case 4011: 
            case 4012: 
            case 4013: 
            case 4014: 
            case 4015: 
            case 4016: 
            case 5000: 
            case 5001: 
            case 5002: 
            case 5003: 
            case 5004: 
            case 5005: 
            case 5006: 
            case 5007: 
            case 5008: 
            case 5009: 
            case 6000: 
            case 6001: 
            case 6002: 
            case 6003: 
            case 7000: 
            case 7001: 
            case 8000: 
            case 8001: 
            case 8002: 
            case 9000: 
            case 10000: 
            case 11000: 
            case 11001: 
            case 12000: 
            case 13000: 
                pattern = Integer.valueOf(j);
                break;
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (pattern != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, pattern.intValue());
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
            if (pattern != null)
            {
                codedoutputbytebuffernano.writeInt32(1, pattern.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public URI()
        {
            clear();
        }
    }

}
