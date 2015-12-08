// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.analytics;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.play.analytics:
//            ClientAnalytics

public static final class cachedSize extends MessageNano
{

    public List experiments;
    public long nextRequestWaitMillis;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (nextRequestWaitMillis != -1L)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(1, nextRequestWaitMillis);
        }
        j = i;
        if (experiments != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, experiments);
        }
        return j;
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
                nextRequestWaitMillis = codedinputbytebuffernano.readRawVarint64();
                break;

            case 18: // '\022'
                if (experiments == null)
                {
                    experiments = new List();
                }
                codedinputbytebuffernano.readMessage(experiments);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (nextRequestWaitMillis != -1L)
        {
            codedoutputbytebuffernano.writeInt64(1, nextRequestWaitMillis);
        }
        if (experiments != null)
        {
            codedoutputbytebuffernano.writeMessage(2, experiments);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public List()
    {
        nextRequestWaitMillis = -1L;
        experiments = null;
        cachedSize = -1;
    }
}
