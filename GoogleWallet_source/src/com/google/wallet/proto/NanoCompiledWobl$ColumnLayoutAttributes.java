// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoCompiledWobl

public static final class clear extends ExtendableMessageNano
{

    public Integer column;
    public Integer columnSpan;
    public Integer row;
    public Integer rowSpan;

    private clear clear()
    {
        column = null;
        row = null;
        columnSpan = null;
        rowSpan = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

            case 8: // '\b'
                column = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 16: // '\020'
                row = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 24: // '\030'
                columnSpan = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 32: // ' '
                rowSpan = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (column != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, column.intValue());
        }
        j = i;
        if (row != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(2, row.intValue());
        }
        i = j;
        if (columnSpan != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, columnSpan.intValue());
        }
        j = i;
        if (rowSpan != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(4, rowSpan.intValue());
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
        if (column != null)
        {
            codedoutputbytebuffernano.writeInt32(1, column.intValue());
        }
        if (row != null)
        {
            codedoutputbytebuffernano.writeInt32(2, row.intValue());
        }
        if (columnSpan != null)
        {
            codedoutputbytebuffernano.writeInt32(3, columnSpan.intValue());
        }
        if (rowSpan != null)
        {
            codedoutputbytebuffernano.writeInt32(4, rowSpan.intValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
