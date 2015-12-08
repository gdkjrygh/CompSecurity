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

    public String briefReason;
    public boolean hasBriefReason;
    public boolean hasOBSOLETEDetailedReason;
    public boolean hasUniqueId;
    public String oBSOLETEDetailedReason;
    public String uniqueId;

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasBriefReason)
            {
                i = j;
                if (briefReason.equals(""))
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeStringSize(1, briefReason);
        }
        int k;
label1:
        {
            if (!hasOBSOLETEDetailedReason)
            {
                k = i;
                if (oBSOLETEDetailedReason.equals(""))
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(2, oBSOLETEDetailedReason);
        }
label2:
        {
            if (!hasUniqueId)
            {
                i = k;
                if (uniqueId.equals(""))
                {
                    break label2;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(3, uniqueId);
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
                briefReason = codedinputbytebuffernano.readString();
                hasBriefReason = true;
                break;

            case 18: // '\022'
                oBSOLETEDetailedReason = codedinputbytebuffernano.readString();
                hasOBSOLETEDetailedReason = true;
                break;

            case 26: // '\032'
                uniqueId = codedinputbytebuffernano.readString();
                hasUniqueId = true;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasBriefReason || !briefReason.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, briefReason);
        }
        if (hasOBSOLETEDetailedReason || !oBSOLETEDetailedReason.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, oBSOLETEDetailedReason);
        }
        if (hasUniqueId || !uniqueId.equals(""))
        {
            codedoutputbytebuffernano.writeString(3, uniqueId);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public A()
    {
        briefReason = "";
        hasBriefReason = false;
        oBSOLETEDetailedReason = "";
        hasOBSOLETEDetailedReason = false;
        uniqueId = "";
        hasUniqueId = false;
        cachedSize = -1;
    }
}
