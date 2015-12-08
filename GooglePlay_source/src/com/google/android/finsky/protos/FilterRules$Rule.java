// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.finsky.protos:
//            FilterRules

public static final class cachedSize extends MessageNano
{

    private static volatile  _emptyArray[];
    public int availabilityProblemType;
    public String comment;
    public int constArg[];
    public double doubleArg[];
    public boolean hasAvailabilityProblemType;
    public boolean hasComment;
    public boolean hasIncludeMissingValues;
    public boolean hasKey;
    public boolean hasNegate;
    public boolean hasOperator;
    public boolean hasResponseCode;
    public boolean includeMissingValues;
    public int key;
    public long longArg[];
    public boolean negate;
    public int operator;
    public int responseCode;
    public String stringArg[];
    public long stringArgHash[];
    public  subrule[];

    private static cachedSize[] emptyArray()
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

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasNegate)
            {
                i = j;
                if (!negate)
                {
                    break label0;
                }
            }
            i = j + (CodedOutputByteBufferNano.computeTagSize(1) + 1);
        }
        int k;
label1:
        {
            if (operator == 1)
            {
                k = i;
                if (!hasOperator)
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeInt32Size(2, operator);
        }
label2:
        {
            if (key == 1)
            {
                i = k;
                if (!hasKey)
                {
                    break label2;
                }
            }
            i = k + CodedOutputByteBufferNano.computeInt32Size(3, key);
        }
label3:
        {
            k = i;
            if (stringArg != null)
            {
                k = i;
                if (stringArg.length > 0)
                {
                    int i2 = 0;
                    int l = 0;
                    for (k = 0; k < stringArg.length;)
                    {
                        String s = stringArg[k];
                        int j2 = i2;
                        int l1 = l;
                        if (s != null)
                        {
                            j2 = i2 + 1;
                            l1 = l + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                        }
                        k++;
                        i2 = j2;
                        l = l1;
                    }

                    k = i + l + i2 * 1;
                }
            }
            int i1 = k;
            if (longArg != null)
            {
                i1 = k;
                if (longArg.length > 0)
                {
                    i1 = 0;
                    for (i = 0; i < longArg.length; i++)
                    {
                        i1 += CodedOutputByteBufferNano.computeRawVarint64Size(longArg[i]);
                    }

                    i1 = k + i1 + longArg.length * 1;
                }
            }
            i = i1;
            if (doubleArg != null)
            {
                i = i1;
                if (doubleArg.length > 0)
                {
                    i = i1 + doubleArg.length * 8 + doubleArg.length * 1;
                }
            }
            k = i;
            if (subrule != null)
            {
                k = i;
                if (subrule.length > 0)
                {
                    int j1 = 0;
                    do
                    {
                        k = i;
                        if (j1 >= subrule.length)
                        {
                            break;
                        }
                        _emptyArray _lemptyarray = subrule[j1];
                        k = i;
                        if (_lemptyarray != null)
                        {
                            k = i + CodedOutputByteBufferNano.computeMessageSize(7, _lemptyarray);
                        }
                        j1++;
                        i = k;
                    } while (true);
                }
            }
            if (responseCode == 1)
            {
                i = k;
                if (!hasResponseCode)
                {
                    break label3;
                }
            }
            i = k + CodedOutputByteBufferNano.computeInt32Size(8, responseCode);
        }
label4:
        {
            if (!hasComment)
            {
                k = i;
                if (comment.equals(""))
                {
                    break label4;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(9, comment);
        }
label5:
        {
            i = k;
            if (stringArgHash != null)
            {
                i = k;
                if (stringArgHash.length > 0)
                {
                    i = k + stringArgHash.length * 8 + stringArgHash.length * 1;
                }
            }
            k = i;
            if (constArg != null)
            {
                k = i;
                if (constArg.length > 0)
                {
                    int k1 = 0;
                    for (k = 0; k < constArg.length; k++)
                    {
                        k1 += CodedOutputByteBufferNano.computeInt32SizeNoTag(constArg[k]);
                    }

                    k = i + k1 + constArg.length * 1;
                }
            }
            if (availabilityProblemType == 1)
            {
                i = k;
                if (!hasAvailabilityProblemType)
                {
                    break label5;
                }
            }
            i = k + CodedOutputByteBufferNano.computeInt32Size(12, availabilityProblemType);
        }
label6:
        {
            if (!hasIncludeMissingValues)
            {
                k = i;
                if (!includeMissingValues)
                {
                    break label6;
                }
            }
            k = i + (CodedOutputByteBufferNano.computeTagSize(13) + 1);
        }
        return k;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L20:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 18: default 164
    //                   0: 173
    //                   8: 175
    //                   16: 191
    //                   24: 297
    //                   34: 481
    //                   40: 590
    //                   42: 698
    //                   49: 835
    //                   50: 949
    //                   58: 1064
    //                   64: 1195
    //                   74: 1325
    //                   81: 1341
    //                   82: 1449
    //                   88: 1561
    //                   90: 1752
    //                   96: 1966
    //                   104: 2037;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L20; else goto _L2
_L2:
        return this;
_L3:
        negate = codedinputbytebuffernano.readBool();
        hasNegate = true;
          goto _L20
_L4:
        i = codedinputbytebuffernano.readRawVarint32();
        switch (i)
        {
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
            operator = i;
            hasOperator = true;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        i = codedinputbytebuffernano.readRawVarint32();
        switch (i)
        {
        case 1: // '\001'
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
        case 36: // '$'
            key = i;
            hasKey = true;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
        String as[];
        if (stringArg == null)
        {
            i = 0;
        } else
        {
            i = stringArg.length;
        }
        as = new String[k + i];
        k = i;
        if (i != 0)
        {
            System.arraycopy(stringArg, 0, as, 0, i);
            k = i;
        }
        for (; k < as.length - 1; k++)
        {
            as[k] = codedinputbytebuffernano.readString();
            codedinputbytebuffernano.readTag();
        }

        as[k] = codedinputbytebuffernano.readString();
        stringArg = as;
        continue; /* Loop/switch isn't completed */
_L7:
        int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 40);
        long al[];
        if (longArg == null)
        {
            i = 0;
        } else
        {
            i = longArg.length;
        }
        al = new long[l + i];
        l = i;
        if (i != 0)
        {
            System.arraycopy(longArg, 0, al, 0, i);
            l = i;
        }
        for (; l < al.length - 1; l++)
        {
            al[l] = codedinputbytebuffernano.readRawVarint64();
            codedinputbytebuffernano.readTag();
        }

        al[l] = codedinputbytebuffernano.readRawVarint64();
        longArg = al;
        continue; /* Loop/switch isn't completed */
_L8:
        int l2 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
        i = codedinputbytebuffernano.getPosition();
        int i1;
        for (i1 = 0; codedinputbytebuffernano.getBytesUntilLimit() > 0; i1++)
        {
            codedinputbytebuffernano.readRawVarint64();
        }

        codedinputbytebuffernano.rewindToPosition(i);
        long al1[];
        if (longArg == null)
        {
            i = 0;
        } else
        {
            i = longArg.length;
        }
        al1 = new long[i1 + i];
        i1 = i;
        if (i != 0)
        {
            System.arraycopy(longArg, 0, al1, 0, i);
            i1 = i;
        }
        for (; i1 < al1.length; i1++)
        {
            al1[i1] = codedinputbytebuffernano.readRawVarint64();
        }

        longArg = al1;
        codedinputbytebuffernano.popLimit(l2);
        continue; /* Loop/switch isn't completed */
_L9:
        int j1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 49);
        double ad[];
        if (doubleArg == null)
        {
            i = 0;
        } else
        {
            i = doubleArg.length;
        }
        ad = new double[j1 + i];
        j1 = i;
        if (i != 0)
        {
            System.arraycopy(doubleArg, 0, ad, 0, i);
            j1 = i;
        }
        for (; j1 < ad.length - 1; j1++)
        {
            ad[j1] = Double.longBitsToDouble(codedinputbytebuffernano.readRawLittleEndian64());
            codedinputbytebuffernano.readTag();
        }

        ad[j1] = Double.longBitsToDouble(codedinputbytebuffernano.readRawLittleEndian64());
        doubleArg = ad;
        continue; /* Loop/switch isn't completed */
_L10:
        i = codedinputbytebuffernano.readRawVarint32();
        int i3 = codedinputbytebuffernano.pushLimit(i);
        int k1 = i / 8;
        double ad1[];
        if (doubleArg == null)
        {
            i = 0;
        } else
        {
            i = doubleArg.length;
        }
        ad1 = new double[k1 + i];
        k1 = i;
        if (i != 0)
        {
            System.arraycopy(doubleArg, 0, ad1, 0, i);
            k1 = i;
        }
        for (; k1 < ad1.length; k1++)
        {
            ad1[k1] = Double.longBitsToDouble(codedinputbytebuffernano.readRawLittleEndian64());
        }

        doubleArg = ad1;
        codedinputbytebuffernano.popLimit(i3);
        continue; /* Loop/switch isn't completed */
_L11:
        int l1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 58);
        .computeTagSize acomputetagsize[];
        if (subrule == null)
        {
            i = 0;
        } else
        {
            i = subrule.length;
        }
        acomputetagsize = new subrule[l1 + i];
        l1 = i;
        if (i != 0)
        {
            System.arraycopy(subrule, 0, acomputetagsize, 0, i);
            l1 = i;
        }
        for (; l1 < acomputetagsize.length - 1; l1++)
        {
            acomputetagsize[l1] = new <init>();
            codedinputbytebuffernano.readMessage(acomputetagsize[l1]);
            codedinputbytebuffernano.readTag();
        }

        acomputetagsize[l1] = new <init>();
        codedinputbytebuffernano.readMessage(acomputetagsize[l1]);
        subrule = acomputetagsize;
        continue; /* Loop/switch isn't completed */
_L12:
        i = codedinputbytebuffernano.readRawVarint32();
        switch (i)
        {
        case 1: // '\001'
        case 2: // '\002'
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
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
            responseCode = i;
            hasResponseCode = true;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L13:
        comment = codedinputbytebuffernano.readString();
        hasComment = true;
        continue; /* Loop/switch isn't completed */
_L14:
        int i2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 81);
        long al2[];
        if (stringArgHash == null)
        {
            i = 0;
        } else
        {
            i = stringArgHash.length;
        }
        al2 = new long[i2 + i];
        i2 = i;
        if (i != 0)
        {
            System.arraycopy(stringArgHash, 0, al2, 0, i);
            i2 = i;
        }
        for (; i2 < al2.length - 1; i2++)
        {
            al2[i2] = codedinputbytebuffernano.readRawLittleEndian64();
            codedinputbytebuffernano.readTag();
        }

        al2[i2] = codedinputbytebuffernano.readRawLittleEndian64();
        stringArgHash = al2;
        continue; /* Loop/switch isn't completed */
_L15:
        i = codedinputbytebuffernano.readRawVarint32();
        int j3 = codedinputbytebuffernano.pushLimit(i);
        int j2 = i / 8;
        long al3[];
        if (stringArgHash == null)
        {
            i = 0;
        } else
        {
            i = stringArgHash.length;
        }
        al3 = new long[j2 + i];
        j2 = i;
        if (i != 0)
        {
            System.arraycopy(stringArgHash, 0, al3, 0, i);
            j2 = i;
        }
        for (; j2 < al3.length; j2++)
        {
            al3[j2] = codedinputbytebuffernano.readRawLittleEndian64();
        }

        stringArgHash = al3;
        codedinputbytebuffernano.popLimit(j3);
        continue; /* Loop/switch isn't completed */
_L16:
        int ai[];
        int k2;
        int i4;
        i4 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 88);
        ai = new int[i4];
        k2 = 0;
        i = 0;
_L26:
        if (k2 >= i4) goto _L22; else goto _L21
_L21:
        int j4;
        if (k2 != 0)
        {
            codedinputbytebuffernano.readTag();
        }
        j4 = codedinputbytebuffernano.readRawVarint32();
        j4;
        JVM INSTR tableswitch 1 4: default 1636
    //                   1 1645
    //                   2 1645
    //                   3 1645
    //                   4 1645;
           goto _L23 _L24 _L24 _L24 _L24
_L23:
        k2++;
        continue; /* Loop/switch isn't completed */
_L24:
        int k3 = i + 1;
        ai[i] = j4;
        i = k3;
        if (true) goto _L23; else goto _L22
_L22:
        if (i != 0)
        {
            if (constArg == null)
            {
                k2 = 0;
            } else
            {
                k2 = constArg.length;
            }
            if (k2 == 0 && i == ai.length)
            {
                constArg = ai;
            } else
            {
                int ai1[] = new int[k2 + i];
                if (k2 != 0)
                {
                    System.arraycopy(constArg, 0, ai1, 0, k2);
                }
                System.arraycopy(ai, 0, ai1, k2, i);
                constArg = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L26; else goto _L25
_L25:
_L17:
        int l3;
        l3 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
        i = codedinputbytebuffernano.getPosition();
        k2 = 0;
_L32:
        if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
        {
            switch (codedinputbytebuffernano.readRawVarint32())
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                k2++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (k2 == 0) goto _L28; else goto _L27
_L27:
        codedinputbytebuffernano.rewindToPosition(i);
        if (constArg == null)
        {
            i = 0;
        } else
        {
            i = constArg.length;
        }
        ai = new int[k2 + i];
        k2 = i;
        if (i != 0)
        {
            System.arraycopy(constArg, 0, ai, 0, i);
            k2 = i;
        }
_L30:
        if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
        {
            i = codedinputbytebuffernano.readRawVarint32();
            switch (i)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                ai[k2] = i;
                k2++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        constArg = ai;
_L28:
        codedinputbytebuffernano.popLimit(l3);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L30; else goto _L29
_L29:
        if (true) goto _L32; else goto _L31
_L31:
_L18:
        int j = codedinputbytebuffernano.readRawVarint32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            availabilityProblemType = j;
            hasAvailabilityProblemType = true;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L19:
        includeMissingValues = codedinputbytebuffernano.readBool();
        hasIncludeMissingValues = true;
        if (true) goto _L20; else goto _L33
_L33:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasNegate || negate)
        {
            codedoutputbytebuffernano.writeBool(1, negate);
        }
        if (operator != 1 || hasOperator)
        {
            codedoutputbytebuffernano.writeInt32(2, operator);
        }
        if (key != 1 || hasKey)
        {
            codedoutputbytebuffernano.writeInt32(3, key);
        }
        if (stringArg != null && stringArg.length > 0)
        {
            for (int i = 0; i < stringArg.length; i++)
            {
                String s = stringArg[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.writeString(4, s);
                }
            }

        }
        if (longArg != null && longArg.length > 0)
        {
            for (int j = 0; j < longArg.length; j++)
            {
                codedoutputbytebuffernano.writeInt64(5, longArg[j]);
            }

        }
        if (doubleArg != null && doubleArg.length > 0)
        {
            for (int k = 0; k < doubleArg.length; k++)
            {
                codedoutputbytebuffernano.writeDouble(6, doubleArg[k]);
            }

        }
        if (subrule != null && subrule.length > 0)
        {
            for (int l = 0; l < subrule.length; l++)
            {
                  = subrule[l];
                if ( != null)
                {
                    codedoutputbytebuffernano.writeMessage(7, );
                }
            }

        }
        if (responseCode != 1 || hasResponseCode)
        {
            codedoutputbytebuffernano.writeInt32(8, responseCode);
        }
        if (hasComment || !comment.equals(""))
        {
            codedoutputbytebuffernano.writeString(9, comment);
        }
        if (stringArgHash != null && stringArgHash.length > 0)
        {
            for (int i1 = 0; i1 < stringArgHash.length; i1++)
            {
                codedoutputbytebuffernano.writeFixed64(10, stringArgHash[i1]);
            }

        }
        if (constArg != null && constArg.length > 0)
        {
            for (int j1 = 0; j1 < constArg.length; j1++)
            {
                codedoutputbytebuffernano.writeInt32(11, constArg[j1]);
            }

        }
        if (availabilityProblemType != 1 || hasAvailabilityProblemType)
        {
            codedoutputbytebuffernano.writeInt32(12, availabilityProblemType);
        }
        if (hasIncludeMissingValues || includeMissingValues)
        {
            codedoutputbytebuffernano.writeBool(13, includeMissingValues);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        negate = false;
        hasNegate = false;
        operator = 1;
        hasOperator = false;
        key = 1;
        hasKey = false;
        stringArg = WireFormatNano.EMPTY_STRING_ARRAY;
        stringArgHash = WireFormatNano.EMPTY_LONG_ARRAY;
        longArg = WireFormatNano.EMPTY_LONG_ARRAY;
        doubleArg = WireFormatNano.EMPTY_DOUBLE_ARRAY;
        constArg = WireFormatNano.EMPTY_INT_ARRAY;
        subrule = emptyArray();
        responseCode = 1;
        hasResponseCode = false;
        availabilityProblemType = 1;
        hasAvailabilityProblemType = false;
        includeMissingValues = false;
        hasIncludeMissingValues = false;
        comment = "";
        hasComment = false;
        cachedSize = -1;
    }
}
