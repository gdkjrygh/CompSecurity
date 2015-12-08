// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;

import java.io.IOException;
import java.lang.reflect.Array;

// Referenced classes of package com.google.protobuf.nano:
//            WireFormatNano, MessageNano, CodedOutputByteBufferNano

public final class Extension
{

    protected final Class clazz;
    protected final boolean repeated;
    public final int tag;
    protected final int type;

    private Extension(int i, Class class1, int j, boolean flag)
    {
        type = i;
        clazz = class1;
        tag = j;
        repeated = flag;
    }

    private int computeRepeatedSerializedSize(Object obj)
    {
        int j = 0;
        int l = Array.getLength(obj);
        for (int i = 0; i < l;)
        {
            int k = j;
            if (Array.get(obj, i) != null)
            {
                k = j + computeSingularSerializedSize(Array.get(obj, i));
            }
            i++;
            j = k;
        }

        return j;
    }

    private int computeSingularSerializedSize(Object obj)
    {
        int i = WireFormatNano.getTagFieldNumber(tag);
        switch (type)
        {
        default:
            i = type;
            throw new IllegalArgumentException((new StringBuilder(24)).append("Unknown type ").append(i).toString());

        case 10: // '\n'
            return CodedOutputByteBufferNano.computeGroupSize(i, (MessageNano)obj);

        case 11: // '\013'
            return CodedOutputByteBufferNano.computeMessageSize(i, (MessageNano)obj);
        }
    }

    public static Extension createMessageTyped(int i, Class class1, long l)
    {
        return new Extension(i, class1, (int)l, false);
    }

    private void writeRepeatedData(Object obj, CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        int j = Array.getLength(obj);
        for (int i = 0; i < j; i++)
        {
            Object obj1 = Array.get(obj, i);
            if (obj1 != null)
            {
                writeSingularData(obj1, codedoutputbytebuffernano);
            }
        }

    }

    private void writeSingularData(Object obj, CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        codedoutputbytebuffernano.writeRawVarint32(tag);
        type;
        JVM INSTR tableswitch 10 11: default 114
    //                   10 80
    //                   11 105;
           goto _L1 _L2 _L3
_L1:
        int i = type;
        throw new IllegalArgumentException((new StringBuilder(24)).append("Unknown type ").append(i).toString());
_L2:
        try
        {
            obj = (MessageNano)obj;
            int j = WireFormatNano.getTagFieldNumber(tag);
            codedoutputbytebuffernano.writeGroupNoTag(((MessageNano) (obj)));
            codedoutputbytebuffernano.writeTag(j, 4);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalStateException(((Throwable) (obj)));
        }
_L3:
        codedoutputbytebuffernano.writeMessageNoTag((MessageNano)obj);
        return;
    }

    final int computeSerializedSize(Object obj)
    {
        if (repeated)
        {
            return computeRepeatedSerializedSize(obj);
        } else
        {
            return computeSingularSerializedSize(obj);
        }
    }

    final void writeTo(Object obj, CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (repeated)
        {
            writeRepeatedData(obj, codedoutputbytebuffernano);
            return;
        } else
        {
            writeSingularData(obj, codedoutputbytebuffernano);
            return;
        }
    }
}
