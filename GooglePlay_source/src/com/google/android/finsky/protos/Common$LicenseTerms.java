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

    public ey groupLicenseKey;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (groupLicenseKey != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, groupLicenseKey);
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

            case 10: // '\n'
                if (groupLicenseKey == null)
                {
                    groupLicenseKey = new ey();
                }
                codedinputbytebuffernano.readMessage(groupLicenseKey);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (groupLicenseKey != null)
        {
            codedoutputbytebuffernano.writeMessage(1, groupLicenseKey);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ey()
    {
        groupLicenseKey = null;
        cachedSize = -1;
    }
}
