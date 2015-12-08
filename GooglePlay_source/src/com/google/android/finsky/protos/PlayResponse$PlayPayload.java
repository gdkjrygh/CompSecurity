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
//            PlayResponse

public static final class cachedSize extends MessageNano
{

    public sponse experimentsResponse;
    public rofileResponse oBSOLETEPlusProfileResponse;
    public sponse plusProfileResponse;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (oBSOLETEPlusProfileResponse != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, oBSOLETEPlusProfileResponse);
        }
        j = i;
        if (plusProfileResponse != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, plusProfileResponse);
        }
        i = j;
        if (experimentsResponse != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, experimentsResponse);
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
                if (oBSOLETEPlusProfileResponse == null)
                {
                    oBSOLETEPlusProfileResponse = new rofileResponse();
                }
                codedinputbytebuffernano.readMessage(oBSOLETEPlusProfileResponse);
                break;

            case 18: // '\022'
                if (plusProfileResponse == null)
                {
                    plusProfileResponse = new sponse();
                }
                codedinputbytebuffernano.readMessage(plusProfileResponse);
                break;

            case 26: // '\032'
                if (experimentsResponse == null)
                {
                    experimentsResponse = new sponse();
                }
                codedinputbytebuffernano.readMessage(experimentsResponse);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (oBSOLETEPlusProfileResponse != null)
        {
            codedoutputbytebuffernano.writeMessage(1, oBSOLETEPlusProfileResponse);
        }
        if (plusProfileResponse != null)
        {
            codedoutputbytebuffernano.writeMessage(2, plusProfileResponse);
        }
        if (experimentsResponse != null)
        {
            codedoutputbytebuffernano.writeMessage(3, experimentsResponse);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public sponse()
    {
        oBSOLETEPlusProfileResponse = null;
        plusProfileResponse = null;
        experimentsResponse = null;
        cachedSize = -1;
    }
}
