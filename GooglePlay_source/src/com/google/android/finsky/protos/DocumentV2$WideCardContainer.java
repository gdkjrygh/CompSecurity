// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.finsky.protos:
//            DocumentV2

public static final class cachedSize extends MessageNano
{

    public boolean hasRowCount;
    public boolean hasShowOrdinals;
    public int rowCount;
    public boolean showOrdinals;

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasRowCount)
            {
                i = j;
                if (rowCount == 2)
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, rowCount);
        }
        int k;
label1:
        {
            if (!hasShowOrdinals)
            {
                k = i;
                if (!showOrdinals)
                {
                    break label1;
                }
            }
            k = i + (CodedOutputByteBufferNano.computeTagSize(2) + 1);
        }
        return k;
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

            case 8: // '\b'
                rowCount = codedinputbytebuffernano.readRawVarint32();
                hasRowCount = true;
                break;

            case 16: // '\020'
                showOrdinals = codedinputbytebuffernano.readBool();
                hasShowOrdinals = true;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasRowCount || rowCount != 2)
        {
            codedoutputbytebuffernano.writeInt32(1, rowCount);
        }
        if (hasShowOrdinals || showOrdinals)
        {
            codedoutputbytebuffernano.writeBool(2, showOrdinals);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        rowCount = 2;
        hasRowCount = false;
        showOrdinals = false;
        hasShowOrdinals = false;
        cachedSize = -1;
    }
}
