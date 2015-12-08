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

    private static volatile actualDoubleValue _emptyArray[];
    public boolean actualBoolValue[];
    public double actualDoubleValue[];
    public long actualLongValue[];
    public String actualStringValue[];
    public actualDoubleValue rule;

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

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (rule != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, rule);
        }
        j = i;
        if (actualStringValue != null)
        {
            j = i;
            if (actualStringValue.length > 0)
            {
                int j1 = 0;
                int k = 0;
                for (j = 0; j < actualStringValue.length;)
                {
                    String s = actualStringValue[j];
                    int k1 = j1;
                    int i1 = k;
                    if (s != null)
                    {
                        k1 = j1 + 1;
                        i1 = k + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                    }
                    j++;
                    j1 = k1;
                    k = i1;
                }

                j = i + k + j1 * 1;
            }
        }
        i = j;
        if (actualLongValue != null)
        {
            i = j;
            if (actualLongValue.length > 0)
            {
                int l = 0;
                for (i = 0; i < actualLongValue.length; i++)
                {
                    l += CodedOutputByteBufferNano.computeRawVarint64Size(actualLongValue[i]);
                }

                i = j + l + actualLongValue.length * 1;
            }
        }
        j = i;
        if (actualBoolValue != null)
        {
            j = i;
            if (actualBoolValue.length > 0)
            {
                j = i + actualBoolValue.length * 1 + actualBoolValue.length * 1;
            }
        }
        i = j;
        if (actualDoubleValue != null)
        {
            i = j;
            if (actualDoubleValue.length > 0)
            {
                i = j + actualDoubleValue.length * 8 + actualDoubleValue.length * 1;
            }
        }
        return i;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        do
        {
            int i = codedinputbytebuffernano.readTag();
            switch (i)
            {
            default:
                if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (rule == null)
                {
                    rule = new rule();
                }
                codedinputbytebuffernano.readMessage(rule);
                break;

            case 18: // '\022'
                int i2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                String as[];
                int j;
                if (actualStringValue == null)
                {
                    j = 0;
                } else
                {
                    j = actualStringValue.length;
                }
                as = new String[i2 + j];
                i2 = j;
                if (j != 0)
                {
                    System.arraycopy(actualStringValue, 0, as, 0, j);
                    i2 = j;
                }
                for (; i2 < as.length - 1; i2++)
                {
                    as[i2] = codedinputbytebuffernano.readString();
                    codedinputbytebuffernano.readTag();
                }

                as[i2] = codedinputbytebuffernano.readString();
                actualStringValue = as;
                break;

            case 24: // '\030'
                int j2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 24);
                long al[];
                int k;
                if (actualLongValue == null)
                {
                    k = 0;
                } else
                {
                    k = actualLongValue.length;
                }
                al = new long[j2 + k];
                j2 = k;
                if (k != 0)
                {
                    System.arraycopy(actualLongValue, 0, al, 0, k);
                    j2 = k;
                }
                for (; j2 < al.length - 1; j2++)
                {
                    al[j2] = codedinputbytebuffernano.readRawVarint64();
                    codedinputbytebuffernano.readTag();
                }

                al[j2] = codedinputbytebuffernano.readRawVarint64();
                actualLongValue = al;
                break;

            case 26: // '\032'
                int l3 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
                int l = codedinputbytebuffernano.getPosition();
                int k2;
                for (k2 = 0; codedinputbytebuffernano.getBytesUntilLimit() > 0; k2++)
                {
                    codedinputbytebuffernano.readRawVarint64();
                }

                codedinputbytebuffernano.rewindToPosition(l);
                long al1[];
                if (actualLongValue == null)
                {
                    l = 0;
                } else
                {
                    l = actualLongValue.length;
                }
                al1 = new long[k2 + l];
                k2 = l;
                if (l != 0)
                {
                    System.arraycopy(actualLongValue, 0, al1, 0, l);
                    k2 = l;
                }
                for (; k2 < al1.length; k2++)
                {
                    al1[k2] = codedinputbytebuffernano.readRawVarint64();
                }

                actualLongValue = al1;
                codedinputbytebuffernano.popLimit(l3);
                break;

            case 32: // ' '
                int l2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 32);
                boolean aflag[];
                int i1;
                if (actualBoolValue == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = actualBoolValue.length;
                }
                aflag = new boolean[l2 + i1];
                l2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(actualBoolValue, 0, aflag, 0, i1);
                    l2 = i1;
                }
                for (; l2 < aflag.length - 1; l2++)
                {
                    aflag[l2] = codedinputbytebuffernano.readBool();
                    codedinputbytebuffernano.readTag();
                }

                aflag[l2] = codedinputbytebuffernano.readBool();
                actualBoolValue = aflag;
                break;

            case 34: // '"'
                int i4 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
                int j1 = codedinputbytebuffernano.getPosition();
                int i3;
                for (i3 = 0; codedinputbytebuffernano.getBytesUntilLimit() > 0; i3++)
                {
                    codedinputbytebuffernano.readBool();
                }

                codedinputbytebuffernano.rewindToPosition(j1);
                boolean aflag1[];
                if (actualBoolValue == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = actualBoolValue.length;
                }
                aflag1 = new boolean[i3 + j1];
                i3 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(actualBoolValue, 0, aflag1, 0, j1);
                    i3 = j1;
                }
                for (; i3 < aflag1.length; i3++)
                {
                    aflag1[i3] = codedinputbytebuffernano.readBool();
                }

                actualBoolValue = aflag1;
                codedinputbytebuffernano.popLimit(i4);
                break;

            case 41: // ')'
                int j3 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 41);
                double ad[];
                int k1;
                if (actualDoubleValue == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = actualDoubleValue.length;
                }
                ad = new double[j3 + k1];
                j3 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(actualDoubleValue, 0, ad, 0, k1);
                    j3 = k1;
                }
                for (; j3 < ad.length - 1; j3++)
                {
                    ad[j3] = Double.longBitsToDouble(codedinputbytebuffernano.readRawLittleEndian64());
                    codedinputbytebuffernano.readTag();
                }

                ad[j3] = Double.longBitsToDouble(codedinputbytebuffernano.readRawLittleEndian64());
                actualDoubleValue = ad;
                break;

            case 42: // '*'
                int l1 = codedinputbytebuffernano.readRawVarint32();
                int j4 = codedinputbytebuffernano.pushLimit(l1);
                int k3 = l1 / 8;
                double ad1[];
                if (actualDoubleValue == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = actualDoubleValue.length;
                }
                ad1 = new double[k3 + l1];
                k3 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(actualDoubleValue, 0, ad1, 0, l1);
                    k3 = l1;
                }
                for (; k3 < ad1.length; k3++)
                {
                    ad1[k3] = Double.longBitsToDouble(codedinputbytebuffernano.readRawLittleEndian64());
                }

                actualDoubleValue = ad1;
                codedinputbytebuffernano.popLimit(j4);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (rule != null)
        {
            codedoutputbytebuffernano.writeMessage(1, rule);
        }
        if (actualStringValue != null && actualStringValue.length > 0)
        {
            for (int i = 0; i < actualStringValue.length; i++)
            {
                String s = actualStringValue[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.writeString(2, s);
                }
            }

        }
        if (actualLongValue != null && actualLongValue.length > 0)
        {
            for (int j = 0; j < actualLongValue.length; j++)
            {
                codedoutputbytebuffernano.writeInt64(3, actualLongValue[j]);
            }

        }
        if (actualBoolValue != null && actualBoolValue.length > 0)
        {
            for (int k = 0; k < actualBoolValue.length; k++)
            {
                codedoutputbytebuffernano.writeBool(4, actualBoolValue[k]);
            }

        }
        if (actualDoubleValue != null && actualDoubleValue.length > 0)
        {
            for (int l = 0; l < actualDoubleValue.length; l++)
            {
                codedoutputbytebuffernano.writeDouble(5, actualDoubleValue[l]);
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public A()
    {
        rule = null;
        actualStringValue = WireFormatNano.EMPTY_STRING_ARRAY;
        actualLongValue = WireFormatNano.EMPTY_LONG_ARRAY;
        actualBoolValue = WireFormatNano.EMPTY_BOOLEAN_ARRAY;
        actualDoubleValue = WireFormatNano.EMPTY_DOUBLE_ARRAY;
        cachedSize = -1;
    }
}
