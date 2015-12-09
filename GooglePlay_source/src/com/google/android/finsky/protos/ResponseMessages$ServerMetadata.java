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
//            ResponseMessages

public static final class cachedSize extends MessageNano
{

    public boolean hasLatencyMillis;
    public long latencyMillis;

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasLatencyMillis)
            {
                i = j;
                if (latencyMillis == 0L)
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeInt64Size(1, latencyMillis);
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

            case 8: // '\b'
                latencyMillis = codedinputbytebuffernano.readRawVarint64();
                hasLatencyMillis = true;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasLatencyMillis || latencyMillis != 0L)
        {
            codedoutputbytebuffernano.writeInt64(1, latencyMillis);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        latencyMillis = 0L;
        hasLatencyMillis = false;
        cachedSize = -1;
    }
}
