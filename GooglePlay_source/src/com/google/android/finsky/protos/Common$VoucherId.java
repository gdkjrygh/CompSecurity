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

    public RecordKey key;
    public RecordKey voucherDocid;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (voucherDocid != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, voucherDocid);
        }
        j = i;
        if (key != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, key);
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

            case 10: // '\n'
                if (voucherDocid == null)
                {
                    voucherDocid = new t>();
                }
                codedinputbytebuffernano.readMessage(voucherDocid);
                break;

            case 18: // '\022'
                if (key == null)
                {
                    key = new RecordKey();
                }
                codedinputbytebuffernano.readMessage(key);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (voucherDocid != null)
        {
            codedoutputbytebuffernano.writeMessage(1, voucherDocid);
        }
        if (key != null)
        {
            codedoutputbytebuffernano.writeMessage(2, key);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        voucherDocid = null;
        key = null;
        cachedSize = -1;
    }
}
