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

// Referenced classes of package com.google.wallet.proto:
//            NanoCompiledWobl

public static final class clear extends ExtendableMessageNano
{

    private static volatile no _emptyArray[];
    public Float dps;
    public Float inches;
    public Float millimeters;
    public Float points;
    public Float sps;
    public Float weight;

    private clear clear()
    {
        weight = null;
        sps = null;
        dps = null;
        inches = null;
        points = null;
        millimeters = null;
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

    private o mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

            case 13: // '\r'
                weight = Float.valueOf(codedinputbytebuffernano.readFloat());
                break;

            case 21: // '\025'
                sps = Float.valueOf(codedinputbytebuffernano.readFloat());
                break;

            case 29: // '\035'
                dps = Float.valueOf(codedinputbytebuffernano.readFloat());
                break;

            case 37: // '%'
                inches = Float.valueOf(codedinputbytebuffernano.readFloat());
                break;

            case 45: // '-'
                points = Float.valueOf(codedinputbytebuffernano.readFloat());
                break;

            case 53: // '5'
                millimeters = Float.valueOf(codedinputbytebuffernano.readFloat());
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (weight != null)
        {
            i = j + CodedOutputByteBufferNano.computeFloatSize(1, weight.floatValue());
        }
        j = i;
        if (sps != null)
        {
            j = i + CodedOutputByteBufferNano.computeFloatSize(2, sps.floatValue());
        }
        i = j;
        if (dps != null)
        {
            i = j + CodedOutputByteBufferNano.computeFloatSize(3, dps.floatValue());
        }
        j = i;
        if (inches != null)
        {
            j = i + CodedOutputByteBufferNano.computeFloatSize(4, inches.floatValue());
        }
        i = j;
        if (points != null)
        {
            i = j + CodedOutputByteBufferNano.computeFloatSize(5, points.floatValue());
        }
        j = i;
        if (millimeters != null)
        {
            j = i + CodedOutputByteBufferNano.computeFloatSize(6, millimeters.floatValue());
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
        if (weight != null)
        {
            codedoutputbytebuffernano.writeFloat(1, weight.floatValue());
        }
        if (sps != null)
        {
            codedoutputbytebuffernano.writeFloat(2, sps.floatValue());
        }
        if (dps != null)
        {
            codedoutputbytebuffernano.writeFloat(3, dps.floatValue());
        }
        if (inches != null)
        {
            codedoutputbytebuffernano.writeFloat(4, inches.floatValue());
        }
        if (points != null)
        {
            codedoutputbytebuffernano.writeFloat(5, points.floatValue());
        }
        if (millimeters != null)
        {
            codedoutputbytebuffernano.writeFloat(6, millimeters.floatValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public no()
    {
        clear();
    }
}
