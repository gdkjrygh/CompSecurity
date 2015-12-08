// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.checkout.customer.profile.definitions;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

public interface NanoFop
{
    public static final class Fop extends ExtendableMessageNano
    {

        public Boolean exclusive;
        public Integer family;
        public Boolean fundsPullable;
        public Boolean fundsPushable;
        public String supportedCurrency[];
        public Integer type;

        private Fop clear()
        {
            fundsPushable = null;
            fundsPullable = null;
            type = null;
            supportedCurrency = WireFormatNano.EMPTY_STRING_ARRAY;
            family = null;
            exclusive = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private Fop mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L9:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 7: default 72
        //                       0: 81
        //                       24: 83
        //                       32: 97
        //                       40: 111
        //                       50: 290
        //                       56: 392
        //                       64: 470;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L9; else goto _L2
_L2:
            return this;
_L3:
            fundsPushable = Boolean.valueOf(codedinputbytebuffernano.readBool());
              goto _L9
_L4:
            fundsPullable = Boolean.valueOf(codedinputbytebuffernano.readBool());
              goto _L9
_L5:
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
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
            case 13: // '\r'
            case 14: // '\016'
            case 15: // '\017'
            case 16: // '\020'
            case 17: // '\021'
            case 18: // '\022'
            case 19: // '\023'
            case 20: // '\024'
            case 21: // '\025'
            case 22: // '\026'
            case 23: // '\027'
            case 24: // '\030'
            case 25: // '\031'
            case 26: // '\032'
            case 27: // '\033'
            case 28: // '\034'
            case 29: // '\035'
            case 30: // '\036'
            case 31: // '\037'
            case 32: // ' '
            case 33: // '!'
            case 34: // '"'
            case 35: // '#'
                type = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L6:
            int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 50);
            String as[];
            int k;
            if (supportedCurrency == null)
            {
                k = 0;
            } else
            {
                k = supportedCurrency.length;
            }
            as = new String[k + i1];
            i1 = k;
            if (k != 0)
            {
                System.arraycopy(supportedCurrency, 0, as, 0, k);
                i1 = k;
            }
            for (; i1 < as.length - 1; i1++)
            {
                as[i1] = codedinputbytebuffernano.readString();
                codedinputbytebuffernano.readTag();
            }

            as[i1] = codedinputbytebuffernano.readString();
            supportedCurrency = as;
            continue; /* Loop/switch isn't completed */
_L7:
            int l = codedinputbytebuffernano.readInt32();
            switch (l)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
                family = Integer.valueOf(l);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L8:
            exclusive = Boolean.valueOf(codedinputbytebuffernano.readBool());
            if (true) goto _L9; else goto _L10
_L10:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (fundsPushable != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(3, fundsPushable.booleanValue());
            }
            j = i;
            if (fundsPullable != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(4, fundsPullable.booleanValue());
            }
            int j1 = j + CodedOutputByteBufferNano.computeInt32Size(5, type.intValue());
            i = j1;
            if (supportedCurrency != null)
            {
                i = j1;
                if (supportedCurrency.length > 0)
                {
                    int l = 0;
                    j = 0;
                    for (i = 0; i < supportedCurrency.length;)
                    {
                        String s = supportedCurrency[i];
                        int i1 = l;
                        int k = j;
                        if (s != null)
                        {
                            i1 = l + 1;
                            k = j + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                        }
                        i++;
                        l = i1;
                        j = k;
                    }

                    i = j1 + j + l * 1;
                }
            }
            j = i;
            if (family != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(7, family.intValue());
            }
            i = j;
            if (exclusive != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(8, exclusive.booleanValue());
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
            if (fundsPushable != null)
            {
                codedoutputbytebuffernano.writeBool(3, fundsPushable.booleanValue());
            }
            if (fundsPullable != null)
            {
                codedoutputbytebuffernano.writeBool(4, fundsPullable.booleanValue());
            }
            codedoutputbytebuffernano.writeInt32(5, type.intValue());
            if (supportedCurrency != null && supportedCurrency.length > 0)
            {
                for (int i = 0; i < supportedCurrency.length; i++)
                {
                    String s = supportedCurrency[i];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(6, s);
                    }
                }

            }
            if (family != null)
            {
                codedoutputbytebuffernano.writeInt32(7, family.intValue());
            }
            if (exclusive != null)
            {
                codedoutputbytebuffernano.writeBool(8, exclusive.booleanValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Fop()
        {
            clear();
        }
    }

}
