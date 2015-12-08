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

    private int computeSingularSerializedSize(Object obj)
    {
        int i = WireFormatNano.getTagFieldNumber(tag);
        switch (type)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown type ")).append(type).toString());

        case 10: // '\n'
            return CodedOutputByteBufferNano.computeGroupSize(i, (MessageNano)obj);

        case 11: // '\013'
            return CodedOutputByteBufferNano.computeMessageSize(i, (MessageNano)obj);
        }
    }

    private void writeSingularData(Object obj, CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        codedoutputbytebuffernano.writeRawVarint32(tag);
        type;
        JVM INSTR tableswitch 10 11: default 107
    //                   10 73
    //                   11 98;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown type ")).append(type).toString());
_L2:
        try
        {
            obj = (MessageNano)obj;
            int i = WireFormatNano.getTagFieldNumber(tag);
            ((MessageNano) (obj)).writeTo(codedoutputbytebuffernano);
            codedoutputbytebuffernano.writeTag(i, 4);
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
        int i = 0;
        int k;
        if (repeated)
        {
            int l = Array.getLength(obj);
            int j = 0;
            do
            {
                k = i;
                if (j >= l)
                {
                    break;
                }
                k = i;
                if (Array.get(obj, j) != null)
                {
                    k = i + computeSingularSerializedSize(Array.get(obj, j));
                }
                j++;
                i = k;
            } while (true);
        } else
        {
            k = computeSingularSerializedSize(obj);
        }
        return k;
    }

    final void writeTo(Object obj, CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (repeated)
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

        } else
        {
            writeSingularData(obj, codedoutputbytebuffernano);
        }
    }
}
