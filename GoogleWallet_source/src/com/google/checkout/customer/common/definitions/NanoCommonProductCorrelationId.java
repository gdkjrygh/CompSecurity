// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.checkout.customer.common.definitions;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

public interface NanoCommonProductCorrelationId
{
    public static final class CommonProductCorrelationId extends ExtendableMessageNano
    {

        private static volatile CommonProductCorrelationId _emptyArray[];
        public Integer billableService;
        public String orderLineKey;
        public Integer orderLineType;
        public String productAccountKey;
        public Integer productAccountType;

        private CommonProductCorrelationId clear()
        {
            billableService = null;
            productAccountType = null;
            productAccountKey = null;
            orderLineType = null;
            orderLineKey = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static CommonProductCorrelationId[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new CommonProductCorrelationId[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private CommonProductCorrelationId mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L8:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 6: default 64
        //                       0: 73
        //                       8: 75
        //                       16: 874
        //                       26: 888
        //                       32: 899
        //                       42: 913;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 7: // '\007'
            case 11: // '\013'
            case 14: // '\016'
            case 16: // '\020'
            case 25: // '\031'
            case 34: // '"'
            case 57: // '9'
            case 70: // 'F'
            case 86: // 'V'
            case 92: // '\\'
            case 97: // 'a'
            case 117: // 'u'
            case 119: // 'w'
            case 146: 
            case 170: 
            case 179: 
            case 195: 
            case 214: 
            case 242: 
            case 249: 
            case 272: 
            case 275: 
            case 287: 
            case 295: 
            case 316: 
            case 338: 
            case 344: 
            case 356: 
            case 357: 
            case 479: 
            case 70000: 
            case 70001: 
            case 70002: 
            case 70003: 
            case 70004: 
            case 70005: 
            case 70006: 
            case 70007: 
            case 70008: 
            case 70009: 
            case 70010: 
            case 70011: 
            case 70012: 
            case 70013: 
            case 70014: 
            case 70015: 
            case 70016: 
            case 70017: 
            case 70018: 
            case 70019: 
            case 70020: 
            case 70021: 
            case 70022: 
            case 70023: 
            case 70024: 
            case 70025: 
            case 70026: 
            case 70027: 
            case 70028: 
            case 70029: 
            case 70030: 
            case 70031: 
            case 70032: 
            case 70033: 
            case 70034: 
            case 70035: 
            case 70036: 
            case 70037: 
            case 70038: 
            case 70039: 
            case 70040: 
            case 70041: 
            case 70042: 
            case 70043: 
            case 70044: 
            case 70045: 
            case 70046: 
            case 70047: 
            case 70048: 
            case 70049: 
            case 70050: 
            case 70051: 
            case 70052: 
            case 70053: 
            case 70054: 
            case 70055: 
            case 70056: 
            case 70057: 
            case 70058: 
            case 70059: 
            case 70060: 
            case 70061: 
            case 70062: 
            case 80000: 
                billableService = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            productAccountType = Integer.valueOf(codedinputbytebuffernano.readInt32());
            continue; /* Loop/switch isn't completed */
_L5:
            productAccountKey = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L6:
            orderLineType = Integer.valueOf(codedinputbytebuffernano.readInt32());
            continue; /* Loop/switch isn't completed */
_L7:
            orderLineKey = codedinputbytebuffernano.readString();
            if (true) goto _L8; else goto _L9
_L9:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (billableService != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, billableService.intValue());
            }
            j = i;
            if (productAccountType != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, productAccountType.intValue());
            }
            i = j;
            if (productAccountKey != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, productAccountKey);
            }
            j = i;
            if (orderLineType != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(4, orderLineType.intValue());
            }
            i = j;
            if (orderLineKey != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, orderLineKey);
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
            if (billableService != null)
            {
                codedoutputbytebuffernano.writeInt32(1, billableService.intValue());
            }
            if (productAccountType != null)
            {
                codedoutputbytebuffernano.writeInt32(2, productAccountType.intValue());
            }
            if (productAccountKey != null)
            {
                codedoutputbytebuffernano.writeString(3, productAccountKey);
            }
            if (orderLineType != null)
            {
                codedoutputbytebuffernano.writeInt32(4, orderLineType.intValue());
            }
            if (orderLineKey != null)
            {
                codedoutputbytebuffernano.writeString(5, orderLineKey);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public CommonProductCorrelationId()
        {
            clear();
        }
    }

}
