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
//            Common

public static final class cachedSize extends MessageNano
{

    public int day;
    public boolean hasDay;
    public boolean hasMonth;
    public int month;

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasMonth)
            {
                i = j;
                if (month == 0)
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeUInt32Size(1, month);
        }
        int k;
label1:
        {
            if (!hasDay)
            {
                k = i;
                if (day == 0)
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeUInt32Size(2, day);
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
                month = codedinputbytebuffernano.readRawVarint32();
                hasMonth = true;
                break;

            case 16: // '\020'
                day = codedinputbytebuffernano.readRawVarint32();
                hasDay = true;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasMonth || month != 0)
        {
            codedoutputbytebuffernano.writeUInt32(1, month);
        }
        if (hasDay || day != 0)
        {
            codedoutputbytebuffernano.writeUInt32(2, day);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public _cls9()
    {
        month = 0;
        hasMonth = false;
        day = 0;
        hasDay = false;
        cachedSize = -1;
    }
}
