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
//            ResolveLink

public static final class cachedSize extends MessageNano
{

    public boolean hasPartnerPayload;
    public boolean hasPrefillCode;
    public String partnerPayload;
    public String prefillCode;

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasPrefillCode)
            {
                i = j;
                if (prefillCode.equals(""))
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeStringSize(1, prefillCode);
        }
        int k;
label1:
        {
            if (!hasPartnerPayload)
            {
                k = i;
                if (partnerPayload.equals(""))
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(2, partnerPayload);
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

            case 10: // '\n'
                prefillCode = codedinputbytebuffernano.readString();
                hasPrefillCode = true;
                break;

            case 18: // '\022'
                partnerPayload = codedinputbytebuffernano.readString();
                hasPartnerPayload = true;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasPrefillCode || !prefillCode.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, prefillCode);
        }
        if (hasPartnerPayload || !partnerPayload.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, partnerPayload);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public A()
    {
        prefillCode = "";
        hasPrefillCode = false;
        partnerPayload = "";
        hasPartnerPayload = false;
        cachedSize = -1;
    }
}
