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
//            DocDetails

public static final class cachedSize extends MessageNano
{

    public boolean hasPersonIsRequester;
    public boolean personIsRequester;

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasPersonIsRequester)
            {
                i = j;
                if (!personIsRequester)
                {
                    break label0;
                }
            }
            i = j + (CodedOutputByteBufferNano.computeTagSize(1) + 1);
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
                personIsRequester = codedinputbytebuffernano.readBool();
                hasPersonIsRequester = true;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasPersonIsRequester || personIsRequester)
        {
            codedoutputbytebuffernano.writeBool(1, personIsRequester);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        personIsRequester = false;
        hasPersonIsRequester = false;
        cachedSize = -1;
    }
}
